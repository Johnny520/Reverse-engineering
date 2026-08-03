package org.luckypray.dexkit.result;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class MethodData$paramNames$2 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<java.util.List<? extends java.lang.String>> {
    final /* synthetic */ org.luckypray.dexkit.DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ int $id;
    final /* synthetic */ org.luckypray.dexkit.result.MethodData this$0;

    public MethodData$paramNames$2(org.luckypray.dexkit.DexKitBridge r1, org.luckypray.dexkit.result.MethodData r2, int r3, int r4) {
            r0 = this;
            r0.$bridge = r1
            r0.this$0 = r2
            r0.$dexId = r3
            r0.$id = r4
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // Yue.InterfaceC2823
    public /* bridge */ /* synthetic */ java.util.List<? extends java.lang.String> invoke() {
            r1 = this;
            java.util.List r0 = r1.invoke2()
            return r0
    }

    @Override // Yue.InterfaceC2823
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.util.List<? extends java.lang.String> invoke2() {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r4.$bridge
            org.luckypray.dexkit.result.MethodData r1 = r4.this$0
            int r2 = r4.$dexId
            int r3 = r4.$id
            long r1 = org.luckypray.dexkit.result.MethodData.access$getEncodeId(r1, r2, r3)
            java.util.List r0 = r0.getParameterNames$dexkit_android_release(r1)
            return r0
    }
}
