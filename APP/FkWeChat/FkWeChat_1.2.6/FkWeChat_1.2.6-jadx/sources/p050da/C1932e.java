package p050da;

import ba.C1079g;
import ba.C1083k;
import ba.InterfaceC1088p;
import gb.AbstractC2650c1;
import gb.AbstractC2675i2;
import gb.AbstractC2706r0;
import gb.AbstractC2707r1;
import gb.C2651c2;
import gb.C2704q1;
import gb.C2715u0;
import gb.C2724x0;
import gb.C2731z1;
import gb.EnumC2671h2;
import gb.EnumC2691m2;
import gb.InterfaceC2643a2;
import gb.InterfaceC2716u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lb.AbstractC4734d;
import p024b9.AbstractC1061t;
import p081fa.AbstractC2370a0;
import p081fa.InterfaceC2374c0;
import p081fa.InterfaceC2378f;
import p081fa.InterfaceC2379g;
import p081fa.InterfaceC2381i;
import p081fa.InterfaceC2382j;
import p081fa.InterfaceC2394v;
import p081fa.InterfaceC2396x;
import p081fa.InterfaceC2397y;
import p098g9.C2566t;
import p129ib.C3378i;
import p129ib.C3381l;
import p129ib.EnumC3380k;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5116y;
import p186m9.EnumC5132m;
import p212o9.C5668d;
import p213oa.C5691b;
import p213oa.C5692c;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6018l1;
import p243q9.C6340o;
import p243q9.InterfaceC6328c;
import p243q9.InterfaceC6333h;
import p254r5.C6494d0;
import p358y9.AbstractC9650u0;

