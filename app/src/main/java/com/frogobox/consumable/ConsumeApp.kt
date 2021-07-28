package com.frogobox.consumable

import com.frogobox.consumable.di.viewModelModule
import com.frogobox.frogosdk.FrogoApplication
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin

/*
 * Created by faisalamir on 28/07/21
 * Consumable
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.      
 * All rights reserved
 *
 */
class ConsumeApp : FrogoApplication() {

    override fun setupKoinModule(koinApplication: KoinApplication) {
        koinApplication.modules(viewModelModule)
    }

}