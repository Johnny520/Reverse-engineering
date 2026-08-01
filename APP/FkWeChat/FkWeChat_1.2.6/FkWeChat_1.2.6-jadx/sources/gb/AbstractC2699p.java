package gb;

import java.util.Collection;
import java.util.List;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2412n;
import p112hb.AbstractC2949h;
import p112hb.AbstractC2950i;
import p129ib.C3381l;
import p172l8.AbstractC4706m;
import p172l8.C4700i0;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p186m9.AbstractC5128i;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6012j1;

/* JADX INFO: renamed from: gb.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2699p extends AbstractC2717v {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2407i f7057b;

    /* JADX INFO: renamed from: c */
    public final boolean f7058c;

    /* JADX INFO: renamed from: gb.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a implements InterfaceC2716u1 {

        /* JADX INFO: renamed from: a */
        public final AbstractC2949h f7059a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC4705l f7060b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC2699p f7061c;

        public a(AbstractC2699p abstractC2699p, AbstractC2949h abstractC2949h) {
            abstractC2949h.getClass();
            this.f7061c = abstractC2699p;
            this.f7059a = abstractC2949h;
            this.f7060b = AbstractC4706m.m18788b(EnumC4708o.f13922r, new C2696o(this, abstractC2699p));
        }

        /* JADX INFO: renamed from: g */
        public static final List m9553g(a aVar, AbstractC2699p abstractC2699p) {
            return AbstractC2950i.m10855b(aVar.f7059a, abstractC2699p.mo9546n());
        }

        @Override // gb.InterfaceC2716u1
        /* JADX INFO: renamed from: a */
        public InterfaceC2716u1 mo9545a(AbstractC2949h abstractC2949h) {
            abstractC2949h.getClass();
            return this.f7061c.mo9545a(abstractC2949h);
        }

        @Override // gb.InterfaceC2716u1
        /* JADX INFO: renamed from: d */
        public List mo5600d() {
            List listMo5600d = this.f7061c.mo5600d();
            listMo5600d.getClass();
            return listMo5600d;
        }

        /* JADX INFO: renamed from: e */
        public final List m9554e() {
            return (List) this.f7060b.getValue();
        }

        public boolean equals(Object obj) {
            return this.f7061c.equals(obj);
        }

        @Override // gb.InterfaceC2716u1
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public List mo9546n() {
            return m9554e();
        }

        public int hashCode() {
            return this.f7061c.hashCode();
        }

        @Override // gb.InterfaceC2716u1
        /* JADX INFO: renamed from: t */
        public AbstractC5128i mo9341t() {
            AbstractC5128i abstractC5128iMo9341t = this.f7061c.mo9341t();
            abstractC5128iMo9341t.getClass();
            return abstractC5128iMo9341t;
        }

        public String toString() {
            return this.f7061c.toString();
        }

        @Override // gb.InterfaceC2716u1
        /* JADX INFO: renamed from: u */
        public InterfaceC6004h mo5602u() {
            return this.f7061c.mo5602u();
        }

        @Override // gb.InterfaceC2716u1
        /* JADX INFO: renamed from: v */
        public boolean mo5603v() {
            return this.f7061c.mo5603v();
        }
    }

    /* JADX INFO: renamed from: gb.p$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Collection f7062a;

        /* JADX INFO: renamed from: b */
        public List f7063b;

        public b(Collection collection) {
            collection.getClass();
            this.f7062a = collection;
            this.f7063b = AbstractC5112w.m20789e(C3381l.f9328a.m12714l());
        }

        /* JADX INFO: renamed from: a */
        public final Collection m9556a() {
            return this.f7062a;
        }

        /* JADX INFO: renamed from: b */
        public final List m9557b() {
            return this.f7063b;
        }

        /* JADX INFO: renamed from: c */
        public final void m9558c(List list) {
            list.getClass();
            this.f7063b = list;
        }
    }

    public AbstractC2699p(InterfaceC2412n interfaceC2412n) {
        interfaceC2412n.getClass();
        this.f7057b = interfaceC2412n.mo8666i(new C2668h(this), C2672i.f7009q, new C2676j(this));
    }

    /* JADX INFO: renamed from: B */
    public static final b m9530B(AbstractC2699p abstractC2699p) {
        return new b(abstractC2699p.mo5601p());
    }

    /* JADX INFO: renamed from: C */
    public static final b m9531C(boolean z10) {
        return new b(AbstractC5112w.m20789e(C3381l.f9328a.m12714l()));
    }

    /* JADX INFO: renamed from: D */
    public static final C4700i0 m9532D(AbstractC2699p abstractC2699p, b bVar) {
        bVar.getClass();
        Collection collectionMo24017a = abstractC2699p.mo5604w().mo24017a(abstractC2699p, bVar.m9556a(), new C2680k(abstractC2699p), new C2684l(abstractC2699p));
        if (collectionMo24017a.isEmpty()) {
            AbstractC2706r0 abstractC2706r0Mo9339q = abstractC2699p.mo9339q();
            collectionMo24017a = abstractC2706r0Mo9339q != null ? AbstractC5112w.m20789e(abstractC2706r0Mo9339q) : null;
            if (collectionMo24017a == null) {
                collectionMo24017a = AbstractC5114x.m20800o();
            }
        }
        if (abstractC2699p.m9548s()) {
            abstractC2699p.mo5604w().mo24017a(abstractC2699p, collectionMo24017a, new C2688m(abstractC2699p), new C2692n(abstractC2699p));
        }
        List listM20554X0 = collectionMo24017a instanceof List ? (List) collectionMo24017a : null;
        if (listM20554X0 == null) {
            listM20554X0 = AbstractC5081g0.m20554X0(collectionMo24017a);
        }
        bVar.m9558c(abstractC2699p.mo9550y(listM20554X0));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: E */
    public static final Iterable m9533E(AbstractC2699p abstractC2699p, InterfaceC2716u1 interfaceC2716u1) {
        interfaceC2716u1.getClass();
        return abstractC2699p.m9547o(interfaceC2716u1, false);
    }

    /* JADX INFO: renamed from: F */
    public static final C4700i0 m9534F(AbstractC2699p abstractC2699p, AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        abstractC2699p.mo9544A(abstractC2706r0);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: G */
    public static final Iterable m9535G(AbstractC2699p abstractC2699p, InterfaceC2716u1 interfaceC2716u1) {
        interfaceC2716u1.getClass();
        return abstractC2699p.m9547o(interfaceC2716u1, true);
    }

    /* JADX INFO: renamed from: H */
    public static final C4700i0 m9536H(AbstractC2699p abstractC2699p, AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        abstractC2699p.m9551z(abstractC2706r0);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: A */
    public void mo9544A(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: a */
    public InterfaceC2716u1 mo9545a(AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        return new a(this, abstractC2949h);
    }

    /* JADX INFO: renamed from: o */
    public final Collection m9547o(InterfaceC2716u1 interfaceC2716u1, boolean z10) {
        List listM20533E0;
        AbstractC2699p abstractC2699p = interfaceC2716u1 instanceof AbstractC2699p ? (AbstractC2699p) interfaceC2716u1 : null;
        if (abstractC2699p != null && (listM20533E0 = AbstractC5081g0.m20533E0(((b) abstractC2699p.f7057b.invoke()).m9556a(), abstractC2699p.mo9340r(z10))) != null) {
            return listM20533E0;
        }
        Collection collectionMo9546n = interfaceC2716u1.mo9546n();
        collectionMo9546n.getClass();
        return collectionMo9546n;
    }

    /* JADX INFO: renamed from: p */
    public abstract Collection mo5601p();

    /* JADX INFO: renamed from: q */
    public abstract AbstractC2706r0 mo9339q();

    /* JADX INFO: renamed from: r */
    public Collection mo9340r(boolean z10) {
        return AbstractC5114x.m20800o();
    }

    /* JADX INFO: renamed from: s */
    public boolean m9548s() {
        return this.f7058c;
    }

    /* JADX INFO: renamed from: w */
    public abstract InterfaceC6012j1 mo5604w();

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public List mo9546n() {
        return ((b) this.f7057b.invoke()).m9557b();
    }

    /* JADX INFO: renamed from: y */
    public List mo9550y(List list) {
        list.getClass();
        return list;
    }

    /* JADX INFO: renamed from: z */
    public void m9551z(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
    }
}
