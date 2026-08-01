package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ClassData$superClass$2 extends p000.bp0 implements p000.p70 {
    final /* synthetic */ org.luckypray.dexkit.DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ org.luckypray.dexkit.result.ClassData this$0;

    public ClassData$superClass$2(org.luckypray.dexkit.result.ClassData r1, org.luckypray.dexkit.DexKitBridge r2, int r3) {
            r0 = this;
            r0.this$0 = r1
            r0.$bridge = r2
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
            org.luckypray.dexkit.result.ClassData r0 = r4.this$0
            java.lang.Integer r0 = org.luckypray.dexkit.result.ClassData.access$getSuperClassId$p(r0)
            if (r0 == 0) goto L27
            org.luckypray.dexkit.DexKitBridge r1 = r4.$bridge
            org.luckypray.dexkit.result.ClassData r2 = r4.this$0
            int r4 = r4.$dexId
            int r0 = r0.intValue()
            long r2 = org.luckypray.dexkit.result.ClassData.access$getEncodeId(r2, r4, r0)
            r4 = 1
            long[] r4 = new long[r4]
            r0 = 0
            r4[r0] = r2
            org.luckypray.dexkit.result.ClassDataList r4 = r1.getTypeByIds$dexkit_android_release(r4)
            java.lang.Object r4 = r4.firstOrNull()
            org.luckypray.dexkit.result.ClassData r4 = (org.luckypray.dexkit.result.ClassData) r4
            return r4
        L27:
            r4 = 0
            return r4
    }
}
