package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC4344;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.C5710;
import p052.InterfaceC6557;
import p366.C8945;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ9\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0004\b\u0014\u0010\u001aJ!\u0010\u0014\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Lorg/luckypray/dexkit/query/StringMatchersGroupList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪哲世苏兰;", "Lkotlin/collections/ArrayList;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "", "groupName", "usingStrings", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "add", "(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/StringMatchersGroupList;", "Lkotlin/Function1;", "Lorg/luckypray/dexkit/query/StringMatcherList;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "init", "(Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lorg/luckypray/dexkit/query/StringMatchersGroupList;", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lorg/luckypray/dexkit/query/StringMatchersGroupList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StringMatchersGroupList extends ArrayList<C5710> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringMatchersGroupList(Collection<C5710> collection) {
        super(collection);
        collection.getClass();
    }

    public static /* synthetic */ StringMatchersGroupList add$default(StringMatchersGroupList stringMatchersGroupList, String str, Collection collection, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return stringMatchersGroupList.add(str, collection, stringMatchType, z);
    }

    public final StringMatchersGroupList add(String groupName, Collection<String> usingStrings, StringMatchType matchType, boolean ignoreCase) {
        groupName.getClass();
        usingStrings.getClass();
        matchType.getClass();
        Collection<String> collection = usingStrings;
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new C8945((String) it.next(), matchType, ignoreCase));
        }
        add(new C5710(groupName, arrayList));
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C5710) {
            return contains((C5710) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C5710) {
            return indexOf((C5710) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C5710) {
            return lastIndexOf((C5710) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C5710) {
            return remove((C5710) obj);
        }
        return false;
    }

    public /* bridge */ C5710 removeAt(int i) {
        return remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public StringMatchersGroupList(int i) {
        super(i);
    }

    public StringMatchersGroupList() {
    }

    public /* bridge */ boolean contains(C5710 c5710) {
        return super.contains((Object) c5710);
    }

    public /* bridge */ int indexOf(C5710 c5710) {
        return super.indexOf((Object) c5710);
    }

    public /* bridge */ int lastIndexOf(C5710 c5710) {
        return super.lastIndexOf((Object) c5710);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ C5710 remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(C5710 c5710) {
        return super.remove((Object) c5710);
    }

    public final StringMatchersGroupList add(String str, Collection<String> collection, StringMatchType stringMatchType) {
        str.getClass();
        collection.getClass();
        stringMatchType.getClass();
        return add$default(this, str, collection, stringMatchType, false, 8, null);
    }

    public final StringMatchersGroupList add(String str, Collection<String> collection) {
        str.getClass();
        collection.getClass();
        return add$default(this, str, collection, null, false, 12, null);
    }

    public final /* synthetic */ StringMatchersGroupList add(String groupName, InterfaceC6557 init) {
        groupName.getClass();
        init.getClass();
        StringMatcherList stringMatcherList = new StringMatcherList();
        init.invoke(stringMatcherList);
        add(new C5710(groupName, stringMatcherList));
        return this;
    }

    public final StringMatchersGroupList add(InterfaceC6557 init) {
        init.getClass();
        C5710 c5710 = new C5710();
        c5710.f15656 = new ArrayList();
        init.invoke(c5710);
        add(c5710);
        return this;
    }
}
