package com.bumptech.glide.manager;

import Yue.InterfaceC6391;
import android.content.Context;
import com.bumptech.glide.manager.ConnectivityMonitor;

/* JADX INFO: loaded from: classes.dex */
final class DefaultConnectivityMonitor implements ConnectivityMonitor {
    private final Context context;
    final ConnectivityMonitor.ConnectivityListener listener;

    public DefaultConnectivityMonitor(@InterfaceC6391 Context context, @InterfaceC6391 ConnectivityMonitor.ConnectivityListener connectivityListener) {
        this.context = context.getApplicationContext();
        this.listener = connectivityListener;
    }

    private void register() {
        SingletonConnectivityReceiver.get(this.context).register(this.listener);
    }

    private void unregister() {
        SingletonConnectivityReceiver.get(this.context).unregister(this.listener);
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
        register();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
        unregister();
    }
}
