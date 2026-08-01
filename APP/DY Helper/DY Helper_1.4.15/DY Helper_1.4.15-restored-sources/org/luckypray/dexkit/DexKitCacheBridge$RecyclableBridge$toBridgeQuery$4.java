package org.luckypray.dexkit;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class DexKitCacheBridge$RecyclableBridge$toBridgeQuery$4 extends p000.p80 implements p000.a80 {
    public DexKitCacheBridge$RecyclableBridge$toBridgeQuery$4(java.lang.Object r8) {
            r7 = this;
            java.lang.String r5 = "build(Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;"
            r6 = 0
            r1 = 1
            java.lang.Class<org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder> r3 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeMethodsBuilder.class
            java.lang.String r4 = "build"
            r0 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // p000.a80
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            java.util.List r0 = r0.invoke(r1)
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.result.MethodData> invoke(org.luckypray.dexkit.DexKitBridge r1) {
            r0 = this;
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder r0 = (org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeMethodsBuilder) r0
            java.util.List r0 = r0.build(r1)
            return r0
    }
}
