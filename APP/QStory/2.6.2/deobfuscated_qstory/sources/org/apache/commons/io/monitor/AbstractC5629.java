package org.apache.commons.io.monitor;

import org.apache.commons.io.IOCase;

/* JADX INFO: renamed from: org.apache.commons.io.monitor.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5629 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f15512;

    static {
        int[] iArr = new int[IOCase.values().length];
        f15512 = iArr;
        try {
            iArr[IOCase.SYSTEM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f15512[IOCase.INSENSITIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
