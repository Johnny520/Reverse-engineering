package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class db2 {

    /* JADX INFO: renamed from: a */
    public final float f1956a;

    /* JADX INFO: renamed from: b */
    public final float f1957b;

    /* JADX INFO: renamed from: c */
    public final float f1958c;

    /* JADX INFO: renamed from: d */
    public final float f1959d;

    /* JADX INFO: renamed from: e */
    public final long f1960e;

    /* JADX INFO: renamed from: f */
    public final long f1961f;

    /* JADX INFO: renamed from: g */
    public final long f1962g;

    /* JADX INFO: renamed from: h */
    public final long f1963h;

    static {
        AbstractC0570p7.m3770f(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public db2(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f1956a = f;
        this.f1957b = f2;
        this.f1958c = f3;
        this.f1959d = f4;
        this.f1960e = j;
        this.f1961f = j2;
        this.f1962g = j3;
        this.f1963h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db2)) {
            return false;
        }
        db2 db2Var = (db2) obj;
        return Float.compare(this.f1956a, db2Var.f1956a) == 0 && Float.compare(this.f1957b, db2Var.f1957b) == 0 && Float.compare(this.f1958c, db2Var.f1958c) == 0 && Float.compare(this.f1959d, db2Var.f1959d) == 0 && fg1.m1645t(this.f1960e, db2Var.f1960e) && fg1.m1645t(this.f1961f, db2Var.f1961f) && fg1.m1645t(this.f1962g, db2Var.f1962g) && fg1.m1645t(this.f1963h, db2Var.f1963h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1963h) + hk1.m2204c(hk1.m2204c(hk1.m2204c(vi0.m5684c(this.f1959d, vi0.m5684c(this.f1958c, vi0.m5684c(this.f1957b, Float.hashCode(this.f1956a) * 31, 31), 31), 31), 31, this.f1960e), 31, this.f1961f), 31, this.f1962g);
    }

    public final String toString() {
        String str = t11.m5072X(this.f1956a) + ", " + t11.m5072X(this.f1957b) + ", " + t11.m5072X(this.f1958c) + ", " + t11.m5072X(this.f1959d);
        long j = this.f1960e;
        long j2 = this.f1961f;
        boolean zM1645t = fg1.m1645t(j, j2);
        long j3 = this.f1962g;
        long j4 = this.f1963h;
        if (!zM1645t || !fg1.m1645t(j2, j3) || !fg1.m1645t(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) fg1.m1628U(j)) + ", topRight=" + ((Object) fg1.m1628U(j2)) + ", bottomRight=" + ((Object) fg1.m1628U(j3)) + ", bottomLeft=" + ((Object) fg1.m1628U(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + t11.m5072X(Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + t11.m5072X(Float.intBitsToFloat(i)) + ", y=" + t11.m5072X(Float.intBitsToFloat(i2)) + ')';
    }
}
