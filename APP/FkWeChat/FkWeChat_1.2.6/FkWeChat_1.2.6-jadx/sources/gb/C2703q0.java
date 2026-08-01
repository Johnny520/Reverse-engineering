package gb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p112hb.AbstractC2949h;
import p160kb.InterfaceC4228h;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p186m9.AbstractC5128i;
import p211o8.AbstractC5661b;
import p229p9.InterfaceC6004h;
import za.C9926x;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: gb.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2703q0 implements InterfaceC2716u1, InterfaceC4228h {

    /* JADX INFO: renamed from: a */
    public AbstractC2706r0 f7065a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f7066b;

    /* JADX INFO: renamed from: c */
    public final int f7067c;

    /* JADX INFO: renamed from: gb.q0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0184l f7068a;

        public a(InterfaceC0184l interfaceC0184l) {
            this.f7068a = interfaceC0184l;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            AbstractC2706r0 abstractC2706r0 = (AbstractC2706r0) obj;
            InterfaceC0184l interfaceC0184l = this.f7068a;
            abstractC2706r0.getClass();
            String string = interfaceC0184l.mo27m(abstractC2706r0).toString();
            AbstractC2706r0 abstractC2706r02 = (AbstractC2706r0) obj2;
            InterfaceC0184l interfaceC0184l2 = this.f7068a;
            abstractC2706r02.getClass();
            return AbstractC5661b.m22869d(string, interfaceC0184l2.mo27m(abstractC2706r02).toString());
        }
    }

    public C2703q0(Collection collection) {
        collection.getClass();
        collection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        this.f7066b = linkedHashSet;
        this.f7067c = linkedHashSet.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC2650c1 m9565i(C2703q0 c2703q0, AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        return c2703q0.mo9545a(abstractC2949h).m9570h();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m9566l(C2703q0 c2703q0, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0184l = C2697o0.f7056q;
        }
        return c2703q0.m9572k(interfaceC0184l);
    }

    /* JADX INFO: renamed from: m */
    public static final String m9567m(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return abstractC2706r0.toString();
    }

    /* JADX INFO: renamed from: o */
    public static final CharSequence m9568o(InterfaceC0184l interfaceC0184l, AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return interfaceC0184l.mo27m(abstractC2706r0).toString();
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: d */
    public List mo5600d() {
        return AbstractC5114x.m20800o();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2703q0) {
            return AbstractC1061t.m3842c(this.f7066b, ((C2703q0) obj).f7066b);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC9913k m9569g() {
        return C9926x.f33454d.m38485a("member scope for intersection type", this.f7066b);
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC2650c1 m9570h() {
        return C2715u0.m9634p(C2704q1.f7069r.m9585k(), this, AbstractC5114x.m20800o(), false, m9569g(), new C2700p0(this));
    }

    public int hashCode() {
        return this.f7067c;
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC2706r0 m9571j() {
        return this.f7065a;
    }

    /* JADX INFO: renamed from: k */
    public final String m9572k(InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        return AbstractC5081g0.m20585s0(AbstractC5081g0.m20542N0(this.f7066b, new a(interfaceC0184l)), " & ", "{", "}", 0, null, new C2693n0(interfaceC0184l), 24, null);
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: n */
    public Collection mo9546n() {
        return this.f7066b;
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C2703q0 mo9545a(AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        Collection collectionMo9546n = mo9546n();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(collectionMo9546n, 10));
        Iterator it = collectionMo9546n.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            arrayList.add(((AbstractC2706r0) it.next()).mo9325d1(abstractC2949h));
            z10 = true;
        }
        C2703q0 c2703q0M9574q = null;
        if (z10) {
            AbstractC2706r0 abstractC2706r0M9571j = m9571j();
            c2703q0M9574q = new C2703q0(arrayList).m9574q(abstractC2706r0M9571j != null ? abstractC2706r0M9571j.mo9325d1(abstractC2949h) : null);
        }
        return c2703q0M9574q == null ? this : c2703q0M9574q;
    }

    /* JADX INFO: renamed from: q */
    public final C2703q0 m9574q(AbstractC2706r0 abstractC2706r0) {
        return new C2703q0(this.f7066b, abstractC2706r0);
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: t */
    public AbstractC5128i mo9341t() {
        AbstractC5128i abstractC5128iMo9341t = ((AbstractC2706r0) this.f7066b.iterator().next()).mo9332T0().mo9341t();
        abstractC5128iMo9341t.getClass();
        return abstractC5128iMo9341t;
    }

    public String toString() {
        return m9566l(this, null, 1, null);
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: u */
    public InterfaceC6004h mo5602u() {
        return null;
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: v */
    public boolean mo5603v() {
        return false;
    }

    public C2703q0(Collection collection, AbstractC2706r0 abstractC2706r0) {
        this(collection);
        this.f7065a = abstractC2706r0;
    }
}
