package p000;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class qg0 {

    /* JADX INFO: renamed from: a */
    public final jh0 f5144a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final Object m3250a(jh0 jh0Var) {
        Object objM1701g = jh0Var.m1701g(null);
        if (objM1701g == null) {
            return null;
        }
        if (!(objM1701g instanceof dh0)) {
            jh0Var.m1705k(null);
            return objM1701g;
        }
        dh0 dh0Var = (dh0) objM1701g;
        if (dh0Var.m704h()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = dh0Var.f1109b - 1;
        Object objM702f = dh0Var.m702f(i);
        dh0Var.m707k(i);
        objM702f.getClass();
        if (dh0Var.m704h()) {
            jh0Var.m1705k(null);
        }
        if (dh0Var.f1109b == 1) {
            jh0Var.m1707m(null, dh0Var.m701e());
        }
        return objM702f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final dh0 m3251b(jh0 jh0Var) {
        if (jh0Var.m1703i()) {
            dh0 dh0Var = kk0.f3183b;
            dh0Var.getClass();
            return dh0Var;
        }
        dh0 dh0Var2 = new dh0();
        Object[] objArr = jh0Var.f2880c;
        long[] jArr = jh0Var.f2878a;
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
                            if (obj instanceof dh0) {
                                dh0Var2.m698b((dh0) obj);
                            } else {
                                obj.getClass();
                                dh0Var2.m697a(obj);
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
        return dh0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof qg0) {
            return this.f5144a.equals(((qg0) obj).f5144a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5144a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MultiValueMap(map=" + this.f5144a + ')';
    }
}
