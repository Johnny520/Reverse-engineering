package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import org.luckypray.dexkit.query.base.IQuery;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class StringMatcherList extends ArrayList<StringMatcher> implements IQuery {
    public StringMatcherList() {
    }

    public static /* synthetic */ StringMatcherList add$default(StringMatcherList stringMatcherList, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return stringMatcherList.add(str, stringMatchType, z2);
    }

    public final StringMatcherList add(String str) {
        AbstractC0307g.m703e(str, "usingString");
        return add$default(this, str, null, false, 6, null);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof StringMatcher) {
            return contains((StringMatcher) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof StringMatcher) {
            return indexOf((StringMatcher) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof StringMatcher) {
            return lastIndexOf((StringMatcher) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ StringMatcher remove(int i2) {
        return removeAt(i2);
    }

    public /* bridge */ StringMatcher removeAt(int i2) {
        return remove(i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public StringMatcherList(int i2) {
        super(i2);
    }

    public final StringMatcherList add(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "usingString");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return add$default(this, str, stringMatchType, false, 4, null);
    }

    public /* bridge */ boolean contains(StringMatcher stringMatcher) {
        return super.contains((Object) stringMatcher);
    }

    public /* bridge */ int indexOf(StringMatcher stringMatcher) {
        return super.indexOf((Object) stringMatcher);
    }

    public /* bridge */ int lastIndexOf(StringMatcher stringMatcher) {
        return super.lastIndexOf((Object) stringMatcher);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof StringMatcher) {
            return remove((StringMatcher) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringMatcherList(Collection<StringMatcher> collection) {
        super(collection);
        AbstractC0307g.m703e(collection, "elements");
    }

    public final StringMatcherList add(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "usingString");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        add(new StringMatcher(str, stringMatchType, z2));
        return this;
    }

    public /* bridge */ boolean remove(StringMatcher stringMatcher) {
        return super.remove((Object) stringMatcher);
    }
}
