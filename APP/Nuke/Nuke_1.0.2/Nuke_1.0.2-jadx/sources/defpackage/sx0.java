package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sx0 {
    public static int k;
    public static final eb l = new eb(28);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final r93 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sx0(String str, float f, float f2, float f3, float f4, r93 r93Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = r93Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx0)) {
            return false;
        }
        sx0 sx0Var = (sx0) obj;
        return t11.l(this.a, sx0Var.a) && za0.b(this.b, sx0Var.b) && za0.b(this.c, sx0Var.c) && this.d == sx0Var.d && this.e == sx0Var.e && this.f.equals(sx0Var.f) && ju.c(this.g, sx0Var.g) && this.h == sx0Var.h && this.i == sx0Var.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + vi0.c(this.e, vi0.c(this.d, vi0.c(this.c, vi0.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = ju.h;
        return Boolean.hashCode(this.i) + vi0.d(this.h, hk1.c(iHashCode, 31, this.g), 31);
    }
}
