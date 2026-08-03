package com.kongzue.dialogx.interfaces;

import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.util.TextInfo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MenuItemTextInfoInterceptor<D extends BaseDialog> {
    private boolean autoTintIconInLightOrDarkMode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MenuItemTextInfoInterceptor() {
    }

    public boolean isAutoTintIconInLightOrDarkMode() {
        return this.autoTintIconInLightOrDarkMode;
    }

    public abstract TextInfo menuItemTextInfo(D d, int i, String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MenuItemTextInfoInterceptor(boolean z) {
        this.autoTintIconInLightOrDarkMode = z;
    }
}
