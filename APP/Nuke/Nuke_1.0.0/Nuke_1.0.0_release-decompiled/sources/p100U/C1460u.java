package p100U;

import java.util.ArrayList;
import p058L.C0946r;
import p061L2.AbstractC0972l;
import p095T.AbstractC1322K0;
import p095T.AbstractC1387t;
import p095T.C1324L0;
import p095T.C1349a;
import p095T.InterfaceC1353c;
import p136b0.C1849k;

/* JADX INFO: renamed from: U.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1460u extends AbstractC1437J {

    /* JADX INFO: renamed from: c */
    public static final C1460u f5138c = new C1460u(1, 0, 2);

    @Override // p100U.AbstractC1437J
    /* JADX INFO: renamed from: a */
    public final void mo2722a(C0946r c0946r, InterfaceC1353c interfaceC1353c, C1324L0 c1324l0, C1849k c1849k, InterfaceC1438K interfaceC1438K) {
        C1349a c1349a;
        int iM2473c;
        int iM1952c = c0946r.m1952c(0);
        if (c1324l0.f4736n != 0) {
            AbstractC1387t.m2638a("Cannot move a group while inserting");
        }
        if (iM1952c < 0) {
            AbstractC1387t.m2638a("Parameter offset is out of bounds");
        }
        if (iM1952c == 0) {
            return;
        }
        int i5 = c1324l0.f4742t;
        int i6 = c1324l0.f4744v;
        int i7 = c1324l0.f4743u;
        int i8 = i5;
        while (iM1952c > 0) {
            i8 += c1324l0.f4724b[(c1324l0.m2487r(i8) * 5) + 3];
            if (i8 > i7) {
                AbstractC1387t.m2638a("Parameter offset is out of bounds");
            }
            iM1952c--;
        }
        int i9 = c1324l0.f4724b[(c1324l0.m2487r(i8) * 5) + 3];
        int iM2477g = c1324l0.m2477g(c1324l0.f4724b, c1324l0.m2487r(c1324l0.f4742t));
        int iM2477g2 = c1324l0.m2477g(c1324l0.f4724b, c1324l0.m2487r(i8));
        int i10 = i8 + i9;
        int iM2477g3 = c1324l0.m2477g(c1324l0.f4724b, c1324l0.m2487r(i10));
        int i11 = iM2477g3 - iM2477g2;
        c1324l0.m2493x(i11, Math.max(c1324l0.f4742t - 1, 0));
        c1324l0.m2492w(i9);
        int[] iArr = c1324l0.f4724b;
        int iM2487r = c1324l0.m2487r(i10) * 5;
        AbstractC0972l.m1991O(iArr, iArr, c1324l0.m2487r(i5) * 5, iM2487r, (i9 * 5) + iM2487r);
        if (i11 > 0) {
            Object[] objArr = c1324l0.f4725c;
            int iM2478h = c1324l0.m2478h(iM2477g2 + i11);
            System.arraycopy(objArr, iM2478h, objArr, iM2477g, c1324l0.m2478h(iM2477g3 + i11) - iM2478h);
        }
        int i12 = iM2477g2 + i11;
        int i13 = i12 - iM2477g;
        int i14 = c1324l0.f4733k;
        int i15 = c1324l0.f4734l;
        int length = c1324l0.f4725c.length;
        int i16 = c1324l0.f4735m;
        int i17 = i5 + i9;
        int i18 = i5;
        while (i18 < i17) {
            int iM2487r2 = c1324l0.m2487r(i18);
            int i19 = i13;
            int[] iArr2 = iArr;
            iArr2[(iM2487r2 * 5) + 4] = C1324L0.m2448i(C1324L0.m2448i(c1324l0.m2477g(iArr, iM2487r2) - i19, i16 < iM2487r2 ? 0 : i14, i15, length), c1324l0.f4733k, c1324l0.f4734l, c1324l0.f4725c.length);
            i18++;
            i13 = i19;
            iArr = iArr2;
            i14 = i14;
        }
        int i20 = i10 + i9;
        int iM2485p = c1324l0.m2485p();
        int iM2443b = AbstractC1322K0.m2443b(c1324l0.f4726d, i10, iM2485p);
        ArrayList arrayList = new ArrayList();
        if (iM2443b >= 0) {
            while (iM2443b < c1324l0.f4726d.size() && (iM2473c = c1324l0.m2473c((c1349a = (C1349a) c1324l0.f4726d.get(iM2443b)))) >= i10 && iM2473c < i20) {
                arrayList.add(c1349a);
            }
        }
        int i21 = i5 - i10;
        int size = arrayList.size();
        for (int i22 = 0; i22 < size; i22++) {
            C1349a c1349a2 = (C1349a) arrayList.get(i22);
            int iM2473c2 = c1324l0.m2473c(c1349a2) + i21;
            if (iM2473c2 >= c1324l0.f4729g) {
                c1349a2.f4783a = -(iM2485p - iM2473c2);
            } else {
                c1349a2.f4783a = iM2473c2;
            }
            c1324l0.f4726d.add(AbstractC1322K0.m2443b(c1324l0.f4726d, iM2473c2, iM2485p), c1349a2);
        }
        if (c1324l0.m2458I(i10, i9)) {
            AbstractC1387t.m2638a("Unexpectedly removed anchors");
        }
        c1324l0.m2482m(i6, c1324l0.f4743u, i5);
        if (i11 > 0) {
            c1324l0.m2459J(i12, i11, i10 - 1);
        }
    }
}
