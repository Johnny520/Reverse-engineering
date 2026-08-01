package p037cb;

import java.util.Iterator;
import java.util.Set;
import la.AbstractC4721a;
import la.C4728h;
import la.C4729i;
import la.InterfaceC4724d;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p067eb.C2084m;
import p143ja.C3770c;
import p143ja.C3788u;
import p143ja.C3791x;
import p185m8.AbstractC5065a1;
import p186m9.C5135p;
import p213oa.C5691b;
import p229p9.AbstractC6038s0;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6023n0;
import p258r9.InterfaceC6546b;

/* JADX INFO: renamed from: cb.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1482l {

    /* JADX INFO: renamed from: c */
    public static final b f4365c = new b(null);

    /* JADX INFO: renamed from: d */
    public static final Set f4366d = AbstractC5065a1.m20479d(C5691b.f17894d.m22993c(C5135p.a.f15578d.m23016m()));

    /* JADX INFO: renamed from: a */
    public final C1486n f4367a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f4368b;

    /* JADX INFO: renamed from: cb.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C5691b f4369a;

        /* JADX INFO: renamed from: b */
        public final C1476i f4370b;

        public a(C5691b c5691b, C1476i c1476i) {
            c5691b.getClass();
            this.f4369a = c5691b;
            this.f4370b = c1476i;
        }

        /* JADX INFO: renamed from: a */
        public final C1476i m5815a() {
            return this.f4370b;
        }

        /* JADX INFO: renamed from: b */
        public final C5691b m5816b() {
            return this.f4369a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC1061t.m3842c(this.f4369a, ((a) obj).f4369a);
        }

        public int hashCode() {
            return this.f4369a.hashCode();
        }
    }

    public C1482l(C1486n c1486n) {
        c1486n.getClass();
        this.f4367a = c1486n;
        this.f4368b = c1486n.m5843u().mo8665h(new C1480k(this));
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC5995e m5811c(C1482l c1482l, a aVar) {
        aVar.getClass();
        return c1482l.m5813d(aVar);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ InterfaceC5995e m5812f(C1482l c1482l, C5691b c5691b, C1476i c1476i, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c1476i = null;
        }
        return c1482l.m5814e(c5691b, c1476i);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC5995e m5813d(a aVar) {
        Object next;
        C1490p c1490pM5823a;
        C5691b c5691bM5816b = aVar.m5816b();
        Iterator it = this.f4367a.m5834l().iterator();
        while (it.hasNext()) {
            InterfaceC5995e interfaceC5995eMo22489b = ((InterfaceC6546b) it.next()).mo22489b(c5691bM5816b);
            if (interfaceC5995eMo22489b != null) {
                return interfaceC5995eMo22489b;
            }
        }
        if (f4366d.contains(c5691bM5816b)) {
            return null;
        }
        C1476i c1476iM5815a = aVar.m5815a();
        if (c1476iM5815a == null && (c1476iM5815a = this.f4367a.m5827e().mo5779a(c5691bM5816b)) == null) {
            return null;
        }
        InterfaceC4724d interfaceC4724dM5775a = c1476iM5815a.m5775a();
        C3770c c3770cM5776b = c1476iM5815a.m5776b();
        AbstractC4721a abstractC4721aM5777c = c1476iM5815a.m5777c();
        InterfaceC6003g1 interfaceC6003g1M5778d = c1476iM5815a.m5778d();
        C5691b c5691bM22985e = c5691bM5816b.m22985e();
        if (c5691bM22985e != null) {
            InterfaceC5995e interfaceC5995eM5812f = m5812f(this, c5691bM22985e, null, 2, null);
            C2084m c2084m = interfaceC5995eM5812f instanceof C2084m ? (C2084m) interfaceC5995eM5812f : null;
            if (c2084m == null || !c2084m.m7457q1(c5691bM5816b.m22988h())) {
                return null;
            }
            c1490pM5823a = c2084m.m7450j1();
        } else {
            Iterator it2 = AbstractC6038s0.m24066c(this.f4367a.m5841s(), c5691bM5816b.m22986f()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                InterfaceC6023n0 interfaceC6023n0 = (InterfaceC6023n0) next;
                if (!(interfaceC6023n0 instanceof AbstractC1494r) || ((AbstractC1494r) interfaceC6023n0).m5879Q0(c5691bM5816b.m22988h())) {
                    break;
                }
            }
            InterfaceC6023n0 interfaceC6023n02 = (InterfaceC6023n0) next;
            if (interfaceC6023n02 == null) {
                return null;
            }
            C1486n c1486n = this.f4367a;
            C3788u c3788uM14192l1 = c3770cM5776b.m14192l1();
            c3788uM14192l1.getClass();
            C4728h c4728h = new C4728h(c3788uM14192l1);
            C4729i.a aVar2 = C4729i.f14011b;
            C3791x c3791xM14194n1 = c3770cM5776b.m14194n1();
            c3791xM14194n1.getClass();
            c1490pM5823a = c1486n.m5823a(interfaceC6023n02, interfaceC4724dM5775a, c4728h, aVar2.m18896a(c3791xM14194n1), abstractC4721aM5777c, null);
            abstractC4721aM5777c = abstractC4721aM5777c;
        }
        return new C2084m(c1490pM5823a, c3770cM5776b, interfaceC4724dM5775a, abstractC4721aM5777c, interfaceC6003g1M5778d);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC5995e m5814e(C5691b c5691b, C1476i c1476i) {
        c5691b.getClass();
        return (InterfaceC5995e) this.f4368b.mo27m(new a(c5691b, c1476i));
    }

    /* JADX INFO: renamed from: cb.l$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Set m5817a() {
            return C1482l.f4366d;
        }

        public b() {
        }
    }
}
