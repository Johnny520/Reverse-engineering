package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class jf0 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final y33 f5006a;

    /* JADX INFO: renamed from: b */
    public final u33 f5007b;

    /* JADX INFO: renamed from: c */
    public final u33 f5008c;

    /* JADX INFO: renamed from: d */
    public final sf0 f5009d;

    /* JADX INFO: renamed from: e */
    public final ph0 f5010e;

    /* JADX INFO: renamed from: f */
    public final xm0 f5011f;

    /* JADX INFO: renamed from: g */
    public final kf0 f5012g;

    public jf0(y33 y33Var, u33 u33Var, u33 u33Var2, sf0 sf0Var, ph0 ph0Var, xm0 xm0Var, kf0 kf0Var) {
        this.f5006a = y33Var;
        this.f5007b = u33Var;
        this.f5008c = u33Var2;
        this.f5009d = sf0Var;
        this.f5010e = ph0Var;
        this.f5011f = xm0Var;
        this.f5012g = kf0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jf0)) {
            return false;
        }
        jf0 jf0Var = (jf0) obj;
        return jf0Var.f5006a == this.f5006a && t11.m5086l(jf0Var.f5007b, this.f5007b) && t11.m5086l(jf0Var.f5008c, this.f5008c) && jf0Var.f5009d.equals(this.f5009d) && t11.m5086l(jf0Var.f5010e, this.f5010e) && jf0Var.f5011f == this.f5011f && t11.m5086l(jf0Var.f5012g, this.f5012g);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new rf0(this.f5006a, this.f5007b, this.f5008c, this.f5009d, this.f5010e, this.f5011f, this.f5012g);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        rf0 rf0Var = (rf0) th1Var;
        rf0Var.f9536v = this.f5006a;
        rf0Var.f9537w = this.f5007b;
        rf0Var.f9538x = this.f5008c;
        rf0Var.f9539y = this.f5009d;
        rf0Var.f9540z = this.f5010e;
        rf0Var.f9531A = this.f5011f;
        rf0Var.f9532B = this.f5012g;
    }

    public final int hashCode() {
        int iHashCode = this.f5006a.hashCode() * 31;
        u33 u33Var = this.f5007b;
        int iHashCode2 = (iHashCode + (u33Var != null ? u33Var.hashCode() : 0)) * 31;
        u33 u33Var2 = this.f5008c;
        return this.f5012g.hashCode() + ((this.f5011f.hashCode() + ((this.f5010e.f8350a.hashCode() + ((this.f5009d.f10101a.hashCode() + ((iHashCode2 + (u33Var2 != null ? u33Var2.hashCode() : 0)) * 961)) * 31)) * 31)) * 31);
    }
}
