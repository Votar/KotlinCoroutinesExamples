package edu.bertalt.samplelocationtracker.mvp.view

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import edu.bertalt.samplelocationtracker.mvp.presenter.IBaseMvpPresenter


abstract class BaseMvpActivity<in V : IBaseMvpView, T : IBaseMvpPresenter<V>>
    : AppCompatActivity(), IBaseMvpView {
    protected abstract var mPresenter: T
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter.attachView(this as V)
    }

    override fun getAppContext(): Context = this

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