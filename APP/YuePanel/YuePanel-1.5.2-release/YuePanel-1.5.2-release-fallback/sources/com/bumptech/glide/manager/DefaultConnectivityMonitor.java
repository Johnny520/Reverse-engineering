package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes.dex */
final class DefaultConnectivityMonitor implements com.bumptech.glide.manager.ConnectivityMonitor {
    private final android.content.Context context;
    final com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener listener;

    public DefaultConnectivityMonitor(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener r2) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.context = r1
            r0.listener = r2
            return
    }

    private void register() {
            r2 = this;
            android.content.Context r0 = r2.context
            com.bumptech.glide.manager.SingletonConnectivityReceiver r0 = com.bumptech.glide.manager.SingletonConnectivityReceiver.get(r0)
            com.bumptech.glide.manager.ConnectivityMonitor$ConnectivityListener r1 = r2.listener
            r0.register(r1)
            return
    }

    private void unregister() {
            r2 = this;
            android.content.Context r0 = r2.context
            com.bumptech.glide.manager.SingletonConnectivityReceiver r0 = com.bumptech.glide.manager.SingletonConnectivityReceiver.get(r0)
            com.bumptech.glide.manager.ConnectivityMonitor$ConnectivityListener r1 = r2.listener
            r0.unregister(r1)
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
            r0 = this;
            r0.register()
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
            r0 = this;
            r0.unregister()
            return
    }
}
