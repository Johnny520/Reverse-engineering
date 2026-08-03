package Yue;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
public final class C5723<E> extends AbstractC2996<E> implements List<E>, RandomAccess, Serializable, InterfaceC5595 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0850 f14136 = new C0850(null);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C5723 f14137;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public E[] f14138;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f14139;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f14140;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f14141;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6489
    public final C5723<E> f14142;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6489
    public final C5723<E> f14143;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢۡ$ۥ */
    public static final class C0850 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۧۢۡ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0850(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0850() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢۡ$ۥ۟ */
    @InterfaceC7507({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
    public static final class C0851<E> implements ListIterator<E>, InterfaceC5596 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final C5723<E> f14144;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f14145;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f14146;

        public C0851(@InterfaceC6399 C5723<E> c5723, int i) {
            C5499.m17103(c5723, "list");
            this.f14144 = c5723;
            this.f14145 = i;
            this.f14146 = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            C5723<E> c5723 = this.f14144;
            int i = this.f14145;
            this.f14145 = i + 1;
            c5723.add(i, e);
            this.f14146 = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f14145 < this.f14144.f14140;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f14145 > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.f14145 >= this.f14144.f14140) {
                throw new NoSuchElementException();
            }
            int i = this.f14145;
            this.f14145 = i + 1;
            this.f14146 = i;
            return (E) this.f14144.f14138[this.f14144.f14139 + this.f14146];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f14145;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i = this.f14145;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.f14145 = i2;
            this.f14146 = i2;
            return (E) this.f14144.f14138[this.f14144.f14139 + this.f14146];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f14145 - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.f14146;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f14144.remove(i);
            this.f14145 = this.f14146;
            this.f14146 = -1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            int i = this.f14146;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f14144.set(i, e);
        }
    }

    static {
        C5723 c5723 = new C5723(0);
        c5723.f14141 = true;
        f14137 = c5723;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5723(E[] eArr, int i, int i2, boolean z, C5723<E> c5723, C5723<E> c57232) {
        this.f14138 = eArr;
        this.f14139 = i;
        this.f14140 = i2;
        this.f14141 = z;
        this.f14142 = c5723;
        this.f14143 = c57232;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    private final void m17703(int i) {
        if (this.f14142 != null) {
            throw new IllegalStateException();
        }
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f14138;
        if (i > eArr.length) {
            this.f14138 = (E[]) C5724.m17718(this.f14138, C3383.f5433.m468(eArr.length, i));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    private final Object m17704() throws NotSerializableException {
        if (m17712()) {
            return new C7371(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        m17708();
        m17706(this.f14139 + this.f14140, e);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@InterfaceC6399 Collection<? extends E> collection) {
        C5499.m17103(collection, "elements");
        m17708();
        int size = collection.size();
        m17705(this.f14139 + this.f14140, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m17708();
        m17714(this.f14139, this.f14140);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@InterfaceC6489 Object obj) {
        return obj == this || ((obj instanceof List) && m17709((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractC2986.f4328.m52(i, this.f14140);
        return this.f14138[this.f14139 + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return C5724.m17722(this.f14138, this.f14139, this.f14140);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.f14140; i++) {
            if (C5499.m17094(this.f14138[this.f14139 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f14140 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @InterfaceC6399
    public Iterator<E> iterator() {
        return new C0851(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.f14140 - 1; i >= 0; i--) {
            if (C5499.m17094(this.f14138[this.f14139 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    @InterfaceC6399
    public ListIterator<E> listIterator() {
        return new C0851(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m17708();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Collection<? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@InterfaceC6399 Collection<? extends Object> collection) {
        C5499.m17103(collection, "elements");
        m17708();
        return m17715(this.f14139, this.f14140, collection, false) > 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Collection<? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@InterfaceC6399 Collection<? extends Object> collection) {
        C5499.m17103(collection, "elements");
        m17708();
        return m17715(this.f14139, this.f14140, collection, true) > 0;
    }

    @Override // Yue.AbstractC2996, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        m17708();
        AbstractC2986.f4328.m52(i, this.f14140);
        E[] eArr = this.f14138;
        int i2 = this.f14139;
        E e2 = eArr[i2 + i];
        eArr[i2 + i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    @InterfaceC6399
    public List<E> subList(int i, int i2) {
        AbstractC2986.f4328.m5792(i, i2, this.f14140);
        E[] eArr = this.f14138;
        int i3 = this.f14139 + i;
        int i4 = i2 - i;
        boolean z = this.f14141;
        C5723<E> c5723 = this.f14143;
        return new C5723(eArr, i3, i4, z, this, c5723 == null ? this : c5723);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @InterfaceC6399
    public <T> T[] toArray(@InterfaceC6399 T[] tArr) {
        C5499.m17103(tArr, "destination");
        int length = tArr.length;
        int i = this.f14140;
        if (length < i) {
            E[] eArr = this.f14138;
            int i2 = this.f14139;
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
            C5499.m17102(tArr2, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr2;
        }
        E[] eArr2 = this.f14138;
        int i3 = this.f14139;
        C3404.m7129(eArr2, tArr, 0, i3, i + i3);
        int length2 = tArr.length;
        int i4 = this.f14140;
        if (length2 > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    @InterfaceC6399
    public String toString() {
        return C5724.m17723(this.f14138, this.f14139, this.f14140);
    }

    @Override // Yue.AbstractC2996
    /* JADX INFO: renamed from: ۥ */
    public int mo62() {
        return this.f14140;
    }

    @Override // Yue.AbstractC2996
    /* JADX INFO: renamed from: ۥ۟ */
    public E mo63(int i) {
        m17708();
        AbstractC2986.f4328.m52(i, this.f14140);
        return m17713(this.f14139 + i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m17705(int i, Collection<? extends E> collection, int i2) {
        C5723<E> c5723 = this.f14142;
        if (c5723 != null) {
            c5723.m17705(i, collection, i2);
            this.f14138 = this.f14142.f14138;
            this.f14140 += i2;
        } else {
            m17711(i, i2);
            Iterator<? extends E> it = collection.iterator();
            for (int i3 = 0; i3 < i2; i3++) {
                this.f14138[i + i3] = it.next();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m17706(int i, E e) {
        C5723<E> c5723 = this.f14142;
        if (c5723 == null) {
            m17711(i, 1);
            this.f14138[i] = e;
        } else {
            c5723.m17706(i, e);
            this.f14138 = this.f14142.f14138;
            this.f14140++;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final List<E> m17707() {
        if (this.f14142 != null) {
            throw new IllegalStateException();
        }
        m17708();
        this.f14141 = true;
        return this.f14140 > 0 ? this : f14137;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m17708() {
        if (m17712()) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m17709(List<?> list) {
        return C5724.m17721(this.f14138, this.f14139, this.f14140, list);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m17710(int i) {
        m17703(this.f14140 + i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m17711(int i, int i2) {
        m17710(i2);
        E[] eArr = this.f14138;
        C3404.m7129(eArr, eArr, i + i2, i, this.f14139 + this.f14140);
        this.f14140 += i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final boolean m17712() {
        C5723<E> c5723;
        return this.f14141 || ((c5723 = this.f14143) != null && c5723.f14141);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final E m17713(int i) {
        C5723<E> c5723 = this.f14142;
        if (c5723 != null) {
            this.f14140--;
            return c5723.m17713(i);
        }
        E[] eArr = this.f14138;
        E e = eArr[i];
        C3404.m7129(eArr, eArr, i, i + 1, this.f14139 + this.f14140);
        C5724.m17719(this.f14138, (this.f14139 + this.f14140) - 1);
        this.f14140--;
        return e;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m17714(int i, int i2) {
        C5723<E> c5723 = this.f14142;
        if (c5723 != null) {
            c5723.m17714(i, i2);
        } else {
            E[] eArr = this.f14138;
            C3404.m7129(eArr, eArr, i, i + i2, this.f14140);
            E[] eArr2 = this.f14138;
            int i3 = this.f14140;
            C5724.m17720(eArr2, i3 - i2, i3);
        }
        this.f14140 -= i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final int m17715(int i, int i2, Collection<? extends E> collection, boolean z) {
        C5723<E> c5723 = this.f14142;
        if (c5723 != null) {
            int iM17715 = c5723.m17715(i, i2, collection, z);
            this.f14140 -= iM17715;
            return iM17715;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f14138[i5]) == z) {
                E[] eArr = this.f14138;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.f14138;
        C3404.m7129(eArr2, eArr2, i + i4, i2 + i, this.f14140);
        E[] eArr3 = this.f14138;
        int i7 = this.f14140;
        C5724.m17720(eArr3, i7 - i6, i7);
        this.f14140 -= i6;
        return i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.AbstractList, java.util.List
    @InterfaceC6399
    public ListIterator<E> listIterator(int i) {
        AbstractC2986.f4328.m5791(i, this.f14140);
        return new C0851(this, i);
    }

    @Override // Yue.AbstractC2996, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        m17708();
        AbstractC2986.f4328.m5791(i, this.f14140);
        m17706(this.f14139 + i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @InterfaceC6399 Collection<? extends E> collection) {
        C5499.m17103(collection, "elements");
        m17708();
        AbstractC2986.f4328.m5791(i, this.f14140);
        int size = collection.size();
        m17705(this.f14139 + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @InterfaceC6399
    public Object[] toArray() {
        E[] eArr = this.f14138;
        int i = this.f14139;
        return C3404.m7165(eArr, i, this.f14140 + i);
    }

    public C5723() {
        this(10);
    }

    public C5723(int i) {
        this(C5724.m17717(i), 0, 0, false, null, null);
    }
}
