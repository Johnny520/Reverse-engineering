package p000;

import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zn1 extends kd1 implements if1, c61, aw1 {

    /* JADX INFO: renamed from: T */
    public static final ca2 f13961T = new ca2();

    /* JADX INFO: renamed from: U */
    public static final z51 f13962U = new z51();

    /* JADX INFO: renamed from: V */
    public static final float[] f13963V = hf1.m2155a();

    /* JADX INFO: renamed from: W */
    public static final wn1 f13964W = new wn1();

    /* JADX INFO: renamed from: X */
    public static final j51 f13965X = new j51(7);

    /* JADX INFO: renamed from: A */
    public in0 f13966A;

    /* JADX INFO: renamed from: B */
    public e70 f13967B;

    /* JADX INFO: renamed from: C */
    public d61 f13968C;

    /* JADX INFO: renamed from: E */
    public of1 f13970E;

    /* JADX INFO: renamed from: F */
    public gk1 f13971F;

    /* JADX INFO: renamed from: H */
    public float f13973H;

    /* JADX INFO: renamed from: I */
    public qk1 f13974I;

    /* JADX INFO: renamed from: J */
    public z51 f13975J;

    /* JADX INFO: renamed from: L */
    public boolean f13977L;

    /* JADX INFO: renamed from: M */
    public boolean f13978M;

    /* JADX INFO: renamed from: N */
    public pq0 f13979N;

    /* JADX INFO: renamed from: O */
    public InterfaceC0627qp f13980O;

    /* JADX INFO: renamed from: P */
    public C0800v7 f13981P;

    /* JADX INFO: renamed from: R */
    public boolean f13983R;

    /* JADX INFO: renamed from: S */
    public yv1 f13984S;

    /* JADX INFO: renamed from: v */
    public final r61 f13985v;

    /* JADX INFO: renamed from: w */
    public zn1 f13986w;

    /* JADX INFO: renamed from: x */
    public zn1 f13987x;

    /* JADX INFO: renamed from: y */
    public boolean f13988y;

    /* JADX INFO: renamed from: z */
    public boolean f13989z;

    /* JADX INFO: renamed from: D */
    public float f13969D = 0.8f;

    /* JADX INFO: renamed from: G */
    public long f13972G = 0;

    /* JADX INFO: renamed from: K */
    public eq2 f13976K = sp0.f10267h;

    /* JADX INFO: renamed from: Q */
    public final yn1 f13982Q = new yn1(this, 1);

    public zn1(r61 r61Var) {
        this.f13985v = r61Var;
        this.f13967B = r61Var.f9365F;
        this.f13968C = r61Var.f9366G;
    }

    /* JADX INFO: renamed from: n1 */
    public static zn1 m6442n1(c61 c61Var) {
        zn1 zn1Var;
        nd1 nd1Var = c61Var instanceof nd1 ? (nd1) c61Var : null;
        if (nd1Var != null && (zn1Var = nd1Var.f7110h.f6572v) != null) {
            return zn1Var;
        }
        c61Var.getClass();
        return (zn1) c61Var;
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: A0 */
    public final of1 mo2630A0() {
        of1 of1Var = this.f13970E;
        if (of1Var != null) {
            return of1Var;
        }
        C0676s.m4653l("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // p000.aw1
    /* JADX INFO: renamed from: B */
    public final boolean mo298B() {
        return (this.f13984S == null || this.f13988y || !this.f13985v.m4350H()) ? false : true;
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: B0 */
    public final kd1 mo2631B0() {
        return this.f13987x;
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: C */
    public final void mo641C(float[] fArr) {
        zv1 zv1VarM5471a = u61.m5471a(this.f13985v);
        zn1 zn1VarM6442n1 = m6442n1(s11.m4665J(this));
        m6472q1(zn1VarM6442n1, fArr);
        if (zv1VarM5471a instanceof ViewTreeObserverOnGlobalLayoutListenerC0045b7) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1VarM5471a).m476t(fArr);
            return;
        }
        long jMo647c = zn1VarM6442n1.mo647c(0L);
        if ((9223372034707292159L & jMo647c) != 9205357640488583168L) {
            hf1.m2160f(fArr, Float.intBitsToFloat((int) (jMo647c >> 32)), Float.intBitsToFloat((int) (jMo647c & 4294967295L)));
        }
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: C0 */
    public final long mo2632C0() {
        return this.f13972G;
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: D */
    public final long mo642D(c61 c61Var, long j) {
        if (c61Var instanceof nd1) {
            nd1 nd1Var = (nd1) c61Var;
            nd1Var.f7110h.f6572v.m6459b1();
            return nd1Var.mo642D(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        zn1 zn1VarM6442n1 = m6442n1(c61Var);
        zn1VarM6442n1.m6459b1();
        zn1 zn1VarM6449O0 = m6449O0(zn1VarM6442n1);
        while (zn1VarM6442n1 != zn1VarM6449O0) {
            yv1 yv1Var = zn1VarM6442n1.f13984S;
            if (yv1Var != null) {
                sq0 sq0Var = (sq0) yv1Var;
                float[] fArrM4968b = sq0Var.m4968b();
                if (!sq0Var.f10304z) {
                    j = hf1.m2156b(j, fArrM4968b);
                }
            }
            j = tp0.m5342D(j, zn1VarM6442n1.f13972G);
            zn1VarM6442n1 = zn1VarM6442n1.f13987x;
            zn1VarM6442n1.getClass();
        }
        return m6444I0(zn1VarM6449O0, j);
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: G0 */
    public final void mo2635G0() {
        mo2506f0(this.f13972G, this.f13973H, this.f13966A);
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: H */
    public final void mo643H(c61 c61Var, float[] fArr) {
        zn1 zn1VarM6442n1 = m6442n1(c61Var);
        zn1VarM6442n1.m6459b1();
        zn1 zn1VarM6449O0 = m6449O0(zn1VarM6442n1);
        hf1.m2158d(fArr);
        zn1VarM6442n1.m6472q1(zn1VarM6449O0, fArr);
        m6471p1(zn1VarM6449O0, fArr);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m6443H0(zn1 zn1Var, qk1 qk1Var, boolean z) {
        if (zn1Var == this) {
            return;
        }
        zn1 zn1Var2 = this.f13987x;
        if (zn1Var2 != null) {
            zn1Var2.m6443H0(zn1Var, qk1Var, z);
        }
        long j = this.f13972G;
        float f = (int) (j >> 32);
        qk1Var.f9013a -= f;
        qk1Var.f9015c -= f;
        float f2 = (int) (j & 4294967295L);
        qk1Var.f9014b -= f2;
        qk1Var.f9016d -= f2;
        yv1 yv1Var = this.f13984S;
        if (yv1Var != null) {
            sq0 sq0Var = (sq0) yv1Var;
            float[] fArrM4967a = sq0Var.m4967a();
            if (!sq0Var.f10304z) {
                if (fArrM4967a == null) {
                    qk1Var.f9013a = 0.0f;
                    qk1Var.f9014b = 0.0f;
                    qk1Var.f9015c = 0.0f;
                    qk1Var.f9016d = 0.0f;
                } else {
                    hf1.m2157c(fArrM4967a, qk1Var);
                }
            }
            if (this.f13989z && z) {
                long j2 = this.f10440j;
                qk1Var.m4193a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final long m6444I0(zn1 zn1Var, long j) {
        if (zn1Var == this) {
            return j;
        }
        zn1 zn1Var2 = this.f13987x;
        return (zn1Var2 == null || t11.m5086l(zn1Var, zn1Var2)) ? m6450P0(j) : m6450P0(zn1Var2.m6444I0(zn1Var, j));
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: J */
    public final o62 mo644J(c61 c61Var, boolean z) {
        if (!mo2843S0().f10770u) {
            kz0.m2764b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!c61Var.mo653w()) {
            kz0.m2764b("LayoutCoordinates " + c61Var + " is not attached!");
        }
        zn1 zn1VarM6442n1 = m6442n1(c61Var);
        zn1VarM6442n1.m6459b1();
        zn1 zn1VarM6449O0 = m6449O0(zn1VarM6442n1);
        qk1 qk1Var = this.f13974I;
        if (qk1Var == null) {
            qk1Var = new qk1();
            this.f13974I = qk1Var;
        }
        qk1Var.f9013a = 0.0f;
        qk1Var.f9014b = 0.0f;
        qk1Var.f9015c = (int) (c61Var.mo645L() >> 32);
        qk1Var.f9016d = (int) (c61Var.mo645L() & 4294967295L);
        while (zn1VarM6442n1 != zn1VarM6449O0) {
            zn1VarM6442n1.m6466j1(qk1Var, z, false);
            if (qk1Var.m4194b()) {
                return o62.f7535e;
            }
            zn1VarM6442n1 = zn1VarM6442n1.f13987x;
            zn1VarM6442n1.getClass();
        }
        m6443H0(zn1VarM6449O0, qk1Var, z);
        return new o62(qk1Var.f9013a, qk1Var.f9014b, qk1Var.f9015c, qk1Var.f9016d);
    }

    /* JADX INFO: renamed from: J0 */
    public final long m6445J0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - mo3071b0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - mo3069Z();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    /* JADX INFO: renamed from: K0 */
    public final float m6446K0(long j, long j2) {
        if (mo3071b0() >= Float.intBitsToFloat((int) (j2 >> 32)) && mo3069Z() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM6445J0 = m6445J0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM6445J0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM6445J0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - mo3071b0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - mo3069Z()))) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: L */
    public final long mo645L() {
        return this.f10440j;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m6447L0(InterfaceC0627qp interfaceC0627qp, pq0 pq0Var) {
        yv1 yv1Var = this.f13984S;
        if (yv1Var == null) {
            long j = this.f13972G;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            interfaceC0627qp.mo1518g(f, f2);
            m6448M0(interfaceC0627qp, pq0Var);
            interfaceC0627qp.mo1518g(-f, -f2);
            return;
        }
        sq0 sq0Var = (sq0) yv1Var;
        C0702sp c0702sp = sq0Var.f10298t;
        sq0Var.m4973g();
        sq0Var.f10284A = sq0Var.f10286h.f8454a.mo4574F() > 0.0f;
        C0043b5 c0043b5 = c0702sp.f10257i;
        c0043b5.m411B(interfaceC0627qp);
        c0043b5.f563j = pq0Var;
        xe1.m6133m(c0702sp, sq0Var.f10286h);
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: M */
    public final long mo646M(long j) {
        if (!mo2843S0().f10770u) {
            kz0.m2764b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m6459b1();
        while (this != null) {
            r61 r61Var = this.f13985v;
            if (this == ((zn1) r61Var.f9372M.f12034e) && !r61Var.f9386j) {
                long jM4062b = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61Var)).getRectManager().m4062b(r61Var);
                if (!z01.m6371a(jM4062b, 9223372034707292159L)) {
                    return tp0.m5342D(j, jM4062b);
                }
            }
            yv1 yv1Var = this.f13984S;
            if (yv1Var != null) {
                sq0 sq0Var = (sq0) yv1Var;
                float[] fArrM4968b = sq0Var.m4968b();
                if (!sq0Var.f10304z) {
                    j = hf1.m2156b(j, fArrM4968b);
                }
            }
            j = tp0.m5342D(j, this.f13972G);
            this = this.f13987x;
        }
        return j;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m6448M0(InterfaceC0627qp interfaceC0627qp, pq0 pq0Var) {
        zn1 zn1Var;
        InterfaceC0627qp interfaceC0627qp2;
        pq0 pq0Var2;
        th1 th1VarM6452T0 = m6452T0(4);
        if (th1VarM6452T0 == null) {
            mo2844h1(interfaceC0627qp, pq0Var);
            return;
        }
        r61 r61Var = this.f13985v;
        r61Var.getClass();
        t61 sharedDrawScope = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61Var)).getSharedDrawScope();
        long jM4715q0 = s11.m4715q0(this.f10440j);
        sharedDrawScope.getClass();
        zk1 zk1Var = null;
        while (th1VarM6452T0 != null) {
            if (th1VarM6452T0 instanceof mc0) {
                zn1Var = this;
                interfaceC0627qp2 = interfaceC0627qp;
                pq0Var2 = pq0Var;
                sharedDrawScope.m5126c(interfaceC0627qp2, jM4715q0, zn1Var, (mc0) th1VarM6452T0, pq0Var2);
            } else {
                zn1Var = this;
                interfaceC0627qp2 = interfaceC0627qp;
                pq0Var2 = pq0Var;
                if ((th1VarM6452T0.f10759j & 4) != 0 && (th1VarM6452T0 instanceof u60)) {
                    int i = 0;
                    for (th1 th1Var = ((u60) th1VarM6452T0).f11116w; th1Var != null; th1Var = th1Var.f10762m) {
                        if ((th1Var.f10759j & 4) != 0) {
                            i++;
                            if (i == 1) {
                                th1VarM6452T0 = th1Var;
                            } else {
                                if (zk1Var == null) {
                                    zk1Var = new zk1(new th1[16]);
                                }
                                if (th1VarM6452T0 != null) {
                                    zk1Var.m6423b(th1VarM6452T0);
                                    th1VarM6452T0 = null;
                                }
                                zk1Var.m6423b(th1Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                interfaceC0627qp = interfaceC0627qp2;
                this = zn1Var;
                pq0Var = pq0Var2;
            }
            th1VarM6452T0 = sp0.m4952m(zk1Var);
            interfaceC0627qp = interfaceC0627qp2;
            this = zn1Var;
            pq0Var = pq0Var2;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public abstract void mo2841N0();

    /* JADX INFO: renamed from: O0 */
    public final zn1 m6449O0(zn1 zn1Var) {
        r61 r61VarM4389u = zn1Var.f13985v;
        r61 r61Var = this.f13985v;
        if (r61VarM4389u == r61Var) {
            th1 th1VarMo2843S0 = zn1Var.mo2843S0();
            th1 th1VarMo2843S02 = mo2843S0();
            if (!th1VarMo2843S02.f10757h.f10770u) {
                kz0.m2764b("visitLocalAncestors called on an unattached node");
            }
            for (th1 th1Var = th1VarMo2843S02.f10757h.f10761l; th1Var != null; th1Var = th1Var.f10761l) {
                if ((th1Var.f10759j & 2) != 0 && th1Var == th1VarMo2843S0) {
                    return zn1Var;
                }
            }
            return this;
        }
        while (r61VarM4389u.f9399w > r61Var.f9399w) {
            r61VarM4389u = r61VarM4389u.m4389u();
            r61VarM4389u.getClass();
        }
        r61 r61VarM4389u2 = r61Var;
        while (r61VarM4389u2.f9399w > r61VarM4389u.f9399w) {
            r61VarM4389u2 = r61VarM4389u2.m4389u();
            r61VarM4389u2.getClass();
        }
        while (r61VarM4389u != r61VarM4389u2) {
            r61VarM4389u = r61VarM4389u.m4389u();
            r61VarM4389u2 = r61VarM4389u2.m4389u();
            if (r61VarM4389u == null || r61VarM4389u2 == null) {
                C0676s.m4651j("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (r61VarM4389u2 != r61Var) {
            if (r61VarM4389u != zn1Var.f13985v) {
                return (qz0) r61VarM4389u.f9372M.f12033d;
            }
            return zn1Var;
        }
        return this;
    }

    /* JADX INFO: renamed from: P0 */
    public final long m6450P0(long j) {
        long j2 = this.f13972G;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        yv1 yv1Var = this.f13984S;
        if (yv1Var != null) {
            sq0 sq0Var = (sq0) yv1Var;
            float[] fArrM4967a = sq0Var.m4967a();
            if (fArrM4967a == null) {
                return 9187343241974906880L;
            }
            if (!sq0Var.f10304z) {
                return hf1.m2156b(jFloatToRawIntBits, fArrM4967a);
            }
        }
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: Q0 */
    public abstract md1 mo2842Q0();

    /* JADX INFO: renamed from: R0 */
    public final long m6451R0() {
        return this.f13967B.mo694d0(this.f13985v.f9367H.mo3036g());
    }

    /* JADX INFO: renamed from: S0 */
    public abstract th1 mo2843S0();

    /* JADX INFO: renamed from: T0 */
    public final th1 m6452T0(int i) {
        boolean zM244g = ao1.m244g(i);
        th1 th1VarMo2843S0 = mo2843S0();
        if (!zM244g && (th1VarMo2843S0 = th1VarMo2843S0.f10761l) == null) {
            return null;
        }
        for (th1 th1VarM6453U0 = m6453U0(zM244g); th1VarM6453U0 != null && (th1VarM6453U0.f10760k & i) != 0; th1VarM6453U0 = th1VarM6453U0.f10762m) {
            if ((th1VarM6453U0.f10759j & i) != 0) {
                return th1VarM6453U0;
            }
            if (th1VarM6453U0 == th1VarMo2843S0) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: U0 */
    public final th1 m6453U0(boolean z) {
        th1 th1VarMo2843S0;
        vn1 vn1Var = this.f13985v.f9372M;
        if (((zn1) vn1Var.f12034e) == this) {
            return (th1) vn1Var.f12036g;
        }
        zn1 zn1Var = this.f13987x;
        if (!z) {
            if (zn1Var != null) {
                return zn1Var.mo2843S0();
            }
            return null;
        }
        if (zn1Var == null || (th1VarMo2843S0 = zn1Var.mo2843S0()) == null) {
            return null;
        }
        return th1VarMo2843S0.f10762m;
    }

    /* JADX INFO: renamed from: V0 */
    public final void m6454V0(th1 th1Var, xn1 xn1Var, long j, xs0 xs0Var, int i, boolean z) {
        if (th1Var == null) {
            mo4301Y0(xn1Var, j, xs0Var, i, z);
            return;
        }
        if (!xn1Var.mo2446i(th1Var)) {
            m6454V0(AbstractC0570p7.m3772h(th1Var, xn1Var.mo2445d()), xn1Var, j, xs0Var, i, z);
            return;
        }
        int i2 = xs0Var.f13157j;
        lk1 lk1Var = xs0Var.f13155h;
        xs0Var.m6176b(i2 + 1, lk1Var.f6164b);
        xs0Var.f13157j++;
        lk1Var.m2925a(th1Var);
        xs0Var.f13156i.m848a(qp0.m4245a(-1.0f, z, false));
        m6454V0(AbstractC0570p7.m3772h(th1Var, xn1Var.mo2445d()), xn1Var, j, xs0Var, i, z);
        xs0Var.f13157j = i2;
    }

    /* JADX INFO: renamed from: W0 */
    public final void m6455W0(th1 th1Var, xn1 xn1Var, long j, xs0 xs0Var, int i, boolean z, float f) {
        if (th1Var == null) {
            mo4301Y0(xn1Var, j, xs0Var, i, z);
            return;
        }
        if (!xn1Var.mo2446i(th1Var)) {
            m6455W0(AbstractC0570p7.m3772h(th1Var, xn1Var.mo2445d()), xn1Var, j, xs0Var, i, z, f);
            return;
        }
        int i2 = xs0Var.f13157j;
        lk1 lk1Var = xs0Var.f13155h;
        xs0Var.m6176b(i2 + 1, lk1Var.f6164b);
        xs0Var.f13157j++;
        lk1Var.m2925a(th1Var);
        xs0Var.f13156i.m848a(qp0.m4245a(f, z, false));
        m6464g1(AbstractC0570p7.m3772h(th1Var, xn1Var.mo2445d()), xn1Var, j, xs0Var, i, z, f, true);
        xs0Var.f13157j = i2;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m6456X0(xn1 xn1Var, long j, xs0 xs0Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        th1 th1VarM6452T0 = m6452T0(xn1Var.mo2445d());
        if (!m6475t1(j)) {
            if (i == 1) {
                float fM6446K0 = m6446K0(j, m6451R0());
                if ((Float.floatToRawIntBits(fM6446K0) & Integer.MAX_VALUE) < 2139095040) {
                    if (xs0Var.f13157j != xs0Var.f13155h.f6164b - 1) {
                        if (xe1.m6129k(xs0Var.m6175a(), qp0.m4245a(fM6446K0, false, false)) <= 0) {
                            return;
                        }
                    }
                    m6455W0(th1VarM6452T0, xn1Var, j, xs0Var, i, false, fM6446K0);
                    return;
                }
                return;
            }
            return;
        }
        if (th1VarM6452T0 == null) {
            mo4301Y0(xn1Var, j, xs0Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < mo3071b0() && fIntBitsToFloat2 < mo3069Z()) {
            m6454V0(th1VarM6452T0, xn1Var, j, xs0Var, i, z);
            return;
        }
        float fM6446K02 = i == 1 ? m6446K0(j, m6451R0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fM6446K02) & Integer.MAX_VALUE) < 2139095040) {
            if (xs0Var.f13157j != xs0Var.f13155h.f6164b - 1) {
                z2 = z;
                if (xe1.m6129k(xs0Var.m6175a(), qp0.m4245a(fM6446K02, z2, false)) > 0) {
                }
                m6464g1(th1VarM6452T0, xn1Var, j, xs0Var, i, z2, fM6446K02, z3);
            }
            z2 = z;
            z3 = true;
            m6464g1(th1VarM6452T0, xn1Var, j, xs0Var, i, z2, fM6446K02, z3);
        }
        z2 = z;
        z3 = false;
        m6464g1(th1VarM6452T0, xn1Var, j, xs0Var, i, z2, fM6446K02, z3);
    }

    /* JADX INFO: renamed from: Y0 */
    public void mo4301Y0(xn1 xn1Var, long j, xs0 xs0Var, int i, boolean z) {
        zn1 zn1Var = this.f13986w;
        if (zn1Var != null) {
            zn1Var.m6456X0(xn1Var, zn1Var.m6450P0(j), xs0Var, i, z);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m6457Z0() {
        yv1 yv1Var = this.f13984S;
        if (yv1Var != null) {
            ((sq0) yv1Var).m4969c();
            return;
        }
        zn1 zn1Var = this.f13987x;
        if (zn1Var != null) {
            zn1Var.m6457Z0();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m6458a1() {
        if (this.f13984S != null && this.f13969D <= 0.0f) {
            return true;
        }
        zn1 zn1Var = this.f13987x;
        if (zn1Var != null) {
            return zn1Var.m6458a1();
        }
        return false;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: b */
    public final float mo693b() {
        return this.f13985v.f9365F.mo693b();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m6459b1() {
        this.f13985v.f9373N.m5628b();
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: c */
    public final long mo647c(long j) {
        if (!mo2843S0().f10770u) {
            kz0.m2764b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(this.f13985v)).m477u(mo646M(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [th1] */
    /* JADX WARN: Type inference failed for: r7v7, types: [th1] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [zk1] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: c1 */
    public final void m6460c1() {
        th1 th1VarMo2843S0;
        boolean zM244g = ao1.m244g(128);
        th1 th1VarM6453U0 = m6453U0(zM244g);
        if (th1VarM6453U0 == null || (th1VarM6453U0.f10757h.f10760k & 128) == 0) {
            return;
        }
        vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
        in0 in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
        vr2 vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
        try {
            if (!zM244g) {
                th1VarMo2843S0 = mo2843S0().f10761l;
                if (th1VarMo2843S0 == null) {
                }
            }
            th1VarMo2843S0 = mo2843S0();
            for (th1 th1VarM6453U02 = m6453U0(zM244g); th1VarM6453U02 != null; th1VarM6453U02 = th1VarM6453U02.f10762m) {
                if ((th1VarM6453U02.f10760k & 128) == 0) {
                    break;
                }
                if ((th1VarM6453U02.f10759j & 128) != 0) {
                    ?? M4952m = th1VarM6453U02;
                    ?? zk1Var = 0;
                    while (M4952m != 0) {
                        if (M4952m instanceof qf1) {
                            ((qf1) M4952m).mo99c(this.f10440j);
                        } else if ((M4952m.f10759j & 128) != 0 && (M4952m instanceof u60)) {
                            th1 th1Var = ((u60) M4952m).f11116w;
                            int i = 0;
                            M4952m = M4952m;
                            zk1Var = zk1Var;
                            while (th1Var != null) {
                                if ((th1Var.f10759j & 128) != 0) {
                                    i++;
                                    zk1Var = zk1Var;
                                    if (i == 1) {
                                        M4952m = th1Var;
                                    } else {
                                        if (zk1Var == 0) {
                                            zk1Var = new zk1(new th1[16]);
                                        }
                                        if (M4952m != 0) {
                                            zk1Var.m6423b(M4952m);
                                            M4952m = 0;
                                        }
                                        zk1Var.m6423b(th1Var);
                                    }
                                }
                                th1Var = th1Var.f10762m;
                                M4952m = M4952m;
                                zk1Var = zk1Var;
                            }
                            if (i == 1) {
                            }
                        }
                        M4952m = sp0.m4952m(zk1Var);
                    }
                }
                if (th1VarM6453U02 == th1VarMo2843S0) {
                    break;
                }
            }
        } finally {
            AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [th1] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [th1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [zk1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: d1 */
    public final void m6461d1() {
        boolean zM244g = ao1.m244g(4194304);
        th1 th1VarMo2843S0 = mo2843S0();
        if (!zM244g && (th1VarMo2843S0 = th1VarMo2843S0.f10761l) == null) {
            return;
        }
        for (th1 th1VarM6453U0 = m6453U0(zM244g); th1VarM6453U0 != null && (th1VarM6453U0.f10760k & 4194304) != 0; th1VarM6453U0 = th1VarM6453U0.f10762m) {
            if ((th1VarM6453U0.f10759j & 4194304) != 0) {
                ?? M4952m = th1VarM6453U0;
                ?? zk1Var = 0;
                while (M4952m != 0) {
                    if (M4952m instanceof a61) {
                        ((a61) M4952m).mo100q(this);
                    } else if ((M4952m.f10759j & 4194304) != 0 && (M4952m instanceof u60)) {
                        th1 th1Var = ((u60) M4952m).f11116w;
                        int i = 0;
                        M4952m = M4952m;
                        zk1Var = zk1Var;
                        while (th1Var != null) {
                            if ((th1Var.f10759j & 4194304) != 0) {
                                i++;
                                zk1Var = zk1Var;
                                if (i == 1) {
                                    M4952m = th1Var;
                                } else {
                                    if (zk1Var == 0) {
                                        zk1Var = new zk1(new th1[16]);
                                    }
                                    if (M4952m != 0) {
                                        zk1Var.m6423b(M4952m);
                                        M4952m = 0;
                                    }
                                    zk1Var.m6423b(th1Var);
                                }
                            }
                            th1Var = th1Var.f10762m;
                            M4952m = M4952m;
                            zk1Var = zk1Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M4952m = sp0.m4952m(zk1Var);
                }
            }
            if (th1VarM6453U0 == th1VarMo2843S0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final void m6462e1() {
        this.f13988y = true;
        this.f13982Q.mo6a();
        m6467k1();
        if (z01.m6371a(this.f13972G, 0L)) {
            return;
        }
        this.f13985v.m4356N(this);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m6463f1() {
        boolean zM244g = ao1.m244g(1048576);
        th1 th1VarM6453U0 = m6453U0(zM244g);
        if (th1VarM6453U0 == null || (th1VarM6453U0.f10757h.f10760k & 1048576) == 0) {
            return;
        }
        th1 th1VarMo2843S0 = mo2843S0();
        if (!zM244g && (th1VarMo2843S0 = th1VarMo2843S0.f10761l) == null) {
            return;
        }
        for (th1 th1VarM6453U02 = m6453U0(zM244g); th1VarM6453U02 != null && (th1VarM6453U02.f10760k & 1048576) != 0; th1VarM6453U02 = th1VarM6453U02.f10762m) {
            if ((th1VarM6453U02.f10759j & 1048576) != 0) {
                th1 th1VarM4952m = th1VarM6453U02;
                zk1 zk1Var = null;
                while (th1VarM4952m != null) {
                    if ((th1VarM4952m.f10759j & 1048576) != 0 && (th1VarM4952m instanceof u60)) {
                        int i = 0;
                        for (th1 th1Var = ((u60) th1VarM4952m).f11116w; th1Var != null; th1Var = th1Var.f10762m) {
                            if ((th1Var.f10759j & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    th1VarM4952m = th1Var;
                                } else {
                                    if (zk1Var == null) {
                                        zk1Var = new zk1(new th1[16]);
                                    }
                                    if (th1VarM4952m != null) {
                                        zk1Var.m6423b(th1VarM4952m);
                                        th1VarM4952m = null;
                                    }
                                    zk1Var.m6423b(th1Var);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    th1VarM4952m = sp0.m4952m(zk1Var);
                }
            }
            if (th1VarM6453U02 == th1VarMo2843S0) {
                return;
            }
        }
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: g */
    public final long mo648g(long j) {
        if (!mo2843S0().f10770u) {
            kz0.m2764b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        c61 c61VarM4665J = s11.m4665J(this);
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = (ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(this.f13985v);
        viewTreeObserverOnGlobalLayoutListenerC0045b7.m457D();
        return mo642D(c61VarM4665J, rs1.m4611d(hf1.m2156b(j, viewTreeObserverOnGlobalLayoutListenerC0045b7.f685l0), c61VarM4665J.mo646M(0L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d0 A[PHI: r4
  0x01d0: PHI (r4v12 ??) = (r4v1 ??), (r4v1 ??), (r4v14 ??) binds: [B:55:0x019a, B:57:0x019e, B:71:0x01c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [th1] */
    /* JADX WARN: Type inference failed for: r3v18, types: [th1] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12, types: [zk1] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [zk1] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX INFO: renamed from: g1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6464g1(th1 th1Var, xn1 xn1Var, long j, xs0 xs0Var, int i, boolean z, float f, boolean z2) {
        ?? M4952m;
        if (th1Var == null) {
            mo4301Y0(xn1Var, j, xs0Var, i, z);
            return;
        }
        if (!xn1Var.mo2446i(th1Var)) {
            m6464g1(AbstractC0570p7.m3772h(th1Var, xn1Var.mo2445d()), xn1Var, j, xs0Var, i, z, f, z2);
            return;
        }
        int i2 = i;
        boolean z3 = z;
        char c = 3;
        if (i2 == 3 || i2 == 4) {
            ?? r3 = th1Var;
            ?? zk1Var = 0;
            while (true) {
                if (r3 == 0) {
                    break;
                }
                int i3 = 0;
                if (r3 instanceof r12) {
                    long jMo300s = ((r12) r3).mo300s();
                    int i4 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i4);
                    r61 r61Var = this.f13985v;
                    d61 d61Var = r61Var.f9366G;
                    int i5 = x23.f12781b;
                    long j2 = Long.MIN_VALUE & jMo300s;
                    d61 d61Var2 = d61.f1885h;
                    if (fIntBitsToFloat >= (-((j2 == 0 || d61Var == d61Var2) ? jx2.m2593c(jMo300s, 0) : jx2.m2593c(jMo300s, 2)))) {
                        if (Float.intBitsToFloat(i4) < mo3071b0() + ((j2 == 0 || r61Var.f9366G == d61Var2) ? jx2.m2593c(jMo300s, 2) : jx2.m2593c(jMo300s, 0))) {
                            int i6 = (int) (j & 4294967295L);
                            float fIntBitsToFloat2 = Float.intBitsToFloat(i6);
                            int i7 = x23.f12781b;
                            if (fIntBitsToFloat2 >= (-jx2.m2593c(jMo300s, 1))) {
                                if (Float.intBitsToFloat(i6) < jx2.m2593c(jMo300s, 3) + mo3069Z()) {
                                    ck1 ck1Var = xs0Var.f13156i;
                                    lk1 lk1Var = xs0Var.f13155h;
                                    int i8 = xs0Var.f13157j;
                                    int i9 = lk1Var.f6164b;
                                    if (i8 == i9 - 1) {
                                        xs0Var.m6176b(i8 + 1, i9);
                                        xs0Var.f13157j++;
                                        lk1Var.m2925a(th1Var);
                                        ck1Var.m848a(qp0.m4245a(0.0f, z3, true));
                                        m6464g1(AbstractC0570p7.m3772h(th1Var, xn1Var.mo2445d()), xn1Var, j, xs0Var, i2, z3, f, z2);
                                        xs0Var.f13157j = i8;
                                        return;
                                    }
                                    long jM6175a = xs0Var.m6175a();
                                    int i10 = xs0Var.f13157j;
                                    if (!xe1.m6096N(jM6175a)) {
                                        if (xe1.m6149z(jM6175a) > 0.0f) {
                                            int i11 = xs0Var.f13157j;
                                            xs0Var.m6176b(i11 + 1, lk1Var.f6164b);
                                            xs0Var.f13157j++;
                                            lk1Var.m2925a(th1Var);
                                            ck1Var.m848a(qp0.m4245a(0.0f, z3, true));
                                            m6464g1(AbstractC0570p7.m3772h(th1Var, xn1Var.mo2445d()), xn1Var, j, xs0Var, i, z3, f, z2);
                                            xs0Var.f13157j = i11;
                                            return;
                                        }
                                        return;
                                    }
                                    int i12 = lk1Var.f6164b;
                                    int i13 = i12 - 1;
                                    xs0Var.f13157j = i13;
                                    xs0Var.m6176b(i12, lk1Var.f6164b);
                                    xs0Var.f13157j++;
                                    lk1Var.m2925a(th1Var);
                                    ck1Var.m848a(qp0.m4245a(0.0f, z3, true));
                                    m6464g1(AbstractC0570p7.m3772h(th1Var, xn1Var.mo2445d()), xn1Var, j, xs0Var, i, z3, f, z2);
                                    xs0Var.f13157j = i13;
                                    if (xe1.m6149z(xs0Var.m6175a()) < 0.0f) {
                                        xs0Var.m6176b(i10 + 1, xs0Var.f13157j + 1);
                                    }
                                    xs0Var.f13157j = i10;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    char c2 = c;
                    if ((r3.f10759j & 16) == 0 || !(r3 instanceof u60)) {
                        M4952m = sp0.m4952m(zk1Var);
                    } else {
                        th1 th1Var2 = ((u60) r3).f11116w;
                        M4952m = r3;
                        zk1Var = zk1Var;
                        while (th1Var2 != null) {
                            if ((th1Var2.f10759j & 16) != 0) {
                                i3++;
                                zk1Var = zk1Var;
                                if (i3 == 1) {
                                    M4952m = th1Var2;
                                } else {
                                    if (zk1Var == 0) {
                                        zk1Var = new zk1(new th1[16]);
                                    }
                                    if (M4952m != 0) {
                                        zk1Var.m6423b(M4952m);
                                        M4952m = 0;
                                    }
                                    zk1Var.m6423b(th1Var2);
                                }
                            }
                            th1Var2 = th1Var2.f10762m;
                            M4952m = M4952m;
                            zk1Var = zk1Var;
                        }
                        if (i3 == 1) {
                        }
                    }
                    i2 = i;
                    z3 = z;
                    c = c2;
                    r3 = M4952m;
                    zk1Var = zk1Var;
                }
            }
        }
        if (z2) {
            m6455W0(th1Var, xn1Var, j, xs0Var, i, z, f);
        } else {
            m6469m1(th1Var, xn1Var, j, xs0Var, i, z, f);
        }
    }

    @Override // p000.m11
    public final d61 getLayoutDirection() {
        return this.f13985v.f9366G;
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: h */
    public final long mo649h(long j) {
        long jMo646M = mo646M(j);
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = (ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(this.f13985v);
        viewTreeObserverOnGlobalLayoutListenerC0045b7.m457D();
        return hf1.m2156b(jMo646M, viewTreeObserverOnGlobalLayoutListenerC0045b7.f683k0);
    }

    /* JADX INFO: renamed from: h1 */
    public abstract void mo2844h1(InterfaceC0627qp interfaceC0627qp, pq0 pq0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [th1] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [th1] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [zk1] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // p000.sz1, p000.if1
    /* JADX INFO: renamed from: i */
    public final Object mo2342i() {
        r61 r61Var = this.f13985v;
        if (!r61Var.f9372M.m5731m(64)) {
            return null;
        }
        mo2843S0();
        Object objMo566q0 = null;
        for (th1 th1Var = (qx2) r61Var.f9372M.f12035f; th1Var != null; th1Var = th1Var.f10761l) {
            if ((th1Var.f10759j & 64) != 0) {
                ?? M4952m = th1Var;
                ?? zk1Var = 0;
                while (M4952m != 0) {
                    if (M4952m instanceof ox1) {
                        objMo566q0 = ((ox1) M4952m).mo566q0(objMo566q0);
                    } else if ((M4952m.f10759j & 64) != 0 && (M4952m instanceof u60)) {
                        th1 th1Var2 = ((u60) M4952m).f11116w;
                        int i = 0;
                        M4952m = M4952m;
                        zk1Var = zk1Var;
                        while (th1Var2 != null) {
                            if ((th1Var2.f10759j & 64) != 0) {
                                i++;
                                zk1Var = zk1Var;
                                if (i == 1) {
                                    M4952m = th1Var2;
                                } else {
                                    if (zk1Var == 0) {
                                        zk1Var = new zk1(new th1[16]);
                                    }
                                    if (M4952m != 0) {
                                        zk1Var.m6423b(M4952m);
                                        M4952m = 0;
                                    }
                                    zk1Var.m6423b(th1Var2);
                                }
                            }
                            th1Var2 = th1Var2.f10762m;
                            M4952m = M4952m;
                            zk1Var = zk1Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M4952m = sp0.m4952m(zk1Var);
                }
            }
        }
        return objMo566q0;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m6465i1(long j, float f, in0 in0Var) {
        m6473r1(in0Var, false);
        boolean zM6371a = z01.m6371a(this.f13972G, j);
        r61 r61Var = this.f13985v;
        if (!zM6371a) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61Var)).m467N(-4.0f);
            this.f13972G = j;
            yv1 yv1Var = this.f13984S;
            if (yv1Var != null) {
                ((sq0) yv1Var).m4970d(j);
            } else {
                zn1 zn1Var = this.f13987x;
                if (zn1Var != null) {
                    zn1Var.m6457Z0();
                }
            }
            r61Var.m4356N(this);
            kd1.m2629E0(this);
            zv1 zv1Var = r61Var.f9397u;
            if (zv1Var != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1Var).m482z(r61Var);
            }
        }
        this.f13973H = f;
        if (this == ((zn1) r61Var.f9372M.f12034e)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61Var)).getRectManager().m4064f(r61Var);
        }
        if (this.f5468r) {
            return;
        }
        m2639o0(mo2630A0());
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: j */
    public final c61 mo650j() {
        boolean z = mo2843S0().f10770u;
        r61 r61Var = this.f13985v;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (r61 r61VarM4389u = r61Var; r61VarM4389u != null; r61VarM4389u = r61VarM4389u.m4389u()) {
                sb.append("\n|");
                sb.append(r61VarM4389u);
                sb.append(" isAttached=");
                sb.append(r61VarM4389u.m4350H());
                sb.append(" modifier=");
                sb.append(r61VarM4389u.f9377R);
                sb.append(" tail=");
                sb.append(mo2843S0());
            }
            kz0.m2764b(sb.toString());
        }
        m6459b1();
        return ((zn1) r61Var.f9372M.f12034e).f13987x;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX INFO: renamed from: j1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6466j1(qk1 qk1Var, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        yv1 yv1Var = this.f13984S;
        if (yv1Var != null) {
            if (this.f13989z) {
                if (z2) {
                    long jM6451R0 = m6451R0();
                    float f = qk1Var.f9013a;
                    float f2 = qk1Var.f9014b;
                    if (qk1Var.f9015c >= 0.0f) {
                        long j = this.f10440j;
                        if (f > ((int) (j >> 32)) || qk1Var.f9016d < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM6451R0 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM6451R0 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (qk1Var.f9015c - qk1Var.f9013a)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (qk1Var.f9016d - qk1Var.f9014b)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                        long j2 = this.f10440j;
                        float f7 = (int) (j2 >> 32);
                        int i = (int) (jM6451R0 >> 32);
                        float f8 = (int) (j2 & 4294967295L);
                        int i2 = (int) (jM6451R0 & 4294967295L);
                        qk1Var.m4193a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                    }
                } else if (z) {
                    long j3 = this.f10440j;
                    qk1Var.m4193a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (qk1Var.m4194b()) {
                    return;
                }
            }
            sq0 sq0Var = (sq0) yv1Var;
            float[] fArrM4968b = sq0Var.m4968b();
            if (!sq0Var.f10304z) {
                if (fArrM4968b == null) {
                    qk1Var.f9013a = 0.0f;
                    qk1Var.f9014b = 0.0f;
                    qk1Var.f9015c = 0.0f;
                    qk1Var.f9016d = 0.0f;
                } else {
                    hf1.m2157c(fArrM4968b, qk1Var);
                }
            }
        }
        long j4 = this.f13972G;
        float f9 = (int) (j4 >> 32);
        qk1Var.f9013a += f9;
        qk1Var.f9015c += f9;
        float f10 = (int) (j4 & 4294967295L);
        qk1Var.f9014b += f10;
        qk1Var.f9016d += f10;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m6467k1() {
        if (this.f13984S != null) {
            m6473r1(null, false);
            this.f13985v.m4362U(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [th1] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [th1] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [zk1] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [zk1] */
    /* JADX INFO: renamed from: l1 */
    public final void m6468l1(of1 of1Var) {
        zn1 zn1Var;
        of1 of1Var2 = this.f13970E;
        if (of1Var != of1Var2) {
            this.f13970E = of1Var;
            r61 r61Var = this.f13985v;
            int i = 0;
            if (of1Var2 == null || of1Var.mo108e() != of1Var2.mo108e() || of1Var.mo106c() != of1Var2.mo106c()) {
                int iMo108e = of1Var.mo108e();
                int iMo106c = of1Var.mo106c();
                yv1 yv1Var = this.f13984S;
                if (yv1Var != null) {
                    ((sq0) yv1Var).m4971e((((long) iMo108e) << 32) | (((long) iMo106c) & 4294967295L));
                } else if (r61Var.m4351I() && (zn1Var = this.f13987x) != null) {
                    zn1Var.m6457Z0();
                }
                m5046g0((((long) iMo106c) & 4294967295L) | (((long) iMo108e) << 32));
                if (this.f13966A != null) {
                    m6474s1(false);
                }
                boolean zM244g = ao1.m244g(4);
                th1 th1VarMo2843S0 = mo2843S0();
                if (zM244g || (th1VarMo2843S0 = th1VarMo2843S0.f10761l) != null) {
                    for (th1 th1VarM6453U0 = m6453U0(zM244g); th1VarM6453U0 != null && (th1VarM6453U0.f10760k & 4) != 0; th1VarM6453U0 = th1VarM6453U0.f10762m) {
                        if ((th1VarM6453U0.f10759j & 4) != 0) {
                            ?? M4952m = th1VarM6453U0;
                            ?? zk1Var = 0;
                            while (M4952m != 0) {
                                if (M4952m instanceof mc0) {
                                    ((mc0) M4952m).mo3057r0();
                                } else if ((M4952m.f10759j & 4) != 0 && (M4952m instanceof u60)) {
                                    th1 th1Var = ((u60) M4952m).f11116w;
                                    int i2 = 0;
                                    M4952m = M4952m;
                                    zk1Var = zk1Var;
                                    while (th1Var != null) {
                                        if ((th1Var.f10759j & 4) != 0) {
                                            i2++;
                                            zk1Var = zk1Var;
                                            if (i2 == 1) {
                                                M4952m = th1Var;
                                            } else {
                                                if (zk1Var == 0) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (M4952m != 0) {
                                                    zk1Var.m6423b(M4952m);
                                                    M4952m = 0;
                                                }
                                                zk1Var.m6423b(th1Var);
                                            }
                                        }
                                        th1Var = th1Var.f10762m;
                                        M4952m = M4952m;
                                        zk1Var = zk1Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M4952m = sp0.m4952m(zk1Var);
                            }
                        }
                        if (th1VarM6453U0 == th1VarMo2843S0) {
                            break;
                        }
                    }
                }
                zv1 zv1Var = r61Var.f9397u;
                if (zv1Var != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1Var).m482z(r61Var);
                }
                r61Var.m4356N(this);
            }
            gk1 gk1Var = this.f13971F;
            if ((gk1Var == null || gk1Var.f3556e == 0) && of1Var.mo104a().isEmpty()) {
                return;
            }
            gk1 gk1Var2 = this.f13971F;
            Map mapMo104a = of1Var.mo104a();
            if (gk1Var2 != null && gk1Var2.f3556e == mapMo104a.size()) {
                Object[] objArr = gk1Var2.f3553b;
                int[] iArr = gk1Var2.f3554c;
                long[] jArr = gk1Var2.f3552a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapMo104a.get((du0) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            r61Var.f9373N.f11795p.f6604D.m4743f();
            gk1 gk1Var3 = this.f13971F;
            if (gk1Var3 == null) {
                gk1 gk1Var4 = hs1.f4124a;
                gk1Var3 = new gk1();
                this.f13971F = gk1Var3;
            }
            gk1Var3.m1930a();
            for (Map.Entry entry : of1Var.mo104a().entrySet()) {
                gk1Var3.m1936g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: m */
    public final float mo697m() {
        return this.f13985v.f9365F.mo697m();
    }

    /* JADX INFO: renamed from: m1 */
    public final void m6469m1(th1 th1Var, xn1 xn1Var, long j, xs0 xs0Var, int i, boolean z, float f) {
        int i2;
        if (th1Var == null) {
            mo4301Y0(xn1Var, j, xs0Var, i, z);
            return;
        }
        if (!xn1Var.mo2446i(th1Var)) {
            m6469m1(AbstractC0570p7.m3772h(th1Var, xn1Var.mo2445d()), xn1Var, j, xs0Var, i, z, f);
            return;
        }
        if (!xn1Var.mo2444b(th1Var)) {
            m6464g1(AbstractC0570p7.m3772h(th1Var, xn1Var.mo2445d()), xn1Var, j, xs0Var, i, z, f, false);
            return;
        }
        ck1 ck1Var = xs0Var.f13156i;
        lk1 lk1Var = xs0Var.f13155h;
        int i3 = xs0Var.f13157j;
        int i4 = lk1Var.f6164b;
        if (i3 != i4 - 1) {
            long jM6175a = xs0Var.m6175a();
            int i5 = xs0Var.f13157j;
            int i6 = lk1Var.f6164b;
            int i7 = i6 - 1;
            xs0Var.f13157j = i7;
            xs0Var.m6176b(i6, lk1Var.f6164b);
            xs0Var.f13157j++;
            lk1Var.m2925a(th1Var);
            ck1Var.m848a(qp0.m4245a(f, z, false));
            m6464g1(AbstractC0570p7.m3772h(th1Var, xn1Var.mo2445d()), xn1Var, j, xs0Var, i, z, f, false);
            xs0Var.f13157j = i7;
            long jM6175a2 = xs0Var.m6175a();
            if (xs0Var.f13157j + 1 >= lk1Var.f6164b - 1 || xe1.m6129k(jM6175a, jM6175a2) <= 0) {
                xs0Var.m6176b(xs0Var.f13157j + 1, lk1Var.f6164b);
            } else {
                int i8 = i5 + 1;
                boolean zM6096N = xe1.m6096N(jM6175a2);
                int i9 = xs0Var.f13157j;
                xs0Var.m6176b(i8, zM6096N ? i9 + 2 : i9 + 1);
            }
            xs0Var.f13157j = i5;
            return;
        }
        int i10 = i3 + 1;
        xs0Var.m6176b(i10, i4);
        xs0Var.f13157j++;
        lk1Var.m2925a(th1Var);
        ck1Var.m848a(qp0.m4245a(f, z, false));
        m6464g1(AbstractC0570p7.m3772h(th1Var, xn1Var.mo2445d()), xn1Var, j, xs0Var, i, z, f, false);
        xs0Var.f13157j = i3;
        if (i10 == lk1Var.f6164b - 1 || xe1.m6096N(xs0Var.m6175a())) {
            int i11 = xs0Var.f13157j;
            int i12 = i11 + 1;
            lk1Var.m2935k(i12);
            if (i12 < 0 || i12 >= (i2 = ck1Var.f1599b)) {
                C0676s.m4646d("Index must be between 0 and size");
                return;
            }
            long[] jArr = ck1Var.f1598a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                AbstractC0460mg.m3087b0(jArr, jArr, i12, i11 + 2, i2);
            }
            ck1Var.f1599b--;
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final o62 m6470o1() {
        if (mo2843S0().f10770u) {
            c61 c61VarM4665J = s11.m4665J(this);
            qk1 qk1Var = this.f13974I;
            if (qk1Var == null) {
                qk1Var = new qk1();
                this.f13974I = qk1Var;
            }
            long jM6445J0 = m6445J0(m6451R0());
            int i = (int) (jM6445J0 >> 32);
            qk1Var.f9013a = -Float.intBitsToFloat(i);
            int i2 = (int) (jM6445J0 & 4294967295L);
            qk1Var.f9014b = -Float.intBitsToFloat(i2);
            qk1Var.f9015c = Float.intBitsToFloat(i) + mo3071b0();
            qk1Var.f9016d = Float.intBitsToFloat(i2) + mo3069Z();
            while (this != c61VarM4665J) {
                this.m6466j1(qk1Var, false, true);
                if (!qk1Var.m4194b()) {
                    this = this.f13987x;
                    this.getClass();
                }
            }
            return new o62(qk1Var.f9013a, qk1Var.f9014b, qk1Var.f9015c, qk1Var.f9016d);
        }
        return o62.f7535e;
    }

    /* JADX INFO: renamed from: p1 */
    public final void m6471p1(zn1 zn1Var, float[] fArr) {
        float[] fArrM4967a;
        if (t11.m5086l(zn1Var, this)) {
            return;
        }
        zn1 zn1Var2 = this.f13987x;
        zn1Var2.getClass();
        zn1Var2.m6471p1(zn1Var, fArr);
        if (!z01.m6371a(this.f13972G, 0L)) {
            float[] fArr2 = f13963V;
            hf1.m2158d(fArr2);
            long j = this.f13972G;
            hf1.m2160f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            hf1.m2159e(fArr, fArr2);
        }
        yv1 yv1Var = this.f13984S;
        if (yv1Var == null || (fArrM4967a = ((sq0) yv1Var).m4967a()) == null) {
            return;
        }
        hf1.m2159e(fArr, fArrM4967a);
    }

    /* JADX INFO: renamed from: q1 */
    public final void m6472q1(zn1 zn1Var, float[] fArr) {
        while (!this.equals(zn1Var)) {
            yv1 yv1Var = this.f13984S;
            if (yv1Var != null) {
                hf1.m2159e(fArr, ((sq0) yv1Var).m4968b());
            }
            if (!z01.m6371a(this.f13972G, 0L)) {
                float[] fArr2 = f13963V;
                hf1.m2158d(fArr2);
                hf1.m2160f(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                hf1.m2159e(fArr, fArr2);
            }
            this = this.f13987x;
            this.getClass();
        }
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: r */
    public final long mo651r(c61 c61Var, long j) {
        return mo642D(c61Var, j);
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: r0 */
    public final kd1 mo2641r0() {
        return this.f13986w;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m6473r1(in0 in0Var, boolean z) {
        zv1 zv1Var;
        zk1 zk1Var;
        Reference referencePoll;
        C0800v7 c0800v7;
        zk1 zk1Var2;
        Reference referencePoll2;
        Object obj;
        int i = 0;
        r61 r61Var = this.f13985v;
        boolean z2 = (!z && this.f13966A == in0Var && t11.m5086l(this.f13967B, r61Var.f9365F) && this.f13968C == r61Var.f9366G) ? false : true;
        this.f13967B = r61Var.f9365F;
        this.f13968C = r61Var.f9366G;
        boolean zM4350H = r61Var.m4350H();
        yn1 yn1Var = this.f13982Q;
        if (!zM4350H || in0Var == null) {
            this.f13966A = null;
            yv1 yv1Var = this.f13984S;
            if (yv1Var != null) {
                sq0 sq0Var = (sq0) yv1Var;
                if (!AbstractC0570p7.m3789y(sq0Var.m4968b())) {
                    r61Var.m4356N(this);
                }
                sq0Var.f10289k = null;
                sq0Var.f10290l = null;
                sq0Var.f10292n = true;
                sq0Var.m4972f(false);
                nq0 nq0Var = sq0Var.f10287i;
                if (nq0Var != null) {
                    nq0Var.mo706a(sq0Var.f10286h);
                    ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = sq0Var.f10288j;
                    dq1 dq1Var = viewTreeObserverOnGlobalLayoutListenerC0045b7.f637F0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) dq1Var.f2148j;
                        zk1Var = (zk1) dq1Var.f2147i;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            zk1Var.m6431j(referencePoll);
                        }
                    } while (referencePoll != null);
                    zk1Var.m6423b(new WeakReference(sq0Var, (ReferenceQueue) dq1Var.f2148j));
                    viewTreeObserverOnGlobalLayoutListenerC0045b7.f648L.m2934j(sq0Var);
                }
                this.f13984S = null;
                r61Var.f9376Q = true;
                yn1Var.mo6a();
                if (mo2843S0().f10770u && r61Var.m4351I() && (zv1Var = r61Var.f9397u) != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1Var).m482z(r61Var);
                }
            }
            this.f13983R = false;
            return;
        }
        this.f13966A = in0Var;
        if (this.f13984S != null) {
            if (z2) {
                m6474s1(true);
                return;
            }
            return;
        }
        zv1 zv1VarM5471a = u61.m5471a(r61Var);
        C0800v7 c0800v72 = this.f13981P;
        if (c0800v72 == null) {
            C0800v7 c0800v73 = new C0800v7(2, this, new yn1(this, i));
            this.f13981P = c0800v73;
            c0800v7 = c0800v73;
        } else {
            c0800v7 = c0800v72;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b72 = (ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1VarM5471a;
        dq1 dq1Var2 = viewTreeObserverOnGlobalLayoutListenerC0045b72.f637F0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) dq1Var2.f2148j;
            zk1Var2 = (zk1) dq1Var2.f2147i;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                zk1Var2.m6431j(referencePoll2);
            }
        } while (referencePoll2 != null);
        while (true) {
            int i2 = zk1Var2.f13936j;
            if (i2 == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) zk1Var2.m6432k(i2 - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        yv1 sq0Var2 = (yv1) obj;
        if (sq0Var2 != null) {
            sq0 sq0Var3 = (sq0) sq0Var2;
            nq0 nq0Var2 = sq0Var3.f10287i;
            if (nq0Var2 == null) {
                throw vi0.m5686e("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!sq0Var3.f10286h.f8472s) {
                kz0.m2763a("layer should have been released before reuse");
            }
            sq0Var3.f10286h = nq0Var2.mo707b();
            sq0Var3.f10292n = false;
            sq0Var3.f10289k = c0800v7;
            sq0Var3.f10290l = yn1Var;
            sq0Var3.f10302x = false;
            sq0Var3.f10303y = false;
            sq0Var3.f10304z = true;
            hf1.m2158d(sq0Var3.f10293o);
            float[] fArr = sq0Var3.f10294p;
            if (fArr != null) {
                hf1.m2158d(fArr);
            }
            sq0Var3.f10300v = m33.f6464b;
            sq0Var3.f10284A = false;
            sq0Var3.f10291m = 9223372034707292159L;
            sq0Var3.f10301w = null;
            sq0Var3.f10299u = 0;
        } else {
            sq0Var2 = new sq0(viewTreeObserverOnGlobalLayoutListenerC0045b72.getGraphicsContext().mo707b(), viewTreeObserverOnGlobalLayoutListenerC0045b72.getGraphicsContext(), viewTreeObserverOnGlobalLayoutListenerC0045b72, c0800v7, yn1Var);
        }
        sq0 sq0Var4 = (sq0) sq0Var2;
        sq0Var4.m4971e(this.f10440j);
        sq0Var4.m4970d(this.f13972G);
        this.f13984S = sq0Var2;
        m6474s1(true);
        r61Var.f9376Q = true;
        yn1Var.mo6a();
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: s */
    public final long mo652s(long j) {
        if (!mo2843S0().f10770u) {
            kz0.m2764b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return mo642D(s11.m4665J(this), ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(this.f13985v)).m461H(j));
    }

    /* JADX INFO: renamed from: s1 */
    public final void m6474s1(boolean z) {
        char c;
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7;
        boolean z2;
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b72;
        zv1 zv1Var;
        xm0 xm0Var;
        xm0 xm0Var2;
        yv1 yv1Var = this.f13984S;
        in0 in0Var = this.f13966A;
        if (yv1Var == null) {
            if (in0Var == null) {
                return;
            }
            kz0.m2764b("null layer with a non-null layerBlock");
            return;
        }
        if (in0Var == null) {
            throw vi0.m5686e("updateLayerParameters requires a non-null layerBlock");
        }
        ca2 ca2Var = f13961T;
        ca2Var.m718a();
        r61 r61Var = this.f13985v;
        ca2Var.f1277x = r61Var.f9365F;
        ca2Var.f1278y = r61Var.f9366G;
        ca2Var.f1276w = s11.m4715q0(this.f10440j);
        ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61Var)).getSnapshotObserver().f1051a.m5436c(this, oq0.f7776n, new C0723t6(9, in0Var, this));
        z51 z51Var = this.f13975J;
        if (z51Var == null) {
            z51Var = new z51();
            this.f13975J = z51Var;
        }
        z51 z51Var2 = f13962U;
        z51Var2.getClass();
        z51Var2.f13724a = z51Var.f13724a;
        z51Var2.f13725b = z51Var.f13725b;
        z51Var2.f13726c = z51Var.f13726c;
        z51Var2.f13727d = z51Var.f13727d;
        z51Var2.f13728e = z51Var.f13728e;
        z51Var2.f13729f = z51Var.f13729f;
        z51Var2.f13730g = z51Var.f13730g;
        z51Var2.f13731h = z51Var.f13731h;
        float f = ca2Var.f1262i;
        z51Var.f13724a = f;
        z51Var.f13725b = ca2Var.f1263j;
        z51Var.f13726c = ca2Var.f1265l;
        z51Var.f13727d = ca2Var.f1269p;
        z51Var.f13728e = ca2Var.f1270q;
        z51Var.f13729f = ca2Var.f1271r;
        z51Var.f13730g = ca2Var.f1272s;
        long j = ca2Var.f1273t;
        z51Var.f13731h = j;
        sq0 sq0Var = (sq0) yv1Var;
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b73 = sq0Var.f10288j;
        int i = ca2Var.f1261h | sq0Var.f10299u;
        sq0Var.f10297s = ca2Var.f1278y;
        sq0Var.f10296r = ca2Var.f1277x;
        int i2 = i & 4096;
        if (i2 != 0) {
            sq0Var.f10300v = j;
        }
        if ((i & 1) != 0) {
            rq0 rq0Var = sq0Var.f10286h.f8454a;
            if (rq0Var.mo4585d() != f) {
                rq0Var.mo4594m(f);
            }
        }
        if ((i & 2) != 0) {
            pq0 pq0Var = sq0Var.f10286h;
            float f2 = ca2Var.f1263j;
            rq0 rq0Var2 = pq0Var.f8454a;
            if (rq0Var2.mo4576H() != f2) {
                rq0Var2.mo4569A(f2);
            }
        }
        if ((i & 4) != 0) {
            pq0 pq0Var2 = sq0Var.f10286h;
            float f3 = ca2Var.f1264k;
            rq0 rq0Var3 = pq0Var2.f8454a;
            if (rq0Var3.mo4582a() != f3) {
                rq0Var3.mo4584c(f3);
            }
        }
        if ((i & 8) != 0) {
            rq0 rq0Var4 = sq0Var.f10286h.f8454a;
            if (rq0Var4.mo4598q() != 0.0f) {
                rq0Var4.mo4599r();
            }
        }
        if ((i & 16) != 0) {
            pq0 pq0Var3 = sq0Var.f10286h;
            float f4 = ca2Var.f1265l;
            rq0 rq0Var5 = pq0Var3.f8454a;
            if (rq0Var5.mo4587f() != f4) {
                rq0Var5.mo4589h(f4);
            }
        }
        if ((i & 32) != 0) {
            pq0 pq0Var4 = sq0Var.f10286h;
            float f5 = ca2Var.f1266m;
            rq0 rq0Var6 = pq0Var4.f8454a;
            if (rq0Var6.mo4574F() != f5) {
                rq0Var6.mo4586e(f5);
                pq0Var4.f8460g = true;
                pq0Var4.m3943a();
            }
            if (ca2Var.f1266m > 0.0f && !sq0Var.f10284A && (xm0Var2 = sq0Var.f10290l) != null) {
                xm0Var2.mo6a();
            }
        }
        if ((i & 64) != 0) {
            pq0 pq0Var5 = sq0Var.f10286h;
            long j2 = ca2Var.f1267n;
            rq0 rq0Var7 = pq0Var5.f8454a;
            if (!C0363ju.m2566c(j2, rq0Var7.mo4581M())) {
                rq0Var7.mo4591j(j2);
            }
        }
        if ((i & 128) != 0) {
            pq0 pq0Var6 = sq0Var.f10286h;
            long j3 = ca2Var.f1268o;
            rq0 rq0Var8 = pq0Var6.f8454a;
            if (!C0363ju.m2566c(j3, rq0Var8.mo4590i())) {
                rq0Var8.mo4607z(j3);
            }
        }
        if ((i & 1024) != 0) {
            pq0 pq0Var7 = sq0Var.f10286h;
            float f6 = ca2Var.f1271r;
            rq0 rq0Var9 = pq0Var7.f8454a;
            if (rq0Var9.mo4578J() != f6) {
                rq0Var9.mo4588g(f6);
            }
        }
        if ((i & 256) != 0) {
            pq0 pq0Var8 = sq0Var.f10286h;
            float f7 = ca2Var.f1269p;
            rq0 rq0Var10 = pq0Var8.f8454a;
            if (rq0Var10.mo4603v() != f7) {
                rq0Var10.mo4577I(f7);
            }
        }
        if ((i & AIChatConfig.DefaultMaxTokens) != 0) {
            pq0 pq0Var9 = sq0Var.f10286h;
            float f8 = ca2Var.f1270q;
            rq0 rq0Var11 = pq0Var9.f8454a;
            if (rq0Var11.mo4572D() != f8) {
                rq0Var11.mo4583b(f8);
            }
        }
        if ((i & 2048) != 0) {
            pq0 pq0Var10 = sq0Var.f10286h;
            float f9 = ca2Var.f1272s;
            rq0 rq0Var12 = pq0Var10.f8454a;
            if (rq0Var12.mo4596o() != f9) {
                rq0Var12.mo4573E(f9);
            }
        }
        if (i2 != 0) {
            c = ' ';
            boolean zM3029a = m33.m3029a(sq0Var.f10300v, m33.f6464b);
            pq0 pq0Var11 = sq0Var.f10286h;
            if (!zM3029a) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sq0Var.f10300v & 4294967295L)) * ((int) (sq0Var.f10291m & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sq0Var.f10300v >> 32)) * ((int) (sq0Var.f10291m >> 32)))) << 32);
                if (!rs1.m4609b(pq0Var11.f8475v, jFloatToRawIntBits)) {
                    pq0Var11.f8475v = jFloatToRawIntBits;
                    pq0Var11.f8454a.mo4580L(jFloatToRawIntBits);
                }
            } else if (!rs1.m4609b(pq0Var11.f8475v, 9205357640488583168L)) {
                pq0Var11.f8475v = 9205357640488583168L;
                pq0Var11.f8454a.mo4580L(9205357640488583168L);
            }
        } else {
            c = ' ';
        }
        if ((i & 16384) != 0) {
            pq0 pq0Var12 = sq0Var.f10286h;
            boolean z3 = ca2Var.f1275v;
            if (pq0Var12.f8476w != z3) {
                pq0Var12.f8476w = z3;
                pq0Var12.f8460g = true;
                pq0Var12.m3943a();
            }
        }
        if ((131072 & i) != 0) {
            rq0 rq0Var13 = sq0Var.f10286h.f8454a;
        }
        if ((262144 & i) != 0) {
            rq0 rq0Var14 = sq0Var.f10286h.f8454a;
            if (!t11.m5086l(rq0Var14.mo4605x(), null)) {
                rq0Var14.mo4593l();
            }
        }
        if ((524288 & i) != 0) {
            pq0 pq0Var13 = sq0Var.f10286h;
            int i3 = ca2Var.f1279z;
            rq0 rq0Var15 = pq0Var13.f8454a;
            if (rq0Var15.mo4579K() != i3) {
                rq0Var15.mo4595n(i3);
            }
        }
        if ((32768 & i) != 0) {
            rq0 rq0Var16 = sq0Var.f10286h.f8454a;
            if (rq0Var16.mo4602u() != 0) {
                rq0Var16.mo4606y(0);
            }
        }
        if ((i & 7963) != 0) {
            sq0Var.f10302x = true;
            sq0Var.f10303y = true;
        }
        if (t11.m5086l(sq0Var.f10301w, ca2Var.f1260A)) {
            viewTreeObserverOnGlobalLayoutListenerC0045b7 = viewTreeObserverOnGlobalLayoutListenerC0045b73;
            z2 = false;
        } else {
            AbstractC0731te abstractC0731te = ca2Var.f1260A;
            sq0Var.f10301w = abstractC0731te;
            if (abstractC0731te == null) {
                viewTreeObserverOnGlobalLayoutListenerC0045b7 = viewTreeObserverOnGlobalLayoutListenerC0045b73;
            } else {
                pq0 pq0Var14 = sq0Var.f10286h;
                if (abstractC0731te instanceof tv1) {
                    o62 o62Var = ((tv1) abstractC0731te).f10974j;
                    float f10 = o62Var.f7536a;
                    float f11 = o62Var.f7537b;
                    viewTreeObserverOnGlobalLayoutListenerC0045b7 = viewTreeObserverOnGlobalLayoutListenerC0045b73;
                    pq0Var14.m3947e((((long) Float.floatToRawIntBits(f10)) << c) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), (((long) Float.floatToRawIntBits(o62Var.f7538c - f10)) << c) | (((long) Float.floatToRawIntBits(o62Var.f7539d - f11)) & 4294967295L), 0.0f);
                } else {
                    viewTreeObserverOnGlobalLayoutListenerC0045b7 = viewTreeObserverOnGlobalLayoutListenerC0045b73;
                    if (abstractC0731te instanceof sv1) {
                        C0915y9 c0915y9 = ((sv1) abstractC0731te).f10384j;
                        pq0Var14.f8464k = null;
                        pq0Var14.f8462i = 9205357640488583168L;
                        pq0Var14.f8461h = 0L;
                        pq0Var14.f8463j = 0.0f;
                        pq0Var14.f8460g = true;
                        pq0Var14.f8467n = false;
                        pq0Var14.f8465l = c0915y9;
                        pq0Var14.m3943a();
                    } else {
                        if (!(abstractC0731te instanceof uv1)) {
                            c80.m675s();
                            return;
                        }
                        uv1 uv1Var = (uv1) abstractC0731te;
                        C0915y9 c0915y92 = uv1Var.f11515k;
                        if (c0915y92 != null) {
                            pq0Var14.f8464k = null;
                            pq0Var14.f8462i = 9205357640488583168L;
                            pq0Var14.f8461h = 0L;
                            pq0Var14.f8463j = 0.0f;
                            pq0Var14.f8460g = true;
                            pq0Var14.f8467n = false;
                            pq0Var14.f8465l = c0915y92;
                            pq0Var14.m3943a();
                        } else {
                            db2 db2Var = uv1Var.f11514j;
                            float f12 = db2Var.f1957b;
                            float f13 = db2Var.f1956a;
                            pq0Var14.m3947e((((long) Float.floatToRawIntBits(f13)) << c) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L), (((long) Float.floatToRawIntBits(db2Var.f1958c - f13)) << c) | (((long) Float.floatToRawIntBits(db2Var.f1959d - f12)) & 4294967295L), Float.intBitsToFloat((int) (db2Var.f1963h >> c)));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((abstractC0731te instanceof sv1) || ((abstractC0731te instanceof uv1) && !AbstractC0570p7.m3790z(((uv1) abstractC0731te).f11514j))) && (xm0Var = sq0Var.f10290l) != null)) {
                    xm0Var.mo6a();
                }
            }
            z2 = true;
        }
        sq0Var.f10299u = ca2Var.f1261h;
        if (i != 0 || z2) {
            ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC0045b7.getParent();
            if (parent != null) {
                viewTreeObserverOnGlobalLayoutListenerC0045b72 = viewTreeObserverOnGlobalLayoutListenerC0045b7;
                parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC0045b72, viewTreeObserverOnGlobalLayoutListenerC0045b72);
            } else {
                viewTreeObserverOnGlobalLayoutListenerC0045b72 = viewTreeObserverOnGlobalLayoutListenerC0045b7;
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC0045b7.m452p()) {
                viewTreeObserverOnGlobalLayoutListenerC0045b72.m467N(0.0f);
            }
        }
        boolean z4 = this.f13989z;
        this.f13989z = ca2Var.f1275v;
        this.f13969D = ca2Var.f1264k;
        boolean z5 = z51Var2.f13724a == z51Var.f13724a && z51Var2.f13725b == z51Var.f13725b && z51Var2.f13726c == z51Var.f13726c && z51Var2.f13727d == z51Var.f13727d && z51Var2.f13728e == z51Var.f13728e && z51Var2.f13729f == z51Var.f13729f && z51Var2.f13730g == z51Var.f13730g && m33.m3029a(z51Var2.f13731h, z51Var.f13731h);
        if (z && ((!z5 || z4 != this.f13989z) && (zv1Var = r61Var.f9397u) != null)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1Var).m482z(r61Var);
        }
        if (z5) {
            return;
        }
        r61Var.m4356N(this);
        if (r61Var.f9382W > 0) {
            ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b74 = (ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61Var);
            dq1 dq1Var = viewTreeObserverOnGlobalLayoutListenerC0045b74.f675g0.f5494e;
            dq1Var.getClass();
            if (r61Var.f9382W > 0) {
                ((zk1) dq1Var.f2147i).m6423b(r61Var);
                r61Var.f9381V = true;
            }
            viewTreeObserverOnGlobalLayoutListenerC0045b74.m460G(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x017d  */
    /* JADX INFO: renamed from: t1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m6475t1(long j) {
        boolean z;
        boolean z2;
        boolean zM6100R;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        yv1 yv1Var = this.f13984S;
        if (yv1Var == null || !this.f13989z) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        pq0 pq0Var = ((sq0) yv1Var).f10286h;
        if (pq0Var.f8476w) {
            AbstractC0731te abstractC0731teM3946d = pq0Var.m3946d();
            if (abstractC0731teM3946d instanceof tv1) {
                o62 o62Var = ((tv1) abstractC0731teM3946d).f10974j;
                if (o62Var.f7536a > fIntBitsToFloat || fIntBitsToFloat >= o62Var.f7538c || o62Var.f7537b > fIntBitsToFloat2 || fIntBitsToFloat2 >= o62Var.f7539d) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (abstractC0731teM3946d instanceof uv1) {
                db2 db2Var = ((uv1) abstractC0731teM3946d).f11514j;
                float f = db2Var.f1958c;
                float f2 = db2Var.f1957b;
                float f3 = db2Var.f1959d;
                float f4 = db2Var.f1956a;
                long j2 = db2Var.f1961f;
                long j3 = db2Var.f1963h;
                z = false;
                z2 = true;
                long j4 = db2Var.f1962g;
                long j5 = db2Var.f1960e;
                if (fIntBitsToFloat >= f4 && fIntBitsToFloat < f && fIntBitsToFloat2 >= f2 && fIntBitsToFloat2 < f3) {
                    int i = (int) (j5 >> 32);
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + fIntBitsToFloat3 <= f - f4) {
                        int i3 = (int) (j3 >> 32);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i3);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + fIntBitsToFloat4 <= f - f4) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f3 - f2) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f3 - f2) {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                    float fIntBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                    float fIntBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                    zM6100R = (fIntBitsToFloat >= fIntBitsToFloat5 || fIntBitsToFloat2 >= fIntBitsToFloat6) ? (fIntBitsToFloat >= fIntBitsToFloat12 || fIntBitsToFloat2 <= fIntBitsToFloat11) ? (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 >= fIntBitsToFloat8) ? (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) ? z2 : xe1.m6100R(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, db2Var.f1962g) : xe1.m6100R(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, db2Var.f1961f) : xe1.m6100R(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, db2Var.f1963h) : xe1.m6100R(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, db2Var.f1960e);
                                } else {
                                    C0915y9 c0915y9M117a = AbstractC0011aa.m117a();
                                    C0915y9.m6230b(c0915y9M117a, db2Var);
                                    zM6100R = xe1.m6098P(fIntBitsToFloat, fIntBitsToFloat2, c0915y9M117a);
                                }
                            }
                        }
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(abstractC0731teM3946d instanceof sv1)) {
                    c80.m675s();
                    return false;
                }
                zM6100R = xe1.m6098P(fIntBitsToFloat, fIntBitsToFloat2, ((sv1) abstractC0731teM3946d).f10384j);
            }
            zM6100R = z;
        } else {
            z = false;
            z2 = true;
        }
        return zM6100R ? z2 : z;
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: v0 */
    public final boolean mo2643v0() {
        return this.f13970E != null;
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: w */
    public final boolean mo653w() {
        return mo2843S0().f10770u;
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: w0 */
    public final r61 mo2644w0() {
        return this.f13985v;
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: t0 */
    public final c61 mo2642t0() {
        return this;
    }
}
