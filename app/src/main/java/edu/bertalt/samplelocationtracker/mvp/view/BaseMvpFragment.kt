package edu.bertalt.samplelocationtracker.mvp.view

import android.content.Context
import android.support.v4.app.Fragment
import android.view.View
import edu.bertalt.samplelocationtracker.mvp.presenter.IBaseMvpPresenter

abstract class BaseMvpFragment<in V : IBaseMvpView, T : IBaseMvpPresenter<V>> : Fragment(),
        IBaseMvpView {
    protected abstract var mPresenter: T


    override fun onStart() {
        super.onStart()
        mPresenter.attachView(this as V)
    }

    override fun onStop() {
        super.onStop()
        mPresenter.detachView()
    }

    override fun getRootView(): View? = view

    override fun getAppContext(): Context = activity

    override fun showError(error: String?) {

    }

    override fun showError(stringResId: Int) {

    }

    override fun showMessage(srtResId: Int) {

    }

    override fun showMessage(message: String) {

    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }

    override fun onLogout() {

    }

}