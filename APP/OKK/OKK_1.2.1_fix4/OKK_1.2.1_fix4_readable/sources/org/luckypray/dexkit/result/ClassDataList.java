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
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ClassData) {
            return contains((ClassData) obj);
        }
        return false;
    }

    public final ClassDataList findClass(FindClass findClass) {
        AbstractC0307g.m703e(findClass, "findClass");
        if (isEmpty()) {
            return new ClassDataList();
        }
        DexKitBridge bridge$dexkit_android_release = first().getBridge$dexkit_android_release();
        findClass.searchIn(this);
        return bridge$dexkit_android_release.findClass(findClass);
    }

    public final FieldDataList findField(FindField findField) {
        AbstractC0307g.m703e(findField, "findField");
        if (isEmpty()) {
            return new FieldDataList();
        }
        DexKitBridge bridge$dexkit_android_release = first().getBridge$dexkit_android_release();
        findField.searchInClass(this);
        return bridge$dexkit_android_release.findField(findField);
    }

    public final MethodDataList findMethod(FindMethod findMethod) {
        AbstractC0307g.m703e(findMethod, "findMethod");
        if (isEmpty()) {
            return new MethodDataList();
        }
        DexKitBridge bridge$dexkit_android_release = first().getBridge$dexkit_android_release();
        findMethod.searchInClass(this);
        return bridge$dexkit_android_release.findMethod(findMethod);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ClassData) {
            return indexOf((ClassData) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ClassData) {
            return lastIndexOf((ClassData) obj);
        }
        return -1;
    }

    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ ClassData remove(int i2) {
        return removeAt(i2);
    }

    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ ClassData removeAt(int i2) {
        return remove(i2);
    }

    public ClassDataList(int i2) {
        super(i2);
    }

    public /* bridge */ boolean contains(ClassData classData) {
        return super.contains((Object) classData);
    }

    public /* bridge */ int indexOf(ClassData classData) {
        return super.indexOf((Object) classData);
    }

    public /* bridge */ int lastIndexOf(ClassData classData) {
        return super.lastIndexOf((Object) classData);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof ClassData) {
            return remove((ClassData) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDataList(Collection<ClassData> collection) {
        super(collection);
        AbstractC0307g.m703e(collection, "elements");
    }

    public /* bridge */ boolean remove(ClassData classData) {
        return super.remove((Object) classData);
    }

    private final ClassDataList findClass(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FindClass findClass = new FindClass();
        interfaceC0286l.invoke(findClass);
        return findClass(findClass);
    }

    private final FieldDataList findField(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FindField findField = new FindField();
        interfaceC0286l.invoke(findField);
        return findField(findField);
    }

    private final MethodDataList findMethod(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FindMethod findMethod = new FindMethod();
        interfaceC0286l.invoke(findMethod);
        return findMethod(findMethod);
    }
}
