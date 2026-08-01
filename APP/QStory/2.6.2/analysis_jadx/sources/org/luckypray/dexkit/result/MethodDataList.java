package org.luckypray.dexkit.result;

import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitBridge;
import p052.InterfaceC6557;
import p368.C8956;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u0003\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lorg/luckypray/dexkit/result/MethodDataList;", "Lorg/luckypray/dexkit/result/BaseDataList;", "Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世兰苏哲;", "findMethod", "(L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世兰苏哲;)Lorg/luckypray/dexkit/result/MethodDataList;", "Lkotlin/Function1;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "init", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lorg/luckypray/dexkit/result/MethodDataList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MethodDataList extends BaseDataList<C5727> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodDataList(Collection<C5727> collection) {
        super(collection);
        collection.getClass();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C5727) {
            return contains((C5727) obj);
        }
        return false;
    }

    public final MethodDataList findMethod(C8956 findMethod) {
        findMethod.getClass();
        if (isEmpty()) {
            return new MethodDataList();
        }
        DexKitBridge dexKitBridge = first().f25148;
        findMethod.f25180 = this;
        return dexKitBridge.m11038(findMethod);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C5727) {
            return indexOf((C5727) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C5727) {
            return lastIndexOf((C5727) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C5727) {
            return remove((C5727) obj);
        }
        return false;
    }

    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ C5727 removeAt(int i) {
        return remove(i);
    }

    public MethodDataList(int i) {
        super(i);
    }

    public MethodDataList() {
    }

    public /* bridge */ boolean contains(C5727 c5727) {
        return super.contains((Object) c5727);
    }

    public /* bridge */ int indexOf(C5727 c5727) {
        return super.indexOf((Object) c5727);
    }

    public /* bridge */ int lastIndexOf(C5727 c5727) {
        return super.lastIndexOf((Object) c5727);
    }

    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ C5727 remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(C5727 c5727) {
        return super.remove((Object) c5727);
    }

    public final MethodDataList findMethod(InterfaceC6557 init) {
        init.getClass();
        C8956 c8956 = new C8956();
        init.invoke(c8956);
        return findMethod(c8956);
    }
}
