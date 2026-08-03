package org.luckypray.dexkit.result;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lorg/luckypray/dexkit/result/ClassData;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class ClassData$toString$1$2 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<org.luckypray.dexkit.result.ClassData, java.lang.CharSequence> {
    public static final org.luckypray.dexkit.result.ClassData$toString$1$2 INSTANCE = null;

    static {
            org.luckypray.dexkit.result.ClassData$toString$1$2 r0 = new org.luckypray.dexkit.result.ClassData$toString$1$2
            r0.<init>()
            org.luckypray.dexkit.result.ClassData$toString$1$2.INSTANCE = r0
            return
    }

    public ClassData$toString$1$2() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.CharSequence invoke2(@Yue.InterfaceC4418 org.luckypray.dexkit.result.ClassData r2) {
            r1 = this;
            java.lang.String r0 = "it"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = r2.getName()
            return r2
    }

    @Override // Yue.InterfaceC2825
    public /* bridge */ /* synthetic */ java.lang.CharSequence invoke(org.luckypray.dexkit.result.ClassData r1) {
            r0 = this;
            org.luckypray.dexkit.result.ClassData r1 = (org.luckypray.dexkit.result.ClassData) r1
            java.lang.CharSequence r1 = r0.invoke2(r1)
            return r1
    }
}
