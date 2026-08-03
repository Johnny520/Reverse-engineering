package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1096 {
    public C1096() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m5842(int r5) {
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            r1 = 2
            r2 = 36
            r0.<init>(r1, r2)
            boolean r0 = r0.m13745(r5)
            if (r0 == 0) goto Lf
            return r5
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "radix "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = " was not in valid range "
            r3.append(r5)
            Yue.ۥ۠ۥۣۨ r5 = new Yue.ۥ۠ۥۣۨ
            r5.<init>(r1, r2)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r0.<init>(r5)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int m5843(char r0, int r1) {
            int r0 = java.lang.Character.digit(r0, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Yue.EnumC1076 m5844(char r1) {
            Yue.ۥ۟ۤۢۤ$ۥ r0 = Yue.EnumC1076.f3152
            int r1 = java.lang.Character.getType(r1)
            Yue.ۥ۟ۤۢۤ r1 = r0.m5744(r1)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Yue.EnumC1081 m5845(char r1) {
            Yue.ۥ۟ۤۢۨ$ۥ۟ r0 = Yue.EnumC1081.f3198
            byte r1 = java.lang.Character.getDirectionality(r1)
            Yue.ۥ۟ۤۢۨ r1 = r0.m5758(r1)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final boolean m5846(char r0) {
            boolean r0 = java.lang.Character.isDefined(r0)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final boolean m5847(char r0) {
            boolean r0 = java.lang.Character.isDigit(r0)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean m5848(char r0) {
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m5849(char r0) {
            boolean r0 = java.lang.Character.isISOControl(r0)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m5850(char r0) {
            boolean r0 = java.lang.Character.isIdentifierIgnorable(r0)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean m5851(char r0) {
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r0)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean m5852(char r0) {
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r0)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final boolean m5853(char r0) {
            boolean r0 = java.lang.Character.isLetter(r0)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean m5854(char r0) {
            boolean r0 = java.lang.Character.isLetterOrDigit(r0)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final boolean m5855(char r0) {
            boolean r0 = java.lang.Character.isLowSurrogate(r0)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final boolean m5856(char r0) {
            boolean r0 = java.lang.Character.isLowerCase(r0)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final boolean m5857(char r0) {
            boolean r0 = java.lang.Character.isTitleCase(r0)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final boolean m5858(char r0) {
            boolean r0 = java.lang.Character.isUpperCase(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final boolean m5859(char r1) {
            boolean r0 = java.lang.Character.isWhitespace(r1)
            if (r0 != 0) goto Lf
            boolean r1 = java.lang.Character.isSpaceChar(r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final java.lang.String m5860(char r1) {
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            Yue.C3329.m13904(r1, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final java.lang.String m5861(char r1, @Yue.InterfaceC4418 java.util.Locale r2) {
            java.lang.String r0 = "locale"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            Yue.C3329.m13904(r1, r0)
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "this as java.lang.String).toLowerCase(locale)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final char m5862(char r0) {
            char r0 = java.lang.Character.toLowerCase(r0)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final java.lang.String m5863(char r3, @Yue.InterfaceC4418 java.util.Locale r4) {
            java.lang.String r0 = "locale"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r4 = m5869(r3, r4)
            int r0 = r4.length()
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r2 = 1
            if (r0 <= r2) goto L46
            r0 = 329(0x149, float:4.61E-43)
            if (r3 != r0) goto L17
            goto L45
        L17:
            r3 = 0
            char r3 = r4.charAt(r3)
            Yue.C3329.m13904(r4, r1)
            java.lang.String r4 = r4.substring(r2)
            java.lang.String r0 = "this as java.lang.String).substring(startIndex)"
            Yue.C3329.m13905(r4, r0)
            Yue.C3329.m13904(r4, r1)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            Yue.C3329.m13905(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L45:
            return r4
        L46:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            Yue.C3329.m13904(r0, r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            Yue.C3329.m13905(r0, r1)
            boolean r0 = Yue.C3329.m13897(r4, r0)
            if (r0 != 0) goto L5f
            return r4
        L5f:
            char r3 = java.lang.Character.toTitleCase(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            return r3
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final char m5864(char r0) {
            char r0 = java.lang.Character.toTitleCase(r0)
            return r0
    }

    @Yue.InterfaceC1818(warningSince = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(message = "Use lowercaseChar() instead.", replaceWith = @Yue.InterfaceC5313(expression = "lowercaseChar()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final char m5865(char r0) {
            char r0 = java.lang.Character.toLowerCase(r0)
            return r0
    }

    @Yue.InterfaceC1818(warningSince = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(message = "Use titlecaseChar() instead.", replaceWith = @Yue.InterfaceC5313(expression = "titlecaseChar()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final char m5866(char r0) {
            char r0 = java.lang.Character.toTitleCase(r0)
            return r0
    }

    @Yue.InterfaceC1818(warningSince = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(message = "Use uppercaseChar() instead.", replaceWith = @Yue.InterfaceC5313(expression = "uppercaseChar()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final char m5867(char r0) {
            char r0 = java.lang.Character.toUpperCase(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final java.lang.String m5868(char r1) {
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            Yue.C3329.m13904(r1, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r0)
            java.lang.String r0 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final java.lang.String m5869(char r1, @Yue.InterfaceC4418 java.util.Locale r2) {
            java.lang.String r0 = "locale"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            Yue.C3329.m13904(r1, r0)
            java.lang.String r1 = r1.toUpperCase(r2)
            java.lang.String r2 = "this as java.lang.String).toUpperCase(locale)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final char m5870(char r0) {
            char r0 = java.lang.Character.toUpperCase(r0)
            return r0
    }
}
