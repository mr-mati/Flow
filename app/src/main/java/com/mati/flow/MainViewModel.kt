package com.mati.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainViewModel {

    val createFlow: Flow<Int> = flow{
        while(true){
            emit( (10..100).random() )
            delay(5000)
        }
    }

}