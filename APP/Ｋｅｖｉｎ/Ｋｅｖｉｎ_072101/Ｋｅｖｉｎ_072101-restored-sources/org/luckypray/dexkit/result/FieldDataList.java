package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: DataCollections.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0015\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ%\u0010\n\u001a\u00020\u00002\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, m115d2 = {"Lorg/luckypray/dexkit/result/FieldDataList;", "Lorg/luckypray/dexkit/result/BaseDataList;", "Lorg/luckypray/dexkit/result/FieldData;", "()V", "initialCapacity", "", "(I)V", "elements", "", "(Ljava/util/Collection;)V", "findField", "Lorg/luckypray/dexkit/query/FindField;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class FieldDataList extends org.luckypray.dexkit.result.BaseDataList<org.luckypray.dexkit.result.FieldData> {
    public FieldDataList() {
            r0 = this;
            r0.<init>()
            return
    }

    public FieldDataList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public FieldDataList(java.util.Collection<org.luckypray.dexkit.result.FieldData> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2)
            return
    }

    private final org.luckypray.dexkit.result.FieldDataList findField(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.FindField, kotlin.Unit> r2) {
            r1 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            org.luckypray.dexkit.query.FindField r0 = new org.luckypray.dexkit.query.FindField
            r0.<init>()
            r2.invoke(r0)
            org.luckypray.dexkit.result.FieldDataList r0 = r1.findField(r0)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.result.FieldData
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            org.luckypray.dexkit.result.FieldData r0 = (org.luckypray.dexkit.result.FieldData) r0
            boolean r0 = r1.contains(r0)
            return r0
    }

    public /* bridge */ boolean contains(org.luckypray.dexkit.result.FieldData r2) {
            r1 = this;
            boolean r0 = super.contains(r2)
            return r0
    }

    public final org.luckypray.dexkit.result.FieldDataList findField(org.luckypray.dexkit.query.FindField r3) {
            r2 = this;
            java.lang.String r0 = "findField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L11
            org.luckypray.dexkit.result.FieldDataList r0 = new org.luckypray.dexkit.result.FieldDataList
            r0.<init>()
            return r0
        L11:
            java.lang.Object r0 = r2.first()
            org.luckypray.dexkit.result.FieldData r0 = (org.luckypray.dexkit.result.FieldData) r0
            org.luckypray.dexkit.DexKitBridge r0 = r0.getBridge$dexkit_android_release()
            r1 = r2
            java.util.Collection r1 = (java.util.Collection) r1
            r3.searchInField(r1)
            org.luckypray.dexkit.result.FieldDataList r1 = r0.findField(r3)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.result.FieldData
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r2
            org.luckypray.dexkit.result.FieldData r0 = (org.luckypray.dexkit.result.FieldData) r0
            int r0 = r1.indexOf(r0)
            return r0
    }

    public /* bridge */ int indexOf(org.luckypray.dexkit.result.FieldData r2) {
            r1 = this;
            int r0 = super.indexOf(r2)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.result.FieldData
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r2
            org.luckypray.dexkit.result.FieldData r0 = (org.luckypray.dexkit.result.FieldData) r0
            int r0 = r1.lastIndexOf(r0)
            return r0
    }

    public /* bridge */ int lastIndexOf(org.luckypray.dexkit.result.FieldData r2) {
            r1 = this;
            int r0 = super.lastIndexOf(r2)
            return r0
    }

    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ org.luckypray.dexkit.result.FieldData remove(int r2) {
            r1 = this;
            org.luckypray.dexkit.result.FieldData r0 = r1.removeAt(r2)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.result.FieldData
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            org.luckypray.dexkit.result.FieldData r0 = (org.luckypray.dexkit.result.FieldData) r0
            boolean r0 = r1.remove(r0)
            return r0
    }

    public /* bridge */ boolean remove(org.luckypray.dexkit.result.FieldData r2) {
            r1 = this;
            boolean r0 = super.remove(r2)
            return r0
    }

    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ org.luckypray.dexkit.result.FieldData removeAt(int r2) {
            r1 = this;
            java.lang.Object r0 = super.remove(r2)
            org.luckypray.dexkit.result.FieldData r0 = (org.luckypray.dexkit.result.FieldData) r0
            return r0
    }
}
