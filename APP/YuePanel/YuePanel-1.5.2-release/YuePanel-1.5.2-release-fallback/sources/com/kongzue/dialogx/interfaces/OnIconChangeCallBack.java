package com.kongzue.dialogx.interfaces;

import com.kongzue.dialogx.interfaces.BaseDialog;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OnIconChangeCallBack<D extends com.kongzue.dialogx.interfaces.BaseDialog> {
    private java.lang.Boolean autoTintIconInLightOrDarkMode;

    public OnIconChangeCallBack() {
            r0 = this;
            r0.<init>()
            return
    }

    public OnIconChangeCallBack(boolean r1) {
            r0 = this;
            r0.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.autoTintIconInLightOrDarkMode = r1
            return
    }

    public abstract int getIcon(D r1, int r2, java.lang.String r3);

    public java.lang.Boolean isAutoTintIconInLightOrDarkMode() {
            r1 = this;
            java.lang.Boolean r0 = r1.autoTintIconInLightOrDarkMode
            return r0
    }
}
