image {
  resolution 1440 1080
  aa 0 4
  filter gaussian
}

camera {
  type pinhole
  eye    5 -22 5
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
  samples 128
}



shader {
  name metal
  type metallicflake
  diffuse .05 .05 .05
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

