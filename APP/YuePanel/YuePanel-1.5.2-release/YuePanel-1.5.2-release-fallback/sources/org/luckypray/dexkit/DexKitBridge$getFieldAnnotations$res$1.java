package org.luckypray.dexkit;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class DexKitBridge$getFieldAnnotations$res$1 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Long, byte[]> {
    final /* synthetic */ long $fieldId;

    public DexKitBridge$getFieldAnnotations$res$1(long r1) {
            r0 = this;
            r0.$fieldId = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // Yue.InterfaceC2825
    public /* bridge */ /* synthetic */ byte[] invoke(java.lang.Long r3) {
            r2 = this;
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            byte[] r3 = r2.invoke(r0)
            return r3
    }

    @Yue.InterfaceC4418
    public final byte[] invoke(long r4) {
            r3 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = r3.$fieldId
            byte[] r4 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetFieldAnnotations(r0, r4, r1)
            return r4
    }
}
