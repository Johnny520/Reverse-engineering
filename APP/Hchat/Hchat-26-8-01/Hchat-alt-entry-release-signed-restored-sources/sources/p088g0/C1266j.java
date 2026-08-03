package p088g0;

import ac.AbstractC0063p;
import android.os.Trace;
import gg.AbstractC1416l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mg.InterfaceC2842d;
import p000a.AbstractC0000a;
import p011ab.C0041a;
import p057e1.C0808c;
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
import p089g1.C1275d;
import p101h1.AbstractC1566c;
import p101h1.C1569f;
import p119i2.C1925f0;
import p119i2.C1926g;
import p119i2.C1933j0;
import p119i2.C1935k0;
import p119i2.C1941n0;
import p119i2.C1942o;
import p177m2.InterfaceC2760d;
import p280t2.C4096l;
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

/* JADX INFO: renamed from: g0.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1266j extends AbstractC5852n implements InterfaceC5651v, InterfaceC5624m, InterfaceC5665z1 {

    /* JADX INFO: renamed from: A */
    public int f4183A;

    /* JADX INFO: renamed from: B */
    public int f4184B;

    /* JADX INFO: renamed from: C */
    public List f4185C;

    /* JADX INFO: renamed from: D */
    public InterfaceC1231l f4186D;

    /* JADX INFO: renamed from: E */
    public InterfaceC1231l f4187E;

    /* JADX INFO: renamed from: F */
    public Map f4188F;

    /* JADX INFO: renamed from: G */
    public C1260d f4189G;

    /* JADX INFO: renamed from: H */
    public C1264h f4190H;

    /* JADX INFO: renamed from: I */
    public C1265i f4191I;

    /* JADX INFO: renamed from: u */
    public C1926g f4192u;

    /* JADX INFO: renamed from: v */
    public C1941n0 f4193v;

    /* JADX INFO: renamed from: w */
    public InterfaceC2760d f4194w;

    /* JADX INFO: renamed from: x */
    public InterfaceC1231l f4195x;

    /* JADX INFO: renamed from: y */
    public int f4196y;

    /* JADX INFO: renamed from: z */
    public boolean f4197z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // p339x1.InterfaceC5624m
    /* JADX INFO: renamed from: B */
    public final void mo1326B(C5610h0 c5610h0) {
        if (!this.f23801t) {
            return;
        }
        InterfaceC1031u interfaceC1031uM819p = c5610h0.f22833g.f5220h.m819p();
        C1260d c1260dM3399l1 = m3399l1(c5610h0);
        C1935k0 c1935k0 = c1260dM3399l1.f4141n;
        if (c1935k0 == null) {
            C1275d.m3413g(c1260dM3399l1, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
            return;
        }
        C1942o c1942o = c1935k0.f6562b;
        boolean z9 = true;
        boolean z10 = c1935k0.m4804d() && this.f4196y != 3;
        if (z10) {
            long j3 = c1935k0.f6563c;
            C0808c c0808cM408a = AbstractC0063p.m408a(0L, (((long) Float.floatToRawIntBits((int) (j3 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j3 & 4294967295L))) & 4294967295L));
            interfaceC1031uM819p.mo2487e();
            InterfaceC1031u.m2630k(interfaceC1031uM819p, c0808cM408a);
        }
        try {
            C1925f0 c1925f0 = this.f4193v.f6580a;
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
                C1942o.m4823j(c1942o, interfaceC1031uM819p, abstractC1027sMo8269c, this.f4193v.f6580a.f6513a.mo8267a(), c1024q02, c4096l2, abstractC1566c2);
            } else {
                long jM4820a = C1034w.f3263g;
                if (jM4820a == 16) {
                    jM4820a = this.f4193v.m4820a() != 16 ? this.f4193v.m4820a() : C1034w.f3258b;
                }
                C1942o.m4822i(c1942o, interfaceC1031uM819p, jM4820a, c1024q02, c4096l2, abstractC1566c2);
            }
            if (z10) {
                interfaceC1031uM819p.mo2497p();
            }
            C1265i c1265i = this.f4191I;
            if (!((c1265i == null || !c1265i.f4181c) ? AbstractC1089i.m2741N(this.f4192u) : false)) {
                List list = this.f4185C;
                if (list != null && !list.isEmpty()) {
                    z9 = false;
                }
                if (z9) {
                    return;
                }
            }
            c5610h0.m10064e();
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: G */
    public final int mo1345G(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        return AbstractC4634s.m9071n(m3399l1(abstractC5628n0).m3388e(abstractC5628n0.getLayoutDirection()).mo1193b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: K0 */
    public final int mo1346K0(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        return m3399l1(abstractC5628n0).m3384a(i9, abstractC5628n0.getLayoutDirection());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: Q */
    public final int mo1347Q(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        return AbstractC4634s.m9071n(m3399l1(abstractC5628n0).m3388e(abstractC5628n0.getLayoutDirection()).mo1194c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: R0 */
    public final int mo1348R0(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        return m3399l1(abstractC5628n0).m3384a(i9, abstractC5628n0.getLayoutDirection());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fg.l] */
    /* JADX WARN: Type inference failed for: r0v2, types: [g0.h] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: X0 */
    public final void mo1610X0(InterfaceC1062y interfaceC1062y) {
        C1264h c1264h = this.f4190H;
        ?? r02 = c1264h;
        if (c1264h == null) {
            final int i9 = 0;
            ?? r03 = new InterfaceC1231l(this) { // from class: g0.h

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C1266j f4178h;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f4178h = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1231l
                public final Object invoke(Object obj) {
                    C1935k0 c1935k0;
                    boolean z9;
                    switch (i9) {
                        case 0:
                            List list = (List) obj;
                            C1266j c1266j = this.f4178h;
                            C1935k0 c1935k02 = c1266j.m3398k1().f4141n;
                            if (c1935k02 != null) {
                                C1933j0 c1933j0 = c1935k02.f6561a;
                                c1935k0 = new C1935k0(new C1933j0(c1933j0.f6549a, C1941n0.m4819c(c1266j.f4193v, C1034w.f3263g, 0L, null, null, 0L, 0, 0L, 16777214), c1933j0.f6551c, c1933j0.f6552d, c1933j0.f6553e, c1933j0.f6554f, c1933j0.f6555g, c1933j0.f6556h, c1933j0.f6557i, c1933j0.f6558j), c1935k02.f6562b, c1935k02.f6563c);
                                list.add(c1935k0);
                            } else {
                                c1935k0 = null;
                            }
                            return Boolean.valueOf(c1935k0 != null);
                        case 1:
                            C1926g c1926g = (C1926g) obj;
                            C1266j c1266j2 = this.f4178h;
                            C1265i c1265i = c1266j2.f4191I;
                            C4173t c4173t = C4173t.f13710g;
                            if (c1265i == null) {
                                C1265i c1265i2 = new C1265i(c1266j2.f4192u, c1926g);
                                C1260d c1260d = new C1260d(c1926g, c1266j2.f4193v, c1266j2.f4194w, c1266j2.f4196y, c1266j2.f4197z, c1266j2.f4183A, c1266j2.f4184B, c4173t);
                                c1260d.m3387d(c1266j2.m3398k1().f4137j);
                                c1265i2.f4182d = c1260d;
                                c1266j2.f4191I = c1265i2;
                            } else if (!AbstractC1416l.m3825a(c1926g, c1265i.f4180b)) {
                                c1265i.f4180b = c1926g;
                                C1260d c1260d2 = c1265i.f4182d;
                                if (c1260d2 != null) {
                                    c1260d2.m3390g(c1926g, c1266j2.f4193v, c1266j2.f4194w, c1266j2.f4196y, c1266j2.f4197z, c1266j2.f4183A, c1266j2.f4184B, c4173t);
                                }
                            }
                            AbstractC5618k.m10158n(c1266j2);
                            AbstractC5618k.m10157m(c1266j2);
                            AbstractC5618k.m10156l(c1266j2);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            C1266j c1266j3 = this.f4178h;
                            C1265i c1265i3 = c1266j3.f4191I;
                            if (c1265i3 == null) {
                                z9 = false;
                            } else {
                                InterfaceC1231l interfaceC1231l = c1266j3.f4187E;
                                if (interfaceC1231l != null) {
                                    interfaceC1231l.invoke(c1265i3);
                                }
                                C1265i c1265i4 = c1266j3.f4191I;
                                if (c1265i4 != null) {
                                    c1265i4.f4181c = zBooleanValue;
                                }
                                AbstractC5618k.m10158n(c1266j3);
                                AbstractC5618k.m10157m(c1266j3);
                                AbstractC5618k.m10156l(c1266j3);
                                z9 = true;
                            }
                            return Boolean.valueOf(z9);
                    }
                }
            };
            this.f4190H = r03;
            r02 = r03;
        }
        C1926g c1926g = this.f4192u;
        InterfaceC2842d[] interfaceC2842dArr = AbstractC1060w.f3404a;
        interfaceC1062y.mo2644a(AbstractC1058u.f3361B, AbstractC0000a.m99x0(c1926g));
        C1265i c1265i = this.f4191I;
        if (c1265i != null) {
            C1926g c1926g2 = c1265i.f4180b;
            C1061x c1061x = AbstractC1058u.f3362C;
            InterfaceC2842d[] interfaceC2842dArr2 = AbstractC1060w.f3404a;
            InterfaceC2842d interfaceC2842d = interfaceC2842dArr2[16];
            interfaceC1062y.mo2644a(c1061x, c1926g2);
            boolean z9 = c1265i.f4181c;
            C1061x c1061x2 = AbstractC1058u.f3363D;
            InterfaceC2842d interfaceC2842d2 = interfaceC2842dArr2[17];
            interfaceC1062y.mo2644a(c1061x2, Boolean.valueOf(z9));
        }
        final int i10 = 1;
        interfaceC1062y.mo2644a(AbstractC1049l.f3326l, new C1038a(null, new InterfaceC1231l(this) { // from class: g0.h

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C1266j f4178h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f4178h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1231l
            public final Object invoke(Object obj) {
                C1935k0 c1935k0;
                boolean z92;
                switch (i10) {
                    case 0:
                        List list = (List) obj;
                        C1266j c1266j = this.f4178h;
                        C1935k0 c1935k02 = c1266j.m3398k1().f4141n;
                        if (c1935k02 != null) {
                            C1933j0 c1933j0 = c1935k02.f6561a;
                            c1935k0 = new C1935k0(new C1933j0(c1933j0.f6549a, C1941n0.m4819c(c1266j.f4193v, C1034w.f3263g, 0L, null, null, 0L, 0, 0L, 16777214), c1933j0.f6551c, c1933j0.f6552d, c1933j0.f6553e, c1933j0.f6554f, c1933j0.f6555g, c1933j0.f6556h, c1933j0.f6557i, c1933j0.f6558j), c1935k02.f6562b, c1935k02.f6563c);
                            list.add(c1935k0);
                        } else {
                            c1935k0 = null;
                        }
                        return Boolean.valueOf(c1935k0 != null);
                    case 1:
                        C1926g c1926g3 = (C1926g) obj;
                        C1266j c1266j2 = this.f4178h;
                        C1265i c1265i2 = c1266j2.f4191I;
                        C4173t c4173t = C4173t.f13710g;
                        if (c1265i2 == null) {
                            C1265i c1265i22 = new C1265i(c1266j2.f4192u, c1926g3);
                            C1260d c1260d = new C1260d(c1926g3, c1266j2.f4193v, c1266j2.f4194w, c1266j2.f4196y, c1266j2.f4197z, c1266j2.f4183A, c1266j2.f4184B, c4173t);
                            c1260d.m3387d(c1266j2.m3398k1().f4137j);
                            c1265i22.f4182d = c1260d;
                            c1266j2.f4191I = c1265i22;
                        } else if (!AbstractC1416l.m3825a(c1926g3, c1265i2.f4180b)) {
                            c1265i2.f4180b = c1926g3;
                            C1260d c1260d2 = c1265i2.f4182d;
                            if (c1260d2 != null) {
                                c1260d2.m3390g(c1926g3, c1266j2.f4193v, c1266j2.f4194w, c1266j2.f4196y, c1266j2.f4197z, c1266j2.f4183A, c1266j2.f4184B, c4173t);
                            }
                        }
                        AbstractC5618k.m10158n(c1266j2);
                        AbstractC5618k.m10157m(c1266j2);
                        AbstractC5618k.m10156l(c1266j2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C1266j c1266j3 = this.f4178h;
                        C1265i c1265i3 = c1266j3.f4191I;
                        if (c1265i3 == null) {
                            z92 = false;
                        } else {
                            InterfaceC1231l interfaceC1231l = c1266j3.f4187E;
                            if (interfaceC1231l != null) {
                                interfaceC1231l.invoke(c1265i3);
                            }
                            C1265i c1265i4 = c1266j3.f4191I;
                            if (c1265i4 != null) {
                                c1265i4.f4181c = zBooleanValue;
                            }
                            AbstractC5618k.m10158n(c1266j3);
                            AbstractC5618k.m10157m(c1266j3);
                            AbstractC5618k.m10156l(c1266j3);
                            z92 = true;
                        }
                        return Boolean.valueOf(z92);
                }
            }
        }));
        final int i11 = 2;
        interfaceC1062y.mo2644a(AbstractC1049l.f3327m, new C1038a(null, new InterfaceC1231l(this) { // from class: g0.h

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C1266j f4178h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f4178h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1231l
            public final Object invoke(Object obj) {
                C1935k0 c1935k0;
                boolean z92;
                switch (i11) {
                    case 0:
                        List list = (List) obj;
                        C1266j c1266j = this.f4178h;
                        C1935k0 c1935k02 = c1266j.m3398k1().f4141n;
                        if (c1935k02 != null) {
                            C1933j0 c1933j0 = c1935k02.f6561a;
                            c1935k0 = new C1935k0(new C1933j0(c1933j0.f6549a, C1941n0.m4819c(c1266j.f4193v, C1034w.f3263g, 0L, null, null, 0L, 0, 0L, 16777214), c1933j0.f6551c, c1933j0.f6552d, c1933j0.f6553e, c1933j0.f6554f, c1933j0.f6555g, c1933j0.f6556h, c1933j0.f6557i, c1933j0.f6558j), c1935k02.f6562b, c1935k02.f6563c);
                            list.add(c1935k0);
                        } else {
                            c1935k0 = null;
                        }
                        return Boolean.valueOf(c1935k0 != null);
                    case 1:
                        C1926g c1926g3 = (C1926g) obj;
                        C1266j c1266j2 = this.f4178h;
                        C1265i c1265i2 = c1266j2.f4191I;
                        C4173t c4173t = C4173t.f13710g;
                        if (c1265i2 == null) {
                            C1265i c1265i22 = new C1265i(c1266j2.f4192u, c1926g3);
                            C1260d c1260d = new C1260d(c1926g3, c1266j2.f4193v, c1266j2.f4194w, c1266j2.f4196y, c1266j2.f4197z, c1266j2.f4183A, c1266j2.f4184B, c4173t);
                            c1260d.m3387d(c1266j2.m3398k1().f4137j);
                            c1265i22.f4182d = c1260d;
                            c1266j2.f4191I = c1265i22;
                        } else if (!AbstractC1416l.m3825a(c1926g3, c1265i2.f4180b)) {
                            c1265i2.f4180b = c1926g3;
                            C1260d c1260d2 = c1265i2.f4182d;
                            if (c1260d2 != null) {
                                c1260d2.m3390g(c1926g3, c1266j2.f4193v, c1266j2.f4194w, c1266j2.f4196y, c1266j2.f4197z, c1266j2.f4183A, c1266j2.f4184B, c4173t);
                            }
                        }
                        AbstractC5618k.m10158n(c1266j2);
                        AbstractC5618k.m10157m(c1266j2);
                        AbstractC5618k.m10156l(c1266j2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C1266j c1266j3 = this.f4178h;
                        C1265i c1265i3 = c1266j3.f4191I;
                        if (c1265i3 == null) {
                            z92 = false;
                        } else {
                            InterfaceC1231l interfaceC1231l = c1266j3.f4187E;
                            if (interfaceC1231l != null) {
                                interfaceC1231l.invoke(c1265i3);
                            }
                            C1265i c1265i4 = c1266j3.f4191I;
                            if (c1265i4 != null) {
                                c1265i4.f4181c = zBooleanValue;
                            }
                            AbstractC5618k.m10158n(c1266j3);
                            AbstractC5618k.m10157m(c1266j3);
                            AbstractC5618k.m10156l(c1266j3);
                            z92 = true;
                        }
                        return Boolean.valueOf(z92);
                }
            }
        }));
        interfaceC1062y.mo2644a(AbstractC1049l.f3328n, new C1038a(null, new C0041a(this, 21)));
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
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            C1260d c1260dM3399l1 = m3399l1(interfaceC4418p0);
            boolean zM3386c = c1260dM3399l1.m3386c(j3, interfaceC4418p0.getLayoutDirection());
            C1935k0 c1935k0 = c1260dM3399l1.f4141n;
            if (c1935k0 == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + c1260dM3399l1);
            }
            long j4 = c1935k0.f6563c;
            c1935k0.f6562b.f6583a.mo1192a();
            if (zM3386c) {
                AbstractC5618k.m10164t(this, 2).m10113y1();
                InterfaceC1231l interfaceC1231l = this.f4195x;
                if (interfaceC1231l != null) {
                    interfaceC1231l.invoke(c1935k0);
                }
                Map linkedHashMap = this.f4188F;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(AbstractC4378c.f14598a, Integer.valueOf(Math.round(c1935k0.f6564d)));
                linkedHashMap.put(AbstractC4378c.f14599b, Integer.valueOf(Math.round(c1935k0.f6565e)));
                this.f4188F = linkedHashMap;
            }
            InterfaceC1231l interfaceC1231l2 = this.f4186D;
            if (interfaceC1231l2 != null) {
                interfaceC1231l2.invoke(c1935k0.f6566f);
            }
            int i9 = (int) (j4 >> 32);
            int i10 = (int) (j4 & 4294967295L);
            AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(AbstractC1089i.m2793u(i9, i9, i10, i10));
            Map map = this.f4188F;
            map.getClass();
            InterfaceC4415o0 interfaceC4415o0Mo8010z = interfaceC4418p0.mo8010z(i9, i10, map, new C1263g(abstractC4377b1Mo8831Q, 0));
            Trace.endSection();
            return interfaceC4415o0Mo8010z;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final C1260d m3398k1() {
        if (this.f4189G == null) {
            this.f4189G = new C1260d(this.f4192u, this.f4193v, this.f4194w, this.f4196y, this.f4197z, this.f4183A, this.f4184B, this.f4185C);
        }
        C1260d c1260d = this.f4189G;
        c1260d.getClass();
        return c1260d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l1 */
    public final C1260d m3399l1(InterfaceC4233c interfaceC4233c) {
        C1260d c1260d;
        C1265i c1265i = this.f4191I;
        if (c1265i != null && c1265i.f4181c && (c1260d = c1265i.f4182d) != null) {
            c1260d.m3387d(interfaceC4233c);
            return c1260d;
        }
        C1260d c1260dM3398k1 = m3398k1();
        c1260dM3398k1.m3387d(interfaceC4233c);
        return c1260dM3398k1;
    }
}
