package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.C6539;
import org.luckypray.dexkit.query.matchers.C6546;
import org.luckypray.dexkit.util.AbstractC6561;
import p068.InterfaceC7387;
import p378.C9755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ+\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0013\u001a\u00020\u00002\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015¢\u0006\u0004\b\u0013\u0010\u0017J+\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0019\u0010\u0014J!\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J!\u0010 \u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b \u0010\u001e¨\u0006\""}, m151d2 = {"Lorg/luckypray/dexkit/query/FieldMatcherList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲世兰;", "Lkotlin/collections/ArrayList;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "", "typeName", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "addForType", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/FieldMatcherList;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/FieldMatcherList;", "name", "addForName", "Lkotlin/Function1;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "init", "add", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lorg/luckypray/dexkit/query/FieldMatcherList;", "matcher", "match", "(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲世兰;)Lorg/luckypray/dexkit/query/FieldMatcherList;", "dexkit-android_release"}, m152k = 1, m153mv = {1, 5, 1}, m155xi = 48)
public final class FieldMatcherList extends ArrayList<C6546> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldMatcherList(Collection<C6546> collection) {
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

    public final FieldMatcherList add(InterfaceC7387 init) {
        init.getClass();
        C6546 c6546 = new C6546();
        init.invoke(c6546);
        add(c6546);
        return this;
    }

    public final FieldMatcherList addForName(String name, StringMatchType matchType, boolean ignoreCase) {
        name.getClass();
        matchType.getClass();
        C6546 c6546 = new C6546();
        c6546.f16020 = new C9755(name, matchType, ignoreCase);
        add(c6546);
        return this;
    }

    public final FieldMatcherList addForType(Class<?> clazz) {
        clazz.getClass();
        C6546 c6546 = new C6546();
        C6539 c6539 = new C6539();
        c6539.m11680(AbstractC6561.m11691(clazz), StringMatchType.Equals, false);
        c6546.f16017 = c6539;
        add(c6546);
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C6546) {
            return contains((C6546) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C6546) {
            return indexOf((C6546) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C6546) {
            return lastIndexOf((C6546) obj);
        }
        return -1;
    }

    public final FieldMatcherList match(InterfaceC7387 init) {
        init.getClass();
        C6546 c6546 = new C6546();
        init.invoke(c6546);
        add(c6546);
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C6546) {
            return remove((C6546) obj);
        }
        return false;
    }

    public /* bridge */ C6546 removeAt(int i) {
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

    public /* bridge */ boolean contains(C6546 c6546) {
        return super.contains((Object) c6546);
    }

    public /* bridge */ int indexOf(C6546 c6546) {
        return super.indexOf((Object) c6546);
    }

    public /* bridge */ int lastIndexOf(C6546 c6546) {
        return super.lastIndexOf((Object) c6546);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ C6546 remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(C6546 c6546) {
        return super.remove((Object) c6546);
    }

    public final FieldMatcherList match(C6546 matcher) {
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
        C6546 c6546 = new C6546();
        C6539 c6539 = new C6539();
        c6539.m11680(typeName, matchType, ignoreCase);
        c6546.f16017 = c6539;
        add(c6546);
        return this;
    }

    public final FieldMatcherList addForType(String str) {
        str.getClass();
        return addForType$default(this, str, null, false, 6, null);
    }
}
