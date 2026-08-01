package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.enums.NumberEncodeValueType;
import org.luckypray.dexkit.query.matchers.C6534;
import org.luckypray.dexkit.query.matchers.C6535;
import org.luckypray.dexkit.query.matchers.C6536;
import org.luckypray.dexkit.query.matchers.C6537;
import org.luckypray.dexkit.query.matchers.C6542;
import org.luckypray.dexkit.query.matchers.C6543;
import p068.InterfaceC7387;
import p378.C9756;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J!\u0010\u000f\u001a\u00020\u00002\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b\u000f\u0010&¨\u0006'"}, m151d2 = {"Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "Ljava/util/ArrayList;", "L飘花落叶言苏子兰世哲楪/飘花落叶言子楪世哲苏兰;", "Lkotlin/collections/ArrayList;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "", "number", "add", "(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "", "value", "addByte", "(B)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "", "addShort", "(S)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "addInt", "(I)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "", "addLong", "(J)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "", "addFloat", "(F)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "", "addDouble", "(D)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "Lkotlin/Function1;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "init", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "dexkit-android_release"}, m152k = 1, m153mv = {1, 5, 1}, m155xi = 48)
public final class NumberEncodeValueMatcherList extends ArrayList<C9756> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberEncodeValueMatcherList(Collection<C9756> collection) {
        super(collection);
        collection.getClass();
    }

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

    public final NumberEncodeValueMatcherList addByte(byte value) {
        C9756 c9756 = new C9756();
        c9756.f25482 = new C6537(value);
        c9756.f25481 = NumberEncodeValueType.ByteValue;
        add(c9756);
        return this;
    }

    public final NumberEncodeValueMatcherList addDouble(double value) {
        C9756 c9756 = new C9756();
        c9756.f25482 = new C6536(value);
        c9756.f25481 = NumberEncodeValueType.DoubleValue;
        add(c9756);
        return this;
    }

    public final NumberEncodeValueMatcherList addFloat(float value) {
        C9756 c9756 = new C9756();
        c9756.f25482 = new C6535(value);
        c9756.f25481 = NumberEncodeValueType.FloatValue;
        add(c9756);
        return this;
    }

    public final NumberEncodeValueMatcherList addInt(int value) {
        C9756 c9756 = new C9756();
        c9756.f25482 = new C6534(value);
        c9756.f25481 = NumberEncodeValueType.IntValue;
        add(c9756);
        return this;
    }

    public final NumberEncodeValueMatcherList addLong(long value) {
        C9756 c9756 = new C9756();
        c9756.f25482 = new C6543(value);
        c9756.f25481 = NumberEncodeValueType.LongValue;
        add(c9756);
        return this;
    }

    public final NumberEncodeValueMatcherList addShort(short value) {
        C9756 c9756 = new C9756();
        c9756.f25482 = new C6542(value);
        c9756.f25481 = NumberEncodeValueType.ShortValue;
        add(c9756);
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C9756) {
            return contains((C9756) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C9756) {
            return indexOf((C9756) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C9756) {
            return lastIndexOf((C9756) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C9756) {
            return remove((C9756) obj);
        }
        return false;
    }

    public /* bridge */ C9756 removeAt(int i) {
        return remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public NumberEncodeValueMatcherList(int i) {
        super(i);
    }

    public NumberEncodeValueMatcherList() {
    }

    public /* bridge */ boolean contains(C9756 c9756) {
        return super.contains((Object) c9756);
    }

    public /* bridge */ int indexOf(C9756 c9756) {
        return super.indexOf((Object) c9756);
    }

    public /* bridge */ int lastIndexOf(C9756 c9756) {
        return super.lastIndexOf((Object) c9756);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ C9756 remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(C9756 c9756) {
        return super.remove((Object) c9756);
    }

    public final NumberEncodeValueMatcherList add(InterfaceC7387 init) {
        init.getClass();
        C9756 c9756 = new C9756();
        init.invoke(c9756);
        add(c9756);
        return this;
    }
}
