package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cq2 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final float f1686a;

    /* JADX INFO: renamed from: b */
    public final eq2 f1687b;

    /* JADX INFO: renamed from: c */
    public final boolean f1688c;

    /* JADX INFO: renamed from: d */
    public final long f1689d;

    /* JADX INFO: renamed from: e */
    public final long f1690e;

    public cq2(float f, eq2 eq2Var, boolean z, long j, long j2) {
        this.f1686a = f;
        this.f1687b = eq2Var;
        this.f1688c = z;
        this.f1689d = j;
        this.f1690e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq2)) {
            return false;
        }
        cq2 cq2Var = (cq2) obj;
        return za0.m6404b(this.f1686a, cq2Var.f1686a) && t11.m5086l(this.f1687b, cq2Var.f1687b) && this.f1688c == cq2Var.f1688c && C0363ju.m2566c(this.f1689d, cq2Var.f1689d) && C0363ju.m2566c(this.f1690e, cq2Var.f1690e);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new C0170el(new C0798v5(20, this));
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        zn1 zn1Var;
        C0170el c0170el = (C0170el) th1Var;
        C0798v5 c0798v5 = new C0798v5(20, this);
        c0170el.f2483v = c0798v5;
        if (c0170el.f10757h.f10770u && (zn1Var = sp0.m4927Z(c0170el, 2).f13986w) != null) {
            zn1Var.m6473r1(c0798v5, true);
        }
    }

    public final int hashCode() {
        int iM2205d = hk1.m2205d((this.f1687b.hashCode() + (Float.hashCode(this.f1686a) * 31)) * 31, 31, this.f1688c);
        int i = C0363ju.f5218h;
        return Long.hashCode(this.f1690e) + hk1.m2204c(iM2205d, 31, this.f1689d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) za0.m6405c(this.f1686a));
        sb.append(", shape=");
        sb.append(this.f1687b);
        sb.append(", clip=");
        sb.append(this.f1688c);
        sb.append(", ambientColor=");
        hk1.m2213l(this.f1689d, sb, ", spotColor=");
        sb.append((Object) C0363ju.m2572i(this.f1690e));
        sb.append(')');
        return sb.toString();
    }
}
