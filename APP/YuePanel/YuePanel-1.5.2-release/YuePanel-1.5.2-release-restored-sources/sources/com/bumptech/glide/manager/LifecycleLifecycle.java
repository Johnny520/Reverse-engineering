package com.bumptech.glide.manager;

import Yue.InterfaceC6391;
import android.view.Lifecycle;
import android.view.LifecycleObserver;
import android.view.LifecycleOwner;
import android.view.OnLifecycleEvent;
import com.bumptech.glide.util.Util;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements Lifecycle, LifecycleObserver {

    @InterfaceC6391
    private final android.view.Lifecycle lifecycle;

    @InterfaceC6391
    private final Set<LifecycleListener> lifecycleListeners = new HashSet();

    public LifecycleLifecycle(android.view.Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void addListener(@InterfaceC6391 LifecycleListener lifecycleListener) {
        this.lifecycleListeners.add(lifecycleListener);
        if (this.lifecycle.getState() == Lifecycle.State.DESTROYED) {
            lifecycleListener.onDestroy();
        } else if (this.lifecycle.getState().isAtLeast(Lifecycle.State.STARTED)) {
            lifecycleListener.onStart();
        } else {
            lifecycleListener.onStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@InterfaceC6391 LifecycleOwner lifecycleOwner) {
        Iterator it = Util.getSnapshot(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@InterfaceC6391 LifecycleOwner lifecycleOwner) {
        Iterator it = Util.getSnapshot(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@InterfaceC6391 LifecycleOwner lifecycleOwner) {
        Iterator it = Util.getSnapshot(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStop();
        }
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void removeListener(@InterfaceC6391 LifecycleListener lifecycleListener) {
        this.lifecycleListeners.remove(lifecycleListener);
    }
}
