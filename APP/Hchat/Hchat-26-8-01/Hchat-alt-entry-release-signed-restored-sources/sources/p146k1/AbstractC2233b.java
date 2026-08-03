package p146k1;

import androidx.lifecycle.C0119x;
import gg.AbstractC1416l;
import p071f1.C1005h;
import p071f1.C1017n;
import p101h1.C1565b;
import p293u2.EnumC4243m;
import p339x1.C5610h0;

/* JADX INFO: renamed from: k1.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2233b {

    /* JADX INFO: renamed from: a */
    public C1005h f7400a;

    /* JADX INFO: renamed from: b */
    public C1017n f7401b;

    /* JADX INFO: renamed from: c */
    public float f7402c = 1.0f;

    /* JADX INFO: renamed from: d */
    public EnumC4243m f7403d = EnumC4243m.f13919g;

    /* JADX INFO: renamed from: a */
    public abstract void mo5467a(float f3);

    /* JADX INFO: renamed from: b */
    public abstract void mo5468b(C1017n c1017n);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5471c(C5610h0 c5610h0, long j3, float f3, C1017n c1017n) {
        C1565b c1565b = c5610h0.f22833g;
        if (this.f7402c != f3) {
            mo5467a(f3);
            this.f7402c = f3;
        }
        if (!AbstractC1416l.m3825a(this.f7401b, c1017n)) {
            mo5468b(c1017n);
            this.f7401b = c1017n;
        }
        EnumC4243m layoutDirection = c5610h0.getLayoutDirection();
        if (this.f7403d != layoutDirection) {
            this.f7403d = layoutDirection;
        }
        int i9 = (int) (j3 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c1565b.mo4091a() >> 32)) - Float.intBitsToFloat(i9);
        int i10 = (int) (j3 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c1565b.mo4091a() & 4294967295L)) - Float.intBitsToFloat(i10);
        ((C0119x) c1565b.f5220h.f469a).m615z(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f3 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i9) > 0.0f && Float.intBitsToFloat(i10) > 0.0f) {
                    mo5470e(c5610h0);
                }
            } finally {
                ((C0119x) c1565b.f5220h.f469a).m615z(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo5469d();

    /* JADX INFO: renamed from: e */
    public abstract void mo5470e(C5610h0 c5610h0);
}
