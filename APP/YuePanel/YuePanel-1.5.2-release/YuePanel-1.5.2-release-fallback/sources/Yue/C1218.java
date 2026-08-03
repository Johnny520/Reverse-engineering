package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\n_CollectionsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1963#2,14:169\n2333#2,14:183\n*S KotlinDebug\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n*L\n89#1:169,14\n126#1:183,14\n*E\n"})
public class C1218 extends Yue.C1217 {
    public C1218() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final <R> java.util.List<R> m6287(@Yue.InterfaceC4418 java.lang.Iterable<?> r1, @Yue.InterfaceC4418 java.lang.Class<R> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "klass"
            Yue.C3329.m13906(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r1 = m6288(r1, r0, r2)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final <C extends java.util.Collection<? super R>, R> C m6288(@Yue.InterfaceC4418 java.lang.Iterable<?> r2, @Yue.InterfaceC4418 C r3, @Yue.InterfaceC4418 java.lang.Class<R> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "destination"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "klass"
            Yue.C3329.m13906(r4, r0)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r2.next()
            boolean r1 = r4.isInstance(r0)
            if (r1 == 0) goto L13
            r3.add(r0)
            goto L13
        L27:
            return r3
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use maxOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Comparable m6289(java.lang.Iterable r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Comparable r1 = Yue.C1219.m6427(r1)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use maxOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.maxOrNull()", imports = {}))
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Double m6290(java.lang.Iterable r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Double r1 = Yue.C1219.m6428(r1)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use maxOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.maxOrNull()", imports = {}))
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Float m6291(java.lang.Iterable r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Float r1 = Yue.C1219.m6429(r1)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use maxByOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static final /* synthetic */ <T, R extends java.lang.Comparable<? super R>> T m6292(java.lang.Iterable<? extends T> r5, Yue.InterfaceC2825<? super T, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L16
            r5 = 0
            goto L41
        L16:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L22
        L20:
            r5 = r0
            goto L41
        L22:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L28:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 >= 0) goto L3a
            r0 = r2
            r1 = r3
        L3a:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L28
            goto L20
        L41:
            return r5
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use maxWithOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object m6293(java.lang.Iterable r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object r1 = Yue.C1219.m6433(r1, r2)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use minOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Comparable m6294(java.lang.Iterable r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Comparable r1 = Yue.C1219.m6445(r1)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use minOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.minOrNull()", imports = {}))
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Double m6295(java.lang.Iterable r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Double r1 = Yue.C1219.m6446(r1)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use minOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.minOrNull()", imports = {}))
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Float m6296(java.lang.Iterable r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Float r1 = Yue.C1219.m6447(r1)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use minByOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static final /* synthetic */ <T, R extends java.lang.Comparable<? super R>> T m6297(java.lang.Iterable<? extends T> r5, Yue.InterfaceC2825<? super T, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L16
            r5 = 0
            goto L41
        L16:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L22
        L20:
            r5 = r0
            goto L41
        L22:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L28:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 <= 0) goto L3a
            r0 = r2
            r1 = r3
        L3a:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L28
            goto L20
        L41:
            return r5
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use minWithOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object m6298(java.lang.Iterable r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object r1 = Yue.C1219.m6451(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static <T> void m6299(@Yue.InterfaceC4418 java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.Collections.reverse(r1)
            return
    }

    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    @Yue.InterfaceC3421(name = "sumOfBigDecimal")
    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final <T> java.math.BigDecimal m6300(java.lang.Iterable<? extends T> r2, Yue.InterfaceC2825<? super T, ? extends java.math.BigDecimal> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(this.toLong())"
            Yue.C3329.m13905(r0, r1)
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            java.math.BigDecimal r0 = r0.add(r1)
            java.lang.String r1 = "this.add(other)"
            Yue.C3329.m13905(r0, r1)
            goto L19
        L33:
            return r0
    }

    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    @Yue.InterfaceC3421(name = "sumOfBigInteger")
    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public static final <T> java.math.BigInteger m6301(java.lang.Iterable<? extends T> r2, Yue.InterfaceC2825<? super T, ? extends java.math.BigInteger> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(this.toLong())"
            Yue.C3329.m13905(r0, r1)
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            java.math.BigInteger r0 = r0.add(r1)
            java.lang.String r1 = "this.add(other)"
            Yue.C3329.m13905(r0, r1)
            goto L19
        L33:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public static final <T extends java.lang.Comparable<? super T>> java.util.SortedSet<T> m6302(@Yue.InterfaceC4418 java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r1 = Yue.C1219.m6532(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public static final <T> java.util.SortedSet<T> m6303(@Yue.InterfaceC4418 java.lang.Iterable<? extends T> r1, @Yue.InterfaceC4418 java.util.Comparator<? super T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r2, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r2)
            java.util.Collection r1 = Yue.C1219.m6532(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }
}
