package org.luckypray.dexkit.query;

import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC6399;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.QueryComponent;
import org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J&\u0010\u000f\u001a\u00020\u00002\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$0#¢\u0006\u0002\b%¢\u0006\u0004\b\u000f\u0010'¨\u0006("}, d2 = {"Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;", "Lkotlin/collections/ArrayList;", "Lorg/luckypray/dexkit/query/base/QueryComponent;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "", "number", "add", "(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "", "value", "addByte", "(B)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "", "addShort", "(S)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "addInt", "(I)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "", "addLong", "(J)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "", "addFloat", "(F)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "", "addDouble", "(D)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class NumberEncodeValueMatcherList extends ArrayList<NumberEncodeValueMatcher> implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NumberEncodeValueMatcherList() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final NumberEncodeValueMatcherList add(@InterfaceC6399 Number number) {
        C5499.m17103(number, "number");
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

    @InterfaceC6399
    public final NumberEncodeValueMatcherList addByte(byte value) {
        add(NumberEncodeValueMatcher.Companion.createByte(value));
        return this;
    }

    @InterfaceC6399
    public final NumberEncodeValueMatcherList addDouble(double value) {
        add(NumberEncodeValueMatcher.Companion.createDouble(value));
        return this;
    }

    @InterfaceC6399
    public final NumberEncodeValueMatcherList addFloat(float value) {
        add(NumberEncodeValueMatcher.Companion.createFloat(value));
        return this;
    }

    @InterfaceC6399
    public final NumberEncodeValueMatcherList addInt(int value) {
        add(NumberEncodeValueMatcher.Companion.createInt(value));
        return this;
    }

    @InterfaceC6399
    public final NumberEncodeValueMatcherList addLong(long value) {
        add(NumberEncodeValueMatcher.Companion.createLong(value));
        return this;
    }

    @InterfaceC6399
    public final NumberEncodeValueMatcherList addShort(short value) {
        add(NumberEncodeValueMatcher.Companion.createShort(value));
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
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ NumberEncodeValueMatcher remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ NumberEncodeValueMatcher removeAt(int i) {
        return (NumberEncodeValueMatcher) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public NumberEncodeValueMatcherList(int i) {
        super(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ boolean contains(NumberEncodeValueMatcher numberEncodeValueMatcher) {
        return super.contains((Object) numberEncodeValueMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int indexOf(NumberEncodeValueMatcher numberEncodeValueMatcher) {
        return super.indexOf((Object) numberEncodeValueMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int lastIndexOf(NumberEncodeValueMatcher numberEncodeValueMatcher) {
        return super.lastIndexOf((Object) numberEncodeValueMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof NumberEncodeValueMatcher) {
            return remove((NumberEncodeValueMatcher) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberEncodeValueMatcherList(@InterfaceC6399 Collection<NumberEncodeValueMatcher> collection) {
        super(collection);
        C5499.m17103(collection, "elements");
    }

    public /* bridge */ boolean remove(NumberEncodeValueMatcher numberEncodeValueMatcher) {
        return super.remove((Object) numberEncodeValueMatcher);
    }

    public final /* synthetic */ NumberEncodeValueMatcherList add(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        NumberEncodeValueMatcher numberEncodeValueMatcher = new NumberEncodeValueMatcher();
        init.invoke(numberEncodeValueMatcher);
        add(numberEncodeValueMatcher);
        return this;
    }
}
