package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
public class C1207 {
    public C1207() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static <E> java.util.List<E> m6180(@Yue.InterfaceC4418 java.util.List<E> r1) {
            java.lang.String r0 = "builder"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥ۠ۧۢۡ r1 = (Yue.C3624) r1
            java.util.List r1 = r1.m14658()
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <E> java.util.List<E> m6181(int r1, Yue.InterfaceC2825<? super java.util.List<E>, Yue.C6593> r2) {
            java.lang.String r0 = "builderAction"
            Yue.C3329.m13906(r2, r0)
            java.util.List r1 = m6189(r1)
            r2.invoke(r1)
            java.util.List r1 = m6180(r1)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <E> java.util.List<E> m6182(Yue.InterfaceC2825<? super java.util.List<E>, Yue.C6593> r1) {
            java.lang.String r0 = "builderAction"
            Yue.C3329.m13906(r1, r0)
            java.util.List r0 = m6188()
            r1.invoke(r0)
            java.util.List r1 = m6180(r0)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m6183(int r3) {
            if (r3 >= 0) goto L17
            r0 = 3
            r1 = 0
            r2 = 1
            boolean r0 = Yue.C4778.m19027(r2, r0, r1)
            if (r0 == 0) goto Lf
            Yue.C1208.m6227()
            goto L17
        Lf:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r0 = "Count overflow has happened."
            r3.<init>(r0)
            throw r3
        L17:
            return r3
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m6184(int r3) {
            if (r3 >= 0) goto L17
            r0 = 3
            r1 = 0
            r2 = 1
            boolean r0 = Yue.C4778.m19027(r2, r0, r1)
            if (r0 == 0) goto Lf
            Yue.C1208.m6228()
            goto L17
        Lf:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r0 = "Index overflow has happened."
            r3.<init>(r0)
            throw r3
        L17:
            return r3
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.Object[] m6185(java.util.Collection<?> r1) {
            java.lang.String r0 = "collection"
            Yue.C3329.m13906(r1, r0)
            java.lang.Object[] r1 = Yue.C1204.m6175(r1)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> T[] m6186(java.util.Collection<?> r1, T[] r2) {
            java.lang.String r0 = "collection"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object[] r1 = Yue.C1204.m6176(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> java.lang.Object[] m6187(@Yue.InterfaceC4418 T[] r1, boolean r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            if (r2 == 0) goto L14
            java.lang.Class r2 = r1.getClass()
            boolean r2 = Yue.C3329.m13897(r2, r0)
            if (r2 == 0) goto L14
            goto L1e
        L14:
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2, r0)
            java.lang.String r2 = "copyOf(this, this.size, Array<Any?>::class.java)"
            Yue.C3329.m13905(r1, r2)
        L1e:
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static <E> java.util.List<E> m6188() {
            Yue.ۥ۠ۧۢۡ r0 = new Yue.ۥ۠ۧۢۡ
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static <E> java.util.List<E> m6189(int r1) {
            Yue.ۥ۠ۧۢۡ r0 = new Yue.ۥ۠ۧۢۡ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static <T> java.util.List<T> m6190(T r1) {
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r0 = "singletonList(element)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <T> java.util.List<T> m6191(@Yue.InterfaceC4418 java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.List r1 = Yue.C1219.m6539(r1)
            java.util.Collections.shuffle(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T> java.util.List<T> m6192(@Yue.InterfaceC4418 java.lang.Iterable<? extends T> r1, @Yue.InterfaceC4418 java.util.Random r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "random"
            Yue.C3329.m13906(r2, r0)
            java.util.List r1 = Yue.C1219.m6539(r1)
            java.util.Collections.shuffle(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final <T> java.util.List<T> m6193(java.util.Enumeration<T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.ArrayList r1 = java.util.Collections.list(r1)
            java.lang.String r0 = "list(this)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }
}
