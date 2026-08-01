package org.luckypray.dexkit;

/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$2 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0648xa2ffee1f extends p000.bp0 implements p000.e80 {
    public static final org.luckypray.dexkit.C0648xa2ffee1f INSTANCE = null;

    static {
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$2 r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$2
            r0.<init>()
            org.luckypray.dexkit.C0648xa2ffee1f.INSTANCE = r0
            return
    }

    public C0648xa2ffee1f() {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            return
    }

    @Override // p000.e80
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r2 = (org.luckypray.dexkit.query.BatchFindMethodUsingStrings) r2
            java.util.Map r0 = r0.invoke(r1, r2)
            return r0
    }

    public final java.util.Map<java.lang.String, java.util.List<org.luckypray.dexkit.result.MethodData>> invoke(org.luckypray.dexkit.DexKitBridge r1, org.luckypray.dexkit.query.BatchFindMethodUsingStrings r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.util.Map r0 = r1.batchFindMethodUsingStrings(r2)
            return r0
    }
}
