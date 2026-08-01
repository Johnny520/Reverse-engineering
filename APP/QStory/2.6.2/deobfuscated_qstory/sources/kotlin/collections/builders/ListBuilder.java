package kotlin.collections.builders;

import androidx.collection.C0276;
import androidx.compose.runtime.snapshots.C1276;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractC4329;
import kotlin.collections.AbstractC4346;
import kotlin.collections.AbstractC4347;
import kotlin.collections.C4332;
import kotlin.jvm.internal.AbstractC4384;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.description.method.MethodDescription;
import p316.C8675;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b&\b\u0000\u0018\u0000 b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003cdeB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010!J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010\"\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010%J\u001d\u0010(\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010)J%\u0010(\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010*J\u000f\u0010+\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0017¢\u0006\u0004\b-\u0010\u0014J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010#J\u001d\u0010/\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b/\u0010)J\u001d\u00100\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b0\u0010)J%\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00104J)\u00108\u001a\b\u0012\u0004\u0012\u00028\u000106\"\u0004\b\u0001\u001052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000106H\u0016¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:06H\u0016¢\u0006\u0004\b8\u0010;J\u001a\u0010=\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010:H\u0096\u0002¢\u0006\u0004\b=\u0010#J\u000f\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020:H\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020$H\u0002¢\u0006\u0004\bE\u0010,J\u000f\u0010F\u001a\u00020$H\u0002¢\u0006\u0004\bF\u0010,J\u0017\u0010H\u001a\u00020$2\u0006\u0010G\u001a\u00020\bH\u0002¢\u0006\u0004\bH\u0010\u000bJ\u0017\u0010J\u001a\u00020$2\u0006\u0010I\u001a\u00020\bH\u0002¢\u0006\u0004\bJ\u0010\u000bJ\u001b\u0010K\u001a\u00020\u000f2\n\u0010<\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\u00020$2\u0006\u0010M\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0002¢\u0006\u0004\bN\u0010OJ\u001f\u0010P\u001a\u00020$2\u0006\u0010M\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\bP\u0010%J-\u0010Q\u001a\u00020$2\u0006\u0010M\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010G\u001a\u00020\bH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00028\u00002\u0006\u0010M\u001a\u00020\bH\u0002¢\u0006\u0004\bS\u0010\u0014J\u001f\u0010V\u001a\u00020$2\u0006\u0010T\u001a\u00020\b2\u0006\u0010U\u001a\u00020\bH\u0002¢\u0006\u0004\bV\u0010OJ5\u0010X\u001a\u00020\b2\u0006\u0010T\u001a\u00020\b2\u0006\u0010U\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010W\u001a\u00020\u000fH\u0002¢\u0006\u0004\bX\u0010YR\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u0000068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010?¨\u0006f"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/飘花落叶言子楪苏世兰哲;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "initialCapacity", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V", "", "build", "()Ljava/util/List;", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "Lkotlin/飘花落叶言子楪兰苏哲世;", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "writeReplace", "()Ljava/lang/Object;", "registerModification", "checkIsMutable", "n", "ensureExtraCapacity", "minCapacity", "ensureCapacityInternal", "contentEquals", "(Ljava/util/List;)Z", "i", "insertAtInternal", "(II)V", "addAtInternal", "addAllInternal", "(ILjava/util/Collection;I)V", "removeAtInternal", "rangeOffset", "rangeLength", "removeRangeInternal", "retain", "retainOrRemoveAllInternal", "(IILjava/util/Collection;Z)I", "backing", "[Ljava/lang/Object;", "length", "I", "isReadOnly", "Z", "getSize", "size", "Companion", "kotlin/collections/builders/飘花落叶言子楪世苏兰哲", "androidx/compose/runtime/snapshots/飘花落叶言子楪兰哲苏世", "BuilderSubList", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ListBuilder<E> extends AbstractC4347 implements List<E>, RandomAccess, Serializable {
    private static final C4316 Companion = new C4316();
    private static final ListBuilder Empty;
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        Empty = listBuilder;
    }

    public ListBuilder(int i) {
        if (i >= 0) {
            this.backing = (E[]) new Object[i];
        } else {
            C5919.m11249("capacity must be non-negative.");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAllInternal(int i, Collection<? extends E> elements, int n) {
        registerModification();
        insertAtInternal(i, n);
        Iterator<? extends E> it = elements.iterator();
        for (int i2 = 0; i2 < n; i2++) {
            this.backing[i + i2] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAtInternal(int i, E element) {
        registerModification();
        insertAtInternal(i, 1);
        this.backing[i] = element;
    }

    private final void checkIsMutable() {
        if (this.isReadOnly) {
            C5553.m10825();
        }
    }

    private final boolean contentEquals(List<?> other) {
        E[] eArr = this.backing;
        int i = this.length;
        if (i == other.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (AbstractC4394.m8917(eArr[i2], other.get(i2))) {
                }
            }
            return true;
        }
        return false;
    }

    private final void ensureCapacityInternal(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (minCapacity > eArr.length) {
            C4332 c4332 = AbstractC4329.Companion;
            int length = eArr.length;
            c4332.getClass();
            int iM8771 = C4332.m8771(length, minCapacity);
            E[] eArr2 = this.backing;
            eArr2.getClass();
            this.backing = (E[]) Arrays.copyOf(eArr2, iM8771);
        }
    }

    private final void ensureExtraCapacity(int n) {
        ensureCapacityInternal(this.length + n);
    }

    private final void insertAtInternal(int i, int n) {
        ensureExtraCapacity(n);
        E[] eArr = this.backing;
        AbstractC4346.m8839(i + n, i, eArr, this.length, eArr);
        this.length += n;
    }

    private final void registerModification() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E removeAtInternal(int i) {
        registerModification();
        E[] eArr = this.backing;
        E e = eArr[i];
        AbstractC4346.m8839(i, i + 1, eArr, this.length, eArr);
        E[] eArr2 = this.backing;
        int i2 = this.length - 1;
        eArr2.getClass();
        eArr2[i2] = null;
        this.length--;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeRangeInternal(int rangeOffset, int rangeLength) {
        if (rangeLength > 0) {
            registerModification();
        }
        E[] eArr = this.backing;
        AbstractC4346.m8839(rangeOffset, rangeOffset + rangeLength, eArr, this.length, eArr);
        E[] eArr2 = this.backing;
        int i = this.length;
        C8675.m14344(eArr2, i - rangeLength, i);
        this.length -= rangeLength;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int retainOrRemoveAllInternal(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
        E[] eArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            eArr = this.backing;
            if (i >= rangeLength) {
                break;
            }
            int i3 = rangeOffset + i;
            if (elements.contains(eArr[i3]) == retain) {
                E[] eArr2 = this.backing;
                i++;
                eArr2[i2 + rangeOffset] = eArr2[i3];
                i2++;
            } else {
                i++;
            }
        }
        int i4 = rangeLength - i2;
        AbstractC4346.m8839(rangeOffset + i2, rangeLength + rangeOffset, eArr, this.length, eArr);
        E[] eArr3 = this.backing;
        int i5 = this.length;
        C8675.m14344(eArr3, i5 - i4, i5);
        if (i4 > 0) {
            registerModification();
        }
        this.length -= i4;
        return i4;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        checkIsMutable();
        C4332 c4332 = AbstractC4329.Companion;
        int i = this.length;
        c4332.getClass();
        C4332.m8773(index, i);
        addAtInternal(index, element);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        elements.getClass();
        checkIsMutable();
        C4332 c4332 = AbstractC4329.Companion;
        int i = this.length;
        c4332.getClass();
        C4332.m8773(index, i);
        int size = elements.size();
        addAllInternal(index, elements, size);
        return size > 0;
    }

    public final List<E> build() {
        checkIsMutable();
        this.isReadOnly = true;
        return this.length > 0 ? this : Empty;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        checkIsMutable();
        removeRangeInternal(0, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof List) && contentEquals((List) other);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        C4332 c4332 = AbstractC4329.Companion;
        int i = this.length;
        c4332.getClass();
        C4332.m8774(index, i);
        return this.backing[index];
    }

    @Override // kotlin.collections.AbstractC4347
    /* JADX INFO: renamed from: getSize, reason: from getter */
    public int getLength() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        E[] eArr = this.backing;
        int i = this.length;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            E e = eArr[i2];
            iHashCode = (iHashCode * 31) + (e != null ? e.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        for (int i = 0; i < this.length; i++) {
            if (AbstractC4394.m8917(this.backing[i], element)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (AbstractC4394.m8917(this.backing[i], element)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        C4332 c4332 = AbstractC4329.Companion;
        int i = this.length;
        c4332.getClass();
        C4332.m8773(index, i);
        return new C1276(this, index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        checkIsMutable();
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            removeAt(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> elements) {
        elements.getClass();
        checkIsMutable();
        return retainOrRemoveAllInternal(0, this.length, elements, false) > 0;
    }

    @Override // kotlin.collections.AbstractC4347
    public E removeAt(int index) {
        checkIsMutable();
        C4332 c4332 = AbstractC4329.Companion;
        int i = this.length;
        c4332.getClass();
        C4332.m8774(index, i);
        return removeAtInternal(index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> elements) {
        elements.getClass();
        checkIsMutable();
        return retainOrRemoveAllInternal(0, this.length, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        checkIsMutable();
        C4332 c4332 = AbstractC4329.Companion;
        int i = this.length;
        c4332.getClass();
        C4332.m8774(index, i);
        E[] eArr = this.backing;
        E e = eArr[index];
        eArr[index] = element;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int fromIndex, int toIndex) {
        C4332 c4332 = AbstractC4329.Companion;
        int i = this.length;
        c4332.getClass();
        C4332.m8772(fromIndex, toIndex, i);
        return new BuilderSubList(this.backing, fromIndex, toIndex - fromIndex, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        array.getClass();
        int length = array.length;
        int i = this.length;
        E[] eArr = this.backing;
        if (length < i) {
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, 0, i, array.getClass());
            tArr.getClass();
            return tArr;
        }
        AbstractC4346.m8839(0, 0, eArr, i, array);
        int i2 = this.length;
        if (i2 < array.length) {
            array[i2] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return C8675.m14353(this.backing, 0, this.length, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public /* synthetic */ ListBuilder(int i, int i2, AbstractC4384 abstractC4384) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        checkIsMutable();
        addAtInternal(this.length, element);
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0018\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001eBC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010%\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010(J\u001d\u0010+\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010,J%\u0010+\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010-J\u000f\u0010.\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0017¢\u0006\u0004\b0\u0010\u0017J\u0017\u00101\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b1\u0010&J\u001d\u00102\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b2\u0010,J\u001d\u00103\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b3\u0010,J%\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J)\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0002\u001082\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\bH\u0016¢\u0006\u0004\b:\u0010=J\u001a\u0010?\u001a\u00020\u00122\b\u0010>\u001a\u0004\u0018\u00010<H\u0096\u0002¢\u0006\u0004\b?\u0010&J\u000f\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020<H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020'2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020'H\u0002¢\u0006\u0004\bK\u0010/J\u000f\u0010L\u001a\u00020'H\u0002¢\u0006\u0004\bL\u0010/J\u000f\u0010M\u001a\u00020'H\u0002¢\u0006\u0004\bM\u0010/J\u001b\u0010O\u001a\u00020\u00122\n\u0010>\u001a\u0006\u0012\u0002\b\u00030NH\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020'2\u0006\u0010Q\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0002¢\u0006\u0004\bR\u0010(J-\u0010T\u001a\u00020'2\u0006\u0010Q\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010S\u001a\u00020\nH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00028\u00012\u0006\u0010Q\u001a\u00020\nH\u0002¢\u0006\u0004\bV\u0010\u0017J\u001f\u0010Y\u001a\u00020'2\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\nH\u0002¢\u0006\u0004\bY\u0010ZJ5\u0010\\\u001a\u00020\n2\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010[\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\\\u0010]R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010^R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010_R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010_R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010`R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010aR\u0014\u0010c\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010AR\u0014\u0010d\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010\u0014¨\u0006f"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/飘花落叶言子楪苏世兰哲;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "backing", "", "offset", "length", "parent", "Lkotlin/collections/builders/ListBuilder;", "root", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "([Ljava/lang/Object;IILkotlin/collections/builders/ListBuilder$BuilderSubList;Lkotlin/collections/builders/ListBuilder;)V", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "Lkotlin/飘花落叶言子楪兰苏哲世;", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "readObject", "(Ljava/io/ObjectInputStream;)V", "registerModification", "checkForComodification", "checkIsMutable", "", "contentEquals", "(Ljava/util/List;)Z", "i", "addAtInternal", "n", "addAllInternal", "(ILjava/util/Collection;I)V", "removeAtInternal", "rangeOffset", "rangeLength", "removeRangeInternal", "(II)V", "retain", "retainOrRemoveAllInternal", "(IILjava/util/Collection;Z)I", "[Ljava/lang/Object;", "I", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "Lkotlin/collections/builders/ListBuilder;", "getSize", "size", "isReadOnly", "kotlin/collections/builders/飘花落叶言子楪世苏哲兰", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BuilderSubList<E> extends AbstractC4347 implements List<E>, RandomAccess, Serializable {
        private E[] backing;
        private int length;
        private final int offset;
        private final BuilderSubList<E> parent;
        private final ListBuilder<E> root;

        public BuilderSubList(E[] eArr, int i, int i2, BuilderSubList<E> builderSubList, ListBuilder<E> listBuilder) {
            eArr.getClass();
            listBuilder.getClass();
            this.backing = eArr;
            this.offset = i;
            this.length = i2;
            this.parent = builderSubList;
            this.root = listBuilder;
            ((AbstractList) this).modCount = ((AbstractList) listBuilder).modCount;
        }

        private final void addAllInternal(int i, Collection<? extends E> elements, int n) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.addAllInternal(i, elements, n);
            } else {
                this.root.addAllInternal(i, elements, n);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += n;
        }

        private final void addAtInternal(int i, E element) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.addAtInternal(i, element);
            } else {
                this.root.addAtInternal(i, element);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        private final void checkForComodification() {
            if (((AbstractList) this.root).modCount == ((AbstractList) this).modCount) {
                return;
            }
            C0276.m839();
        }

        private final void checkIsMutable() {
            if (isReadOnly()) {
                C5553.m10825();
            }
        }

        private final boolean contentEquals(List<?> other) {
            E[] eArr = this.backing;
            int i = this.offset;
            int i2 = this.length;
            if (i2 == other.size()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (AbstractC4394.m8917(eArr[i + i3], other.get(i3))) {
                    }
                }
                return true;
            }
            return false;
        }

        private final boolean isReadOnly() {
            return ((ListBuilder) this.root).isReadOnly;
        }

        private final void readObject(ObjectInputStream input) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final void registerModification() {
            ((AbstractList) this).modCount++;
        }

        private final E removeAtInternal(int i) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            this.length--;
            return builderSubList != null ? builderSubList.removeAtInternal(i) : (E) this.root.removeAtInternal(i);
        }

        private final void removeRangeInternal(int rangeOffset, int rangeLength) {
            if (rangeLength > 0) {
                registerModification();
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.removeRangeInternal(rangeOffset, rangeLength);
            } else {
                this.root.removeRangeInternal(rangeOffset, rangeLength);
            }
            this.length -= rangeLength;
        }

        private final int retainOrRemoveAllInternal(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
            BuilderSubList<E> builderSubList = this.parent;
            int iRetainOrRemoveAllInternal = builderSubList != null ? builderSubList.retainOrRemoveAllInternal(rangeOffset, rangeLength, elements, retain) : this.root.retainOrRemoveAllInternal(rangeOffset, rangeLength, elements, retain);
            if (iRetainOrRemoveAllInternal > 0) {
                registerModification();
            }
            this.length -= iRetainOrRemoveAllInternal;
            return iRetainOrRemoveAllInternal;
        }

        private final Object writeReplace() throws NotSerializableException {
            if (isReadOnly()) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, E element) {
            checkIsMutable();
            checkForComodification();
            C4332 c4332 = AbstractC4329.Companion;
            int i = this.length;
            c4332.getClass();
            C4332.m8773(index, i);
            addAtInternal(this.offset + index, element);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, Collection<? extends E> elements) {
            elements.getClass();
            checkIsMutable();
            checkForComodification();
            C4332 c4332 = AbstractC4329.Companion;
            int i = this.length;
            c4332.getClass();
            C4332.m8773(index, i);
            int size = elements.size();
            addAllInternal(this.offset + index, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            checkIsMutable();
            checkForComodification();
            removeRangeInternal(this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object other) {
            checkForComodification();
            if (other != this) {
                return (other instanceof List) && contentEquals((List) other);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int index) {
            checkForComodification();
            C4332 c4332 = AbstractC4329.Companion;
            int i = this.length;
            c4332.getClass();
            C4332.m8774(index, i);
            return this.backing[this.offset + index];
        }

        @Override // kotlin.collections.AbstractC4347
        /* JADX INFO: renamed from: getSize */
        public int getLength() {
            checkForComodification();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            checkForComodification();
            E[] eArr = this.backing;
            int i = this.offset;
            int i2 = this.length;
            int iHashCode = 1;
            for (int i3 = 0; i3 < i2; i3++) {
                E e = eArr[i + i3];
                iHashCode = (iHashCode * 31) + (e != null ? e.hashCode() : 0);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object element) {
            checkForComodification();
            for (int i = 0; i < this.length; i++) {
                if (AbstractC4394.m8917(this.backing[this.offset + i], element)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            checkForComodification();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object element) {
            checkForComodification();
            for (int i = this.length - 1; i >= 0; i--) {
                if (AbstractC4394.m8917(this.backing[this.offset + i], element)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int index) {
            checkForComodification();
            C4332 c4332 = AbstractC4329.Companion;
            int i = this.length;
            c4332.getClass();
            C4332.m8773(index, i);
            return new C4317(this, index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object element) {
            checkIsMutable();
            checkForComodification();
            int iIndexOf = indexOf(element);
            if (iIndexOf >= 0) {
                removeAt(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<?> elements) {
            elements.getClass();
            checkIsMutable();
            checkForComodification();
            return retainOrRemoveAllInternal(this.offset, this.length, elements, false) > 0;
        }

        @Override // kotlin.collections.AbstractC4347
        public E removeAt(int index) {
            checkIsMutable();
            checkForComodification();
            C4332 c4332 = AbstractC4329.Companion;
            int i = this.length;
            c4332.getClass();
            C4332.m8774(index, i);
            return removeAtInternal(this.offset + index);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<?> elements) {
            elements.getClass();
            checkIsMutable();
            checkForComodification();
            return retainOrRemoveAllInternal(this.offset, this.length, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int index, E element) {
            checkIsMutable();
            checkForComodification();
            C4332 c4332 = AbstractC4329.Companion;
            int i = this.length;
            c4332.getClass();
            C4332.m8774(index, i);
            E[] eArr = this.backing;
            int i2 = this.offset + index;
            E e = eArr[i2];
            eArr[i2] = element;
            return e;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int fromIndex, int toIndex) {
            C4332 c4332 = AbstractC4329.Companion;
            int i = this.length;
            c4332.getClass();
            C4332.m8772(fromIndex, toIndex, i);
            return new BuilderSubList(this.backing, this.offset + fromIndex, toIndex - fromIndex, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] array) {
            array.getClass();
            checkForComodification();
            int length = array.length;
            int i = this.length;
            E[] eArr = this.backing;
            int i2 = this.offset;
            if (length < i) {
                T[] tArr = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, array.getClass());
                tArr.getClass();
                return tArr;
            }
            AbstractC4346.m8839(0, i2, eArr, i + i2, array);
            int i3 = this.length;
            if (i3 < array.length) {
                array[i3] = null;
            }
            return array;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            checkForComodification();
            return C8675.m14353(this.backing, this.offset, this.length, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E element) {
            checkIsMutable();
            checkForComodification();
            addAtInternal(this.offset + this.length, element);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> elements) {
            elements.getClass();
            checkIsMutable();
            checkForComodification();
            int size = elements.size();
            addAllInternal(this.offset + this.length, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            checkForComodification();
            E[] eArr = this.backing;
            int i = this.offset;
            return AbstractC4346.m8862(eArr, i, this.length + i);
        }
    }

    public ListBuilder() {
        this(0, 1, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        elements.getClass();
        checkIsMutable();
        int size = elements.size();
        addAllInternal(this.length, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC4346.m8862(this.backing, 0, this.length);
    }
}
