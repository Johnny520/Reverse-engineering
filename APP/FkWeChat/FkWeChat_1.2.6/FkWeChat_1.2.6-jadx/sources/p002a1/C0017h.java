package p002a1;

import androidx.compose.runtime.AbstractC0464b3;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1027c;
import p041d1.AbstractC1851a;
import p041d1.C1854d;
import p041d1.C1855e;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5086j;
import p185m8.AbstractC5102r;
import p364z0.InterfaceC9827e;
import p376zd.C10010p0;

/* JADX INFO: renamed from: a1.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0017h extends AbstractC5086j implements InterfaceC9827e.a {

    /* JADX INFO: renamed from: q */
    public InterfaceC9827e f19q;

    /* JADX INFO: renamed from: r */
    public Object[] f20r;

    /* JADX INFO: renamed from: s */
    public Object[] f21s;

    /* JADX INFO: renamed from: t */
    public int f22t;

    /* JADX INFO: renamed from: u */
    public C1855e f23u = new C1855e();

    /* JADX INFO: renamed from: v */
    public Object[] f24v;

    /* JADX INFO: renamed from: w */
    public Object[] f25w;

    /* JADX INFO: renamed from: x */
    public int f26x;

    public C0017h(InterfaceC9827e interfaceC9827e, Object[] objArr, Object[] objArr2, int i10) {
        this.f19q = interfaceC9827e;
        this.f20r = objArr;
        this.f21s = objArr2;
        this.f22t = i10;
        this.f24v = this.f20r;
        this.f25w = this.f21s;
        this.f26x = this.f19q.size();
    }

    /* JADX INFO: renamed from: D */
    private final Object[] m46D(Object[] objArr, int i10, int i11, C0014e c0014e) {
        Object[] objArrM46D;
        int iM96a = AbstractC0023n.m96a(i11 - 1, i10);
        if (i10 == 5) {
            c0014e.m30b(objArr[iM96a]);
            objArrM46D = null;
        } else {
            Object obj = objArr[iM96a];
            obj.getClass();
            objArrM46D = m46D((Object[]) obj, i10 - 5, i11, c0014e);
        }
        if (objArrM46D == null && iM96a == 0) {
            return null;
        }
        Object[] objArrM83y = m83y(objArr);
        objArrM83y[iM96a] = objArrM46D;
        return objArrM83y;
    }

    /* JADX INFO: renamed from: O */
    private final Object[] m47O(Object[] objArr, int i10, int i11, C0014e c0014e) {
        int iM96a = AbstractC0023n.m96a(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iM96a];
            Object[] objArrM20660l = AbstractC5102r.m20660l(objArr, m83y(objArr), iM96a, iM96a + 1, 32);
            objArrM20660l[31] = c0014e.m29a();
            c0014e.m30b(obj);
            return objArrM20660l;
        }
        int iM96a2 = objArr[31] == null ? AbstractC0023n.m96a(m48R() - 1, i10) : 31;
        Object[] objArrM83y = m83y(objArr);
        int i12 = i10 - 5;
        int i13 = iM96a + 1;
        if (i13 <= iM96a2) {
            while (true) {
                Object obj2 = objArrM83y[iM96a2];
                obj2.getClass();
                objArrM83y[iM96a2] = m47O((Object[]) obj2, i12, 0, c0014e);
                if (iM96a2 == i13) {
                    break;
                }
                iM96a2--;
            }
        }
        Object obj3 = objArrM83y[iM96a];
        obj3.getClass();
        objArrM83y[iM96a] = m47O((Object[]) obj3, i12, i11, c0014e);
        return objArrM83y;
    }

    /* JADX INFO: renamed from: R */
    private final int m48R() {
        if (size() <= 32) {
            return 0;
        }
        return AbstractC0023n.m99d(size());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m49e(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    /* JADX INFO: renamed from: l */
    private final Object[] m50l(int i10) {
        if (m48R() <= i10) {
            return this.f25w;
        }
        Object[] objArr = this.f24v;
        objArr.getClass();
        for (int i11 = this.f22t; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[AbstractC0023n.m96a(i10, i11)];
            objArr2.getClass();
            objArr = objArr2;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: u */
    private final Object[] m51u(Object[] objArr, int i10, int i11, Object obj, C0014e c0014e) {
        Object obj2;
        int iM96a = AbstractC0023n.m96a(i11, i10);
        if (i10 == 0) {
            c0014e.m30b(objArr[31]);
            Object[] objArrM20660l = AbstractC5102r.m20660l(objArr, m83y(objArr), iM96a + 1, iM96a, 31);
            objArrM20660l[iM96a] = obj;
            return objArrM20660l;
        }
        Object[] objArrM83y = m83y(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrM83y[iM96a];
        obj3.getClass();
        objArrM83y[iM96a] = m51u((Object[]) obj3, i12, i11, obj, c0014e);
        while (true) {
            iM96a++;
            if (iM96a >= 32 || (obj2 = objArrM83y[iM96a]) == null) {
                break;
            }
            obj2.getClass();
            objArrM83y[iM96a] = m51u((Object[]) obj2, i12, 0, c0014e.m29a(), c0014e);
        }
        return objArrM83y;
    }

    /* JADX INFO: renamed from: A */
    public final Object[] m52A() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f23u;
        return objArr;
    }

    /* JADX INFO: renamed from: B */
    public final Object[] m53B(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f23u;
        return objArr;
    }

    /* JADX INFO: renamed from: C */
    public final Object[] m54C(Object[] objArr, int i10, int i11) {
        if (!(i11 >= 0)) {
            AbstractC0464b3.m1535a("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int iM96a = AbstractC0023n.m96a(i10, i11);
        Object obj = objArr[iM96a];
        obj.getClass();
        Object objM54C = m54C((Object[]) obj, i10, i11 - 5);
        if (iM96a < 31) {
            int i12 = iM96a + 1;
            if (objArr[i12] != null) {
                if (m81w(objArr)) {
                    AbstractC5102r.m20672x(objArr, null, i12, 32);
                }
                objArr = AbstractC5102r.m20660l(objArr, m52A(), 0, 0, i12);
            }
        }
        if (objM54C == objArr[iM96a]) {
            return objArr;
        }
        Object[] objArrM83y = m83y(objArr);
        objArrM83y[iM96a] = objM54C;
        return objArrM83y;
    }

    /* JADX INFO: renamed from: E */
    public final void m55E(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.f24v = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f25w = objArr;
            this.f26x = i10;
            this.f22t = i11;
            return;
        }
        C0014e c0014e = new C0014e(null);
        objArr.getClass();
        Object[] objArrM46D = m46D(objArr, i11, i10, c0014e);
        objArrM46D.getClass();
        Object objM29a = c0014e.m29a();
        objM29a.getClass();
        this.f25w = (Object[]) objM29a;
        this.f26x = i10;
        if (objArrM46D[1] == null) {
            this.f24v = (Object[]) objArrM46D[0];
            this.f22t = i11 - 5;
        } else {
            this.f24v = objArrM46D;
            this.f22t = i11;
        }
    }

    /* JADX INFO: renamed from: F */
    public final Object[] m56F(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            AbstractC0464b3.m1535a("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            AbstractC0464b3.m1535a("negative shift");
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM83y = m83y(objArr);
        int iM96a = AbstractC0023n.m96a(i10, i11);
        int i12 = i11 - 5;
        objArrM83y[iM96a] = m56F((Object[]) objArrM83y[iM96a], i10, i12, it);
        while (true) {
            iM96a++;
            if (iM96a >= 32 || !it.hasNext()) {
                break;
            }
            objArrM83y[iM96a] = m56F((Object[]) objArrM83y[iM96a], 0, i12, it);
        }
        return objArrM83y;
    }

    /* JADX INFO: renamed from: G */
    public final Object[] m57G(Object[] objArr, int i10, Object[][] objArr2) {
        Iterator itM3774a = AbstractC1027c.m3774a(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f22t;
        Object[] objArrM56F = i11 < (1 << i12) ? m56F(objArr, i10, i12, itM3774a) : m83y(objArr);
        while (itM3774a.hasNext()) {
            this.f22t += 5;
            objArrM56F = m53B(objArrM56F);
            int i13 = this.f22t;
            m56F(objArrM56F, 1 << i13, i13, itM3774a);
        }
        return objArrM56F;
    }

    /* JADX INFO: renamed from: H */
    public final void m58H(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f22t;
        if (size > (1 << i10)) {
            this.f24v = m59I(m53B(objArr), objArr2, this.f22t + 5);
            this.f25w = objArr3;
            this.f22t += 5;
            this.f26x = size() + 1;
            return;
        }
        if (objArr == null) {
            this.f24v = objArr2;
            this.f25w = objArr3;
            this.f26x = size() + 1;
        } else {
            this.f24v = m59I(objArr, objArr2, i10);
            this.f25w = objArr3;
            this.f26x = size() + 1;
        }
    }

    /* JADX INFO: renamed from: I */
    public final Object[] m59I(Object[] objArr, Object[] objArr2, int i10) {
        int iM96a = AbstractC0023n.m96a(size() - 1, i10);
        Object[] objArrM83y = m83y(objArr);
        if (i10 == 5) {
            objArrM83y[iM96a] = objArr2;
            return objArrM83y;
        }
        objArrM83y[iM96a] = m59I((Object[]) objArrM83y[iM96a], objArr2, i10 - 5);
        return objArrM83y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public final int m60J(InterfaceC0184l interfaceC0184l, Object[] objArr, int i10, int i11, C0014e c0014e, List list, List list2) {
        if (m81w(objArr)) {
            list.add(objArr);
        }
        Object objM29a = c0014e.m29a();
        objM29a.getClass();
        Object[] objArr2 = (Object[]) objM29a;
        Object[] objArrM52A = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (!((Boolean) interfaceC0184l.mo27m(obj)).booleanValue()) {
                if (i11 == 32) {
                    objArrM52A = !list.isEmpty() ? (Object[]) list.remove(list.size() - 1) : m52A();
                    i11 = 0;
                }
                objArrM52A[i11] = obj;
                i11++;
            }
        }
        c0014e.m30b(objArrM52A);
        if (objArr2 != c0014e.m29a()) {
            list2.add(objArr2);
        }
        return i11;
    }

    /* JADX INFO: renamed from: K */
    public final int m61K(InterfaceC0184l interfaceC0184l, Object[] objArr, int i10, C0014e c0014e) {
        Object[] objArrM83y = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) interfaceC0184l.mo27m(obj)).booleanValue()) {
                if (!z10) {
                    objArrM83y = m83y(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrM83y[i11] = obj;
                i11++;
            }
        }
        c0014e.m30b(objArrM83y);
        return i11;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m62L(InterfaceC0184l interfaceC0184l) {
        int iM70V = m70V();
        C0014e c0014e = new C0014e(null);
        if (this.f24v == null) {
            return m63M(interfaceC0184l, iM70V, c0014e) != iM70V;
        }
        ListIterator listIteratorM82x = m82x(0);
        int iM61K = 32;
        while (iM61K == 32 && listIteratorM82x.hasNext()) {
            iM61K = m61K(interfaceC0184l, (Object[]) listIteratorM82x.next(), 32, c0014e);
        }
        if (iM61K == 32) {
            AbstractC1851a.m6548a(!listIteratorM82x.hasNext());
            int iM63M = m63M(interfaceC0184l, iM70V, c0014e);
            if (iM63M == 0) {
                m55E(this.f24v, size(), this.f22t);
            }
            return iM63M != iM70V;
        }
        int iPreviousIndex = listIteratorM82x.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iM60J = iM61K;
        while (listIteratorM82x.hasNext()) {
            iM60J = m60J(interfaceC0184l, (Object[]) listIteratorM82x.next(), 32, iM60J, c0014e, arrayList2, arrayList);
        }
        int iM60J2 = m60J(interfaceC0184l, this.f25w, iM70V, iM60J, c0014e, arrayList2, arrayList);
        Object objM29a = c0014e.m29a();
        objM29a.getClass();
        Object[] objArr = (Object[]) objM29a;
        AbstractC5102r.m20672x(objArr, null, iM60J2, 32);
        boolean zIsEmpty = arrayList.isEmpty();
        Object[] objArrM56F = this.f24v;
        if (zIsEmpty) {
            objArrM56F.getClass();
        } else {
            objArrM56F = m56F(objArrM56F, iPreviousIndex, this.f22t, arrayList.iterator());
        }
        int size = iPreviousIndex + (arrayList.size() << 5);
        this.f24v = m66Q(objArrM56F, size);
        this.f25w = objArr;
        this.f26x = size + iM60J2;
        return true;
    }

    /* JADX INFO: renamed from: M */
    public final int m63M(InterfaceC0184l interfaceC0184l, int i10, C0014e c0014e) {
        int iM61K = m61K(interfaceC0184l, this.f25w, i10, c0014e);
        if (iM61K == i10) {
            AbstractC1851a.m6548a(c0014e.m29a() == this.f25w);
            return i10;
        }
        Object objM29a = c0014e.m29a();
        objM29a.getClass();
        Object[] objArr = (Object[]) objM29a;
        AbstractC5102r.m20672x(objArr, null, iM61K, i10);
        this.f25w = objArr;
        this.f26x = size() - (i10 - iM61K);
        return iM61K;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m64N(InterfaceC0184l interfaceC0184l) {
        boolean zM62L = m62L(interfaceC0184l);
        if (zM62L) {
            ((AbstractList) this).modCount++;
        }
        return zM62L;
    }

    /* JADX INFO: renamed from: P */
    public final Object m65P(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        AbstractC1851a.m6548a(i12 < size);
        Object[] objArr2 = this.f25w;
        if (size == 1) {
            Object obj = objArr2[0];
            m55E(objArr, i10, i11);
            return obj;
        }
        Object obj2 = objArr2[i12];
        Object[] objArrM20660l = AbstractC5102r.m20660l(objArr2, m83y(objArr2), i12, i12 + 1, size);
        objArrM20660l[size - 1] = null;
        this.f24v = objArr;
        this.f25w = objArrM20660l;
        this.f26x = (i10 + size) - 1;
        this.f22t = i11;
        return obj2;
    }

    /* JADX INFO: renamed from: Q */
    public final Object[] m66Q(Object[] objArr, int i10) {
        if (!((i10 & 31) == 0)) {
            AbstractC0464b3.m1535a("invalid size");
        }
        if (i10 == 0) {
            this.f22t = 0;
            return null;
        }
        int i11 = i10 - 1;
        while (true) {
            int i12 = this.f22t;
            if ((i11 >> i12) != 0) {
                return m54C(objArr, i11, i12);
            }
            this.f22t = i12 - 5;
            Object[] objArr2 = objArr[0];
            objArr2.getClass();
            objArr = objArr2;
        }
    }

    /* JADX INFO: renamed from: S */
    public final Object[] m67S(Object[] objArr, int i10, int i11, Object obj, C0014e c0014e) {
        int iM96a = AbstractC0023n.m96a(i11, i10);
        Object[] objArrM83y = m83y(objArr);
        if (i10 != 0) {
            Object obj2 = objArrM83y[iM96a];
            obj2.getClass();
            objArrM83y[iM96a] = m67S((Object[]) obj2, i10 - 5, i11, obj, c0014e);
            return objArrM83y;
        }
        if (objArrM83y != objArr) {
            ((AbstractList) this).modCount++;
        }
        c0014e.m30b(objArrM83y[iM96a]);
        objArrM83y[iM96a] = obj;
        return objArrM83y;
    }

    /* JADX INFO: renamed from: T */
    public final Object[] m68T(int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f24v == null) {
            C10010p0.m38820a("root is null");
            return null;
        }
        ListIterator listIteratorM82x = m82x(m48R() >> 5);
        while (listIteratorM82x.previousIndex() != i10) {
            Object[] objArr3 = (Object[]) listIteratorM82x.previous();
            AbstractC5102r.m20660l(objArr3, objArr2, 0, 32 - i11, 32);
            objArr2 = m84z(objArr3, i11);
            i12--;
            objArr[i12] = objArr2;
        }
        return (Object[]) listIteratorM82x.previous();
    }

    /* JADX INFO: renamed from: U */
    public final void m69U(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrM52A;
        if (!(i12 >= 1)) {
            AbstractC0464b3.m1535a("requires at least one nullBuffer");
        }
        Object[] objArrM83y = m83y(objArr);
        objArr2[0] = objArrM83y;
        int i13 = i10 & 31;
        int size = ((i10 + collection.size()) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            AbstractC5102r.m20660l(objArrM83y, objArr3, size + 1, i13, i11);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrM52A = objArrM83y;
            } else {
                objArrM52A = m52A();
                i12--;
                objArr2[i12] = objArrM52A;
            }
            int i16 = i11 - i15;
            AbstractC5102r.m20660l(objArrM83y, objArr3, 0, i16, i11);
            AbstractC5102r.m20660l(objArrM83y, objArrM52A, size + 1, i13, i16);
            objArr3 = objArrM52A;
        }
        Iterator it = collection.iterator();
        m74o(objArrM83y, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            objArr2[i17] = m74o(m52A(), 0, it);
        }
        m74o(objArr3, 0, it);
    }

    /* JADX INFO: renamed from: V */
    public final int m70V() {
        return m71W(size());
    }

    /* JADX INFO: renamed from: W */
    public final int m71W(int i10) {
        return i10 <= 32 ? i10 : i10 - AbstractC0023n.m99d(i10);
    }

    @Override // p185m8.AbstractC5086j
    /* JADX INFO: renamed from: a */
    public int mo72a() {
        return this.f26x;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        C1854d.m6553b(i10, size());
        if (i10 == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM48R = m48R();
        if (i10 >= iM48R) {
            m80v(this.f24v, i10 - iM48R, obj);
            return;
        }
        C0014e c0014e = new C0014e(null);
        Object[] objArr = this.f24v;
        objArr.getClass();
        m80v(m51u(objArr, this.f22t, i10, obj, c0014e), 0, c0014e.m29a());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        C0017h c0017h;
        Collection collection2;
        Object[] objArrM20660l;
        Object[][] objArr;
        C1854d.m6553b(i10, size());
        if (i10 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = (((size() - i11) + collection.size()) - 1) / 32;
        if (size == 0) {
            AbstractC1851a.m6548a(i10 >= m48R());
            int i12 = i10 & 31;
            int size2 = ((i10 + collection.size()) - 1) & 31;
            Object[] objArr2 = this.f25w;
            Object[] objArrM20660l2 = AbstractC5102r.m20660l(objArr2, m83y(objArr2), size2 + 1, i12, m70V());
            m74o(objArrM20660l2, i12, collection.iterator());
            this.f25w = objArrM20660l2;
            this.f26x = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iM70V = m70V();
        int iM71W = m71W(size() + collection.size());
        if (i10 >= m48R()) {
            objArrM20660l = m52A();
            objArr = objArr3;
            c0017h = this;
            collection2 = collection;
            c0017h.m69U(collection2, i10, this.f25w, iM70V, objArr, size, objArrM20660l);
        } else {
            c0017h = this;
            collection2 = collection;
            Object[] objArr4 = c0017h.f25w;
            if (iM71W > iM70V) {
                int i13 = iM71W - iM70V;
                Object[] objArrM84z = m84z(objArr4, i13);
                c0017h.m79t(collection2, i10, i13, objArr3, size, objArrM84z);
                objArr = objArr3;
                objArrM20660l = objArrM84z;
            } else {
                int i14 = iM70V - iM71W;
                objArrM20660l = AbstractC5102r.m20660l(objArr4, m52A(), 0, i14, iM70V);
                int i15 = 32 - i14;
                Object[] objArrM84z2 = m84z(c0017h.f25w, i15);
                int i16 = size - 1;
                objArr3[i16] = objArrM84z2;
                c0017h.m79t(collection2, i10, i15, objArr3, i16, objArrM84z2);
                collection2 = collection2;
                objArr = objArr3;
                c0017h = c0017h;
            }
        }
        c0017h.f24v = m57G(c0017h.f24v, i11, objArr);
        c0017h.f25w = objArrM20660l;
        c0017h.f26x = size() + collection2.size();
        return true;
    }

    @Override // p364z0.InterfaceC9827e.a
    public InterfaceC9827e build() {
        InterfaceC9827e c0015f;
        if (this.f24v == this.f20r && this.f25w == this.f21s) {
            c0015f = this.f19q;
        } else {
            this.f23u = new C1855e();
            Object[] objArr = this.f24v;
            this.f20r = objArr;
            Object[] objArr2 = this.f25w;
            this.f21s = objArr2;
            if (objArr == null) {
                c0015f = objArr2.length == 0 ? AbstractC0023n.m97b() : new C0021l(Arrays.copyOf(this.f25w, size()));
            } else {
                Object[] objArr3 = this.f24v;
                objArr3.getClass();
                c0015f = new C0015f(objArr3, this.f25w, size(), this.f22t);
            }
        }
        this.f19q = c0015f;
        return c0015f;
    }

    @Override // p185m8.AbstractC5086j
    /* JADX INFO: renamed from: c */
    public Object mo73c(int i10) {
        C1854d.m6552a(i10, size());
        ((AbstractList) this).modCount++;
        int iM48R = m48R();
        if (i10 >= iM48R) {
            return m65P(this.f24v, iM48R, this.f22t, i10 - iM48R);
        }
        C0014e c0014e = new C0014e(this.f25w[0]);
        Object[] objArr = this.f24v;
        objArr.getClass();
        m65P(m47O(objArr, this.f22t, i10, c0014e), iM48R, this.f22t, 0);
        return c0014e.m29a();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        C1854d.m6552a(i10, size());
        return m50l(i10)[i10 & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        C1854d.m6553b(i10, size());
        return new C0019j(this, i10);
    }

    /* JADX INFO: renamed from: o */
    public final Object[] m74o(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: p */
    public final int m75p() {
        return ((AbstractList) this).modCount;
    }

    /* JADX INFO: renamed from: q */
    public final Object[] m76q() {
        return this.f24v;
    }

    /* JADX INFO: renamed from: r */
    public final int m77r() {
        return this.f22t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(final Collection collection) {
        return m64N(new InterfaceC0184l() { // from class: a1.g
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(C0017h.m49e(collection, obj));
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final Object[] m78s() {
        return this.f25w;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        C1854d.m6552a(i10, size());
        if (m48R() > i10) {
            C0014e c0014e = new C0014e(null);
            Object[] objArr = this.f24v;
            objArr.getClass();
            this.f24v = m67S(objArr, this.f22t, i10, obj, c0014e);
            return c0014e.m29a();
        }
        Object[] objArrM83y = m83y(this.f25w);
        if (objArrM83y != this.f25w) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = objArrM83y[i11];
        objArrM83y[i11] = obj;
        this.f25w = objArrM83y;
        return obj2;
    }

    /* JADX INFO: renamed from: t */
    public final void m79t(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        Object[] objArr3;
        if (this.f24v == null) {
            C10010p0.m38820a("root is null");
            return;
        }
        int i13 = i10 >> 5;
        Object[] objArrM68T = m68T(i13, i11, objArr, i12, objArr2);
        int iM48R = i12 - (((m48R() >> 5) - 1) - i13);
        if (iM48R < i12) {
            Object[] objArr4 = objArr[iM48R];
            objArr4.getClass();
            objArr3 = objArr4;
        } else {
            objArr3 = objArr2;
        }
        m69U(collection, i10, objArrM68T, 32, objArr, iM48R, objArr3);
    }

    /* JADX INFO: renamed from: v */
    public final void m80v(Object[] objArr, int i10, Object obj) {
        int iM70V = m70V();
        Object[] objArrM83y = m83y(this.f25w);
        Object[] objArr2 = this.f25w;
        if (iM70V >= 32) {
            Object obj2 = objArr2[31];
            AbstractC5102r.m20660l(objArr2, objArrM83y, i10 + 1, i10, 31);
            objArrM83y[i10] = obj;
            m58H(objArr, objArrM83y, m53B(obj2));
            return;
        }
        AbstractC5102r.m20660l(objArr2, objArrM83y, i10 + 1, i10, iM70V);
        objArrM83y[i10] = obj;
        this.f24v = objArr;
        this.f25w = objArrM83y;
        this.f26x = size() + 1;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m81w(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f23u;
    }

    /* JADX INFO: renamed from: x */
    public final ListIterator m82x(int i10) {
        Object[] objArr = this.f24v;
        if (objArr == null) {
            C10010p0.m38820a("Invalid root");
            return null;
        }
        int iM48R = m48R() >> 5;
        C1854d.m6553b(i10, iM48R);
        int i11 = this.f22t;
        return i11 == 0 ? new C0020k(objArr, i10) : new C0022m(objArr, i10, iM48R, i11 / 5);
    }

    /* JADX INFO: renamed from: y */
    public final Object[] m83y(Object[] objArr) {
        return objArr == null ? m52A() : m81w(objArr) ? objArr : AbstractC5102r.m20665q(objArr, m52A(), 0, 0, AbstractC2368o.m8582i(objArr.length, 32), 6, null);
    }

    /* JADX INFO: renamed from: z */
    public final Object[] m84z(Object[] objArr, int i10) {
        return m81w(objArr) ? AbstractC5102r.m20660l(objArr, objArr, i10, 0, 32 - i10) : AbstractC5102r.m20660l(objArr, m52A(), i10, 0, 32 - i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM70V = m70V();
        if (iM70V < 32) {
            Object[] objArrM83y = m83y(this.f25w);
            objArrM83y[iM70V] = obj;
            this.f25w = objArrM83y;
            this.f26x = size() + 1;
        } else {
            m58H(this.f24v, this.f25w, m53B(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM70V = m70V();
        Iterator it = collection.iterator();
        if (32 - iM70V >= collection.size()) {
            this.f25w = m74o(m83y(this.f25w), iM70V, it);
            this.f26x = size() + collection.size();
        } else {
            int size = ((collection.size() + iM70V) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = m74o(m83y(this.f25w), iM70V, it);
            for (int i10 = 1; i10 < size; i10++) {
                objArr[i10] = m74o(m52A(), 0, it);
            }
            this.f24v = m57G(this.f24v, m48R(), objArr);
            this.f25w = m74o(m52A(), 0, it);
            this.f26x = size() + collection.size();
        }
        return true;
    }
}
