package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oa1 extends fb3 {

    /* JADX INFO: renamed from: b */
    public final zj1 f7603b;

    public oa1() {
        zj1 zj1Var = y01.f13265a;
        this.f7603b = new zj1();
    }

    @Override // p000.fb3
    /* JADX INFO: renamed from: b */
    public final void mo1596b() {
        zj1 zj1Var = this.f7603b;
        int[] iArr = zj1Var.f12750b;
        Object[] objArr = zj1Var.f12751c;
        long[] jArr = zj1Var.f12749a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        lk1 lk1Var = (lk1) objArr[i4];
                        Object[] objArr2 = lk1Var.f6163a;
                        int i6 = lk1Var.f6164b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            na1 na1Var = (na1) objArr2[i7];
                            InterfaceC0508np interfaceC0508np = na1Var.f7085d;
                            if (interfaceC0508np != null) {
                                interfaceC0508np.cancel();
                            }
                            na1Var.f7085d = null;
                            le1 le1Var = (le1) na1Var.f7082a.f6983i;
                            le1Var.f6078i = true;
                            le1Var.f6077h = false;
                            le1Var.m2902a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
