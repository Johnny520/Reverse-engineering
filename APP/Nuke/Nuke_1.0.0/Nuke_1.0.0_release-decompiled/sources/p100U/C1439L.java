package p100U;

import p058L.C0946r;
import p061L2.AbstractC0972l;
import p095T.C1324L0;
import p095T.C1349a;
import p095T.InterfaceC1353c;
import p128a.AbstractC1785a;
import p136b0.C1849k;

/* JADX INFO: renamed from: U.L */
/* JADX INFO: loaded from: classes.dex */
public final class C1439L extends AbstractC1785a {

    /* JADX INFO: renamed from: i */
    public int f5097i;

    /* JADX INFO: renamed from: k */
    public int f5099k;

    /* JADX INFO: renamed from: m */
    public int f5101m;

    /* JADX INFO: renamed from: h */
    public AbstractC1437J[] f5096h = new AbstractC1437J[16];

    /* JADX INFO: renamed from: j */
    public int[] f5098j = new int[16];

    /* JADX INFO: renamed from: l */
    public Object[] f5100l = new Object[16];

    /* JADX INFO: renamed from: v */
    public final void m2724v() {
        this.f5097i = 0;
        this.f5099k = 0;
        AbstractC0972l.m1998V(this.f5100l, 0, this.f5101m);
        this.f5101m = 0;
    }

    /* JADX INFO: renamed from: w */
    public final void m2725w(InterfaceC1353c interfaceC1353c, C1324L0 c1324l0, C1849k c1849k, InterfaceC1438K interfaceC1438K) {
        if (m2727y()) {
            C0946r c0946r = new C0946r(this);
            C1439L c1439l = (C1439L) c0946r.f2978e;
            while (true) {
                AbstractC1437J abstractC1437J = c1439l.f5096h[c0946r.f2975b];
                C1349a c1349aMo2723b = abstractC1437J.mo2723b(c0946r);
                InterfaceC1353c interfaceC1353c2 = interfaceC1353c;
                C1324L0 c1324l02 = c1324l0;
                C1849k c1849k2 = c1849k;
                InterfaceC1438K interfaceC1438K2 = interfaceC1438K;
                try {
                    abstractC1437J.mo2722a(c0946r, interfaceC1353c2, c1324l02, c1849k2, interfaceC1438K2);
                    int i5 = c0946r.f2975b;
                    int i6 = c1439l.f5097i;
                    if (i5 < i6) {
                        AbstractC1437J abstractC1437J2 = c1439l.f5096h[i5];
                        c0946r.f2976c += abstractC1437J2.f5094a;
                        c0946r.f2977d += abstractC1437J2.f5095b;
                        int i7 = i5 + 1;
                        c0946r.f2975b = i7;
                        if (i7 >= i6) {
                            break;
                        }
                        interfaceC1353c = interfaceC1353c2;
                        c1324l0 = c1324l02;
                        c1849k = c1849k2;
                        interfaceC1438K = interfaceC1438K2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        m2724v();
    }

    /* JADX INFO: renamed from: x */
    public final boolean m2726x() {
        return this.f5097i == 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m2727y() {
        return this.f5097i != 0;
    }

    /* JADX INFO: renamed from: z */
    public final void m2728z(AbstractC1437J abstractC1437J) {
        int i5 = this.f5097i;
        AbstractC1437J[] abstractC1437JArr = this.f5096h;
        if (i5 == abstractC1437JArr.length) {
            AbstractC1437J[] abstractC1437JArr2 = new AbstractC1437J[(i5 > 1024 ? 1024 : i5) + i5];
            System.arraycopy(abstractC1437JArr, 0, abstractC1437JArr2, 0, i5);
            this.f5096h = abstractC1437JArr2;
        }
        int i6 = this.f5099k;
        int i7 = abstractC1437J.f5094a;
        int i8 = abstractC1437J.f5095b;
        int i9 = i6 + i7;
        int[] iArr = this.f5098j;
        int length = iArr.length;
        if (i9 > length) {
            int i10 = (length > 1024 ? 1024 : length) + length;
            if (i10 >= i9) {
                i9 = i10;
            }
            int[] iArr2 = new int[i9];
            AbstractC0972l.m1991O(iArr, iArr2, 0, 0, length);
            this.f5098j = iArr2;
        }
        int i11 = this.f5101m + i8;
        Object[] objArr = this.f5100l;
        int length2 = objArr.length;
        if (i11 > length2) {
            int i12 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i12 >= i11) {
                i11 = i12;
            }
            Object[] objArr2 = new Object[i11];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f5100l = objArr2;
        }
        AbstractC1437J[] abstractC1437JArr3 = this.f5096h;
        int i13 = this.f5097i;
        this.f5097i = i13 + 1;
        abstractC1437JArr3[i13] = abstractC1437J;
        this.f5099k += abstractC1437J.f5094a;
        this.f5101m += i8;
    }
}
