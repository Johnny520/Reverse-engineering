package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b41 implements w41 {

    /* JADX INFO: renamed from: a */
    public static final b41 f552a = new b41();

    /* JADX INFO: renamed from: b */
    public static final ap2 f553b = up0.m5545j("kotlinx.serialization.json.JsonNull", cp2.f1664g, new yo2[0]);

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        rg3.m4479o(y40Var);
        if (y40Var.mo899g()) {
            throw new h31(AbstractC0570p7.m3783s(-1, "Expected 'null' literal", null, null, null));
        }
        return z31.INSTANCE;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        ((z31) obj).getClass();
        rg3.m4477m(ve0Var);
        ve0Var.mo1178c();
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return f553b;
    }
}
