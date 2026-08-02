package defpackage;

import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zn1 extends kd1 implements if1, c61, aw1 {
    public static final ca2 T = new ca2();
    public static final z51 U = new z51();
    public static final float[] V = hf1.a();
    public static final wn1 W = new wn1();
    public static final j51 X = new j51(7);
    public in0 A;
    public e70 B;
    public d61 C;
    public of1 E;
    public gk1 F;
    public float H;
    public qk1 I;
    public z51 J;
    public boolean L;
    public boolean M;
    public pq0 N;
    public qp O;
    public v7 P;
    public boolean R;
    public yv1 S;
    public final r61 v;
    public zn1 w;
    public zn1 x;
    public boolean y;
    public boolean z;
    public float D = 0.8f;
    public long G = 0;
    public eq2 K = sp0.h;
    public final yn1 Q = new yn1(this, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zn1(r61 r61Var) {
        this.v = r61Var;
        this.B = r61Var.F;
        this.C = r61Var.G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static zn1 n1(c61 c61Var) {
        zn1 zn1Var;
        nd1 nd1Var = c61Var instanceof nd1 ? (nd1) c61Var : null;
        if (nd1Var != null && (zn1Var = nd1Var.h.v) != null) {
            return zn1Var;
        }
        c61Var.getClass();
        return (zn1) c61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final of1 A0() {
        of1 of1Var = this.E;
        if (of1Var != null) {
            return of1Var;
        }
        s.l("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.aw1
    public final boolean B() {
        return (this.S == null || this.y || !this.v.H()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final kd1 B0() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final void C(float[] fArr) {
        zv1 zv1VarA = u61.a(this.v);
        zn1 zn1VarN1 = n1(s11.J(this));
        q1(zn1VarN1, fArr);
        if (zv1VarA instanceof b7) {
            ((b7) zv1VarA).t(fArr);
            return;
        }
        long jC = zn1VarN1.c(0L);
        if ((9223372034707292159L & jC) != 9205357640488583168L) {
            hf1.f(fArr, Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jC & 4294967295L)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final long C0() {
        return this.G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final long D(c61 c61Var, long j) {
        if (c61Var instanceof nd1) {
            nd1 nd1Var = (nd1) c61Var;
            nd1Var.h.v.b1();
            return nd1Var.D(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        zn1 zn1VarN1 = n1(c61Var);
        zn1VarN1.b1();
        zn1 zn1VarO0 = O0(zn1VarN1);
        while (zn1VarN1 != zn1VarO0) {
            yv1 yv1Var = zn1VarN1.S;
            if (yv1Var != null) {
                sq0 sq0Var = (sq0) yv1Var;
                float[] fArrB = sq0Var.b();
                if (!sq0Var.z) {
                    j = hf1.b(j, fArrB);
                }
            }
            j = tp0.D(j, zn1VarN1.G);
            zn1VarN1 = zn1VarN1.x;
            zn1VarN1.getClass();
        }
        return I0(zn1VarO0, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final void G0() {
        f0(this.G, this.H, this.A);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final void H(c61 c61Var, float[] fArr) {
        zn1 zn1VarN1 = n1(c61Var);
        zn1VarN1.b1();
        zn1 zn1VarO0 = O0(zn1VarN1);
        hf1.d(fArr);
        zn1VarN1.q1(zn1VarO0, fArr);
        p1(zn1VarO0, fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H0(zn1 zn1Var, qk1 qk1Var, boolean z) {
        if (zn1Var == this) {
            return;
        }
        zn1 zn1Var2 = this.x;
        if (zn1Var2 != null) {
            zn1Var2.H0(zn1Var, qk1Var, z);
        }
        long j = this.G;
        float f = (int) (j >> 32);
        qk1Var.a -= f;
        qk1Var.c -= f;
        float f2 = (int) (j & 4294967295L);
        qk1Var.b -= f2;
        qk1Var.d -= f2;
        yv1 yv1Var = this.S;
        if (yv1Var != null) {
            sq0 sq0Var = (sq0) yv1Var;
            float[] fArrA = sq0Var.a();
            if (!sq0Var.z) {
                if (fArrA == null) {
                    qk1Var.a = 0.0f;
                    qk1Var.b = 0.0f;
                    qk1Var.c = 0.0f;
                    qk1Var.d = 0.0f;
                } else {
                    hf1.c(fArrA, qk1Var);
                }
            }
            if (this.z && z) {
                long j2 = this.j;
                qk1Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long I0(zn1 zn1Var, long j) {
        if (zn1Var == this) {
            return j;
        }
        zn1 zn1Var2 = this.x;
        return (zn1Var2 == null || t11.l(zn1Var, zn1Var2)) ? P0(j) : P0(zn1Var2.I0(zn1Var, j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final o62 J(c61 c61Var, boolean z) {
        if (!S0().u) {
            kz0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!c61Var.w()) {
            kz0.b("LayoutCoordinates " + c61Var + " is not attached!");
        }
        zn1 zn1VarN1 = n1(c61Var);
        zn1VarN1.b1();
        zn1 zn1VarO0 = O0(zn1VarN1);
        qk1 qk1Var = this.I;
        if (qk1Var == null) {
            qk1Var = new qk1();
            this.I = qk1Var;
        }
        qk1Var.a = 0.0f;
        qk1Var.b = 0.0f;
        qk1Var.c = (int) (c61Var.L() >> 32);
        qk1Var.d = (int) (c61Var.L() & 4294967295L);
        while (zn1VarN1 != zn1VarO0) {
            zn1VarN1.j1(qk1Var, z, false);
            if (qk1Var.b()) {
                return o62.e;
            }
            zn1VarN1 = zn1VarN1.x;
            zn1VarN1.getClass();
        }
        H0(zn1VarO0, qk1Var, z);
        return new o62(qk1Var.a, qk1Var.b, qk1Var.c, qk1Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long J0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - b0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Z();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float K0(long j, long j2) {
        if (b0() >= Float.intBitsToFloat((int) (j2 >> 32)) && Z() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jJ0 = J0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jJ0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jJ0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - b0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - Z()))) & 4294967295L);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final long L() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void L0(qp qpVar, pq0 pq0Var) {
        yv1 yv1Var = this.S;
        if (yv1Var == null) {
            long j = this.G;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            qpVar.g(f, f2);
            M0(qpVar, pq0Var);
            qpVar.g(-f, -f2);
            return;
        }
        sq0 sq0Var = (sq0) yv1Var;
        sp spVar = sq0Var.t;
        sq0Var.g();
        sq0Var.A = sq0Var.h.a.F() > 0.0f;
        b5 b5Var = spVar.i;
        b5Var.B(qpVar);
        b5Var.j = pq0Var;
        xe1.m(spVar, sq0Var.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final long M(long j) {
        if (!S0().u) {
            kz0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        b1();
        while (this != null) {
            r61 r61Var = this.v;
            if (this == ((zn1) r61Var.M.e) && !r61Var.j) {
                long jB = ((b7) u61.a(r61Var)).getRectManager().b(r61Var);
                if (!z01.a(jB, 9223372034707292159L)) {
                    return tp0.D(j, jB);
                }
            }
            yv1 yv1Var = this.S;
            if (yv1Var != null) {
                sq0 sq0Var = (sq0) yv1Var;
                float[] fArrB = sq0Var.b();
                if (!sq0Var.z) {
                    j = hf1.b(j, fArrB);
                }
            }
            j = tp0.D(j, this.G);
            this = this.x;
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M0(qp qpVar, pq0 pq0Var) {
        zn1 zn1Var;
        qp qpVar2;
        pq0 pq0Var2;
        th1 th1VarT0 = T0(4);
        if (th1VarT0 == null) {
            h1(qpVar, pq0Var);
            return;
        }
        r61 r61Var = this.v;
        r61Var.getClass();
        t61 sharedDrawScope = ((b7) u61.a(r61Var)).getSharedDrawScope();
        long jQ0 = s11.q0(this.j);
        sharedDrawScope.getClass();
        zk1 zk1Var = null;
        while (th1VarT0 != null) {
            if (th1VarT0 instanceof mc0) {
                zn1Var = this;
                qpVar2 = qpVar;
                pq0Var2 = pq0Var;
                sharedDrawScope.c(qpVar2, jQ0, zn1Var, (mc0) th1VarT0, pq0Var2);
            } else {
                zn1Var = this;
                qpVar2 = qpVar;
                pq0Var2 = pq0Var;
                if ((th1VarT0.j & 4) != 0 && (th1VarT0 instanceof u60)) {
                    int i = 0;
                    for (th1 th1Var = ((u60) th1VarT0).w; th1Var != null; th1Var = th1Var.m) {
                        if ((th1Var.j & 4) != 0) {
                            i++;
                            if (i == 1) {
                                th1VarT0 = th1Var;
                            } else {
                                if (zk1Var == null) {
                                    zk1Var = new zk1(new th1[16]);
                                }
                                if (th1VarT0 != null) {
                                    zk1Var.b(th1VarT0);
                                    th1VarT0 = null;
                                }
                                zk1Var.b(th1Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                qpVar = qpVar2;
                this = zn1Var;
                pq0Var = pq0Var2;
            }
            th1VarT0 = sp0.m(zk1Var);
            qpVar = qpVar2;
            this = zn1Var;
            pq0Var = pq0Var2;
        }
    }

    public abstract void N0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final zn1 O0(zn1 zn1Var) {
        r61 r61VarU = zn1Var.v;
        r61 r61Var = this.v;
        if (r61VarU == r61Var) {
            th1 th1VarS0 = zn1Var.S0();
            th1 th1VarS02 = S0();
            if (!th1VarS02.h.u) {
                kz0.b("visitLocalAncestors called on an unattached node");
            }
            for (th1 th1Var = th1VarS02.h.l; th1Var != null; th1Var = th1Var.l) {
                if ((th1Var.j & 2) != 0 && th1Var == th1VarS0) {
                    return zn1Var;
                }
            }
            return this;
        }
        while (r61VarU.w > r61Var.w) {
            r61VarU = r61VarU.u();
            r61VarU.getClass();
        }
        r61 r61VarU2 = r61Var;
        while (r61VarU2.w > r61VarU.w) {
            r61VarU2 = r61VarU2.u();
            r61VarU2.getClass();
        }
        while (r61VarU != r61VarU2) {
            r61VarU = r61VarU.u();
            r61VarU2 = r61VarU2.u();
            if (r61VarU == null || r61VarU2 == null) {
                s.j("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (r61VarU2 != r61Var) {
            if (r61VarU != zn1Var.v) {
                return (qz0) r61VarU.M.d;
            }
            return zn1Var;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long P0(long j) {
        long j2 = this.G;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        yv1 yv1Var = this.S;
        if (yv1Var != null) {
            sq0 sq0Var = (sq0) yv1Var;
            float[] fArrA = sq0Var.a();
            if (fArrA == null) {
                return 9187343241974906880L;
            }
            if (!sq0Var.z) {
                return hf1.b(jFloatToRawIntBits, fArrA);
            }
        }
        return jFloatToRawIntBits;
    }

    public abstract md1 Q0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long R0() {
        return this.B.d0(this.v.H.g());
    }

    public abstract th1 S0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final th1 T0(int i) {
        boolean zG = ao1.g(i);
        th1 th1VarS0 = S0();
        if (!zG && (th1VarS0 = th1VarS0.l) == null) {
            return null;
        }
        for (th1 th1VarU0 = U0(zG); th1VarU0 != null && (th1VarU0.k & i) != 0; th1VarU0 = th1VarU0.m) {
            if ((th1VarU0.j & i) != 0) {
                return th1VarU0;
            }
            if (th1VarU0 == th1VarS0) {
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final th1 U0(boolean z) {
        th1 th1VarS0;
        vn1 vn1Var = this.v.M;
        if (((zn1) vn1Var.e) == this) {
            return (th1) vn1Var.g;
        }
        zn1 zn1Var = this.x;
        if (!z) {
            if (zn1Var != null) {
                return zn1Var.S0();
            }
            return null;
        }
        if (zn1Var == null || (th1VarS0 = zn1Var.S0()) == null) {
            return null;
        }
        return th1VarS0.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V0(th1 th1Var, xn1 xn1Var, long j, xs0 xs0Var, int i, boolean z) {
        if (th1Var == null) {
            Y0(xn1Var, j, xs0Var, i, z);
            return;
        }
        if (!xn1Var.i(th1Var)) {
            V0(p7.h(th1Var, xn1Var.d()), xn1Var, j, xs0Var, i, z);
            return;
        }
        int i2 = xs0Var.j;
        lk1 lk1Var = xs0Var.h;
        xs0Var.b(i2 + 1, lk1Var.b);
        xs0Var.j++;
        lk1Var.a(th1Var);
        xs0Var.i.a(qp0.a(-1.0f, z, false));
        V0(p7.h(th1Var, xn1Var.d()), xn1Var, j, xs0Var, i, z);
        xs0Var.j = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void W0(th1 th1Var, xn1 xn1Var, long j, xs0 xs0Var, int i, boolean z, float f) {
        if (th1Var == null) {
            Y0(xn1Var, j, xs0Var, i, z);
            return;
        }
        if (!xn1Var.i(th1Var)) {
            W0(p7.h(th1Var, xn1Var.d()), xn1Var, j, xs0Var, i, z, f);
            return;
        }
        int i2 = xs0Var.j;
        lk1 lk1Var = xs0Var.h;
        xs0Var.b(i2 + 1, lk1Var.b);
        xs0Var.j++;
        lk1Var.a(th1Var);
        xs0Var.i.a(qp0.a(f, z, false));
        g1(p7.h(th1Var, xn1Var.d()), xn1Var, j, xs0Var, i, z, f, true);
        xs0Var.j = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void X0(xn1 xn1Var, long j, xs0 xs0Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        th1 th1VarT0 = T0(xn1Var.d());
        if (!t1(j)) {
            if (i == 1) {
                float fK0 = K0(j, R0());
                if ((Float.floatToRawIntBits(fK0) & Integer.MAX_VALUE) < 2139095040) {
                    if (xs0Var.j != xs0Var.h.b - 1) {
                        if (xe1.k(xs0Var.a(), qp0.a(fK0, false, false)) <= 0) {
                            return;
                        }
                    }
                    W0(th1VarT0, xn1Var, j, xs0Var, i, false, fK0);
                    return;
                }
                return;
            }
            return;
        }
        if (th1VarT0 == null) {
            Y0(xn1Var, j, xs0Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < b0() && fIntBitsToFloat2 < Z()) {
            V0(th1VarT0, xn1Var, j, xs0Var, i, z);
            return;
        }
        float fK02 = i == 1 ? K0(j, R0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fK02) & Integer.MAX_VALUE) < 2139095040) {
            if (xs0Var.j != xs0Var.h.b - 1) {
                z2 = z;
                if (xe1.k(xs0Var.a(), qp0.a(fK02, z2, false)) > 0) {
                }
                g1(th1VarT0, xn1Var, j, xs0Var, i, z2, fK02, z3);
            }
            z2 = z;
            z3 = true;
            g1(th1VarT0, xn1Var, j, xs0Var, i, z2, fK02, z3);
        }
        z2 = z;
        z3 = false;
        g1(th1VarT0, xn1Var, j, xs0Var, i, z2, fK02, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void Y0(xn1 xn1Var, long j, xs0 xs0Var, int i, boolean z) {
        zn1 zn1Var = this.w;
        if (zn1Var != null) {
            zn1Var.X0(xn1Var, zn1Var.P0(j), xs0Var, i, z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Z0() {
        yv1 yv1Var = this.S;
        if (yv1Var != null) {
            ((sq0) yv1Var).c();
            return;
        }
        zn1 zn1Var = this.x;
        if (zn1Var != null) {
            zn1Var.Z0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a1() {
        if (this.S != null && this.D <= 0.0f) {
            return true;
        }
        zn1 zn1Var = this.x;
        if (zn1Var != null) {
            return zn1Var.a1();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float b() {
        return this.v.F.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b1() {
        this.v.N.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final long c(long j) {
        if (!S0().u) {
            kz0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((b7) u61.a(this.v)).u(M(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x0080 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x008f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x004a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x004a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0089 */
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
    public final void c1() {
        th1 th1VarS0;
        boolean zG = ao1.g(128);
        th1 th1VarU0 = U0(zG);
        if (th1VarU0 == null || (th1VarU0.h.k & 128) == 0) {
            return;
        }
        vr2 vr2VarB = tl.B();
        in0 in0VarE = vr2VarB != null ? vr2VarB.e() : null;
        vr2 vr2VarK = tl.K(vr2VarB);
        try {
            if (!zG) {
                th1VarS0 = S0().l;
                if (th1VarS0 == null) {
                }
            }
            th1VarS0 = S0();
            for (th1 th1VarU02 = U0(zG); th1VarU02 != null; th1VarU02 = th1VarU02.m) {
                if ((th1VarU02.k & 128) == 0) {
                    break;
                }
                if ((th1VarU02.j & 128) != 0) {
                    ?? M = th1VarU02;
                    ?? zk1Var = 0;
                    while (M != 0) {
                        if (M instanceof qf1) {
                            ((qf1) M).c(this.j);
                        } else if ((M.j & 128) != 0 && (M instanceof u60)) {
                            th1 th1Var = ((u60) M).w;
                            int i = 0;
                            M = M;
                            zk1Var = zk1Var;
                            while (th1Var != null) {
                                if ((th1Var.j & 128) != 0) {
                                    i++;
                                    zk1Var = zk1Var;
                                    if (i == 1) {
                                        M = th1Var;
                                    } else {
                                        if (zk1Var == 0) {
                                            zk1Var = new zk1(new th1[16]);
                                        }
                                        if (M != 0) {
                                            zk1Var.b(M);
                                            M = 0;
                                        }
                                        zk1Var.b(th1Var);
                                    }
                                }
                                th1Var = th1Var.m;
                                M = M;
                                zk1Var = zk1Var;
                            }
                            if (i == 1) {
                            }
                        }
                        M = sp0.m(zk1Var);
                    }
                }
                if (th1VarU02 == th1VarS0) {
                    break;
                }
            }
        } finally {
            tl.U(vr2VarB, vr2VarK, in0VarE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:33:0x005a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x0069 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0026 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x0026 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:0x0063 */
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
    public final void d1() {
        boolean zG = ao1.g(4194304);
        th1 th1VarS0 = S0();
        if (!zG && (th1VarS0 = th1VarS0.l) == null) {
            return;
        }
        for (th1 th1VarU0 = U0(zG); th1VarU0 != null && (th1VarU0.k & 4194304) != 0; th1VarU0 = th1VarU0.m) {
            if ((th1VarU0.j & 4194304) != 0) {
                ?? M = th1VarU0;
                ?? zk1Var = 0;
                while (M != 0) {
                    if (M instanceof a61) {
                        ((a61) M).q(this);
                    } else if ((M.j & 4194304) != 0 && (M instanceof u60)) {
                        th1 th1Var = ((u60) M).w;
                        int i = 0;
                        M = M;
                        zk1Var = zk1Var;
                        while (th1Var != null) {
                            if ((th1Var.j & 4194304) != 0) {
                                i++;
                                zk1Var = zk1Var;
                                if (i == 1) {
                                    M = th1Var;
                                } else {
                                    if (zk1Var == 0) {
                                        zk1Var = new zk1(new th1[16]);
                                    }
                                    if (M != 0) {
                                        zk1Var.b(M);
                                        M = 0;
                                    }
                                    zk1Var.b(th1Var);
                                }
                            }
                            th1Var = th1Var.m;
                            M = M;
                            zk1Var = zk1Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M = sp0.m(zk1Var);
                }
            }
            if (th1VarU0 == th1VarS0) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e1() {
        this.y = true;
        this.Q.a();
        k1();
        if (z01.a(this.G, 0L)) {
            return;
        }
        this.v.N(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f1() {
        boolean zG = ao1.g(1048576);
        th1 th1VarU0 = U0(zG);
        if (th1VarU0 == null || (th1VarU0.h.k & 1048576) == 0) {
            return;
        }
        th1 th1VarS0 = S0();
        if (!zG && (th1VarS0 = th1VarS0.l) == null) {
            return;
        }
        for (th1 th1VarU02 = U0(zG); th1VarU02 != null && (th1VarU02.k & 1048576) != 0; th1VarU02 = th1VarU02.m) {
            if ((th1VarU02.j & 1048576) != 0) {
                th1 th1VarM = th1VarU02;
                zk1 zk1Var = null;
                while (th1VarM != null) {
                    if ((th1VarM.j & 1048576) != 0 && (th1VarM instanceof u60)) {
                        int i = 0;
                        for (th1 th1Var = ((u60) th1VarM).w; th1Var != null; th1Var = th1Var.m) {
                            if ((th1Var.j & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    th1VarM = th1Var;
                                } else {
                                    if (zk1Var == null) {
                                        zk1Var = new zk1(new th1[16]);
                                    }
                                    if (th1VarM != null) {
                                        zk1Var.b(th1VarM);
                                        th1VarM = null;
                                    }
                                    zk1Var.b(th1Var);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    th1VarM = sp0.m(zk1Var);
                }
            }
            if (th1VarU02 == th1VarS0) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final long g(long j) {
        if (!S0().u) {
            kz0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        c61 c61VarJ = s11.J(this);
        b7 b7Var = (b7) u61.a(this.v);
        b7Var.D();
        return D(c61VarJ, rs1.d(hf1.b(j, b7Var.l0), c61VarJ.M(0L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:67:0x01bb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x01c7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:82:0x01c9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:85:0x01c4 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g1(th1 th1Var, xn1 xn1Var, long j, xs0 xs0Var, int i, boolean z, float f, boolean z2) {
        ?? M;
        if (th1Var == null) {
            Y0(xn1Var, j, xs0Var, i, z);
            return;
        }
        if (!xn1Var.i(th1Var)) {
            g1(p7.h(th1Var, xn1Var.d()), xn1Var, j, xs0Var, i, z, f, z2);
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
                    long jS = ((r12) r3).s();
                    int i4 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i4);
                    r61 r61Var = this.v;
                    d61 d61Var = r61Var.G;
                    int i5 = x23.b;
                    long j2 = Long.MIN_VALUE & jS;
                    d61 d61Var2 = d61.h;
                    if (fIntBitsToFloat >= (-((j2 == 0 || d61Var == d61Var2) ? jx2.c(jS, 0) : jx2.c(jS, 2)))) {
                        if (Float.intBitsToFloat(i4) < b0() + ((j2 == 0 || r61Var.G == d61Var2) ? jx2.c(jS, 2) : jx2.c(jS, 0))) {
                            int i6 = (int) (j & 4294967295L);
                            float fIntBitsToFloat2 = Float.intBitsToFloat(i6);
                            int i7 = x23.b;
                            if (fIntBitsToFloat2 >= (-jx2.c(jS, 1))) {
                                if (Float.intBitsToFloat(i6) < jx2.c(jS, 3) + Z()) {
                                    ck1 ck1Var = xs0Var.i;
                                    lk1 lk1Var = xs0Var.h;
                                    int i8 = xs0Var.j;
                                    int i9 = lk1Var.b;
                                    if (i8 == i9 - 1) {
                                        xs0Var.b(i8 + 1, i9);
                                        xs0Var.j++;
                                        lk1Var.a(th1Var);
                                        ck1Var.a(qp0.a(0.0f, z3, true));
                                        g1(p7.h(th1Var, xn1Var.d()), xn1Var, j, xs0Var, i2, z3, f, z2);
                                        xs0Var.j = i8;
                                        return;
                                    }
                                    long jA = xs0Var.a();
                                    int i10 = xs0Var.j;
                                    if (!xe1.N(jA)) {
                                        if (xe1.z(jA) > 0.0f) {
                                            int i11 = xs0Var.j;
                                            xs0Var.b(i11 + 1, lk1Var.b);
                                            xs0Var.j++;
                                            lk1Var.a(th1Var);
                                            ck1Var.a(qp0.a(0.0f, z3, true));
                                            g1(p7.h(th1Var, xn1Var.d()), xn1Var, j, xs0Var, i, z3, f, z2);
                                            xs0Var.j = i11;
                                            return;
                                        }
                                        return;
                                    }
                                    int i12 = lk1Var.b;
                                    int i13 = i12 - 1;
                                    xs0Var.j = i13;
                                    xs0Var.b(i12, lk1Var.b);
                                    xs0Var.j++;
                                    lk1Var.a(th1Var);
                                    ck1Var.a(qp0.a(0.0f, z3, true));
                                    g1(p7.h(th1Var, xn1Var.d()), xn1Var, j, xs0Var, i, z3, f, z2);
                                    xs0Var.j = i13;
                                    if (xe1.z(xs0Var.a()) < 0.0f) {
                                        xs0Var.b(i10 + 1, xs0Var.j + 1);
                                    }
                                    xs0Var.j = i10;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    char c2 = c;
                    if ((r3.j & 16) == 0 || !(r3 instanceof u60)) {
                        M = sp0.m(zk1Var);
                    } else {
                        th1 th1Var2 = ((u60) r3).w;
                        M = r3;
                        zk1Var = zk1Var;
                        while (th1Var2 != null) {
                            if ((th1Var2.j & 16) != 0) {
                                i3++;
                                zk1Var = zk1Var;
                                if (i3 == 1) {
                                    M = th1Var2;
                                } else {
                                    if (zk1Var == 0) {
                                        zk1Var = new zk1(new th1[16]);
                                    }
                                    if (M != 0) {
                                        zk1Var.b(M);
                                        M = 0;
                                    }
                                    zk1Var.b(th1Var2);
                                }
                            }
                            th1Var2 = th1Var2.m;
                            M = M;
                            zk1Var = zk1Var;
                        }
                        if (i3 == 1) {
                        }
                    }
                    i2 = i;
                    z3 = z;
                    c = c2;
                    r3 = M;
                    zk1Var = zk1Var;
                }
            }
        }
        if (z2) {
            W0(th1Var, xn1Var, j, xs0Var, i, z, f);
        } else {
            m1(th1Var, xn1Var, j, xs0Var, i, z, f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.m11
    public final d61 getLayoutDirection() {
        return this.v.G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final long h(long j) {
        long jM = M(j);
        b7 b7Var = (b7) u61.a(this.v);
        b7Var.D();
        return hf1.b(jM, b7Var.k0);
    }

    public abstract void h1(qp qpVar, pq0 pq0Var);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x0055 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x0064 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:46:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x005e */
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
    @Override // defpackage.sz1, defpackage.if1
    public final Object i() {
        r61 r61Var = this.v;
        if (!r61Var.M.m(64)) {
            return null;
        }
        S0();
        Object objQ0 = null;
        for (th1 th1Var = (qx2) r61Var.M.f; th1Var != null; th1Var = th1Var.l) {
            if ((th1Var.j & 64) != 0) {
                ?? M = th1Var;
                ?? zk1Var = 0;
                while (M != 0) {
                    if (M instanceof ox1) {
                        objQ0 = ((ox1) M).q0(objQ0);
                    } else if ((M.j & 64) != 0 && (M instanceof u60)) {
                        th1 th1Var2 = ((u60) M).w;
                        int i = 0;
                        M = M;
                        zk1Var = zk1Var;
                        while (th1Var2 != null) {
                            if ((th1Var2.j & 64) != 0) {
                                i++;
                                zk1Var = zk1Var;
                                if (i == 1) {
                                    M = th1Var2;
                                } else {
                                    if (zk1Var == 0) {
                                        zk1Var = new zk1(new th1[16]);
                                    }
                                    if (M != 0) {
                                        zk1Var.b(M);
                                        M = 0;
                                    }
                                    zk1Var.b(th1Var2);
                                }
                            }
                            th1Var2 = th1Var2.m;
                            M = M;
                            zk1Var = zk1Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M = sp0.m(zk1Var);
                }
            }
        }
        return objQ0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i1(long j, float f, in0 in0Var) {
        r1(in0Var, false);
        boolean zA = z01.a(this.G, j);
        r61 r61Var = this.v;
        if (!zA) {
            ((b7) u61.a(r61Var)).N(-4.0f);
            this.G = j;
            yv1 yv1Var = this.S;
            if (yv1Var != null) {
                ((sq0) yv1Var).d(j);
            } else {
                zn1 zn1Var = this.x;
                if (zn1Var != null) {
                    zn1Var.Z0();
                }
            }
            r61Var.N(this);
            kd1.E0(this);
            zv1 zv1Var = r61Var.u;
            if (zv1Var != null) {
                ((b7) zv1Var).z(r61Var);
            }
        }
        this.H = f;
        if (this == ((zn1) r61Var.M.e)) {
            ((b7) u61.a(r61Var)).getRectManager().f(r61Var);
        }
        if (this.r) {
            return;
        }
        o0(A0());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final c61 j() {
        boolean z = S0().u;
        r61 r61Var = this.v;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (r61 r61VarU = r61Var; r61VarU != null; r61VarU = r61VarU.u()) {
                sb.append("\n|");
                sb.append(r61VarU);
                sb.append(" isAttached=");
                sb.append(r61VarU.H());
                sb.append(" modifier=");
                sb.append(r61VarU.R);
                sb.append(" tail=");
                sb.append(S0());
            }
            kz0.b(sb.toString());
        }
        b1();
        return ((zn1) r61Var.M.e).x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j1(qk1 qk1Var, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        yv1 yv1Var = this.S;
        if (yv1Var != null) {
            if (this.z) {
                if (z2) {
                    long jR0 = R0();
                    float f = qk1Var.a;
                    float f2 = qk1Var.b;
                    if (qk1Var.c >= 0.0f) {
                        long j = this.j;
                        if (f > ((int) (j >> 32)) || qk1Var.d < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jR0 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jR0 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (qk1Var.c - qk1Var.a)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (qk1Var.d - qk1Var.b)) / 2.0f;
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
                        long j2 = this.j;
                        float f7 = (int) (j2 >> 32);
                        int i = (int) (jR0 >> 32);
                        float f8 = (int) (j2 & 4294967295L);
                        int i2 = (int) (jR0 & 4294967295L);
                        qk1Var.a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                    }
                } else if (z) {
                    long j3 = this.j;
                    qk1Var.a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (qk1Var.b()) {
                    return;
                }
            }
            sq0 sq0Var = (sq0) yv1Var;
            float[] fArrB = sq0Var.b();
            if (!sq0Var.z) {
                if (fArrB == null) {
                    qk1Var.a = 0.0f;
                    qk1Var.b = 0.0f;
                    qk1Var.c = 0.0f;
                    qk1Var.d = 0.0f;
                } else {
                    hf1.c(fArrB, qk1Var);
                }
            }
        }
        long j4 = this.G;
        float f9 = (int) (j4 >> 32);
        qk1Var.a += f9;
        qk1Var.c += f9;
        float f10 = (int) (j4 & 4294967295L);
        qk1Var.b += f10;
        qk1Var.d += f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k1() {
        if (this.S != null) {
            r1(null, false);
            this.v.U(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:117:0x00c6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:120:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:122:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:125:0x00c0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x00b7 */
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
    public final void l1(of1 of1Var) {
        zn1 zn1Var;
        of1 of1Var2 = this.E;
        if (of1Var != of1Var2) {
            this.E = of1Var;
            r61 r61Var = this.v;
            int i = 0;
            if (of1Var2 == null || of1Var.e() != of1Var2.e() || of1Var.c() != of1Var2.c()) {
                int iE = of1Var.e();
                int iC = of1Var.c();
                yv1 yv1Var = this.S;
                if (yv1Var != null) {
                    ((sq0) yv1Var).e((((long) iE) << 32) | (((long) iC) & 4294967295L));
                } else if (r61Var.I() && (zn1Var = this.x) != null) {
                    zn1Var.Z0();
                }
                g0((((long) iC) & 4294967295L) | (((long) iE) << 32));
                if (this.A != null) {
                    s1(false);
                }
                boolean zG = ao1.g(4);
                th1 th1VarS0 = S0();
                if (zG || (th1VarS0 = th1VarS0.l) != null) {
                    for (th1 th1VarU0 = U0(zG); th1VarU0 != null && (th1VarU0.k & 4) != 0; th1VarU0 = th1VarU0.m) {
                        if ((th1VarU0.j & 4) != 0) {
                            ?? M = th1VarU0;
                            ?? zk1Var = 0;
                            while (M != 0) {
                                if (M instanceof mc0) {
                                    ((mc0) M).r0();
                                } else if ((M.j & 4) != 0 && (M instanceof u60)) {
                                    th1 th1Var = ((u60) M).w;
                                    int i2 = 0;
                                    M = M;
                                    zk1Var = zk1Var;
                                    while (th1Var != null) {
                                        if ((th1Var.j & 4) != 0) {
                                            i2++;
                                            zk1Var = zk1Var;
                                            if (i2 == 1) {
                                                M = th1Var;
                                            } else {
                                                if (zk1Var == 0) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (M != 0) {
                                                    zk1Var.b(M);
                                                    M = 0;
                                                }
                                                zk1Var.b(th1Var);
                                            }
                                        }
                                        th1Var = th1Var.m;
                                        M = M;
                                        zk1Var = zk1Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M = sp0.m(zk1Var);
                            }
                        }
                        if (th1VarU0 == th1VarS0) {
                            break;
                        }
                    }
                }
                zv1 zv1Var = r61Var.u;
                if (zv1Var != null) {
                    ((b7) zv1Var).z(r61Var);
                }
                r61Var.N(this);
            }
            gk1 gk1Var = this.F;
            if ((gk1Var == null || gk1Var.e == 0) && of1Var.a().isEmpty()) {
                return;
            }
            gk1 gk1Var2 = this.F;
            Map mapA = of1Var.a();
            if (gk1Var2 != null && gk1Var2.e == mapA.size()) {
                Object[] objArr = gk1Var2.b;
                int[] iArr = gk1Var2.c;
                long[] jArr = gk1Var2.a;
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
                                Integer num = (Integer) mapA.get((du0) obj);
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
            r61Var.N.p.D.f();
            gk1 gk1Var3 = this.F;
            if (gk1Var3 == null) {
                gk1 gk1Var4 = hs1.a;
                gk1Var3 = new gk1();
                this.F = gk1Var3;
            }
            gk1Var3.a();
            for (Map.Entry entry : of1Var.a().entrySet()) {
                gk1Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float m() {
        return this.v.F.m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m1(th1 th1Var, xn1 xn1Var, long j, xs0 xs0Var, int i, boolean z, float f) {
        int i2;
        if (th1Var == null) {
            Y0(xn1Var, j, xs0Var, i, z);
            return;
        }
        if (!xn1Var.i(th1Var)) {
            m1(p7.h(th1Var, xn1Var.d()), xn1Var, j, xs0Var, i, z, f);
            return;
        }
        if (!xn1Var.b(th1Var)) {
            g1(p7.h(th1Var, xn1Var.d()), xn1Var, j, xs0Var, i, z, f, false);
            return;
        }
        ck1 ck1Var = xs0Var.i;
        lk1 lk1Var = xs0Var.h;
        int i3 = xs0Var.j;
        int i4 = lk1Var.b;
        if (i3 != i4 - 1) {
            long jA = xs0Var.a();
            int i5 = xs0Var.j;
            int i6 = lk1Var.b;
            int i7 = i6 - 1;
            xs0Var.j = i7;
            xs0Var.b(i6, lk1Var.b);
            xs0Var.j++;
            lk1Var.a(th1Var);
            ck1Var.a(qp0.a(f, z, false));
            g1(p7.h(th1Var, xn1Var.d()), xn1Var, j, xs0Var, i, z, f, false);
            xs0Var.j = i7;
            long jA2 = xs0Var.a();
            if (xs0Var.j + 1 >= lk1Var.b - 1 || xe1.k(jA, jA2) <= 0) {
                xs0Var.b(xs0Var.j + 1, lk1Var.b);
            } else {
                int i8 = i5 + 1;
                boolean zN = xe1.N(jA2);
                int i9 = xs0Var.j;
                xs0Var.b(i8, zN ? i9 + 2 : i9 + 1);
            }
            xs0Var.j = i5;
            return;
        }
        int i10 = i3 + 1;
        xs0Var.b(i10, i4);
        xs0Var.j++;
        lk1Var.a(th1Var);
        ck1Var.a(qp0.a(f, z, false));
        g1(p7.h(th1Var, xn1Var.d()), xn1Var, j, xs0Var, i, z, f, false);
        xs0Var.j = i3;
        if (i10 == lk1Var.b - 1 || xe1.N(xs0Var.a())) {
            int i11 = xs0Var.j;
            int i12 = i11 + 1;
            lk1Var.k(i12);
            if (i12 < 0 || i12 >= (i2 = ck1Var.b)) {
                s.d("Index must be between 0 and size");
                return;
            }
            long[] jArr = ck1Var.a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                mg.b0(jArr, jArr, i12, i11 + 2, i2);
            }
            ck1Var.b--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o62 o1() {
        if (S0().u) {
            c61 c61VarJ = s11.J(this);
            qk1 qk1Var = this.I;
            if (qk1Var == null) {
                qk1Var = new qk1();
                this.I = qk1Var;
            }
            long jJ0 = J0(R0());
            int i = (int) (jJ0 >> 32);
            qk1Var.a = -Float.intBitsToFloat(i);
            int i2 = (int) (jJ0 & 4294967295L);
            qk1Var.b = -Float.intBitsToFloat(i2);
            qk1Var.c = Float.intBitsToFloat(i) + b0();
            qk1Var.d = Float.intBitsToFloat(i2) + Z();
            while (this != c61VarJ) {
                this.j1(qk1Var, false, true);
                if (!qk1Var.b()) {
                    this = this.x;
                    this.getClass();
                }
            }
            return new o62(qk1Var.a, qk1Var.b, qk1Var.c, qk1Var.d);
        }
        return o62.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p1(zn1 zn1Var, float[] fArr) {
        float[] fArrA;
        if (t11.l(zn1Var, this)) {
            return;
        }
        zn1 zn1Var2 = this.x;
        zn1Var2.getClass();
        zn1Var2.p1(zn1Var, fArr);
        if (!z01.a(this.G, 0L)) {
            float[] fArr2 = V;
            hf1.d(fArr2);
            long j = this.G;
            hf1.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            hf1.e(fArr, fArr2);
        }
        yv1 yv1Var = this.S;
        if (yv1Var == null || (fArrA = ((sq0) yv1Var).a()) == null) {
            return;
        }
        hf1.e(fArr, fArrA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q1(zn1 zn1Var, float[] fArr) {
        while (!this.equals(zn1Var)) {
            yv1 yv1Var = this.S;
            if (yv1Var != null) {
                hf1.e(fArr, ((sq0) yv1Var).b());
            }
            if (!z01.a(this.G, 0L)) {
                float[] fArr2 = V;
                hf1.d(fArr2);
                hf1.f(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                hf1.e(fArr, fArr2);
            }
            this = this.x;
            this.getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final long r(c61 c61Var, long j) {
        return D(c61Var, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final kd1 r0() {
        return this.w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r1(in0 in0Var, boolean z) {
        zv1 zv1Var;
        zk1 zk1Var;
        Reference referencePoll;
        v7 v7Var;
        zk1 zk1Var2;
        Reference referencePoll2;
        Object obj;
        int i = 0;
        r61 r61Var = this.v;
        boolean z2 = (!z && this.A == in0Var && t11.l(this.B, r61Var.F) && this.C == r61Var.G) ? false : true;
        this.B = r61Var.F;
        this.C = r61Var.G;
        boolean zH = r61Var.H();
        yn1 yn1Var = this.Q;
        if (!zH || in0Var == null) {
            this.A = null;
            yv1 yv1Var = this.S;
            if (yv1Var != null) {
                sq0 sq0Var = (sq0) yv1Var;
                if (!p7.y(sq0Var.b())) {
                    r61Var.N(this);
                }
                sq0Var.k = null;
                sq0Var.l = null;
                sq0Var.n = true;
                sq0Var.f(false);
                nq0 nq0Var = sq0Var.i;
                if (nq0Var != null) {
                    nq0Var.a(sq0Var.h);
                    b7 b7Var = sq0Var.j;
                    dq1 dq1Var = b7Var.F0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) dq1Var.j;
                        zk1Var = (zk1) dq1Var.i;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            zk1Var.j(referencePoll);
                        }
                    } while (referencePoll != null);
                    zk1Var.b(new WeakReference(sq0Var, (ReferenceQueue) dq1Var.j));
                    b7Var.L.j(sq0Var);
                }
                this.S = null;
                r61Var.Q = true;
                yn1Var.a();
                if (S0().u && r61Var.I() && (zv1Var = r61Var.u) != null) {
                    ((b7) zv1Var).z(r61Var);
                }
            }
            this.R = false;
            return;
        }
        this.A = in0Var;
        if (this.S != null) {
            if (z2) {
                s1(true);
                return;
            }
            return;
        }
        zv1 zv1VarA = u61.a(r61Var);
        v7 v7Var2 = this.P;
        if (v7Var2 == null) {
            v7 v7Var3 = new v7(2, this, new yn1(this, i));
            this.P = v7Var3;
            v7Var = v7Var3;
        } else {
            v7Var = v7Var2;
        }
        b7 b7Var2 = (b7) zv1VarA;
        dq1 dq1Var2 = b7Var2.F0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) dq1Var2.j;
            zk1Var2 = (zk1) dq1Var2.i;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                zk1Var2.j(referencePoll2);
            }
        } while (referencePoll2 != null);
        while (true) {
            int i2 = zk1Var2.j;
            if (i2 == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) zk1Var2.k(i2 - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        yv1 sq0Var2 = (yv1) obj;
        if (sq0Var2 != null) {
            sq0 sq0Var3 = (sq0) sq0Var2;
            nq0 nq0Var2 = sq0Var3.i;
            if (nq0Var2 == null) {
                throw vi0.e("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!sq0Var3.h.s) {
                kz0.a("layer should have been released before reuse");
            }
            sq0Var3.h = nq0Var2.b();
            sq0Var3.n = false;
            sq0Var3.k = v7Var;
            sq0Var3.l = yn1Var;
            sq0Var3.x = false;
            sq0Var3.y = false;
            sq0Var3.z = true;
            hf1.d(sq0Var3.o);
            float[] fArr = sq0Var3.p;
            if (fArr != null) {
                hf1.d(fArr);
            }
            sq0Var3.v = m33.b;
            sq0Var3.A = false;
            sq0Var3.m = 9223372034707292159L;
            sq0Var3.w = null;
            sq0Var3.u = 0;
        } else {
            sq0Var2 = new sq0(b7Var2.getGraphicsContext().b(), b7Var2.getGraphicsContext(), b7Var2, v7Var, yn1Var);
        }
        sq0 sq0Var4 = (sq0) sq0Var2;
        sq0Var4.e(this.j);
        sq0Var4.d(this.G);
        this.S = sq0Var2;
        s1(true);
        r61Var.Q = true;
        yn1Var.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final long s(long j) {
        if (!S0().u) {
            kz0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return D(s11.J(this), ((b7) u61.a(this.v)).H(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s1(boolean z) {
        char c;
        b7 b7Var;
        boolean z2;
        b7 b7Var2;
        zv1 zv1Var;
        xm0 xm0Var;
        xm0 xm0Var2;
        yv1 yv1Var = this.S;
        in0 in0Var = this.A;
        if (yv1Var == null) {
            if (in0Var == null) {
                return;
            }
            kz0.b("null layer with a non-null layerBlock");
            return;
        }
        if (in0Var == null) {
            throw vi0.e("updateLayerParameters requires a non-null layerBlock");
        }
        ca2 ca2Var = T;
        ca2Var.a();
        r61 r61Var = this.v;
        ca2Var.x = r61Var.F;
        ca2Var.y = r61Var.G;
        ca2Var.w = s11.q0(this.j);
        ((b7) u61.a(r61Var)).getSnapshotObserver().a.c(this, oq0.n, new t6(9, in0Var, this));
        z51 z51Var = this.J;
        if (z51Var == null) {
            z51Var = new z51();
            this.J = z51Var;
        }
        z51 z51Var2 = U;
        z51Var2.getClass();
        z51Var2.a = z51Var.a;
        z51Var2.b = z51Var.b;
        z51Var2.c = z51Var.c;
        z51Var2.d = z51Var.d;
        z51Var2.e = z51Var.e;
        z51Var2.f = z51Var.f;
        z51Var2.g = z51Var.g;
        z51Var2.h = z51Var.h;
        float f = ca2Var.i;
        z51Var.a = f;
        z51Var.b = ca2Var.j;
        z51Var.c = ca2Var.l;
        z51Var.d = ca2Var.p;
        z51Var.e = ca2Var.q;
        z51Var.f = ca2Var.r;
        z51Var.g = ca2Var.s;
        long j = ca2Var.t;
        z51Var.h = j;
        sq0 sq0Var = (sq0) yv1Var;
        b7 b7Var3 = sq0Var.j;
        int i = ca2Var.h | sq0Var.u;
        sq0Var.s = ca2Var.y;
        sq0Var.r = ca2Var.x;
        int i2 = i & 4096;
        if (i2 != 0) {
            sq0Var.v = j;
        }
        if ((i & 1) != 0) {
            rq0 rq0Var = sq0Var.h.a;
            if (rq0Var.d() != f) {
                rq0Var.m(f);
            }
        }
        if ((i & 2) != 0) {
            pq0 pq0Var = sq0Var.h;
            float f2 = ca2Var.j;
            rq0 rq0Var2 = pq0Var.a;
            if (rq0Var2.H() != f2) {
                rq0Var2.A(f2);
            }
        }
        if ((i & 4) != 0) {
            pq0 pq0Var2 = sq0Var.h;
            float f3 = ca2Var.k;
            rq0 rq0Var3 = pq0Var2.a;
            if (rq0Var3.a() != f3) {
                rq0Var3.c(f3);
            }
        }
        if ((i & 8) != 0) {
            rq0 rq0Var4 = sq0Var.h.a;
            if (rq0Var4.q() != 0.0f) {
                rq0Var4.r();
            }
        }
        if ((i & 16) != 0) {
            pq0 pq0Var3 = sq0Var.h;
            float f4 = ca2Var.l;
            rq0 rq0Var5 = pq0Var3.a;
            if (rq0Var5.f() != f4) {
                rq0Var5.h(f4);
            }
        }
        if ((i & 32) != 0) {
            pq0 pq0Var4 = sq0Var.h;
            float f5 = ca2Var.m;
            rq0 rq0Var6 = pq0Var4.a;
            if (rq0Var6.F() != f5) {
                rq0Var6.e(f5);
                pq0Var4.g = true;
                pq0Var4.a();
            }
            if (ca2Var.m > 0.0f && !sq0Var.A && (xm0Var2 = sq0Var.l) != null) {
                xm0Var2.a();
            }
        }
        if ((i & 64) != 0) {
            pq0 pq0Var5 = sq0Var.h;
            long j2 = ca2Var.n;
            rq0 rq0Var7 = pq0Var5.a;
            if (!ju.c(j2, rq0Var7.M())) {
                rq0Var7.j(j2);
            }
        }
        if ((i & 128) != 0) {
            pq0 pq0Var6 = sq0Var.h;
            long j3 = ca2Var.o;
            rq0 rq0Var8 = pq0Var6.a;
            if (!ju.c(j3, rq0Var8.i())) {
                rq0Var8.z(j3);
            }
        }
        if ((i & 1024) != 0) {
            pq0 pq0Var7 = sq0Var.h;
            float f6 = ca2Var.r;
            rq0 rq0Var9 = pq0Var7.a;
            if (rq0Var9.J() != f6) {
                rq0Var9.g(f6);
            }
        }
        if ((i & 256) != 0) {
            pq0 pq0Var8 = sq0Var.h;
            float f7 = ca2Var.p;
            rq0 rq0Var10 = pq0Var8.a;
            if (rq0Var10.v() != f7) {
                rq0Var10.I(f7);
            }
        }
        if ((i & AIChatConfig.DefaultMaxTokens) != 0) {
            pq0 pq0Var9 = sq0Var.h;
            float f8 = ca2Var.q;
            rq0 rq0Var11 = pq0Var9.a;
            if (rq0Var11.D() != f8) {
                rq0Var11.b(f8);
            }
        }
        if ((i & 2048) != 0) {
            pq0 pq0Var10 = sq0Var.h;
            float f9 = ca2Var.s;
            rq0 rq0Var12 = pq0Var10.a;
            if (rq0Var12.o() != f9) {
                rq0Var12.E(f9);
            }
        }
        if (i2 != 0) {
            c = ' ';
            boolean zA = m33.a(sq0Var.v, m33.b);
            pq0 pq0Var11 = sq0Var.h;
            if (!zA) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sq0Var.v & 4294967295L)) * ((int) (sq0Var.m & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sq0Var.v >> 32)) * ((int) (sq0Var.m >> 32)))) << 32);
                if (!rs1.b(pq0Var11.v, jFloatToRawIntBits)) {
                    pq0Var11.v = jFloatToRawIntBits;
                    pq0Var11.a.L(jFloatToRawIntBits);
                }
            } else if (!rs1.b(pq0Var11.v, 9205357640488583168L)) {
                pq0Var11.v = 9205357640488583168L;
                pq0Var11.a.L(9205357640488583168L);
            }
        } else {
            c = ' ';
        }
        if ((i & 16384) != 0) {
            pq0 pq0Var12 = sq0Var.h;
            boolean z3 = ca2Var.v;
            if (pq0Var12.w != z3) {
                pq0Var12.w = z3;
                pq0Var12.g = true;
                pq0Var12.a();
            }
        }
        if ((131072 & i) != 0) {
            rq0 rq0Var13 = sq0Var.h.a;
        }
        if ((262144 & i) != 0) {
            rq0 rq0Var14 = sq0Var.h.a;
            if (!t11.l(rq0Var14.x(), null)) {
                rq0Var14.l();
            }
        }
        if ((524288 & i) != 0) {
            pq0 pq0Var13 = sq0Var.h;
            int i3 = ca2Var.z;
            rq0 rq0Var15 = pq0Var13.a;
            if (rq0Var15.K() != i3) {
                rq0Var15.n(i3);
            }
        }
        if ((32768 & i) != 0) {
            rq0 rq0Var16 = sq0Var.h.a;
            if (rq0Var16.u() != 0) {
                rq0Var16.y(0);
            }
        }
        if ((i & 7963) != 0) {
            sq0Var.x = true;
            sq0Var.y = true;
        }
        if (t11.l(sq0Var.w, ca2Var.A)) {
            b7Var = b7Var3;
            z2 = false;
        } else {
            te teVar = ca2Var.A;
            sq0Var.w = teVar;
            if (teVar == null) {
                b7Var = b7Var3;
            } else {
                pq0 pq0Var14 = sq0Var.h;
                if (teVar instanceof tv1) {
                    o62 o62Var = ((tv1) teVar).j;
                    float f10 = o62Var.a;
                    float f11 = o62Var.b;
                    b7Var = b7Var3;
                    pq0Var14.e((((long) Float.floatToRawIntBits(f10)) << c) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), (((long) Float.floatToRawIntBits(o62Var.c - f10)) << c) | (((long) Float.floatToRawIntBits(o62Var.d - f11)) & 4294967295L), 0.0f);
                } else {
                    b7Var = b7Var3;
                    if (teVar instanceof sv1) {
                        y9 y9Var = ((sv1) teVar).j;
                        pq0Var14.k = null;
                        pq0Var14.i = 9205357640488583168L;
                        pq0Var14.h = 0L;
                        pq0Var14.j = 0.0f;
                        pq0Var14.g = true;
                        pq0Var14.n = false;
                        pq0Var14.l = y9Var;
                        pq0Var14.a();
                    } else {
                        if (!(teVar instanceof uv1)) {
                            c80.s();
                            return;
                        }
                        uv1 uv1Var = (uv1) teVar;
                        y9 y9Var2 = uv1Var.k;
                        if (y9Var2 != null) {
                            pq0Var14.k = null;
                            pq0Var14.i = 9205357640488583168L;
                            pq0Var14.h = 0L;
                            pq0Var14.j = 0.0f;
                            pq0Var14.g = true;
                            pq0Var14.n = false;
                            pq0Var14.l = y9Var2;
                            pq0Var14.a();
                        } else {
                            db2 db2Var = uv1Var.j;
                            float f12 = db2Var.b;
                            float f13 = db2Var.a;
                            pq0Var14.e((((long) Float.floatToRawIntBits(f13)) << c) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L), (((long) Float.floatToRawIntBits(db2Var.c - f13)) << c) | (((long) Float.floatToRawIntBits(db2Var.d - f12)) & 4294967295L), Float.intBitsToFloat((int) (db2Var.h >> c)));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((teVar instanceof sv1) || ((teVar instanceof uv1) && !p7.z(((uv1) teVar).j))) && (xm0Var = sq0Var.l) != null)) {
                    xm0Var.a();
                }
            }
            z2 = true;
        }
        sq0Var.u = ca2Var.h;
        if (i != 0 || z2) {
            ViewParent parent = b7Var.getParent();
            if (parent != null) {
                b7Var2 = b7Var;
                parent.onDescendantInvalidated(b7Var2, b7Var2);
            } else {
                b7Var2 = b7Var;
            }
            if (b7.p()) {
                b7Var2.N(0.0f);
            }
        }
        boolean z4 = this.z;
        this.z = ca2Var.v;
        this.D = ca2Var.k;
        boolean z5 = z51Var2.a == z51Var.a && z51Var2.b == z51Var.b && z51Var2.c == z51Var.c && z51Var2.d == z51Var.d && z51Var2.e == z51Var.e && z51Var2.f == z51Var.f && z51Var2.g == z51Var.g && m33.a(z51Var2.h, z51Var.h);
        if (z && ((!z5 || z4 != this.z) && (zv1Var = r61Var.u) != null)) {
            ((b7) zv1Var).z(r61Var);
        }
        if (z5) {
            return;
        }
        r61Var.N(this);
        if (r61Var.W > 0) {
            b7 b7Var4 = (b7) u61.a(r61Var);
            dq1 dq1Var = b7Var4.g0.e;
            dq1Var.getClass();
            if (r61Var.W > 0) {
                ((zk1) dq1Var.i).b(r61Var);
                r61Var.V = true;
            }
            b7Var4.G(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t1(long j) {
        boolean z;
        boolean z2;
        boolean zR;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        yv1 yv1Var = this.S;
        if (yv1Var == null || !this.z) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        pq0 pq0Var = ((sq0) yv1Var).h;
        if (pq0Var.w) {
            te teVarD = pq0Var.d();
            if (teVarD instanceof tv1) {
                o62 o62Var = ((tv1) teVarD).j;
                if (o62Var.a > fIntBitsToFloat || fIntBitsToFloat >= o62Var.c || o62Var.b > fIntBitsToFloat2 || fIntBitsToFloat2 >= o62Var.d) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (teVarD instanceof uv1) {
                db2 db2Var = ((uv1) teVarD).j;
                float f = db2Var.c;
                float f2 = db2Var.b;
                float f3 = db2Var.d;
                float f4 = db2Var.a;
                long j2 = db2Var.f;
                long j3 = db2Var.h;
                z = false;
                z2 = true;
                long j4 = db2Var.g;
                long j5 = db2Var.e;
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
                                    zR = (fIntBitsToFloat >= fIntBitsToFloat5 || fIntBitsToFloat2 >= fIntBitsToFloat6) ? (fIntBitsToFloat >= fIntBitsToFloat12 || fIntBitsToFloat2 <= fIntBitsToFloat11) ? (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 >= fIntBitsToFloat8) ? (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) ? z2 : xe1.R(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, db2Var.g) : xe1.R(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, db2Var.f) : xe1.R(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, db2Var.h) : xe1.R(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, db2Var.e);
                                } else {
                                    y9 y9VarA = aa.a();
                                    y9.b(y9VarA, db2Var);
                                    zR = xe1.P(fIntBitsToFloat, fIntBitsToFloat2, y9VarA);
                                }
                            }
                        }
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(teVarD instanceof sv1)) {
                    c80.s();
                    return false;
                }
                zR = xe1.P(fIntBitsToFloat, fIntBitsToFloat2, ((sv1) teVarD).j);
            }
            zR = z;
        } else {
            z = false;
            z2 = true;
        }
        return zR ? z2 : z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final boolean v0() {
        return this.E != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final boolean w() {
        return S0().u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final r61 w0() {
        return this.v;
    }

    @Override // defpackage.kd1
    public final c61 t0() {
        return this;
    }
}
