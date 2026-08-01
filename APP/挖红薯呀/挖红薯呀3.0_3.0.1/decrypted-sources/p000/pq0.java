package p000;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class pq0 extends AbstractC0112d0 {

    /* JADX INFO: renamed from: d */
    public final Object[] f4942d;

    /* JADX INFO: renamed from: e */
    public final Object[] f4943e;

    /* JADX INFO: renamed from: f */
    public final int f4944f;

    /* JADX INFO: renamed from: g */
    public final int f4945g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pq0(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.f4942d = objArr;
        this.f4943e = objArr2;
        this.f4944f = i;
        this.f4945g = i2;
        if (!(mo6a() > 32)) {
            wr0.m5024a("Trie-based persistent vector should have at least 33 elements, got " + mo6a());
        }
        int length = objArr2.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static Object[] m3145i(Object[] objArr, int i, int i2, Object obj, C0910x1 c0910x1) {
        int iM1668r = j50.m1668r(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM1668r == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC0201f9.m1057c0(objArr, objArrCopyOf, iM1668r + 1, iM1668r, 31);
            c0910x1.f7232e = objArr[31];
            objArrCopyOf[iM1668r] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iM1668r];
        obj2.getClass();
        objArrCopyOf2[iM1668r] = m3145i((Object[]) obj2, i3, i2, obj, c0910x1);
        while (true) {
            iM1668r++;
            if (iM1668r >= 32 || objArrCopyOf2[iM1668r] == null) {
                break;
            }
            Object obj3 = objArr[iM1668r];
            obj3.getClass();
            objArrCopyOf2[iM1668r] = m3145i((Object[]) obj3, i3, 0, c0910x1.f7232e, c0910x1);
        }
        return objArrCopyOf2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Object[] m3146k(Object[] objArr, int i, int i2, C0910x1 c0910x1) {
        Object[] objArrM3146k;
        int iM1668r = j50.m1668r(i2, i);
        if (i == 5) {
            c0910x1.f7232e = objArr[iM1668r];
            objArrM3146k = null;
        } else {
            Object obj = objArr[iM1668r];
            obj.getClass();
            objArrM3146k = m3146k((Object[]) obj, i - 5, i2, c0910x1);
        }
        if (objArrM3146k == null && iM1668r == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iM1668r] = objArrM3146k;
        return objArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static Object[] m3147q(Object[] objArr, int i, int i2, Object obj) {
        int iM1668r = j50.m1668r(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iM1668r] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iM1668r];
        obj2.getClass();
        objArrCopyOf[iM1668r] = m3147q((Object[]) obj2, i - 5, i2, obj);
        return objArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p
    /* JADX INFO: renamed from: a */
    public final int mo6a() {
        return this.f4944f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0112d0
    /* JADX INFO: renamed from: b */
    public final AbstractC0112d0 mo7b(int i, Object obj) {
        int i2 = this.f4944f;
        z60.m5444n(i, i2);
        if (i == i2) {
            return mo8c(obj);
        }
        int iM3153p = m3153p();
        Object[] objArr = this.f4942d;
        if (i >= iM3153p) {
            return m3148j(objArr, i - iM3153p, obj);
        }
        C0910x1 c0910x1 = new C0910x1(15, (Object) null);
        return m3148j(m3145i(objArr, this.f4945g, i, obj, c0910x1), 0, c0910x1.f7232e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0112d0
    /* JADX INFO: renamed from: c */
    public final AbstractC0112d0 mo8c(Object obj) {
        int iM3153p = m3153p();
        int i = this.f4944f;
        int i2 = i - iM3153p;
        Object[] objArr = this.f4942d;
        Object[] objArr2 = this.f4943e;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new pq0(objArr, objArrCopyOf, i + 1, this.f4945g);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return m3149l(objArr, objArr2, objArr3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0112d0
    /* JADX INFO: renamed from: e */
    public final qq0 mo10e() {
        return new qq0(this, this.f4942d, this.f4943e, this.f4945g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0112d0
    /* JADX INFO: renamed from: f */
    public final AbstractC0112d0 mo11f(C0074c0 c0074c0) {
        qq0 qq0Var = new qq0(this, this.f4942d, this.f4943e, this.f4945g);
        qq0Var.m3322y(c0074c0);
        return qq0Var.m3301c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0112d0
    /* JADX INFO: renamed from: g */
    public final AbstractC0112d0 mo12g(int i) {
        z60.m5443m(i, mo6a());
        int iM3153p = m3153p();
        int i2 = this.f4945g;
        Object[] objArr = this.f4942d;
        if (i >= iM3153p) {
            return m3152o(objArr, iM3153p, i2, i - iM3153p);
        }
        return m3152o(m3151n(objArr, i2, i, new C0910x1(15, this.f4943e[0])), iM3153p, i2, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        z60.m5443m(i, mo6a());
        if (m3153p() <= i) {
            objArr = this.f4943e;
        } else {
            Object[] objArr2 = this.f4942d;
            for (int i2 = this.f4945g; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[j50.m1668r(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0112d0
    /* JADX INFO: renamed from: h */
    public final AbstractC0112d0 mo13h(int i, Object obj) {
        int i2 = this.f4944f;
        z60.m5443m(i, i2);
        int iM3153p = m3153p();
        Object[] objArr = this.f4942d;
        Object[] objArr2 = this.f4943e;
        int i3 = this.f4945g;
        if (iM3153p > i) {
            return new pq0(m3147q(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new pq0(objArr, objArrCopyOf, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final pq0 m3148j(Object[] objArr, int i, Object obj) {
        int iM3153p = m3153p();
        int i2 = this.f4944f;
        int i3 = i2 - iM3153p;
        Object[] objArr2 = this.f4943e;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            AbstractC0201f9.m1057c0(objArr2, objArrCopyOf, i + 1, i, i3);
            objArrCopyOf[i] = obj;
            return new pq0(objArr, objArrCopyOf, i2 + 1, this.f4945g);
        }
        Object obj2 = objArr2[31];
        AbstractC0201f9.m1057c0(objArr2, objArrCopyOf, i + 1, i, i3 - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m3149l(objArr, objArrCopyOf, objArr3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final pq0 m3149l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f4944f;
        int i2 = i >> 5;
        int i3 = this.f4945g;
        if (i2 <= (1 << i3)) {
            return new pq0(m3150m(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new pq0(m3150m(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0945y, java.util.List
    public final ListIterator listIterator(int i) {
        z60.m5444n(i, this.f4944f);
        return new rq0(this.f4942d, this.f4943e, i, this.f4944f, (this.f4945g / 5) + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final Object[] m3150m(int i, Object[] objArr, Object[] objArr2) {
        int iM1668r = j50.m1668r(mo6a() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iM1668r] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iM1668r] = m3150m(i - 5, (Object[]) objArrCopyOf[iM1668r], objArr2);
        return objArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final Object[] m3151n(Object[] objArr, int i, int i2, C0910x1 c0910x1) {
        int iM1668r = j50.m1668r(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM1668r == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC0201f9.m1057c0(objArr, objArrCopyOf, iM1668r, iM1668r + 1, 32);
            objArrCopyOf[31] = c0910x1.f7232e;
            c0910x1.f7232e = objArr[iM1668r];
            return objArrCopyOf;
        }
        int iM1668r2 = objArr[31] == null ? j50.m1668r(m3153p() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iM1668r + 1;
        if (i4 <= iM1668r2) {
            while (true) {
                Object obj = objArrCopyOf2[iM1668r2];
                obj.getClass();
                objArrCopyOf2[iM1668r2] = m3151n((Object[]) obj, i3, 0, c0910x1);
                if (iM1668r2 == i4) {
                    break;
                }
                iM1668r2--;
            }
        }
        Object obj2 = objArrCopyOf2[iM1668r];
        obj2.getClass();
        objArrCopyOf2[iM1668r] = m3151n((Object[]) obj2, i3, i2, c0910x1);
        return objArrCopyOf2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final AbstractC0112d0 m3152o(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f4944f - i;
        Object obj = null;
        if (i4 != 1) {
            Object[] objArr2 = this.f4943e;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                AbstractC0201f9.m1057c0(objArr2, objArrCopyOf, i3, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new pq0(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new a21(objArr);
        }
        C0910x1 c0910x1 = new C0910x1(15, obj);
        Object[] objArrM3146k = m3146k(objArr, i2, i - 1, c0910x1);
        objArrM3146k.getClass();
        Object obj2 = c0910x1.f7232e;
        obj2.getClass();
        Object[] objArr3 = (Object[]) obj2;
        if (objArrM3146k[1] != null) {
            return new pq0(objArrM3146k, objArr3, i, i2);
        }
        Object obj3 = objArrM3146k[0];
        obj3.getClass();
        return new pq0((Object[]) obj3, objArr3, i, i2 - 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final int m3153p() {
        return (this.f4944f - 1) & (-32);
    }
}
