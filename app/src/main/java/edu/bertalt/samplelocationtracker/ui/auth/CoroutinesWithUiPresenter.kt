package edu.bertalt.samplelocationtracker.ui.auth

import edu.bertalt.samplelocationtracker.mvp.presenter.BaseMvpPresenter
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.launch
import java.lang.Thread.sleep


class CoroutinesWithUiPresenter : BaseMvpPresenter<CoroutinesWithUiContract.View>(),
        CoroutinesWithUiContract.Presenter {
    override fun requestAuth(email: String, password: String) {
        launch(CommonPool) {
            val result = modelMethod() // wait for 1.5 sec
            mView?.successAuth(result)
        }
    }

    fun modelMethod() : String {
        sleep(1500)
        return "RESULT FROM ASYNC"
    }
}