package p114X;

import com.bumptech.glide.AbstractC1925g;
import java.util.Arrays;
import java.util.ListIterator;
import p061L2.AbstractC0972l;
import p095T.AbstractC1380p0;
import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: X.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1617f extends AbstractC1614c {

    /* JADX INFO: renamed from: d */
    public final Object[] f5560d;

    /* JADX INFO: renamed from: e */
    public final Object[] f5561e;

    /* JADX INFO: renamed from: f */
    public final int f5562f;

    /* JADX INFO: renamed from: g */
    public final int f5563g;

    public C1617f(Object[] objArr, Object[] objArr2, int i5, int i6) {
        this.f5560d = objArr;
        this.f5561e = objArr2;
        this.f5562f = i5;
        this.f5563g = i6;
        if (!(mo1974a() > 32)) {
            AbstractC1380p0.m2542a("Trie-based persistent vector should have at least 33 elements, got " + mo1974a());
        }
        int length = objArr2.length;
    }

    /* JADX INFO: renamed from: i */
    public static Object[] m2884i(Object[] objArr, int i5, int i6, Object obj, C1616e c1616e) {
        Object[] objArrCopyOf;
        int iM4209v = AbstractC2352g.m4209v(i6, i5);
        if (i5 == 0) {
            if (iM4209v == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
            }
            AbstractC0972l.m1993Q(objArr, objArrCopyOf, iM4209v + 1, iM4209v, 31);
            c1616e.f5559a = objArr[31];
            objArrCopyOf[iM4209v] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC1665j.m2984d(objArrCopyOf2, "copyOf(...)");
        int i7 = i5 - 5;
        Object obj2 = objArr[iM4209v];
        AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iM4209v] = m2884i((Object[]) obj2, i7, i6, obj, c1616e);
        while (true) {
            iM4209v++;
            if (iM4209v >= 32 || objArrCopyOf2[iM4209v] == null) {
                break;
            }
            Object obj3 = objArr[iM4209v];
            AbstractC1665j.m2983c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iM4209v] = m2884i((Object[]) obj3, i7, 0, c1616e.f5559a, c1616e);
        }
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: k */
    public static Object[] m2885k(Object[] objArr, int i5, int i6, C1616e c1616e) {
        Object[] objArrM2885k;
        int iM4209v = AbstractC2352g.m4209v(i6, i5);
        if (i5 == 5) {
            c1616e.f5559a = objArr[iM4209v];
            objArrM2885k = null;
        } else {
            Object obj = objArr[iM4209v];
            AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM2885k = m2885k((Object[]) obj, i5 - 5, i6, c1616e);
        }
        if (objArrM2885k == null && iM4209v == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iM4209v] = objArrM2885k;
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: q */
    public static Object[] m2886q(Object[] objArr, int i5, int i6, Object obj) {
        int iM4209v = AbstractC2352g.m4209v(i6, i5);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
        if (i5 == 0) {
            objArrCopyOf[iM4209v] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iM4209v];
        AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iM4209v] = m2886q((Object[]) obj2, i5 - 5, i6, obj);
        return objArrCopyOf;
    }

    @Override // p061L2.AbstractC0961a
    /* JADX INFO: renamed from: a */
    public final int mo1974a() {
        return this.f5562f;
    }

    @Override // p114X.AbstractC1614c
    /* JADX INFO: renamed from: b */
    public final AbstractC1614c mo2877b(int i5, Object obj) {
        int i6 = this.f5562f;
        AbstractC1925g.m3531h(i5, i6);
        if (i5 == i6) {
            return mo2878c(obj);
        }
        int iM2892p = m2892p();
        Object[] objArr = this.f5560d;
        if (i5 >= iM2892p) {
            return m2887j(objArr, i5 - iM2892p, obj);
        }
        C1616e c1616e = new C1616e(null);
        return m2887j(m2884i(objArr, this.f5563g, i5, obj, c1616e), 0, c1616e.f5559a);
    }

    @Override // p114X.AbstractC1614c
    /* JADX INFO: renamed from: c */
    public final AbstractC1614c mo2878c(Object obj) {
        int iM2892p = m2892p();
        int i5 = this.f5562f;
        int i6 = i5 - iM2892p;
        Object[] objArr = this.f5560d;
        Object[] objArr2 = this.f5561e;
        if (i6 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return m2888l(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i6] = obj;
        return new C1617f(objArr, objArrCopyOf, i5 + 1, this.f5563g);
    }

    @Override // p114X.AbstractC1614c
    /* JADX INFO: renamed from: e */
    public final C1618g mo2880e() {
        return new C1618g(this, this.f5560d, this.f5561e, this.f5563g);
    }

    @Override // p114X.AbstractC1614c
    /* JADX INFO: renamed from: f */
    public final AbstractC1614c mo2881f(C1613b c1613b) {
        C1618g c1618g = new C1618g(this, this.f5560d, this.f5561e, this.f5563g);
        c1618g.m2920y(c1613b);
        return c1618g.m2899c();
    }

    @Override // p114X.AbstractC1614c
    /* JADX INFO: renamed from: g */
    public final AbstractC1614c mo2882g(int i5) {
        AbstractC1925g.m3530g(i5, this.f5562f);
        int iM2892p = m2892p();
        Object[] objArr = this.f5560d;
        int i6 = this.f5563g;
        return i5 >= iM2892p ? m2891o(objArr, iM2892p, i6, i5 - iM2892p) : m2891o(m2890n(objArr, i6, i5, new C1616e(this.f5561e[0])), iM2892p, i6, 0);
    }

    @Override // java.util.List
    public final Object get(int i5) {
        Object[] objArr;
        AbstractC1925g.m3530g(i5, mo1974a());
        if (m2892p() <= i5) {
            objArr = this.f5561e;
        } else {
            objArr = this.f5560d;
            for (int i6 = this.f5563g; i6 > 0; i6 -= 5) {
                Object obj = objArr[AbstractC2352g.m4209v(i5, i6)];
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i5 & 31];
    }

    @Override // p114X.AbstractC1614c
    /* JADX INFO: renamed from: h */
    public final AbstractC1614c mo2883h(int i5, Object obj) {
        int i6 = this.f5562f;
        AbstractC1925g.m3530g(i5, i6);
        int iM2892p = m2892p();
        Object[] objArr = this.f5560d;
        Object[] objArr2 = this.f5561e;
        int i7 = this.f5563g;
        if (iM2892p > i5) {
            return new C1617f(m2886q(objArr, i7, i5, obj), objArr2, i6, i7);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i5 & 31] = obj;
        return new C1617f(objArr, objArrCopyOf, i6, i7);
    }

    /* JADX INFO: renamed from: j */
    public final C1617f m2887j(Object[] objArr, int i5, Object obj) {
        int iM2892p = m2892p();
        int i6 = this.f5562f;
        int i7 = i6 - iM2892p;
        Object[] objArr2 = this.f5561e;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
        if (i7 < 32) {
            AbstractC0972l.m1993Q(objArr2, objArrCopyOf, i5 + 1, i5, i7);
            objArrCopyOf[i5] = obj;
            return new C1617f(objArr, objArrCopyOf, i6 + 1, this.f5563g);
        }
        Object obj2 = objArr2[31];
        AbstractC0972l.m1993Q(objArr2, objArrCopyOf, i5 + 1, i5, i7 - 1);
        objArrCopyOf[i5] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m2888l(objArr, objArrCopyOf, objArr3);
    }

    /* JADX INFO: renamed from: l */
    public final C1617f m2888l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i5 = this.f5562f;
        int i6 = i5 >> 5;
        int i7 = this.f5563g;
        if (i6 <= (1 << i7)) {
            return new C1617f(m2889m(i7, objArr, objArr2), objArr3, i5 + 1, i7);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i8 = i7 + 5;
        return new C1617f(m2889m(i8, objArr4, objArr2), objArr3, i5 + 1, i8);
    }

    @Override // p061L2.AbstractC0965e, java.util.List
    public final ListIterator listIterator(int i5) {
        AbstractC1925g.m3531h(i5, this.f5562f);
        return new C1619h(this.f5560d, this.f5561e, i5, this.f5562f, (this.f5563g / 5) + 1);
    }

    /* JADX INFO: renamed from: m */
    public final Object[] m2889m(int i5, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iM4209v = AbstractC2352g.m4209v(mo1974a() - 1, i5);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i5 == 5) {
            objArrCopyOf[iM4209v] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iM4209v] = m2889m(i5 - 5, (Object[]) objArrCopyOf[iM4209v], objArr2);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: n */
    public final Object[] m2890n(Object[] objArr, int i5, int i6, C1616e c1616e) {
        Object[] objArrCopyOf;
        int iM4209v = AbstractC2352g.m4209v(i6, i5);
        if (i5 == 0) {
            if (iM4209v == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
            }
            AbstractC0972l.m1993Q(objArr, objArrCopyOf, iM4209v, iM4209v + 1, 32);
            objArrCopyOf[31] = c1616e.f5559a;
            c1616e.f5559a = objArr[iM4209v];
            return objArrCopyOf;
        }
        int iM4209v2 = objArr[31] == null ? AbstractC2352g.m4209v(m2892p() - 1, i5) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC1665j.m2984d(objArrCopyOf2, "copyOf(...)");
        int i7 = i5 - 5;
        int i8 = iM4209v + 1;
        if (i8 <= iM4209v2) {
            while (true) {
                Object obj = objArrCopyOf2[iM4209v2];
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iM4209v2] = m2890n((Object[]) obj, i7, 0, c1616e);
                if (iM4209v2 == i8) {
                    break;
                }
                iM4209v2--;
            }
        }
        Object obj2 = objArrCopyOf2[iM4209v];
        AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iM4209v] = m2890n((Object[]) obj2, i7, i6, c1616e);
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC1614c m2891o(Object[] objArr, int i5, int i6, int i7) {
        int i8 = this.f5562f - i5;
        if (i8 != 1) {
            Object[] objArr2 = this.f5561e;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
            int i9 = i8 - 1;
            if (i7 < i9) {
                AbstractC0972l.m1993Q(objArr2, objArrCopyOf, i7, i7 + 1, i8);
            }
            objArrCopyOf[i9] = null;
            return new C1617f(objArr, objArrCopyOf, (i5 + i8) - 1, i6);
        }
        if (i6 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                AbstractC1665j.m2984d(objArr, "copyOf(...)");
            }
            return new C1621j(objArr);
        }
        C1616e c1616e = new C1616e(null);
        Object[] objArrM2885k = m2885k(objArr, i6, i5 - 1, c1616e);
        AbstractC1665j.m2982b(objArrM2885k);
        Object obj = c1616e.f5559a;
        AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrM2885k[1] != null) {
            return new C1617f(objArrM2885k, objArr3, i5, i6);
        }
        Object obj2 = objArrM2885k[0];
        AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new C1617f((Object[]) obj2, objArr3, i5, i6 - 5);
    }

    /* JADX INFO: renamed from: p */
    public final int m2892p() {
        return (this.f5562f - 1) & (-32);
    }
}
