package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,805:1\n1174#2,2:806\n1#3:808\n1726#4,3:809\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:806,2\n600#1:809,3\n*E\n"})
public class C5988 extends Yue.C5987 {
    public C5988() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final java.lang.String m22248(java.lang.StringBuffer r1) {
            java.lang.String r0 = "stringBuffer"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final java.lang.String m22249(java.lang.StringBuilder r1) {
            java.lang.String r0 = "stringBuilder"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final java.lang.String m22250(byte[] r2) {
            java.lang.String r0 = "bytes"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = Yue.C1099.f3261
            r0.<init>(r2, r1)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final java.lang.String m22251(byte[] r2, int r3, int r4) {
            java.lang.String r0 = "bytes"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = Yue.C1099.f3261
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static final java.lang.String m22252(byte[] r1, int r2, int r3, java.nio.charset.Charset r4) {
            java.lang.String r0 = "bytes"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static final java.lang.String m22253(byte[] r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "bytes"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final java.lang.String m22254(char[] r1) {
            java.lang.String r0 = "chars"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static final java.lang.String m22255(char[] r1, int r2, int r3) {
            java.lang.String r0 = "chars"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static final java.lang.String m22256(int[] r1, int r2, int r3) {
            java.lang.String r0 = "codePoints"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC1818(warningSince = "1.5")
    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(message = "Use replaceFirstChar instead.", replaceWith = @Yue.InterfaceC5313(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static final java.lang.String m22257(@Yue.InterfaceC4418 java.lang.String r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = "getDefault()"
            Yue.C3329.m13905(r0, r1)
            java.lang.String r2 = m22258(r2, r0)
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(message = "Use replaceFirstChar instead.", replaceWith = @Yue.InterfaceC5313(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @Yue.InterfaceC5792(version = "1.4")
    @Yue.InterfaceC1818(warningSince = "1.5")
    @Yue.InterfaceC3834
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static final java.lang.String m22258(@Yue.InterfaceC4418 java.lang.String r5, @Yue.InterfaceC4418 java.util.Locale r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "locale"
            Yue.C3329.m13906(r6, r0)
            int r0 = r5.length()
            if (r0 <= 0) goto L5e
            r0 = 0
            char r1 = r5.charAt(r0)
            boolean r2 = java.lang.Character.isLowerCase(r1)
            if (r2 == 0) goto L5e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            char r3 = java.lang.Character.toTitleCase(r1)
            char r1 = java.lang.Character.toUpperCase(r1)
            r4 = 1
            if (r3 == r1) goto L2f
            r2.append(r3)
            goto L49
        L2f:
            java.lang.String r0 = r5.substring(r0, r4)
            java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r0, r1)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            Yue.C3329.m13904(r0, r1)
            java.lang.String r6 = r0.toUpperCase(r6)
            java.lang.String r0 = "this as java.lang.String).toUpperCase(locale)"
            Yue.C3329.m13905(r6, r0)
            r2.append(r6)
        L49:
            java.lang.String r5 = r5.substring(r4)
            java.lang.String r6 = "this as java.lang.String).substring(startIndex)"
            Yue.C3329.m13905(r5, r6)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            java.lang.String r6 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r5, r6)
        L5e:
            return r5
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static final int m22259(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r1 = r1.codePointAt(r2)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final int m22260(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r1 = r1.codePointBefore(r2)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public static final int m22261(java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r1 = r1.codePointCount(r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public static final int m22262(@Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4418 java.lang.String r2, boolean r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r2, r0)
            if (r3 == 0) goto L11
            int r1 = r1.compareToIgnoreCase(r2)
            return r1
        L11:
            int r1 = r1.compareTo(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ int m22263(java.lang.String r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            int r0 = m22262(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static java.lang.String m22264(@Yue.InterfaceC4418 char[] r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static java.lang.String m22265(@Yue.InterfaceC4418 char[] r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r2.length
            r0.m398(r3, r4, r1)
            java.lang.String r0 = new java.lang.String
            int r4 = r4 - r3
            r0.<init>(r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22266(char[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            java.lang.String r0 = m22265(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static final boolean m22267(@Yue.InterfaceC4543 java.lang.CharSequence r1, @Yue.InterfaceC4543 java.lang.CharSequence r2) {
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto Ld
            if (r2 == 0) goto Ld
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.contentEquals(r2)
            goto L11
        Ld:
            boolean r1 = Yue.C5989.m22344(r1, r2)
        L11:
            return r1
    }

    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static final boolean m22268(@Yue.InterfaceC4543 java.lang.CharSequence r0, @Yue.InterfaceC4543 java.lang.CharSequence r1, boolean r2) {
            if (r2 == 0) goto L7
            boolean r0 = Yue.C5989.m22343(r0, r1)
            goto Lb
        L7:
            boolean r0 = m22267(r0, r1)
        Lb:
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static final boolean m22269(java.lang.String r1, java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "charSequence"
            Yue.C3329.m13906(r2, r0)
            boolean r1 = r1.contentEquals(r2)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static final boolean m22270(java.lang.String r1, java.lang.StringBuffer r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "stringBuilder"
            Yue.C3329.m13906(r2, r0)
            boolean r1 = r1.contentEquals(r2)
            return r1
    }

    @Yue.InterfaceC1818(warningSince = "1.5")
    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(message = "Use replaceFirstChar instead.", replaceWith = @Yue.InterfaceC5313(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final java.lang.String m22271(@Yue.InterfaceC4418 java.lang.String r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            int r0 = r4.length()
            if (r0 <= 0) goto L46
            r0 = 0
            char r1 = r4.charAt(r0)
            boolean r1 = java.lang.Character.isLowerCase(r1)
            if (r1 != 0) goto L46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 1
            java.lang.String r0 = r4.substring(r0, r2)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r0, r3)
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            Yue.C3329.m13904(r0, r3)
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r3 = "this as java.lang.String).toLowerCase()"
            Yue.C3329.m13905(r0, r3)
            r1.append(r0)
            java.lang.String r4 = r4.substring(r2)
            java.lang.String r0 = "this as java.lang.String).substring(startIndex)"
            Yue.C3329.m13905(r4, r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
        L46:
            return r4
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(message = "Use replaceFirstChar instead.", replaceWith = @Yue.InterfaceC5313(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @Yue.InterfaceC5792(version = "1.4")
    @Yue.InterfaceC1818(warningSince = "1.5")
    @Yue.InterfaceC3834
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public static final java.lang.String m22272(@Yue.InterfaceC4418 java.lang.String r4, @Yue.InterfaceC4418 java.util.Locale r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "locale"
            Yue.C3329.m13906(r5, r0)
            int r0 = r4.length()
            if (r0 <= 0) goto L4b
            r0 = 0
            char r1 = r4.charAt(r0)
            boolean r1 = java.lang.Character.isLowerCase(r1)
            if (r1 != 0) goto L4b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 1
            java.lang.String r0 = r4.substring(r0, r2)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r0, r3)
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            Yue.C3329.m13904(r0, r3)
            java.lang.String r5 = r0.toLowerCase(r5)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(locale)"
            Yue.C3329.m13905(r5, r0)
            r1.append(r5)
            java.lang.String r4 = r4.substring(r2)
            java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
            Yue.C3329.m13905(r4, r5)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
        L4b:
            return r4
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public static final java.lang.String m22273(@Yue.InterfaceC4418 byte[] r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = Yue.C1099.f3261
            r0.<init>(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public static final java.lang.String m22274(@Yue.InterfaceC4418 byte[] r2, int r3, int r4, boolean r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r2.length
            r0.m398(r3, r4, r1)
            if (r5 != 0) goto L16
            java.lang.String r5 = new java.lang.String
            int r4 = r4 - r3
            java.nio.charset.Charset r0 = Yue.C1099.f3261
            r5.<init>(r2, r3, r4, r0)
            return r5
        L16:
            java.nio.charset.Charset r5 = Yue.C1099.f3261
            java.nio.charset.CharsetDecoder r5 = r5.newDecoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPORT
            java.nio.charset.CharsetDecoder r5 = r5.onMalformedInput(r0)
            java.nio.charset.CharsetDecoder r5 = r5.onUnmappableCharacter(r0)
            int r4 = r4 - r3
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2, r3, r4)
            java.nio.CharBuffer r2 = r5.decode(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "decoder.decode(ByteBuffe…- startIndex)).toString()"
            Yue.C3329.m13905(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22275(byte[] r1, int r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = r0
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lb
            int r3 = r1.length
        Lb:
            r5 = r5 & 4
            if (r5 == 0) goto L10
            r4 = r0
        L10:
            java.lang.String r1 = m22274(r1, r2, r3, r4)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public static final byte[] m22276(@Yue.InterfaceC4418 java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.nio.charset.Charset r0 = Yue.C1099.f3261
            byte[] r1 = r1.getBytes(r0)
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public static final byte[] m22277(@Yue.InterfaceC4418 java.lang.String r2, int r3, int r4, boolean r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r2.length()
            r0.m398(r3, r4, r1)
            if (r5 != 0) goto L2a
            java.lang.String r2 = r2.substring(r3, r4)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r2, r3)
            java.nio.charset.Charset r3 = Yue.C1099.f3261
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            Yue.C3329.m13904(r2, r4)
            byte[] r2 = r2.getBytes(r3)
            java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
            Yue.C3329.m13905(r2, r3)
            return r2
        L2a:
            java.nio.charset.Charset r5 = Yue.C1099.f3261
            java.nio.charset.CharsetEncoder r5 = r5.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPORT
            java.nio.charset.CharsetEncoder r5 = r5.onMalformedInput(r0)
            java.nio.charset.CharsetEncoder r5 = r5.onUnmappableCharacter(r0)
            java.nio.CharBuffer r2 = java.nio.CharBuffer.wrap(r2, r3, r4)
            java.nio.ByteBuffer r2 = r5.encode(r2)
            boolean r3 = r2.hasArray()
            if (r3 == 0) goto L66
            int r3 = r2.arrayOffset()
            if (r3 != 0) goto L66
            int r3 = r2.remaining()
            byte[] r4 = r2.array()
            Yue.C3329.m13903(r4)
            int r4 = r4.length
            if (r3 != r4) goto L66
            byte[] r2 = r2.array()
            java.lang.String r3 = "{\n        byteBuffer.array()\n    }"
            Yue.C3329.m13905(r2, r3)
            goto L70
        L66:
            int r3 = r2.remaining()
            byte[] r3 = new byte[r3]
            r2.get(r3)
            r2 = r3
        L70:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public static /* synthetic */ byte[] m22278(java.lang.String r1, int r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = r0
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Le
            int r3 = r1.length()
        Le:
            r5 = r5 & 4
            if (r5 == 0) goto L13
            r4 = r0
        L13:
            byte[] r1 = m22277(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public static boolean m22279(@Yue.InterfaceC4418 java.lang.String r7, @Yue.InterfaceC4418 java.lang.String r8, boolean r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "suffix"
            Yue.C3329.m13906(r8, r0)
            if (r9 != 0) goto L11
            boolean r7 = r7.endsWith(r8)
            return r7
        L11:
            int r9 = r7.length()
            int r0 = r8.length()
            int r2 = r9 - r0
            int r5 = r8.length()
            r6 = 1
            r4 = 0
            r1 = r7
            r3 = r8
            boolean r7 = m22298(r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ boolean m22280(java.lang.String r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = m22279(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public static boolean m22281(@Yue.InterfaceC4543 java.lang.String r0, @Yue.InterfaceC4543 java.lang.String r1, boolean r2) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
        L8:
            if (r2 != 0) goto Lf
            boolean r0 = r0.equals(r1)
            goto L13
        Lf:
            boolean r0 = r0.equalsIgnoreCase(r1)
        L13:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ boolean m22282(java.lang.String r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = m22281(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public static final java.lang.String m22283(Yue.C5968 r1, java.lang.String r2, java.lang.Object... r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = "format"
            Yue.C3329.m13906(r2, r1)
            java.lang.String r1 = "args"
            Yue.C3329.m13906(r3, r1)
            int r1 = r3.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "format(format, *args)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public static final java.lang.String m22284(Yue.C5968 r1, java.util.Locale r2, java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = "format"
            Yue.C3329.m13906(r3, r1)
            java.lang.String r1 = "args"
            Yue.C3329.m13906(r4, r1)
            int r1 = r4.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r1 = java.lang.String.format(r2, r3, r1)
            java.lang.String r2 = "format(locale, format, *args)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public static final java.lang.String m22285(java.lang.String r1, java.util.Locale r2, java.lang.Object... r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "args"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String r1 = java.lang.String.format(r2, r1, r3)
            java.lang.String r2 = "format(locale, this, *args)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public static final java.lang.String m22286(java.lang.String r1, java.lang.Object... r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "args"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.String r2 = "format(this, *args)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public static java.util.Comparator<java.lang.String> m22287(@Yue.InterfaceC4418 Yue.C5968 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            java.lang.String r0 = "CASE_INSENSITIVE_ORDER"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public static final java.lang.String m22288(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = r1.intern()
            java.lang.String r0 = "this as java.lang.String).intern()"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public static final boolean m22289(@Yue.InterfaceC4418 java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length()
            if (r0 == 0) goto L3a
            Yue.ۥ۠ۥۣۨ r0 = Yue.C5989.m22354(r2)
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L1d
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1d
            goto L3a
        L1d:
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            r1 = r0
            Yue.ۥ۠ۥۣۥ r1 = (Yue.AbstractC3275) r1
            int r1 = r1.mo2006()
            char r1 = r2.charAt(r1)
            boolean r1 = Yue.C1096.m5859(r1)
            if (r1 != 0) goto L21
            r2 = 0
            goto L3b
        L3a:
            r2 = 1
        L3b:
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public static final java.lang.String m22290(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public static final java.lang.String m22291(java.lang.String r1, java.util.Locale r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "locale"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "this as java.lang.String).toLowerCase(locale)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public static final int m22292(java.lang.String r1, char r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r1 = r1.indexOf(r2, r3)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static final int m22293(java.lang.String r1, java.lang.String r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "str"
            Yue.C3329.m13906(r2, r0)
            int r1 = r1.indexOf(r2, r3)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public static final int m22294(java.lang.String r1, char r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r1 = r1.lastIndexOf(r2, r3)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public static final int m22295(java.lang.String r1, java.lang.String r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "str"
            Yue.C3329.m13906(r2, r0)
            int r1 = r1.lastIndexOf(r2, r3)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public static final int m22296(java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r1 = r1.offsetByCodePoints(r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public static final boolean m22297(@Yue.InterfaceC4418 java.lang.CharSequence r7, int r8, @Yue.InterfaceC4418 java.lang.CharSequence r9, int r10, int r11, boolean r12) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r9, r0)
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L21
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L21
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            r3 = r9
            java.lang.String r3 = (java.lang.String) r3
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            boolean r7 = m22298(r1, r2, r3, r4, r5, r6)
            return r7
        L21:
            boolean r7 = Yue.C5989.m22399(r7, r8, r9, r10, r11, r12)
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public static boolean m22298(@Yue.InterfaceC4418 java.lang.String r6, int r7, @Yue.InterfaceC4418 java.lang.String r8, int r9, int r10, boolean r11) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r8, r0)
            if (r11 != 0) goto L11
            boolean r6 = r6.regionMatches(r7, r8, r9, r10)
            goto L1b
        L11:
            r0 = r6
            r1 = r11
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            boolean r6 = r0.regionMatches(r1, r2, r3, r4, r5)
        L1b:
            return r6
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static /* synthetic */ boolean m22299(java.lang.CharSequence r6, int r7, java.lang.CharSequence r8, int r9, int r10, boolean r11, int r12, java.lang.Object r13) {
            r12 = r12 & 16
            if (r12 == 0) goto L5
            r11 = 0
        L5:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r6 = m22297(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ boolean m22300(java.lang.String r6, int r7, java.lang.String r8, int r9, int r10, boolean r11, int r12, java.lang.Object r13) {
            r12 = r12 & 16
            if (r12 == 0) goto L5
            r11 = 0
        L5:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r6 = m22298(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static java.lang.String m22301(@Yue.InterfaceC4418 java.lang.CharSequence r3, int r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            if (r4 < 0) goto L59
            java.lang.String r0 = ""
            if (r4 == 0) goto L58
            r1 = 1
            if (r4 == r1) goto L54
            int r2 = r3.length()
            if (r2 == 0) goto L58
            if (r2 == r1) goto L40
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r2 = r3.length()
            int r2 = r2 * r4
            r0.<init>(r2)
            Yue.ۥ۠ۥۣۨ r2 = new Yue.ۥ۠ۥۣۨ
            r2.<init>(r1, r4)
            Yue.ۥ۠ۥۣۥ r4 = r2.m13740()
        L29:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L36
            r4.mo2006()
            r0.append(r3)
            goto L29
        L36:
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "{\n                    va…tring()\n                }"
            Yue.C3329.m13905(r0, r3)
            goto L58
        L40:
            r0 = 0
            char r3 = r3.charAt(r0)
            char[] r1 = new char[r4]
        L47:
            if (r0 >= r4) goto L4e
            r1[r0] = r3
            int r0 = r0 + 1
            goto L47
        L4e:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L58
        L54:
            java.lang.String r0 = r3.toString()
        L58:
            return r0
        L59:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Count 'n' must be non-negative, but was "
            r3.append(r0)
            r3.append(r4)
            r4 = 46
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static final java.lang.String m22302(@Yue.InterfaceC4418 java.lang.String r4, char r5, char r6, boolean r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            if (r7 != 0) goto L11
            java.lang.String r4 = r4.replace(r5, r6)
            java.lang.String r5 = "this as java.lang.String…replace(oldChar, newChar)"
            Yue.C3329.m13905(r4, r5)
            return r4
        L11:
            int r0 = r4.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 0
        L1b:
            int r2 = r4.length()
            if (r0 >= r2) goto L32
            char r2 = r4.charAt(r0)
            boolean r3 = Yue.C1097.m5877(r2, r5, r7)
            if (r3 == 0) goto L2c
            r2 = r6
        L2c:
            r1.append(r2)
            int r0 = r0 + 1
            goto L1b
        L32:
            java.lang.String r4 = r1.toString()
            java.lang.String r5 = "StringBuilder(capacity).…builderAction).toString()"
            Yue.C3329.m13905(r4, r5)
            return r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static final java.lang.String m22303(@Yue.InterfaceC4418 java.lang.String r6, @Yue.InterfaceC4418 java.lang.String r7, @Yue.InterfaceC4418 java.lang.String r8, boolean r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "oldValue"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "newValue"
            Yue.C3329.m13906(r8, r0)
            r0 = 0
            int r1 = Yue.C5989.m22360(r6, r7, r0, r9)
            if (r1 >= 0) goto L17
            return r6
        L17:
            int r2 = r7.length()
            r3 = 1
            int r3 = Yue.C5196.m19514(r2, r3)
            int r4 = r6.length()
            int r4 = r4 - r2
            int r5 = r8.length()
            int r4 = r4 + r5
            if (r4 < 0) goto L57
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
        L31:
            r5.append(r6, r0, r1)
            r5.append(r8)
            int r0 = r1 + r2
            int r4 = r6.length()
            if (r1 >= r4) goto L46
            int r1 = r1 + r3
            int r1 = Yue.C5989.m22360(r6, r7, r1, r9)
            if (r1 > 0) goto L31
        L46:
            int r7 = r6.length()
            r5.append(r6, r0, r7)
            java.lang.String r6 = r5.toString()
            java.lang.String r7 = "stringBuilder.append(this, i, length).toString()"
            Yue.C3329.m13905(r6, r7)
            return r6
        L57:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            r6.<init>()
            throw r6
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22304(java.lang.String r0, char r1, char r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = m22302(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22305(java.lang.String r0, java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = m22303(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۠ۥ, reason: contains not printable characters */
    public static final java.lang.String m22306(@Yue.InterfaceC4418 java.lang.String r7, char r8, char r9, boolean r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            r2 = r8
            r4 = r10
            int r8 = Yue.C5989.m22363(r1, r2, r3, r4, r5, r6)
            if (r8 >= 0) goto L12
            goto L20
        L12:
            int r10 = r8 + 1
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.CharSequence r7 = Yue.C5989.m22433(r7, r8, r10, r9)
            java.lang.String r7 = r7.toString()
        L20:
            return r7
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۠ۦ, reason: contains not printable characters */
    public static final java.lang.String m22307(@Yue.InterfaceC4418 java.lang.String r7, @Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 java.lang.String r9, boolean r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "oldValue"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "newValue"
            Yue.C3329.m13906(r9, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            r2 = r8
            r4 = r10
            int r10 = Yue.C5989.m22364(r1, r2, r3, r4, r5, r6)
            if (r10 >= 0) goto L1c
            goto L29
        L1c:
            int r8 = r8.length()
            int r8 = r8 + r10
            java.lang.CharSequence r7 = Yue.C5989.m22433(r7, r10, r8, r9)
            java.lang.String r7 = r7.toString()
        L29:
            return r7
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22308(java.lang.String r0, char r1, char r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = m22306(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22309(java.lang.String r0, java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = m22307(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۠ۤ, reason: contains not printable characters */
    public static final java.util.List<java.lang.String> m22310(@Yue.InterfaceC4418 java.lang.CharSequence r1, @Yue.InterfaceC4418 java.util.regex.Pattern r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "regex"
            Yue.C3329.m13906(r2, r0)
            Yue.C5989.m22437(r3)
            if (r3 != 0) goto L10
            r3 = -1
        L10:
            java.lang.String[] r1 = r2.split(r1, r3)
            java.lang.String r2 = "regex.split(this, if (limit == 0) -1 else limit)"
            Yue.C3329.m13905(r1, r2)
            java.util.List r1 = Yue.C0586.m2116(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ۟, reason: contains not printable characters */
    public static /* synthetic */ java.util.List m22311(java.lang.CharSequence r0, java.util.regex.Pattern r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.util.List r0 = m22310(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ۠, reason: contains not printable characters */
    public static boolean m22312(@Yue.InterfaceC4418 java.lang.String r6, @Yue.InterfaceC4418 java.lang.String r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "prefix"
            Yue.C3329.m13906(r7, r0)
            if (r9 != 0) goto L11
            boolean r6 = r6.startsWith(r7, r8)
            return r6
        L11:
            int r4 = r7.length()
            r3 = 0
            r0 = r6
            r1 = r8
            r2 = r7
            r5 = r9
            boolean r6 = m22298(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۡ, reason: contains not printable characters */
    public static boolean m22313(@Yue.InterfaceC4418 java.lang.String r6, @Yue.InterfaceC4418 java.lang.String r7, boolean r8) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "prefix"
            Yue.C3329.m13906(r7, r0)
            if (r8 != 0) goto L11
            boolean r6 = r6.startsWith(r7)
            return r6
        L11:
            int r4 = r7.length()
            r1 = 0
            r3 = 0
            r0 = r6
            r2 = r7
            r5 = r8
            boolean r6 = m22298(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۢ, reason: contains not printable characters */
    public static /* synthetic */ boolean m22314(java.lang.String r0, java.lang.String r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            boolean r0 = m22312(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static /* synthetic */ boolean m22315(java.lang.String r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = m22313(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠ۤۤ, reason: contains not printable characters */
    public static final java.lang.String m22316(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = r1.substring(r2)
            java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠ۤۥ, reason: contains not printable characters */
    public static final java.lang.String m22317(java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠ۤۦ, reason: contains not printable characters */
    public static final byte[] m22318(java.lang.String r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r2, r0)
            byte[] r1 = r1.getBytes(r2)
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۧ, reason: contains not printable characters */
    public static /* synthetic */ byte[] m22319(java.lang.String r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            java.lang.String r2 = "charset"
            Yue.C3329.m13906(r1, r2)
            byte[] r0 = r0.getBytes(r1)
            java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠ۤۨ, reason: contains not printable characters */
    public static final char[] m22320(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            char[] r1 = r1.toCharArray()
            java.lang.String r0 = "this as java.lang.String).toCharArray()"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠ۥ, reason: contains not printable characters */
    public static final char[] m22321(@Yue.InterfaceC4418 java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r2.length()
            r0.m398(r3, r4, r1)
            int r0 = r4 - r3
            char[] r0 = new char[r0]
            r1 = 0
            r2.getChars(r3, r4, r0, r1)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠ۥ۟, reason: contains not printable characters */
    public static final char[] m22322(java.lang.String r1, char[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "destination"
            Yue.C3329.m13906(r2, r0)
            r1.getChars(r4, r5, r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥ۠, reason: contains not printable characters */
    public static /* synthetic */ char[] m22323(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            char[] r0 = m22321(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۡ, reason: contains not printable characters */
    public static /* synthetic */ char[] m22324(java.lang.String r1, char[] r2, int r3, int r4, int r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = r0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = r0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L13
            int r5 = r1.length()
        L13:
            java.lang.String r6 = "<this>"
            Yue.C3329.m13906(r1, r6)
            java.lang.String r6 = "destination"
            Yue.C3329.m13906(r2, r6)
            r1.getChars(r4, r5, r2, r3)
            return r2
    }

    @Yue.InterfaceC1818(warningSince = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(message = "Use lowercase() instead.", replaceWith = @Yue.InterfaceC5313(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    /* JADX INFO: renamed from: ۥ۟۠ۥۢ, reason: contains not printable characters */
    public static final java.lang.String m22325(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r0 = "this as java.lang.String).toLowerCase()"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC1818(warningSince = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(message = "Use lowercase() instead.", replaceWith = @Yue.InterfaceC5313(expression = "lowercase(locale)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۥۣ, reason: contains not printable characters */
    public static final java.lang.String m22326(java.lang.String r1, java.util.Locale r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "locale"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "this as java.lang.String).toLowerCase(locale)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠ۥۤ, reason: contains not printable characters */
    public static final java.util.regex.Pattern m22327(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r2)
            java.lang.String r2 = "compile(this, flags)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۥ, reason: contains not printable characters */
    public static /* synthetic */ java.util.regex.Pattern m22328(java.lang.String r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            java.lang.String r1 = "compile(this, flags)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Yue.InterfaceC1818(warningSince = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(message = "Use uppercase() instead.", replaceWith = @Yue.InterfaceC5313(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    /* JADX INFO: renamed from: ۥ۟۠ۥۦ, reason: contains not printable characters */
    public static final java.lang.String m22329(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = r1.toUpperCase()
            java.lang.String r0 = "this as java.lang.String).toUpperCase()"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC1818(warningSince = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(message = "Use uppercase() instead.", replaceWith = @Yue.InterfaceC5313(expression = "uppercase(locale)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۥۧ, reason: contains not printable characters */
    public static final java.lang.String m22330(java.lang.String r1, java.util.Locale r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "locale"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r1 = r1.toUpperCase(r2)
            java.lang.String r2 = "this as java.lang.String).toUpperCase(locale)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠ۥۨ, reason: contains not printable characters */
    public static final java.lang.String m22331(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r0)
            java.lang.String r0 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠ۦ, reason: contains not printable characters */
    public static final java.lang.String m22332(java.lang.String r1, java.util.Locale r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "locale"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r1 = r1.toUpperCase(r2)
            java.lang.String r2 = "this as java.lang.String).toUpperCase(locale)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }
}
