package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import org.luckypray.dexkit.query.base.IQuery;
import org.luckypray.dexkit.query.matchers.UsingFieldMatcher;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class UsingFieldMatcherList extends ArrayList<UsingFieldMatcher> implements IQuery {
    public UsingFieldMatcherList() {
    }

    private final UsingFieldMatcherList add(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        UsingFieldMatcher r02 = new UsingFieldMatcher();
        r2.invoke(r02);
        add(r02);
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof UsingFieldMatcher) == true) goto L7;
        return false;
    L7:
        return contains((UsingFieldMatcher) r2);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object r2) {
        if ((r2 instanceof UsingFieldMatcher) == true) goto L7;
        return -1;
    L7:
        return indexOf((UsingFieldMatcher) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object r2) {
        if ((r2 instanceof UsingFieldMatcher) == true) goto L7;
        return -1;
    L7:
        return lastIndexOf((UsingFieldMatcher) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ UsingFieldMatcher remove(int r1) {
        return removeAt(r1);
    }

    public /* bridge */ UsingFieldMatcher removeAt(int r1) {
        return remove(r1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public UsingFieldMatcherList(int r1) {
        super(r1);
    }

    public /* bridge */ boolean contains(UsingFieldMatcher r1) {
        return super.contains(r1);
    }

    public /* bridge */ int indexOf(UsingFieldMatcher r1) {
        return super.indexOf(r1);
    }

    public /* bridge */ int lastIndexOf(UsingFieldMatcher r1) {
        return super.lastIndexOf(r1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object r2) {
        if ((r2 instanceof UsingFieldMatcher) == true) goto L7;
        return false;
    L7:
        return remove((UsingFieldMatcher) r2);
    }

    public UsingFieldMatcherList(Collection<UsingFieldMatcher> r2) {
        AbstractC0307g.m703e(r2, "elements");
        super(r2);
    }

    public /* bridge */ boolean remove(UsingFieldMatcher r1) {
        return super.remove(r1);
    }
}
