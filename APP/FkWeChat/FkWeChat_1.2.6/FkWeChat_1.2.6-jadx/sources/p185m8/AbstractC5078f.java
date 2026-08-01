package p185m8;

import bsh.C1189h4;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: m8.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5078f extends AbstractC5066b implements List, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public static final a f15387q = new a(null);

    /* JADX INFO: renamed from: m8.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class b implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public int f15388q;

        public b() {
        }

        /* JADX INFO: renamed from: g */
        public final int m20527g() {
            return this.f15388q;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15388q < AbstractC5078f.this.size();
        }

        /* JADX INFO: renamed from: l */
        public final void m20528l(int i10) {
            this.f15388q = i10;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                C1189h4.m4429a();
                return null;
            }
            AbstractC5078f abstractC5078f = AbstractC5078f.this;
            int i10 = this.f15388q;
            this.f15388q = i10 + 1;
            return abstractC5078f.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: m8.f$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class c extends b implements ListIterator, InterfaceC1400a {
        public c(int i10) {
            super();
            AbstractC5078f.f15387q.m20522c(i10, AbstractC5078f.this.size());
            m20528l(i10);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return m20527g() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m20527g();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                C1189h4.m4429a();
                return null;
            }
            AbstractC5078f abstractC5078f = AbstractC5078f.this;
            m20528l(m20527g() - 1);
            return abstractC5078f.get(m20527g());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m20527g() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: m8.f$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC5078f implements RandomAccess {

        /* JADX INFO: renamed from: r */
        public final AbstractC5078f f15391r;

        /* JADX INFO: renamed from: s */
        public final int f15392s;

        /* JADX INFO: renamed from: t */
        public int f15393t;

        public d(AbstractC5078f abstractC5078f, int i10, int i11) {
            abstractC5078f.getClass();
            this.f15391r = abstractC5078f;
            this.f15392s = i10;
            AbstractC5078f.f15387q.m20523d(i10, i11, abstractC5078f.size());
            this.f15393t = i11 - i10;
        }

        @Override // p185m8.AbstractC5066b
        /* JADX INFO: renamed from: c */
        public int mo31c() {
            return this.f15393t;
        }

        @Override // p185m8.AbstractC5078f, java.util.List
        public Object get(int i10) {
            AbstractC5078f.f15387q.m20521b(i10, this.f15393t);
            return this.f15391r.get(this.f15392s + i10);
        }

        @Override // p185m8.AbstractC5078f, java.util.List
        public List subList(int i10, int i11) {
            AbstractC5078f.f15387q.m20523d(i10, i11, this.f15393t);
            AbstractC5078f abstractC5078f = this.f15391r;
            int i12 = this.f15392s;
            return new d(abstractC5078f, i10 + i12, i12 + i11);
        }
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f15387q.m20525f(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i10);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f15387q.m20526g(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (AbstractC1061t.m3842c(it.next(), obj)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (AbstractC1061t.m3842c(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i10, int i11) {
        return new d(this, i10, i11);
    }

    /* JADX INFO: renamed from: m8.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m20520a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                C5075e.m20517a("startIndex: ", i10, ", endIndex: ", i11, i12);
            } else {
                if (i10 <= i11) {
                    return;
                }
                C5072d.m20505a("startIndex: ", i10, " > endIndex: ", i11);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m20521b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                C5085i0.m20599a("index: ", i10, ", size: ", i11);
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m20522c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                C5085i0.m20599a("index: ", i10, ", size: ", i11);
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m20523d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                C5075e.m20517a("fromIndex: ", i10, ", toIndex: ", i11, i12);
            } else {
                if (i10 <= i11) {
                    return;
                }
                C5072d.m20505a("fromIndex: ", i10, " > toIndex: ", i11);
            }
        }

        /* JADX INFO: renamed from: e */
        public final int m20524e(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            return i12 - 2147483639 > 0 ? i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i12;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m20525f(Collection collection, Collection collection2) {
            collection.getClass();
            collection2.getClass();
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!AbstractC1061t.m3842c(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: g */
        public final int m20526g(Collection collection) {
            collection.getClass();
            Iterator it = collection.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        public a() {
        }
    }

    public ListIterator listIterator(int i10) {
        return new c(i10);
    }
}
