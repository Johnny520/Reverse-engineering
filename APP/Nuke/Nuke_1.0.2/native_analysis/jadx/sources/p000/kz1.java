package p000;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kz1 extends AbstractC0077c3 {

    /* JADX INFO: renamed from: h */
    public final Object[] f5853h;

    /* JADX INFO: renamed from: i */
    public final Object[] f5854i;

    /* JADX INFO: renamed from: j */
    public final int f5855j;

    /* JADX INFO: renamed from: k */
    public final int f5856k;

    public kz1(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.f5853h = objArr;
        this.f5854i = objArr2;
        this.f5855j = i;
        this.f5856k = i2;
        if (!(mo529a() > 32)) {
            j22.m2429a("Trie-based persistent vector should have at least 33 elements, got " + mo529a());
        }
        int length = objArr2.length;
    }

    /* JADX INFO: renamed from: i */
    public static Object[] m2767i(Object[] objArr, int i, int i2, Object obj, C0374k4 c0374k4) {
        int iM2346a = ig3.m2346a(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM2346a == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC0460mg.m3088c0(objArr, objArrCopyOf, iM2346a + 1, iM2346a, 31);
            c0374k4.f5331h = objArr[31];
            objArrCopyOf[iM2346a] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iM2346a];
        obj2.getClass();
        objArrCopyOf2[iM2346a] = m2767i((Object[]) obj2, i3, i2, obj, c0374k4);
        while (true) {
            iM2346a++;
            if (iM2346a >= 32 || objArrCopyOf2[iM2346a] == null) {
                break;
            }
            Object obj3 = objArr[iM2346a];
            obj3.getClass();
            objArrCopyOf2[iM2346a] = m2767i((Object[]) obj3, i3, 0, c0374k4.f5331h, c0374k4);
        }
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: k */
    public static Object[] m2768k(Object[] objArr, int i, int i2, C0374k4 c0374k4) {
        Object[] objArrM2768k;
        int iM2346a = ig3.m2346a(i2, i);
        if (i == 5) {
            c0374k4.f5331h = objArr[iM2346a];
            objArrM2768k = null;
        } else {
            Object obj = objArr[iM2346a];
            obj.getClass();
            objArrM2768k = m2768k((Object[]) obj, i - 5, i2, c0374k4);
        }
        if (objArrM2768k == null && iM2346a == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iM2346a] = objArrM2768k;
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: q */
    public static Object[] m2769q(Object[] objArr, int i, int i2, Object obj) {
        int iM2346a = ig3.m2346a(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iM2346a] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iM2346a];
        obj2.getClass();
        objArrCopyOf[iM2346a] = m2769q((Object[]) obj2, i - 5, i2, obj);
        return objArrCopyOf;
    }

    @Override // p000.AbstractC0372k2
    /* JADX INFO: renamed from: a */
    public final int mo529a() {
        return this.f5855j;
    }

    @Override // p000.AbstractC0077c3
    /* JADX INFO: renamed from: b */
    public final AbstractC0077c3 mo619b(int i, Object obj) {
        int i2 = this.f5855j;
        up0.m5548m(i, i2);
        if (i == i2) {
            return mo620c(obj);
        }
        int iM2775p = m2775p();
        Object[] objArr = this.f5853h;
        if (i >= iM2775p) {
            return m2770j(objArr, i - iM2775p, obj);
        }
        C0374k4 c0374k4 = new C0374k4(null);
        return m2770j(m2767i(objArr, this.f5856k, i, obj, c0374k4), 0, c0374k4.f5331h);
    }

    @Override // p000.AbstractC0077c3
    /* JADX INFO: renamed from: c */
    public final AbstractC0077c3 mo620c(Object obj) {
        int iM2775p = m2775p();
        int i = this.f5855j;
        int i2 = i - iM2775p;
        Object[] objArr = this.f5853h;
        Object[] objArr2 = this.f5854i;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new kz1(objArr, objArrCopyOf, i + 1, this.f5856k);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return m2771l(objArr, objArr2, objArr3);
    }

    @Override // p000.AbstractC0077c3
    /* JADX INFO: renamed from: e */
    public final lz1 mo622e() {
        return new lz1(this, this.f5853h, this.f5854i, this.f5856k);
    }

    @Override // p000.AbstractC0077c3
    /* JADX INFO: renamed from: f */
    public final AbstractC0077c3 mo623f(C0041b3 c0041b3) {
        lz1 lz1Var = new lz1(this, this.f5853h, this.f5854i, this.f5856k);
        lz1Var.m3018y(c0041b3);
        return lz1Var.m2997c();
    }

    @Override // p000.AbstractC0077c3
    /* JADX INFO: renamed from: g */
    public final AbstractC0077c3 mo624g(int i) {
        up0.m5546k(i, mo529a());
        int iM2775p = m2775p();
        int i2 = this.f5856k;
        Object[] objArr = this.f5853h;
        return i >= iM2775p ? m2774o(objArr, iM2775p, i2, i - iM2775p) : m2774o(m2773n(objArr, i2, i, new C0374k4(this.f5854i[0])), iM2775p, i2, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        up0.m5546k(i, mo529a());
        if (m2775p() <= i) {
            objArr = this.f5854i;
        } else {
            Object[] objArr2 = this.f5853h;
            for (int i2 = this.f5856k; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[ig3.m2346a(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // p000.AbstractC0077c3
    /* JADX INFO: renamed from: h */
    public final AbstractC0077c3 mo625h(int i, Object obj) {
        int i2 = this.f5855j;
        up0.m5546k(i, i2);
        int iM2775p = m2775p();
        Object[] objArr = this.f5853h;
        Object[] objArr2 = this.f5854i;
        int i3 = this.f5856k;
        if (iM2775p > i) {
            return new kz1(m2769q(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new kz1(objArr, objArrCopyOf, i2, i3);
    }

    /* JADX INFO: renamed from: j */
    public final kz1 m2770j(Object[] objArr, int i, Object obj) {
        int iM2775p = m2775p();
        int i2 = this.f5855j;
        int i3 = i2 - iM2775p;
        Object[] objArr2 = this.f5854i;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            AbstractC0460mg.m3088c0(objArr2, objArrCopyOf, i + 1, i, i3);
            objArrCopyOf[i] = obj;
            return new kz1(objArr, objArrCopyOf, i2 + 1, this.f5856k);
        }
        Object obj2 = objArr2[31];
        AbstractC0460mg.m3088c0(objArr2, objArrCopyOf, i + 1, i, i3 - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m2771l(objArr, objArrCopyOf, objArr3);
    }

    /* JADX INFO: renamed from: l */
    public final kz1 m2771l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f5855j;
        int i2 = i >> 5;
        int i3 = this.f5856k;
        if (i2 <= (1 << i3)) {
            return new kz1(m2772m(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new kz1(m2772m(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    @Override // p000.AbstractC0832w2, java.util.List
    public final ListIterator listIterator(int i) {
        up0.m5548m(i, this.f5855j);
        return new mz1(this.f5853h, this.f5854i, i, this.f5855j, (this.f5856k / 5) + 1);
    }

    /* JADX INFO: renamed from: m */
    public final Object[] m2772m(int i, Object[] objArr, Object[] objArr2) {
        int iM2346a = ig3.m2346a(mo529a() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iM2346a] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iM2346a] = m2772m(i - 5, (Object[]) objArrCopyOf[iM2346a], objArr2);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: n */
    public final Object[] m2773n(Object[] objArr, int i, int i2, C0374k4 c0374k4) {
        int iM2346a = ig3.m2346a(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM2346a == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC0460mg.m3088c0(objArr, objArrCopyOf, iM2346a, iM2346a + 1, 32);
            objArrCopyOf[31] = c0374k4.f5331h;
            c0374k4.f5331h = objArr[iM2346a];
            return objArrCopyOf;
        }
        int iM2346a2 = objArr[31] == null ? ig3.m2346a(m2775p() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iM2346a + 1;
        if (i4 <= iM2346a2) {
            while (true) {
                Object obj = objArrCopyOf2[iM2346a2];
                obj.getClass();
                objArrCopyOf2[iM2346a2] = m2773n((Object[]) obj, i3, 0, c0374k4);
                if (iM2346a2 == i4) {
                    break;
                }
                iM2346a2--;
            }
        }
        Object obj2 = objArrCopyOf2[iM2346a];
        obj2.getClass();
        objArrCopyOf2[iM2346a] = m2773n((Object[]) obj2, i3, i2, c0374k4);
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC0077c3 m2774o(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f5855j - i;
        if (i4 != 1) {
            Object[] objArr2 = this.f5854i;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                AbstractC0460mg.m3088c0(objArr2, objArrCopyOf, i3, i3 + 1, i4);
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
        C0374k4 c0374k4 = new C0374k4(null);
        Object[] objArrM2768k = m2768k(objArr, i2, i - 1, c0374k4);
        objArrM2768k.getClass();
        Object obj = c0374k4.f5331h;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrM2768k[1] != null) {
            return new kz1(objArrM2768k, objArr3, i, i2);
        }
        Object obj2 = objArrM2768k[0];
        obj2.getClass();
        return new kz1((Object[]) obj2, objArr3, i, i2 - 5);
    }

    /* JADX INFO: renamed from: p */
    public final int m2775p() {
        return (this.f5855j - 1) & (-32);
    }
}
