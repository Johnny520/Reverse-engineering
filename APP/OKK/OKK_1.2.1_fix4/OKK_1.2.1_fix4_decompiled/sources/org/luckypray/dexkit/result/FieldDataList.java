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
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof FieldData) {
            return contains((FieldData) obj);
        }
        return false;
    }

    public final FieldDataList findField(FindField findField) {
        AbstractC0307g.m703e(findField, "findField");
        if (isEmpty()) {
            return new FieldDataList();
        }
        DexKitBridge bridge$dexkit_android_release = first().getBridge$dexkit_android_release();
        findField.searchInField(this);
        return bridge$dexkit_android_release.findField(findField);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof FieldData) {
            return indexOf((FieldData) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof FieldData) {
            return lastIndexOf((FieldData) obj);
        }
        return -1;
    }

    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ FieldData remove(int i2) {
        return removeAt(i2);
    }

    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ FieldData removeAt(int i2) {
        return remove(i2);
    }

    public FieldDataList(int i2) {
        super(i2);
    }

    public /* bridge */ boolean contains(FieldData fieldData) {
        return super.contains((Object) fieldData);
    }

    public /* bridge */ int indexOf(FieldData fieldData) {
        return super.indexOf((Object) fieldData);
    }

    public /* bridge */ int lastIndexOf(FieldData fieldData) {
        return super.lastIndexOf((Object) fieldData);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof FieldData) {
            return remove((FieldData) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldDataList(Collection<FieldData> collection) {
        super(collection);
        AbstractC0307g.m703e(collection, "elements");
    }

    public /* bridge */ boolean remove(FieldData fieldData) {
        return super.remove((Object) fieldData);
    }

    private final FieldDataList findField(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FindField findField = new FindField();
        interfaceC0286l.invoke(findField);
        return findField(findField);
    }
}
