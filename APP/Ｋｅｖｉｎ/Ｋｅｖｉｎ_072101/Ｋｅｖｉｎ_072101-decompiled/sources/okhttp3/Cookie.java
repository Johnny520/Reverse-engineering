package okhttp3;

/* JADX INFO: compiled from: Cookie.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 &2\u00020\u0001:\u0002%&BO\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\r\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0012J\u0013\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0017J\r\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0018J\r\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001eJ\r\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0002\b\u001fJ\r\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b J\b\u0010!\u001a\u00020\u0003H\u0016J\u0015\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\nH\u0000¢\u0006\u0002\b#J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b$R\u0013\u0010\u0007\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0013\u0010\r\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0011R\u0013\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\b\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0013\u0010\f\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0011R\u0013\u0010\t\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000f¨\u0006'"}, m115d2 = {"Lokhttp3/Cookie;", "", "name", "", "value", "expiresAt", "", "domain", "path", "secure", "", "httpOnly", "persistent", "hostOnly", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "()Ljava/lang/String;", "()J", "()Z", "-deprecated_domain", "equals", "other", "-deprecated_expiresAt", "hashCode", "", "-deprecated_hostOnly", "-deprecated_httpOnly", "matches", "url", "Lokhttp3/HttpUrl;", "-deprecated_name", "-deprecated_path", "-deprecated_persistent", "-deprecated_secure", "toString", "forObsoleteRfc2965", "toString$okhttp", "-deprecated_value", "Builder", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

    /* JADX INFO: compiled from: Cookie.kt */
    @kotlin.Metadata(m114d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0000J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0000J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m115d2 = {"Lokhttp3/Cookie$Builder;", "", "()V", "domain", "", "expiresAt", "", "hostOnly", "", "httpOnly", "name", "path", "persistent", "secure", "value", "build", "Lokhttp3/Cookie;", "hostOnlyDomain", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

        private final okhttp3.Cookie.Builder domain(java.lang.String r6, boolean r7) {
                r5 = this;
                r0 = r5
                okhttp3.Cookie$Builder r0 = (okhttp3.Cookie.Builder) r0
                r1 = 0
                java.lang.String r2 = okhttp3.internal.HostnamesKt.toCanonicalHost(r6)
                if (r2 == 0) goto L13
                r0.domain = r2
                r0.hostOnly = r7
                r0 = r5
                okhttp3.Cookie$Builder r0 = (okhttp3.Cookie.Builder) r0
                return r0
            L13:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "unexpected domain: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        public final okhttp3.Cookie build() {
                r13 = this;
                okhttp3.Cookie r12 = new okhttp3.Cookie
                java.lang.String r1 = r13.name
                if (r1 == 0) goto L30
                java.lang.String r2 = r13.value
                if (r2 == 0) goto L28
                long r3 = r13.expiresAt
                java.lang.String r5 = r13.domain
                if (r5 == 0) goto L20
                java.lang.String r6 = r13.path
                boolean r7 = r13.secure
                boolean r8 = r13.httpOnly
                boolean r9 = r13.persistent
                boolean r10 = r13.hostOnly
                r11 = 0
                r0 = r12
                r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
                return r12
            L20:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "builder.domain == null"
                r0.<init>(r1)
                throw r0
            L28:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "builder.value == null"
                r0.<init>(r1)
                throw r0
            L30:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "builder.name == null"
                r0.<init>(r1)
                throw r0
        }

        public final okhttp3.Cookie.Builder domain(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "domain"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                okhttp3.Cookie$Builder r0 = r1.domain(r2, r0)
                return r0
        }

        public final okhttp3.Cookie.Builder expiresAt(long r7) {
                r6 = this;
                r0 = r6
                okhttp3.Cookie$Builder r0 = (okhttp3.Cookie.Builder) r0
                r1 = 0
                r2 = r7
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 > 0) goto Ld
                r2 = -9223372036854775808
            Ld:
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 <= 0) goto L1b
                r2 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L1b:
                r0.expiresAt = r2
                r4 = 1
                r0.persistent = r4
                r0 = r6
                okhttp3.Cookie$Builder r0 = (okhttp3.Cookie.Builder) r0
                return r0
        }

        public final okhttp3.Cookie.Builder hostOnlyDomain(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "domain"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 1
                okhttp3.Cookie$Builder r0 = r1.domain(r2, r0)
                return r0
        }

        public final okhttp3.Cookie.Builder httpOnly() {
                r3 = this;
                r0 = r3
                okhttp3.Cookie$Builder r0 = (okhttp3.Cookie.Builder) r0
                r1 = 0
                r2 = 1
                r0.httpOnly = r2
                r0 = r3
                okhttp3.Cookie$Builder r0 = (okhttp3.Cookie.Builder) r0
                return r0
        }

        public final okhttp3.Cookie.Builder name(java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r4
                okhttp3.Cookie$Builder r0 = (okhttp3.Cookie.Builder) r0
                r1 = 0
                r2 = r5
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.CharSequence r2 = kotlin.text.StringsKt.trim(r2)
                java.lang.String r2 = r2.toString()
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r5)
                if (r2 == 0) goto L21
                r0.name = r5
                r0 = r4
                okhttp3.Cookie$Builder r0 = (okhttp3.Cookie.Builder) r0
                return r0
            L21:
                r2 = 0
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "name is not trimmed"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        public final okhttp3.Cookie.Builder path(java.lang.String r7) {
                r6 = this;
                java.lang.String r0 = "path"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                r0 = r6
                okhttp3.Cookie$Builder r0 = (okhttp3.Cookie.Builder) r0
                r1 = 0
                r2 = 2
                r3 = 0
                java.lang.String r4 = "/"
                r5 = 0
                boolean r2 = kotlin.text.StringsKt.startsWith$default(r7, r4, r5, r2, r3)
                if (r2 == 0) goto L1b
                r0.path = r7
                r0 = r6
                okhttp3.Cookie$Builder r0 = (okhttp3.Cookie.Builder) r0
                return r0
            L1b:
                r2 = 0
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "path must start with '/'"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        public final okhttp3.Cookie.Builder secure() {
                r3 = this;
                r0 = r3
                okhttp3.Cookie$Builder r0 = (okhttp3.Cookie.Builder) r0
                r1 = 0
                r2 = 1
                r0.secure = r2
                r0 = r3
                okhttp3.Cookie$Builder r0 = (okhttp3.Cookie.Builder) r0
                return r0
        }

        public final okhttp3.Cookie.Builder value(java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r4
                okhttp3.Cookie$Builder r0 = (okhttp3.Cookie.Builder) r0
                r1 = 0
                r2 = r5
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.CharSequence r2 = kotlin.text.StringsKt.trim(r2)
                java.lang.String r2 = r2.toString()
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r5)
                if (r2 == 0) goto L21
                r0.value = r5
                r0 = r4
                okhttp3.Cookie$Builder r0 = (okhttp3.Cookie.Builder) r0
                return r0
            L21:
                r2 = 0
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "value is not trimmed"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }
    }

    /* JADX INFO: compiled from: Cookie.kt */
    @kotlin.Metadata(m114d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0002J'\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0000¢\u0006\u0002\b\u001bJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0002J \u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\fH\u0002J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\fH\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m115d2 = {"Lokhttp3/Cookie$Companion;", "", "()V", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "dateCharacterOffset", "", "input", "", "pos", "limit", "invert", "", "domainMatch", "urlHost", "domain", "parse", "Lokhttp3/Cookie;", "currentTimeMillis", "", "url", "Lokhttp3/HttpUrl;", "setCookie", "parse$okhttp", "parseAll", "", "headers", "Lokhttp3/Headers;", "parseDomain", "s", "parseExpires", "parseMaxAge", "pathMatch", "path", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ boolean access$domainMatch(okhttp3.Cookie.Companion r1, java.lang.String r2, java.lang.String r3) {
                boolean r0 = r1.domainMatch(r2, r3)
                return r0
        }

        public static final /* synthetic */ boolean access$pathMatch(okhttp3.Cookie.Companion r1, okhttp3.HttpUrl r2, java.lang.String r3) {
                boolean r0 = r1.pathMatch(r2, r3)
                return r0
        }

        private final int dateCharacterOffset(java.lang.String r7, int r8, int r9, boolean r10) {
                r6 = this;
                r0 = r8
            L1:
                if (r0 >= r9) goto L4b
                char r1 = r7.charAt(r0)
                r2 = 32
                r3 = 1
                if (r1 >= r2) goto L10
                r2 = 9
                if (r1 != r2) goto L41
            L10:
                r2 = 127(0x7f, float:1.78E-43)
                if (r1 >= r2) goto L41
                r2 = 48
                r4 = 58
                r5 = 0
                if (r2 > r1) goto L1f
                if (r1 >= r4) goto L1f
                r2 = r3
                goto L20
            L1f:
                r2 = r5
            L20:
                if (r2 != 0) goto L41
                r2 = 97
                if (r2 > r1) goto L2c
                r2 = 123(0x7b, float:1.72E-43)
                if (r1 >= r2) goto L2c
                r2 = r3
                goto L2d
            L2c:
                r2 = r5
            L2d:
                if (r2 != 0) goto L41
                r2 = 65
                if (r2 > r1) goto L39
                r2 = 91
                if (r1 >= r2) goto L39
                r2 = r3
                goto L3a
            L39:
                r2 = r5
            L3a:
                if (r2 != 0) goto L41
                if (r1 != r4) goto L3f
                goto L41
            L3f:
                r3 = r5
                goto L42
            L41:
            L42:
                r2 = r3
                r3 = r10 ^ 1
                if (r2 != r3) goto L48
                return r0
            L48:
                int r0 = r0 + 1
                goto L1
            L4b:
                return r9
        }

        private final boolean domainMatch(java.lang.String r5, java.lang.String r6) {
                r4 = this;
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                r0 = 2
                r2 = 0
                r3 = 0
                boolean r0 = kotlin.text.StringsKt.endsWith$default(r5, r6, r3, r0, r2)
                if (r0 == 0) goto L2a
                int r0 = r5.length()
                int r2 = r6.length()
                int r0 = r0 - r2
                int r0 = r0 - r1
                char r0 = r5.charAt(r0)
                r2 = 46
                if (r0 != r2) goto L2a
                boolean r0 = okhttp3.internal.Util.canParseAsIpAddress(r5)
                if (r0 != 0) goto L2a
                goto L2b
            L2a:
                r1 = r3
            L2b:
                return r1
        }

        private final java.lang.String parseDomain(java.lang.String r5) {
                r4 = this;
                r0 = 2
                r1 = 0
                java.lang.String r2 = "."
                r3 = 0
                boolean r0 = kotlin.text.StringsKt.endsWith$default(r5, r2, r3, r0, r1)
                if (r0 != 0) goto L1e
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.String r0 = kotlin.text.StringsKt.removePrefix(r5, r2)
                java.lang.String r0 = okhttp3.internal.HostnamesKt.toCanonicalHost(r0)
                if (r0 == 0) goto L18
                return r0
            L18:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
            L1e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Failed requirement."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        private final long parseExpires(java.lang.String r23, int r24, int r25) {
                r22 = this;
                r0 = r22
                r1 = r23
                r2 = r25
                r3 = r24
                r4 = 0
                int r3 = r0.dateCharacterOffset(r1, r3, r2, r4)
                r5 = 0
                r5 = -1
                r6 = 0
                r6 = -1
                r7 = 0
                r7 = -1
                r8 = 0
                r8 = -1
                r9 = 0
                r9 = -1
                r10 = 0
                r10 = -1
                java.util.regex.Pattern r11 = okhttp3.Cookie.access$getTIME_PATTERN$cp()
                r12 = r1
                java.lang.CharSequence r12 = (java.lang.CharSequence) r12
                java.util.regex.Matcher r11 = r11.matcher(r12)
            L24:
                r12 = 2
                r13 = -1
                r14 = 1
                if (r3 >= r2) goto L100
                int r15 = r3 + 1
                int r15 = r0.dateCharacterOffset(r1, r15, r2, r14)
                r11.region(r3, r15)
                java.lang.String r4 = "matcher.group(1)"
                if (r5 != r13) goto L70
                java.util.regex.Pattern r13 = okhttp3.Cookie.access$getTIME_PATTERN$cp()
                java.util.regex.Matcher r13 = r11.usePattern(r13)
                boolean r13 = r13.matches()
                if (r13 == 0) goto L70
                java.lang.String r13 = r11.group(r14)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r4)
                int r4 = java.lang.Integer.parseInt(r13)
                java.lang.String r5 = r11.group(r12)
                java.lang.String r12 = "matcher.group(2)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r12)
                int r5 = java.lang.Integer.parseInt(r5)
                r6 = 3
                java.lang.String r6 = r11.group(r6)
                java.lang.String r12 = "matcher.group(3)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r12)
                int r6 = java.lang.Integer.parseInt(r6)
                r7 = r6
                r6 = r5
                r5 = r4
                goto Lf6
            L70:
                r12 = -1
                if (r8 != r12) goto L8e
                java.util.regex.Pattern r12 = okhttp3.Cookie.access$getDAY_OF_MONTH_PATTERN$cp()
                java.util.regex.Matcher r12 = r11.usePattern(r12)
                boolean r12 = r12.matches()
                if (r12 == 0) goto L8e
                java.lang.String r12 = r11.group(r14)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r4)
                int r4 = java.lang.Integer.parseInt(r12)
                r8 = r4
                goto Lf6
            L8e:
                r12 = -1
                if (r9 != r12) goto Ld9
                java.util.regex.Pattern r12 = okhttp3.Cookie.access$getMONTH_PATTERN$cp()
                java.util.regex.Matcher r12 = r11.usePattern(r12)
                boolean r12 = r12.matches()
                if (r12 == 0) goto Ld9
                java.lang.String r12 = r11.group(r14)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r4)
                java.util.Locale r4 = java.util.Locale.US
                java.lang.String r13 = "US"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r13)
                java.lang.String r4 = r12.toLowerCase(r4)
                java.lang.String r12 = "this as java.lang.String).toLowerCase(locale)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r12)
                r17 = r4
                java.util.regex.Pattern r4 = okhttp3.Cookie.access$getMONTH_PATTERN$cp()
                java.lang.String r4 = r4.pattern()
                java.lang.String r12 = "MONTH_PATTERN.pattern()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r12)
                r16 = r4
                java.lang.CharSequence r16 = (java.lang.CharSequence) r16
                r20 = 6
                r21 = 0
                r18 = 0
                r19 = 0
                int r4 = kotlin.text.StringsKt.indexOf$default(r16, r17, r18, r19, r20, r21)
                int r4 = r4 / 4
                r9 = r4
                goto Lf6
            Ld9:
                r12 = -1
                if (r10 != r12) goto Lf6
                java.util.regex.Pattern r12 = okhttp3.Cookie.access$getYEAR_PATTERN$cp()
                java.util.regex.Matcher r12 = r11.usePattern(r12)
                boolean r12 = r12.matches()
                if (r12 == 0) goto Lf6
                java.lang.String r12 = r11.group(r14)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r4)
                int r4 = java.lang.Integer.parseInt(r12)
                r10 = r4
            Lf6:
                int r4 = r15 + 1
                r12 = 0
                int r3 = r0.dateCharacterOffset(r1, r4, r2, r12)
                r4 = r12
                goto L24
            L100:
                r4 = 70
                if (r4 > r10) goto L10a
                r13 = 100
                if (r10 >= r13) goto L10a
                r13 = r14
                goto L10b
            L10a:
                r13 = 0
            L10b:
                if (r13 == 0) goto L10f
                int r10 = r10 + 1900
            L10f:
                if (r10 < 0) goto L115
                if (r10 >= r4) goto L115
                r4 = r14
                goto L116
            L115:
                r4 = 0
            L116:
                if (r4 == 0) goto L11a
                int r10 = r10 + 2000
            L11a:
                r4 = 1601(0x641, float:2.243E-42)
                if (r10 < r4) goto L120
                r4 = r14
                goto L121
            L120:
                r4 = 0
            L121:
                java.lang.String r13 = "Failed requirement."
                if (r4 == 0) goto L1bb
                r4 = -1
                if (r9 == r4) goto L12a
                r4 = r14
                goto L12b
            L12a:
                r4 = 0
            L12b:
                if (r4 == 0) goto L1b1
                if (r14 > r8) goto L135
                r4 = 32
                if (r8 >= r4) goto L135
                r4 = r14
                goto L136
            L135:
                r4 = 0
            L136:
                if (r4 == 0) goto L1a7
                if (r5 < 0) goto L140
                r4 = 24
                if (r5 >= r4) goto L140
                r4 = r14
                goto L141
            L140:
                r4 = 0
            L141:
                if (r4 == 0) goto L19d
                r4 = 60
                if (r6 < 0) goto L14b
                if (r6 >= r4) goto L14b
                r15 = r14
                goto L14c
            L14b:
                r15 = 0
            L14c:
                if (r15 == 0) goto L193
                if (r7 < 0) goto L154
                if (r7 >= r4) goto L154
                r4 = r14
                goto L155
            L154:
                r4 = 0
            L155:
                if (r4 == 0) goto L189
                java.util.GregorianCalendar r4 = new java.util.GregorianCalendar
                java.util.TimeZone r13 = okhttp3.internal.Util.UTC
                r4.<init>(r13)
                r13 = 0
                r15 = 0
                r4.setLenient(r15)
                r4.set(r14, r10)
                int r14 = r9 + (-1)
                r4.set(r12, r14)
                r12 = 5
                r4.set(r12, r8)
                r12 = 11
                r4.set(r12, r5)
                r12 = 12
                r4.set(r12, r6)
                r12 = 13
                r4.set(r12, r7)
                r12 = 14
                r14 = 0
                r4.set(r12, r14)
                long r14 = r4.getTimeInMillis()
                return r14
            L189:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r13.toString()
                r4.<init>(r12)
                throw r4
            L193:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r13.toString()
                r4.<init>(r12)
                throw r4
            L19d:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r13.toString()
                r4.<init>(r12)
                throw r4
            L1a7:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r13.toString()
                r4.<init>(r12)
                throw r4
            L1b1:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r13.toString()
                r4.<init>(r12)
                throw r4
            L1bb:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r13.toString()
                r4.<init>(r12)
                throw r4
        }

        private final long parseMaxAge(java.lang.String r8) {
                r7 = this;
                r0 = -9223372036854775808
                long r2 = java.lang.Long.parseLong(r8)     // Catch: java.lang.NumberFormatException -> L10
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 > 0) goto Le
                goto Lf
            Le:
                r0 = r2
            Lf:
                return r0
            L10:
                r2 = move-exception
                r3 = r8
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                kotlin.text.Regex r4 = new kotlin.text.Regex
                java.lang.String r5 = "-?\\d+"
                r4.<init>(r5)
                boolean r3 = r4.matches(r3)
                if (r3 == 0) goto L33
                r3 = 2
                r4 = 0
                java.lang.String r5 = "-"
                r6 = 0
                boolean r3 = kotlin.text.StringsKt.startsWith$default(r8, r5, r6, r3, r4)
                if (r3 == 0) goto L2d
                goto L32
            L2d:
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L32:
                return r0
            L33:
                throw r2
        }

        private final boolean pathMatch(okhttp3.HttpUrl r7, java.lang.String r8) {
                r6 = this;
                java.lang.String r0 = r7.encodedPath()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)
                r2 = 1
                if (r1 == 0) goto Lc
                return r2
            Lc:
                r1 = 0
                r3 = 2
                r4 = 0
                boolean r5 = kotlin.text.StringsKt.startsWith$default(r0, r8, r1, r3, r4)
                if (r5 == 0) goto L2b
                java.lang.String r5 = "/"
                boolean r3 = kotlin.text.StringsKt.endsWith$default(r8, r5, r1, r3, r4)
                if (r3 == 0) goto L1e
                return r2
            L1e:
                int r3 = r8.length()
                char r3 = r0.charAt(r3)
                r4 = 47
                if (r3 != r4) goto L2b
                return r2
            L2b:
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.Cookie parse(okhttp3.HttpUrl r3, java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "setCookie"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                long r0 = java.lang.System.currentTimeMillis()
                okhttp3.Cookie r0 = r2.parse$okhttp(r0, r3, r4)
                return r0
        }

        public final okhttp3.Cookie parse$okhttp(long r34, okhttp3.HttpUrl r36, java.lang.String r37) {
                r33 = this;
                r1 = r33
                r8 = r37
                java.lang.String r0 = "url"
                r9 = r36
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                java.lang.String r0 = "setCookie"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                r6 = 6
                r7 = 0
                r3 = 59
                r4 = 0
                r5 = 0
                r2 = r37
                int r10 = okhttp3.internal.Util.delimiterOffset$default(r2, r3, r4, r5, r6, r7)
                r6 = 2
                r3 = 61
                r5 = r10
                int r2 = okhttp3.internal.Util.delimiterOffset$default(r2, r3, r4, r5, r6, r7)
                r3 = 0
                if (r2 != r10) goto L28
                return r3
            L28:
                r4 = 0
                r5 = 1
                java.lang.String r6 = okhttp3.internal.Util.trimSubstring$default(r8, r4, r2, r5, r3)
                r0 = r6
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 != 0) goto L39
                r0 = r5
                goto L3a
            L39:
                r0 = r4
            L3a:
                if (r0 != 0) goto L1e0
                int r0 = okhttp3.internal.Util.indexOfControlOrNonAscii(r6)
                r7 = -1
                if (r0 == r7) goto L47
                r30 = r2
                goto L1e2
            L47:
                int r0 = r2 + 1
                java.lang.String r23 = okhttp3.internal.Util.trimSubstring(r8, r0, r10)
                int r0 = okhttp3.internal.Util.indexOfControlOrNonAscii(r23)
                if (r0 == r7) goto L54
                return r3
            L54:
                r11 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                r13 = -1
                r0 = 0
                r7 = 0
                r15 = 0
                r16 = 0
                r17 = 1
                r18 = 0
                int r19 = r10 + 1
                int r3 = r37.length()
                r24 = r13
                r26 = r15
                r27 = r16
                r28 = r17
                r29 = r18
                r14 = r19
                r12 = r11
                r11 = r7
                r7 = r0
            L79:
                if (r14 >= r3) goto L123
                r0 = 59
                int r15 = okhttp3.internal.Util.delimiterOffset(r8, r0, r14, r3)
                r0 = 61
                int r4 = okhttp3.internal.Util.delimiterOffset(r8, r0, r14, r15)
                java.lang.String r5 = okhttp3.internal.Util.trimSubstring(r8, r14, r4)
                if (r4 >= r15) goto L94
                int r0 = r4 + 1
                java.lang.String r0 = okhttp3.internal.Util.trimSubstring(r8, r0, r15)
                goto L96
            L94:
                java.lang.String r0 = ""
            L96:
                r18 = r0
                java.lang.String r0 = "expires"
                r30 = r2
                r2 = 1
                boolean r0 = kotlin.text.StringsKt.equals(r5, r0, r2)
                if (r0 == 0) goto Lc3
            La5:
                int r0 = r18.length()     // Catch: java.lang.IllegalArgumentException -> Lbc
                r31 = r3
                r2 = r18
                r3 = 0
                long r18 = r1.parseExpires(r2, r3, r0)     // Catch: java.lang.IllegalArgumentException -> Lba
                r12 = r18
                r0 = 1
                r29 = r0
                r3 = 1
                goto L119
            Lba:
                r0 = move-exception
                goto Lc1
            Lbc:
                r0 = move-exception
                r31 = r3
                r2 = r18
            Lc1:
                r3 = 1
                goto L119
            Lc3:
                r31 = r3
                r2 = r18
                java.lang.String r0 = "max-age"
                r3 = 1
                boolean r0 = kotlin.text.StringsKt.equals(r5, r0, r3)
                if (r0 == 0) goto Ldf
            Ld1:
                long r18 = r1.parseMaxAge(r2)     // Catch: java.lang.NumberFormatException -> Ldc
                r0 = 1
                r29 = r0
                r24 = r18
                r3 = 1
                goto L119
            Ldc:
                r0 = move-exception
                r3 = 1
                goto L119
            Ldf:
                java.lang.String r0 = "domain"
                r3 = 1
                boolean r0 = kotlin.text.StringsKt.equals(r5, r0, r3)
                if (r0 == 0) goto Lf6
            Le9:
                java.lang.String r0 = r1.parseDomain(r2)     // Catch: java.lang.IllegalArgumentException -> Lf3
                r3 = 0
                r7 = r0
                r28 = r3
                r3 = 1
                goto L119
            Lf3:
                r0 = move-exception
                r3 = 1
                goto L119
            Lf6:
                java.lang.String r0 = "path"
                r3 = 1
                boolean r0 = kotlin.text.StringsKt.equals(r5, r0, r3)
                if (r0 == 0) goto L102
                r0 = r2
                r11 = r0
                goto L119
            L102:
                java.lang.String r0 = "secure"
                boolean r0 = kotlin.text.StringsKt.equals(r5, r0, r3)
                if (r0 == 0) goto L10e
                r0 = 1
                r26 = r0
                goto L119
            L10e:
                java.lang.String r0 = "httponly"
                boolean r0 = kotlin.text.StringsKt.equals(r5, r0, r3)
                if (r0 == 0) goto L119
                r0 = 1
                r27 = r0
            L119:
                int r14 = r15 + 1
                r5 = r3
                r2 = r30
                r3 = r31
                r4 = 0
                goto L79
            L123:
                r30 = r2
                r31 = r3
                r2 = -9223372036854775808
                int r0 = (r24 > r2 ? 1 : (r24 == r2 ? 0 : -1))
                if (r0 != 0) goto L131
                r12 = -9223372036854775808
                r2 = r12
                goto L166
            L131:
                r2 = -1
                int r0 = (r24 > r2 ? 1 : (r24 == r2 ? 0 : -1))
                if (r0 == 0) goto L165
                r2 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r0 = (r24 > r2 ? 1 : (r24 == r2 ? 0 : -1))
                if (r0 > 0) goto L146
                r0 = 1000(0x3e8, float:1.401E-42)
                long r2 = (long) r0
                long r2 = r2 * r24
                goto L14b
            L146:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L14b:
                long r12 = r34 + r2
                int r0 = (r12 > r34 ? 1 : (r12 == r34 ? 0 : -1))
                if (r0 < 0) goto L15e
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
                if (r0 <= 0) goto L15c
                goto L15e
            L15c:
                r2 = r12
                goto L166
            L15e:
                r12 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                r2 = r12
                goto L166
            L165:
                r2 = r12
            L166:
                java.lang.String r0 = r36.host()
                if (r7 != 0) goto L16e
                r7 = r0
                goto L176
            L16e:
                boolean r4 = r1.domainMatch(r0, r7)
                if (r4 != 0) goto L176
                r4 = 0
                return r4
            L176:
                int r4 = r0.length()
                int r5 = r7.length()
                if (r4 == r5) goto L190
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r4 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r4 = r4.get()
                java.lang.String r4 = r4.getEffectiveTldPlusOne(r7)
                if (r4 != 0) goto L18e
                r4 = 0
                return r4
            L18e:
                r4 = 0
                goto L191
            L190:
                r4 = 0
            L191:
                java.lang.String r5 = "/"
                if (r11 == 0) goto L1a0
                r12 = 2
                r13 = 0
                boolean r4 = kotlin.text.StringsKt.startsWith$default(r11, r5, r13, r12, r4)
                if (r4 != 0) goto L19e
                goto L1a0
            L19e:
                r4 = r11
                goto L1c4
            L1a0:
                java.lang.String r4 = r36.encodedPath()
                r17 = r4
                java.lang.CharSequence r17 = (java.lang.CharSequence) r17
                r21 = 6
                r22 = 0
                r18 = 47
                r19 = 0
                r20 = 0
                int r12 = kotlin.text.StringsKt.lastIndexOf$default(r17, r18, r19, r20, r21, r22)
                if (r12 == 0) goto L1c2
                r5 = 0
                java.lang.String r5 = r4.substring(r5, r12)
                java.lang.String r13 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r13)
            L1c2:
                r11 = r5
                r4 = r11
            L1c4:
                okhttp3.Cookie r5 = new okhttp3.Cookie
                r22 = 0
                r11 = r5
                r12 = r6
                r13 = r23
                r32 = r14
                r14 = r2
                r16 = r7
                r17 = r4
                r18 = r26
                r19 = r27
                r20 = r29
                r21 = r28
                r11.<init>(r12, r13, r14, r16, r17, r18, r19, r20, r21, r22)
                return r5
            L1e0:
                r30 = r2
            L1e2:
                r2 = 0
                return r2
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<okhttp3.Cookie> parseAll(okhttp3.HttpUrl r7, okhttp3.Headers r8) {
                r6 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = "Set-Cookie"
                java.util.List r0 = r8.values(r0)
                r1 = 0
                r2 = 0
                int r3 = r0.size()
            L16:
                if (r2 >= r3) goto L35
                java.lang.Object r4 = r0.get(r2)
                java.lang.String r4 = (java.lang.String) r4
                okhttp3.Cookie r4 = r6.parse(r7, r4)
                if (r4 != 0) goto L25
                goto L32
            L25:
                if (r1 != 0) goto L2f
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                r1 = r5
                java.util.List r1 = (java.util.List) r1
            L2f:
                r1.add(r4)
            L32:
                int r2 = r2 + 1
                goto L16
            L35:
                if (r1 == 0) goto L41
                java.util.List r2 = java.util.Collections.unmodifiableList(r1)
                java.lang.String r3 = "{\n        Collections.un…ableList(cookies)\n      }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                goto L45
            L41:
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L45:
                return r2
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

    public /* synthetic */ Cookie(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, boolean r9, boolean r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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

    @kotlin.jvm.JvmStatic
    public static final okhttp3.Cookie parse(okhttp3.HttpUrl r1, java.lang.String r2) {
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            okhttp3.Cookie r0 = r0.parse(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<okhttp3.Cookie> parseAll(okhttp3.HttpUrl r1, okhttp3.Headers r2) {
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            java.util.List r0 = r0.parseAll(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "domain", imports = {}))
    /* JADX INFO: renamed from: -deprecated_domain, reason: not valid java name */
    public final java.lang.String m10263deprecated_domain() {
            r1 = this;
            java.lang.String r0 = r1.domain
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "expiresAt", imports = {}))
    /* JADX INFO: renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m10264deprecated_expiresAt() {
            r2 = this;
            long r0 = r2.expiresAt
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hostOnly", imports = {}))
    /* JADX INFO: renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m10265deprecated_hostOnly() {
            r1 = this;
            boolean r0 = r1.hostOnly
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "httpOnly", imports = {}))
    /* JADX INFO: renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m10266deprecated_httpOnly() {
            r1 = this;
            boolean r0 = r1.httpOnly
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "name", imports = {}))
    /* JADX INFO: renamed from: -deprecated_name, reason: not valid java name */
    public final java.lang.String m10267deprecated_name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "path", imports = {}))
    /* JADX INFO: renamed from: -deprecated_path, reason: not valid java name */
    public final java.lang.String m10268deprecated_path() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "persistent", imports = {}))
    /* JADX INFO: renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m10269deprecated_persistent() {
            r1 = this;
            boolean r0 = r1.persistent
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "secure", imports = {}))
    /* JADX INFO: renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m10270deprecated_secure() {
            r1 = this;
            boolean r0 = r1.secure
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "value", imports = {}))
    /* JADX INFO: renamed from: -deprecated_value, reason: not valid java name */
    public final java.lang.String m10271deprecated_value() {
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
            if (r0 == 0) goto L69
            r0 = r5
            okhttp3.Cookie r0 = (okhttp3.Cookie) r0
            java.lang.String r0 = r0.name
            java.lang.String r1 = r4.name
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L69
            r0 = r5
            okhttp3.Cookie r0 = (okhttp3.Cookie) r0
            java.lang.String r0 = r0.value
            java.lang.String r1 = r4.value
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L69
            r0 = r5
            okhttp3.Cookie r0 = (okhttp3.Cookie) r0
            long r0 = r0.expiresAt
            long r2 = r4.expiresAt
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L69
            r0 = r5
            okhttp3.Cookie r0 = (okhttp3.Cookie) r0
            java.lang.String r0 = r0.domain
            java.lang.String r1 = r4.domain
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L69
            r0 = r5
            okhttp3.Cookie r0 = (okhttp3.Cookie) r0
            java.lang.String r0 = r0.path
            java.lang.String r1 = r4.path
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L69
            r0 = r5
            okhttp3.Cookie r0 = (okhttp3.Cookie) r0
            boolean r0 = r0.secure
            boolean r1 = r4.secure
            if (r0 != r1) goto L69
            r0 = r5
            okhttp3.Cookie r0 = (okhttp3.Cookie) r0
            boolean r0 = r0.httpOnly
            boolean r1 = r4.httpOnly
            if (r0 != r1) goto L69
            r0 = r5
            okhttp3.Cookie r0 = (okhttp3.Cookie) r0
            boolean r0 = r0.persistent
            boolean r1 = r4.persistent
            if (r0 != r1) goto L69
            r0 = r5
            okhttp3.Cookie r0 = (okhttp3.Cookie) r0
            boolean r0 = r0.hostOnly
            boolean r1 = r4.hostOnly
            if (r0 != r1) goto L69
            r0 = 1
            goto L6a
        L69:
            r0 = 0
        L6a:
            return r0
    }

    public final long expiresAt() {
            r2 = this;
            long r0 = r2.expiresAt
            return r0
    }

    public int hashCode() {
            r4 = this;
            r0 = 17
            int r1 = r0 * 31
            java.lang.String r2 = r4.name
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            int r0 = r1 * 31
            java.lang.String r2 = r4.value
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            int r1 = r0 * 31
            long r2 = r4.expiresAt
            int r2 = java.lang.Long.hashCode(r2)
            int r1 = r1 + r2
            int r0 = r1 * 31
            java.lang.String r2 = r4.domain
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            int r1 = r0 * 31
            java.lang.String r2 = r4.path
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            int r0 = r1 * 31
            boolean r2 = r4.secure
            int r2 = java.lang.Boolean.hashCode(r2)
            int r0 = r0 + r2
            int r1 = r0 * 31
            boolean r2 = r4.httpOnly
            int r2 = java.lang.Boolean.hashCode(r2)
            int r1 = r1 + r2
            int r0 = r1 * 31
            boolean r2 = r4.persistent
            int r2 = java.lang.Boolean.hashCode(r2)
            int r0 = r0 + r2
            int r1 = r0 * 31
            boolean r2 = r4.hostOnly
            int r2 = java.lang.Boolean.hashCode(r2)
            int r1 = r1 + r2
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

    public final boolean matches(okhttp3.HttpUrl r5) {
            r4 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r4.hostOnly
            if (r0 == 0) goto L14
            java.lang.String r0 = r5.host()
            java.lang.String r1 = r4.domain
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            goto L20
        L14:
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            java.lang.String r1 = r5.host()
            java.lang.String r2 = r4.domain
            boolean r0 = okhttp3.Cookie.Companion.access$domainMatch(r0, r1, r2)
        L20:
            r1 = 0
            if (r0 != 0) goto L25
            return r1
        L25:
            okhttp3.Cookie$Companion r2 = okhttp3.Cookie.Companion
            java.lang.String r3 = r4.path
            boolean r2 = okhttp3.Cookie.Companion.access$pathMatch(r2, r5, r3)
            if (r2 != 0) goto L30
            return r1
        L30:
            boolean r2 = r4.secure
            if (r2 == 0) goto L3a
            boolean r2 = r5.isHttps()
            if (r2 == 0) goto L3b
        L3a:
            r1 = 1
        L3b:
            return r1
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

    public final java.lang.String toString$okhttp(boolean r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.lang.String r2 = r6.name
            r0.append(r2)
            r2 = 61
            r0.append(r2)
            java.lang.String r2 = r6.value
            r0.append(r2)
            boolean r2 = r6.persistent
            if (r2 == 0) goto L3b
            long r2 = r6.expiresAt
            r4 = -9223372036854775808
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L27
            java.lang.String r2 = "; max-age=0"
            r0.append(r2)
            goto L3b
        L27:
            java.lang.String r2 = "; expires="
            java.lang.StringBuilder r2 = r0.append(r2)
            java.util.Date r3 = new java.util.Date
            long r4 = r6.expiresAt
            r3.<init>(r4)
            java.lang.String r3 = okhttp3.internal.http.DatesKt.toHttpDateString(r3)
            r2.append(r3)
        L3b:
            boolean r2 = r6.hostOnly
            if (r2 != 0) goto L50
            java.lang.String r2 = "; domain="
            r0.append(r2)
            if (r7 == 0) goto L4b
            java.lang.String r2 = "."
            r0.append(r2)
        L4b:
            java.lang.String r2 = r6.domain
            r0.append(r2)
        L50:
            java.lang.String r2 = "; path="
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r3 = r6.path
            r2.append(r3)
            boolean r2 = r6.secure
            if (r2 == 0) goto L64
            java.lang.String r2 = "; secure"
            r0.append(r2)
        L64:
            boolean r2 = r6.httpOnly
            if (r2 == 0) goto L6d
            java.lang.String r2 = "; httponly"
            r0.append(r2)
        L6d:
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    public final java.lang.String value() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}
