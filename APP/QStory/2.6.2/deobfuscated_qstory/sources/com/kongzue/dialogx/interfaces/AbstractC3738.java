package com.kongzue.dialogx.interfaces;

import com.kongzue.dialogx.DialogX$IMPL_MODE;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3738 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f11596;

    static {
        int[] iArr = new int[DialogX$IMPL_MODE.values().length];
        f11596 = iArr;
        try {
            iArr[DialogX$IMPL_MODE.WINDOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11596[DialogX$IMPL_MODE.DIALOG_FRAGMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11596[DialogX$IMPL_MODE.FLOATING_ACTIVITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
