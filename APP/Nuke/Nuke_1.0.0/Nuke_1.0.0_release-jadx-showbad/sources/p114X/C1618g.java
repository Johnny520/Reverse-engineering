package p114X;

import com.bumptech.glide.AbstractC1925g;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p061L2.AbstractC0967g;
import p061L2.AbstractC0972l;
import p061L2.C0962b;
import p095T.AbstractC1380p0;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1767b;
import p129a0.C1787b;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: X.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1618g extends AbstractC0967g implements Collection, InterfaceC1767b {

    /* JADX INFO: renamed from: d */
    public AbstractC1614c f5564d;

    /* JADX INFO: renamed from: e */
    public Object[] f5565e;

    /* JADX INFO: renamed from: f */
    public Object[] f5566f;

    /* JADX INFO: renamed from: g */
    public int f5567g;

    /* JADX INFO: renamed from: h */
    public C1787b f5568h = new C1787b();

    /* JADX INFO: renamed from: i */
    public Object[] f5569i;

    /* JADX INFO: renamed from: j */
    public Object[] f5570j;

    /* JADX INFO: renamed from: k */
    public int f5571k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1618g(AbstractC1614c abstractC1614c, Object[] objArr, Object[] objArr2, int i5) {
        this.f5564d = abstractC1614c;
        this.f5565e = objArr;
        this.f5566f = objArr2;
        this.f5567g = i5;
        this.f5569i = objArr;
        this.f5570j = objArr2;
        this.f5571k = abstractC1614c.mo1974a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m2893d(Object[] objArr, int i5, Iterator it) {
        while (i5 < 32 && it.hasNext()) {
            objArr[i5] = it.next();
            i5++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final Object m2894A(Object[] objArr, int i5, int i6, int i7) {
        int i8 = this.f5571k - i5;
        if (i8 == 1) {
            Object obj = this.f5570j[0];
            m2912q(objArr, i5, i6);
            return obj;
        }
        Object[] objArr2 = this.f5570j;
        Object obj2 = objArr2[i7];
        Object[] objArrM2906k = m2906k(objArr2);
        AbstractC0972l.m1993Q(objArr2, objArrM2906k, i7, i7 + 1, i8);
        objArrM2906k[i8 - 1] = null;
        this.f5569i = objArr;
        this.f5570j = objArrM2906k;
        this.f5571k = (i5 + i8) - 1;
        this.f5567g = i6;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final int m2895B() {
        int i5 = this.f5571k;
        if (i5 <= 32) {
            return 0;
        }
        return (i5 - 1) & (-32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final Object[] m2896C(Object[] objArr, int i5, int i6, Object obj, C1616e c1616e) {
        int iM4209v = AbstractC2352g.m4209v(i6, i5);
        Object[] objArrM2906k = m2906k(objArr);
        if (i5 != 0) {
            Object obj2 = objArrM2906k[iM4209v];
            AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM2906k[iM4209v] = m2896C((Object[]) obj2, i5 - 5, i6, obj, c1616e);
            return objArrM2906k;
        }
        if (objArrM2906k != objArr) {
            ((AbstractList) this).modCount++;
        }
        c1616e.f5559a = objArrM2906k[iM4209v];
        objArrM2906k[iM4209v] = obj;
        return objArrM2906k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final void m2897D(Collection collection, int i5, Object[] objArr, int i6, Object[][] objArr2, int i7, Object[] objArr3) {
        Object[] objArrM2908m;
        if (i7 < 1) {
            AbstractC1380p0.m2542a("requires at least one nullBuffer");
        }
        Object[] objArrM2906k = m2906k(objArr);
        objArr2[0] = objArrM2906k;
        int i8 = i5 & 31;
        int size = ((collection.size() + i5) - 1) & 31;
        int i9 = (i6 - i8) + size;
        if (i9 < 32) {
            AbstractC0972l.m1993Q(objArrM2906k, objArr3, size + 1, i8, i6);
        } else {
            int i10 = i9 - 31;
            if (i7 == 1) {
                objArrM2908m = objArrM2906k;
            } else {
                objArrM2908m = m2908m();
                i7--;
                objArr2[i7] = objArrM2908m;
            }
            int i11 = i6 - i10;
            AbstractC0972l.m1993Q(objArrM2906k, objArr3, 0, i11, i6);
            AbstractC0972l.m1993Q(objArrM2906k, objArrM2908m, size + 1, i8, i11);
            objArr3 = objArrM2908m;
        }
        Iterator it = collection.iterator();
        m2893d(objArrM2906k, i8, it);
        for (int i12 = 1; i12 < i7; i12++) {
            Object[] objArrM2908m2 = m2908m();
            m2893d(objArrM2908m2, 0, it);
            objArr2[i12] = objArrM2908m2;
        }
        m2893d(objArr3, 0, it);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final int m2898E() {
        int i5 = this.f5571k;
        return i5 <= 32 ? i5 : i5 - ((i5 - 1) & (-32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0967g
    /* JADX INFO: renamed from: a */
    public final int mo1976a() {
        return this.f5571k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        AbstractC1925g.m3531h(i5, mo1976a());
        if (i5 == mo1976a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM2895B = m2895B();
        if (i5 >= iM2895B) {
            m2903h(this.f5569i, i5 - iM2895B, obj);
            return;
        }
        C1616e c1616e = new C1616e(null);
        Object[] objArr = this.f5569i;
        AbstractC1665j.m2982b(objArr);
        m2903h(m2902g(objArr, this.f5567g, i5, obj, c1616e), 0, c1616e.f5559a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection collection) {
        Collection collection2;
        C1618g c1618g;
        Object[] objArrM2908m;
        AbstractC1925g.m3531h(i5, this.f5571k);
        if (i5 == this.f5571k) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i6 = (i5 >> 5) << 5;
        int size = ((collection.size() + (this.f5571k - i6)) - 1) / 32;
        if (size == 0) {
            int i7 = i5 & 31;
            int size2 = ((collection.size() + i5) - 1) & 31;
            Object[] objArr = this.f5570j;
            Object[] objArrM2906k = m2906k(objArr);
            AbstractC0972l.m1993Q(objArr, objArrM2906k, size2 + 1, i7, m2898E());
            m2893d(objArrM2906k, i7, collection.iterator());
            this.f5570j = objArrM2906k;
            this.f5571k = collection.size() + this.f5571k;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM2898E = m2898E();
        int size3 = collection.size() + this.f5571k;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i5 >= m2895B()) {
            objArrM2908m = m2908m();
            collection2 = collection;
            m2897D(collection2, i5, this.f5570j, iM2898E, objArr2, size, objArrM2908m);
            c1618g = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            c1618g = this;
            if (size3 > iM2898E) {
                int i8 = size3 - iM2898E;
                Object[] objArrM2907l = m2907l(i8, c1618g.f5570j);
                c1618g.m2901f(collection2, i5, i8, objArr2, size, objArrM2907l);
                objArr2 = objArr2;
                objArrM2908m = objArrM2907l;
            } else {
                Object[] objArr3 = c1618g.f5570j;
                objArrM2908m = m2908m();
                int i9 = iM2898E - size3;
                AbstractC0972l.m1993Q(objArr3, objArrM2908m, 0, i9, iM2898E);
                int i10 = 32 - i9;
                Object[] objArrM2907l2 = m2907l(i10, c1618g.f5570j);
                int i11 = size - 1;
                objArr2[i11] = objArrM2907l2;
                c1618g.m2901f(collection2, i5, i10, objArr2, i11, objArrM2907l2);
                collection2 = collection2;
            }
        }
        c1618g.f5569i = m2914s(c1618g.f5569i, i6, objArr2);
        c1618g.f5570j = objArrM2908m;
        c1618g.f5571k = collection2.size() + c1618g.f5571k;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0967g
    /* JADX INFO: renamed from: b */
    public final Object mo1977b(int i5) {
        AbstractC1925g.m3530g(i5, mo1976a());
        ((AbstractList) this).modCount++;
        int iM2895B = m2895B();
        if (i5 >= iM2895B) {
            return m2894A(this.f5569i, iM2895B, this.f5567g, i5 - iM2895B);
        }
        C1616e c1616e = new C1616e(this.f5570j[0]);
        Object[] objArr = this.f5569i;
        AbstractC1665j.m2982b(objArr);
        m2894A(m2921z(objArr, this.f5567g, i5, c1616e), iM2895B, this.f5567g, 0);
        return c1616e.f5559a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final AbstractC1614c m2899c() {
        AbstractC1614c c1617f;
        Object[] objArr = this.f5569i;
        if (objArr == this.f5565e && this.f5570j == this.f5566f) {
            c1617f = this.f5564d;
        } else {
            this.f5568h = new C1787b();
            this.f5565e = objArr;
            Object[] objArr2 = this.f5570j;
            this.f5566f = objArr2;
            if (objArr != null) {
                c1617f = new C1617f(objArr, objArr2, this.f5571k, this.f5567g);
            } else if (objArr2.length == 0) {
                c1617f = C1621j.f5578e;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f5571k);
                AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
                c1617f = new C1621j(objArrCopyOf);
            }
        }
        this.f5564d = c1617f;
        return c1617f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m2900e() {
        return ((AbstractList) this).modCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m2901f(Collection collection, int i5, int i6, Object[][] objArr, int i7, Object[] objArr2) {
        if (this.f5569i == null) {
            throw new IllegalStateException("root is null");
        }
        int i8 = i5 >> 5;
        AbstractC1612a abstractC1612aM2905j = m2905j(m2895B() >> 5);
        int i9 = i7;
        Object[] objArrM2907l = objArr2;
        while (abstractC1612aM2905j.f5553d - 1 != i8) {
            Object[] objArr3 = (Object[]) abstractC1612aM2905j.previous();
            AbstractC0972l.m1993Q(objArr3, objArrM2907l, 0, 32 - i6, 32);
            objArrM2907l = m2907l(i6, objArr3);
            i9--;
            objArr[i9] = objArrM2907l;
        }
        Object[] objArr4 = (Object[]) abstractC1612aM2905j.previous();
        int iM2895B = i7 - (((m2895B() >> 5) - 1) - i8);
        if (iM2895B < i7) {
            objArr2 = objArr[iM2895B];
            AbstractC1665j.m2982b(objArr2);
        }
        m2897D(collection, i5, objArr4, 32, objArr, iM2895B, objArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final Object[] m2902g(Object[] objArr, int i5, int i6, Object obj, C1616e c1616e) {
        Object obj2;
        int iM4209v = AbstractC2352g.m4209v(i6, i5);
        if (i5 == 0) {
            c1616e.f5559a = objArr[31];
            Object[] objArrM2906k = m2906k(objArr);
            AbstractC0972l.m1993Q(objArr, objArrM2906k, iM4209v + 1, iM4209v, 31);
            objArrM2906k[iM4209v] = obj;
            return objArrM2906k;
        }
        Object[] objArrM2906k2 = m2906k(objArr);
        int i7 = i5 - 5;
        Object obj3 = objArrM2906k2[iM4209v];
        AbstractC1665j.m2983c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrM2906k2[iM4209v] = m2902g((Object[]) obj3, i7, i6, obj, c1616e);
        while (true) {
            iM4209v++;
            if (iM4209v >= 32 || (obj2 = objArrM2906k2[iM4209v]) == null) {
                break;
            }
            objArrM2906k2[iM4209v] = m2902g((Object[]) obj2, i7, 0, c1616e.f5559a, c1616e);
        }
        return objArrM2906k2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        Object[] objArr;
        AbstractC1925g.m3530g(i5, mo1976a());
        if (m2895B() <= i5) {
            objArr = this.f5570j;
        } else {
            objArr = this.f5569i;
            AbstractC1665j.m2982b(objArr);
            for (int i6 = this.f5567g; i6 > 0; i6 -= 5) {
                Object obj = objArr[AbstractC2352g.m4209v(i5, i6)];
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i5 & 31];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m2903h(Object[] objArr, int i5, Object obj) {
        int iM2898E = m2898E();
        Object[] objArrM2906k = m2906k(this.f5570j);
        if (iM2898E < 32) {
            AbstractC0972l.m1993Q(this.f5570j, objArrM2906k, i5 + 1, i5, iM2898E);
            objArrM2906k[i5] = obj;
            this.f5569i = objArr;
            this.f5570j = objArrM2906k;
            this.f5571k++;
            return;
        }
        Object[] objArr2 = this.f5570j;
        Object obj2 = objArr2[31];
        AbstractC0972l.m1993Q(objArr2, objArrM2906k, i5 + 1, i5, 31);
        objArrM2906k[i5] = obj;
        m2915t(objArr, objArrM2906k, m2909n(obj2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m2904i(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f5568h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final AbstractC1612a m2905j(int i5) {
        Object[] objArr = this.f5569i;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iM2895B = m2895B() >> 5;
        AbstractC1925g.m3531h(i5, iM2895B);
        int i6 = this.f5567g;
        return i6 == 0 ? new C1615d(i5, objArr) : new C1622k(objArr, i5, iM2895B, i6 / 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Object[] m2906k(Object[] objArr) {
        if (objArr == null) {
            return m2908m();
        }
        if (m2904i(objArr)) {
            return objArr;
        }
        Object[] objArrM2908m = m2908m();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC0972l.m1995S(objArr, objArrM2908m, 0, length, 6);
        return objArrM2908m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final Object[] m2907l(int i5, Object[] objArr) {
        if (m2904i(objArr)) {
            AbstractC0972l.m1993Q(objArr, objArr, i5, 0, 32 - i5);
            return objArr;
        }
        Object[] objArrM2908m = m2908m();
        AbstractC0972l.m1993Q(objArr, objArrM2908m, i5, 0, 32 - i5);
        return objArrM2908m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        AbstractC1925g.m3531h(i5, this.f5571k);
        return new C1620i(this, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final Object[] m2908m() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f5568h;
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final Object[] m2909n(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f5568h;
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final Object[] m2910o(Object[] objArr, int i5, int i6) {
        if (i6 < 0) {
            AbstractC1380p0.m2542a("shift should be positive");
        }
        if (i6 == 0) {
            return objArr;
        }
        int iM4209v = AbstractC2352g.m4209v(i5, i6);
        Object obj = objArr[iM4209v];
        AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objM2910o = m2910o((Object[]) obj, i5, i6 - 5);
        if (iM4209v < 31) {
            int i7 = iM4209v + 1;
            if (objArr[i7] != null) {
                if (m2904i(objArr)) {
                    Arrays.fill(objArr, i7, 32, (Object) null);
                }
                Object[] objArrM2908m = m2908m();
                AbstractC0972l.m1993Q(objArr, objArrM2908m, 0, 0, i7);
                objArr = objArrM2908m;
            }
        }
        if (objM2910o == objArr[iM4209v]) {
            return objArr;
        }
        Object[] objArrM2906k = m2906k(objArr);
        objArrM2906k[iM4209v] = objM2910o;
        return objArrM2906k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final Object[] m2911p(Object[] objArr, int i5, int i6, C1616e c1616e) {
        Object[] objArrM2911p;
        int iM4209v = AbstractC2352g.m4209v(i6 - 1, i5);
        if (i5 == 5) {
            c1616e.f5559a = objArr[iM4209v];
            objArrM2911p = null;
        } else {
            Object obj = objArr[iM4209v];
            AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM2911p = m2911p((Object[]) obj, i5 - 5, i6, c1616e);
        }
        if (objArrM2911p == null && iM4209v == 0) {
            return null;
        }
        Object[] objArrM2906k = m2906k(objArr);
        objArrM2906k[iM4209v] = objArrM2911p;
        return objArrM2906k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m2912q(Object[] objArr, int i5, int i6) {
        if (i6 == 0) {
            this.f5569i = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f5570j = objArr;
            this.f5571k = i5;
            this.f5567g = i6;
            return;
        }
        C1616e c1616e = new C1616e(null);
        AbstractC1665j.m2982b(objArr);
        Object[] objArrM2911p = m2911p(objArr, i6, i5, c1616e);
        AbstractC1665j.m2982b(objArrM2911p);
        Object obj = c1616e.f5559a;
        AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f5570j = (Object[]) obj;
        this.f5571k = i5;
        if (objArrM2911p[1] == null) {
            this.f5569i = (Object[]) objArrM2911p[0];
            this.f5567g = i6 - 5;
        } else {
            this.f5569i = objArrM2911p;
            this.f5567g = i6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final Object[] m2913r(Object[] objArr, int i5, int i6, Iterator it) {
        if (!it.hasNext()) {
            AbstractC1380p0.m2542a("invalid buffersIterator");
        }
        if (!(i6 >= 0)) {
            AbstractC1380p0.m2542a("negative shift");
        }
        if (i6 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM2906k = m2906k(objArr);
        int iM4209v = AbstractC2352g.m4209v(i5, i6);
        int i7 = i6 - 5;
        objArrM2906k[iM4209v] = m2913r((Object[]) objArrM2906k[iM4209v], i5, i7, it);
        while (true) {
            iM4209v++;
            if (iM4209v >= 32 || !it.hasNext()) {
                break;
            }
            objArrM2906k[iM4209v] = m2913r((Object[]) objArrM2906k[iM4209v], 0, i7, it);
        }
        return objArrM2906k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m2920y(new C1613b(1, collection));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final Object[] m2914s(Object[] objArr, int i5, Object[][] objArr2) {
        C0962b c0962b = new C0962b(objArr2);
        int i6 = i5 >> 5;
        int i7 = this.f5567g;
        Object[] objArrM2913r = i6 < (1 << i7) ? m2913r(objArr, i5, i7, c0962b) : m2906k(objArr);
        while (c0962b.hasNext()) {
            this.f5567g += 5;
            objArrM2913r = m2909n(objArrM2913r);
            int i8 = this.f5567g;
            m2913r(objArrM2913r, 1 << i8, i8, c0962b);
        }
        return objArrM2913r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        AbstractC1925g.m3530g(i5, mo1976a());
        if (m2895B() > i5) {
            C1616e c1616e = new C1616e(null);
            Object[] objArr = this.f5569i;
            AbstractC1665j.m2982b(objArr);
            this.f5569i = m2896C(objArr, this.f5567g, i5, obj, c1616e);
            return c1616e.f5559a;
        }
        Object[] objArrM2906k = m2906k(this.f5570j);
        if (objArrM2906k != this.f5570j) {
            ((AbstractList) this).modCount++;
        }
        int i6 = i5 & 31;
        Object obj2 = objArrM2906k[i6];
        objArrM2906k[i6] = obj;
        this.f5570j = objArrM2906k;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m2915t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i5 = this.f5571k;
        int i6 = i5 >> 5;
        int i7 = this.f5567g;
        if (i6 > (1 << i7)) {
            this.f5569i = m2916u(this.f5567g + 5, m2909n(objArr), objArr2);
            this.f5570j = objArr3;
            this.f5567g += 5;
            this.f5571k++;
            return;
        }
        if (objArr == null) {
            this.f5569i = objArr2;
            this.f5570j = objArr3;
            this.f5571k = i5 + 1;
        } else {
            this.f5569i = m2916u(i7, objArr, objArr2);
            this.f5570j = objArr3;
            this.f5571k++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final Object[] m2916u(int i5, Object[] objArr, Object[] objArr2) {
        int iM4209v = AbstractC2352g.m4209v(mo1976a() - 1, i5);
        Object[] objArrM2906k = m2906k(objArr);
        if (i5 == 5) {
            objArrM2906k[iM4209v] = objArr2;
            return objArrM2906k;
        }
        objArrM2906k[iM4209v] = m2916u(i5 - 5, (Object[]) objArrM2906k[iM4209v], objArr2);
        return objArrM2906k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final int m2917v(InterfaceC1601c interfaceC1601c, Object[] objArr, int i5, int i6, C1616e c1616e, ArrayList arrayList, ArrayList arrayList2) {
        if (m2904i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c1616e.f5559a;
        AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM2908m = objArr2;
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj2 = objArr[i7];
            if (!((Boolean) interfaceC1601c.mo1h(obj2)).booleanValue()) {
                if (i6 == 32) {
                    objArrM2908m = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m2908m();
                    i6 = 0;
                }
                objArrM2908m[i6] = obj2;
                i6++;
            }
        }
        c1616e.f5559a = objArrM2908m;
        if (objArr2 != objArrM2908m) {
            arrayList2.add(objArr2);
        }
        return i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final int m2918w(InterfaceC1601c interfaceC1601c, Object[] objArr, int i5, C1616e c1616e) {
        Object[] objArrM2906k = objArr;
        int i6 = i5;
        boolean z5 = false;
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj = objArr[i7];
            if (((Boolean) interfaceC1601c.mo1h(obj)).booleanValue()) {
                if (!z5) {
                    objArrM2906k = m2906k(objArr);
                    z5 = true;
                    i6 = i7;
                }
            } else if (z5) {
                objArrM2906k[i6] = obj;
                i6++;
            }
        }
        c1616e.f5559a = objArrM2906k;
        return i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final int m2919x(InterfaceC1601c interfaceC1601c, int i5, C1616e c1616e) {
        int iM2918w = m2918w(interfaceC1601c, this.f5570j, i5, c1616e);
        if (iM2918w == i5) {
            return i5;
        }
        Object obj = c1616e.f5559a;
        AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM2918w, i5, (Object) null);
        this.f5570j = objArr;
        this.f5571k -= i5 - iM2918w;
        return iM2918w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final boolean m2920y(InterfaceC1601c interfaceC1601c) {
        Object[] objArrM2913r;
        int i5;
        InterfaceC1601c interfaceC1601c2 = interfaceC1601c;
        int iM2898E = m2898E();
        Object[] objArrM2910o = null;
        C1616e c1616e = new C1616e(null);
        boolean z5 = false;
        if (this.f5569i != null) {
            AbstractC1612a abstractC1612aM2905j = m2905j(0);
            int iM2918w = 32;
            while (iM2918w == 32 && abstractC1612aM2905j.hasNext()) {
                iM2918w = m2918w(interfaceC1601c2, (Object[]) abstractC1612aM2905j.next(), 32, c1616e);
            }
            if (iM2918w == 32) {
                int iM2919x = m2919x(interfaceC1601c2, iM2898E, c1616e);
                if (iM2919x == 0) {
                    m2912q(this.f5569i, this.f5571k, this.f5567g);
                }
                if (iM2919x != iM2898E) {
                }
            } else {
                int i6 = (abstractC1612aM2905j.f5553d - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM2917v = iM2918w;
                while (abstractC1612aM2905j.hasNext()) {
                    iM2917v = m2917v(interfaceC1601c2, (Object[]) abstractC1612aM2905j.next(), 32, iM2917v, c1616e, arrayList2, arrayList);
                    interfaceC1601c2 = interfaceC1601c;
                }
                int iM2917v2 = m2917v(interfaceC1601c, this.f5570j, iM2898E, iM2917v, c1616e, arrayList2, arrayList);
                Object obj = c1616e.f5559a;
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM2917v2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrM2913r = this.f5569i;
                    AbstractC1665j.m2982b(objArrM2913r);
                } else {
                    objArrM2913r = m2913r(this.f5569i, i6, this.f5567g, arrayList.iterator());
                }
                int size = i6 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    AbstractC1380p0.m2542a("invalid size");
                }
                if (size == 0) {
                    this.f5567g = 0;
                } else {
                    int i7 = size - 1;
                    while (true) {
                        i5 = this.f5567g;
                        if ((i7 >> i5) != 0) {
                            break;
                        }
                        this.f5567g = i5 - 5;
                        Object[] objArr2 = objArrM2913r[0];
                        AbstractC1665j.m2983c(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrM2913r = objArr2;
                    }
                    objArrM2910o = m2910o(objArrM2913r, i7, i5);
                }
                this.f5569i = objArrM2910o;
                this.f5570j = objArr;
                this.f5571k = size + iM2917v2;
            }
            z5 = true;
        } else if (m2919x(interfaceC1601c2, iM2898E, c1616e) != iM2898E) {
            z5 = true;
        }
        if (z5) {
            ((AbstractList) this).modCount++;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final Object[] m2921z(Object[] objArr, int i5, int i6, C1616e c1616e) {
        int iM4209v = AbstractC2352g.m4209v(i6, i5);
        if (i5 == 0) {
            Object obj = objArr[iM4209v];
            Object[] objArrM2906k = m2906k(objArr);
            AbstractC0972l.m1993Q(objArr, objArrM2906k, iM4209v, iM4209v + 1, 32);
            objArrM2906k[31] = c1616e.f5559a;
            c1616e.f5559a = obj;
            return objArrM2906k;
        }
        int iM4209v2 = objArr[31] == null ? AbstractC2352g.m4209v(m2895B() - 1, i5) : 31;
        Object[] objArrM2906k2 = m2906k(objArr);
        int i7 = i5 - 5;
        int i8 = iM4209v + 1;
        if (i8 <= iM4209v2) {
            while (true) {
                Object obj2 = objArrM2906k2[iM4209v2];
                AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrM2906k2[iM4209v2] = m2921z((Object[]) obj2, i7, 0, c1616e);
                if (iM4209v2 == i8) {
                    break;
                }
                iM4209v2--;
            }
        }
        Object obj3 = objArrM2906k2[iM4209v];
        AbstractC1665j.m2983c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrM2906k2[iM4209v] = m2921z((Object[]) obj3, i7, i6, c1616e);
        return objArrM2906k2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM2898E = m2898E();
        if (iM2898E < 32) {
            Object[] objArrM2906k = m2906k(this.f5570j);
            objArrM2906k[iM2898E] = obj;
            this.f5570j = objArrM2906k;
            this.f5571k = mo1976a() + 1;
        } else {
            m2915t(this.f5569i, this.f5570j, m2909n(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM2898E = m2898E();
        Iterator it = collection.iterator();
        if (32 - iM2898E >= collection.size()) {
            Object[] objArrM2906k = m2906k(this.f5570j);
            m2893d(objArrM2906k, iM2898E, it);
            this.f5570j = objArrM2906k;
            this.f5571k = collection.size() + this.f5571k;
            return true;
        }
        int size = ((collection.size() + iM2898E) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM2906k2 = m2906k(this.f5570j);
        m2893d(objArrM2906k2, iM2898E, it);
        objArr[0] = objArrM2906k2;
        for (int i5 = 1; i5 < size; i5++) {
            Object[] objArrM2908m = m2908m();
            m2893d(objArrM2908m, 0, it);
            objArr[i5] = objArrM2908m;
        }
        this.f5569i = m2914s(this.f5569i, m2895B(), objArr);
        Object[] objArrM2908m2 = m2908m();
        m2893d(objArrM2908m2, 0, it);
        this.f5570j = objArrM2908m2;
        this.f5571k = collection.size() + this.f5571k;
        return true;
    }
}
