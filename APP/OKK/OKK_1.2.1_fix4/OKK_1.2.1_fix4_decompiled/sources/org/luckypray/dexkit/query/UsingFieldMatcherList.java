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

    private final UsingFieldMatcherList add(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        UsingFieldMatcher usingFieldMatcher = new UsingFieldMatcher();
        interfaceC0286l.invoke(usingFieldMatcher);
        add(usingFieldMatcher);
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UsingFieldMatcher) {
            return contains((UsingFieldMatcher) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof UsingFieldMatcher) {
            return indexOf((UsingFieldMatcher) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof UsingFieldMatcher) {
            return lastIndexOf((UsingFieldMatcher) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ UsingFieldMatcher remove(int i2) {
        return removeAt(i2);
    }

    public /* bridge */ UsingFieldMatcher removeAt(int i2) {
        return remove(i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public UsingFieldMatcherList(int i2) {
        super(i2);
    }

    public /* bridge */ boolean contains(UsingFieldMatcher usingFieldMatcher) {
        return super.contains((Object) usingFieldMatcher);
    }

    public /* bridge */ int indexOf(UsingFieldMatcher usingFieldMatcher) {
        return super.indexOf((Object) usingFieldMatcher);
    }

    public /* bridge */ int lastIndexOf(UsingFieldMatcher usingFieldMatcher) {
        return super.lastIndexOf((Object) usingFieldMatcher);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof UsingFieldMatcher) {
            return remove((UsingFieldMatcher) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsingFieldMatcherList(Collection<UsingFieldMatcher> collection) {
        super(collection);
        AbstractC0307g.m703e(collection, "elements");
    }

    public /* bridge */ boolean remove(UsingFieldMatcher usingFieldMatcher) {
        return super.remove((Object) usingFieldMatcher);
    }
}
