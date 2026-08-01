package p054K;

import android.os.Trace;
import java.util.HashMap;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p000A.AbstractC0070k0;
import p000A.C0034R0;
import p000A.C0099z;
import p014C1.C0240b;
import p027E4.C0330q;
import p029F0.AbstractC0391b0;
import p029F0.AbstractC0394d;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p041H0.AbstractC0572Q;
import p041H0.AbstractC0601k;
import p041H0.C0566K;
import p041H0.InterfaceC0605m;
import p041H0.InterfaceC0627x;
import p041H0.InterfaceC0632z0;
import p061L2.C0981u;
import p077P0.AbstractC1124k;
import p077P0.AbstractC1132s;
import p077P0.AbstractC1134u;
import p077P0.C1114a;
import p077P0.C1135v;
import p077P0.InterfaceC1136w;
import p092S0.C1252E;
import p092S0.C1256I;
import p092S0.C1257J;
import p092S0.C1260M;
import p092S0.C1263a;
import p092S0.C1269g;
import p092S0.C1277o;
import p092S0.InterfaceC1281s;
import p096T0.C1410j;
import p110W0.InterfaceC1580e;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p137b3.InterfaceC1855c;
import p147d1.C1962l;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p169h0.AbstractC2206o;
import p179i4.AbstractC2352g;
import p211o0.AbstractC2758q;
import p211o0.C2737L;
import p211o0.C2762u;
import p211o0.InterfaceC2760s;
import p222q0.AbstractC2902c;
import p222q0.C2905f;
import p238t.AbstractC3204b;

