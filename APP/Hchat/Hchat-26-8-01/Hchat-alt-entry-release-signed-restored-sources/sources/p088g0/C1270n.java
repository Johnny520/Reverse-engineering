package p088g0;

import android.os.Trace;
import be.C0289k;
import gg.AbstractC1416l;
import java.util.HashMap;
import java.util.List;
import mg.InterfaceC2842d;
import okio.C3193a;
import p000a.AbstractC0000a;
import p011ab.C0041a;
import p071f1.AbstractC1027s;
import p071f1.C1024q0;
import p071f1.C1034w;
import p071f1.InterfaceC1031u;
import p072f2.AbstractC1049l;
import p072f2.AbstractC1058u;
import p072f2.AbstractC1060w;
import p072f2.C1038a;
import p072f2.C1061x;
import p072f2.InterfaceC1062y;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p101h1.AbstractC1566c;
import p101h1.C1569f;
import p119i2.C1914a;
import p119i2.C1925f0;
import p119i2.C1926g;
import p119i2.C1933j0;
import p119i2.C1935k0;
import p119i2.C1941n0;
import p119i2.C1942o;
import p119i2.InterfaceC1949t;
import p133j2.C2061k;
import p177m2.InterfaceC2760d;
import p201o.AbstractC3026b;
import p280t2.C4096l;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p308v1.AbstractC4377b1;
import p308v1.AbstractC4378c;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p321w.AbstractC4634s;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5628n0;
import p339x1.C5610h0;
import p339x1.InterfaceC5624m;
import p339x1.InterfaceC5651v;
import p339x1.InterfaceC5665z1;
import p356y0.AbstractC5852n;
import tf.C4173t;

