package p166l2;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1041j;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p117i.C3067k0;
import p117i.C3076o0;
import p165l1.InterfaceC4507m;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: l2.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4596w implements List, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public C3076o0 f13573q = new C3076o0(16);

    /* JADX INFO: renamed from: r */
    public C3067k0 f13574r = new C3067k0(16);

    /* JADX INFO: renamed from: s */
    public int f13575s = -1;

    /* JADX INFO: renamed from: A */
    public final void m18366A(int i10, int i11) {
        if (i10 >= i11) {
            return;
        }
        this.f13573q.m11455C(i10, i11);
        this.f13574r.m11386i(i10, i11);
    }

    /* JADX INFO: renamed from: B */
    public final void m18367B(InterfaceC4507m.c cVar, float f10, boolean z10, InterfaceC0173a interfaceC0173a) {
        if (this.f13575s == AbstractC5114x.m20802q(this)) {
            int i10 = this.f13575s;
            m18366A(this.f13575s + 1, size());
            this.f13575s++;
            this.f13573q.m11461n(cVar);
            this.f13574r.m11381d(AbstractC4599x.m18440a(f10, z10, false));
            interfaceC0173a.invoke();
            this.f13575s = i10;
            if (this.f13575s + 1 == AbstractC5114x.m20802q(this) || AbstractC4581r.m18193d(m18370r())) {
                m18378z(this.f13575s + 1);
                return;
            }
            return;
        }
        long jM18370r = m18370r();
        int i11 = this.f13575s;
        this.f13575s = AbstractC5114x.m20802q(this);
        int i12 = this.f13575s;
        m18366A(this.f13575s + 1, size());
        this.f13575s++;
        this.f13573q.m11461n(cVar);
        this.f13574r.m11381d(AbstractC4599x.m18440a(f10, z10, false));
        interfaceC0173a.invoke();
        this.f13575s = i12;
        long jM18370r2 = m18370r();
        if (this.f13575s + 1 >= AbstractC5114x.m20802q(this) || AbstractC4581r.m18190a(jM18370r, jM18370r2) <= 0) {
            m18366A(this.f13575s + 1, size());
        } else {
            int i13 = i11 + 1;
            boolean zM18193d = AbstractC4581r.m18193d(jM18370r2);
            int i14 = this.f13575s;
            m18366A(i13, zM18193d ? i14 + 2 : i14 + 1);
        }
        this.f13575s = i11;
    }

    /* JADX INFO: renamed from: a */
    public final void m18368a() {
        this.f13575s = size() - 1;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f13575s = -1;
        this.f13573q.m11468u();
        this.f13574r.m11383f();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC4507m.c) {
            return m18369q((InterfaceC4507m.c) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((InterfaceC4507m.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC4507m.c) {
            return m18375w((InterfaceC4507m.c) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f13573q.m11589g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC4507m.c) {
            return m18377y((InterfaceC4507m.c) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    /* JADX INFO: renamed from: q */
    public boolean m18369q(InterfaceC4507m.c cVar) {
        return indexOf(cVar) != -1;
    }

    /* JADX INFO: renamed from: r */
    public final long m18370r() {
        long jM18441b = AbstractC4599x.m18441b(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i10 = this.f13575s + 1;
        int iM20802q = AbstractC5114x.m20802q(this);
        if (i10 <= iM20802q) {
            while (true) {
                long jM18191b = AbstractC4581r.m18191b(this.f13574r.m11573a(i10));
                if (AbstractC4581r.m18190a(jM18191b, jM18441b) < 0) {
                    jM18441b = jM18191b;
                }
                if ((AbstractC4581r.m18192c(jM18441b) < 0.0f && AbstractC4581r.m18194e(jM18441b)) || i10 == iM20802q) {
                    break;
                }
                i10++;
            }
        }
        return jM18441b;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public InterfaceC4507m.c get(int i10) {
        Object objM11586d = this.f13573q.m11586d(i10);
        objM11586d.getClass();
        return (InterfaceC4507m.c) objM11586d;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m18372t();
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        return new b(i10, i11);
    }

    /* JADX INFO: renamed from: t */
    public int m18372t() {
        return this.f13573q.m11587e();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m18373u() {
        long jM18370r = m18370r();
        return AbstractC4581r.m18192c(jM18370r) < 0.0f && AbstractC4581r.m18194e(jM18370r) && !AbstractC4581r.m18193d(jM18370r);
    }

    /* JADX INFO: renamed from: v */
    public final void m18374v(InterfaceC4507m.c cVar, boolean z10, InterfaceC0173a interfaceC0173a) {
        if (this.f13575s == AbstractC5114x.m20802q(this)) {
            int i10 = this.f13575s;
            m18366A(this.f13575s + 1, size());
            this.f13575s++;
            this.f13573q.m11461n(cVar);
            this.f13574r.m11381d(AbstractC4599x.m18440a(0.0f, z10, true));
            interfaceC0173a.invoke();
            this.f13575s = i10;
            return;
        }
        long jM18370r = m18370r();
        int i11 = this.f13575s;
        if (!AbstractC4581r.m18193d(jM18370r)) {
            if (AbstractC4581r.m18192c(jM18370r) > 0.0f) {
                int i12 = this.f13575s;
                m18366A(this.f13575s + 1, size());
                this.f13575s++;
                this.f13573q.m11461n(cVar);
                this.f13574r.m11381d(AbstractC4599x.m18440a(0.0f, z10, true));
                interfaceC0173a.invoke();
                this.f13575s = i12;
                return;
            }
            return;
        }
        this.f13575s = AbstractC5114x.m20802q(this);
        int i13 = this.f13575s;
        m18366A(this.f13575s + 1, size());
        this.f13575s++;
        this.f13573q.m11461n(cVar);
        this.f13574r.m11381d(AbstractC4599x.m18440a(0.0f, z10, true));
        interfaceC0173a.invoke();
        this.f13575s = i13;
        if (AbstractC4581r.m18192c(m18370r()) < 0.0f) {
            m18366A(i11 + 1, this.f13575s + 1);
        }
        this.f13575s = i11;
    }

    /* JADX INFO: renamed from: w */
    public int m18375w(InterfaceC4507m.c cVar) {
        int iM20802q = AbstractC5114x.m20802q(this);
        if (iM20802q < 0) {
            return -1;
        }
        int i10 = 0;
        while (!AbstractC1061t.m3842c(this.f13573q.m11586d(i10), cVar)) {
            if (i10 == iM20802q) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m18376x(float f10, boolean z10) {
        if (this.f13575s == AbstractC5114x.m20802q(this)) {
            return true;
        }
        return AbstractC4581r.m18190a(m18370r(), AbstractC4599x.m18441b(f10, z10, false, 4, null)) > 0;
    }

    /* JADX INFO: renamed from: y */
    public int m18377y(InterfaceC4507m.c cVar) {
        for (int iM20802q = AbstractC5114x.m20802q(this); -1 < iM20802q; iM20802q--) {
            if (AbstractC1061t.m3842c(this.f13573q.m11586d(iM20802q), cVar)) {
                return iM20802q;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public final void m18378z(int i10) {
        this.f13573q.m11454B(i10);
        this.f13574r.m11385h(i10);
    }

    /* JADX INFO: renamed from: l2.w$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class b implements List, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final int f13580q;

        /* JADX INFO: renamed from: r */
        public final int f13581r;

        public b(int i10, int i11) {
            this.f13580q = i10;
            this.f13581r = i11;
        }

        /* JADX INFO: renamed from: a */
        public boolean m18381a(InterfaceC4507m.c cVar) {
            return indexOf(cVar) != -1;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC4507m.c get(int i10) {
            Object objM11586d = C4596w.this.f13573q.m11586d(i10 + this.f13580q);
            objM11586d.getClass();
            return (InterfaceC4507m.c) objM11586d;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof InterfaceC4507m.c) {
                return m18381a((InterfaceC4507m.c) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((InterfaceC4507m.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: e */
        public int m18383e() {
            return this.f13581r - this.f13580q;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof InterfaceC4507m.c) {
                return m18384l((InterfaceC4507m.c) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            C4596w c4596w = C4596w.this;
            int i10 = this.f13580q;
            return c4596w.new a(i10, i10, this.f13581r);
        }

        /* JADX INFO: renamed from: l */
        public int m18384l(InterfaceC4507m.c cVar) {
            int i10 = this.f13580q;
            int i11 = this.f13581r;
            if (i10 > i11) {
                return -1;
            }
            while (!AbstractC1061t.m3842c(C4596w.this.f13573q.m11586d(i10), cVar)) {
                if (i10 == i11) {
                    return -1;
                }
                i10++;
            }
            return i10 - this.f13580q;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof InterfaceC4507m.c) {
                return m18385o((InterfaceC4507m.c) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            C4596w c4596w = C4596w.this;
            int i11 = this.f13580q;
            return c4596w.new a(i10 + i11, i11, this.f13581r);
        }

        /* JADX INFO: renamed from: o */
        public int m18385o(InterfaceC4507m.c cVar) {
            int i10 = this.f13581r;
            int i11 = this.f13580q;
            if (i11 > i10) {
                return -1;
            }
            while (!AbstractC1061t.m3842c(C4596w.this.f13573q.m11586d(i10), cVar)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f13580q;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return m18383e();
        }

        @Override // java.util.List
        public void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            C4596w c4596w = C4596w.this;
            int i12 = this.f13580q;
            return c4596w.new b(i10 + i12, i12 + i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC1041j.m3803a(this);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC1041j.m3804b(this, objArr);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            C4596w c4596w = C4596w.this;
            int i10 = this.f13580q;
            return c4596w.new a(i10, i10, this.f13581r);
        }
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC1041j.m3804b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        return new a(this, i10, 0, 0, 6, null);
    }

    /* JADX INFO: renamed from: l2.w$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a implements ListIterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public int f13576q;

        /* JADX INFO: renamed from: r */
        public final int f13577r;

        /* JADX INFO: renamed from: s */
        public final int f13578s;

        public /* synthetic */ a(C4596w c4596w, int i10, int i11, int i12, int i13, AbstractC1043k abstractC1043k) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? c4596w.size() : i12);
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public InterfaceC4507m.c next() {
            C3076o0 c3076o0 = C4596w.this.f13573q;
            int i10 = this.f13576q;
            this.f13576q = i10 + 1;
            Object objM11586d = c3076o0.m11586d(i10);
            objM11586d.getClass();
            return (InterfaceC4507m.c) objM11586d;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f13576q < this.f13578s;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f13576q > this.f13577r;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public InterfaceC4507m.c previous() {
            C3076o0 c3076o0 = C4596w.this.f13573q;
            int i10 = this.f13576q - 1;
            this.f13576q = i10;
            Object objM11586d = c3076o0.m11586d(i10);
            objM11586d.getClass();
            return (InterfaceC4507m.c) objM11586d;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f13576q - this.f13577r;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f13576q - this.f13577r) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(int i10, int i11, int i12) {
            this.f13576q = i10;
            this.f13577r = i11;
            this.f13578s = i12;
        }
    }
}
