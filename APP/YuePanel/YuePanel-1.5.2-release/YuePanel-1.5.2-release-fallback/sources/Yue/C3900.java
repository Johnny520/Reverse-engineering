package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
public class C3900 extends Yue.C3899 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f12443 = 1073741824;

    public C3900() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <K, V> java.util.Map<K, V> m15716(@Yue.InterfaceC4418 java.util.Map<K, V> r1) {
            java.lang.String r0 = "builder"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥ۠ۨۦۨ r1 = (Yue.C3880) r1
            java.util.Map r1 = r1.m15651()
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <K, V> java.util.Map<K, V> m15717(int r1, Yue.InterfaceC2825<? super java.util.Map<K, V>, Yue.C6593> r2) {
            java.lang.String r0 = "builderAction"
            Yue.C3329.m13906(r2, r0)
            java.util.Map r1 = m15720(r1)
            r2.invoke(r1)
            java.util.Map r1 = m15716(r1)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <K, V> java.util.Map<K, V> m15718(Yue.InterfaceC2825<? super java.util.Map<K, V>, Yue.C6593> r1) {
            java.lang.String r0 = "builderAction"
            Yue.C3329.m13906(r1, r0)
            java.util.Map r0 = m15719()
            r1.invoke(r0)
            java.util.Map r1 = m15716(r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <K, V> java.util.Map<K, V> m15719() {
            Yue.ۥ۠ۨۦۨ r0 = new Yue.ۥ۠ۨۦۨ
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static <K, V> java.util.Map<K, V> m15720(int r1) {
            Yue.ۥ۠ۨۦۨ r0 = new Yue.ۥ۠ۨۦۨ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <K, V> V m15721(@Yue.InterfaceC4418 java.util.concurrent.ConcurrentMap<K, V> r1, K r2, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends V> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "defaultValue"
            Yue.C3329.m13906(r3, r0)
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L1d
            java.lang.Object r3 = r3.invoke()
            java.lang.Object r1 = r1.putIfAbsent(r2, r3)
            if (r1 != 0) goto L1c
            r0 = r3
            goto L1d
        L1c:
            r0 = r1
        L1d:
            return r0
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m15722(int r1) {
            if (r1 >= 0) goto L3
            goto L19
        L3:
            r0 = 3
            if (r1 >= r0) goto L9
            int r1 = r1 + 1
            goto L19
        L9:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            int r1 = (int) r1
            goto L19
        L16:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L19:
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <K, V> java.util.Map<K, V> m15723(@Yue.InterfaceC4418 Yue.C4677<? extends K, ? extends V> r1) {
            java.lang.String r0 = "pair"
            Yue.C3329.m13906(r1, r0)
            java.lang.Object r0 = r1.m18540()
            java.lang.Object r1 = r1.m18541()
            java.util.Map r1 = java.util.Collections.singletonMap(r0, r1)
            java.lang.String r0 = "singletonMap(pair.first, pair.second)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <K, V> java.util.SortedMap<K, V> m15724(@Yue.InterfaceC4418 java.util.Comparator<? super K> r1, @Yue.InterfaceC4418 Yue.C4677<? extends K, ? extends V>... r2) {
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "pairs"
            Yue.C3329.m13906(r2, r0)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r1)
            Yue.C3901.m15789(r0, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <K extends java.lang.Comparable<? super K>, V> java.util.SortedMap<K, V> m15725(@Yue.InterfaceC4418 Yue.C4677<? extends K, ? extends V>... r1) {
            java.lang.String r0 = "pairs"
            Yue.C3329.m13906(r1, r0)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            Yue.C3901.m15789(r0, r1)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final java.util.Properties m15726(java.util.Map<java.lang.String, java.lang.String> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r0.putAll(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <K, V> java.util.Map<K, V> m15727(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.util.Map r1 = java.util.Collections.singletonMap(r0, r1)
            java.lang.String r0 = "with(entries.iterator().…ingletonMap(key, value) }"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final <K, V> java.util.Map<K, V> m15728(java.util.Map<K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.Map r1 = m15727(r1)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final <K extends java.lang.Comparable<? super K>, V> java.util.SortedMap<K, V> m15729(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final <K, V> java.util.SortedMap<K, V> m15730(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r1, @Yue.InterfaceC4418 java.util.Comparator<? super K> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r2, r0)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r2)
            r0.putAll(r1)
            return r0
    }
}
