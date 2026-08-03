package p202o0;

import be.AbstractC0283h;
import java.util.Arrays;
import java.util.ListIterator;
import p092g4.AbstractC1341a;
import p103h3.C1577f;
import p117i0.AbstractC1861n1;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: o0.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3033e extends AbstractC3031c {

    /* JADX INFO: renamed from: g */
    public final Object[] f9839g;

    /* JADX INFO: renamed from: h */
    public final Object[] f9840h;

    /* JADX INFO: renamed from: i */
    public final int f9841i;

    /* JADX INFO: renamed from: j */
    public final int f9842j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3033e(Object[] objArr, Object[] objArr2, int i9, int i10) {
        this.f9839g = objArr;
        this.f9840h = objArr2;
        this.f9841i = i9;
        this.f9842j = i10;
        if (!(size() > 32)) {
            AbstractC1861n1.m4583a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        size();
        size();
        int length = objArr2.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static Object[] m6441i(Object[] objArr, int i9, int i10, Object obj, C1577f c1577f) {
        int iM3608x = AbstractC1341a.m3608x(i10, i9);
        if (i9 == 0) {
            Object[] objArrCopyOf = iM3608x == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC4165l.m8379n0(iM3608x + 1, iM3608x, objArr, 31, objArrCopyOf);
            c1577f.f5247a = objArr[31];
            objArrCopyOf[iM3608x] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i11 = i9 - 5;
        Object obj2 = objArr[iM3608x];
        obj2.getClass();
        objArrCopyOf2[iM3608x] = m6441i((Object[]) obj2, i11, i10, obj, c1577f);
        while (true) {
            iM3608x++;
            if (iM3608x >= 32 || objArrCopyOf2[iM3608x] == null) {
                break;
            }
            Object obj3 = objArr[iM3608x];
            obj3.getClass();
            objArrCopyOf2[iM3608x] = m6441i((Object[]) obj3, i11, 0, c1577f.f5247a, c1577f);
        }
        return objArrCopyOf2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Object[] m6442k(Object[] objArr, int i9, int i10, C1577f c1577f) {
        Object[] objArrM6442k;
        int iM3608x = AbstractC1341a.m3608x(i10, i9);
        if (i9 == 5) {
            c1577f.f5247a = objArr[iM3608x];
            objArrM6442k = null;
        } else {
            Object obj = objArr[iM3608x];
            obj.getClass();
            objArrM6442k = m6442k((Object[]) obj, i9 - 5, i10, c1577f);
        }
        if (objArrM6442k == null && iM3608x == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iM3608x] = objArrM6442k;
        return objArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static Object[] m6443q(int i9, int i10, Object obj, Object[] objArr) {
        int iM3608x = AbstractC1341a.m3608x(i10, i9);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i9 == 0) {
            objArrCopyOf[iM3608x] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iM3608x];
        obj2.getClass();
        objArrCopyOf[iM3608x] = m6443q(i9 - 5, i10, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p202o0.AbstractC3031c
    /* JADX INFO: renamed from: a */
    public final AbstractC3031c mo6434a(int i9, Object obj) {
        AbstractC0283h.m1173n(i9, size());
        if (i9 == size()) {
            return mo6435c(obj);
        }
        int iM6449p = m6449p();
        Object[] objArr = this.f9839g;
        if (i9 >= iM6449p) {
            return m6444j(obj, i9 - iM6449p, objArr);
        }
        C1577f c1577f = new C1577f(null);
        return m6444j(c1577f.f5247a, 0, m6441i(objArr, this.f9842j, i9, obj, c1577f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p202o0.AbstractC3031c
    /* JADX INFO: renamed from: c */
    public final AbstractC3031c mo6435c(Object obj) {
        int size = size() - m6449p();
        Object[] objArr = this.f9839g;
        Object[] objArr2 = this.f9840h;
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[size] = obj;
            return new C3033e(objArr, objArrCopyOf, size() + 1, this.f9842j);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return m6445l(objArr, objArr2, objArr3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p202o0.AbstractC3031c
    /* JADX INFO: renamed from: e */
    public final C3034f mo6437e() {
        return new C3034f(this, this.f9839g, this.f9840h, this.f9842j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p202o0.AbstractC3031c
    /* JADX INFO: renamed from: f */
    public final AbstractC3031c mo6438f(C3030b c3030b) {
        C3034f c3034f = new C3034f(this, this.f9839g, this.f9840h, this.f9842j);
        c3034f.m6480z(c3030b);
        return c3034f.m6459d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p202o0.AbstractC3031c
    /* JADX INFO: renamed from: g */
    public final AbstractC3031c mo6439g(int i9) {
        AbstractC0283h.m1171m(i9, size());
        int iM6449p = m6449p();
        int i10 = this.f9842j;
        Object[] objArr = this.f9839g;
        return i9 >= iM6449p ? m6448o(objArr, iM6449p, i10, i9 - iM6449p) : m6448o(m6447n(objArr, i10, i9, new C1577f(this.f9840h[0])), iM6449p, i10, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i9) {
        Object[] objArr;
        AbstractC0283h.m1171m(i9, size());
        if (m6449p() <= i9) {
            objArr = this.f9840h;
        } else {
            objArr = this.f9839g;
            for (int i10 = this.f9842j; i10 > 0; i10 -= 5) {
                Object obj = objArr[AbstractC1341a.m3608x(i9, i10)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i9 & 31];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a
    public final int getSize() {
        return this.f9841i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p202o0.AbstractC3031c
    /* JADX INFO: renamed from: h */
    public final AbstractC3031c mo6440h(int i9, Object obj) {
        AbstractC0283h.m1171m(i9, size());
        int iM6449p = m6449p();
        Object[] objArr = this.f9839g;
        Object[] objArr2 = this.f9840h;
        int i10 = this.f9842j;
        if (iM6449p > i9) {
            return new C3033e(m6443q(i10, i9, obj, objArr), objArr2, size(), i10);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i9 & 31] = obj;
        return new C3033e(objArr, objArrCopyOf, size(), i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final C3033e m6444j(Object obj, int i9, Object[] objArr) {
        int size = size() - m6449p();
        Object[] objArr2 = this.f9840h;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (size < 32) {
            AbstractC4165l.m8379n0(i9 + 1, i9, objArr2, size, objArrCopyOf);
            objArrCopyOf[i9] = obj;
            return new C3033e(objArr, objArrCopyOf, size() + 1, this.f9842j);
        }
        Object obj2 = objArr2[31];
        AbstractC4165l.m8379n0(i9 + 1, i9, objArr2, size - 1, objArrCopyOf);
        objArrCopyOf[i9] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m6445l(objArr, objArrCopyOf, objArr3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final C3033e m6445l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i9 = this.f9842j;
        if (size <= (1 << i9)) {
            return new C3033e(m6446m(i9, objArr, objArr2), objArr3, size() + 1, i9);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i10 = i9 + 5;
        return new C3033e(m6446m(i10, objArr4, objArr2), objArr3, size() + 1, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.List
    public final ListIterator listIterator(int i9) {
        AbstractC0283h.m1173n(i9, size());
        return new C3035g(i9, size(), this.f9839g, (this.f9842j / 5) + 1, this.f9840h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final Object[] m6446m(int i9, Object[] objArr, Object[] objArr2) {
        int iM3608x = AbstractC1341a.m3608x(size() - 1, i9);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i9 == 5) {
            objArrCopyOf[iM3608x] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iM3608x] = m6446m(i9 - 5, (Object[]) objArrCopyOf[iM3608x], objArr2);
        return objArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final Object[] m6447n(Object[] objArr, int i9, int i10, C1577f c1577f) {
        int iM3608x = AbstractC1341a.m3608x(i10, i9);
        if (i9 == 0) {
            Object[] objArrCopyOf = iM3608x == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC4165l.m8379n0(iM3608x, iM3608x + 1, objArr, 32, objArrCopyOf);
            objArrCopyOf[31] = c1577f.f5247a;
            c1577f.f5247a = objArr[iM3608x];
            return objArrCopyOf;
        }
        int iM3608x2 = objArr[31] == null ? AbstractC1341a.m3608x(m6449p() - 1, i9) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i11 = i9 - 5;
        int i12 = iM3608x + 1;
        if (i12 <= iM3608x2) {
            while (true) {
                Object obj = objArrCopyOf2[iM3608x2];
                obj.getClass();
                objArrCopyOf2[iM3608x2] = m6447n((Object[]) obj, i11, 0, c1577f);
                if (iM3608x2 == i12) {
                    break;
                }
                iM3608x2--;
            }
        }
        Object obj2 = objArrCopyOf2[iM3608x];
        obj2.getClass();
        objArrCopyOf2[iM3608x] = m6447n((Object[]) obj2, i11, i10, c1577f);
        return objArrCopyOf2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final AbstractC3031c m6448o(Object[] objArr, int i9, int i10, int i11) {
        int size = size() - i9;
        if (size != 1) {
            Object[] objArr2 = this.f9840h;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i12 = size - 1;
            if (i11 < i12) {
                AbstractC4165l.m8379n0(i11, i11 + 1, objArr2, size, objArrCopyOf);
            }
            objArrCopyOf[i12] = null;
            return new C3033e(objArr, objArrCopyOf, (i9 + size) - 1, i10);
        }
        if (i10 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new C3037i(objArr);
        }
        C1577f c1577f = new C1577f(null);
        Object[] objArrM6442k = m6442k(objArr, i10, i9 - 1, c1577f);
        objArrM6442k.getClass();
        Object obj = c1577f.f5247a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrM6442k[1] != null) {
            return new C3033e(objArrM6442k, objArr3, i9, i10);
        }
        Object obj2 = objArrM6442k[0];
        obj2.getClass();
        return new C3033e((Object[]) obj2, objArr3, i9, i10 - 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final int m6449p() {
        return (size() - 1) & (-32);
    }
}
