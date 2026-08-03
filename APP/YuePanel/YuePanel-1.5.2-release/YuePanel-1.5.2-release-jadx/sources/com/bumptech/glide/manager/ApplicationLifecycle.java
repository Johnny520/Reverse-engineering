package com.bumptech.glide.manager;

import Yue.InterfaceC6391;

/* JADX INFO: loaded from: classes.dex */
class ApplicationLifecycle implements Lifecycle {
    @Override // com.bumptech.glide.manager.Lifecycle
    public void addListener(@InterfaceC6391 LifecycleListener lifecycleListener) {
        lifecycleListener.onStart();
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void removeListener(@InterfaceC6391 LifecycleListener lifecycleListener) {
    }
}
