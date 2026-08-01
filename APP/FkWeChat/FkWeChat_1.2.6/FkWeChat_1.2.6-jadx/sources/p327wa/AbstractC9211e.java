package p327wa;

import gb.AbstractC2706r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p010a9.InterfaceC0184l;
import p024b9.C1050n0;
import p024b9.C1055q;
import p055e.AbstractC1960a;
import p112hb.AbstractC2949h;
import p112hb.AbstractC2950i;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p186m9.AbstractC5128i;
import p213oa.C5691b;
import p213oa.C5692c;
import p213oa.C5693d;
import p213oa.C5695f;
import p229p9.AbstractC6033q1;
import p229p9.C5984a0;
import p229p9.C6008i0;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6005h0;
import p229p9.InterfaceC6007i;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6023n0;
import p229p9.InterfaceC6039s1;
import p229p9.InterfaceC6053x0;
import p229p9.InterfaceC6055y0;
import p243q9.InterfaceC6328c;
import p244qb.AbstractC6371b;
import p342x9.InterfaceC9468b;
import sa.AbstractC7259i;
import sb.AbstractC7291q;
import sb.AbstractC7294t;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: wa.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9211e {

    /* JADX INFO: renamed from: a */
    public static final C5695f f31440a;

    /* JADX INFO: renamed from: wa.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a extends C1055q implements InterfaceC0184l {

        /* JADX INFO: renamed from: y */
        public static final a f31441y = new a();

        public a() {
            super(1, InterfaceC6039s1.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Boolean mo27m(InterfaceC6039s1 interfaceC6039s1) {
            interfaceC6039s1.getClass();
            return Boolean.valueOf(interfaceC6039s1.mo24071y0());
        }
    }

    /* JADX INFO: renamed from: wa.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6371b.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1050n0 f31442a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0184l f31443b;

        public b(C1050n0 c1050n0, InterfaceC0184l interfaceC0184l) {
            this.f31442a = c1050n0;
            this.f31443b = interfaceC0184l;
        }

        @Override // p244qb.AbstractC6371b.b, p244qb.AbstractC6371b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo25352b(InterfaceC5986b interfaceC5986b) {
            interfaceC5986b.getClass();
            if (this.f31442a.f3208q == null && ((Boolean) this.f31443b.mo27m(interfaceC5986b)).booleanValue()) {
                this.f31442a.f3208q = interfaceC5986b;
            }
        }

        @Override // p244qb.AbstractC6371b.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo5739c(InterfaceC5986b interfaceC5986b) {
            interfaceC5986b.getClass();
            return this.f31442a.f3208q == null;
        }

        @Override // p244qb.AbstractC6371b.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC5986b mo5738a() {
            return (InterfaceC5986b) this.f31442a.f3208q;
        }
    }

    static {
        C5695f c5695fM23027j = C5695f.m23027j("value");
        c5695fM23027j.getClass();
        f31440a = c5695fM23027j;
    }

    /* JADX INFO: renamed from: A */
    public static final InterfaceC7282h m35844A(boolean z10, InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        return m35871z(interfaceC5986b, z10);
    }

    /* JADX INFO: renamed from: B */
    public static final InterfaceC5995e m35845B(InterfaceC6005h0 interfaceC6005h0, C5692c c5692c, InterfaceC9468b interfaceC9468b) {
        interfaceC6005h0.getClass();
        c5692c.getClass();
        interfaceC9468b.getClass();
        c5692c.m22996c();
        InterfaceC6004h interfaceC6004hMo5518f = interfaceC6005h0.mo12666e0(c5692c.m22997d()).mo24098v().mo5518f(c5692c.m22999f(), interfaceC9468b);
        if (interfaceC6004hMo5518f instanceof InterfaceC5995e) {
            return (InterfaceC5995e) interfaceC6004hMo5518f;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6019m m35846a(InterfaceC6019m interfaceC6019m) {
        interfaceC6019m.getClass();
        return interfaceC6019m.mo7443b();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m35851f(InterfaceC6039s1 interfaceC6039s1) {
        interfaceC6039s1.getClass();
        Boolean boolM25350e = AbstractC6371b.m25350e(AbstractC5112w.m20789e(interfaceC6039s1), C9207a.f31436a, a.f31441y);
        boolM25350e.getClass();
        return boolM25350e.booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public static final Iterable m35852g(InterfaceC6039s1 interfaceC6039s1) {
        Collection collectionMo12674e = interfaceC6039s1.mo12674e();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(collectionMo12674e, 10));
        Iterator it = collectionMo12674e.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC6039s1) it.next()).mo12664a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC5986b m35853h(InterfaceC5986b interfaceC5986b, boolean z10, InterfaceC0184l interfaceC0184l) {
        interfaceC5986b.getClass();
        interfaceC0184l.getClass();
        return (InterfaceC5986b) AbstractC6371b.m25347b(AbstractC5112w.m20789e(interfaceC5986b), new C9209c(z10), new b(new C1050n0(), interfaceC0184l));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ InterfaceC5986b m35854i(InterfaceC5986b interfaceC5986b, boolean z10, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m35853h(interfaceC5986b, z10, interfaceC0184l);
    }

    /* JADX INFO: renamed from: j */
    public static final Iterable m35855j(boolean z10, InterfaceC5986b interfaceC5986b) {
        Collection collectionMo12674e;
        if (z10) {
            interfaceC5986b = interfaceC5986b != null ? interfaceC5986b.mo12664a() : null;
        }
        return (interfaceC5986b == null || (collectionMo12674e = interfaceC5986b.mo12674e()) == null) ? AbstractC5114x.m20800o() : collectionMo12674e;
    }

    /* JADX INFO: renamed from: k */
    public static final C5692c m35856k(InterfaceC6019m interfaceC6019m) {
        interfaceC6019m.getClass();
        C5693d c5693dM35861p = m35861p(interfaceC6019m);
        if (!c5693dM35861p.m23010f()) {
            c5693dM35861p = null;
        }
        if (c5693dM35861p != null) {
            return c5693dM35861p.m23016m();
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC5995e m35857l(InterfaceC6328c interfaceC6328c) {
        interfaceC6328c.getClass();
        InterfaceC6004h interfaceC6004hMo5602u = interfaceC6328c.getType().mo9332T0().mo5602u();
        if (interfaceC6004hMo5602u instanceof InterfaceC5995e) {
            return (InterfaceC5995e) interfaceC6004hMo5602u;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static final AbstractC5128i m35858m(InterfaceC6019m interfaceC6019m) {
        interfaceC6019m.getClass();
        return m35864s(interfaceC6019m).mo12669t();
    }

    /* JADX INFO: renamed from: n */
    public static final C5691b m35859n(InterfaceC6004h interfaceC6004h) {
        InterfaceC6019m interfaceC6019mMo7443b;
        C5691b c5691bM35859n;
        if (interfaceC6004h != null && (interfaceC6019mMo7443b = interfaceC6004h.mo7443b()) != null) {
            if (interfaceC6019mMo7443b instanceof InterfaceC6023n0) {
                C5692c c5692cMo24031d = ((InterfaceC6023n0) interfaceC6019mMo7443b).mo24031d();
                C5695f name = interfaceC6004h.getName();
                name.getClass();
                return new C5691b(c5692cMo24031d, name);
            }
            if ((interfaceC6019mMo7443b instanceof InterfaceC6007i) && (c5691bM35859n = m35859n((InterfaceC6004h) interfaceC6019mMo7443b)) != null) {
                C5695f name2 = interfaceC6004h.getName();
                name2.getClass();
                return c5691bM35859n.m22984d(name2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static final C5692c m35860o(InterfaceC6019m interfaceC6019m) {
        interfaceC6019m.getClass();
        C5692c c5692cM28761n = AbstractC7259i.m28761n(interfaceC6019m);
        c5692cM28761n.getClass();
        return c5692cM28761n;
    }

    /* JADX INFO: renamed from: p */
    public static final C5693d m35861p(InterfaceC6019m interfaceC6019m) {
        interfaceC6019m.getClass();
        C5693d c5693dM28760m = AbstractC7259i.m28760m(interfaceC6019m);
        c5693dM28760m.getClass();
        return c5693dM28760m;
    }

    /* JADX INFO: renamed from: q */
    public static final C5984a0 m35862q(InterfaceC5995e interfaceC5995e) {
        AbstractC6033q1 abstractC6033q1Mo5569D0 = interfaceC5995e != null ? interfaceC5995e.mo5569D0() : null;
        if (abstractC6033q1Mo5569D0 instanceof C5984a0) {
            return (C5984a0) abstractC6033q1Mo5569D0;
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static final AbstractC2949h m35863r(InterfaceC6005h0 interfaceC6005h0) {
        interfaceC6005h0.getClass();
        AbstractC1960a.m7104a(interfaceC6005h0.mo12667p0(AbstractC2950i.m10854a()));
        return AbstractC2949h.a.f7784a;
    }

    /* JADX INFO: renamed from: s */
    public static final InterfaceC6005h0 m35864s(InterfaceC6019m interfaceC6019m) {
        interfaceC6019m.getClass();
        InterfaceC6005h0 interfaceC6005h0M28754g = AbstractC7259i.m28754g(interfaceC6019m);
        interfaceC6005h0M28754g.getClass();
        return interfaceC6005h0M28754g;
    }

    /* JADX INFO: renamed from: t */
    public static final C6008i0 m35865t(InterfaceC5995e interfaceC5995e) {
        AbstractC6033q1 abstractC6033q1Mo5569D0 = interfaceC5995e != null ? interfaceC5995e.mo5569D0() : null;
        if (abstractC6033q1Mo5569D0 instanceof C6008i0) {
            return (C6008i0) abstractC6033q1Mo5569D0;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static final InterfaceC7282h m35866u(InterfaceC6019m interfaceC6019m) {
        interfaceC6019m.getClass();
        return AbstractC7294t.m28914x(m35867v(interfaceC6019m), 1);
    }

    /* JADX INFO: renamed from: v */
    public static final InterfaceC7282h m35867v(InterfaceC6019m interfaceC6019m) {
        interfaceC6019m.getClass();
        return AbstractC7291q.m28888p(interfaceC6019m, C9208b.f31437q);
    }

    /* JADX INFO: renamed from: w */
    public static final InterfaceC5986b m35868w(InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        if (!(interfaceC5986b instanceof InterfaceC6053x0)) {
            return interfaceC5986b;
        }
        InterfaceC6055y0 interfaceC6055y0Mo24109F0 = ((InterfaceC6053x0) interfaceC5986b).mo24109F0();
        interfaceC6055y0Mo24109F0.getClass();
        return interfaceC6055y0Mo24109F0;
    }

    /* JADX INFO: renamed from: x */
    public static final InterfaceC5995e m35869x(InterfaceC5995e interfaceC5995e) {
        interfaceC5995e.getClass();
        for (AbstractC2706r0 abstractC2706r0 : interfaceC5995e.mo7508x().mo9332T0().mo9546n()) {
            if (!AbstractC5128i.m20867c0(abstractC2706r0)) {
                InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
                if (AbstractC7259i.m28770w(interfaceC6004hMo5602u)) {
                    interfaceC6004hMo5602u.getClass();
                    return (InterfaceC5995e) interfaceC6004hMo5602u;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m35870y(InterfaceC6005h0 interfaceC6005h0) {
        interfaceC6005h0.getClass();
        AbstractC1960a.m7104a(interfaceC6005h0.mo12667p0(AbstractC2950i.m10854a()));
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static final InterfaceC7282h m35871z(InterfaceC5986b interfaceC5986b, boolean z10) {
        interfaceC5986b.getClass();
        if (z10) {
            interfaceC5986b = interfaceC5986b.mo12664a();
        }
        InterfaceC7282h interfaceC7282hM28892t = AbstractC7291q.m28892t(interfaceC5986b);
        Collection collectionMo12674e = interfaceC5986b.mo12674e();
        collectionMo12674e.getClass();
        return AbstractC7294t.m28905M(interfaceC7282hM28892t, AbstractC7294t.m28896D(AbstractC5081g0.m20555Y(collectionMo12674e), new C9210d(z10)));
    }
}
