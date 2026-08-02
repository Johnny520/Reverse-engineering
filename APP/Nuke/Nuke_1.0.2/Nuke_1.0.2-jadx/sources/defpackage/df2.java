package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class df2 {
    public final bf2 a;
    public final rh2 b;
    public final qi2 c;
    public final uk2 d;
    public final tf2 e;
    public final bl2 f;
    public final hi2 g;
    public final gh2 h;
    public final nh2 i;
    public final c20 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public df2(b5 b5Var, hh1 hh1Var, hq1 hq1Var, b5 b5Var2, hi2 hi2Var, sz0 sz0Var, b5 b5Var3, int i) {
        bl2 bl2Var = ar1.h;
        bf2 bf2Var = new bf2();
        rh2 rh2Var = (i & 2) != 0 ? sn.Q : b5Var;
        qi2 qi2Var = (i & 4) != 0 ? gd3.F : hh1Var;
        uk2 uk2Var = (i & 8) != 0 ? sn.R : hq1Var;
        tf2 tf2Var = (i & 16) != 0 ? sf2.a : b5Var2;
        bl2Var = (i & 32) != 0 ? al2.a : bl2Var;
        hi2Var = (i & 64) != 0 ? gi2.a : hi2Var;
        gh2 gh2Var = (i & 128) != 0 ? fh2.b : sz0Var;
        nh2 nh2Var = (i & 256) != 0 ? mh2.a : b5Var3;
        c60 c60Var = o90.a;
        t50 t50Var = t50.j;
        tf2Var.getClass();
        t50Var.getClass();
        this.a = bf2Var;
        this.b = rh2Var;
        this.c = qi2Var;
        this.d = uk2Var;
        this.e = tf2Var;
        this.f = bl2Var;
        this.g = hi2Var;
        this.h = gh2Var;
        this.i = nh2Var;
        this.j = t50Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df2)) {
            return false;
        }
        df2 df2Var = (df2) obj;
        return t11.l(this.a, df2Var.a) && t11.l(this.b, df2Var.b) && t11.l(this.c, df2Var.c) && t11.l(this.d, df2Var.d) && t11.l(this.e, df2Var.e) && t11.l(this.f, df2Var.f) && t11.l(this.g, df2Var.g) && t11.l(this.h, df2Var.h) && t11.l(this.i, df2Var.i) && t11.l(this.j, df2Var.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptApiOptions(limits=" + this.a + ", logSink=" + this.b + ", permissionGrantProvider=" + this.c + ", storageRootProvider=" + this.d + ", configStore=" + this.e + ", uiProvider=" + this.f + ", messagingProvider=" + this.g + ", hostObjectAccessProvider=" + this.h + ", hostRuntimeProvider=" + this.i + ", ioDispatcher=" + this.j + ")";
    }
}
