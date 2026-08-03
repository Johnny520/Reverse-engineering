package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\n_Maps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n96#1,5:595\n111#1,5:600\n152#1,3:605\n143#1:608\n215#1:609\n216#1:611\n144#1:612\n215#1:613\n216#1:615\n1#2:610\n1#2:614\n1940#3,14:616\n1963#3,14:630\n2310#3,14:644\n2333#3,14:658\n1864#3,3:672\n*S KotlinDebug\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n76#1:595,5\n89#1:600,5\n125#1:605,3\n135#1:608\n135#1:609\n135#1:611\n135#1:612\n143#1:613\n143#1:615\n135#1:610\n230#1:616,14\n241#1:630,14\n390#1:644,14\n401#1:658,14\n574#1:672,3\n*E\n"})
public class C3903 extends Yue.C3902 {
    public C3903() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final <K, V> boolean m15806(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r2.isEmpty()
            r1 = 1
            if (r0 == 0) goto L12
            return r1
        L12:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1a
            r2 = 0
            return r2
        L34:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final <K, V> boolean m15807(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final <K, V> boolean m15808(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r2.isEmpty()
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            r2 = 1
            return r2
        L34:
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final <K, V> java.lang.Iterable<java.util.Map.Entry<K, V>> m15809(java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.Set r1 = r1.entrySet()
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final <K, V> Yue.InterfaceC5609<java.util.Map.Entry<K, V>> m15810(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.Set r1 = r1.entrySet()
            Yue.ۥۡۨۢ r1 = Yue.C1219.m6308(r1)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final <K, V> int m15811(java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r1 = r1.size()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final <K, V> int m15812(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r2.isEmpty()
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            int r1 = r1 + 1
            goto L1a
        L35:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final <K, V, R> R m15813(java.util.Map<? extends K, ? extends V> r1, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 != 0) goto L26
            goto L12
        L25:
            r0 = 0
        L26:
            if (r0 == 0) goto L29
            return r0
        L29:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "No element of the map was transformed to a non-null value."
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static final <K, V, R> R m15814(java.util.Map<? extends K, ? extends V> r1, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 == 0) goto L12
            return r0
        L25:
            r1 = 0
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final <K, V, R> java.util.List<R> m15815(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends java.lang.Iterable<? extends R>> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            Yue.C1216.m6247(r0, r1)
            goto L17
        L2d:
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    @Yue.InterfaceC3421(name = "flatMapSequence")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final <K, V, R> java.util.List<R> m15816(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends Yue.InterfaceC5609<? extends R>> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r3.invoke(r1)
            Yue.ۥۡۨۢ r1 = (Yue.InterfaceC5609) r1
            Yue.C1216.m6246(r0, r1)
            goto L17
        L2d:
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    @Yue.InterfaceC3421(name = "flatMapSequenceTo")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final <K, V, R, C extends java.util.Collection<? super R>> C m15817(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r1, @Yue.InterfaceC4418 C r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends Yue.InterfaceC5609<? extends R>> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "destination"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r3, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r3.invoke(r0)
            Yue.ۥۡۨۢ r0 = (Yue.InterfaceC5609) r0
            Yue.C1216.m6246(r2, r0)
            goto L17
        L2d:
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final <K, V, R, C extends java.util.Collection<? super R>> C m15818(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r1, @Yue.InterfaceC4418 C r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends java.lang.Iterable<? extends R>> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "destination"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r3, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            Yue.C1216.m6247(r2, r0)
            goto L17
        L2d:
            return r2
    }

    @Yue.InterfaceC3037
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final <K, V> void m15819(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, Yue.C6593> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r2.invoke(r0)
            goto L12
        L22:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final <K, V, R> java.util.List<R> m15820(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r3.invoke(r1)
            r0.add(r1)
            goto L1b
        L2f:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final <K, V, R> java.util.List<R> m15821(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r3.invoke(r1)
            if (r1 == 0) goto L17
            r0.add(r1)
            goto L17
        L2d:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final <K, V, R, C extends java.util.Collection<? super R>> C m15822(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r1, @Yue.InterfaceC4418 C r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "destination"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r3, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r3.invoke(r0)
            if (r0 == 0) goto L17
            r2.add(r0)
            goto L17
        L2d:
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final <K, V, R, C extends java.util.Collection<? super R>> C m15823(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r1, @Yue.InterfaceC4418 C r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "destination"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r3, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r3.invoke(r0)
            r2.add(r0)
            goto L17
        L2b:
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static final <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> m15824(java.util.Map<? extends K, ? extends V> r5, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r6, r0)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L1a
            r5 = 0
            goto L45
        L1a:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L26
        L24:
            r5 = r0
            goto L45
        L26:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L2c:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 >= 0) goto L3e
            r0 = r2
            r1 = r3
        L3e:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L2c
            goto L24
        L45:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            return r5
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.7")
    @Yue.InterfaceC3421(name = "maxByOrThrow")
    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static final <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> m15825(java.util.Map<? extends K, ? extends V> r5, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r6, r0)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L23
            goto L41
        L23:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L29:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 >= 0) goto L3b
            r0 = r2
            r1 = r3
        L3b:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L29
        L41:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
        L44:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            r5.<init>()
            throw r5
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final <K, V> double m15826(java.util.Map<? extends K, ? extends V> r4, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r5, r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L26:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.max(r0, r2)
            goto L26
        L3f:
            return r0
        L40:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static final <K, V> float m15827(java.util.Map<? extends K, ? extends V> r2, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Float> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r3, r0)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L26:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.max(r0, r1)
            goto L26
        L3f:
            return r0
        L40:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static final <K, V, R extends java.lang.Comparable<? super R>> R m15828(java.util.Map<? extends K, ? extends V> r3, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r4, r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L22:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L22
            r0 = r1
            goto L22
        L3a:
            return r0
        L3b:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static final <K, V, R extends java.lang.Comparable<? super R>> R m15829(java.util.Map<? extends K, ? extends V> r3, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r4, r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L1a
            r3 = 0
            goto L3d
        L1a:
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L24:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L24
            r0 = r1
            goto L24
        L3c:
            r3 = r0
        L3d:
            return r3
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static final <K, V> java.lang.Double m15830(java.util.Map<? extends K, ? extends V> r4, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r5, r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L1a
            r4 = 0
            goto L45
        L1a:
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L28:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.max(r0, r2)
            goto L28
        L41:
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
        L45:
            return r4
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static final <K, V> java.lang.Float m15831(java.util.Map<? extends K, ? extends V> r2, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Float> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r3, r0)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L1a
            r2 = 0
            goto L45
        L1a:
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L28:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.max(r0, r1)
            goto L28
        L41:
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
        L45:
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final <K, V, R> R m15832(java.util.Map<? extends K, ? extends V> r3, java.util.Comparator<? super R> r4, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r5, r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r5.invoke(r0)
        L25:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r5.invoke(r1)
            int r2 = r4.compare(r0, r1)
            if (r2 >= 0) goto L25
            r0 = r1
            goto L25
        L3b:
            return r0
        L3c:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public static final <K, V, R> R m15833(java.util.Map<? extends K, ? extends V> r3, java.util.Comparator<? super R> r4, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r5, r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L1f
            r3 = 0
            goto L3e
        L1f:
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r5.invoke(r0)
        L27:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r5.invoke(r1)
            int r2 = r4.compare(r0, r1)
            if (r2 >= 0) goto L27
            r0 = r1
            goto L27
        L3d:
            r3 = r0
        L3e:
            return r3
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public static final <K, V> java.util.Map.Entry<K, V> m15834(java.util.Map<? extends K, ? extends V> r1, java.util.Comparator<? super java.util.Map.Entry<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.lang.Object r1 = Yue.C1219.m6433(r1, r2)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.7")
    @Yue.InterfaceC3421(name = "maxWithOrThrow")
    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public static final <K, V> java.util.Map.Entry<K, V> m15835(java.util.Map<? extends K, ? extends V> r1, java.util.Comparator<? super java.util.Map.Entry<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.lang.Object r1 = Yue.C1219.m6434(r1, r2)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static final <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> m15836(java.util.Map<? extends K, ? extends V> r5, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r6, r0)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L1a
            r5 = 0
            goto L45
        L1a:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L26
        L24:
            r5 = r0
            goto L45
        L26:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L2c:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 <= 0) goto L3e
            r0 = r2
            r1 = r3
        L3e:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L2c
            goto L24
        L45:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            return r5
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.7")
    @Yue.InterfaceC3421(name = "minByOrThrow")
    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static final <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> m15837(java.util.Map<? extends K, ? extends V> r5, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r6, r0)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L23
            goto L41
        L23:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L29:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 <= 0) goto L3b
            r0 = r2
            r1 = r3
        L3b:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L29
        L41:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
        L44:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            r5.<init>()
            throw r5
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static final <K, V> double m15838(java.util.Map<? extends K, ? extends V> r4, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r5, r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L26:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.min(r0, r2)
            goto L26
        L3f:
            return r0
        L40:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static final <K, V> float m15839(java.util.Map<? extends K, ? extends V> r2, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Float> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r3, r0)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L26:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.min(r0, r1)
            goto L26
        L3f:
            return r0
        L40:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static final <K, V, R extends java.lang.Comparable<? super R>> R m15840(java.util.Map<? extends K, ? extends V> r3, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r4, r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L22:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L22
            r0 = r1
            goto L22
        L3a:
            return r0
        L3b:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static final <K, V, R extends java.lang.Comparable<? super R>> R m15841(java.util.Map<? extends K, ? extends V> r3, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r4, r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L1a
            r3 = 0
            goto L3d
        L1a:
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L24:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L24
            r0 = r1
            goto L24
        L3c:
            r3 = r0
        L3d:
            return r3
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static final <K, V> java.lang.Double m15842(java.util.Map<? extends K, ? extends V> r4, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r5, r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L1a
            r4 = 0
            goto L45
        L1a:
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L28:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.min(r0, r2)
            goto L28
        L41:
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
        L45:
            return r4
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final <K, V> java.lang.Float m15843(java.util.Map<? extends K, ? extends V> r2, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Float> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r3, r0)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L1a
            r2 = 0
            goto L45
        L1a:
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L28:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.min(r0, r1)
            goto L28
        L41:
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
        L45:
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public static final <K, V, R> R m15844(java.util.Map<? extends K, ? extends V> r3, java.util.Comparator<? super R> r4, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r5, r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r5.invoke(r0)
        L25:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r5.invoke(r1)
            int r2 = r4.compare(r0, r1)
            if (r2 <= 0) goto L25
            r0 = r1
            goto L25
        L3b:
            return r0
        L3c:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public static final <K, V, R> R m15845(java.util.Map<? extends K, ? extends V> r3, java.util.Comparator<? super R> r4, Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r5, r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L1f
            r3 = 0
            goto L3e
        L1f:
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r5.invoke(r0)
        L27:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r5.invoke(r1)
            int r2 = r4.compare(r0, r1)
            if (r2 <= 0) goto L27
            r0 = r1
            goto L27
        L3d:
            r3 = r0
        L3e:
            return r3
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public static final <K, V> java.util.Map.Entry<K, V> m15846(java.util.Map<? extends K, ? extends V> r1, java.util.Comparator<? super java.util.Map.Entry<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.lang.Object r1 = Yue.C1219.m6451(r1, r2)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.7")
    @Yue.InterfaceC3421(name = "minWithOrThrow")
    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public static final <K, V> java.util.Map.Entry<K, V> m15847(java.util.Map<? extends K, ? extends V> r1, java.util.Comparator<? super java.util.Map.Entry<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.lang.Object r1 = Yue.C1219.m6452(r1, r2)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public static final <K, V> boolean m15848(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r1 = r1.isEmpty()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public static final <K, V> boolean m15849(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r2.isEmpty()
            r1 = 1
            if (r0 == 0) goto L12
            return r1
        L12:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            r2 = 0
            return r2
        L34:
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public static final <K, V, M extends java.util.Map<? extends K, ? extends V>> M m15850(@Yue.InterfaceC4418 M r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.util.Map.Entry<? extends K, ? extends V>, Yue.C6593> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r3, r0)
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r3.invoke(r1)
            goto L12
        L22:
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public static final <K, V, M extends java.util.Map<? extends K, ? extends V>> M m15851(@Yue.InterfaceC4418 M r4, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.lang.Integer, ? super java.util.Map.Entry<? extends K, ? extends V>, Yue.C6593> r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r5, r0)
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            int r3 = r1 + 1
            if (r1 >= 0) goto L24
            Yue.C1208.m6228()
        L24:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.invoke(r1, r2)
            r1 = r3
            goto L13
        L2d:
            return r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public static final <K, V> java.util.List<Yue.C4677<K, V>> m15852(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            int r0 = r4.size()
            if (r0 != 0) goto L10
            java.util.List r4 = Yue.C1208.m6210()
            return r4
        L10:
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L23
            java.util.List r4 = Yue.C1208.m6210()
            return r4
        L23:
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L41
            Yue.ۥۣۡۦ۠ r4 = new Yue.ۥۣۡۦ۠
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r4.<init>(r0, r1)
            java.util.List r4 = Yue.C1207.m6190(r4)
            return r4
        L41:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r4.size()
            r2.<init>(r4)
            Yue.ۥۣۡۦ۠ r4 = new Yue.ۥۣۡۦ۠
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r4.<init>(r3, r1)
            r2.add(r4)
        L5a:
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            Yue.ۥۣۡۦ۠ r1 = new Yue.ۥۣۡۦ۠
            java.lang.Object r3 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r1.<init>(r3, r4)
            r2.add(r1)
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L5a
            return r2
    }
}
