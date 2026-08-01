package com.typesafe.config.impl;

import androidx.compose.ui.graphics.C1609;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3851 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3842 f12077;

    public C3851(C3842 c3842) {
        this.f12077 = c3842;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3843 m8229(C3853 c3853) {
        C1609 c1609;
        C1609[] c1609Arr = this.f12077.f12066;
        Object objM2964 = null;
        if (c1609Arr.length != 0 && (c1609 = c1609Arr[Math.abs(c3853.hashCode()) % c1609Arr.length]) != null) {
            objM2964 = c1609.m2964(c3853);
        }
        return (AbstractC3843) objM2964;
    }
}
