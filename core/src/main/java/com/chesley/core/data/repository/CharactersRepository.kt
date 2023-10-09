package com.chesley.core.data.repository

import androidx.paging.PagingSource
import com.chesley.core.domain.model.Character

interface CharactersRepository {

    fun getCharacters(query: String): PagingSource<Int, Character>
}