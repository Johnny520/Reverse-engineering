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
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof MethodData) {
            return contains((MethodData) obj);
        }
        return false;
    }

    public final MethodDataList findMethod(FindMethod findMethod) {
        AbstractC0307g.m703e(findMethod, "findMethod");
        if (isEmpty()) {
            return new MethodDataList();
        }
        DexKitBridge bridge$dexkit_android_release = first().getBridge$dexkit_android_release();
        findMethod.searchInMethod(this);
        return bridge$dexkit_android_release.findMethod(findMethod);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof MethodData) {
            return indexOf((MethodData) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof MethodData) {
            return lastIndexOf((MethodData) obj);
        }
        return -1;
    }

    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ MethodData remove(int i2) {
        return removeAt(i2);
    }

    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ MethodData removeAt(int i2) {
        return remove(i2);
    }

    public MethodDataList(int i2) {
        super(i2);
    }

    public /* bridge */ boolean contains(MethodData methodData) {
        return super.contains((Object) methodData);
    }

    public /* bridge */ int indexOf(MethodData methodData) {
        return super.indexOf((Object) methodData);
    }

    public /* bridge */ int lastIndexOf(MethodData methodData) {
        return super.lastIndexOf((Object) methodData);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof MethodData) {
            return remove((MethodData) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodDataList(Collection<MethodData> collection) {
        super(collection);
        AbstractC0307g.m703e(collection, "elements");
    }

    public /* bridge */ boolean remove(MethodData methodData) {
        return super.remove((Object) methodData);
    }

    private final MethodDataList findMethod(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FindMethod findMethod = new FindMethod();
        interfaceC0286l.invoke(findMethod);
        return findMethod(findMethod);
    }
}
