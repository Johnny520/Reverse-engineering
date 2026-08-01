package p273s9;

import gb.AbstractC2650c1;
import gb.AbstractC2666g1;
import gb.AbstractC2685l0;
import gb.AbstractC2706r0;
import gb.C2663f2;
import gb.EnumC2691m2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p012ab.InterfaceC0209f;
import p012ab.InterfaceC0210g;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1052o0;
import p024b9.C1038h0;
import p082fb.InterfaceC2408j;
import p082fb.InterfaceC2412n;
import p098g9.InterfaceC2557k;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p213oa.C5695f;
import p213oa.C5697h;
import p229p9.AbstractC6043u;
import p229p9.EnumC5996e0;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC5992d;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6015k1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6056z;
import p243q9.InterfaceC6333h;
import sa.AbstractC7258h;

/* JADX INFO: renamed from: s9.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7238s0 extends AbstractC7237s implements InterfaceC7234q0 {

    /* JADX INFO: renamed from: U */
    public final InterfaceC2412n f24080U;

    /* JADX INFO: renamed from: V */
    public final InterfaceC6015k1 f24081V;

    /* JADX INFO: renamed from: W */
    public final InterfaceC2408j f24082W;

    /* JADX INFO: renamed from: X */
    public InterfaceC5992d f24083X;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ InterfaceC2557k[] f24079Z = {AbstractC1052o0.m3814i(new C1038h0(C7238s0.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0))};

    /* JADX INFO: renamed from: Y */
    public static final a f24078Y = new a(null);

    public C7238s0(InterfaceC2412n interfaceC2412n, InterfaceC6015k1 interfaceC6015k1, InterfaceC5992d interfaceC5992d, InterfaceC7234q0 interfaceC7234q0, InterfaceC6333h interfaceC6333h, InterfaceC5986b.a aVar, InterfaceC6003g1 interfaceC6003g1) {
        super(interfaceC6015k1, interfaceC7234q0, interfaceC6333h, C5697h.f17924j, aVar, interfaceC6003g1);
        this.f24080U = interfaceC2412n;
        this.f24081V = interfaceC6015k1;
        m28601b1(m28649v1().mo5573I0());
        this.f24082W = interfaceC2412n.mo8662e(new C7236r0(this, interfaceC5992d));
        this.f24083X = interfaceC5992d;
    }

    /* JADX INFO: renamed from: x1 */
    public static final C7238s0 m28644x1(C7238s0 c7238s0, InterfaceC5992d interfaceC5992d) {
        InterfaceC2412n interfaceC2412n = c7238s0.f24080U;
        InterfaceC6015k1 interfaceC6015k1M28649v1 = c7238s0.m28649v1();
        InterfaceC6333h annotations = interfaceC5992d.getAnnotations();
        InterfaceC5986b.a aVarMo12678j = interfaceC5992d.mo12678j();
        aVarMo12678j.getClass();
        InterfaceC6003g1 source = c7238s0.m28649v1().getSource();
        source.getClass();
        C7238s0 c7238s02 = new C7238s0(interfaceC2412n, interfaceC6015k1M28649v1, interfaceC5992d, c7238s0, annotations, aVarMo12678j, source);
        C2663f2 c2663f2M28653c = f24078Y.m28653c(c7238s0.m28649v1());
        if (c2663f2M28653c == null) {
            return null;
        }
        InterfaceC5988b1 interfaceC5988b1Mo12679k0 = interfaceC5992d.mo12679k0();
        InterfaceC5988b1 interfaceC5988b1Mo7503c = interfaceC5988b1Mo12679k0 != null ? interfaceC5988b1Mo12679k0.mo7503c(c2663f2M28653c) : null;
        List listMo12685v0 = interfaceC5992d.mo12685v0();
        listMo12685v0.getClass();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listMo12685v0, 10));
        Iterator it = listMo12685v0.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5988b1) it.next()).mo7503c(c2663f2M28653c));
        }
        c7238s02.mo28569X0(null, interfaceC5988b1Mo7503c, arrayList, c7238s0.m28649v1().mo5594z(), c7238s0.mo12680m(), c7238s0.mo12675f(), EnumC5996e0.f18936r, c7238s0.m28649v1().mo5587g());
        return c7238s02;
    }

    @Override // p229p9.InterfaceC6016l
    /* JADX INFO: renamed from: G */
    public boolean mo24019G() {
        return mo28590t0().mo24019G();
    }

    @Override // p229p9.InterfaceC6016l
    /* JADX INFO: renamed from: H */
    public InterfaceC5995e mo24020H() {
        InterfaceC5995e interfaceC5995eMo24020H = mo28590t0().mo24020H();
        interfaceC5995eMo24020H.getClass();
        return interfaceC5995eMo24020H;
    }

    @Override // p273s9.AbstractC7237s, p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: f */
    public AbstractC2706r0 mo12675f() {
        AbstractC2706r0 abstractC2706r0Mo12675f = super.mo12675f();
        abstractC2706r0Mo12675f.getClass();
        return abstractC2706r0Mo12675f;
    }

    @Override // p229p9.InterfaceC5986b
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public InterfaceC7234q0 mo12636M(InterfaceC6019m interfaceC6019m, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, InterfaceC5986b.a aVar, boolean z10) {
        interfaceC6019m.getClass();
        enumC5996e0.getClass();
        abstractC6043u.getClass();
        aVar.getClass();
        InterfaceC6056z interfaceC6056zBuild = mo12638y().mo12648j(interfaceC6019m).mo12644f(enumC5996e0).mo12657s(abstractC6043u).mo12641c(aVar).mo12646h(z10).build();
        interfaceC6056zBuild.getClass();
        return (InterfaceC7234q0) interfaceC6056zBuild;
    }

    @Override // p273s9.AbstractC7237s
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public C7238s0 mo419R0(InterfaceC6019m interfaceC6019m, InterfaceC6056z interfaceC6056z, InterfaceC5986b.a aVar, C5695f c5695f, InterfaceC6333h interfaceC6333h, InterfaceC6003g1 interfaceC6003g1) {
        interfaceC6019m.getClass();
        aVar.getClass();
        interfaceC6333h.getClass();
        interfaceC6003g1.getClass();
        InterfaceC5986b.a aVar2 = InterfaceC5986b.a.DECLARATION;
        if (aVar != aVar2) {
            InterfaceC5986b.a aVar3 = InterfaceC5986b.a.SYNTHESIZED;
        }
        return new C7238s0(this.f24080U, m28649v1(), mo28590t0(), this, interfaceC6333h, aVar2, interfaceC6003g1);
    }

    @Override // p273s9.InterfaceC7234q0
    /* JADX INFO: renamed from: t0 */
    public InterfaceC5992d mo28590t0() {
        return this.f24083X;
    }

    @Override // p273s9.AbstractC7227n, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public InterfaceC6015k1 mo7443b() {
        return m28649v1();
    }

    @Override // p273s9.AbstractC7237s, p273s9.AbstractC7227n, p273s9.AbstractC7225m, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public InterfaceC7234q0 mo12664a() {
        InterfaceC6056z interfaceC6056zMo12664a = super.mo12664a();
        interfaceC6056zMo12664a.getClass();
        return (InterfaceC7234q0) interfaceC6056zMo12664a;
    }

    /* JADX INFO: renamed from: v1 */
    public InterfaceC6015k1 m28649v1() {
        return this.f24081V;
    }

    @Override // p273s9.AbstractC7237s, p229p9.InterfaceC6056z, p229p9.InterfaceC6009i1
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public InterfaceC7234q0 mo7503c(C2663f2 c2663f2) {
        c2663f2.getClass();
        InterfaceC6056z interfaceC6056zMo7503c = super.mo7503c(c2663f2);
        interfaceC6056zMo7503c.getClass();
        C7238s0 c7238s0 = (C7238s0) interfaceC6056zMo7503c;
        C2663f2 c2663f2M9383f = C2663f2.m9383f(c7238s0.mo12675f());
        c2663f2M9383f.getClass();
        InterfaceC5992d interfaceC5992dMo7503c = mo28590t0().mo12664a().mo7503c(c2663f2M9383f);
        if (interfaceC5992dMo7503c == null) {
            return null;
        }
        c7238s0.f24083X = interfaceC5992dMo7503c;
        return c7238s0;
    }

    /* JADX INFO: renamed from: s9.s0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC7234q0 m28652b(InterfaceC2412n interfaceC2412n, InterfaceC6015k1 interfaceC6015k1, InterfaceC5992d interfaceC5992d) {
            InterfaceC5992d interfaceC5992dMo7503c;
            List listM20800o;
            interfaceC2412n.getClass();
            interfaceC6015k1.getClass();
            interfaceC5992d.getClass();
            C2663f2 c2663f2M28653c = m28653c(interfaceC6015k1);
            if (c2663f2M28653c == null || (interfaceC5992dMo7503c = interfaceC5992d.mo7503c(c2663f2M28653c)) == null) {
                return null;
            }
            InterfaceC6333h annotations = interfaceC5992d.getAnnotations();
            InterfaceC5986b.a aVarMo12678j = interfaceC5992d.mo12678j();
            aVarMo12678j.getClass();
            InterfaceC6003g1 source = interfaceC6015k1.getSource();
            source.getClass();
            C7238s0 c7238s0 = new C7238s0(interfaceC2412n, interfaceC6015k1, interfaceC5992dMo7503c, null, annotations, aVarMo12678j, source, null);
            List listM28593U0 = AbstractC7237s.m28593U0(c7238s0, interfaceC5992d.mo12680m(), c2663f2M28653c);
            if (listM28593U0 == null) {
                return null;
            }
            AbstractC2650c1 abstractC2650c1M9494c = AbstractC2685l0.m9494c(interfaceC5992dMo7503c.mo12675f().mo9510W0());
            AbstractC2650c1 abstractC2650c1Mo7508x = interfaceC6015k1.mo7508x();
            abstractC2650c1Mo7508x.getClass();
            AbstractC2650c1 abstractC2650c1M9437j = AbstractC2666g1.m9437j(abstractC2650c1M9494c, abstractC2650c1Mo7508x);
            InterfaceC5988b1 interfaceC5988b1Mo12679k0 = interfaceC5992d.mo12679k0();
            InterfaceC5988b1 interfaceC5988b1M28725i = interfaceC5988b1Mo12679k0 != null ? AbstractC7258h.m28725i(c7238s0, c2663f2M28653c.m9392n(interfaceC5988b1Mo12679k0.getType(), EnumC2691m2.f7042u), InterfaceC6333h.f19873o.m25003b()) : null;
            InterfaceC5995e interfaceC5995eMo7507w = interfaceC6015k1.mo7507w();
            if (interfaceC5995eMo7507w != null) {
                List listMo12685v0 = interfaceC5992d.mo12685v0();
                listMo12685v0.getClass();
                listM20800o = new ArrayList(AbstractC5116y.m20814z(listMo12685v0, 10));
                int i10 = 0;
                for (Object obj : listMo12685v0) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC5114x.m20810y();
                    }
                    InterfaceC5988b1 interfaceC5988b1 = (InterfaceC5988b1) obj;
                    AbstractC2706r0 abstractC2706r0M9392n = c2663f2M28653c.m9392n(interfaceC5988b1.getType(), EnumC2691m2.f7042u);
                    InterfaceC0210g value = interfaceC5988b1.getValue();
                    value.getClass();
                    listM20800o.add(AbstractC7258h.m28719c(interfaceC5995eMo7507w, abstractC2706r0M9392n, ((InterfaceC0209f) value).mo443a(), InterfaceC6333h.f19873o.m25003b(), i10));
                    i10 = i11;
                }
            } else {
                listM20800o = AbstractC5114x.m20800o();
            }
            c7238s0.mo28569X0(interfaceC5988b1M28725i, null, listM20800o, interfaceC6015k1.mo5594z(), listM28593U0, abstractC2650c1M9437j, EnumC5996e0.f18936r, interfaceC6015k1.mo5587g());
            return c7238s0;
        }

        /* JADX INFO: renamed from: c */
        public final C2663f2 m28653c(InterfaceC6015k1 interfaceC6015k1) {
            if (interfaceC6015k1.mo7507w() == null) {
                return null;
            }
            return C2663f2.m9383f(interfaceC6015k1.mo7500a0());
        }

        public a() {
        }
    }

    public /* synthetic */ C7238s0(InterfaceC2412n interfaceC2412n, InterfaceC6015k1 interfaceC6015k1, InterfaceC5992d interfaceC5992d, InterfaceC7234q0 interfaceC7234q0, InterfaceC6333h interfaceC6333h, InterfaceC5986b.a aVar, InterfaceC6003g1 interfaceC6003g1, AbstractC1043k abstractC1043k) {
        this(interfaceC2412n, interfaceC6015k1, interfaceC5992d, interfaceC7234q0, interfaceC6333h, aVar, interfaceC6003g1);
    }
}
