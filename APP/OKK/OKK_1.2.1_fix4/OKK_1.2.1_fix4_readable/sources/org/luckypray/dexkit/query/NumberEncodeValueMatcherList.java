package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import org.luckypray.dexkit.query.base.IQuery;
import org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class NumberEncodeValueMatcherList extends ArrayList<NumberEncodeValueMatcher> implements IQuery {
    public NumberEncodeValueMatcherList() {
    }

    public final NumberEncodeValueMatcherList add(Number number) {
        AbstractC0307g.m703e(number, "number");
        if (number instanceof Byte) {
            addByte(number.byteValue());
        } else if (number instanceof Short) {
            addShort(number.shortValue());
        } else if (number instanceof Integer) {
            addInt(number.intValue());
        } else if (number instanceof Long) {
            addLong(number.longValue());
        } else if (number instanceof Float) {
            addFloat(number.floatValue());
        } else if (number instanceof Double) {
            addDouble(number.doubleValue());
        }
        return this;
    }

    public final NumberEncodeValueMatcherList addByte(byte b2) {
        add(NumberEncodeValueMatcher.Companion.createByte(b2));
        return this;
    }

    public final NumberEncodeValueMatcherList addDouble(double d2) {
        add(NumberEncodeValueMatcher.Companion.createDouble(d2));
        return this;
    }

    public final NumberEncodeValueMatcherList addFloat(float f2) {
        add(NumberEncodeValueMatcher.Companion.createFloat(f2));
        return this;
    }

    public final NumberEncodeValueMatcherList addInt(int i2) {
        add(NumberEncodeValueMatcher.Companion.createInt(i2));
        return this;
    }

    public final NumberEncodeValueMatcherList addLong(long j2) {
        add(NumberEncodeValueMatcher.Companion.createLong(j2));
        return this;
    }

    public final NumberEncodeValueMatcherList addShort(short s2) {
        add(NumberEncodeValueMatcher.Companion.createShort(s2));
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof NumberEncodeValueMatcher) {
            return contains((NumberEncodeValueMatcher) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof NumberEncodeValueMatcher) {
            return indexOf((NumberEncodeValueMatcher) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof NumberEncodeValueMatcher) {
            return lastIndexOf((NumberEncodeValueMatcher) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ NumberEncodeValueMatcher remove(int i2) {
        return removeAt(i2);
    }

    public /* bridge */ NumberEncodeValueMatcher removeAt(int i2) {
        return remove(i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public NumberEncodeValueMatcherList(int i2) {
        super(i2);
    }

    public /* bridge */ boolean contains(NumberEncodeValueMatcher numberEncodeValueMatcher) {
        return super.contains((Object) numberEncodeValueMatcher);
    }

    public /* bridge */ int indexOf(NumberEncodeValueMatcher numberEncodeValueMatcher) {
        return super.indexOf((Object) numberEncodeValueMatcher);
    }

    public /* bridge */ int lastIndexOf(NumberEncodeValueMatcher numberEncodeValueMatcher) {
        return super.lastIndexOf((Object) numberEncodeValueMatcher);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof NumberEncodeValueMatcher) {
            return remove((NumberEncodeValueMatcher) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberEncodeValueMatcherList(Collection<NumberEncodeValueMatcher> collection) {
        super(collection);
        AbstractC0307g.m703e(collection, "elements");
    }

    public /* bridge */ boolean remove(NumberEncodeValueMatcher numberEncodeValueMatcher) {
        return super.remove((Object) numberEncodeValueMatcher);
    }

    private final NumberEncodeValueMatcherList add(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        NumberEncodeValueMatcher numberEncodeValueMatcher = new NumberEncodeValueMatcher();
        interfaceC0286l.invoke(numberEncodeValueMatcher);
        add(numberEncodeValueMatcher);
        return this;
    }
}
