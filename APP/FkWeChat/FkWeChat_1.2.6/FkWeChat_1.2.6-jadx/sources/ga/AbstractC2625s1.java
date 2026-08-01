package ga;

import gb.InterfaceC2667g2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p024b9.AbstractC1061t;
import p160kb.InterfaceC4229i;
import p185m8.AbstractC5071c1;
import p185m8.AbstractC5081g0;
import p213oa.C5692c;
import p358y9.AbstractC9626i0;

/* JADX INFO: renamed from: ga.s1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2625s1 {
    /* JADX INFO: renamed from: a */
    public static final C2590h m9318a(C2590h c2590h, Collection collection, boolean z10, boolean z11, boolean z12) {
        EnumC2599k enumC2599kM9322e;
        c2590h.getClass();
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            EnumC2599k enumC2599kM9319b = m9319b((C2590h) it.next());
            if (enumC2599kM9319b != null) {
                arrayList.add(enumC2599kM9319b);
            }
        }
        EnumC2599k enumC2599kM9322e2 = m9322e(AbstractC5081g0.m20564c1(arrayList), m9319b(c2590h), z10);
        if (enumC2599kM9322e2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = collection2.iterator();
            while (it2.hasNext()) {
                EnumC2599k enumC2599kM9252f = ((C2590h) it2.next()).m9252f();
                if (enumC2599kM9252f != null) {
                    arrayList2.add(enumC2599kM9252f);
                }
            }
            enumC2599kM9322e = m9322e(AbstractC5081g0.m20564c1(arrayList2), c2590h.m9252f(), z10);
        } else {
            enumC2599kM9322e = enumC2599kM9322e2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = collection2.iterator();
        while (it3.hasNext()) {
            EnumC2593i enumC2593iM9251e = ((C2590h) it3.next()).m9251e();
            if (enumC2593iM9251e != null) {
                arrayList3.add(enumC2593iM9251e);
            }
        }
        EnumC2593i enumC2593i = (EnumC2593i) m9323f(AbstractC5081g0.m20564c1(arrayList3), EnumC2593i.f6889r, EnumC2593i.f6888q, c2590h.m9251e(), z10);
        if (enumC2599kM9322e == null || z12 || (z11 && enumC2599kM9322e == EnumC2599k.f6898r)) {
            enumC2599kM9322e = null;
        }
        boolean z13 = false;
        boolean z14 = enumC2599kM9322e != null && enumC2599kM9322e2 == null;
        if (enumC2599kM9322e == EnumC2599k.f6899s) {
            if (m9321d(c2590h, z14)) {
                z13 = true;
                break;
            }
            if (!collection2.isEmpty()) {
                Iterator it4 = collection2.iterator();
                while (it4.hasNext()) {
                    if (m9321d((C2590h) it4.next(), z14)) {
                        z13 = true;
                        break;
                    }
                }
            }
        }
        return new C2590h(enumC2599kM9322e, enumC2593i, z13, z14);
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC2599k m9319b(C2590h c2590h) {
        if (c2590h.m9253g()) {
            return null;
        }
        return c2590h.m9252f();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m9320c(InterfaceC2667g2 interfaceC2667g2, InterfaceC4229i interfaceC4229i) {
        interfaceC2667g2.getClass();
        interfaceC4229i.getClass();
        C5692c c5692c = AbstractC9626i0.f32783v;
        c5692c.getClass();
        return interfaceC2667g2.mo9447r0(interfaceC4229i, c5692c);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m9321d(C2590h c2590h, boolean z10) {
        return c2590h.m9253g() == z10 && c2590h.m9250d();
    }

    /* JADX INFO: renamed from: e */
    public static final EnumC2599k m9322e(Set set, EnumC2599k enumC2599k, boolean z10) {
        EnumC2599k enumC2599k2 = EnumC2599k.f6897q;
        return enumC2599k == enumC2599k2 ? enumC2599k2 : (EnumC2599k) m9323f(set, EnumC2599k.f6899s, EnumC2599k.f6898r, enumC2599k, z10);
    }

    /* JADX INFO: renamed from: f */
    public static final Object m9323f(Set set, Object obj, Object obj2, Object obj3, boolean z10) {
        Set setM20564c1;
        if (!z10) {
            if (obj3 != null && (setM20564c1 = AbstractC5081g0.m20564c1(AbstractC5071c1.m20504m(set, obj3))) != null) {
                set = setM20564c1;
            }
            return AbstractC5081g0.m20538J0(set);
        }
        Object obj4 = set.contains(obj) ? obj : set.contains(obj2) ? obj2 : null;
        if (AbstractC1061t.m3842c(obj4, obj) && AbstractC1061t.m3842c(obj3, obj2)) {
            return null;
        }
        return obj3 == null ? obj4 : obj3;
    }
}
