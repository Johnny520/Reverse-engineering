package org.luckypray.dexkit.result;

import java.util.Collection;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindField;
import p000.InterfaceC0742sw;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldDataList extends BaseDataList<FieldData> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldDataList(Collection<FieldData> collection) {
        super(collection);
        collection.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof FieldData) {
            return contains((FieldData) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldDataList findField(FindField findField) {
        findField.getClass();
        if (isEmpty()) {
            return new FieldDataList();
        }
        DexKitBridge bridge$dexkit_android_release = first().getBridge$dexkit_android_release();
        findField.searchInField(this);
        return bridge$dexkit_android_release.findField(findField);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof FieldData) {
            return indexOf((FieldData) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof FieldData) {
            return lastIndexOf((FieldData) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof FieldData) {
            return remove((FieldData) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ FieldData removeAt(int i) {
        return remove(i);
    }

    public FieldDataList(int i) {
        super(i);
    }

    public FieldDataList() {
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

    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ FieldData remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(FieldData fieldData) {
        return super.remove((Object) fieldData);
    }

    public final /* synthetic */ FieldDataList findField(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        FindField findField = new FindField();
        interfaceC0742sw.invoke(findField);
        return findField(findField);
    }
}
