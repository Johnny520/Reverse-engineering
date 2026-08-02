package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lz1 extends z2 implements Collection, q41 {
    public c3 h;
    public Object[] i;
    public Object[] j;
    public int k;
    public i51 l = new i51(6);
    public Object[] m;
    public Object[] n;
    public int o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lz1(c3 c3Var, Object[] objArr, Object[] objArr2, int i) {
        this.h = c3Var;
        this.i = objArr;
        this.j = objArr2;
        this.k = i;
        this.m = objArr;
        this.n = objArr2;
        this.o = c3Var.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object A(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.o - i;
        Object[] objArr2 = this.n;
        if (i4 == 1) {
            Object obj = objArr2[0];
            q(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrK = k(objArr2);
        mg.c0(objArr2, objArrK, i3, i3 + 1, i4);
        objArrK[i4 - 1] = null;
        this.m = objArr;
        this.n = objArrK;
        this.o = (i + i4) - 1;
        this.k = i2;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int B() {
        int i = this.o;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] C(Object[] objArr, int i, int i2, Object obj, k4 k4Var) {
        int iA = ig3.a(i2, i);
        Object[] objArrK = k(objArr);
        if (i != 0) {
            Object obj2 = objArrK[iA];
            obj2.getClass();
            objArrK[iA] = C((Object[]) obj2, i - 5, i2, obj, k4Var);
            return objArrK;
        }
        if (objArrK != objArr) {
            ((AbstractList) this).modCount++;
        }
        k4Var.h = objArrK[iA];
        objArrK[iA] = obj;
        return objArrK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void D(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM;
        if (i3 < 1) {
            j22.a("requires at least one nullBuffer");
        }
        Object[] objArrK = k(objArr);
        objArr2[0] = objArrK;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            mg.c0(objArrK, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM = objArrK;
            } else {
                objArrM = m();
                i3--;
                objArr2[i3] = objArrM;
            }
            int i7 = i2 - i6;
            mg.c0(objArrK, objArr3, 0, i7, i2);
            mg.c0(objArrK, objArrM, size + 1, i4, i7);
            objArr3 = objArrM;
        }
        Iterator it = collection.iterator();
        d(objArrK, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM2 = m();
            d(objArrM2, 0, it);
            objArr2[i8] = objArrM2;
        }
        d(objArr3, 0, it);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int E() {
        int i = this.o;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.z2
    public final int a() {
        return this.o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        up0.m(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iB = B();
        if (i >= iB) {
            h(this.m, i - iB, obj);
            return;
        }
        k4 k4Var = new k4(null);
        Object[] objArr = this.m;
        objArr.getClass();
        h(g(objArr, this.k, i, obj, k4Var), 0, k4Var.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrM;
        up0.m(i, this.o);
        if (i == this.o) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.o - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.n;
            Object[] objArrK = k(objArr);
            mg.c0(objArr, objArrK, size2 + 1, i3, E());
            d(objArrK, i3, collection.iterator());
            this.n = objArrK;
            this.o = collection.size() + this.o;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iE = E();
        int size3 = collection.size() + this.o;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= B()) {
            objArrM = m();
            collection2 = collection;
            D(collection2, i, this.n, iE, objArr2, size, objArrM);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.n;
            if (size3 > iE) {
                int i4 = size3 - iE;
                Object[] objArrL = l(i4, objArr3);
                f(collection2, i, i4, objArr2, size, objArrL);
                objArr2 = objArr2;
                objArrM = objArrL;
            } else {
                objArrM = m();
                int i5 = iE - size3;
                mg.c0(objArr3, objArrM, 0, i5, iE);
                int i6 = 32 - i5;
                Object[] objArrL2 = l(i6, this.n);
                int i7 = size - 1;
                objArr2[i7] = objArrL2;
                f(collection2, i, i6, objArr2, i7, objArrL2);
                collection2 = collection2;
            }
        }
        this.m = s(this.m, i2, objArr2);
        this.n = objArrM;
        this.o = collection2.size() + this.o;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.z2
    public final Object b(int i) {
        up0.k(i, a());
        ((AbstractList) this).modCount++;
        int iB = B();
        if (i >= iB) {
            return A(this.m, iB, this.k, i - iB);
        }
        k4 k4Var = new k4(this.n[0]);
        Object[] objArr = this.m;
        objArr.getClass();
        A(z(objArr, this.k, i, k4Var), iB, this.k, 0);
        return k4Var.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c3 c() {
        c3 ur2Var;
        Object[] objArr = this.m;
        if (objArr == this.i && this.n == this.j) {
            ur2Var = this.h;
        } else {
            this.l = new i51(6);
            this.i = objArr;
            Object[] objArr2 = this.n;
            this.j = objArr2;
            ur2Var = objArr == null ? objArr2.length == 0 ? ur2.i : new ur2(Arrays.copyOf(objArr2, this.o)) : new kz1(objArr, objArr2, this.o, this.k);
        }
        this.h = ur2Var;
        return ur2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e() {
        return ((AbstractList) this).modCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.m == null) {
            s.l("root is null");
            return;
        }
        int i4 = i >> 5;
        x2 x2VarJ = j(B() >> 5);
        int i5 = i3;
        Object[] objArrL = objArr2;
        while (x2VarJ.h - 1 != i4) {
            Object[] objArr3 = (Object[]) x2VarJ.previous();
            mg.c0(objArr3, objArrL, 0, 32 - i2, 32);
            objArrL = l(i2, objArr3);
            i5--;
            objArr[i5] = objArrL;
        }
        Object[] objArr4 = (Object[]) x2VarJ.previous();
        int iB = i3 - (((B() >> 5) - 1) - i4);
        if (iB < i3) {
            objArr2 = objArr[iB];
            objArr2.getClass();
        }
        D(collection, i, objArr4, 32, objArr, iB, objArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] g(Object[] objArr, int i, int i2, Object obj, k4 k4Var) {
        Object obj2;
        int iA = ig3.a(i2, i);
        if (i == 0) {
            k4Var.h = objArr[31];
            Object[] objArrK = k(objArr);
            mg.c0(objArr, objArrK, iA + 1, iA, 31);
            objArrK[iA] = obj;
            return objArrK;
        }
        Object[] objArrK2 = k(objArr);
        int i3 = i - 5;
        Object obj3 = objArrK2[iA];
        obj3.getClass();
        objArrK2[iA] = g((Object[]) obj3, i3, i2, obj, k4Var);
        while (true) {
            iA++;
            if (iA >= 32 || (obj2 = objArrK2[iA]) == null) {
                break;
            }
            objArrK2[iA] = g((Object[]) obj2, i3, 0, k4Var.h, k4Var);
        }
        return objArrK2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        up0.k(i, a());
        if (B() <= i) {
            objArr = this.n;
        } else {
            Object[] objArr2 = this.m;
            objArr2.getClass();
            for (int i2 = this.k; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[ig3.a(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(Object[] objArr, int i, Object obj) {
        int iE = E();
        Object[] objArrK = k(this.n);
        Object[] objArr2 = this.n;
        if (iE >= 32) {
            Object obj2 = objArr2[31];
            mg.c0(objArr2, objArrK, i + 1, i, 31);
            objArrK[i] = obj;
            t(objArr, objArrK, n(obj2));
            return;
        }
        mg.c0(objArr2, objArrK, i + 1, i, iE);
        objArrK[i] = obj;
        this.m = objArr;
        this.n = objArrK;
        this.o++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final x2 j(int i) {
        Object[] objArr = this.m;
        if (objArr == null) {
            s.l("Invalid root");
            return null;
        }
        int iB = B() >> 5;
        up0.m(i, iB);
        int i2 = this.k;
        return i2 == 0 ? new gn(i, objArr) : new g43(objArr, i, iB, i2 / 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] k(Object[] objArr) {
        if (objArr == null) {
            return m();
        }
        if (i(objArr)) {
            return objArr;
        }
        Object[] objArrM = m();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        mg.f0(objArr, objArrM, 0, length, 6);
        return objArrM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] l(int i, Object[] objArr) {
        if (i(objArr)) {
            mg.c0(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] objArrM = m();
        mg.c0(objArr, objArrM, i, 0, 32 - i);
        return objArrM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        up0.m(i, this.o);
        return new nz1(this, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] m() {
        Object[] objArr = new Object[33];
        objArr[32] = this.l;
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] n(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.l;
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] o(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            j22.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iA = ig3.a(i, i2);
        Object obj = objArr[iA];
        obj.getClass();
        Object objO = o((Object[]) obj, i, i2 - 5);
        if (iA < 31) {
            int i3 = iA + 1;
            if (objArr[i3] != null) {
                if (i(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM = m();
                mg.c0(objArr, objArrM, 0, 0, i3);
                objArr = objArrM;
            }
        }
        if (objO == objArr[iA]) {
            return objArr;
        }
        Object[] objArrK = k(objArr);
        objArrK[iA] = objO;
        return objArrK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] p(Object[] objArr, int i, int i2, k4 k4Var) {
        Object[] objArrP;
        int iA = ig3.a(i2 - 1, i);
        if (i == 5) {
            k4Var.h = objArr[iA];
            objArrP = null;
        } else {
            Object obj = objArr[iA];
            obj.getClass();
            objArrP = p((Object[]) obj, i - 5, i2, k4Var);
        }
        if (objArrP == null && iA == 0) {
            return null;
        }
        Object[] objArrK = k(objArr);
        objArrK[iA] = objArrP;
        return objArrK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.m = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.n = objArr;
            this.o = i;
            this.k = i2;
            return;
        }
        k4 k4Var = new k4(null);
        objArr.getClass();
        Object[] objArrP = p(objArr, i2, i, k4Var);
        objArrP.getClass();
        Object obj = k4Var.h;
        obj.getClass();
        this.n = (Object[]) obj;
        this.o = i;
        if (objArrP[1] == null) {
            this.m = (Object[]) objArrP[0];
            this.k = i2 - 5;
        } else {
            this.m = objArrP;
            this.k = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] r(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            j22.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            j22.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrK = k(objArr);
        int iA = ig3.a(i, i2);
        int i3 = i2 - 5;
        objArrK[iA] = r((Object[]) objArrK[iA], i, i3, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrK[iA] = r((Object[]) objArrK[iA], 0, i3, it);
        }
        return objArrK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return y(new b3(1, collection));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] s(Object[] objArr, int i, Object[][] objArr2) {
        t2 t2Var = new t2(objArr2);
        int i2 = i >> 5;
        int i3 = this.k;
        Object[] objArrR = i2 < (1 << i3) ? r(objArr, i, i3, t2Var) : k(objArr);
        while (t2Var.hasNext()) {
            this.k += 5;
            objArrR = n(objArrR);
            int i4 = this.k;
            r(objArrR, 1 << i4, i4, t2Var);
        }
        return objArrR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        up0.k(i, a());
        if (B() > i) {
            k4 k4Var = new k4(null);
            Object[] objArr = this.m;
            objArr.getClass();
            this.m = C(objArr, this.k, i, obj, k4Var);
            return k4Var.h;
        }
        Object[] objArrK = k(this.n);
        if (objArrK != this.n) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrK[i2];
        objArrK[i2] = obj;
        this.n = objArrK;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.o;
        int i2 = i >> 5;
        int i3 = this.k;
        if (i2 > (1 << i3)) {
            this.m = u(this.k + 5, n(objArr), objArr2);
            this.n = objArr3;
            this.k += 5;
            this.o++;
            return;
        }
        if (objArr == null) {
            this.m = objArr2;
            this.n = objArr3;
            this.o = i + 1;
        } else {
            this.m = u(i3, objArr, objArr2);
            this.n = objArr3;
            this.o++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] u(int i, Object[] objArr, Object[] objArr2) {
        int iA = ig3.a(a() - 1, i);
        Object[] objArrK = k(objArr);
        if (i == 5) {
            objArrK[iA] = objArr2;
            return objArrK;
        }
        objArrK[iA] = u(i - 5, (Object[]) objArrK[iA], objArr2);
        return objArrK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int v(in0 in0Var, Object[] objArr, int i, int i2, k4 k4Var, ArrayList arrayList, ArrayList arrayList2) {
        if (i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = k4Var.h;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) in0Var.j(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrM = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m();
                    i2 = 0;
                }
                objArrM[i2] = obj2;
                i2++;
            }
        }
        k4Var.h = objArrM;
        if (objArr2 != objArrM) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int w(in0 in0Var, Object[] objArr, int i, k4 k4Var) {
        Object[] objArrK = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) in0Var.j(obj)).booleanValue()) {
                if (!z) {
                    objArrK = k(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrK[i2] = obj;
                i2++;
            }
        }
        k4Var.h = objArrK;
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int x(in0 in0Var, int i, k4 k4Var) {
        int iW = w(in0Var, this.n, i, k4Var);
        Object obj = k4Var.h;
        if (iW == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iW, i, (Object) null);
        this.n = objArr;
        this.o -= i - iW;
        return iW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean y(in0 in0Var) {
        int i;
        in0 in0Var2 = in0Var;
        int iE = E();
        Object[] objArrO = null;
        k4 k4Var = new k4(null);
        boolean z = false;
        if (this.m != null) {
            x2 x2VarJ = j(0);
            int iW = 32;
            while (iW == 32 && x2VarJ.hasNext()) {
                iW = w(in0Var2, (Object[]) x2VarJ.next(), 32, k4Var);
            }
            if (iW == 32) {
                int iX = x(in0Var2, iE, k4Var);
                if (iX == 0) {
                    q(this.m, this.o, this.k);
                }
                if (iX != iE) {
                }
            } else {
                int i2 = (x2VarJ.h - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iV = iW;
                while (x2VarJ.hasNext()) {
                    iV = v(in0Var2, (Object[]) x2VarJ.next(), 32, iV, k4Var, arrayList2, arrayList);
                    in0Var2 = in0Var;
                }
                int iV2 = v(in0Var, this.n, iE, iV, k4Var, arrayList2, arrayList);
                Object obj = k4Var.h;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iV2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrR = this.m;
                if (zIsEmpty) {
                    objArrR.getClass();
                } else {
                    objArrR = r(objArrR, i2, this.k, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    j22.a("invalid size");
                }
                if (size == 0) {
                    this.k = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.k;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.k = i - 5;
                        Object[] objArr2 = objArrR[0];
                        objArr2.getClass();
                        objArrR = objArr2;
                    }
                    objArrO = o(objArrR, i3, i);
                }
                this.m = objArrO;
                this.n = objArr;
                this.o = size + iV2;
            }
            z = true;
        } else if (x(in0Var2, iE, k4Var) != iE) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] z(Object[] objArr, int i, int i2, k4 k4Var) {
        int iA = ig3.a(i2, i);
        if (i == 0) {
            Object obj = objArr[iA];
            Object[] objArrK = k(objArr);
            mg.c0(objArr, objArrK, iA, iA + 1, 32);
            objArrK[31] = k4Var.h;
            k4Var.h = obj;
            return objArrK;
        }
        int iA2 = objArr[31] == null ? ig3.a(B() - 1, i) : 31;
        Object[] objArrK2 = k(objArr);
        int i3 = i - 5;
        int i4 = iA + 1;
        if (i4 <= iA2) {
            while (true) {
                Object obj2 = objArrK2[iA2];
                obj2.getClass();
                objArrK2[iA2] = z((Object[]) obj2, i3, 0, k4Var);
                if (iA2 == i4) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrK2[iA];
        obj3.getClass();
        objArrK2[iA] = z((Object[]) obj3, i3, i2, k4Var);
        return objArrK2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iE = E();
        if (iE < 32) {
            Object[] objArrK = k(this.n);
            objArrK[iE] = obj;
            this.n = objArrK;
            this.o = a() + 1;
        } else {
            t(this.m, this.n, n(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iE = E();
        Iterator it = collection.iterator();
        if (32 - iE >= collection.size()) {
            Object[] objArrK = k(this.n);
            d(objArrK, iE, it);
            this.n = objArrK;
            this.o = collection.size() + this.o;
            return true;
        }
        int size = ((collection.size() + iE) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrK2 = k(this.n);
        d(objArrK2, iE, it);
        objArr[0] = objArrK2;
        for (int i = 1; i < size; i++) {
            Object[] objArrM = m();
            d(objArrM, 0, it);
            objArr[i] = objArrM;
        }
        this.m = s(this.m, B(), objArr);
        Object[] objArrM2 = m();
        d(objArrM2, 0, it);
        this.n = objArrM2;
        this.o = collection.size() + this.o;
        return true;
    }
}
