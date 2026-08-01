package gb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p010a9.InterfaceC0184l;
import p112hb.AbstractC2949h;
import p129ib.C3378i;
import p129ib.C3381l;
import p129ib.EnumC3380k;
import p185m8.AbstractC5081g0;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6018l1;
import p244qb.C6380k;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: gb.i2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2675i2 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2650c1 f7013a = C3381l.m12703d(EnumC3380k.f9281U, new String[0]);

    /* JADX INFO: renamed from: b */
    public static final AbstractC2650c1 f7014b = C3381l.m12703d(EnumC3380k.f9267N, new String[0]);

    /* JADX INFO: renamed from: c */
    public static final AbstractC2650c1 f7015c = new a("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d */
    public static final AbstractC2650c1 f7016d = new a("UNIT_EXPECTED_TYPE");

    /* JADX INFO: renamed from: gb.i2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC2641a0 {

        /* JADX INFO: renamed from: r */
        public final String f7017r;

        public a(String str) {
            this.f7017r = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
        /* JADX INFO: renamed from: f1 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ void m9476f1(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = r3
                goto L14
            L13:
                r5 = r4
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: gb.AbstractC2675i2.a.m9476f1(int):void");
        }

        @Override // gb.AbstractC2687l2
        /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
        public AbstractC2650c1 mo7032X0(boolean z10) {
            throw new IllegalStateException(this.f7017r);
        }

        @Override // gb.AbstractC2687l2
        /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
        public AbstractC2650c1 mo7034Z0(C2704q1 c2704q1) {
            if (c2704q1 == null) {
                m9476f1(0);
            }
            throw new IllegalStateException(this.f7017r);
        }

        @Override // gb.AbstractC2641a0
        /* JADX INFO: renamed from: c1 */
        public AbstractC2650c1 mo9261c1() {
            throw new IllegalStateException(this.f7017r);
        }

        @Override // gb.AbstractC2641a0
        /* JADX INFO: renamed from: e1 */
        public AbstractC2641a0 mo9262e1(AbstractC2650c1 abstractC2650c1) {
            if (abstractC2650c1 == null) {
                m9476f1(2);
            }
            throw new IllegalStateException(this.f7017r);
        }

        @Override // gb.AbstractC2641a0
        /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a mo9325d1(AbstractC2949h abstractC2949h) {
            if (abstractC2949h == null) {
                m9476f1(3);
            }
            return this;
        }

        @Override // gb.AbstractC2650c1
        public String toString() {
            String str = this.f7017r;
            if (str == null) {
                m9476f1(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m9453a(int r24) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.AbstractC2675i2.m9453a(int):void");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9454b(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m9453a(28);
        }
        if (abstractC2706r0.mo9258U0()) {
            return true;
        }
        return AbstractC2685l0.m9493b(abstractC2706r0) && m9454b(AbstractC2685l0.m9492a(abstractC2706r0).m9452c1());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9455c(AbstractC2706r0 abstractC2706r0, InterfaceC0184l interfaceC0184l) {
        if (interfaceC0184l == null) {
            m9453a(43);
        }
        return m9456d(abstractC2706r0, interfaceC0184l, null);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m9456d(AbstractC2706r0 abstractC2706r0, InterfaceC0184l interfaceC0184l, C6380k c6380k) {
        if (interfaceC0184l == null) {
            m9453a(44);
        }
        if (abstractC2706r0 == null) {
            return false;
        }
        AbstractC2687l2 abstractC2687l2Mo9510W0 = abstractC2706r0.mo9510W0();
        if (m9475w(abstractC2706r0)) {
            return ((Boolean) interfaceC0184l.mo27m(abstractC2687l2Mo9510W0)).booleanValue();
        }
        if (c6380k != null && c6380k.contains(abstractC2706r0)) {
            return false;
        }
        if (((Boolean) interfaceC0184l.mo27m(abstractC2687l2Mo9510W0)).booleanValue()) {
            return true;
        }
        if (c6380k == null) {
            c6380k = C6380k.m25378c();
        }
        c6380k.add(abstractC2706r0);
        AbstractC2673i0 abstractC2673i0 = abstractC2687l2Mo9510W0 instanceof AbstractC2673i0 ? (AbstractC2673i0) abstractC2687l2Mo9510W0 : null;
        if (abstractC2673i0 != null && (m9456d(abstractC2673i0.m9451b1(), interfaceC0184l, c6380k) || m9456d(abstractC2673i0.m9452c1(), interfaceC0184l, c6380k))) {
            return true;
        }
        if ((abstractC2687l2Mo9510W0 instanceof C2726y) && m9456d(((C2726y) abstractC2687l2Mo9510W0).m9657f1(), interfaceC0184l, c6380k)) {
            return true;
        }
        InterfaceC2716u1 interfaceC2716u1Mo9332T0 = abstractC2706r0.mo9332T0();
        if (interfaceC2716u1Mo9332T0 instanceof C2703q0) {
            Iterator it = ((C2703q0) interfaceC2716u1Mo9332T0).mo9546n().iterator();
            while (it.hasNext()) {
                if (m9456d((AbstractC2706r0) it.next(), interfaceC0184l, c6380k)) {
                    return true;
                }
            }
            return false;
        }
        for (InterfaceC2643a2 interfaceC2643a2 : abstractC2706r0.mo9330R0()) {
            if (!interfaceC2643a2.mo9336c() && m9456d(interfaceC2643a2.getType(), interfaceC0184l, c6380k)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC2706r0 m9457e(AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02, C2663f2 c2663f2) {
        if (abstractC2706r0 == null) {
            m9453a(20);
        }
        if (abstractC2706r02 == null) {
            m9453a(21);
        }
        if (c2663f2 == null) {
            m9453a(22);
        }
        AbstractC2706r0 abstractC2706r0M9393p = c2663f2.m9393p(abstractC2706r02, EnumC2691m2.f7042u);
        if (abstractC2706r0M9393p != null) {
            return m9469q(abstractC2706r0M9393p, abstractC2706r0.mo9258U0());
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC5995e m9458f(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m9453a(30);
        }
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
        if (interfaceC6004hMo5602u instanceof InterfaceC5995e) {
            return (InterfaceC5995e) interfaceC6004hMo5602u;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static List m9459g(List list) {
        if (list == null) {
            m9453a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2651c2(((InterfaceC6018l1) it.next()).mo7508x()));
        }
        List listM20554X0 = AbstractC5081g0.m20554X0(arrayList);
        if (listM20554X0 == null) {
            m9453a(17);
        }
        return listM20554X0;
    }

    /* JADX INFO: renamed from: h */
    public static List m9460h(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m9453a(18);
        }
        C2663f2 c2663f2M9383f = C2663f2.m9383f(abstractC2706r0);
        Collection collectionMo9546n = abstractC2706r0.mo9332T0().mo9546n();
        ArrayList arrayList = new ArrayList(collectionMo9546n.size());
        Iterator it = collectionMo9546n.iterator();
        while (it.hasNext()) {
            AbstractC2706r0 abstractC2706r0M9457e = m9457e(abstractC2706r0, (AbstractC2706r0) it.next(), c2663f2M9383f);
            if (abstractC2706r0M9457e != null) {
                arrayList.add(abstractC2706r0M9457e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC6018l1 m9461i(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m9453a(63);
        }
        if (abstractC2706r0.mo9332T0().mo5602u() instanceof InterfaceC6018l1) {
            return (InterfaceC6018l1) abstractC2706r0.mo9332T0().mo5602u();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m9462j(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m9453a(29);
        }
        if (abstractC2706r0.mo9332T0().mo5602u() instanceof InterfaceC5995e) {
            return false;
        }
        Iterator it = m9460h(abstractC2706r0).iterator();
        while (it.hasNext()) {
            if (m9464l((AbstractC2706r0) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m9463k(AbstractC2706r0 abstractC2706r0) {
        return abstractC2706r0 != null && abstractC2706r0.mo9332T0() == f7013a.mo9332T0();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m9464l(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m9453a(27);
        }
        if (abstractC2706r0.mo9258U0()) {
            return true;
        }
        if (AbstractC2685l0.m9493b(abstractC2706r0) && m9464l(AbstractC2685l0.m9492a(abstractC2706r0).m9452c1())) {
            return true;
        }
        if (AbstractC2666g1.m9430c(abstractC2706r0)) {
            return false;
        }
        if (m9465m(abstractC2706r0)) {
            return m9462j(abstractC2706r0);
        }
        InterfaceC2716u1 interfaceC2716u1Mo9332T0 = abstractC2706r0.mo9332T0();
        if (interfaceC2716u1Mo9332T0 instanceof C2703q0) {
            Iterator it = interfaceC2716u1Mo9332T0.mo9546n().iterator();
            while (it.hasNext()) {
                if (m9464l((AbstractC2706r0) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m9465m(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m9453a(60);
        }
        if (m9461i(abstractC2706r0) != null) {
            return true;
        }
        abstractC2706r0.mo9332T0();
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC2706r0 m9466n(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m9453a(2);
        }
        return m9468p(abstractC2706r0, false);
    }

    /* JADX INFO: renamed from: o */
    public static AbstractC2706r0 m9467o(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m9453a(1);
        }
        return m9468p(abstractC2706r0, true);
    }

    /* JADX INFO: renamed from: p */
    public static AbstractC2706r0 m9468p(AbstractC2706r0 abstractC2706r0, boolean z10) {
        if (abstractC2706r0 == null) {
            m9453a(3);
        }
        AbstractC2687l2 abstractC2687l2Mo7032X0 = abstractC2706r0.mo9510W0().mo7032X0(z10);
        if (abstractC2687l2Mo7032X0 == null) {
            m9453a(4);
        }
        return abstractC2687l2Mo7032X0;
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC2706r0 m9469q(AbstractC2706r0 abstractC2706r0, boolean z10) {
        if (abstractC2706r0 == null) {
            m9453a(8);
        }
        if (z10) {
            return m9467o(abstractC2706r0);
        }
        if (abstractC2706r0 == null) {
            m9453a(9);
        }
        return abstractC2706r0;
    }

    /* JADX INFO: renamed from: r */
    public static AbstractC2650c1 m9470r(AbstractC2650c1 abstractC2650c1, boolean z10) {
        if (abstractC2650c1 == null) {
            m9453a(5);
        }
        if (!z10) {
            if (abstractC2650c1 == null) {
                m9453a(7);
            }
            return abstractC2650c1;
        }
        AbstractC2650c1 abstractC2650c1Mo7032X0 = abstractC2650c1.mo7032X0(true);
        if (abstractC2650c1Mo7032X0 == null) {
            m9453a(6);
        }
        return abstractC2650c1Mo7032X0;
    }

    /* JADX INFO: renamed from: s */
    public static InterfaceC2643a2 m9471s(InterfaceC6018l1 interfaceC6018l1) {
        if (interfaceC6018l1 == null) {
            m9453a(45);
        }
        return new C2678j1(interfaceC6018l1);
    }

    /* JADX INFO: renamed from: t */
    public static InterfaceC2643a2 m9472t(InterfaceC6018l1 interfaceC6018l1, AbstractC2665g0 abstractC2665g0) {
        if (interfaceC6018l1 == null) {
            m9453a(46);
        }
        return abstractC2665g0.mo6985b() == EnumC2671h2.f7005q ? new C2651c2(AbstractC2682k1.m9486b(interfaceC6018l1)) : new C2678j1(interfaceC6018l1);
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC2650c1 m9473u(InterfaceC2716u1 interfaceC2716u1, InterfaceC9913k interfaceC9913k, InterfaceC0184l interfaceC0184l) {
        if (interfaceC2716u1 == null) {
            m9453a(12);
        }
        if (interfaceC9913k == null) {
            m9453a(13);
        }
        if (interfaceC0184l == null) {
            m9453a(14);
        }
        AbstractC2650c1 abstractC2650c1M9634p = C2715u0.m9634p(C2704q1.f7069r.m9585k(), interfaceC2716u1, m9459g(interfaceC2716u1.mo5600d()), false, interfaceC9913k, interfaceC0184l);
        if (abstractC2650c1M9634p == null) {
            m9453a(15);
        }
        return abstractC2650c1M9634p;
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC2650c1 m9474v(InterfaceC6004h interfaceC6004h, InterfaceC9913k interfaceC9913k, InterfaceC0184l interfaceC0184l) {
        if (!C3381l.m12704m(interfaceC6004h)) {
            return m9473u(interfaceC6004h.mo5591o(), interfaceC9913k, interfaceC0184l);
        }
        C3378i c3378iM12703d = C3381l.m12703d(EnumC3380k.f9279T, interfaceC6004h.toString());
        if (c3378iM12703d == null) {
            m9453a(11);
        }
        return c3378iM12703d;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m9475w(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m9453a(0);
        }
        return abstractC2706r0 == f7015c || abstractC2706r0 == f7016d;
    }
}
