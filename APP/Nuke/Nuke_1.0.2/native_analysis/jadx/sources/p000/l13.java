package p000;

import android.os.Trace;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l13 extends th1 implements j61, mc0, on2 {

    /* JADX INFO: renamed from: A */
    public int f5881A;

    /* JADX INFO: renamed from: B */
    public int f5882B;

    /* JADX INFO: renamed from: C */
    public HashMap f5883C;

    /* JADX INFO: renamed from: D */
    public uw1 f5884D;

    /* JADX INFO: renamed from: E */
    public j13 f5885E;

    /* JADX INFO: renamed from: F */
    public k13 f5886F;

    /* JADX INFO: renamed from: v */
    public String f5887v;

    /* JADX INFO: renamed from: w */
    public m13 f5888w;

    /* JADX INFO: renamed from: x */
    public xl0 f5889x;

    /* JADX INFO: renamed from: y */
    public int f5890y;

    /* JADX INFO: renamed from: z */
    public boolean f5891z;

    @Override // p000.th1
    /* JADX INFO: renamed from: B0 */
    public final boolean mo210B0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // p000.j61
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo2360D(kd1 kd1Var, if1 if1Var, int i) {
        uw1 uw1VarM2783M0;
        k13 k13Var = this.f5886F;
        if (k13Var == null) {
            uw1VarM2783M0 = m2783M0();
        } else {
            if (!k13Var.f5321c) {
                k13Var = null;
            }
            if (k13Var == null || (uw1VarM2783M0 = k13Var.f5322d) == null) {
            }
        }
        uw1VarM2783M0.m5592d(kd1Var);
        return uw1VarM2783M0.m5589a(i, kd1Var.getLayoutDirection());
    }

    /* JADX INFO: renamed from: M0 */
    public final uw1 m2783M0() {
        m13 m13Var = this.f5888w;
        if (this.f5884D == null) {
            this.f5884D = new uw1(this.f5887v, m13Var, this.f5889x, this.f5890y, this.f5891z, this.f5881A, this.f5882B);
        }
        uw1 uw1Var = this.f5884D;
        uw1Var.getClass();
        return uw1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    @Override // p000.mc0
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1851P(t61 t61Var) {
        uw1 uw1VarM2783M0;
        if (!this.f10770u) {
            return;
        }
        k13 k13Var = this.f5886F;
        if (k13Var == null) {
            uw1VarM2783M0 = m2783M0();
        } else {
            if (!k13Var.f5321c) {
                k13Var = null;
            }
            if (k13Var == null || (uw1VarM2783M0 = k13Var.f5322d) == null) {
            }
        }
        C0726t9 c0726t9 = uw1VarM2783M0.f11527j;
        if (c0726t9 == null) {
            nz0.m3457b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.f5884D + ", textSubstitution=" + this.f5886F + ')');
            C0676s.m4644b();
            return;
        }
        InterfaceC0627qp interfaceC0627qpM430q = t61Var.f10581h.f10257i.m430q();
        boolean z = uw1VarM2783M0.f11528k;
        if (z) {
            long j = uw1VarM2783M0.f11529l;
            interfaceC0627qpM430q.mo1522l();
            interfaceC0627qpM430q.mo1517f(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
        }
        try {
            m13 m13Var = this.f5888w;
            lt2 lt2Var = m13Var.f6435a;
            gz2 gz2Var = lt2Var.f6313m;
            if (gz2Var == null) {
                gz2Var = gz2.f3746b;
            }
            gz2 gz2Var2 = gz2Var;
            bq2 bq2Var = lt2Var.f6314n;
            if (bq2Var == null) {
                bq2Var = bq2.f985d;
            }
            bq2 bq2Var2 = bq2Var;
            op0 op0Var = lt2Var.f6315o;
            if (op0Var == null) {
                op0Var = xi0.f13041h;
            }
            op0 op0Var2 = op0Var;
            AbstractC0024an abstractC0024anMo865k = lt2Var.f6301a.mo865k();
            if (abstractC0024anMo865k != null) {
                c0726t9.m5141g(interfaceC0627qpM430q, abstractC0024anMo865k, m13Var.f6435a.f6301a.mo863a(), bq2Var2, gz2Var2, op0Var2);
            } else {
                long jM3025b = C0363ju.f5217g;
                if (jM3025b == 16) {
                    jM3025b = m13Var.m3025b() != 16 ? m13Var.m3025b() : C0363ju.f5212b;
                }
                c0726t9.m5140f(interfaceC0627qpM430q, jM3025b, bq2Var2, gz2Var2, op0Var2);
            }
            if (z) {
                interfaceC0627qpM430q.mo1520i();
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // p000.j61
    /* JADX INFO: renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo2361U(kd1 kd1Var, if1 if1Var, int i) {
        uw1 uw1VarM2783M0;
        k13 k13Var = this.f5886F;
        if (k13Var == null) {
            uw1VarM2783M0 = m2783M0();
        } else {
            if (!k13Var.f5321c) {
                k13Var = null;
            }
            if (k13Var == null || (uw1VarM2783M0 = k13Var.f5322d) == null) {
            }
        }
        uw1VarM2783M0.m5592d(kd1Var);
        return qp0.m4257l(uw1VarM2783M0.m5593e(kd1Var.getLayoutDirection()).mo826a());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:21:0x0049, B:22:0x0070, B:12:0x0015), top: B:28:0x0005 }] */
    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        uw1 uw1VarM2783M0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            k13 k13Var = this.f5886F;
            if (k13Var == null) {
                uw1VarM2783M0 = m2783M0();
            } else {
                if (!k13Var.f5321c) {
                    k13Var = null;
                }
                if (k13Var == null || (uw1VarM2783M0 = k13Var.f5322d) == null) {
                }
            }
            uw1VarM2783M0.m5592d(pf1Var);
            boolean zM5590b = uw1VarM2783M0.m5590b(j, pf1Var.getLayoutDirection());
            tw1 tw1Var = uw1VarM2783M0.f11531n;
            if (tw1Var != null) {
                tw1Var.mo827b();
            }
            C0726t9 c0726t9 = uw1VarM2783M0.f11527j;
            c0726t9.getClass();
            w03 w03Var = c0726t9.f10616d;
            long j2 = uw1VarM2783M0.f11529l;
            if (zM5590b) {
                sp0.m4927Z(this, 2).m6457Z0();
                HashMap map = this.f5883C;
                if (map == null) {
                    map = new HashMap(2);
                    this.f5883C = map;
                }
                map.put(AbstractC0761u5.f11107a, Integer.valueOf(Math.round(w03Var.m5817d(0))));
                map.put(AbstractC0761u5.f11108b, Integer.valueOf(Math.round(w03Var.m5817d(w03Var.f12247g - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            sz1 sz1VarMo2340e = if1Var.mo2340e(rp0.m4543d0(i, i, i2, i2));
            HashMap map2 = this.f5883C;
            map2.getClass();
            return pf1Var.mo696j0(i, i2, map2, new C0579pg(sz1VarMo2340e, 7));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // p000.j61
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo2362g(kd1 kd1Var, if1 if1Var, int i) {
        uw1 uw1VarM2783M0;
        k13 k13Var = this.f5886F;
        if (k13Var == null) {
            uw1VarM2783M0 = m2783M0();
        } else {
            if (!k13Var.f5321c) {
                k13Var = null;
            }
            if (k13Var == null || (uw1VarM2783M0 = k13Var.f5322d) == null) {
            }
        }
        uw1VarM2783M0.m5592d(kd1Var);
        return qp0.m4257l(uw1VarM2783M0.m5593e(kd1Var.getLayoutDirection()).mo828c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [in0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [j13] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // p000.on2
    /* JADX INFO: renamed from: l0 */
    public final void mo232l0(zn2 zn2Var) {
        j13 j13Var = this.f5885E;
        ?? r0 = j13Var;
        if (j13Var == null) {
            final int i = 0;
            ?? r02 = new in0(this) { // from class: j13

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ l13 f4880i;

                {
                    this.f4880i = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
                @Override // p000.in0
                /* JADX INFO: renamed from: j */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object mo5j(Object obj) {
                    e70 e70Var;
                    y03 y03Var;
                    int i2 = i;
                    l13 l13Var = this.f4880i;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            uw1 uw1VarM2783M0 = l13Var.m2783M0();
                            m13 m13VarM3024d = m13.m3024d(l13Var.f5888w, C0363ju.f5217g, 0L, null, 0L, 0, 0L, 16777214);
                            d61 d61Var = uw1VarM2783M0.f11532o;
                            y03 y03Var2 = null;
                            if (d61Var != null && (e70Var = uw1VarM2783M0.f11526i) != null) {
                                C0690sd c0690sd = new C0690sd(uw1VarM2783M0.f11518a);
                                if (uw1VarM2783M0.f11527j == null || uw1VarM2783M0.f11531n == null) {
                                    y03Var = null;
                                } else {
                                    long j = uw1VarM2783M0.f11533p & (-8589934589L);
                                    int i3 = uw1VarM2783M0.f11523f;
                                    boolean z = uw1VarM2783M0.f11522e;
                                    int i4 = uw1VarM2783M0.f11521d;
                                    xl0 xl0Var = uw1VarM2783M0.f11520c;
                                    be0 be0Var = be0.f819h;
                                    y03Var = new y03(new x03(c0690sd, m13VarM3024d, be0Var, i3, z, i4, e70Var, d61Var, xl0Var, j), new lj1(new C0093cj(c0690sd, m13VarM3024d, be0Var, e70Var, xl0Var), j, uw1VarM2783M0.f11523f, uw1VarM2783M0.f11521d), uw1VarM2783M0.f11529l);
                                }
                            }
                            if (y03Var != null) {
                                list.add(y03Var);
                                y03Var2 = y03Var;
                            }
                            return Boolean.valueOf(y03Var2 != null);
                        case 1:
                            String str = ((C0690sd) obj).f10051i;
                            k13 k13Var = l13Var.f5886F;
                            if (k13Var == null) {
                                k13 k13Var2 = new k13(l13Var.f5887v, str);
                                uw1 uw1Var = new uw1(str, l13Var.f5888w, l13Var.f5889x, l13Var.f5890y, l13Var.f5891z, l13Var.f5881A, l13Var.f5882B);
                                uw1Var.m5592d(l13Var.m2783M0().f11526i);
                                k13Var2.f5322d = uw1Var;
                                l13Var.f5886F = k13Var2;
                            } else if (!t11.m5086l(str, k13Var.f5320b)) {
                                k13Var.f5320b = str;
                                uw1 uw1Var2 = k13Var.f5322d;
                                if (uw1Var2 != null) {
                                    m13 m13Var = l13Var.f5888w;
                                    xl0 xl0Var2 = l13Var.f5889x;
                                    int i5 = l13Var.f5890y;
                                    boolean z2 = l13Var.f5891z;
                                    int i6 = l13Var.f5881A;
                                    int i7 = l13Var.f5882B;
                                    uw1Var2.f11518a = str;
                                    uw1Var2.f11519b = m13Var;
                                    uw1Var2.f11520c = xl0Var2;
                                    uw1Var2.f11521d = i5;
                                    uw1Var2.f11522e = z2;
                                    uw1Var2.f11523f = i6;
                                    uw1Var2.f11524g = i7;
                                    uw1Var2.f11536s = (uw1Var2.f11536s << 2) | 2;
                                    uw1Var2.m5591c();
                                }
                            }
                            qp0.m4223E(l13Var);
                            gf1.m1853A(l13Var);
                            ci0.m788M(l13Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            k13 k13Var3 = l13Var.f5886F;
                            if (k13Var3 == null) {
                                z = false;
                            } else {
                                k13Var3.f5321c = zBooleanValue;
                                qp0.m4223E(l13Var);
                                gf1.m1853A(l13Var);
                                ci0.m788M(l13Var);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.f5885E = r02;
            r0 = r02;
        }
        C0690sd c0690sd = new C0690sd(this.f5887v);
        v41[] v41VarArr = xn2.f13086a;
        zn2Var.mo1533a(vn2.f12043C, AbstractC0179eu.m1434O(c0690sd));
        k13 k13Var = this.f5886F;
        if (k13Var != null) {
            boolean z = k13Var.f5321c;
            yn2 yn2Var = vn2.f12045E;
            v41[] v41VarArr2 = xn2.f13086a;
            v41 v41Var = v41VarArr2[17];
            zn2Var.mo1533a(yn2Var, Boolean.valueOf(z));
            C0690sd c0690sd2 = new C0690sd(k13Var.f5320b);
            yn2 yn2Var2 = vn2.f12044D;
            v41 v41Var2 = v41VarArr2[16];
            zn2Var.mo1533a(yn2Var2, c0690sd2);
        }
        final int i2 = 1;
        zn2Var.mo1533a(kn2.f5670l, new C0603q3(null, new in0(this) { // from class: j13

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ l13 f4880i;

            {
                this.f4880i = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
            @Override // p000.in0
            /* JADX INFO: renamed from: j */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo5j(Object obj) {
                e70 e70Var;
                y03 y03Var;
                int i22 = i2;
                l13 l13Var = this.f4880i;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        uw1 uw1VarM2783M0 = l13Var.m2783M0();
                        m13 m13VarM3024d = m13.m3024d(l13Var.f5888w, C0363ju.f5217g, 0L, null, 0L, 0, 0L, 16777214);
                        d61 d61Var = uw1VarM2783M0.f11532o;
                        y03 y03Var2 = null;
                        if (d61Var != null && (e70Var = uw1VarM2783M0.f11526i) != null) {
                            C0690sd c0690sd3 = new C0690sd(uw1VarM2783M0.f11518a);
                            if (uw1VarM2783M0.f11527j == null || uw1VarM2783M0.f11531n == null) {
                                y03Var = null;
                            } else {
                                long j = uw1VarM2783M0.f11533p & (-8589934589L);
                                int i3 = uw1VarM2783M0.f11523f;
                                boolean z2 = uw1VarM2783M0.f11522e;
                                int i4 = uw1VarM2783M0.f11521d;
                                xl0 xl0Var = uw1VarM2783M0.f11520c;
                                be0 be0Var = be0.f819h;
                                y03Var = new y03(new x03(c0690sd3, m13VarM3024d, be0Var, i3, z2, i4, e70Var, d61Var, xl0Var, j), new lj1(new C0093cj(c0690sd3, m13VarM3024d, be0Var, e70Var, xl0Var), j, uw1VarM2783M0.f11523f, uw1VarM2783M0.f11521d), uw1VarM2783M0.f11529l);
                            }
                        }
                        if (y03Var != null) {
                            list.add(y03Var);
                            y03Var2 = y03Var;
                        }
                        return Boolean.valueOf(y03Var2 != null);
                    case 1:
                        String str = ((C0690sd) obj).f10051i;
                        k13 k13Var2 = l13Var.f5886F;
                        if (k13Var2 == null) {
                            k13 k13Var22 = new k13(l13Var.f5887v, str);
                            uw1 uw1Var = new uw1(str, l13Var.f5888w, l13Var.f5889x, l13Var.f5890y, l13Var.f5891z, l13Var.f5881A, l13Var.f5882B);
                            uw1Var.m5592d(l13Var.m2783M0().f11526i);
                            k13Var22.f5322d = uw1Var;
                            l13Var.f5886F = k13Var22;
                        } else if (!t11.m5086l(str, k13Var2.f5320b)) {
                            k13Var2.f5320b = str;
                            uw1 uw1Var2 = k13Var2.f5322d;
                            if (uw1Var2 != null) {
                                m13 m13Var = l13Var.f5888w;
                                xl0 xl0Var2 = l13Var.f5889x;
                                int i5 = l13Var.f5890y;
                                boolean z22 = l13Var.f5891z;
                                int i6 = l13Var.f5881A;
                                int i7 = l13Var.f5882B;
                                uw1Var2.f11518a = str;
                                uw1Var2.f11519b = m13Var;
                                uw1Var2.f11520c = xl0Var2;
                                uw1Var2.f11521d = i5;
                                uw1Var2.f11522e = z22;
                                uw1Var2.f11523f = i6;
                                uw1Var2.f11524g = i7;
                                uw1Var2.f11536s = (uw1Var2.f11536s << 2) | 2;
                                uw1Var2.m5591c();
                            }
                        }
                        qp0.m4223E(l13Var);
                        gf1.m1853A(l13Var);
                        ci0.m788M(l13Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        k13 k13Var3 = l13Var.f5886F;
                        if (k13Var3 == null) {
                            z = false;
                        } else {
                            k13Var3.f5321c = zBooleanValue;
                            qp0.m4223E(l13Var);
                            gf1.m1853A(l13Var);
                            ci0.m788M(l13Var);
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        final int i3 = 2;
        zn2Var.mo1533a(kn2.f5671m, new C0603q3(null, new in0(this) { // from class: j13

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ l13 f4880i;

            {
                this.f4880i = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
            @Override // p000.in0
            /* JADX INFO: renamed from: j */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo5j(Object obj) {
                e70 e70Var;
                y03 y03Var;
                int i22 = i3;
                l13 l13Var = this.f4880i;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        uw1 uw1VarM2783M0 = l13Var.m2783M0();
                        m13 m13VarM3024d = m13.m3024d(l13Var.f5888w, C0363ju.f5217g, 0L, null, 0L, 0, 0L, 16777214);
                        d61 d61Var = uw1VarM2783M0.f11532o;
                        y03 y03Var2 = null;
                        if (d61Var != null && (e70Var = uw1VarM2783M0.f11526i) != null) {
                            C0690sd c0690sd3 = new C0690sd(uw1VarM2783M0.f11518a);
                            if (uw1VarM2783M0.f11527j == null || uw1VarM2783M0.f11531n == null) {
                                y03Var = null;
                            } else {
                                long j = uw1VarM2783M0.f11533p & (-8589934589L);
                                int i32 = uw1VarM2783M0.f11523f;
                                boolean z2 = uw1VarM2783M0.f11522e;
                                int i4 = uw1VarM2783M0.f11521d;
                                xl0 xl0Var = uw1VarM2783M0.f11520c;
                                be0 be0Var = be0.f819h;
                                y03Var = new y03(new x03(c0690sd3, m13VarM3024d, be0Var, i32, z2, i4, e70Var, d61Var, xl0Var, j), new lj1(new C0093cj(c0690sd3, m13VarM3024d, be0Var, e70Var, xl0Var), j, uw1VarM2783M0.f11523f, uw1VarM2783M0.f11521d), uw1VarM2783M0.f11529l);
                            }
                        }
                        if (y03Var != null) {
                            list.add(y03Var);
                            y03Var2 = y03Var;
                        }
                        return Boolean.valueOf(y03Var2 != null);
                    case 1:
                        String str = ((C0690sd) obj).f10051i;
                        k13 k13Var2 = l13Var.f5886F;
                        if (k13Var2 == null) {
                            k13 k13Var22 = new k13(l13Var.f5887v, str);
                            uw1 uw1Var = new uw1(str, l13Var.f5888w, l13Var.f5889x, l13Var.f5890y, l13Var.f5891z, l13Var.f5881A, l13Var.f5882B);
                            uw1Var.m5592d(l13Var.m2783M0().f11526i);
                            k13Var22.f5322d = uw1Var;
                            l13Var.f5886F = k13Var22;
                        } else if (!t11.m5086l(str, k13Var2.f5320b)) {
                            k13Var2.f5320b = str;
                            uw1 uw1Var2 = k13Var2.f5322d;
                            if (uw1Var2 != null) {
                                m13 m13Var = l13Var.f5888w;
                                xl0 xl0Var2 = l13Var.f5889x;
                                int i5 = l13Var.f5890y;
                                boolean z22 = l13Var.f5891z;
                                int i6 = l13Var.f5881A;
                                int i7 = l13Var.f5882B;
                                uw1Var2.f11518a = str;
                                uw1Var2.f11519b = m13Var;
                                uw1Var2.f11520c = xl0Var2;
                                uw1Var2.f11521d = i5;
                                uw1Var2.f11522e = z22;
                                uw1Var2.f11523f = i6;
                                uw1Var2.f11524g = i7;
                                uw1Var2.f11536s = (uw1Var2.f11536s << 2) | 2;
                                uw1Var2.m5591c();
                            }
                        }
                        qp0.m4223E(l13Var);
                        gf1.m1853A(l13Var);
                        ci0.m788M(l13Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        k13 k13Var3 = l13Var.f5886F;
                        if (k13Var3 == null) {
                            z = false;
                        } else {
                            k13Var3.f5321c = zBooleanValue;
                            qp0.m4223E(l13Var);
                            gf1.m1853A(l13Var);
                            ci0.m788M(l13Var);
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        zn2Var.mo1533a(kn2.f5672n, new C0603q3(null, new C0727ta(29, this)));
        xn2.m6161a(zn2Var, r0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // p000.j61
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo2363p(kd1 kd1Var, if1 if1Var, int i) {
        uw1 uw1VarM2783M0;
        k13 k13Var = this.f5886F;
        if (k13Var == null) {
            uw1VarM2783M0 = m2783M0();
        } else {
            if (!k13Var.f5321c) {
                k13Var = null;
            }
            if (k13Var == null || (uw1VarM2783M0 = k13Var.f5322d) == null) {
            }
        }
        uw1VarM2783M0.m5592d(kd1Var);
        return uw1VarM2783M0.m5589a(i, kd1Var.getLayoutDirection());
    }
}
