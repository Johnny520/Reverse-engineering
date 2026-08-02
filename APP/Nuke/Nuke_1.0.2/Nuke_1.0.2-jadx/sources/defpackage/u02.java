package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u02 {
    public static final tu2 a = new tu2(jy.v);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(m91 m91Var, k9 k9Var, u00 u00Var) {
        s02 s02Var;
        if (u00Var instanceof s02) {
            s02Var = (s02) u00Var;
            int i = s02Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                s02Var.l = i - Integer.MIN_VALUE;
            } else {
                s02Var = new s02(u00Var);
            }
        }
        Object obj = s02Var.k;
        int i2 = s02Var.l;
        if (i2 != 0) {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                fg1.T(obj);
                s.b();
                return;
            }
        }
        fg1.T(obj);
        if (!m91Var.h.u) {
            s.j("establishTextInputSession called from an unattached node");
            return;
        }
        zv1 zv1VarF0 = sp0.f0(m91Var);
        yy1 yy1Var = (yy1) sp0.c0(m91Var).I;
        yy1Var.getClass();
        if (op0.w(yy1Var, a) != null) {
            c80.g();
        } else {
            s02Var.l = 1;
            b(zv1VarF0, k9Var, s02Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(zv1 zv1Var, mn0 mn0Var, u00 u00Var) {
        t02 t02Var;
        if (u00Var instanceof t02) {
            t02Var = (t02) u00Var;
            int i = t02Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                t02Var.l = i - Integer.MIN_VALUE;
            } else {
                t02Var = new t02(u00Var);
            }
        }
        Object obj = t02Var.k;
        int i2 = t02Var.l;
        if (i2 == 0) {
            fg1.T(obj);
            t02Var.l = 1;
            ((b7) zv1Var).K(mn0Var, t02Var);
        } else if (i2 == 1) {
            fg1.T(obj);
            s.b();
        } else if (i2 != 2) {
            s.l("call to 'resume' before 'invoke' with coroutine");
        } else {
            fg1.T(obj);
            s.b();
        }
    }
}
