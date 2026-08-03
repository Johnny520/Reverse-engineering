package p000a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: a.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0887w<E> extends AbstractC0849u<E> implements List<E> {

    /* JADX INFO: renamed from: a.w$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m2111a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            }
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }
    }

    /* JADX INFO: renamed from: a.w$b */
    public class b implements Iterator<E>, InterfaceC0783q9 {

        /* JADX INFO: renamed from: a */
        public int f3462a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f3462a < AbstractC0887w.this.mo1328a();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f3462a;
            this.f3462a = i + 1;
            return AbstractC0887w.this.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: a.w$c */
    public class c extends AbstractC0887w<E>.b implements ListIterator<E> {
        public c(int i) {
            super();
            int iMo1328a = AbstractC0887w.this.mo1328a();
            if (i >= 0 && i <= iMo1328a) {
                this.f3462a = i;
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + iMo1328a);
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f3462a > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f3462a;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            int i = this.f3462a - 1;
            this.f3462a = i;
            return AbstractC0887w.this.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f3462a - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: a.w$d */
    public static final class d<E> extends AbstractC0887w<E> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final AbstractC0887w<E> f3465a;

        /* JADX INFO: renamed from: b */
        public final int f3466b;

        /* JADX INFO: renamed from: c */
        public final int f3467c;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: a.w<? extends E> */
        /* JADX WARN: Multi-variable type inference failed */
        public d(AbstractC0887w<? extends E> abstractC0887w, int i, int i2) {
            this.f3465a = abstractC0887w;
            this.f3466b = i;
            a.m2111a(i, i2, abstractC0887w.mo1328a());
            this.f3467c = i2 - i;
        }

        @Override // p000a.AbstractC0849u
        /* JADX INFO: renamed from: a */
        public final int mo1328a() {
            return this.f3467c;
        }

        @Override // java.util.List
        public final E get(int i) {
            int i2 = this.f3467c;
            if (i >= 0 && i < i2) {
                return this.f3465a.get(this.f3466b + i);
            }
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
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
        C0631i9.m1482e(collection, "other");
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!C0631i9.m1478a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

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

    public int indexOf(E e) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (C0631i9.m1478a(it.next(), e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C0631i9.m1478a(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return new c(0);
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
        return new d(this, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.List
    public final ListIterator<E> listIterator(int i) {
        return new c(i);
    }
}
