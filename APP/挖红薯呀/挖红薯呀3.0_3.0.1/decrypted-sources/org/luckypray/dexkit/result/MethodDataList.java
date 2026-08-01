package org.luckypray.dexkit.result;

import java.util.Collection;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import p000.InterfaceC0742sw;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class MethodDataList extends BaseDataList<MethodData> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodDataList(Collection<MethodData> collection) {
        super(collection);
        collection.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof MethodData) {
            return contains((MethodData) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodDataList findMethod(FindMethod findMethod) {
        findMethod.getClass();
        if (isEmpty()) {
            return new MethodDataList();
        }
        DexKitBridge bridge$dexkit_android_release = first().getBridge$dexkit_android_release();
        findMethod.searchInMethod(this);
        return bridge$dexkit_android_release.findMethod(findMethod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof MethodData) {
            return indexOf((MethodData) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof MethodData) {
            return lastIndexOf((MethodData) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof MethodData) {
            return remove((MethodData) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ MethodData removeAt(int i) {
        return remove(i);
    }

    public MethodDataList(int i) {
        super(i);
    }

    public MethodDataList() {
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

    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ MethodData remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(MethodData methodData) {
        return super.remove((Object) methodData);
    }

    public final /* synthetic */ MethodDataList findMethod(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        FindMethod findMethod = new FindMethod();
        interfaceC0742sw.invoke(findMethod);
        return findMethod(findMethod);
    }
}
