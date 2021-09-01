package com.frogobox.api.meal.source

import android.content.Context
import android.util.Log
import com.frogobox.api.meal.response.MealResponse
import com.frogobox.api.meal.model.*
import com.frogobox.api.meal.response.CategoryResponse
import com.frogobox.api.meal.util.MealConstant
import com.frogobox.api.meal.util.MealUrl
import com.frogobox.sdk.core.FrogoApiCallback
import com.frogobox.sdk.core.FrogoApiClient
import com.frogobox.api.core.ConsumeApiResponse
import com.frogobox.api.news.sources.NewsRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * consumable-code-the-meal-db-api
 * Copyright (C) 15/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogomealsapi.data.source
 *
 */
object MealRepository : MealDataSource {

    private val TAG = MealRepository::class.java.simpleName
    private var mealApiService = FrogoApiClient.create<MealApiService>(MealUrl.BASE_URL)

    override fun usingChuckInterceptor(context: Context) {
        Log.d(TAG, "Using Chuck Interceptor")
        mealApiService = FrogoApiClient.create(MealUrl.BASE_URL, context)
    }

    override fun searchMeal(
        apiKey: String,
        mealName: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .searchMeal(apiKey, mealName)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiCallback<MealResponse<Meal>>() {
                override fun onSuccess(data: MealResponse<Meal>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })

    }

    override fun listAllMeal(
        apiKey: String,
        firstLetter: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .listAllMeal(apiKey, firstLetter)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiCallback<MealResponse<Meal>>() {
                override fun onSuccess(data: MealResponse<Meal>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }


            })
    }

    override fun lookupFullMeal(
        apiKey: String,
        idMeal: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .lookupFullMeal(apiKey, idMeal)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiCallback<MealResponse<Meal>>() {
                override fun onSuccess(data: MealResponse<Meal>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun lookupRandomMeal(
        apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .lookupRandomMeal(apiKey)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiCallback<MealResponse<Meal>>() {
                override fun onSuccess(data: MealResponse<Meal>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun listMealCategories(
        apiKey: String,
        callback: ConsumeApiResponse<CategoryResponse>
    ) {
        Log.d(TAG,"")
        mealApiService
            .listMealCategories(apiKey)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiCallback<CategoryResponse>() {
                override fun onSuccess(data: CategoryResponse) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun listAllCateories(
        apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Category>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .listAllCateories(apiKey, MealConstant.VALUE_LIST)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiCallback<MealResponse<Category>>() {
                override fun onSuccess(data: MealResponse<Category>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun listAllArea(
        apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Area>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .listAllArea(apiKey, MealConstant.VALUE_LIST)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiCallback<MealResponse<Area>>() {
                override fun onSuccess(data: MealResponse<Area>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                
            })
    }

    override fun listAllIngredients(
        apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Ingredient>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .listAllIngredients(apiKey, MealConstant.VALUE_LIST)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiCallback<MealResponse<Ingredient>>() {
                override fun onSuccess(data: MealResponse<Ingredient>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun filterByIngredient(
        apiKey: String,
        ingredient: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .filterByIngredient(apiKey, ingredient)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiCallback<MealResponse<MealFilter>>() {
                override fun onSuccess(data: MealResponse<MealFilter>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun filterByCategory(
        apiKey: String,
        category: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .filterByCategory(apiKey, category)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiCallback<MealResponse<MealFilter>>() {
                override fun onSuccess(data: MealResponse<MealFilter>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun filterByArea(
        apiKey: String,
        area: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .filterByArea(apiKey, area)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiCallback<MealResponse<MealFilter>>() {
                override fun onSuccess(data: MealResponse<MealFilter>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }
}