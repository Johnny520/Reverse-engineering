package p358y9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p111ha.C2915f0;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5071c1;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5116y;
import p213oa.C5695f;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;
import p343xa.EnumC9476f;

/* JADX INFO: renamed from: y9.t0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9648t0 {

    /* JADX INFO: renamed from: a */
    public static final a f32841a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final List f32842b;

    /* JADX INFO: renamed from: c */
    public static final List f32843c;

    /* JADX INFO: renamed from: d */
    public static final List f32844d;

    /* JADX INFO: renamed from: e */
    public static final Map f32845e;

    /* JADX INFO: renamed from: f */
    public static final Map f32846f;

    /* JADX INFO: renamed from: g */
    public static final Set f32847g;

    /* JADX INFO: renamed from: h */
    public static final Set f32848h;

    /* JADX INFO: renamed from: i */
    public static final a.C10258a f32849i;

    /* JADX INFO: renamed from: j */
    public static final Map f32850j;

    /* JADX INFO: renamed from: k */
    public static final Map f32851k;

    /* JADX INFO: renamed from: l */
    public static final Set f32852l;

    /* JADX INFO: renamed from: m */
    public static final Set f32853m;

    /* JADX INFO: renamed from: n */
    public static final Map f32854n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: y9.t0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: s */
        public static final b f32860s = new b("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);

        /* JADX INFO: renamed from: t */
        public static final b f32861t = new b("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);

        /* JADX INFO: renamed from: u */
        public static final b f32862u = new b("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);

        /* JADX INFO: renamed from: v */
        public static final /* synthetic */ b[] f32863v;

        /* JADX INFO: renamed from: w */
        public static final /* synthetic */ InterfaceC7197a f32864w;

        /* JADX INFO: renamed from: q */
        public final String f32865q;

        /* JADX INFO: renamed from: r */
        public final boolean f32866r;

        static {
            b[] bVarArrM37747a = m37747a();
            f32863v = bVarArrM37747a;
            f32864w = AbstractC7198b.m28437a(bVarArrM37747a);
        }

        public b(String str, int i10, String str2, boolean z10) {
            this.f32865q = str2;
            this.f32866r = z10;
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ b[] m37747a() {
            return new b[]{f32860s, f32861t, f32862u};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f32863v.clone();
        }
    }

    static {
        Set<String> setM20487i = AbstractC5068b1.m20487i("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(setM20487i, 10));
        for (String str : setM20487i) {
            a aVar = f32841a;
            String strM36914h = EnumC9476f.BOOLEAN.m36914h();
            strM36914h.getClass();
            arrayList.add(aVar.m37742m("java/util/Collection", str, "Ljava/util/Collection;", strM36914h));
        }
        f32842b = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a.C10258a) it.next()).m37746d());
        }
        f32843c = arrayList2;
        List list = f32842b;
        ArrayList arrayList3 = new ArrayList(AbstractC5116y.m20814z(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((a.C10258a) it2.next()).m37745c().m23030c());
        }
        f32844d = arrayList3;
        C2915f0 c2915f0 = C2915f0.f7680a;
        a aVar2 = f32841a;
        String strM10615i = c2915f0.m10615i("Collection");
        EnumC9476f enumC9476f = EnumC9476f.BOOLEAN;
        String strM36914h2 = enumC9476f.m36914h();
        strM36914h2.getClass();
        a.C10258a c10258aM37742m = aVar2.m37742m(strM10615i, "contains", "Ljava/lang/Object;", strM36914h2);
        c cVar = c.f32869t;
        C4711r c4711rM18815a = AbstractC4717x.m18815a(c10258aM37742m, cVar);
        String strM10615i2 = c2915f0.m10615i("Collection");
        String strM36914h3 = enumC9476f.m36914h();
        strM36914h3.getClass();
        C4711r c4711rM18815a2 = AbstractC4717x.m18815a(aVar2.m37742m(strM10615i2, "remove", "Ljava/lang/Object;", strM36914h3), cVar);
        String strM10615i3 = c2915f0.m10615i("Map");
        String strM36914h4 = enumC9476f.m36914h();
        strM36914h4.getClass();
        C4711r c4711rM18815a3 = AbstractC4717x.m18815a(aVar2.m37742m(strM10615i3, "containsKey", "Ljava/lang/Object;", strM36914h4), cVar);
        String strM10615i4 = c2915f0.m10615i("Map");
        String strM36914h5 = enumC9476f.m36914h();
        strM36914h5.getClass();
        C4711r c4711rM18815a4 = AbstractC4717x.m18815a(aVar2.m37742m(strM10615i4, "containsValue", "Ljava/lang/Object;", strM36914h5), cVar);
        String strM10615i5 = c2915f0.m10615i("Map");
        String strM36914h6 = enumC9476f.m36914h();
        strM36914h6.getClass();
        C4711r c4711rM18815a5 = AbstractC4717x.m18815a(aVar2.m37742m(strM10615i5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strM36914h6), cVar);
        C4711r c4711rM18815a6 = AbstractC4717x.m18815a(aVar2.m37742m(c2915f0.m10615i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.f32870u);
        a.C10258a c10258aM37742m2 = aVar2.m37742m(c2915f0.m10615i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.f32867r;
        C4711r c4711rM18815a7 = AbstractC4717x.m18815a(c10258aM37742m2, cVar2);
        C4711r c4711rM18815a8 = AbstractC4717x.m18815a(aVar2.m37742m(c2915f0.m10615i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        String strM10615i6 = c2915f0.m10615i("List");
        EnumC9476f enumC9476f2 = EnumC9476f.INT;
        String strM36914h7 = enumC9476f2.m36914h();
        strM36914h7.getClass();
        a.C10258a c10258aM37742m3 = aVar2.m37742m(strM10615i6, "indexOf", "Ljava/lang/Object;", strM36914h7);
        c cVar3 = c.f32868s;
        C4711r c4711rM18815a9 = AbstractC4717x.m18815a(c10258aM37742m3, cVar3);
        String strM10615i7 = c2915f0.m10615i("List");
        String strM36914h8 = enumC9476f2.m36914h();
        strM36914h8.getClass();
        Map mapM20771l = AbstractC5109u0.m20771l(c4711rM18815a, c4711rM18815a2, c4711rM18815a3, c4711rM18815a4, c4711rM18815a5, c4711rM18815a6, c4711rM18815a7, c4711rM18815a8, c4711rM18815a9, AbstractC4717x.m18815a(aVar2.m37742m(strM10615i7, "lastIndexOf", "Ljava/lang/Object;", strM36914h8), cVar3));
        f32845e = mapM20771l;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5107t0.m20763e(mapM20771l.size()));
        for (Map.Entry entry : mapM20771l.entrySet()) {
            linkedHashMap.put(((a.C10258a) entry.getKey()).m37746d(), entry.getValue());
        }
        f32846f = linkedHashMap;
        Set setM20503l = AbstractC5071c1.m20503l(f32845e.keySet(), f32842b);
        ArrayList arrayList4 = new ArrayList(AbstractC5116y.m20814z(setM20503l, 10));
        Iterator it3 = setM20503l.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((a.C10258a) it3.next()).m37745c());
        }
        f32847g = AbstractC5081g0.m20564c1(arrayList4);
        ArrayList arrayList5 = new ArrayList(AbstractC5116y.m20814z(setM20503l, 10));
        Iterator it4 = setM20503l.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((a.C10258a) it4.next()).m37746d());
        }
        f32848h = AbstractC5081g0.m20564c1(arrayList5);
        a aVar3 = f32841a;
        EnumC9476f enumC9476f3 = EnumC9476f.INT;
        String strM36914h9 = enumC9476f3.m36914h();
        strM36914h9.getClass();
        a.C10258a c10258aM37742m4 = aVar3.m37742m("java/util/List", "removeAt", strM36914h9, "Ljava/lang/Object;");
        f32849i = c10258aM37742m4;
        C2915f0 c2915f02 = C2915f0.f7680a;
        String strM10614h = c2915f02.m10614h("Number");
        String strM36914h10 = EnumC9476f.BYTE.m36914h();
        strM36914h10.getClass();
        C4711r c4711rM18815a10 = AbstractC4717x.m18815a(aVar3.m37742m(strM10614h, "toByte", _UrlKt.FRAGMENT_ENCODE_SET, strM36914h10), C5695f.m23027j("byteValue"));
        String strM10614h2 = c2915f02.m10614h("Number");
        String strM36914h11 = EnumC9476f.SHORT.m36914h();
        strM36914h11.getClass();
        C4711r c4711rM18815a11 = AbstractC4717x.m18815a(aVar3.m37742m(strM10614h2, "toShort", _UrlKt.FRAGMENT_ENCODE_SET, strM36914h11), C5695f.m23027j("shortValue"));
        String strM10614h3 = c2915f02.m10614h("Number");
        String strM36914h12 = enumC9476f3.m36914h();
        strM36914h12.getClass();
        C4711r c4711rM18815a12 = AbstractC4717x.m18815a(aVar3.m37742m(strM10614h3, "toInt", _UrlKt.FRAGMENT_ENCODE_SET, strM36914h12), C5695f.m23027j("intValue"));
        String strM10614h4 = c2915f02.m10614h("Number");
        String strM36914h13 = EnumC9476f.LONG.m36914h();
        strM36914h13.getClass();
        C4711r c4711rM18815a13 = AbstractC4717x.m18815a(aVar3.m37742m(strM10614h4, "toLong", _UrlKt.FRAGMENT_ENCODE_SET, strM36914h13), C5695f.m23027j("longValue"));
        String strM10614h5 = c2915f02.m10614h("Number");
        String strM36914h14 = EnumC9476f.FLOAT.m36914h();
        strM36914h14.getClass();
        C4711r c4711rM18815a14 = AbstractC4717x.m18815a(aVar3.m37742m(strM10614h5, "toFloat", _UrlKt.FRAGMENT_ENCODE_SET, strM36914h14), C5695f.m23027j("floatValue"));
        String strM10614h6 = c2915f02.m10614h("Number");
        String strM36914h15 = EnumC9476f.DOUBLE.m36914h();
        strM36914h15.getClass();
        C4711r c4711rM18815a15 = AbstractC4717x.m18815a(aVar3.m37742m(strM10614h6, "toDouble", _UrlKt.FRAGMENT_ENCODE_SET, strM36914h15), C5695f.m23027j("doubleValue"));
        C4711r c4711rM18815a16 = AbstractC4717x.m18815a(c10258aM37742m4, C5695f.m23027j("remove"));
        String strM10614h7 = c2915f02.m10614h("CharSequence");
        String strM36914h16 = enumC9476f3.m36914h();
        strM36914h16.getClass();
        String strM36914h17 = EnumC9476f.CHAR.m36914h();
        strM36914h17.getClass();
        Map mapM20771l2 = AbstractC5109u0.m20771l(c4711rM18815a10, c4711rM18815a11, c4711rM18815a12, c4711rM18815a13, c4711rM18815a14, c4711rM18815a15, c4711rM18815a16, AbstractC4717x.m18815a(aVar3.m37742m(strM10614h7, "get", strM36914h16, strM36914h17), C5695f.m23027j("charAt")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicInteger"), "load", _UrlKt.FRAGMENT_ENCODE_SET, "I"), C5695f.m23027j("get")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicInteger"), "store", "I", "V"), C5695f.m23027j("set")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicInteger"), "exchange", "I", "I"), C5695f.m23027j("getAndSet")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicInteger"), "fetchAndAdd", "I", "I"), C5695f.m23027j("getAndAdd")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicInteger"), "addAndFetch", "I", "I"), C5695f.m23027j("addAndGet")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicLong"), "load", _UrlKt.FRAGMENT_ENCODE_SET, "J"), C5695f.m23027j("get")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicLong"), "store", "J", "V"), C5695f.m23027j("set")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicLong"), "exchange", "J", "J"), C5695f.m23027j("getAndSet")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicLong"), "fetchAndAdd", "J", "J"), C5695f.m23027j("getAndAdd")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicLong"), "addAndFetch", "J", "J"), C5695f.m23027j("addAndGet")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicBoolean"), "load", _UrlKt.FRAGMENT_ENCODE_SET, "Z"), C5695f.m23027j("get")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicBoolean"), "store", "Z", "V"), C5695f.m23027j("set")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicBoolean"), "exchange", "Z", "Z"), C5695f.m23027j("getAndSet")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicReference"), "load", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/lang/Object;"), C5695f.m23027j("get")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicReference"), "store", "Ljava/lang/Object;", "V"), C5695f.m23027j("set")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), C5695f.m23027j("getAndSet")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicIntegerArray"), "loadAt", "I", "I"), C5695f.m23027j("get")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicIntegerArray"), "storeAt", "II", "V"), C5695f.m23027j("set")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicIntegerArray"), "exchangeAt", "II", "I"), C5695f.m23027j("getAndSet")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), C5695f.m23027j("compareAndSet")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), C5695f.m23027j("getAndAdd")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), C5695f.m23027j("addAndGet")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicLongArray"), "loadAt", "I", "J"), C5695f.m23027j("get")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicLongArray"), "storeAt", "IJ", "V"), C5695f.m23027j("set")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicLongArray"), "exchangeAt", "IJ", "J"), C5695f.m23027j("getAndSet")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), C5695f.m23027j("compareAndSet")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), C5695f.m23027j("getAndAdd")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), C5695f.m23027j("addAndGet")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), C5695f.m23027j("get")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), C5695f.m23027j("set")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), C5695f.m23027j("getAndSet")), AbstractC4717x.m18815a(aVar3.m37742m(c2915f02.m10616j("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), C5695f.m23027j("compareAndSet")));
        f32850j = mapM20771l2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC5107t0.m20763e(mapM20771l2.size()));
        for (Map.Entry entry2 : mapM20771l2.entrySet()) {
            linkedHashMap2.put(((a.C10258a) entry2.getKey()).m37746d(), entry2.getValue());
        }
        f32851k = linkedHashMap2;
        Map map = f32850j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            linkedHashSet.add(a.C10258a.m37743b((a.C10258a) entry3.getKey(), null, (C5695f) entry3.getValue(), null, null, 13, null).m37746d());
        }
        f32852l = linkedHashSet;
        Set setKeySet = f32850j.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((a.C10258a) it5.next()).m37745c());
        }
        f32853m = hashSet;
        Set<Map.Entry> setEntrySet = f32850j.entrySet();
        ArrayList<C4711r> arrayList6 = new ArrayList(AbstractC5116y.m20814z(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList6.add(new C4711r(((a.C10258a) entry4.getKey()).m37745c(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC2368o.m8578e(AbstractC5107t0.m20763e(AbstractC5116y.m20814z(arrayList6, 10)), 16));
        for (C4711r c4711r : arrayList6) {
            linkedHashMap3.put((C5695f) c4711r.m18796f(), (C5695f) c4711r.m18795e());
        }
        f32854n = linkedHashMap3;
    }

    /* JADX INFO: renamed from: y9.t0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: y9.t0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10258a {

            /* JADX INFO: renamed from: a */
            public final String f32855a;

            /* JADX INFO: renamed from: b */
            public final C5695f f32856b;

            /* JADX INFO: renamed from: c */
            public final String f32857c;

            /* JADX INFO: renamed from: d */
            public final String f32858d;

            /* JADX INFO: renamed from: e */
            public final String f32859e;

            public C10258a(String str, C5695f c5695f, String str2, String str3) {
                str.getClass();
                c5695f.getClass();
                str2.getClass();
                str3.getClass();
                this.f32855a = str;
                this.f32856b = c5695f;
                this.f32857c = str2;
                this.f32858d = str3;
                this.f32859e = C2915f0.f7680a.m10618m(str, c5695f + '(' + str2 + ')' + str3);
            }

            /* JADX INFO: renamed from: b */
            public static /* synthetic */ C10258a m37743b(C10258a c10258a, String str, C5695f c5695f, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = c10258a.f32855a;
                }
                if ((i10 & 2) != 0) {
                    c5695f = c10258a.f32856b;
                }
                if ((i10 & 4) != 0) {
                    str2 = c10258a.f32857c;
                }
                if ((i10 & 8) != 0) {
                    str3 = c10258a.f32858d;
                }
                return c10258a.m37744a(str, c5695f, str2, str3);
            }

            /* JADX INFO: renamed from: a */
            public final C10258a m37744a(String str, C5695f c5695f, String str2, String str3) {
                str.getClass();
                c5695f.getClass();
                str2.getClass();
                str3.getClass();
                return new C10258a(str, c5695f, str2, str3);
            }

            /* JADX INFO: renamed from: c */
            public final C5695f m37745c() {
                return this.f32856b;
            }

            /* JADX INFO: renamed from: d */
            public final String m37746d() {
                return this.f32859e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10258a)) {
                    return false;
                }
                C10258a c10258a = (C10258a) obj;
                return AbstractC1061t.m3842c(this.f32855a, c10258a.f32855a) && AbstractC1061t.m3842c(this.f32856b, c10258a.f32856b) && AbstractC1061t.m3842c(this.f32857c, c10258a.f32857c) && AbstractC1061t.m3842c(this.f32858d, c10258a.f32858d);
            }

            public int hashCode() {
                return (((((this.f32855a.hashCode() * 31) + this.f32856b.hashCode()) * 31) + this.f32857c.hashCode()) * 31) + this.f32858d.hashCode();
            }

            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f32855a + ", name=" + this.f32856b + ", parameters=" + this.f32857c + ", returnType=" + this.f32858d + ')';
            }
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final C5695f m37731b(C5695f c5695f) {
            c5695f.getClass();
            return (C5695f) m37735f().get(c5695f);
        }

        /* JADX INFO: renamed from: c */
        public final List m37732c() {
            return AbstractC9648t0.f32843c;
        }

        /* JADX INFO: renamed from: d */
        public final Set m37733d() {
            return AbstractC9648t0.f32847g;
        }

        /* JADX INFO: renamed from: e */
        public final Set m37734e() {
            return AbstractC9648t0.f32848h;
        }

        /* JADX INFO: renamed from: f */
        public final Map m37735f() {
            return AbstractC9648t0.f32854n;
        }

        /* JADX INFO: renamed from: g */
        public final Set m37736g() {
            return AbstractC9648t0.f32853m;
        }

        /* JADX INFO: renamed from: h */
        public final C10258a m37737h() {
            return AbstractC9648t0.f32849i;
        }

        /* JADX INFO: renamed from: i */
        public final Map m37738i() {
            return AbstractC9648t0.f32846f;
        }

        /* JADX INFO: renamed from: j */
        public final Map m37739j() {
            return AbstractC9648t0.f32851k;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m37740k(C5695f c5695f) {
            c5695f.getClass();
            return m37736g().contains(c5695f);
        }

        /* JADX INFO: renamed from: l */
        public final b m37741l(String str) {
            str.getClass();
            return m37732c().contains(str) ? b.f32860s : ((c) AbstractC5109u0.m20769j(m37738i(), str)) == c.f32867r ? b.f32862u : b.f32861t;
        }

        /* JADX INFO: renamed from: m */
        public final C10258a m37742m(String str, String str2, String str3, String str4) {
            C5695f c5695fM23027j = C5695f.m23027j(str2);
            c5695fM23027j.getClass();
            return new C10258a(str, c5695fM23027j, str3, str4);
        }

        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: y9.t0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {

        /* JADX INFO: renamed from: r */
        public static final c f32867r = new c("NULL", 0, null);

        /* JADX INFO: renamed from: s */
        public static final c f32868s = new c("INDEX", 1, -1);

        /* JADX INFO: renamed from: t */
        public static final c f32869t = new c("FALSE", 2, Boolean.FALSE);

        /* JADX INFO: renamed from: u */
        public static final c f32870u = new a("MAP_GET_OR_DEFAULT", 3);

        /* JADX INFO: renamed from: v */
        public static final /* synthetic */ c[] f32871v;

        /* JADX INFO: renamed from: w */
        public static final /* synthetic */ InterfaceC7197a f32872w;

        /* JADX INFO: renamed from: q */
        public final Object f32873q;

        /* JADX INFO: renamed from: y9.t0$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends c {
            /* JADX WARN: Illegal instructions before constructor call */
            public a(String str, int i10) {
                AbstractC1043k abstractC1043k = null;
                super(str, i10, abstractC1043k, abstractC1043k);
            }
        }

        static {
            c[] cVarArrM37748a = m37748a();
            f32871v = cVarArrM37748a;
            f32872w = AbstractC7198b.m28437a(cVarArrM37748a);
        }

        public c(String str, int i10, Object obj) {
            this.f32873q = obj;
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ c[] m37748a() {
            return new c[]{f32867r, f32868s, f32869t, f32870u};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f32871v.clone();
        }

        public /* synthetic */ c(String str, int i10, Object obj, AbstractC1043k abstractC1043k) {
            this(str, i10, obj);
        }
    }
}
