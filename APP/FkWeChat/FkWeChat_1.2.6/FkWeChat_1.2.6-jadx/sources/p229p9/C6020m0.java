package p229p9;

import gb.C2714u;
import gb.EnumC2691m2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p080f9.C2363j;
import p082fb.InterfaceC2405g;
import p082fb.InterfaceC2412n;
import p098g9.C2566t;
import p112hb.AbstractC2949h;
import p185m8.AbstractC5065a1;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5101q0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p213oa.C5691b;
import p213oa.C5692c;
import p213oa.C5695f;
import p243q9.InterfaceC6333h;
import p273s9.AbstractC7219j;
import p273s9.C7231p;
import p273s9.C7240t0;
import p327wa.AbstractC9211e;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: p9.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6020m0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2412n f18966a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6005h0 f18967b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2405g f18968c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2405g f18969d;

    /* JADX INFO: renamed from: p9.m0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C5691b f18970a;

        /* JADX INFO: renamed from: b */
        public final List f18971b;

        public a(C5691b c5691b, List list) {
            c5691b.getClass();
            list.getClass();
            this.f18970a = c5691b;
            this.f18971b = list;
        }

        /* JADX INFO: renamed from: a */
        public final C5691b m24026a() {
            return this.f18970a;
        }

        /* JADX INFO: renamed from: b */
        public final List m24027b() {
            return this.f18971b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC1061t.m3842c(this.f18970a, aVar.f18970a) && AbstractC1061t.m3842c(this.f18971b, aVar.f18971b);
        }

        public int hashCode() {
            return (this.f18970a.hashCode() * 31) + this.f18971b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f18970a + ", typeParametersCount=" + this.f18971b + ')';
        }
    }

    /* JADX INFO: renamed from: p9.m0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC7219j {

        /* JADX INFO: renamed from: A */
        public final C2714u f18972A;

        /* JADX INFO: renamed from: y */
        public final boolean f18973y;

        /* JADX INFO: renamed from: z */
        public final List f18974z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2412n interfaceC2412n, InterfaceC6019m interfaceC6019m, C5695f c5695f, boolean z10, int i10) {
            super(interfaceC2412n, interfaceC6019m, c5695f, InterfaceC6003g1.f18958a, false);
            interfaceC2412n.getClass();
            interfaceC6019m.getClass();
            c5695f.getClass();
            this.f18973y = z10;
            C2363j c2363jM8592s = AbstractC2368o.m8592s(0, i10);
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(c2363jM8592s, 10));
            Iterator it = c2363jM8592s.iterator();
            while (it.hasNext()) {
                int iNextInt = ((AbstractC5101q0) it).nextInt();
                arrayList.add(C7240t0.m28658X0(this, InterfaceC6333h.f19873o.m25003b(), false, EnumC2691m2.f7042u, C5695f.m23027j("T" + iNextInt), iNextInt, interfaceC2412n));
            }
            this.f18974z = arrayList;
            this.f18972A = new C2714u(this, AbstractC6030p1.m24048g(this), AbstractC5065a1.m20479d(AbstractC9211e.m35864s(this).mo12669t().m20920i()), interfaceC2412n);
        }

        @Override // p273s9.AbstractC7219j, p229p9.InterfaceC5993d0
        /* JADX INFO: renamed from: C */
        public boolean mo7416C() {
            return false;
        }

        @Override // p229p9.InterfaceC5995e
        /* JADX INFO: renamed from: D */
        public boolean mo5568D() {
            return false;
        }

        @Override // p229p9.InterfaceC5995e
        /* JADX INFO: renamed from: D0 */
        public AbstractC6033q1 mo5569D0() {
            return null;
        }

        @Override // p229p9.InterfaceC5995e
        /* JADX INFO: renamed from: I */
        public boolean mo5572I() {
            return false;
        }

        @Override // p229p9.InterfaceC5993d0
        /* JADX INFO: renamed from: I0 */
        public boolean mo5573I0() {
            return false;
        }

        @Override // p229p9.InterfaceC5995e
        /* JADX INFO: renamed from: N0 */
        public boolean mo5574N0() {
            return false;
        }

        @Override // p229p9.InterfaceC5995e
        /* JADX INFO: renamed from: P */
        public Collection mo5575P() {
            return AbstractC5114x.m20800o();
        }

        @Override // p229p9.InterfaceC5995e
        /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
        public InterfaceC9913k.b mo5580W() {
            return InterfaceC9913k.b.f33436b;
        }

        @Override // p229p9.InterfaceC5993d0
        /* JADX INFO: renamed from: R */
        public boolean mo5576R() {
            return false;
        }

        @Override // p229p9.InterfaceC6004h
        /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
        public C2714u mo5591o() {
            return this.f18972A;
        }

        @Override // p229p9.InterfaceC6007i
        /* JADX INFO: renamed from: S */
        public boolean mo5577S() {
            return this.f18973y;
        }

        @Override // p273s9.AbstractC7250z
        /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
        public InterfaceC9913k.b mo5570E0(AbstractC2949h abstractC2949h) {
            abstractC2949h.getClass();
            return InterfaceC9913k.b.f33436b;
        }

        @Override // p229p9.InterfaceC5995e
        /* JADX INFO: renamed from: V */
        public InterfaceC5992d mo5578V() {
            return null;
        }

        @Override // p229p9.InterfaceC5995e
        /* JADX INFO: renamed from: Y */
        public InterfaceC5995e mo5582Y() {
            return null;
        }

        @Override // p229p9.InterfaceC5995e, p229p9.InterfaceC5993d0, p229p9.InterfaceC6031q
        /* JADX INFO: renamed from: g */
        public AbstractC6043u mo5587g() {
            AbstractC6043u abstractC6043u = AbstractC6040t.f18986e;
            abstractC6043u.getClass();
            return abstractC6043u;
        }

        @Override // p243q9.InterfaceC6326a
        public InterfaceC6333h getAnnotations() {
            return InterfaceC6333h.f19873o.m25003b();
        }

        @Override // p229p9.InterfaceC5995e
        /* JADX INFO: renamed from: j */
        public EnumC5998f mo5588j() {
            return EnumC5998f.f18948r;
        }

        @Override // p229p9.InterfaceC5995e
        /* JADX INFO: renamed from: k */
        public boolean mo5589k() {
            return false;
        }

        @Override // p229p9.InterfaceC5995e
        /* JADX INFO: renamed from: l */
        public Collection mo5590l() {
            return AbstractC5068b1.m20483e();
        }

        @Override // p229p9.InterfaceC5995e, p229p9.InterfaceC5993d0
        /* JADX INFO: renamed from: p */
        public EnumC5996e0 mo5592p() {
            return EnumC5996e0.f18936r;
        }

        @Override // p229p9.InterfaceC5995e
        /* JADX INFO: renamed from: r */
        public boolean mo5593r() {
            return false;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // p229p9.InterfaceC5995e, p229p9.InterfaceC6007i
        /* JADX INFO: renamed from: z */
        public List mo5594z() {
            return this.f18974z;
        }
    }

    public C6020m0(InterfaceC2412n interfaceC2412n, InterfaceC6005h0 interfaceC6005h0) {
        interfaceC2412n.getClass();
        interfaceC6005h0.getClass();
        this.f18966a = interfaceC2412n;
        this.f18967b = interfaceC6005h0;
        this.f18968c = interfaceC2412n.mo8659b(new C6014k0(this));
        this.f18969d = interfaceC2412n.mo8659b(new C6017l0(this));
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC5995e m24023c(C6020m0 c6020m0, a aVar) {
        InterfaceC6019m interfaceC6019mM24025d;
        aVar.getClass();
        C5691b c5691bM24026a = aVar.m24026a();
        List listM24027b = aVar.m24027b();
        if (c5691bM24026a.m22989i()) {
            C2566t.m9092a("Unresolved local class: ", c5691bM24026a);
            return null;
        }
        C5691b c5691bM22985e = c5691bM24026a.m22985e();
        if (c5691bM22985e == null || (interfaceC6019mM24025d = c6020m0.m24025d(c5691bM22985e, AbstractC5081g0.m20565d0(listM24027b, 1))) == null) {
            interfaceC6019mM24025d = (InterfaceC6001g) c6020m0.f18968c.mo27m(c5691bM24026a.m22986f());
        }
        InterfaceC6019m interfaceC6019m = interfaceC6019mM24025d;
        boolean zM22990j = c5691bM24026a.m22990j();
        InterfaceC2412n interfaceC2412n = c6020m0.f18966a;
        C5695f c5695fM22988h = c5691bM24026a.m22988h();
        Integer num = (Integer) AbstractC5081g0.m20578l0(listM24027b);
        return new b(interfaceC2412n, interfaceC6019m, c5695fM22988h, zM22990j, num != null ? num.intValue() : 0);
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC6023n0 m24024e(C6020m0 c6020m0, C5692c c5692c) {
        c5692c.getClass();
        return new C7231p(c6020m0.f18967b, c5692c);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC5995e m24025d(C5691b c5691b, List list) {
        c5691b.getClass();
        list.getClass();
        return (InterfaceC5995e) this.f18969d.mo27m(new a(c5691b, list));
    }
}