/* JADX INFO: renamed from: da.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1932e {

    /* JADX INFO: renamed from: a */
    public final C1083k f5400a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1088p f5401b;

    /* JADX INFO: renamed from: c */
    public final C1934g f5402c;

    /* JADX INFO: renamed from: d */
    public final C2731z1 f5403d;

    /* JADX WARN: Multi-variable type inference failed */
    public C1932e(C1083k c1083k, InterfaceC1088p interfaceC1088p) {
        c1083k.getClass();
        interfaceC1088p.getClass();
        this.f5400a = c1083k;
        this.f5401b = interfaceC1088p;
        C1934g c1934g = new C1934g();
        this.f5402c = c1934g;
        this.f5403d = new C2731z1(c1934g, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC2706r0 m7000e(C1932e c1932e, InterfaceC6018l1 interfaceC6018l1, C1928a c1928a, InterfaceC2716u1 interfaceC2716u1, InterfaceC2382j interfaceC2382j) {
        C2731z1 c2731z1 = c1932e.f5403d;
        InterfaceC6004h interfaceC6004hMo5602u = interfaceC2716u1.mo5602u();
        return c2731z1.m9669e(interfaceC6018l1, c1928a.m6993k(interfaceC6004hMo5602u != null ? interfaceC6004hMo5602u.mo7508x() : null).m6992j(interfaceC2382j.mo8625A()));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ AbstractC2706r0 m7001m(C1932e c1932e, InterfaceC2378f interfaceC2378f, C1928a c1928a, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c1932e.m7012l(interfaceC2378f, c1928a, z10);
    }

    /* JADX INFO: renamed from: o */
    public static final C3378i m7002o(InterfaceC2382j interfaceC2382j) {
        return C3381l.m12703d(EnumC3380k.f9316v, interfaceC2382j.mo8629s());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7003b(InterfaceC2382j interfaceC2382j, InterfaceC5995e interfaceC5995e) {
        EnumC2691m2 enumC2691m2Mo23995s;
        if (!AbstractC2370a0.m8598a((InterfaceC2396x) AbstractC5081g0.m20589w0(interfaceC2382j.mo8627I()))) {
            return false;
        }
        List listMo5600d = C5668d.f17816a.m22902b(interfaceC5995e).mo5591o().mo5600d();
        listMo5600d.getClass();
        InterfaceC6018l1 interfaceC6018l1 = (InterfaceC6018l1) AbstractC5081g0.m20589w0(listMo5600d);
        return (interfaceC6018l1 == null || (enumC2691m2Mo23995s = interfaceC6018l1.mo23995s()) == null || enumC2691m2Mo23995s == EnumC2691m2.f7044w) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m7004c(p081fa.InterfaceC2382j r9, p050da.C1928a r10, gb.InterfaceC2716u1 r11) {
        /*
            r8 = this;
            boolean r0 = r9.mo8625A()
            if (r0 != 0) goto L20
            java.util.List r0 = r9.mo8627I()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1e
            java.util.List r0 = r11.mo5600d()
            r0.getClass()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1e
            goto L20
        L1e:
            r0 = 0
            goto L21
        L20:
            r0 = 1
        L21:
            java.util.List r1 = r11.mo5600d()
            r1.getClass()
            if (r0 == 0) goto L2f
            java.util.List r9 = r8.m7005d(r9, r1, r11, r10)
            return r9
        L2f:
            int r10 = r1.size()
            java.util.List r11 = r9.mo8627I()
            int r11 = r11.size()
            r0 = 10
            if (r10 == r11) goto L78
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = p185m8.AbstractC5116y.m20814z(r1, r0)
            r9.<init>(r10)
            java.util.Iterator r10 = r1.iterator()
        L4c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L73
            java.lang.Object r11 = r10.next()
            p9.l1 r11 = (p229p9.InterfaceC6018l1) r11
            gb.c2 r0 = new gb.c2
            ib.k r1 = p129ib.EnumC3380k.f9303l0
            oa.f r11 = r11.getName()
            java.lang.String r11 = r11.m23030c()
            java.lang.String[] r11 = new java.lang.String[]{r11}
            ib.i r11 = p129ib.C3381l.m12703d(r1, r11)
            r0.<init>(r11)
            r9.add(r0)
            goto L4c
        L73:
            java.util.List r9 = p185m8.AbstractC5081g0.m20554X0(r9)
            return r9
        L78:
            java.util.List r9 = r9.mo8627I()
            java.lang.Iterable r9 = p185m8.AbstractC5081g0.m20570f1(r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = p185m8.AbstractC5116y.m20814z(r9, r0)
            r10.<init>(r11)
            java.util.Iterator r9 = r9.iterator()
        L8d:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto Lc2
            java.lang.Object r11 = r9.next()
            m8.n0 r11 = (p185m8.C5095n0) r11
            int r0 = r11.m20619a()
            java.lang.Object r11 = r11.m20620b()
            fa.x r11 = (p081fa.InterfaceC2396x) r11
            r1.size()
            java.lang.Object r0 = r1.get(r0)
            p9.l1 r0 = (p229p9.InterfaceC6018l1) r0
            gb.h2 r2 = gb.EnumC2671h2.f7006r
            r6 = 7
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            da.a r2 = p050da.AbstractC1929b.m6997b(r2, r3, r4, r5, r6, r7)
            r0.getClass()
            gb.a2 r11 = r8.m7015q(r11, r2, r0)
            r10.add(r11)
            goto L8d
        Lc2:
            java.util.List r9 = p185m8.AbstractC5081g0.m20554X0(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p050da.C1932e.m7004c(fa.j, da.a, gb.u1):java.util.List");
    }

    /* JADX INFO: renamed from: d */
    public final List m7005d(InterfaceC2382j interfaceC2382j, List list, InterfaceC2716u1 interfaceC2716u1, C1928a c1928a) {
        InterfaceC2382j interfaceC2382j2;
        InterfaceC2716u1 interfaceC2716u12;
        C1928a c1928a2;
        InterfaceC2643a2 interfaceC2643a2Mo7017a;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC6018l1 interfaceC6018l1 = (InterfaceC6018l1) it.next();
            if (AbstractC4734d.m18922q(interfaceC6018l1, null, c1928a.mo6986c())) {
                interfaceC2643a2Mo7017a = AbstractC2675i2.m9472t(interfaceC6018l1, c1928a);
                interfaceC2382j2 = interfaceC2382j;
                interfaceC2716u12 = interfaceC2716u1;
                c1928a2 = c1928a;
            } else {
                interfaceC2382j2 = interfaceC2382j;
                interfaceC2716u12 = interfaceC2716u1;
                c1928a2 = c1928a;
                interfaceC2643a2Mo7017a = this.f5402c.mo7017a(interfaceC6018l1, c1928a2.m6992j(interfaceC2382j2.mo8625A()), this.f5403d, new C2724x0(this.f5400a.m3941e(), new C1931d(this, interfaceC6018l1, c1928a2, interfaceC2716u12, interfaceC2382j2)));
            }
            arrayList.add(interfaceC2643a2Mo7017a);
            c1928a = c1928a2;
            interfaceC2716u1 = interfaceC2716u12;
            interfaceC2382j = interfaceC2382j2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC2650c1 m7006f(InterfaceC2382j interfaceC2382j, C1928a c1928a, AbstractC2650c1 abstractC2650c1) {
        InterfaceC2382j interfaceC2382j2;
        C2704q1 c2704q1M9589b;
        if (abstractC2650c1 == null || (c2704q1M9589b = abstractC2650c1.mo9331S0()) == null) {
            interfaceC2382j2 = interfaceC2382j;
            c2704q1M9589b = AbstractC2707r1.m9589b(new C1079g(this.f5400a, interfaceC2382j2, false, 4, null));
        } else {
            interfaceC2382j2 = interfaceC2382j;
        }
        C2704q1 c2704q1 = c2704q1M9589b;
        InterfaceC2716u1 interfaceC2716u1M7007g = m7007g(interfaceC2382j2, c1928a);
        if (interfaceC2716u1M7007g == null) {
            return null;
        }
        boolean zM7010j = m7010j(c1928a);
        return (AbstractC1061t.m3842c(abstractC2650c1 != null ? abstractC2650c1.mo9332T0() : null, interfaceC2716u1M7007g) && !interfaceC2382j2.mo8625A() && zM7010j) ? abstractC2650c1.mo7032X0(true) : C2715u0.m9631m(c2704q1, interfaceC2716u1M7007g, m7004c(interfaceC2382j2, c1928a, interfaceC2716u1M7007g), zM7010j, null, 16, null);
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC2716u1 m7007g(InterfaceC2382j interfaceC2382j, C1928a c1928a) {
        InterfaceC2716u1 interfaceC2716u1Mo5591o;
        InterfaceC2381i interfaceC2381iMo8628e = interfaceC2382j.mo8628e();
        if (interfaceC2381iMo8628e == null) {
            return m7008h(interfaceC2382j);
        }
        if (!(interfaceC2381iMo8628e instanceof InterfaceC2379g)) {
            if (!(interfaceC2381iMo8628e instanceof InterfaceC2397y)) {
                C6494d0.m25749a("Unknown classifier kind: ", interfaceC2381iMo8628e);
                return null;
            }
            InterfaceC6018l1 interfaceC6018l1Mo3946a = this.f5401b.mo3946a((InterfaceC2397y) interfaceC2381iMo8628e);
            if (interfaceC6018l1Mo3946a != null) {
                return interfaceC6018l1Mo3946a.mo5591o();
            }
            return null;
        }
        InterfaceC2379g interfaceC2379g = (InterfaceC2379g) interfaceC2381iMo8628e;
        C5692c c5692cMo8616d = interfaceC2379g.mo8616d();
        if (c5692cMo8616d == null) {
            throw new AssertionError("Class type should have a FQ name: " + interfaceC2381iMo8628e);
        }
        InterfaceC5995e interfaceC5995eM7011k = m7011k(interfaceC2382j, c1928a, c5692cMo8616d);
        if (interfaceC5995eM7011k == null) {
            interfaceC5995eM7011k = this.f5400a.m3937a().m3909n().mo3947a(interfaceC2379g);
        }
        return (interfaceC5995eM7011k == null || (interfaceC2716u1Mo5591o = interfaceC5995eM7011k.mo5591o()) == null) ? m7008h(interfaceC2382j) : interfaceC2716u1Mo5591o;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC2716u1 m7008h(InterfaceC2382j interfaceC2382j) {
        InterfaceC2716u1 interfaceC2716u1Mo5591o = this.f5400a.m3937a().m3897b().m10677f().m5840r().m24025d(C5691b.f17894d.m22993c(new C5692c(interfaceC2382j.mo8626B())), AbstractC5112w.m20789e(0)).mo5591o();
        interfaceC2716u1Mo5591o.getClass();
        return interfaceC2716u1Mo5591o;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m7009i(EnumC2691m2 enumC2691m2, InterfaceC6018l1 interfaceC6018l1) {
        return (interfaceC6018l1.mo23995s() == EnumC2691m2.f7042u || enumC2691m2 == interfaceC6018l1.mo23995s()) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m7010j(C1928a c1928a) {
        return (c1928a.m6989g() == EnumC1930c.f5392s || c1928a.m6990h() || c1928a.mo6985b() == EnumC2671h2.f7005q) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC5995e m7011k(InterfaceC2382j interfaceC2382j, C1928a c1928a, C5692c c5692c) {
        if (c1928a.m6990h() && AbstractC1061t.m3842c(c5692c, AbstractC1933f.f5404a)) {
            return this.f5400a.m3937a().m3911p().m20957d();
        }
        C5668d c5668d = C5668d.f17816a;
        InterfaceC5995e interfaceC5995eM22900f = C5668d.m22900f(c5668d, c5692c, this.f5400a.m3940d().mo12669t(), null, 4, null);
        if (interfaceC5995eM22900f == null) {
            return null;
        }
        return (c5668d.m22904d(interfaceC5995eM22900f) && (c1928a.m6989g() == EnumC1930c.f5392s || c1928a.mo6985b() == EnumC2671h2.f7005q || m7003b(interfaceC2382j, interfaceC5995eM22900f))) ? c5668d.m22902b(interfaceC5995eM22900f) : interfaceC5995eM22900f;
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC2706r0 m7012l(InterfaceC2378f interfaceC2378f, C1928a c1928a, boolean z10) {
        interfaceC2378f.getClass();
        c1928a.getClass();
        InterfaceC2396x interfaceC2396xMo8607q = interfaceC2378f.mo8607q();
        InterfaceC2394v interfaceC2394v = interfaceC2396xMo8607q instanceof InterfaceC2394v ? (InterfaceC2394v) interfaceC2396xMo8607q : null;
        EnumC5132m type = interfaceC2394v != null ? interfaceC2394v.getType() : null;
        C1079g c1079g = new C1079g(this.f5400a, interfaceC2378f, true);
        if (type != null) {
            AbstractC2650c1 abstractC2650c1M20907P = this.f5400a.m3940d().mo12669t().m20907P(type);
            abstractC2650c1M20907P.getClass();
            AbstractC2706r0 abstractC2706r0M18902C = AbstractC4734d.m18902C(abstractC2650c1M20907P, new C6340o(abstractC2650c1M20907P.getAnnotations(), c1079g));
            abstractC2706r0M18902C.getClass();
            AbstractC2650c1 abstractC2650c1 = (AbstractC2650c1) abstractC2706r0M18902C;
            return c1928a.m6990h() ? abstractC2650c1 : C2715u0.m9624e(abstractC2650c1, abstractC2650c1.mo7032X0(true));
        }
        AbstractC2706r0 abstractC2706r0M7014p = m7014p(interfaceC2396xMo8607q, AbstractC1929b.m6997b(EnumC2671h2.f7006r, c1928a.m6990h(), false, null, 6, null));
        if (c1928a.m6990h()) {
            AbstractC2650c1 abstractC2650c1M20925n = this.f5400a.m3940d().mo12669t().m20925n(z10 ? EnumC2691m2.f7044w : EnumC2691m2.f7042u, abstractC2706r0M7014p, c1079g);
            abstractC2650c1M20925n.getClass();
            return abstractC2650c1M20925n;
        }
        AbstractC2650c1 abstractC2650c1M20925n2 = this.f5400a.m3940d().mo12669t().m20925n(EnumC2691m2.f7042u, abstractC2706r0M7014p, c1079g);
        abstractC2650c1M20925n2.getClass();
        return C2715u0.m9624e(abstractC2650c1M20925n2, this.f5400a.m3940d().mo12669t().m20925n(EnumC2691m2.f7044w, abstractC2706r0M7014p, c1079g).mo7032X0(true));
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC2706r0 m7013n(InterfaceC2382j interfaceC2382j, C1928a c1928a) {
        boolean z10 = (c1928a.m6990h() || c1928a.mo6985b() == EnumC2671h2.f7005q) ? false : true;
        boolean zMo8625A = interfaceC2382j.mo8625A();
        if (!zMo8625A && !z10) {
            AbstractC2650c1 abstractC2650c1M7006f = m7006f(interfaceC2382j, c1928a, null);
            return abstractC2650c1M7006f != null ? abstractC2650c1M7006f : m7002o(interfaceC2382j);
        }
        AbstractC2650c1 abstractC2650c1M7006f2 = m7006f(interfaceC2382j, c1928a.m6994l(EnumC1930c.f5392s), null);
        if (abstractC2650c1M7006f2 == null) {
            return m7002o(interfaceC2382j);
        }
        AbstractC2650c1 abstractC2650c1M7006f3 = m7006f(interfaceC2382j, c1928a.m6994l(EnumC1930c.f5391r), abstractC2650c1M7006f2);
        return abstractC2650c1M7006f3 == null ? m7002o(interfaceC2382j) : zMo8625A ? new C1938k(abstractC2650c1M7006f2, abstractC2650c1M7006f3) : C2715u0.m9624e(abstractC2650c1M7006f2, abstractC2650c1M7006f3);
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC2706r0 m7014p(InterfaceC2396x interfaceC2396x, C1928a c1928a) {
        AbstractC2706r0 abstractC2706r0M7014p;
        c1928a.getClass();
        if (interfaceC2396x instanceof InterfaceC2394v) {
            EnumC5132m type = ((InterfaceC2394v) interfaceC2396x).getType();
            C1083k c1083k = this.f5400a;
            AbstractC2650c1 abstractC2650c1M20909S = type != null ? c1083k.m3940d().mo12669t().m20909S(type) : c1083k.m3940d().mo12669t().m20916a0();
            abstractC2650c1M20909S.getClass();
            return abstractC2650c1M20909S;
        }
        if (interfaceC2396x instanceof InterfaceC2382j) {
            return m7013n((InterfaceC2382j) interfaceC2396x, c1928a);
        }
        if (interfaceC2396x instanceof InterfaceC2378f) {
            return m7001m(this, (InterfaceC2378f) interfaceC2396x, c1928a, false, 4, null);
        }
        if (!(interfaceC2396x instanceof InterfaceC2374c0)) {
            if (interfaceC2396x != null) {
                C2566t.m9092a("Unsupported type: ", interfaceC2396x);
                return null;
            }
            AbstractC2650c1 abstractC2650c1M20937z = this.f5400a.m3940d().mo12669t().m20937z();
            abstractC2650c1M20937z.getClass();
            return abstractC2650c1M20937z;
        }
        InterfaceC2396x interfaceC2396xMo8601F = ((InterfaceC2374c0) interfaceC2396x).mo8601F();
        if (interfaceC2396xMo8601F != null && (abstractC2706r0M7014p = m7014p(interfaceC2396xMo8601F, c1928a)) != null) {
            return abstractC2706r0M7014p;
        }
        AbstractC2650c1 abstractC2650c1M20937z2 = this.f5400a.m3940d().mo12669t().m20937z();
        abstractC2650c1M20937z2.getClass();
        return abstractC2650c1M20937z2;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC2643a2 m7015q(InterfaceC2396x interfaceC2396x, C1928a c1928a, InterfaceC6018l1 interfaceC6018l1) {
        if (!(interfaceC2396x instanceof InterfaceC2374c0)) {
            return new C2651c2(EnumC2691m2.f7042u, m7014p(interfaceC2396x, c1928a));
        }
        InterfaceC2374c0 interfaceC2374c0 = (InterfaceC2374c0) interfaceC2396x;
        InterfaceC2396x interfaceC2396xMo8601F = interfaceC2374c0.mo8601F();
        EnumC2691m2 enumC2691m2 = interfaceC2374c0.mo8602M() ? EnumC2691m2.f7044w : EnumC2691m2.f7043v;
        if (interfaceC2396xMo8601F == null || m7009i(enumC2691m2, interfaceC6018l1)) {
            InterfaceC2643a2 interfaceC2643a2M9472t = AbstractC2675i2.m9472t(interfaceC6018l1, c1928a);
            interfaceC2643a2M9472t.getClass();
            return interfaceC2643a2M9472t;
        }
        InterfaceC6328c interfaceC6328cM37750a = AbstractC9650u0.m37750a(this.f5400a, interfaceC2374c0);
        AbstractC2706r0 abstractC2706r0M7014p = m7014p(interfaceC2396xMo8601F, AbstractC1929b.m6997b(EnumC2671h2.f7006r, false, false, null, 7, null));
        if (interfaceC6328cM37750a != null) {
            abstractC2706r0M7014p = AbstractC4734d.m18902C(abstractC2706r0M7014p, InterfaceC6333h.f19873o.m25002a(AbstractC5081g0.m20532D0(abstractC2706r0M7014p.getAnnotations(), interfaceC6328cM37750a)));
        }
        return AbstractC4734d.m18916k(abstractC2706r0M7014p, enumC2691m2, interfaceC6018l1);
    }
}
