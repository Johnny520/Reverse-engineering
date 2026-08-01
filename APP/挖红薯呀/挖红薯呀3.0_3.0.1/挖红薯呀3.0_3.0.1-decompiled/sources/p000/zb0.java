package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class zb0 extends wq0 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7860e;

    /* JADX INFO: renamed from: f */
    public final Object f7861f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ zb0(int i, Object obj) {
        this.f7860e = i;
        this.f7861f = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: b */
    public final float mo48b() {
        int i = this.f7860e;
        Object obj = this.f7861f;
        switch (i) {
            case 0:
                return ((yb0) obj).mo48b();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) obj).getDensity().mo48b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.wq0
    /* JADX INFO: renamed from: d */
    public float mo5021d(C0190ez c0190ez) {
        float fIntBitsToFloat;
        int iM1066l0;
        switch (this.f7860e) {
            case 0:
                InterfaceC0904ww interfaceC0904ww = c0190ez.f1547a;
                if (interfaceC0904ww != null) {
                    return ((Number) interfaceC0904ww.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                yb0 yb0Var = (yb0) this.f7861f;
                if (yb0Var.f7597n) {
                    return Float.NaN;
                }
                yb0 yb0Var2 = yb0Var;
                while (true) {
                    lw0 lw0Var = yb0Var2.f7599p;
                    float f = (lw0Var == null || (iM1066l0 = AbstractC0201f9.m1066l0(lw0Var.f3607b, c0190ez)) < 0) ? Float.NaN : lw0Var.f3608c[iM1066l0];
                    if (!Float.isNaN(f)) {
                        yb0Var2.m5232b0(yb0Var.mo55n0(), c0190ez);
                        i50 i50VarMo52l0 = yb0Var2.mo52l0();
                        i50 i50VarMo52l02 = yb0Var.mo52l0();
                        switch (c0190ez.f1548b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (i50VarMo52l02.mo347x(i50VarMo52l0, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (i50VarMo52l0.mo342G() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (i50VarMo52l02.mo347x(i50VarMo52l0, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(((int) (i50VarMo52l0.mo342G() & 4294967295L)) / 2.0f)))) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    yb0 yb0VarMo57p0 = yb0Var2.mo57p0();
                    if (yb0VarMo57p0 == null) {
                        yb0Var2.m5232b0(yb0Var.mo55n0(), c0190ez);
                        return Float.NaN;
                    }
                    yb0Var2 = yb0VarMo57p0;
                }
                break;
            default:
                return super.mo5021d(c0190ez);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.wq0
    /* JADX INFO: renamed from: e */
    public final k50 mo5022e() {
        int i = this.f7860e;
        Object obj = this.f7861f;
        switch (i) {
            case 0:
                return ((yb0) obj).getLayoutDirection();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) obj).getLayoutDirection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.wq0
    /* JADX INFO: renamed from: f */
    public final int mo5023f() {
        int i = this.f7860e;
        Object obj = this.f7861f;
        switch (i) {
            case 0:
                return ((yb0) obj).mo5002U();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) obj).getRoot().f396J.f1607p.f7400d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: h */
    public final float mo49h() {
        int i = this.f7860e;
        Object obj = this.f7861f;
        switch (i) {
            case 0:
                return ((yb0) obj).mo49h();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) obj).getDensity().mo49h();
        }
    }
}
