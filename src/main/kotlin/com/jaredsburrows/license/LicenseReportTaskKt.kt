package com.jaredsburrows.license

import org.gradle.api.DefaultTask
import java.io.File
import java.net.URI

abstract class LicenseReportTaskKt : DefaultTask() {
  companion object {
    const val ANDROID_SUPPORT_GROUP_ID = "com.android.support"
    const val APACHE_LICENSE_NAME = "The Apache Software License"
    const val APACHE_LICENSE_URL = "http://www.apache.org/licenses/LICENSE-2.0.txt"
    const val OPEN_SOURCE_LICENSES = "open_source_licenses"
    const val HTML_EXT = ".html"
    const val JSON_EXT = ".json"

    @JvmStatic protected fun getClickableFileUrl(file: File): String {
      return URI("file", "", file.toURI().path, null, null).toString()
    }
  }
}
