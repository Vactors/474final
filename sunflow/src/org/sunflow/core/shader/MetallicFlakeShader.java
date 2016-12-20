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
	

	private float deviationAngle = (float) Math.toRadians(70);
	
    public boolean update(ParameterList pl, SunflowAPI api) {
        return true;
    }

    public Color getRadiance(ShadingState state) {
    	
    	state.faceforward();
    	
    	float devX = (float)Math.random()*deviationAngle - deviationAngle/2;
    	float devY = (float)Math.random()*deviationAngle - deviationAngle/2;
    	
    	Vector3 deviantVector = new Vector3((float)Math.cos(devX), (float)Math.sin(devY), 1);
    	deviantVector = state.getBasis().transform(deviantVector);
    	
    	Vector3.add(deviantVector, state.getNormal(), deviantVector);
    	
    	deviantVector.normalize();
    
 
        return Color.mul(new Color(Math.abs(state.getRay().dot(deviantVector))),Color.RED);
    }

    public void scatterPhoton(ShadingState state, Color power) {
    }
}
