package com.kongzue.dialogx.interfaces;

import com.kongzue.dialogx.interfaces.BaseDialog;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MenuItemTextInfoInterceptor<D extends com.kongzue.dialogx.interfaces.BaseDialog> {
    private boolean autoTintIconInLightOrDarkMode;

    public MenuItemTextInfoInterceptor() {
            r0 = this;
            r0.<init>()
            return
    }

    public MenuItemTextInfoInterceptor(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.autoTintIconInLightOrDarkMode = r1
            return
    }

    public boolean isAutoTintIconInLightOrDarkMode() {
            r1 = this;
            boolean r0 = r1.autoTintIconInLightOrDarkMode
            return r0
    }

    public abstract com.kongzue.dialogx.util.TextInfo menuItemTextInfo(D r1, int r2, java.lang.String r3);
}
