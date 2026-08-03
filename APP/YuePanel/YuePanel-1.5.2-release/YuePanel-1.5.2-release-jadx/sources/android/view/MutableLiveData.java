package android.view;

/* JADX INFO: loaded from: classes.dex */
public class MutableLiveData<T> extends LiveData<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MutableLiveData(T t) {
        super(t);
    }

    @Override // android.view.LiveData
    public void postValue(T t) {
        super.postValue(t);
    }

    @Override // android.view.LiveData
    public void setValue(T t) {
        super.setValue(t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MutableLiveData() {
    }
}
