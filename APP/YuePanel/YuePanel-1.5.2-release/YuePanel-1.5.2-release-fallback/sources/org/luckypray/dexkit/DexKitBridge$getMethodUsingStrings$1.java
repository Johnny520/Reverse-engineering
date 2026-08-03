package org.luckypray.dexkit;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "", "it", "", "invoke", "(J)[Ljava/lang/String;"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class DexKitBridge$getMethodUsingStrings$1 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Long, java.lang.String[]> {
    final /* synthetic */ long $encodeId;

    public DexKitBridge$getMethodUsingStrings$1(long r1) {
            r0 = this;
            r0.$encodeId = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // Yue.InterfaceC2825
    public /* bridge */ /* synthetic */ java.lang.String[] invoke(java.lang.Long r3) {
            r2 = this;
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            java.lang.String[] r3 = r2.invoke(r0)
            return r3
    }

    @Yue.InterfaceC4418
    public final java.lang.String[] invoke(long r4) {
            r3 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = r3.$encodeId
            java.lang.String[] r4 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetMethodUsingStrings(r0, r4, r1)
            return r4
    }
}
