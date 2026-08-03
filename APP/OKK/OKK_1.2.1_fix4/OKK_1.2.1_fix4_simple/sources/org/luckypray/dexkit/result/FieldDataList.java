package org.luckypray.dexkit.result;

import java.util.Collection;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindField;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class FieldDataList extends BaseDataList<FieldData> {
    public FieldDataList() {
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof FieldData) == true) goto L7;
        return false;
    L7:
        return contains((FieldData) r2);
    }

    public final FieldDataList findField(FindField r2) {
        AbstractC0307g.m703e(r2, "findField");
        if (isEmpty() == true) goto L5;
        DexKitBridge r02 = first().getBridge$dexkit_android_release();
        r2.searchInField(this);
        return r02.findField(r2);
    L5:
        return new FieldDataList();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object r2) {
        if ((r2 instanceof FieldData) == true) goto L7;
        return -1;
    L7:
        return indexOf((FieldData) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object r2) {
        if ((r2 instanceof FieldData) == true) goto L7;
        return -1;
    L7:
        return lastIndexOf((FieldData) r2);
    }

    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ FieldData remove(int r1) {
        return removeAt(r1);
    }

    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ FieldData removeAt(int r1) {
        return remove(r1);
    }

    public FieldDataList(int r1) {
        super(r1);
    }

    public /* bridge */ boolean contains(FieldData r1) {
        return super.contains(r1);
    }

    public /* bridge */ int indexOf(FieldData r1) {
        return super.indexOf(r1);
    }

    public /* bridge */ int lastIndexOf(FieldData r1) {
        return super.lastIndexOf(r1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object r2) {
        if ((r2 instanceof FieldData) == true) goto L7;
        return false;
    L7:
        return remove((FieldData) r2);
    }

    public FieldDataList(Collection<FieldData> r2) {
        AbstractC0307g.m703e(r2, "elements");
        super(r2);
    }

    public /* bridge */ boolean remove(FieldData r1) {
        return super.remove(r1);
    }

    private final FieldDataList findField(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FindField r02 = new FindField();
        r2.invoke(r02);
        return findField(r02);
    }
}
