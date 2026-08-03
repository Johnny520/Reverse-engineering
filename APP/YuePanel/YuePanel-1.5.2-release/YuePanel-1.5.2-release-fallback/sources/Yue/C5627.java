package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\n_SequencesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,172:1\n1433#2,14:173\n1839#2,14:187\n*S KotlinDebug\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n*L\n89#1:173,14\n126#1:187,14\n*E\n"})
public class C5627 extends Yue.C5616 {

    /* JADX INFO: renamed from: Yue.ۥۡۨۢۥ$ۥ, reason: contains not printable characters */
    public static final class C5628 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Object, java.lang.Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.Class<R> f20750;

        public C5628(java.lang.Class<R> r1) {
                r0 = this;
                r0.f20750 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.Boolean r1 = r0.m21022(r1)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.Boolean m21022(@Yue.InterfaceC4543 java.lang.Object r2) {
                r1 = this;
                java.lang.Class<R> r0 = r1.f20750
                boolean r2 = r0.isInstance(r2)
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
        }
    }

    public C5627() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final <R> Yue.InterfaceC5609<R> m21006(@Yue.InterfaceC4418 Yue.InterfaceC5609<?> r1, @Yue.InterfaceC4418 java.lang.Class<R> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "klass"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۡۨۢۥ$ۥ r0 = new Yue.ۥۡۨۢۥ$ۥ
            r0.<init>(r2)
            Yue.ۥۡۨۢ r1 = Yue.C5629.m21054(r1, r0)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>"
            Yue.C3329.m13904(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final <C extends java.util.Collection<? super R>, R> C m21007(@Yue.InterfaceC4418 Yue.InterfaceC5609<?> r2, @Yue.InterfaceC4418 C r3, @Yue.InterfaceC4418 java.lang.Class<R> r4) {
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
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Comparable m21008(Yue.InterfaceC5609 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Comparable r1 = Yue.C5629.m21119(r1)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use maxOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.maxOrNull()", imports = {}))
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Double m21009(Yue.InterfaceC5609 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Double r1 = Yue.C5629.m21120(r1)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use maxOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.maxOrNull()", imports = {}))
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Float m21010(Yue.InterfaceC5609 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Float r1 = Yue.C5629.m21121(r1)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use maxByOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ <T, R extends java.lang.Comparable<? super R>> T m21011(Yue.InterfaceC5609<? extends T> r5, Yue.InterfaceC2825<? super T, ? extends R> r6) {
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
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object m21012(Yue.InterfaceC5609 r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object r1 = Yue.C5629.m21125(r1, r2)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use minOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Comparable m21013(Yue.InterfaceC5609 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Comparable r1 = Yue.C5629.m21137(r1)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use minOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.minOrNull()", imports = {}))
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Double m21014(Yue.InterfaceC5609 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Double r1 = Yue.C5629.m21138(r1)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use minOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.minOrNull()", imports = {}))
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Float m21015(Yue.InterfaceC5609 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Float r1 = Yue.C5629.m21139(r1)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use minByOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ <T, R extends java.lang.Comparable<? super R>> T m21016(Yue.InterfaceC5609<? extends T> r5, Yue.InterfaceC2825<? super T, ? extends R> r6) {
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
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object m21017(Yue.InterfaceC5609 r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object r1 = Yue.C5629.m21143(r1, r2)
            return r1
    }

    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    @Yue.InterfaceC3421(name = "sumOfBigDecimal")
    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final <T> java.math.BigDecimal m21018(Yue.InterfaceC5609<? extends T> r2, Yue.InterfaceC2825<? super T, ? extends java.math.BigDecimal> r3) {
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
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final <T> java.math.BigInteger m21019(Yue.InterfaceC5609<? extends T> r2, Yue.InterfaceC2825<? super T, ? extends java.math.BigInteger> r3) {
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
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final <T extends java.lang.Comparable<? super T>> java.util.SortedSet<T> m21020(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r1 = Yue.C5629.m21195(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final <T> java.util.SortedSet<T> m21021(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r1, @Yue.InterfaceC4418 java.util.Comparator<? super T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r2, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r2)
            java.util.Collection r1 = Yue.C5629.m21195(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }
}
