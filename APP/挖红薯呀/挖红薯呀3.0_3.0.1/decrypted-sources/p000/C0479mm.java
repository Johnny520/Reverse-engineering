package p000;

/* JADX INFO: renamed from: mm */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0479mm implements ny0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4005a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4006b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0479mm(ny0 ny0Var, lo0 lo0Var) {
        this.f4006b = ny0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ny0
    /* JADX INFO: renamed from: a */
    public final float mo1511a(float f) {
        int i = this.f4005a;
        Object obj = this.f4006b;
        switch (i) {
            case 0:
                C0517nm c0517nm = (C0517nm) obj;
                if (Float.isNaN(f)) {
                    return 0.0f;
                }
                float fFloatValue = ((Number) c0517nm.f4291a.invoke(Float.valueOf(f))).floatValue();
                c0517nm.f4295e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
                c0517nm.f4296f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
                return fFloatValue;
            default:
                return ((ny0) obj).mo1511a(f);
        }
    }

    public C0479mm(C0517nm c0517nm) {
        this.f4006b = c0517nm;
    }
}
