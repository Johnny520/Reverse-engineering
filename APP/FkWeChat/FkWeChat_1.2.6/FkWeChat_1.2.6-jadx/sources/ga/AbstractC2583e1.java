package ga;

import ga.C2607m1;
import java.util.Map;
import p111ha.C2915f0;
import p172l8.C4700i0;
import p343xa.EnumC9476f;

/* JADX INFO: renamed from: ga.e1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2583e1 {

    /* JADX INFO: renamed from: a */
    public static final C2590h f6860a = new C2590h(EnumC2599k.f6898r, null, false, false, 8, null);

    /* JADX INFO: renamed from: b */
    public static final C2590h f6861b;

    /* JADX INFO: renamed from: c */
    public static final C2590h f6862c;

    /* JADX INFO: renamed from: d */
    public static final Map f6863d;

    static {
        EnumC2599k enumC2599k = EnumC2599k.f6899s;
        f6861b = new C2590h(enumC2599k, null, false, false, 8, null);
        f6862c = new C2590h(enumC2599k, null, true, false, 8, null);
        C2915f0 c2915f0 = C2915f0.f7680a;
        String strM10614h = c2915f0.m10614h("Object");
        String strM10613g = c2915f0.m10613g("Predicate");
        String strM10613g2 = c2915f0.m10613g("Function");
        String strM10613g3 = c2915f0.m10613g("Consumer");
        String strM10613g4 = c2915f0.m10613g("BiFunction");
        String strM10613g5 = c2915f0.m10613g("BiConsumer");
        String strM10613g6 = c2915f0.m10613g("UnaryOperator");
        String strM10615i = c2915f0.m10615i("stream/Stream");
        String strM10615i2 = c2915f0.m10615i("Optional");
        C2607m1 c2607m1 = new C2607m1();
        C2607m1.a.m9294b(new C2607m1.a(c2607m1, c2915f0.m10615i("Iterator")), "forEachRemaining", null, new C2605m(strM10613g3), 2, null);
        C2607m1.a.m9294b(new C2607m1.a(c2607m1, c2915f0.m10614h("Iterable")), "spliterator", null, new C2634x(c2915f0), 2, null);
        C2607m1.a aVar = new C2607m1.a(c2607m1, c2915f0.m10615i("Collection"));
        C2607m1.a.m9294b(aVar, "removeIf", null, new C2594i0(strM10613g), 2, null);
        C2607m1.a.m9294b(aVar, "stream", null, new C2627t0(strM10615i), 2, null);
        C2607m1.a.m9294b(aVar, "parallelStream", null, new C2637y0(strM10615i), 2, null);
        C2607m1.a aVar2 = new C2607m1.a(c2607m1, c2915f0.m10615i("List"));
        C2607m1.a.m9294b(aVar2, "replaceAll", null, new C2639z0(strM10613g6), 2, null);
        aVar2.m9295a("addFirst", "2.1", new C2571a1(strM10614h));
        aVar2.m9295a("addLast", "2.1", new C2574b1(strM10614h));
        aVar2.m9295a("removeFirst", "2.1", new C2577c1(strM10614h));
        aVar2.m9295a("removeLast", "2.1", new C2580d1(strM10614h));
        C2607m1.a aVar3 = new C2607m1.a(c2607m1, c2915f0.m10615i("LinkedList"));
        aVar3.m9295a("addFirst", "2.1", new C2608n(strM10614h));
        aVar3.m9295a("addLast", "2.1", new C2611o(strM10614h));
        aVar3.m9295a("removeFirst", "2.1", new C2614p(strM10614h));
        aVar3.m9295a("removeLast", "2.1", new C2617q(strM10614h));
        C2607m1.a aVar4 = new C2607m1.a(c2607m1, c2915f0.m10615i("LinkedHashSet"));
        aVar4.m9295a("addFirst", "2.2", new C2620r(strM10614h));
        aVar4.m9295a("addLast", "2.2", new C2623s(strM10614h));
        aVar4.m9295a("removeFirst", "2.2", new C2626t(strM10614h));
        aVar4.m9295a("removeLast", "2.2", new C2628u(strM10614h));
        aVar4.m9295a("getFirst", "2.2", new C2630v(strM10614h));
        aVar4.m9295a("getLast", "2.2", new C2632w(strM10614h));
        C2607m1.a aVar5 = new C2607m1.a(c2607m1, c2915f0.m10615i("Map"));
        C2607m1.a.m9294b(aVar5, "forEach", null, new C2636y(strM10613g5), 2, null);
        C2607m1.a.m9294b(aVar5, "putIfAbsent", null, new C2638z(strM10614h), 2, null);
        C2607m1.a.m9294b(aVar5, "replace", null, new C2570a0(strM10614h), 2, null);
        C2607m1.a.m9294b(aVar5, "replace", null, new C2573b0(strM10614h), 2, null);
        C2607m1.a.m9294b(aVar5, "replaceAll", null, new C2576c0(strM10613g4), 2, null);
        C2607m1.a.m9294b(aVar5, "compute", null, new C2579d0(strM10614h, strM10613g4), 2, null);
        C2607m1.a.m9294b(aVar5, "computeIfAbsent", null, new C2582e0(strM10614h, strM10613g2), 2, null);
        C2607m1.a.m9294b(aVar5, "computeIfPresent", null, new C2585f0(strM10614h, strM10613g4), 2, null);
        C2607m1.a.m9294b(aVar5, "merge", null, new C2588g0(strM10614h, strM10613g4), 2, null);
        C2607m1.a aVar6 = new C2607m1.a(c2607m1, c2915f0.m10615i("LinkedHashMap"));
        aVar6.m9295a("putFirst", "2.2", new C2591h0(strM10614h));
        aVar6.m9295a("putLast", "2.2", new C2597j0(strM10614h));
        C2607m1.a aVar7 = new C2607m1.a(c2607m1, strM10615i2);
        C2607m1.a.m9294b(aVar7, "empty", null, new C2600k0(strM10615i2), 2, null);
        C2607m1.a.m9294b(aVar7, "of", null, new C2603l0(strM10614h, strM10615i2), 2, null);
        C2607m1.a.m9294b(aVar7, "ofNullable", null, new C2606m0(strM10614h, strM10615i2), 2, null);
        C2607m1.a.m9294b(aVar7, "get", null, new C2609n0(strM10614h), 2, null);
        C2607m1.a.m9294b(aVar7, "ifPresent", null, new C2612o0(strM10613g3), 2, null);
        C2607m1.a.m9294b(new C2607m1.a(c2607m1, c2915f0.m10614h("ref/Reference")), "get", null, new C2615p0(strM10614h), 2, null);
        C2607m1.a.m9294b(new C2607m1.a(c2607m1, strM10613g), "test", null, new C2618q0(strM10614h), 2, null);
        C2607m1.a.m9294b(new C2607m1.a(c2607m1, c2915f0.m10613g("BiPredicate")), "test", null, new C2621r0(strM10614h), 2, null);
        C2607m1.a.m9294b(new C2607m1.a(c2607m1, strM10613g3), "accept", null, new C2624s0(strM10614h), 2, null);
        C2607m1.a.m9294b(new C2607m1.a(c2607m1, strM10613g5), "accept", null, new C2629u0(strM10614h), 2, null);
        C2607m1.a.m9294b(new C2607m1.a(c2607m1, strM10613g2), "apply", null, new C2631v0(strM10614h), 2, null);
        C2607m1.a.m9294b(new C2607m1.a(c2607m1, strM10613g4), "apply", null, new C2633w0(strM10614h), 2, null);
        C2607m1.a.m9294b(new C2607m1.a(c2607m1, c2915f0.m10613g("Supplier")), "get", null, new C2635x0(strM10614h), 2, null);
        f6863d = c2607m1.m9293b();
    }

    /* JADX INFO: renamed from: A */
    public static final C4700i0 m9143A(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h);
        c10084a.m9298b(str, c2590h);
        c10084a.m9299c(str, f6860a);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: B */
    public static final C4700i0 m9145B(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h);
        c10084a.m9298b(str, c2590h);
        c10084a.m9299c(str, f6860a);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: C */
    public static final C4700i0 m9147C(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9299c(str, f6861b, f6862c);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: D */
    public static final C4700i0 m9149D(String str, String str2, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6862c;
        c10084a.m9298b(str, c2590h);
        c10084a.m9299c(str2, f6861b, c2590h);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: E */
    public static final C4700i0 m9151E(String str, String str2, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9298b(str, f6860a);
        c10084a.m9299c(str2, f6861b, f6862c);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: F */
    public static final C4700i0 m9153F(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9299c(str, f6862c);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: G */
    public static final C4700i0 m9155G(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9298b(str, f6861b, f6862c);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: H */
    public static final C4700i0 m9157H(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9299c(str, f6860a);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: I */
    public static final C4700i0 m9159I(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9298b(str, f6861b);
        c10084a.m9300d(EnumC9476f.BOOLEAN);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: J */
    public static final C4700i0 m9161J(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h);
        c10084a.m9298b(str, c2590h);
        c10084a.m9300d(EnumC9476f.BOOLEAN);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: K */
    public static final C4700i0 m9163K(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9298b(str, f6861b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: K0 */
    public static final Map m9164K0() {
        return f6863d;
    }

    /* JADX INFO: renamed from: L */
    public static final C4700i0 m9165L(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h);
        c10084a.m9298b(str, c2590h);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: M */
    public static final C4700i0 m9166M(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h);
        c10084a.m9299c(str, c2590h);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: N */
    public static final C4700i0 m9167N(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h);
        c10084a.m9298b(str, c2590h);
        c10084a.m9299c(str, c2590h);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: O */
    public static final C4700i0 m9168O(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9299c(str, f6861b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: P */
    public static final C4700i0 m9169P(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h, c2590h);
        c10084a.m9300d(EnumC9476f.BOOLEAN);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: Q */
    public static final C4700i0 m9170Q(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9299c(str, c2590h, c2590h);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: R */
    public static final C4700i0 m9171R(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9299c(str, c2590h, c2590h);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: a */
    public static final C4700i0 m9180a(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h, c2590h);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final C4700i0 m9182b(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9298b(str, f6861b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static final C4700i0 m9184c(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9299c(str, f6861b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: d */
    public static final C4700i0 m9186d(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9299c(str, f6861b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: e */
    public static final C4700i0 m9188e(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h, c2590h);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: f */
    public static final C4700i0 m9190f(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9298b(str, f6861b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: g */
    public static final C4700i0 m9192g(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9298b(str, f6861b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: h */
    public static final C4700i0 m9194h(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9298b(str, f6861b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: i */
    public static final C4700i0 m9196i(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9299c(str, f6861b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: j */
    public static final C4700i0 m9198j(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9299c(str, f6861b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: k */
    public static final C4700i0 m9200k(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9298b(str, f6861b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: l */
    public static final C4700i0 m9202l(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9298b(str, f6861b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: m */
    public static final C4700i0 m9204m(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9299c(str, f6861b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: n */
    public static final C4700i0 m9206n(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9299c(str, f6861b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: o */
    public static final C4700i0 m9208o(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9299c(str, f6861b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: p */
    public static final C4700i0 m9210p(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        c10084a.m9299c(str, f6861b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: q */
    public static final C4700i0 m9212q(C2915f0 c2915f0, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        String strM10615i = c2915f0.m10615i("Spliterator");
        C2590h c2590h = f6861b;
        c10084a.m9299c(strM10615i, c2590h, c2590h);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: r */
    public static final C4700i0 m9214r(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h, c2590h, c2590h);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: s */
    public static final C4700i0 m9216s(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h);
        c10084a.m9298b(str, c2590h);
        c10084a.m9299c(str, f6860a);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: t */
    public static final C4700i0 m9218t(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h);
        c10084a.m9298b(str, c2590h);
        c10084a.m9299c(str, f6860a);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: u */
    public static final C4700i0 m9220u(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h);
        c10084a.m9298b(str, c2590h);
        c10084a.m9298b(str, c2590h);
        c10084a.m9300d(EnumC9476f.BOOLEAN);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: v */
    public static final C4700i0 m9222v(String str, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h, c2590h, c2590h, c2590h);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: w */
    public static final C4700i0 m9224w(String str, String str2, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h);
        C2590h c2590h2 = f6860a;
        c10084a.m9298b(str2, c2590h, c2590h, c2590h2, c2590h2);
        c10084a.m9299c(str, c2590h2);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: x */
    public static final C4700i0 m9226x(String str, String str2, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h);
        c10084a.m9298b(str2, c2590h, c2590h, c2590h);
        c10084a.m9299c(str, c2590h);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: y */
    public static final C4700i0 m9228y(String str, String str2, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h);
        C2590h c2590h2 = f6862c;
        C2590h c2590h3 = f6860a;
        c10084a.m9298b(str2, c2590h, c2590h, c2590h2, c2590h3);
        c10084a.m9299c(str, c2590h3);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: z */
    public static final C4700i0 m9230z(String str, String str2, C2607m1.a.C10084a c10084a) {
        c10084a.getClass();
        C2590h c2590h = f6861b;
        c10084a.m9298b(str, c2590h);
        C2590h c2590h2 = f6862c;
        c10084a.m9298b(str, c2590h2);
        C2590h c2590h3 = f6860a;
        c10084a.m9298b(str2, c2590h, c2590h2, c2590h2, c2590h3);
        c10084a.m9299c(str, c2590h3);
        return C4700i0.f13910a;
    }
}
