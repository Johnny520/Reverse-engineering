package org.luckypray.dexkit.result;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/luckypray/dexkit/wrap/DexMethod;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class MethodData$dexMethod$2 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<org.luckypray.dexkit.wrap.DexMethod> {
    final /* synthetic */ org.luckypray.dexkit.result.MethodData this$0;

    public MethodData$dexMethod$2(org.luckypray.dexkit.result.MethodData r1) {
            r0 = this;
            r0.this$0 = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // Yue.InterfaceC2823
    public /* bridge */ /* synthetic */ org.luckypray.dexkit.wrap.DexMethod invoke() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r1.invoke2()
            return r0
    }

    @Override // Yue.InterfaceC2823
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final org.luckypray.dexkit.wrap.DexMethod invoke2() {
            r2 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = new org.luckypray.dexkit.wrap.DexMethod
            org.luckypray.dexkit.result.MethodData r1 = r2.this$0
            java.lang.String r1 = r1.getDescriptor()
            r0.<init>(r1)
            return r0
    }
}
