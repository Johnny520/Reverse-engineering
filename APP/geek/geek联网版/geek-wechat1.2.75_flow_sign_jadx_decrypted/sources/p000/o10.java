package p000;

/* JADX INFO: loaded from: classes.dex */
public final class o10 extends AbstractC0259gf {
    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: v */
    public final void mo50v(w30 w30Var, float f, float f2) {
        w30Var.m2593d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        s30 s30Var = new s30(0.0f, 0.0f, f3, f3);
        s30Var.f4200f = 180.0f;
        s30Var.f4201g = 90.0f;
        w30Var.f5059f.add(s30Var);
        q30 q30Var = new q30(s30Var);
        w30Var.m2590a(180.0f);
        w30Var.f5060g.add(q30Var);
        w30Var.f5057d = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        w30Var.f5055b = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        w30Var.f5056c = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
