package org.luckypray.dexkit.result;

import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitBridge;
import p052.InterfaceC6558;
import p366.C8949;
import p366.C8950;
import p366.C8951;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u0003\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\f\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0015J!\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0013\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u001aJ!\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, d2 = {"Lorg/luckypray/dexkit/result/ClassDataList;", "Lorg/luckypray/dexkit/result/BaseDataList;", "Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;", "findClass", "(L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;)Lorg/luckypray/dexkit/result/ClassDataList;", "Lkotlin/Function1;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "init", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lorg/luckypray/dexkit/result/ClassDataList;", "L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世兰苏哲;", "findMethod", "Lorg/luckypray/dexkit/result/MethodDataList;", "(L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世兰苏哲;)Lorg/luckypray/dexkit/result/MethodDataList;", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lorg/luckypray/dexkit/result/MethodDataList;", "L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲兰苏;", "findField", "Lorg/luckypray/dexkit/result/FieldDataList;", "(L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲兰苏;)Lorg/luckypray/dexkit/result/FieldDataList;", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lorg/luckypray/dexkit/result/FieldDataList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ClassDataList extends BaseDataList<C5724> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDataList(Collection<C5724> collection) {
        super(collection);
        collection.getClass();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C5724) {
            return contains((C5724) obj);
        }
        return false;
    }

    public final ClassDataList findClass(C8951 findClass) {
        findClass.getClass();
        if (isEmpty()) {
            return new ClassDataList();
        }
        DexKitBridge dexKitBridge = first().f25144;
        findClass.f25153 = this;
        return dexKitBridge.m11097(findClass);
    }

    public final FieldDataList findField(C8950 findField) {
        findField.getClass();
        if (isEmpty()) {
            return new FieldDataList();
        }
        DexKitBridge dexKitBridge = first().f25144;
        findField.f25151 = this;
        return dexKitBridge.m11096(findField);
    }

    public final MethodDataList findMethod(C8949 findMethod) {
        findMethod.getClass();
        if (isEmpty()) {
            return new MethodDataList();
        }
        DexKitBridge dexKitBridge = first().f25144;
        findMethod.f25147 = this;
        return dexKitBridge.m11095(findMethod);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C5724) {
            return indexOf((C5724) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C5724) {
            return lastIndexOf((C5724) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C5724) {
            return remove((C5724) obj);
        }
        return false;
    }

    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ C5724 removeAt(int i) {
        return remove(i);
    }

    public ClassDataList(int i) {
        super(i);
    }

    public ClassDataList() {
    }

    public /* bridge */ boolean contains(C5724 c5724) {
        return super.contains((Object) c5724);
    }

    public /* bridge */ int indexOf(C5724 c5724) {
        return super.indexOf((Object) c5724);
    }

    public /* bridge */ int lastIndexOf(C5724 c5724) {
        return super.lastIndexOf((Object) c5724);
    }

    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ C5724 remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(C5724 c5724) {
        return super.remove((Object) c5724);
    }

    public final ClassDataList findClass(InterfaceC6558 init) {
        init.getClass();
        C8951 c8951 = new C8951();
        init.invoke(c8951);
        return findClass(c8951);
    }

    public final FieldDataList findField(InterfaceC6558 init) {
        init.getClass();
        C8950 c8950 = new C8950();
        init.invoke(c8950);
        return findField(c8950);
    }

    public final MethodDataList findMethod(InterfaceC6558 init) {
        init.getClass();
        C8949 c8949 = new C8949();
        init.invoke(c8949);
        return findMethod(c8949);
    }
}
