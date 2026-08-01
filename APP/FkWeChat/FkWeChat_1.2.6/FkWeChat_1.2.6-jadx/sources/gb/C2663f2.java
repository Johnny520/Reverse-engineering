package gb;

import java.util.ArrayList;
import java.util.List;
import lb.AbstractC4734d;
import p010a9.InterfaceC0184l;
import p112hb.C2956o;
import p129ib.C3378i;
import p129ib.C3381l;
import p129ib.EnumC3380k;
import p186m9.AbstractC5128i;
import p186m9.C5135p;
import p187mb.AbstractC5143c;
import p213oa.C5692c;
import p229p9.InterfaceC6018l1;
import p243q9.C6340o;
import p243q9.C6341p;
import p243q9.InterfaceC6333h;
import p244qb.AbstractC6372c;
import p285ta.AbstractC8213e;

/* JADX INFO: renamed from: gb.f2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2663f2 {

    /* JADX INFO: renamed from: b */
    public static final C2663f2 f6989b = m9384g(AbstractC2655d2.f6976b);

    /* JADX INFO: renamed from: a */
    public final AbstractC2655d2 f6990a;

    /* JADX INFO: renamed from: gb.f2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements InterfaceC0184l {
        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m9399a(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean mo27m(C5692c c5692c) {
            if (c5692c == null) {
                m9399a(0);
            }
            return Boolean.valueOf(!c5692c.equals(C5135p.a.f15556Q));
        }
    }

    /* JADX INFO: renamed from: gb.f2$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6991a;

        static {
            int[] iArr = new int[d.values().length];
            f6991a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6991a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6991a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: gb.f2$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: gb.f2$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    public C2663f2(AbstractC2655d2 abstractC2655d2) {
        if (abstractC2655d2 == null) {
            m9378a(7);
        }
        this.f6990a = abstractC2655d2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m9378a(int r13) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.C2663f2.m9378a(int):void");
    }

    /* JADX INFO: renamed from: b */
    public static void m9379b(int i10, InterfaceC2643a2 interfaceC2643a2, AbstractC2655d2 abstractC2655d2) {
        if (i10 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + m9388o(interfaceC2643a2) + "; substitution: " + m9388o(abstractC2655d2));
    }

    /* JADX INFO: renamed from: c */
    public static EnumC2691m2 m9380c(EnumC2691m2 enumC2691m2, InterfaceC2643a2 interfaceC2643a2) {
        if (enumC2691m2 == null) {
            m9378a(35);
        }
        if (interfaceC2643a2 == null) {
            m9378a(36);
        }
        if (!interfaceC2643a2.mo9336c()) {
            return m9381d(enumC2691m2, interfaceC2643a2.mo9335b());
        }
        EnumC2691m2 enumC2691m22 = EnumC2691m2.f7044w;
        if (enumC2691m22 == null) {
            m9378a(37);
        }
        return enumC2691m22;
    }

    /* JADX INFO: renamed from: d */
    public static EnumC2691m2 m9381d(EnumC2691m2 enumC2691m2, EnumC2691m2 enumC2691m22) {
        if (enumC2691m2 == null) {
            m9378a(38);
        }
        if (enumC2691m22 == null) {
            m9378a(39);
        }
        EnumC2691m2 enumC2691m23 = EnumC2691m2.f7042u;
        if (enumC2691m2 == enumC2691m23) {
            if (enumC2691m22 == null) {
                m9378a(40);
            }
            return enumC2691m22;
        }
        if (enumC2691m22 == enumC2691m23) {
            if (enumC2691m2 == null) {
                m9378a(41);
            }
            return enumC2691m2;
        }
        if (enumC2691m2 == enumC2691m22) {
            if (enumC2691m22 == null) {
                m9378a(42);
            }
            return enumC2691m22;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + enumC2691m2 + "' and projection kind '" + enumC2691m22 + "' cannot be combined");
    }

    /* JADX INFO: renamed from: e */
    public static d m9382e(EnumC2691m2 enumC2691m2, EnumC2691m2 enumC2691m22) {
        EnumC2691m2 enumC2691m23 = EnumC2691m2.f7043v;
        return (enumC2691m2 == enumC2691m23 && enumC2691m22 == EnumC2691m2.f7044w) ? d.OUT_IN_IN_POSITION : (enumC2691m2 == EnumC2691m2.f7044w && enumC2691m22 == enumC2691m23) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    /* JADX INFO: renamed from: f */
    public static C2663f2 m9383f(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m9378a(6);
        }
        return m9384g(AbstractC2719v1.m9645i(abstractC2706r0.mo9332T0(), abstractC2706r0.mo9330R0()));
    }

    /* JADX INFO: renamed from: g */
    public static C2663f2 m9384g(AbstractC2655d2 abstractC2655d2) {
        if (abstractC2655d2 == null) {
            m9378a(0);
        }
        return new C2663f2(abstractC2655d2);
    }

    /* JADX INFO: renamed from: h */
    public static C2663f2 m9385h(AbstractC2655d2 abstractC2655d2, AbstractC2655d2 abstractC2655d22) {
        if (abstractC2655d2 == null) {
            m9378a(3);
        }
        if (abstractC2655d22 == null) {
            m9378a(4);
        }
        return m9384g(C2653d0.m9354i(abstractC2655d2, abstractC2655d22));
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC6333h m9386i(InterfaceC6333h interfaceC6333h) {
        if (interfaceC6333h == null) {
            m9378a(33);
        }
        return !interfaceC6333h.mo3927i(C5135p.a.f15556Q) ? interfaceC6333h : new C6341p(interfaceC6333h, new a());
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC2643a2 m9387l(AbstractC2706r0 abstractC2706r0, InterfaceC2643a2 interfaceC2643a2, InterfaceC6018l1 interfaceC6018l1, InterfaceC2643a2 interfaceC2643a22) {
        if (abstractC2706r0 == null) {
            m9378a(26);
        }
        if (interfaceC2643a2 == null) {
            m9378a(27);
        }
        if (interfaceC2643a22 == null) {
            m9378a(28);
        }
        if (!abstractC2706r0.getAnnotations().mo3927i(C5135p.a.f15556Q)) {
            if (interfaceC2643a2 == null) {
                m9378a(29);
            }
            return interfaceC2643a2;
        }
        InterfaceC2716u1 interfaceC2716u1Mo9332T0 = interfaceC2643a2.getType().mo9332T0();
        if (!(interfaceC2716u1Mo9332T0 instanceof C2956o)) {
            return interfaceC2643a2;
        }
        InterfaceC2643a2 interfaceC2643a2Mo10870b = ((C2956o) interfaceC2716u1Mo9332T0).mo10870b();
        EnumC2691m2 enumC2691m2Mo9335b = interfaceC2643a2Mo10870b.mo9335b();
        d dVarM9382e = m9382e(interfaceC2643a22.mo9335b(), enumC2691m2Mo9335b);
        d dVar = d.OUT_IN_IN_POSITION;
        return dVarM9382e == dVar ? new C2651c2(interfaceC2643a2Mo10870b.getType()) : (interfaceC6018l1 != null && m9382e(interfaceC6018l1.mo23995s(), enumC2691m2Mo9335b) == dVar) ? new C2651c2(interfaceC2643a2Mo10870b.getType()) : interfaceC2643a2;
    }

    /* JADX INFO: renamed from: o */
    public static String m9388o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (AbstractC6372c.m25355a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    /* JADX INFO: renamed from: j */
    public AbstractC2655d2 m9389j() {
        AbstractC2655d2 abstractC2655d2 = this.f6990a;
        if (abstractC2655d2 == null) {
            m9378a(8);
        }
        return abstractC2655d2;
    }

    /* JADX INFO: renamed from: k */
    public boolean m9390k() {
        return this.f6990a.mo7022f();
    }

    /* JADX INFO: renamed from: m */
    public C2663f2 m9391m() {
        AbstractC2655d2 abstractC2655d2 = this.f6990a;
        return ((abstractC2655d2 instanceof C2689m0) && abstractC2655d2.mo9356b()) ? new C2663f2(new C2689m0(((C2689m0) this.f6990a).m9512j(), ((C2689m0) this.f6990a).m9511i(), false)) : this;
    }

    /* JADX INFO: renamed from: n */
    public AbstractC2706r0 m9392n(AbstractC2706r0 abstractC2706r0, EnumC2691m2 enumC2691m2) {
        if (abstractC2706r0 == null) {
            m9378a(9);
        }
        if (enumC2691m2 == null) {
            m9378a(10);
        }
        if (m9390k()) {
            if (abstractC2706r0 == null) {
                m9378a(11);
            }
            return abstractC2706r0;
        }
        try {
            AbstractC2706r0 type = m9398u(new C2651c2(enumC2691m2, abstractC2706r0), null, 0).getType();
            if (type == null) {
                m9378a(12);
            }
            return type;
        } catch (c e10) {
            C3378i c3378iM12703d = C3381l.m12703d(EnumC3380k.f9279T, e10.getMessage());
            if (c3378iM12703d == null) {
                m9378a(13);
            }
            return c3378iM12703d;
        }
    }

    /* JADX INFO: renamed from: p */
    public AbstractC2706r0 m9393p(AbstractC2706r0 abstractC2706r0, EnumC2691m2 enumC2691m2) {
        if (abstractC2706r0 == null) {
            m9378a(14);
        }
        if (enumC2691m2 == null) {
            m9378a(15);
        }
        InterfaceC2643a2 interfaceC2643a2M9394q = m9394q(new C2651c2(enumC2691m2, m9389j().mo9358g(abstractC2706r0, enumC2691m2)));
        if (interfaceC2643a2M9394q == null) {
            return null;
        }
        return interfaceC2643a2M9394q.getType();
    }

    /* JADX INFO: renamed from: q */
    public InterfaceC2643a2 m9394q(InterfaceC2643a2 interfaceC2643a2) {
        if (interfaceC2643a2 == null) {
            m9378a(16);
        }
        InterfaceC2643a2 interfaceC2643a2M9397t = m9397t(interfaceC2643a2);
        return (this.f6990a.mo9355a() || this.f6990a.mo9356b()) ? AbstractC5143c.m21151d(interfaceC2643a2M9397t, this.f6990a.mo9356b()) : interfaceC2643a2M9397t;
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC2643a2 m9395r(InterfaceC2643a2 interfaceC2643a2, int i10) {
        AbstractC2706r0 type = interfaceC2643a2.getType();
        EnumC2691m2 enumC2691m2Mo9335b = interfaceC2643a2.mo9335b();
        if (type.mo9332T0().mo5602u() instanceof InterfaceC6018l1) {
            return interfaceC2643a2;
        }
        AbstractC2650c1 abstractC2650c1M9429b = AbstractC2666g1.m9429b(type);
        AbstractC2706r0 abstractC2706r0M9393p = abstractC2650c1M9429b != null ? m9391m().m9393p(abstractC2650c1M9429b, EnumC2691m2.f7042u) : null;
        AbstractC2706r0 abstractC2706r0M9367b = AbstractC2659e2.m9367b(type, m9396s(type.mo9332T0().mo5600d(), type.mo9330R0(), i10), this.f6990a.mo9357d(type.getAnnotations()));
        if ((abstractC2706r0M9367b instanceof AbstractC2650c1) && (abstractC2706r0M9393p instanceof AbstractC2650c1)) {
            abstractC2706r0M9367b = AbstractC2666g1.m9437j((AbstractC2650c1) abstractC2706r0M9367b, (AbstractC2650c1) abstractC2706r0M9393p);
        }
        return new C2651c2(enumC2691m2Mo9335b, abstractC2706r0M9367b);
    }

    /* JADX INFO: renamed from: s */
    public final List m9396s(List list, List list2, int i10) throws c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z10 = false;
        for (int i11 = 0; i11 < list.size(); i11++) {
            InterfaceC6018l1 interfaceC6018l1 = (InterfaceC6018l1) list.get(i11);
            InterfaceC2643a2 interfaceC2643a2 = (InterfaceC2643a2) list2.get(i11);
            InterfaceC2643a2 interfaceC2643a2M9398u = m9398u(interfaceC2643a2, interfaceC6018l1, i10 + 1);
            int i12 = b.f6991a[m9382e(interfaceC6018l1.mo23995s(), interfaceC2643a2M9398u.mo9335b()).ordinal()];
            if (i12 == 1 || i12 == 2) {
                interfaceC2643a2M9398u = AbstractC2675i2.m9471s(interfaceC6018l1);
            } else if (i12 == 3) {
                EnumC2691m2 enumC2691m2Mo23995s = interfaceC6018l1.mo23995s();
                EnumC2691m2 enumC2691m2 = EnumC2691m2.f7042u;
                if (enumC2691m2Mo23995s != enumC2691m2 && !interfaceC2643a2M9398u.mo9336c()) {
                    interfaceC2643a2M9398u = new C2651c2(enumC2691m2, interfaceC2643a2M9398u.getType());
                }
            }
            if (interfaceC2643a2M9398u != interfaceC2643a2) {
                z10 = true;
            }
            arrayList.add(interfaceC2643a2M9398u);
        }
        return !z10 ? list2 : arrayList;
    }

    /* JADX INFO: renamed from: t */
    public InterfaceC2643a2 m9397t(InterfaceC2643a2 interfaceC2643a2) {
        if (interfaceC2643a2 == null) {
            m9378a(17);
        }
        if (m9390k()) {
            return interfaceC2643a2;
        }
        try {
            return m9398u(interfaceC2643a2, null, 0);
        } catch (c unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: u */
    public final InterfaceC2643a2 m9398u(InterfaceC2643a2 interfaceC2643a2, InterfaceC6018l1 interfaceC6018l1, int i10) throws c {
        if (interfaceC2643a2 == null) {
            m9378a(18);
        }
        m9379b(i10, interfaceC2643a2, this.f6990a);
        if (!interfaceC2643a2.mo9336c()) {
            AbstractC2706r0 type = interfaceC2643a2.getType();
            if (type instanceof InterfaceC2679j2) {
                InterfaceC2679j2 interfaceC2679j2 = (InterfaceC2679j2) type;
                AbstractC2687l2 abstractC2687l2Mo9373J0 = interfaceC2679j2.mo9373J0();
                AbstractC2706r0 abstractC2706r0Mo9374N = interfaceC2679j2.mo9374N();
                InterfaceC2643a2 interfaceC2643a2M9398u = m9398u(new C2651c2(interfaceC2643a2.mo9335b(), abstractC2687l2Mo9373J0), interfaceC6018l1, i10 + 1);
                return interfaceC2643a2M9398u.mo9336c() ? interfaceC2643a2M9398u : new C2651c2(interfaceC2643a2M9398u.mo9335b(), AbstractC2683k2.m9491d(interfaceC2643a2M9398u.getType().mo9510W0(), m9393p(abstractC2706r0Mo9374N, interfaceC2643a2.mo9335b())));
            }
            if (!AbstractC2657e0.m9364a(type) && !(type.mo9510W0() instanceof InterfaceC2646b1)) {
                InterfaceC2643a2 interfaceC2643a2Mo7021e = this.f6990a.mo7021e(type);
                InterfaceC2643a2 interfaceC2643a2M9387l = interfaceC2643a2Mo7021e != null ? m9387l(type, interfaceC2643a2Mo7021e, interfaceC6018l1, interfaceC2643a2) : null;
                EnumC2691m2 enumC2691m2Mo9335b = interfaceC2643a2.mo9335b();
                if (interfaceC2643a2M9387l == null && AbstractC2685l0.m9493b(type) && !AbstractC2710s1.m9594b(type)) {
                    AbstractC2673i0 abstractC2673i0M9492a = AbstractC2685l0.m9492a(type);
                    int i11 = i10 + 1;
                    InterfaceC2643a2 interfaceC2643a2M9398u2 = m9398u(new C2651c2(enumC2691m2Mo9335b, abstractC2673i0M9492a.m9451b1()), interfaceC6018l1, i11);
                    InterfaceC2643a2 interfaceC2643a2M9398u3 = m9398u(new C2651c2(enumC2691m2Mo9335b, abstractC2673i0M9492a.m9452c1()), interfaceC6018l1, i11);
                    EnumC2691m2 enumC2691m2Mo9335b2 = interfaceC2643a2M9398u2.mo9335b();
                    if (interfaceC2643a2M9398u2.getType() != abstractC2673i0M9492a.m9451b1() || interfaceC2643a2M9398u3.getType() != abstractC2673i0M9492a.m9452c1()) {
                        return new C2651c2(enumC2691m2Mo9335b2, C2715u0.m9624e(AbstractC2659e2.m9366a(interfaceC2643a2M9398u2.getType()), AbstractC2659e2.m9366a(interfaceC2643a2M9398u3.getType())));
                    }
                } else if (!AbstractC5128i.m20881o0(type) && !AbstractC2718v0.m9643a(type)) {
                    if (interfaceC2643a2M9387l != null) {
                        d dVarM9382e = m9382e(enumC2691m2Mo9335b, interfaceC2643a2M9387l.mo9335b());
                        if (!AbstractC8213e.m31910f(type)) {
                            int i12 = b.f6991a[dVarM9382e.ordinal()];
                            if (i12 == 1) {
                                throw new c("Out-projection in in-position");
                            }
                            if (i12 == 2) {
                                return new C2651c2(EnumC2691m2.f7044w, type.mo9332T0().mo9341t().m20902J());
                            }
                        }
                        InterfaceC2720w interfaceC2720wM9593a = AbstractC2710s1.m9593a(type);
                        if (interfaceC2643a2M9387l.mo9336c()) {
                            return interfaceC2643a2M9387l;
                        }
                        AbstractC2706r0 abstractC2706r0Mo9257L0 = interfaceC2720wM9593a != null ? interfaceC2720wM9593a.mo9257L0(interfaceC2643a2M9387l.getType()) : AbstractC2675i2.m9469q(interfaceC2643a2M9387l.getType(), type.mo9258U0());
                        if (!type.getAnnotations().isEmpty()) {
                            abstractC2706r0Mo9257L0 = AbstractC4734d.m18902C(abstractC2706r0Mo9257L0, new C6340o(abstractC2706r0Mo9257L0.getAnnotations(), m9386i(this.f6990a.mo9357d(type.getAnnotations()))));
                        }
                        if (dVarM9382e == d.NO_CONFLICT) {
                            enumC2691m2Mo9335b = m9381d(enumC2691m2Mo9335b, interfaceC2643a2M9387l.mo9335b());
                        }
                        return new C2651c2(enumC2691m2Mo9335b, abstractC2706r0Mo9257L0);
                    }
                    interfaceC2643a2 = m9395r(interfaceC2643a2, i10);
                    if (interfaceC2643a2 == null) {
                        m9378a(25);
                    }
                }
            }
        }
        return interfaceC2643a2;
    }
}
