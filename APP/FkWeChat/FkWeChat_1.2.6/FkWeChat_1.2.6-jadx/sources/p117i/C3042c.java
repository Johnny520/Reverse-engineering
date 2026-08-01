package p117i;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p024b9.AbstractC1043k;
import p036c9.InterfaceC1401b;
import p036c9.InterfaceC1405f;
import p132j.AbstractC3489a;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: i.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3042c implements Collection, Set, InterfaceC1401b, InterfaceC1405f {

    /* JADX INFO: renamed from: q */
    public int[] f8075q;

    /* JADX INFO: renamed from: r */
    public Object[] f8076r;

    /* JADX INFO: renamed from: s */
    public int f8077s;

    /* JADX INFO: renamed from: i.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a extends AbstractC3060i {
        public a() {
            super(C3042c.this.m11247o());
        }

        @Override // p117i.AbstractC3060i
        /* JADX INFO: renamed from: g */
        public Object mo11217g(int i10) {
            return C3042c.this.m11252t(i10);
        }

        @Override // p117i.AbstractC3060i
        /* JADX INFO: renamed from: l */
        public void mo11218l(int i10) {
            C3042c.this.m11248p(i10);
        }
    }

    public C3042c(int i10) {
        this.f8075q = AbstractC3489a.f9693a;
        this.f8076r = AbstractC3489a.f9695c;
        if (i10 > 0) {
            AbstractC3048e.m11275a(this, i10);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11243a(int i10) {
        int iM11247o = m11247o();
        if (m11245e().length < i10) {
            int[] iArrM11245e = m11245e();
            Object[] objArrM11244c = m11244c();
            AbstractC3048e.m11275a(this, i10);
            if (m11247o() > 0) {
                AbstractC5102r.m20663o(iArrM11245e, m11245e(), 0, 0, m11247o(), 6, null);
                AbstractC5102r.m20665q(objArrM11244c, m11244c(), 0, 0, m11247o(), 6, null);
            }
        }
        if (m11247o() == iM11247o) {
            return;
        }
        C3039b.m11232a();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i10;
        int iM11277c;
        int iM11247o = m11247o();
        if (obj == null) {
            iM11277c = AbstractC3048e.m11278d(this);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iM11277c = AbstractC3048e.m11277c(this, obj, iHashCode);
        }
        if (iM11277c >= 0) {
            return false;
        }
        int i11 = ~iM11277c;
        if (iM11247o >= m11245e().length) {
            int i12 = 8;
            if (iM11247o >= 8) {
                i12 = (iM11247o >> 1) + iM11247o;
            } else if (iM11247o < 4) {
                i12 = 4;
            }
            int[] iArrM11245e = m11245e();
            Object[] objArrM11244c = m11244c();
            AbstractC3048e.m11275a(this, i12);
            if (iM11247o != m11247o()) {
                C3039b.m11232a();
                return false;
            }
            if (!(m11245e().length == 0)) {
                AbstractC5102r.m20663o(iArrM11245e, m11245e(), 0, 0, iArrM11245e.length, 6, null);
                AbstractC5102r.m20665q(objArrM11244c, m11244c(), 0, 0, objArrM11244c.length, 6, null);
            }
        }
        if (i11 < iM11247o) {
            int i13 = i11 + 1;
            AbstractC5102r.m20658j(m11245e(), m11245e(), i13, i11, iM11247o);
            AbstractC5102r.m20660l(m11244c(), m11244c(), i13, i11, iM11247o);
        }
        if (iM11247o != m11247o() || i11 >= m11245e().length) {
            C3039b.m11232a();
            return false;
        }
        m11245e()[i11] = i10;
        m11244c()[i11] = obj;
        m11251s(m11247o() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        collection.getClass();
        m11243a(m11247o() + collection.size());
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: c */
    public final Object[] m11244c() {
        return this.f8076r;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (m11247o() != 0) {
            m11250r(AbstractC3489a.f9693a);
            m11249q(AbstractC3489a.f9695c);
            m11251s(0);
        }
        if (m11247o() == 0) {
            return;
        }
        C3039b.m11232a();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final int[] m11245e() {
        return this.f8075q;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int iM11247o = m11247o();
            for (int i10 = 0; i10 < iM11247o; i10++) {
                if (!((Set) obj).contains(m11252t(i10))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrM11245e = m11245e();
        int iM11247o = m11247o();
        int i10 = 0;
        for (int i11 = 0; i11 < iM11247o; i11++) {
            i10 += iArrM11245e[i11];
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        return obj == null ? AbstractC3048e.m11278d(this) : AbstractC3048e.m11277c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return m11247o() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    /* JADX INFO: renamed from: l */
    public int m11246l() {
        return this.f8077s;
    }

    /* JADX INFO: renamed from: o */
    public final int m11247o() {
        return this.f8077s;
    }

    /* JADX INFO: renamed from: p */
    public final Object m11248p(int i10) {
        int i11;
        Object[] objArr;
        int iM11247o = m11247o();
        Object obj = m11244c()[i10];
        if (iM11247o <= 1) {
            clear();
            return obj;
        }
        int i12 = iM11247o - 1;
        if (m11245e().length <= 8 || m11247o() >= m11245e().length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                AbstractC5102r.m20658j(m11245e(), m11245e(), i10, i13, iM11247o);
                AbstractC5102r.m20660l(m11244c(), m11244c(), i10, i13, iM11247o);
            }
            m11244c()[i12] = null;
        } else {
            int iM11247o2 = m11247o() > 8 ? m11247o() + (m11247o() >> 1) : 8;
            int[] iArrM11245e = m11245e();
            Object[] objArrM11244c = m11244c();
            AbstractC3048e.m11275a(this, iM11247o2);
            if (i10 > 0) {
                AbstractC5102r.m20663o(iArrM11245e, m11245e(), 0, 0, i10, 6, null);
                objArr = objArrM11244c;
                AbstractC5102r.m20665q(objArr, m11244c(), 0, 0, i10, 6, null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = objArrM11244c;
            }
            if (i11 < i12) {
                int i14 = i11 + 1;
                AbstractC5102r.m20658j(iArrM11245e, m11245e(), i11, i14, iM11247o);
                AbstractC5102r.m20660l(objArr, m11244c(), i11, i14, iM11247o);
            }
        }
        if (iM11247o == m11247o()) {
            m11251s(i12);
            return obj;
        }
        C3039b.m11232a();
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m11249q(Object[] objArr) {
        objArr.getClass();
        this.f8076r = objArr;
    }

    /* JADX INFO: renamed from: r */
    public final void m11250r(int[] iArr) {
        iArr.getClass();
        this.f8075q = iArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m11248p(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z10 = false;
        for (int iM11247o = m11247o() - 1; -1 < iM11247o; iM11247o--) {
            if (!AbstractC5081g0.m20559a0(collection, m11244c()[iM11247o])) {
                m11248p(iM11247o);
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: s */
    public final void m11251s(int i10) {
        this.f8077s = i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return m11246l();
    }

    /* JADX INFO: renamed from: t */
    public final Object m11252t(int i10) {
        return m11244c()[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        Object[] objArrM11266a = AbstractC3045d.m11266a(objArr, this.f8077s);
        AbstractC5102r.m20660l(this.f8076r, objArrM11266a, 0, 0, this.f8077s);
        objArrM11266a.getClass();
        return objArrM11266a;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(m11247o() * 14);
        sb2.append('{');
        int iM11247o = m11247o();
        for (int i10 = 0; i10 < iM11247o; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object objM11252t = m11252t(i10);
            if (objM11252t != this) {
                sb2.append(objM11252t);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C3042c() {
        this(0, 1, null);
    }

    public /* synthetic */ C3042c(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC5102r.m20668t(this.f8076r, 0, this.f8077s);
    }
}
