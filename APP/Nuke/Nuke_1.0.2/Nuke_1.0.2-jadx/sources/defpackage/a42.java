package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a42 extends iy0 {
    public final d42 i;
    public final q30 j;
    public f63 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a42(d42 d42Var) {
        if (d42Var == null) {
            um2.f("prototype == null");
            throw null;
        }
        wu2 wu2Var = d42Var.j;
        Object[] objArr = wu2Var.i;
        this.i = d42Var;
        int length = objArr.length;
        StringBuilder sb = new StringBuilder(length + 1);
        char cCharAt = d42Var.i.h.charAt(0);
        sb.append(cCharAt == '[' ? 'L' : cCharAt);
        for (int i = 0; i < length; i++) {
            char cCharAt2 = ((o43) wu2Var.e(i)).h.charAt(0);
            if (cCharAt2 == '[') {
                cCharAt2 = 'L';
            }
            sb.append(cCharAt2);
        }
        this.j = new q30(sb.toString());
        this.k = objArr.length != 0 ? new f63(wu2Var) : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final void a(z70 z70Var) {
        b42 b42Var = (b42) z70Var.h;
        b42 b42Var2 = (b42) z70Var.i;
        eh1 eh1Var = (eh1) z70Var.c;
        b42Var2.q(this.i.i);
        b42Var.o(this.j);
        f63 f63Var = this.k;
        if (f63Var != null) {
            this.k = (f63) eh1Var.l(f63Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final g21 b() {
        return g21.TYPE_PROTO_ID_ITEM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final int c() {
        return 12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final void d(z70 z70Var, yn ynVar) {
        b42 b42Var = (b42) z70Var.h;
        q30 q30Var = this.j;
        int iL = b42Var.l(q30Var);
        b42 b42Var2 = (b42) z70Var.i;
        d42 d42Var = this.i;
        o43 o43Var = d42Var.i;
        o43 o43Var2 = d42Var.i;
        int iN = b42Var2.n(o43Var);
        f63 f63Var = this.k;
        int iF = f63Var == null ? 0 : f63Var.f();
        if (ynVar.d()) {
            StringBuilder sb = new StringBuilder();
            sb.append(o43Var2.b());
            sb.append(" proto(");
            wu2 wu2Var = d42Var.j;
            int length = wu2Var.i.length;
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(((o43) wu2Var.e(i)).b());
            }
            sb.append(")");
            ynVar.c(f() + ' ' + sb.toString(), 0);
            ynVar.c("  shorty_idx:      " + pp0.K(iL) + " // " + q30Var.g(), 4);
            ynVar.c("  return_type_idx: " + pp0.K(iN) + " // " + o43Var2.b(), 4);
            ynVar.c("  parameters_off:  ".concat(pp0.K(iF)), 4);
        }
        ynVar.j(iL);
        ynVar.j(iN);
        ynVar.j(iF);
    }
}
