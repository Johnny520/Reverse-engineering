package com.kongzue.dialogx.interfaces;

import com.kongzue.dialogx.interfaces.BaseDialog;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OnIconChangeCallBack<D extends BaseDialog> {
    private Boolean autoTintIconInLightOrDarkMode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OnIconChangeCallBack() {
    }

    public abstract int getIcon(D d, int i, String str);

    public Boolean isAutoTintIconInLightOrDarkMode() {
        return this.autoTintIconInLightOrDarkMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public OnIconChangeCallBack(boolean z) {
        this.autoTintIconInLightOrDarkMode = Boolean.valueOf(z);
    }
}
