package p000a;

import p000a.C0447Yd;

/* JADX INFO: renamed from: a.Ad */
/* JADX INFO: loaded from: classes.dex */
public final class C0014Ad extends C0889w1 {
    @Override // p000a.C0889w1
    /* JADX INFO: renamed from: z */
    public final void mo44z(C0447Yd c0447Yd, float f, float f2) {
        c0447Yd.m1107d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        c0447Yd.getClass();
        C0447Yd.c cVar = new C0447Yd.c(0.0f, 0.0f, f3, f3);
        cVar.f1679f = 180.0f;
        cVar.f1680g = 90.0f;
        c0447Yd.f1668f.add(cVar);
        C0447Yd.a aVar = new C0447Yd.a(cVar);
        float f4 = 180.0f + 90.0f;
        boolean z = 90.0f < 0.0f;
        float f5 = z ? (180.0f + 180.0f) % 360.0f : 180.0f;
        float f6 = z ? (180.0f + f4) % 360.0f : f4;
        c0447Yd.m1104a(f5);
        c0447Yd.f1669g.add(aVar);
        c0447Yd.f1666d = f6;
        double d = f4;
        c0447Yd.f1664b = (((f3 - 0.0f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((0.0f + f3) * 0.5f);
        c0447Yd.f1665c = (((f3 - 0.0f) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((0.0f + f3) * 0.5f);
    }
}
