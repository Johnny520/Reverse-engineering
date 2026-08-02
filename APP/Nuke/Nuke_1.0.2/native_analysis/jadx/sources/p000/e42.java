package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e42 {

    /* JADX INFO: renamed from: a */
    public final j91 f2305a;

    public e42(xm0 xm0Var) {
        this.f2305a = new j91(xm0Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract f42 mo1251a(Object obj);

    /* JADX INFO: renamed from: b */
    public m93 mo1252b() {
        return this.f2305a;
    }

    /* JADX INFO: renamed from: c */
    public final m93 m1253c(f42 f42Var, m93 m93Var) {
        m93 m93Var2 = null;
        m93Var2 = null;
        m93Var2 = null;
        m93Var2 = null;
        m93Var2 = null;
        m93Var2 = null;
        if (m93Var instanceof fd0) {
            if (f42Var.f2790d) {
                fd0 fd0Var = (fd0) m93Var;
                fd0Var.f2909a.setValue(f42Var.m1504a());
                m93Var2 = fd0Var;
            }
        } else if (m93Var instanceof uu2) {
            if ((f42Var.f2788b || f42Var.f2791e != null) && !f42Var.f2790d) {
                uu2 uu2Var = (uu2) m93Var;
                if (t11.m5086l(f42Var.m1504a(), uu2Var.f11507a)) {
                    m93Var2 = uu2Var;
                }
            }
        } else if (m93Var instanceof C0521ny) {
            f42Var.getClass();
        }
        if (m93Var2 != null) {
            return m93Var2;
        }
        if (!f42Var.f2790d) {
            return new uu2(f42Var.m1504a());
        }
        Object obj = f42Var.f2791e;
        ks2 ks2Var = f42Var.f2789c;
        if (ks2Var == null) {
            ks2Var = C0700sn.f10216T;
        }
        return new fd0(new nx1(obj, ks2Var));
    }
}
