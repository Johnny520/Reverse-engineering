package p000;

import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sq0 implements yv1 {

    /* JADX INFO: renamed from: A */
    public boolean f10284A;

    /* JADX INFO: renamed from: h */
    public pq0 f10286h;

    /* JADX INFO: renamed from: i */
    public final nq0 f10287i;

    /* JADX INFO: renamed from: j */
    public final ViewTreeObserverOnGlobalLayoutListenerC0045b7 f10288j;

    /* JADX INFO: renamed from: k */
    public mn0 f10289k;

    /* JADX INFO: renamed from: l */
    public xm0 f10290l;

    /* JADX INFO: renamed from: n */
    public boolean f10292n;

    /* JADX INFO: renamed from: p */
    public float[] f10294p;

    /* JADX INFO: renamed from: q */
    public boolean f10295q;

    /* JADX INFO: renamed from: u */
    public int f10299u;

    /* JADX INFO: renamed from: w */
    public AbstractC0731te f10301w;

    /* JADX INFO: renamed from: x */
    public boolean f10302x;

    /* JADX INFO: renamed from: y */
    public boolean f10303y;

    /* JADX INFO: renamed from: m */
    public long f10291m = 9223372034707292159L;

    /* JADX INFO: renamed from: o */
    public final float[] f10293o = hf1.m2155a();

    /* JADX INFO: renamed from: r */
    public e70 f10296r = up0.m5536a();

    /* JADX INFO: renamed from: s */
    public d61 f10297s = d61.f1885h;

    /* JADX INFO: renamed from: t */
    public final C0702sp f10298t = new C0702sp();

    /* JADX INFO: renamed from: v */
    public long f10300v = m33.f6464b;

    /* JADX INFO: renamed from: z */
    public boolean f10304z = true;

    /* JADX INFO: renamed from: B */
    public final C0798v5 f10285B = new C0798v5(13, this);

    public sq0(pq0 pq0Var, nq0 nq0Var, ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, mn0 mn0Var, xm0 xm0Var) {
        this.f10286h = pq0Var;
        this.f10287i = nq0Var;
        this.f10288j = viewTreeObserverOnGlobalLayoutListenerC0045b7;
        this.f10289k = mn0Var;
        this.f10290l = xm0Var;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m4967a() {
        float[] fArrM2155a = this.f10294p;
        if (fArrM2155a == null) {
            fArrM2155a = hf1.m2155a();
            this.f10294p = fArrM2155a;
        }
        if (this.f10303y) {
            this.f10303y = false;
            float[] fArrM4968b = m4968b();
            if (this.f10304z) {
                return fArrM4968b;
            }
            if (!fg1.m1650y(fArrM4968b, fArrM2155a)) {
                fArrM2155a[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrM2155a[0])) {
            return null;
        }
        return fArrM2155a;
    }

    /* JADX INFO: renamed from: b */
    public final float[] m4968b() {
        boolean z = this.f10302x;
        float[] fArr = this.f10293o;
        if (z) {
            pq0 pq0Var = this.f10286h;
            long jM3784t = pq0Var.f8475v;
            rq0 rq0Var = pq0Var.f8454a;
            if ((9223372034707292159L & jM3784t) == 9205357640488583168L) {
                jM3784t = AbstractC0570p7.m3784t(s11.m4715q0(this.f10291m));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM3784t >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM3784t & 4294967295L));
            float fMo4598q = rq0Var.mo4598q();
            float fMo4587f = rq0Var.mo4587f();
            float fMo4603v = rq0Var.mo4603v();
            float fMo4572D = rq0Var.mo4572D();
            float fMo4578J = rq0Var.mo4578J();
            float fMo4585d = rq0Var.mo4585d();
            float fMo4576H = rq0Var.mo4576H();
            double d = ((double) fMo4603v) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fMo4587f * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fMo4587f * fSin);
            double d2 = ((double) fMo4572D) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fMo4598q * fCos2);
            float f10 = (f3 * fCos2) + ((-fMo4598q) * fSin2);
            double d3 = ((double) fMo4578J) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fMo4585d;
            float f16 = f14 * fMo4585d;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fMo4585d;
            float f18 = f12 * fMo4576H;
            float f19 = fCos * fCos3 * fMo4576H;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fMo4576H;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.f10302x = false;
            this.f10304z = AbstractC0570p7.m3789y(fArr);
        }
        return fArr;
    }

    /* JADX INFO: renamed from: c */
    public final void m4969c() {
        if (this.f10295q || this.f10292n) {
            return;
        }
        this.f10288j.invalidate();
        m4972f(true);
    }

    /* JADX INFO: renamed from: d */
    public final void m4970d(long j) {
        boolean zM452p = ViewTreeObserverOnGlobalLayoutListenerC0045b7.m452p();
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = this.f10288j;
        if (zM452p) {
            viewTreeObserverOnGlobalLayoutListenerC0045b7.m467N(-4.0f);
        }
        pq0 pq0Var = this.f10286h;
        if (!z01.m6371a(pq0Var.f8473t, j)) {
            pq0Var.f8473t = j;
            pq0Var.f8454a.mo4571C((int) (j >> 32), (int) (j & 4294967295L), pq0Var.f8474u);
        }
        ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC0045b7.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC0045b7, viewTreeObserverOnGlobalLayoutListenerC0045b7);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4971e(long j) {
        if (h11.m2041a(j, this.f10291m)) {
            return;
        }
        if (ViewTreeObserverOnGlobalLayoutListenerC0045b7.m452p()) {
            this.f10288j.m467N(-4.0f);
        }
        this.f10291m = j;
        m4969c();
    }

    /* JADX INFO: renamed from: f */
    public final void m4972f(boolean z) {
        if (z != this.f10295q) {
            this.f10295q = z;
            ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = this.f10288j;
            lk1 lk1Var = viewTreeObserverOnGlobalLayoutListenerC0045b7.f648L;
            boolean z2 = viewTreeObserverOnGlobalLayoutListenerC0045b7.f652N;
            if (!z) {
                if (z2) {
                    return;
                }
                lk1Var.m2934j(this);
                lk1 lk1Var2 = viewTreeObserverOnGlobalLayoutListenerC0045b7.f650M;
                if (lk1Var2 != null) {
                    lk1Var2.m2934j(this);
                    return;
                }
                return;
            }
            if (!z2) {
                lk1Var.m2925a(this);
                return;
            }
            lk1 lk1Var3 = viewTreeObserverOnGlobalLayoutListenerC0045b7.f650M;
            if (lk1Var3 == null) {
                lk1Var3 = new lk1();
                viewTreeObserverOnGlobalLayoutListenerC0045b7.f650M = lk1Var3;
            }
            lk1Var3.m2925a(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4973g() {
        ViewTreeObserverOnGlobalLayoutListenerC0045b7.m452p();
        if (this.f10295q) {
            if (!m33.m3029a(this.f10300v, m33.f6464b) && !h11.m2041a(this.f10286h.f8474u, this.f10291m)) {
                pq0 pq0Var = this.f10286h;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f10300v >> 32)) * ((int) (this.f10291m >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f10300v & 4294967295L)) * ((int) (this.f10291m & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!rs1.m4609b(pq0Var.f8475v, jFloatToRawIntBits)) {
                    pq0Var.f8475v = jFloatToRawIntBits;
                    pq0Var.f8454a.mo4580L(jFloatToRawIntBits);
                }
            }
            pq0 pq0Var2 = this.f10286h;
            e70 e70Var = this.f10296r;
            d61 d61Var = this.f10297s;
            long j = this.f10291m;
            long j2 = pq0Var2.f8474u;
            rq0 rq0Var = pq0Var2.f8454a;
            if (!h11.m2041a(j2, j)) {
                pq0Var2.f8474u = j;
                long j3 = pq0Var2.f8473t;
                rq0Var.mo4571C((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (pq0Var2.f8462i == 9205357640488583168L) {
                    pq0Var2.f8460g = true;
                    pq0Var2.m3943a();
                }
            }
            pq0Var2.f8455b = e70Var;
            pq0Var2.f8456c = d61Var;
            pq0Var2.f8457d = this.f10285B;
            rq0Var.mo4604w(e70Var, d61Var, pq0Var2, pq0Var2.f8458e);
            m4972f(false);
        }
    }
}
