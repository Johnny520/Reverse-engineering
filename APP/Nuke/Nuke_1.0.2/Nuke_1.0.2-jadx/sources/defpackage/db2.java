package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class db2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        p7.f(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public db2(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db2)) {
            return false;
        }
        db2 db2Var = (db2) obj;
        return Float.compare(this.a, db2Var.a) == 0 && Float.compare(this.b, db2Var.b) == 0 && Float.compare(this.c, db2Var.c) == 0 && Float.compare(this.d, db2Var.d) == 0 && fg1.t(this.e, db2Var.e) && fg1.t(this.f, db2Var.f) && fg1.t(this.g, db2Var.g) && fg1.t(this.h, db2Var.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.h) + hk1.c(hk1.c(hk1.c(vi0.c(this.d, vi0.c(this.c, vi0.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = t11.X(this.a) + ", " + t11.X(this.b) + ", " + t11.X(this.c) + ", " + t11.X(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zT = fg1.t(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zT || !fg1.t(j2, j3) || !fg1.t(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) fg1.U(j)) + ", topRight=" + ((Object) fg1.U(j2)) + ", bottomRight=" + ((Object) fg1.U(j3)) + ", bottomLeft=" + ((Object) fg1.U(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + t11.X(Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + t11.X(Float.intBitsToFloat(i)) + ", y=" + t11.X(Float.intBitsToFloat(i2)) + ')';
    }
}
