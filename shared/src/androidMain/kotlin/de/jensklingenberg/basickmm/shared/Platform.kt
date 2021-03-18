package de.jensklingenberg.basickmm.shared

import de.jensklingenberg.basickmm.shared.test.TestEnvironment

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

