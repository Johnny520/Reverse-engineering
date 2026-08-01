package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.C5708;
import org.luckypray.dexkit.query.matchers.C5715;
import org.luckypray.dexkit.util.AbstractC5730;
import p052.InterfaceC6557;
import p366.C8945;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ+\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0013\u001a\u00020\u00002\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015¢\u0006\u0004\b\u0013\u0010\u0017J+\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0019\u0010\u0014J!\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J!\u0010 \u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b \u0010\u001e¨\u0006\""}, d2 = {"Lorg/luckypray/dexkit/query/FieldMatcherList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲世兰;", "Lkotlin/collections/ArrayList;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "", "typeName", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "addForType", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/FieldMatcherList;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/FieldMatcherList;", "name", "addForName", "Lkotlin/Function1;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "init", "add", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lorg/luckypray/dexkit/query/FieldMatcherList;", "matcher", "match", "(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲世兰;)Lorg/luckypray/dexkit/query/FieldMatcherList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FieldMatcherList extends ArrayList<C5715> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldMatcherList(Collection<C5715> collection) {
        super(collection);
        collection.getClass();
    }

    public static /* synthetic */ FieldMatcherList addForName$default(FieldMatcherList fieldMatcherList, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fieldMatcherList.addForName(str, stringMatchType, z);
    }

    public static /* synthetic */ FieldMatcherList addForType$default(FieldMatcherList fieldMatcherList, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fieldMatcherList.addForType(str, stringMatchType, z);
    }

    public final FieldMatcherList add(InterfaceC6557 init) {
        init.getClass();
        C5715 c5715 = new C5715();
        init.invoke(c5715);
        add(c5715);
        return this;
    }

    public final FieldMatcherList addForName(String name, StringMatchType matchType, boolean ignoreCase) {
        name.getClass();
        matchType.getClass();
        C5715 c5715 = new C5715();
        c5715.f15676 = new C8945(name, matchType, ignoreCase);
        add(c5715);
        return this;
    }

    public final FieldMatcherList addForType(Class<?> clazz) {
        clazz.getClass();
        C5715 c5715 = new C5715();
        C5708 c5708 = new C5708();
        c5708.m11064(AbstractC5730.m11075(clazz), StringMatchType.Equals, false);
        c5715.f15673 = c5708;
        add(c5715);
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C5715) {
            return contains((C5715) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C5715) {
            return indexOf((C5715) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C5715) {
            return lastIndexOf((C5715) obj);
        }
        return -1;
    }

    public final FieldMatcherList match(InterfaceC6557 init) {
        init.getClass();
        C5715 c5715 = new C5715();
        init.invoke(c5715);
        add(c5715);
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C5715) {
            return remove((C5715) obj);
        }
        return false;
    }

    public /* bridge */ C5715 removeAt(int i) {
        return remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public FieldMatcherList(int i) {
        super(i);
    }

    public FieldMatcherList() {
    }

    public /* bridge */ boolean contains(C5715 c5715) {
        return super.contains((Object) c5715);
    }

    public /* bridge */ int indexOf(C5715 c5715) {
        return super.indexOf((Object) c5715);
    }

    public /* bridge */ int lastIndexOf(C5715 c5715) {
        return super.lastIndexOf((Object) c5715);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ C5715 remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(C5715 c5715) {
        return super.remove((Object) c5715);
    }

    public final FieldMatcherList match(C5715 matcher) {
        matcher.getClass();
        add(matcher);
        return this;
    }

    public final FieldMatcherList addForName(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return addForName$default(this, str, stringMatchType, false, 4, null);
    }

    public final FieldMatcherList addForName(String str) {
        str.getClass();
        return addForName$default(this, str, null, false, 6, null);
    }

    public final FieldMatcherList addForType(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return addForType$default(this, str, stringMatchType, false, 4, null);
    }

    public final FieldMatcherList addForType(String typeName, StringMatchType matchType, boolean ignoreCase) {
        typeName.getClass();
        matchType.getClass();
        C5715 c5715 = new C5715();
        C5708 c5708 = new C5708();
        c5708.m11064(typeName, matchType, ignoreCase);
        c5715.f15673 = c5708;
        add(c5715);
        return this;
    }

    public final FieldMatcherList addForType(String str) {
        str.getClass();
        return addForType$default(this, str, null, false, 6, null);
    }
}
