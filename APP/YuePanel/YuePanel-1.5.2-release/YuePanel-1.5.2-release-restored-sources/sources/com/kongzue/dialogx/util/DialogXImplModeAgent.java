package com.kongzue.dialogx.util;

import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.BaseDialog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class DialogXImplModeAgent {
    private WeakReference<BaseDialog> dialogWeakReference;
    private DialogX.IMPL_MODE implMode;

    public DialogXImplModeAgent(DialogX.IMPL_MODE impl_mode, BaseDialog baseDialog) {
        this.implMode = impl_mode;
        this.dialogWeakReference = new WeakReference<>(baseDialog);
    }

    public BaseDialog getDialog() {
        WeakReference<BaseDialog> weakReference = this.dialogWeakReference;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public DialogX.IMPL_MODE getImplMode() {
        return this.implMode;
    }

    public void recycle() {
        WeakReference<BaseDialog> weakReference = this.dialogWeakReference;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.dialogWeakReference = null;
        this.implMode = null;
    }

    public DialogXImplModeAgent setDialogWeakReference(BaseDialog baseDialog) {
        this.dialogWeakReference = new WeakReference<>(baseDialog);
        return this;
    }

    public DialogXImplModeAgent setImplMode(DialogX.IMPL_MODE impl_mode) {
        this.implMode = impl_mode;
        return this;
    }
}
