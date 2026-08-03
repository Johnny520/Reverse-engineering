package Yue;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.1")
@InterfaceC7507({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n350#2,7:158\n378#2,7:165\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:158,7\n29#1:165,7\n*E\n"})
public abstract class AbstractC2986<E> extends AbstractC2979<E> implements List<E>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0015 f4328 = new C0015(null);

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۢ$ۥ */
    public static final class C0015 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟۟ۡۢ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0015(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m51(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
            }
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m52(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m5791(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m5792(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            }
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final boolean m5793(@InterfaceC6399 Collection<?> collection, @InterfaceC6399 Collection<?> collection2) {
            C5499.m17103(collection, "c");
            C5499.m17103(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!C5499.m17094(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final int m5794(@InterfaceC6399 Collection<?> collection) {
            C5499.m17103(collection, "c");
            Iterator<?> it = collection.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0015() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۢ$ۥ۟ */
    public class C0016 implements Iterator<E>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f4329;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0016() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4329 < AbstractC2986.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC2986<E> abstractC2986 = AbstractC2986.this;
            int i = this.f4329;
            this.f4329 = i + 1;
            return abstractC2986.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: ۥ */
        public final int m53() {
            return this.f4329;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m54(int i) {
            this.f4329 = i;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۢ$ۥ۟۟, reason: contains not printable characters */
    public class C2987 extends AbstractC2986<E>.C0016 implements ListIterator<E>, InterfaceC5591 {
        public C2987(int i) {
            super();
            AbstractC2986.f4328.m5791(i, AbstractC2986.this.size());
            m54(i);
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return m53() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m53();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC2986<E> abstractC2986 = AbstractC2986.this;
            m54(m53() - 1);
            return abstractC2986.get(m53());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m53() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۢ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C2988<E> extends AbstractC2986<E> implements RandomAccess {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6399
        public final AbstractC2986<E> f4332;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final int f4333;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f4334;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥ۟۟ۡۢ<? extends E> */
        /* JADX WARN: Multi-variable type inference failed */
        public C2988(@InterfaceC6399 AbstractC2986<? extends E> abstractC2986, int i, int i2) {
            C5499.m17103(abstractC2986, "list");
            this.f4332 = abstractC2986;
            this.f4333 = i;
            AbstractC2986.f4328.m5792(i, i2, abstractC2986.size());
            this.f4334 = i2 - i;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public E get(int i) {
            AbstractC2986.f4328.m52(i, this.f4334);
            return this.f4332.get(this.f4333 + i);
        }

        @Override // Yue.AbstractC2986, Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return this.f4334;
        }
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f4328.m5793(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f4328.m5794(this);
    }

    @Override // java.util.List
    public int indexOf(E e) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (C5499.m17094(it.next(), e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // Yue.AbstractC2979, java.util.Collection, java.lang.Iterable
    @InterfaceC6399
    public Iterator<E> iterator() {
        return new C0016();
    }

    @Override // java.util.List
    public int lastIndexOf(E e) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C5499.m17094(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    @InterfaceC6399
    public ListIterator<E> listIterator() {
        return new C2987(0);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @InterfaceC6399
    public List<E> subList(int i, int i2) {
        return new C2988(this, i, i2);
    }

    @Override // Yue.AbstractC2979
    /* JADX INFO: renamed from: ۥ */
    public abstract int mo41();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.List
    @InterfaceC6399
    public ListIterator<E> listIterator(int i) {
        return new C2987(i);
    }
}
