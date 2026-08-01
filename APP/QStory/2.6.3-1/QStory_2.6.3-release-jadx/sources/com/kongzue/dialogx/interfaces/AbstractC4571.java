package com.kongzue.dialogx.interfaces;

import com.kongzue.dialogx.DialogX$IMPL_MODE;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f11946;

    static {
        int[] iArr = new int[DialogX$IMPL_MODE.values().length];
        f11946 = iArr;
        try {
            iArr[DialogX$IMPL_MODE.WINDOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11946[DialogX$IMPL_MODE.DIALOG_FRAGMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11946[DialogX$IMPL_MODE.FLOATING_ACTIVITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
