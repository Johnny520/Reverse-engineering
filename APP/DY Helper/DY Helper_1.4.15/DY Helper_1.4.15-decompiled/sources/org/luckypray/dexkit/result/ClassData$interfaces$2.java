package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ClassData$interfaces$2 extends p000.bp0 implements p000.p70 {
    final /* synthetic */ org.luckypray.dexkit.DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ org.luckypray.dexkit.result.ClassData this$0;

    public ClassData$interfaces$2(org.luckypray.dexkit.DexKitBridge r1, org.luckypray.dexkit.result.ClassData r2, int r3) {
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
            org.luckypray.dexkit.result.ClassDataList r0 = r0.invoke()
            return r0
    }

    @Override // p000.p70
    public final org.luckypray.dexkit.result.ClassDataList invoke() {
            r6 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r6.$bridge
            org.luckypray.dexkit.result.ClassData r1 = r6.this$0
            java.util.List r1 = org.luckypray.dexkit.result.ClassData.access$getInterfaceIds$p(r1)
            org.luckypray.dexkit.result.ClassData r2 = r6.this$0
            int r6 = r6.$dexId
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p000.AbstractC1021yh.m6889(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L37
            java.lang.Object r4 = r1.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            long r4 = org.luckypray.dexkit.result.ClassData.access$getEncodeId(r2, r6, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.add(r4)
            goto L1b
        L37:
            long[] r6 = p000.AbstractC0984xh.m6667(r3)
            org.luckypray.dexkit.result.ClassDataList r6 = r0.getTypeByIds$dexkit_android_release(r6)
            return r6
    }
}
