package p357y1;

import android.view.ViewParent;
import p016b1.C0166f;
import p057e1.C0807b;
import p069f.C0933f0;
import p071f1.AbstractC0996c0;
import p071f1.C1008i0;
import p071f1.C1032u0;
import p071f1.InterfaceC1037z;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p101h1.C1565b;
import p118i1.C1902b;
import p118i1.InterfaceC1904d;
import p259r9.AbstractC3754e0;
import p293u2.C4242l;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p339x1.InterfaceC5638q1;

/* JADX INFO: renamed from: y1.o1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5916o1 implements InterfaceC5638q1 {

    /* JADX INFO: renamed from: g */
    public C1902b f24006g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1037z f24007h;

    /* JADX INFO: renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC5934t f24008i;

    /* JADX INFO: renamed from: j */
    public InterfaceC1235p f24009j;

    /* JADX INFO: renamed from: k */
    public InterfaceC1220a f24010k;

    /* JADX INFO: renamed from: l */
    public long f24011l;

    /* JADX INFO: renamed from: m */
    public boolean f24012m;

    /* JADX INFO: renamed from: o */
    public float[] f24014o;

    /* JADX INFO: renamed from: p */
    public boolean f24015p;

    /* JADX INFO: renamed from: t */
    public int f24019t;

    /* JADX INFO: renamed from: v */
    public AbstractC0996c0 f24021v;

    /* JADX INFO: renamed from: w */
    public boolean f24022w;

    /* JADX INFO: renamed from: x */
    public boolean f24023x;

    /* JADX INFO: renamed from: z */
    public boolean f24025z;

    /* JADX INFO: renamed from: n */
    public final float[] f24013n = C1008i0.m2593a();

    /* JADX INFO: renamed from: q */
    public InterfaceC4233c f24016q = AbstractC1184v0.m3191a();

    /* JADX INFO: renamed from: r */
    public EnumC4243m f24017r = EnumC4243m.f13919g;

    /* JADX INFO: renamed from: s */
    public final C1565b f24018s = new C1565b();

    /* JADX INFO: renamed from: u */
    public long f24020u = C1032u0.f3254b;

    /* JADX INFO: renamed from: y */
    public boolean f24024y = true;

    /* JADX INFO: renamed from: A */
    public final C0166f f24005A = new C0166f(this, 26);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5916o1(C1902b c1902b, InterfaceC1037z interfaceC1037z, ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, InterfaceC1235p interfaceC1235p, InterfaceC1220a interfaceC1220a) {
        this.f24006g = c1902b;
        this.f24007h = interfaceC1037z;
        this.f24008i = viewTreeObserverOnGlobalLayoutListenerC5934t;
        this.f24009j = interfaceC1235p;
        this.f24010k = interfaceC1220a;
        long j3 = Integer.MAX_VALUE;
        this.f24011l = (j3 & 4294967295L) | (j3 << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final float[] m10623a() {
        float[] fArrM2593a = this.f24014o;
        if (fArrM2593a == null) {
            fArrM2593a = C1008i0.m2593a();
            this.f24014o = fArrM2593a;
        }
        if (this.f24023x) {
            this.f24023x = false;
            float[] fArrM10624b = m10624b();
            if (this.f24024y) {
                return fArrM10624b;
            }
            if (!AbstractC5883g0.m10600p(fArrM10624b, fArrM2593a)) {
                fArrM2593a[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrM2593a[0])) {
            return null;
        }
        return fArrM2593a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final float[] m10624b() {
        boolean z9 = this.f24022w;
        float[] fArr = this.f24013n;
        if (z9) {
            C1902b c1902b = this.f24006g;
            long jM2718B = c1902b.f6361v;
            InterfaceC1904d interfaceC1904d = c1902b.f6340a;
            if ((9223372034707292159L & jM2718B) == 9205357640488583168L) {
                jM2718B = AbstractC1089i.m2718B(AbstractC3754e0.m7908q0(this.f24011l));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM2718B >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM2718B & 4294967295L));
            float fMo4689H = interfaceC1904d.mo4689H();
            float fMo4686E = interfaceC1904d.mo4686E();
            float fMo4690I = interfaceC1904d.mo4690I();
            float fMo4722z = interfaceC1904d.mo4722z();
            float fMo4683B = interfaceC1904d.mo4683B();
            float fMo4698b = interfaceC1904d.mo4698b();
            float fMo4718v = interfaceC1904d.mo4718v();
            double d10 = ((double) fMo4690I) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d10);
            float fCos = (float) Math.cos(d10);
            float f3 = -fSin;
            float f10 = (fMo4686E * fCos) - (0.0f * fSin);
            float f11 = (0.0f * fCos) + (fMo4686E * fSin);
            double d11 = ((double) fMo4722z) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d11);
            float fCos2 = (float) Math.cos(d11);
            float f12 = -fSin2;
            float f13 = fSin * fSin2;
            float f14 = fSin * fCos2;
            float f15 = fCos * fSin2;
            float f16 = fCos * fCos2;
            float f17 = (f11 * fSin2) + (fMo4689H * fCos2);
            float f18 = (f11 * fCos2) + ((-fMo4689H) * fSin2);
            double d12 = ((double) fMo4683B) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d12);
            float fCos3 = (float) Math.cos(d12);
            float f19 = -fSin3;
            float f20 = (fCos3 * f13) + (f19 * fCos2);
            float f21 = (f13 * fSin3) + (fCos2 * fCos3);
            float f22 = fSin3 * fCos;
            float f23 = f21 * fMo4698b;
            float f24 = f22 * fMo4698b;
            float f25 = ((fSin3 * f14) + (fCos3 * f12)) * fMo4698b;
            float f26 = f20 * fMo4718v;
            float f27 = fCos * fCos3 * fMo4718v;
            float f28 = ((fCos3 * f14) + (f19 * f12)) * fMo4718v;
            float f29 = f15 * 1.0f;
            float f30 = f3 * 1.0f;
            float f31 = f16 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f23;
                fArr[1] = f24;
                fArr[2] = f25;
                fArr[3] = 0.0f;
                fArr[4] = f26;
                fArr[5] = f27;
                fArr[6] = f28;
                fArr[7] = 0.0f;
                fArr[8] = f29;
                fArr[9] = f30;
                fArr[10] = f31;
                fArr[11] = 0.0f;
                float f32 = -fIntBitsToFloat;
                fArr[12] = ((f23 * f32) - (fIntBitsToFloat2 * f26)) + f17 + fIntBitsToFloat;
                fArr[13] = ((f24 * f32) - (fIntBitsToFloat2 * f27)) + f10 + fIntBitsToFloat2;
                fArr[14] = ((f32 * f25) - (fIntBitsToFloat2 * f28)) + f18;
                fArr[15] = 1.0f;
            }
            this.f24022w = false;
            this.f24024y = AbstractC0996c0.m2518o(fArr);
        }
        return fArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m10625c() {
        if (this.f24015p || this.f24012m) {
            return;
        }
        this.f24008i.invalidate();
        m10628f(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m10626d(long j3) {
        boolean zM10640r = ViewTreeObserverOnGlobalLayoutListenerC5934t.m10640r();
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = this.f24008i;
        if (zM10640r) {
            viewTreeObserverOnGlobalLayoutListenerC5934t.m10657P(-4.0f);
        }
        this.f24006g.m4681i(j3);
        ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC5934t.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC5934t, viewTreeObserverOnGlobalLayoutListenerC5934t);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m10627e(long j3) {
        if (C4242l.m8534a(j3, this.f24011l)) {
            return;
        }
        if (ViewTreeObserverOnGlobalLayoutListenerC5934t.m10640r()) {
            this.f24008i.m10657P(-4.0f);
        }
        this.f24011l = j3;
        m10625c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m10628f(boolean z9) {
        if (z9 != this.f24015p) {
            this.f24015p = z9;
            ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = this.f24008i;
            C0933f0 c0933f0 = viewTreeObserverOnGlobalLayoutListenerC5934t.f24082K;
            boolean z10 = viewTreeObserverOnGlobalLayoutListenerC5934t.f24086M;
            if (!z9) {
                if (z10) {
                    return;
                }
                c0933f0.m2295j(this);
                C0933f0 c0933f02 = viewTreeObserverOnGlobalLayoutListenerC5934t.f24084L;
                if (c0933f02 != null) {
                    c0933f02.m2295j(this);
                    return;
                }
                return;
            }
            if (!z10) {
                c0933f0.m2286a(this);
                return;
            }
            C0933f0 c0933f03 = viewTreeObserverOnGlobalLayoutListenerC5934t.f24084L;
            if (c0933f03 == null) {
                c0933f03 = new C0933f0();
                viewTreeObserverOnGlobalLayoutListenerC5934t.f24084L = c0933f03;
            }
            c0933f03.m2286a(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m10629g() {
        ViewTreeObserverOnGlobalLayoutListenerC5934t.m10640r();
        if (this.f24015p) {
            if (!C1032u0.m2631a(this.f24020u, C1032u0.f3254b) && !C4242l.m8534a(this.f24006g.f6360u, this.f24011l)) {
                C1902b c1902b = this.f24006g;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f24020u >> 32)) * ((int) (this.f24011l >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f24020u & 4294967295L)) * ((int) (this.f24011l & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!C0807b.m2039b(c1902b.f6361v, jFloatToRawIntBits)) {
                    c1902b.f6361v = jFloatToRawIntBits;
                    c1902b.f6340a.mo4684C(jFloatToRawIntBits);
                }
            }
            this.f24006g.m4677e(this.f24016q, this.f24017r, this.f24011l, this.f24005A);
            m10628f(false);
        }
    }
}
