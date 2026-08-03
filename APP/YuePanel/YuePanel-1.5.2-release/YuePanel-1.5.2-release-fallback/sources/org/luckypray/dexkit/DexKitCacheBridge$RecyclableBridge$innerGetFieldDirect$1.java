package org.luckypray.dexkit;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lorg/luckypray/dexkit/wrap/DexField;", "it", "Lorg/luckypray/dexkit/result/FieldData;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class DexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<org.luckypray.dexkit.result.FieldData, org.luckypray.dexkit.wrap.DexField> {
    public static final org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1 INSTANCE = null;

    static {
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1 r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1
            r0.<init>()
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1.INSTANCE = r0
            return
    }

    public DexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    @Override // Yue.InterfaceC2825
    public /* bridge */ /* synthetic */ org.luckypray.dexkit.wrap.DexField invoke(org.luckypray.dexkit.result.FieldData r1) {
            r0 = this;
            org.luckypray.dexkit.result.FieldData r1 = (org.luckypray.dexkit.result.FieldData) r1
            org.luckypray.dexkit.wrap.DexField r1 = r0.invoke2(r1)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final org.luckypray.dexkit.wrap.DexField invoke2(@Yue.InterfaceC4418 org.luckypray.dexkit.result.FieldData r2) {
            r1 = this;
            java.lang.String r0 = "it"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.wrap.DexField r2 = r2.toDexField()
            return r2
    }
}
