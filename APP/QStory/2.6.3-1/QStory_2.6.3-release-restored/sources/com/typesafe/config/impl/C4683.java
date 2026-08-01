package com.typesafe.config.impl;

import androidx.compose.p001ui.graphics.C2444;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4683 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4674 f12422;

    public C4683(C4674 c4674) {
        this.f12422 = c4674;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4675 m8788(C4685 c4685) {
        C2444 c2444;
        C2444[] c2444Arr = this.f12422.f12411;
        Object objM3524 = null;
        if (c2444Arr.length != 0 && (c2444 = c2444Arr[Math.abs(c4685.hashCode()) % c2444Arr.length]) != null) {
            objM3524 = c2444.m3524(c4685);
        }
        return (AbstractC4675) objM3524;
    }
}
