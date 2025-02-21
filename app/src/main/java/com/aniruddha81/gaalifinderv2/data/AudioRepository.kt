package com.aniruddha81.gaalifinderv2.data

import javax.inject.Inject

class AudioRepository @Inject constructor(private val dao: AudioFileDao) {
    fun getAudioFiles() = dao.getAllAudioFiles()

    //    adds audioFile in roomDB
    suspend fun addAudioFile(name: String, path: String, source: String) {
        dao.insertAudioFile(
            AudioFile(
                fileName = name,
                path = path,
                source = source,
            )
        )
    }

    //    deletes from roomDB
    suspend fun deleteAudioFile(audio: AudioFile) {
        dao.deleteAudioFile(audio)
    }
}