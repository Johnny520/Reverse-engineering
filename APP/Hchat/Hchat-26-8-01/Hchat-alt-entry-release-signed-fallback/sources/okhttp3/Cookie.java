package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Cookie {
    public static final okhttp3.Cookie.Companion Companion = null;
    private static final java.util.regex.Pattern DAY_OF_MONTH_PATTERN = null;
    private static final java.util.regex.Pattern MONTH_PATTERN = null;
    private static final java.util.regex.Pattern TIME_PATTERN = null;
    private static final java.util.regex.Pattern YEAR_PATTERN = null;
    private final java.lang.String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final java.lang.String name;
    private final java.lang.String path;
    private final boolean persistent;
    private final boolean secure;
    private final java.lang.String value;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Builder {
        private java.lang.String domain;
        private long expiresAt;
        private boolean hostOnly;
        private boolean httpOnly;
        private java.lang.String name;
        private java.lang.String path;
        private boolean persistent;
        private boolean secure;
        private java.lang.String value;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                r2.expiresAt = r0
                java.lang.String r0 = "/"
                r2.path = r0
                return
        }

        private final okhttp3.Cookie.Builder domain(java.lang.String r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = okhttp3.internal.HostnamesKt.toCanonicalHost(r2)
                if (r0 == 0) goto Lb
                r1.domain = r0
                r1.hostOnly = r3
                return r1
            Lb:
                java.lang.String r3 = "unexpected domain: "
                java.lang.String r2 = wb.en.g(r3, r2)
                j8.o.t(r2)
                r2 = 0
                return r2
        }

        public final okhttp3.Cookie build() {
                r12 = this;
                okhttp3.Cookie r0 = new okhttp3.Cookie
                java.lang.String r1 = r12.name
                if (r1 == 0) goto L2d
                java.lang.String r2 = r12.value
                if (r2 == 0) goto L26
                long r3 = r12.expiresAt
                java.lang.String r5 = r12.domain
                if (r5 == 0) goto L1f
                java.lang.String r6 = r12.path
                boolean r7 = r12.secure
                boolean r8 = r12.httpOnly
                boolean r9 = r12.persistent
                boolean r10 = r12.hostOnly
                r11 = 0
                r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
                return r0
            L1f:
                java.lang.String r0 = "builder.domain == null"
                bsh.j.c(r0)
                r0 = 0
                return r0
            L26:
                java.lang.String r0 = "builder.value == null"
                bsh.j.c(r0)
                r0 = 0
                return r0
            L2d:
                java.lang.String r0 = "builder.name == null"
                bsh.j.c(r0)
                r0 = 0
                return r0
        }

        public final okhttp3.Cookie.Builder domain(java.lang.String r2) {
                r1 = this;
                r2.getClass()
                r0 = 0
                okhttp3.Cookie$Builder r2 = r1.domain(r2, r0)
                return r2
        }

        public final okhttp3.Cookie.Builder expiresAt(long r4) {
                r3 = this;
                r0 = 0
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 > 0) goto L8
                r4 = -9223372036854775808
            L8:
                r0 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto L12
                r4 = r0
            L12:
                r3.expiresAt = r4
                r4 = 1
                r3.persistent = r4
                return r3
        }

        public final okhttp3.Cookie.Builder hostOnlyDomain(java.lang.String r2) {
                r1 = this;
                r2.getClass()
                r0 = 1
                okhttp3.Cookie$Builder r2 = r1.domain(r2, r0)
                return r2
        }

        public final okhttp3.Cookie.Builder httpOnly() {
                r1 = this;
                r0 = 1
                r1.httpOnly = r0
                return r1
        }

        public final okhttp3.Cookie.Builder name(java.lang.String r2) {
                r1 = this;
                r2.getClass()
                java.lang.CharSequence r0 = og.m.R0(r2)
                java.lang.String r0 = r0.toString()
                boolean r0 = gg.l.a(r0, r2)
                if (r0 == 0) goto L14
                r1.name = r2
                return r1
            L14:
                java.lang.String r2 = "name is not trimmed"
                j8.o.t(r2)
                r2 = 0
                return r2
        }

        public final okhttp3.Cookie.Builder path(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                java.lang.String r0 = "/"
                r1 = 0
                boolean r0 = og.t.d0(r3, r0, r1)
                if (r0 == 0) goto Lf
                r2.path = r3
                return r2
            Lf:
                java.lang.String r3 = "path must start with '/'"
                j8.o.t(r3)
                r3 = 0
                return r3
        }

        public final okhttp3.Cookie.Builder secure() {
                r1 = this;
                r0 = 1
                r1.secure = r0
                return r1
        }

        public final okhttp3.Cookie.Builder value(java.lang.String r2) {
                r1 = this;
                r2.getClass()
                java.lang.CharSequence r0 = og.m.R0(r2)
                java.lang.String r0 = r0.toString()
                boolean r0 = gg.l.a(r0, r2)
                if (r0 == 0) goto L14
                r1.value = r2
                return r1
            L14:
                java.lang.String r2 = "value is not trimmed"
                j8.o.t(r2)
                r2 = 0
                return r2
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ boolean access$domainMatch(okhttp3.Cookie.Companion r0, java.lang.String r1, java.lang.String r2) {
                boolean r0 = r0.domainMatch(r1, r2)
                return r0
        }

        public static final /* synthetic */ boolean access$pathMatch(okhttp3.Cookie.Companion r0, okhttp3.HttpUrl r1, java.lang.String r2) {
                boolean r0 = r0.pathMatch(r1, r2)
                return r0
        }

        private final int dateCharacterOffset(java.lang.String r5, int r6, int r7, boolean r8) {
                r4 = this;
            L0:
                if (r6 >= r7) goto L3c
                char r0 = r5.charAt(r6)
                r1 = 32
                r2 = 1
                if (r0 >= r1) goto Lf
                r1 = 9
                if (r0 != r1) goto L33
            Lf:
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 >= r1) goto L33
                r1 = 48
                r3 = 58
                if (r1 > r0) goto L1c
                if (r0 >= r3) goto L1c
                goto L33
            L1c:
                r1 = 97
                if (r1 > r0) goto L25
                r1 = 123(0x7b, float:1.72E-43)
                if (r0 >= r1) goto L25
                goto L33
            L25:
                r1 = 65
                if (r1 > r0) goto L2e
                r1 = 91
                if (r0 >= r1) goto L2e
                goto L33
            L2e:
                if (r0 != r3) goto L31
                goto L33
            L31:
                r0 = 0
                goto L34
            L33:
                r0 = r2
            L34:
                r1 = r8 ^ 1
                if (r0 != r1) goto L39
                return r6
            L39:
                int r6 = r6 + 1
                goto L0
            L3c:
                return r7
        }

        private final boolean domainMatch(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                boolean r0 = gg.l.a(r4, r5)
                r1 = 1
                if (r0 == 0) goto L8
                goto L27
            L8:
                r0 = 0
                boolean r2 = og.t.W(r4, r5, r0)
                if (r2 == 0) goto L28
                int r2 = r4.length()
                int r5 = r5.length()
                int r2 = r2 - r5
                int r2 = r2 - r1
                char r5 = r4.charAt(r2)
                r2 = 46
                if (r5 != r2) goto L28
                boolean r4 = okhttp3.internal.Util.canParseAsIpAddress(r4)
                if (r4 != 0) goto L28
            L27:
                return r1
            L28:
                return r0
        }

        private final java.lang.String parseDomain(java.lang.String r3) {
                r2 = this;
                r0 = 0
                java.lang.String r1 = "."
                boolean r0 = og.t.W(r3, r1, r0)
                if (r0 != 0) goto L19
                java.lang.String r3 = og.m.A0(r3, r1)
                java.lang.String r3 = okhttp3.internal.HostnamesKt.toCanonicalHost(r3)
                if (r3 == 0) goto L14
                return r3
            L14:
                j8.o.o()
            L17:
                r3 = 0
                return r3
            L19:
                java.lang.String r3 = "Failed requirement."
                j8.o.t(r3)
                goto L17
        }

        private final long parseExpires(java.lang.String r13, int r14, int r15) {
                r12 = this;
                r0 = 0
                int r14 = r12.dateCharacterOffset(r13, r14, r15, r0)
                java.util.regex.Pattern r1 = okhttp3.Cookie.access$getTIME_PATTERN$cp()
                java.util.regex.Matcher r1 = r1.matcher(r13)
                r2 = -1
                r3 = r2
                r4 = r3
                r5 = r4
                r6 = r5
                r7 = r6
                r8 = r7
            L14:
                r9 = 2
                r10 = 1
                if (r14 >= r15) goto Lc3
                int r11 = r14 + 1
                int r11 = r12.dateCharacterOffset(r13, r11, r15, r10)
                r1.region(r14, r11)
                if (r4 != r2) goto L54
                java.util.regex.Pattern r14 = okhttp3.Cookie.access$getTIME_PATTERN$cp()
                java.util.regex.Matcher r14 = r1.usePattern(r14)
                boolean r14 = r14.matches()
                if (r14 == 0) goto L54
                java.lang.String r14 = r1.group(r10)
                r14.getClass()
                int r4 = java.lang.Integer.parseInt(r14)
                java.lang.String r14 = r1.group(r9)
                r14.getClass()
                int r7 = java.lang.Integer.parseInt(r14)
                r14 = 3
                java.lang.String r14 = r1.group(r14)
                r14.getClass()
                int r8 = java.lang.Integer.parseInt(r14)
                goto Lbb
            L54:
                if (r5 != r2) goto L70
                java.util.regex.Pattern r14 = okhttp3.Cookie.access$getDAY_OF_MONTH_PATTERN$cp()
                java.util.regex.Matcher r14 = r1.usePattern(r14)
                boolean r14 = r14.matches()
                if (r14 == 0) goto L70
                java.lang.String r14 = r1.group(r10)
                r14.getClass()
                int r5 = java.lang.Integer.parseInt(r14)
                goto Lbb
            L70:
                if (r6 != r2) goto La0
                java.util.regex.Pattern r14 = okhttp3.Cookie.access$getMONTH_PATTERN$cp()
                java.util.regex.Matcher r14 = r1.usePattern(r14)
                boolean r14 = r14.matches()
                if (r14 == 0) goto La0
                java.lang.String r14 = r1.group(r10)
                r14.getClass()
                java.util.Locale r6 = java.util.Locale.US
                java.lang.String r14 = j8.b.l(r6, r14, r6)
                java.util.regex.Pattern r6 = okhttp3.Cookie.access$getMONTH_PATTERN$cp()
                java.lang.String r6 = r6.pattern()
                r6.getClass()
                r9 = 6
                int r14 = og.m.r0(r6, r14, r0, r0, r9)
                int r6 = r14 / 4
                goto Lbb
            La0:
                if (r3 != r2) goto Lbb
                java.util.regex.Pattern r14 = okhttp3.Cookie.access$getYEAR_PATTERN$cp()
                java.util.regex.Matcher r14 = r1.usePattern(r14)
                boolean r14 = r14.matches()
                if (r14 == 0) goto Lbb
                java.lang.String r14 = r1.group(r10)
                r14.getClass()
                int r3 = java.lang.Integer.parseInt(r14)
            Lbb:
                int r11 = r11 + 1
                int r14 = r12.dateCharacterOffset(r13, r11, r15, r0)
                goto L14
            Lc3:
                r13 = 70
                if (r13 > r3) goto Lcd
                r14 = 100
                if (r3 >= r14) goto Lcd
                int r3 = r3 + 1900
            Lcd:
                if (r3 < 0) goto Ld3
                if (r3 >= r13) goto Ld3
                int r3 = r3 + 2000
            Ld3:
                r13 = 1601(0x641, float:2.243E-42)
                java.lang.String r14 = "Failed requirement."
                if (r3 < r13) goto L13d
                if (r6 == r2) goto L137
                if (r10 > r5) goto L131
                r13 = 32
                if (r5 >= r13) goto L131
                if (r4 < 0) goto L12b
                r13 = 24
                if (r4 >= r13) goto L12b
                if (r7 < 0) goto L125
                r13 = 60
                if (r7 >= r13) goto L125
                if (r8 < 0) goto L11f
                if (r8 >= r13) goto L11f
                java.util.GregorianCalendar r13 = new java.util.GregorianCalendar
                java.util.TimeZone r14 = okhttp3.internal.Util.UTC
                r13.<init>(r14)
                r13.setLenient(r0)
                r13.set(r10, r3)
                int r6 = r6 - r10
                r13.set(r9, r6)
                r14 = 5
                r13.set(r14, r5)
                r14 = 11
                r13.set(r14, r4)
                r14 = 12
                r13.set(r14, r7)
                r14 = 13
                r13.set(r14, r8)
                r14 = 14
                r13.set(r14, r0)
                long r13 = r13.getTimeInMillis()
                return r13
            L11f:
                j8.o.t(r14)
                r13 = 0
                return r13
            L125:
                j8.o.t(r14)
                r13 = 0
                return r13
            L12b:
                j8.o.t(r14)
                r13 = 0
                return r13
            L131:
                j8.o.t(r14)
                r13 = 0
                return r13
            L137:
                j8.o.t(r14)
                r13 = 0
                return r13
            L13d:
                j8.o.t(r14)
                r13 = 0
                return r13
        }

        private final long parseMaxAge(java.lang.String r7) {
                r6 = this;
                r0 = -9223372036854775808
                long r2 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> Le
                r4 = 0
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 > 0) goto Ld
                return r0
            Ld:
                return r2
            Le:
                r2 = move-exception
                java.lang.String r3 = "-?\\d+"
                java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
                r3.getClass()
                r7.getClass()
                java.util.regex.Matcher r3 = r3.matcher(r7)
                boolean r3 = r3.matches()
                if (r3 == 0) goto L35
                java.lang.String r2 = "-"
                r3 = 0
                boolean r7 = og.t.d0(r7, r2, r3)
                if (r7 == 0) goto L2f
                goto L34
            L2f:
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L34:
                return r0
            L35:
                throw r2
        }

        private final boolean pathMatch(okhttp3.HttpUrl r3, java.lang.String r4) {
                r2 = this;
                java.lang.String r3 = r3.encodedPath()
                boolean r0 = gg.l.a(r3, r4)
                if (r0 == 0) goto Lb
                goto L27
            Lb:
                r0 = 0
                boolean r1 = og.t.d0(r3, r4, r0)
                if (r1 == 0) goto L29
                java.lang.String r1 = "/"
                boolean r1 = og.t.W(r4, r1, r0)
                if (r1 == 0) goto L1b
                goto L27
            L1b:
                int r4 = r4.length()
                char r3 = r3.charAt(r4)
                r4 = 47
                if (r3 != r4) goto L29
            L27:
                r3 = 1
                return r3
            L29:
                return r0
        }

        public final okhttp3.Cookie parse(okhttp3.HttpUrl r3, java.lang.String r4) {
                r2 = this;
                r3.getClass()
                r4.getClass()
                long r0 = java.lang.System.currentTimeMillis()
                okhttp3.Cookie r3 = r2.parse$okhttp(r0, r3, r4)
                return r3
        }

        public final okhttp3.Cookie parse$okhttp(long r26, okhttp3.HttpUrl r28, java.lang.String r29) {
                r25 = this;
                r0 = r25
                r28.getClass()
                r29.getClass()
                r5 = 6
                r6 = 0
                r2 = 59
                r3 = 0
                r4 = 0
                r1 = r29
                int r4 = okhttp3.internal.Util.delimiterOffset$default(r1, r2, r3, r4, r5, r6)
                r5 = 2
                r2 = 61
                int r2 = okhttp3.internal.Util.delimiterOffset$default(r1, r2, r3, r4, r5, r6)
                r3 = 0
                if (r2 != r4) goto L22
            L1e:
                r16 = r3
                goto L125
            L22:
                r5 = 0
                r6 = 1
                java.lang.String r8 = okhttp3.internal.Util.trimSubstring$default(r1, r5, r2, r6, r3)
                int r7 = r8.length()
                if (r7 != 0) goto L2f
                goto L1e
            L2f:
                int r7 = okhttp3.internal.Util.indexOfControlOrNonAscii(r8)
                r9 = -1
                if (r7 == r9) goto L37
                goto L1e
            L37:
                int r2 = r2 + r6
                java.lang.String r2 = okhttp3.internal.Util.trimSubstring(r1, r2, r4)
                int r7 = okhttp3.internal.Util.indexOfControlOrNonAscii(r2)
                if (r7 == r9) goto L43
                goto L1e
            L43:
                int r4 = r4 + r6
                int r7 = r1.length()
                r11 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                r15 = r3
                r16 = r15
                r17 = r5
                r19 = r17
                r22 = r19
                r18 = r6
                r20 = r11
                r13 = -1
            L5c:
                if (r4 >= r7) goto Lcd
                r6 = 59
                int r6 = okhttp3.internal.Util.delimiterOffset(r1, r6, r4, r7)
                r23 = -1
                r9 = 61
                int r9 = okhttp3.internal.Util.delimiterOffset(r1, r9, r4, r6)
                java.lang.String r4 = okhttp3.internal.Util.trimSubstring(r1, r4, r9)
                if (r9 >= r6) goto L79
                int r9 = r9 + 1
                java.lang.String r9 = okhttp3.internal.Util.trimSubstring(r1, r9, r6)
                goto L7b
            L79:
                java.lang.String r9 = ""
            L7b:
                java.lang.String r10 = "expires"
                boolean r10 = og.t.X(r4, r10)
                if (r10 == 0) goto L8e
                int r4 = r9.length()     // Catch: java.lang.Throwable -> Lc9
                long r20 = r0.parseExpires(r9, r5, r4)     // Catch: java.lang.Throwable -> Lc9
            L8b:
                r19 = 1
                goto Lc9
            L8e:
                java.lang.String r10 = "max-age"
                boolean r10 = og.t.X(r4, r10)
                if (r10 == 0) goto L9b
                long r13 = r0.parseMaxAge(r9)
                goto L8b
            L9b:
                java.lang.String r10 = "domain"
                boolean r10 = og.t.X(r4, r10)
                if (r10 == 0) goto Laa
                java.lang.String r15 = r0.parseDomain(r9)     // Catch: java.lang.Throwable -> Lc9
                r18 = r5
                goto Lc9
            Laa:
                java.lang.String r10 = "path"
                boolean r10 = og.t.X(r4, r10)
                if (r10 == 0) goto Lb4
                r3 = r9
                goto Lc9
            Lb4:
                java.lang.String r9 = "secure"
                boolean r9 = og.t.X(r4, r9)
                if (r9 == 0) goto Lbf
                r22 = 1
                goto Lc9
            Lbf:
                java.lang.String r9 = "httponly"
                boolean r4 = og.t.X(r4, r9)
                if (r4 == 0) goto Lc9
                r17 = 1
            Lc9:
                int r4 = r6 + 1
                r6 = 1
                goto L5c
            Lcd:
                r23 = -1
                r6 = -9223372036854775808
                int r1 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r1 != 0) goto Ld7
                r10 = r6
                goto Lff
            Ld7:
                int r1 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
                if (r1 == 0) goto Lfd
                r6 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r1 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r1 > 0) goto Le9
                r1 = 1000(0x3e8, float:1.401E-42)
                long r6 = (long) r1
                long r13 = r13 * r6
                goto Lee
            Le9:
                r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            Lee:
                long r13 = r26 + r13
                int r1 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
                if (r1 < 0) goto Lfb
                int r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r1 <= 0) goto Lf9
                goto Lfb
            Lf9:
                r10 = r13
                goto Lff
            Lfb:
                r10 = r11
                goto Lff
            Lfd:
                r10 = r20
            Lff:
                java.lang.String r1 = r28.host()
                if (r15 != 0) goto L107
                r12 = r1
                goto L10f
            L107:
                boolean r4 = r0.domainMatch(r1, r15)
                if (r4 != 0) goto L10e
                goto L125
            L10e:
                r12 = r15
            L10f:
                int r1 = r1.length()
                int r4 = r12.length()
                if (r1 == r4) goto L126
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = r1.get()
                java.lang.String r1 = r1.getEffectiveTldPlusOne(r12)
                if (r1 != 0) goto L126
            L125:
                return r16
            L126:
                java.lang.String r1 = "/"
                if (r3 == 0) goto L133
                boolean r4 = og.t.d0(r3, r1, r5)
                if (r4 != 0) goto L131
                goto L133
            L131:
                r13 = r3
                goto L146
            L133:
                java.lang.String r3 = r28.encodedPath()
                r4 = 47
                r6 = 6
                int r4 = og.m.w0(r3, r4, r5, r6)
                if (r4 == 0) goto L144
                java.lang.String r1 = r3.substring(r5, r4)
            L144:
                r3 = r1
                goto L131
            L146:
                okhttp3.Cookie r7 = new okhttp3.Cookie
                r15 = r17
                r17 = r18
                r18 = 0
                r9 = r2
                r16 = r19
                r14 = r22
                r7.<init>(r8, r9, r10, r12, r13, r14, r15, r16, r17, r18)
                return r7
        }

        public final java.util.List<okhttp3.Cookie> parseAll(okhttp3.HttpUrl r5, okhttp3.Headers r6) {
                r4 = this;
                r5.getClass()
                r6.getClass()
                java.lang.String r0 = "Set-Cookie"
                java.util.List r6 = r6.values(r0)
                int r0 = r6.size()
                r1 = 0
                r2 = 0
            L12:
                if (r2 >= r0) goto L2e
                java.lang.Object r3 = r6.get(r2)
                java.lang.String r3 = (java.lang.String) r3
                okhttp3.Cookie r3 = r4.parse(r5, r3)
                if (r3 != 0) goto L21
                goto L2b
            L21:
                if (r1 != 0) goto L28
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
            L28:
                r1.add(r3)
            L2b:
                int r2 = r2 + 1
                goto L12
            L2e:
                if (r1 == 0) goto L38
                java.util.List r5 = java.util.Collections.unmodifiableList(r1)
                r5.getClass()
                return r5
            L38:
                tf.t r5 = tf.t.f13167g
                return r5
        }
    }

    static {
            okhttp3.Cookie$Companion r0 = new okhttp3.Cookie$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Cookie.Companion = r0
            java.lang.String r0 = "(\\d{2,4})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.Cookie.YEAR_PATTERN = r0
            java.lang.String r0 = "(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.Cookie.MONTH_PATTERN = r0
            java.lang.String r0 = "(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.Cookie.DAY_OF_MONTH_PATTERN = r0
            java.lang.String r0 = "(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.Cookie.TIME_PATTERN = r0
            return
    }

    private Cookie(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, boolean r9, boolean r10) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.value = r2
            r0.expiresAt = r3
            r0.domain = r5
            r0.path = r6
            r0.secure = r7
            r0.httpOnly = r8
            r0.persistent = r9
            r0.hostOnly = r10
            return
    }

    public /* synthetic */ Cookie(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, boolean r9, boolean r10, gg.g r11) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getDAY_OF_MONTH_PATTERN$cp() {
            java.util.regex.Pattern r0 = okhttp3.Cookie.DAY_OF_MONTH_PATTERN
            return r0
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getMONTH_PATTERN$cp() {
            java.util.regex.Pattern r0 = okhttp3.Cookie.MONTH_PATTERN
            return r0
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getTIME_PATTERN$cp() {
            java.util.regex.Pattern r0 = okhttp3.Cookie.TIME_PATTERN
            return r0
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getYEAR_PATTERN$cp() {
            java.util.regex.Pattern r0 = okhttp3.Cookie.YEAR_PATTERN
            return r0
    }

    public static final okhttp3.Cookie parse(okhttp3.HttpUrl r1, java.lang.String r2) {
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            okhttp3.Cookie r1 = r0.parse(r1, r2)
            return r1
    }

    public static final java.util.List<okhttp3.Cookie> parseAll(okhttp3.HttpUrl r1, okhttp3.Headers r2) {
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            java.util.List r1 = r0.parseAll(r1, r2)
            return r1
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_domain, reason: not valid java name */
    public final java.lang.String m47deprecated_domain() {
            r1 = this;
            java.lang.String r0 = r1.domain
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m48deprecated_expiresAt() {
            r2 = this;
            long r0 = r2.expiresAt
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m49deprecated_hostOnly() {
            r1 = this;
            boolean r0 = r1.hostOnly
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m50deprecated_httpOnly() {
            r1 = this;
            boolean r0 = r1.httpOnly
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_name, reason: not valid java name */
    public final java.lang.String m51deprecated_name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_path, reason: not valid java name */
    public final java.lang.String m52deprecated_path() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m53deprecated_persistent() {
            r1 = this;
            boolean r0 = r1.persistent
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m54deprecated_secure() {
            r1 = this;
            boolean r0 = r1.secure
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_value, reason: not valid java name */
    public final java.lang.String m55deprecated_value() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    public final java.lang.String domain() {
            r1 = this;
            java.lang.String r0 = r1.domain
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof okhttp3.Cookie
            if (r0 == 0) goto L50
            okhttp3.Cookie r5 = (okhttp3.Cookie) r5
            java.lang.String r0 = r5.name
            java.lang.String r1 = r4.name
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L50
            java.lang.String r0 = r5.value
            java.lang.String r1 = r4.value
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L50
            long r0 = r5.expiresAt
            long r2 = r4.expiresAt
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L50
            java.lang.String r0 = r5.domain
            java.lang.String r1 = r4.domain
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L50
            java.lang.String r0 = r5.path
            java.lang.String r1 = r4.path
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L50
            boolean r0 = r5.secure
            boolean r1 = r4.secure
            if (r0 != r1) goto L50
            boolean r0 = r5.httpOnly
            boolean r1 = r4.httpOnly
            if (r0 != r1) goto L50
            boolean r0 = r5.persistent
            boolean r1 = r4.persistent
            if (r0 != r1) goto L50
            boolean r5 = r5.hostOnly
            boolean r0 = r4.hostOnly
            if (r5 != r0) goto L50
            r5 = 1
            return r5
        L50:
            r5 = 0
            return r5
    }

    public final long expiresAt() {
            r2 = this;
            long r0 = r2.expiresAt
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.name
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = eh.a.g(r1, r2, r0)
            java.lang.String r1 = r5.value
            int r0 = eh.a.g(r0, r2, r1)
            long r3 = r5.expiresAt
            int r0 = eh.a.f(r0, r2, r3)
            java.lang.String r1 = r5.domain
            int r0 = eh.a.g(r0, r2, r1)
            java.lang.String r1 = r5.path
            int r0 = eh.a.g(r0, r2, r1)
            boolean r1 = r5.secure
            int r0 = eh.a.h(r0, r2, r1)
            boolean r1 = r5.httpOnly
            int r0 = eh.a.h(r0, r2, r1)
            boolean r1 = r5.persistent
            int r0 = eh.a.h(r0, r2, r1)
            boolean r1 = r5.hostOnly
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final boolean hostOnly() {
            r1 = this;
            boolean r0 = r1.hostOnly
            return r0
    }

    public final boolean httpOnly() {
            r1 = this;
            boolean r0 = r1.httpOnly
            return r0
    }

    public final boolean matches(okhttp3.HttpUrl r4) {
            r3 = this;
            r4.getClass()
            boolean r0 = r3.hostOnly
            if (r0 == 0) goto L12
            java.lang.String r0 = r4.host()
            java.lang.String r1 = r3.domain
            boolean r0 = gg.l.a(r0, r1)
            goto L1e
        L12:
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            java.lang.String r1 = r4.host()
            java.lang.String r2 = r3.domain
            boolean r0 = okhttp3.Cookie.Companion.access$domainMatch(r0, r1, r2)
        L1e:
            r1 = 0
            if (r0 != 0) goto L22
            return r1
        L22:
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            java.lang.String r2 = r3.path
            boolean r0 = okhttp3.Cookie.Companion.access$pathMatch(r0, r4, r2)
            if (r0 != 0) goto L2d
            return r1
        L2d:
            boolean r0 = r3.secure
            if (r0 == 0) goto L39
            boolean r4 = r4.isHttps()
            if (r4 == 0) goto L38
            goto L39
        L38:
            return r1
        L39:
            r4 = 1
            return r4
    }

    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String path() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    public final boolean persistent() {
            r1 = this;
            boolean r0 = r1.persistent
            return r0
    }

    public final boolean secure() {
            r1 = this;
            boolean r0 = r1.secure
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.toString$okhttp(r0)
            return r0
    }

    public final java.lang.String toString$okhttp(boolean r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.name
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.String r1 = r5.value
            r0.append(r1)
            boolean r1 = r5.persistent
            if (r1 == 0) goto L39
            long r1 = r5.expiresAt
            r3 = -9223372036854775808
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L26
            java.lang.String r1 = "; max-age=0"
            r0.append(r1)
            goto L39
        L26:
            java.lang.String r1 = "; expires="
            r0.append(r1)
            java.util.Date r1 = new java.util.Date
            long r2 = r5.expiresAt
            r1.<init>(r2)
            java.lang.String r1 = okhttp3.internal.http.DatesKt.toHttpDateString(r1)
            r0.append(r1)
        L39:
            boolean r1 = r5.hostOnly
            if (r1 != 0) goto L4e
            java.lang.String r1 = "; domain="
            r0.append(r1)
            if (r6 == 0) goto L49
            java.lang.String r6 = "."
            r0.append(r6)
        L49:
            java.lang.String r6 = r5.domain
            r0.append(r6)
        L4e:
            java.lang.String r6 = "; path="
            r0.append(r6)
            java.lang.String r6 = r5.path
            r0.append(r6)
            boolean r6 = r5.secure
            if (r6 == 0) goto L61
            java.lang.String r6 = "; secure"
            r0.append(r6)
        L61:
            boolean r6 = r5.httpOnly
            if (r6 == 0) goto L6a
            java.lang.String r6 = "; httponly"
            r0.append(r6)
        L6a:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public final java.lang.String value() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}
