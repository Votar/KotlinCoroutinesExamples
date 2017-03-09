package edu.bertalt.samplelocationtracker.ui.auth

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import edu.bertalt.samplelocationtracker.R
import edu.bertalt.samplelocationtracker.mvp.view.BaseMvpActivity
import kotlinx.android.synthetic.main.activity_coroutines_in_ui.*

class CoroutinesInUiActivity :
        BaseMvpActivity<CoroutinesWithUiContract.View, CoroutinesWithUiContract.Presenter>(),
        CoroutinesWithUiContract.View {

    override var mPresenter: CoroutinesWithUiContract.Presenter = CoroutinesWithUiPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines_in_ui)
    }

    override fun onStart() {
        super.onStart()
        setupLayouts()
    }

    fun setupLayouts() {
        button.setOnClickListener { mPresenter.requestAuth("", "") }
    }

    override fun hideProgress() {
        progressBar.visibility = View.GONE
    }

    override fun showProgress() {
        progressBar.visibility = View.VISIBLE
    }


    override fun getRootView(): View? = acitivity_coroutines_in_ui

    override fun successAuth(result: String) {
        Snackbar.make(acitivity_coroutines_in_ui, result, Snackbar.LENGTH_SHORT).show()
    }

}
