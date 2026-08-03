package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1239#2,14:109\n1521#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
public class C5995 extends Yue.C5989 {
    public C5995() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۢۡ, reason: contains not printable characters */
    public static final char m22503(java.lang.CharSequence r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            char r1 = r1.charAt(r2)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use maxOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ۢۡ۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Character m22504(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Character r1 = Yue.C5996.m22600(r1)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use maxByOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ۢۡ۠, reason: contains not printable characters */
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Character m22505(java.lang.CharSequence r6, Yue.InterfaceC2825<? super java.lang.Character, ? extends R> r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r7, r0)
            int r0 = r6.length()
            if (r0 != 0) goto L12
            r6 = 0
            goto L5b
        L12:
            r0 = 0
            char r0 = r6.charAt(r0)
            int r1 = Yue.C5989.m22355(r6)
            if (r1 != 0) goto L22
            java.lang.Character r6 = java.lang.Character.valueOf(r0)
            goto L5b
        L22:
            java.lang.Character r2 = java.lang.Character.valueOf(r0)
            java.lang.Object r2 = r7.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            Yue.ۥ۠ۥۣۨ r3 = new Yue.ۥ۠ۥۣۨ
            r4 = 1
            r3.<init>(r4, r1)
            Yue.ۥ۠ۥۣۥ r1 = r3.m13740()
        L36:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L57
            int r3 = r1.mo2006()
            char r3 = r6.charAt(r3)
            java.lang.Character r4 = java.lang.Character.valueOf(r3)
            java.lang.Object r4 = r7.invoke(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r5 = r2.compareTo(r4)
            if (r5 >= 0) goto L36
            r0 = r3
            r2 = r4
            goto L36
        L57:
            java.lang.Character r6 = java.lang.Character.valueOf(r0)
        L5b:
            return r6
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use maxWithOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ۢۡۡ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Character m22506(java.lang.CharSequence r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r2, r0)
            java.lang.Character r1 = Yue.C5996.m22602(r1, r2)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use minOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ۢۡۢ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Character m22507(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Character r1 = Yue.C5996.m22614(r1)
            return r1
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use minByOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟ۢۡ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Character m22508(java.lang.CharSequence r6, Yue.InterfaceC2825<? super java.lang.Character, ? extends R> r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r7, r0)
            int r0 = r6.length()
            if (r0 != 0) goto L12
            r6 = 0
            goto L5b
        L12:
            r0 = 0
            char r0 = r6.charAt(r0)
            int r1 = Yue.C5989.m22355(r6)
            if (r1 != 0) goto L22
            java.lang.Character r6 = java.lang.Character.valueOf(r0)
            goto L5b
        L22:
            java.lang.Character r2 = java.lang.Character.valueOf(r0)
            java.lang.Object r2 = r7.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            Yue.ۥ۠ۥۣۨ r3 = new Yue.ۥ۠ۥۣۨ
            r4 = 1
            r3.<init>(r4, r1)
            Yue.ۥ۠ۥۣۥ r1 = r3.m13740()
        L36:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L57
            int r3 = r1.mo2006()
            char r3 = r6.charAt(r3)
            java.lang.Character r4 = java.lang.Character.valueOf(r3)
            java.lang.Object r4 = r7.invoke(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r5 = r2.compareTo(r4)
            if (r5 <= 0) goto L36
            r0 = r3
            r2 = r4
            goto L36
        L57:
            java.lang.Character r6 = java.lang.Character.valueOf(r0)
        L5b:
            return r6
    }

    @Yue.InterfaceC1818(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Yue.InterfaceC1816(message = "Use minWithOrNull instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ۢۡۤ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Character m22509(java.lang.CharSequence r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r2, r0)
            java.lang.Character r1 = Yue.C5996.m22616(r1, r2)
            return r1
    }

    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    @Yue.InterfaceC3421(name = "sumOfBigDecimal")
    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۢۡۥ, reason: contains not printable characters */
    public static final java.math.BigDecimal m22510(java.lang.CharSequence r3, Yue.InterfaceC2825<? super java.lang.Character, ? extends java.math.BigDecimal> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r4, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(this.toLong())"
            Yue.C3329.m13905(r0, r1)
            r1 = 0
        L16:
            int r2 = r3.length()
            if (r1 >= r2) goto L36
            char r2 = r3.charAt(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r2)
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            java.math.BigDecimal r0 = r0.add(r2)
            java.lang.String r2 = "this.add(other)"
            Yue.C3329.m13905(r0, r2)
            int r1 = r1 + 1
            goto L16
        L36:
            return r0
    }

    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.4")
    @Yue.InterfaceC3421(name = "sumOfBigInteger")
    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۢۡۦ, reason: contains not printable characters */
    public static final java.math.BigInteger m22511(java.lang.CharSequence r3, Yue.InterfaceC2825<? super java.lang.Character, ? extends java.math.BigInteger> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "selector"
            Yue.C3329.m13906(r4, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(this.toLong())"
            Yue.C3329.m13905(r0, r1)
            r1 = 0
        L16:
            int r2 = r3.length()
            if (r1 >= r2) goto L36
            char r2 = r3.charAt(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r2)
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            java.math.BigInteger r0 = r0.add(r2)
            java.lang.String r2 = "this.add(other)"
            Yue.C3329.m13905(r0, r2)
            int r1 = r1 + 1
            goto L16
        L36:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۢۡۧ, reason: contains not printable characters */
    public static final java.util.SortedSet<java.lang.Character> m22512(@Yue.InterfaceC4418 java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r1 = Yue.C5996.m22667(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }
}
