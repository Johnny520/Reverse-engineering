package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class am0 extends pm0 {

    /* JADX INFO: renamed from: c */
    public static final am0 f194c = new am0(1, 0, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pm0
    /* JADX INFO: renamed from: a */
    public final void mo186a(rm0 rm0Var, InterfaceC0643q8 interfaceC0643q8, z11 z11Var, iu0 iu0Var, qm0 qm0Var) {
        int[] iArr;
        C0788u2 c0788u2;
        int iM5390c;
        int iM3516a = rm0Var.m3516a(0);
        if (z11Var.f7764n != 0) {
            AbstractC0653qi.m3252a("Cannot move a group while inserting");
        }
        if (iM3516a < 0) {
            AbstractC0653qi.m3252a("Parameter offset is out of bounds");
        }
        if (iM3516a == 0) {
            return;
        }
        int i = z11Var.f7770t;
        int i2 = z11Var.f7772v;
        int i3 = z11Var.f7771u;
        int i4 = i;
        while (true) {
            iArr = z11Var.f7752b;
            if (iM3516a <= 0) {
                break;
            }
            i4 += iArr[(z11Var.m5404r(i4) * 5) + 3];
            if (i4 > i3) {
                AbstractC0653qi.m3252a("Parameter offset is out of bounds");
            }
            iM3516a--;
        }
        int i5 = iArr[(z11Var.m5404r(i4) * 5) + 3];
        int iM5394g = z11Var.m5394g(z11Var.f7752b, z11Var.m5404r(z11Var.f7770t));
        int iM5394g2 = z11Var.m5394g(z11Var.f7752b, z11Var.m5404r(i4));
        int i6 = i4 + i5;
        int iM5394g3 = z11Var.m5394g(z11Var.f7752b, z11Var.m5404r(i6));
        int i7 = iM5394g3 - iM5394g2;
        z11Var.m5410x(i7, Math.max(z11Var.f7770t - 1, 0));
        z11Var.m5409w(i5);
        int[] iArr2 = z11Var.f7752b;
        int iM5404r = z11Var.m5404r(i6) * 5;
        AbstractC0201f9.m1055a0(iArr2, iArr2, z11Var.m5404r(i) * 5, iM5404r, (i5 * 5) + iM5404r);
        if (i7 > 0) {
            Object[] objArr = z11Var.f7753c;
            int iM5395h = z11Var.m5395h(iM5394g2 + i7);
            System.arraycopy(objArr, iM5395h, objArr, iM5394g, z11Var.m5395h(iM5394g3 + i7) - iM5395h);
        }
        int i8 = iM5394g2 + i7;
        int i9 = i8 - iM5394g;
        int i10 = z11Var.f7761k;
        int i11 = z11Var.f7762l;
        int length = z11Var.f7753c.length;
        int i12 = z11Var.f7763m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iM5404r2 = z11Var.m5404r(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iM5404r2 * 5) + 4] = z11.m5365i(z11.m5365i(z11Var.m5394g(iArr2, iM5404r2) - i15, i12 < iM5404r2 ? 0 : i10, i11, length), z11Var.f7761k, z11Var.f7762l, z11Var.f7753c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iM5402p = z11Var.m5402p();
        int iM5199a = y11.m5199a(z11Var.f7754d, i6, iM5402p);
        ArrayList arrayList = new ArrayList();
        if (iM5199a >= 0) {
            while (iM5199a < z11Var.f7754d.size() && (iM5390c = z11Var.m5390c((c0788u2 = (C0788u2) z11Var.f7754d.get(iM5199a)))) >= i6 && iM5390c < i16) {
                arrayList.add(c0788u2);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            C0788u2 c0788u22 = (C0788u2) arrayList.get(i18);
            int iM5390c2 = z11Var.m5390c(c0788u22) + i17;
            if (iM5390c2 >= z11Var.f7757g) {
                c0788u22.f6110a = -(iM5402p - iM5390c2);
            } else {
                c0788u22.f6110a = iM5390c2;
            }
            z11Var.f7754d.add(y11.m5199a(z11Var.f7754d, iM5390c2, iM5402p), c0788u22);
        }
        if (z11Var.m5375I(i6, i5)) {
            AbstractC0653qi.m3252a("Unexpectedly removed anchors");
        }
        z11Var.m5399m(i2, z11Var.f7771u, i);
        if (i7 > 0) {
            z11Var.m5376J(i8, i7, i6 - 1);
        }
    }
}
