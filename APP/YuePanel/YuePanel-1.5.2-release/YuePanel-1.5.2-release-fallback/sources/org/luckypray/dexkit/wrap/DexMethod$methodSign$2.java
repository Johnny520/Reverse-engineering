package org.luckypray.dexkit.wrap;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class DexMethod$methodSign$2 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<java.lang.String> {
    final /* synthetic */ org.luckypray.dexkit.wrap.DexMethod this$0;

    public DexMethod$methodSign$2(org.luckypray.dexkit.wrap.DexMethod r1) {
            r0 = this;
            r0.this$0 = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // Yue.InterfaceC2823
    public /* bridge */ /* synthetic */ java.lang.String invoke() {
            r1 = this;
            java.lang.String r0 = r1.invoke2()
            return r0
    }

    @Override // Yue.InterfaceC2823
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.String invoke2() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r1.this$0
            java.lang.String r0 = org.luckypray.dexkit.wrap.DexMethod.access$getSign(r0)
            return r0
    }
}
