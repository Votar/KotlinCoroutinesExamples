package edu.bertalt.samplelocationtracker.mvp.presenter

import edu.bertalt.samplelocationtracker.mvp.presenter.IBaseMvpPresenter
import edu.bertalt.samplelocationtracker.mvp.view.IBaseMvpView


open class BaseMvpPresenter<V : IBaseMvpView> : IBaseMvpPresenter<V> {

    protected var mView: V? = null

    override fun attachView(view: V) {
        mView = view
    }

    override fun detachView() {
        mView = null
    }
}