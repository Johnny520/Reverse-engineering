package org.luckypray.dexkit;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lorg/luckypray/dexkit/result/FieldData;", "b", "Lorg/luckypray/dexkit/DexKitBridge;", "q", "Lorg/luckypray/dexkit/query/FindField;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class DexKitCacheBridge$RecyclableBridge$innerGetField$2 extends Yue.AbstractC3560 implements Yue.InterfaceC2839<org.luckypray.dexkit.DexKitBridge, org.luckypray.dexkit.query.FindField, java.util.List<? extends org.luckypray.dexkit.result.FieldData>> {
    public static final org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetField$2 INSTANCE = null;

    static {
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetField$2 r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetField$2
            r0.<init>()
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetField$2.INSTANCE = r0
            return
    }

    public DexKitCacheBridge$RecyclableBridge$innerGetField$2() {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            return
    }

    @Override // Yue.InterfaceC2839
    public /* bridge */ /* synthetic */ java.util.List<? extends org.luckypray.dexkit.result.FieldData> invoke(org.luckypray.dexkit.DexKitBridge r1, org.luckypray.dexkit.query.FindField r2) {
            r0 = this;
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            org.luckypray.dexkit.query.FindField r2 = (org.luckypray.dexkit.query.FindField) r2
            java.util.List r1 = r0.invoke2(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.util.List<org.luckypray.dexkit.result.FieldData> invoke2(@Yue.InterfaceC4418 org.luckypray.dexkit.DexKitBridge r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.FindField r3) {
            r1 = this;
            java.lang.String r0 = "b"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "q"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.result.FieldDataList r2 = r2.findField(r3)
            return r2
    }
}
