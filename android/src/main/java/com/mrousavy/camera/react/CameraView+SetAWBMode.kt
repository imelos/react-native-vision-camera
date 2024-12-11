package com.mrousavy.camera.react

suspend fun CameraView.setAWBMode(mode: Int) {
  cameraSession.setAWBMode(mode)
}
