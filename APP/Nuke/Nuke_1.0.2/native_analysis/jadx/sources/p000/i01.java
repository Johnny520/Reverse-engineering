package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i01 implements t23 {

    /* JADX INFO: renamed from: h */
    public final za2 f4202h;

    /* JADX INFO: renamed from: i */
    public final kt2 f4203i;

    /* JADX INFO: renamed from: j */
    public final r72 f4204j;

    /* JADX INFO: renamed from: k */
    public final s72 f4205k;

    public i01(za2 za2Var, kt2 kt2Var, r72 r72Var, s72 s72Var) {
        if (za2Var == null) {
            um2.m5516f("opcode == null");
            throw null;
        }
        if (kt2Var == null) {
            um2.m5516f("position == null");
            throw null;
        }
        if (s72Var == null) {
            um2.m5516f("sources == null");
            throw null;
        }
        this.f4202h = za2Var;
        this.f4203i = kt2Var;
        this.f4204j = r72Var;
        this.f4205k = s72Var;
    }

    @Override // p000.t23
    /* JADX INFO: renamed from: b */
    public final String mo23b() {
        String strMo1217f = mo1217f();
        StringBuilder sb = new StringBuilder(80);
        sb.append(this.f4203i);
        sb.append(": ");
        za2 za2Var = this.f4202h;
        String string = za2Var.f13817g;
        if (string == null) {
            string = za2Var.toString();
        }
        sb.append(string);
        if (strMo1217f != null) {
            sb.append("(");
            sb.append(strMo1217f);
            sb.append(")");
        }
        r72 r72Var = this.f4204j;
        if (r72Var == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(r72Var.m4403h(true));
        }
        sb.append(" <-");
        s72 s72Var = this.f4205k;
        int length = s72Var.f5590i.length;
        if (length == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < length; i++) {
                sb.append(" ");
                sb.append(((r72) s72Var.m2693e(i)).m4403h(true));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2239d(h01 h01Var);

    /* JADX INFO: renamed from: e */
    public abstract d63 mo2240e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: f */
    public String mo1217f() {
        return null;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        String strMo1217f = mo1217f();
        StringBuilder sb = new StringBuilder(80);
        sb.append("Insn{");
        sb.append(this.f4203i);
        sb.append(' ');
        sb.append(this.f4202h);
        if (strMo1217f != null) {
            sb.append(' ');
            sb.append(strMo1217f);
        }
        sb.append(" :: ");
        r72 r72Var = this.f4204j;
        if (r72Var != null) {
            sb.append(r72Var);
            sb.append(" <- ");
        }
        sb.append(this.f4205k);
        sb.append('}');
        return sb.toString();
    }
}
