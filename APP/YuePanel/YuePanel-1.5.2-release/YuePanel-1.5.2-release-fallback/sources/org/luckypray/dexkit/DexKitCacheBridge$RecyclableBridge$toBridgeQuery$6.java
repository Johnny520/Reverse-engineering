package org.luckypray.dexkit;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(k = 3, mv = {1, 5, 1}, xi = 48)
public /* synthetic */ class DexKitCacheBridge$RecyclableBridge$toBridgeQuery$6 extends Yue.C2854 implements Yue.InterfaceC2825<org.luckypray.dexkit.DexKitBridge, java.util.List<? extends org.luckypray.dexkit.result.FieldData>> {
    public DexKitCacheBridge$RecyclableBridge$toBridgeQuery$6(java.lang.Object r8) {
            r7 = this;
            java.lang.String r5 = "build(Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;"
            r6 = 0
            r1 = 1
            java.lang.Class<org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder> r3 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeFieldsBuilder.class
            java.lang.String r4 = "build"
            r0 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // Yue.InterfaceC2825
    public /* bridge */ /* synthetic */ java.util.List<? extends org.luckypray.dexkit.result.FieldData> invoke(org.luckypray.dexkit.DexKitBridge r1) {
            r0 = this;
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            java.util.List r1 = r0.invoke2(r1)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.util.List<org.luckypray.dexkit.result.FieldData> invoke2(@Yue.InterfaceC4418 org.luckypray.dexkit.DexKitBridge r2) {
            r1 = this;
            java.lang.String r0 = "p0"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object r0 = r1.receiver
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder r0 = (org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeFieldsBuilder) r0
            java.util.List r2 = r0.build(r2)
            return r2
    }
}
