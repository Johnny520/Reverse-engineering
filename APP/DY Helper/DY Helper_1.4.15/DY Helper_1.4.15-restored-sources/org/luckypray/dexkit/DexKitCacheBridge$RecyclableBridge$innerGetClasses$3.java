package org.luckypray.dexkit;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge$RecyclableBridge$innerGetClasses$3 extends p000.bp0 implements p000.a80 {
    public static final org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClasses$3 INSTANCE = null;

    static {
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClasses$3 r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClasses$3
            r0.<init>()
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClasses$3.INSTANCE = r0
            return
    }

    public DexKitCacheBridge$RecyclableBridge$innerGetClasses$3() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    @Override // p000.a80
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            org.luckypray.dexkit.result.ClassData r1 = (org.luckypray.dexkit.result.ClassData) r1
            org.luckypray.dexkit.wrap.DexClass r0 = r0.invoke(r1)
            return r0
    }

    public final org.luckypray.dexkit.wrap.DexClass invoke(org.luckypray.dexkit.result.ClassData r1) {
            r0 = this;
            r1.getClass()
            org.luckypray.dexkit.wrap.DexClass r0 = r1.toDexClass()
            return r0
    }
}
