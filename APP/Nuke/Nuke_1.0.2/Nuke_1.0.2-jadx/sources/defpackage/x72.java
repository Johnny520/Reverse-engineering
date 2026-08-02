package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x72 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final yi g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x72(long j, long j2, long j3, long j4, long j5, float[] fArr, yi yiVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = yiVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && x72.class == obj.getClass()) {
                x72 x72Var = (x72) obj;
                if (this.a == x72Var.a && this.b == x72Var.b && this.e == x72Var.e && z01.a(this.c, x72Var.c) && z01.a(this.d, x72Var.d)) {
                    float[] fArr = x72Var.f;
                    float[] fArr2 = this.f;
                    if (fArr2 == null) {
                        zEquals = fArr == null;
                        if (zEquals) {
                            if (!(this.g == x72Var.g)) {
                            }
                        }
                    } else {
                        if (fArr != null) {
                            zEquals = fArr2.equals(fArr);
                        }
                        if (zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iC = hk1.c(hk1.c(hk1.c(hk1.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] fArr = this.f;
        return this.g.hashCode() + ((iC + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
