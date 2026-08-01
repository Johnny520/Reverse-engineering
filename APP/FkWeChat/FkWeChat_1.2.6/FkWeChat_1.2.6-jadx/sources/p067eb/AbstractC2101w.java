package p067eb;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p024b9.C1038h0;
import p037cb.AbstractC1483l0;
import p037cb.C1490p;
import p080f9.AbstractC2368o;
import p082fb.AbstractC2411m;
import p082fb.InterfaceC2405g;
import p082fb.InterfaceC2406h;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2408j;
import p098g9.InterfaceC2557k;
import p143ja.C3777j;
import p143ja.C3782o;
import p143ja.C3786s;
import p172l8.C4700i0;
import p185m8.AbstractC5067b0;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5071c1;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p213oa.C5691b;
import p213oa.C5695f;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6000f1;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6015k1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6055y0;
import p244qb.AbstractC6370a;
import p342x9.InterfaceC9468b;
import qa.AbstractC6344a;
import qa.InterfaceC6360q;
import qa.InterfaceC6362s;
import sa.C7262l;
import za.AbstractC9914l;
import za.C9906d;

/* JADX INFO: renamed from: eb.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2101w extends AbstractC9914l {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC2557k[] f5869f = {AbstractC1052o0.m3814i(new C1038h0(AbstractC2101w.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0)), AbstractC1052o0.m3814i(new C1038h0(AbstractC2101w.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0))};

    /* JADX INFO: renamed from: b */
    public final C1490p f5870b;

    /* JADX INFO: renamed from: c */
    public final a f5871c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2407i f5872d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2408j f5873e;

    /* JADX INFO: renamed from: eb.w$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: a */
        Collection mo7526a(C5695f c5695f, InterfaceC9468b interfaceC9468b);

        /* JADX INFO: renamed from: b */
        Set mo7527b();

        /* JADX INFO: renamed from: c */
        Collection mo7528c(C5695f c5695f, InterfaceC9468b interfaceC9468b);

        /* JADX INFO: renamed from: d */
        Set mo7529d();

        /* JADX INFO: renamed from: e */
        void mo7530e(Collection collection, C9906d c9906d, InterfaceC0184l interfaceC0184l, InterfaceC9468b interfaceC9468b);

        /* JADX INFO: renamed from: f */
        InterfaceC6015k1 mo7531f(C5695f c5695f);

        /* JADX INFO: renamed from: g */
        Set mo7532g();
    }

    /* JADX INFO: renamed from: eb.w$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class b implements a {

        /* JADX INFO: renamed from: o */
        public static final /* synthetic */ InterfaceC2557k[] f5874o = {AbstractC1052o0.m3814i(new C1038h0(b.class, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0)), AbstractC1052o0.m3814i(new C1038h0(b.class, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0)), AbstractC1052o0.m3814i(new C1038h0(b.class, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0)), AbstractC1052o0.m3814i(new C1038h0(b.class, "allFunctions", "getAllFunctions()Ljava/util/List;", 0)), AbstractC1052o0.m3814i(new C1038h0(b.class, "allProperties", "getAllProperties()Ljava/util/List;", 0)), AbstractC1052o0.m3814i(new C1038h0(b.class, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0)), AbstractC1052o0.m3814i(new C1038h0(b.class, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0)), AbstractC1052o0.m3814i(new C1038h0(b.class, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0)), AbstractC1052o0.m3814i(new C1038h0(b.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), AbstractC1052o0.m3814i(new C1038h0(b.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};

        /* JADX INFO: renamed from: a */
        public final List f5875a;

        /* JADX INFO: renamed from: b */
        public final List f5876b;

        /* JADX INFO: renamed from: c */
        public final List f5877c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC2407i f5878d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC2407i f5879e;

        /* JADX INFO: renamed from: f */
        public final InterfaceC2407i f5880f;

        /* JADX INFO: renamed from: g */
        public final InterfaceC2407i f5881g;

        /* JADX INFO: renamed from: h */
        public final InterfaceC2407i f5882h;

        /* JADX INFO: renamed from: i */
        public final InterfaceC2407i f5883i;

        /* JADX INFO: renamed from: j */
        public final InterfaceC2407i f5884j;

        /* JADX INFO: renamed from: k */
        public final InterfaceC2407i f5885k;

        /* JADX INFO: renamed from: l */
        public final InterfaceC2407i f5886l;

        /* JADX INFO: renamed from: m */
        public final InterfaceC2407i f5887m;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ AbstractC2101w f5888n;

        public b(AbstractC2101w abstractC2101w, List list, List list2, List list3) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.f5888n = abstractC2101w;
            this.f5875a = list;
            this.f5876b = list2;
            this.f5877c = abstractC2101w.m7522s().m5867c().m5829g().mo5859f() ? list3 : AbstractC5114x.m20800o();
            this.f5878d = abstractC2101w.m7522s().m5872h().mo8663f(new C2102x(this));
            this.f5879e = abstractC2101w.m7522s().m5872h().mo8663f(new C2103y(this));
            this.f5880f = abstractC2101w.m7522s().m5872h().mo8663f(new C2104z(this));
            this.f5881g = abstractC2101w.m7522s().m5872h().mo8663f(new C2061a0(this));
            this.f5882h = abstractC2101w.m7522s().m5872h().mo8663f(new C2063b0(this));
            this.f5883i = abstractC2101w.m7522s().m5872h().mo8663f(new C2065c0(this));
            this.f5884j = abstractC2101w.m7522s().m5872h().mo8663f(new C2067d0(this));
            this.f5885k = abstractC2101w.m7522s().m5872h().mo8663f(new C2069e0(this));
            this.f5886l = abstractC2101w.m7522s().m5872h().mo8663f(new C2071f0(this, abstractC2101w));
            this.f5887m = abstractC2101w.m7522s().m5872h().mo8663f(new C2073g0(this, abstractC2101w));
        }

        /* JADX INFO: renamed from: B */
        public static final List m7533B(b bVar) {
            return bVar.m7564w();
        }

        /* JADX INFO: renamed from: C */
        public static final List m7534C(b bVar) {
            return bVar.m7567z();
        }

        /* JADX INFO: renamed from: D */
        public static final Set m7535D(b bVar, AbstractC2101w abstractC2101w) {
            List list = bVar.f5875a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC2101w abstractC2101w2 = bVar.f5888n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(AbstractC1483l0.m5819b(abstractC2101w2.m7522s().m5871g(), ((C3777j) ((InterfaceC6360q) it.next())).m14483h0()));
            }
            return AbstractC5071c1.m20503l(linkedHashSet, abstractC2101w.mo7473w());
        }

        /* JADX INFO: renamed from: E */
        public static final Map m7536E(b bVar) {
            List listM7554F = bVar.m7554F();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listM7554F) {
                C5695f name = ((InterfaceC6000f1) obj).getName();
                name.getClass();
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: renamed from: N */
        public static final Map m7537N(b bVar) {
            List listM7555G = bVar.m7555G();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listM7555G) {
                C5695f name = ((InterfaceC6055y0) obj).getName();
                name.getClass();
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: renamed from: O */
        public static final Map m7538O(b bVar) {
            List listM7556H = bVar.m7556H();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2368o.m8578e(AbstractC5107t0.m20763e(AbstractC5116y.m20814z(listM7556H, 10)), 16));
            for (Object obj : listM7556H) {
                C5695f name = ((InterfaceC6015k1) obj).getName();
                name.getClass();
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: renamed from: P */
        public static final Set m7539P(b bVar, AbstractC2101w abstractC2101w) {
            List list = bVar.f5876b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC2101w abstractC2101w2 = bVar.f5888n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(AbstractC1483l0.m5819b(abstractC2101w2.m7522s().m5871g(), ((C3782o) ((InterfaceC6360q) it.next())).m14651g0()));
            }
            return AbstractC5071c1.m20503l(linkedHashSet, abstractC2101w.mo7474x());
        }

        /* JADX INFO: renamed from: r */
        public static final List m7550r(b bVar) {
            return AbstractC5081g0.m20533E0(bVar.m7557I(), bVar.m7562u());
        }

        /* JADX INFO: renamed from: s */
        public static final List m7551s(b bVar) {
            return AbstractC5081g0.m20533E0(bVar.m7558J(), bVar.m7563v());
        }

        /* JADX INFO: renamed from: t */
        public static final List m7552t(b bVar) {
            return bVar.m7553A();
        }

        /* JADX INFO: renamed from: A */
        public final List m7553A() {
            List list = this.f5877c;
            AbstractC2101w abstractC2101w = this.f5888n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC6015k1 interfaceC6015k1M5808z = abstractC2101w.m7522s().m5870f().m5808z((C3786s) ((InterfaceC6360q) it.next()));
                if (interfaceC6015k1M5808z != null) {
                    arrayList.add(interfaceC6015k1M5808z);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: F */
        public final List m7554F() {
            return (List) AbstractC2411m.m8702a(this.f5881g, this, f5874o[3]);
        }

        /* JADX INFO: renamed from: G */
        public final List m7555G() {
            return (List) AbstractC2411m.m8702a(this.f5882h, this, f5874o[4]);
        }

        /* JADX INFO: renamed from: H */
        public final List m7556H() {
            return (List) AbstractC2411m.m8702a(this.f5880f, this, f5874o[2]);
        }

        /* JADX INFO: renamed from: I */
        public final List m7557I() {
            return (List) AbstractC2411m.m8702a(this.f5878d, this, f5874o[0]);
        }

        /* JADX INFO: renamed from: J */
        public final List m7558J() {
            return (List) AbstractC2411m.m8702a(this.f5879e, this, f5874o[1]);
        }

        /* JADX INFO: renamed from: K */
        public final Map m7559K() {
            return (Map) AbstractC2411m.m8702a(this.f5884j, this, f5874o[6]);
        }

        /* JADX INFO: renamed from: L */
        public final Map m7560L() {
            return (Map) AbstractC2411m.m8702a(this.f5885k, this, f5874o[7]);
        }

        /* JADX INFO: renamed from: M */
        public final Map m7561M() {
            return (Map) AbstractC2411m.m8702a(this.f5883i, this, f5874o[5]);
        }

        @Override // p067eb.AbstractC2101w.a
        /* JADX INFO: renamed from: a */
        public Collection mo7526a(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
            c5695f.getClass();
            interfaceC9468b.getClass();
            if (!mo7527b().contains(c5695f)) {
                return AbstractC5114x.m20800o();
            }
            Collection collection = (Collection) m7559K().get(c5695f);
            return collection == null ? AbstractC5114x.m20800o() : collection;
        }

        @Override // p067eb.AbstractC2101w.a
        /* JADX INFO: renamed from: b */
        public Set mo7527b() {
            return (Set) AbstractC2411m.m8702a(this.f5886l, this, f5874o[8]);
        }

        @Override // p067eb.AbstractC2101w.a
        /* JADX INFO: renamed from: c */
        public Collection mo7528c(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
            c5695f.getClass();
            interfaceC9468b.getClass();
            if (!mo7529d().contains(c5695f)) {
                return AbstractC5114x.m20800o();
            }
            Collection collection = (Collection) m7560L().get(c5695f);
            return collection == null ? AbstractC5114x.m20800o() : collection;
        }

        @Override // p067eb.AbstractC2101w.a
        /* JADX INFO: renamed from: d */
        public Set mo7529d() {
            return (Set) AbstractC2411m.m8702a(this.f5887m, this, f5874o[9]);
        }

        @Override // p067eb.AbstractC2101w.a
        /* JADX INFO: renamed from: e */
        public void mo7530e(Collection collection, C9906d c9906d, InterfaceC0184l interfaceC0184l, InterfaceC9468b interfaceC9468b) {
            collection.getClass();
            c9906d.getClass();
            interfaceC0184l.getClass();
            interfaceC9468b.getClass();
            if (c9906d.m38433a(C9906d.f33395c.m38445i())) {
                for (Object obj : m7555G()) {
                    C5695f name = ((InterfaceC6055y0) obj).getName();
                    name.getClass();
                    if (((Boolean) interfaceC0184l.mo27m(name)).booleanValue()) {
                        collection.add(obj);
                    }
                }
            }
            if (c9906d.m38433a(C9906d.f33395c.m38440d())) {
                for (Object obj2 : m7554F()) {
                    C5695f name2 = ((InterfaceC6000f1) obj2).getName();
                    name2.getClass();
                    if (((Boolean) interfaceC0184l.mo27m(name2)).booleanValue()) {
                        collection.add(obj2);
                    }
                }
            }
        }

        @Override // p067eb.AbstractC2101w.a
        /* JADX INFO: renamed from: f */
        public InterfaceC6015k1 mo7531f(C5695f c5695f) {
            c5695f.getClass();
            return (InterfaceC6015k1) m7561M().get(c5695f);
        }

        @Override // p067eb.AbstractC2101w.a
        /* JADX INFO: renamed from: g */
        public Set mo7532g() {
            List list = this.f5877c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC2101w abstractC2101w = this.f5888n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(AbstractC1483l0.m5819b(abstractC2101w.m7522s().m5871g(), ((C3786s) ((InterfaceC6360q) it.next())).m14905a0()));
            }
            return linkedHashSet;
        }

        /* JADX INFO: renamed from: u */
        public final List m7562u() {
            Set setMo7473w = this.f5888n.mo7473w();
            ArrayList arrayList = new ArrayList();
            Iterator it = setMo7473w.iterator();
            while (it.hasNext()) {
                AbstractC5070c0.m20492E(arrayList, m7565x((C5695f) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: v */
        public final List m7563v() {
            Set setMo7474x = this.f5888n.mo7474x();
            ArrayList arrayList = new ArrayList();
            Iterator it = setMo7474x.iterator();
            while (it.hasNext()) {
                AbstractC5070c0.m20492E(arrayList, m7566y((C5695f) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: w */
        public final List m7564w() {
            List list = this.f5875a;
            AbstractC2101w abstractC2101w = this.f5888n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC6000f1 interfaceC6000f1M5805s = abstractC2101w.m7522s().m5870f().m5805s((C3777j) ((InterfaceC6360q) it.next()));
                if (!abstractC2101w.mo7464A(interfaceC6000f1M5805s)) {
                    interfaceC6000f1M5805s = null;
                }
                if (interfaceC6000f1M5805s != null) {
                    arrayList.add(interfaceC6000f1M5805s);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: x */
        public final List m7565x(C5695f c5695f) {
            List listM7557I = m7557I();
            AbstractC2101w abstractC2101w = this.f5888n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM7557I) {
                if (AbstractC1061t.m3842c(((InterfaceC6019m) obj).getName(), c5695f)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC2101w.mo7469n(c5695f, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: renamed from: y */
        public final List m7566y(C5695f c5695f) {
            List listM7558J = m7558J();
            AbstractC2101w abstractC2101w = this.f5888n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM7558J) {
                if (AbstractC1061t.m3842c(((InterfaceC6019m) obj).getName(), c5695f)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC2101w.mo7470o(c5695f, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: renamed from: z */
        public final List m7567z() {
            List list = this.f5876b;
            AbstractC2101w abstractC2101w = this.f5888n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC6055y0 interfaceC6055y0M5807u = abstractC2101w.m7522s().m5870f().m5807u((C3782o) ((InterfaceC6360q) it.next()));
                if (interfaceC6055y0M5807u != null) {
                    arrayList.add(interfaceC6055y0M5807u);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: eb.w$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class c implements a {

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ InterfaceC2557k[] f5889j = {AbstractC1052o0.m3814i(new C1038h0(c.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), AbstractC1052o0.m3814i(new C1038h0(c.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};

        /* JADX INFO: renamed from: a */
        public final Map f5890a;

        /* JADX INFO: renamed from: b */
        public final Map f5891b;

        /* JADX INFO: renamed from: c */
        public final Map f5892c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC2405g f5893d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC2405g f5894e;

        /* JADX INFO: renamed from: f */
        public final InterfaceC2406h f5895f;

        /* JADX INFO: renamed from: g */
        public final InterfaceC2407i f5896g;

        /* JADX INFO: renamed from: h */
        public final InterfaceC2407i f5897h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ AbstractC2101w f5898i;

        /* JADX INFO: renamed from: eb.w$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a implements InterfaceC0173a {

            /* JADX INFO: renamed from: q */
            public final /* synthetic */ InterfaceC6362s f5899q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ ByteArrayInputStream f5900r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ AbstractC2101w f5901s;

            public a(InterfaceC6362s interfaceC6362s, ByteArrayInputStream byteArrayInputStream, AbstractC2101w abstractC2101w) {
                this.f5899q = interfaceC6362s;
                this.f5900r = byteArrayInputStream;
                this.f5901s = abstractC2101w;
            }

            @Override // p010a9.InterfaceC0173a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC6360q invoke() {
                return (InterfaceC6360q) this.f5899q.mo25022b(this.f5900r, this.f5901s.m7522s().m5867c().m5833k());
            }
        }

        public c(AbstractC2101w abstractC2101w, List list, List list2, List list3) throws IOException {
            Map mapM20768i;
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.f5898i = abstractC2101w;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                C5695f c5695fM5819b = AbstractC1483l0.m5819b(abstractC2101w.m7522s().m5871g(), ((C3777j) ((InterfaceC6360q) obj)).m14483h0());
                Object arrayList = linkedHashMap.get(c5695fM5819b);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(c5695fM5819b, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f5890a = m7581r(linkedHashMap);
            AbstractC2101w abstractC2101w2 = this.f5898i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : list2) {
                C5695f c5695fM5819b2 = AbstractC1483l0.m5819b(abstractC2101w2.m7522s().m5871g(), ((C3782o) ((InterfaceC6360q) obj2)).m14651g0());
                Object arrayList2 = linkedHashMap2.get(c5695fM5819b2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(c5695fM5819b2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f5891b = m7581r(linkedHashMap2);
            if (this.f5898i.m7522s().m5867c().m5829g().mo5859f()) {
                AbstractC2101w abstractC2101w3 = this.f5898i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : list3) {
                    C5695f c5695fM5819b3 = AbstractC1483l0.m5819b(abstractC2101w3.m7522s().m5871g(), ((C3786s) ((InterfaceC6360q) obj3)).m14905a0());
                    Object arrayList3 = linkedHashMap3.get(c5695fM5819b3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(c5695fM5819b3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapM20768i = m7581r(linkedHashMap3);
            } else {
                mapM20768i = AbstractC5109u0.m20768i();
            }
            this.f5892c = mapM20768i;
            this.f5893d = this.f5898i.m7522s().m5872h().mo8659b(new C2075h0(this));
            this.f5894e = this.f5898i.m7522s().m5872h().mo8659b(new C2077i0(this));
            this.f5895f = this.f5898i.m7522s().m5872h().mo8665h(new C2079j0(this));
            this.f5896g = this.f5898i.m7522s().m5872h().mo8663f(new C2081k0(this, this.f5898i));
            this.f5897h = this.f5898i.m7522s().m5872h().mo8663f(new C2083l0(this, this.f5898i));
        }

        /* JADX INFO: renamed from: p */
        public static final Set m7573p(c cVar, AbstractC2101w abstractC2101w) {
            return AbstractC5071c1.m20503l(cVar.f5890a.keySet(), abstractC2101w.mo7473w());
        }

        /* JADX INFO: renamed from: q */
        public static final Collection m7574q(c cVar, C5695f c5695f) {
            c5695f.getClass();
            return cVar.m7578m(c5695f);
        }

        /* JADX INFO: renamed from: s */
        public static final Collection m7575s(c cVar, C5695f c5695f) {
            c5695f.getClass();
            return cVar.m7579n(c5695f);
        }

        /* JADX INFO: renamed from: t */
        public static final InterfaceC6015k1 m7576t(c cVar, C5695f c5695f) {
            c5695f.getClass();
            return cVar.m7580o(c5695f);
        }

        /* JADX INFO: renamed from: u */
        public static final Set m7577u(c cVar, AbstractC2101w abstractC2101w) {
            return AbstractC5071c1.m20503l(cVar.f5891b.keySet(), abstractC2101w.mo7474x());
        }

        @Override // p067eb.AbstractC2101w.a
        /* JADX INFO: renamed from: a */
        public Collection mo7526a(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
            c5695f.getClass();
            interfaceC9468b.getClass();
            return !mo7527b().contains(c5695f) ? AbstractC5114x.m20800o() : (Collection) this.f5893d.mo27m(c5695f);
        }

        @Override // p067eb.AbstractC2101w.a
        /* JADX INFO: renamed from: b */
        public Set mo7527b() {
            return (Set) AbstractC2411m.m8702a(this.f5896g, this, f5889j[0]);
        }

        @Override // p067eb.AbstractC2101w.a
        /* JADX INFO: renamed from: c */
        public Collection mo7528c(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
            c5695f.getClass();
            interfaceC9468b.getClass();
            return !mo7529d().contains(c5695f) ? AbstractC5114x.m20800o() : (Collection) this.f5894e.mo27m(c5695f);
        }

        @Override // p067eb.AbstractC2101w.a
        /* JADX INFO: renamed from: d */
        public Set mo7529d() {
            return (Set) AbstractC2411m.m8702a(this.f5897h, this, f5889j[1]);
        }

        @Override // p067eb.AbstractC2101w.a
        /* JADX INFO: renamed from: e */
        public void mo7530e(Collection collection, C9906d c9906d, InterfaceC0184l interfaceC0184l, InterfaceC9468b interfaceC9468b) {
            collection.getClass();
            c9906d.getClass();
            interfaceC0184l.getClass();
            interfaceC9468b.getClass();
            if (c9906d.m38433a(C9906d.f33395c.m38445i())) {
                Set<C5695f> setMo7529d = mo7529d();
                ArrayList arrayList = new ArrayList();
                for (C5695f c5695f : setMo7529d) {
                    if (((Boolean) interfaceC0184l.mo27m(c5695f)).booleanValue()) {
                        arrayList.addAll(mo7528c(c5695f, interfaceC9468b));
                    }
                }
                C7262l c7262l = C7262l.f24141a;
                c7262l.getClass();
                AbstractC5067b0.m20482D(arrayList, c7262l);
                collection.addAll(arrayList);
            }
            if (c9906d.m38433a(C9906d.f33395c.m38440d())) {
                Set<C5695f> setMo7527b = mo7527b();
                ArrayList arrayList2 = new ArrayList();
                for (C5695f c5695f2 : setMo7527b) {
                    if (((Boolean) interfaceC0184l.mo27m(c5695f2)).booleanValue()) {
                        arrayList2.addAll(mo7526a(c5695f2, interfaceC9468b));
                    }
                }
                C7262l c7262l2 = C7262l.f24141a;
                c7262l2.getClass();
                AbstractC5067b0.m20482D(arrayList2, c7262l2);
                collection.addAll(arrayList2);
            }
        }

        @Override // p067eb.AbstractC2101w.a
        /* JADX INFO: renamed from: f */
        public InterfaceC6015k1 mo7531f(C5695f c5695f) {
            c5695f.getClass();
            return (InterfaceC6015k1) this.f5895f.mo27m(c5695f);
        }

        @Override // p067eb.AbstractC2101w.a
        /* JADX INFO: renamed from: g */
        public Set mo7532g() {
            return this.f5892c.keySet();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
        /* JADX INFO: renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Collection m7578m(p213oa.C5695f r6) {
            /*
                r5 = this;
                java.util.Map r0 = r5.f5890a
                qa.s r1 = p143ja.C3777j.f10624N
                r1.getClass()
                eb.w r2 = r5.f5898i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L28
                eb.w r3 = r5.f5898i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                eb.w$c$a r0 = new eb.w$c$a
                r0.<init>(r1, r4, r3)
                sb.h r0 = sb.AbstractC7291q.m28886n(r0)
                java.util.List r0 = sb.AbstractC7294t.m28908P(r0)
                if (r0 == 0) goto L28
                goto L2c
            L28:
                java.util.List r0 = p185m8.AbstractC5114x.m20800o()
            L2c:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L39:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L62
                java.lang.Object r3 = r0.next()
                ja.j r3 = (p143ja.C3777j) r3
                cb.p r4 = r2.m7522s()
                cb.k0 r4 = r4.m5870f()
                r3.getClass()
                p9.f1 r3 = r4.m5805s(r3)
                boolean r4 = r2.mo7464A(r3)
                if (r4 == 0) goto L5b
                goto L5c
            L5b:
                r3 = 0
            L5c:
                if (r3 == 0) goto L39
                r1.add(r3)
                goto L39
            L62:
                r2.mo7469n(r6, r1)
                java.util.List r6 = p244qb.AbstractC6370a.m25341c(r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p067eb.AbstractC2101w.c.m7578m(oa.f):java.util.Collection");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
        /* JADX INFO: renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Collection m7579n(p213oa.C5695f r6) {
            /*
                r5 = this;
                java.util.Map r0 = r5.f5891b
                qa.s r1 = p143ja.C3782o.f10708N
                r1.getClass()
                eb.w r2 = r5.f5898i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L28
                eb.w r3 = r5.f5898i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                eb.w$c$a r0 = new eb.w$c$a
                r0.<init>(r1, r4, r3)
                sb.h r0 = sb.AbstractC7291q.m28886n(r0)
                java.util.List r0 = sb.AbstractC7294t.m28908P(r0)
                if (r0 == 0) goto L28
                goto L2c
            L28:
                java.util.List r0 = p185m8.AbstractC5114x.m20800o()
            L2c:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L39:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L5a
                java.lang.Object r3 = r0.next()
                ja.o r3 = (p143ja.C3782o) r3
                cb.p r4 = r2.m7522s()
                cb.k0 r4 = r4.m5870f()
                r3.getClass()
                p9.y0 r3 = r4.m5807u(r3)
                if (r3 == 0) goto L39
                r1.add(r3)
                goto L39
            L5a:
                r2.mo7470o(r6, r1)
                java.util.List r6 = p244qb.AbstractC6370a.m25341c(r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p067eb.AbstractC2101w.c.m7579n(oa.f):java.util.Collection");
        }

        /* JADX INFO: renamed from: o */
        public final InterfaceC6015k1 m7580o(C5695f c5695f) {
            C3786s c3786sM14895r0;
            byte[] bArr = (byte[]) this.f5892c.get(c5695f);
            if (bArr == null || (c3786sM14895r0 = C3786s.m14895r0(new ByteArrayInputStream(bArr), this.f5898i.m7522s().m5867c().m5833k())) == null) {
                return null;
            }
            return this.f5898i.m7522s().m5870f().m5808z(c3786sM14895r0);
        }

        /* JADX INFO: renamed from: r */
        public final Map m7581r(Map map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5107t0.m20763e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((AbstractC6344a) it.next()).m25019i(byteArrayOutputStream);
                    arrayList.add(C4700i0.f13910a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }
    }

    public AbstractC2101w(C1490p c1490p, List list, List list2, List list3, InterfaceC0173a interfaceC0173a) {
        c1490p.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        interfaceC0173a.getClass();
        this.f5870b = c1490p;
        this.f5871c = m7520q(list, list2, list3);
        this.f5872d = c1490p.m5872h().mo8663f(new C2099u(interfaceC0173a));
        this.f5873e = c1490p.m5872h().mo8662e(new C2100v(this));
    }

    /* JADX INFO: renamed from: k */
    public static final Set m7517k(InterfaceC0173a interfaceC0173a) {
        return AbstractC5081g0.m20564c1((Iterable) interfaceC0173a.invoke());
    }

    /* JADX INFO: renamed from: l */
    public static final Set m7518l(AbstractC2101w abstractC2101w) {
        Set setMo7472v = abstractC2101w.mo7472v();
        if (setMo7472v == null) {
            return null;
        }
        return AbstractC5071c1.m20503l(AbstractC5071c1.m20503l(abstractC2101w.m7523t(), abstractC2101w.f5871c.mo7532g()), setMo7472v);
    }

    /* JADX INFO: renamed from: A */
    public boolean mo7464A(InterfaceC6000f1 interfaceC6000f1) {
        interfaceC6000f1.getClass();
        return true;
    }

    @Override // za.AbstractC9914l, za.InterfaceC9913k
    /* JADX INFO: renamed from: a */
    public Collection mo5513a(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        return this.f5871c.mo7526a(c5695f, interfaceC9468b);
    }

    @Override // za.AbstractC9914l, za.InterfaceC9913k
    /* JADX INFO: renamed from: b */
    public Set mo5514b() {
        return this.f5871c.mo7527b();
    }

    @Override // za.AbstractC9914l, za.InterfaceC9913k
    /* JADX INFO: renamed from: c */
    public Collection mo5515c(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        return this.f5871c.mo7528c(c5695f, interfaceC9468b);
    }

    @Override // za.AbstractC9914l, za.InterfaceC9913k
    /* JADX INFO: renamed from: d */
    public Set mo5516d() {
        return this.f5871c.mo7529d();
    }

    @Override // za.AbstractC9914l, za.InterfaceC9913k
    /* JADX INFO: renamed from: e */
    public Set mo5517e() {
        return m7524u();
    }

    @Override // za.AbstractC9914l, za.InterfaceC9916n
    /* JADX INFO: renamed from: f */
    public InterfaceC6004h mo5518f(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        if (mo7494z(c5695f)) {
            return m7521r(c5695f);
        }
        if (this.f5871c.mo7532g().contains(c5695f)) {
            return m7525y(c5695f);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo7468j(Collection collection, InterfaceC0184l interfaceC0184l);

    /* JADX INFO: renamed from: m */
    public final Collection m7519m(C9906d c9906d, InterfaceC0184l interfaceC0184l, InterfaceC9468b interfaceC9468b) {
        c9906d.getClass();
        interfaceC0184l.getClass();
        interfaceC9468b.getClass();
        ArrayList arrayList = new ArrayList(0);
        C9906d.a aVar = C9906d.f33395c;
        if (c9906d.m38433a(aVar.m38443g())) {
            mo7468j(arrayList, interfaceC0184l);
        }
        this.f5871c.mo7530e(arrayList, c9906d, interfaceC0184l, interfaceC9468b);
        if (c9906d.m38433a(aVar.m38439c())) {
            for (C5695f c5695f : m7523t()) {
                if (((Boolean) interfaceC0184l.mo27m(c5695f)).booleanValue()) {
                    AbstractC6370a.m25339a(arrayList, m7521r(c5695f));
                }
            }
        }
        if (c9906d.m38433a(C9906d.f33395c.m38444h())) {
            for (C5695f c5695f2 : this.f5871c.mo7532g()) {
                if (((Boolean) interfaceC0184l.mo27m(c5695f2)).booleanValue()) {
                    AbstractC6370a.m25339a(arrayList, this.f5871c.mo7531f(c5695f2));
                }
            }
        }
        return AbstractC6370a.m25341c(arrayList);
    }

    /* JADX INFO: renamed from: n */
    public void mo7469n(C5695f c5695f, List list) {
        c5695f.getClass();
        list.getClass();
    }

    /* JADX INFO: renamed from: o */
    public void mo7470o(C5695f c5695f, List list) {
        c5695f.getClass();
        list.getClass();
    }

    /* JADX INFO: renamed from: p */
    public abstract C5691b mo7471p(C5695f c5695f);

    /* JADX INFO: renamed from: q */
    public final a m7520q(List list, List list2, List list3) {
        return this.f5870b.m5867c().m5829g().mo5854a() ? new b(this, list, list2, list3) : new c(this, list, list2, list3);
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC5995e m7521r(C5695f c5695f) {
        return this.f5870b.m5867c().m5824b(mo7471p(c5695f));
    }

    /* JADX INFO: renamed from: s */
    public final C1490p m7522s() {
        return this.f5870b;
    }

    /* JADX INFO: renamed from: t */
    public final Set m7523t() {
        return (Set) AbstractC2411m.m8702a(this.f5872d, this, f5869f[0]);
    }

    /* JADX INFO: renamed from: u */
    public final Set m7524u() {
        return (Set) AbstractC2411m.m8703b(this.f5873e, this, f5869f[1]);
    }

    /* JADX INFO: renamed from: v */
    public abstract Set mo7472v();

    /* JADX INFO: renamed from: w */
    public abstract Set mo7473w();

    /* JADX INFO: renamed from: x */
    public abstract Set mo7474x();

    /* JADX INFO: renamed from: y */
    public final InterfaceC6015k1 m7525y(C5695f c5695f) {
        return this.f5871c.mo7531f(c5695f);
    }

    /* JADX INFO: renamed from: z */
    public boolean mo7494z(C5695f c5695f) {
        c5695f.getClass();
        return m7523t().contains(c5695f);
    }
}
