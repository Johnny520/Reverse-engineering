package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.matchers.C5714;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u000e\u0010\u0014¨\u0006\u0015"}, d2 = {"Lorg/luckypray/dexkit/query/MethodMatcherList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;", "Lkotlin/collections/ArrayList;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "matcher", "match", "(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;)Lorg/luckypray/dexkit/query/MethodMatcherList;", "Lkotlin/Function1;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "init", "add", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lorg/luckypray/dexkit/query/MethodMatcherList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MethodMatcherList extends ArrayList<C5714> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodMatcherList(Collection<C5714> collection) {
        super(collection);
        collection.getClass();
    }

    public final MethodMatcherList add(InterfaceC6558 init) {
        init.getClass();
        C5714 c5714 = new C5714();
        init.invoke(c5714);
        add(c5714);
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C5714) {
            return contains((C5714) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C5714) {
            return indexOf((C5714) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C5714) {
            return lastIndexOf((C5714) obj);
        }
        return -1;
    }

    public final MethodMatcherList match(InterfaceC6558 init) {
        init.getClass();
        C5714 c5714 = new C5714();
        init.invoke(c5714);
        add(c5714);
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C5714) {
            return remove((C5714) obj);
        }
        return false;
    }

    public /* bridge */ C5714 removeAt(int i) {
        return remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public MethodMatcherList(int i) {
        super(i);
    }

    public MethodMatcherList() {
    }

    public /* bridge */ boolean contains(C5714 c5714) {
        return super.contains((Object) c5714);
    }

    public /* bridge */ int indexOf(C5714 c5714) {
        return super.indexOf((Object) c5714);
    }

    public /* bridge */ int lastIndexOf(C5714 c5714) {
        return super.lastIndexOf((Object) c5714);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ C5714 remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(C5714 c5714) {
        return super.remove((Object) c5714);
    }

    public final MethodMatcherList match(C5714 matcher) {
        matcher.getClass();
        add(matcher);
        return this;
    }
}
