image {
  resolution 640 480
  aa 0 1
  filter gaussian
}

camera {
  type pinhole
  eye    25 -7 -2
  target 0 -2 0
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
  type mirror
  refl .75 .75 .75
}


object {
  shader metal
  transform {
	rotatez 15
	scaleu 4
  }
  type file-mesh
  name bumper
  filename bumper.stl
  smooth_normals true
}

