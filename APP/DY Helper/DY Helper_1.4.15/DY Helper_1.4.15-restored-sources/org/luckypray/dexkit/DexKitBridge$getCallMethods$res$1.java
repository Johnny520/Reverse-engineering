package org.luckypray.dexkit;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge$getCallMethods$res$1 extends p000.bp0 implements p000.a80 {
    final /* synthetic */ long $encodeId;

    public DexKitBridge$getCallMethods$res$1(long r1) {
            r0 = this;
            r0.$encodeId = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // p000.a80
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            byte[] r2 = r2.invoke(r0)
            return r2
    }

    public final byte[] invoke(long r4) {
            r3 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = r3.$encodeId
            byte[] r3 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetCallMethods(r0, r4, r1)
            return r3
    }
}
