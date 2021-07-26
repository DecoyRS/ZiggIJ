@file:Suppress("HardCodedStringLiteral")

package com.github.decoyrs.ziggij

import Icons.ZigIcons
import com.intellij.openapi.fileTypes.LanguageFileType

object ZigFileType : LanguageFileType(ZigLanguage) {
    override fun getName() = "Zig"
    override fun getDescription() = "Zig files"
    override fun getDefaultExtension() = ZIG_EXTENSION
    override fun getIcon() = ZigIcons.FILE_ICON
}
