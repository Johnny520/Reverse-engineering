package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rj1 {
    public final rk1 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [jo0.a():java.lang.Object] */
    public /* synthetic */ rj1(rk1 rk1Var) {
        this.a = rk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object a(rk1 rk1Var) {
        Object objG = rk1Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof lk1)) {
            rk1Var.k(null);
            return objG;
        }
        lk1 lk1Var = (lk1) objG;
        if (lk1Var.h()) {
            um2.i("List is empty.");
            return null;
        }
        int i = lk1Var.b - 1;
        Object objF = lk1Var.f(i);
        lk1Var.k(i);
        objF.getClass();
        if (lk1Var.h()) {
            rk1Var.k(null);
        }
        if (lk1Var.b == 1) {
            rk1Var.m(null, lk1Var.e());
        }
        return objF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final lk1 b(rk1 rk1Var) {
        if (rk1Var.i()) {
            lk1 lk1Var = js1.b;
            lk1Var.getClass();
            return lk1Var;
        }
        lk1 lk1Var2 = new lk1();
        Object[] objArr = rk1Var.c;
        long[] jArr = rk1Var.a;
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
                                lk1Var2.b((lk1) obj);
                            } else {
                                obj.getClass();
                                lk1Var2.a(obj);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof rj1) {
            return this.a.equals(((rj1) obj).a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
