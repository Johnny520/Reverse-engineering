package android.view;

import Yue.InterfaceC6391;
import android.view.ClassesInfoCache;
import android.view.Lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {
    private final ClassesInfoCache.CallbackInfo mInfo;
    private final Object mWrapped;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.mWrapped = obj;
        this.mInfo = ClassesInfoCache.sInstance.getInfo(obj.getClass());
    }

    @Override // android.view.LifecycleEventObserver
    public void onStateChanged(@InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 Lifecycle.Event event) {
        this.mInfo.invokeCallbacks(lifecycleOwner, event, this.mWrapped);
    }
}
