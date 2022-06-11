package aspirin.tankobon.manga.filesystem

import aspirin.tankobon.logger
import java.io.File

private val unsupportedPath = File("unsupported")

fun unsupportedExtension(file: File) {
    logger.warn("Extension ${file.extension} is not supported. full path: ${file.absolutePath}")
    unsupportedPath.mkdirs()
    file.renameTo(File("${unsupportedPath.path}/${file.name}"))
}
