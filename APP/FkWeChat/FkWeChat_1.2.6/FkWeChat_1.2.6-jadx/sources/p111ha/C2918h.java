package p111ha;

import gb.AbstractC2706r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import la.C4723c;
import la.InterfaceC4724d;
import p024b9.AbstractC1061t;
import p037cb.C1472g;
import p082fb.InterfaceC2412n;
import p111ha.InterfaceC2937x;
import p143ja.C3769b;
import p185m8.AbstractC5081g0;
import p213oa.C5691b;
import p213oa.C5695f;
import p229p9.AbstractC6054y;
import p229p9.C6020m0;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6005h0;
import p229p9.InterfaceC6039s1;
import p243q9.C6329d;
import p243q9.InterfaceC6328c;
import p244qb.AbstractC6370a;
import p299ub.AbstractC8621f0;
import p373z9.AbstractC9888a;
import ua.AbstractC8590g;
import ua.AbstractC8595l;
import ua.C8579a;
import ua.C8580a0;
import ua.C8582b0;
import ua.C8584c0;
import ua.C8585d;
import ua.C8586d0;
import ua.C8589f;
import ua.C8592i;
import ua.C8594k;
import ua.C8597n;
import ua.C8602s;
import ua.C8603t;
import ua.C8606w;

/* JADX INFO: renamed from: ha.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2918h extends AbstractC2910d {

    /* JADX INFO: renamed from: d */
    public final InterfaceC6005h0 f7684d;

    /* JADX INFO: renamed from: e */
    public final C6020m0 f7685e;

    /* JADX INFO: renamed from: f */
    public final C1472g f7686f;

    /* JADX INFO: renamed from: g */
    public C4723c f7687g;

    /* JADX INFO: renamed from: ha.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public abstract class a implements InterfaceC2937x.a {

        /* JADX INFO: renamed from: ha.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10092a implements InterfaceC2937x.a {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC2937x.a f7689a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC2937x.a f7690b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ a f7691c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ C5695f f7692d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ArrayList f7693e;

            public C10092a(InterfaceC2937x.a aVar, a aVar2, C5695f c5695f, ArrayList arrayList) {
                this.f7690b = aVar;
                this.f7691c = aVar2;
                this.f7692d = c5695f;
                this.f7693e = arrayList;
                this.f7689a = aVar;
            }

            @Override // p111ha.InterfaceC2937x.a
            /* JADX INFO: renamed from: a */
            public void mo10641a() {
                this.f7690b.mo10641a();
                this.f7691c.mo10640h(this.f7692d, new C8579a((InterfaceC6328c) AbstractC5081g0.m20537I0(this.f7693e)));
            }

            @Override // p111ha.InterfaceC2937x.a
            /* JADX INFO: renamed from: b */
            public InterfaceC2937x.b mo10634b(C5695f c5695f) {
                return this.f7689a.mo10634b(c5695f);
            }

            @Override // p111ha.InterfaceC2937x.a
            /* JADX INFO: renamed from: c */
            public void mo10635c(C5695f c5695f, C8589f c8589f) {
                c8589f.getClass();
                this.f7689a.mo10635c(c5695f, c8589f);
            }

            @Override // p111ha.InterfaceC2937x.a
            /* JADX INFO: renamed from: d */
            public void mo10636d(C5695f c5695f, C5691b c5691b, C5695f c5695f2) {
                c5691b.getClass();
                c5695f2.getClass();
                this.f7689a.mo10636d(c5695f, c5691b, c5695f2);
            }

            @Override // p111ha.InterfaceC2937x.a
            /* JADX INFO: renamed from: e */
            public void mo10637e(C5695f c5695f, Object obj) {
                this.f7689a.mo10637e(c5695f, obj);
            }

            @Override // p111ha.InterfaceC2937x.a
            /* JADX INFO: renamed from: f */
            public InterfaceC2937x.a mo10638f(C5695f c5695f, C5691b c5691b) {
                c5691b.getClass();
                return this.f7689a.mo10638f(c5695f, c5691b);
            }
        }

        /* JADX INFO: renamed from: ha.h$a$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b implements InterfaceC2937x.b {

            /* JADX INFO: renamed from: a */
            public final ArrayList f7694a = new ArrayList();

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C2918h f7695b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C5695f f7696c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ a f7697d;

            /* JADX INFO: renamed from: ha.h$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static final class C10093a implements InterfaceC2937x.a {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC2937x.a f7698a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC2937x.a f7699b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ b f7700c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ArrayList f7701d;

                public C10093a(InterfaceC2937x.a aVar, b bVar, ArrayList arrayList) {
                    this.f7699b = aVar;
                    this.f7700c = bVar;
                    this.f7701d = arrayList;
                    this.f7698a = aVar;
                }

                @Override // p111ha.InterfaceC2937x.a
                /* JADX INFO: renamed from: a */
                public void mo10641a() {
                    this.f7699b.mo10641a();
                    this.f7700c.f7694a.add(new C8579a((InterfaceC6328c) AbstractC5081g0.m20537I0(this.f7701d)));
                }

                @Override // p111ha.InterfaceC2937x.a
                /* JADX INFO: renamed from: b */
                public InterfaceC2937x.b mo10634b(C5695f c5695f) {
                    return this.f7698a.mo10634b(c5695f);
                }

                @Override // p111ha.InterfaceC2937x.a
                /* JADX INFO: renamed from: c */
                public void mo10635c(C5695f c5695f, C8589f c8589f) {
                    c8589f.getClass();
                    this.f7698a.mo10635c(c5695f, c8589f);
                }

                @Override // p111ha.InterfaceC2937x.a
                /* JADX INFO: renamed from: d */
                public void mo10636d(C5695f c5695f, C5691b c5691b, C5695f c5695f2) {
                    c5691b.getClass();
                    c5695f2.getClass();
                    this.f7698a.mo10636d(c5695f, c5691b, c5695f2);
                }

                @Override // p111ha.InterfaceC2937x.a
                /* JADX INFO: renamed from: e */
                public void mo10637e(C5695f c5695f, Object obj) {
                    this.f7698a.mo10637e(c5695f, obj);
                }

                @Override // p111ha.InterfaceC2937x.a
                /* JADX INFO: renamed from: f */
                public InterfaceC2937x.a mo10638f(C5695f c5695f, C5691b c5691b) {
                    c5691b.getClass();
                    return this.f7698a.mo10638f(c5695f, c5691b);
                }
            }

            public b(C2918h c2918h, C5695f c5695f, a aVar) {
                this.f7695b = c2918h;
                this.f7696c = c5695f;
                this.f7697d = aVar;
            }

            @Override // p111ha.InterfaceC2937x.b
            /* JADX INFO: renamed from: a */
            public void mo10643a() {
                this.f7697d.mo10639g(this.f7696c, this.f7694a);
            }

            @Override // p111ha.InterfaceC2937x.b
            /* JADX INFO: renamed from: b */
            public void mo10644b(Object obj) {
                this.f7694a.add(this.f7695b.m10628O(this.f7696c, obj));
            }

            @Override // p111ha.InterfaceC2937x.b
            /* JADX INFO: renamed from: c */
            public void mo10645c(C8589f c8589f) {
                c8589f.getClass();
                this.f7694a.add(new C8602s(c8589f));
            }

            @Override // p111ha.InterfaceC2937x.b
            /* JADX INFO: renamed from: d */
            public InterfaceC2937x.a mo10646d(C5691b c5691b) {
                c5691b.getClass();
                ArrayList arrayList = new ArrayList();
                C2918h c2918h = this.f7695b;
                InterfaceC6003g1 interfaceC6003g1 = InterfaceC6003g1.f18958a;
                interfaceC6003g1.getClass();
                InterfaceC2937x.a aVarMo10598x = c2918h.mo10598x(c5691b, interfaceC6003g1, arrayList);
                aVarMo10598x.getClass();
                return new C10093a(aVarMo10598x, this, arrayList);
            }

            @Override // p111ha.InterfaceC2937x.b
            /* JADX INFO: renamed from: e */
            public void mo10647e(C5691b c5691b, C5695f c5695f) {
                c5691b.getClass();
                c5695f.getClass();
                this.f7694a.add(new C8594k(c5691b, c5695f));
            }
        }

        public a() {
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: b */
        public InterfaceC2937x.b mo10634b(C5695f c5695f) {
            return new b(C2918h.this, c5695f, this);
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: c */
        public void mo10635c(C5695f c5695f, C8589f c8589f) {
            c8589f.getClass();
            mo10640h(c5695f, new C8602s(c8589f));
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: d */
        public void mo10636d(C5695f c5695f, C5691b c5691b, C5695f c5695f2) {
            c5691b.getClass();
            c5695f2.getClass();
            mo10640h(c5695f, new C8594k(c5691b, c5695f2));
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: e */
        public void mo10637e(C5695f c5695f, Object obj) {
            mo10640h(c5695f, C2918h.this.m10628O(c5695f, obj));
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: f */
        public InterfaceC2937x.a mo10638f(C5695f c5695f, C5691b c5691b) {
            c5691b.getClass();
            ArrayList arrayList = new ArrayList();
            C2918h c2918h = C2918h.this;
            InterfaceC6003g1 interfaceC6003g1 = InterfaceC6003g1.f18958a;
            interfaceC6003g1.getClass();
            InterfaceC2937x.a aVarMo10598x = c2918h.mo10598x(c5691b, interfaceC6003g1, arrayList);
            aVarMo10598x.getClass();
            return new C10092a(aVarMo10598x, this, c5695f, arrayList);
        }

        /* JADX INFO: renamed from: g */
        public abstract void mo10639g(C5695f c5695f, ArrayList arrayList);

        /* JADX INFO: renamed from: h */
        public abstract void mo10640h(C5695f c5695f, AbstractC8590g abstractC8590g);
    }

    /* JADX INFO: renamed from: ha.h$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends a {

        /* JADX INFO: renamed from: b */
        public final HashMap f7702b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC5995e f7704d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C5691b f7705e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ List f7706f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC6003g1 f7707g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC5995e interfaceC5995e, C5691b c5691b, List list, InterfaceC6003g1 interfaceC6003g1) {
            super();
            this.f7704d = interfaceC5995e;
            this.f7705e = c5691b;
            this.f7706f = list;
            this.f7707g = interfaceC6003g1;
            this.f7702b = new HashMap();
        }

        @Override // p111ha.InterfaceC2937x.a
        /* JADX INFO: renamed from: a */
        public void mo10641a() {
            if (C2918h.this.m10574F(this.f7705e, this.f7702b) || C2918h.this.m10597w(this.f7705e)) {
                return;
            }
            this.f7706f.add(new C6329d(this.f7704d.mo7508x(), this.f7702b, this.f7707g));
        }

        @Override // p111ha.C2918h.a
        /* JADX INFO: renamed from: g */
        public void mo10639g(C5695f c5695f, ArrayList arrayList) {
            arrayList.getClass();
            if (c5695f == null) {
                return;
            }
            InterfaceC6039s1 interfaceC6039s1M38372b = AbstractC9888a.m38372b(c5695f, this.f7704d);
            if (interfaceC6039s1M38372b != null) {
                HashMap map = this.f7702b;
                C8592i c8592i = C8592i.f28628a;
                List listM25341c = AbstractC6370a.m25341c(arrayList);
                AbstractC2706r0 type = interfaceC6039s1M38372b.getType();
                type.getClass();
                map.put(c5695f, c8592i.m33013b(listM25341c, type));
                return;
            }
            if (C2918h.this.m10597w(this.f7705e) && AbstractC1061t.m3842c(c5695f.m23030c(), "value")) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof C8579a) {
                        arrayList2.add(obj);
                    }
                }
                List list = this.f7706f;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    list.add((InterfaceC6328c) ((C8579a) it.next()).mo33009b());
                }
            }
        }

        @Override // p111ha.C2918h.a
        /* JADX INFO: renamed from: h */
        public void mo10640h(C5695f c5695f, AbstractC8590g abstractC8590g) {
            abstractC8590g.getClass();
            if (c5695f != null) {
                this.f7702b.put(c5695f, abstractC8590g);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2918h(InterfaceC6005h0 interfaceC6005h0, C6020m0 c6020m0, InterfaceC2412n interfaceC2412n, InterfaceC2935v interfaceC2935v) {
        super(interfaceC2412n, interfaceC2935v);
        interfaceC6005h0.getClass();
        c6020m0.getClass();
        interfaceC2412n.getClass();
        interfaceC2935v.getClass();
        this.f7684d = interfaceC6005h0;
        this.f7685e = c6020m0;
        this.f7686f = new C1472g(interfaceC6005h0, c6020m0);
        this.f7687g = C4723c.f14003i;
    }

    /* JADX INFO: renamed from: O */
    public final AbstractC8590g m10628O(C5695f c5695f, Object obj) {
        AbstractC8590g abstractC8590gM33015e = C8592i.f28628a.m33015e(obj, this.f7684d);
        if (abstractC8590gM33015e != null) {
            return abstractC8590gM33015e;
        }
        return AbstractC8595l.f28631b.m33019a("Unsupported annotation argument: " + c5695f);
    }

    @Override // p111ha.AbstractC2912e, p037cb.InterfaceC1474h
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public InterfaceC6328c mo5764g(C3769b c3769b, InterfaceC4724d interfaceC4724d) {
        c3769b.getClass();
        interfaceC4724d.getClass();
        return this.f7686f.m5768a(c3769b, interfaceC4724d);
    }

    @Override // p111ha.AbstractC2910d
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public AbstractC8590g mo10576I(String str, Object obj) {
        str.getClass();
        obj.getClass();
        if (AbstractC8621f0.m33126a0("ZBCS", str, false, 2, null)) {
            int iIntValue = ((Integer) obj).intValue();
            int iHashCode = str.hashCode();
            if (iHashCode == 66) {
                if (str.equals("B")) {
                    obj = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 67) {
                if (str.equals("C")) {
                    obj = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 83) {
                if (str.equals("S")) {
                    obj = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 90 && str.equals("Z")) {
                obj = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(str);
        }
        return C8592i.f28628a.m33015e(obj, this.f7684d);
    }

    /* JADX INFO: renamed from: R */
    public final InterfaceC5995e m10631R(C5691b c5691b) {
        return AbstractC6054y.m24114d(this.f7684d, c5691b, this.f7685e);
    }

    /* JADX INFO: renamed from: S */
    public void m10632S(C4723c c4723c) {
        c4723c.getClass();
        this.f7687g = c4723c;
    }

    @Override // p111ha.AbstractC2910d
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public AbstractC8590g mo10578M(AbstractC8590g abstractC8590g) {
        abstractC8590g.getClass();
        return abstractC8590g instanceof C8585d ? new C8580a0(((Number) ((C8585d) abstractC8590g).mo33009b()).byteValue()) : abstractC8590g instanceof C8606w ? new C8586d0(((Number) ((C8606w) abstractC8590g).mo33009b()).shortValue()) : abstractC8590g instanceof C8597n ? new C8582b0(((Number) ((C8597n) abstractC8590g).mo33009b()).intValue()) : abstractC8590g instanceof C8603t ? new C8584c0(((Number) ((C8603t) abstractC8590g).mo33009b()).longValue()) : abstractC8590g;
    }

    @Override // p111ha.AbstractC2912e
    /* JADX INFO: renamed from: v */
    public C4723c mo10596v() {
        return this.f7687g;
    }

    @Override // p111ha.AbstractC2912e
    /* JADX INFO: renamed from: x */
    public InterfaceC2937x.a mo10598x(C5691b c5691b, InterfaceC6003g1 interfaceC6003g1, List list) {
        c5691b.getClass();
        interfaceC6003g1.getClass();
        list.getClass();
        return new b(m10631R(c5691b), c5691b, list, interfaceC6003g1);
    }
}
