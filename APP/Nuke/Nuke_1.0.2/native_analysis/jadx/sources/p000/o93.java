package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o93 implements vd3 {

    /* JADX INFO: renamed from: a */
    public final String f7593a;

    /* JADX INFO: renamed from: b */
    public final nx1 f7594b;

    public o93(g01 g01Var, String str) {
        this.f7593a = str;
        this.f7594b = op0.m3598u(g01Var);
    }

    @Override // p000.vd3
    /* JADX INFO: renamed from: a */
    public final int mo2197a(pf1 pf1Var, d61 d61Var) {
        return m3541e().f3218a;
    }

    @Override // p000.vd3
    /* JADX INFO: renamed from: b */
    public final int mo2198b(pf1 pf1Var) {
        return m3541e().f3219b;
    }

    @Override // p000.vd3
    /* JADX INFO: renamed from: c */
    public final int mo2199c(pf1 pf1Var, d61 d61Var) {
        return m3541e().f3220c;
    }

    @Override // p000.vd3
    /* JADX INFO: renamed from: d */
    public final int mo2200d(pf1 pf1Var) {
        return m3541e().f3221d;
    }

    /* JADX INFO: renamed from: e */
    public final g01 m3541e() {
        return (g01) this.f7594b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o93) {
            return t11.m5086l(m3541e(), ((o93) obj).m3541e());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m3542f(g01 g01Var) {
        this.f7594b.setValue(g01Var);
    }

    public final int hashCode() {
        return this.f7593a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7593a);
        sb.append("(left=");
        sb.append(m3541e().f3218a);
        sb.append(", top=");
        sb.append(m3541e().f3219b);
        sb.append(", right=");
        sb.append(m3541e().f3220c);
        sb.append(", bottom=");
        return vi0.m5694m(sb, m3541e().f3221d, ')');
    }
}
