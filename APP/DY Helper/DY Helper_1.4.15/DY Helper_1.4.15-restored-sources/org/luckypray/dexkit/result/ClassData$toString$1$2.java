package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ClassData$toString$1$2 extends p000.bp0 implements p000.a80 {
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

    public final java.lang.CharSequence invoke(org.luckypray.dexkit.result.ClassData r1) {
            r0 = this;
            r1.getClass()
            java.lang.String r0 = r1.getName()
            return r0
    }

    @Override // p000.a80
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            org.luckypray.dexkit.result.ClassData r1 = (org.luckypray.dexkit.result.ClassData) r1
            java.lang.CharSequence r0 = r0.invoke(r1)
            return r0
    }
}
