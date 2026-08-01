package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class MethodData$returnType$2 extends p000.bp0 implements p000.p70 {
    final /* synthetic */ org.luckypray.dexkit.DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ org.luckypray.dexkit.result.MethodData this$0;

    public MethodData$returnType$2(org.luckypray.dexkit.DexKitBridge r1, org.luckypray.dexkit.result.MethodData r2, int r3) {
            r0 = this;
            r0.$bridge = r1
            r0.this$0 = r2
            r0.$dexId = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // p000.p70
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            r0 = this;
            org.luckypray.dexkit.result.ClassData r0 = r0.invoke()
            return r0
    }

    @Override // p000.p70
    public final org.luckypray.dexkit.result.ClassData invoke() {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r4.$bridge
            org.luckypray.dexkit.result.MethodData r1 = r4.this$0
            int r4 = r4.$dexId
            int r2 = org.luckypray.dexkit.result.MethodData.access$getReturnTypeId$p(r1)
            long r1 = org.luckypray.dexkit.result.MethodData.access$getEncodeId(r1, r4, r2)
            r4 = 1
            long[] r4 = new long[r4]
            r3 = 0
            r4[r3] = r1
            org.luckypray.dexkit.result.ClassDataList r4 = r0.getTypeByIds$dexkit_android_release(r4)
            java.lang.Object r4 = r4.firstOrNull()
            org.luckypray.dexkit.result.ClassData r4 = (org.luckypray.dexkit.result.ClassData) r4
            return r4
    }
}
