package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d60 implements kl2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e60 f1884a;

    public d60(e60 e60Var) {
        this.f1884a = e60Var;
    }

    @Override // p000.kl2
    /* JADX INFO: renamed from: a */
    public final float mo963a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        e60 e60Var = this.f1884a;
        float fFloatValue = ((Number) e60Var.f2321a.mo5j(Float.valueOf(f))).floatValue();
        e60Var.f2325e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        e60Var.f2326f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
