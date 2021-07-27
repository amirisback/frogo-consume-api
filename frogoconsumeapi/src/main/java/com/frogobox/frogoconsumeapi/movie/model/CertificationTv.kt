package com.frogobox.frogoconsumeapi.movie.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TMDBAPI
 * Copyright (C) 13/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.movie.model
 *
 */
data class CertificationTv(

    @SerializedName("RU")
    var RU: List<Certification>? = null,

    @SerializedName("US")
    var US: List<Certification>? = null,

    @SerializedName("CA")
    var CA: List<Certification>? = null,

    @SerializedName("AU")
    var AU: List<Certification>? = null,

    @SerializedName("FR")
    var FR: List<Certification>? = null,

    @SerializedName("DE")
    var DE: List<Certification>? = null,

    @SerializedName("TH")
    var TH: List<Certification>? = null,

    @SerializedName("KR")
    var KR: List<Certification>? = null,

    @SerializedName("GB")
    var GB: List<Certification>? = null,

    @SerializedName("BR")
    var BR: List<Certification>? = null,

    @SerializedName("NL")
    var NL: List<Certification>? = null,

    @SerializedName("CA-QC")
    var CAQC: List<Certification>? = null,

    @SerializedName("HU")
    var HU: List<Certification>? = null,

    @SerializedName("LT")
    var LT: List<Certification>? = null,

    @SerializedName("PH")
    var PH: List<Certification>? = null,

    @SerializedName("ES")
    var ES: List<Certification>? = null,

    @SerializedName("SK")
    var SK: List<Certification>? = null

)