package org.luckypray.dexkit.util;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class OpCodeUtil$opFormatMap$2 extends p000.bp0 implements p000.p70 {
    public static final org.luckypray.dexkit.util.OpCodeUtil$opFormatMap$2 INSTANCE = null;

    static {
            org.luckypray.dexkit.util.OpCodeUtil$opFormatMap$2 r0 = new org.luckypray.dexkit.util.OpCodeUtil$opFormatMap$2
            r0.<init>()
            org.luckypray.dexkit.util.OpCodeUtil$opFormatMap$2.INSTANCE = r0
            return
    }

    public OpCodeUtil$opFormatMap$2() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @Override // p000.p70
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            r0 = this;
            java.util.Map r0 = r0.invoke()
            return r0
    }

    @Override // p000.p70
    public final java.util.Map<java.lang.String, java.lang.Integer> invoke() {
            r6 = this;
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.lang.String[] r0 = org.luckypray.dexkit.util.OpCodeUtil.access$getOpFormat$p()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r2 >= r1) goto L1d
            r4 = r0[r2]
            int r5 = r3 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.put(r4, r3)
            int r2 = r2 + 1
            r3 = r5
            goto Lc
        L1d:
            return r6
    }
}
