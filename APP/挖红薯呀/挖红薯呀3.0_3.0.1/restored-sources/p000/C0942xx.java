package p000;

import android.view.ViewParent;

/* JADX INFO: renamed from: xx */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0942xx implements cn0 {

    /* JADX INFO: renamed from: d */
    public C0868vx f7431d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0819ux f7432e;

    /* JADX INFO: renamed from: f */
    public final ViewTreeObserverOnGlobalLayoutListenerC0875w3 f7433f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0904ww f7434g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0298hw f7435h;

    /* JADX INFO: renamed from: j */
    public boolean f7437j;

    /* JADX INFO: renamed from: l */
    public float[] f7439l;

    /* JADX INFO: renamed from: m */
    public boolean f7440m;

    /* JADX INFO: renamed from: q */
    public int f7444q;

    /* JADX INFO: renamed from: s */
    public v50 f7446s;

    /* JADX INFO: renamed from: t */
    public boolean f7447t;

    /* JADX INFO: renamed from: u */
    public boolean f7448u;

    /* JADX INFO: renamed from: w */
    public boolean f7450w;

    /* JADX INFO: renamed from: i */
    public long f7436i = 9223372034707292159L;

    /* JADX INFO: renamed from: k */
    public final float[] f7438k = r60.m3406h();

    /* JADX INFO: renamed from: n */
    public InterfaceC0968ym f7441n = AbstractC0307i4.m1528d();

    /* JADX INFO: renamed from: o */
    public k50 f7442o = k50.f3015d;

    /* JADX INFO: renamed from: p */
    public final C0125dd f7443p = new C0125dd();

    /* JADX INFO: renamed from: r */
    public long f7445r = t81.f5953a;

    /* JADX INFO: renamed from: v */
    public boolean f7449v = true;

    /* JADX INFO: renamed from: x */
    public final C0711s2 f7451x = new C0711s2(13, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0942xx(C0868vx c0868vx, InterfaceC0819ux interfaceC0819ux, ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3, InterfaceC0904ww interfaceC0904ww, InterfaceC0298hw interfaceC0298hw) {
        this.f7431d = c0868vx;
        this.f7432e = interfaceC0819ux;
        this.f7433f = viewTreeObserverOnGlobalLayoutListenerC0875w3;
        this.f7434g = interfaceC0904ww;
        this.f7435h = interfaceC0298hw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final float[] m5171a() {
        float[] fArrM3406h = this.f7439l;
        if (fArrM3406h == null) {
            fArrM3406h = r60.m3406h();
            this.f7439l = fArrM3406h;
        }
        if (this.f7448u) {
            this.f7448u = false;
            float[] fArrM5172b = m5172b();
            if (this.f7449v) {
                return fArrM5172b;
            }
            if (!s91.m4017B(fArrM5172b, fArrM3406h)) {
                fArrM3406h[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrM3406h[0])) {
            return null;
        }
        return fArrM3406h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final float[] m5172b() {
        boolean z = this.f7447t;
        float[] fArr = this.f7438k;
        if (z) {
            C0868vx c0868vx = this.f7431d;
            long jM3415q = c0868vx.f6858v;
            if ((9223372034707292159L & jM3415q) == 9205357640488583168L) {
                jM3415q = r60.m3415q(o30.m2759C(this.f7436i));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM3415q >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM3415q & 4294967295L));
            C1020zx c1020zx = c0868vx.f6837a;
            float f = c1020zx.f8019j;
            float f2 = c1020zx.f8020k;
            float fSin = (float) Math.sin(0.0d);
            float fCos = (float) Math.cos(0.0d);
            float f3 = -fSin;
            float f4 = 0.0f * fCos;
            float f5 = 0.0f * fSin;
            float f6 = f4 - f5;
            float f7 = f4 + f5;
            float fSin2 = (float) Math.sin(0.0d);
            float fCos2 = (float) Math.cos(0.0d);
            float f8 = -fSin2;
            float f9 = fSin * fSin2;
            float f10 = fSin * fCos2;
            float f11 = fCos * fSin2;
            float f12 = fCos * fCos2;
            float f13 = (f7 * fSin2) + (0.0f * fCos2);
            float f14 = (f7 * fCos2) + ((-0.0f) * fSin2);
            float fSin3 = (float) Math.sin(0.0d);
            float fCos3 = (float) Math.cos(0.0d);
            float f15 = -fSin3;
            float f16 = (fCos3 * f9) + (f15 * fCos2);
            float f17 = (f9 * fSin3) + (fCos2 * fCos3);
            float f18 = fSin3 * fCos;
            float f19 = f17 * f;
            float f20 = f18 * f;
            float f21 = ((fSin3 * f10) + (fCos3 * f8)) * f;
            float f22 = f16 * f2;
            float f23 = fCos * fCos3 * f2;
            float f24 = ((fCos3 * f10) + (f15 * f8)) * f2;
            float f25 = f11 * 1.0f;
            float f26 = f3 * 1.0f;
            float f27 = f12 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f19;
                fArr[1] = f20;
                fArr[2] = f21;
                fArr[3] = 0.0f;
                fArr[4] = f22;
                fArr[5] = f23;
                fArr[6] = f24;
                fArr[7] = 0.0f;
                fArr[8] = f25;
                fArr[9] = f26;
                fArr[10] = f27;
                fArr[11] = 0.0f;
                float f28 = -fIntBitsToFloat;
                fArr[12] = ((f19 * f28) - (f22 * fIntBitsToFloat2)) + f13 + fIntBitsToFloat;
                fArr[13] = ((f20 * f28) - (f23 * fIntBitsToFloat2)) + f6 + fIntBitsToFloat2;
                fArr[14] = ((f28 * f21) - (fIntBitsToFloat2 * f24)) + f14;
                fArr[15] = 1.0f;
            }
            this.f7447t = false;
            this.f7449v = w60.m4919z(fArr);
        }
        return fArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5173c() {
        if (this.f7440m || this.f7437j) {
            return;
        }
        this.f7433f.invalidate();
        m5176f(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5174d(long j) {
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = this.f7433f;
        if (viewTreeObserverOnGlobalLayoutListenerC0875w3.f6969o) {
            viewTreeObserverOnGlobalLayoutListenerC0875w3.m4852I(-4.0f);
        }
        C0868vx c0868vx = this.f7431d;
        if (!w20.m4833a(c0868vx.f6856t, j)) {
            c0868vx.f6856t = j;
            c0868vx.m4801h(j, c0868vx.f6857u);
        }
        ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC0875w3.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC0875w3, viewTreeObserverOnGlobalLayoutListenerC0875w3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m5175e(long j) {
        if (d30.m628a(j, this.f7436i)) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = this.f7433f;
        if (viewTreeObserverOnGlobalLayoutListenerC0875w3.f6969o) {
            viewTreeObserverOnGlobalLayoutListenerC0875w3.m4852I(-4.0f);
        }
        this.f7436i = j;
        m5173c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m5176f(boolean z) {
        if (z != this.f7440m) {
            this.f7440m = z;
            ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = this.f7433f;
            dh0 dh0Var = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6923G;
            boolean z2 = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6927I;
            if (!z) {
                if (z2) {
                    return;
                }
                dh0Var.m706j(this);
                dh0 dh0Var2 = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6925H;
                if (dh0Var2 != null) {
                    dh0Var2.m706j(this);
                    return;
                }
                return;
            }
            if (!z2) {
                dh0Var.m697a(this);
                return;
            }
            dh0 dh0Var3 = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6925H;
            if (dh0Var3 == null) {
                dh0Var3 = new dh0();
                viewTreeObserverOnGlobalLayoutListenerC0875w3.f6925H = dh0Var3;
            }
            dh0Var3.m697a(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m5177g() {
        if (this.f7440m) {
            if (this.f7445r != t81.f5953a && !d30.m628a(this.f7431d.f6857u, this.f7436i)) {
                C0868vx c0868vx = this.f7431d;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f7445r >> 32)) * ((int) (this.f7436i >> 32));
                c0868vx.m4800g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f7445r & 4294967295L)) * ((int) (this.f7436i & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
            }
            C0868vx c0868vx2 = this.f7431d;
            InterfaceC0968ym interfaceC0968ym = this.f7441n;
            k50 k50Var = this.f7442o;
            long j = this.f7436i;
            if (!d30.m628a(c0868vx2.f6857u, j)) {
                c0868vx2.f6857u = j;
                c0868vx2.m4801h(c0868vx2.f6856t, j);
                if (c0868vx2.f6845i == 9205357640488583168L) {
                    c0868vx2.f6843g = true;
                    c0868vx2.m4794a();
                }
            }
            c0868vx2.f6838b = interfaceC0968ym;
            c0868vx2.f6839c = k50Var;
            c0868vx2.f6840d = this.f7451x;
            c0868vx2.m4799f();
            m5176f(false);
        }
    }
}
