package p000;

import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qj0 extends yb0 implements sd0, i50, en0 {

    /* JADX INFO: renamed from: P */
    public static final gv0 f5161P = new gv0();

    /* JADX INFO: renamed from: Q */
    public static final f50 f5162Q = new f50();

    /* JADX INFO: renamed from: R */
    public static final C0675r3 f5163R = new C0675r3(28);

    /* JADX INFO: renamed from: S */
    public static final C0675r3 f5164S = new C0675r3(29);

    /* JADX INFO: renamed from: A */
    public yd0 f5165A;

    /* JADX INFO: renamed from: B */
    public ch0 f5166B;

    /* JADX INFO: renamed from: D */
    public float f5168D;

    /* JADX INFO: renamed from: E */
    public ih0 f5169E;

    /* JADX INFO: renamed from: F */
    public f50 f5170F;

    /* JADX INFO: renamed from: H */
    public boolean f5172H;

    /* JADX INFO: renamed from: I */
    public boolean f5173I;

    /* JADX INFO: renamed from: J */
    public C0868vx f5174J;

    /* JADX INFO: renamed from: K */
    public InterfaceC0051bd f5175K;

    /* JADX INFO: renamed from: L */
    public C0459m4 f5176L;

    /* JADX INFO: renamed from: N */
    public boolean f5178N;

    /* JADX INFO: renamed from: O */
    public cn0 f5179O;

    /* JADX INFO: renamed from: r */
    public final b60 f5180r;

    /* JADX INFO: renamed from: s */
    public qj0 f5181s;

    /* JADX INFO: renamed from: t */
    public qj0 f5182t;

    /* JADX INFO: renamed from: u */
    public boolean f5183u;

    /* JADX INFO: renamed from: v */
    public boolean f5184v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0742sw f5185w;

    /* JADX INFO: renamed from: x */
    public InterfaceC0968ym f5186x;

    /* JADX INFO: renamed from: y */
    public k50 f5187y;

    /* JADX INFO: renamed from: z */
    public float f5188z = 0.8f;

    /* JADX INFO: renamed from: C */
    public long f5167C = 0;

    /* JADX INFO: renamed from: G */
    public x01 f5171G = pf1.f4843i;

    /* JADX INFO: renamed from: M */
    public final nj0 f5177M = new nj0(this, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qj0(b60 b60Var) {
        this.f5180r = b60Var;
        this.f5186x = b60Var.f388B;
        this.f5187y = b60Var.f389C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.i50
    /* JADX INFO: renamed from: A */
    public final long mo340A(i50 i50Var, long j) {
        qj0 qj0Var;
        boolean z = i50Var instanceof bc0;
        if (z) {
            bc0 bc0Var = (bc0) i50Var;
            bc0Var.f492d.f101r.m3276Q0();
            return bc0Var.mo340A(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        bc0 bc0Var2 = z ? (bc0) i50Var : null;
        if (bc0Var2 == null || (qj0Var = bc0Var2.f492d.f101r) == null) {
            i50Var.getClass();
            qj0Var = (qj0) i50Var;
        }
        qj0Var.m3276Q0();
        qj0 qj0VarM3265C0 = m3265C0(qj0Var);
        while (qj0Var != qj0VarM3265C0) {
            cn0 cn0Var = qj0Var.f5179O;
            if (cn0Var != null) {
                C0942xx c0942xx = (C0942xx) cn0Var;
                float[] fArrM5172b = c0942xx.m5172b();
                if (!c0942xx.f7449v) {
                    j = r60.m3417s(fArrM5172b, j);
                }
            }
            j = AbstractC0307i4.m1549y(j, qj0Var.f5167C);
            qj0Var = qj0Var.f5182t;
            qj0Var.getClass();
        }
        return m3291w0(qj0VarM3265C0, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public final void m3264A0(InterfaceC0051bd interfaceC0051bd, C0868vx c0868vx) {
        qj0 qj0Var;
        InterfaceC0051bd interfaceC0051bd2;
        C0868vx c0868vx2;
        oe0 oe0VarM3268H0 = m3268H0(4);
        if (oe0VarM3268H0 == null) {
            mo438W0(interfaceC0051bd, c0868vx);
            return;
        }
        b60 b60Var = this.f5180r;
        b60Var.getClass();
        d60 sharedDrawScope = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var)).getSharedDrawScope();
        long jM2759C = o30.m2759C(this.f7402f);
        sharedDrawScope.getClass();
        sh0 sh0Var = null;
        while (oe0VarM3268H0 != null) {
            if (oe0VarM3268H0 instanceof InterfaceC0775tq) {
                qj0Var = this;
                interfaceC0051bd2 = interfaceC0051bd;
                c0868vx2 = c0868vx;
                sharedDrawScope.m650d(interfaceC0051bd2, jM2759C, qj0Var, (InterfaceC0775tq) oe0VarM3268H0, c0868vx2);
            } else {
                qj0Var = this;
                interfaceC0051bd2 = interfaceC0051bd;
                c0868vx2 = c0868vx;
                if ((oe0VarM3268H0.f4531f & 4) != 0 && (oe0VarM3268H0 instanceof AbstractC0731sm)) {
                    int i = 0;
                    for (oe0 oe0Var = ((AbstractC0731sm) oe0VarM3268H0).f5782s; oe0Var != null; oe0Var = oe0Var.f4534i) {
                        if ((oe0Var.f4531f & 4) != 0) {
                            i++;
                            if (i == 1) {
                                oe0VarM3268H0 = oe0Var;
                            } else {
                                if (sh0Var == null) {
                                    sh0Var = new sh0(new oe0[16]);
                                }
                                if (oe0VarM3268H0 != null) {
                                    sh0Var.m4072b(oe0VarM3268H0);
                                    oe0VarM3268H0 = null;
                                }
                                sh0Var.m4072b(oe0Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                interfaceC0051bd = interfaceC0051bd2;
                this = qj0Var;
                c0868vx = c0868vx2;
            }
            oe0VarM3268H0 = pf1.m3050f(sh0Var);
            interfaceC0051bd = interfaceC0051bd2;
            this = qj0Var;
            c0868vx = c0868vx2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.i50
    /* JADX INFO: renamed from: B */
    public final st0 mo341B(i50 i50Var, boolean z) {
        qj0 qj0Var;
        if (!mo436G0().f4542q) {
            w10.m4824b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!i50Var.mo348z()) {
            w10.m4824b("LayoutCoordinates " + i50Var + " is not attached!");
        }
        bc0 bc0Var = i50Var instanceof bc0 ? (bc0) i50Var : null;
        if (bc0Var == null || (qj0Var = bc0Var.f492d.f101r) == null) {
            qj0Var = (qj0) i50Var;
        }
        qj0Var.m3276Q0();
        qj0 qj0VarM3265C0 = m3265C0(qj0Var);
        ih0 ih0Var = this.f5169E;
        if (ih0Var == null) {
            ih0Var = new ih0();
            this.f5169E = ih0Var;
        }
        ih0Var.f2568a = 0.0f;
        ih0Var.f2569b = 0.0f;
        ih0Var.f2570c = (int) (i50Var.mo342G() >> 32);
        ih0Var.f2571d = (int) (i50Var.mo342G() & 4294967295L);
        while (qj0Var != qj0VarM3265C0) {
            qj0Var.m3283Y0(ih0Var, z, false);
            if (ih0Var.m1580b()) {
                return st0.f5831e;
            }
            qj0Var = qj0Var.f5182t;
            qj0Var.getClass();
        }
        m3290v0(qj0VarM3265C0, ih0Var, z);
        return new st0(ih0Var.f2568a, ih0Var.f2569b, ih0Var.f2570c, ih0Var.f2571d);
    }

    /* JADX INFO: renamed from: B0 */
    public abstract void mo434B0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    public final qj0 m3265C0(qj0 qj0Var) {
        b60 b60VarM315v = qj0Var.f5180r;
        b60 b60Var = this.f5180r;
        if (b60VarM315v == b60Var) {
            oe0 oe0VarMo436G0 = qj0Var.mo436G0();
            oe0 oe0VarMo436G02 = mo436G0();
            if (!oe0VarMo436G02.f4529d.f4542q) {
                w10.m4824b("visitLocalAncestors called on an unattached node");
            }
            for (oe0 oe0Var = oe0VarMo436G02.f4529d.f4533h; oe0Var != null; oe0Var = oe0Var.f4533h) {
                if ((oe0Var.f4531f & 2) != 0 && oe0Var == oe0VarMo436G0) {
                    return qj0Var;
                }
            }
            return this;
        }
        while (b60VarM315v.f420s > b60Var.f420s) {
            b60VarM315v = b60VarM315v.m315v();
            b60VarM315v.getClass();
        }
        b60 b60VarM315v2 = b60Var;
        while (b60VarM315v2.f420s > b60VarM315v.f420s) {
            b60VarM315v2 = b60VarM315v2.m315v();
            b60VarM315v2.getClass();
        }
        while (b60VarM315v != b60VarM315v2) {
            b60VarM315v = b60VarM315v.m315v();
            b60VarM315v2 = b60VarM315v2.m315v();
            if (b60VarM315v == null || b60VarM315v2 == null) {
                C0921xc.m5131l("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (b60VarM315v2 != b60Var) {
            if (b60VarM315v != qj0Var.f5180r) {
                return b60VarM315v.f395I.f3995c;
            }
            return qj0Var;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D0 */
    public final long m3266D0(long j) {
        long j2 = this.f5167C;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        cn0 cn0Var = this.f5179O;
        if (cn0Var != null) {
            C0942xx c0942xx = (C0942xx) cn0Var;
            float[] fArrM5171a = c0942xx.m5171a();
            if (fArrM5171a == null) {
                return 9187343241974906880L;
            }
            if (!c0942xx.f7449v) {
                return r60.m3417s(fArrM5171a, jFloatToRawIntBits);
            }
        }
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: E0 */
    public abstract ac0 mo435E0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F0 */
    public final long m3267F0() {
        return this.f5186x.mo644M(this.f5180r.f390D.mo2692e());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.i50
    /* JADX INFO: renamed from: G */
    public final long mo342G() {
        return this.f7402f;
    }

    /* JADX INFO: renamed from: G0 */
    public abstract oe0 mo436G0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H0 */
    public final oe0 m3268H0(int i) {
        boolean zM3515f = rj0.m3515f(i);
        oe0 oe0VarMo436G0 = mo436G0();
        if (!zM3515f && (oe0VarMo436G0 = oe0VarMo436G0.f4533h) == null) {
            return null;
        }
        for (oe0 oe0VarM3269I0 = m3269I0(zM3515f); oe0VarM3269I0 != null && (oe0VarM3269I0.f4532g & i) != 0; oe0VarM3269I0 = oe0VarM3269I0.f4534i) {
            if ((oe0VarM3269I0.f4531f & i) != 0) {
                return oe0VarM3269I0;
            }
            if (oe0VarM3269I0 == oe0VarMo436G0) {
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I0 */
    public final oe0 m3269I0(boolean z) {
        oe0 oe0VarMo436G0;
        mj0 mj0Var = this.f5180r.f395I;
        if (mj0Var.f3996d == this) {
            return mj0Var.f3998f;
        }
        qj0 qj0Var = this.f5182t;
        if (!z) {
            if (qj0Var != null) {
                return qj0Var.mo436G0();
            }
            return null;
        }
        if (qj0Var == null || (oe0VarMo436G0 = qj0Var.mo436G0()) == null) {
            return null;
        }
        return oe0VarMo436G0.f4534i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final void m3270J0(oe0 oe0Var, C0675r3 c0675r3, long j, C0632py c0632py, int i, boolean z) {
        if (oe0Var == null) {
            mo437M0(c0675r3, j, c0632py, i, z);
            return;
        }
        int i2 = c0632py.f4986f;
        dh0 dh0Var = c0632py.f4984d;
        c0632py.m3164b(i2 + 1, dh0Var.f1109b);
        c0632py.f4986f++;
        dh0Var.m697a(oe0Var);
        c0632py.f4985e.m5257a(pf1.m3047c(-1.0f, z, false));
        m3270J0(v50.m4400d(oe0Var, c0675r3.m3377e()), c0675r3, j, c0632py, i, z);
        c0632py.f4986f = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public final void m3271K0(oe0 oe0Var, C0675r3 c0675r3, long j, C0632py c0632py, int i, boolean z, float f) {
        if (oe0Var == null) {
            mo437M0(c0675r3, j, c0632py, i, z);
            return;
        }
        int i2 = c0632py.f4986f;
        dh0 dh0Var = c0632py.f4984d;
        c0632py.m3164b(i2 + 1, dh0Var.f1109b);
        c0632py.f4986f++;
        dh0Var.m697a(oe0Var);
        c0632py.f4985e.m5257a(pf1.m3047c(f, z, false));
        m3281V0(v50.m4400d(oe0Var, c0675r3.m3377e()), c0675r3, j, c0632py, i, z, f, true);
        c0632py.f4986f = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    public final void m3272L0(C0675r3 c0675r3, long j, C0632py c0632py, int i, boolean z) {
        boolean z2;
        boolean z3;
        oe0 oe0VarM3268H0 = m3268H0(c0675r3.m3377e());
        if (!m3289e1(j)) {
            if (i == 1) {
                float fM3293y0 = m3293y0(j, m3267F0());
                if ((Float.floatToRawIntBits(fM3293y0) & Integer.MAX_VALUE) < 2139095040) {
                    if (c0632py.f4986f != c0632py.f4984d.f1109b - 1) {
                        if (p30.m3010t(c0632py.m3163a(), pf1.m3047c(fM3293y0, false, false)) <= 0) {
                            return;
                        }
                    }
                    m3271K0(oe0VarM3268H0, c0675r3, j, c0632py, i, false, fM3293y0);
                    return;
                }
                return;
            }
            return;
        }
        if (oe0VarM3268H0 == null) {
            mo437M0(c0675r3, j, c0632py, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < mo5002U() && fIntBitsToFloat2 < mo5001S()) {
            m3270J0(oe0VarM3268H0, c0675r3, j, c0632py, i, z);
            return;
        }
        float fM3293y02 = i == 1 ? m3293y0(j, m3267F0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fM3293y02) & Integer.MAX_VALUE) < 2139095040) {
            if (c0632py.f4986f != c0632py.f4984d.f1109b - 1) {
                z2 = z;
                if (p30.m3010t(c0632py.m3163a(), pf1.m3047c(fM3293y02, z2, false)) > 0) {
                }
                m3281V0(oe0VarM3268H0, c0675r3, j, c0632py, i, z2, fM3293y02, z3);
            }
            z2 = z;
            z3 = true;
            m3281V0(oe0VarM3268H0, c0675r3, j, c0632py, i, z2, fM3293y02, z3);
        }
        z2 = z;
        z3 = false;
        m3281V0(oe0VarM3268H0, c0675r3, j, c0632py, i, z2, fM3293y02, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public void mo437M0(C0675r3 c0675r3, long j, C0632py c0632py, int i, boolean z) {
        qj0 qj0Var = this.f5181s;
        if (qj0Var != null) {
            qj0Var.m3272L0(c0675r3, qj0Var.m3266D0(j), c0632py, i, z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N0 */
    public final void m3273N0() {
        cn0 cn0Var = this.f5179O;
        if (cn0Var != null) {
            ((C0942xx) cn0Var).m5173c();
            return;
        }
        qj0 qj0Var = this.f5182t;
        if (qj0Var != null) {
            qj0Var.m3273N0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O0 */
    public final boolean m3274O0() {
        if (this.f5179O != null && this.f5188z <= 0.0f) {
            return true;
        }
        qj0 qj0Var = this.f5182t;
        if (qj0Var != null) {
            return qj0Var.m3274O0();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P0 */
    public final long m3275P0(long j) {
        if (!mo436G0().f4542q) {
            w10.m4824b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m3276Q0();
        while (this != null) {
            b60 b60Var = this.f5180r;
            if (this == b60Var.f395I.f3996d && !b60Var.f407f) {
                long jM4349b = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var)).getRectManager().m4349b(b60Var);
                if (!w20.m4833a(jM4349b, 9223372034707292159L)) {
                    return AbstractC0307i4.m1549y(j, jM4349b);
                }
            }
            cn0 cn0Var = this.f5179O;
            if (cn0Var != null) {
                C0942xx c0942xx = (C0942xx) cn0Var;
                float[] fArrM5172b = c0942xx.m5172b();
                if (!c0942xx.f7449v) {
                    j = r60.m3417s(fArrM5172b, j);
                }
            }
            j = AbstractC0307i4.m1549y(j, this.f5167C);
            this = this.f5182t;
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q0 */
    public final void m3276Q0() {
        this.f5180r.f396J.m1033b();
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
    /* JADX WARN: Type inference failed for: r7v5, types: [oe0] */
    /* JADX WARN: Type inference failed for: r7v7, types: [oe0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [sh0] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: R0 */
    public final void m3277R0() {
        oe0 oe0VarMo436G0;
        boolean zM3515f = rj0.m3515f(128);
        oe0 oe0VarM3269I0 = m3269I0(zM3515f);
        if (oe0VarM3269I0 == null || (oe0VarM3269I0.f4529d.f4532g & 128) == 0) {
            return;
        }
        l21 l21VarM4270k = u50.m4270k();
        InterfaceC0742sw interfaceC0742swMo809e = l21VarM4270k != null ? l21VarM4270k.mo809e() : null;
        l21 l21VarM4276s = u50.m4276s(l21VarM4270k);
        try {
            if (!zM3515f) {
                oe0VarMo436G0 = mo436G0().f4533h;
                if (oe0VarMo436G0 == null) {
                }
            }
            oe0VarMo436G0 = mo436G0();
            for (oe0 oe0VarM3269I02 = m3269I0(zM3515f); oe0VarM3269I02 != null; oe0VarM3269I02 = oe0VarM3269I02.f4534i) {
                if ((oe0VarM3269I02.f4532g & 128) == 0) {
                    break;
                }
                if ((oe0VarM3269I02.f4531f & 128) != 0) {
                    ?? M3050f = oe0VarM3269I02;
                    ?? sh0Var = 0;
                    while (M3050f != 0) {
                        if (M3050f instanceof g50) {
                            ((g50) M3050f).mo547l(this.f7402f);
                        } else if ((M3050f.f4531f & 128) != 0 && (M3050f instanceof AbstractC0731sm)) {
                            oe0 oe0Var = ((AbstractC0731sm) M3050f).f5782s;
                            int i = 0;
                            M3050f = M3050f;
                            sh0Var = sh0Var;
                            while (oe0Var != null) {
                                if ((oe0Var.f4531f & 128) != 0) {
                                    i++;
                                    sh0Var = sh0Var;
                                    if (i == 1) {
                                        M3050f = oe0Var;
                                    } else {
                                        if (sh0Var == 0) {
                                            sh0Var = new sh0(new oe0[16]);
                                        }
                                        if (M3050f != 0) {
                                            sh0Var.m4072b(M3050f);
                                            M3050f = 0;
                                        }
                                        sh0Var.m4072b(oe0Var);
                                    }
                                }
                                oe0Var = oe0Var.f4534i;
                                M3050f = M3050f;
                                sh0Var = sh0Var;
                            }
                            if (i == 1) {
                            }
                        }
                        M3050f = pf1.m3050f(sh0Var);
                    }
                }
                if (oe0VarM3269I02 == oe0VarMo436G0) {
                    break;
                }
            }
        } finally {
            u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
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
    /* JADX WARN: Type inference failed for: r4v1, types: [oe0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [oe0] */
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
    /* JADX WARN: Type inference failed for: r5v3, types: [sh0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: S0 */
    public final void m3278S0() {
        boolean zM3515f = rj0.m3515f(4194304);
        oe0 oe0VarMo436G0 = mo436G0();
        if (!zM3515f && (oe0VarMo436G0 = oe0VarMo436G0.f4533h) == null) {
            return;
        }
        for (oe0 oe0VarM3269I0 = m3269I0(zM3515f); oe0VarM3269I0 != null && (oe0VarM3269I0.f4532g & 4194304) != 0; oe0VarM3269I0 = oe0VarM3269I0.f4534i) {
            if ((oe0VarM3269I0.f4531f & 4194304) != 0) {
                ?? M3050f = oe0VarM3269I0;
                ?? sh0Var = 0;
                while (M3050f != 0) {
                    if (M3050f instanceof g50) {
                        ((g50) M3050f).mo730j(this);
                    } else if ((M3050f.f4531f & 4194304) != 0 && (M3050f instanceof AbstractC0731sm)) {
                        oe0 oe0Var = ((AbstractC0731sm) M3050f).f5782s;
                        int i = 0;
                        M3050f = M3050f;
                        sh0Var = sh0Var;
                        while (oe0Var != null) {
                            if ((oe0Var.f4531f & 4194304) != 0) {
                                i++;
                                sh0Var = sh0Var;
                                if (i == 1) {
                                    M3050f = oe0Var;
                                } else {
                                    if (sh0Var == 0) {
                                        sh0Var = new sh0(new oe0[16]);
                                    }
                                    if (M3050f != 0) {
                                        sh0Var.m4072b(M3050f);
                                        M3050f = 0;
                                    }
                                    sh0Var.m4072b(oe0Var);
                                }
                            }
                            oe0Var = oe0Var.f4534i;
                            M3050f = M3050f;
                            sh0Var = sh0Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M3050f = pf1.m3050f(sh0Var);
                }
            }
            if (oe0VarM3269I0 == oe0VarMo436G0) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T0 */
    public final void m3279T0() {
        this.f5183u = true;
        this.f5177M.invoke();
        m3284Z0();
        if (w20.m4833a(this.f5167C, 0L)) {
            return;
        }
        this.f5180r.m278N();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U0 */
    public final void m3280U0() {
        boolean zM3515f = rj0.m3515f(1048576);
        oe0 oe0VarM3269I0 = m3269I0(zM3515f);
        if (oe0VarM3269I0 == null || (oe0VarM3269I0.f4529d.f4532g & 1048576) == 0) {
            return;
        }
        oe0 oe0VarMo436G0 = mo436G0();
        if (!zM3515f && (oe0VarMo436G0 = oe0VarMo436G0.f4533h) == null) {
            return;
        }
        for (oe0 oe0VarM3269I02 = m3269I0(zM3515f); oe0VarM3269I02 != null && (oe0VarM3269I02.f4532g & 1048576) != 0; oe0VarM3269I02 = oe0VarM3269I02.f4534i) {
            if ((oe0VarM3269I02.f4531f & 1048576) != 0) {
                oe0 oe0VarM3050f = oe0VarM3269I02;
                sh0 sh0Var = null;
                while (oe0VarM3050f != null) {
                    if ((oe0VarM3050f.f4531f & 1048576) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                        int i = 0;
                        for (oe0 oe0Var = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var != null; oe0Var = oe0Var.f4534i) {
                            if ((oe0Var.f4531f & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    oe0VarM3050f = oe0Var;
                                } else {
                                    if (sh0Var == null) {
                                        sh0Var = new sh0(new oe0[16]);
                                    }
                                    if (oe0VarM3050f != null) {
                                        sh0Var.m4072b(oe0VarM3050f);
                                        oe0VarM3050f = null;
                                    }
                                    sh0Var.m4072b(oe0Var);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    oe0VarM3050f = pf1.m3050f(sh0Var);
                }
            }
            if (oe0VarM3269I02 == oe0VarMo436G0) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:141:0x01e4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:143:0x01a0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:145:0x01a0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:148:0x01de */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:153:0x0180 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:156:0x017b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:62:0x0172 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x017e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:96:0x01d5 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0184 A[PHI: r4
  0x0184: PHI (r4v20 ??) = (r4v1 ??), (r4v1 ??), (r4v22 ??) binds: [B:50:0x0150, B:52:0x0154, B:66:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v10, types: [oe0] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [oe0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [oe0] */
    /* JADX WARN: Type inference failed for: r3v23, types: [oe0] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v20, types: [sh0] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [sh0] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [sh0] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [sh0] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX INFO: renamed from: V0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3281V0(oe0 oe0Var, C0675r3 c0675r3, long j, C0632py c0632py, int i, boolean z, float f, boolean z2) {
        ?? M3050f;
        boolean z3;
        int i2;
        if (oe0Var == null) {
            mo437M0(c0675r3, j, c0632py, i, z);
            return;
        }
        int i3 = i;
        if (i3 == 3 || i3 == 4) {
            ?? r3 = oe0Var;
            ?? sh0Var = 0;
            while (true) {
                if (r3 == 0) {
                    break;
                }
                if (r3 instanceof qr0) {
                    int i4 = AbstractC0307i4.f2439t;
                    long j2 = AbstractC0307i4.f2438s;
                    int i5 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i5);
                    b60 b60Var = this.f5180r;
                    k50 k50Var = b60Var.f389C;
                    long j3 = Long.MIN_VALUE & Long.MIN_VALUE;
                    k50 k50Var2 = k50.f3015d;
                    if (fIntBitsToFloat >= (-((j3 == 0 || k50Var == k50Var2) ? jo0.m1728l(0, Long.MIN_VALUE) : jo0.m1728l(2, Long.MIN_VALUE)))) {
                        if (Float.intBitsToFloat(i5) < mo5002U() + ((j3 == 0 || b60Var.f389C == k50Var2) ? jo0.m1728l(2, Long.MIN_VALUE) : jo0.m1728l(0, Long.MIN_VALUE))) {
                            int i6 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i6) >= (-jo0.m1728l(1, Long.MIN_VALUE))) {
                                if (Float.intBitsToFloat(i6) < jo0.m1728l(3, Long.MIN_VALUE) + mo5001S()) {
                                    oj0 oj0Var = new oj0(this, oe0Var, c0675r3, j, c0632py, i3, z, f, z2);
                                    yg0 yg0Var = c0632py.f4985e;
                                    dh0 dh0Var = c0632py.f4984d;
                                    int i7 = c0632py.f4986f;
                                    int i8 = dh0Var.f1109b;
                                    if (i7 == i8 - 1) {
                                        c0632py.m3164b(i7 + 1, i8);
                                        c0632py.f4986f++;
                                        dh0Var.m697a(oe0Var);
                                        yg0Var.m5257a(pf1.m3047c(0.0f, z, true));
                                        oj0Var.invoke();
                                        c0632py.f4986f = i7;
                                        return;
                                    }
                                    long jM3163a = c0632py.m3163a();
                                    int i9 = c0632py.f4986f;
                                    if (!p30.m2976L(jM3163a)) {
                                        if (p30.m2965A(jM3163a) > 0.0f) {
                                            int i10 = c0632py.f4986f;
                                            c0632py.m3164b(i10 + 1, dh0Var.f1109b);
                                            c0632py.f4986f++;
                                            dh0Var.m697a(oe0Var);
                                            yg0Var.m5257a(pf1.m3047c(0.0f, z, true));
                                            oj0Var.invoke();
                                            c0632py.f4986f = i10;
                                            return;
                                        }
                                        return;
                                    }
                                    int i11 = dh0Var.f1109b;
                                    int i12 = i11 - 1;
                                    c0632py.f4986f = i12;
                                    c0632py.m3164b(i11, dh0Var.f1109b);
                                    c0632py.f4986f++;
                                    dh0Var.m697a(oe0Var);
                                    yg0Var.m5257a(pf1.m3047c(0.0f, z, true));
                                    oj0Var.invoke();
                                    c0632py.f4986f = i12;
                                    if (p30.m2965A(c0632py.m3163a()) < 0.0f) {
                                        c0632py.m3164b(i9 + 1, c0632py.f4986f + 1);
                                    }
                                    c0632py.f4986f = i9;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((r3.f4531f & 16) == 0 || !(r3 instanceof AbstractC0731sm)) {
                        M3050f = pf1.m3050f(sh0Var);
                    } else {
                        oe0 oe0Var2 = ((AbstractC0731sm) r3).f5782s;
                        int i13 = 0;
                        M3050f = r3;
                        sh0Var = sh0Var;
                        while (oe0Var2 != null) {
                            if ((oe0Var2.f4531f & 16) != 0) {
                                i13++;
                                sh0Var = sh0Var;
                                if (i13 == 1) {
                                    M3050f = oe0Var2;
                                } else {
                                    if (sh0Var == 0) {
                                        sh0Var = new sh0(new oe0[16]);
                                    }
                                    if (M3050f != 0) {
                                        sh0Var.m4072b(M3050f);
                                        M3050f = 0;
                                    }
                                    sh0Var.m4072b(oe0Var2);
                                }
                            }
                            oe0Var2 = oe0Var2.f4534i;
                            M3050f = M3050f;
                            sh0Var = sh0Var;
                        }
                        if (i13 == 1) {
                        }
                    }
                    i3 = i;
                    r3 = M3050f;
                    sh0Var = sh0Var;
                }
            }
        }
        if (z2) {
            m3271K0(oe0Var, c0675r3, j, c0632py, i, z, f);
            return;
        }
        switch (c0675r3.f5286d) {
            case 28:
                ?? sh0Var2 = 0;
                ?? M3050f2 = oe0Var;
                while (M3050f2 != 0) {
                    if (M3050f2 instanceof qr0) {
                        z3 = ((qr0) M3050f2).mo3327e0();
                        break;
                    } else if ((M3050f2.f4531f & 16) != 0 && (M3050f2 instanceof AbstractC0731sm)) {
                        oe0 oe0Var3 = ((AbstractC0731sm) M3050f2).f5782s;
                        int i14 = 0;
                        M3050f2 = M3050f2;
                        sh0Var2 = sh0Var2;
                        while (oe0Var3 != null) {
                            if ((oe0Var3.f4531f & 16) != 0) {
                                i14++;
                                sh0Var2 = sh0Var2;
                                if (i14 == 1) {
                                    M3050f2 = oe0Var3;
                                } else {
                                    if (sh0Var2 == 0) {
                                        sh0Var2 = new sh0(new oe0[16]);
                                    }
                                    if (M3050f2 != 0) {
                                        sh0Var2.m4072b(M3050f2);
                                        M3050f2 = 0;
                                    }
                                    sh0Var2.m4072b(oe0Var3);
                                }
                            }
                            oe0Var3 = oe0Var3.f4534i;
                            M3050f2 = M3050f2;
                            sh0Var2 = sh0Var2;
                        }
                        if (i14 == 1) {
                        }
                    }
                    M3050f2 = pf1.m3050f(sh0Var2);
                }
            default:
                break;
        }
        if (!z3) {
            m3281V0(v50.m4400d(oe0Var, c0675r3.m3377e()), c0675r3, j, c0632py, i, z, f, false);
            return;
        }
        pj0 pj0Var = new pj0(this, oe0Var, c0675r3, j, c0632py, i, z, f);
        yg0 yg0Var2 = c0632py.f4985e;
        dh0 dh0Var2 = c0632py.f4984d;
        int i15 = c0632py.f4986f;
        int i16 = dh0Var2.f1109b;
        if (i15 != i16 - 1) {
            long jM3163a2 = c0632py.m3163a();
            int i17 = c0632py.f4986f;
            int i18 = dh0Var2.f1109b;
            int i19 = i18 - 1;
            c0632py.f4986f = i19;
            c0632py.m3164b(i18, dh0Var2.f1109b);
            c0632py.f4986f++;
            dh0Var2.m697a(oe0Var);
            yg0Var2.m5257a(pf1.m3047c(f, z, false));
            pj0Var.invoke();
            c0632py.f4986f = i19;
            long jM3163a3 = c0632py.m3163a();
            if (c0632py.f4986f + 1 >= dh0Var2.f1109b - 1 || p30.m3010t(jM3163a2, jM3163a3) <= 0) {
                c0632py.m3164b(c0632py.f4986f + 1, dh0Var2.f1109b);
            } else {
                int i20 = i17 + 1;
                boolean zM2976L = p30.m2976L(jM3163a3);
                int i21 = c0632py.f4986f;
                c0632py.m3164b(i20, zM2976L ? i21 + 2 : i21 + 1);
            }
            c0632py.f4986f = i17;
            return;
        }
        int i22 = i15 + 1;
        c0632py.m3164b(i22, i16);
        c0632py.f4986f++;
        dh0Var2.m697a(oe0Var);
        yg0Var2.m5257a(pf1.m3047c(f, z, false));
        pj0Var.invoke();
        c0632py.f4986f = i15;
        if (i22 == dh0Var2.f1109b - 1 || p30.m2976L(c0632py.m3163a())) {
            int i23 = c0632py.f4986f;
            int i24 = i23 + 1;
            dh0Var2.m707k(i24);
            if (i24 < 0 || i24 >= (i2 = yg0Var2.f7622b)) {
                C0921xc.m5125f("Index must be between 0 and size");
                return;
            }
            long[] jArr = yg0Var2.f7621a;
            long j4 = jArr[i24];
            if (i24 != i2 - 1) {
                AbstractC0201f9.m1056b0(jArr, jArr, i24, i23 + 2, i2);
            }
            yg0Var2.f7622b--;
        }
    }

    /* JADX INFO: renamed from: W0 */
    public abstract void mo438W0(InterfaceC0051bd interfaceC0051bd, C0868vx c0868vx);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X0 */
    public final void m3282X0(long j, float f, InterfaceC0742sw interfaceC0742sw) {
        m3287c1(interfaceC0742sw, false);
        boolean zM4833a = w20.m4833a(this.f5167C, j);
        b60 b60Var = this.f5180r;
        if (!zM4833a) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var)).m4852I(-4.0f);
            this.f5167C = j;
            b60Var.f396J.f1607p.m5006e0();
            cn0 cn0Var = this.f5179O;
            if (cn0Var != null) {
                ((C0942xx) cn0Var).m5174d(j);
            } else {
                qj0 qj0Var = this.f5182t;
                if (qj0Var != null) {
                    qj0Var.m3273N0();
                }
            }
            b60Var.m278N();
            yb0.m5231s0(this);
            dn0 dn0Var = b60Var.f419r;
            if (dn0Var != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) dn0Var).m4862v(b60Var);
            }
        }
        this.f5168D = f;
        if (this == b60Var.f395I.f3996d) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var)).getRectManager().m4352f(b60Var, false);
        }
        if (this.f7597n) {
            return;
        }
        m5234e0(mo56o0());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y0 */
    public final void m3283Y0(ih0 ih0Var, boolean z, boolean z2) {
        cn0 cn0Var = this.f5179O;
        if (cn0Var != null) {
            if (this.f5184v) {
                if (z2) {
                    long jM3267F0 = m3267F0();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jM3267F0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM3267F0 & 4294967295L)) / 2.0f;
                    long j = this.f7402f;
                    ih0Var.m1579a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (j & 4294967295L)) + fIntBitsToFloat2);
                } else if (z) {
                    long j2 = this.f7402f;
                    ih0Var.m1579a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (ih0Var.m1580b()) {
                    return;
                }
            }
            C0942xx c0942xx = (C0942xx) cn0Var;
            float[] fArrM5172b = c0942xx.m5172b();
            if (!c0942xx.f7449v) {
                if (fArrM5172b == null) {
                    ih0Var.f2568a = 0.0f;
                    ih0Var.f2569b = 0.0f;
                    ih0Var.f2570c = 0.0f;
                    ih0Var.f2571d = 0.0f;
                } else {
                    r60.m3418t(fArrM5172b, ih0Var);
                }
            }
        }
        long j3 = this.f5167C;
        float f = (int) (j3 >> 32);
        ih0Var.f2568a += f;
        ih0Var.f2570c += f;
        float f2 = (int) (j3 & 4294967295L);
        ih0Var.f2569b += f2;
        ih0Var.f2571d += f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z0 */
    public final void m3284Z0() {
        if (this.f5179O != null) {
            m3287c1(null, false);
            this.f5180r.m285W(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:116:0x00c6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:119:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:121:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:124:0x00c0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x00b7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [oe0] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [oe0] */
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
    /* JADX WARN: Type inference failed for: r9v5, types: [sh0] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [sh0] */
    /* JADX INFO: renamed from: a1 */
    public final void m3285a1(yd0 yd0Var) {
        qj0 qj0Var;
        yd0 yd0Var2 = this.f5165A;
        if (yd0Var != yd0Var2) {
            this.f5165A = yd0Var;
            b60 b60Var = this.f5180r;
            int i = 0;
            if (yd0Var2 == null || yd0Var.mo670e() != yd0Var2.mo670e() || yd0Var.mo669c() != yd0Var2.mo669c()) {
                int iMo670e = yd0Var.mo670e();
                int iMo669c = yd0Var.mo669c();
                cn0 cn0Var = this.f5179O;
                if (cn0Var != null) {
                    ((C0942xx) cn0Var).m5175e((((long) iMo670e) << 32) | (((long) iMo669c) & 4294967295L));
                } else if (b60Var.m273I() && (qj0Var = this.f5182t) != null) {
                    qj0Var.m3273N0();
                }
                m5145Y((((long) iMo669c) & 4294967295L) | (((long) iMo670e) << 32));
                if (this.f5185w != null) {
                    m3288d1(false);
                }
                boolean zM3515f = rj0.m3515f(4);
                oe0 oe0VarMo436G0 = mo436G0();
                if (zM3515f || (oe0VarMo436G0 = oe0VarMo436G0.f4533h) != null) {
                    for (oe0 oe0VarM3269I0 = m3269I0(zM3515f); oe0VarM3269I0 != null && (oe0VarM3269I0.f4532g & 4) != 0; oe0VarM3269I0 = oe0VarM3269I0.f4534i) {
                        if ((oe0VarM3269I0.f4531f & 4) != 0) {
                            ?? M3050f = oe0VarM3269I0;
                            ?? sh0Var = 0;
                            while (M3050f != 0) {
                                if (M3050f instanceof InterfaceC0775tq) {
                                    ((InterfaceC0775tq) M3050f).mo2489d0();
                                } else if ((M3050f.f4531f & 4) != 0 && (M3050f instanceof AbstractC0731sm)) {
                                    oe0 oe0Var = ((AbstractC0731sm) M3050f).f5782s;
                                    int i2 = 0;
                                    M3050f = M3050f;
                                    sh0Var = sh0Var;
                                    while (oe0Var != null) {
                                        if ((oe0Var.f4531f & 4) != 0) {
                                            i2++;
                                            sh0Var = sh0Var;
                                            if (i2 == 1) {
                                                M3050f = oe0Var;
                                            } else {
                                                if (sh0Var == 0) {
                                                    sh0Var = new sh0(new oe0[16]);
                                                }
                                                if (M3050f != 0) {
                                                    sh0Var.m4072b(M3050f);
                                                    M3050f = 0;
                                                }
                                                sh0Var.m4072b(oe0Var);
                                            }
                                        }
                                        oe0Var = oe0Var.f4534i;
                                        M3050f = M3050f;
                                        sh0Var = sh0Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M3050f = pf1.m3050f(sh0Var);
                            }
                        }
                        if (oe0VarM3269I0 == oe0VarMo436G0) {
                            break;
                        }
                    }
                }
                dn0 dn0Var = b60Var.f419r;
                if (dn0Var != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) dn0Var).m4862v(b60Var);
                }
            }
            ch0 ch0Var = this.f5166B;
            if ((ch0Var == null || ch0Var.f814e == 0) && yd0Var.mo667a().isEmpty()) {
                return;
            }
            ch0 ch0Var2 = this.f5166B;
            Map mapMo667a = yd0Var.mo667a();
            if (ch0Var2 != null && ch0Var2.f814e == mapMo667a.size()) {
                Object[] objArr = ch0Var2.f811b;
                int[] iArr = ch0Var2.f812c;
                long[] jArr = ch0Var2.f810a;
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
                                Integer num = (Integer) mapMo667a.get((AbstractC0535o2) obj);
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
            b60Var.f396J.f1607p.f7112z.m496f();
            ch0 ch0Var3 = this.f5166B;
            if (ch0Var3 == null) {
                ch0 ch0Var4 = jk0.f2910a;
                ch0Var3 = new ch0();
                this.f5166B = ch0Var3;
            }
            ch0Var3.m531a();
            for (Map.Entry entry : yd0Var.mo667a().entrySet()) {
                ch0Var3.m537g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: b */
    public final float mo48b() {
        return this.f5180r.f388B.mo48b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b1 */
    public final st0 m3286b1() {
        if (mo436G0().f4542q) {
            i50 i50VarM1662l = j50.m1662l(this);
            ih0 ih0Var = this.f5169E;
            if (ih0Var == null) {
                ih0Var = new ih0();
                this.f5169E = ih0Var;
            }
            long jM3292x0 = m3292x0(m3267F0());
            int i = (int) (jM3292x0 >> 32);
            ih0Var.f2568a = -Float.intBitsToFloat(i);
            int i2 = (int) (jM3292x0 & 4294967295L);
            ih0Var.f2569b = -Float.intBitsToFloat(i2);
            ih0Var.f2570c = Float.intBitsToFloat(i) + mo5002U();
            ih0Var.f2571d = Float.intBitsToFloat(i2) + mo5001S();
            while (this != i50VarM1662l) {
                this.m3283Y0(ih0Var, false, true);
                if (!ih0Var.m1580b()) {
                    this = this.f5182t;
                    this.getClass();
                }
            }
            return new st0(ih0Var.f2568a, ih0Var.f2569b, ih0Var.f2570c, ih0Var.f2571d);
        }
        return st0.f5831e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c1 */
    public final void m3287c1(InterfaceC0742sw interfaceC0742sw, boolean z) {
        dn0 dn0Var;
        sh0 sh0Var;
        Reference referencePoll;
        C0459m4 c0459m4;
        sh0 sh0Var2;
        Reference referencePoll2;
        Object obj;
        int i = 0;
        b60 b60Var = this.f5180r;
        boolean z2 = (!z && this.f5185w == interfaceC0742sw && p30.m3002l(this.f5186x, b60Var.f388B) && this.f5187y == b60Var.f389C) ? false : true;
        this.f5186x = b60Var.f388B;
        this.f5187y = b60Var.f389C;
        boolean zM272H = b60Var.m272H();
        nj0 nj0Var = this.f5177M;
        if (!zM272H || interfaceC0742sw == null) {
            this.f5185w = null;
            cn0 cn0Var = this.f5179O;
            if (cn0Var != null) {
                C0942xx c0942xx = (C0942xx) cn0Var;
                if (!w60.m4919z(c0942xx.m5172b())) {
                    b60Var.m278N();
                }
                c0942xx.f7434g = null;
                c0942xx.f7435h = null;
                c0942xx.f7437j = true;
                c0942xx.m5176f(false);
                InterfaceC0819ux interfaceC0819ux = c0942xx.f7432e;
                if (interfaceC0819ux != null) {
                    interfaceC0819ux.mo4004a(c0942xx.f7431d);
                    ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = c0942xx.f7433f;
                    C0111d c0111d = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6986w0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) c0111d.f920f;
                        sh0Var = (sh0) c0111d.f919e;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            sh0Var.m4080j(referencePoll);
                        }
                    } while (referencePoll != null);
                    sh0Var.m4072b(new WeakReference(c0942xx, (ReferenceQueue) c0111d.f920f));
                    viewTreeObserverOnGlobalLayoutListenerC0875w3.f6923G.m706j(c0942xx);
                }
                b60Var.f399M = true;
                nj0Var.invoke();
                if (mo436G0().f4542q && b60Var.m273I() && (dn0Var = b60Var.f419r) != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) dn0Var).m4862v(b60Var);
                }
            }
            this.f5179O = null;
            this.f5178N = false;
            return;
        }
        this.f5185w = interfaceC0742sw;
        if (this.f5179O != null) {
            if (z2) {
                m3288d1(true);
                return;
            }
            return;
        }
        dn0 dn0VarM789a = e60.m789a(b60Var);
        C0459m4 c0459m42 = this.f5176L;
        if (c0459m42 == null) {
            C0459m4 c0459m43 = new C0459m4(3, this, new nj0(this, i));
            this.f5176L = c0459m43;
            c0459m4 = c0459m43;
        } else {
            c0459m4 = c0459m42;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w32 = (ViewTreeObserverOnGlobalLayoutListenerC0875w3) dn0VarM789a;
        C0111d c0111d2 = viewTreeObserverOnGlobalLayoutListenerC0875w32.f6986w0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) c0111d2.f920f;
            sh0Var2 = (sh0) c0111d2.f919e;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                sh0Var2.m4080j(referencePoll2);
            }
        } while (referencePoll2 != null);
        while (true) {
            int i2 = sh0Var2.f5770f;
            if (i2 == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) sh0Var2.m4081k(i2 - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        cn0 c0942xx2 = (cn0) obj;
        if (c0942xx2 != null) {
            C0942xx c0942xx3 = (C0942xx) c0942xx2;
            InterfaceC0819ux interfaceC0819ux2 = c0942xx3.f7432e;
            if (interfaceC0819ux2 == null) {
                throw AbstractC0748t1.m4149g("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!c0942xx3.f7431d.f6855s) {
                w10.m4823a("layer should have been released before reuse");
            }
            c0942xx3.f7431d = interfaceC0819ux2.mo4005b();
            c0942xx3.f7437j = false;
            c0942xx3.f7434g = c0459m4;
            c0942xx3.f7435h = nj0Var;
            c0942xx3.f7447t = false;
            c0942xx3.f7448u = false;
            c0942xx3.f7449v = true;
            r60.m3392A(c0942xx3.f7438k);
            float[] fArr = c0942xx3.f7439l;
            if (fArr != null) {
                r60.m3392A(fArr);
            }
            c0942xx3.f7445r = t81.f5953a;
            c0942xx3.f7450w = false;
            c0942xx3.f7436i = 9223372034707292159L;
            c0942xx3.f7446s = null;
            c0942xx3.f7444q = 0;
        } else {
            c0942xx2 = new C0942xx(viewTreeObserverOnGlobalLayoutListenerC0875w32.getGraphicsContext().mo4005b(), viewTreeObserverOnGlobalLayoutListenerC0875w32.getGraphicsContext(), viewTreeObserverOnGlobalLayoutListenerC0875w32, c0459m4, nj0Var);
        }
        C0942xx c0942xx4 = (C0942xx) c0942xx2;
        c0942xx4.m5175e(this.f7402f);
        c0942xx4.m5174d(this.f5167C);
        this.f5179O = c0942xx2;
        m3288d1(true);
        b60Var.f399M = true;
        nj0Var.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.i50
    /* JADX INFO: renamed from: d */
    public final long mo344d(long j) {
        if (!mo436G0().f4542q) {
            w10.m4824b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(this.f5180r)).m4858r(m3275P0(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d1 */
    public final void m3288d1(boolean z) {
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3;
        boolean z2;
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w32;
        dn0 dn0Var;
        InterfaceC0298hw interfaceC0298hw;
        InterfaceC0298hw interfaceC0298hw2;
        cn0 cn0Var = this.f5179O;
        InterfaceC0742sw interfaceC0742sw = this.f5185w;
        if (cn0Var == null) {
            if (interfaceC0742sw == null) {
                return;
            }
            w10.m4824b("null layer with a non-null layerBlock");
            return;
        }
        if (interfaceC0742sw == null) {
            throw AbstractC0748t1.m4149g("updateLayerParameters requires a non-null layerBlock");
        }
        gv0 gv0Var = f5161P;
        gv0Var.m1259a();
        b60 b60Var = this.f5180r;
        gv0Var.f2075p = b60Var.f388B;
        gv0Var.f2076q = b60Var.f389C;
        gv0Var.f2074o = o30.m2759C(this.f7402f);
        ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var)).getSnapshotObserver().f1778a.m777b(this, C0601p3.f4727u, new C0458m3(8, interfaceC0742sw, this));
        f50 f50Var = this.f5170F;
        if (f50Var == null) {
            f50Var = new f50();
            this.f5170F = f50Var;
        }
        f50 f50Var2 = f5162Q;
        f50Var2.getClass();
        f50Var2.f1582a = f50Var.f1582a;
        f50Var2.f1583b = f50Var.f1583b;
        f50Var2.f1584c = f50Var.f1584c;
        f50Var2.f1585d = f50Var.f1585d;
        float f = gv0Var.f2064e;
        f50Var.f1582a = f;
        f50Var.f1583b = gv0Var.f2065f;
        f50Var.f1584c = gv0Var.f2070k;
        long j = gv0Var.f2071l;
        f50Var.f1585d = j;
        C0942xx c0942xx = (C0942xx) cn0Var;
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w33 = c0942xx.f7433f;
        int i = gv0Var.f2063d | c0942xx.f7444q;
        c0942xx.f7442o = gv0Var.f2076q;
        c0942xx.f7441n = gv0Var.f2075p;
        int i2 = i & 4096;
        if (i2 != 0) {
            c0942xx.f7445r = j;
        }
        if ((i & 1) != 0) {
            C1020zx c1020zx = c0942xx.f7431d.f6837a;
            if (c1020zx.f8019j != f) {
                c1020zx.f8019j = f;
                c1020zx.f8012c.setScaleX(f);
            }
        }
        if ((i & 2) != 0) {
            C0868vx c0868vx = c0942xx.f7431d;
            float f2 = gv0Var.f2065f;
            C1020zx c1020zx2 = c0868vx.f6837a;
            if (c1020zx2.f8020k != f2) {
                c1020zx2.f8020k = f2;
                c1020zx2.f8012c.setScaleY(f2);
            }
        }
        if ((i & 4) != 0) {
            C0868vx c0868vx2 = c0942xx.f7431d;
            float f3 = gv0Var.f2066g;
            C1020zx c1020zx3 = c0868vx2.f6837a;
            if (c1020zx3.f8017h != f3) {
                c1020zx3.f8017h = f3;
                c1020zx3.f8012c.setAlpha(f3);
            }
        }
        if ((i & 8) != 0) {
            C1020zx c1020zx4 = c0942xx.f7431d.f6837a;
        }
        if ((i & 16) != 0) {
            C1020zx c1020zx5 = c0942xx.f7431d.f6837a;
        }
        if ((i & 32) != 0) {
            C0868vx c0868vx3 = c0942xx.f7431d;
            float f4 = gv0Var.f2067h;
            C1020zx c1020zx6 = c0868vx3.f6837a;
            if (c1020zx6.f8021l != f4) {
                c1020zx6.f8021l = f4;
                c1020zx6.f8012c.setElevation(f4);
                c0868vx3.f6843g = true;
                c0868vx3.m4794a();
            }
            if (gv0Var.f2067h > 0.0f && !c0942xx.f7450w && (interfaceC0298hw2 = c0942xx.f7435h) != null) {
                interfaceC0298hw2.invoke();
            }
        }
        if ((i & 64) != 0) {
            C0868vx c0868vx4 = c0942xx.f7431d;
            long j2 = gv0Var.f2068i;
            C1020zx c1020zx7 = c0868vx4.f6837a;
            if (!C0207ff.m1094c(j2, c1020zx7.f8022m)) {
                c1020zx7.f8022m = j2;
                c1020zx7.f8012c.setAmbientShadowColor(p30.m2987W(j2));
            }
        }
        if ((i & 128) != 0) {
            C0868vx c0868vx5 = c0942xx.f7431d;
            long j3 = gv0Var.f2069j;
            C1020zx c1020zx8 = c0868vx5.f6837a;
            if (!C0207ff.m1094c(j3, c1020zx8.f8023n)) {
                c1020zx8.f8023n = j3;
                c1020zx8.f8012c.setSpotShadowColor(p30.m2987W(j3));
            }
        }
        if ((i & 1024) != 0) {
            C1020zx c1020zx9 = c0942xx.f7431d.f6837a;
        }
        if ((i & 256) != 0) {
            C1020zx c1020zx10 = c0942xx.f7431d.f6837a;
        }
        if ((i & 512) != 0) {
            C1020zx c1020zx11 = c0942xx.f7431d.f6837a;
        }
        if ((i & 2048) != 0) {
            C0868vx c0868vx6 = c0942xx.f7431d;
            float f5 = gv0Var.f2070k;
            C1020zx c1020zx12 = c0868vx6.f6837a;
            if (c1020zx12.f8024o != f5) {
                c1020zx12.f8024o = f5;
                c1020zx12.f8012c.setCameraDistance(f5);
            }
        }
        if (i2 != 0) {
            long j4 = c0942xx.f7445r;
            boolean z3 = j4 == t81.f5953a;
            C0868vx c0868vx7 = c0942xx.f7431d;
            if (z3) {
                c0868vx7.m4800g(9205357640488583168L);
            } else {
                c0868vx7.m4800g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0942xx.f7445r & 4294967295L)) * ((int) (c0942xx.f7436i & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j4 >> 32)) * ((int) (c0942xx.f7436i >> 32)))) << 32));
            }
        }
        if ((i & 16384) != 0) {
            C0868vx c0868vx8 = c0942xx.f7431d;
            boolean z4 = gv0Var.f2073n;
            if (c0868vx8.f6859w != z4) {
                c0868vx8.f6859w = z4;
                c0868vx8.f6843g = true;
                c0868vx8.m4794a();
            }
        }
        if ((131072 & i) != 0) {
            C1020zx c1020zx13 = c0942xx.f7431d.f6837a;
        }
        if ((262144 & i) != 0) {
            C1020zx c1020zx14 = c0942xx.f7431d.f6837a;
        }
        if ((524288 & i) != 0) {
            C0868vx c0868vx9 = c0942xx.f7431d;
            int i3 = gv0Var.f2077r;
            C1020zx c1020zx15 = c0868vx9.f6837a;
            if (c1020zx15.f8018i != i3) {
                c1020zx15.f8018i = i3;
                Paint paint = c1020zx15.f8014e;
                if (paint == null) {
                    paint = new Paint();
                    c1020zx15.f8014e = paint;
                }
                paint.setBlendMode(o30.m2758B(i3));
                c1020zx15.m5618c();
            }
        }
        if ((32768 & i) != 0) {
            C1020zx c1020zx16 = c0942xx.f7431d.f6837a;
            if (c1020zx16.f8028s != 0) {
                c1020zx16.f8028s = 0;
                c1020zx16.m5618c();
            }
        }
        if ((i & 7963) != 0) {
            c0942xx.f7447t = true;
            c0942xx.f7448u = true;
        }
        if (p30.m3002l(c0942xx.f7446s, gv0Var.f2078s)) {
            viewTreeObserverOnGlobalLayoutListenerC0875w3 = viewTreeObserverOnGlobalLayoutListenerC0875w33;
            z2 = false;
        } else {
            v50 v50Var = gv0Var.f2078s;
            c0942xx.f7446s = v50Var;
            if (v50Var == null) {
                viewTreeObserverOnGlobalLayoutListenerC0875w3 = viewTreeObserverOnGlobalLayoutListenerC0875w33;
            } else {
                C0868vx c0868vx10 = c0942xx.f7431d;
                if (v50Var instanceof xm0) {
                    st0 st0Var = ((xm0) v50Var).f7375a;
                    float f6 = st0Var.f5832a;
                    float f7 = st0Var.f5833b;
                    viewTreeObserverOnGlobalLayoutListenerC0875w3 = viewTreeObserverOnGlobalLayoutListenerC0875w33;
                    c0868vx10.m4802i((((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), (((long) Float.floatToRawIntBits(st0Var.f5834c - f6)) << 32) | (((long) Float.floatToRawIntBits(st0Var.f5835d - f7)) & 4294967295L), 0.0f);
                } else {
                    viewTreeObserverOnGlobalLayoutListenerC0875w3 = viewTreeObserverOnGlobalLayoutListenerC0875w33;
                    if (v50Var instanceof wm0) {
                        C0118d6 c0118d6 = ((wm0) v50Var).f7150a;
                        c0868vx10.f6847k = null;
                        c0868vx10.f6845i = 9205357640488583168L;
                        c0868vx10.f6844h = 0L;
                        c0868vx10.f6846j = 0.0f;
                        c0868vx10.f6843g = true;
                        c0868vx10.f6850n = false;
                        c0868vx10.f6848l = c0118d6;
                        c0868vx10.m4794a();
                    } else {
                        if (!(v50Var instanceof ym0)) {
                            C0921xc.m5129j();
                            return;
                        }
                        ym0 ym0Var = (ym0) v50Var;
                        C0118d6 c0118d62 = ym0Var.f7658b;
                        if (c0118d62 != null) {
                            c0868vx10.f6847k = null;
                            c0868vx10.f6845i = 9205357640488583168L;
                            c0868vx10.f6844h = 0L;
                            c0868vx10.f6846j = 0.0f;
                            c0868vx10.f6843g = true;
                            c0868vx10.f6850n = false;
                            c0868vx10.f6848l = c0118d62;
                            c0868vx10.m4794a();
                        } else {
                            bw0 bw0Var = ym0Var.f7657a;
                            float f8 = bw0Var.f597b;
                            float f9 = bw0Var.f596a;
                            c0868vx10.m4802i((((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), (((long) Float.floatToRawIntBits(bw0Var.f598c - f9)) << 32) | (((long) Float.floatToRawIntBits(bw0Var.f599d - f8)) & 4294967295L), Float.intBitsToFloat((int) (bw0Var.f603h >> 32)));
                        }
                    }
                }
                if ((v50Var instanceof wm0) && Build.VERSION.SDK_INT < 33 && (interfaceC0298hw = c0942xx.f7435h) != null) {
                    interfaceC0298hw.invoke();
                }
            }
            z2 = true;
        }
        c0942xx.f7444q = gv0Var.f2063d;
        if (i != 0 || z2) {
            ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC0875w3.getParent();
            if (parent != null) {
                viewTreeObserverOnGlobalLayoutListenerC0875w32 = viewTreeObserverOnGlobalLayoutListenerC0875w3;
                parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC0875w32, viewTreeObserverOnGlobalLayoutListenerC0875w32);
            } else {
                viewTreeObserverOnGlobalLayoutListenerC0875w32 = viewTreeObserverOnGlobalLayoutListenerC0875w3;
            }
            if (viewTreeObserverOnGlobalLayoutListenerC0875w32.f6969o) {
                viewTreeObserverOnGlobalLayoutListenerC0875w32.m4852I(0.0f);
            }
        }
        boolean z5 = this.f5184v;
        boolean z6 = gv0Var.f2073n;
        this.f5184v = z6;
        this.f5188z = gv0Var.f2066g;
        boolean z7 = f50Var2.f1582a == f50Var.f1582a && f50Var2.f1583b == f50Var.f1583b && f50Var2.f1584c == f50Var.f1584c && f50Var2.f1585d == f50Var.f1585d;
        if (z && ((!z7 || z5 != z6) && (dn0Var = b60Var.f419r) != null)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) dn0Var).m4862v(b60Var);
        }
        if (z7) {
            return;
        }
        f60 f60Var = b60Var.f396J;
        if (f60Var.f1603l > 0) {
            if (f60Var.f1602k || f60Var.f1601j) {
                b60Var.m285W(false);
            }
            f60Var.f1607p.m5006e0();
        }
        b60Var.m278N();
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w34 = (ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var);
        ut0 rectManager = viewTreeObserverOnGlobalLayoutListenerC0875w34.getRectManager();
        if (this == b60Var.f395I.f3996d) {
            rectManager.m4352f(b60Var, false);
        } else {
            rectManager.getClass();
            if (b60Var.m273I()) {
                long jM4346g = ut0.m4346g(b60Var);
                if (w20.m4833a(jM4346g, 9223372034707292159L)) {
                    rectManager.m4350d(b60Var);
                } else {
                    b60Var.f410i = jM4346g;
                    b60Var.f411j = false;
                    sh0 sh0VarM319z = b60Var.m319z();
                    Object[] objArr = sh0VarM319z.f5768d;
                    int i4 = sh0VarM319z.f5770f;
                    for (int i5 = 0; i5 < i4; i5++) {
                        rectManager.m4352f((b60) objArr[i5], false);
                    }
                    rectManager.m4351e(b60Var);
                }
            }
        }
        if (b60Var.f403Q > 0) {
            C0111d c0111d = viewTreeObserverOnGlobalLayoutListenerC0875w34.f6942V.f6197e;
            c0111d.getClass();
            if (b60Var.f403Q > 0) {
                ((sh0) c0111d.f919e).m4072b(b60Var);
                b60Var.f402P = true;
            }
            viewTreeObserverOnGlobalLayoutListenerC0875w34.m4846C(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017d  */
    /* JADX INFO: renamed from: e1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3289e1(long j) {
        boolean z;
        boolean z2;
        boolean zM1218q;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        cn0 cn0Var = this.f5179O;
        if (cn0Var == null || !this.f5184v) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        C0868vx c0868vx = ((C0942xx) cn0Var).f7431d;
        if (c0868vx.f6859w) {
            v50 v50VarM4797d = c0868vx.m4797d();
            if (v50VarM4797d instanceof xm0) {
                st0 st0Var = ((xm0) v50VarM4797d).f7375a;
                if (st0Var.f5832a > fIntBitsToFloat || fIntBitsToFloat >= st0Var.f5834c || st0Var.f5833b > fIntBitsToFloat2 || fIntBitsToFloat2 >= st0Var.f5835d) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (v50VarM4797d instanceof ym0) {
                bw0 bw0Var = ((ym0) v50VarM4797d).f7657a;
                float f = bw0Var.f598c;
                float f2 = bw0Var.f597b;
                float f3 = bw0Var.f599d;
                float f4 = bw0Var.f596a;
                long j2 = bw0Var.f601f;
                long j3 = bw0Var.f603h;
                z = false;
                z2 = true;
                long j4 = bw0Var.f602g;
                long j5 = bw0Var.f600e;
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
                                    zM1218q = (fIntBitsToFloat >= fIntBitsToFloat5 || fIntBitsToFloat2 >= fIntBitsToFloat6) ? (fIntBitsToFloat >= fIntBitsToFloat12 || fIntBitsToFloat2 <= fIntBitsToFloat11) ? (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 >= fIntBitsToFloat8) ? (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) ? z2 : g60.m1218q(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, bw0Var.f602g) : g60.m1218q(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, bw0Var.f601f) : g60.m1218q(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, bw0Var.f603h) : g60.m1218q(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, bw0Var.f600e);
                                } else {
                                    C0118d6 c0118d6M1030a = AbstractC0198f6.m1030a();
                                    C0118d6.m635b(c0118d6M1030a, bw0Var);
                                    zM1218q = g60.m1216o(fIntBitsToFloat, fIntBitsToFloat2, c0118d6M1030a);
                                }
                            }
                        }
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(v50VarM4797d instanceof wm0)) {
                    C0921xc.m5129j();
                    return false;
                }
                zM1218q = g60.m1216o(fIntBitsToFloat, fIntBitsToFloat2, ((wm0) v50VarM4797d).f7150a);
            }
            zM1218q = z;
        } else {
            z = false;
            z2 = true;
        }
        return zM1218q ? z2 : z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l30
    public final k50 getLayoutDirection() {
        return this.f5180r.f389C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: h */
    public final float mo49h() {
        return this.f5180r.f388B.mo49h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.i50
    /* JADX INFO: renamed from: i */
    public final long mo345i(long j) {
        long jM3275P0 = m3275P0(j);
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = (ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(this.f5180r);
        viewTreeObserverOnGlobalLayoutListenerC0875w3.m4866z();
        return r60.m3417s(viewTreeObserverOnGlobalLayoutListenerC0875w3.f6945b0, jM3275P0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x0053 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x0062 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x001e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:46:0x001e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x005c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [oe0] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [oe0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [sh0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // p000.xq0, p000.sd0
    /* JADX INFO: renamed from: j */
    public final Object mo50j() {
        b60 b60Var = this.f5180r;
        if (!b60Var.f395I.m2600d(64)) {
            return null;
        }
        mo436G0();
        Object objMo381c0 = null;
        for (oe0 oe0Var = b60Var.f395I.f3997e; oe0Var != null; oe0Var = oe0Var.f4533h) {
            if ((oe0Var.f4531f & 64) != 0) {
                ?? M3050f = oe0Var;
                ?? sh0Var = 0;
                while (M3050f != 0) {
                    if (M3050f instanceof hp0) {
                        objMo381c0 = ((hp0) M3050f).mo381c0(objMo381c0);
                    } else if ((M3050f.f4531f & 64) != 0 && (M3050f instanceof AbstractC0731sm)) {
                        oe0 oe0Var2 = ((AbstractC0731sm) M3050f).f5782s;
                        int i = 0;
                        M3050f = M3050f;
                        sh0Var = sh0Var;
                        while (oe0Var2 != null) {
                            if ((oe0Var2.f4531f & 64) != 0) {
                                i++;
                                sh0Var = sh0Var;
                                if (i == 1) {
                                    M3050f = oe0Var2;
                                } else {
                                    if (sh0Var == 0) {
                                        sh0Var = new sh0(new oe0[16]);
                                    }
                                    if (M3050f != 0) {
                                        sh0Var.m4072b(M3050f);
                                        M3050f = 0;
                                    }
                                    sh0Var.m4072b(oe0Var2);
                                }
                            }
                            oe0Var2 = oe0Var2.f4534i;
                            M3050f = M3050f;
                            sh0Var = sh0Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M3050f = pf1.m3050f(sh0Var);
                }
            }
        }
        return objMo381c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.i50
    /* JADX INFO: renamed from: k */
    public final i50 mo346k() {
        boolean z = mo436G0().f4542q;
        b60 b60Var = this.f5180r;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (b60 b60VarM315v = b60Var; b60VarM315v != null; b60VarM315v = b60VarM315v.m315v()) {
                sb.append("\n|");
                sb.append(b60VarM315v);
                sb.append(" isAttached=");
                sb.append(b60VarM315v.m272H());
                sb.append(" modifier=");
                sb.append(b60VarM315v.f400N);
                sb.append(" tail=");
                sb.append(mo436G0());
            }
            w10.m4824b(sb.toString());
        }
        m3276Q0();
        return b60Var.f395I.f3996d.f5182t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: k0 */
    public final yb0 mo51k0() {
        return this.f5181s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: m0 */
    public final boolean mo54m0() {
        return this.f5165A != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: n0 */
    public final b60 mo55n0() {
        return this.f5180r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: o0 */
    public final yd0 mo56o0() {
        yd0 yd0Var = this.f5165A;
        if (yd0Var != null) {
            return yd0Var;
        }
        C0921xc.m5134o("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: p0 */
    public final yb0 mo57p0() {
        return this.f5182t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.en0
    /* JADX INFO: renamed from: q */
    public final boolean mo310q() {
        return (this.f5179O == null || this.f5183u || !this.f5180r.m272H()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: q0 */
    public final long mo58q0() {
        return this.f5167C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: u0 */
    public final void mo59u0() {
        mo47X(this.f5167C, this.f5168D, this.f5185w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    public final void m3290v0(qj0 qj0Var, ih0 ih0Var, boolean z) {
        if (qj0Var == this) {
            return;
        }
        qj0 qj0Var2 = this.f5182t;
        if (qj0Var2 != null) {
            qj0Var2.m3290v0(qj0Var, ih0Var, z);
        }
        long j = this.f5167C;
        float f = (int) (j >> 32);
        ih0Var.f2568a -= f;
        ih0Var.f2570c -= f;
        float f2 = (int) (j & 4294967295L);
        ih0Var.f2569b -= f2;
        ih0Var.f2571d -= f2;
        cn0 cn0Var = this.f5179O;
        if (cn0Var != null) {
            C0942xx c0942xx = (C0942xx) cn0Var;
            float[] fArrM5171a = c0942xx.m5171a();
            if (!c0942xx.f7449v) {
                if (fArrM5171a == null) {
                    ih0Var.f2568a = 0.0f;
                    ih0Var.f2569b = 0.0f;
                    ih0Var.f2570c = 0.0f;
                    ih0Var.f2571d = 0.0f;
                } else {
                    r60.m3418t(fArrM5171a, ih0Var);
                }
            }
            if (this.f5184v && z) {
                long j2 = this.f7402f;
                ih0Var.m1579a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public final long m3291w0(qj0 qj0Var, long j) {
        if (qj0Var == this) {
            return j;
        }
        qj0 qj0Var2 = this.f5182t;
        return (qj0Var2 == null || p30.m3002l(qj0Var, qj0Var2)) ? m3266D0(j) : m3266D0(qj0Var2.m3291w0(qj0Var, j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.i50
    /* JADX INFO: renamed from: x */
    public final long mo347x(i50 i50Var, long j) {
        return mo340A(i50Var, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public final long m3292x0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - mo5002U();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - mo5001S();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public final float m3293y0(long j, long j2) {
        if (mo5002U() >= Float.intBitsToFloat((int) (j2 >> 32)) && mo5001S() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM3292x0 = m3292x0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM3292x0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM3292x0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - mo5002U());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - mo5001S()))) & 4294967295L);
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
    @Override // p000.i50
    /* JADX INFO: renamed from: z */
    public final boolean mo348z() {
        return mo436G0().f4542q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public final void m3294z0(InterfaceC0051bd interfaceC0051bd, C0868vx c0868vx) {
        cn0 cn0Var = this.f5179O;
        if (cn0Var == null) {
            long j = this.f5167C;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            interfaceC0051bd.mo239e(f, f2);
            m3264A0(interfaceC0051bd, c0868vx);
            interfaceC0051bd.mo239e(-f, -f2);
            return;
        }
        C0942xx c0942xx = (C0942xx) cn0Var;
        C0125dd c0125dd = c0942xx.f7443p;
        c0942xx.m5177g();
        c0942xx.f7450w = c0942xx.f7431d.f6837a.f8021l > 0.0f;
        C0541o8 c0541o8 = c0125dd.f1053e;
        c0541o8.m2809n(interfaceC0051bd);
        c0541o8.f4481b = c0868vx;
        s91.m4058w(c0125dd, c0942xx.f7431d);
    }

    @Override // p000.yb0
    /* JADX INFO: renamed from: l0 */
    public final i50 mo52l0() {
        return this;
    }
}
