package p000;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class lz0 {

    /* JADX INFO: renamed from: a */
    public ez0 f3621a;

    /* JADX INFO: renamed from: b */
    public C0343j5 f3622b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0975yt f3623c;

    /* JADX INFO: renamed from: d */
    public um0 f3624d;

    /* JADX INFO: renamed from: e */
    public boolean f3625e;

    /* JADX INFO: renamed from: f */
    public C0948y2 f3626f;

    /* JADX INFO: renamed from: g */
    public final dz0 f3627g;

    /* JADX INFO: renamed from: h */
    public final zy0 f3628h;

    /* JADX INFO: renamed from: i */
    public boolean f3629i;

    /* JADX INFO: renamed from: j */
    public int f3630j = 1;

    /* JADX INFO: renamed from: k */
    public ny0 f3631k = wy0.f7220b;

    /* JADX INFO: renamed from: l */
    public final jz0 f3632l = new jz0(this);

    /* JADX INFO: renamed from: m */
    public final C0532o f3633m = new C0532o(20, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lz0(ez0 ez0Var, C0343j5 c0343j5, InterfaceC0975yt interfaceC0975yt, um0 um0Var, boolean z, C0948y2 c0948y2, dz0 dz0Var, zy0 zy0Var) {
        this.f3621a = ez0Var;
        this.f3622b = c0343j5;
        this.f3623c = interfaceC0975yt;
        this.f3624d = um0Var;
        this.f3625e = z;
        this.f3626f = c0948y2;
        this.f3627g = dz0Var;
        this.f3628h = zy0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2090a(long j, AbstractC0358jk abstractC0358jk) throws Throwable {
        gz0 gz0Var;
        lz0 lz0Var;
        Throwable th;
        yt0 yt0Var;
        if (abstractC0358jk instanceof gz0) {
            gz0Var = (gz0) abstractC0358jk;
            int i = gz0Var.f2096j;
            if ((i & Integer.MIN_VALUE) != 0) {
                gz0Var.f2096j = i - Integer.MIN_VALUE;
            } else {
                gz0Var = new gz0(this, abstractC0358jk);
            }
        }
        Object obj = gz0Var.f2094h;
        int i2 = gz0Var.f2096j;
        if (i2 != 0) {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yt0Var = gz0Var.f2093g;
            try {
                w60.m4891M(obj);
                lz0Var = this;
                lz0Var.f3629i = false;
                return new rb1(yt0Var.f7691d);
            } catch (Throwable th2) {
                th = th2;
                lz0Var = this;
                lz0Var.f3629i = false;
                throw th;
            }
        }
        w60.m4891M(obj);
        yt0 yt0Var2 = new yt0();
        yt0Var2.f7691d = j;
        this.f3629i = true;
        try {
            vh0 vh0Var = vh0.f6718d;
            lz0Var = this;
            try {
                iz0 iz0Var = new iz0(lz0Var, yt0Var2, j, null);
                gz0Var.f2093g = yt0Var2;
                gz0Var.f2096j = 1;
                Object objM2095f = lz0Var.m2095f(vh0Var, iz0Var, gz0Var);
                EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                if (objM2095f == enumC1007zk) {
                    return enumC1007zk;
                }
                yt0Var = yt0Var2;
                lz0Var.f3629i = false;
                return new rb1(yt0Var.f7691d);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                lz0Var.f3629i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            lz0Var = this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2091b(long j, boolean z, m51 m51Var) {
        na1 na1Var = na1.f4229a;
        if (z) {
            InterfaceC0975yt interfaceC0975yt = this.f3623c;
            sx0 sx0Var = wy0.f7219a;
            if (!(interfaceC0975yt instanceof C0856vl)) {
                long jM3435a = rb1.m3435a(j, 0.0f, 0.0f, this.f3624d == um0.f6265e ? 1 : 2);
                kz0 kz0Var = new kz0(this, null);
                C0343j5 c0343j5 = this.f3622b;
                EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                if (c0343j5 == null || !(this.f3621a.mo502c() || this.f3621a.mo500a())) {
                    kz0 kz0Var2 = new kz0(kz0Var.f3292k, m51Var);
                    kz0Var2.f3291j = jM3435a;
                    Object objMo16m = kz0Var2.mo16m(na1Var);
                    if (objMo16m == enumC1007zk) {
                        return objMo16m;
                    }
                } else {
                    Object objM1641b = c0343j5.m1641b(jM3435a, kz0Var, m51Var);
                    if (objM1641b == enumC1007zk) {
                        return objM1641b;
                    }
                }
            }
        }
        return na1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:110:0x019f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:114:0x01ac */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:143:0x0096 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:152:0x01ae */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:156:0x01a8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:160:0x0091 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0088 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:42:0x0094 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22, types: [oe0] */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29, types: [oe0] */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [sh0] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [oe0] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [oe0] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [sh0] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [sh0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX INFO: renamed from: c */
    public final long m2092c(ny0 ny0Var, long j, int i) {
        int i2;
        gj0 gj0Var;
        gj0 gj0Var2;
        long j2;
        long jMo176A;
        h91 h91Var;
        mj0 mj0Var;
        ?? M3050f;
        h91 h91Var2;
        mj0 mj0Var2;
        ?? M3050f2;
        gj0 gj0Var3 = (gj0) this.f3626f.f7491d;
        int i3 = 262144;
        Object obj = null;
        if (gj0Var3 == null || !gj0Var3.f4542q) {
            i2 = 262144;
            gj0Var = null;
        } else {
            if (!gj0Var3.f4529d.f4542q) {
                w10.m4824b("visitAncestors called on an unattached node");
            }
            oe0 oe0Var = gj0Var3.f4529d.f4533h;
            b60 b60VarM3039Q = pf1.m3039Q(gj0Var3);
            loop0: while (true) {
                if (b60VarM3039Q == null) {
                    i2 = i3;
                    h91Var2 = null;
                    break;
                }
                if ((b60VarM3039Q.f395I.f3998f.f4532g & i3) != 0) {
                    while (oe0Var != null) {
                        if ((oe0Var.f4531f & i3) != 0) {
                            ?? sh0Var = 0;
                            ?? r13 = oe0Var;
                            while (r13 != 0) {
                                if (r13 instanceof h91) {
                                    h91Var2 = (h91) r13;
                                    i2 = i3;
                                    if (p30.m3002l(gj0Var3.mo1247k(), h91Var2.mo1247k()) && gj0.class == h91Var2.getClass()) {
                                        break loop0;
                                    }
                                } else {
                                    i2 = i3;
                                    if ((r13.f4531f & i2) != 0 && (r13 instanceof AbstractC0731sm)) {
                                        oe0 oe0Var2 = ((AbstractC0731sm) r13).f5782s;
                                        int i4 = 0;
                                        M3050f2 = r13;
                                        sh0Var = sh0Var;
                                        while (oe0Var2 != null) {
                                            if ((oe0Var2.f4531f & i2) != 0) {
                                                i4++;
                                                sh0Var = sh0Var;
                                                if (i4 == 1) {
                                                    M3050f2 = oe0Var2;
                                                } else {
                                                    if (sh0Var == 0) {
                                                        sh0Var = new sh0(new oe0[16]);
                                                    }
                                                    if (M3050f2 != 0) {
                                                        sh0Var.m4072b(M3050f2);
                                                        M3050f2 = 0;
                                                    }
                                                    sh0Var.m4072b(oe0Var2);
                                                }
                                            }
                                            oe0Var2 = oe0Var2.f4534i;
                                            M3050f2 = M3050f2;
                                            sh0Var = sh0Var;
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    i3 = i2;
                                    r13 = M3050f2;
                                    sh0Var = sh0Var;
                                }
                                M3050f2 = pf1.m3050f(sh0Var);
                                i3 = i2;
                                r13 = M3050f2;
                                sh0Var = sh0Var;
                            }
                        }
                        oe0Var = oe0Var.f4533h;
                        i3 = i3;
                    }
                }
                int i5 = i3;
                b60VarM3039Q = b60VarM3039Q.m315v();
                oe0Var = (b60VarM3039Q == null || (mj0Var2 = b60VarM3039Q.f395I) == null) ? null : mj0Var2.f3997e;
                i3 = i5;
            }
            gj0Var = (gj0) h91Var2;
        }
        long jMo179b0 = gj0Var != null ? gj0Var.mo179b0(i, j) : 0L;
        long jM2933d = ok0.m2933d(j, jMo179b0);
        long jM2094e = m2094e(m2097h(ny0Var.mo1511a(m2096g(m2094e(this.f3624d == um0.f6265e ? ok0.m2930a(1, jM2933d) : ok0.m2930a(2, jM2933d))))));
        dz0 dz0Var = this.f3627g;
        if (dz0Var.f4542q) {
            ViewTreeObserver viewTreeObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(dz0Var)).getViewTreeObserver();
            try {
                if (ViewTreeObserverOnGlobalLayoutListenerC0875w3.f6910O0 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    ViewTreeObserverOnGlobalLayoutListenerC0875w3.f6910O0 = declaredMethod;
                }
                Method method = ViewTreeObserverOnGlobalLayoutListenerC0875w3.f6910O0;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jM2933d2 = ok0.m2933d(jM2933d, jM2094e);
        gj0 gj0Var4 = (gj0) this.f3626f.f7491d;
        if (gj0Var4 == null || !gj0Var4.f4542q) {
            gj0Var2 = null;
        } else {
            if (!gj0Var4.f4529d.f4542q) {
                w10.m4824b("visitAncestors called on an unattached node");
            }
            oe0 oe0Var3 = gj0Var4.f4529d.f4533h;
            b60 b60VarM3039Q2 = pf1.m3039Q(gj0Var4);
            loop3: while (true) {
                if (b60VarM3039Q2 == null) {
                    h91Var = null;
                    break;
                }
                if ((b60VarM3039Q2.f395I.f3998f.f4532g & i2) != 0) {
                    while (oe0Var3 != null) {
                        if ((oe0Var3.f4531f & i2) != 0) {
                            ?? r6 = oe0Var3;
                            ?? sh0Var2 = obj;
                            while (r6 != 0) {
                                if (r6 instanceof h91) {
                                    h91 h91Var3 = (h91) r6;
                                    if (p30.m3002l(gj0Var4.mo1247k(), h91Var3.mo1247k()) && gj0.class == h91Var3.getClass()) {
                                        h91Var = h91Var3;
                                        break loop3;
                                    }
                                } else {
                                    if ((r6.f4531f & i2) != 0 && (r6 instanceof AbstractC0731sm)) {
                                        oe0 oe0Var4 = ((AbstractC0731sm) r6).f5782s;
                                        int i6 = 0;
                                        M3050f = r6;
                                        sh0Var2 = sh0Var2;
                                        while (oe0Var4 != null) {
                                            if ((oe0Var4.f4531f & i2) != 0) {
                                                i6++;
                                                sh0Var2 = sh0Var2;
                                                if (i6 == 1) {
                                                    M3050f = oe0Var4;
                                                } else {
                                                    if (sh0Var2 == 0) {
                                                        sh0Var2 = new sh0(new oe0[16]);
                                                    }
                                                    if (M3050f != 0) {
                                                        sh0Var2.m4072b(M3050f);
                                                        M3050f = 0;
                                                    }
                                                    sh0Var2.m4072b(oe0Var4);
                                                }
                                            }
                                            oe0Var4 = oe0Var4.f4534i;
                                            M3050f = M3050f;
                                            sh0Var2 = sh0Var2;
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                    r6 = M3050f;
                                    sh0Var2 = sh0Var2;
                                }
                                M3050f = pf1.m3050f(sh0Var2);
                                r6 = M3050f;
                                sh0Var2 = sh0Var2;
                            }
                        }
                        oe0Var3 = oe0Var3.f4533h;
                        obj = null;
                    }
                }
                b60VarM3039Q2 = b60VarM3039Q2.m315v();
                oe0Var3 = (b60VarM3039Q2 == null || (mj0Var = b60VarM3039Q2.f395I) == null) ? null : mj0Var.f3997e;
                obj = null;
            }
            gj0Var2 = (gj0) h91Var;
        }
        if (gj0Var2 != null) {
            jMo176A = gj0Var2.mo176A(i, jM2094e, jM2933d2);
            j2 = jM2094e;
        } else {
            j2 = jM2094e;
            jMo176A = 0;
        }
        return ok0.m2934e(ok0.m2934e(jMo179b0, j2), jMo176A);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final float m2093d(float f) {
        return this.f3625e ? f * (-1.0f) : f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final long m2094e(long j) {
        return this.f3625e ? ok0.m2935f(-1.0f, j) : j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Object m2095f(vh0 vh0Var, InterfaceC0904ww interfaceC0904ww, AbstractC0358jk abstractC0358jk) {
        Object objMo503d = this.f3621a.mo503d(vh0Var, new C0302i(this, interfaceC0904ww, null, 10), abstractC0358jk);
        return objMo503d == EnumC1007zk.f7916d ? objMo503d : na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final float m2096g(long j) {
        return Float.intBitsToFloat((int) (this.f3624d == um0.f6265e ? j >> 32 : j & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final long m2097h(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.f3624d == um0.f6265e) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final float m2098i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        um0 um0Var = this.f3624d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (um0Var == um0.f6264d) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (um0Var == um0.f6265e) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
