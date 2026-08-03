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

    public static /* synthetic */ StringMatchersGroupList add$default(StringMatchersGroupList r02, String r1, Collection r2, StringMatchType r3, boolean r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = StringMatchType.Contains;
    L6:
        if ((r5 & 8) == 0) goto L9;
        r4 = false;
    L9:
        return r02.add(r1, r2, r3, r4);
    }

    public final StringMatchersGroupList add(String r9, Collection<String> r10) {
        AbstractC0307g.m703e(r9, "groupName");
        AbstractC0307g.m703e(r10, "usingStrings");
        return add$default(this, r9, r10, null, false, 12, null);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof StringMatchersGroup) == true) goto L7;
        return false;
    L7:
        return contains((StringMatchersGroup) r2);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object r2) {
        if ((r2 instanceof StringMatchersGroup) == true) goto L7;
        return -1;
    L7:
        return indexOf((StringMatchersGroup) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object r2) {
        if ((r2 instanceof StringMatchersGroup) == true) goto L7;
        return -1;
    L7:
        return lastIndexOf((StringMatchersGroup) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ StringMatchersGroup remove(int r1) {
        return removeAt(r1);
    }

    public /* bridge */ StringMatchersGroup removeAt(int r1) {
        return remove(r1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public StringMatchersGroupList(int r1) {
        super(r1);
    }

    public final StringMatchersGroupList add(String r9, Collection<String> r10, StringMatchType r11) {
        AbstractC0307g.m703e(r9, "groupName");
        AbstractC0307g.m703e(r10, "usingStrings");
        AbstractC0307g.m703e(r11, "matchType");
        return add$default(this, r9, r10, r11, false, 8, null);
    }

    public /* bridge */ boolean contains(StringMatchersGroup r1) {
        return super.contains(r1);
    }

    public /* bridge */ int indexOf(StringMatchersGroup r1) {
        return super.indexOf(r1);
    }

    public /* bridge */ int lastIndexOf(StringMatchersGroup r1) {
        return super.lastIndexOf(r1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object r2) {
        if ((r2 instanceof StringMatchersGroup) == true) goto L7;
        return false;
    L7:
        return remove((StringMatchersGroup) r2);
    }

    public StringMatchersGroupList(Collection<StringMatchersGroup> r2) {
        AbstractC0307g.m703e(r2, "elements");
        super(r2);
    }

    private final StringMatchersGroupList add(String r3, InterfaceC0286l r4) {
        AbstractC0307g.m703e(r3, "groupName");
        AbstractC0307g.m703e(r4, "init");
        StringMatcherList r1 = new StringMatcherList();
        r4.invoke(r1);
        add(new StringMatchersGroup(r3, r1));
        return this;
    }

    public /* bridge */ boolean remove(StringMatchersGroup r1) {
        return super.remove(r1);
    }

    private final StringMatchersGroupList add(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        StringMatchersGroup r02 = new StringMatchersGroup();
        r2.invoke(r02);
        add(r02);
        return this;
    }

    public final StringMatchersGroupList add(String r4, Collection<String> r5, StringMatchType r6, boolean r7) {
        AbstractC0307g.m703e(r4, "groupName");
        AbstractC0307g.m703e(r5, "usingStrings");
        AbstractC0307g.m703e(r6, "matchType");
        ArrayList r02 = new ArrayList(AbstractC0183n.m559k0(r5, 10));
        Iterator<T> r52 = r5.iterator();
    L4:
        if (r52.hasNext() == false) goto L6;
        r02.add(new StringMatcher((String) r52.next(), r6, r7));
        goto L4
    L6:
        add(new StringMatchersGroup(r4, r02));
        return this;
    }
}
