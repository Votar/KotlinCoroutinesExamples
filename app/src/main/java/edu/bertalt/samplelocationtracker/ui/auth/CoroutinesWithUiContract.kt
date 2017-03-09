package edu.bertalt.samplelocationtracker.ui.auth

import edu.bertalt.samplelocationtracker.mvp.presenter.IBaseMvpPresenter
import edu.bertalt.samplelocationtracker.mvp.view.IBaseMvpView

interface CoroutinesWithUiContract {

    interface View : IBaseMvpView {
        fun successAuth(result :String)
        fun showProgress()
        fun hideProgress()
    }

    interface Presenter : IBaseMvpPresenter<View> {
        fun requestAuth(email: String, password: String)
    }

}