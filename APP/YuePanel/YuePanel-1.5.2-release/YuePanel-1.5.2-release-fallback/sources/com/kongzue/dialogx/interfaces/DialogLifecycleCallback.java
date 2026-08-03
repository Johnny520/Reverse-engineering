package com.kongzue.dialogx.interfaces;

import com.kongzue.dialogx.interfaces.BaseDialog;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DialogLifecycleCallback<T extends com.kongzue.dialogx.interfaces.BaseDialog> implements androidx.lifecycle.LifecycleOwner {
    private final androidx.lifecycle.LifecycleRegistry registry;

    public DialogLifecycleCallback() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.registry = r0
            return
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @Yue.InterfaceC4410
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.registry
            return r0
    }

    public void onDismiss(T r3) {
            r2 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry     // Catch: java.lang.Exception -> Lf
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()     // Catch: java.lang.Exception -> Lf
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED     // Catch: java.lang.Exception -> Lf
            if (r0 == r1) goto Lf
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry     // Catch: java.lang.Exception -> Lf
            r0.setCurrentState(r1)     // Catch: java.lang.Exception -> Lf
        Lf:
            com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.interfaces.BaseDialog> r0 = com.kongzue.dialogx.DialogX.dialogLifeCycleListener
            if (r0 == 0) goto L18
            if (r0 == r2) goto L18
            r0.onDismiss(r3)
        L18:
            return
    }

    public void onShow(T r3) {
            r2 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry     // Catch: java.lang.Exception -> Lf
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()     // Catch: java.lang.Exception -> Lf
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch: java.lang.Exception -> Lf
            if (r0 == r1) goto Lf
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry     // Catch: java.lang.Exception -> Lf
            r0.setCurrentState(r1)     // Catch: java.lang.Exception -> Lf
        Lf:
            com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.interfaces.BaseDialog> r0 = com.kongzue.dialogx.DialogX.dialogLifeCycleListener
            if (r0 == 0) goto L18
            if (r0 == r2) goto L18
            r0.onShow(r3)
        L18:
            return
    }
}
