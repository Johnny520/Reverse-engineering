package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rj1 {

    /* JADX INFO: renamed from: a */
    public final rk1 f9606a;

    public /* synthetic */ rj1(rk1 rk1Var) {
        this.f9606a = rk1Var;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m4497a(rk1 rk1Var) {
        Object objM4505g = rk1Var.m4505g(null);
        if (objM4505g == null) {
            return null;
        }
        if (!(objM4505g instanceof lk1)) {
            rk1Var.m4509k(null);
            return objM4505g;
        }
        lk1 lk1Var = (lk1) objM4505g;
        if (lk1Var.m2932h()) {
            um2.m5519i("List is empty.");
            return null;
        }
        int i = lk1Var.f6164b - 1;
        Object objM2930f = lk1Var.m2930f(i);
        lk1Var.m2935k(i);
        objM2930f.getClass();
        if (lk1Var.m2932h()) {
            rk1Var.m4509k(null);
        }
        if (lk1Var.f6164b == 1) {
            rk1Var.m4511m(null, lk1Var.m2929e());
        }
        return objM2930f;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final lk1 m4498b(rk1 rk1Var) {
        if (rk1Var.m4507i()) {
            lk1 lk1Var = js1.f5196b;
            lk1Var.getClass();
            return lk1Var;
        }
        lk1 lk1Var2 = new lk1();
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
                                lk1Var2.m2926b((lk1) obj);
                            } else {
                                obj.getClass();
                                lk1Var2.m2925a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return lk1Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rj1) {
            return this.f9606a.equals(((rj1) obj).f9606a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9606a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f9606a + ')';
    }
}
