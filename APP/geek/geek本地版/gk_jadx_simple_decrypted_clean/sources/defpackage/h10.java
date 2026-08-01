package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h10 extends ip {
    @Override // defpackage.ip
    public final void w(p30 r7, float r8, float r9) {
        r7.d(r9 * r8, 180.0f, 90.0f);
        float r92 = (r9 * 2.0f) * r8;
        l30 r82 = new l30(0.0f, 0.0f, r92, r92);
        r82.f = 180.0f;
        r82.g = 90.0f;
        r7.f.add(r82);
        j30 r2 = new j30(r82);
        r7.a(180.0f);
        r7.g.add(r2);
        r7.d = 270.0f;
        float r1 = (0.0f + r92) * 0.5f;
        float r93 = (r92 - 0.0f) / 2.0f;
        double r22 = 270.0f;
        r7.b = (((float) Math.cos(Math.toRadians(r22))) * r93) + r1;
        r7.c = (r93 * ((float) Math.sin(Math.toRadians(r22)))) + r1;
    }
}
