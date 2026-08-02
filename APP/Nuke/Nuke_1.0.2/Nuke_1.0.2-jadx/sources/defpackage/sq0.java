package defpackage;

import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sq0 implements yv1 {
    public boolean A;
    public pq0 h;
    public final nq0 i;
    public final b7 j;
    public mn0 k;
    public xm0 l;
    public boolean n;
    public float[] p;
    public boolean q;
    public int u;
    public te w;
    public boolean x;
    public boolean y;
    public long m = 9223372034707292159L;
    public final float[] o = hf1.a();
    public e70 r = up0.a();
    public d61 s = d61.h;
    public final sp t = new sp();
    public long v = m33.b;
    public boolean z = true;
    public final v5 B = new v5(13, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sq0(pq0 pq0Var, nq0 nq0Var, b7 b7Var, mn0 mn0Var, xm0 xm0Var) {
        this.h = pq0Var;
        this.i = nq0Var;
        this.j = b7Var;
        this.k = mn0Var;
        this.l = xm0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float[] a() {
        float[] fArrA = this.p;
        if (fArrA == null) {
            fArrA = hf1.a();
            this.p = fArrA;
        }
        if (this.y) {
            this.y = false;
            float[] fArrB = b();
            if (this.z) {
                return fArrB;
            }
            if (!fg1.y(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float[] b() {
        boolean z = this.x;
        float[] fArr = this.o;
        if (z) {
            pq0 pq0Var = this.h;
            long jT = pq0Var.v;
            rq0 rq0Var = pq0Var.a;
            if ((9223372034707292159L & jT) == 9205357640488583168L) {
                jT = p7.t(s11.q0(this.m));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jT >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jT & 4294967295L));
            float fQ = rq0Var.q();
            float f = rq0Var.f();
            float fV = rq0Var.v();
            float fD = rq0Var.D();
            float fJ = rq0Var.J();
            float fD2 = rq0Var.d();
            float fH = rq0Var.H();
            double d = ((double) fV) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f2 = -fSin;
            float f3 = (f * fCos) - (0.0f * fSin);
            float f4 = (0.0f * fCos) + (f * fSin);
            double d2 = ((double) fD) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f5 = -fSin2;
            float f6 = fSin * fSin2;
            float f7 = fSin * fCos2;
            float f8 = fCos * fSin2;
            float f9 = fCos * fCos2;
            float f10 = (f4 * fSin2) + (fQ * fCos2);
            float f11 = (f4 * fCos2) + ((-fQ) * fSin2);
            double d3 = ((double) fJ) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f12 = -fSin3;
            float f13 = (fCos3 * f6) + (f12 * fCos2);
            float f14 = (f6 * fSin3) + (fCos2 * fCos3);
            float f15 = fSin3 * fCos;
            float f16 = f14 * fD2;
            float f17 = f15 * fD2;
            float f18 = ((fSin3 * f7) + (fCos3 * f5)) * fD2;
            float f19 = f13 * fH;
            float f20 = fCos * fCos3 * fH;
            float f21 = ((fCos3 * f7) + (f12 * f5)) * fH;
            float f22 = f8 * 1.0f;
            float f23 = f2 * 1.0f;
            float f24 = f9 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f16;
                fArr[1] = f17;
                fArr[2] = f18;
                fArr[3] = 0.0f;
                fArr[4] = f19;
                fArr[5] = f20;
                fArr[6] = f21;
                fArr[7] = 0.0f;
                fArr[8] = f22;
                fArr[9] = f23;
                fArr[10] = f24;
                fArr[11] = 0.0f;
                float f25 = -fIntBitsToFloat;
                fArr[12] = ((f16 * f25) - (fIntBitsToFloat2 * f19)) + f10 + fIntBitsToFloat;
                fArr[13] = ((f17 * f25) - (fIntBitsToFloat2 * f20)) + f3 + fIntBitsToFloat2;
                fArr[14] = ((f25 * f18) - (fIntBitsToFloat2 * f21)) + f11;
                fArr[15] = 1.0f;
            }
            this.x = false;
            this.z = p7.y(fArr);
        }
        return fArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        if (this.q || this.n) {
            return;
        }
        this.j.invalidate();
        f(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(long j) {
        boolean zP = b7.p();
        b7 b7Var = this.j;
        if (zP) {
            b7Var.N(-4.0f);
        }
        pq0 pq0Var = this.h;
        if (!z01.a(pq0Var.t, j)) {
            pq0Var.t = j;
            pq0Var.a.C((int) (j >> 32), (int) (j & 4294967295L), pq0Var.u);
        }
        ViewParent parent = b7Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(b7Var, b7Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(long j) {
        if (h11.a(j, this.m)) {
            return;
        }
        if (b7.p()) {
            this.j.N(-4.0f);
        }
        this.m = j;
        c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(boolean z) {
        if (z != this.q) {
            this.q = z;
            b7 b7Var = this.j;
            lk1 lk1Var = b7Var.L;
            boolean z2 = b7Var.N;
            if (!z) {
                if (z2) {
                    return;
                }
                lk1Var.j(this);
                lk1 lk1Var2 = b7Var.M;
                if (lk1Var2 != null) {
                    lk1Var2.j(this);
                    return;
                }
                return;
            }
            if (!z2) {
                lk1Var.a(this);
                return;
            }
            lk1 lk1Var3 = b7Var.M;
            if (lk1Var3 == null) {
                lk1Var3 = new lk1();
                b7Var.M = lk1Var3;
            }
            lk1Var3.a(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        b7.p();
        if (this.q) {
            if (!m33.a(this.v, m33.b) && !h11.a(this.h.u, this.m)) {
                pq0 pq0Var = this.h;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.v >> 32)) * ((int) (this.m >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.v & 4294967295L)) * ((int) (this.m & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!rs1.b(pq0Var.v, jFloatToRawIntBits)) {
                    pq0Var.v = jFloatToRawIntBits;
                    pq0Var.a.L(jFloatToRawIntBits);
                }
            }
            pq0 pq0Var2 = this.h;
            e70 e70Var = this.r;
            d61 d61Var = this.s;
            long j = this.m;
            long j2 = pq0Var2.u;
            rq0 rq0Var = pq0Var2.a;
            if (!h11.a(j2, j)) {
                pq0Var2.u = j;
                long j3 = pq0Var2.t;
                rq0Var.C((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (pq0Var2.i == 9205357640488583168L) {
                    pq0Var2.g = true;
                    pq0Var2.a();
                }
            }
            pq0Var2.b = e70Var;
            pq0Var2.c = d61Var;
            pq0Var2.d = this.B;
            rq0Var.w(e70Var, d61Var, pq0Var2, pq0Var2.e);
            f(false);
        }
    }
}
