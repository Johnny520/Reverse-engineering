package org.luckypray.dexkit.result;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/luckypray/dexkit/result/ClassData;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class FieldData$declaredClass$2 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<org.luckypray.dexkit.result.ClassData> {
    final /* synthetic */ org.luckypray.dexkit.DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ org.luckypray.dexkit.result.FieldData this$0;

    public FieldData$declaredClass$2(org.luckypray.dexkit.DexKitBridge r1, org.luckypray.dexkit.result.FieldData r2, int r3) {
            r0 = this;
            r0.$bridge = r1
            r0.this$0 = r2
            r0.$dexId = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // Yue.InterfaceC2823
    public /* bridge */ /* synthetic */ org.luckypray.dexkit.result.ClassData invoke() {
            r1 = this;
            org.luckypray.dexkit.result.ClassData r0 = r1.invoke2()
            return r0
    }

    @Override // Yue.InterfaceC2823
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final org.luckypray.dexkit.result.ClassData invoke2() {
            r5 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r5.$bridge
            org.luckypray.dexkit.result.FieldData r1 = r5.this$0
            int r2 = r5.$dexId
            int r3 = org.luckypray.dexkit.result.FieldData.access$getClassId$p(r1)
            long r1 = org.luckypray.dexkit.result.FieldData.access$getEncodeId(r1, r2, r3)
            r3 = 1
            long[] r3 = new long[r3]
            r4 = 0
            r3[r4] = r1
            org.luckypray.dexkit.result.ClassDataList r0 = r0.getTypeByIds$dexkit_android_release(r3)
            java.lang.Object r0 = r0.first()
            org.luckypray.dexkit.result.ClassData r0 = (org.luckypray.dexkit.result.ClassData) r0
            return r0
    }
}
