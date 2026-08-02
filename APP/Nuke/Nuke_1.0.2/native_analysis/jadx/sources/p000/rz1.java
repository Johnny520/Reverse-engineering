package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rz1 implements e70 {

    /* JADX INFO: renamed from: h */
    public boolean f9833h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m4638a(rz1 rz1Var, sz1 sz1Var) {
        rz1Var.getClass();
        if (sz1Var instanceof ki1) {
            ((ki1) sz1Var).mo2636l(rz1Var.f9833h);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m4639g(rz1 rz1Var, sz1 sz1Var, int i, int i2) {
        rz1Var.getClass();
        m4638a(rz1Var, sz1Var);
        sz1Var.mo2506f0(z01.m6373c((((long) i2) & 4294967295L) | (((long) i) << 32), sz1Var.f10442l), 0.0f, null);
    }

    /* JADX INFO: renamed from: h */
    public static void m4640h(rz1 rz1Var, sz1 sz1Var, long j) {
        rz1Var.getClass();
        m4638a(rz1Var, sz1Var);
        sz1Var.mo2506f0(z01.m6373c(j, sz1Var.f10442l), 0.0f, null);
    }

    /* JADX INFO: renamed from: i */
    public static void m4641i(rz1 rz1Var, sz1 sz1Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (rz1Var.mo2896e() == d61.f1885h || rz1Var.mo2897f() == 0) {
            m4638a(rz1Var, sz1Var);
            sz1Var.mo2506f0(z01.m6373c(j, sz1Var.f10442l), 0.0f, null);
        } else {
            int iMo2897f = (rz1Var.mo2897f() - sz1Var.f10438h) - ((int) (j >> 32));
            m4638a(rz1Var, sz1Var);
            sz1Var.mo2506f0(z01.m6373c((((long) iMo2897f) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), sz1Var.f10442l), 0.0f, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m4642j(rz1 rz1Var, sz1 sz1Var, int i, int i2) {
        int i3 = tz1.f11011b;
        oq0 oq0Var = oq0.f7785w;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (rz1Var.mo2896e() == d61.f1885h || rz1Var.mo2897f() == 0) {
            m4638a(rz1Var, sz1Var);
            sz1Var.mo2506f0(z01.m6373c(j, sz1Var.f10442l), 0.0f, oq0Var);
        } else {
            int iMo2897f = (rz1Var.mo2897f() - sz1Var.f10438h) - ((int) (j >> 32));
            m4638a(rz1Var, sz1Var);
            sz1Var.mo2506f0(z01.m6373c((((long) iMo2897f) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), sz1Var.f10442l), 0.0f, oq0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m4643k(rz1 rz1Var, sz1 sz1Var, in0 in0Var) {
        rz1Var.getClass();
        m4638a(rz1Var, sz1Var);
        sz1Var.mo2506f0(z01.m6373c(0L, sz1Var.f10442l), 0.0f, in0Var);
    }

    /* JADX INFO: renamed from: c */
    public float mo2895c(gu0 gu0Var) {
        return Float.NaN;
    }

    /* JADX INFO: renamed from: e */
    public abstract d61 mo2896e();

    /* JADX INFO: renamed from: f */
    public abstract int mo2897f();
}
