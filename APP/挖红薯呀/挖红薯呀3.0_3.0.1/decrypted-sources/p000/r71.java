package p000;

import android.os.Trace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class r71 extends oe0 implements r50, InterfaceC0775tq, vz0 {

    /* JADX INFO: renamed from: A */
    public p71 f5310A;

    /* JADX INFO: renamed from: B */
    public q71 f5311B;

    /* JADX INFO: renamed from: r */
    public String f5312r;

    /* JADX INFO: renamed from: s */
    public s71 f5313s;

    /* JADX INFO: renamed from: t */
    public InterfaceC0369jv f5314t;

    /* JADX INFO: renamed from: u */
    public int f5315u;

    /* JADX INFO: renamed from: v */
    public boolean f5316v;

    /* JADX INFO: renamed from: w */
    public int f5317w;

    /* JADX INFO: renamed from: x */
    public int f5318x;

    /* JADX INFO: renamed from: y */
    public HashMap f5319y;

    /* JADX INFO: renamed from: z */
    public zo0 f5320z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0018  */
    @Override // p000.InterfaceC0775tq
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1679B(d60 d60Var) {
        zo0 zo0VarM3427w0;
        if (this.f4542q) {
            q71 q71Var = this.f5311B;
            if (q71Var == null) {
                zo0VarM3427w0 = m3427w0();
            } else {
                if (!q71Var.f5082c) {
                    q71Var = null;
                }
                if (q71Var == null || (zo0VarM3427w0 = q71Var.f5083d) == null) {
                }
            }
            C0951y5 c0951y5 = zo0VarM3427w0.f7967j;
            if (c0951y5 == null) {
                z10.m5362b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.f5320z + ", textSubstitution=" + this.f5311B + ')');
                throw new C0725sg();
            }
            InterfaceC0051bd interfaceC0051bdM2802f = d60Var.f976d.f1053e.m2802f();
            boolean z = zo0VarM3427w0.f7968k;
            if (z) {
                long j = zo0VarM3427w0.f7969l;
                interfaceC0051bdM2802f.mo243i();
                interfaceC0051bdM2802f.mo238d(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                j31 j31Var = this.f5313s.f5669a;
                u61 u61Var = j31Var.f2682m;
                if (u61Var == null) {
                    u61Var = u61.f6143b;
                }
                v01 v01Var = j31Var.f2683n;
                if (v01Var == null) {
                    v01Var = v01.f6368d;
                }
                o30 o30Var = j31Var.f2684o;
                if (o30Var == null) {
                    o30Var = C0664qt.f5220Q;
                }
                pf1 pf1VarMo2627e = j31Var.f2670a.mo2627e();
                if (pf1VarMo2627e != null) {
                    float fMo2628f = this.f5313s.f5669a.f2670a.mo2628f();
                    C0461m6 c0461m6 = c0951y5.f7537a.f701g;
                    int i = c0461m6.f3812c;
                    c0461m6.m2432c(pf1VarMo2627e, (((long) Float.floatToRawIntBits(c0951y5.m5212c())) << 32) | (((long) Float.floatToRawIntBits(c0951y5.m5211b())) & 4294967295L), fMo2628f);
                    c0461m6.m2435f(v01Var);
                    c0461m6.m2436g(u61Var);
                    c0461m6.m2434e(o30Var);
                    c0461m6.m2431b(3);
                    c0951y5.m5213d(interfaceC0051bdM2802f);
                    c0461m6.m2431b(i);
                } else {
                    long jM4012b = C0207ff.f1707g;
                    if (jM4012b == 16) {
                        jM4012b = this.f5313s.m4012b() != 16 ? this.f5313s.m4012b() : C0207ff.f1702b;
                    }
                    C0461m6 c0461m62 = c0951y5.f7537a.f701g;
                    int i2 = c0461m62.f3812c;
                    c0461m62.m2433d(jM4012b);
                    c0461m62.m2435f(v01Var);
                    c0461m62.m2436g(u61Var);
                    c0461m62.m2434e(o30Var);
                    c0461m62.m2431b(3);
                    c0951y5.m5213d(interfaceC0051bdM2802f);
                    c0461m62.m2431b(i2);
                }
                if (z) {
                    interfaceC0051bdM2802f.mo241g();
                }
            } catch (Throwable th) {
                if (z) {
                    interfaceC0051bdM2802f.mo241g();
                }
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // p000.r50
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo2086G(yb0 yb0Var, sd0 sd0Var, int i) {
        zo0 zo0VarM3427w0;
        q71 q71Var = this.f5311B;
        if (q71Var == null) {
            zo0VarM3427w0 = m3427w0();
        } else {
            if (!q71Var.f5082c) {
                q71Var = null;
            }
            if (q71Var == null || (zo0VarM3427w0 = q71Var.f5083d) == null) {
            }
        }
        zo0VarM3427w0.m5604d(yb0Var);
        return v50.m4401e(zo0VarM3427w0.m5605e(yb0Var.getLayoutDirection()).mo488a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ex] */
    /* JADX WARN: Type inference failed for: r0v2, types: [p71] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // p000.vz0
    /* JADX INFO: renamed from: S */
    public final void mo757S(f01 f01Var) {
        p71 p71Var = this.f5310A;
        ?? r0 = p71Var;
        if (p71Var == null) {
            final int i = 0;
            ?? r02 = new InterfaceC0742sw(this) { // from class: p71

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ r71 f4776e;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f4776e = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
                @Override // p000.InterfaceC0742sw
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    InterfaceC0968ym interfaceC0968ym;
                    g71 g71Var;
                    zo0 zo0Var;
                    int i2;
                    g71 g71Var2;
                    int i3;
                    int i4;
                    st0 st0VarM4105e;
                    int iM3136g;
                    g71 g71Var3;
                    boolean z;
                    int i5 = i;
                    r71 r71Var = this.f4776e;
                    switch (i5) {
                        case 0:
                            List list = (List) obj;
                            zo0 zo0VarM3427w0 = r71Var.m3427w0();
                            s71 s71VarM4011d = s71.m4011d(r71Var.f5313s, C0207ff.f1707g, 0L, null, null, 0L, 0, 0L, 16777214);
                            k50 k50Var = zo0VarM3427w0.f7972o;
                            if (k50Var != null && (interfaceC0968ym = zo0VarM3427w0.f7966i) != null) {
                                C0200f8 c0200f8 = new C0200f8(zo0VarM3427w0.f7958a);
                                if (zo0VarM3427w0.f7967j == null || zo0VarM3427w0.f7971n == null) {
                                    g71Var2 = null;
                                    g71Var = null;
                                } else {
                                    long j = zo0VarM3427w0.f7973p & (-8589934589L);
                                    int i6 = zo0VarM3427w0.f7963f;
                                    boolean z2 = zo0VarM3427w0.f7962e;
                                    int i7 = zo0VarM3427w0.f7961d;
                                    InterfaceC0369jv interfaceC0369jv = zo0VarM3427w0.f7960c;
                                    C0294hs c0294hs = C0294hs.f2354d;
                                    f71 f71Var = new f71(c0200f8, s71VarM4011d, c0294hs, i6, z2, i7, interfaceC0968ym, k50Var, interfaceC0369jv, j);
                                    C0681r9 c0681r9 = new C0681r9(c0200f8, s71VarM4011d, c0294hs, interfaceC0968ym, interfaceC0369jv);
                                    int i8 = zo0VarM3427w0.f7963f;
                                    int i9 = zo0VarM3427w0.f7961d;
                                    ng0 ng0Var = new ng0();
                                    ng0Var.f4260c = c0681r9;
                                    ng0Var.f4258a = i8;
                                    if (C0617pj.m3139j(j) != 0 || C0617pj.m3138i(j) != 0) {
                                        x10.m5082a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    ArrayList arrayList2 = (ArrayList) c0681r9.f5331e;
                                    int size = arrayList2.size();
                                    float f = 0.0f;
                                    int i10 = 0;
                                    int i11 = 0;
                                    while (true) {
                                        if (i10 < size) {
                                            xo0 xo0Var = (xo0) arrayList2.get(i10);
                                            int i12 = i10;
                                            C0080c6 c0080c6 = xo0Var.f7387a;
                                            int iM3137h = C0617pj.m3137h(j);
                                            if (C0617pj.m3132c(j)) {
                                                zo0Var = zo0VarM3427w0;
                                                iM3136g = C0617pj.m3136g(j) - ((int) Math.ceil(f));
                                                if (iM3136g < 0) {
                                                    iM3136g = 0;
                                                }
                                            } else {
                                                zo0Var = zo0VarM3427w0;
                                                iM3136g = C0617pj.m3136g(j);
                                            }
                                            long jM3255b = AbstractC0654qj.m3255b(iM3137h, iM3136g, 5);
                                            float f2 = f;
                                            int i13 = size;
                                            C0951y5 c0951y5 = new C0951y5(c0080c6, ng0Var.f4258a - i11, i9, jM3255b);
                                            float fM5211b = c0951y5.m5211b() + f2;
                                            e71 e71Var = c0951y5.f7540d;
                                            int i14 = i11 + e71Var.f1327f;
                                            i2 = i14;
                                            arrayList.add(new wo0(c0951y5, xo0Var.f7388b, xo0Var.f7389c, i11, i14, f2, fM5211b));
                                            if (!e71Var.f1325d && (i2 != ng0Var.f4258a || i12 == o30.m2778r((ArrayList) ((C0681r9) ng0Var.f4260c).f5331e))) {
                                                i10 = i12 + 1;
                                                size = i13;
                                                i11 = i2;
                                                f = fM5211b;
                                                zo0VarM3427w0 = zo0Var;
                                            }
                                        } else {
                                            zo0Var = zo0VarM3427w0;
                                            i2 = i11;
                                        }
                                    }
                                    ng0Var.f4259b = i2;
                                    ng0Var.f4262e = arrayList;
                                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                                    int size2 = arrayList.size();
                                    int i15 = 0;
                                    while (i15 < size2) {
                                        wo0 wo0Var = (wo0) arrayList.get(i15);
                                        List list2 = wo0Var.f7159a.f7542f;
                                        ArrayList arrayList4 = new ArrayList(list2.size());
                                        int size3 = list2.size();
                                        int i16 = 0;
                                        while (i16 < size3) {
                                            st0 st0Var = (st0) list2.get(i16);
                                            if (st0Var != null) {
                                                i3 = size2;
                                                i4 = i15;
                                                st0VarM4105e = st0Var.m4105e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(wo0Var.f7164f)) & 4294967295L));
                                            } else {
                                                i3 = size2;
                                                i4 = i15;
                                                st0VarM4105e = null;
                                            }
                                            arrayList4.add(st0VarM4105e);
                                            i16++;
                                            size2 = i3;
                                            i15 = i4;
                                        }
                                        AbstractC0170ef.m928G(arrayList3, arrayList4);
                                        i15++;
                                    }
                                    if (arrayList3.size() < ((List) ((C0681r9) ng0Var.f4260c).f5328b).size()) {
                                        int size4 = ((List) ((C0681r9) ng0Var.f4260c).f5328b).size() - arrayList3.size();
                                        ArrayList arrayList5 = new ArrayList(size4);
                                        int i17 = 0;
                                        while (true) {
                                            g71Var2 = null;
                                            if (i17 < size4) {
                                                arrayList5.add(null);
                                                i17++;
                                            } else {
                                                arrayList3 = AbstractC0960ye.m5249S(arrayList3, arrayList5);
                                            }
                                        }
                                    } else {
                                        g71Var2 = null;
                                    }
                                    ng0Var.f4261d = arrayList3;
                                    g71Var = new g71(f71Var, ng0Var, zo0Var.f7969l);
                                }
                            }
                            if (g71Var != null) {
                                list.add(g71Var);
                                g71Var3 = g71Var;
                            } else {
                                g71Var3 = g71Var2;
                            }
                            return Boolean.valueOf(g71Var3 != null);
                        case 1:
                            String str = ((C0200f8) obj).f1625e;
                            q71 q71Var = r71Var.f5311B;
                            if (q71Var == null) {
                                q71 q71Var2 = new q71(r71Var.f5312r, str);
                                zo0 zo0Var2 = new zo0(str, r71Var.f5313s, r71Var.f5314t, r71Var.f5315u, r71Var.f5316v, r71Var.f5317w, r71Var.f5318x);
                                zo0Var2.m5604d(r71Var.m3427w0().f7966i);
                                q71Var2.f5083d = zo0Var2;
                                r71Var.f5311B = q71Var2;
                            } else if (!p30.m3002l(str, q71Var.f5081b)) {
                                q71Var.f5081b = str;
                                zo0 zo0Var3 = q71Var.f5083d;
                                if (zo0Var3 != null) {
                                    s71 s71Var = r71Var.f5313s;
                                    InterfaceC0369jv interfaceC0369jv2 = r71Var.f5314t;
                                    int i18 = r71Var.f5315u;
                                    boolean z3 = r71Var.f5316v;
                                    int i19 = r71Var.f5317w;
                                    int i20 = r71Var.f5318x;
                                    zo0Var3.f7958a = str;
                                    zo0Var3.f7959b = s71Var;
                                    zo0Var3.f7960c = interfaceC0369jv2;
                                    zo0Var3.f7961d = i18;
                                    zo0Var3.f7962e = z3;
                                    zo0Var3.f7963f = i19;
                                    zo0Var3.f7964g = i20;
                                    zo0Var3.f7976s = (zo0Var3.f7976s << 2) | 2;
                                    zo0Var3.m5603c();
                                }
                            }
                            z60.m5417D(r71Var);
                            v50.m4407m(r71Var);
                            AbstractC0398kl.m1932r(r71Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            q71 q71Var3 = r71Var.f5311B;
                            if (q71Var3 == null) {
                                z = false;
                            } else {
                                q71Var3.f5082c = zBooleanValue;
                                z60.m5417D(r71Var);
                                v50.m4407m(r71Var);
                                AbstractC0398kl.m1932r(r71Var);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.f5310A = r02;
            r0 = r02;
        }
        C0200f8 c0200f8 = new C0200f8(this.f5312r);
        u40[] u40VarArr = d01.f923a;
        f01Var.mo17a(b01.f308A, o30.m2782v(c0200f8));
        q71 q71Var = this.f5311B;
        if (q71Var != null) {
            boolean z = q71Var.f5082c;
            e01 e01Var = b01.f310C;
            u40[] u40VarArr2 = d01.f923a;
            u40 u40Var = u40VarArr2[17];
            f01Var.mo17a(e01Var, Boolean.valueOf(z));
            C0200f8 c0200f82 = new C0200f8(q71Var.f5081b);
            e01 e01Var2 = b01.f309B;
            u40 u40Var2 = u40VarArr2[16];
            f01Var.mo17a(e01Var2, c0200f82);
        }
        final int i2 = 1;
        f01Var.mo17a(rz0.f5599l, new C0533o0(null, new InterfaceC0742sw(this) { // from class: p71

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ r71 f4776e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f4776e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
            @Override // p000.InterfaceC0742sw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                InterfaceC0968ym interfaceC0968ym;
                g71 g71Var;
                zo0 zo0Var;
                int i22;
                g71 g71Var2;
                int i3;
                int i4;
                st0 st0VarM4105e;
                int iM3136g;
                g71 g71Var3;
                boolean z2;
                int i5 = i2;
                r71 r71Var = this.f4776e;
                switch (i5) {
                    case 0:
                        List list = (List) obj;
                        zo0 zo0VarM3427w0 = r71Var.m3427w0();
                        s71 s71VarM4011d = s71.m4011d(r71Var.f5313s, C0207ff.f1707g, 0L, null, null, 0L, 0, 0L, 16777214);
                        k50 k50Var = zo0VarM3427w0.f7972o;
                        if (k50Var != null && (interfaceC0968ym = zo0VarM3427w0.f7966i) != null) {
                            C0200f8 c0200f83 = new C0200f8(zo0VarM3427w0.f7958a);
                            if (zo0VarM3427w0.f7967j == null || zo0VarM3427w0.f7971n == null) {
                                g71Var2 = null;
                                g71Var = null;
                            } else {
                                long j = zo0VarM3427w0.f7973p & (-8589934589L);
                                int i6 = zo0VarM3427w0.f7963f;
                                boolean z22 = zo0VarM3427w0.f7962e;
                                int i7 = zo0VarM3427w0.f7961d;
                                InterfaceC0369jv interfaceC0369jv = zo0VarM3427w0.f7960c;
                                C0294hs c0294hs = C0294hs.f2354d;
                                f71 f71Var = new f71(c0200f83, s71VarM4011d, c0294hs, i6, z22, i7, interfaceC0968ym, k50Var, interfaceC0369jv, j);
                                C0681r9 c0681r9 = new C0681r9(c0200f83, s71VarM4011d, c0294hs, interfaceC0968ym, interfaceC0369jv);
                                int i8 = zo0VarM3427w0.f7963f;
                                int i9 = zo0VarM3427w0.f7961d;
                                ng0 ng0Var = new ng0();
                                ng0Var.f4260c = c0681r9;
                                ng0Var.f4258a = i8;
                                if (C0617pj.m3139j(j) != 0 || C0617pj.m3138i(j) != 0) {
                                    x10.m5082a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = (ArrayList) c0681r9.f5331e;
                                int size = arrayList2.size();
                                float f = 0.0f;
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i10 < size) {
                                        xo0 xo0Var = (xo0) arrayList2.get(i10);
                                        int i12 = i10;
                                        C0080c6 c0080c6 = xo0Var.f7387a;
                                        int iM3137h = C0617pj.m3137h(j);
                                        if (C0617pj.m3132c(j)) {
                                            zo0Var = zo0VarM3427w0;
                                            iM3136g = C0617pj.m3136g(j) - ((int) Math.ceil(f));
                                            if (iM3136g < 0) {
                                                iM3136g = 0;
                                            }
                                        } else {
                                            zo0Var = zo0VarM3427w0;
                                            iM3136g = C0617pj.m3136g(j);
                                        }
                                        long jM3255b = AbstractC0654qj.m3255b(iM3137h, iM3136g, 5);
                                        float f2 = f;
                                        int i13 = size;
                                        C0951y5 c0951y5 = new C0951y5(c0080c6, ng0Var.f4258a - i11, i9, jM3255b);
                                        float fM5211b = c0951y5.m5211b() + f2;
                                        e71 e71Var = c0951y5.f7540d;
                                        int i14 = i11 + e71Var.f1327f;
                                        i22 = i14;
                                        arrayList.add(new wo0(c0951y5, xo0Var.f7388b, xo0Var.f7389c, i11, i14, f2, fM5211b));
                                        if (!e71Var.f1325d && (i22 != ng0Var.f4258a || i12 == o30.m2778r((ArrayList) ((C0681r9) ng0Var.f4260c).f5331e))) {
                                            i10 = i12 + 1;
                                            size = i13;
                                            i11 = i22;
                                            f = fM5211b;
                                            zo0VarM3427w0 = zo0Var;
                                        }
                                    } else {
                                        zo0Var = zo0VarM3427w0;
                                        i22 = i11;
                                    }
                                }
                                ng0Var.f4259b = i22;
                                ng0Var.f4262e = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList.size());
                                int size2 = arrayList.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    wo0 wo0Var = (wo0) arrayList.get(i15);
                                    List list2 = wo0Var.f7159a.f7542f;
                                    ArrayList arrayList4 = new ArrayList(list2.size());
                                    int size3 = list2.size();
                                    int i16 = 0;
                                    while (i16 < size3) {
                                        st0 st0Var = (st0) list2.get(i16);
                                        if (st0Var != null) {
                                            i3 = size2;
                                            i4 = i15;
                                            st0VarM4105e = st0Var.m4105e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(wo0Var.f7164f)) & 4294967295L));
                                        } else {
                                            i3 = size2;
                                            i4 = i15;
                                            st0VarM4105e = null;
                                        }
                                        arrayList4.add(st0VarM4105e);
                                        i16++;
                                        size2 = i3;
                                        i15 = i4;
                                    }
                                    AbstractC0170ef.m928G(arrayList3, arrayList4);
                                    i15++;
                                }
                                if (arrayList3.size() < ((List) ((C0681r9) ng0Var.f4260c).f5328b).size()) {
                                    int size4 = ((List) ((C0681r9) ng0Var.f4260c).f5328b).size() - arrayList3.size();
                                    ArrayList arrayList5 = new ArrayList(size4);
                                    int i17 = 0;
                                    while (true) {
                                        g71Var2 = null;
                                        if (i17 < size4) {
                                            arrayList5.add(null);
                                            i17++;
                                        } else {
                                            arrayList3 = AbstractC0960ye.m5249S(arrayList3, arrayList5);
                                        }
                                    }
                                } else {
                                    g71Var2 = null;
                                }
                                ng0Var.f4261d = arrayList3;
                                g71Var = new g71(f71Var, ng0Var, zo0Var.f7969l);
                            }
                        }
                        if (g71Var != null) {
                            list.add(g71Var);
                            g71Var3 = g71Var;
                        } else {
                            g71Var3 = g71Var2;
                        }
                        return Boolean.valueOf(g71Var3 != null);
                    case 1:
                        String str = ((C0200f8) obj).f1625e;
                        q71 q71Var2 = r71Var.f5311B;
                        if (q71Var2 == null) {
                            q71 q71Var22 = new q71(r71Var.f5312r, str);
                            zo0 zo0Var2 = new zo0(str, r71Var.f5313s, r71Var.f5314t, r71Var.f5315u, r71Var.f5316v, r71Var.f5317w, r71Var.f5318x);
                            zo0Var2.m5604d(r71Var.m3427w0().f7966i);
                            q71Var22.f5083d = zo0Var2;
                            r71Var.f5311B = q71Var22;
                        } else if (!p30.m3002l(str, q71Var2.f5081b)) {
                            q71Var2.f5081b = str;
                            zo0 zo0Var3 = q71Var2.f5083d;
                            if (zo0Var3 != null) {
                                s71 s71Var = r71Var.f5313s;
                                InterfaceC0369jv interfaceC0369jv2 = r71Var.f5314t;
                                int i18 = r71Var.f5315u;
                                boolean z3 = r71Var.f5316v;
                                int i19 = r71Var.f5317w;
                                int i20 = r71Var.f5318x;
                                zo0Var3.f7958a = str;
                                zo0Var3.f7959b = s71Var;
                                zo0Var3.f7960c = interfaceC0369jv2;
                                zo0Var3.f7961d = i18;
                                zo0Var3.f7962e = z3;
                                zo0Var3.f7963f = i19;
                                zo0Var3.f7964g = i20;
                                zo0Var3.f7976s = (zo0Var3.f7976s << 2) | 2;
                                zo0Var3.m5603c();
                            }
                        }
                        z60.m5417D(r71Var);
                        v50.m4407m(r71Var);
                        AbstractC0398kl.m1932r(r71Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        q71 q71Var3 = r71Var.f5311B;
                        if (q71Var3 == null) {
                            z2 = false;
                        } else {
                            q71Var3.f5082c = zBooleanValue;
                            z60.m5417D(r71Var);
                            v50.m4407m(r71Var);
                            AbstractC0398kl.m1932r(r71Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        f01Var.mo17a(rz0.f5600m, new C0533o0(null, new InterfaceC0742sw(this) { // from class: p71

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ r71 f4776e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f4776e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
            @Override // p000.InterfaceC0742sw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                InterfaceC0968ym interfaceC0968ym;
                g71 g71Var;
                zo0 zo0Var;
                int i22;
                g71 g71Var2;
                int i32;
                int i4;
                st0 st0VarM4105e;
                int iM3136g;
                g71 g71Var3;
                boolean z2;
                int i5 = i3;
                r71 r71Var = this.f4776e;
                switch (i5) {
                    case 0:
                        List list = (List) obj;
                        zo0 zo0VarM3427w0 = r71Var.m3427w0();
                        s71 s71VarM4011d = s71.m4011d(r71Var.f5313s, C0207ff.f1707g, 0L, null, null, 0L, 0, 0L, 16777214);
                        k50 k50Var = zo0VarM3427w0.f7972o;
                        if (k50Var != null && (interfaceC0968ym = zo0VarM3427w0.f7966i) != null) {
                            C0200f8 c0200f83 = new C0200f8(zo0VarM3427w0.f7958a);
                            if (zo0VarM3427w0.f7967j == null || zo0VarM3427w0.f7971n == null) {
                                g71Var2 = null;
                                g71Var = null;
                            } else {
                                long j = zo0VarM3427w0.f7973p & (-8589934589L);
                                int i6 = zo0VarM3427w0.f7963f;
                                boolean z22 = zo0VarM3427w0.f7962e;
                                int i7 = zo0VarM3427w0.f7961d;
                                InterfaceC0369jv interfaceC0369jv = zo0VarM3427w0.f7960c;
                                C0294hs c0294hs = C0294hs.f2354d;
                                f71 f71Var = new f71(c0200f83, s71VarM4011d, c0294hs, i6, z22, i7, interfaceC0968ym, k50Var, interfaceC0369jv, j);
                                C0681r9 c0681r9 = new C0681r9(c0200f83, s71VarM4011d, c0294hs, interfaceC0968ym, interfaceC0369jv);
                                int i8 = zo0VarM3427w0.f7963f;
                                int i9 = zo0VarM3427w0.f7961d;
                                ng0 ng0Var = new ng0();
                                ng0Var.f4260c = c0681r9;
                                ng0Var.f4258a = i8;
                                if (C0617pj.m3139j(j) != 0 || C0617pj.m3138i(j) != 0) {
                                    x10.m5082a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = (ArrayList) c0681r9.f5331e;
                                int size = arrayList2.size();
                                float f = 0.0f;
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i10 < size) {
                                        xo0 xo0Var = (xo0) arrayList2.get(i10);
                                        int i12 = i10;
                                        C0080c6 c0080c6 = xo0Var.f7387a;
                                        int iM3137h = C0617pj.m3137h(j);
                                        if (C0617pj.m3132c(j)) {
                                            zo0Var = zo0VarM3427w0;
                                            iM3136g = C0617pj.m3136g(j) - ((int) Math.ceil(f));
                                            if (iM3136g < 0) {
                                                iM3136g = 0;
                                            }
                                        } else {
                                            zo0Var = zo0VarM3427w0;
                                            iM3136g = C0617pj.m3136g(j);
                                        }
                                        long jM3255b = AbstractC0654qj.m3255b(iM3137h, iM3136g, 5);
                                        float f2 = f;
                                        int i13 = size;
                                        C0951y5 c0951y5 = new C0951y5(c0080c6, ng0Var.f4258a - i11, i9, jM3255b);
                                        float fM5211b = c0951y5.m5211b() + f2;
                                        e71 e71Var = c0951y5.f7540d;
                                        int i14 = i11 + e71Var.f1327f;
                                        i22 = i14;
                                        arrayList.add(new wo0(c0951y5, xo0Var.f7388b, xo0Var.f7389c, i11, i14, f2, fM5211b));
                                        if (!e71Var.f1325d && (i22 != ng0Var.f4258a || i12 == o30.m2778r((ArrayList) ((C0681r9) ng0Var.f4260c).f5331e))) {
                                            i10 = i12 + 1;
                                            size = i13;
                                            i11 = i22;
                                            f = fM5211b;
                                            zo0VarM3427w0 = zo0Var;
                                        }
                                    } else {
                                        zo0Var = zo0VarM3427w0;
                                        i22 = i11;
                                    }
                                }
                                ng0Var.f4259b = i22;
                                ng0Var.f4262e = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList.size());
                                int size2 = arrayList.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    wo0 wo0Var = (wo0) arrayList.get(i15);
                                    List list2 = wo0Var.f7159a.f7542f;
                                    ArrayList arrayList4 = new ArrayList(list2.size());
                                    int size3 = list2.size();
                                    int i16 = 0;
                                    while (i16 < size3) {
                                        st0 st0Var = (st0) list2.get(i16);
                                        if (st0Var != null) {
                                            i32 = size2;
                                            i4 = i15;
                                            st0VarM4105e = st0Var.m4105e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(wo0Var.f7164f)) & 4294967295L));
                                        } else {
                                            i32 = size2;
                                            i4 = i15;
                                            st0VarM4105e = null;
                                        }
                                        arrayList4.add(st0VarM4105e);
                                        i16++;
                                        size2 = i32;
                                        i15 = i4;
                                    }
                                    AbstractC0170ef.m928G(arrayList3, arrayList4);
                                    i15++;
                                }
                                if (arrayList3.size() < ((List) ((C0681r9) ng0Var.f4260c).f5328b).size()) {
                                    int size4 = ((List) ((C0681r9) ng0Var.f4260c).f5328b).size() - arrayList3.size();
                                    ArrayList arrayList5 = new ArrayList(size4);
                                    int i17 = 0;
                                    while (true) {
                                        g71Var2 = null;
                                        if (i17 < size4) {
                                            arrayList5.add(null);
                                            i17++;
                                        } else {
                                            arrayList3 = AbstractC0960ye.m5249S(arrayList3, arrayList5);
                                        }
                                    }
                                } else {
                                    g71Var2 = null;
                                }
                                ng0Var.f4261d = arrayList3;
                                g71Var = new g71(f71Var, ng0Var, zo0Var.f7969l);
                            }
                        }
                        if (g71Var != null) {
                            list.add(g71Var);
                            g71Var3 = g71Var;
                        } else {
                            g71Var3 = g71Var2;
                        }
                        return Boolean.valueOf(g71Var3 != null);
                    case 1:
                        String str = ((C0200f8) obj).f1625e;
                        q71 q71Var2 = r71Var.f5311B;
                        if (q71Var2 == null) {
                            q71 q71Var22 = new q71(r71Var.f5312r, str);
                            zo0 zo0Var2 = new zo0(str, r71Var.f5313s, r71Var.f5314t, r71Var.f5315u, r71Var.f5316v, r71Var.f5317w, r71Var.f5318x);
                            zo0Var2.m5604d(r71Var.m3427w0().f7966i);
                            q71Var22.f5083d = zo0Var2;
                            r71Var.f5311B = q71Var22;
                        } else if (!p30.m3002l(str, q71Var2.f5081b)) {
                            q71Var2.f5081b = str;
                            zo0 zo0Var3 = q71Var2.f5083d;
                            if (zo0Var3 != null) {
                                s71 s71Var = r71Var.f5313s;
                                InterfaceC0369jv interfaceC0369jv2 = r71Var.f5314t;
                                int i18 = r71Var.f5315u;
                                boolean z3 = r71Var.f5316v;
                                int i19 = r71Var.f5317w;
                                int i20 = r71Var.f5318x;
                                zo0Var3.f7958a = str;
                                zo0Var3.f7959b = s71Var;
                                zo0Var3.f7960c = interfaceC0369jv2;
                                zo0Var3.f7961d = i18;
                                zo0Var3.f7962e = z3;
                                zo0Var3.f7963f = i19;
                                zo0Var3.f7964g = i20;
                                zo0Var3.f7976s = (zo0Var3.f7976s << 2) | 2;
                                zo0Var3.m5603c();
                            }
                        }
                        z60.m5417D(r71Var);
                        v50.m4407m(r71Var);
                        AbstractC0398kl.m1932r(r71Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        q71 q71Var3 = r71Var.f5311B;
                        if (q71Var3 == null) {
                            z2 = false;
                        } else {
                            q71Var3.f5082c = zBooleanValue;
                            z60.m5417D(r71Var);
                            v50.m4407m(r71Var);
                            AbstractC0398kl.m1932r(r71Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        f01Var.mo17a(rz0.f5601n, new C0533o0(null, new C0381k6(14, this)));
        f01Var.mo17a(rz0.f5588a, new C0533o0(null, r0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:21:0x0049, B:22:0x0070, B:12:0x0015), top: B:28:0x0005 }] */
    @Override // p000.r50
    /* JADX INFO: renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yd0 mo790Y(zd0 zd0Var, sd0 sd0Var, long j) {
        zo0 zo0VarM3427w0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            q71 q71Var = this.f5311B;
            if (q71Var == null) {
                zo0VarM3427w0 = m3427w0();
            } else {
                if (!q71Var.f5082c) {
                    q71Var = null;
                }
                if (q71Var == null || (zo0VarM3427w0 = q71Var.f5083d) == null) {
                }
            }
            zo0VarM3427w0.m5604d(zd0Var);
            boolean zM5602b = zo0VarM3427w0.m5602b(j, zd0Var.getLayoutDirection());
            yo0 yo0Var = zo0VarM3427w0.f7971n;
            if (yo0Var != null) {
                yo0Var.mo489b();
            }
            C0951y5 c0951y5 = zo0VarM3427w0.f7967j;
            c0951y5.getClass();
            e71 e71Var = c0951y5.f7540d;
            long j2 = zo0VarM3427w0.f7969l;
            if (zM5602b) {
                pf1.m3037O(this, 2).m3273N0();
                HashMap map = this.f5319y;
                if (map == null) {
                    map = new HashMap(2);
                    this.f5319y = map;
                }
                map.put(AbstractC0674r2.f5280a, Integer.valueOf(Math.round(e71Var.m795c(0))));
                map.put(AbstractC0674r2.f5281b, Integer.valueOf(Math.round(e71Var.m795c(e71Var.f1327f - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            xq0 xq0VarMo184e = sd0Var.mo184e(o30.m2775o(i, i, i2, i2));
            HashMap map2 = this.f5319y;
            map2.getClass();
            return zd0Var.mo1279Q(i, i2, map2, new C0918x9(xq0VarMo184e, 5));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // p000.r50
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo2087d(yb0 yb0Var, sd0 sd0Var, int i) {
        zo0 zo0VarM3427w0;
        q71 q71Var = this.f5311B;
        if (q71Var == null) {
            zo0VarM3427w0 = m3427w0();
        } else {
            if (!q71Var.f5082c) {
                q71Var = null;
            }
            if (q71Var == null || (zo0VarM3427w0 = q71Var.f5083d) == null) {
            }
        }
        zo0VarM3427w0.m5604d(yb0Var);
        return v50.m4401e(zo0VarM3427w0.m5605e(yb0Var.getLayoutDirection()).mo490c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // p000.r50
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo2088i(yb0 yb0Var, sd0 sd0Var, int i) {
        zo0 zo0VarM3427w0;
        q71 q71Var = this.f5311B;
        if (q71Var == null) {
            zo0VarM3427w0 = m3427w0();
        } else {
            if (!q71Var.f5082c) {
                q71Var = null;
            }
            if (q71Var == null || (zo0VarM3427w0 = q71Var.f5083d) == null) {
            }
        }
        zo0VarM3427w0.m5604d(yb0Var);
        return zo0VarM3427w0.m5601a(i, yb0Var.getLayoutDirection());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: l0 */
    public final boolean mo548l0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // p000.r50
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo2089s(yb0 yb0Var, sd0 sd0Var, int i) {
        zo0 zo0VarM3427w0;
        q71 q71Var = this.f5311B;
        if (q71Var == null) {
            zo0VarM3427w0 = m3427w0();
        } else {
            if (!q71Var.f5082c) {
                q71Var = null;
            }
            if (q71Var == null || (zo0VarM3427w0 = q71Var.f5083d) == null) {
            }
        }
        zo0VarM3427w0.m5604d(yb0Var);
        return zo0VarM3427w0.m5601a(i, yb0Var.getLayoutDirection());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public final zo0 m3427w0() {
        if (this.f5320z == null) {
            this.f5320z = new zo0(this.f5312r, this.f5313s, this.f5314t, this.f5315u, this.f5316v, this.f5317w, this.f5318x);
        }
        zo0 zo0Var = this.f5320z;
        zo0Var.getClass();
        return zo0Var;
    }
}
