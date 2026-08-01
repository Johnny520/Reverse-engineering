package org.luckypray.dexkit;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge$RecyclableBridge$innerGetMethod$1 extends p000.bp0 implements p000.e80 {
    public static final org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethod$1 INSTANCE = null;

    static {
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethod$1 r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethod$1
            r0.<init>()
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethod$1.INSTANCE = r0
            return
    }

    public DexKitCacheBridge$RecyclableBridge$innerGetMethod$1() {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            return
    }

    @Override // p000.e80
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            org.luckypray.dexkit.query.FindMethod r2 = (org.luckypray.dexkit.query.FindMethod) r2
            java.util.List r0 = r0.invoke(r1, r2)
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.result.MethodData> invoke(org.luckypray.dexkit.DexKitBridge r1, org.luckypray.dexkit.query.FindMethod r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r2)
            return r0
    }
}
