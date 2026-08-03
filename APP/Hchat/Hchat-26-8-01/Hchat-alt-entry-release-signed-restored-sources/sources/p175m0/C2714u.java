package p175m0;

import java.util.ArrayList;
import p020b5.C0190i;
import p100h0.C1548s;
import p117i0.AbstractC1855m;
import p117i0.InterfaceC1807a;
import p159l0.AbstractC2428j;
import p159l0.C2420b;
import p159l0.C2429k;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: m0.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2714u extends AbstractC2701j0 {

    /* JADX INFO: renamed from: c */
    public static final C2714u f8792c = new C2714u(1, 0, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p175m0.AbstractC2701j0
    /* JADX INFO: renamed from: a */
    public final void mo6126a(C1548s c1548s, InterfaceC1807a interfaceC1807a, C2429k c2429k, C0190i c0190i, InterfaceC2703k0 interfaceC2703k0) {
        int[] iArr;
        C2420b c2420b;
        int iM5818c;
        int iM4048c = c1548s.m4048c(0);
        if (c2429k.f7976n != 0) {
            AbstractC1855m.m4573a("Cannot move a group while inserting");
        }
        if (iM4048c < 0) {
            AbstractC1855m.m4573a("Parameter offset is out of bounds");
        }
        if (iM4048c == 0) {
            return;
        }
        int i9 = c2429k.f7982t;
        int i10 = c2429k.f7984v;
        int i11 = c2429k.f7983u;
        int i12 = i9;
        while (true) {
            iArr = c2429k.f7964b;
            if (iM4048c <= 0) {
                break;
            }
            i12 += iArr[(c2429k.m5832r(i12) * 5) + 3];
            if (i12 > i11) {
                AbstractC1855m.m4573a("Parameter offset is out of bounds");
            }
            iM4048c--;
        }
        int i13 = iArr[(c2429k.m5832r(i12) * 5) + 3];
        int iM5822g = c2429k.m5822g(c2429k.f7964b, c2429k.m5832r(c2429k.f7982t));
        int iM5822g2 = c2429k.m5822g(c2429k.f7964b, c2429k.m5832r(i12));
        int i14 = i12 + i13;
        int iM5822g3 = c2429k.m5822g(c2429k.f7964b, c2429k.m5832r(i14));
        int i15 = iM5822g3 - iM5822g2;
        c2429k.m5838x(i15, Math.max(c2429k.f7982t - 1, 0));
        c2429k.m5837w(i13);
        int[] iArr2 = c2429k.f7964b;
        int iM5832r = c2429k.m5832r(i14) * 5;
        AbstractC4165l.m8381p0(iArr2, iArr2, c2429k.m5832r(i9) * 5, iM5832r, (i13 * 5) + iM5832r);
        if (i15 > 0) {
            Object[] objArr = c2429k.f7965c;
            int iM5823h = c2429k.m5823h(iM5822g2 + i15);
            System.arraycopy(objArr, iM5823h, objArr, iM5822g, c2429k.m5823h(iM5822g3 + i15) - iM5823h);
        }
        int i16 = iM5822g2 + i15;
        int i17 = i16 - iM5822g;
        int i18 = c2429k.f7973k;
        int i19 = c2429k.f7974l;
        int length = c2429k.f7965c.length;
        int i20 = c2429k.f7975m;
        int i21 = i9 + i13;
        int i22 = i9;
        while (i22 < i21) {
            int iM5832r2 = c2429k.m5832r(i22);
            int i23 = i17;
            int[] iArr3 = iArr2;
            iArr3[(iM5832r2 * 5) + 4] = C2429k.m5793i(C2429k.m5793i(c2429k.m5822g(iArr2, iM5832r2) - i23, i20 < iM5832r2 ? 0 : i18, i19, length), c2429k.f7973k, c2429k.f7974l, c2429k.f7965c.length);
            i22++;
            i17 = i23;
            iArr2 = iArr3;
            i18 = i18;
        }
        int i24 = i14 + i13;
        int iM5830p = c2429k.m5830p();
        int iM5787a = AbstractC2428j.m5787a(c2429k.f7966d, i14, iM5830p);
        ArrayList arrayList = new ArrayList();
        if (iM5787a >= 0) {
            while (iM5787a < c2429k.f7966d.size() && (iM5818c = c2429k.m5818c((c2420b = (C2420b) c2429k.f7966d.get(iM5787a)))) >= i14 && iM5818c < i24) {
                arrayList.add(c2420b);
            }
        }
        int i25 = i9 - i14;
        int size = arrayList.size();
        for (int i26 = 0; i26 < size; i26++) {
            C2420b c2420b2 = (C2420b) arrayList.get(i26);
            int iM5818c2 = c2429k.m5818c(c2420b2) + i25;
            if (iM5818c2 >= c2429k.f7969g) {
                c2420b2.f7923a = -(iM5830p - iM5818c2);
            } else {
                c2420b2.f7923a = iM5818c2;
            }
            c2429k.f7966d.add(AbstractC2428j.m5787a(c2429k.f7966d, iM5818c2, iM5830p), c2420b2);
        }
        if (c2429k.m5803I(i14, i13)) {
            AbstractC1855m.m4573a("Unexpectedly removed anchors");
        }
        c2429k.m5827m(i10, c2429k.f7983u, i9);
        if (i15 > 0) {
            c2429k.m5804J(i16, i15, i14 - 1);
        }
    }
}
