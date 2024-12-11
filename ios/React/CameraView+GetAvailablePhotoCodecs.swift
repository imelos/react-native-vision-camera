
import AVFoundation

extension CameraView {
  func getAvailablePhotoCodecs(promise: Promise) {
    cameraSession.getAvailablePhotoCodecs(promise: promise)
  }
}
