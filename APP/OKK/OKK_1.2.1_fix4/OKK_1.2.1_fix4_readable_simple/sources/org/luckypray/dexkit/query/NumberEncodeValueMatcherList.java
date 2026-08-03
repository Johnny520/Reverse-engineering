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

    public final NumberEncodeValueMatcherList add(Number r3) {
        AbstractC0307g.m703e(r3, "number");
        if ((r3 instanceof Byte) == false) goto L6;
        addByte(r3.byteValue());
    L20:
        return this;
    L6:
        if ((r3 instanceof Short) == false) goto L9;
        addShort(r3.shortValue());
        goto L20
    L9:
        if ((r3 instanceof Integer) == false) goto L12;
        addInt(r3.intValue());
        goto L20
    L12:
        if ((r3 instanceof Long) == false) goto L15;
        addLong(r3.longValue());
        goto L20
    L15:
        if ((r3 instanceof Float) == false) goto L18;
        addFloat(r3.floatValue());
        goto L20
    L18:
        if ((r3 instanceof Double) == false) goto L20;
        addDouble(r3.doubleValue());
        goto L20
    }

    public final NumberEncodeValueMatcherList addByte(byte r2) {
        add(NumberEncodeValueMatcher.Companion.createByte(r2));
        return this;
    }

    public final NumberEncodeValueMatcherList addDouble(double r2) {
        add(NumberEncodeValueMatcher.Companion.createDouble(r2));
        return this;
    }

    public final NumberEncodeValueMatcherList addFloat(float r2) {
        add(NumberEncodeValueMatcher.Companion.createFloat(r2));
        return this;
    }

    public final NumberEncodeValueMatcherList addInt(int r2) {
        add(NumberEncodeValueMatcher.Companion.createInt(r2));
        return this;
    }

    public final NumberEncodeValueMatcherList addLong(long r2) {
        add(NumberEncodeValueMatcher.Companion.createLong(r2));
        return this;
    }

    public final NumberEncodeValueMatcherList addShort(short r2) {
        add(NumberEncodeValueMatcher.Companion.createShort(r2));
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof NumberEncodeValueMatcher) == true) goto L7;
        return false;
    L7:
        return contains((NumberEncodeValueMatcher) r2);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object r2) {
        if ((r2 instanceof NumberEncodeValueMatcher) == true) goto L7;
        return -1;
    L7:
        return indexOf((NumberEncodeValueMatcher) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object r2) {
        if ((r2 instanceof NumberEncodeValueMatcher) == true) goto L7;
        return -1;
    L7:
        return lastIndexOf((NumberEncodeValueMatcher) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ NumberEncodeValueMatcher remove(int r1) {
        return removeAt(r1);
    }

    public /* bridge */ NumberEncodeValueMatcher removeAt(int r1) {
        return remove(r1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public NumberEncodeValueMatcherList(int r1) {
        super(r1);
    }

    public /* bridge */ boolean contains(NumberEncodeValueMatcher r1) {
        return super.contains(r1);
    }

    public /* bridge */ int indexOf(NumberEncodeValueMatcher r1) {
        return super.indexOf(r1);
    }

    public /* bridge */ int lastIndexOf(NumberEncodeValueMatcher r1) {
        return super.lastIndexOf(r1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object r2) {
        if ((r2 instanceof NumberEncodeValueMatcher) == true) goto L7;
        return false;
    L7:
        return remove((NumberEncodeValueMatcher) r2);
    }

    public NumberEncodeValueMatcherList(Collection<NumberEncodeValueMatcher> r2) {
        AbstractC0307g.m703e(r2, "elements");
        super(r2);
    }

    public /* bridge */ boolean remove(NumberEncodeValueMatcher r1) {
        return super.remove(r1);
    }

    private final NumberEncodeValueMatcherList add(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        NumberEncodeValueMatcher r02 = new NumberEncodeValueMatcher();
        r2.invoke(r02);
        add(r02);
        return this;
    }
}
