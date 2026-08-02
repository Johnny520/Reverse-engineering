package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e42 {
    public final j91 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e42(xm0 xm0Var) {
        this.a = new j91(xm0Var);
    }

    public abstract f42 a(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m93 b() {
        return this.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m93 c(f42 f42Var, m93 m93Var) {
        m93 m93Var2 = null;
        m93Var2 = null;
        m93Var2 = null;
        m93Var2 = null;
        m93Var2 = null;
        m93Var2 = null;
        if (m93Var instanceof fd0) {
            if (f42Var.d) {
                fd0 fd0Var = (fd0) m93Var;
                fd0Var.a.setValue(f42Var.a());
                m93Var2 = fd0Var;
            }
        } else if (m93Var instanceof uu2) {
            if ((f42Var.b || f42Var.e != null) && !f42Var.d) {
                uu2 uu2Var = (uu2) m93Var;
                if (t11.l(f42Var.a(), uu2Var.a)) {
                    m93Var2 = uu2Var;
                }
            }
        } else if (m93Var instanceof ny) {
            f42Var.getClass();
        }
        if (m93Var2 != null) {
            return m93Var2;
        }
        if (!f42Var.d) {
            return new uu2(f42Var.a());
        }
        Object obj = f42Var.e;
        ks2 ks2Var = f42Var.c;
        if (ks2Var == null) {
            ks2Var = sn.T;
        }
        return new fd0(new nx1(obj, ks2Var));
    }
}
