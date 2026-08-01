package p000;

/* JADX INFO: loaded from: classes.dex */
public final class h10 extends AbstractC0346ip {
    @Override // p000.AbstractC0346ip
    /* JADX INFO: renamed from: w */
    public final void mo1336w(p30 p30Var, float f, float f2) {
        p30Var.m2035d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        l30 l30Var = new l30(0.0f, 0.0f, f3, f3);
        l30Var.f3007f = 180.0f;
        l30Var.f3008g = 90.0f;
        p30Var.f3661f.add(l30Var);
        j30 j30Var = new j30(l30Var);
        p30Var.m2032a(180.0f);
        p30Var.f3662g.add(j30Var);
        p30Var.f3659d = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        p30Var.f3657b = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        p30Var.f3658c = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
