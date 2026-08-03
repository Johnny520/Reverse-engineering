package org.luckypray.dexkit.result;

import java.util.Collection;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class MethodDataList extends BaseDataList<MethodData> {
    public MethodDataList() {
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof MethodData) == true) goto L7;
        return false;
    L7:
        return contains((MethodData) r2);
    }

    public final MethodDataList findMethod(FindMethod r2) {
        AbstractC0307g.m703e(r2, "findMethod");
        if (isEmpty() == true) goto L5;
        DexKitBridge r02 = first().getBridge$dexkit_android_release();
        r2.searchInMethod(this);
        return r02.findMethod(r2);
    L5:
        return new MethodDataList();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object r2) {
        if ((r2 instanceof MethodData) == true) goto L7;
        return -1;
    L7:
        return indexOf((MethodData) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object r2) {
        if ((r2 instanceof MethodData) == true) goto L7;
        return -1;
    L7:
        return lastIndexOf((MethodData) r2);
    }

    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ MethodData remove(int r1) {
        return removeAt(r1);
    }

    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ MethodData removeAt(int r1) {
        return remove(r1);
    }

    public MethodDataList(int r1) {
        super(r1);
    }

    public /* bridge */ boolean contains(MethodData r1) {
        return super.contains(r1);
    }

    public /* bridge */ int indexOf(MethodData r1) {
        return super.indexOf(r1);
    }

    public /* bridge */ int lastIndexOf(MethodData r1) {
        return super.lastIndexOf(r1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object r2) {
        if ((r2 instanceof MethodData) == true) goto L7;
        return false;
    L7:
        return remove((MethodData) r2);
    }

    public MethodDataList(Collection<MethodData> r2) {
        AbstractC0307g.m703e(r2, "elements");
        super(r2);
    }

    public /* bridge */ boolean remove(MethodData r1) {
        return super.remove(r1);
    }

    private final MethodDataList findMethod(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FindMethod r02 = new FindMethod();
        r2.invoke(r02);
        return findMethod(r02);
    }
}
