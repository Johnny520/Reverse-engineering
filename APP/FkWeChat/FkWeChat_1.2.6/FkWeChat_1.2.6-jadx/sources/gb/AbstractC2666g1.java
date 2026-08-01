package gb;

import gb.C2726y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p112hb.C2951j;
import p185m8.AbstractC5116y;

/* JADX INFO: renamed from: gb.g1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2666g1 {
    /* JADX INFO: renamed from: a */
    public static final C2640a m9428a(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        AbstractC2687l2 abstractC2687l2Mo9510W0 = abstractC2706r0.mo9510W0();
        if (abstractC2687l2Mo9510W0 instanceof C2640a) {
            return (C2640a) abstractC2687l2Mo9510W0;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC2650c1 m9429b(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        C2640a c2640aM9428a = m9428a(abstractC2706r0);
        if (c2640aM9428a != null) {
            return c2640aM9428a.m9326f1();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m9430c(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return abstractC2706r0.mo9510W0() instanceof C2726y;
    }

    /* JADX INFO: renamed from: d */
    public static final C2703q0 m9431d(C2703q0 c2703q0) {
        AbstractC2706r0 abstractC2706r0;
        Collection collectionMo9546n = c2703q0.mo9546n();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(collectionMo9546n, 10));
        Iterator it = collectionMo9546n.iterator();
        boolean z10 = false;
        while (true) {
            abstractC2706r0 = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC2706r0 abstractC2706r0M9433f = (AbstractC2706r0) it.next();
            if (AbstractC2675i2.m9464l(abstractC2706r0M9433f)) {
                abstractC2706r0M9433f = m9433f(abstractC2706r0M9433f.mo9510W0(), false, 1, null);
                z10 = true;
            }
            arrayList.add(abstractC2706r0M9433f);
        }
        if (!z10) {
            return null;
        }
        AbstractC2706r0 abstractC2706r0M9571j = c2703q0.m9571j();
        if (abstractC2706r0M9571j != null) {
            if (AbstractC2675i2.m9464l(abstractC2706r0M9571j)) {
                abstractC2706r0M9571j = m9433f(abstractC2706r0M9571j.mo9510W0(), false, 1, null);
            }
            abstractC2706r0 = abstractC2706r0M9571j;
        }
        return new C2703q0(arrayList).m9574q(abstractC2706r0);
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC2687l2 m9432e(AbstractC2687l2 abstractC2687l2, boolean z10) {
        abstractC2687l2.getClass();
        C2726y c2726yM9659c = C2726y.a.m9659c(C2726y.f7125t, abstractC2687l2, z10, false, 4, null);
        if (c2726yM9659c != null) {
            return c2726yM9659c;
        }
        AbstractC2650c1 abstractC2650c1M9434g = m9434g(abstractC2687l2);
        return abstractC2650c1M9434g != null ? abstractC2650c1M9434g : abstractC2687l2.mo7032X0(false);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ AbstractC2687l2 m9433f(AbstractC2687l2 abstractC2687l2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m9432e(abstractC2687l2, z10);
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC2650c1 m9434g(AbstractC2706r0 abstractC2706r0) {
        C2703q0 c2703q0M9431d;
        InterfaceC2716u1 interfaceC2716u1Mo9332T0 = abstractC2706r0.mo9332T0();
        C2703q0 c2703q0 = interfaceC2716u1Mo9332T0 instanceof C2703q0 ? (C2703q0) interfaceC2716u1Mo9332T0 : null;
        if (c2703q0 == null || (c2703q0M9431d = m9431d(c2703q0)) == null) {
            return null;
        }
        return c2703q0M9431d.m9570h();
    }

    /* JADX INFO: renamed from: h */
    public static final AbstractC2650c1 m9435h(AbstractC2650c1 abstractC2650c1, boolean z10) {
        abstractC2650c1.getClass();
        C2726y c2726yM9659c = C2726y.a.m9659c(C2726y.f7125t, abstractC2650c1, z10, false, 4, null);
        if (c2726yM9659c != null) {
            return c2726yM9659c;
        }
        AbstractC2650c1 abstractC2650c1M9434g = m9434g(abstractC2650c1);
        return abstractC2650c1M9434g == null ? abstractC2650c1.mo7032X0(false) : abstractC2650c1M9434g;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ AbstractC2650c1 m9436i(AbstractC2650c1 abstractC2650c1, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m9435h(abstractC2650c1, z10);
    }

    /* JADX INFO: renamed from: j */
    public static final AbstractC2650c1 m9437j(AbstractC2650c1 abstractC2650c1, AbstractC2650c1 abstractC2650c12) {
        abstractC2650c1.getClass();
        abstractC2650c12.getClass();
        return AbstractC2718v0.m9643a(abstractC2650c1) ? abstractC2650c1 : new C2640a(abstractC2650c1, abstractC2650c12);
    }

    /* JADX INFO: renamed from: k */
    public static final C2951j m9438k(C2951j c2951j) {
        c2951j.getClass();
        return new C2951j(c2951j.m10856c1(), c2951j.mo9332T0(), c2951j.m10858e1(), c2951j.mo9331S0(), c2951j.mo9258U0(), true);
    }
}
