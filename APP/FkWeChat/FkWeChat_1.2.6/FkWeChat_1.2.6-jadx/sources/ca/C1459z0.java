package ca;

import ba.C1083k;
import gb.AbstractC2706r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p011aa.AbstractC0203h;
import p011aa.InterfaceC0198c;
import p024b9.AbstractC1061t;
import p081fa.InterfaceC2379g;
import p081fa.InterfaceC2389q;
import p172l8.C4700i0;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p186m9.C5135p;
import p213oa.C5695f;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6000f1;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6055y0;
import p244qb.AbstractC6370a;
import p244qb.AbstractC6371b;
import p342x9.EnumC9470d;
import p342x9.InterfaceC9468b;
import p373z9.AbstractC9888a;
import sa.AbstractC7258h;
import sb.AbstractC7294t;
import za.C9906d;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: ca.z0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1459z0 extends AbstractC1408a1 {

    /* JADX INFO: renamed from: n */
    public final InterfaceC2379g f4308n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC0198c f4309o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1459z0(C1083k c1083k, InterfaceC2379g interfaceC2379g, InterfaceC0198c interfaceC0198c) {
        super(c1083k);
        c1083k.getClass();
        interfaceC2379g.getClass();
        interfaceC0198c.getClass();
        this.f4308n = interfaceC2379g;
        this.f4309o = interfaceC0198c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final boolean m5728m0(InterfaceC2389q interfaceC2389q) {
        interfaceC2389q.getClass();
        return interfaceC2389q.mo8643T();
    }

    /* JADX INFO: renamed from: n0 */
    public static final Collection m5729n0(C5695f c5695f, InterfaceC9913k interfaceC9913k) {
        interfaceC9913k.getClass();
        return interfaceC9913k.mo5515c(c5695f, EnumC9470d.f32162E);
    }

    /* JADX INFO: renamed from: o0 */
    public static final Collection m5730o0(InterfaceC9913k interfaceC9913k) {
        interfaceC9913k.getClass();
        return interfaceC9913k.mo5516d();
    }

    /* JADX INFO: renamed from: q0 */
    public static final Iterable m5731q0(InterfaceC5995e interfaceC5995e) {
        Collection collectionMo9546n = interfaceC5995e.mo5591o().mo9546n();
        collectionMo9546n.getClass();
        return AbstractC7294t.m28912v(AbstractC7294t.m28902J(AbstractC5081g0.m20555Y(collectionMo9546n), C1457y0.f4299q));
    }

    /* JADX INFO: renamed from: r0 */
    public static final InterfaceC5995e m5732r0(AbstractC2706r0 abstractC2706r0) {
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
        if (interfaceC6004hMo5602u instanceof InterfaceC5995e) {
            return (InterfaceC5995e) interfaceC6004hMo5602u;
        }
        return null;
    }

    @Override // ca.AbstractC1447t0
    /* JADX INFO: renamed from: B */
    public void mo5527B(Collection collection, C5695f c5695f) {
        collection.getClass();
        c5695f.getClass();
        Collection collectionM38375e = AbstractC9888a.m38375e(c5695f, m5737u0(c5695f, mo5529R()), collection, mo5529R(), m5632L().m3937a().m3898c(), m5632L().m3937a().m3906k().mo10878a());
        collectionM38375e.getClass();
        collection.addAll(collectionM38375e);
        if (this.f4308n.mo8608E()) {
            if (AbstractC1061t.m3842c(c5695f, C5135p.f15503f)) {
                InterfaceC6000f1 interfaceC6000f1M28723g = AbstractC7258h.m28723g(mo5529R());
                interfaceC6000f1M28723g.getClass();
                collection.add(interfaceC6000f1M28723g);
            } else if (AbstractC1061t.m3842c(c5695f, C5135p.f15501d)) {
                InterfaceC6000f1 interfaceC6000f1M28724h = AbstractC7258h.m28724h(mo5529R());
                interfaceC6000f1M28724h.getClass();
                collection.add(interfaceC6000f1M28724h);
            }
        }
    }

    @Override // ca.AbstractC1408a1, ca.AbstractC1447t0
    /* JADX INFO: renamed from: C */
    public void mo5483C(C5695f c5695f, Collection collection) {
        C5695f c5695f2;
        Collection collection2;
        c5695f.getClass();
        collection.getClass();
        Set setM5734p0 = m5734p0(mo5529R(), new LinkedHashSet(), new C1453w0(c5695f));
        if (collection.isEmpty()) {
            c5695f2 = c5695f;
            collection2 = collection;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setM5734p0) {
                InterfaceC6055y0 interfaceC6055y0M5736t0 = m5736t0((InterfaceC6055y0) obj);
                Object arrayList = linkedHashMap.get(interfaceC6055y0M5736t0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(interfaceC6055y0M5736t0, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection3 = collection2;
                C5695f c5695f3 = c5695f2;
                Collection collectionM38375e = AbstractC9888a.m38375e(c5695f3, (Collection) ((Map.Entry) it.next()).getValue(), collection3, mo5529R(), m5632L().m3937a().m3898c(), m5632L().m3937a().m3906k().mo10878a());
                collection2 = collection3;
                c5695f2 = c5695f3;
                collectionM38375e.getClass();
                AbstractC5070c0.m20492E(arrayList2, collectionM38375e);
            }
            collection2.addAll(arrayList2);
        } else {
            c5695f2 = c5695f;
            collection2 = collection;
            Collection collectionM38375e2 = AbstractC9888a.m38375e(c5695f2, setM5734p0, collection2, mo5529R(), m5632L().m3937a().m3898c(), m5632L().m3937a().m3906k().mo10878a());
            collectionM38375e2.getClass();
            collection2.addAll(collectionM38375e2);
        }
        if (this.f4308n.mo8608E() && AbstractC1061t.m3842c(c5695f2, C5135p.f15502e)) {
            AbstractC6370a.m25339a(collection2, AbstractC7258h.m28722f(mo5529R()));
        }
    }

    @Override // ca.AbstractC1447t0
    /* JADX INFO: renamed from: D */
    public Set mo5528D(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        Set setM20562b1 = AbstractC5081g0.m20562b1(((InterfaceC1412c) m5634N().invoke()).mo5492e());
        m5734p0(mo5529R(), setM20562b1, C1451v0.f4293q);
        if (this.f4308n.mo8608E()) {
            setM20562b1.add(C5135p.f15502e);
        }
        return setM20562b1;
    }

    @Override // za.AbstractC9914l, za.InterfaceC9916n
    /* JADX INFO: renamed from: f */
    public InterfaceC6004h mo5518f(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        return null;
    }

    @Override // ca.AbstractC1447t0
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C1409b mo5538z() {
        return new C1409b(this.f4308n, C1449u0.f4290q);
    }

    /* JADX INFO: renamed from: p0 */
    public final Set m5734p0(InterfaceC5995e interfaceC5995e, Set set, InterfaceC0184l interfaceC0184l) {
        AbstractC6371b.m25347b(AbstractC5112w.m20789e(interfaceC5995e), C1455x0.f4297a, new a(interfaceC5995e, set, interfaceC0184l));
        return set;
    }

    @Override // ca.AbstractC1447t0
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public InterfaceC0198c mo5529R() {
        return this.f4309o;
    }

    /* JADX INFO: renamed from: t0 */
    public final InterfaceC6055y0 m5736t0(InterfaceC6055y0 interfaceC6055y0) {
        if (interfaceC6055y0.mo12678j().m23992a()) {
            return interfaceC6055y0;
        }
        Collection collectionMo12674e = interfaceC6055y0.mo12674e();
        collectionMo12674e.getClass();
        Collection<InterfaceC6055y0> collection = collectionMo12674e;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(collection, 10));
        for (InterfaceC6055y0 interfaceC6055y02 : collection) {
            interfaceC6055y02.getClass();
            arrayList.add(m5736t0(interfaceC6055y02));
        }
        return (InterfaceC6055y0) AbstractC5081g0.m20537I0(AbstractC5081g0.m20563c0(arrayList));
    }

    /* JADX INFO: renamed from: u0 */
    public final Set m5737u0(C5695f c5695f, InterfaceC5995e interfaceC5995e) {
        C1459z0 c1459z0M441b = AbstractC0203h.m441b(interfaceC5995e);
        return c1459z0M441b == null ? AbstractC5068b1.m20483e() : AbstractC5081g0.m20564c1(c1459z0M441b.mo5513a(c5695f, EnumC9470d.f32162E));
    }

    @Override // ca.AbstractC1447t0
    /* JADX INFO: renamed from: v */
    public Set mo5536v(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        return AbstractC5068b1.m20483e();
    }

    @Override // ca.AbstractC1447t0
    /* JADX INFO: renamed from: x */
    public Set mo5537x(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        Set setM20562b1 = AbstractC5081g0.m20562b1(((InterfaceC1412c) m5634N().invoke()).mo5488a());
        C1459z0 c1459z0M441b = AbstractC0203h.m441b(mo5529R());
        Set setMo5514b = c1459z0M441b != null ? c1459z0M441b.mo5514b() : null;
        if (setMo5514b == null) {
            setMo5514b = AbstractC5068b1.m20483e();
        }
        setM20562b1.addAll(setMo5514b);
        if (this.f4308n.mo8608E()) {
            setM20562b1.addAll(AbstractC5114x.m20803r(C5135p.f15503f, C5135p.f15501d));
        }
        setM20562b1.addAll(m5632L().m3937a().m3918w().mo36887b(mo5529R(), m5632L()));
        return setM20562b1;
    }

    @Override // ca.AbstractC1447t0
    /* JADX INFO: renamed from: y */
    public void mo5646y(Collection collection, C5695f c5695f) {
        collection.getClass();
        c5695f.getClass();
        m5632L().m3937a().m3918w().mo36893h(mo5529R(), c5695f, collection, m5632L());
    }

    /* JADX INFO: renamed from: ca.z0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6371b.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5995e f4310a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Set f4311b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0184l f4312c;

        public a(InterfaceC5995e interfaceC5995e, Set set, InterfaceC0184l interfaceC0184l) {
            this.f4310a = interfaceC5995e;
            this.f4311b = set;
            this.f4312c = interfaceC0184l;
        }

        @Override // p244qb.AbstractC6371b.d
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5738a() {
            m5741e();
            return C4700i0.f13910a;
        }

        @Override // p244qb.AbstractC6371b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo5739c(InterfaceC5995e interfaceC5995e) {
            interfaceC5995e.getClass();
            if (interfaceC5995e == this.f4310a) {
                return true;
            }
            InterfaceC9913k interfaceC9913kMo5580W = interfaceC5995e.mo5580W();
            interfaceC9913kMo5580W.getClass();
            if (!(interfaceC9913kMo5580W instanceof AbstractC1408a1)) {
                return true;
            }
            this.f4311b.addAll((Collection) this.f4312c.mo27m(interfaceC9913kMo5580W));
            return false;
        }

        /* JADX INFO: renamed from: e */
        public void m5741e() {
        }
    }
}
