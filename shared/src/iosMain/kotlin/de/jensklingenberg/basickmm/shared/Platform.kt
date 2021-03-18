package de.jensklingenberg.basickmm.shared


import de.jensklingenberg.basickmm.shared.test.TestEnvironment
import platform.UIKit.UIDevice

actual class Platform actual constructor() {
    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

