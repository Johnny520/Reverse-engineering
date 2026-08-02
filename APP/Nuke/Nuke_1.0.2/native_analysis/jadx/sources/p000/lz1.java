package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lz1 extends AbstractC0947z2 implements Collection, q41 {

    /* JADX INFO: renamed from: h */
    public AbstractC0077c3 f6406h;

    /* JADX INFO: renamed from: i */
    public Object[] f6407i;

    /* JADX INFO: renamed from: j */
    public Object[] f6408j;

    /* JADX INFO: renamed from: k */
    public int f6409k;

    /* JADX INFO: renamed from: l */
    public i51 f6410l = new i51(6);

    /* JADX INFO: renamed from: m */
    public Object[] f6411m;

    /* JADX INFO: renamed from: n */
    public Object[] f6412n;

    /* JADX INFO: renamed from: o */
    public int f6413o;

    public lz1(AbstractC0077c3 abstractC0077c3, Object[] objArr, Object[] objArr2, int i) {
        this.f6406h = abstractC0077c3;
        this.f6407i = objArr;
        this.f6408j = objArr2;
        this.f6409k = i;
        this.f6411m = objArr;
        this.f6412n = objArr2;
        this.f6413o = abstractC0077c3.mo529a();
    }

    /* JADX INFO: renamed from: d */
    public static void m2991d(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* JADX INFO: renamed from: A */
    public final Object m2992A(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f6413o - i;
        Object[] objArr2 = this.f6412n;
        if (i4 == 1) {
            Object obj = objArr2[0];
            m3010q(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrM3004k = m3004k(objArr2);
        AbstractC0460mg.m3088c0(objArr2, objArrM3004k, i3, i3 + 1, i4);
        objArrM3004k[i4 - 1] = null;
        this.f6411m = objArr;
        this.f6412n = objArrM3004k;
        this.f6413o = (i + i4) - 1;
        this.f6409k = i2;
        return obj2;
    }

    /* JADX INFO: renamed from: B */
    public final int m2993B() {
        int i = this.f6413o;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    /* JADX INFO: renamed from: C */
    public final Object[] m2994C(Object[] objArr, int i, int i2, Object obj, C0374k4 c0374k4) {
        int iM2346a = ig3.m2346a(i2, i);
        Object[] objArrM3004k = m3004k(objArr);
        if (i != 0) {
            Object obj2 = objArrM3004k[iM2346a];
            obj2.getClass();
            objArrM3004k[iM2346a] = m2994C((Object[]) obj2, i - 5, i2, obj, c0374k4);
            return objArrM3004k;
        }
        if (objArrM3004k != objArr) {
            ((AbstractList) this).modCount++;
        }
        c0374k4.f5331h = objArrM3004k[iM2346a];
        objArrM3004k[iM2346a] = obj;
        return objArrM3004k;
    }

    /* JADX INFO: renamed from: D */
    public final void m2995D(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM3006m;
        if (i3 < 1) {
            j22.m2429a("requires at least one nullBuffer");
        }
        Object[] objArrM3004k = m3004k(objArr);
        objArr2[0] = objArrM3004k;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            AbstractC0460mg.m3088c0(objArrM3004k, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM3006m = objArrM3004k;
            } else {
                objArrM3006m = m3006m();
                i3--;
                objArr2[i3] = objArrM3006m;
            }
            int i7 = i2 - i6;
            AbstractC0460mg.m3088c0(objArrM3004k, objArr3, 0, i7, i2);
            AbstractC0460mg.m3088c0(objArrM3004k, objArrM3006m, size + 1, i4, i7);
            objArr3 = objArrM3006m;
        }
        Iterator it = collection.iterator();
        m2991d(objArrM3004k, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM3006m2 = m3006m();
            m2991d(objArrM3006m2, 0, it);
            objArr2[i8] = objArrM3006m2;
        }
        m2991d(objArr3, 0, it);
    }

    /* JADX INFO: renamed from: E */
    public final int m2996E() {
        int i = this.f6413o;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // p000.AbstractC0947z2
    /* JADX INFO: renamed from: a */
    public final int mo152a() {
        return this.f6413o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        up0.m5548m(i, mo152a());
        if (i == mo152a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM2993B = m2993B();
        if (i >= iM2993B) {
            m3001h(this.f6411m, i - iM2993B, obj);
            return;
        }
        C0374k4 c0374k4 = new C0374k4(null);
        Object[] objArr = this.f6411m;
        objArr.getClass();
        m3001h(m3000g(objArr, this.f6409k, i, obj, c0374k4), 0, c0374k4.f5331h);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrM3006m;
        up0.m5548m(i, this.f6413o);
        if (i == this.f6413o) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f6413o - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f6412n;
            Object[] objArrM3004k = m3004k(objArr);
            AbstractC0460mg.m3088c0(objArr, objArrM3004k, size2 + 1, i3, m2996E());
            m2991d(objArrM3004k, i3, collection.iterator());
            this.f6412n = objArrM3004k;
            this.f6413o = collection.size() + this.f6413o;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM2996E = m2996E();
        int size3 = collection.size() + this.f6413o;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= m2993B()) {
            objArrM3006m = m3006m();
            collection2 = collection;
            m2995D(collection2, i, this.f6412n, iM2996E, objArr2, size, objArrM3006m);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.f6412n;
            if (size3 > iM2996E) {
                int i4 = size3 - iM2996E;
                Object[] objArrM3005l = m3005l(i4, objArr3);
                m2999f(collection2, i, i4, objArr2, size, objArrM3005l);
                objArr2 = objArr2;
                objArrM3006m = objArrM3005l;
            } else {
                objArrM3006m = m3006m();
                int i5 = iM2996E - size3;
                AbstractC0460mg.m3088c0(objArr3, objArrM3006m, 0, i5, iM2996E);
                int i6 = 32 - i5;
                Object[] objArrM3005l2 = m3005l(i6, this.f6412n);
                int i7 = size - 1;
                objArr2[i7] = objArrM3005l2;
                m2999f(collection2, i, i6, objArr2, i7, objArrM3005l2);
                collection2 = collection2;
            }
        }
        this.f6411m = m3012s(this.f6411m, i2, objArr2);
        this.f6412n = objArrM3006m;
        this.f6413o = collection2.size() + this.f6413o;
        return true;
    }

    @Override // p000.AbstractC0947z2
    /* JADX INFO: renamed from: b */
    public final Object mo153b(int i) {
        up0.m5546k(i, mo152a());
        ((AbstractList) this).modCount++;
        int iM2993B = m2993B();
        if (i >= iM2993B) {
            return m2992A(this.f6411m, iM2993B, this.f6409k, i - iM2993B);
        }
        C0374k4 c0374k4 = new C0374k4(this.f6412n[0]);
        Object[] objArr = this.f6411m;
        objArr.getClass();
        m2992A(m3019z(objArr, this.f6409k, i, c0374k4), iM2993B, this.f6409k, 0);
        return c0374k4.f5331h;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0077c3 m2997c() {
        AbstractC0077c3 ur2Var;
        Object[] objArr = this.f6411m;
        if (objArr == this.f6407i && this.f6412n == this.f6408j) {
            ur2Var = this.f6406h;
        } else {
            this.f6410l = new i51(6);
            this.f6407i = objArr;
            Object[] objArr2 = this.f6412n;
            this.f6408j = objArr2;
            ur2Var = objArr == null ? objArr2.length == 0 ? ur2.f11454i : new ur2(Arrays.copyOf(objArr2, this.f6413o)) : new kz1(objArr, objArr2, this.f6413o, this.f6409k);
        }
        this.f6406h = ur2Var;
        return ur2Var;
    }

    /* JADX INFO: renamed from: e */
    public final int m2998e() {
        return ((AbstractList) this).modCount;
    }

    /* JADX INFO: renamed from: f */
    public final void m2999f(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f6411m == null) {
            C0676s.m4653l("root is null");
            return;
        }
        int i4 = i >> 5;
        AbstractC0869x2 abstractC0869x2M3003j = m3003j(m2993B() >> 5);
        int i5 = i3;
        Object[] objArrM3005l = objArr2;
        while (abstractC0869x2M3003j.f12770h - 1 != i4) {
            Object[] objArr3 = (Object[]) abstractC0869x2M3003j.previous();
            AbstractC0460mg.m3088c0(objArr3, objArrM3005l, 0, 32 - i2, 32);
            objArrM3005l = m3005l(i2, objArr3);
            i5--;
            objArr[i5] = objArrM3005l;
        }
        Object[] objArr4 = (Object[]) abstractC0869x2M3003j.previous();
        int iM2993B = i3 - (((m2993B() >> 5) - 1) - i4);
        if (iM2993B < i3) {
            objArr2 = objArr[iM2993B];
            objArr2.getClass();
        }
        m2995D(collection, i, objArr4, 32, objArr, iM2993B, objArr2);
    }

    /* JADX INFO: renamed from: g */
    public final Object[] m3000g(Object[] objArr, int i, int i2, Object obj, C0374k4 c0374k4) {
        Object obj2;
        int iM2346a = ig3.m2346a(i2, i);
        if (i == 0) {
            c0374k4.f5331h = objArr[31];
            Object[] objArrM3004k = m3004k(objArr);
            AbstractC0460mg.m3088c0(objArr, objArrM3004k, iM2346a + 1, iM2346a, 31);
            objArrM3004k[iM2346a] = obj;
            return objArrM3004k;
        }
        Object[] objArrM3004k2 = m3004k(objArr);
        int i3 = i - 5;
        Object obj3 = objArrM3004k2[iM2346a];
        obj3.getClass();
        objArrM3004k2[iM2346a] = m3000g((Object[]) obj3, i3, i2, obj, c0374k4);
        while (true) {
            iM2346a++;
            if (iM2346a >= 32 || (obj2 = objArrM3004k2[iM2346a]) == null) {
                break;
            }
            objArrM3004k2[iM2346a] = m3000g((Object[]) obj2, i3, 0, c0374k4.f5331h, c0374k4);
        }
        return objArrM3004k2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        up0.m5546k(i, mo152a());
        if (m2993B() <= i) {
            objArr = this.f6412n;
        } else {
            Object[] objArr2 = this.f6411m;
            objArr2.getClass();
            for (int i2 = this.f6409k; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[ig3.m2346a(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    /* JADX INFO: renamed from: h */
    public final void m3001h(Object[] objArr, int i, Object obj) {
        int iM2996E = m2996E();
        Object[] objArrM3004k = m3004k(this.f6412n);
        Object[] objArr2 = this.f6412n;
        if (iM2996E >= 32) {
            Object obj2 = objArr2[31];
            AbstractC0460mg.m3088c0(objArr2, objArrM3004k, i + 1, i, 31);
            objArrM3004k[i] = obj;
            m3013t(objArr, objArrM3004k, m3007n(obj2));
            return;
        }
        AbstractC0460mg.m3088c0(objArr2, objArrM3004k, i + 1, i, iM2996E);
        objArrM3004k[i] = obj;
        this.f6411m = objArr;
        this.f6412n = objArrM3004k;
        this.f6413o++;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3002i(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f6410l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC0869x2 m3003j(int i) {
        Object[] objArr = this.f6411m;
        if (objArr == null) {
            C0676s.m4653l("Invalid root");
            return null;
        }
        int iM2993B = m2993B() >> 5;
        up0.m5548m(i, iM2993B);
        int i2 = this.f6409k;
        return i2 == 0 ? new C0246gn(i, objArr) : new g43(objArr, i, iM2993B, i2 / 5);
    }

    /* JADX INFO: renamed from: k */
    public final Object[] m3004k(Object[] objArr) {
        if (objArr == null) {
            return m3006m();
        }
        if (m3002i(objArr)) {
            return objArr;
        }
        Object[] objArrM3006m = m3006m();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC0460mg.m3091f0(objArr, objArrM3006m, 0, length, 6);
        return objArrM3006m;
    }

    /* JADX INFO: renamed from: l */
    public final Object[] m3005l(int i, Object[] objArr) {
        if (m3002i(objArr)) {
            AbstractC0460mg.m3088c0(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] objArrM3006m = m3006m();
        AbstractC0460mg.m3088c0(objArr, objArrM3006m, i, 0, 32 - i);
        return objArrM3006m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        up0.m5548m(i, this.f6413o);
        return new nz1(this, i);
    }

    /* JADX INFO: renamed from: m */
    public final Object[] m3006m() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f6410l;
        return objArr;
    }

    /* JADX INFO: renamed from: n */
    public final Object[] m3007n(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f6410l;
        return objArr;
    }

    /* JADX INFO: renamed from: o */
    public final Object[] m3008o(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            j22.m2429a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iM2346a = ig3.m2346a(i, i2);
        Object obj = objArr[iM2346a];
        obj.getClass();
        Object objM3008o = m3008o((Object[]) obj, i, i2 - 5);
        if (iM2346a < 31) {
            int i3 = iM2346a + 1;
            if (objArr[i3] != null) {
                if (m3002i(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM3006m = m3006m();
                AbstractC0460mg.m3088c0(objArr, objArrM3006m, 0, 0, i3);
                objArr = objArrM3006m;
            }
        }
        if (objM3008o == objArr[iM2346a]) {
            return objArr;
        }
        Object[] objArrM3004k = m3004k(objArr);
        objArrM3004k[iM2346a] = objM3008o;
        return objArrM3004k;
    }

    /* JADX INFO: renamed from: p */
    public final Object[] m3009p(Object[] objArr, int i, int i2, C0374k4 c0374k4) {
        Object[] objArrM3009p;
        int iM2346a = ig3.m2346a(i2 - 1, i);
        if (i == 5) {
            c0374k4.f5331h = objArr[iM2346a];
            objArrM3009p = null;
        } else {
            Object obj = objArr[iM2346a];
            obj.getClass();
            objArrM3009p = m3009p((Object[]) obj, i - 5, i2, c0374k4);
        }
        if (objArrM3009p == null && iM2346a == 0) {
            return null;
        }
        Object[] objArrM3004k = m3004k(objArr);
        objArrM3004k[iM2346a] = objArrM3009p;
        return objArrM3004k;
    }

    /* JADX INFO: renamed from: q */
    public final void m3010q(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f6411m = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f6412n = objArr;
            this.f6413o = i;
            this.f6409k = i2;
            return;
        }
        C0374k4 c0374k4 = new C0374k4(null);
        objArr.getClass();
        Object[] objArrM3009p = m3009p(objArr, i2, i, c0374k4);
        objArrM3009p.getClass();
        Object obj = c0374k4.f5331h;
        obj.getClass();
        this.f6412n = (Object[]) obj;
        this.f6413o = i;
        if (objArrM3009p[1] == null) {
            this.f6411m = (Object[]) objArrM3009p[0];
            this.f6409k = i2 - 5;
        } else {
            this.f6411m = objArrM3009p;
            this.f6409k = i2;
        }
    }

    /* JADX INFO: renamed from: r */
    public final Object[] m3011r(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            j22.m2429a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            j22.m2429a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM3004k = m3004k(objArr);
        int iM2346a = ig3.m2346a(i, i2);
        int i3 = i2 - 5;
        objArrM3004k[iM2346a] = m3011r((Object[]) objArrM3004k[iM2346a], i, i3, it);
        while (true) {
            iM2346a++;
            if (iM2346a >= 32 || !it.hasNext()) {
                break;
            }
            objArrM3004k[iM2346a] = m3011r((Object[]) objArrM3004k[iM2346a], 0, i3, it);
        }
        return objArrM3004k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m3018y(new C0041b3(1, collection));
    }

    /* JADX INFO: renamed from: s */
    public final Object[] m3012s(Object[] objArr, int i, Object[][] objArr2) {
        C0717t2 c0717t2 = new C0717t2(objArr2);
        int i2 = i >> 5;
        int i3 = this.f6409k;
        Object[] objArrM3011r = i2 < (1 << i3) ? m3011r(objArr, i, i3, c0717t2) : m3004k(objArr);
        while (c0717t2.hasNext()) {
            this.f6409k += 5;
            objArrM3011r = m3007n(objArrM3011r);
            int i4 = this.f6409k;
            m3011r(objArrM3011r, 1 << i4, i4, c0717t2);
        }
        return objArrM3011r;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        up0.m5546k(i, mo152a());
        if (m2993B() > i) {
            C0374k4 c0374k4 = new C0374k4(null);
            Object[] objArr = this.f6411m;
            objArr.getClass();
            this.f6411m = m2994C(objArr, this.f6409k, i, obj, c0374k4);
            return c0374k4.f5331h;
        }
        Object[] objArrM3004k = m3004k(this.f6412n);
        if (objArrM3004k != this.f6412n) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrM3004k[i2];
        objArrM3004k[i2] = obj;
        this.f6412n = objArrM3004k;
        return obj2;
    }

    /* JADX INFO: renamed from: t */
    public final void m3013t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f6413o;
        int i2 = i >> 5;
        int i3 = this.f6409k;
        if (i2 > (1 << i3)) {
            this.f6411m = m3014u(this.f6409k + 5, m3007n(objArr), objArr2);
            this.f6412n = objArr3;
            this.f6409k += 5;
            this.f6413o++;
            return;
        }
        if (objArr == null) {
            this.f6411m = objArr2;
            this.f6412n = objArr3;
            this.f6413o = i + 1;
        } else {
            this.f6411m = m3014u(i3, objArr, objArr2);
            this.f6412n = objArr3;
            this.f6413o++;
        }
    }

    /* JADX INFO: renamed from: u */
    public final Object[] m3014u(int i, Object[] objArr, Object[] objArr2) {
        int iM2346a = ig3.m2346a(mo152a() - 1, i);
        Object[] objArrM3004k = m3004k(objArr);
        if (i == 5) {
            objArrM3004k[iM2346a] = objArr2;
            return objArrM3004k;
        }
        objArrM3004k[iM2346a] = m3014u(i - 5, (Object[]) objArrM3004k[iM2346a], objArr2);
        return objArrM3004k;
    }

    /* JADX INFO: renamed from: v */
    public final int m3015v(in0 in0Var, Object[] objArr, int i, int i2, C0374k4 c0374k4, ArrayList arrayList, ArrayList arrayList2) {
        if (m3002i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c0374k4.f5331h;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM3006m = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) in0Var.mo5j(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrM3006m = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m3006m();
                    i2 = 0;
                }
                objArrM3006m[i2] = obj2;
                i2++;
            }
        }
        c0374k4.f5331h = objArrM3006m;
        if (objArr2 != objArrM3006m) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX INFO: renamed from: w */
    public final int m3016w(in0 in0Var, Object[] objArr, int i, C0374k4 c0374k4) {
        Object[] objArrM3004k = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) in0Var.mo5j(obj)).booleanValue()) {
                if (!z) {
                    objArrM3004k = m3004k(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrM3004k[i2] = obj;
                i2++;
            }
        }
        c0374k4.f5331h = objArrM3004k;
        return i2;
    }

    /* JADX INFO: renamed from: x */
    public final int m3017x(in0 in0Var, int i, C0374k4 c0374k4) {
        int iM3016w = m3016w(in0Var, this.f6412n, i, c0374k4);
        Object obj = c0374k4.f5331h;
        if (iM3016w == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM3016w, i, (Object) null);
        this.f6412n = objArr;
        this.f6413o -= i - iM3016w;
        return iM3016w;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m3018y(in0 in0Var) {
        int i;
        in0 in0Var2 = in0Var;
        int iM2996E = m2996E();
        Object[] objArrM3008o = null;
        C0374k4 c0374k4 = new C0374k4(null);
        boolean z = false;
        if (this.f6411m != null) {
            AbstractC0869x2 abstractC0869x2M3003j = m3003j(0);
            int iM3016w = 32;
            while (iM3016w == 32 && abstractC0869x2M3003j.hasNext()) {
                iM3016w = m3016w(in0Var2, (Object[]) abstractC0869x2M3003j.next(), 32, c0374k4);
            }
            if (iM3016w == 32) {
                int iM3017x = m3017x(in0Var2, iM2996E, c0374k4);
                if (iM3017x == 0) {
                    m3010q(this.f6411m, this.f6413o, this.f6409k);
                }
                if (iM3017x != iM2996E) {
                }
            } else {
                int i2 = (abstractC0869x2M3003j.f12770h - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM3015v = iM3016w;
                while (abstractC0869x2M3003j.hasNext()) {
                    iM3015v = m3015v(in0Var2, (Object[]) abstractC0869x2M3003j.next(), 32, iM3015v, c0374k4, arrayList2, arrayList);
                    in0Var2 = in0Var;
                }
                int iM3015v2 = m3015v(in0Var, this.f6412n, iM2996E, iM3015v, c0374k4, arrayList2, arrayList);
                Object obj = c0374k4.f5331h;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM3015v2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrM3011r = this.f6411m;
                if (zIsEmpty) {
                    objArrM3011r.getClass();
                } else {
                    objArrM3011r = m3011r(objArrM3011r, i2, this.f6409k, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    j22.m2429a("invalid size");
                }
                if (size == 0) {
                    this.f6409k = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.f6409k;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.f6409k = i - 5;
                        Object[] objArr2 = objArrM3011r[0];
                        objArr2.getClass();
                        objArrM3011r = objArr2;
                    }
                    objArrM3008o = m3008o(objArrM3011r, i3, i);
                }
                this.f6411m = objArrM3008o;
                this.f6412n = objArr;
                this.f6413o = size + iM3015v2;
            }
            z = true;
        } else if (m3017x(in0Var2, iM2996E, c0374k4) != iM2996E) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    /* JADX INFO: renamed from: z */
    public final Object[] m3019z(Object[] objArr, int i, int i2, C0374k4 c0374k4) {
        int iM2346a = ig3.m2346a(i2, i);
        if (i == 0) {
            Object obj = objArr[iM2346a];
            Object[] objArrM3004k = m3004k(objArr);
            AbstractC0460mg.m3088c0(objArr, objArrM3004k, iM2346a, iM2346a + 1, 32);
            objArrM3004k[31] = c0374k4.f5331h;
            c0374k4.f5331h = obj;
            return objArrM3004k;
        }
        int iM2346a2 = objArr[31] == null ? ig3.m2346a(m2993B() - 1, i) : 31;
        Object[] objArrM3004k2 = m3004k(objArr);
        int i3 = i - 5;
        int i4 = iM2346a + 1;
        if (i4 <= iM2346a2) {
            while (true) {
                Object obj2 = objArrM3004k2[iM2346a2];
                obj2.getClass();
                objArrM3004k2[iM2346a2] = m3019z((Object[]) obj2, i3, 0, c0374k4);
                if (iM2346a2 == i4) {
                    break;
                }
                iM2346a2--;
            }
        }
        Object obj3 = objArrM3004k2[iM2346a];
        obj3.getClass();
        objArrM3004k2[iM2346a] = m3019z((Object[]) obj3, i3, i2, c0374k4);
        return objArrM3004k2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM2996E = m2996E();
        if (iM2996E < 32) {
            Object[] objArrM3004k = m3004k(this.f6412n);
            objArrM3004k[iM2996E] = obj;
            this.f6412n = objArrM3004k;
            this.f6413o = mo152a() + 1;
        } else {
            m3013t(this.f6411m, this.f6412n, m3007n(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM2996E = m2996E();
        Iterator it = collection.iterator();
        if (32 - iM2996E >= collection.size()) {
            Object[] objArrM3004k = m3004k(this.f6412n);
            m2991d(objArrM3004k, iM2996E, it);
            this.f6412n = objArrM3004k;
            this.f6413o = collection.size() + this.f6413o;
            return true;
        }
        int size = ((collection.size() + iM2996E) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM3004k2 = m3004k(this.f6412n);
        m2991d(objArrM3004k2, iM2996E, it);
        objArr[0] = objArrM3004k2;
        for (int i = 1; i < size; i++) {
            Object[] objArrM3006m = m3006m();
            m2991d(objArrM3006m, 0, it);
            objArr[i] = objArrM3006m;
        }
        this.f6411m = m3012s(this.f6411m, m2993B(), objArr);
        Object[] objArrM3006m2 = m3006m();
        m2991d(objArrM3006m2, 0, it);
        this.f6412n = objArrM3006m2;
        this.f6413o = collection.size() + this.f6413o;
        return true;
    }
}
