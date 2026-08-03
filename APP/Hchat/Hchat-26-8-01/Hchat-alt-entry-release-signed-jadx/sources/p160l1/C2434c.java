package p160l1;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import be.AbstractC0283h;
import okio.C3193a;
import p057e1.C0809d;
import p057e1.C0810e;
import p071f1.AbstractC0996c0;
import p071f1.C0993b;
import p071f1.C1003g;
import p071f1.C1005h;
import p071f1.C1009j;
import p071f1.C1010j0;
import p071f1.C1012k0;
import p071f1.C1014l0;
import p071f1.C1017n;
import p071f1.C1034w;
import p101h1.C1565b;
import p101h1.InterfaceC1567d;
import p259r9.AbstractC3754e0;
import p293u2.EnumC4243m;
import p339x1.C5610h0;

/* JADX INFO: renamed from: l1.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2434c {

    /* JADX INFO: renamed from: a */
    public final AbstractC0996c0 f8005a;

    /* JADX INFO: renamed from: b */
    public C1009j f8006b;

    /* JADX INFO: renamed from: c */
    public C1017n f8007c;

    /* JADX INFO: renamed from: d */
    public long f8008d;

    /* JADX INFO: renamed from: e */
    public long f8009e;

    /* JADX INFO: renamed from: f */
    public long f8010f;

    /* JADX INFO: renamed from: g */
    public EnumC4243m f8011g;

    /* JADX INFO: renamed from: h */
    public float f8012h;

    /* JADX INFO: renamed from: i */
    public final C2435d f8013i;

    /* JADX INFO: renamed from: j */
    public final C1005h f8014j;

    /* JADX INFO: renamed from: k */
    public C1003g f8015k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2434c(C2435d c2435d, AbstractC0996c0 abstractC0996c0) {
        this.f8005a = abstractC0996c0;
        int i9 = C1034w.f3264h;
        this.f8008d = C1034w.f3263g;
        this.f8009e = 0L;
        this.f8010f = 9205357640488583168L;
        this.f8011g = EnumC4243m.f13919g;
        this.f8012h = 1.0f;
        this.f8013i = c2435d;
        this.f8014j = AbstractC0996c0.m2510f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5840a(C5610h0 c5610h0, C1017n c1017n, long j3, long j4, float f3, int i9) {
        C1565b c1565b;
        C1017n c1017n2;
        char c10;
        long j5;
        C1003g c1003gM2509e;
        C1565b c1565b2 = c5610h0.f22833g;
        AbstractC0996c0 abstractC0996c0 = this.f8005a;
        if (abstractC0996c0 instanceof C1010j0) {
            this.f8006b = ((C1010j0) abstractC0996c0).f3195f;
            this.f8009e = 0L;
        } else if (abstractC0996c0 instanceof C1014l0) {
            C1014l0 c1014l0 = (C1014l0) abstractC0996c0;
            C0809d c0809d = c1014l0.f3198f;
            if (AbstractC0283h.m1124D(c0809d)) {
                this.f8006b = null;
                this.f8009e = c0809d.f2424e;
            } else {
                this.f8006b = c1014l0.f3199g;
                this.f8009e = 0L;
            }
        } else if (!(abstractC0996c0 instanceof C1012k0)) {
            C3193a.m6822k();
            return;
        } else {
            this.f8006b = null;
            this.f8009e = 0L;
        }
        if (c1017n != null) {
            c1565b = c1565b2;
            c1017n2 = c1017n;
        } else if (j4 != 16) {
            C1017n c1017n3 = this.f8007c;
            if (c1017n3 == null || !C1034w.m2635c(this.f8008d, j4)) {
                c1017n3 = new C1017n(j4, 5);
                this.f8008d = j4;
                this.f8007c = c1017n3;
            }
            c1565b = c1565b2;
            c1017n2 = c1017n3;
        } else {
            c1565b = c1565b2;
            c1017n2 = null;
        }
        long j10 = this.f8010f;
        if (j10 != 9205357640488583168L && C0810e.m2054a(j10, j3) && this.f8011g == c5610h0.getLayoutDirection() && this.f8012h == c1565b.mo1333d()) {
            c10 = ' ';
            j5 = 4294967295L;
        } else {
            long j11 = this.f8009e;
            C1009j c1009j = this.f8006b;
            C2435d c2435d = this.f8013i;
            float fMo1601x0 = c5610h0.mo1601x0(c2435d.f8016a);
            float fMo1601x02 = c5610h0.mo1601x0(c2435d.f8017b);
            c10 = ' ';
            C1005h c1005h = this.f8014j;
            j5 = 4294967295L;
            if (c1009j != null) {
                float f10 = 2;
                float f11 = (f10 * fMo1601x02) + (fMo1601x0 * f10);
                c1003gM2509e = AbstractC0996c0.m2509e((int) Math.ceil(Float.intBitsToFloat((int) (j3 >> 32)) + f11), (int) Math.ceil(Float.intBitsToFloat((int) (j3 & 4294967295L)) + f11), 1);
                C0993b c0993bM2505a = AbstractC0996c0.m2505a(c1003gM2509e);
                if (fMo1601x02 > 0.0f) {
                    float f12 = fMo1601x0 + fMo1601x02;
                    c0993bM2505a.mo2494m(f12, f12);
                    AbstractC3754e0.m7915v(c1005h, fMo1601x0 > 0.0f ? new BlurMaskFilter(fMo1601x0, BlurMaskFilter.Blur.NORMAL) : null, 11);
                    c0993bM2505a.mo2492j(c1009j, c1005h);
                    AbstractC3754e0.m7915v(c1005h, fMo1601x0 > 0.0f ? new BlurMaskFilter(fMo1601x0, BlurMaskFilter.Blur.NORMAL) : null, 3);
                    c1005h.m2564C(fMo1601x02 * 2.0f);
                    c0993bM2505a.mo2492j(c1009j, c1005h);
                } else {
                    AbstractC3754e0.m7915v(c1005h, fMo1601x0 > 0.0f ? new BlurMaskFilter(fMo1601x0, BlurMaskFilter.Blur.NORMAL) : null, 11);
                    c0993bM2505a.mo2494m(fMo1601x0, fMo1601x0);
                    c0993bM2505a.mo2492j(c1009j, c1005h);
                }
            } else {
                float f13 = 2;
                float f14 = (fMo1601x02 * f13) + (fMo1601x0 * f13);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) + f14;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) + f14;
                C1003g c1003gM2509e2 = AbstractC0996c0.m2509e((int) Math.ceil(fIntBitsToFloat), (int) Math.ceil(fIntBitsToFloat2), 1);
                C0993b c0993bM2505a2 = AbstractC0996c0.m2505a(c1003gM2509e2);
                float f15 = fIntBitsToFloat - fMo1601x0;
                float f16 = fIntBitsToFloat2 - fMo1601x0;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j11 >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                AbstractC3754e0.m7915v(c1005h, fMo1601x0 > 0.0f ? new BlurMaskFilter(fMo1601x0, BlurMaskFilter.Blur.NORMAL) : null, 11);
                c0993bM2505a2.f3149a.drawRoundRect(fMo1601x0, fMo1601x0, f15, f16, fIntBitsToFloat3, fIntBitsToFloat4, (Paint) c1005h.f3182i);
                c1003gM2509e = c1003gM2509e2;
            }
            this.f8015k = c1003gM2509e;
            this.f8010f = j3;
            this.f8011g = c5610h0.getLayoutDirection();
            this.f8012h = c1565b.mo1333d();
        }
        C1003g c1003g = this.f8015k;
        if (c1003g != null) {
            C2435d c2435d2 = this.f8013i;
            float f17 = -(c5610h0.mo1601x0(c2435d2.f8017b) + c5610h0.mo1601x0(c2435d2.f8016a));
            InterfaceC1567d.m4084U(c5610h0, c1003g, (((long) Float.floatToRawIntBits(f17)) << c10) | (((long) Float.floatToRawIntBits(f17)) & j5), f3, c1017n2, i9, 8);
        }
    }
}
