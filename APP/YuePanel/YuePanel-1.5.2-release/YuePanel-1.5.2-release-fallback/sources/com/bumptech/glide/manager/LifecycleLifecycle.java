package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements com.bumptech.glide.manager.Lifecycle, androidx.lifecycle.LifecycleObserver {

    @Yue.InterfaceC4410
    private final androidx.lifecycle.Lifecycle lifecycle;

    @Yue.InterfaceC4410
    private final java.util.Set<com.bumptech.glide.manager.LifecycleListener> lifecycleListeners;

    public LifecycleLifecycle(androidx.lifecycle.Lifecycle r2) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.lifecycleListeners = r0
            r1.lifecycle = r2
            r2.addObserver(r1)
            return
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void addListener(@Yue.InterfaceC4410 com.bumptech.glide.manager.LifecycleListener r3) {
            r2 = this;
            java.util.Set<com.bumptech.glide.manager.LifecycleListener> r0 = r2.lifecycleListeners
            r0.add(r3)
            androidx.lifecycle.Lifecycle r0 = r2.lifecycle
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto L13
            r3.onDestroy()
            goto L28
        L13:
            androidx.lifecycle.Lifecycle r0 = r2.lifecycle
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r0 = r0.isAtLeast(r1)
            if (r0 == 0) goto L25
            r3.onStart()
            goto L28
        L25:
            r3.onStop()
        L28:
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@Yue.InterfaceC4410 androidx.lifecycle.LifecycleOwner r3) {
            r2 = this;
            java.util.Set<com.bumptech.glide.manager.LifecycleListener> r0 = r2.lifecycleListeners
            java.util.List r0 = com.bumptech.glide.util.Util.getSnapshot(r0)
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.manager.LifecycleListener r1 = (com.bumptech.glide.manager.LifecycleListener) r1
            r1.onDestroy()
            goto La
        L1a:
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            r3.removeObserver(r2)
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START)
    public void onStart(@Yue.InterfaceC4410 androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.manager.LifecycleListener> r2 = r1.lifecycleListeners
            java.util.List r2 = com.bumptech.glide.util.Util.getSnapshot(r2)
            java.util.Iterator r2 = r2.iterator()
        La:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r2.next()
            com.bumptech.glide.manager.LifecycleListener r0 = (com.bumptech.glide.manager.LifecycleListener) r0
            r0.onStart()
            goto La
        L1a:
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP)
    public void onStop(@Yue.InterfaceC4410 androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.manager.LifecycleListener> r2 = r1.lifecycleListeners
            java.util.List r2 = com.bumptech.glide.util.Util.getSnapshot(r2)
            java.util.Iterator r2 = r2.iterator()
        La:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r2.next()
            com.bumptech.glide.manager.LifecycleListener r0 = (com.bumptech.glide.manager.LifecycleListener) r0
            r0.onStop()
            goto La
        L1a:
            return
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void removeListener(@Yue.InterfaceC4410 com.bumptech.glide.manager.LifecycleListener r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.manager.LifecycleListener> r0 = r1.lifecycleListeners
            r0.remove(r2)
            return
    }
}
