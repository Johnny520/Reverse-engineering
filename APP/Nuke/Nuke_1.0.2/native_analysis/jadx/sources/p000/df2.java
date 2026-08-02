package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class df2 {

    /* JADX INFO: renamed from: a */
    public final bf2 f2023a;

    /* JADX INFO: renamed from: b */
    public final rh2 f2024b;

    /* JADX INFO: renamed from: c */
    public final qi2 f2025c;

    /* JADX INFO: renamed from: d */
    public final uk2 f2026d;

    /* JADX INFO: renamed from: e */
    public final tf2 f2027e;

    /* JADX INFO: renamed from: f */
    public final bl2 f2028f;

    /* JADX INFO: renamed from: g */
    public final hi2 f2029g;

    /* JADX INFO: renamed from: h */
    public final gh2 f2030h;

    /* JADX INFO: renamed from: i */
    public final nh2 f2031i;

    /* JADX INFO: renamed from: j */
    public final c20 f2032j;

    public df2(C0043b5 c0043b5, hh1 hh1Var, hq1 hq1Var, C0043b5 c0043b52, hi2 hi2Var, sz0 sz0Var, C0043b5 c0043b53, int i) {
        bl2 bl2Var = ar1.f359h;
        bf2 bf2Var = new bf2();
        rh2 rh2Var = (i & 2) != 0 ? C0700sn.f10213Q : c0043b5;
        qi2 qi2Var = (i & 4) != 0 ? gd3.f3419F : hh1Var;
        uk2 uk2Var = (i & 8) != 0 ? C0700sn.f10214R : hq1Var;
        tf2 tf2Var = (i & 16) != 0 ? sf2.f10105a : c0043b52;
        bl2Var = (i & 32) != 0 ? al2.f245a : bl2Var;
        hi2Var = (i & 64) != 0 ? gi2.f3537a : hi2Var;
        gh2 gh2Var = (i & 128) != 0 ? fh2.f3007b : sz0Var;
        nh2 nh2Var = (i & 256) != 0 ? mh2.f6653a : c0043b53;
        c60 c60Var = o90.f7590a;
        t50 t50Var = t50.f10560j;
        tf2Var.getClass();
        t50Var.getClass();
        this.f2023a = bf2Var;
        this.f2024b = rh2Var;
        this.f2025c = qi2Var;
        this.f2026d = uk2Var;
        this.f2027e = tf2Var;
        this.f2028f = bl2Var;
        this.f2029g = hi2Var;
        this.f2030h = gh2Var;
        this.f2031i = nh2Var;
        this.f2032j = t50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df2)) {
            return false;
        }
        df2 df2Var = (df2) obj;
        return t11.m5086l(this.f2023a, df2Var.f2023a) && t11.m5086l(this.f2024b, df2Var.f2024b) && t11.m5086l(this.f2025c, df2Var.f2025c) && t11.m5086l(this.f2026d, df2Var.f2026d) && t11.m5086l(this.f2027e, df2Var.f2027e) && t11.m5086l(this.f2028f, df2Var.f2028f) && t11.m5086l(this.f2029g, df2Var.f2029g) && t11.m5086l(this.f2030h, df2Var.f2030h) && t11.m5086l(this.f2031i, df2Var.f2031i) && t11.m5086l(this.f2032j, df2Var.f2032j);
    }

    public final int hashCode() {
        return this.f2032j.hashCode() + ((this.f2031i.hashCode() + ((this.f2030h.hashCode() + ((this.f2029g.hashCode() + ((this.f2028f.hashCode() + ((this.f2027e.hashCode() + ((this.f2026d.hashCode() + ((this.f2025c.hashCode() + ((this.f2024b.hashCode() + (this.f2023a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ScriptApiOptions(limits=" + this.f2023a + ", logSink=" + this.f2024b + ", permissionGrantProvider=" + this.f2025c + ", storageRootProvider=" + this.f2026d + ", configStore=" + this.f2027e + ", uiProvider=" + this.f2028f + ", messagingProvider=" + this.f2029g + ", hostObjectAccessProvider=" + this.f2030h + ", hostRuntimeProvider=" + this.f2031i + ", ioDispatcher=" + this.f2032j + ")";
    }
}
