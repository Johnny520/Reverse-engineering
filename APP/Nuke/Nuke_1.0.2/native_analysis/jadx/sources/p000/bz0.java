package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bz0 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public /* synthetic */ float f1081l;

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((bz0) mo13p((t00) obj2, Float.valueOf(((Number) obj).floatValue()))).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        bz0 bz0Var = new bz0(2, t00Var);
        bz0Var.f1081l = ((Number) obj).floatValue();
        return bz0Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        fg1.m1627T(obj);
        return Boolean.valueOf(this.f1081l > 0.0f);
    }
}
