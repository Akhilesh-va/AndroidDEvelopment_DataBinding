import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var liveTextData = MutableLiveData("live data")
    fun updateQuote() {
       liveTextData.value="live data updated"
    }



}