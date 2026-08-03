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

    public static /* synthetic */ StringMatcherList add$default(StringMatcherList r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.add(r1, r2, r3);
    }

    public final StringMatcherList add(String r8) {
        AbstractC0307g.m703e(r8, "usingString");
        return add$default(this, r8, null, false, 6, null);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof StringMatcher) == true) goto L7;
        return false;
    L7:
        return contains((StringMatcher) r2);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object r2) {
        if ((r2 instanceof StringMatcher) == true) goto L7;
        return -1;
    L7:
        return indexOf((StringMatcher) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object r2) {
        if ((r2 instanceof StringMatcher) == true) goto L7;
        return -1;
    L7:
        return lastIndexOf((StringMatcher) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ StringMatcher remove(int r1) {
        return removeAt(r1);
    }

    public /* bridge */ StringMatcher removeAt(int r1) {
        return remove(r1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public StringMatcherList(int r1) {
        super(r1);
    }

    public final StringMatcherList add(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "usingString");
        AbstractC0307g.m703e(r9, "matchType");
        return add$default(this, r8, r9, false, 4, null);
    }

    public /* bridge */ boolean contains(StringMatcher r1) {
        return super.contains(r1);
    }

    public /* bridge */ int indexOf(StringMatcher r1) {
        return super.indexOf(r1);
    }

    public /* bridge */ int lastIndexOf(StringMatcher r1) {
        return super.lastIndexOf(r1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object r2) {
        if ((r2 instanceof StringMatcher) == true) goto L7;
        return false;
    L7:
        return remove((StringMatcher) r2);
    }

    public StringMatcherList(Collection<StringMatcher> r2) {
        AbstractC0307g.m703e(r2, "elements");
        super(r2);
    }

    public final StringMatcherList add(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "usingString");
        AbstractC0307g.m703e(r3, "matchType");
        add(new StringMatcher(r2, r3, r4));
        return this;
    }

    public /* bridge */ boolean remove(StringMatcher r1) {
        return super.remove(r1);
    }
}
