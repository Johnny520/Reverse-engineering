package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.luckypray.dexkit.query.base.IQuery;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.StringMatchersGroup;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class StringMatchersGroupList extends ArrayList<StringMatchersGroup> implements IQuery {
    public StringMatchersGroupList() {
    }

    public static /* synthetic */ StringMatchersGroupList add$default(StringMatchersGroupList stringMatchersGroupList, String str, Collection collection, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return stringMatchersGroupList.add(str, collection, stringMatchType, z2);
    }

    public final StringMatchersGroupList add(String str, Collection<String> collection) {
        AbstractC0307g.m703e(str, "groupName");
        AbstractC0307g.m703e(collection, "usingStrings");
        return add$default(this, str, collection, null, false, 12, null);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof StringMatchersGroup) {
            return contains((StringMatchersGroup) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof StringMatchersGroup) {
            return indexOf((StringMatchersGroup) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof StringMatchersGroup) {
            return lastIndexOf((StringMatchersGroup) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ StringMatchersGroup remove(int i2) {
        return removeAt(i2);
    }

    public /* bridge */ StringMatchersGroup removeAt(int i2) {
        return remove(i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public StringMatchersGroupList(int i2) {
        super(i2);
    }

    public final StringMatchersGroupList add(String str, Collection<String> collection, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "groupName");
        AbstractC0307g.m703e(collection, "usingStrings");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return add$default(this, str, collection, stringMatchType, false, 8, null);
    }

    public /* bridge */ boolean contains(StringMatchersGroup stringMatchersGroup) {
        return super.contains((Object) stringMatchersGroup);
    }

    public /* bridge */ int indexOf(StringMatchersGroup stringMatchersGroup) {
        return super.indexOf((Object) stringMatchersGroup);
    }

    public /* bridge */ int lastIndexOf(StringMatchersGroup stringMatchersGroup) {
        return super.lastIndexOf((Object) stringMatchersGroup);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof StringMatchersGroup) {
            return remove((StringMatchersGroup) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringMatchersGroupList(Collection<StringMatchersGroup> collection) {
        super(collection);
        AbstractC0307g.m703e(collection, "elements");
    }

    private final StringMatchersGroupList add(String str, InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(str, "groupName");
        AbstractC0307g.m703e(interfaceC0286l, "init");
        StringMatcherList stringMatcherList = new StringMatcherList();
        interfaceC0286l.invoke(stringMatcherList);
        add(new StringMatchersGroup(str, stringMatcherList));
        return this;
    }

    public /* bridge */ boolean remove(StringMatchersGroup stringMatchersGroup) {
        return super.remove((Object) stringMatchersGroup);
    }

    private final StringMatchersGroupList add(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        StringMatchersGroup stringMatchersGroup = new StringMatchersGroup();
        interfaceC0286l.invoke(stringMatchersGroup);
        add(stringMatchersGroup);
        return this;
    }

    public final StringMatchersGroupList add(String str, Collection<String> collection, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "groupName");
        AbstractC0307g.m703e(collection, "usingStrings");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), stringMatchType, z2));
        }
        add(new StringMatchersGroup(str, arrayList));
        return this;
    }
}
