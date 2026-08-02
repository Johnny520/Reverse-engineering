package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a40 {
    public int a;
    public final oa0 b;
    public final kt2 c;
    public final s72 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a40(oa0 oa0Var, kt2 kt2Var, s72 s72Var) {
        if (oa0Var == null) {
            um2.f("opcode == null");
            throw null;
        }
        if (kt2Var == null) {
            um2.f("position == null");
            throw null;
        }
        if (s72Var == null) {
            um2.f("registers == null");
            throw null;
        }
        this.a = -1;
        this.b = oa0Var;
        this.c = kt2Var;
        this.d = s72Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static wq2 h(kt2 kt2Var, r72 r72Var, r72 r72Var2) {
        boolean z = r72Var.d() == 1;
        boolean z2 = r72Var.i.a().i == 9;
        int i = r72Var.h;
        return new wq2((r72Var2.h | i) < 16 ? z2 ? pa0.j : z ? pa0.d : pa0.g : i < 256 ? z2 ? pa0.k : z ? pa0.e : pa0.h : z2 ? pa0.l : z ? pa0.f : pa0.i, kt2Var, s72.i(r72Var, r72Var2));
    }

    public abstract String a();

    public abstract int b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String c() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String d() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e() {
        int i = this.a;
        if (i >= 0) {
            return i;
        }
        c80.j("address not yet known");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String f() {
        int i = this.a;
        return i != -1 ? String.format("%04x", Integer.valueOf(i)) : pp0.K(System.identityHashCode(this));
    }

    public abstract String g();

    public abstract a40 i(oa0 oa0Var);

    public abstract a40 j(int i);

    public abstract a40 k(s72 s72Var);

    public abstract void l(yn ynVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder(100);
        sb.append(f());
        sb.append(' ');
        sb.append(this.c);
        sb.append(": ");
        sb.append(this.b.a());
        s72 s72Var = this.d;
        if (s72Var.i.length != 0) {
            z = true;
            sb.append(s72Var.g(" ", null, true));
        } else {
            z = false;
        }
        String strA = a();
        if (strA != null) {
            if (z) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(strA);
        }
        return sb.toString();
    }
}
