package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ss0 extends a40 {
    public wq2[] e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ss0(kt2 kt2Var, s72 s72Var) {
        super(pa0.b, kt2Var, s72Var);
        if (s72Var.i.length != 0) {
            this.e = null;
        } else {
            s.j("registers.size() == 0");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final String a() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final int b() {
        m();
        int iB = 0;
        for (wq2 wq2Var : this.e) {
            iB += wq2Var.b();
        }
        return iB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final String g() {
        s72 s72Var = this.d;
        int length = s72Var.i.length;
        StringBuilder sb = new StringBuilder(100);
        int iD = 0;
        for (int i = 0; i < length; i++) {
            r72 r72Var = (r72) s72Var.e(i);
            wq2 wq2VarH = a40.h(kt2.a, r72.e(iD, r72Var.i.a()), r72Var);
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(wq2VarH.g());
            iD += r72Var.d();
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final a40 i(oa0 oa0Var) {
        throw new RuntimeException("unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final a40 j(int i) {
        return k(this.d.k(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final a40 k(s72 s72Var) {
        return new ss0(this.c, s72Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final void l(yn ynVar) {
        m();
        for (wq2 wq2Var : this.e) {
            wq2Var.l(ynVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m() {
        if (this.e != null) {
            return;
        }
        s72 s72Var = this.d;
        int length = s72Var.i.length;
        this.e = new wq2[length];
        int iD = 0;
        for (int i = 0; i < length; i++) {
            r72 r72Var = (r72) s72Var.e(i);
            this.e[i] = a40.h(kt2.a, r72.e(iD, r72Var.i.a()), r72Var);
            iD += r72Var.d();
        }
    }
}
