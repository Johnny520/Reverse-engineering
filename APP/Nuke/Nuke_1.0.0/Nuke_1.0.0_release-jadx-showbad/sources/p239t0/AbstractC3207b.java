package p239t0;

import p041H0.C0566K;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p153e1.EnumC2017m;
import p211o0.C2748g;
import p211o0.C2753l;
import p222q0.C2901b;

/* JADX INFO: renamed from: t0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3207b {

    /* JADX INFO: renamed from: a */
    public C2748g f9984a;

    /* JADX INFO: renamed from: b */
    public C2753l f9985b;

    /* JADX INFO: renamed from: c */
    public float f9986c = 1.0f;

    /* JADX INFO: renamed from: d */
    public EnumC2017m f9987d = EnumC2017m.f6742d;

    /* JADX INFO: renamed from: a */
    public abstract void mo5481a(float f2);

    /* JADX INFO: renamed from: b */
    public abstract void mo5482b(C2753l c2753l);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5485c(C0566K c0566k, long j5, float f2, C2753l c2753l) {
        C2901b c2901b = c0566k.f1742d;
        if (this.f9986c != f2) {
            mo5481a(f2);
            this.f9986c = f2;
        }
        if (!AbstractC1665j.m2981a(this.f9985b, c2753l)) {
            mo5482b(c2753l);
            this.f9985b = c2753l;
        }
        EnumC2017m layoutDirection = c0566k.getLayoutDirection();
        if (this.f9987d != layoutDirection) {
            this.f9987d = layoutDirection;
        }
        int i5 = (int) (j5 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c2901b.mo859c() >> 32)) - Float.intBitsToFloat(i5);
        int i6 = (int) (j5 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c2901b.mo859c() & 4294967295L)) - Float.intBitsToFloat(i6);
        ((C1753n) c2901b.f9185e.f307e).m3110D(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f2 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i5) > 0.0f && Float.intBitsToFloat(i6) > 0.0f) {
                    mo5484e(c0566k);
                }
            } finally {
                ((C1753n) c2901b.f9185e.f307e).m3110D(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo5483d();

    /* JADX INFO: renamed from: e */
    public abstract void mo5484e(C0566K c0566k);
}
