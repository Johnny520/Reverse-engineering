package p198n8;

import bsh.C1189h4;
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
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p036c9.InterfaceC1403d;
import p117i.C3039b;
import p185m8.AbstractC5078f;
import p185m8.AbstractC5086j;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5112w;
import p319w2.C9079i0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: n8.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5509b extends AbstractC5086j implements List, RandomAccess, Serializable, InterfaceC1403d {

    /* JADX INFO: renamed from: t */
    public static final b f17195t = new b(null);

    /* JADX INFO: renamed from: u */
    public static final C5509b f17196u;

    /* JADX INFO: renamed from: q */
    public Object[] f17197q;

    /* JADX INFO: renamed from: r */
    public int f17198r;

    /* JADX INFO: renamed from: s */
    public boolean f17199s;

    /* JADX INFO: renamed from: n8.b$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements ListIterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final C5509b f17209q;

        /* JADX INFO: renamed from: r */
        public int f17210r;

        /* JADX INFO: renamed from: s */
        public int f17211s;

        /* JADX INFO: renamed from: t */
        public int f17212t;

        public c(C5509b c5509b, int i10) {
            c5509b.getClass();
            this.f17209q = c5509b;
            this.f17210r = i10;
            this.f17211s = -1;
            this.f17212t = ((AbstractList) c5509b).modCount;
        }

        /* JADX INFO: renamed from: g */
        private final void m22416g() {
            if (((AbstractList) this.f17209q).modCount == this.f17212t) {
                return;
            }
            C3039b.m11232a();
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            m22416g();
            C5509b c5509b = this.f17209q;
            int i10 = this.f17210r;
            this.f17210r = i10 + 1;
            c5509b.add(i10, obj);
            this.f17211s = -1;
            this.f17212t = ((AbstractList) this.f17209q).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f17210r < this.f17209q.f17198r;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f17210r > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            m22416g();
            if (this.f17210r >= this.f17209q.f17198r) {
                C1189h4.m4429a();
                return null;
            }
            int i10 = this.f17210r;
            this.f17210r = i10 + 1;
            this.f17211s = i10;
            return this.f17209q.f17197q[this.f17211s];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f17210r;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            m22416g();
            int i10 = this.f17210r;
            if (i10 <= 0) {
                C1189h4.m4429a();
                return null;
            }
            int i11 = i10 - 1;
            this.f17210r = i11;
            this.f17211s = i11;
            return this.f17209q.f17197q[this.f17211s];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f17210r - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            m22416g();
            int i10 = this.f17211s;
            if (i10 == -1) {
                C10010p0.m38820a("Call next() or previous() before removing element from the iterator.");
                return;
            }
            this.f17209q.mo73c(i10);
            this.f17210r = this.f17211s;
            this.f17211s = -1;
            this.f17212t = ((AbstractList) this.f17209q).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            m22416g();
            int i10 = this.f17211s;
            if (i10 != -1) {
                this.f17209q.set(i10, obj);
            } else {
                C10010p0.m38820a("Call next() or previous() before replacing element from the iterator.");
            }
        }
    }

    static {
        C5509b c5509b = new C5509b(0);
        c5509b.f17199s = true;
        f17196u = c5509b;
    }

    public C5509b(int i10) {
        this.f17197q = AbstractC5510c.m22420d(i10);
    }

    /* JADX INFO: renamed from: D */
    private final void m22379D() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final Object m22380E(int i10) {
        m22379D();
        Object[] objArr = this.f17197q;
        Object obj = objArr[i10];
        AbstractC5102r.m20660l(objArr, objArr, i10, i10 + 1, this.f17198r);
        AbstractC5510c.m22422f(this.f17197q, this.f17198r - 1);
        this.f17198r--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final void m22381F(int i10, int i11) {
        if (i11 > 0) {
            m22379D();
        }
        Object[] objArr = this.f17197q;
        AbstractC5102r.m20660l(objArr, objArr, i10, i10 + i11, this.f17198r);
        Object[] objArr2 = this.f17197q;
        int i12 = this.f17198r;
        AbstractC5510c.m22423g(objArr2, i12 - i11, i12);
        this.f17198r -= i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final int m22382G(int i10, int i11, Collection collection, boolean z10) {
        Object[] objArr;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            objArr = this.f17197q;
            if (i12 >= i11) {
                break;
            }
            int i14 = i10 + i12;
            if (collection.contains(objArr[i14]) == z10) {
                Object[] objArr2 = this.f17197q;
                i12++;
                objArr2[i13 + i10] = objArr2[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        AbstractC5102r.m20660l(objArr, objArr, i10 + i13, i11 + i10, this.f17198r);
        Object[] objArr3 = this.f17197q;
        int i16 = this.f17198r;
        AbstractC5510c.m22423g(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            m22379D();
        }
        this.f17198r -= i15;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final void m22392v(int i10, Collection collection, int i11) {
        m22379D();
        m22398C(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f17197q[i10 + i12] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m22393w(int i10, Object obj) {
        m22379D();
        m22398C(i10, 1);
        this.f17197q[i10] = obj;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f17199s) {
            return new C5515h(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* JADX INFO: renamed from: y */
    private final void m22394y() {
        if (this.f17199s) {
            C9079i0.m35296a();
        }
    }

    /* JADX INFO: renamed from: z */
    private final boolean m22395z(List list) {
        return AbstractC5510c.m22424h(this.f17197q, 0, this.f17198r, list);
    }

    /* JADX INFO: renamed from: A */
    public final void m22396A(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f17197q;
        if (i10 > objArr.length) {
            this.f17197q = AbstractC5510c.m22421e(this.f17197q, AbstractC5078f.f15387q.m20524e(objArr.length, i10));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m22397B(int i10) {
        m22396A(this.f17198r + i10);
    }

    /* JADX INFO: renamed from: C */
    public final void m22398C(int i10, int i11) {
        m22397B(i11);
        Object[] objArr = this.f17197q;
        AbstractC5102r.m20660l(objArr, objArr, i10 + i11, i10, this.f17198r);
        this.f17198r += i11;
    }

    @Override // p185m8.AbstractC5086j
    /* JADX INFO: renamed from: a */
    public int mo72a() {
        return this.f17198r;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        m22394y();
        AbstractC5078f.f15387q.m20522c(i10, this.f17198r);
        m22393w(i10, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        collection.getClass();
        m22394y();
        AbstractC5078f.f15387q.m20522c(i10, this.f17198r);
        int size = collection.size();
        m22392v(i10, collection, size);
        return size > 0;
    }

    @Override // p185m8.AbstractC5086j
    /* JADX INFO: renamed from: c */
    public Object mo73c(int i10) {
        m22394y();
        AbstractC5078f.f15387q.m20521b(i10, this.f17198r);
        return m22380E(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m22394y();
        m22381F(0, this.f17198r);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof List) && m22395z((List) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC5078f.f15387q.m20521b(i10, this.f17198r);
        return this.f17197q[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return AbstractC5510c.m22425i(this.f17197q, 0, this.f17198r);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f17198r; i10++) {
            if (AbstractC1061t.m3842c(this.f17197q[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f17198r == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f17198r - 1; i10 >= 0; i10--) {
            if (AbstractC1061t.m3842c(this.f17197q[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        AbstractC5078f.f15387q.m20522c(i10, this.f17198r);
        return new c(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m22394y();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo73c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        collection.getClass();
        m22394y();
        return m22382G(0, this.f17198r, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        collection.getClass();
        m22394y();
        return m22382G(0, this.f17198r, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        m22394y();
        AbstractC5078f.f15387q.m20521b(i10, this.f17198r);
        Object[] objArr = this.f17197q;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i10, int i11) {
        AbstractC5078f.f15387q.m20523d(i10, i11, this.f17198r);
        return new a(this.f17197q, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i10 = this.f17198r;
        Object[] objArr2 = this.f17197q;
        if (length >= i10) {
            AbstractC5102r.m20660l(objArr2, objArr, 0, 0, i10);
            return AbstractC5112w.m20791g(this.f17198r, objArr);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i10, objArr.getClass());
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return AbstractC5510c.m22426j(this.f17197q, 0, this.f17198r, this);
    }

    /* JADX INFO: renamed from: x */
    public final List m22399x() {
        m22394y();
        this.f17199s = true;
        return this.f17198r > 0 ? this : f17196u;
    }

    /* JADX INFO: renamed from: n8.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ C5509b(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m22394y();
        m22393w(this.f17198r, obj);
        return true;
    }

    /* JADX INFO: renamed from: n8.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC5086j implements List, RandomAccess, Serializable, InterfaceC1403d {

        /* JADX INFO: renamed from: q */
        public Object[] f17200q;

        /* JADX INFO: renamed from: r */
        public final int f17201r;

        /* JADX INFO: renamed from: s */
        public int f17202s;

        /* JADX INFO: renamed from: t */
        public final a f17203t;

        /* JADX INFO: renamed from: u */
        public final C5509b f17204u;

        /* JADX INFO: renamed from: n8.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10168a implements ListIterator, InterfaceC1400a {

            /* JADX INFO: renamed from: q */
            public final a f17205q;

            /* JADX INFO: renamed from: r */
            public int f17206r;

            /* JADX INFO: renamed from: s */
            public int f17207s;

            /* JADX INFO: renamed from: t */
            public int f17208t;

            public C10168a(a aVar, int i10) {
                aVar.getClass();
                this.f17205q = aVar;
                this.f17206r = i10;
                this.f17207s = -1;
                this.f17208t = ((AbstractList) aVar).modCount;
            }

            /* JADX INFO: renamed from: g */
            private final void m22415g() {
                if (((AbstractList) this.f17205q.f17204u).modCount == this.f17208t) {
                    return;
                }
                C3039b.m11232a();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                m22415g();
                a aVar = this.f17205q;
                int i10 = this.f17206r;
                this.f17206r = i10 + 1;
                aVar.add(i10, obj);
                this.f17207s = -1;
                this.f17208t = ((AbstractList) this.f17205q).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f17206r < this.f17205q.f17202s;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f17206r > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                m22415g();
                if (this.f17206r >= this.f17205q.f17202s) {
                    C1189h4.m4429a();
                    return null;
                }
                int i10 = this.f17206r;
                this.f17206r = i10 + 1;
                this.f17207s = i10;
                return this.f17205q.f17200q[this.f17205q.f17201r + this.f17207s];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f17206r;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                m22415g();
                int i10 = this.f17206r;
                if (i10 <= 0) {
                    C1189h4.m4429a();
                    return null;
                }
                int i11 = i10 - 1;
                this.f17206r = i11;
                this.f17207s = i11;
                return this.f17205q.f17200q[this.f17205q.f17201r + this.f17207s];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f17206r - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                m22415g();
                int i10 = this.f17207s;
                if (i10 == -1) {
                    C10010p0.m38820a("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                this.f17205q.mo73c(i10);
                this.f17206r = this.f17207s;
                this.f17207s = -1;
                this.f17208t = ((AbstractList) this.f17205q).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                m22415g();
                int i10 = this.f17207s;
                if (i10 != -1) {
                    this.f17205q.set(i10, obj);
                } else {
                    C10010p0.m38820a("Call next() or previous() before replacing element from the iterator.");
                }
            }
        }

        public a(Object[] objArr, int i10, int i11, a aVar, C5509b c5509b) {
            objArr.getClass();
            c5509b.getClass();
            this.f17200q = objArr;
            this.f17201r = i10;
            this.f17202s = i11;
            this.f17203t = aVar;
            this.f17204u = c5509b;
            ((AbstractList) this).modCount = ((AbstractList) c5509b).modCount;
        }

        private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        /* JADX INFO: renamed from: t */
        private final void m22405t() {
            if (((AbstractList) this.f17204u).modCount == ((AbstractList) this).modCount) {
                return;
            }
            C3039b.m11232a();
        }

        private final Object writeReplace() throws NotSerializableException {
            if (m22412w()) {
                return new C5515h(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        /* JADX INFO: renamed from: x */
        private final void m22406x() {
            ((AbstractList) this).modCount++;
        }

        /* JADX INFO: renamed from: A */
        public final int m22407A(int i10, int i11, Collection collection, boolean z10) {
            a aVar = this.f17203t;
            int iM22407A = aVar != null ? aVar.m22407A(i10, i11, collection, z10) : this.f17204u.m22382G(i10, i11, collection, z10);
            if (iM22407A > 0) {
                m22406x();
            }
            this.f17202s -= iM22407A;
            return iM22407A;
        }

        @Override // p185m8.AbstractC5086j
        /* JADX INFO: renamed from: a */
        public int mo72a() {
            m22405t();
            return this.f17202s;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, Object obj) {
            m22410u();
            m22405t();
            AbstractC5078f.f15387q.m20522c(i10, this.f17202s);
            m22409s(this.f17201r + i10, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection collection) {
            collection.getClass();
            m22410u();
            m22405t();
            AbstractC5078f.f15387q.m20522c(i10, this.f17202s);
            int size = collection.size();
            m22408r(this.f17201r + i10, collection, size);
            return size > 0;
        }

        @Override // p185m8.AbstractC5086j
        /* JADX INFO: renamed from: c */
        public Object mo73c(int i10) {
            m22410u();
            m22405t();
            AbstractC5078f.f15387q.m20521b(i10, this.f17202s);
            return m22413y(this.f17201r + i10);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            m22410u();
            m22405t();
            m22414z(this.f17201r, this.f17202s);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            m22405t();
            if (obj != this) {
                return (obj instanceof List) && m22411v((List) obj);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            m22405t();
            AbstractC5078f.f15387q.m20521b(i10, this.f17202s);
            return this.f17200q[this.f17201r + i10];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            m22405t();
            return AbstractC5510c.m22425i(this.f17200q, this.f17201r, this.f17202s);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            m22405t();
            for (int i10 = 0; i10 < this.f17202s; i10++) {
                if (AbstractC1061t.m3842c(this.f17200q[this.f17201r + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            m22405t();
            return this.f17202s == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            m22405t();
            for (int i10 = this.f17202s - 1; i10 >= 0; i10--) {
                if (AbstractC1061t.m3842c(this.f17200q[this.f17201r + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            m22405t();
            AbstractC5078f.f15387q.m20522c(i10, this.f17202s);
            return new C10168a(this, i10);
        }

        /* JADX INFO: renamed from: r */
        public final void m22408r(int i10, Collection collection, int i11) {
            m22406x();
            a aVar = this.f17203t;
            if (aVar != null) {
                aVar.m22408r(i10, collection, i11);
            } else {
                this.f17204u.m22392v(i10, collection, i11);
            }
            this.f17200q = this.f17204u.f17197q;
            this.f17202s += i11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            m22410u();
            m22405t();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                mo73c(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection collection) {
            collection.getClass();
            m22410u();
            m22405t();
            return m22407A(this.f17201r, this.f17202s, collection, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection collection) {
            collection.getClass();
            m22410u();
            m22405t();
            return m22407A(this.f17201r, this.f17202s, collection, true) > 0;
        }

        /* JADX INFO: renamed from: s */
        public final void m22409s(int i10, Object obj) {
            m22406x();
            a aVar = this.f17203t;
            if (aVar != null) {
                aVar.m22409s(i10, obj);
            } else {
                this.f17204u.m22393w(i10, obj);
            }
            this.f17200q = this.f17204u.f17197q;
            this.f17202s++;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            m22410u();
            m22405t();
            AbstractC5078f.f15387q.m20521b(i10, this.f17202s);
            Object[] objArr = this.f17200q;
            int i11 = this.f17201r;
            Object obj2 = objArr[i11 + i10];
            objArr[i11 + i10] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            AbstractC5078f.f15387q.m20523d(i10, i11, this.f17202s);
            return new a(this.f17200q, this.f17201r + i10, i11 - i10, this, this.f17204u);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] objArr) {
            objArr.getClass();
            m22405t();
            int length = objArr.length;
            int i10 = this.f17202s;
            Object[] objArr2 = this.f17200q;
            if (length >= i10) {
                int i11 = this.f17201r;
                AbstractC5102r.m20660l(objArr2, objArr, 0, i11, i10 + i11);
                return AbstractC5112w.m20791g(this.f17202s, objArr);
            }
            int i12 = this.f17201r;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i12, i10 + i12, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m22405t();
            return AbstractC5510c.m22426j(this.f17200q, this.f17201r, this.f17202s, this);
        }

        /* JADX INFO: renamed from: u */
        public final void m22410u() {
            if (m22412w()) {
                C9079i0.m35296a();
            }
        }

        /* JADX INFO: renamed from: v */
        public final boolean m22411v(List list) {
            return AbstractC5510c.m22424h(this.f17200q, this.f17201r, this.f17202s, list);
        }

        /* JADX INFO: renamed from: w */
        public final boolean m22412w() {
            return this.f17204u.f17199s;
        }

        /* JADX INFO: renamed from: y */
        public final Object m22413y(int i10) {
            m22406x();
            a aVar = this.f17203t;
            this.f17202s--;
            return aVar != null ? aVar.m22413y(i10) : this.f17204u.m22380E(i10);
        }

        /* JADX INFO: renamed from: z */
        public final void m22414z(int i10, int i11) {
            if (i11 > 0) {
                m22406x();
            }
            a aVar = this.f17203t;
            if (aVar != null) {
                aVar.m22414z(i10, i11);
            } else {
                this.f17204u.m22381F(i10, i11);
            }
            this.f17202s -= i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            m22410u();
            m22405t();
            m22409s(this.f17201r + this.f17202s, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection collection) {
            collection.getClass();
            m22410u();
            m22405t();
            int size = collection.size();
            m22408r(this.f17201r + this.f17202s, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            m22405t();
            Object[] objArr = this.f17200q;
            int i10 = this.f17201r;
            return AbstractC5102r.m20668t(objArr, i10, this.f17202s + i10);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        collection.getClass();
        m22394y();
        int size = collection.size();
        m22392v(this.f17198r, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC5102r.m20668t(this.f17197q, 0, this.f17198r);
    }
}
