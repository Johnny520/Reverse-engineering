package org.luckypray.dexkit.result;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/luckypray/dexkit/result/FieldDataList;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
@Yue.InterfaceC5840({"SMAP\nClassData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassData.kt\norg/luckypray/dexkit/result/ClassData$fields$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,294:1\n1547#2:295\n1618#2,3:296\n*S KotlinDebug\n*F\n+ 1 ClassData.kt\norg/luckypray/dexkit/result/ClassData$fields$2\n*L\n148#1:295\n148#1:296,3\n*E\n"})
public final class ClassData$fields$2 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<org.luckypray.dexkit.result.FieldDataList> {
    final /* synthetic */ org.luckypray.dexkit.DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ org.luckypray.dexkit.result.ClassData this$0;

    public ClassData$fields$2(org.luckypray.dexkit.DexKitBridge r1, org.luckypray.dexkit.result.ClassData r2, int r3) {
            r0 = this;
            r0.$bridge = r1
            r0.this$0 = r2
            r0.$dexId = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // Yue.InterfaceC2823
    public /* bridge */ /* synthetic */ org.luckypray.dexkit.result.FieldDataList invoke() {
            r1 = this;
            org.luckypray.dexkit.result.FieldDataList r0 = r1.invoke2()
            return r0
    }

    @Override // Yue.InterfaceC2823
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final org.luckypray.dexkit.result.FieldDataList invoke2() {
            r7 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r7.$bridge
            org.luckypray.dexkit.result.ClassData r1 = r7.this$0
            java.util.List r1 = org.luckypray.dexkit.result.ClassData.access$getFieldIds$p(r1)
            org.luckypray.dexkit.result.ClassData r2 = r7.this$0
            int r3 = r7.$dexId
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = Yue.C1210.m6231(r1, r5)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L37
            java.lang.Object r5 = r1.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            long r5 = org.luckypray.dexkit.result.ClassData.access$getEncodeId(r2, r3, r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.add(r5)
            goto L1b
        L37:
            long[] r1 = Yue.C1219.m6538(r4)
            org.luckypray.dexkit.result.FieldDataList r0 = r0.getFieldByIds$dexkit_android_release(r1)
            return r0
    }
}
