image {
  resolution 640 480
  aa 0 1
  filter gaussian
}

camera {
  type pinhole
  eye    4 -25 15
  target 0 0 3
  up     0 0 1
  fov    60
  aspect 1.333333
}

light {
  type ibl
  image warehouse.hdr
  center 0 -1 0
  up 0 0 1
  lock 64
  samples 64
}



shader {
  name metal
  type metallicflake
  diffuse .75 .05 .75
  shiny 1 1 1
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

