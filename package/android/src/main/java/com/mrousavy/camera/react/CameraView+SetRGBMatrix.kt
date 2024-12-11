package com.mrousavy.camera.react

import android.annotation.SuppressLint
import android.util.Log
import com.facebook.react.bridge.Arguments
import com.facebook.react.bridge.ReadableMap

suspend fun CameraView.setRGBMatrix(optionsMap: ReadableMap) {
  val options = optionsMap.toHashMap()

  val r = (options["r"] as? Number)?.toFloat() ?: 1.0f
  val g = (options["g"] as? Number)?.toFloat() ?: 1.0f
  val b = (options["b"] as? Number)?.toFloat() ?: 1.0f
  
  cameraSession.setRGBMatrix(
    r,
    g,
    b
  )
}
