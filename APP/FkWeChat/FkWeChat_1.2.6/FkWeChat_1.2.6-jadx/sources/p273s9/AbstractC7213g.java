package p273s9;

import gb.AbstractC2650c1;
import gb.AbstractC2675i2;
import gb.InterfaceC2716u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p024b9.C1038h0;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2412n;
import p098g9.InterfaceC2557k;
import p112hb.AbstractC2949h;
import p185m8.AbstractC5114x;
import p186m9.AbstractC5128i;
import p213oa.C5695f;
import p229p9.AbstractC6043u;
import p229p9.InterfaceC5992d;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6015k1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6025o;
import p229p9.InterfaceC6028p;
import p243q9.InterfaceC6333h;
import p273s9.C7238s0;
import p327wa.AbstractC9211e;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: s9.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7213g extends AbstractC7227n implements InterfaceC6015k1 {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ InterfaceC2557k[] f23907z = {AbstractC1052o0.m3814i(new C1038h0(AbstractC7213g.class, "constructors", "getConstructors()Ljava/util/Collection;", 0))};

    /* JADX INFO: renamed from: u */
    public final InterfaceC2412n f23908u;

    /* JADX INFO: renamed from: v */
    public final AbstractC6043u f23909v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC2407i f23910w;

    /* JADX INFO: renamed from: x */
    public List f23911x;

    /* JADX INFO: renamed from: y */
    public final a f23912y;

    /* JADX INFO: renamed from: s9.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC2716u1 {
        public a() {
        }

        @Override // gb.InterfaceC2716u1
        /* JADX INFO: renamed from: a */
        public InterfaceC2716u1 mo9545a(AbstractC2949h abstractC2949h) {
            abstractC2949h.getClass();
            return this;
        }

        @Override // gb.InterfaceC2716u1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC6015k1 mo5602u() {
            return AbstractC7213g.this;
        }

        @Override // gb.InterfaceC2716u1
        /* JADX INFO: renamed from: d */
        public List mo5600d() {
            return AbstractC7213g.this.mo7499X0();
        }

        @Override // gb.InterfaceC2716u1
        /* JADX INFO: renamed from: n */
        public Collection mo9546n() {
            Collection collectionMo9546n = mo5602u().mo7506l0().mo9332T0().mo9546n();
            collectionMo9546n.getClass();
            return collectionMo9546n;
        }

        @Override // gb.InterfaceC2716u1
        /* JADX INFO: renamed from: t */
        public AbstractC5128i mo9341t() {
            return AbstractC9211e.m35858m(mo5602u());
        }

        public String toString() {
            return "[typealias " + mo5602u().getName().m23030c() + ']';
        }

        @Override // gb.InterfaceC2716u1
        /* JADX INFO: renamed from: v */
        public boolean mo5603v() {
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7213g(InterfaceC2412n interfaceC2412n, InterfaceC6019m interfaceC6019m, InterfaceC6333h interfaceC6333h, C5695f c5695f, InterfaceC6003g1 interfaceC6003g1, AbstractC6043u abstractC6043u) {
        super(interfaceC6019m, interfaceC6333h, c5695f, interfaceC6003g1);
        interfaceC2412n.getClass();
        interfaceC6019m.getClass();
        interfaceC6333h.getClass();
        c5695f.getClass();
        interfaceC6003g1.getClass();
        abstractC6043u.getClass();
        this.f23908u = interfaceC2412n;
        this.f23909v = abstractC6043u;
        this.f23910w = interfaceC2412n.mo8663f(new C7207d(this));
        this.f23912y = new a();
    }

    /* JADX INFO: renamed from: T0 */
    public static final AbstractC2650c1 m28473T0(AbstractC7213g abstractC7213g, AbstractC2949h abstractC2949h) {
        InterfaceC6004h interfaceC6004hMo10850f = abstractC2949h.mo10850f(abstractC7213g);
        if (interfaceC6004hMo10850f != null) {
            return interfaceC6004hMo10850f.mo7508x();
        }
        return null;
    }

    /* JADX INFO: renamed from: U0 */
    public static final Collection m28474U0(AbstractC7213g abstractC7213g) {
        return abstractC7213g.m28479W0();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX INFO: renamed from: Z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Boolean m28475Z0(p273s9.AbstractC7213g r1, gb.AbstractC2687l2 r2) {
        /*
            r2.getClass()
            boolean r0 = gb.AbstractC2718v0.m9643a(r2)
            if (r0 != 0) goto L23
            gb.u1 r2 = r2.mo9332T0()
            p9.h r2 = r2.mo5602u()
            boolean r0 = r2 instanceof p229p9.InterfaceC6018l1
            if (r0 == 0) goto L23
            p9.l1 r2 = (p229p9.InterfaceC6018l1) r2
            p9.m r2 = r2.mo7443b()
            boolean r1 = p024b9.AbstractC1061t.m3842c(r2, r1)
            if (r1 != 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p273s9.AbstractC7213g.m28475Z0(s9.g, gb.l2):java.lang.Boolean");
    }

    @Override // p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: C */
    public boolean mo7416C() {
        return false;
    }

    @Override // p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: I0 */
    public boolean mo5573I0() {
        return false;
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: M0 */
    public Object mo12663M0(InterfaceC6025o interfaceC6025o, Object obj) {
        interfaceC6025o.getClass();
        return interfaceC6025o.mo24039j(this, obj);
    }

    @Override // p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: R */
    public boolean mo5576R() {
        return false;
    }

    @Override // p229p9.InterfaceC6007i
    /* JADX INFO: renamed from: S */
    public boolean mo5577S() {
        return AbstractC2675i2.m9455c(mo7506l0(), new C7209e(this));
    }

    /* JADX INFO: renamed from: S0 */
    public final AbstractC2650c1 m28477S0() {
        InterfaceC9913k interfaceC9913kMo5571H0;
        InterfaceC5995e interfaceC5995eMo7507w = mo7507w();
        if (interfaceC5995eMo7507w == null || (interfaceC9913kMo5571H0 = interfaceC5995eMo7507w.mo5571H0()) == null) {
            interfaceC9913kMo5571H0 = InterfaceC9913k.b.f33436b;
        }
        AbstractC2650c1 abstractC2650c1M9474v = AbstractC2675i2.m9474v(this, interfaceC9913kMo5571H0, new C7211f(this));
        abstractC2650c1M9474v.getClass();
        return abstractC2650c1M9474v;
    }

    @Override // p273s9.AbstractC7227n, p273s9.AbstractC7225m, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public InterfaceC6015k1 mo12664a() {
        InterfaceC6028p interfaceC6028pMo12664a = super.mo12664a();
        interfaceC6028pMo12664a.getClass();
        return (InterfaceC6015k1) interfaceC6028pMo12664a;
    }

    /* JADX INFO: renamed from: W0 */
    public final Collection m28479W0() {
        InterfaceC5995e interfaceC5995eMo7507w = mo7507w();
        if (interfaceC5995eMo7507w == null) {
            return AbstractC5114x.m20800o();
        }
        Collection<InterfaceC5992d> collectionMo5590l = interfaceC5995eMo7507w.mo5590l();
        collectionMo5590l.getClass();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC5992d interfaceC5992d : collectionMo5590l) {
            C7238s0.a aVar = C7238s0.f24078Y;
            InterfaceC2412n interfaceC2412n = this.f23908u;
            interfaceC5992d.getClass();
            InterfaceC7234q0 interfaceC7234q0M28652b = aVar.m28652b(interfaceC2412n, this, interfaceC5992d);
            if (interfaceC7234q0M28652b != null) {
                arrayList.add(interfaceC7234q0M28652b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: X0 */
    public abstract List mo7499X0();

    /* JADX INFO: renamed from: Y0 */
    public final void m28480Y0(List list) {
        list.getClass();
        this.f23911x = list;
    }

    @Override // p229p9.InterfaceC5993d0, p229p9.InterfaceC6031q
    /* JADX INFO: renamed from: g */
    public AbstractC6043u mo5587g() {
        return this.f23909v;
    }

    /* JADX INFO: renamed from: m0 */
    public final InterfaceC2412n m28481m0() {
        return this.f23908u;
    }

    @Override // p229p9.InterfaceC6004h
    /* JADX INFO: renamed from: o */
    public InterfaceC2716u1 mo5591o() {
        return this.f23912y;
    }

    @Override // p273s9.AbstractC7225m
    public String toString() {
        return "typealias " + getName().m23030c();
    }

    @Override // p229p9.InterfaceC6007i
    /* JADX INFO: renamed from: z */
    public List mo5594z() {
        List list = this.f23911x;
        if (list != null) {
            return list;
        }
        AbstractC1061t.m3851l("declaredTypeParametersImpl");
        return null;
    }
}
