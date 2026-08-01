package p047I0;

import android.view.ViewParent;
import com.bumptech.glide.AbstractC1924f;
import com.bumptech.glide.AbstractC1925g;
import p007B0.C0172E;
import p041H0.InterfaceC0612p0;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p128a.AbstractC1785a;
import p153e1.C2014j;
import p153e1.C2016l;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p204n0.C2683b;
import p211o0.AbstractC2767z;
import p211o0.C2730E;
import p211o0.C2741P;
import p211o0.InterfaceC2765x;
import p222q0.C2901b;
import p228r0.C3029b;
import p228r0.InterfaceC3031d;

/* JADX INFO: renamed from: I0.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0769w0 implements InterfaceC0612p0 {

    /* JADX INFO: renamed from: d */
    public C3029b f2395d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2765x f2396e;

    /* JADX INFO: renamed from: f */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772y f2397f;

    /* JADX INFO: renamed from: g */
    public InterfaceC1603e f2398g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1599a f2399h;

    /* JADX INFO: renamed from: i */
    public long f2400i;

    /* JADX INFO: renamed from: j */
    public boolean f2401j;

    /* JADX INFO: renamed from: l */
    public float[] f2403l;

    /* JADX INFO: renamed from: m */
    public boolean f2404m;

    /* JADX INFO: renamed from: q */
    public int f2408q;

    /* JADX INFO: renamed from: s */
    public AbstractC2767z f2410s;

    /* JADX INFO: renamed from: t */
    public boolean f2411t;

    /* JADX INFO: renamed from: u */
    public boolean f2412u;

    /* JADX INFO: renamed from: w */
    public boolean f2414w;

    /* JADX INFO: renamed from: k */
    public final float[] f2402k = C2730E.m4782a();

    /* JADX INFO: renamed from: n */
    public InterfaceC2007c f2405n = AbstractC1785a.m3241a();

    /* JADX INFO: renamed from: o */
    public EnumC2017m f2406o = EnumC2017m.f6742d;

    /* JADX INFO: renamed from: p */
    public final C2901b f2407p = new C2901b();

    /* JADX INFO: renamed from: r */
    public long f2409r = C2741P.f8720b;

    /* JADX INFO: renamed from: v */
    public boolean f2413v = true;

    /* JADX INFO: renamed from: x */
    public final C0172E f2415x = new C0172E(10, this);

    public C0769w0(C3029b c3029b, InterfaceC2765x interfaceC2765x, ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, InterfaceC1603e interfaceC1603e, InterfaceC1599a interfaceC1599a) {
        this.f2395d = c3029b;
        this.f2396e = interfaceC2765x;
        this.f2397f = viewTreeObserverOnGlobalLayoutListenerC0772y;
        this.f2398g = interfaceC1603e;
        this.f2399h = interfaceC1599a;
        long j5 = Integer.MAX_VALUE;
        this.f2400i = (j5 & 4294967295L) | (j5 << 32);
    }

    /* JADX INFO: renamed from: a */
    public final float[] m1279a() {
        float[] fArrM4782a = this.f2403l;
        if (fArrM4782a == null) {
            fArrM4782a = C2730E.m4782a();
            this.f2403l = fArrM4782a;
        }
        if (this.f2412u) {
            this.f2412u = false;
            float[] fArrM1280b = m1280b();
            if (this.f2413v) {
                return fArrM1280b;
            }
            if (!AbstractC0681L.m1190l(fArrM1280b, fArrM4782a)) {
                fArrM4782a[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrM4782a[0])) {
            return null;
        }
        return fArrM4782a;
    }

    /* JADX INFO: renamed from: b */
    public final float[] m1280b() {
        boolean z5 = this.f2411t;
        float[] fArr = this.f2402k;
        if (z5) {
            C3029b c3029b = this.f2395d;
            long jM3500l = c3029b.f9628v;
            InterfaceC3031d interfaceC3031d = c3029b.f9607a;
            if ((9223372034707292159L & jM3500l) == 9205357640488583168L) {
                jM3500l = AbstractC1924f.m3500l(AbstractC1925g.m3523F(this.f2400i));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM3500l >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM3500l & 4294967295L));
            float fMo5263r = interfaceC3031d.mo5263r();
            float fMo5251f = interfaceC3031d.mo5251f();
            float fMo5267v = interfaceC3031d.mo5267v();
            float fMo5234D = interfaceC3031d.mo5234D();
            float fMo5242L = interfaceC3031d.mo5242L();
            float fMo5249d = interfaceC3031d.mo5249d();
            float fMo5240J = interfaceC3031d.mo5240J();
            double d5 = ((double) fMo5267v) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d5);
            float fCos = (float) Math.cos(d5);
            float f2 = -fSin;
            float f5 = (fMo5251f * fCos) - (0.0f * fSin);
            float f6 = (0.0f * fCos) + (fMo5251f * fSin);
            double d6 = ((double) fMo5234D) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d6);
            float fCos2 = (float) Math.cos(d6);
            float f7 = -fSin2;
            float f8 = fSin * fSin2;
            float f9 = fSin * fCos2;
            float f10 = fCos * fSin2;
            float f11 = fCos * fCos2;
            float f12 = (f6 * fSin2) + (fMo5263r * fCos2);
            float f13 = (f6 * fCos2) + ((-fMo5263r) * fSin2);
            double d7 = ((double) fMo5242L) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d7);
            float fCos3 = (float) Math.cos(d7);
            float f14 = -fSin3;
            float f15 = (fCos3 * f8) + (f14 * fCos2);
            float f16 = (f8 * fSin3) + (fCos2 * fCos3);
            float f17 = fSin3 * fCos;
            float f18 = f16 * fMo5249d;
            float f19 = f17 * fMo5249d;
            float f20 = ((fSin3 * f9) + (fCos3 * f7)) * fMo5249d;
            float f21 = f15 * fMo5240J;
            float f22 = fCos * fCos3 * fMo5240J;
            float f23 = ((fCos3 * f9) + (f14 * f7)) * fMo5240J;
            float f24 = f10 * 1.0f;
            float f25 = f2 * 1.0f;
            float f26 = f11 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f18;
                fArr[1] = f19;
                fArr[2] = f20;
                fArr[3] = 0.0f;
                fArr[4] = f21;
                fArr[5] = f22;
                fArr[6] = f23;
                fArr[7] = 0.0f;
                fArr[8] = f24;
                fArr[9] = f25;
                fArr[10] = f26;
                fArr[11] = 0.0f;
                float f27 = -fIntBitsToFloat;
                fArr[12] = ((f18 * f27) - (fIntBitsToFloat2 * f21)) + f12 + fIntBitsToFloat;
                fArr[13] = ((f19 * f27) - (fIntBitsToFloat2 * f22)) + f5 + fIntBitsToFloat2;
                fArr[14] = ((f27 * f20) - (fIntBitsToFloat2 * f23)) + f13;
                fArr[15] = 1.0f;
            }
            this.f2411t = false;
            this.f2413v = AbstractC2767z.m4944o(fArr);
        }
        return fArr;
    }

    /* JADX INFO: renamed from: c */
    public final long m1281c(long j5, boolean z5) {
        float[] fArrM1280b;
        if (z5) {
            fArrM1280b = m1279a();
            if (fArrM1280b == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrM1280b = m1280b();
        }
        return this.f2413v ? j5 : C2730E.m4783b(j5, fArrM1280b);
    }

    /* JADX INFO: renamed from: d */
    public final void m1282d(long j5) {
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = this.f2397f;
        if (viewTreeObserverOnGlobalLayoutListenerC0772y.f2487o) {
            viewTreeObserverOnGlobalLayoutListenerC0772y.m1306N(-4.0f);
        }
        C3029b c3029b = this.f2395d;
        if (!C2014j.m3700a(c3029b.f9626t, j5)) {
            c3029b.f9626t = j5;
            c3029b.f9607a.mo5233C((int) (j5 >> 32), (int) (j5 & 4294967295L), c3029b.f9627u);
        }
        ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC0772y.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC0772y, viewTreeObserverOnGlobalLayoutListenerC0772y);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1283e(long j5) {
        if (C2016l.m3704a(j5, this.f2400i)) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = this.f2397f;
        if (viewTreeObserverOnGlobalLayoutListenerC0772y.f2487o) {
            viewTreeObserverOnGlobalLayoutListenerC0772y.m1306N(-4.0f);
        }
        this.f2400i = j5;
        if (this.f2404m || this.f2401j) {
            return;
        }
        viewTreeObserverOnGlobalLayoutListenerC0772y.invalidate();
        if (true != this.f2404m) {
            this.f2404m = true;
            viewTreeObserverOnGlobalLayoutListenerC0772y.m1318x(this, true);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1284f() {
        if (this.f2404m) {
            if (!C2741P.m4806a(this.f2409r, C2741P.f8720b) && !C2016l.m3704a(this.f2395d.f9627u, this.f2400i)) {
                C3029b c3029b = this.f2395d;
                float fM4807b = C2741P.m4807b(this.f2409r) * ((int) (this.f2400i >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(C2741P.m4808c(this.f2409r) * ((int) (this.f2400i & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fM4807b) << 32);
                if (!C2683b.m4644b(c3029b.f9628v, jFloatToRawIntBits)) {
                    c3029b.f9628v = jFloatToRawIntBits;
                    c3029b.f9607a.mo5244N(jFloatToRawIntBits);
                }
            }
            C3029b c3029b2 = this.f2395d;
            InterfaceC2007c interfaceC2007c = this.f2405n;
            EnumC2017m enumC2017m = this.f2406o;
            long j5 = this.f2400i;
            long j6 = c3029b2.f9627u;
            InterfaceC3031d interfaceC3031d = c3029b2.f9607a;
            if (!C2016l.m3704a(j6, j5)) {
                c3029b2.f9627u = j5;
                long j7 = c3029b2.f9626t;
                interfaceC3031d.mo5233C((int) (j7 >> 32), (int) (4294967295L & j7), j5);
                if (c3029b2.f9615i == 9205357640488583168L) {
                    c3029b2.f9613g = true;
                    c3029b2.m5225a();
                }
            }
            c3029b2.f9608b = interfaceC2007c;
            c3029b2.f9609c = enumC2017m;
            c3029b2.f9610d = this.f2415x;
            interfaceC3031d.mo5232B(interfaceC2007c, enumC2017m, c3029b2, c3029b2.f9611e);
            if (this.f2404m) {
                this.f2404m = false;
                this.f2397f.m1318x(this, false);
            }
        }
    }

    @Override // p041H0.InterfaceC0612p0
    public final void invalidate() {
        if (this.f2404m || this.f2401j) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = this.f2397f;
        viewTreeObserverOnGlobalLayoutListenerC0772y.invalidate();
        if (true != this.f2404m) {
            this.f2404m = true;
            viewTreeObserverOnGlobalLayoutListenerC0772y.m1318x(this, true);
        }
    }
}
