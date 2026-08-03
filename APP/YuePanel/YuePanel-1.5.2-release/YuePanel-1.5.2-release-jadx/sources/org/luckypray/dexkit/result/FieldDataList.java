package org.luckypray.dexkit.result;

import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC6399;
import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindField;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u0003\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ&\u0010\f\u001a\u00020\u00002\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0013"}, d2 = {"Lorg/luckypray/dexkit/result/FieldDataList;", "Lorg/luckypray/dexkit/result/BaseDataList;", "Lorg/luckypray/dexkit/result/FieldData;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "Lorg/luckypray/dexkit/query/FindField;", "findField", "(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/FieldDataList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class FieldDataList extends BaseDataList<FieldData> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldDataList() {
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
    @InterfaceC6399
    public final FieldDataList findField(@InterfaceC6399 FindField findField) {
        C5499.m17103(findField, "findField");
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
    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ FieldData remove(int i) {
        return removeAt(i);
    }

    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ FieldData removeAt(int i) {
        return (FieldData) super.remove(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public FieldDataList(int i) {
        super(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ boolean contains(FieldData fieldData) {
        return super.contains((Object) fieldData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int indexOf(FieldData fieldData) {
        return super.indexOf((Object) fieldData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int lastIndexOf(FieldData fieldData) {
        return super.lastIndexOf((Object) fieldData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof FieldData) {
            return remove((FieldData) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldDataList(@InterfaceC6399 Collection<FieldData> collection) {
        super(collection);
        C5499.m17103(collection, "elements");
    }

    public /* bridge */ boolean remove(FieldData fieldData) {
        return super.remove((Object) fieldData);
    }

    public final /* synthetic */ FieldDataList findField(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FindField findField = new FindField();
        init.invoke(findField);
        return findField(findField);
    }
}
