package p089x0;

import p056f0.AbstractC0805P;

/* JADX INFO: renamed from: x0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1125i extends AbstractC0805P {
    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: s */
    public final void mo2074s(C1137u c1137u, float f2, float f3) {
        c1137u.m2669d(f3 * f2, 180.0f, 90.0f);
        float f4 = f3 * 2.0f * f2;
        C1133q c1133q = new C1133q(0.0f, 0.0f, f4, f4);
        c1133q.f4383f = 180.0f;
        c1133q.f4384g = 90.0f;
        c1137u.f4396g.add(c1133q);
        C1131o c1131o = new C1131o(c1133q);
        c1137u.m2666a(180.0f);
        c1137u.f4397h.add(c1131o);
        c1137u.f4394e = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        double d2 = 270.0f;
        c1137u.f4392c = (((float) Math.cos(Math.toRadians(d2))) * f6) + f5;
        c1137u.f4393d = (f6 * ((float) Math.sin(Math.toRadians(d2)))) + f5;
    }
}
