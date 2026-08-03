package p001;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ۟.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0176d<E> extends AbstractC0162c<E> implements List<E> {

    /* JADX INFO: renamed from: ۟.d$a */
    public class a implements Iterator<E>, InterfaceC0321n4 {

        /* JADX INFO: renamed from: ۥ */
        public int f744;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f744 < AbstractC0176d.this.mo828();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC0176d<E> abstractC0176d = AbstractC0176d.this;
            int i = this.f744;
            this.f744 = i + 1;
            return abstractC0176d.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: ۟.d$b */
    public class b extends AbstractC0176d<E>.a implements ListIterator<E> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(int i) {
            super();
            int iMo828 = AbstractC0176d.this.mo828();
            if (i >= 0 && i <= iMo828) {
                this.f744 = i;
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + iMo828);
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f744 > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f744;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC0176d<E> abstractC0176d = AbstractC0176d.this;
            int i = this.f744 - 1;
            this.f744 = i;
            return abstractC0176d.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f744 - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: ۟.d$c */
    public static final class c<E> extends AbstractC0176d<E> implements RandomAccess {

        /* JADX INFO: renamed from: ۥ */
        public final AbstractC0176d<E> f746;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f747;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f1418;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: ۟.d<? extends E> */
        /* JADX WARN: Multi-variable type inference failed */
        public c(AbstractC0176d<? extends E> abstractC0176d, int i, int i2) {
            C0237h4.m1090("list", abstractC0176d);
            this.f746 = abstractC0176d;
            this.f747 = i;
            int iMo828 = abstractC0176d.mo828();
            if (i < 0 || i2 > iMo828) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + iMo828);
            }
            if (i <= i2) {
                this.f1418 = i2 - i;
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }

        @Override // p001.AbstractC0176d, java.util.List
        public final E get(int i) {
            int i2 = this.f1418;
            if (i >= 0 && i < i2) {
                return this.f746.get(this.f747 + i);
            }
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }

        @Override // p001.AbstractC0162c
        /* JADX INFO: renamed from: ۥ */
        public final int mo828() {
            return this.f1418;
        }
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        C0237h4.m1090("other", collection);
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!C0237h4.m864(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.List
    public int indexOf(E e) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (C0237h4.m864(it.next(), e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.List
    public int lastIndexOf(E e) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C0237h4.m864(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return new b(0);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i) {
        return new b(i);
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<E> subList(int i, int i2) {
        return new c(this, i, i2);
    }
}
