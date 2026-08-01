package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import org.luckypray.dexkit.query.base.QueryComponent;
import org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class NumberEncodeValueMatcherList extends ArrayList<NumberEncodeValueMatcher> implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberEncodeValueMatcherList(Collection<NumberEncodeValueMatcher> collection) {
        super(collection);
        collection.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NumberEncodeValueMatcherList add(Number number) {
        number.getClass();
        if (number instanceof Byte) {
            addByte(number.byteValue());
            return this;
        }
        if (number instanceof Short) {
            addShort(number.shortValue());
            return this;
        }
        if (number instanceof Integer) {
            addInt(number.intValue());
            return this;
        }
        if (number instanceof Long) {
            addLong(number.longValue());
            return this;
        }
        if (number instanceof Float) {
            addFloat(number.floatValue());
            return this;
        }
        if (number instanceof Double) {
            addDouble(number.doubleValue());
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NumberEncodeValueMatcherList addByte(byte b) {
        add(NumberEncodeValueMatcher.Companion.createByte(b));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NumberEncodeValueMatcherList addDouble(double d) {
        add(NumberEncodeValueMatcher.Companion.createDouble(d));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NumberEncodeValueMatcherList addFloat(float f) {
        add(NumberEncodeValueMatcher.Companion.createFloat(f));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NumberEncodeValueMatcherList addInt(int i) {
        add(NumberEncodeValueMatcher.Companion.createInt(i));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NumberEncodeValueMatcherList addLong(long j) {
        add(NumberEncodeValueMatcher.Companion.createLong(j));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NumberEncodeValueMatcherList addShort(short s) {
        add(NumberEncodeValueMatcher.Companion.createShort(s));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof NumberEncodeValueMatcher) {
            return contains((NumberEncodeValueMatcher) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ int getSize() {
        return super.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof NumberEncodeValueMatcher) {
            return indexOf((NumberEncodeValueMatcher) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof NumberEncodeValueMatcher) {
            return lastIndexOf((NumberEncodeValueMatcher) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof NumberEncodeValueMatcher) {
            return remove((NumberEncodeValueMatcher) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ NumberEncodeValueMatcher removeAt(int i) {
        return remove(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public NumberEncodeValueMatcherList(int i) {
        super(i);
    }

    public NumberEncodeValueMatcherList() {
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

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ NumberEncodeValueMatcher remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(NumberEncodeValueMatcher numberEncodeValueMatcher) {
        return super.remove((Object) numberEncodeValueMatcher);
    }

    public final /* synthetic */ NumberEncodeValueMatcherList add(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        NumberEncodeValueMatcher numberEncodeValueMatcher = new NumberEncodeValueMatcher();
        interfaceC0482u5.invoke(numberEncodeValueMatcher);
        add(numberEncodeValueMatcher);
        return this;
    }
}
