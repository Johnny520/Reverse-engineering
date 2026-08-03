package org.luckypray.dexkit.result;

import java.util.Collection;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindClass;
import org.luckypray.dexkit.query.FindField;
import org.luckypray.dexkit.query.FindMethod;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class ClassDataList extends BaseDataList<ClassData> {
    public ClassDataList() {
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof ClassData) == true) goto L7;
        return false;
    L7:
        return contains((ClassData) r2);
    }

    public final ClassDataList findClass(FindClass r2) {
        AbstractC0307g.m703e(r2, "findClass");
        if (isEmpty() == true) goto L5;
        DexKitBridge r02 = first().getBridge$dexkit_android_release();
        r2.searchIn(this);
        return r02.findClass(r2);
    L5:
        return new ClassDataList();
    }

    public final FieldDataList findField(FindField r2) {
        AbstractC0307g.m703e(r2, "findField");
        if (isEmpty() == true) goto L5;
        DexKitBridge r02 = first().getBridge$dexkit_android_release();
        r2.searchInClass(this);
        return r02.findField(r2);
    L5:
        return new FieldDataList();
    }

    public final MethodDataList findMethod(FindMethod r2) {
        AbstractC0307g.m703e(r2, "findMethod");
        if (isEmpty() == true) goto L5;
        DexKitBridge r02 = first().getBridge$dexkit_android_release();
        r2.searchInClass(this);
        return r02.findMethod(r2);
    L5:
        return new MethodDataList();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object r2) {
        if ((r2 instanceof ClassData) == true) goto L7;
        return -1;
    L7:
        return indexOf((ClassData) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object r2) {
        if ((r2 instanceof ClassData) == true) goto L7;
        return -1;
    L7:
        return lastIndexOf((ClassData) r2);
    }

    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ ClassData remove(int r1) {
        return removeAt(r1);
    }

    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ ClassData removeAt(int r1) {
        return remove(r1);
    }

    public ClassDataList(int r1) {
        super(r1);
    }

    public /* bridge */ boolean contains(ClassData r1) {
        return super.contains(r1);
    }

    public /* bridge */ int indexOf(ClassData r1) {
        return super.indexOf(r1);
    }

    public /* bridge */ int lastIndexOf(ClassData r1) {
        return super.lastIndexOf(r1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object r2) {
        if ((r2 instanceof ClassData) == true) goto L7;
        return false;
    L7:
        return remove((ClassData) r2);
    }

    public ClassDataList(Collection<ClassData> r2) {
        AbstractC0307g.m703e(r2, "elements");
        super(r2);
    }

    public /* bridge */ boolean remove(ClassData r1) {
        return super.remove(r1);
    }

    private final ClassDataList findClass(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FindClass r02 = new FindClass();
        r2.invoke(r02);
        return findClass(r02);
    }

    private final FieldDataList findField(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FindField r02 = new FindField();
        r2.invoke(r02);
        return findField(r02);
    }

    private final MethodDataList findMethod(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FindMethod r02 = new FindMethod();
        r2.invoke(r02);
        return findMethod(r02);
    }
}
