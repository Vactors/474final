image {
  resolution 640 480
  aa 0 1
  filter gaussian
}

camera {
  type pinhole
  eye    -13 -33 10
  target 0 0 0
  up     0 0 1
  fov    60
  aspect 1.333333
}

light {
  type ibl
  image warehouse.jpg
  center 0 -1 0
  up 0 0 1
  lock 64
  samples 64
}



shader {
  name metal
  type metallicflake
}


object {
  shader metal
  transform {
	rotatex 15
	rotatez 10
	scaleu 4
	translate 0 0 3
  }
  type file-mesh
  name hood
  filename hood.stl
  smooth_normals true
}

