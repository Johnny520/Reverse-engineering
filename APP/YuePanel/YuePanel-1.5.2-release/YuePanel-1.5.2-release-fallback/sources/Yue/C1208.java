package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,481:1\n404#1:483\n1#2:482\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n398#1:483\n*E\n"})
public class C1208 extends Yue.C1207 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۟ۥۣۡ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n*L\n1#1,481:1\n*E\n"})
    public static final class C1209<T> extends Yue.AbstractC3560 implements Yue.InterfaceC2825<T, java.lang.Integer> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2825<T, K> f3754;

        /* JADX INFO: Incorrect field signature: TK; */
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ java.lang.Comparable f3755;

        /* JADX WARN: Incorrect types in method signature: (LYue/ۥۣ۠ۡ۟<-TT;+TK;>;TK;)V */
        public C1209(Yue.InterfaceC2825 r1, java.lang.Comparable r2) {
                r0 = this;
                r0.f3754 = r1
                r0.f3755 = r2
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.Integer r1 = r0.m6229(r1)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.Integer m6229(T r2) {
                r1 = this;
                Yue.ۥۣ۠ۡ۟<T, K> r0 = r1.f3754
                java.lang.Object r2 = r0.invoke(r2)
                java.lang.Comparable r2 = (java.lang.Comparable) r2
                java.lang.Comparable r0 = r1.f3755
                int r2 = Yue.C1395.m6935(r2, r0)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
        }
    }

    public C1208() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> java.util.List<T> m6194(int r3, Yue.InterfaceC2825<? super java.lang.Integer, ? extends T> r4) {
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r1 = 0
        Lb:
            if (r1 >= r3) goto L1b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r4.invoke(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto Lb
        L1b:
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final <T> java.util.List<T> m6195(int r3, Yue.InterfaceC2825<? super java.lang.Integer, ? extends T> r4) {
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r1 = 0
        Lb:
            if (r1 >= r3) goto L1b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r4.invoke(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto Lb
        L1b:
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final <T> java.util.ArrayList<T> m6196() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final <T> java.util.ArrayList<T> m6197(@Yue.InterfaceC4418 T... r3) {
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.length
            if (r0 != 0) goto Le
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L1a
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            Yue.ۥ۟ۡۦۦ r1 = new Yue.ۥ۟ۡۦۦ
            r2 = 1
            r1.<init>(r3, r2)
            r0.<init>(r1)
            r3 = r0
        L1a:
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final <T> java.util.Collection<T> m6198(@Yue.InterfaceC4418 T[] r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۟ۡۦۦ r0 = new Yue.ۥ۟ۡۦۦ
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final <T> int m6199(@Yue.InterfaceC4418 java.util.List<? extends T> r2, int r3, int r4, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, java.lang.Integer> r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "comparison"
            Yue.C3329.m13906(r5, r0)
            int r0 = r2.size()
            m6225(r0, r3, r4)
            int r4 = r4 + (-1)
        L13:
            if (r3 > r4) goto L32
            int r0 = r3 + r4
            int r0 = r0 >>> 1
            java.lang.Object r1 = r2.get(r0)
            java.lang.Object r1 = r5.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 >= 0) goto L2c
            int r3 = r0 + 1
            goto L13
        L2c:
            if (r1 <= 0) goto L31
            int r4 = r0 + (-1)
            goto L13
        L31:
            return r0
        L32:
            int r3 = r3 + 1
            int r2 = -r3
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final <T extends java.lang.Comparable<? super T>> int m6200(@Yue.InterfaceC4418 java.util.List<? extends T> r2, @Yue.InterfaceC4543 T r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.size()
            m6225(r0, r4, r5)
            int r5 = r5 + (-1)
        Le:
            if (r4 > r5) goto L29
            int r0 = r4 + r5
            int r0 = r0 >>> 1
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = Yue.C1395.m6935(r1, r3)
            if (r1 >= 0) goto L23
            int r4 = r0 + 1
            goto Le
        L23:
            if (r1 <= 0) goto L28
            int r5 = r0 + (-1)
            goto Le
        L28:
            return r0
        L29:
            int r4 = r4 + 1
            int r2 = -r4
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final <T> int m6201(@Yue.InterfaceC4418 java.util.List<? extends T> r2, T r3, @Yue.InterfaceC4418 java.util.Comparator<? super T> r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r4, r0)
            int r0 = r2.size()
            m6225(r0, r5, r6)
            int r6 = r6 + (-1)
        L13:
            if (r5 > r6) goto L2c
            int r0 = r5 + r6
            int r0 = r0 >>> 1
            java.lang.Object r1 = r2.get(r0)
            int r1 = r4.compare(r1, r3)
            if (r1 >= 0) goto L26
            int r5 = r0 + 1
            goto L13
        L26:
            if (r1 <= 0) goto L2b
            int r6 = r0 + (-1)
            goto L13
        L2b:
            return r0
        L2c:
            int r5 = r5 + 1
            int r2 = -r5
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static /* synthetic */ int m6202(java.util.List r0, int r1, int r2, Yue.InterfaceC2825 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r4 = r4 & 2
            if (r4 == 0) goto Ld
            int r2 = r0.size()
        Ld:
            int r0 = m6199(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ int m6203(java.util.List r0, java.lang.Comparable r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r0.size()
        Ld:
            int r0 = m6200(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static /* synthetic */ int m6204(java.util.List r0, java.lang.Object r1, java.util.Comparator r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 4
            if (r6 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 8
            if (r5 == 0) goto Ld
            int r4 = r0.size()
        Ld:
            int r0 = m6201(r0, r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final <T, K extends java.lang.Comparable<? super K>> int m6205(@Yue.InterfaceC4418 java.util.List<? extends T> r1, @Yue.InterfaceC4543 K r2, int r3, int r4, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, ? extends K> r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r5, r0)
            Yue.ۥ۟ۥۣۡ$ۥ r0 = new Yue.ۥ۟ۥۣۡ$ۥ
            r0.<init>(r5, r2)
            int r1 = m6199(r1, r3, r4, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static /* synthetic */ int m6206(java.util.List r0, java.lang.Comparable r1, int r2, int r3, Yue.InterfaceC2825 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r2 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto Ld
            int r3 = r0.size()
        Ld:
            Yue.ۥ۟ۥۣۡ$ۥ r5 = new Yue.ۥ۟ۥۣۡ$ۥ
            r5.<init>(r4, r1)
            int r0 = m6199(r0, r2, r3, r5)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final <E> java.util.List<E> m6207(int r1, @Yue.InterfaceC0861 Yue.InterfaceC2825<? super java.util.List<E>, Yue.C6593> r2) {
            java.lang.String r0 = "builderAction"
            Yue.C3329.m13906(r2, r0)
            java.util.List r1 = Yue.C1207.m6189(r1)
            r2.invoke(r1)
            java.util.List r1 = Yue.C1207.m6180(r1)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final <E> java.util.List<E> m6208(@Yue.InterfaceC0861 Yue.InterfaceC2825<? super java.util.List<E>, Yue.C6593> r1) {
            java.lang.String r0 = "builderAction"
            Yue.C3329.m13906(r1, r0)
            java.util.List r0 = Yue.C1207.m6188()
            r1.invoke(r0)
            java.util.List r1 = Yue.C1207.m6180(r0)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final <T> boolean m6209(java.util.Collection<? extends T> r1, java.util.Collection<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            boolean r1 = r1.containsAll(r2)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static <T> java.util.List<T> m6210() {
            Yue.ۥ۠۠ۨ۟ r0 = Yue.C2145.f6733
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static Yue.C3279 m6211(@Yue.InterfaceC4418 java.util.Collection<?> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            int r2 = r2.size()
            int r2 = r2 + (-1)
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static <T> int m6212(@Yue.InterfaceC4418 java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r1 = r1.size()
            int r1 = r1 + (-1)
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;LYue/ۥۣ۠۠ۨ<+TR;>;)TR; */
    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final java.lang.Object m6213(java.util.Collection r1, Yue.InterfaceC2823 r2) {
            java.lang.String r0 = "defaultValue"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lf
            java.lang.Object r1 = r2.invoke()
        Lf:
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final <T> boolean m6214(java.util.Collection<? extends T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final <T> boolean m6215(java.util.Collection<? extends T> r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final <T> java.util.List<T> m6216() {
            java.util.List r0 = m6210()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static <T> java.util.List<T> m6217(@Yue.InterfaceC4418 T... r1) {
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r1, r0)
            int r0 = r1.length
            if (r0 <= 0) goto Ld
            java.util.List r1 = Yue.C0586.m2116(r1)
            goto L11
        Ld:
            java.util.List r1 = m6210()
        L11:
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final <T> java.util.List<T> m6218(@Yue.InterfaceC4543 T r0) {
            if (r0 == 0) goto L7
            java.util.List r0 = Yue.C1207.m6190(r0)
            goto Lb
        L7:
            java.util.List r0 = m6210()
        Lb:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static <T> java.util.List<T> m6219(@Yue.InterfaceC4418 T... r1) {
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r1, r0)
            java.util.List r1 = Yue.C0595.m2746(r1)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final <T> java.util.List<T> m6220() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static <T> java.util.List<T> m6221(@Yue.InterfaceC4418 T... r3) {
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.length
            if (r0 != 0) goto Le
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L1a
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            Yue.ۥ۟ۡۦۦ r1 = new Yue.ۥ۟ۡۦۦ
            r2 = 1
            r1.<init>(r3, r2)
            r0.<init>(r1)
            r3 = r0
        L1a:
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final <T> java.util.List<T> m6222(@Yue.InterfaceC4418 java.util.List<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L19
            r1 = 1
            if (r0 == r1) goto Lf
            goto L1d
        Lf:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = Yue.C1207.m6190(r2)
            goto L1d
        L19:
            java.util.List r2 = m6210()
        L1d:
            return r2
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final <T> java.util.Collection<T> m6223(java.util.Collection<? extends T> r0) {
            if (r0 != 0) goto L6
            java.util.List r0 = m6210()
        L6:
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final <T> java.util.List<T> m6224(java.util.List<? extends T> r0) {
            if (r0 != 0) goto L6
            java.util.List r0 = m6210()
        L6:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final void m6225(int r3, int r4, int r5) {
            java.lang.String r0 = ")."
            java.lang.String r1 = "fromIndex ("
            if (r4 > r5) goto L47
            if (r4 < 0) goto L2d
            if (r5 > r3) goto Lb
            return
        Lb:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "toIndex ("
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ") is greater than size ("
            r1.append(r5)
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        L2d:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = ") is less than zero."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L47:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = ") is greater than toIndex ("
            r2.append(r4)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r3.<init>(r4)
            throw r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final <T> java.util.List<T> m6226(@Yue.InterfaceC4418 java.lang.Iterable<? extends T> r1, @Yue.InterfaceC4418 Yue.AbstractC5185 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "random"
            Yue.C3329.m13906(r2, r0)
            java.util.List r1 = Yue.C1219.m6539(r1)
            Yue.C1219.m6494(r1, r2)
            return r1
    }

    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static void m6227() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Count overflow has happened."
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m6228() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Index overflow has happened."
            r0.<init>(r1)
            throw r0
    }
}
