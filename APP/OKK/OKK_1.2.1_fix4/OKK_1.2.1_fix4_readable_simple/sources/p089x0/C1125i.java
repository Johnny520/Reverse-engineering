package p089x0;

import com.abc.core.runtime.AbstractC0805P;

/* JADX INFO: renamed from: x0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1125i extends AbstractC0805P {
    public C1125i() {
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: s */
    public final void mo2074s(C1137u r7, float r8, float r9) {
        r7.m2669d(r9 * r8, 180.0f, 90.0f);
        float r92 = (r9 * 2.0f) * r8;
        C1133q r82 = new C1133q(0.0f, 0.0f, r92, r92);
        r82.f4383f = 180.0f;
        r82.f4384g = 90.0f;
        r7.f4396g.add(r82);
        C1131o r2 = new C1131o(r82);
        r7.m2666a(180.0f);
        r7.f4397h.add(r2);
        r7.f4394e = 270.0f;
        float r1 = (0.0f + r92) * 0.5f;
        float r93 = (r92 - 0.0f) / 2.0f;
        double r22 = 270.0f;
        r7.f4392c = (((float) Math.cos(Math.toRadians(r22))) * r93) + r1;
        r7.f4393d = (r93 * ((float) Math.sin(Math.toRadians(r22)))) + r1;
    }
}
