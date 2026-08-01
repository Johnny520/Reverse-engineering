package org.luckypray.dexkit.result;

import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitBridge;
import p068.InterfaceC7387;
import p382.C9778;
import p382.C9779;
import p382.C9780;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u0003\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\f\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0015J!\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0013\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u001aJ!\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, m151d2 = {"Lorg/luckypray/dexkit/result/ClassDataList;", "Lorg/luckypray/dexkit/result/BaseDataList;", "Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;", "findClass", "(L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;)Lorg/luckypray/dexkit/result/ClassDataList;", "Lkotlin/Function1;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "init", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lorg/luckypray/dexkit/result/ClassDataList;", "L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世兰苏哲;", "findMethod", "Lorg/luckypray/dexkit/result/MethodDataList;", "(L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世兰苏哲;)Lorg/luckypray/dexkit/result/MethodDataList;", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lorg/luckypray/dexkit/result/MethodDataList;", "L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲兰苏;", "findField", "Lorg/luckypray/dexkit/result/FieldDataList;", "(L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲兰苏;)Lorg/luckypray/dexkit/result/FieldDataList;", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lorg/luckypray/dexkit/result/FieldDataList;", "dexkit-android_release"}, m152k = 1, m153mv = {1, 5, 1}, m155xi = 48)
public final class ClassDataList extends BaseDataList<C6554> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDataList(Collection<C6554> collection) {
        super(collection);
        collection.getClass();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C6554) {
            return contains((C6554) obj);
        }
        return false;
    }

    public final ClassDataList findClass(C9780 findClass) {
        findClass.getClass();
        if (isEmpty()) {
            return new ClassDataList();
        }
        DexKitBridge dexKitBridge = first().f25489;
        findClass.f25498 = this;
        return dexKitBridge.m11656(findClass);
    }

    public final FieldDataList findField(C9779 findField) {
        findField.getClass();
        if (isEmpty()) {
            return new FieldDataList();
        }
        DexKitBridge dexKitBridge = first().f25489;
        findField.f25496 = this;
        return dexKitBridge.m11655(findField);
    }

    public final MethodDataList findMethod(C9778 findMethod) {
        findMethod.getClass();
        if (isEmpty()) {
            return new MethodDataList();
        }
        DexKitBridge dexKitBridge = first().f25489;
        findMethod.f25492 = this;
        return dexKitBridge.m11654(findMethod);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C6554) {
            return indexOf((C6554) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C6554) {
            return lastIndexOf((C6554) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C6554) {
            return remove((C6554) obj);
        }
        return false;
    }

    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ C6554 removeAt(int i) {
        return remove(i);
    }

    public ClassDataList(int i) {
        super(i);
    }

    public ClassDataList() {
    }

    public /* bridge */ boolean contains(C6554 c6554) {
        return super.contains((Object) c6554);
    }

    public /* bridge */ int indexOf(C6554 c6554) {
        return super.indexOf((Object) c6554);
    }

    public /* bridge */ int lastIndexOf(C6554 c6554) {
        return super.lastIndexOf((Object) c6554);
    }

    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ C6554 remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(C6554 c6554) {
        return super.remove((Object) c6554);
    }

    public final ClassDataList findClass(InterfaceC7387 init) {
        init.getClass();
        C9780 c9780 = new C9780();
        init.invoke(c9780);
        return findClass(c9780);
    }

    public final FieldDataList findField(InterfaceC7387 init) {
        init.getClass();
        C9779 c9779 = new C9779();
        init.invoke(c9779);
        return findField(c9779);
    }

    public final MethodDataList findMethod(InterfaceC7387 init) {
        init.getClass();
        C9778 c9778 = new C9778();
        init.invoke(c9778);
        return findMethod(c9778);
    }
}
