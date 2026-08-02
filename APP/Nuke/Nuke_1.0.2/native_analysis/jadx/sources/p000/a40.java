package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a40 {

    /* JADX INFO: renamed from: a */
    public int f45a;

    /* JADX INFO: renamed from: b */
    public final oa0 f46b;

    /* JADX INFO: renamed from: c */
    public final kt2 f47c;

    /* JADX INFO: renamed from: d */
    public final s72 f48d;

    public a40(oa0 oa0Var, kt2 kt2Var, s72 s72Var) {
        if (oa0Var == null) {
            um2.m5516f("opcode == null");
            throw null;
        }
        if (kt2Var == null) {
            um2.m5516f("position == null");
            throw null;
        }
        if (s72Var == null) {
            um2.m5516f("registers == null");
            throw null;
        }
        this.f45a = -1;
        this.f46b = oa0Var;
        this.f47c = kt2Var;
        this.f48d = s72Var;
    }

    /* JADX INFO: renamed from: h */
    public static wq2 m56h(kt2 kt2Var, r72 r72Var, r72 r72Var2) {
        boolean z = r72Var.m4400d() == 1;
        boolean z2 = r72Var.f9420i.mo22a().f7522i == 9;
        int i = r72Var.f9419h;
        return new wq2((r72Var2.f9419h | i) < 16 ? z2 ? pa0.f8177j : z ? pa0.f8153d : pa0.f8165g : i < 256 ? z2 ? pa0.f8181k : z ? pa0.f8157e : pa0.f8169h : z2 ? pa0.f8184l : z ? pa0.f8161f : pa0.f8173i, kt2Var, s72.m4747i(r72Var, r72Var2));
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo57a();

    /* JADX INFO: renamed from: b */
    public abstract int mo58b();

    /* JADX INFO: renamed from: c */
    public String mo59c() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX INFO: renamed from: d */
    public String mo60d() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX INFO: renamed from: e */
    public final int m61e() {
        int i = this.f45a;
        if (i >= 0) {
            return i;
        }
        c80.m667j("address not yet known");
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public final String m62f() {
        int i = this.f45a;
        return i != -1 ? String.format("%04x", Integer.valueOf(i)) : pp0.m3899K(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: g */
    public abstract String mo63g();

    /* JADX INFO: renamed from: i */
    public abstract a40 mo64i(oa0 oa0Var);

    /* JADX INFO: renamed from: j */
    public abstract a40 mo65j(int i);

    /* JADX INFO: renamed from: k */
    public abstract a40 mo66k(s72 s72Var);

    /* JADX INFO: renamed from: l */
    public abstract void mo67l(C0929yn c0929yn);

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder(100);
        sb.append(m62f());
        sb.append(' ');
        sb.append(this.f47c);
        sb.append(": ");
        sb.append(this.f46b.m3543a());
        s72 s72Var = this.f48d;
        if (s72Var.f5590i.length != 0) {
            z = true;
            sb.append(s72Var.m2695g(" ", null, true));
        } else {
            z = false;
        }
        String strMo57a = mo57a();
        if (strMo57a != null) {
            if (z) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(strMo57a);
        }
        return sb.toString();
    }
}
