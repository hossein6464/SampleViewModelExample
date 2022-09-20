package diana.solei.design.viewmodelexample1

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    private var count = 0

    fun increaseCounter():Int {
        return ++count
    }
    fun getCount(): Int {
        return count
    }
}