package p000;

/* JADX INFO: renamed from: Pw */
/* JADX INFO: loaded from: classes.dex */
public final class C0684Pw extends AbstractC0828TB {
    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: k */
    public final void mo1382k(C1195ay r6, float r7, float r8) {
        float r82 = r8 * r7;
        r6.m2312d(r82, 180.0f, 90.0f);
        float r83 = r82 * 2.0f;
        C0985Wx r2 = new C0985Wx(0.0f, 0.0f, r83, r83);
        r2.f3099f = 180.0f;
        r2.f3100g = 90.0f;
        r6.f4102f.add(r2);
        C0899Ux r0 = new C0899Ux(r2);
        r6.m2309a(180.0f);
        r6.f4103g.add(r0);
        r6.f4100d = 270.0f;
        float r02 = (0.0f + r83) * 0.5f;
        float r84 = (r83 - 0.0f) / 2.0f;
        double r1 = 270.0f;
        r6.f4098b = (((float) Math.cos(Math.toRadians(r1))) * r84) + r02;
        r6.f4099c = (r84 * ((float) Math.sin(Math.toRadians(r1)))) + r02;
    }
}
