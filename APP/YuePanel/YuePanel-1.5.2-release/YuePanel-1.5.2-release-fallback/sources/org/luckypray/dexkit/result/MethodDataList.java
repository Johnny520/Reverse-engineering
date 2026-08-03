package org.luckypray.dexkit.result;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u0003\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ&\u0010\f\u001a\u00020\u00002\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0013"}, d2 = {"Lorg/luckypray/dexkit/result/MethodDataList;", "Lorg/luckypray/dexkit/result/BaseDataList;", "Lorg/luckypray/dexkit/result/MethodData;", "<init>", "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "Lorg/luckypray/dexkit/query/FindMethod;", "findMethod", "(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/MethodDataList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class MethodDataList extends org.luckypray.dexkit.result.BaseDataList<org.luckypray.dexkit.result.MethodData> {
    public MethodDataList() {
            r0 = this;
            r0.<init>()
            return
    }

    public MethodDataList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public MethodDataList(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.result.MethodData> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            r1.<init>(r2)
            return
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.result.MethodData
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2
            boolean r2 = r1.contains(r2)
            return r2
    }

    public /* bridge */ boolean contains(org.luckypray.dexkit.result.MethodData r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.result.MethodDataList findMethod(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.FindMethod r0 = new org.luckypray.dexkit.query.FindMethod
            r0.<init>()
            r2.invoke(r0)
            org.luckypray.dexkit.result.MethodDataList r2 = r1.findMethod(r0)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.MethodDataList findMethod(@Yue.InterfaceC4418 org.luckypray.dexkit.query.FindMethod r2) {
            r1 = this;
            java.lang.String r0 = "findMethod"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L11
            org.luckypray.dexkit.result.MethodDataList r2 = new org.luckypray.dexkit.result.MethodDataList
            r2.<init>()
            return r2
        L11:
            java.lang.Object r0 = r1.first()
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0
            org.luckypray.dexkit.DexKitBridge r0 = r0.getBridge$dexkit_android_release()
            r2.searchInMethod(r1)
            org.luckypray.dexkit.result.MethodDataList r2 = r0.findMethod(r2)
            return r2
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.result.MethodData
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2
            int r2 = r1.indexOf(r2)
            return r2
    }

    public /* bridge */ int indexOf(org.luckypray.dexkit.result.MethodData r1) {
            r0 = this;
            int r1 = super.indexOf(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.result.MethodData
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2
            int r2 = r1.lastIndexOf(r2)
            return r2
    }

    public /* bridge */ int lastIndexOf(org.luckypray.dexkit.result.MethodData r1) {
            r0 = this;
            int r1 = super.lastIndexOf(r1)
            return r1
    }

    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ org.luckypray.dexkit.result.MethodData remove(int r1) {
            r0 = this;
            org.luckypray.dexkit.result.MethodData r1 = r0.removeAt(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.result.MethodData
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2
            boolean r2 = r1.remove(r2)
            return r2
    }

    public /* bridge */ boolean remove(org.luckypray.dexkit.result.MethodData r1) {
            r0 = this;
            boolean r1 = super.remove(r1)
            return r1
    }

    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ org.luckypray.dexkit.result.MethodData removeAt(int r1) {
            r0 = this;
            java.lang.Object r1 = super.remove(r1)
            org.luckypray.dexkit.result.MethodData r1 = (org.luckypray.dexkit.result.MethodData) r1
            return r1
    }
}
