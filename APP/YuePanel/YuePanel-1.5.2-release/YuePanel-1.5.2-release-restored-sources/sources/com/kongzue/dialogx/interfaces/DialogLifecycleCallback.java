package com.kongzue.dialogx.interfaces;

import Yue.InterfaceC6391;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.LifecycleRegistry;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.BaseDialog;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DialogLifecycleCallback<T extends BaseDialog> implements LifecycleOwner {
    private final LifecycleRegistry registry = new LifecycleRegistry(this);

    @Override // android.view.LifecycleOwner
    @InterfaceC6391
    public Lifecycle getLifecycle() {
        return this.registry;
    }

    public void onDismiss(T t) {
        try {
            Lifecycle.State currentState = this.registry.getState();
            Lifecycle.State state = Lifecycle.State.DESTROYED;
            if (currentState != state) {
                this.registry.setCurrentState(state);
            }
        } catch (Exception unused) {
        }
        DialogLifecycleCallback<BaseDialog> dialogLifecycleCallback = DialogX.dialogLifeCycleListener;
        if (dialogLifecycleCallback == null || dialogLifecycleCallback == this) {
            return;
        }
        dialogLifecycleCallback.onDismiss(t);
    }

    public void onShow(T t) {
        try {
            Lifecycle.State currentState = this.registry.getState();
            Lifecycle.State state = Lifecycle.State.CREATED;
            if (currentState != state) {
                this.registry.setCurrentState(state);
            }
        } catch (Exception unused) {
        }
        DialogLifecycleCallback<BaseDialog> dialogLifecycleCallback = DialogX.dialogLifeCycleListener;
        if (dialogLifecycleCallback == null || dialogLifecycleCallback == this) {
            return;
        }
        dialogLifecycleCallback.onShow(t);
    }
}
