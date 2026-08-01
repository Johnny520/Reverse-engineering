package p112hb;

import gb.AbstractC2650c1;
import gb.AbstractC2666g1;
import gb.AbstractC2685l0;
import gb.AbstractC2687l2;
import gb.AbstractC2706r0;
import gb.C2703q0;
import gb.C2704q1;
import gb.C2726y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.C1055q;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;
import p215oc.C5725t;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;
import ua.C8600q;

/* JADX INFO: renamed from: hb.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2941a0 {

    /* JADX INFO: renamed from: a */
    public static final C2941a0 f7773a = new C2941a0();

    /* JADX INFO: renamed from: hb.a0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b extends C1055q implements InterfaceC0188p {
        public b(Object obj) {
            super(2, obj, C2941a0.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02) {
            abstractC2706r0.getClass();
            abstractC2706r02.getClass();
            return Boolean.valueOf(((C2941a0) this.f3190r).m10746g(abstractC2706r0, abstractC2706r02));
        }
    }

    /* JADX INFO: renamed from: hb.a0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class c extends C1055q implements InterfaceC0188p {
        public c(Object obj) {
            super(2, obj, C2959r.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02) {
            abstractC2706r0.getClass();
            abstractC2706r02.getClass();
            return Boolean.valueOf(((C2959r) this.f3190r).mo10841d(abstractC2706r0, abstractC2706r02));
        }
    }

    /* JADX INFO: renamed from: f */
    public static final String m10742f(Set set) {
        return "This collections cannot be empty! input types: " + AbstractC5081g0.m20585s0(set, null, null, null, 0, null, null, 63, null);
    }

    /* JADX INFO: renamed from: c */
    public final Collection m10743c(Collection collection, InterfaceC0188p interfaceC0188p) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            AbstractC2650c1 abstractC2650c1 = (AbstractC2650c1) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC2650c1 abstractC2650c12 = (AbstractC2650c1) it2.next();
                    if (abstractC2650c12 != abstractC2650c1) {
                        abstractC2650c12.getClass();
                        abstractC2650c1.getClass();
                        if (((Boolean) interfaceC0188p.invoke(abstractC2650c12, abstractC2650c1)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC2650c1 m10744d(List list) {
        list.getClass();
        list.size();
        ArrayList<AbstractC2650c1> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2650c1 abstractC2650c1 = (AbstractC2650c1) it.next();
            if (abstractC2650c1.mo9332T0() instanceof C2703q0) {
                Collection collectionMo9546n = abstractC2650c1.mo9332T0().mo9546n();
                collectionMo9546n.getClass();
                Collection<AbstractC2706r0> collection = collectionMo9546n;
                ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(collection, 10));
                for (AbstractC2706r0 abstractC2706r0 : collection) {
                    abstractC2706r0.getClass();
                    AbstractC2650c1 abstractC2650c1M9495d = AbstractC2685l0.m9495d(abstractC2706r0);
                    if (abstractC2650c1.mo9258U0()) {
                        abstractC2650c1M9495d = abstractC2650c1M9495d.mo7032X0(true);
                    }
                    arrayList2.add(abstractC2650c1M9495d);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(abstractC2650c1);
            }
        }
        a aVarMo10748c = a.f7774q;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVarMo10748c = aVarMo10748c.mo10748c((AbstractC2687l2) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC2650c1 abstractC2650c1M9436i : arrayList) {
            if (aVarMo10748c == a.f7777t) {
                if (abstractC2650c1M9436i instanceof C2951j) {
                    abstractC2650c1M9436i = AbstractC2666g1.m9438k((C2951j) abstractC2650c1M9436i);
                }
                abstractC2650c1M9436i = AbstractC2666g1.m9436i(abstractC2650c1M9436i, false, 1, null);
            }
            linkedHashSet.add(abstractC2650c1M9436i);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC5116y.m20814z(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((AbstractC2650c1) it3.next()).mo9331S0());
        }
        Iterator it4 = arrayList3.iterator();
        if (!it4.hasNext()) {
            C5725t.m23179a("Empty collection can't be reduced.");
            return null;
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            next = ((C2704q1) next).m9579s((C2704q1) it4.next());
        }
        return m10745e(linkedHashSet).mo7034Z0((C2704q1) next);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC2650c1 m10745e(Set set) {
        if (set.size() == 1) {
            return (AbstractC2650c1) AbstractC5081g0.m20536H0(set);
        }
        new C2967z(set);
        Set set2 = set;
        Collection collectionM10743c = m10743c(set2, new b(this));
        collectionM10743c.isEmpty();
        AbstractC2650c1 abstractC2650c1M33034b = C8600q.f28635f.m33034b(collectionM10743c);
        if (abstractC2650c1M33034b != null) {
            return abstractC2650c1M33034b;
        }
        Collection collectionM10743c2 = m10743c(collectionM10743c, new c(InterfaceC2958q.f7802b.m10880a()));
        collectionM10743c2.isEmpty();
        return collectionM10743c2.size() < 2 ? (AbstractC2650c1) AbstractC5081g0.m20536H0(collectionM10743c2) : new C2703q0(set2).m9570h();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m10746g(AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02) {
        C2959r c2959rM10880a = InterfaceC2958q.f7802b.m10880a();
        return c2959rM10880a.mo10840b(abstractC2706r0, abstractC2706r02) && !c2959rM10880a.mo10840b(abstractC2706r02, abstractC2706r0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: hb.a0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: q */
        public static final a f7774q = new c("START", 0);

        /* JADX INFO: renamed from: r */
        public static final a f7775r = new C10096a("ACCEPT_NULL", 1);

        /* JADX INFO: renamed from: s */
        public static final a f7776s = new d("UNKNOWN", 2);

        /* JADX INFO: renamed from: t */
        public static final a f7777t = new b("NOT_NULL", 3);

        /* JADX INFO: renamed from: u */
        public static final /* synthetic */ a[] f7778u;

        /* JADX INFO: renamed from: v */
        public static final /* synthetic */ InterfaceC7197a f7779v;

        /* JADX INFO: renamed from: hb.a0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10096a extends a {
            public C10096a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p112hb.C2941a0.a
            /* JADX INFO: renamed from: c */
            public a mo10748c(AbstractC2687l2 abstractC2687l2) {
                abstractC2687l2.getClass();
                return m10749g(abstractC2687l2);
            }
        }

        /* JADX INFO: renamed from: hb.a0$a$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b extends a {
            public b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p112hb.C2941a0.a
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public b mo10748c(AbstractC2687l2 abstractC2687l2) {
                abstractC2687l2.getClass();
                return this;
            }
        }

        /* JADX INFO: renamed from: hb.a0$a$c */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class c extends a {
            public c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p112hb.C2941a0.a
            /* JADX INFO: renamed from: c */
            public a mo10748c(AbstractC2687l2 abstractC2687l2) {
                abstractC2687l2.getClass();
                return m10749g(abstractC2687l2);
            }
        }

        /* JADX INFO: renamed from: hb.a0$a$d */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class d extends a {
            public d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p112hb.C2941a0.a
            /* JADX INFO: renamed from: c */
            public a mo10748c(AbstractC2687l2 abstractC2687l2) {
                abstractC2687l2.getClass();
                a aVarM10749g = m10749g(abstractC2687l2);
                return aVarM10749g == a.f7775r ? this : aVarM10749g;
            }
        }

        static {
            a[] aVarArrM10747a = m10747a();
            f7778u = aVarArrM10747a;
            f7779v = AbstractC7198b.m28437a(aVarArrM10747a);
        }

        public /* synthetic */ a(String str, int i10, AbstractC1043k abstractC1043k) {
            this(str, i10);
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a[] m10747a() {
            return new a[]{f7774q, f7775r, f7776s, f7777t};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f7778u.clone();
        }

        /* JADX INFO: renamed from: c */
        public abstract a mo10748c(AbstractC2687l2 abstractC2687l2);

        /* JADX INFO: renamed from: g */
        public final a m10749g(AbstractC2687l2 abstractC2687l2) {
            abstractC2687l2.getClass();
            if (abstractC2687l2.mo9258U0()) {
                return f7775r;
            }
            if (abstractC2687l2 instanceof C2726y) {
                ((C2726y) abstractC2687l2).m9657f1();
            }
            return C2960s.f7808a.m10884a(abstractC2687l2) ? f7777t : f7776s;
        }

        public a(String str, int i10) {
        }
    }
}
