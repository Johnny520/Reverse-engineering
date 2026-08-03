package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import org.luckypray.dexkit.query.base.IQuery;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.FieldMatcher;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class FieldMatcherList extends ArrayList<FieldMatcher> implements IQuery {
    public FieldMatcherList() {
    }

    private final FieldMatcherList add(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FieldMatcher r02 = new FieldMatcher();
        r2.invoke(r02);
        add(r02);
        return this;
    }

    public static /* synthetic */ FieldMatcherList addForName$default(FieldMatcherList r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.addForName(r1, r2, r3);
    }

    public static /* synthetic */ FieldMatcherList addForType$default(FieldMatcherList r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.addForType(r1, r2, r3);
    }

    public final FieldMatcherList addForName(String r8) {
        AbstractC0307g.m703e(r8, "name");
        return addForName$default(this, r8, null, false, 6, null);
    }

    public final FieldMatcherList addForType(String r8) {
        AbstractC0307g.m703e(r8, "typeName");
        return addForType$default(this, r8, null, false, 6, null);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof FieldMatcher) == true) goto L7;
        return false;
    L7:
        return contains((FieldMatcher) r2);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object r2) {
        if ((r2 instanceof FieldMatcher) == true) goto L7;
        return -1;
    L7:
        return indexOf((FieldMatcher) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object r2) {
        if ((r2 instanceof FieldMatcher) == true) goto L7;
        return -1;
    L7:
        return lastIndexOf((FieldMatcher) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ FieldMatcher remove(int r1) {
        return removeAt(r1);
    }

    public /* bridge */ FieldMatcher removeAt(int r1) {
        return remove(r1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public FieldMatcherList(int r1) {
        super(r1);
    }

    public final FieldMatcherList addForName(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "name");
        AbstractC0307g.m703e(r9, "matchType");
        return addForName$default(this, r8, r9, false, 4, null);
    }

    public final FieldMatcherList addForType(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "typeName");
        AbstractC0307g.m703e(r9, "matchType");
        return addForType$default(this, r8, r9, false, 4, null);
    }

    public /* bridge */ boolean contains(FieldMatcher r1) {
        return super.contains(r1);
    }

    public /* bridge */ int indexOf(FieldMatcher r1) {
        return super.indexOf(r1);
    }

    public /* bridge */ int lastIndexOf(FieldMatcher r1) {
        return super.lastIndexOf(r1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object r2) {
        if ((r2 instanceof FieldMatcher) == true) goto L7;
        return false;
    L7:
        return remove((FieldMatcher) r2);
    }

    public FieldMatcherList(Collection<FieldMatcher> r2) {
        AbstractC0307g.m703e(r2, "elements");
        super(r2);
    }

    public final FieldMatcherList addForName(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "name");
        AbstractC0307g.m703e(r3, "matchType");
        FieldMatcher r02 = new FieldMatcher();
        r02.name(r2, r3, r4);
        add(r02);
        return this;
    }

    public final FieldMatcherList addForType(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "typeName");
        AbstractC0307g.m703e(r3, "matchType");
        FieldMatcher r02 = new FieldMatcher();
        r02.type(r2, r3, r4);
        add(r02);
        return this;
    }

    public /* bridge */ boolean remove(FieldMatcher r1) {
        return super.remove(r1);
    }

    public final FieldMatcherList addForType(Class<?> r2) {
        AbstractC0307g.m703e(r2, "clazz");
        FieldMatcher r02 = new FieldMatcher();
        r02.type(r2);
        add(r02);
        return this;
    }
}
