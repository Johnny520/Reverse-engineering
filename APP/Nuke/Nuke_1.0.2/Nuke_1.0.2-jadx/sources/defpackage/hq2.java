package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hq2 {
    public final fb2 a;
    public final fb2 b;
    public final fb2 c;
    public final fb2 d;
    public final fb2 e;
    public final fb2 f;
    public final fb2 g;
    public final fb2 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hq2() {
        fb2 fb2Var = fq2.a;
        fb2 fb2Var2 = fq2.b;
        fb2 fb2Var3 = fq2.c;
        fb2 fb2Var4 = fq2.d;
        fb2 fb2Var5 = fq2.f;
        fb2 fb2Var6 = fq2.e;
        fb2 fb2Var7 = fq2.g;
        fb2 fb2Var8 = fq2.h;
        this.a = fb2Var;
        this.b = fb2Var2;
        this.c = fb2Var3;
        this.d = fb2Var4;
        this.e = fb2Var5;
        this.f = fb2Var6;
        this.g = fb2Var7;
        this.h = fb2Var8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq2)) {
            return false;
        }
        hq2 hq2Var = (hq2) obj;
        return t11.l(this.a, hq2Var.a) && t11.l(this.b, hq2Var.b) && t11.l(this.c, hq2Var.c) && t11.l(this.d, hq2Var.d) && t11.l(this.e, hq2Var.e) && t11.l(this.f, hq2Var.f) && t11.l(this.g, hq2Var.g) && t11.l(this.h, hq2Var.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
