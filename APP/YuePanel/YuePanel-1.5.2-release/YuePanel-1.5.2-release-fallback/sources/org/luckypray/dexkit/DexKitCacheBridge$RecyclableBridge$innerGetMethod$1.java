package org.luckypray.dexkit;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lorg/luckypray/dexkit/result/MethodData;", "b", "Lorg/luckypray/dexkit/DexKitBridge;", "q", "Lorg/luckypray/dexkit/query/FindMethod;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class DexKitCacheBridge$RecyclableBridge$innerGetMethod$1 extends Yue.AbstractC3560 implements Yue.InterfaceC2839<org.luckypray.dexkit.DexKitBridge, org.luckypray.dexkit.query.FindMethod, java.util.List<? extends org.luckypray.dexkit.result.MethodData>> {
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

    @Override // Yue.InterfaceC2839
    public /* bridge */ /* synthetic */ java.util.List<? extends org.luckypray.dexkit.result.MethodData> invoke(org.luckypray.dexkit.DexKitBridge r1, org.luckypray.dexkit.query.FindMethod r2) {
            r0 = this;
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            org.luckypray.dexkit.query.FindMethod r2 = (org.luckypray.dexkit.query.FindMethod) r2
            java.util.List r1 = r0.invoke2(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.util.List<org.luckypray.dexkit.result.MethodData> invoke2(@Yue.InterfaceC4418 org.luckypray.dexkit.DexKitBridge r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.FindMethod r3) {
            r1 = this;
            java.lang.String r0 = "b"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "q"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.result.MethodDataList r2 = r2.findMethod(r3)
            return r2
    }
}
