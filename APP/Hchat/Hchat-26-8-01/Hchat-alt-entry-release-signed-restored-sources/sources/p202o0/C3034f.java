package p202o0;

import be.AbstractC0283h;
import gg.C1406b;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p085fg.InterfaceC1231l;
import p092g4.AbstractC1341a;
import p103h3.C1577f;
import p114hg.InterfaceC1712b;
import p117i0.AbstractC1861n1;
import p136j8.C2104o;
import p252r0.C3643b;
import tf.AbstractC4160g;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: o0.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3034f extends AbstractC4160g implements Collection, InterfaceC1712b {

    /* JADX INFO: renamed from: g */
    public AbstractC3031c f9843g;

    /* JADX INFO: renamed from: h */
    public Object[] f9844h;

    /* JADX INFO: renamed from: i */
    public Object[] f9845i;

    /* JADX INFO: renamed from: j */
    public int f9846j;

    /* JADX INFO: renamed from: k */
    public C3643b f9847k = new C3643b();

    /* JADX INFO: renamed from: l */
    public Object[] f9848l;

    /* JADX INFO: renamed from: m */
    public Object[] f9849m;

    /* JADX INFO: renamed from: n */
    public int f9850n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3034f(AbstractC3031c abstractC3031c, Object[] objArr, Object[] objArr2, int i9) {
        this.f9843g = abstractC3031c;
        this.f9844h = objArr;
        this.f9845i = objArr2;
        this.f9846j = i9;
        this.f9848l = objArr;
        this.f9849m = objArr2;
        this.f9850n = abstractC3031c.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m6450e(Object[] objArr, int i9, Iterator it) {
        while (i9 < 32 && it.hasNext()) {
            objArr[i9] = it.next();
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final Object[] m6451A(Object[] objArr, int i9, int i10, C1577f c1577f) {
        int iM3608x = AbstractC1341a.m3608x(i10, i9);
        if (i9 == 0) {
            Object obj = objArr[iM3608x];
            Object[] objArrM6466l = m6466l(objArr);
            AbstractC4165l.m8379n0(iM3608x, iM3608x + 1, objArr, 32, objArrM6466l);
            objArrM6466l[31] = c1577f.f5247a;
            c1577f.f5247a = obj;
            return objArrM6466l;
        }
        int iM3608x2 = objArr[31] == null ? AbstractC1341a.m3608x(m6453C() - 1, i9) : 31;
        Object[] objArrM6466l2 = m6466l(objArr);
        int i11 = i9 - 5;
        int i12 = iM3608x + 1;
        if (i12 <= iM3608x2) {
            while (true) {
                Object obj2 = objArrM6466l2[iM3608x2];
                obj2.getClass();
                objArrM6466l2[iM3608x2] = m6451A((Object[]) obj2, i11, 0, c1577f);
                if (iM3608x2 == i12) {
                    break;
                }
                iM3608x2--;
            }
        }
        Object obj3 = objArrM6466l2[iM3608x];
        obj3.getClass();
        objArrM6466l2[iM3608x] = m6451A((Object[]) obj3, i11, i10, c1577f);
        return objArrM6466l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final Object m6452B(Object[] objArr, int i9, int i10, int i11) {
        int i12 = this.f9850n - i9;
        Object[] objArr2 = this.f9849m;
        if (i12 == 1) {
            Object obj = objArr2[0];
            m6472r(objArr, i9, i10);
            return obj;
        }
        Object obj2 = objArr2[i11];
        Object[] objArrM6466l = m6466l(objArr2);
        AbstractC4165l.m8379n0(i11, i11 + 1, objArr2, i12, objArrM6466l);
        objArrM6466l[i12 - 1] = null;
        this.f9848l = objArr;
        this.f9849m = objArrM6466l;
        this.f9850n = (i9 + i12) - 1;
        this.f9846j = i10;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final int m6453C() {
        int i9 = this.f9850n;
        if (i9 <= 32) {
            return 0;
        }
        return (i9 - 1) & (-32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final Object[] m6454D(Object[] objArr, int i9, int i10, Object obj, C1577f c1577f) {
        int iM3608x = AbstractC1341a.m3608x(i10, i9);
        Object[] objArrM6466l = m6466l(objArr);
        if (i9 != 0) {
            Object obj2 = objArrM6466l[iM3608x];
            obj2.getClass();
            objArrM6466l[iM3608x] = m6454D((Object[]) obj2, i9 - 5, i10, obj, c1577f);
            return objArrM6466l;
        }
        if (objArrM6466l != objArr) {
            ((AbstractList) this).modCount++;
        }
        c1577f.f5247a = objArrM6466l[iM3608x];
        objArrM6466l[iM3608x] = obj;
        return objArrM6466l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final void m6455E(Collection collection, int i9, Object[] objArr, int i10, Object[][] objArr2, int i11, Object[] objArr3) {
        Object[] objArrM6468n;
        if (i11 < 1) {
            AbstractC1861n1.m4583a("requires at least one nullBuffer");
        }
        Object[] objArrM6466l = m6466l(objArr);
        objArr2[0] = objArrM6466l;
        int i12 = i9 & 31;
        int size = ((collection.size() + i9) - 1) & 31;
        int i13 = (i10 - i12) + size;
        if (i13 < 32) {
            AbstractC4165l.m8379n0(size + 1, i12, objArrM6466l, i10, objArr3);
        } else {
            int i14 = i13 - 31;
            if (i11 == 1) {
                objArrM6468n = objArrM6466l;
            } else {
                objArrM6468n = m6468n();
                i11--;
                objArr2[i11] = objArrM6468n;
            }
            int i15 = i10 - i14;
            AbstractC4165l.m8379n0(0, i15, objArrM6466l, i10, objArr3);
            AbstractC4165l.m8379n0(size + 1, i12, objArrM6466l, i15, objArrM6468n);
            objArr3 = objArrM6468n;
        }
        Iterator it = collection.iterator();
        m6450e(objArrM6466l, i12, it);
        for (int i16 = 1; i16 < i11; i16++) {
            Object[] objArrM6468n2 = m6468n();
            m6450e(objArrM6468n2, 0, it);
            objArr2[i16] = objArrM6468n2;
        }
        m6450e(objArr3, 0, it);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final int m6456F() {
        int i9 = this.f9850n;
        return i9 <= 32 ? i9 : i9 - ((i9 - 1) & (-32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4160g
    /* JADX INFO: renamed from: a */
    public final int mo6457a() {
        return this.f9850n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        AbstractC0283h.m1173n(i9, mo6457a());
        if (i9 == mo6457a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM6453C = m6453C();
        if (i9 >= iM6453C) {
            m6463i(obj, i9 - iM6453C, this.f9848l);
            return;
        }
        C1577f c1577f = new C1577f(null);
        Object[] objArr = this.f9848l;
        objArr.getClass();
        m6463i(c1577f.f5247a, 0, m6462h(objArr, this.f9846j, i9, obj, c1577f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection collection) {
        Collection collection2;
        C3034f c3034f;
        Object[] objArrM6468n;
        AbstractC0283h.m1173n(i9, this.f9850n);
        if (i9 == this.f9850n) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i10 = (i9 >> 5) << 5;
        int size = ((collection.size() + (this.f9850n - i10)) - 1) / 32;
        if (size == 0) {
            int i11 = i9 & 31;
            int size2 = ((collection.size() + i9) - 1) & 31;
            Object[] objArr = this.f9849m;
            Object[] objArrM6466l = m6466l(objArr);
            AbstractC4165l.m8379n0(size2 + 1, i11, objArr, m6456F(), objArrM6466l);
            m6450e(objArrM6466l, i11, collection.iterator());
            this.f9849m = objArrM6466l;
            this.f9850n = collection.size() + this.f9850n;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM6456F = m6456F();
        int size3 = collection.size() + this.f9850n;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i9 >= m6453C()) {
            objArrM6468n = m6468n();
            collection2 = collection;
            m6455E(collection2, i9, this.f9849m, iM6456F, objArr2, size, objArrM6468n);
            c3034f = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            c3034f = this;
            Object[] objArr3 = c3034f.f9849m;
            if (size3 > iM6456F) {
                int i12 = size3 - iM6456F;
                Object[] objArrM6467m = m6467m(i12, objArr3);
                c3034f.m6461g(collection2, i9, i12, objArr2, size, objArrM6467m);
                objArr2 = objArr2;
                objArrM6468n = objArrM6467m;
            } else {
                objArrM6468n = m6468n();
                int i13 = iM6456F - size3;
                AbstractC4165l.m8379n0(0, i13, objArr3, iM6456F, objArrM6468n);
                int i14 = 32 - i13;
                Object[] objArrM6467m2 = m6467m(i14, c3034f.f9849m);
                int i15 = size - 1;
                objArr2[i15] = objArrM6467m2;
                c3034f.m6461g(collection2, i9, i14, objArr2, i15, objArrM6467m2);
                collection2 = collection2;
            }
        }
        c3034f.f9848l = m6474t(c3034f.f9848l, i10, objArr2);
        c3034f.f9849m = objArrM6468n;
        c3034f.f9850n = collection2.size() + c3034f.f9850n;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4160g
    /* JADX INFO: renamed from: c */
    public final Object mo6458c(int i9) {
        AbstractC0283h.m1171m(i9, mo6457a());
        ((AbstractList) this).modCount++;
        int iM6453C = m6453C();
        if (i9 >= iM6453C) {
            return m6452B(this.f9848l, iM6453C, this.f9846j, i9 - iM6453C);
        }
        C1577f c1577f = new C1577f(this.f9849m[0]);
        Object[] objArr = this.f9848l;
        objArr.getClass();
        m6452B(m6451A(objArr, this.f9846j, i9, c1577f), iM6453C, this.f9846j, 0);
        return c1577f.f5247a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final AbstractC3031c m6459d() {
        AbstractC3031c c3037i;
        Object[] objArr = this.f9848l;
        if (objArr == this.f9844h && this.f9849m == this.f9845i) {
            c3037i = this.f9843g;
        } else {
            this.f9847k = new C3643b();
            this.f9844h = objArr;
            Object[] objArr2 = this.f9849m;
            this.f9845i = objArr2;
            c3037i = objArr == null ? objArr2.length == 0 ? C3037i.f9857h : new C3037i(Arrays.copyOf(objArr2, this.f9850n)) : new C3033e(objArr, objArr2, this.f9850n, this.f9846j);
        }
        this.f9843g = c3037i;
        return c3037i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m6460f() {
        return ((AbstractList) this).modCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m6461g(Collection collection, int i9, int i10, Object[][] objArr, int i11, Object[] objArr2) {
        if (this.f9848l == null) {
            C2104o.m5276A("root is null");
            return;
        }
        int i12 = i9 >> 5;
        AbstractC3029a abstractC3029aM6465k = m6465k(m6453C() >> 5);
        int i13 = i11;
        Object[] objArrM6467m = objArr2;
        while (abstractC3029aM6465k.f9833g - 1 != i12) {
            Object[] objArr3 = (Object[]) abstractC3029aM6465k.previous();
            AbstractC4165l.m8379n0(0, 32 - i10, objArr3, 32, objArrM6467m);
            objArrM6467m = m6467m(i10, objArr3);
            i13--;
            objArr[i13] = objArrM6467m;
        }
        Object[] objArr4 = (Object[]) abstractC3029aM6465k.previous();
        int iM6453C = i11 - (((m6453C() >> 5) - 1) - i12);
        if (iM6453C < i11) {
            objArr2 = objArr[iM6453C];
            objArr2.getClass();
        }
        m6455E(collection, i9, objArr4, 32, objArr, iM6453C, objArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        Object[] objArr;
        AbstractC0283h.m1171m(i9, mo6457a());
        if (m6453C() <= i9) {
            objArr = this.f9849m;
        } else {
            objArr = this.f9848l;
            objArr.getClass();
            for (int i10 = this.f9846j; i10 > 0; i10 -= 5) {
                Object obj = objArr[AbstractC1341a.m3608x(i9, i10)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i9 & 31];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final Object[] m6462h(Object[] objArr, int i9, int i10, Object obj, C1577f c1577f) {
        Object obj2;
        int iM3608x = AbstractC1341a.m3608x(i10, i9);
        if (i9 == 0) {
            c1577f.f5247a = objArr[31];
            Object[] objArrM6466l = m6466l(objArr);
            AbstractC4165l.m8379n0(iM3608x + 1, iM3608x, objArr, 31, objArrM6466l);
            objArrM6466l[iM3608x] = obj;
            return objArrM6466l;
        }
        Object[] objArrM6466l2 = m6466l(objArr);
        int i11 = i9 - 5;
        Object obj3 = objArrM6466l2[iM3608x];
        obj3.getClass();
        objArrM6466l2[iM3608x] = m6462h((Object[]) obj3, i11, i10, obj, c1577f);
        while (true) {
            iM3608x++;
            if (iM3608x >= 32 || (obj2 = objArrM6466l2[iM3608x]) == null) {
                break;
            }
            objArrM6466l2[iM3608x] = m6462h((Object[]) obj2, i11, 0, c1577f.f5247a, c1577f);
        }
        return objArrM6466l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m6463i(Object obj, int i9, Object[] objArr) {
        int iM6456F = m6456F();
        Object[] objArrM6466l = m6466l(this.f9849m);
        Object[] objArr2 = this.f9849m;
        if (iM6456F >= 32) {
            Object obj2 = objArr2[31];
            AbstractC4165l.m8379n0(i9 + 1, i9, objArr2, 31, objArrM6466l);
            objArrM6466l[i9] = obj;
            m6475u(objArr, objArrM6466l, m6469o(obj2));
            return;
        }
        AbstractC4165l.m8379n0(i9 + 1, i9, objArr2, iM6456F, objArrM6466l);
        objArrM6466l[i9] = obj;
        this.f9848l = objArr;
        this.f9849m = objArrM6466l;
        this.f9850n++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m6464j(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f9847k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final AbstractC3029a m6465k(int i9) {
        Object[] objArr = this.f9848l;
        if (objArr == null) {
            C2104o.m5276A("Invalid root");
            return null;
        }
        int iM6453C = m6453C() >> 5;
        AbstractC0283h.m1173n(i9, iM6453C);
        int i10 = this.f9846j;
        return i10 == 0 ? new C3032d(objArr, i9) : new C3038j(objArr, i9, iM6453C, i10 / 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final Object[] m6466l(Object[] objArr) {
        if (objArr == null) {
            return m6468n();
        }
        if (m6464j(objArr)) {
            return objArr;
        }
        Object[] objArrM6468n = m6468n();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC4165l.m8383r0(0, length, objArr, 6, objArrM6468n);
        return objArrM6468n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        AbstractC0283h.m1173n(i9, this.f9850n);
        return new C3036h(this, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final Object[] m6467m(int i9, Object[] objArr) {
        if (m6464j(objArr)) {
            AbstractC4165l.m8379n0(i9, 0, objArr, 32 - i9, objArr);
            return objArr;
        }
        Object[] objArrM6468n = m6468n();
        AbstractC4165l.m8379n0(i9, 0, objArr, 32 - i9, objArrM6468n);
        return objArrM6468n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final Object[] m6468n() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f9847k;
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final Object[] m6469o(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f9847k;
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final Object[] m6470p(Object[] objArr, int i9, int i10) {
        if (i10 < 0) {
            AbstractC1861n1.m4583a("shift should be positive");
        }
        if (i10 == 0) {
            return objArr;
        }
        int iM3608x = AbstractC1341a.m3608x(i9, i10);
        Object obj = objArr[iM3608x];
        obj.getClass();
        Object objM6470p = m6470p((Object[]) obj, i9, i10 - 5);
        if (iM3608x < 31) {
            int i11 = iM3608x + 1;
            if (objArr[i11] != null) {
                if (m6464j(objArr)) {
                    Arrays.fill(objArr, i11, 32, (Object) null);
                }
                Object[] objArrM6468n = m6468n();
                AbstractC4165l.m8379n0(0, 0, objArr, i11, objArrM6468n);
                objArr = objArrM6468n;
            }
        }
        if (objM6470p == objArr[iM3608x]) {
            return objArr;
        }
        Object[] objArrM6466l = m6466l(objArr);
        objArrM6466l[iM3608x] = objM6470p;
        return objArrM6466l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final Object[] m6471q(Object[] objArr, int i9, int i10, C1577f c1577f) {
        Object[] objArrM6471q;
        int iM3608x = AbstractC1341a.m3608x(i10 - 1, i9);
        if (i9 == 5) {
            c1577f.f5247a = objArr[iM3608x];
            objArrM6471q = null;
        } else {
            Object obj = objArr[iM3608x];
            obj.getClass();
            objArrM6471q = m6471q((Object[]) obj, i9 - 5, i10, c1577f);
        }
        if (objArrM6471q == null && iM3608x == 0) {
            return null;
        }
        Object[] objArrM6466l = m6466l(objArr);
        objArrM6466l[iM3608x] = objArrM6471q;
        return objArrM6466l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m6472r(Object[] objArr, int i9, int i10) {
        if (i10 == 0) {
            this.f9848l = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f9849m = objArr;
            this.f9850n = i9;
            this.f9846j = i10;
            return;
        }
        C1577f c1577f = new C1577f(null);
        objArr.getClass();
        Object[] objArrM6471q = m6471q(objArr, i10, i9, c1577f);
        objArrM6471q.getClass();
        Object obj = c1577f.f5247a;
        obj.getClass();
        this.f9849m = (Object[]) obj;
        this.f9850n = i9;
        if (objArrM6471q[1] == null) {
            this.f9848l = (Object[]) objArrM6471q[0];
            this.f9846j = i10 - 5;
        } else {
            this.f9848l = objArrM6471q;
            this.f9846j = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m6480z(new C3030b(1, collection));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final Object[] m6473s(Object[] objArr, int i9, int i10, Iterator it) {
        if (!it.hasNext()) {
            AbstractC1861n1.m4583a("invalid buffersIterator");
        }
        if (!(i10 >= 0)) {
            AbstractC1861n1.m4583a("negative shift");
        }
        if (i10 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM6466l = m6466l(objArr);
        int iM3608x = AbstractC1341a.m3608x(i9, i10);
        int i11 = i10 - 5;
        objArrM6466l[iM3608x] = m6473s((Object[]) objArrM6466l[iM3608x], i9, i11, it);
        while (true) {
            iM3608x++;
            if (iM3608x >= 32 || !it.hasNext()) {
                break;
            }
            objArrM6466l[iM3608x] = m6473s((Object[]) objArrM6466l[iM3608x], 0, i11, it);
        }
        return objArrM6466l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        AbstractC0283h.m1171m(i9, mo6457a());
        if (m6453C() > i9) {
            C1577f c1577f = new C1577f(null);
            Object[] objArr = this.f9848l;
            objArr.getClass();
            this.f9848l = m6454D(objArr, this.f9846j, i9, obj, c1577f);
            return c1577f.f5247a;
        }
        Object[] objArrM6466l = m6466l(this.f9849m);
        if (objArrM6466l != this.f9849m) {
            ((AbstractList) this).modCount++;
        }
        int i10 = i9 & 31;
        Object obj2 = objArrM6466l[i10];
        objArrM6466l[i10] = obj;
        this.f9849m = objArrM6466l;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final Object[] m6474t(Object[] objArr, int i9, Object[][] objArr2) {
        C1406b c1406b = new C1406b(objArr2);
        int i10 = i9 >> 5;
        int i11 = this.f9846j;
        Object[] objArrM6473s = i10 < (1 << i11) ? m6473s(objArr, i9, i11, c1406b) : m6466l(objArr);
        while (c1406b.hasNext()) {
            this.f9846j += 5;
            objArrM6473s = m6469o(objArrM6473s);
            int i12 = this.f9846j;
            m6473s(objArrM6473s, 1 << i12, i12, c1406b);
        }
        return objArrM6473s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m6475u(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i9 = this.f9850n;
        int i10 = i9 >> 5;
        int i11 = this.f9846j;
        if (i10 > (1 << i11)) {
            this.f9848l = m6476v(this.f9846j + 5, m6469o(objArr), objArr2);
            this.f9849m = objArr3;
            this.f9846j += 5;
            this.f9850n++;
            return;
        }
        if (objArr == null) {
            this.f9848l = objArr2;
            this.f9849m = objArr3;
            this.f9850n = i9 + 1;
        } else {
            this.f9848l = m6476v(i11, objArr, objArr2);
            this.f9849m = objArr3;
            this.f9850n++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final Object[] m6476v(int i9, Object[] objArr, Object[] objArr2) {
        int iM3608x = AbstractC1341a.m3608x(mo6457a() - 1, i9);
        Object[] objArrM6466l = m6466l(objArr);
        if (i9 == 5) {
            objArrM6466l[iM3608x] = objArr2;
            return objArrM6466l;
        }
        objArrM6466l[iM3608x] = m6476v(i9 - 5, (Object[]) objArrM6466l[iM3608x], objArr2);
        return objArrM6466l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final int m6477w(InterfaceC1231l interfaceC1231l, Object[] objArr, int i9, int i10, C1577f c1577f, ArrayList arrayList, ArrayList arrayList2) {
        if (m6464j(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c1577f.f5247a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM6468n = objArr2;
        for (int i11 = 0; i11 < i9; i11++) {
            Object obj2 = objArr[i11];
            if (!((Boolean) interfaceC1231l.invoke(obj2)).booleanValue()) {
                if (i10 == 32) {
                    objArrM6468n = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m6468n();
                    i10 = 0;
                }
                objArrM6468n[i10] = obj2;
                i10++;
            }
        }
        c1577f.f5247a = objArrM6468n;
        if (objArr2 != objArrM6468n) {
            arrayList2.add(objArr2);
        }
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final int m6478x(InterfaceC1231l interfaceC1231l, Object[] objArr, int i9, C1577f c1577f) {
        Object[] objArrM6466l = objArr;
        int i10 = i9;
        boolean z9 = false;
        for (int i11 = 0; i11 < i9; i11++) {
            Object obj = objArr[i11];
            if (((Boolean) interfaceC1231l.invoke(obj)).booleanValue()) {
                if (!z9) {
                    objArrM6466l = m6466l(objArr);
                    z9 = true;
                    i10 = i11;
                }
            } else if (z9) {
                objArrM6466l[i10] = obj;
                i10++;
            }
        }
        c1577f.f5247a = objArrM6466l;
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final int m6479y(InterfaceC1231l interfaceC1231l, int i9, C1577f c1577f) {
        int iM6478x = m6478x(interfaceC1231l, this.f9849m, i9, c1577f);
        Object obj = c1577f.f5247a;
        if (iM6478x == i9) {
            return i9;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM6478x, i9, (Object) null);
        this.f9849m = objArr;
        this.f9850n -= i9 - iM6478x;
        return iM6478x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final boolean m6480z(InterfaceC1231l interfaceC1231l) {
        int i9;
        InterfaceC1231l interfaceC1231l2 = interfaceC1231l;
        int iM6456F = m6456F();
        Object[] objArrM6470p = null;
        C1577f c1577f = new C1577f(null);
        boolean z9 = false;
        if (this.f9848l != null) {
            AbstractC3029a abstractC3029aM6465k = m6465k(0);
            int iM6478x = 32;
            while (iM6478x == 32 && abstractC3029aM6465k.hasNext()) {
                iM6478x = m6478x(interfaceC1231l2, (Object[]) abstractC3029aM6465k.next(), 32, c1577f);
            }
            if (iM6478x == 32) {
                int iM6479y = m6479y(interfaceC1231l2, iM6456F, c1577f);
                if (iM6479y == 0) {
                    m6472r(this.f9848l, this.f9850n, this.f9846j);
                }
                if (iM6479y != iM6456F) {
                }
            } else {
                int i10 = (abstractC3029aM6465k.f9833g - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM6477w = iM6478x;
                while (abstractC3029aM6465k.hasNext()) {
                    iM6477w = m6477w(interfaceC1231l2, (Object[]) abstractC3029aM6465k.next(), 32, iM6477w, c1577f, arrayList2, arrayList);
                    interfaceC1231l2 = interfaceC1231l;
                }
                int iM6477w2 = m6477w(interfaceC1231l, this.f9849m, iM6456F, iM6477w, c1577f, arrayList2, arrayList);
                Object obj = c1577f.f5247a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM6477w2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrM6473s = this.f9848l;
                if (zIsEmpty) {
                    objArrM6473s.getClass();
                } else {
                    objArrM6473s = m6473s(objArrM6473s, i10, this.f9846j, arrayList.iterator());
                }
                int size = i10 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    AbstractC1861n1.m4583a("invalid size");
                }
                if (size == 0) {
                    this.f9846j = 0;
                } else {
                    int i11 = size - 1;
                    while (true) {
                        i9 = this.f9846j;
                        if ((i11 >> i9) != 0) {
                            break;
                        }
                        this.f9846j = i9 - 5;
                        Object[] objArr2 = objArrM6473s[0];
                        objArr2.getClass();
                        objArrM6473s = objArr2;
                    }
                    objArrM6470p = m6470p(objArrM6473s, i11, i9);
                }
                this.f9848l = objArrM6470p;
                this.f9849m = objArr;
                this.f9850n = size + iM6477w2;
            }
            z9 = true;
        } else if (m6479y(interfaceC1231l2, iM6456F, c1577f) != iM6456F) {
            z9 = true;
        }
        if (z9) {
            ((AbstractList) this).modCount++;
        }
        return z9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM6456F = m6456F();
        if (iM6456F < 32) {
            Object[] objArrM6466l = m6466l(this.f9849m);
            objArrM6466l[iM6456F] = obj;
            this.f9849m = objArrM6466l;
            this.f9850n = mo6457a() + 1;
        } else {
            m6475u(this.f9848l, this.f9849m, m6469o(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM6456F = m6456F();
        Iterator it = collection.iterator();
        if (32 - iM6456F >= collection.size()) {
            Object[] objArrM6466l = m6466l(this.f9849m);
            m6450e(objArrM6466l, iM6456F, it);
            this.f9849m = objArrM6466l;
            this.f9850n = collection.size() + this.f9850n;
            return true;
        }
        int size = ((collection.size() + iM6456F) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM6466l2 = m6466l(this.f9849m);
        m6450e(objArrM6466l2, iM6456F, it);
        objArr[0] = objArrM6466l2;
        for (int i9 = 1; i9 < size; i9++) {
            Object[] objArrM6468n = m6468n();
            m6450e(objArrM6468n, 0, it);
            objArr[i9] = objArrM6468n;
        }
        this.f9848l = m6474t(this.f9848l, m6453C(), objArr);
        Object[] objArrM6468n2 = m6468n();
        m6450e(objArrM6468n2, 0, it);
        this.f9849m = objArrM6468n2;
        this.f9850n = collection.size() + this.f9850n;
        return true;
    }
}
