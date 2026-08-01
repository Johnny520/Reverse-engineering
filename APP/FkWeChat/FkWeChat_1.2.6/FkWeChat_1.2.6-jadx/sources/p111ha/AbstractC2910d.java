package p111ha;

import gb.AbstractC2706r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import la.AbstractC4722b;
import na.C5533h;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p037cb.AbstractC1487n0;
import p037cb.EnumC1466d;
import p037cb.InterfaceC1468e;
import p082fb.InterfaceC2405g;
import p082fb.InterfaceC2412n;
import p111ha.C2905a0;
import p111ha.InterfaceC2937x;
import p143ja.C3782o;
import p173l9.C4720a;
import p186m9.C5139t;
import p213oa.C5691b;
import p213oa.C5695f;
import p229p9.InterfaceC6003g1;
import ua.C8602s;

/* JADX INFO: renamed from: ha.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2910d extends AbstractC2912e implements InterfaceC1468e {

    /* JADX INFO: renamed from: c */
    public final InterfaceC2405g f7658c;

    /* JADX INFO: renamed from: ha.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC2937x.d {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HashMap f7660b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC2937x f7661c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ HashMap f7662d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ HashMap f7663e;

        /* JADX INFO: renamed from: ha.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public final class C10091a extends b implements InterfaceC2937x.e {

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ a f7664d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10091a(a aVar, C2905a0 c2905a0) {
                super(aVar, c2905a0);
                c2905a0.getClass();
                this.f7664d = aVar;
            }

            @Override // p111ha.InterfaceC2937x.e
            /* JADX INFO: renamed from: b */
            public InterfaceC2937x.a mo10582b(int i10, C5691b c5691b, InterfaceC6003g1 interfaceC6003g1) {
                c5691b.getClass();
                interfaceC6003g1.getClass();
                C2905a0 c2905a0M10558e = C2905a0.f7654b.m10558e(m10585d(), i10);
                List arrayList = (List) this.f7664d.f7660b.get(c2905a0M10558e);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f7664d.f7660b.put(c2905a0M10558e, arrayList);
                }
                return AbstractC2910d.this.m10599y(c5691b, interfaceC6003g1, arrayList);
            }
        }

        /* JADX INFO: renamed from: ha.d$a$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class b implements InterfaceC2937x.c {

            /* JADX INFO: renamed from: a */
            public final C2905a0 f7665a;

            /* JADX INFO: renamed from: b */
            public final ArrayList f7666b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ a f7667c;

            public b(a aVar, C2905a0 c2905a0) {
                c2905a0.getClass();
                this.f7667c = aVar;
                this.f7665a = c2905a0;
                this.f7666b = new ArrayList();
            }

            @Override // p111ha.InterfaceC2937x.c
            /* JADX INFO: renamed from: a */
            public void mo10583a() {
                if (this.f7666b.isEmpty()) {
                    return;
                }
                this.f7667c.f7660b.put(this.f7665a, this.f7666b);
            }

            @Override // p111ha.InterfaceC2937x.c
            /* JADX INFO: renamed from: c */
            public InterfaceC2937x.a mo10584c(C5691b c5691b, InterfaceC6003g1 interfaceC6003g1) {
                c5691b.getClass();
                interfaceC6003g1.getClass();
                return AbstractC2910d.this.m10599y(c5691b, interfaceC6003g1, this.f7666b);
            }

            /* JADX INFO: renamed from: d */
            public final C2905a0 m10585d() {
                return this.f7665a;
            }
        }

        public a(HashMap map, InterfaceC2937x interfaceC2937x, HashMap map2, HashMap map3) {
            this.f7660b = map;
            this.f7661c = interfaceC2937x;
            this.f7662d = map2;
            this.f7663e = map3;
        }

        @Override // p111ha.InterfaceC2937x.d
        /* JADX INFO: renamed from: a */
        public InterfaceC2937x.e mo10580a(C5695f c5695f, String str) {
            c5695f.getClass();
            str.getClass();
            C2905a0.a aVar = C2905a0.f7654b;
            String strM23030c = c5695f.m23030c();
            strM23030c.getClass();
            return new C10091a(this, aVar.m10557d(strM23030c, str));
        }

        @Override // p111ha.InterfaceC2937x.d
        /* JADX INFO: renamed from: b */
        public InterfaceC2937x.c mo10581b(C5695f c5695f, String str, Object obj) {
            Object objMo10576I;
            c5695f.getClass();
            str.getClass();
            C2905a0.a aVar = C2905a0.f7654b;
            String strM23030c = c5695f.m23030c();
            strM23030c.getClass();
            C2905a0 c2905a0M10554a = aVar.m10554a(strM23030c, str);
            if (obj != null && (objMo10576I = AbstractC2910d.this.mo10576I(str, obj)) != null) {
                this.f7663e.put(c2905a0M10554a, objMo10576I);
            }
            return new b(this, c2905a0M10554a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2910d(InterfaceC2412n interfaceC2412n, InterfaceC2935v interfaceC2935v) {
        super(interfaceC2935v);
        interfaceC2412n.getClass();
        interfaceC2935v.getClass();
        this.f7658c = interfaceC2412n.mo8659b(new C2904a(this));
    }

    /* JADX INFO: renamed from: G */
    public static final Object m10570G(C2916g c2916g, C2905a0 c2905a0) {
        c2916g.getClass();
        c2905a0.getClass();
        return c2916g.m10619b().get(c2905a0);
    }

    /* JADX INFO: renamed from: K */
    public static final Object m10571K(C2916g c2916g, C2905a0 c2905a0) {
        c2916g.getClass();
        c2905a0.getClass();
        return c2916g.m10620c().get(c2905a0);
    }

    /* JADX INFO: renamed from: L */
    public static final C2916g m10572L(AbstractC2910d abstractC2910d, InterfaceC2937x interfaceC2937x) {
        interfaceC2937x.getClass();
        return abstractC2910d.m10575H(interfaceC2937x);
    }

    @Override // p111ha.AbstractC2912e
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C2916g mo10579q(InterfaceC2937x interfaceC2937x) {
        interfaceC2937x.getClass();
        return (C2916g) this.f7658c.mo27m(interfaceC2937x);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m10574F(C5691b c5691b, Map map) {
        c5691b.getClass();
        map.getClass();
        if (!AbstractC1061t.m3842c(c5691b, C4720a.f13947a.m18840a())) {
            return false;
        }
        Object obj = map.get(C5695f.m23027j("value"));
        C8602s c8602s = obj instanceof C8602s ? (C8602s) obj : null;
        if (c8602s == null) {
            return false;
        }
        Object objMo33009b = c8602s.mo33009b();
        C8602s.b.C10245b c10245b = objMo33009b instanceof C8602s.b.C10245b ? (C8602s.b.C10245b) objMo33009b : null;
        if (c10245b == null) {
            return false;
        }
        return m10597w(c10245b.m33043b());
    }

    /* JADX INFO: renamed from: H */
    public final C2916g m10575H(InterfaceC2937x interfaceC2937x) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        interfaceC2937x.mo10734c(new a(map, interfaceC2937x, map3, map2), m10593r(interfaceC2937x));
        return new C2916g(map, map2, map3);
    }

    /* JADX INFO: renamed from: I */
    public abstract Object mo10576I(String str, Object obj);

    /* JADX INFO: renamed from: J */
    public final Object m10577J(AbstractC1487n0 abstractC1487n0, C3782o c3782o, EnumC1466d enumC1466d, AbstractC2706r0 abstractC2706r0, InterfaceC0188p interfaceC0188p) {
        Object objInvoke;
        InterfaceC2937x interfaceC2937xM10592p = m10592p(abstractC1487n0, AbstractC2912e.f7669b.m10602a(abstractC1487n0, true, true, AbstractC4722b.f13958B.mo18852d(c3782o.m14649e0()), C5533h.m22544f(c3782o), m10595u(), mo10596v()));
        if (interfaceC2937xM10592p == null) {
            return null;
        }
        C2905a0 c2905a0M10594s = m10594s(c3782o, abstractC1487n0.m5846b(), abstractC1487n0.m5848d(), enumC1466d, interfaceC2937xM10592p.mo10733b().m12593d().m18846d(C2927n.f7735b.m10688a()));
        if (c2905a0M10594s == null || (objInvoke = interfaceC0188p.invoke(this.f7658c.mo27m(interfaceC2937xM10592p), c2905a0M10594s)) == null) {
            return null;
        }
        return C5139t.m20981d(abstractC2706r0) ? mo10578M(objInvoke) : objInvoke;
    }

    /* JADX INFO: renamed from: M */
    public abstract Object mo10578M(Object obj);

    @Override // p037cb.InterfaceC1468e
    /* JADX INFO: renamed from: c */
    public Object mo5762c(AbstractC1487n0 abstractC1487n0, C3782o c3782o, AbstractC2706r0 abstractC2706r0) {
        abstractC1487n0.getClass();
        c3782o.getClass();
        abstractC2706r0.getClass();
        return m10577J(abstractC1487n0, c3782o, EnumC1466d.PROPERTY, abstractC2706r0, C2908c.f7657q);
    }

    @Override // p037cb.InterfaceC1468e
    /* JADX INFO: renamed from: j */
    public Object mo5763j(AbstractC1487n0 abstractC1487n0, C3782o c3782o, AbstractC2706r0 abstractC2706r0) {
        abstractC1487n0.getClass();
        c3782o.getClass();
        abstractC2706r0.getClass();
        return m10577J(abstractC1487n0, c3782o, EnumC1466d.PROPERTY_GETTER, abstractC2706r0, C2906b.f7656q);
    }
}
