package org.luckypray.dexkit.util;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
@Yue.InterfaceC5840({"SMAP\nOpCodeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpCodeUtil.kt\norg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,320:1\n13601#2,3:321\n*S KotlinDebug\n*F\n+ 1 OpCodeUtil.kt\norg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2\n*L\n288#1:321,3\n*E\n"})
public final class OpCodeUtil$opFormatMap$2 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<java.util.Map<java.lang.String, java.lang.Integer>> {
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

    @Override // Yue.InterfaceC2823
    public /* bridge */ /* synthetic */ java.util.Map<java.lang.String, java.lang.Integer> invoke() {
            r1 = this;
            java.util.Map r0 = r1.invoke2()
            return r0
    }

    @Override // Yue.InterfaceC2823
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.util.Map<java.lang.String, java.lang.Integer> invoke2() {
            r7 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String[] r1 = org.luckypray.dexkit.util.OpCodeUtil.access$getOpFormat$p()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lc:
            if (r3 >= r2) goto L1d
            r5 = r1[r3]
            int r6 = r4 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r5, r4)
            int r3 = r3 + 1
            r4 = r6
            goto Lc
        L1d:
            return r0
    }
}
