package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u02 {

    /* JADX INFO: renamed from: a */
    public static final tu2 f11032a = new tu2(C0367jy.f5270v);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5450a(m91 m91Var, C0379k9 c0379k9, u00 u00Var) {
        s02 s02Var;
        if (u00Var instanceof s02) {
            s02Var = (s02) u00Var;
            int i = s02Var.f9854l;
            if ((i & Integer.MIN_VALUE) != 0) {
                s02Var.f9854l = i - Integer.MIN_VALUE;
            } else {
                s02Var = new s02(u00Var);
            }
        }
        Object obj = s02Var.f9853k;
        int i2 = s02Var.f9854l;
        if (i2 != 0) {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                fg1.m1627T(obj);
                C0676s.m4644b();
                return;
            }
        }
        fg1.m1627T(obj);
        if (!m91Var.f10757h.f10770u) {
            C0676s.m4651j("establishTextInputSession called from an unattached node");
            return;
        }
        zv1 zv1VarM4939f0 = sp0.m4939f0(m91Var);
        yy1 yy1Var = (yy1) sp0.m4933c0(m91Var).f9368I;
        yy1Var.getClass();
        if (op0.m3600w(yy1Var, f11032a) != null) {
            c80.m664g();
        } else {
            s02Var.f9854l = 1;
            m5451b(zv1VarM4939f0, c0379k9, s02Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5451b(zv1 zv1Var, mn0 mn0Var, u00 u00Var) {
        t02 t02Var;
        if (u00Var instanceof t02) {
            t02Var = (t02) u00Var;
            int i = t02Var.f10464l;
            if ((i & Integer.MIN_VALUE) != 0) {
                t02Var.f10464l = i - Integer.MIN_VALUE;
            } else {
                t02Var = new t02(u00Var);
            }
        }
        Object obj = t02Var.f10463k;
        int i2 = t02Var.f10464l;
        if (i2 == 0) {
            fg1.m1627T(obj);
            t02Var.f10464l = 1;
            ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1Var).m464K(mn0Var, t02Var);
        } else if (i2 == 1) {
            fg1.m1627T(obj);
            C0676s.m4644b();
        } else if (i2 != 2) {
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
        } else {
            fg1.m1627T(obj);
            C0676s.m4644b();
        }
    }
}
