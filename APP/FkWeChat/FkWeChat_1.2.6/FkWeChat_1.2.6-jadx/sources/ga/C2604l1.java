package ga;

import ba.AbstractC1075c;
import ba.C1083k;
import ca.C1426j;
import ca.C1434n;
import gb.AbstractC2675i2;
import gb.AbstractC2687l2;
import gb.AbstractC2706r0;
import gb.InterfaceC2646b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lb.AbstractC4734d;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p081fa.InterfaceC2369a;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p212o9.C5667c;
import p213oa.C5695f;
import p229p9.AbstractC6037s;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6018l1;
import p229p9.InterfaceC6039s1;
import p243q9.InterfaceC6326a;
import p243q9.InterfaceC6333h;
import p327wa.AbstractC9211e;
import p358y9.EnumC9613c;

/* JADX INFO: renamed from: ga.l1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2604l1 {

    /* JADX INFO: renamed from: a */
    public final C2587g f6908a;

    public C2604l1(C2587g c2587g) {
        c2587g.getClass();
        this.f6908a = c2587g;
    }

    /* JADX INFO: renamed from: g */
    public static final Boolean m9276g(AbstractC2687l2 abstractC2687l2) {
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2687l2.mo9332T0().mo5602u();
        if (interfaceC6004hMo5602u == null) {
            return Boolean.FALSE;
        }
        C5695f name = interfaceC6004hMo5602u.getName();
        C5667c c5667c = C5667c.f17796a;
        return Boolean.valueOf(AbstractC1061t.m3842c(name, c5667c.m22887h().m22999f()) && AbstractC1061t.m3842c(AbstractC9211e.m35856k(interfaceC6004hMo5602u), c5667c.m22887h()));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ AbstractC2706r0 m9277j(C2604l1 c2604l1, C2610n1 c2610n1, AbstractC2706r0 abstractC2706r0, List list, C2619q1 c2619q1, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            c2619q1 = null;
        }
        C2619q1 c2619q12 = c2619q1;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return c2604l1.m9284h(c2610n1, abstractC2706r0, list, c2619q12, z10);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ AbstractC2706r0 m9278k(C2604l1 c2604l1, InterfaceC5986b interfaceC5986b, InterfaceC6326a interfaceC6326a, boolean z10, C1083k c1083k, EnumC9613c enumC9613c, C2619q1 c2619q1, boolean z11, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
        return c2604l1.m9285i(interfaceC5986b, interfaceC6326a, z10, c1083k, enumC9613c, c2619q1, (i10 & 32) != 0 ? false : z11, interfaceC0184l);
    }

    /* JADX INFO: renamed from: m */
    public static final AbstractC2706r0 m9279m(InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        AbstractC2706r0 abstractC2706r0Mo12675f = interfaceC5986b.mo12675f();
        abstractC2706r0Mo12675f.getClass();
        return abstractC2706r0Mo12675f;
    }

    /* JADX INFO: renamed from: n */
    public static final AbstractC2706r0 m9280n(InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        InterfaceC5988b1 interfaceC5988b1Mo12682q0 = interfaceC5986b.mo12682q0();
        interfaceC5988b1Mo12682q0.getClass();
        AbstractC2706r0 type = interfaceC5988b1Mo12682q0.getType();
        type.getClass();
        return type;
    }

    /* JADX INFO: renamed from: o */
    public static final AbstractC2706r0 m9281o(InterfaceC6039s1 interfaceC6039s1, InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        AbstractC2706r0 type = ((InterfaceC6039s1) interfaceC5986b.mo12680m().get(interfaceC6039s1.getIndex())).getType();
        type.getClass();
        return type;
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m9282s(AbstractC2687l2 abstractC2687l2) {
        abstractC2687l2.getClass();
        return abstractC2687l2 instanceof InterfaceC2646b1;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m9283f(AbstractC2706r0 abstractC2706r0) {
        return AbstractC2675i2.m9455c(abstractC2706r0, C2601k1.f6903q);
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC2706r0 m9284h(C2610n1 c2610n1, AbstractC2706r0 abstractC2706r0, List list, C2619q1 c2619q1, boolean z10) {
        return this.f6908a.m9238a(abstractC2706r0, c2610n1.m9118d(abstractC2706r0, list, c2619q1, z10), c2610n1.mo9138z());
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC2706r0 m9285i(InterfaceC5986b interfaceC5986b, InterfaceC6326a interfaceC6326a, boolean z10, C1083k c1083k, EnumC9613c enumC9613c, C2619q1 c2619q1, boolean z11, InterfaceC0184l interfaceC0184l) {
        C2610n1 c2610n1 = new C2610n1(interfaceC6326a, z10, c1083k, enumC9613c, false, 16, null);
        AbstractC2706r0 abstractC2706r0 = (AbstractC2706r0) interfaceC0184l.mo27m(interfaceC5986b);
        Collection collectionMo12674e = interfaceC5986b.mo12674e();
        collectionMo12674e.getClass();
        Collection<InterfaceC5986b> collection = collectionMo12674e;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(collection, 10));
        for (InterfaceC5986b interfaceC5986b2 : collection) {
            interfaceC5986b2.getClass();
            arrayList.add((AbstractC2706r0) interfaceC0184l.mo27m(interfaceC5986b2));
        }
        return m9284h(c2610n1, abstractC2706r0, arrayList, c2619q1, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x020f, code lost:
    
        if (r3 == null) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p229p9.InterfaceC5986b m9286l(p229p9.InterfaceC5986b r18, ba.C1083k r19) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.C2604l1.m9286l(p9.b, ba.k):p9.b");
    }

    /* JADX INFO: renamed from: p */
    public final Collection m9287p(C1083k c1083k, Collection collection) {
        c1083k.getClass();
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(m9286l((InterfaceC5986b) it.next(), c1083k));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC2706r0 m9288q(AbstractC2706r0 abstractC2706r0, C1083k c1083k) {
        abstractC2706r0.getClass();
        c1083k.getClass();
        AbstractC2706r0 abstractC2706r0M9277j = m9277j(this, new C2610n1(null, false, c1083k, EnumC9613c.f32728u, true), abstractC2706r0, AbstractC5114x.m20800o(), null, false, 12, null);
        return abstractC2706r0M9277j == null ? abstractC2706r0 : abstractC2706r0M9277j;
    }

    /* JADX INFO: renamed from: r */
    public final List m9289r(InterfaceC6018l1 interfaceC6018l1, List list, C1083k c1083k) {
        interfaceC6018l1.getClass();
        list.getClass();
        c1083k.getClass();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2706r0 abstractC2706r0 = (AbstractC2706r0) it.next();
            if (!AbstractC4734d.m18910e(abstractC2706r0, C2598j1.f6896q)) {
                AbstractC2706r0 abstractC2706r0M9277j = m9277j(this, new C2610n1(interfaceC6018l1, false, c1083k, EnumC9613c.f32729v, false, 16, null), abstractC2706r0, AbstractC5114x.m20800o(), null, false, 12, null);
                if (abstractC2706r0M9277j != null) {
                    abstractC2706r0 = abstractC2706r0M9277j;
                }
            }
            arrayList.add(abstractC2706r0);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC2706r0 m9290t(InterfaceC5986b interfaceC5986b, InterfaceC6039s1 interfaceC6039s1, C1083k c1083k, C2619q1 c2619q1, boolean z10, InterfaceC0184l interfaceC0184l) {
        C1083k c1083kM3893k;
        return m9285i(interfaceC5986b, interfaceC6039s1, false, (interfaceC6039s1 == null || (c1083kM3893k = AbstractC1075c.m3893k(c1083k, interfaceC6039s1.getAnnotations())) == null) ? c1083k : c1083kM3893k, EnumC9613c.f32726s, c2619q1, z10, interfaceC0184l);
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC6333h m9291u(InterfaceC5986b interfaceC5986b, C1083k c1083k) {
        InterfaceC6004h interfaceC6004hM24060a = AbstractC6037s.m24060a(interfaceC5986b);
        if (interfaceC6004hM24060a == null) {
            return interfaceC5986b.getAnnotations();
        }
        C1434n c1434n = interfaceC6004hM24060a instanceof C1434n ? (C1434n) interfaceC6004hM24060a : null;
        List listM5584Z0 = c1434n != null ? c1434n.m5584Z0() : null;
        if (listM5584Z0 == null || listM5584Z0.isEmpty()) {
            return interfaceC5986b.getAnnotations();
        }
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM5584Z0, 10));
        Iterator it = listM5584Z0.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1426j(c1083k, (InterfaceC2369a) it.next(), true));
        }
        return InterfaceC6333h.f19873o.m25002a(AbstractC5081g0.m20531C0(interfaceC5986b.getAnnotations(), arrayList));
    }
}
