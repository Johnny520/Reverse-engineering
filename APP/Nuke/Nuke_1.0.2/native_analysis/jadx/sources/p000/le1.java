package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class le1 implements z92 {

    /* JADX INFO: renamed from: i */
    public boolean f6078i;

    /* JADX INFO: renamed from: j */
    public boolean f6079j;

    /* JADX INFO: renamed from: h */
    public boolean f6077h = true;

    /* JADX INFO: renamed from: k */
    public final rk1 f6080k = new rk1();

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2902a() {
        rk1 rk1Var = this.f6080k;
        Object[] objArr = rk1Var.f9620c;
        long[] jArr = rk1Var.f9618a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof lk1) {
                                lk1 lk1Var = (lk1) obj;
                                Object[] objArr2 = lk1Var.f6163a;
                                int i4 = lk1Var.f6164b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        rk1Var.m4499a();
    }
}
