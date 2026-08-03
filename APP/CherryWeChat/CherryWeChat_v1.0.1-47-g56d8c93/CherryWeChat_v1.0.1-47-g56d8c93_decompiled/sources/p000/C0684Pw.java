package p000;

/* JADX INFO: renamed from: Pw */
/* JADX INFO: loaded from: classes.dex */
public final class C0684Pw extends AbstractC0828TB {
    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: k */
    public final void mo1382k(C1195ay c1195ay, float f, float f2) {
        float f3 = f2 * f;
        c1195ay.m2312d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        C0985Wx c0985Wx = new C0985Wx(0.0f, 0.0f, f4, f4);
        c0985Wx.f3099f = 180.0f;
        c0985Wx.f3100g = 90.0f;
        c1195ay.f4102f.add(c0985Wx);
        C0899Ux c0899Ux = new C0899Ux(c0985Wx);
        c1195ay.m2309a(180.0f);
        c1195ay.f4103g.add(c0899Ux);
        c1195ay.f4100d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        double d = 270.0f;
        c1195ay.f4098b = (((float) Math.cos(Math.toRadians(d))) * f6) + f5;
        c1195ay.f4099c = (f6 * ((float) Math.sin(Math.toRadians(d)))) + f5;
    }
}
