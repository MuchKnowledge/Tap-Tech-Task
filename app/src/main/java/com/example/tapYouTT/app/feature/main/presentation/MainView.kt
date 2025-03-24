package com.example.tapYouTT.app.feature.main.presentation

import com.example.tapYouTT.app.feature.main.domain.model.PointItem
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView : MvpView {

    fun showCountError()
    fun showNetworkError(message: String)
    fun navigateToResult(points: List<PointItem>)
    fun showLoading()
    fun hideLoading()
}