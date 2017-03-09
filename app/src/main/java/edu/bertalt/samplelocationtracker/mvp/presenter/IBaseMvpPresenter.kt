package edu.bertalt.samplelocationtracker.mvp.presenter

import edu.bertalt.samplelocationtracker.mvp.view.IBaseMvpView


interface IBaseMvpPresenter<in V : IBaseMvpView> {

    fun attachView(view: V)
    fun detachView()
}