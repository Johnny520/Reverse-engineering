package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(26)
final class FirstFrameWaiter implements com.bumptech.glide.manager.FrameWaiter {
    volatile boolean isFirstFrameSet;
    final java.util.Set<android.app.Activity> pendingActivities;


    public FirstFrameWaiter() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.pendingActivities = r0
            return
    }

    public static void removeListener(android.view.View r0, android.view.ViewTreeObserver.OnDrawListener r1) {
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnDrawListener(r1)
            return
    }

    @Override // com.bumptech.glide.manager.FrameWaiter
    public void registerSelf(android.app.Activity r3) {
            r2 = this;
            boolean r0 = r2.isFirstFrameSet
            if (r0 == 0) goto L5
            return
        L5:
            java.util.Set<android.app.Activity> r0 = r2.pendingActivities
            boolean r0 = r0.add(r3)
            if (r0 != 0) goto Le
            return
        Le:
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()
            com.bumptech.glide.manager.FirstFrameWaiter$1 r1 = new com.bumptech.glide.manager.FirstFrameWaiter$1
            r1.<init>(r2, r3)
            r0.addOnDrawListener(r1)
            return
    }
}
