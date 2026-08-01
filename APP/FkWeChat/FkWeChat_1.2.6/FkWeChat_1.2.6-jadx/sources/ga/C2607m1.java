package ga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p010a9.InterfaceC0184l;
import p080f9.AbstractC2368o;
import p111ha.C2915f0;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5116y;
import p185m8.C5095n0;
import p343xa.EnumC9476f;

/* JADX INFO: renamed from: ga.m1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2607m1 {

    /* JADX INFO: renamed from: a */
    public final Map f6912a = new LinkedHashMap();

    /* JADX INFO: renamed from: ga.m1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a {

        /* JADX INFO: renamed from: a */
        public final String f6913a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2607m1 f6914b;

        /* JADX INFO: renamed from: ga.m1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public final class C10084a {

            /* JADX INFO: renamed from: a */
            public final String f6915a;

            /* JADX INFO: renamed from: b */
            public final String f6916b;

            /* JADX INFO: renamed from: c */
            public final List f6917c;

            /* JADX INFO: renamed from: d */
            public C4711r f6918d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ a f6919e;

            public C10084a(a aVar, String str, String str2) {
                str.getClass();
                this.f6919e = aVar;
                this.f6915a = str;
                this.f6916b = str2;
                this.f6917c = new ArrayList();
                this.f6918d = AbstractC4717x.m18815a("V", null);
            }

            /* JADX INFO: renamed from: a */
            public final C4711r m9297a() {
                C2915f0 c2915f0 = C2915f0.f7680a;
                String strM9296c = this.f6919e.m9296c();
                String str = this.f6915a;
                List list = this.f6917c;
                ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((C4711r) it.next()).m18795e());
                }
                String strM10618m = c2915f0.m10618m(strM9296c, c2915f0.m10617k(str, arrayList, (String) this.f6918d.m18795e()));
                C2619q1 c2619q1 = (C2619q1) this.f6918d.m18796f();
                List list2 = this.f6917c;
                ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((C2619q1) ((C4711r) it2.next()).m18796f());
                }
                return AbstractC4717x.m18815a(strM10618m, new C2586f1(c2619q1, arrayList2, this.f6916b));
            }

            /* JADX INFO: renamed from: b */
            public final void m9298b(String str, C2590h... c2590hArr) {
                C2619q1 c2619q1;
                str.getClass();
                c2590hArr.getClass();
                List list = this.f6917c;
                if (c2590hArr.length == 0) {
                    c2619q1 = null;
                } else {
                    Iterable<C5095n0> iterableM20739i1 = AbstractC5106t.m20739i1(c2590hArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2368o.m8578e(AbstractC5107t0.m20763e(AbstractC5116y.m20814z(iterableM20739i1, 10)), 16));
                    for (C5095n0 c5095n0 : iterableM20739i1) {
                        linkedHashMap.put(Integer.valueOf(c5095n0.m20621c()), (C2590h) c5095n0.m20622d());
                    }
                    c2619q1 = new C2619q1(linkedHashMap);
                }
                list.add(AbstractC4717x.m18815a(str, c2619q1));
            }

            /* JADX INFO: renamed from: c */
            public final void m9299c(String str, C2590h... c2590hArr) {
                str.getClass();
                c2590hArr.getClass();
                Iterable<C5095n0> iterableM20739i1 = AbstractC5106t.m20739i1(c2590hArr);
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2368o.m8578e(AbstractC5107t0.m20763e(AbstractC5116y.m20814z(iterableM20739i1, 10)), 16));
                for (C5095n0 c5095n0 : iterableM20739i1) {
                    linkedHashMap.put(Integer.valueOf(c5095n0.m20621c()), (C2590h) c5095n0.m20622d());
                }
                this.f6918d = AbstractC4717x.m18815a(str, new C2619q1(linkedHashMap));
            }

            /* JADX INFO: renamed from: d */
            public final void m9300d(EnumC9476f enumC9476f) {
                enumC9476f.getClass();
                String strM36914h = enumC9476f.m36914h();
                strM36914h.getClass();
                this.f6918d = AbstractC4717x.m18815a(strM36914h, null);
            }
        }

        public a(C2607m1 c2607m1, String str) {
            str.getClass();
            this.f6914b = c2607m1;
            this.f6913a = str;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m9294b(a aVar, String str, String str2, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            aVar.m9295a(str, str2, interfaceC0184l);
        }

        /* JADX INFO: renamed from: a */
        public final void m9295a(String str, String str2, InterfaceC0184l interfaceC0184l) {
            str.getClass();
            interfaceC0184l.getClass();
            Map map = this.f6914b.f6912a;
            C10084a c10084a = new C10084a(this, str, str2);
            interfaceC0184l.mo27m(c10084a);
            C4711r c4711rM9297a = c10084a.m9297a();
            map.put(c4711rM9297a.m18795e(), c4711rM9297a.m18796f());
        }

        /* JADX INFO: renamed from: c */
        public final String m9296c() {
            return this.f6913a;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Map m9293b() {
        return this.f6912a;
    }
}
