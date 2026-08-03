package android.view;

import Yue.C7209;
import Yue.InterfaceC3647;
import Yue.InterfaceC5922;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MediatorLiveData<T> extends MutableLiveData<T> {
    private C7209<LiveData<?>, Source<?>> mSources;

    public static class Source<V> implements Observer<V> {
        final LiveData<V> mLiveData;
        final Observer<? super V> mObserver;
        int mVersion = -1;

        public Source(LiveData<V> liveData, Observer<? super V> observer) {
            this.mLiveData = liveData;
            this.mObserver = observer;
        }

        @Override // android.view.Observer
        public void onChanged(@InterfaceC6490 V v) {
            if (this.mVersion != this.mLiveData.getVersion()) {
                this.mVersion = this.mLiveData.getVersion();
                this.mObserver.onChanged(v);
            }
        }

        public void plug() {
            this.mLiveData.observeForever(this);
        }

        public void unplug() {
            this.mLiveData.removeObserver(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MediatorLiveData() {
        this.mSources = new C7209<>();
    }

    @InterfaceC5922
    public <S> void addSource(@InterfaceC6391 LiveData<S> liveData, @InterfaceC6391 Observer<? super S> observer) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        Source<?> source = new Source<>(liveData, observer);
        Source<?> sourceMo14467 = this.mSources.mo14467(liveData, source);
        if (sourceMo14467 != null && sourceMo14467.mObserver != observer) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (sourceMo14467 == null && hasActiveObservers()) {
            source.plug();
        }
    }

    @Override // android.view.LiveData
    @InterfaceC3647
    public void onActive() {
        Iterator<Map.Entry<LiveData<?>, Source<?>>> it = this.mSources.iterator();
        while (it.hasNext()) {
            it.next().getValue().plug();
        }
    }

    @Override // android.view.LiveData
    @InterfaceC3647
    public void onInactive() {
        Iterator<Map.Entry<LiveData<?>, Source<?>>> it = this.mSources.iterator();
        while (it.hasNext()) {
            it.next().getValue().unplug();
        }
    }

    @InterfaceC5922
    public <S> void removeSource(@InterfaceC6391 LiveData<S> liveData) {
        Source<?> sourceMo14468 = this.mSources.mo14468(liveData);
        if (sourceMo14468 != null) {
            sourceMo14468.unplug();
        }
    }

    public MediatorLiveData(T t) {
        super(t);
        this.mSources = new C7209<>();
    }
}
