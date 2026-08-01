package com.typesafe.config.impl;

import androidx.compose.ui.graphics.C1609;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3850 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3841 f12072;

    public C3850(C3841 c3841) {
        this.f12072 = c3841;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3842 m8242(C3852 c3852) {
        C1609 c1609;
        C1609[] c1609Arr = this.f12072.f12061;
        Object objM2954 = null;
        if (c1609Arr.length != 0 && (c1609 = c1609Arr[Math.abs(c3852.hashCode()) % c1609Arr.length]) != null) {
            objM2954 = c1609.m2954(c3852);
        }
        return (AbstractC3842) objM2954;
    }
}