/* JADX INFO: renamed from: g0.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1270n extends AbstractC5852n implements InterfaceC5651v, InterfaceC5624m, InterfaceC5665z1 {

    /* JADX INFO: renamed from: A */
    public int f4211A;

    /* JADX INFO: renamed from: B */
    public HashMap f4212B;

    /* JADX INFO: renamed from: C */
    public C1261e f4213C;

    /* JADX INFO: renamed from: D */
    public C1941n0 f4214D;

    /* JADX INFO: renamed from: E */
    public C1268l f4215E;

    /* JADX INFO: renamed from: F */
    public C1269m f4216F;

    /* JADX INFO: renamed from: u */
    public String f4217u;

    /* JADX INFO: renamed from: v */
    public C1941n0 f4218v;

    /* JADX INFO: renamed from: w */
    public InterfaceC2760d f4219w;

    /* JADX INFO: renamed from: x */
    public int f4220x;

    /* JADX INFO: renamed from: y */
    public boolean f4221y;

    /* JADX INFO: renamed from: z */
    public int f4222z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    @Override // p339x1.InterfaceC5624m
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1326B(C5610h0 c5610h0) {
        C1261e c1261eM3400k1;
        if (this.f23801t) {
            C1269m c1269m = this.f4216F;
            if (c1269m == null) {
                c1261eM3400k1 = m3400k1();
            } else {
                if (!c1269m.f4209c) {
                    c1269m = null;
                }
                if (c1269m == null || (c1261eM3400k1 = c1269m.f4210d) == null) {
                }
            }
            C1914a c1914a = c1261eM3400k1.f4154j;
            if (c1914a == null) {
                AbstractC3026b.m6429b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.f4213C + ", textSubstitution=" + this.f4216F + ')');
                C3193a.m6814c();
                return;
            }
            InterfaceC1031u interfaceC1031uM819p = c5610h0.f22833g.f5220h.m819p();
            boolean z9 = c1261eM3400k1.f4155k;
            if (z9) {
                long j3 = c1261eM3400k1.f4156l;
                interfaceC1031uM819p.mo2487e();
                interfaceC1031uM819p.mo2493l(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L), 1);
            }
            try {
                m3402m1(2);
                C1941n0 c1941n0 = this.f4214D;
                if (c1941n0 == null) {
                    c1941n0 = this.f4218v;
                }
                C1925f0 c1925f0 = c1941n0.f6580a;
                C4096l c4096l = c1925f0.f6525m;
                if (c4096l == null) {
                    c4096l = C4096l.f13558b;
                }
                C4096l c4096l2 = c4096l;
                C1024q0 c1024q0 = c1925f0.f6526n;
                if (c1024q0 == null) {
                    c1024q0 = C1024q0.f3233d;
                }
                C1024q0 c1024q02 = c1024q0;
                AbstractC1566c abstractC1566c = c1925f0.f6527o;
                if (abstractC1566c == null) {
                    abstractC1566c = C1569f.f5225b;
                }
                AbstractC1566c abstractC1566c2 = abstractC1566c;
                AbstractC1027s abstractC1027sMo8269c = c1925f0.f6513a.mo8269c();
                if (abstractC1027sMo8269c != null) {
                    c1914a.m4772g(interfaceC1031uM819p, abstractC1027sMo8269c, c1941n0.f6580a.f6513a.mo8267a(), c1024q02, c4096l2, abstractC1566c2);
                } else {
                    long jM4820a = C1034w.f3263g;
                    if (jM4820a == 16) {
                        jM4820a = c1941n0.m4820a() != 16 ? c1941n0.m4820a() : C1034w.f3258b;
                    }
                    c1914a.m4771f(interfaceC1031uM819p, jM4820a, c1024q02, c4096l2, abstractC1566c2);
                }
                if (z9) {
                    interfaceC1031uM819p.mo2497p();
                }
            } catch (Throwable th2) {
                if (z9) {
                    interfaceC1031uM819p.mo2497p();
                }
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: G */
    public final int mo1345G(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        return AbstractC4634s.m9071n(m3401l1(abstractC5628n0).m3396e(abstractC5628n0.getLayoutDirection()).mo1193b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: K0 */
    public final int mo1346K0(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        return m3401l1(abstractC5628n0).m3392a(i9, abstractC5628n0.getLayoutDirection());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: Q */
    public final int mo1347Q(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        return AbstractC4634s.m9071n(m3401l1(abstractC5628n0).m3396e(abstractC5628n0.getLayoutDirection()).mo1194c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: R0 */
    public final int mo1348R0(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        return m3401l1(abstractC5628n0).m3392a(i9, abstractC5628n0.getLayoutDirection());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fg.l] */
    /* JADX WARN: Type inference failed for: r0v2, types: [g0.l] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: X0 */
    public final void mo1610X0(InterfaceC1062y interfaceC1062y) {
        C1268l c1268l = this.f4215E;
        ?? r02 = c1268l;
        if (c1268l == null) {
            final int i9 = 0;
            ?? r03 = new InterfaceC1231l(this) { // from class: g0.l

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C1270n f4206h;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f4206h = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
                @Override // p085fg.InterfaceC1231l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    InterfaceC4233c interfaceC4233c;
                    C1935k0 c1935k0;
                    boolean z9;
                    switch (i9) {
                        case 0:
                            List list = (List) obj;
                            C1270n c1270n = this.f4206h;
                            C1261e c1261eM3400k1 = c1270n.m3400k1();
                            C1941n0 c1941n0M4819c = C1941n0.m4819c(c1270n.f4218v, C1034w.f3263g, 0L, null, null, 0L, 0, 0L, 16777214);
                            EnumC4243m enumC4243m = c1261eM3400k1.f4159o;
                            C1935k0 c1935k02 = null;
                            if (enumC4243m != null && (interfaceC4233c = c1261eM3400k1.f4153i) != null) {
                                C1926g c1926g = new C1926g(c1261eM3400k1.f4145a);
                                if (c1261eM3400k1.f4154j == null || c1261eM3400k1.f4158n == null) {
                                    c1935k0 = null;
                                } else {
                                    long j3 = c1261eM3400k1.f4160p & (-8589934589L);
                                    int i10 = c1261eM3400k1.f4150f;
                                    boolean z10 = c1261eM3400k1.f4149e;
                                    int i11 = c1261eM3400k1.f4148d;
                                    InterfaceC2760d interfaceC2760d = c1261eM3400k1.f4147c;
                                    C4173t c4173t = C4173t.f13710g;
                                    c1935k0 = new C1935k0(new C1933j0(c1926g, c1941n0M4819c, c4173t, i10, z10, i11, interfaceC4233c, enumC4243m, interfaceC2760d, j3), new C1942o(new C0289k(c1926g, c1941n0M4819c, c4173t, interfaceC4233c, interfaceC2760d), j3, c1261eM3400k1.f4150f, c1261eM3400k1.f4148d), c1261eM3400k1.f4156l);
                                }
                            }
                            if (c1935k0 != null) {
                                list.add(c1935k0);
                                c1935k02 = c1935k0;
                            }
                            return Boolean.valueOf(c1935k02 != null);
                        case 1:
                            String str = ((C1926g) obj).f6529h;
                            C1270n c1270n2 = this.f4206h;
                            C1269m c1269m = c1270n2.f4216F;
                            if (c1269m == null) {
                                C1269m c1269m2 = new C1269m(c1270n2.f4217u, str);
                                C1261e c1261e = new C1261e(str, c1270n2.f4218v, c1270n2.f4219w, c1270n2.f4220x, c1270n2.f4221y, c1270n2.f4222z, c1270n2.f4211A);
                                c1261e.m3395d(c1270n2.m3400k1().f4153i);
                                c1269m2.f4210d = c1261e;
                                c1270n2.f4216F = c1269m2;
                            } else if (!AbstractC1416l.m3825a(str, c1269m.f4208b)) {
                                c1269m.f4208b = str;
                                C1261e c1261e2 = c1269m.f4210d;
                                if (c1261e2 != null) {
                                    c1261e2.m3397f(str, c1270n2.f4218v, c1270n2.f4219w, c1270n2.f4220x, c1270n2.f4221y, c1270n2.f4222z, c1270n2.f4211A);
                                }
                            }
                            AbstractC5618k.m10158n(c1270n2);
                            AbstractC5618k.m10157m(c1270n2);
                            AbstractC5618k.m10156l(c1270n2);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            C1270n c1270n3 = this.f4206h;
                            C1269m c1269m3 = c1270n3.f4216F;
                            if (c1269m3 == null) {
                                z9 = false;
                            } else {
                                c1269m3.f4209c = zBooleanValue;
                                AbstractC5618k.m10158n(c1270n3);
                                AbstractC5618k.m10157m(c1270n3);
                                AbstractC5618k.m10156l(c1270n3);
                                z9 = true;
                            }
                            return Boolean.valueOf(z9);
                    }
                }
            };
            this.f4215E = r03;
            r02 = r03;
        }
        C1926g c1926g = new C1926g(this.f4217u);
        InterfaceC2842d[] interfaceC2842dArr = AbstractC1060w.f3404a;
        interfaceC1062y.mo2644a(AbstractC1058u.f3361B, AbstractC0000a.m99x0(c1926g));
        C1269m c1269m = this.f4216F;
        if (c1269m != null) {
            boolean z9 = c1269m.f4209c;
            C1061x c1061x = AbstractC1058u.f3363D;
            InterfaceC2842d[] interfaceC2842dArr2 = AbstractC1060w.f3404a;
            InterfaceC2842d interfaceC2842d = interfaceC2842dArr2[17];
            interfaceC1062y.mo2644a(c1061x, Boolean.valueOf(z9));
            C1926g c1926g2 = new C1926g(c1269m.f4208b);
            C1061x c1061x2 = AbstractC1058u.f3362C;
            InterfaceC2842d interfaceC2842d2 = interfaceC2842dArr2[16];
            interfaceC1062y.mo2644a(c1061x2, c1926g2);
        }
        final int i10 = 1;
        interfaceC1062y.mo2644a(AbstractC1049l.f3326l, new C1038a(null, new InterfaceC1231l(this) { // from class: g0.l

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C1270n f4206h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f4206h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
            @Override // p085fg.InterfaceC1231l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                InterfaceC4233c interfaceC4233c;
                C1935k0 c1935k0;
                boolean z92;
                switch (i10) {
                    case 0:
                        List list = (List) obj;
                        C1270n c1270n = this.f4206h;
                        C1261e c1261eM3400k1 = c1270n.m3400k1();
                        C1941n0 c1941n0M4819c = C1941n0.m4819c(c1270n.f4218v, C1034w.f3263g, 0L, null, null, 0L, 0, 0L, 16777214);
                        EnumC4243m enumC4243m = c1261eM3400k1.f4159o;
                        C1935k0 c1935k02 = null;
                        if (enumC4243m != null && (interfaceC4233c = c1261eM3400k1.f4153i) != null) {
                            C1926g c1926g3 = new C1926g(c1261eM3400k1.f4145a);
                            if (c1261eM3400k1.f4154j == null || c1261eM3400k1.f4158n == null) {
                                c1935k0 = null;
                            } else {
                                long j3 = c1261eM3400k1.f4160p & (-8589934589L);
                                int i102 = c1261eM3400k1.f4150f;
                                boolean z10 = c1261eM3400k1.f4149e;
                                int i11 = c1261eM3400k1.f4148d;
                                InterfaceC2760d interfaceC2760d = c1261eM3400k1.f4147c;
                                C4173t c4173t = C4173t.f13710g;
                                c1935k0 = new C1935k0(new C1933j0(c1926g3, c1941n0M4819c, c4173t, i102, z10, i11, interfaceC4233c, enumC4243m, interfaceC2760d, j3), new C1942o(new C0289k(c1926g3, c1941n0M4819c, c4173t, interfaceC4233c, interfaceC2760d), j3, c1261eM3400k1.f4150f, c1261eM3400k1.f4148d), c1261eM3400k1.f4156l);
                            }
                        }
                        if (c1935k0 != null) {
                            list.add(c1935k0);
                            c1935k02 = c1935k0;
                        }
                        return Boolean.valueOf(c1935k02 != null);
                    case 1:
                        String str = ((C1926g) obj).f6529h;
                        C1270n c1270n2 = this.f4206h;
                        C1269m c1269m2 = c1270n2.f4216F;
                        if (c1269m2 == null) {
                            C1269m c1269m22 = new C1269m(c1270n2.f4217u, str);
                            C1261e c1261e = new C1261e(str, c1270n2.f4218v, c1270n2.f4219w, c1270n2.f4220x, c1270n2.f4221y, c1270n2.f4222z, c1270n2.f4211A);
                            c1261e.m3395d(c1270n2.m3400k1().f4153i);
                            c1269m22.f4210d = c1261e;
                            c1270n2.f4216F = c1269m22;
                        } else if (!AbstractC1416l.m3825a(str, c1269m2.f4208b)) {
                            c1269m2.f4208b = str;
                            C1261e c1261e2 = c1269m2.f4210d;
                            if (c1261e2 != null) {
                                c1261e2.m3397f(str, c1270n2.f4218v, c1270n2.f4219w, c1270n2.f4220x, c1270n2.f4221y, c1270n2.f4222z, c1270n2.f4211A);
                            }
                        }
                        AbstractC5618k.m10158n(c1270n2);
                        AbstractC5618k.m10157m(c1270n2);
                        AbstractC5618k.m10156l(c1270n2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C1270n c1270n3 = this.f4206h;
                        C1269m c1269m3 = c1270n3.f4216F;
                        if (c1269m3 == null) {
                            z92 = false;
                        } else {
                            c1269m3.f4209c = zBooleanValue;
                            AbstractC5618k.m10158n(c1270n3);
                            AbstractC5618k.m10157m(c1270n3);
                            AbstractC5618k.m10156l(c1270n3);
                            z92 = true;
                        }
                        return Boolean.valueOf(z92);
                }
            }
        }));
        final int i11 = 2;
        interfaceC1062y.mo2644a(AbstractC1049l.f3327m, new C1038a(null, new InterfaceC1231l(this) { // from class: g0.l

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C1270n f4206h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f4206h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
            @Override // p085fg.InterfaceC1231l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                InterfaceC4233c interfaceC4233c;
                C1935k0 c1935k0;
                boolean z92;
                switch (i11) {
                    case 0:
                        List list = (List) obj;
                        C1270n c1270n = this.f4206h;
                        C1261e c1261eM3400k1 = c1270n.m3400k1();
                        C1941n0 c1941n0M4819c = C1941n0.m4819c(c1270n.f4218v, C1034w.f3263g, 0L, null, null, 0L, 0, 0L, 16777214);
                        EnumC4243m enumC4243m = c1261eM3400k1.f4159o;
                        C1935k0 c1935k02 = null;
                        if (enumC4243m != null && (interfaceC4233c = c1261eM3400k1.f4153i) != null) {
                            C1926g c1926g3 = new C1926g(c1261eM3400k1.f4145a);
                            if (c1261eM3400k1.f4154j == null || c1261eM3400k1.f4158n == null) {
                                c1935k0 = null;
                            } else {
                                long j3 = c1261eM3400k1.f4160p & (-8589934589L);
                                int i102 = c1261eM3400k1.f4150f;
                                boolean z10 = c1261eM3400k1.f4149e;
                                int i112 = c1261eM3400k1.f4148d;
                                InterfaceC2760d interfaceC2760d = c1261eM3400k1.f4147c;
                                C4173t c4173t = C4173t.f13710g;
                                c1935k0 = new C1935k0(new C1933j0(c1926g3, c1941n0M4819c, c4173t, i102, z10, i112, interfaceC4233c, enumC4243m, interfaceC2760d, j3), new C1942o(new C0289k(c1926g3, c1941n0M4819c, c4173t, interfaceC4233c, interfaceC2760d), j3, c1261eM3400k1.f4150f, c1261eM3400k1.f4148d), c1261eM3400k1.f4156l);
                            }
                        }
                        if (c1935k0 != null) {
                            list.add(c1935k0);
                            c1935k02 = c1935k0;
                        }
                        return Boolean.valueOf(c1935k02 != null);
                    case 1:
                        String str = ((C1926g) obj).f6529h;
                        C1270n c1270n2 = this.f4206h;
                        C1269m c1269m2 = c1270n2.f4216F;
                        if (c1269m2 == null) {
                            C1269m c1269m22 = new C1269m(c1270n2.f4217u, str);
                            C1261e c1261e = new C1261e(str, c1270n2.f4218v, c1270n2.f4219w, c1270n2.f4220x, c1270n2.f4221y, c1270n2.f4222z, c1270n2.f4211A);
                            c1261e.m3395d(c1270n2.m3400k1().f4153i);
                            c1269m22.f4210d = c1261e;
                            c1270n2.f4216F = c1269m22;
                        } else if (!AbstractC1416l.m3825a(str, c1269m2.f4208b)) {
                            c1269m2.f4208b = str;
                            C1261e c1261e2 = c1269m2.f4210d;
                            if (c1261e2 != null) {
                                c1261e2.m3397f(str, c1270n2.f4218v, c1270n2.f4219w, c1270n2.f4220x, c1270n2.f4221y, c1270n2.f4222z, c1270n2.f4211A);
                            }
                        }
                        AbstractC5618k.m10158n(c1270n2);
                        AbstractC5618k.m10157m(c1270n2);
                        AbstractC5618k.m10156l(c1270n2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C1270n c1270n3 = this.f4206h;
                        C1269m c1269m3 = c1270n3.f4216F;
                        if (c1269m3 == null) {
                            z92 = false;
                        } else {
                            c1269m3.f4209c = zBooleanValue;
                            AbstractC5618k.m10158n(c1270n3);
                            AbstractC5618k.m10157m(c1270n3);
                            AbstractC5618k.m10156l(c1270n3);
                            z92 = true;
                        }
                        return Boolean.valueOf(z92);
                }
            }
        }));
        interfaceC1062y.mo2644a(AbstractC1049l.f3328n, new C1038a(null, new C0041a(this, 22)));
        AbstractC1060w.m2678a(interfaceC1062y, r02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo1349Z0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            C1261e c1261eM3401l1 = m3401l1(interfaceC4418p0);
            boolean zM3393b = c1261eM3401l1.m3393b(j3, interfaceC4418p0.getLayoutDirection());
            InterfaceC1949t interfaceC1949t = c1261eM3401l1.f4158n;
            if (interfaceC1949t != null) {
                interfaceC1949t.mo1192a();
            }
            C1914a c1914a = c1261eM3401l1.f4154j;
            c1914a.getClass();
            C2061k c2061k = c1914a.f6459d;
            long j4 = c1261eM3401l1.f4156l;
            if (zM3393b) {
                AbstractC5618k.m10164t(this, 2).m10113y1();
                HashMap map = this.f4212B;
                if (map == null) {
                    map = new HashMap(2);
                    this.f4212B = map;
                }
                map.put(AbstractC4378c.f14598a, Integer.valueOf(Math.round(c2061k.m5112d(0))));
                map.put(AbstractC4378c.f14599b, Integer.valueOf(Math.round(c2061k.m5112d(c2061k.f6921g - 1))));
            }
            int i9 = (int) (j4 >> 32);
            int i10 = (int) (j4 & 4294967295L);
            AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(AbstractC1089i.m2793u(i9, i9, i10, i10));
            HashMap map2 = this.f4212B;
            map2.getClass();
            InterfaceC4415o0 interfaceC4415o0Mo8010z = interfaceC4418p0.mo8010z(i9, i10, map2, new C1263g(abstractC4377b1Mo8831Q, 1));
            Trace.endSection();
            return interfaceC4415o0Mo8010z;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final C1261e m3400k1() {
        C1941n0 c1941n0 = this.f4214D;
        if (c1941n0 == null) {
            c1941n0 = this.f4218v;
        }
        C1941n0 c1941n02 = c1941n0;
        if (this.f4213C == null) {
            this.f4213C = new C1261e(this.f4217u, c1941n02, this.f4219w, this.f4220x, this.f4221y, this.f4222z, this.f4211A);
        }
        C1261e c1261e = this.f4213C;
        c1261e.getClass();
        return c1261e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX INFO: renamed from: l1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1261e m3401l1(InterfaceC4418p0 interfaceC4418p0) {
        C1261e c1261eM3400k1;
        if (m3402m1(1)) {
            C1941n0 c1941n0 = this.f4214D;
            if (c1941n0 == null) {
                c1941n0 = this.f4218v;
            }
            m3400k1().m3397f(this.f4217u, c1941n0, this.f4219w, this.f4220x, this.f4221y, this.f4222z, this.f4211A);
        }
        C1269m c1269m = this.f4216F;
        if (c1269m == null) {
            c1261eM3400k1 = m3400k1();
        } else {
            if (!c1269m.f4209c) {
                c1269m = null;
            }
            if (c1269m == null || (c1261eM3400k1 = c1269m.f4210d) == null) {
            }
        }
        c1261eM3400k1.m3395d(interfaceC4418p0);
        return c1261eM3400k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m1 */
    public final boolean m3402m1(int i9) {
        C1941n0 c1941n0 = this.f4214D;
        C1941n0 c1941n02 = this.f4218v;
        AbstractC5618k.m10170z(this, "StyleOuterNode", new C1271o(0));
        this.f4214D = c1941n02;
        if (c1941n0 == null) {
            return false;
        }
        return !c1941n0.equals(c1941n02);
    }
}
