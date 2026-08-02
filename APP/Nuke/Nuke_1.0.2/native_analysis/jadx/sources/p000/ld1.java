package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ld1 extends rz1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f6069i;

    /* JADX INFO: renamed from: j */
    public final Object f6070j;

    public /* synthetic */ ld1(int i, Object obj) {
        this.f6069i = i;
        this.f6070j = obj;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: b */
    public final float mo693b() {
        int i = this.f6069i;
        Object obj = this.f6070j;
        switch (i) {
            case 0:
                return ((kd1) obj).mo693b();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) obj).getDensity().mo693b();
        }
    }

    @Override // p000.rz1
    /* JADX INFO: renamed from: c */
    public float mo2895c(gu0 gu0Var) {
        float fIntBitsToFloat;
        int iM3100o0;
        switch (this.f6069i) {
            case 0:
                mn0 mn0Var = gu0Var.f3702a;
                if (mn0Var != null) {
                    return ((Number) mn0Var.mo12g(this, Float.valueOf(Float.NaN))).floatValue();
                }
                kd1 kd1Var = (kd1) this.f6070j;
                if (kd1Var.f5468r) {
                    return Float.NaN;
                }
                kd1 kd1Var2 = kd1Var;
                while (true) {
                    qb2 qb2Var = kd1Var2.f5470t;
                    float f = (qb2Var == null || (iM3100o0 = AbstractC0460mg.m3100o0((gu0[]) qb2Var.f8875c, gu0Var)) < 0) ? Float.NaN : ((float[]) qb2Var.f8876d)[iM3100o0];
                    if (!Float.isNaN(f)) {
                        kd1Var2.m2637l0(kd1Var.mo2644w0(), gu0Var);
                        c61 c61VarMo2642t0 = kd1Var2.mo2642t0();
                        c61 c61VarMo2642t02 = kd1Var.mo2642t0();
                        switch (gu0Var.f3703b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (c61VarMo2642t02.mo651r(c61VarMo2642t0, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (c61VarMo2642t0.mo645L() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (c61VarMo2642t02.mo651r(c61VarMo2642t0, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(((int) (c61VarMo2642t0.mo645L() & 4294967295L)) / 2.0f)))) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    kd1 kd1VarMo2631B0 = kd1Var2.mo2631B0();
                    if (kd1VarMo2631B0 == null) {
                        kd1Var2.m2637l0(kd1Var.mo2644w0(), gu0Var);
                        return Float.NaN;
                    }
                    kd1Var2 = kd1VarMo2631B0;
                }
                break;
            default:
                return super.mo2895c(gu0Var);
        }
    }

    @Override // p000.rz1
    /* JADX INFO: renamed from: e */
    public final d61 mo2896e() {
        int i = this.f6069i;
        Object obj = this.f6070j;
        switch (i) {
            case 0:
                return ((kd1) obj).getLayoutDirection();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) obj).getLayoutDirection();
        }
    }

    @Override // p000.rz1
    /* JADX INFO: renamed from: f */
    public final int mo2897f() {
        int i = this.f6069i;
        Object obj = this.f6070j;
        switch (i) {
            case 0:
                return ((kd1) obj).mo3071b0();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) obj).getRoot().f9373N.f11795p.f10438h;
        }
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: m */
    public final float mo697m() {
        int i = this.f6069i;
        Object obj = this.f6070j;
        switch (i) {
            case 0:
                return ((kd1) obj).mo697m();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) obj).getDensity().mo697m();
        }
    }
}
