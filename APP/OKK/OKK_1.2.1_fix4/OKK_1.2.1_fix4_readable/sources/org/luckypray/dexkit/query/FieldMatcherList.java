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

    private final FieldMatcherList add(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0286l.invoke(fieldMatcher);
        add(fieldMatcher);
        return this;
    }

    public static /* synthetic */ FieldMatcherList addForName$default(FieldMatcherList fieldMatcherList, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return fieldMatcherList.addForName(str, stringMatchType, z2);
    }

    public static /* synthetic */ FieldMatcherList addForType$default(FieldMatcherList fieldMatcherList, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return fieldMatcherList.addForType(str, stringMatchType, z2);
    }

    public final FieldMatcherList addForName(String str) {
        AbstractC0307g.m703e(str, "name");
        return addForName$default(this, str, null, false, 6, null);
    }

    public final FieldMatcherList addForType(String str) {
        AbstractC0307g.m703e(str, "typeName");
        return addForType$default(this, str, null, false, 6, null);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof FieldMatcher) {
            return contains((FieldMatcher) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof FieldMatcher) {
            return indexOf((FieldMatcher) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof FieldMatcher) {
            return lastIndexOf((FieldMatcher) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ FieldMatcher remove(int i2) {
        return removeAt(i2);
    }

    public /* bridge */ FieldMatcher removeAt(int i2) {
        return remove(i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public FieldMatcherList(int i2) {
        super(i2);
    }

    public final FieldMatcherList addForName(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "name");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return addForName$default(this, str, stringMatchType, false, 4, null);
    }

    public final FieldMatcherList addForType(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "typeName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return addForType$default(this, str, stringMatchType, false, 4, null);
    }

    public /* bridge */ boolean contains(FieldMatcher fieldMatcher) {
        return super.contains((Object) fieldMatcher);
    }

    public /* bridge */ int indexOf(FieldMatcher fieldMatcher) {
        return super.indexOf((Object) fieldMatcher);
    }

    public /* bridge */ int lastIndexOf(FieldMatcher fieldMatcher) {
        return super.lastIndexOf((Object) fieldMatcher);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof FieldMatcher) {
            return remove((FieldMatcher) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldMatcherList(Collection<FieldMatcher> collection) {
        super(collection);
        AbstractC0307g.m703e(collection, "elements");
    }

    public final FieldMatcherList addForName(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "name");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        FieldMatcher fieldMatcher = new FieldMatcher();
        fieldMatcher.name(str, stringMatchType, z2);
        add(fieldMatcher);
        return this;
    }

    public final FieldMatcherList addForType(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "typeName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        FieldMatcher fieldMatcher = new FieldMatcher();
        fieldMatcher.type(str, stringMatchType, z2);
        add(fieldMatcher);
        return this;
    }

    public /* bridge */ boolean remove(FieldMatcher fieldMatcher) {
        return super.remove((Object) fieldMatcher);
    }

    public final FieldMatcherList addForType(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        FieldMatcher fieldMatcher = new FieldMatcher();
        fieldMatcher.type(cls);
        add(fieldMatcher);
        return this;
    }
}
