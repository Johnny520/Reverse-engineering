package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ca0 extends qc1 {

    /* JADX INFO: renamed from: b */
    public final ug0 f771b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ca0() {
        ug0 ug0Var = v20.f6389a;
        this.f771b = new ug0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qc1
    /* JADX INFO: renamed from: b */
    public final void mo508b() {
        ug0 ug0Var = this.f771b;
        int[] iArr = ug0Var.f6112b;
        Object[] objArr = ug0Var.f6113c;
        long[] jArr = ug0Var.f6111a;
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
                        dh0 dh0Var = (dh0) objArr[i4];
                        Object[] objArr2 = dh0Var.f1108a;
                        int i6 = dh0Var.f1109b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ba0 ba0Var = (ba0) objArr2[i7];
                            InterfaceC0958yc interfaceC0958yc = ba0Var.f481d;
                            if (interfaceC0958yc != null) {
                                interfaceC0958yc.cancel();
                            }
                            ba0Var.f481d = null;
                            bd0 bd0Var = (bd0) ba0Var.f478a.f7232e;
                            bd0Var.f496e = true;
                            bd0Var.f495d = false;
                            bd0Var.m349a();
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
