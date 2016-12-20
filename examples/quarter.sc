image {
  resolution 640 480
  aa 0 1
  filter gaussian
}

camera {
  type pinhole
  eye    5 -25 5
  target 0 0 0
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
	scaleu 4
	translate 0 0 3
  }
  type file-mesh
  name quarter
  filename quarter.stl
  smooth_normals true
}

