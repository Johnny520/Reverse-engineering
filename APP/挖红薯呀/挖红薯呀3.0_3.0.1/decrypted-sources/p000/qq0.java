package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class qq0 extends AbstractC0001a0 implements Collection, q40 {

    /* JADX INFO: renamed from: d */
    public AbstractC0112d0 f5209d;

    /* JADX INFO: renamed from: e */
    public Object[] f5210e;

    /* JADX INFO: renamed from: f */
    public Object[] f5211f;

    /* JADX INFO: renamed from: g */
    public int f5212g;

    /* JADX INFO: renamed from: h */
    public C0675r3 f5213h = new C0675r3(27);

    /* JADX INFO: renamed from: i */
    public Object[] f5214i;

    /* JADX INFO: renamed from: j */
    public Object[] f5215j;

    /* JADX INFO: renamed from: k */
    public int f5216k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qq0(AbstractC0112d0 abstractC0112d0, Object[] objArr, Object[] objArr2, int i) {
        this.f5209d = abstractC0112d0;
        this.f5210e = objArr;
        this.f5211f = objArr2;
        this.f5212g = i;
        this.f5214i = objArr;
        this.f5215j = objArr2;
        this.f5216k = abstractC0112d0.mo6a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m3295d(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final Object m3296A(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f5216k - i;
        Object[] objArr2 = this.f5215j;
        if (i4 == 1) {
            Object obj = objArr2[0];
            m3314q(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrM3308k = m3308k(objArr2);
        AbstractC0201f9.m1057c0(objArr2, objArrM3308k, i3, i3 + 1, i4);
        objArrM3308k[i4 - 1] = null;
        this.f5214i = objArr;
        this.f5215j = objArrM3308k;
        this.f5216k = (i + i4) - 1;
        this.f5212g = i2;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final int m3297B() {
        int i = this.f5216k;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final Object[] m3298C(Object[] objArr, int i, int i2, Object obj, C0910x1 c0910x1) {
        int iM1668r = j50.m1668r(i2, i);
        Object[] objArrM3308k = m3308k(objArr);
        if (i != 0) {
            Object obj2 = objArrM3308k[iM1668r];
            obj2.getClass();
            objArrM3308k[iM1668r] = m3298C((Object[]) obj2, i - 5, i2, obj, c0910x1);
            return objArrM3308k;
        }
        if (objArrM3308k != objArr) {
            ((AbstractList) this).modCount++;
        }
        c0910x1.f7232e = objArrM3308k[iM1668r];
        objArrM3308k[iM1668r] = obj;
        return objArrM3308k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final void m3299D(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM3310m;
        if (i3 < 1) {
            wr0.m5024a("requires at least one nullBuffer");
        }
        Object[] objArrM3308k = m3308k(objArr);
        objArr2[0] = objArrM3308k;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            AbstractC0201f9.m1057c0(objArrM3308k, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM3310m = objArrM3308k;
            } else {
                objArrM3310m = m3310m();
                i3--;
                objArr2[i3] = objArrM3310m;
            }
            int i7 = i2 - i6;
            AbstractC0201f9.m1057c0(objArrM3308k, objArr3, 0, i7, i2);
            AbstractC0201f9.m1057c0(objArrM3308k, objArrM3310m, size + 1, i4, i7);
            objArr3 = objArrM3310m;
        }
        Iterator it = collection.iterator();
        m3295d(objArrM3308k, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM3310m2 = m3310m();
            m3295d(objArrM3310m2, 0, it);
            objArr2[i8] = objArrM3310m2;
        }
        m3295d(objArr3, 0, it);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final int m3300E() {
        int i = this.f5216k;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0001a0
    /* JADX INFO: renamed from: a */
    public final int mo0a() {
        return this.f5216k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        z60.m5444n(i, mo0a());
        if (i == mo0a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM3297B = m3297B();
        if (i >= iM3297B) {
            m3305h(this.f5214i, i - iM3297B, obj);
            return;
        }
        C0910x1 c0910x1 = new C0910x1(15, (Object) null);
        Object[] objArr = this.f5214i;
        objArr.getClass();
        m3305h(m3304g(objArr, this.f5212g, i, obj, c0910x1), 0, c0910x1.f7232e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrM3310m;
        z60.m5444n(i, this.f5216k);
        if (i == this.f5216k) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f5216k - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f5215j;
            Object[] objArrM3308k = m3308k(objArr);
            AbstractC0201f9.m1057c0(objArr, objArrM3308k, size2 + 1, i3, m3300E());
            m3295d(objArrM3308k, i3, collection.iterator());
            this.f5215j = objArrM3308k;
            this.f5216k = collection.size() + this.f5216k;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM3300E = m3300E();
        int size3 = collection.size() + this.f5216k;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= m3297B()) {
            objArrM3310m = m3310m();
            collection2 = collection;
            m3299D(collection2, i, this.f5215j, iM3300E, objArr2, size, objArrM3310m);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.f5215j;
            if (size3 > iM3300E) {
                int i4 = size3 - iM3300E;
                Object[] objArrM3309l = m3309l(i4, objArr3);
                m3303f(collection2, i, i4, objArr2, size, objArrM3309l);
                objArr2 = objArr2;
                objArrM3310m = objArrM3309l;
            } else {
                objArrM3310m = m3310m();
                int i5 = iM3300E - size3;
                AbstractC0201f9.m1057c0(objArr3, objArrM3310m, 0, i5, iM3300E);
                int i6 = 32 - i5;
                Object[] objArrM3309l2 = m3309l(i6, this.f5215j);
                int i7 = size - 1;
                objArr2[i7] = objArrM3309l2;
                m3303f(collection2, i, i6, objArr2, i7, objArrM3309l2);
                collection2 = collection2;
            }
        }
        this.f5214i = m3316s(this.f5214i, i2, objArr2);
        this.f5215j = objArrM3310m;
        this.f5216k = collection2.size() + this.f5216k;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0001a0
    /* JADX INFO: renamed from: b */
    public final Object mo1b(int i) {
        z60.m5443m(i, mo0a());
        ((AbstractList) this).modCount++;
        int iM3297B = m3297B();
        if (i >= iM3297B) {
            return m3296A(this.f5214i, iM3297B, this.f5212g, i - iM3297B);
        }
        C0910x1 c0910x1 = new C0910x1(15, this.f5215j[0]);
        Object[] objArr = this.f5214i;
        objArr.getClass();
        m3296A(m3323z(objArr, this.f5212g, i, c0910x1), iM3297B, this.f5212g, 0);
        return c0910x1.f7232e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final AbstractC0112d0 m3301c() {
        AbstractC0112d0 a21Var;
        Object[] objArr = this.f5214i;
        if (objArr == this.f5210e && this.f5215j == this.f5211f) {
            a21Var = this.f5209d;
        } else {
            this.f5213h = new C0675r3(27);
            this.f5210e = objArr;
            Object[] objArr2 = this.f5215j;
            this.f5211f = objArr2;
            a21Var = objArr == null ? objArr2.length == 0 ? a21.f28e : new a21(Arrays.copyOf(objArr2, this.f5216k)) : new pq0(objArr, objArr2, this.f5216k, this.f5212g);
        }
        this.f5209d = a21Var;
        return a21Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m3302e() {
        return ((AbstractList) this).modCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m3303f(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f5214i == null) {
            C0921xc.m5134o("root is null");
            return;
        }
        int i4 = i >> 5;
        AbstractC0982z abstractC0982zM3307j = m3307j(m3297B() >> 5);
        int i5 = i3;
        Object[] objArrM3309l = objArr2;
        while (abstractC0982zM3307j.f7744d - 1 != i4) {
            Object[] objArr3 = (Object[]) abstractC0982zM3307j.previous();
            AbstractC0201f9.m1057c0(objArr3, objArrM3309l, 0, 32 - i2, 32);
            objArrM3309l = m3309l(i2, objArr3);
            i5--;
            objArr[i5] = objArrM3309l;
        }
        Object[] objArr4 = (Object[]) abstractC0982zM3307j.previous();
        int iM3297B = i3 - (((m3297B() >> 5) - 1) - i4);
        if (iM3297B < i3) {
            objArr2 = objArr[iM3297B];
            objArr2.getClass();
        }
        m3299D(collection, i, objArr4, 32, objArr, iM3297B, objArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final Object[] m3304g(Object[] objArr, int i, int i2, Object obj, C0910x1 c0910x1) {
        Object obj2;
        int iM1668r = j50.m1668r(i2, i);
        if (i == 0) {
            c0910x1.f7232e = objArr[31];
            Object[] objArrM3308k = m3308k(objArr);
            AbstractC0201f9.m1057c0(objArr, objArrM3308k, iM1668r + 1, iM1668r, 31);
            objArrM3308k[iM1668r] = obj;
            return objArrM3308k;
        }
        Object[] objArrM3308k2 = m3308k(objArr);
        int i3 = i - 5;
        Object obj3 = objArrM3308k2[iM1668r];
        obj3.getClass();
        objArrM3308k2[iM1668r] = m3304g((Object[]) obj3, i3, i2, obj, c0910x1);
        while (true) {
            iM1668r++;
            if (iM1668r >= 32 || (obj2 = objArrM3308k2[iM1668r]) == null) {
                break;
            }
            objArrM3308k2[iM1668r] = m3304g((Object[]) obj2, i3, 0, c0910x1.f7232e, c0910x1);
        }
        return objArrM3308k2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        z60.m5443m(i, mo0a());
        if (m3297B() <= i) {
            objArr = this.f5215j;
        } else {
            Object[] objArr2 = this.f5214i;
            objArr2.getClass();
            for (int i2 = this.f5212g; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[j50.m1668r(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m3305h(Object[] objArr, int i, Object obj) {
        int iM3300E = m3300E();
        Object[] objArrM3308k = m3308k(this.f5215j);
        Object[] objArr2 = this.f5215j;
        if (iM3300E >= 32) {
            Object obj2 = objArr2[31];
            AbstractC0201f9.m1057c0(objArr2, objArrM3308k, i + 1, i, 31);
            objArrM3308k[i] = obj;
            m3317t(objArr, objArrM3308k, m3311n(obj2));
            return;
        }
        AbstractC0201f9.m1057c0(objArr2, objArrM3308k, i + 1, i, iM3300E);
        objArrM3308k[i] = obj;
        this.f5214i = objArr;
        this.f5215j = objArrM3308k;
        this.f5216k++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m3306i(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f5213h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final AbstractC0982z m3307j(int i) {
        Object[] objArr = this.f5214i;
        if (objArr == null) {
            C0921xc.m5134o("Invalid root");
            return null;
        }
        int iM3297B = m3297B() >> 5;
        z60.m5444n(i, iM3297B);
        int i2 = this.f5212g;
        return i2 == 0 ? new C0720sb(i, objArr) : new k91(objArr, i, iM3297B, i2 / 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Object[] m3308k(Object[] objArr) {
        if (objArr == null) {
            return m3310m();
        }
        if (m3306i(objArr)) {
            return objArr;
        }
        Object[] objArrM3310m = m3310m();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC0201f9.m1059e0(objArr, objArrM3310m, 0, length, 6);
        return objArrM3310m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final Object[] m3309l(int i, Object[] objArr) {
        if (m3306i(objArr)) {
            AbstractC0201f9.m1057c0(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] objArrM3310m = m3310m();
        AbstractC0201f9.m1057c0(objArr, objArrM3310m, i, 0, 32 - i);
        return objArrM3310m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        z60.m5444n(i, this.f5216k);
        return new sq0(this, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final Object[] m3310m() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f5213h;
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final Object[] m3311n(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f5213h;
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final Object[] m3312o(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            wr0.m5024a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iM1668r = j50.m1668r(i, i2);
        Object obj = objArr[iM1668r];
        obj.getClass();
        Object objM3312o = m3312o((Object[]) obj, i, i2 - 5);
        if (iM1668r < 31) {
            int i3 = iM1668r + 1;
            if (objArr[i3] != null) {
                if (m3306i(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM3310m = m3310m();
                AbstractC0201f9.m1057c0(objArr, objArrM3310m, 0, 0, i3);
                objArr = objArrM3310m;
            }
        }
        if (objM3312o == objArr[iM1668r]) {
            return objArr;
        }
        Object[] objArrM3308k = m3308k(objArr);
        objArrM3308k[iM1668r] = objM3312o;
        return objArrM3308k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final Object[] m3313p(Object[] objArr, int i, int i2, C0910x1 c0910x1) {
        Object[] objArrM3313p;
        int iM1668r = j50.m1668r(i2 - 1, i);
        if (i == 5) {
            c0910x1.f7232e = objArr[iM1668r];
            objArrM3313p = null;
        } else {
            Object obj = objArr[iM1668r];
            obj.getClass();
            objArrM3313p = m3313p((Object[]) obj, i - 5, i2, c0910x1);
        }
        if (objArrM3313p == null && iM1668r == 0) {
            return null;
        }
        Object[] objArrM3308k = m3308k(objArr);
        objArrM3308k[iM1668r] = objArrM3313p;
        return objArrM3308k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m3314q(Object[] objArr, int i, int i2) {
        Object obj = null;
        if (i2 == 0) {
            this.f5214i = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f5215j = objArr;
            this.f5216k = i;
            this.f5212g = i2;
            return;
        }
        C0910x1 c0910x1 = new C0910x1(15, obj);
        objArr.getClass();
        Object[] objArrM3313p = m3313p(objArr, i2, i, c0910x1);
        objArrM3313p.getClass();
        Object obj2 = c0910x1.f7232e;
        obj2.getClass();
        this.f5215j = (Object[]) obj2;
        this.f5216k = i;
        if (objArrM3313p[1] == null) {
            this.f5214i = (Object[]) objArrM3313p[0];
            this.f5212g = i2 - 5;
        } else {
            this.f5214i = objArrM3313p;
            this.f5212g = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final Object[] m3315r(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            wr0.m5024a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            wr0.m5024a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM3308k = m3308k(objArr);
        int iM1668r = j50.m1668r(i, i2);
        int i3 = i2 - 5;
        objArrM3308k[iM1668r] = m3315r((Object[]) objArrM3308k[iM1668r], i, i3, it);
        while (true) {
            iM1668r++;
            if (iM1668r >= 32 || !it.hasNext()) {
                break;
            }
            objArrM3308k[iM1668r] = m3315r((Object[]) objArrM3308k[iM1668r], 0, i3, it);
        }
        return objArrM3308k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m3322y(new C0074c0(1, collection));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final Object[] m3316s(Object[] objArr, int i, Object[][] objArr2) {
        C0822v c0822v = new C0822v(objArr2);
        int i2 = i >> 5;
        int i3 = this.f5212g;
        Object[] objArrM3315r = i2 < (1 << i3) ? m3315r(objArr, i, i3, c0822v) : m3308k(objArr);
        while (c0822v.hasNext()) {
            this.f5212g += 5;
            objArrM3315r = m3311n(objArrM3315r);
            int i4 = this.f5212g;
            m3315r(objArrM3315r, 1 << i4, i4, c0822v);
        }
        return objArrM3315r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        z60.m5443m(i, mo0a());
        if (m3297B() > i) {
            C0910x1 c0910x1 = new C0910x1(15, (Object) null);
            Object[] objArr = this.f5214i;
            objArr.getClass();
            this.f5214i = m3298C(objArr, this.f5212g, i, obj, c0910x1);
            return c0910x1.f7232e;
        }
        Object[] objArrM3308k = m3308k(this.f5215j);
        if (objArrM3308k != this.f5215j) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrM3308k[i2];
        objArrM3308k[i2] = obj;
        this.f5215j = objArrM3308k;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m3317t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f5216k;
        int i2 = i >> 5;
        int i3 = this.f5212g;
        if (i2 > (1 << i3)) {
            this.f5214i = m3318u(this.f5212g + 5, m3311n(objArr), objArr2);
            this.f5215j = objArr3;
            this.f5212g += 5;
            this.f5216k++;
            return;
        }
        if (objArr == null) {
            this.f5214i = objArr2;
            this.f5215j = objArr3;
            this.f5216k = i + 1;
        } else {
            this.f5214i = m3318u(i3, objArr, objArr2);
            this.f5215j = objArr3;
            this.f5216k++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final Object[] m3318u(int i, Object[] objArr, Object[] objArr2) {
        int iM1668r = j50.m1668r(mo0a() - 1, i);
        Object[] objArrM3308k = m3308k(objArr);
        if (i == 5) {
            objArrM3308k[iM1668r] = objArr2;
            return objArrM3308k;
        }
        objArrM3308k[iM1668r] = m3318u(i - 5, (Object[]) objArrM3308k[iM1668r], objArr2);
        return objArrM3308k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final int m3319v(InterfaceC0742sw interfaceC0742sw, Object[] objArr, int i, int i2, C0910x1 c0910x1, ArrayList arrayList, ArrayList arrayList2) {
        if (m3306i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c0910x1.f7232e;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM3310m = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) interfaceC0742sw.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrM3310m = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m3310m();
                    i2 = 0;
                }
                objArrM3310m[i2] = obj2;
                i2++;
            }
        }
        c0910x1.f7232e = objArrM3310m;
        if (objArr2 != objArrM3310m) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final int m3320w(InterfaceC0742sw interfaceC0742sw, Object[] objArr, int i, C0910x1 c0910x1) {
        Object[] objArrM3308k = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) interfaceC0742sw.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrM3308k = m3308k(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrM3308k[i2] = obj;
                i2++;
            }
        }
        c0910x1.f7232e = objArrM3308k;
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final int m3321x(InterfaceC0742sw interfaceC0742sw, int i, C0910x1 c0910x1) {
        int iM3320w = m3320w(interfaceC0742sw, this.f5215j, i, c0910x1);
        Object obj = c0910x1.f7232e;
        if (iM3320w == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM3320w, i, (Object) null);
        this.f5215j = objArr;
        this.f5216k -= i - iM3320w;
        return iM3320w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final boolean m3322y(InterfaceC0742sw interfaceC0742sw) {
        int i;
        InterfaceC0742sw interfaceC0742sw2 = interfaceC0742sw;
        int iM3300E = m3300E();
        Object[] objArrM3312o = null;
        C0910x1 c0910x1 = new C0910x1(15, objArrM3312o);
        boolean z = false;
        if (this.f5214i != null) {
            AbstractC0982z abstractC0982zM3307j = m3307j(0);
            int iM3320w = 32;
            while (iM3320w == 32 && abstractC0982zM3307j.hasNext()) {
                iM3320w = m3320w(interfaceC0742sw2, (Object[]) abstractC0982zM3307j.next(), 32, c0910x1);
            }
            if (iM3320w == 32) {
                int iM3321x = m3321x(interfaceC0742sw2, iM3300E, c0910x1);
                if (iM3321x == 0) {
                    m3314q(this.f5214i, this.f5216k, this.f5212g);
                }
                if (iM3321x != iM3300E) {
                }
            } else {
                int i2 = (abstractC0982zM3307j.f7744d - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM3319v = iM3320w;
                while (abstractC0982zM3307j.hasNext()) {
                    iM3319v = m3319v(interfaceC0742sw2, (Object[]) abstractC0982zM3307j.next(), 32, iM3319v, c0910x1, arrayList2, arrayList);
                    interfaceC0742sw2 = interfaceC0742sw;
                }
                int iM3319v2 = m3319v(interfaceC0742sw, this.f5215j, iM3300E, iM3319v, c0910x1, arrayList2, arrayList);
                Object obj = c0910x1.f7232e;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM3319v2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrM3315r = this.f5214i;
                if (zIsEmpty) {
                    objArrM3315r.getClass();
                } else {
                    objArrM3315r = m3315r(objArrM3315r, i2, this.f5212g, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    wr0.m5024a("invalid size");
                }
                if (size == 0) {
                    this.f5212g = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.f5212g;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.f5212g = i - 5;
                        Object[] objArr2 = objArrM3315r[0];
                        objArr2.getClass();
                        objArrM3315r = objArr2;
                    }
                    objArrM3312o = m3312o(objArrM3315r, i3, i);
                }
                this.f5214i = objArrM3312o;
                this.f5215j = objArr;
                this.f5216k = size + iM3319v2;
            }
            z = true;
        } else if (m3321x(interfaceC0742sw2, iM3300E, c0910x1) != iM3300E) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final Object[] m3323z(Object[] objArr, int i, int i2, C0910x1 c0910x1) {
        int iM1668r = j50.m1668r(i2, i);
        if (i == 0) {
            Object obj = objArr[iM1668r];
            Object[] objArrM3308k = m3308k(objArr);
            AbstractC0201f9.m1057c0(objArr, objArrM3308k, iM1668r, iM1668r + 1, 32);
            objArrM3308k[31] = c0910x1.f7232e;
            c0910x1.f7232e = obj;
            return objArrM3308k;
        }
        int iM1668r2 = objArr[31] == null ? j50.m1668r(m3297B() - 1, i) : 31;
        Object[] objArrM3308k2 = m3308k(objArr);
        int i3 = i - 5;
        int i4 = iM1668r + 1;
        if (i4 <= iM1668r2) {
            while (true) {
                Object obj2 = objArrM3308k2[iM1668r2];
                obj2.getClass();
                objArrM3308k2[iM1668r2] = m3323z((Object[]) obj2, i3, 0, c0910x1);
                if (iM1668r2 == i4) {
                    break;
                }
                iM1668r2--;
            }
        }
        Object obj3 = objArrM3308k2[iM1668r];
        obj3.getClass();
        objArrM3308k2[iM1668r] = m3323z((Object[]) obj3, i3, i2, c0910x1);
        return objArrM3308k2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM3300E = m3300E();
        if (iM3300E < 32) {
            Object[] objArrM3308k = m3308k(this.f5215j);
            objArrM3308k[iM3300E] = obj;
            this.f5215j = objArrM3308k;
            this.f5216k = mo0a() + 1;
        } else {
            m3317t(this.f5214i, this.f5215j, m3311n(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM3300E = m3300E();
        Iterator it = collection.iterator();
        if (32 - iM3300E >= collection.size()) {
            Object[] objArrM3308k = m3308k(this.f5215j);
            m3295d(objArrM3308k, iM3300E, it);
            this.f5215j = objArrM3308k;
            this.f5216k = collection.size() + this.f5216k;
            return true;
        }
        int size = ((collection.size() + iM3300E) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM3308k2 = m3308k(this.f5215j);
        m3295d(objArrM3308k2, iM3300E, it);
        objArr[0] = objArrM3308k2;
        for (int i = 1; i < size; i++) {
            Object[] objArrM3310m = m3310m();
            m3295d(objArrM3310m, 0, it);
            objArr[i] = objArrM3310m;
        }
        this.f5214i = m3316s(this.f5214i, m3297B(), objArr);
        Object[] objArrM3310m2 = m3310m();
        m3295d(objArrM3310m2, 0, it);
        this.f5215j = objArrM3310m2;
        this.f5216k = collection.size() + this.f5216k;
        return true;
    }
}
