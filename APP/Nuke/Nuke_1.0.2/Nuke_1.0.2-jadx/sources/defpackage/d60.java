package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d60 implements kl2 {
    public final /* synthetic */ e60 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d60(e60 e60Var) {
        this.a = e60Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kl2
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        e60 e60Var = this.a;
        float fFloatValue = ((Number) e60Var.a.j(Float.valueOf(f))).floatValue();
        e60Var.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        e60Var.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
