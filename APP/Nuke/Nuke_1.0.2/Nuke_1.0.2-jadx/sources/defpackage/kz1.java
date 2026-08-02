package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kz1 extends c3 {
    public final Object[] h;
    public final Object[] i;
    public final int j;
    public final int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kz1(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.h = objArr;
        this.i = objArr2;
        this.j = i;
        this.k = i2;
        if (!(a() > 32)) {
            j22.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object[] i(Object[] objArr, int i, int i2, Object obj, k4 k4Var) {
        int iA = ig3.a(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iA == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            mg.c0(objArr, objArrCopyOf, iA + 1, iA, 31);
            k4Var.h = objArr[31];
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iA];
        obj2.getClass();
        objArrCopyOf2[iA] = i((Object[]) obj2, i3, i2, obj, k4Var);
        while (true) {
            iA++;
            if (iA >= 32 || objArrCopyOf2[iA] == null) {
                break;
            }
            Object obj3 = objArr[iA];
            obj3.getClass();
            objArrCopyOf2[iA] = i((Object[]) obj3, i3, 0, k4Var.h, k4Var);
        }
        return objArrCopyOf2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object[] k(Object[] objArr, int i, int i2, k4 k4Var) {
        Object[] objArrK;
        int iA = ig3.a(i2, i);
        if (i == 5) {
            k4Var.h = objArr[iA];
            objArrK = null;
        } else {
            Object obj = objArr[iA];
            obj.getClass();
            objArrK = k((Object[]) obj, i - 5, i2, k4Var);
        }
        if (objArrK == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iA] = objArrK;
        return objArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object[] q(Object[] objArr, int i, int i2, Object obj) {
        int iA = ig3.a(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iA];
        obj2.getClass();
        objArrCopyOf[iA] = q((Object[]) obj2, i - 5, i2, obj);
        return objArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k2
    public final int a() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c3
    public final c3 b(int i, Object obj) {
        int i2 = this.j;
        up0.m(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int iP = p();
        Object[] objArr = this.h;
        if (i >= iP) {
            return j(objArr, i - iP, obj);
        }
        k4 k4Var = new k4(null);
        return j(i(objArr, this.k, i, obj, k4Var), 0, k4Var.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c3
    public final c3 c(Object obj) {
        int iP = p();
        int i = this.j;
        int i2 = i - iP;
        Object[] objArr = this.h;
        Object[] objArr2 = this.i;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new kz1(objArr, objArrCopyOf, i + 1, this.k);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return l(objArr, objArr2, objArr3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c3
    public final lz1 e() {
        return new lz1(this, this.h, this.i, this.k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c3
    public final c3 f(b3 b3Var) {
        lz1 lz1Var = new lz1(this, this.h, this.i, this.k);
        lz1Var.y(b3Var);
        return lz1Var.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c3
    public final c3 g(int i) {
        up0.k(i, a());
        int iP = p();
        int i2 = this.k;
        Object[] objArr = this.h;
        return i >= iP ? o(objArr, iP, i2, i - iP) : o(n(objArr, i2, i, new k4(this.i[0])), iP, i2, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        up0.k(i, a());
        if (p() <= i) {
            objArr = this.i;
        } else {
            Object[] objArr2 = this.h;
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
    @Override // defpackage.c3
    public final c3 h(int i, Object obj) {
        int i2 = this.j;
        up0.k(i, i2);
        int iP = p();
        Object[] objArr = this.h;
        Object[] objArr2 = this.i;
        int i3 = this.k;
        if (iP > i) {
            return new kz1(q(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new kz1(objArr, objArrCopyOf, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final kz1 j(Object[] objArr, int i, Object obj) {
        int iP = p();
        int i2 = this.j;
        int i3 = i2 - iP;
        Object[] objArr2 = this.i;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            mg.c0(objArr2, objArrCopyOf, i + 1, i, i3);
            objArrCopyOf[i] = obj;
            return new kz1(objArr, objArrCopyOf, i2 + 1, this.k);
        }
        Object obj2 = objArr2[31];
        mg.c0(objArr2, objArrCopyOf, i + 1, i, i3 - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return l(objArr, objArrCopyOf, objArr3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final kz1 l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.j;
        int i2 = i >> 5;
        int i3 = this.k;
        if (i2 <= (1 << i3)) {
            return new kz1(m(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new kz1(m(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w2, java.util.List
    public final ListIterator listIterator(int i) {
        up0.m(i, this.j);
        return new mz1(this.h, this.i, i, this.j, (this.k / 5) + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] m(int i, Object[] objArr, Object[] objArr2) {
        int iA = ig3.a(a() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iA] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iA] = m(i - 5, (Object[]) objArrCopyOf[iA], objArr2);
        return objArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] n(Object[] objArr, int i, int i2, k4 k4Var) {
        int iA = ig3.a(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iA == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            mg.c0(objArr, objArrCopyOf, iA, iA + 1, 32);
            objArrCopyOf[31] = k4Var.h;
            k4Var.h = objArr[iA];
            return objArrCopyOf;
        }
        int iA2 = objArr[31] == null ? ig3.a(p() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iA + 1;
        if (i4 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                obj.getClass();
                objArrCopyOf2[iA2] = n((Object[]) obj, i3, 0, k4Var);
                if (iA2 == i4) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        obj2.getClass();
        objArrCopyOf2[iA] = n((Object[]) obj2, i3, i2, k4Var);
        return objArrCopyOf2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c3 o(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.j - i;
        if (i4 != 1) {
            Object[] objArr2 = this.i;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                mg.c0(objArr2, objArrCopyOf, i3, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new kz1(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new ur2(objArr);
        }
        k4 k4Var = new k4(null);
        Object[] objArrK = k(objArr, i2, i - 1, k4Var);
        objArrK.getClass();
        Object obj = k4Var.h;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrK[1] != null) {
            return new kz1(objArrK, objArr3, i, i2);
        }
        Object obj2 = objArrK[0];
        obj2.getClass();
        return new kz1((Object[]) obj2, objArr3, i, i2 - 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int p() {
        return (this.j - 1) & (-32);
    }
}
