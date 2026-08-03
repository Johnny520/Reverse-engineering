package com.kongzue.dialogx.util;

/* JADX INFO: loaded from: classes2.dex */
public class DialogXImplModeAgent {
    private java.lang.ref.WeakReference<com.kongzue.dialogx.interfaces.BaseDialog> dialogWeakReference;
    private com.kongzue.dialogx.DialogX.IMPL_MODE implMode;

    public DialogXImplModeAgent(com.kongzue.dialogx.DialogX.IMPL_MODE r1, com.kongzue.dialogx.interfaces.BaseDialog r2) {
            r0 = this;
            r0.<init>()
            r0.implMode = r1
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r0.dialogWeakReference = r1
            return
    }

    public com.kongzue.dialogx.interfaces.BaseDialog getDialog() {
            r1 = this;
            java.lang.ref.WeakReference<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r1.dialogWeakReference
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.get()
            com.kongzue.dialogx.interfaces.BaseDialog r0 = (com.kongzue.dialogx.interfaces.BaseDialog) r0
            return r0
    }

    public com.kongzue.dialogx.DialogX.IMPL_MODE getImplMode() {
            r1 = this;
            com.kongzue.dialogx.DialogX$IMPL_MODE r0 = r1.implMode
            return r0
    }

    public void recycle() {
            r1 = this;
            java.lang.ref.WeakReference<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r1.dialogWeakReference
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r0 = 0
            r1.dialogWeakReference = r0
            r1.implMode = r0
            return
    }

    public com.kongzue.dialogx.util.DialogXImplModeAgent setDialogWeakReference(com.kongzue.dialogx.interfaces.BaseDialog r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.dialogWeakReference = r0
            return r1
    }

    public com.kongzue.dialogx.util.DialogXImplModeAgent setImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            r0.implMode = r1
            return r0
    }
}
