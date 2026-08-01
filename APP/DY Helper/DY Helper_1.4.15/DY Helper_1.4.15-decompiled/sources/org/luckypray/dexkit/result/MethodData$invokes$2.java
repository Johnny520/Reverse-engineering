package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class MethodData$invokes$2 extends p000.bp0 implements p000.p70 {
    final /* synthetic */ org.luckypray.dexkit.DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ int $id;
    final /* synthetic */ org.luckypray.dexkit.result.MethodData this$0;

    public MethodData$invokes$2(org.luckypray.dexkit.DexKitBridge r1, org.luckypray.dexkit.result.MethodData r2, int r3, int r4) {
            r0 = this;
            r0.$bridge = r1
            r0.this$0 = r2
            r0.$dexId = r3
            r0.$id = r4
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // p000.p70
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            r0 = this;
            org.luckypray.dexkit.result.MethodDataList r0 = r0.invoke()
            return r0
    }

    @Override // p000.p70
    public final org.luckypray.dexkit.result.MethodDataList invoke() {
            r3 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r3.$bridge
            org.luckypray.dexkit.result.MethodData r1 = r3.this$0
            int r2 = r3.$dexId
            int r3 = r3.$id
            long r1 = org.luckypray.dexkit.result.MethodData.access$getEncodeId(r1, r2, r3)
            org.luckypray.dexkit.result.MethodDataList r3 = r0.getInvokeMethods$dexkit_android_release(r1)
            return r3
    }
}
