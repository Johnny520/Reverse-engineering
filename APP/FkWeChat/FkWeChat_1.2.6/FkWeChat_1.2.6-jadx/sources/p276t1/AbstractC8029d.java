package p276t1;

import p024b9.AbstractC1043k;
import p117i.C3058h0;
import p276t1.AbstractC8025b;
import p276t1.C8044l;

/* JADX INFO: renamed from: t1.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8029d {
    /* JADX INFO: renamed from: a */
    public static final double m30858a(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(m30872o(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    /* JADX INFO: renamed from: b */
    public static final double m30859b(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(m30874q(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC8027c m30860c(AbstractC8027c abstractC8027c, C8040i0 c8040i0, AbstractC8023a abstractC8023a) {
        if (AbstractC8025b.m30841e(abstractC8027c.m30852e(), AbstractC8025b.f26749a.m30846b())) {
            C8034f0 c8034f0 = (C8034f0) abstractC8027c;
            if (!m30863f(c8034f0.m30884B(), c8040i0)) {
                return new C8034f0(c8034f0, m30869l(m30862e(abstractC8023a.m30834b(), c8034f0.m30884B().m30932c(), c8040i0.m30932c()), c8034f0.m30883A()), c8040i0);
            }
        }
        return abstractC8027c;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ AbstractC8027c m30861d(AbstractC8027c abstractC8027c, C8040i0 c8040i0, AbstractC8023a abstractC8023a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            abstractC8023a = AbstractC8023a.f26742b.m30835a();
        }
        return m30860c(abstractC8027c, c8040i0, abstractC8023a);
    }

    /* JADX INFO: renamed from: e */
    public static final float[] m30862e(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrM30871n = m30871n(fArr, fArr2);
        float[] fArrM30871n2 = m30871n(fArr, fArr3);
        return m30869l(m30868k(fArr), m30870m(new float[]{fArrM30871n2[0] / fArrM30871n[0], fArrM30871n2[1] / fArrM30871n[1], fArrM30871n2[2] / fArrM30871n[2]}, fArr));
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m30863f(C8040i0 c8040i0, C8040i0 c8040i02) {
        if (c8040i0 == c8040i02) {
            return true;
        }
        return Math.abs(c8040i0.m30930a() - c8040i02.m30930a()) < 0.001f && Math.abs(c8040i0.m30931b() - c8040i02.m30931b()) < 0.001f;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m30864g(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(fArr[i10], fArr2[i10]) != 0 && Math.abs(fArr[i10] - fArr2[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static final C8044l m30865h(AbstractC8027c abstractC8027c, AbstractC8027c abstractC8027c2, int i10) {
        int iM30849b = abstractC8027c.m30849b();
        int iM30849b2 = abstractC8027c2.m30849b();
        if ((iM30849b | iM30849b2) < 0) {
            return m30867j(abstractC8027c, abstractC8027c2, i10);
        }
        C3058h0 c3058h0M30971a = AbstractC8045m.m30971a();
        int i11 = iM30849b | (iM30849b2 << 6) | (i10 << 12);
        Object objM11449b = c3058h0M30971a.m11449b(i11);
        if (objM11449b == null) {
            objM11449b = m30867j(abstractC8027c, abstractC8027c2, i10);
            c3058h0M30971a.m11326r(i11, objM11449b);
        }
        return (C8044l) objM11449b;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C8044l m30866i(AbstractC8027c abstractC8027c, AbstractC8027c abstractC8027c2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC8027c2 = C8043k.f26795a.m30939A();
        }
        if ((i11 & 2) != 0) {
            i10 = AbstractC8050r.f26851a.m30984b();
        }
        return m30865h(abstractC8027c, abstractC8027c2, i10);
    }

    /* JADX INFO: renamed from: j */
    public static final C8044l m30867j(AbstractC8027c abstractC8027c, AbstractC8027c abstractC8027c2, int i10) {
        if (abstractC8027c == abstractC8027c2) {
            return C8044l.f26821g.m30969c(abstractC8027c);
        }
        long jM30852e = abstractC8027c.m30852e();
        AbstractC8025b.a aVar = AbstractC8025b.f26749a;
        AbstractC1043k abstractC1043k = null;
        return (AbstractC8025b.m30841e(jM30852e, aVar.m30846b()) && AbstractC8025b.m30841e(abstractC8027c2.m30852e(), aVar.m30846b())) ? new C8044l.b((C8034f0) abstractC8027c, (C8034f0) abstractC8027c2, i10, abstractC1043k) : new C8044l(abstractC8027c, abstractC8027c2, i10, abstractC1043k);
    }

    /* JADX INFO: renamed from: k */
    public static final float[] m30868k(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f10 * f19) + (f11 * f20) + (f12 * f21);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f22;
        fArr2[1] = f20 / f22;
        fArr2[2] = f21 / f22;
        fArr2[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr2[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr2[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr2[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr2[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr2[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr2;
    }

    /* JADX INFO: renamed from: l */
    public static final float[] m30869l(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f10 = fArr[0] * fArr2[0];
        float f11 = fArr[3];
        float f12 = fArr2[1];
        float f13 = fArr[6];
        float f14 = fArr2[2];
        fArr3[0] = f10 + (f11 * f12) + (f13 * f14);
        float f15 = fArr[1];
        float f16 = fArr2[0];
        float f17 = fArr[4];
        float f18 = fArr[7];
        fArr3[1] = (f15 * f16) + (f12 * f17) + (f18 * f14);
        float f19 = fArr[2] * f16;
        float f20 = fArr[5];
        float f21 = f19 + (fArr2[1] * f20);
        float f22 = fArr[8];
        fArr3[2] = f21 + (f14 * f22);
        float f23 = fArr[0];
        float f24 = fArr2[3] * f23;
        float f25 = fArr2[4];
        float f26 = f24 + (f11 * f25);
        float f27 = fArr2[5];
        fArr3[3] = f26 + (f13 * f27);
        float f28 = fArr[1];
        float f29 = fArr2[3];
        fArr3[4] = (f28 * f29) + (f17 * f25) + (f18 * f27);
        float f30 = fArr[2];
        fArr3[5] = (f29 * f30) + (f20 * fArr2[4]) + (f27 * f22);
        float f31 = f23 * fArr2[6];
        float f32 = fArr[3];
        float f33 = fArr2[7];
        float f34 = f31 + (f32 * f33);
        float f35 = fArr2[8];
        fArr3[6] = f34 + (f13 * f35);
        float f36 = fArr2[6];
        fArr3[7] = (f28 * f36) + (fArr[4] * f33) + (f18 * f35);
        fArr3[8] = (f30 * f36) + (fArr[5] * fArr2[7]) + (f22 * f35);
        return fArr3;
    }

    /* JADX INFO: renamed from: m */
    public static final float[] m30870m(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0] * f10;
        float f12 = fArr[1];
        float f13 = fArr2[1] * f12;
        float f14 = fArr[2];
        return new float[]{f11, f13, fArr2[2] * f14, fArr2[3] * f10, fArr2[4] * f12, fArr2[5] * f14, f10 * fArr2[6], f12 * fArr2[7], f14 * fArr2[8]};
    }

    /* JADX INFO: renamed from: n */
    public static final float[] m30871n(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        fArr2[1] = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        fArr2[2] = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        return fArr2;
    }

    /* JADX INFO: renamed from: o */
    public static final double m30872o(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 * d13 ? (Math.pow(d10, 1.0d / d15) - d12) / d11 : d10 / d13;
    }

    /* JADX INFO: renamed from: p */
    public static final double m30873p(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 * d13 ? (Math.pow(d10 - d15, 1.0d / d17) - d12) / d11 : (d10 - d16) / d13;
    }

    /* JADX INFO: renamed from: q */
    public static final double m30874q(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d15) : d13 * d10;
    }

    /* JADX INFO: renamed from: r */
    public static final double m30875r(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d17) + d15 : (d13 * d10) + d16;
    }
}
