package defpackage;

import android.os.Trace;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l13 extends th1 implements j61, mc0, on2 {
    public int A;
    public int B;
    public HashMap C;
    public uw1 D;
    public j13 E;
    public k13 F;
    public String v;
    public m13 w;
    public xl0 x;
    public int y;
    public boolean z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final boolean B0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.j61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int D(kd1 kd1Var, if1 if1Var, int i) {
        uw1 uw1VarM0;
        k13 k13Var = this.F;
        if (k13Var == null) {
            uw1VarM0 = M0();
        } else {
            if (!k13Var.c) {
                k13Var = null;
            }
            if (k13Var == null || (uw1VarM0 = k13Var.d) == null) {
            }
        }
        uw1VarM0.d(kd1Var);
        return uw1VarM0.a(i, kd1Var.getLayoutDirection());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final uw1 M0() {
        m13 m13Var = this.w;
        if (this.D == null) {
            this.D = new uw1(this.v, m13Var, this.x, this.y, this.z, this.A, this.B);
        }
        uw1 uw1Var = this.D;
        uw1Var.getClass();
        return uw1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    @Override // defpackage.mc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(t61 t61Var) {
        uw1 uw1VarM0;
        if (!this.u) {
            return;
        }
        k13 k13Var = this.F;
        if (k13Var == null) {
            uw1VarM0 = M0();
        } else {
            if (!k13Var.c) {
                k13Var = null;
            }
            if (k13Var == null || (uw1VarM0 = k13Var.d) == null) {
            }
        }
        t9 t9Var = uw1VarM0.j;
        if (t9Var == null) {
            nz0.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.D + ", textSubstitution=" + this.F + ')');
            s.b();
            return;
        }
        qp qpVarQ = t61Var.h.i.q();
        boolean z = uw1VarM0.k;
        if (z) {
            long j = uw1VarM0.l;
            qpVarQ.l();
            qpVarQ.f(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
        }
        try {
            m13 m13Var = this.w;
            lt2 lt2Var = m13Var.a;
            gz2 gz2Var = lt2Var.m;
            if (gz2Var == null) {
                gz2Var = gz2.b;
            }
            gz2 gz2Var2 = gz2Var;
            bq2 bq2Var = lt2Var.n;
            if (bq2Var == null) {
                bq2Var = bq2.d;
            }
            bq2 bq2Var2 = bq2Var;
            op0 op0Var = lt2Var.o;
            if (op0Var == null) {
                op0Var = xi0.h;
            }
            op0 op0Var2 = op0Var;
            an anVarK = lt2Var.a.k();
            if (anVarK != null) {
                t9Var.g(qpVarQ, anVarK, m13Var.a.a.a(), bq2Var2, gz2Var2, op0Var2);
            } else {
                long jB = ju.g;
                if (jB == 16) {
                    jB = m13Var.b() != 16 ? m13Var.b() : ju.b;
                }
                t9Var.f(qpVarQ, jB, bq2Var2, gz2Var2, op0Var2);
            }
            if (z) {
                qpVarQ.i();
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.j61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int U(kd1 kd1Var, if1 if1Var, int i) {
        uw1 uw1VarM0;
        k13 k13Var = this.F;
        if (k13Var == null) {
            uw1VarM0 = M0();
        } else {
            if (!k13Var.c) {
                k13Var = null;
            }
            if (k13Var == null || (uw1VarM0 = k13Var.d) == null) {
            }
        }
        uw1VarM0.d(kd1Var);
        return qp0.l(uw1VarM0.e(kd1Var.getLayoutDirection()).a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:21:0x0049, B:22:0x0070, B:12:0x0015), top: B:28:0x0005 }] */
    @Override // defpackage.j61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        uw1 uw1VarM0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            k13 k13Var = this.F;
            if (k13Var == null) {
                uw1VarM0 = M0();
            } else {
                if (!k13Var.c) {
                    k13Var = null;
                }
                if (k13Var == null || (uw1VarM0 = k13Var.d) == null) {
                }
            }
            uw1VarM0.d(pf1Var);
            boolean zB = uw1VarM0.b(j, pf1Var.getLayoutDirection());
            tw1 tw1Var = uw1VarM0.n;
            if (tw1Var != null) {
                tw1Var.b();
            }
            t9 t9Var = uw1VarM0.j;
            t9Var.getClass();
            w03 w03Var = t9Var.d;
            long j2 = uw1VarM0.l;
            if (zB) {
                sp0.Z(this, 2).Z0();
                HashMap map = this.C;
                if (map == null) {
                    map = new HashMap(2);
                    this.C = map;
                }
                map.put(u5.a, Integer.valueOf(Math.round(w03Var.d(0))));
                map.put(u5.b, Integer.valueOf(Math.round(w03Var.d(w03Var.g - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            sz1 sz1VarE = if1Var.e(rp0.d0(i, i, i2, i2));
            HashMap map2 = this.C;
            map2.getClass();
            return pf1Var.j0(i, i2, map2, new pg(sz1VarE, 7));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.j61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(kd1 kd1Var, if1 if1Var, int i) {
        uw1 uw1VarM0;
        k13 k13Var = this.F;
        if (k13Var == null) {
            uw1VarM0 = M0();
        } else {
            if (!k13Var.c) {
                k13Var = null;
            }
            if (k13Var == null || (uw1VarM0 = k13Var.d) == null) {
            }
        }
        uw1VarM0.d(kd1Var);
        return qp0.l(uw1VarM0.e(kd1Var.getLayoutDirection()).c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [in0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [j13] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.on2
    public final void l0(zn2 zn2Var) {
        j13 j13Var = this.E;
        ?? r0 = j13Var;
        if (j13Var == null) {
            final int i = 0;
            ?? r02 = new in0(this) { // from class: j13
                public final /* synthetic */ l13 i;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.i = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
                @Override // defpackage.in0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object j(Object obj) {
                    e70 e70Var;
                    y03 y03Var;
                    int i2 = i;
                    l13 l13Var = this.i;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            uw1 uw1VarM0 = l13Var.M0();
                            m13 m13VarD = m13.d(l13Var.w, ju.g, 0L, null, 0L, 0, 0L, 16777214);
                            d61 d61Var = uw1VarM0.o;
                            y03 y03Var2 = null;
                            if (d61Var != null && (e70Var = uw1VarM0.i) != null) {
                                sd sdVar = new sd(uw1VarM0.a);
                                if (uw1VarM0.j == null || uw1VarM0.n == null) {
                                    y03Var = null;
                                } else {
                                    long j = uw1VarM0.p & (-8589934589L);
                                    int i3 = uw1VarM0.f;
                                    boolean z = uw1VarM0.e;
                                    int i4 = uw1VarM0.d;
                                    xl0 xl0Var = uw1VarM0.c;
                                    be0 be0Var = be0.h;
                                    y03Var = new y03(new x03(sdVar, m13VarD, be0Var, i3, z, i4, e70Var, d61Var, xl0Var, j), new lj1(new cj(sdVar, m13VarD, be0Var, e70Var, xl0Var), j, uw1VarM0.f, uw1VarM0.d), uw1VarM0.l);
                                }
                            }
                            if (y03Var != null) {
                                list.add(y03Var);
                                y03Var2 = y03Var;
                            }
                            return Boolean.valueOf(y03Var2 != null);
                        case 1:
                            String str = ((sd) obj).i;
                            k13 k13Var = l13Var.F;
                            if (k13Var == null) {
                                k13 k13Var2 = new k13(l13Var.v, str);
                                uw1 uw1Var = new uw1(str, l13Var.w, l13Var.x, l13Var.y, l13Var.z, l13Var.A, l13Var.B);
                                uw1Var.d(l13Var.M0().i);
                                k13Var2.d = uw1Var;
                                l13Var.F = k13Var2;
                            } else if (!t11.l(str, k13Var.b)) {
                                k13Var.b = str;
                                uw1 uw1Var2 = k13Var.d;
                                if (uw1Var2 != null) {
                                    m13 m13Var = l13Var.w;
                                    xl0 xl0Var2 = l13Var.x;
                                    int i5 = l13Var.y;
                                    boolean z2 = l13Var.z;
                                    int i6 = l13Var.A;
                                    int i7 = l13Var.B;
                                    uw1Var2.a = str;
                                    uw1Var2.b = m13Var;
                                    uw1Var2.c = xl0Var2;
                                    uw1Var2.d = i5;
                                    uw1Var2.e = z2;
                                    uw1Var2.f = i6;
                                    uw1Var2.g = i7;
                                    uw1Var2.s = (uw1Var2.s << 2) | 2;
                                    uw1Var2.c();
                                }
                            }
                            qp0.E(l13Var);
                            gf1.A(l13Var);
                            ci0.M(l13Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            k13 k13Var3 = l13Var.F;
                            if (k13Var3 == null) {
                                z = false;
                            } else {
                                k13Var3.c = zBooleanValue;
                                qp0.E(l13Var);
                                gf1.A(l13Var);
                                ci0.M(l13Var);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.E = r02;
            r0 = r02;
        }
        sd sdVar = new sd(this.v);
        v41[] v41VarArr = xn2.a;
        zn2Var.a(vn2.C, eu.O(sdVar));
        k13 k13Var = this.F;
        if (k13Var != null) {
            boolean z = k13Var.c;
            yn2 yn2Var = vn2.E;
            v41[] v41VarArr2 = xn2.a;
            v41 v41Var = v41VarArr2[17];
            zn2Var.a(yn2Var, Boolean.valueOf(z));
            sd sdVar2 = new sd(k13Var.b);
            yn2 yn2Var2 = vn2.D;
            v41 v41Var2 = v41VarArr2[16];
            zn2Var.a(yn2Var2, sdVar2);
        }
        final int i2 = 1;
        zn2Var.a(kn2.l, new q3(null, new in0(this) { // from class: j13
            public final /* synthetic */ l13 i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
            @Override // defpackage.in0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object j(Object obj) {
                e70 e70Var;
                y03 y03Var;
                int i22 = i2;
                l13 l13Var = this.i;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        uw1 uw1VarM0 = l13Var.M0();
                        m13 m13VarD = m13.d(l13Var.w, ju.g, 0L, null, 0L, 0, 0L, 16777214);
                        d61 d61Var = uw1VarM0.o;
                        y03 y03Var2 = null;
                        if (d61Var != null && (e70Var = uw1VarM0.i) != null) {
                            sd sdVar3 = new sd(uw1VarM0.a);
                            if (uw1VarM0.j == null || uw1VarM0.n == null) {
                                y03Var = null;
                            } else {
                                long j = uw1VarM0.p & (-8589934589L);
                                int i3 = uw1VarM0.f;
                                boolean z2 = uw1VarM0.e;
                                int i4 = uw1VarM0.d;
                                xl0 xl0Var = uw1VarM0.c;
                                be0 be0Var = be0.h;
                                y03Var = new y03(new x03(sdVar3, m13VarD, be0Var, i3, z2, i4, e70Var, d61Var, xl0Var, j), new lj1(new cj(sdVar3, m13VarD, be0Var, e70Var, xl0Var), j, uw1VarM0.f, uw1VarM0.d), uw1VarM0.l);
                            }
                        }
                        if (y03Var != null) {
                            list.add(y03Var);
                            y03Var2 = y03Var;
                        }
                        return Boolean.valueOf(y03Var2 != null);
                    case 1:
                        String str = ((sd) obj).i;
                        k13 k13Var2 = l13Var.F;
                        if (k13Var2 == null) {
                            k13 k13Var22 = new k13(l13Var.v, str);
                            uw1 uw1Var = new uw1(str, l13Var.w, l13Var.x, l13Var.y, l13Var.z, l13Var.A, l13Var.B);
                            uw1Var.d(l13Var.M0().i);
                            k13Var22.d = uw1Var;
                            l13Var.F = k13Var22;
                        } else if (!t11.l(str, k13Var2.b)) {
                            k13Var2.b = str;
                            uw1 uw1Var2 = k13Var2.d;
                            if (uw1Var2 != null) {
                                m13 m13Var = l13Var.w;
                                xl0 xl0Var2 = l13Var.x;
                                int i5 = l13Var.y;
                                boolean z22 = l13Var.z;
                                int i6 = l13Var.A;
                                int i7 = l13Var.B;
                                uw1Var2.a = str;
                                uw1Var2.b = m13Var;
                                uw1Var2.c = xl0Var2;
                                uw1Var2.d = i5;
                                uw1Var2.e = z22;
                                uw1Var2.f = i6;
                                uw1Var2.g = i7;
                                uw1Var2.s = (uw1Var2.s << 2) | 2;
                                uw1Var2.c();
                            }
                        }
                        qp0.E(l13Var);
                        gf1.A(l13Var);
                        ci0.M(l13Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        k13 k13Var3 = l13Var.F;
                        if (k13Var3 == null) {
                            z = false;
                        } else {
                            k13Var3.c = zBooleanValue;
                            qp0.E(l13Var);
                            gf1.A(l13Var);
                            ci0.M(l13Var);
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        final int i3 = 2;
        zn2Var.a(kn2.m, new q3(null, new in0(this) { // from class: j13
            public final /* synthetic */ l13 i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
            @Override // defpackage.in0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object j(Object obj) {
                e70 e70Var;
                y03 y03Var;
                int i22 = i3;
                l13 l13Var = this.i;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        uw1 uw1VarM0 = l13Var.M0();
                        m13 m13VarD = m13.d(l13Var.w, ju.g, 0L, null, 0L, 0, 0L, 16777214);
                        d61 d61Var = uw1VarM0.o;
                        y03 y03Var2 = null;
                        if (d61Var != null && (e70Var = uw1VarM0.i) != null) {
                            sd sdVar3 = new sd(uw1VarM0.a);
                            if (uw1VarM0.j == null || uw1VarM0.n == null) {
                                y03Var = null;
                            } else {
                                long j = uw1VarM0.p & (-8589934589L);
                                int i32 = uw1VarM0.f;
                                boolean z2 = uw1VarM0.e;
                                int i4 = uw1VarM0.d;
                                xl0 xl0Var = uw1VarM0.c;
                                be0 be0Var = be0.h;
                                y03Var = new y03(new x03(sdVar3, m13VarD, be0Var, i32, z2, i4, e70Var, d61Var, xl0Var, j), new lj1(new cj(sdVar3, m13VarD, be0Var, e70Var, xl0Var), j, uw1VarM0.f, uw1VarM0.d), uw1VarM0.l);
                            }
                        }
                        if (y03Var != null) {
                            list.add(y03Var);
                            y03Var2 = y03Var;
                        }
                        return Boolean.valueOf(y03Var2 != null);
                    case 1:
                        String str = ((sd) obj).i;
                        k13 k13Var2 = l13Var.F;
                        if (k13Var2 == null) {
                            k13 k13Var22 = new k13(l13Var.v, str);
                            uw1 uw1Var = new uw1(str, l13Var.w, l13Var.x, l13Var.y, l13Var.z, l13Var.A, l13Var.B);
                            uw1Var.d(l13Var.M0().i);
                            k13Var22.d = uw1Var;
                            l13Var.F = k13Var22;
                        } else if (!t11.l(str, k13Var2.b)) {
                            k13Var2.b = str;
                            uw1 uw1Var2 = k13Var2.d;
                            if (uw1Var2 != null) {
                                m13 m13Var = l13Var.w;
                                xl0 xl0Var2 = l13Var.x;
                                int i5 = l13Var.y;
                                boolean z22 = l13Var.z;
                                int i6 = l13Var.A;
                                int i7 = l13Var.B;
                                uw1Var2.a = str;
                                uw1Var2.b = m13Var;
                                uw1Var2.c = xl0Var2;
                                uw1Var2.d = i5;
                                uw1Var2.e = z22;
                                uw1Var2.f = i6;
                                uw1Var2.g = i7;
                                uw1Var2.s = (uw1Var2.s << 2) | 2;
                                uw1Var2.c();
                            }
                        }
                        qp0.E(l13Var);
                        gf1.A(l13Var);
                        ci0.M(l13Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        k13 k13Var3 = l13Var.F;
                        if (k13Var3 == null) {
                            z = false;
                        } else {
                            k13Var3.c = zBooleanValue;
                            qp0.E(l13Var);
                            gf1.A(l13Var);
                            ci0.M(l13Var);
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        zn2Var.a(kn2.n, new q3(null, new ta(29, this)));
        xn2.a(zn2Var, r0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.j61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int p(kd1 kd1Var, if1 if1Var, int i) {
        uw1 uw1VarM0;
        k13 k13Var = this.F;
        if (k13Var == null) {
            uw1VarM0 = M0();
        } else {
            if (!k13Var.c) {
                k13Var = null;
            }
            if (k13Var == null || (uw1VarM0 = k13Var.d) == null) {
            }
        }
        uw1VarM0.d(kd1Var);
        return uw1VarM0.a(i, kd1Var.getLayoutDirection());
    }
}
