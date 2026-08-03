package org.luckypray.dexkit.result;

import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC6399;
import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u0003\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ&\u0010\f\u001a\u00020\u00002\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0013"}, d2 = {"Lorg/luckypray/dexkit/result/MethodDataList;", "Lorg/luckypray/dexkit/result/BaseDataList;", "Lorg/luckypray/dexkit/result/MethodData;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "Lorg/luckypray/dexkit/query/FindMethod;", "findMethod", "(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/MethodDataList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class MethodDataList extends BaseDataList<MethodData> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MethodDataList() {
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
    @InterfaceC6399
    public final MethodDataList findMethod(@InterfaceC6399 FindMethod findMethod) {
        C5499.m17103(findMethod, "findMethod");
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
    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ MethodData remove(int i) {
        return removeAt(i);
    }

    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ MethodData removeAt(int i) {
        return (MethodData) super.remove(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MethodDataList(int i) {
        super(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ boolean contains(MethodData methodData) {
        return super.contains((Object) methodData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int indexOf(MethodData methodData) {
        return super.indexOf((Object) methodData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int lastIndexOf(MethodData methodData) {
        return super.lastIndexOf((Object) methodData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof MethodData) {
            return remove((MethodData) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodDataList(@InterfaceC6399 Collection<MethodData> collection) {
        super(collection);
        C5499.m17103(collection, "elements");
    }

    public /* bridge */ boolean remove(MethodData methodData) {
        return super.remove((Object) methodData);
    }

    public final /* synthetic */ MethodDataList findMethod(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FindMethod findMethod = new FindMethod();
        init.invoke(findMethod);
        return findMethod(findMethod);
    }
}