/* JADX INFO: renamed from: K.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0873h extends AbstractC2206o implements InterfaceC0627x, InterfaceC0605m, InterfaceC0632z0 {

    /* JADX INFO: renamed from: A */
    public C0871f f2745A;

    /* JADX INFO: renamed from: B */
    public C0872g f2746B;

    /* JADX INFO: renamed from: r */
    public String f2747r;

    /* JADX INFO: renamed from: s */
    public C1260M f2748s;

    /* JADX INFO: renamed from: t */
    public InterfaceC1580e f2749t;

    /* JADX INFO: renamed from: u */
    public int f2750u;

    /* JADX INFO: renamed from: v */
    public boolean f2751v;

    /* JADX INFO: renamed from: w */
    public int f2752w;

    /* JADX INFO: renamed from: x */
    public int f2753x;

    /* JADX INFO: renamed from: y */
    public HashMap f2754y;

    /* JADX INFO: renamed from: z */
    public C0869d f2755z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final C0869d m1900J0() {
        if (this.f2755z == null) {
            this.f2755z = new C0869d(this.f2747r, this.f2748s, this.f2749t, this.f2750u, this.f2751v, this.f2752w, this.f2753x);
        }
        C0869d c0869d = this.f2755z;
        AbstractC1665j.m2982b(c0869d);
        return c0869d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    @Override // p041H0.InterfaceC0605m
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo940R(C0566K c0566k) {
        C0869d c0869dM1900J0;
        if (this.f7199q) {
            C0872g c0872g = this.f2746B;
            if (c0872g == null) {
                c0869dM1900J0 = m1900J0();
            } else {
                if (!c0872g.f2743c) {
                    c0872g = null;
                }
                if (c0872g == null || (c0869dM1900J0 = c0872g.f2744d) == null) {
                }
            }
            C1263a c1263a = c0869dM1900J0.f2722j;
            if (c1263a == null) {
                AbstractC3204b.m5476b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.f2755z + ", textSubstitution=" + this.f2746B + ')');
                throw new C0330q();
            }
            InterfaceC2760s interfaceC2760sM106j = c0566k.f1742d.f9185e.m106j();
            boolean z5 = c0869dM1900J0.f2723k;
            if (z5) {
                long j5 = c0869dM1900J0.f2724l;
                interfaceC2760sM106j.mo4852n();
                interfaceC2760sM106j.mo4845f(0.0f, 0.0f, (int) (j5 >> 32), (int) (j5 & 4294967295L), 1);
            }
            try {
                C1252E c1252e = this.f2748s.f4540a;
                C1962l c1962l = c1252e.f4506m;
                if (c1962l == null) {
                    c1962l = C1962l.f6640b;
                }
                C1962l c1962l2 = c1962l;
                C2737L c2737l = c1252e.f4507n;
                if (c2737l == null) {
                    c2737l = C2737L.f8703d;
                }
                C2737L c2737l2 = c2737l;
                AbstractC2902c abstractC2902c = c1252e.f4508o;
                if (abstractC2902c == null) {
                    abstractC2902c = C2905f.f9190b;
                }
                AbstractC2902c abstractC2902c2 = abstractC2902c;
                AbstractC2758q abstractC2758qMo3621c = c1252e.f4494a.mo3621c();
                if (abstractC2758qMo3621c != null) {
                    c1263a.m2352g(interfaceC2760sM106j, abstractC2758qMo3621c, this.f2748s.f4540a.f4494a.mo3619a(), c2737l2, c1962l2, abstractC2902c2);
                } else {
                    long jM2343b = C2762u.f8762g;
                    if (jM2343b == 16) {
                        jM2343b = this.f2748s.m2343b() != 16 ? this.f2748s.m2343b() : C2762u.f8757b;
                    }
                    c1263a.m2351f(interfaceC2760sM106j, jM2343b, c2737l2, c1962l2, abstractC2902c2);
                }
                if (z5) {
                    interfaceC2760sM106j.mo4851l();
                }
            } catch (Throwable th) {
                if (z5) {
                    interfaceC2760sM106j.mo4851l();
                }
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo941T(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        C0869d c0869dM1900J0;
        C0872g c0872g = this.f2746B;
        if (c0872g == null) {
            c0869dM1900J0 = m1900J0();
        } else {
            if (!c0872g.f2743c) {
                c0872g = null;
            }
            if (c0872g == null || (c0869dM1900J0 = c0872g.f2744d) == null) {
            }
        }
        c0869dM1900J0.m1898d(abstractC0572Q);
        return c0869dM1900J0.m1895a(i5, abstractC0572Q.getLayoutDirection());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [W2.c] */
    /* JADX WARN: Type inference failed for: r0v2, types: [K.f] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: X */
    public final void mo943X(InterfaceC1136w interfaceC1136w) {
        C0871f c0871f = this.f2745A;
        ?? r02 = c0871f;
        if (c0871f == null) {
            final int i5 = 0;
            ?? r03 = new InterfaceC1601c(this) { // from class: K.f

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ C0873h f2740e;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f2740e = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
                @Override // p112W2.InterfaceC1601c
                /* JADX INFO: renamed from: h */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object mo1h(Object obj) {
                    InterfaceC2007c interfaceC2007c;
                    C1257J c1257j;
                    boolean z5;
                    switch (i5) {
                        case 0:
                            List list = (List) obj;
                            C0873h c0873h = this.f2740e;
                            C0869d c0869dM1900J0 = c0873h.m1900J0();
                            C1260M c1260mM2342e = C1260M.m2342e(c0873h.f2748s, C2762u.f8762g, 0L, null, null, 0L, 0, 0L, 16777214);
                            EnumC2017m enumC2017m = c0869dM1900J0.f2727o;
                            C1257J c1257j2 = null;
                            if (enumC2017m != null && (interfaceC2007c = c0869dM1900J0.f2721i) != null) {
                                C1269g c1269g = new C1269g(c0869dM1900J0.f2713a);
                                if (c0869dM1900J0.f2722j == null || c0869dM1900J0.f2726n == null) {
                                    c1257j = null;
                                } else {
                                    long j5 = c0869dM1900J0.f2728p & (-8589934589L);
                                    int i6 = c0869dM1900J0.f2718f;
                                    boolean z6 = c0869dM1900J0.f2717e;
                                    int i7 = c0869dM1900J0.f2716d;
                                    InterfaceC1580e interfaceC1580e = c0869dM1900J0.f2715c;
                                    C0981u c0981u = C0981u.f3047d;
                                    c1257j = new C1257J(new C1256I(c1269g, c1260mM2342e, c0981u, i6, z6, i7, interfaceC2007c, enumC2017m, interfaceC1580e, j5), new C1277o(new C0240b(c1269g, c1260mM2342e, c0981u, interfaceC2007c, interfaceC1580e), j5, c0869dM1900J0.f2718f, c0869dM1900J0.f2716d), c0869dM1900J0.f2724l);
                                }
                            }
                            if (c1257j != null) {
                                list.add(c1257j);
                                c1257j2 = c1257j;
                            }
                            return Boolean.valueOf(c1257j2 != null);
                        case BuildConfig.VERSION_CODE /* 1 */:
                            String str = ((C1269g) obj).f4563e;
                            C0873h c0873h2 = this.f2740e;
                            C0872g c0872g = c0873h2.f2746B;
                            if (c0872g == null) {
                                C0872g c0872g2 = new C0872g(c0873h2.f2747r, str);
                                C0869d c0869d = new C0869d(str, c0873h2.f2748s, c0873h2.f2749t, c0873h2.f2750u, c0873h2.f2751v, c0873h2.f2752w, c0873h2.f2753x);
                                c0869d.m1898d(c0873h2.m1900J0().f2721i);
                                c0872g2.f2744d = c0869d;
                                c0873h2.f2746B = c0872g2;
                            } else if (!AbstractC1665j.m2981a(str, c0872g.f2742b)) {
                                c0872g.f2742b = str;
                                C0869d c0869d2 = c0872g.f2744d;
                                if (c0869d2 != null) {
                                    C1260M c1260m = c0873h2.f2748s;
                                    InterfaceC1580e interfaceC1580e2 = c0873h2.f2749t;
                                    int i8 = c0873h2.f2750u;
                                    boolean z7 = c0873h2.f2751v;
                                    int i9 = c0873h2.f2752w;
                                    int i10 = c0873h2.f2753x;
                                    c0869d2.f2713a = str;
                                    c0869d2.f2714b = c1260m;
                                    c0869d2.f2715c = interfaceC1580e2;
                                    c0869d2.f2716d = i8;
                                    c0869d2.f2717e = z7;
                                    c0869d2.f2718f = i9;
                                    c0869d2.f2719g = i10;
                                    c0869d2.f2731s = (c0869d2.f2731s << 2) | 2;
                                    c0869d2.m1897c();
                                }
                            }
                            AbstractC0601k.m1036l(c0873h2);
                            AbstractC0601k.m1035k(c0873h2);
                            AbstractC0601k.m1034j(c0873h2);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            C0873h c0873h3 = this.f2740e;
                            C0872g c0872g3 = c0873h3.f2746B;
                            if (c0872g3 == null) {
                                z5 = false;
                            } else {
                                c0872g3.f2743c = zBooleanValue;
                                AbstractC0601k.m1036l(c0873h3);
                                AbstractC0601k.m1035k(c0873h3);
                                AbstractC0601k.m1034j(c0873h3);
                                z5 = true;
                            }
                            return Boolean.valueOf(z5);
                    }
                }
            };
            this.f2745A = r03;
            r02 = r03;
        }
        C1269g c1269g = new C1269g(this.f2747r);
        InterfaceC1855c[] interfaceC1855cArr = AbstractC1134u.f3766a;
        interfaceC1136w.mo1128a(AbstractC1132s.f3723B, AbstractC2352g.m4211y(c1269g));
        C0872g c0872g = this.f2746B;
        if (c0872g != null) {
            boolean z5 = c0872g.f2743c;
            C1135v c1135v = AbstractC1132s.f3725D;
            InterfaceC1855c[] interfaceC1855cArr2 = AbstractC1134u.f3766a;
            InterfaceC1855c interfaceC1855c = interfaceC1855cArr2[17];
            interfaceC1136w.mo1128a(c1135v, Boolean.valueOf(z5));
            C1269g c1269g2 = new C1269g(c0872g.f2742b);
            C1135v c1135v2 = AbstractC1132s.f3724C;
            InterfaceC1855c interfaceC1855c2 = interfaceC1855cArr2[16];
            interfaceC1136w.mo1128a(c1135v2, c1269g2);
        }
        final int i6 = 1;
        interfaceC1136w.mo1128a(AbstractC1124k.f3687l, new C1114a(null, new InterfaceC1601c(this) { // from class: K.f

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C0873h f2740e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2740e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
            @Override // p112W2.InterfaceC1601c
            /* JADX INFO: renamed from: h */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo1h(Object obj) {
                InterfaceC2007c interfaceC2007c;
                C1257J c1257j;
                boolean z52;
                switch (i6) {
                    case 0:
                        List list = (List) obj;
                        C0873h c0873h = this.f2740e;
                        C0869d c0869dM1900J0 = c0873h.m1900J0();
                        C1260M c1260mM2342e = C1260M.m2342e(c0873h.f2748s, C2762u.f8762g, 0L, null, null, 0L, 0, 0L, 16777214);
                        EnumC2017m enumC2017m = c0869dM1900J0.f2727o;
                        C1257J c1257j2 = null;
                        if (enumC2017m != null && (interfaceC2007c = c0869dM1900J0.f2721i) != null) {
                            C1269g c1269g3 = new C1269g(c0869dM1900J0.f2713a);
                            if (c0869dM1900J0.f2722j == null || c0869dM1900J0.f2726n == null) {
                                c1257j = null;
                            } else {
                                long j5 = c0869dM1900J0.f2728p & (-8589934589L);
                                int i62 = c0869dM1900J0.f2718f;
                                boolean z6 = c0869dM1900J0.f2717e;
                                int i7 = c0869dM1900J0.f2716d;
                                InterfaceC1580e interfaceC1580e = c0869dM1900J0.f2715c;
                                C0981u c0981u = C0981u.f3047d;
                                c1257j = new C1257J(new C1256I(c1269g3, c1260mM2342e, c0981u, i62, z6, i7, interfaceC2007c, enumC2017m, interfaceC1580e, j5), new C1277o(new C0240b(c1269g3, c1260mM2342e, c0981u, interfaceC2007c, interfaceC1580e), j5, c0869dM1900J0.f2718f, c0869dM1900J0.f2716d), c0869dM1900J0.f2724l);
                            }
                        }
                        if (c1257j != null) {
                            list.add(c1257j);
                            c1257j2 = c1257j;
                        }
                        return Boolean.valueOf(c1257j2 != null);
                    case BuildConfig.VERSION_CODE /* 1 */:
                        String str = ((C1269g) obj).f4563e;
                        C0873h c0873h2 = this.f2740e;
                        C0872g c0872g2 = c0873h2.f2746B;
                        if (c0872g2 == null) {
                            C0872g c0872g22 = new C0872g(c0873h2.f2747r, str);
                            C0869d c0869d = new C0869d(str, c0873h2.f2748s, c0873h2.f2749t, c0873h2.f2750u, c0873h2.f2751v, c0873h2.f2752w, c0873h2.f2753x);
                            c0869d.m1898d(c0873h2.m1900J0().f2721i);
                            c0872g22.f2744d = c0869d;
                            c0873h2.f2746B = c0872g22;
                        } else if (!AbstractC1665j.m2981a(str, c0872g2.f2742b)) {
                            c0872g2.f2742b = str;
                            C0869d c0869d2 = c0872g2.f2744d;
                            if (c0869d2 != null) {
                                C1260M c1260m = c0873h2.f2748s;
                                InterfaceC1580e interfaceC1580e2 = c0873h2.f2749t;
                                int i8 = c0873h2.f2750u;
                                boolean z7 = c0873h2.f2751v;
                                int i9 = c0873h2.f2752w;
                                int i10 = c0873h2.f2753x;
                                c0869d2.f2713a = str;
                                c0869d2.f2714b = c1260m;
                                c0869d2.f2715c = interfaceC1580e2;
                                c0869d2.f2716d = i8;
                                c0869d2.f2717e = z7;
                                c0869d2.f2718f = i9;
                                c0869d2.f2719g = i10;
                                c0869d2.f2731s = (c0869d2.f2731s << 2) | 2;
                                c0869d2.m1897c();
                            }
                        }
                        AbstractC0601k.m1036l(c0873h2);
                        AbstractC0601k.m1035k(c0873h2);
                        AbstractC0601k.m1034j(c0873h2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C0873h c0873h3 = this.f2740e;
                        C0872g c0872g3 = c0873h3.f2746B;
                        if (c0872g3 == null) {
                            z52 = false;
                        } else {
                            c0872g3.f2743c = zBooleanValue;
                            AbstractC0601k.m1036l(c0873h3);
                            AbstractC0601k.m1035k(c0873h3);
                            AbstractC0601k.m1034j(c0873h3);
                            z52 = true;
                        }
                        return Boolean.valueOf(z52);
                }
            }
        }));
        final int i7 = 2;
        interfaceC1136w.mo1128a(AbstractC1124k.f3688m, new C1114a(null, new InterfaceC1601c(this) { // from class: K.f

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C0873h f2740e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2740e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
            @Override // p112W2.InterfaceC1601c
            /* JADX INFO: renamed from: h */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo1h(Object obj) {
                InterfaceC2007c interfaceC2007c;
                C1257J c1257j;
                boolean z52;
                switch (i7) {
                    case 0:
                        List list = (List) obj;
                        C0873h c0873h = this.f2740e;
                        C0869d c0869dM1900J0 = c0873h.m1900J0();
                        C1260M c1260mM2342e = C1260M.m2342e(c0873h.f2748s, C2762u.f8762g, 0L, null, null, 0L, 0, 0L, 16777214);
                        EnumC2017m enumC2017m = c0869dM1900J0.f2727o;
                        C1257J c1257j2 = null;
                        if (enumC2017m != null && (interfaceC2007c = c0869dM1900J0.f2721i) != null) {
                            C1269g c1269g3 = new C1269g(c0869dM1900J0.f2713a);
                            if (c0869dM1900J0.f2722j == null || c0869dM1900J0.f2726n == null) {
                                c1257j = null;
                            } else {
                                long j5 = c0869dM1900J0.f2728p & (-8589934589L);
                                int i62 = c0869dM1900J0.f2718f;
                                boolean z6 = c0869dM1900J0.f2717e;
                                int i72 = c0869dM1900J0.f2716d;
                                InterfaceC1580e interfaceC1580e = c0869dM1900J0.f2715c;
                                C0981u c0981u = C0981u.f3047d;
                                c1257j = new C1257J(new C1256I(c1269g3, c1260mM2342e, c0981u, i62, z6, i72, interfaceC2007c, enumC2017m, interfaceC1580e, j5), new C1277o(new C0240b(c1269g3, c1260mM2342e, c0981u, interfaceC2007c, interfaceC1580e), j5, c0869dM1900J0.f2718f, c0869dM1900J0.f2716d), c0869dM1900J0.f2724l);
                            }
                        }
                        if (c1257j != null) {
                            list.add(c1257j);
                            c1257j2 = c1257j;
                        }
                        return Boolean.valueOf(c1257j2 != null);
                    case BuildConfig.VERSION_CODE /* 1 */:
                        String str = ((C1269g) obj).f4563e;
                        C0873h c0873h2 = this.f2740e;
                        C0872g c0872g2 = c0873h2.f2746B;
                        if (c0872g2 == null) {
                            C0872g c0872g22 = new C0872g(c0873h2.f2747r, str);
                            C0869d c0869d = new C0869d(str, c0873h2.f2748s, c0873h2.f2749t, c0873h2.f2750u, c0873h2.f2751v, c0873h2.f2752w, c0873h2.f2753x);
                            c0869d.m1898d(c0873h2.m1900J0().f2721i);
                            c0872g22.f2744d = c0869d;
                            c0873h2.f2746B = c0872g22;
                        } else if (!AbstractC1665j.m2981a(str, c0872g2.f2742b)) {
                            c0872g2.f2742b = str;
                            C0869d c0869d2 = c0872g2.f2744d;
                            if (c0869d2 != null) {
                                C1260M c1260m = c0873h2.f2748s;
                                InterfaceC1580e interfaceC1580e2 = c0873h2.f2749t;
                                int i8 = c0873h2.f2750u;
                                boolean z7 = c0873h2.f2751v;
                                int i9 = c0873h2.f2752w;
                                int i10 = c0873h2.f2753x;
                                c0869d2.f2713a = str;
                                c0869d2.f2714b = c1260m;
                                c0869d2.f2715c = interfaceC1580e2;
                                c0869d2.f2716d = i8;
                                c0869d2.f2717e = z7;
                                c0869d2.f2718f = i9;
                                c0869d2.f2719g = i10;
                                c0869d2.f2731s = (c0869d2.f2731s << 2) | 2;
                                c0869d2.m1897c();
                            }
                        }
                        AbstractC0601k.m1036l(c0873h2);
                        AbstractC0601k.m1035k(c0873h2);
                        AbstractC0601k.m1034j(c0873h2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C0873h c0873h3 = this.f2740e;
                        C0872g c0872g3 = c0873h3.f2746B;
                        if (c0872g3 == null) {
                            z52 = false;
                        } else {
                            c0872g3.f2743c = zBooleanValue;
                            AbstractC0601k.m1036l(c0873h3);
                            AbstractC0601k.m1035k(c0873h3);
                            AbstractC0601k.m1034j(c0873h3);
                            z52 = true;
                        }
                        return Boolean.valueOf(z52);
                }
            }
        }));
        interfaceC1136w.mo1128a(AbstractC1124k.f3689n, new C1114a(null, new C0099z(10, this)));
        AbstractC1134u.m2188a(interfaceC1136w, r02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:23:0x004c, B:24:0x0073, B:12:0x0015), top: B:29:0x0005 }] */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        C0869d c0869dM1900J0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            C0872g c0872g = this.f2746B;
            if (c0872g == null) {
                c0869dM1900J0 = m1900J0();
            } else {
                if (!c0872g.f2743c) {
                    c0872g = null;
                }
                if (c0872g == null || (c0869dM1900J0 = c0872g.f2744d) == null) {
                }
            }
            c0869dM1900J0.m1898d(interfaceC0379Q);
            boolean zM1896b = c0869dM1900J0.m1896b(j5, interfaceC0379Q.getLayoutDirection());
            InterfaceC1281s interfaceC1281s = c0869dM1900J0.f2726n;
            if (interfaceC1281s != null) {
                interfaceC1281s.mo425b();
            }
            C1263a c1263a = c0869dM1900J0.f2722j;
            AbstractC1665j.m2982b(c1263a);
            C1410j c1410j = c1263a.f4548d;
            long j6 = c0869dM1900J0.f2724l;
            if (zM1896b) {
                AbstractC0601k.m1042r(this, 2).m988Y0();
                HashMap map = this.f2754y;
                if (map == null) {
                    map = new HashMap(2);
                    this.f2754y = map;
                }
                map.put(AbstractC0394d.f1215a, Integer.valueOf(Math.round(c1410j.m2708d(0))));
                map.put(AbstractC0394d.f1216b, Integer.valueOf(Math.round(c1410j.m2708d(c1410j.f5045g - 1))));
            }
            int i5 = (int) (j6 >> 32);
            int i6 = (int) (j6 & 4294967295L);
            AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(AbstractC1784a.m3233s(i5, i5, i6, i6));
            HashMap map2 = this.f2754y;
            AbstractC1665j.m2982b(map2);
            InterfaceC0378P interfaceC0378PMo604f0 = interfaceC0379Q.mo604f0(i5, i6, map2, new C0034R0(abstractC0391b0Mo648e, 1));
            Trace.endSection();
            return interfaceC0378PMo604f0;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo948j(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        C0869d c0869dM1900J0;
        C0872g c0872g = this.f2746B;
        if (c0872g == null) {
            c0869dM1900J0 = m1900J0();
        } else {
            if (!c0872g.f2743c) {
                c0872g = null;
            }
            if (c0872g == null || (c0869dM1900J0 = c0872g.f2744d) == null) {
            }
        }
        c0869dM1900J0.m1898d(abstractC0572Q);
        return AbstractC0070k0.m83j(c0869dM1900J0.m1899e(abstractC0572Q.getLayoutDirection()).mo424a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo949l0(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        C0869d c0869dM1900J0;
        C0872g c0872g = this.f2746B;
        if (c0872g == null) {
            c0869dM1900J0 = m1900J0();
        } else {
            if (!c0872g.f2743c) {
                c0872g = null;
            }
            if (c0872g == null || (c0869dM1900J0 = c0872g.f2744d) == null) {
            }
        }
        c0869dM1900J0.m1898d(abstractC0572Q);
        return c0869dM1900J0.m1895a(i5, abstractC0572Q.getLayoutDirection());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo954w0(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        C0869d c0869dM1900J0;
        C0872g c0872g = this.f2746B;
        if (c0872g == null) {
            c0869dM1900J0 = m1900J0();
        } else {
            if (!c0872g.f2743c) {
                c0872g = null;
            }
            if (c0872g == null || (c0869dM1900J0 = c0872g.f2744d) == null) {
            }
        }
        c0869dM1900J0.m1898d(abstractC0572Q);
        return AbstractC0070k0.m83j(c0869dM1900J0.m1899e(abstractC0572Q.getLayoutDirection()).mo426c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: y0 */
    public final boolean mo656y0() {
        return false;
    }
}
