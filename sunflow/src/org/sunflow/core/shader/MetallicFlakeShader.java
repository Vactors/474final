package org.sunflow.core.shader;

import org.sunflow.SunflowAPI;
import org.sunflow.core.ParameterList;
import org.sunflow.core.Shader;
import org.sunflow.core.ShadingState;
import org.sunflow.core.TextureCache;
import org.sunflow.image.Color;
import org.sunflow.math.Vector3;
import org.sunflow.core.Texture;


public class MetallicFlakeShader implements Shader {
	

	private float deviationAngle = (float) Math.toRadians(10);
	
    public boolean update(ParameterList pl, SunflowAPI api) {
        return true;
    }

    public Color getRadiance(ShadingState state) {
    	
    	float devX = (float)Math.random()*deviationAngle;
    	float devY = (float)Math.random()*deviationAngle;
    	
    	Vector3 deviantVector = new Vector3((float)Math.cos(devX), (float)Math.sin(devY), 1);
    	
    	Vector3 normal = new Vector3(
    			state.getNormal().x+deviantVector.x,
    			state.getNormal().y+deviantVector.y,
    			state.getNormal().z+deviantVector.z);
    	
    	normal.normalize();
    	
        return new Color(Math.abs(state.getRay().dot(normal)));
    }

    public void scatterPhoton(ShadingState state, Color power) {
    }
}
