package gb;

import gb.AbstractC2719v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import lb.AbstractC4734d;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p082fb.C2404f;
import p082fb.InterfaceC2405g;
import p112hb.AbstractC2946e;
import p129ib.C3378i;
import p129ib.C3381l;
import p129ib.EnumC3380k;
import p172l8.AbstractC4706m;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5065a1;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5116y;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6018l1;
import p376zd.C9987e;

/* JADX INFO: renamed from: gb.z1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2731z1 {

    /* JADX INFO: renamed from: f */
    public static final a f7130f = new a(null);

    /* JADX INFO: renamed from: a */
    public final AbstractC2661f0 f7131a;

    /* JADX INFO: renamed from: b */
    public final C2722w1 f7132b;

    /* JADX INFO: renamed from: c */
    public final C2404f f7133c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4705l f7134d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2405g f7135e;

    /* JADX INFO: renamed from: gb.z1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC6018l1 f7136a;

        /* JADX INFO: renamed from: b */
        public final AbstractC2665g0 f7137b;

        public b(InterfaceC6018l1 interfaceC6018l1, AbstractC2665g0 abstractC2665g0) {
            interfaceC6018l1.getClass();
            abstractC2665g0.getClass();
            this.f7136a = interfaceC6018l1;
            this.f7137b = abstractC2665g0;
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC2665g0 m9674a() {
            return this.f7137b;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC6018l1 m9675b() {
            return this.f7136a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC1061t.m3842c(bVar.f7136a, this.f7136a) && AbstractC1061t.m3842c(bVar.f7137b, this.f7137b);
        }

        public int hashCode() {
            int iHashCode = this.f7136a.hashCode();
            return iHashCode + (iHashCode * 31) + this.f7137b.hashCode();
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f7136a + ", typeAttr=" + this.f7137b + ')';
        }
    }

    public C2731z1(AbstractC2661f0 abstractC2661f0, C2722w1 c2722w1) {
        abstractC2661f0.getClass();
        c2722w1.getClass();
        this.f7131a = abstractC2661f0;
        this.f7132b = c2722w1;
        C2404f c2404f = new C2404f("Type parameter upper bound erasure results");
        this.f7133c = c2404f;
        this.f7134d = AbstractC4706m.m18787a(new C2725x1(this));
        InterfaceC2405g interfaceC2405gMo8659b = c2404f.mo8659b(new C2728y1(this));
        interfaceC2405gMo8659b.getClass();
        this.f7135e = interfaceC2405gMo8659b;
    }

    /* JADX INFO: renamed from: c */
    public static final C3378i m9666c(C2731z1 c2731z1) {
        return C3381l.m12703d(EnumC3380k.f9264L0, c2731z1.toString());
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC2706r0 m9667f(C2731z1 c2731z1, b bVar) {
        return c2731z1.m9670g(bVar.m9675b(), bVar.m9674a());
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC2706r0 m9668d(AbstractC2665g0 abstractC2665g0) {
        AbstractC2706r0 abstractC2706r0M18903D;
        AbstractC2650c1 abstractC2650c1Mo6984a = abstractC2665g0.mo6984a();
        return (abstractC2650c1Mo6984a == null || (abstractC2706r0M18903D = AbstractC4734d.m18903D(abstractC2650c1Mo6984a)) == null) ? m9671h() : abstractC2706r0M18903D;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC2706r0 m9669e(InterfaceC6018l1 interfaceC6018l1, AbstractC2665g0 abstractC2665g0) {
        interfaceC6018l1.getClass();
        abstractC2665g0.getClass();
        Object objMo27m = this.f7135e.mo27m(new b(interfaceC6018l1, abstractC2665g0));
        objMo27m.getClass();
        return (AbstractC2706r0) objMo27m;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC2706r0 m9670g(InterfaceC6018l1 interfaceC6018l1, AbstractC2665g0 abstractC2665g0) {
        InterfaceC2643a2 interfaceC2643a2Mo7017a;
        Set setMo6986c = abstractC2665g0.mo6986c();
        if (setMo6986c != null && setMo6986c.contains(interfaceC6018l1.mo12664a())) {
            return m9668d(abstractC2665g0);
        }
        AbstractC2650c1 abstractC2650c1Mo7508x = interfaceC6018l1.mo7508x();
        abstractC2650c1Mo7508x.getClass();
        Set<InterfaceC6018l1> setM18917l = AbstractC4734d.m18917l(abstractC2650c1Mo7508x, setMo6986c);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2368o.m8578e(AbstractC5107t0.m20763e(AbstractC5116y.m20814z(setM18917l, 10)), 16));
        for (InterfaceC6018l1 interfaceC6018l12 : setM18917l) {
            if (setMo6986c == null || !setMo6986c.contains(interfaceC6018l12)) {
                interfaceC2643a2Mo7017a = this.f7131a.mo7017a(interfaceC6018l12, abstractC2665g0, this, m9669e(interfaceC6018l12, abstractC2665g0.mo6987d(interfaceC6018l1)));
            } else {
                interfaceC2643a2Mo7017a = AbstractC2675i2.m9472t(interfaceC6018l12, abstractC2665g0);
                interfaceC2643a2Mo7017a.getClass();
            }
            C4711r c4711rM18815a = AbstractC4717x.m18815a(interfaceC6018l12.mo5591o(), interfaceC2643a2Mo7017a);
            linkedHashMap.put(c4711rM18815a.m18795e(), c4711rM18815a.m18796f());
        }
        C2663f2 c2663f2M9384g = C2663f2.m9384g(AbstractC2719v1.a.m9647e(AbstractC2719v1.f7113c, linkedHashMap, false, 2, null));
        c2663f2M9384g.getClass();
        List upperBounds = interfaceC6018l1.getUpperBounds();
        upperBounds.getClass();
        Set setM9672i = m9672i(c2663f2M9384g, upperBounds, abstractC2665g0);
        if (setM9672i.isEmpty()) {
            return m9668d(abstractC2665g0);
        }
        if (!this.f7132b.m9652a()) {
            if (setM9672i.size() == 1) {
                return (AbstractC2706r0) AbstractC5081g0.m20536H0(setM9672i);
            }
            C9987e.m38645a("Should only be one computed upper bound if no need to intersect all bounds");
            return null;
        }
        List listM20554X0 = AbstractC5081g0.m20554X0(setM9672i);
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM20554X0, 10));
        Iterator it = listM20554X0.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC2706r0) it.next()).mo9510W0());
        }
        return AbstractC2946e.m10839a(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public final C3378i m9671h() {
        return (C3378i) this.f7134d.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final Set m9672i(C2663f2 c2663f2, List list, AbstractC2665g0 abstractC2665g0) {
        Set setM20477b = AbstractC5065a1.m20477b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2706r0 abstractC2706r0 = (AbstractC2706r0) it.next();
            InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
            if (interfaceC6004hMo5602u instanceof InterfaceC5995e) {
                setM20477b.add(f7130f.m9673a(abstractC2706r0, c2663f2, abstractC2665g0.mo6986c(), this.f7132b.m9653b()));
            } else if (interfaceC6004hMo5602u instanceof InterfaceC6018l1) {
                Set setMo6986c = abstractC2665g0.mo6986c();
                if (setMo6986c == null || !setMo6986c.contains(interfaceC6004hMo5602u)) {
                    List upperBounds = ((InterfaceC6018l1) interfaceC6004hMo5602u).getUpperBounds();
                    upperBounds.getClass();
                    setM20477b.addAll(m9672i(c2663f2, upperBounds, abstractC2665g0));
                } else {
                    setM20477b.add(m9668d(abstractC2665g0));
                }
            }
            if (!this.f7132b.m9652a()) {
                break;
            }
        }
        return AbstractC5065a1.m20476a(setM20477b);
    }

    /* JADX INFO: renamed from: gb.z1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01bf  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final gb.AbstractC2706r0 m9673a(gb.AbstractC2706r0 r16, gb.C2663f2 r17, java.util.Set r18, boolean r19) {
            /*
                Method dump skipped, instruction units count: 483
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: gb.C2731z1.a.m9673a(gb.r0, gb.f2, java.util.Set, boolean):gb.r0");
        }

        public a() {
        }
    }

    public /* synthetic */ C2731z1(AbstractC2661f0 abstractC2661f0, C2722w1 c2722w1, int i10, AbstractC1043k abstractC1043k) {
        this(abstractC2661f0, (i10 & 2) != 0 ? new C2722w1(false, false) : c2722w1);
    }
}
