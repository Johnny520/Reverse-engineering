package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mp1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mp1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
        this.o = j15;
        this.p = j16;
        this.q = j17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp1)) {
            return false;
        }
        mp1 mp1Var = (mp1) obj;
        return ju.c(this.a, mp1Var.a) && ju.c(this.b, mp1Var.b) && ju.c(this.c, mp1Var.c) && ju.c(this.d, mp1Var.d) && ju.c(this.e, mp1Var.e) && ju.c(this.f, mp1Var.f) && ju.c(this.g, mp1Var.g) && ju.c(this.h, mp1Var.h) && ju.c(this.i, mp1Var.i) && ju.c(this.j, mp1Var.j) && ju.c(this.k, mp1Var.k) && ju.c(this.l, mp1Var.l) && ju.c(this.m, mp1Var.m) && ju.c(this.n, mp1Var.n) && ju.c(this.o, mp1Var.o) && ju.c(this.p, mp1Var.p) && ju.c(this.q, mp1Var.q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = ju.h;
        return Long.hashCode(this.q) + hk1.c(hk1.c(hk1.c(hk1.c(hk1.c(hk1.c(hk1.c(hk1.c(hk1.c(hk1.c(hk1.c(hk1.c(hk1.c(hk1.c(hk1.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strI = ju.i(this.a);
        String strI2 = ju.i(this.b);
        String strI3 = ju.i(this.c);
        String strI4 = ju.i(this.d);
        String strI5 = ju.i(this.e);
        String strI6 = ju.i(this.f);
        String strI7 = ju.i(this.g);
        String strI8 = ju.i(this.h);
        String strI9 = ju.i(this.i);
        String strI10 = ju.i(this.j);
        String strI11 = ju.i(this.k);
        String strI12 = ju.i(this.l);
        String strI13 = ju.i(this.m);
        String strI14 = ju.i(this.n);
        String strI15 = ju.i(this.o);
        String strI16 = ju.i(this.p);
        String strI17 = ju.i(this.q);
        StringBuilder sbO = vi0.o("NukeColors(backgroundTop=", strI, ", backgroundCenter=", strI2, ", backgroundBottom=");
        hk1.o(sbO, strI3, ", title=", strI4, ", subtitle=");
        hk1.o(sbO, strI5, ", buttonBackground=", strI6, ", buttonIcon=");
        hk1.o(sbO, strI7, ", buttonText=", strI8, ", noticeText=");
        hk1.o(sbO, strI9, ", authorText=", strI10, ", authorReflection=");
        hk1.o(sbO, strI11, ", scopeListBackground=", strI12, ", scopeDivider=");
        hk1.o(sbO, strI13, ", scopeNameText=", strI14, ", scopeRangeText=");
        hk1.o(sbO, strI15, ", scopeTagBackground=", strI16, ", scopeTagText=");
        return hk1.j(sbO, strI17, ")");
    }
}
