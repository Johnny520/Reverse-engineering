package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class HttpUrl {
    public static final okhttp3.HttpUrl.Companion Companion = null;
    public static final java.lang.String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final java.lang.String FRAGMENT_ENCODE_SET = "";
    public static final java.lang.String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    private static final char[] HEX_DIGITS = null;
    public static final java.lang.String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final java.lang.String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final java.lang.String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final java.lang.String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final java.lang.String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final java.lang.String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final java.lang.String QUERY_ENCODE_SET = " \"'<>#";
    public static final java.lang.String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final java.lang.String fragment;
    private final java.lang.String host;
    private final boolean isHttps;
    private final java.lang.String password;
    private final java.util.List<java.lang.String> pathSegments;
    private final int port;
    private final java.util.List<java.lang.String> queryNamesAndValues;
    private final java.lang.String scheme;
    private final java.lang.String url;
    private final java.lang.String username;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Builder {
        public static final okhttp3.HttpUrl.Builder.Companion Companion = null;
        public static final java.lang.String INVALID_HOST = "Invalid URL host";
        private java.lang.String encodedFragment;
        private java.lang.String encodedPassword;
        private final java.util.List<java.lang.String> encodedPathSegments;
        private java.util.List<java.lang.String> encodedQueryNamesAndValues;
        private java.lang.String encodedUsername;
        private java.lang.String host;
        private int port;
        private java.lang.String scheme;

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

            public static final /* synthetic */ int access$parsePort(okhttp3.HttpUrl.Builder.Companion r0, java.lang.String r1, int r2, int r3) {
                    int r0 = r0.parsePort(r1, r2, r3)
                    return r0
            }

            public static final /* synthetic */ int access$portColonOffset(okhttp3.HttpUrl.Builder.Companion r0, java.lang.String r1, int r2, int r3) {
                    int r0 = r0.portColonOffset(r1, r2, r3)
                    return r0
            }

            public static final /* synthetic */ int access$schemeDelimiterOffset(okhttp3.HttpUrl.Builder.Companion r0, java.lang.String r1, int r2, int r3) {
                    int r0 = r0.schemeDelimiterOffset(r1, r2, r3)
                    return r0
            }

            public static final /* synthetic */ int access$slashCount(okhttp3.HttpUrl.Builder.Companion r0, java.lang.String r1, int r2, int r3) {
                    int r0 = r0.slashCount(r1, r2, r3)
                    return r0
            }

            private final int parsePort(java.lang.String r14, int r15, int r16) {
                    r13 = this;
                    r0 = -1
                    okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion     // Catch: java.lang.NumberFormatException -> L21
                    java.lang.String r5 = ""
                    r11 = 248(0xf8, float:3.48E-43)
                    r12 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r2 = r14
                    r3 = r15
                    r4 = r16
                    java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.NumberFormatException -> L21
                    int r14 = java.lang.Integer.parseInt(r14)     // Catch: java.lang.NumberFormatException -> L21
                    r15 = 1
                    if (r15 > r14) goto L21
                    r15 = 65536(0x10000, float:9.1835E-41)
                    if (r14 >= r15) goto L21
                    return r14
                L21:
                    return r0
            }

            private final int portColonOffset(java.lang.String r3, int r4, int r5) {
                    r2 = this;
                L0:
                    if (r4 >= r5) goto L1f
                    char r0 = r3.charAt(r4)
                    r1 = 91
                    if (r0 != r1) goto L17
                La:
                    int r4 = r4 + 1
                    if (r4 >= r5) goto L1c
                    char r0 = r3.charAt(r4)
                    r1 = 93
                    if (r0 != r1) goto La
                    goto L1c
                L17:
                    r1 = 58
                    if (r0 != r1) goto L1c
                    return r4
                L1c:
                    int r4 = r4 + 1
                    goto L0
                L1f:
                    return r5
            }

            private final int schemeDelimiterOffset(java.lang.String r7, int r8, int r9) {
                    r6 = this;
                    int r0 = r9 - r8
                    r1 = 2
                    r2 = -1
                    if (r0 >= r1) goto L7
                    return r2
                L7:
                    char r0 = r7.charAt(r8)
                    r1 = 97
                    int r3 = gg.l.c(r0, r1)
                    r4 = 65
                    if (r3 < 0) goto L1d
                    r3 = 122(0x7a, float:1.71E-43)
                    int r3 = gg.l.c(r0, r3)
                    if (r3 <= 0) goto L2c
                L1d:
                    int r3 = gg.l.c(r0, r4)
                    if (r3 < 0) goto L5d
                    r3 = 90
                    int r0 = gg.l.c(r0, r3)
                    if (r0 <= 0) goto L2c
                    goto L5d
                L2c:
                    int r8 = r8 + 1
                    if (r8 >= r9) goto L5d
                    char r0 = r7.charAt(r8)
                    if (r1 > r0) goto L3b
                    r3 = 123(0x7b, float:1.72E-43)
                    if (r0 >= r3) goto L3b
                    goto L59
                L3b:
                    if (r4 > r0) goto L42
                    r3 = 91
                    if (r0 >= r3) goto L42
                    goto L59
                L42:
                    r3 = 48
                    r5 = 58
                    if (r3 > r0) goto L4b
                    if (r0 >= r5) goto L4b
                    goto L59
                L4b:
                    r3 = 43
                    if (r0 != r3) goto L50
                    goto L59
                L50:
                    r3 = 45
                    if (r0 != r3) goto L55
                    goto L59
                L55:
                    r3 = 46
                    if (r0 != r3) goto L5a
                L59:
                    goto L2c
                L5a:
                    if (r0 != r5) goto L5d
                    return r8
                L5d:
                    return r2
            }

            private final int slashCount(java.lang.String r4, int r5, int r6) {
                    r3 = this;
                    r0 = 0
                L1:
                    if (r5 >= r6) goto L14
                    char r1 = r4.charAt(r5)
                    r2 = 92
                    if (r1 == r2) goto Lf
                    r2 = 47
                    if (r1 != r2) goto L14
                Lf:
                    int r0 = r0 + 1
                    int r5 = r5 + 1
                    goto L1
                L14:
                    return r0
            }
        }

        static {
                okhttp3.HttpUrl$Builder$Companion r0 = new okhttp3.HttpUrl$Builder$Companion
                r1 = 0
                r0.<init>(r1)
                okhttp3.HttpUrl.Builder.Companion = r0
                return
        }

        public Builder() {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = ""
                r2.encodedUsername = r0
                r2.encodedPassword = r0
                r1 = -1
                r2.port = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r2.encodedPathSegments = r1
                r1.add(r0)
                return
        }

        private final okhttp3.HttpUrl.Builder addPathSegments(java.lang.String r8, boolean r9) {
                r7 = this;
                r0 = 0
                r3 = r0
            L2:
                java.lang.String r1 = "/\\"
                int r2 = r8.length()
                int r4 = okhttp3.internal.Util.delimiterOffset(r8, r1, r3, r2)
                int r1 = r8.length()
                if (r4 >= r1) goto L18
                r1 = 1
                r5 = r1
                r2 = r8
                r6 = r9
                r1 = r7
                goto L1c
            L18:
                r5 = r0
                r1 = r7
                r2 = r8
                r6 = r9
            L1c:
                r1.push(r2, r3, r4, r5, r6)
                int r3 = r4 + 1
                int r8 = r2.length()
                if (r3 <= r8) goto L28
                return r1
            L28:
                r8 = r2
                r9 = r6
                goto L2
        }

        private final int effectivePort() {
                r2 = this;
                int r0 = r2.port
                r1 = -1
                if (r0 == r1) goto L6
                return r0
            L6:
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                java.lang.String r1 = r2.scheme
                r1.getClass()
                int r0 = r0.defaultPort(r1)
                return r0
        }

        private final boolean isDot(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "."
                boolean r0 = gg.l.a(r2, r0)
                if (r0 != 0) goto L13
                java.lang.String r0 = "%2e"
                boolean r2 = og.t.X(r2, r0)
                if (r2 == 0) goto L11
                goto L13
            L11:
                r2 = 0
                return r2
            L13:
                r2 = 1
                return r2
        }

        private final boolean isDotDot(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = ".."
                boolean r0 = gg.l.a(r2, r0)
                if (r0 != 0) goto L23
                java.lang.String r0 = "%2e."
                boolean r0 = og.t.X(r2, r0)
                if (r0 != 0) goto L23
                java.lang.String r0 = ".%2e"
                boolean r0 = og.t.X(r2, r0)
                if (r0 != 0) goto L23
                java.lang.String r0 = "%2e%2e"
                boolean r2 = og.t.X(r2, r0)
                if (r2 == 0) goto L21
                goto L23
            L21:
                r2 = 0
                return r2
            L23:
                r2 = 1
                return r2
        }

        private final void pop() {
                r3 = this;
                java.util.List<java.lang.String> r0 = r3.encodedPathSegments
                int r1 = r0.size()
                int r1 = r1 + (-1)
                java.lang.Object r0 = r0.remove(r1)
                java.lang.String r0 = (java.lang.String) r0
                int r0 = r0.length()
                java.lang.String r1 = ""
                if (r0 != 0) goto L2a
                java.util.List<java.lang.String> r0 = r3.encodedPathSegments
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L2a
                java.util.List<java.lang.String> r0 = r3.encodedPathSegments
                int r2 = r0.size()
                int r2 = r2 + (-1)
                r0.set(r2, r1)
                return
            L2a:
                java.util.List<java.lang.String> r0 = r3.encodedPathSegments
                r0.add(r1)
                return
        }

        private final void push(java.lang.String r13, int r14, int r15, boolean r16, boolean r17) {
                r12 = this;
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r10 = 240(0xf0, float:3.36E-43)
                r11 = 0
                java.lang.String r4 = " \"<>^`{}|/\\?#"
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r1 = r13
                r2 = r14
                r3 = r15
                r5 = r17
                java.lang.String r13 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                boolean r14 = r12.isDot(r13)
                if (r14 == 0) goto L1b
                goto L51
            L1b:
                boolean r14 = r12.isDotDot(r13)
                if (r14 == 0) goto L25
                r12.pop()
                return
            L25:
                java.util.List<java.lang.String> r14 = r12.encodedPathSegments
                int r15 = r14.size()
                int r15 = r15 + (-1)
                java.lang.Object r14 = r14.get(r15)
                java.lang.CharSequence r14 = (java.lang.CharSequence) r14
                int r14 = r14.length()
                java.util.List<java.lang.String> r15 = r12.encodedPathSegments
                if (r14 != 0) goto L45
                int r14 = r15.size()
                int r14 = r14 + (-1)
                r15.set(r14, r13)
                goto L48
            L45:
                r15.add(r13)
            L48:
                if (r16 == 0) goto L51
                java.util.List<java.lang.String> r13 = r12.encodedPathSegments
                java.lang.String r14 = ""
                r13.add(r14)
            L51:
                return
        }

        private final void removeAllCanonicalQueryParameters(java.lang.String r5) {
                r4 = this;
                java.util.List<java.lang.String> r0 = r4.encodedQueryNamesAndValues
                r0.getClass()
                int r0 = r0.size()
                int r0 = r0 + (-2)
                r1 = 0
                r2 = -2
                int r1 = oh.h.A(r0, r1, r2)
                if (r1 > r0) goto L48
            L13:
                java.util.List<java.lang.String> r2 = r4.encodedQueryNamesAndValues
                r2.getClass()
                java.lang.Object r2 = r2.get(r0)
                boolean r2 = gg.l.a(r5, r2)
                if (r2 == 0) goto L43
                java.util.List<java.lang.String> r2 = r4.encodedQueryNamesAndValues
                r2.getClass()
                int r3 = r0 + 1
                r2.remove(r3)
                java.util.List<java.lang.String> r2 = r4.encodedQueryNamesAndValues
                r2.getClass()
                r2.remove(r0)
                java.util.List<java.lang.String> r2 = r4.encodedQueryNamesAndValues
                r2.getClass()
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L43
                r5 = 0
                r4.encodedQueryNamesAndValues = r5
                return
            L43:
                if (r0 == r1) goto L48
                int r0 = r0 + (-2)
                goto L13
            L48:
                return
        }

        private final void resolvePath(java.lang.String r11, int r12, int r13) {
                r10 = this;
                if (r12 != r13) goto L3
                goto L48
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L2a
            L1e:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.add(r2)
                int r12 = r12 + 1
            L2a:
                r6 = r12
            L2b:
                if (r6 >= r13) goto L48
                java.lang.String r12 = "/\\"
                int r7 = okhttp3.internal.Util.delimiterOffset(r11, r12, r6, r13)
                if (r7 >= r13) goto L37
                r8 = r3
                goto L39
            L37:
                r12 = 0
                r8 = r12
            L39:
                r9 = 1
                r4 = r10
                r5 = r11
                r4.push(r5, r6, r7, r8, r9)
                if (r8 == 0) goto L45
                int r6 = r7 + 1
                r11 = r5
                goto L2b
            L45:
                r11 = r5
                r6 = r7
                goto L2b
            L48:
                return
        }

        public final okhttp3.HttpUrl.Builder addEncodedPathSegment(java.lang.String r7) {
                r6 = this;
                r7.getClass()
                int r3 = r7.length()
                r4 = 0
                r5 = 1
                r2 = 0
                r0 = r6
                r1 = r7
                r0.push(r1, r2, r3, r4, r5)
                return r0
        }

        public final okhttp3.HttpUrl.Builder addEncodedPathSegments(java.lang.String r2) {
                r1 = this;
                r2.getClass()
                r0 = 1
                okhttp3.HttpUrl$Builder r2 = r1.addPathSegments(r2, r0)
                return r2
        }

        public final okhttp3.HttpUrl.Builder addEncodedQueryParameter(java.lang.String r14, java.lang.String r15) {
                r13 = this;
                r14.getClass()
                java.util.List<java.lang.String> r0 = r13.encodedQueryNamesAndValues
                if (r0 != 0) goto Le
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r13.encodedQueryNamesAndValues = r0
            Le:
                java.util.List<java.lang.String> r0 = r13.encodedQueryNamesAndValues
                r0.getClass()
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r11 = 211(0xd3, float:2.96E-43)
                r12 = 0
                r3 = 0
                r4 = 0
                java.lang.String r5 = " \"'<>#&="
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r2 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r0.add(r14)
                java.util.List<java.lang.String> r14 = r13.encodedQueryNamesAndValues
                r14.getClass()
                if (r15 == 0) goto L42
                r11 = 211(0xd3, float:2.96E-43)
                r12 = 0
                r3 = 0
                r4 = 0
                java.lang.String r5 = " \"'<>#&="
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r2 = r15
                java.lang.String r15 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                goto L43
            L42:
                r15 = 0
            L43:
                r14.add(r15)
                return r13
        }

        public final okhttp3.HttpUrl.Builder addPathSegment(java.lang.String r7) {
                r6 = this;
                r7.getClass()
                int r3 = r7.length()
                r4 = 0
                r5 = 0
                r2 = 0
                r0 = r6
                r1 = r7
                r0.push(r1, r2, r3, r4, r5)
                return r0
        }

        public final okhttp3.HttpUrl.Builder addPathSegments(java.lang.String r2) {
                r1 = this;
                r2.getClass()
                r0 = 0
                okhttp3.HttpUrl$Builder r2 = r1.addPathSegments(r2, r0)
                return r2
        }

        public final okhttp3.HttpUrl.Builder addQueryParameter(java.lang.String r14, java.lang.String r15) {
                r13 = this;
                r14.getClass()
                java.util.List<java.lang.String> r0 = r13.encodedQueryNamesAndValues
                if (r0 != 0) goto Le
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r13.encodedQueryNamesAndValues = r0
            Le:
                java.util.List<java.lang.String> r0 = r13.encodedQueryNamesAndValues
                r0.getClass()
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r11 = 219(0xdb, float:3.07E-43)
                r12 = 0
                r3 = 0
                r4 = 0
                java.lang.String r5 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r2 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r0.add(r14)
                java.util.List<java.lang.String> r14 = r13.encodedQueryNamesAndValues
                r14.getClass()
                if (r15 == 0) goto L42
                r11 = 219(0xdb, float:3.07E-43)
                r12 = 0
                r3 = 0
                r4 = 0
                java.lang.String r5 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r2 = r15
                java.lang.String r15 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                goto L43
            L42:
                r15 = 0
            L43:
                r14.add(r15)
                return r13
        }

        public final okhttp3.HttpUrl build() {
                r19 = this;
                r0 = r19
                java.lang.String r2 = r0.scheme
                if (r2 == 0) goto La8
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                java.lang.String r4 = r0.encodedUsername
                r8 = 7
                r9 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                java.lang.String r1 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r3, r4, r5, r6, r7, r8, r9)
                java.lang.String r4 = r0.encodedPassword
                java.lang.String r4 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r3, r4, r5, r6, r7, r8, r9)
                java.lang.String r5 = r0.host
                if (r5 == 0) goto La1
                int r6 = r0.effectivePort()
                java.util.List<java.lang.String> r3 = r0.encodedPathSegments
                java.util.ArrayList r7 = new java.util.ArrayList
                int r8 = tf.n.e1(r3)
                r7.<init>(r8)
                java.util.Iterator r3 = r3.iterator()
            L30:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L4c
                java.lang.Object r8 = r3.next()
                r10 = r8
                java.lang.String r10 = (java.lang.String) r10
                okhttp3.HttpUrl$Companion r9 = okhttp3.HttpUrl.Companion
                r14 = 7
                r15 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                java.lang.String r8 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r9, r10, r11, r12, r13, r14, r15)
                r7.add(r8)
                goto L30
            L4c:
                java.util.List<java.lang.String> r3 = r0.encodedQueryNamesAndValues
                r8 = 0
                if (r3 == 0) goto L80
                java.util.ArrayList r9 = new java.util.ArrayList
                int r10 = tf.n.e1(r3)
                r9.<init>(r10)
                java.util.Iterator r3 = r3.iterator()
            L5e:
                boolean r10 = r3.hasNext()
                if (r10 == 0) goto L81
                java.lang.Object r10 = r3.next()
                r12 = r10
                java.lang.String r12 = (java.lang.String) r12
                if (r12 == 0) goto L7b
                okhttp3.HttpUrl$Companion r11 = okhttp3.HttpUrl.Companion
                r16 = 3
                r17 = 0
                r13 = 0
                r14 = 0
                r15 = 1
                java.lang.String r10 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r11, r12, r13, r14, r15, r16, r17)
                goto L7c
            L7b:
                r10 = r8
            L7c:
                r9.add(r10)
                goto L5e
            L80:
                r9 = r8
            L81:
                java.lang.String r11 = r0.encodedFragment
                if (r11 == 0) goto L91
                okhttp3.HttpUrl$Companion r10 = okhttp3.HttpUrl.Companion
                r15 = 7
                r16 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                java.lang.String r8 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r10, r11, r12, r13, r14, r15, r16)
            L91:
                java.lang.String r10 = r0.toString()
                r3 = r1
                okhttp3.HttpUrl r1 = new okhttp3.HttpUrl
                r18 = r9
                r9 = r8
                r8 = r18
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r1
            La1:
                java.lang.String r1 = "host == null"
                j8.o.A(r1)
                r1 = 0
                return r1
            La8:
                java.lang.String r1 = "scheme == null"
                j8.o.A(r1)
                r1 = 0
                return r1
        }

        public final okhttp3.HttpUrl.Builder encodedFragment(java.lang.String r13) {
                r12 = this;
                if (r13 == 0) goto L16
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r10 = 179(0xb3, float:2.51E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = ""
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r1 = r13
                java.lang.String r13 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                goto L17
            L16:
                r13 = 0
            L17:
                r12.encodedFragment = r13
                return r12
        }

        public final okhttp3.HttpUrl.Builder encodedPassword(java.lang.String r13) {
                r12 = this;
                r13.getClass()
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r10 = 243(0xf3, float:3.4E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r1 = r13
                java.lang.String r13 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r12.encodedPassword = r13
                return r12
        }

        public final okhttp3.HttpUrl.Builder encodedPath(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                java.lang.String r0 = "/"
                r1 = 0
                boolean r0 = og.t.d0(r3, r0, r1)
                if (r0 == 0) goto L14
                int r0 = r3.length()
                r2.resolvePath(r3, r1, r0)
                return r2
            L14:
                java.lang.String r0 = "unexpected encodedPath: "
                java.lang.String r3 = r0.concat(r3)
                j8.o.q(r3)
                r3 = 0
                return r3
        }

        public final okhttp3.HttpUrl.Builder encodedQuery(java.lang.String r13) {
                r12 = this;
                if (r13 == 0) goto L1c
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r10 = 211(0xd3, float:2.96E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"'<>#"
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r1 = r13
                java.lang.String r13 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 == 0) goto L1c
                java.util.List r13 = r0.toQueryNamesAndValues$okhttp(r13)
                goto L1d
            L1c:
                r13 = 0
            L1d:
                r12.encodedQueryNamesAndValues = r13
                return r12
        }

        public final okhttp3.HttpUrl.Builder encodedUsername(java.lang.String r13) {
                r12 = this;
                r13.getClass()
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r10 = 243(0xf3, float:3.4E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r1 = r13
                java.lang.String r13 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r12.encodedUsername = r13
                return r12
        }

        public final okhttp3.HttpUrl.Builder fragment(java.lang.String r13) {
                r12 = this;
                if (r13 == 0) goto L16
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r10 = 187(0xbb, float:2.62E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = ""
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r1 = r13
                java.lang.String r13 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                goto L17
            L16:
                r13 = 0
            L17:
                r12.encodedFragment = r13
                return r12
        }

        public final java.lang.String getEncodedFragment$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.encodedFragment
                return r0
        }

        public final java.lang.String getEncodedPassword$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.encodedPassword
                return r0
        }

        public final java.util.List<java.lang.String> getEncodedPathSegments$okhttp() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.encodedPathSegments
                return r0
        }

        public final java.util.List<java.lang.String> getEncodedQueryNamesAndValues$okhttp() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.encodedQueryNamesAndValues
                return r0
        }

        public final java.lang.String getEncodedUsername$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.encodedUsername
                return r0
        }

        public final java.lang.String getHost$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.host
                return r0
        }

        public final int getPort$okhttp() {
                r1 = this;
                int r0 = r1.port
                return r0
        }

        public final java.lang.String getScheme$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.scheme
                return r0
        }

        public final okhttp3.HttpUrl.Builder host(java.lang.String r8) {
                r7 = this;
                r8.getClass()
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r5 = 7
                r6 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r1 = r8
                java.lang.String r8 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r0, r1, r2, r3, r4, r5, r6)
                java.lang.String r8 = okhttp3.internal.HostnamesKt.toCanonicalHost(r8)
                if (r8 == 0) goto L18
                r7.host = r8
                return r7
            L18:
                java.lang.String r8 = "unexpected host: "
                java.lang.String r8 = r8.concat(r1)
                j8.o.t(r8)
                r8 = 0
                return r8
        }

        public final okhttp3.HttpUrl.Builder parse$okhttp(okhttp3.HttpUrl r24, java.lang.String r25) {
                r23 = this;
                r0 = r23
                r2 = r25
                r2.getClass()
                r1 = 0
                r3 = 3
                r4 = 0
                int r3 = okhttp3.internal.Util.indexOfFirstNonAsciiWhitespace$default(r2, r1, r1, r3, r4)
                r5 = 2
                int r13 = okhttp3.internal.Util.indexOfLastNonAsciiWhitespace$default(r2, r3, r1, r5, r4)
                okhttp3.HttpUrl$Builder$Companion r4 = okhttp3.HttpUrl.Builder.Companion
                int r6 = okhttp3.HttpUrl.Builder.Companion.access$schemeDelimiterOffset(r4, r2, r3, r13)
                r14 = 1
                r15 = -1
                if (r6 == r15) goto L58
                java.lang.String r7 = "https:"
                boolean r7 = og.t.c0(r2, r7, r3, r14)
                if (r7 == 0) goto L2c
                java.lang.String r6 = "https"
                r0.scheme = r6
                int r3 = r3 + 6
                goto L60
            L2c:
                java.lang.String r7 = "http:"
                boolean r7 = og.t.c0(r2, r7, r3, r14)
                if (r7 == 0) goto L3b
                java.lang.String r6 = "http"
                r0.scheme = r6
                int r3 = r3 + 5
                goto L60
            L3b:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r2.substring(r1, r6)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "Expected URL scheme 'http' or 'https' but was '"
                r2.<init>(r4)
                r2.append(r1)
                r1 = 39
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r3.<init>(r1)
                throw r3
            L58:
                if (r24 == 0) goto L227
                java.lang.String r6 = r24.scheme()
                r0.scheme = r6
            L60:
                int r4 = okhttp3.HttpUrl.Builder.Companion.access$slashCount(r4, r2, r3, r13)
                r6 = 63
                r7 = 35
                if (r4 >= r5) goto Lb2
                if (r24 == 0) goto Lb2
                java.lang.String r5 = r24.scheme()
                java.lang.String r8 = r0.scheme
                boolean r5 = gg.l.a(r5, r8)
                if (r5 != 0) goto L79
                goto Lb2
            L79:
                java.lang.String r1 = r24.encodedUsername()
                r0.encodedUsername = r1
                java.lang.String r1 = r24.encodedPassword()
                r0.encodedPassword = r1
                java.lang.String r1 = r24.host()
                r0.host = r1
                int r1 = r24.port()
                r0.port = r1
                java.util.List<java.lang.String> r1 = r0.encodedPathSegments
                r1.clear()
                java.util.List<java.lang.String> r1 = r0.encodedPathSegments
                java.util.List r4 = r24.encodedPathSegments()
                r1.addAll(r4)
                if (r3 == r13) goto La7
                char r1 = r2.charAt(r3)
                if (r1 != r7) goto Lae
            La7:
                java.lang.String r1 = r24.encodedQuery()
                r0.encodedQuery(r1)
            Lae:
                r22 = r14
                goto L1c5
            Lb2:
                int r3 = r3 + r4
                r16 = r1
                r17 = r16
            Lb7:
                java.lang.String r1 = "@/\\?#"
                int r1 = okhttp3.internal.Util.delimiterOffset(r2, r1, r3, r13)
                if (r1 == r13) goto Lc4
                char r4 = r2.charAt(r1)
                goto Lc5
            Lc4:
                r4 = r15
            Lc5:
                if (r4 == r15) goto L175
                if (r4 == r7) goto L175
                r5 = 47
                if (r4 == r5) goto L175
                r5 = 92
                if (r4 == r5) goto L175
                if (r4 == r6) goto L175
                r5 = 64
                if (r4 == r5) goto Ld8
                goto Lb7
            Ld8:
                java.lang.String r4 = "%40"
                if (r16 != 0) goto L13d
                r5 = 58
                int r5 = okhttp3.internal.Util.delimiterOffset(r2, r5, r3, r1)
                r8 = r1
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r11 = 240(0xf0, float:3.36E-43)
                r12 = 0
                r9 = r4
                r4 = r5
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r10 = r6
                r6 = 1
                r18 = r7
                r7 = 0
                r19 = r8
                r8 = 0
                r20 = r9
                r9 = 0
                r21 = r10
                r10 = 0
                r22 = r14
                r14 = r19
                r15 = r20
                java.lang.String r3 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                if (r17 == 0) goto L11a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = r0.encodedUsername
                r2.append(r5)
                r2.append(r15)
                r2.append(r3)
                java.lang.String r3 = r2.toString()
            L11a:
                r0.encodedUsername = r3
                if (r4 == r14) goto L136
                int r3 = r4 + 1
                r11 = 240(0xf0, float:3.36E-43)
                r12 = 0
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r2 = r25
                r4 = r14
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r0.encodedPassword = r1
                r16 = r22
                goto L137
            L136:
                r4 = r14
            L137:
                r2 = r25
                r8 = r4
                r17 = r22
                goto L16a
            L13d:
                r15 = r4
                r22 = r14
                r4 = r1
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r1 = r0.encodedPassword
                r14.append(r1)
                r14.append(r15)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r11 = 240(0xf0, float:3.36E-43)
                r12 = 0
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r2 = r25
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r8 = r4
                r14.append(r1)
                java.lang.String r1 = r14.toString()
                r0.encodedPassword = r1
            L16a:
                int r3 = r8 + 1
                r14 = r22
                r6 = 63
                r7 = 35
                r15 = -1
                goto Lb7
            L175:
                r8 = r1
                r22 = r14
                okhttp3.HttpUrl$Builder$Companion r9 = okhttp3.HttpUrl.Builder.Companion
                int r4 = okhttp3.HttpUrl.Builder.Companion.access$portColonOffset(r9, r2, r3, r8)
                int r10 = r4 + 1
                if (r10 >= r8) goto L1a6
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r6 = 4
                r7 = 0
                r5 = 0
                java.lang.String r1 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r1, r2, r3, r4, r5, r6, r7)
                java.lang.String r1 = okhttp3.internal.HostnamesKt.toCanonicalHost(r1)
                r0.host = r1
                int r1 = okhttp3.HttpUrl.Builder.Companion.access$parsePort(r9, r2, r10, r8)
                r0.port = r1
                r5 = -1
                if (r1 == r5) goto L19b
                goto L1c0
            L19b:
                java.lang.String r1 = "Invalid URL port: \""
                java.lang.String r2 = r2.substring(r10, r8)
                j8.o.r(r2, r1)
            L1a4:
                r1 = 0
                return r1
            L1a6:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r6 = 4
                r7 = 0
                r5 = 0
                java.lang.String r5 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r1, r2, r3, r4, r5, r6, r7)
                java.lang.String r5 = okhttp3.internal.HostnamesKt.toCanonicalHost(r5)
                r0.host = r5
                java.lang.String r5 = r0.scheme
                r5.getClass()
                int r1 = r1.defaultPort(r5)
                r0.port = r1
            L1c0:
                java.lang.String r1 = r0.host
                if (r1 == 0) goto L21c
                r3 = r8
            L1c5:
                java.lang.String r1 = "?#"
                int r1 = okhttp3.internal.Util.delimiterOffset(r2, r1, r3, r13)
                r0.resolvePath(r2, r3, r1)
                if (r1 >= r13) goto L1f9
                char r3 = r2.charAt(r1)
                r10 = 63
                if (r3 != r10) goto L1f9
                r14 = 35
                int r4 = okhttp3.internal.Util.delimiterOffset(r2, r14, r1, r13)
                r3 = r1
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                int r3 = r3 + 1
                r11 = 208(0xd0, float:2.91E-43)
                r12 = 0
                java.lang.String r5 = " \"'<>#"
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                java.lang.String r3 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                java.util.List r1 = r1.toQueryNamesAndValues$okhttp(r3)
                r0.encodedQueryNamesAndValues = r1
                r1 = r4
                goto L1fd
            L1f9:
                r3 = r1
                r14 = 35
                r1 = r3
            L1fd:
                if (r1 >= r13) goto L21b
                char r3 = r2.charAt(r1)
                if (r3 != r14) goto L21b
                r3 = r1
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                int r3 = r3 + 1
                r11 = 176(0xb0, float:2.47E-43)
                r12 = 0
                java.lang.String r5 = ""
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r4 = r13
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r0.encodedFragment = r1
            L21b:
                return r0
            L21c:
                java.lang.String r1 = "Invalid URL host: \""
                java.lang.String r2 = r2.substring(r3, r4)
                j8.o.r(r2, r1)
                goto L1a4
            L227:
                int r1 = r2.length()
                r3 = 6
                if (r1 <= r3) goto L239
                java.lang.String r1 = og.m.P0(r3, r2)
                java.lang.String r2 = "..."
                java.lang.String r1 = r1.concat(r2)
                goto L23a
            L239:
                r1 = r2
            L23a:
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but no scheme was found for "
                java.lang.String r1 = r2.concat(r1)
                j8.o.t(r1)
                goto L1a4
        }

        public final okhttp3.HttpUrl.Builder password(java.lang.String r13) {
                r12 = this;
                r13.getClass()
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r10 = 251(0xfb, float:3.52E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r1 = r13
                java.lang.String r13 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r12.encodedPassword = r13
                return r12
        }

        public final okhttp3.HttpUrl.Builder port(int r2) {
                r1 = this;
                r0 = 1
                if (r0 > r2) goto La
                r0 = 65536(0x10000, float:9.1835E-41)
                if (r2 >= r0) goto La
                r1.port = r2
                return r1
            La:
                java.lang.String r0 = "unexpected port: "
                java.lang.String r2 = eh.a.l(r2, r0)
                j8.o.q(r2)
                r2 = 0
                return r2
        }

        public final okhttp3.HttpUrl.Builder query(java.lang.String r13) {
                r12 = this;
                if (r13 == 0) goto L1c
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r10 = 219(0xdb, float:3.07E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"'<>#"
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r1 = r13
                java.lang.String r13 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 == 0) goto L1c
                java.util.List r13 = r0.toQueryNamesAndValues$okhttp(r13)
                goto L1d
            L1c:
                r13 = 0
            L1d:
                r12.encodedQueryNamesAndValues = r13
                return r12
        }

        public final okhttp3.HttpUrl.Builder reencodeForUri$okhttp() {
                r18 = this;
                r0 = r18
                java.lang.String r1 = r0.host
                r2 = 0
                if (r1 == 0) goto L10
                java.lang.String r3 = "[\"<>^`{|}]"
                java.lang.String r4 = ""
                java.lang.String r1 = j8.b.h(r3, r1, r4)
                goto L11
            L10:
                r1 = r2
            L11:
                r0.host = r1
                java.util.List<java.lang.String> r1 = r0.encodedPathSegments
                int r1 = r1.size()
                r3 = 0
                r4 = r3
            L1b:
                if (r4 >= r1) goto L3e
                java.util.List<java.lang.String> r5 = r0.encodedPathSegments
                okhttp3.HttpUrl$Companion r6 = okhttp3.HttpUrl.Companion
                java.lang.Object r7 = r5.get(r4)
                java.lang.String r7 = (java.lang.String) r7
                r16 = 227(0xe3, float:3.18E-43)
                r17 = 0
                r8 = 0
                r9 = 0
                java.lang.String r10 = "[]"
                r11 = 1
                r12 = 1
                r13 = 0
                r14 = 0
                r15 = 0
                java.lang.String r6 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                r5.set(r4, r6)
                int r4 = r4 + 1
                goto L1b
            L3e:
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                if (r1 == 0) goto L6c
                int r4 = r1.size()
            L46:
                if (r3 >= r4) goto L6c
                java.lang.Object r5 = r1.get(r3)
                r7 = r5
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L65
                okhttp3.HttpUrl$Companion r6 = okhttp3.HttpUrl.Companion
                r16 = 195(0xc3, float:2.73E-43)
                r17 = 0
                r8 = 0
                r9 = 0
                java.lang.String r10 = "\\^`{|}"
                r11 = 1
                r12 = 1
                r13 = 1
                r14 = 0
                r15 = 0
                java.lang.String r5 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                goto L66
            L65:
                r5 = r2
            L66:
                r1.set(r3, r5)
                int r3 = r3 + 1
                goto L46
            L6c:
                java.lang.String r6 = r0.encodedFragment
                if (r6 == 0) goto L83
                okhttp3.HttpUrl$Companion r5 = okhttp3.HttpUrl.Companion
                r15 = 163(0xa3, float:2.28E-43)
                r16 = 0
                r7 = 0
                r8 = 0
                java.lang.String r9 = " \"#<>\\^`{|}"
                r10 = 1
                r11 = 1
                r12 = 0
                r13 = 1
                r14 = 0
                java.lang.String r2 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            L83:
                r0.encodedFragment = r2
                return r0
        }

        public final okhttp3.HttpUrl.Builder removeAllEncodedQueryParameters(java.lang.String r14) {
                r13 = this;
                r14.getClass()
                java.util.List<java.lang.String> r0 = r13.encodedQueryNamesAndValues
                if (r0 != 0) goto L8
                return r13
            L8:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r11 = 211(0xd3, float:2.96E-43)
                r12 = 0
                r3 = 0
                r4 = 0
                java.lang.String r5 = " \"'<>#&="
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r2 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r13.removeAllCanonicalQueryParameters(r14)
                return r13
        }

        public final okhttp3.HttpUrl.Builder removeAllQueryParameters(java.lang.String r14) {
                r13 = this;
                r14.getClass()
                java.util.List<java.lang.String> r0 = r13.encodedQueryNamesAndValues
                if (r0 != 0) goto L8
                return r13
            L8:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r11 = 219(0xdb, float:3.07E-43)
                r12 = 0
                r3 = 0
                r4 = 0
                java.lang.String r5 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r2 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r13.removeAllCanonicalQueryParameters(r14)
                return r13
        }

        public final okhttp3.HttpUrl.Builder removePathSegment(int r2) {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.encodedPathSegments
                r0.remove(r2)
                java.util.List<java.lang.String> r2 = r1.encodedPathSegments
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L14
                java.util.List<java.lang.String> r2 = r1.encodedPathSegments
                java.lang.String r0 = ""
                r2.add(r0)
            L14:
                return r1
        }

        public final okhttp3.HttpUrl.Builder scheme(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                java.lang.String r0 = "http"
                boolean r1 = r3.equalsIgnoreCase(r0)
                if (r1 == 0) goto Le
                r2.scheme = r0
                return r2
            Le:
                java.lang.String r0 = "https"
                boolean r1 = r3.equalsIgnoreCase(r0)
                if (r1 == 0) goto L19
                r2.scheme = r0
                return r2
            L19:
                java.lang.String r0 = "unexpected scheme: "
                java.lang.String r3 = r0.concat(r3)
                j8.o.t(r3)
                r3 = 0
                return r3
        }

        public final void setEncodedFragment$okhttp(java.lang.String r1) {
                r0 = this;
                r0.encodedFragment = r1
                return
        }

        public final void setEncodedPassword$okhttp(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                r0.encodedPassword = r1
                return
        }

        public final okhttp3.HttpUrl.Builder setEncodedPathSegment(int r13, java.lang.String r14) {
                r12 = this;
                r14.getClass()
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r10 = 243(0xf3, float:3.4E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"<>^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r1 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.util.List<java.lang.String> r0 = r12.encodedPathSegments
                r0.set(r13, r14)
                boolean r13 = r12.isDot(r14)
                if (r13 != 0) goto L28
                boolean r13 = r12.isDotDot(r14)
                if (r13 != 0) goto L28
                return r12
            L28:
                java.lang.String r13 = "unexpected path segment: "
                java.lang.String r13 = r13.concat(r1)
                j8.o.q(r13)
                r13 = 0
                return r13
        }

        public final void setEncodedQueryNamesAndValues$okhttp(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.encodedQueryNamesAndValues = r1
                return
        }

        public final okhttp3.HttpUrl.Builder setEncodedQueryParameter(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r1.getClass()
                r0.removeAllEncodedQueryParameters(r1)
                r0.addEncodedQueryParameter(r1, r2)
                return r0
        }

        public final void setEncodedUsername$okhttp(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                r0.encodedUsername = r1
                return
        }

        public final void setHost$okhttp(java.lang.String r1) {
                r0 = this;
                r0.host = r1
                return
        }

        public final okhttp3.HttpUrl.Builder setPathSegment(int r13, java.lang.String r14) {
                r12 = this;
                r14.getClass()
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r10 = 251(0xfb, float:3.52E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"<>^`{}|/\\?#"
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r1 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                boolean r0 = r12.isDot(r14)
                if (r0 != 0) goto L28
                boolean r0 = r12.isDotDot(r14)
                if (r0 != 0) goto L28
                java.util.List<java.lang.String> r0 = r12.encodedPathSegments
                r0.set(r13, r14)
                return r12
            L28:
                java.lang.String r13 = "unexpected path segment: "
                java.lang.String r13 = r13.concat(r1)
                j8.o.q(r13)
                r13 = 0
                return r13
        }

        public final void setPort$okhttp(int r1) {
                r0 = this;
                r0.port = r1
                return
        }

        public final okhttp3.HttpUrl.Builder setQueryParameter(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r1.getClass()
                r0.removeAllQueryParameters(r1)
                r0.addQueryParameter(r1, r2)
                return r0
        }

        public final void setScheme$okhttp(java.lang.String r1) {
                r0 = this;
                r0.scheme = r1
                return
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r5.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r5.encodedUsername
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r5.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r5.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r5.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r5.encodedPassword
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r5.host
                if (r1 == 0) goto L63
                boolean r1 = og.m.i0(r1, r2)
                if (r1 == 0) goto L5e
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r5.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L63
            L5e:
                java.lang.String r1 = r5.host
                r0.append(r1)
            L63:
                int r1 = r5.port
                r3 = -1
                if (r1 != r3) goto L6c
                java.lang.String r1 = r5.scheme
                if (r1 == 0) goto L82
            L6c:
                int r1 = r5.effectivePort()
                java.lang.String r3 = r5.scheme
                if (r3 == 0) goto L7c
                okhttp3.HttpUrl$Companion r4 = okhttp3.HttpUrl.Companion
                int r3 = r4.defaultPort(r3)
                if (r1 == r3) goto L82
            L7c:
                r0.append(r2)
                r0.append(r1)
            L82:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r5.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r2 = r5.encodedQueryNamesAndValues
                if (r2 == 0) goto L9a
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r5.encodedQueryNamesAndValues
                r2.getClass()
                r1.toQueryString$okhttp(r2, r0)
            L9a:
                java.lang.String r1 = r5.encodedFragment
                if (r1 == 0) goto La8
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r5.encodedFragment
                r0.append(r1)
            La8:
                java.lang.String r0 = r0.toString()
                return r0
        }

        public final okhttp3.HttpUrl.Builder username(java.lang.String r13) {
                r12 = this;
                r13.getClass()
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r10 = 251(0xfb, float:3.52E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r1 = r13
                java.lang.String r13 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r12.encodedUsername = r13
                return r12
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

        public static /* synthetic */ java.lang.String canonicalize$okhttp$default(okhttp3.HttpUrl.Companion r1, java.lang.String r2, int r3, int r4, java.lang.String r5, boolean r6, boolean r7, boolean r8, boolean r9, java.nio.charset.Charset r10, int r11, java.lang.Object r12) {
                r12 = r11 & 1
                r0 = 0
                if (r12 == 0) goto L6
                r3 = r0
            L6:
                r12 = r11 & 2
                if (r12 == 0) goto Le
                int r4 = r2.length()
            Le:
                r12 = r11 & 8
                if (r12 == 0) goto L13
                r6 = r0
            L13:
                r12 = r11 & 16
                if (r12 == 0) goto L18
                r7 = r0
            L18:
                r12 = r11 & 32
                if (r12 == 0) goto L1d
                r8 = r0
            L1d:
                r12 = r11 & 64
                if (r12 == 0) goto L22
                r9 = r0
            L22:
                r11 = r11 & 128(0x80, float:1.8E-43)
                if (r11 == 0) goto L27
                r10 = 0
            L27:
                java.lang.String r1 = r1.canonicalize$okhttp(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r1
        }

        private final boolean isPercentEncoded(java.lang.String r3, int r4, int r5) {
                r2 = this;
                int r0 = r4 + 2
                if (r0 >= r5) goto L24
                char r5 = r3.charAt(r4)
                r1 = 37
                if (r5 != r1) goto L24
                r5 = 1
                int r4 = r4 + r5
                char r4 = r3.charAt(r4)
                int r4 = okhttp3.internal.Util.parseHexDigit(r4)
                r1 = -1
                if (r4 == r1) goto L24
                char r3 = r3.charAt(r0)
                int r3 = okhttp3.internal.Util.parseHexDigit(r3)
                if (r3 == r1) goto L24
                return r5
            L24:
                r3 = 0
                return r3
        }

        public static /* synthetic */ java.lang.String percentDecode$okhttp$default(okhttp3.HttpUrl.Companion r1, java.lang.String r2, int r3, int r4, boolean r5, int r6, java.lang.Object r7) {
                r7 = r6 & 1
                r0 = 0
                if (r7 == 0) goto L6
                r3 = r0
            L6:
                r7 = r6 & 2
                if (r7 == 0) goto Le
                int r4 = r2.length()
            Le:
                r6 = r6 & 4
                if (r6 == 0) goto L13
                r5 = r0
            L13:
                java.lang.String r1 = r1.percentDecode$okhttp(r2, r3, r4, r5)
                return r1
        }

        private final void writeCanonicalized(okio.Buffer r8, java.lang.String r9, int r10, int r11, java.lang.String r12, boolean r13, boolean r14, boolean r15, boolean r16, java.nio.charset.Charset r17) {
                r7 = this;
                r0 = r17
                r1 = 0
            L3:
                if (r10 >= r11) goto La4
                int r2 = r9.codePointAt(r10)
                if (r13 == 0) goto L1d
                r3 = 9
                if (r2 == r3) goto L9d
                r3 = 10
                if (r2 == r3) goto L9d
                r3 = 12
                if (r2 == r3) goto L9d
                r3 = 13
                if (r2 != r3) goto L1d
                goto L9d
            L1d:
                r3 = 43
                if (r2 != r3) goto L2f
                if (r15 == 0) goto L2f
                if (r13 == 0) goto L28
                java.lang.String r3 = "+"
                goto L2a
            L28:
                java.lang.String r3 = "%2B"
            L2a:
                r8.writeUtf8(r3)
                goto L9d
            L2f:
                r3 = 32
                r4 = 37
                if (r2 < r3) goto L57
                r3 = 127(0x7f, float:1.78E-43)
                if (r2 == r3) goto L57
                r3 = 128(0x80, float:1.8E-43)
                if (r2 < r3) goto L3f
                if (r16 == 0) goto L57
            L3f:
                char r3 = (char) r2
                boolean r3 = og.m.i0(r12, r3)
                if (r3 != 0) goto L57
                if (r2 != r4) goto L53
                if (r13 == 0) goto L57
                if (r14 == 0) goto L53
                boolean r3 = r7.isPercentEncoded(r9, r10, r11)
                if (r3 != 0) goto L53
                goto L57
            L53:
                r8.writeUtf8CodePoint(r2)
                goto L9d
            L57:
                if (r1 != 0) goto L5e
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
            L5e:
                if (r0 == 0) goto L72
                java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L69
                goto L72
            L69:
                int r3 = java.lang.Character.charCount(r2)
                int r3 = r3 + r10
                r1.writeString(r9, r10, r3, r0)
                goto L75
            L72:
                r1.writeUtf8CodePoint(r2)
            L75:
                boolean r3 = r1.exhausted()
                if (r3 != 0) goto L9d
                byte r3 = r1.readByte()
                r5 = r3 & 255(0xff, float:3.57E-43)
                r8.writeByte(r4)
                char[] r6 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r5 = r5 >> 4
                r5 = r5 & 15
                char r5 = r6[r5]
                r8.writeByte(r5)
                char[] r5 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r3 = r3 & 15
                char r3 = r5[r3]
                r8.writeByte(r3)
                goto L75
            L9d:
                int r2 = java.lang.Character.charCount(r2)
                int r10 = r10 + r2
                goto L3
            La4:
                return
        }

        private final void writePercentDecoded(okio.Buffer r6, java.lang.String r7, int r8, int r9, boolean r10) {
                r5 = this;
            L0:
                if (r8 >= r9) goto L48
                int r0 = r7.codePointAt(r8)
                r1 = 37
                if (r0 != r1) goto L31
                int r1 = r8 + 2
                if (r1 >= r9) goto L31
                int r2 = r8 + 1
                char r2 = r7.charAt(r2)
                int r2 = okhttp3.internal.Util.parseHexDigit(r2)
                char r3 = r7.charAt(r1)
                int r3 = okhttp3.internal.Util.parseHexDigit(r3)
                r4 = -1
                if (r2 == r4) goto L3f
                if (r3 == r4) goto L3f
                int r8 = r2 << 4
                int r8 = r8 + r3
                r6.writeByte(r8)
                int r8 = java.lang.Character.charCount(r0)
                int r8 = r8 + r1
                goto L0
            L31:
                r1 = 43
                if (r0 != r1) goto L3f
                if (r10 == 0) goto L3f
                r0 = 32
                r6.writeByte(r0)
                int r8 = r8 + 1
                goto L0
            L3f:
                r6.writeUtf8CodePoint(r0)
                int r0 = java.lang.Character.charCount(r0)
                int r8 = r8 + r0
                goto L0
            L48:
                return
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m87deprecated_get(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                okhttp3.HttpUrl r1 = r0.get(r1)
                return r1
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m88deprecated_get(java.net.URI r1) {
                r0 = this;
                r1.getClass()
                okhttp3.HttpUrl r1 = r0.get(r1)
                return r1
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m89deprecated_get(java.net.URL r1) {
                r0 = this;
                r1.getClass()
                okhttp3.HttpUrl r1 = r0.get(r1)
                return r1
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final okhttp3.HttpUrl m90deprecated_parse(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                okhttp3.HttpUrl r1 = r0.parse(r1)
                return r1
        }

        public final java.lang.String canonicalize$okhttp(java.lang.String r12, int r13, int r14, java.lang.String r15, boolean r16, boolean r17, boolean r18, boolean r19, java.nio.charset.Charset r20) {
                r11 = this;
                r12.getClass()
                r15.getClass()
                r3 = r13
            L7:
                if (r3 >= r14) goto L5b
                int r0 = r12.codePointAt(r3)
                r1 = 32
                if (r0 < r1) goto L3d
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == r1) goto L3d
                r1 = 128(0x80, float:1.8E-43)
                if (r0 < r1) goto L1b
                if (r19 == 0) goto L3d
            L1b:
                char r1 = (char) r0
                boolean r1 = og.m.i0(r15, r1)
                if (r1 != 0) goto L3d
                r1 = 37
                if (r0 != r1) goto L30
                if (r16 == 0) goto L3d
                if (r17 == 0) goto L30
                boolean r1 = r11.isPercentEncoded(r12, r3, r14)
                if (r1 == 0) goto L3d
            L30:
                r1 = 43
                if (r0 != r1) goto L37
                if (r18 == 0) goto L37
                goto L3d
            L37:
                int r0 = java.lang.Character.charCount(r0)
                int r3 = r3 + r0
                goto L7
            L3d:
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r1.writeUtf8(r12, r13, r3)
                r0 = r11
                r2 = r12
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r8 = r18
                r9 = r19
                r10 = r20
                r0.writeCanonicalized(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r12 = r1.readUtf8()
                return r12
            L5b:
                java.lang.String r12 = r12.substring(r13, r14)
                return r12
        }

        public final int defaultPort(java.lang.String r2) {
                r1 = this;
                r2.getClass()
                java.lang.String r0 = "http"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto Le
                r2 = 80
                return r2
            Le:
                java.lang.String r0 = "https"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L19
                r2 = 443(0x1bb, float:6.21E-43)
                return r2
            L19:
                r2 = -1
                return r2
        }

        public final okhttp3.HttpUrl get(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                okhttp3.HttpUrl$Builder r0 = new okhttp3.HttpUrl$Builder
                r0.<init>()
                r1 = 0
                okhttp3.HttpUrl$Builder r3 = r0.parse$okhttp(r1, r3)
                okhttp3.HttpUrl r3 = r3.build()
                return r3
        }

        public final okhttp3.HttpUrl get(java.net.URI r1) {
                r0 = this;
                r1.getClass()
                java.lang.String r1 = r1.toString()
                r1.getClass()
                okhttp3.HttpUrl r1 = r0.parse(r1)
                return r1
        }

        public final okhttp3.HttpUrl get(java.net.URL r1) {
                r0 = this;
                r1.getClass()
                java.lang.String r1 = r1.toString()
                r1.getClass()
                okhttp3.HttpUrl r1 = r0.parse(r1)
                return r1
        }

        public final okhttp3.HttpUrl parse(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                okhttp3.HttpUrl r1 = r0.get(r1)     // Catch: java.lang.IllegalArgumentException -> L8
                return r1
            L8:
                r1 = 0
                return r1
        }

        public final java.lang.String percentDecode$okhttp(java.lang.String r7, int r8, int r9, boolean r10) {
                r6 = this;
                r7.getClass()
                r3 = r8
            L4:
                if (r3 >= r9) goto L2c
                char r0 = r7.charAt(r3)
                r1 = 37
                if (r0 == r1) goto L18
                r1 = 43
                if (r0 != r1) goto L15
                if (r10 == 0) goto L15
                goto L18
            L15:
                int r3 = r3 + 1
                goto L4
            L18:
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r1.writeUtf8(r7, r8, r3)
                r0 = r6
                r2 = r7
                r4 = r9
                r5 = r10
                r0.writePercentDecoded(r1, r2, r3, r4, r5)
                java.lang.String r7 = r1.readUtf8()
                return r7
            L2c:
                r2 = r7
                r4 = r9
                java.lang.String r7 = r2.substring(r8, r4)
                return r7
        }

        public final void toPathString$okhttp(java.util.List<java.lang.String> r4, java.lang.StringBuilder r5) {
                r3 = this;
                r4.getClass()
                r5.getClass()
                int r0 = r4.size()
                r1 = 0
            Lb:
                if (r1 >= r0) goto L1e
                r2 = 47
                r5.append(r2)
                java.lang.Object r2 = r4.get(r1)
                java.lang.String r2 = (java.lang.String) r2
                r5.append(r2)
                int r1 = r1 + 1
                goto Lb
            L1e:
                return
        }

        public final java.util.List<java.lang.String> toQueryNamesAndValues$okhttp(java.lang.String r7) {
                r6 = this;
                r7.getClass()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
            L9:
                int r2 = r7.length()
                if (r1 > r2) goto L47
                r2 = 38
                r3 = 4
                int r2 = og.m.q0(r7, r2, r1, r3)
                r4 = -1
                if (r2 != r4) goto L1d
                int r2 = r7.length()
            L1d:
                r5 = 61
                int r3 = og.m.q0(r7, r5, r1, r3)
                if (r3 == r4) goto L39
                if (r3 <= r2) goto L28
                goto L39
            L28:
                java.lang.String r1 = r7.substring(r1, r3)
                r0.add(r1)
                int r3 = r3 + 1
                java.lang.String r1 = r7.substring(r3, r2)
                r0.add(r1)
                goto L44
            L39:
                java.lang.String r1 = r7.substring(r1, r2)
                r0.add(r1)
                r1 = 0
                r0.add(r1)
            L44:
                int r1 = r2 + 1
                goto L9
            L47:
                return r0
        }

        public final void toQueryString$okhttp(java.util.List<java.lang.String> r7, java.lang.StringBuilder r8) {
                r6 = this;
                r7.getClass()
                r8.getClass()
                r0 = 0
                int r1 = r7.size()
                lg.d r0 = r9.e0.r0(r0, r1)
                r1 = 2
                lg.b r0 = r9.e0.n0(r0, r1)
                int r1 = r0.f8042g
                int r2 = r0.f8043h
                int r0 = r0.f8044i
                if (r0 <= 0) goto L1e
                if (r1 <= r2) goto L22
            L1e:
                if (r0 >= 0) goto L48
                if (r2 > r1) goto L48
            L22:
                java.lang.Object r3 = r7.get(r1)
                java.lang.String r3 = (java.lang.String) r3
                int r4 = r1 + 1
                java.lang.Object r4 = r7.get(r4)
                java.lang.String r4 = (java.lang.String) r4
                if (r1 <= 0) goto L37
                r5 = 38
                r8.append(r5)
            L37:
                r8.append(r3)
                if (r4 == 0) goto L44
                r3 = 61
                r8.append(r3)
                r8.append(r4)
            L44:
                if (r1 == r2) goto L48
                int r1 = r1 + r0
                goto L22
            L48:
                return
        }
    }

    static {
            okhttp3.HttpUrl$Companion r0 = new okhttp3.HttpUrl$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.HttpUrl.Companion = r0
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            okhttp3.HttpUrl.HEX_DIGITS = r0
            return
    }

    public HttpUrl(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.util.List<java.lang.String> r6, java.util.List<java.lang.String> r7, java.lang.String r8, java.lang.String r9) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r6.getClass()
            r9.getClass()
            r0.<init>()
            r0.scheme = r1
            r0.username = r2
            r0.password = r3
            r0.host = r4
            r0.port = r5
            r0.pathSegments = r6
            r0.queryNamesAndValues = r7
            r0.fragment = r8
            r0.url = r9
            java.lang.String r2 = "https"
            boolean r1 = gg.l.a(r1, r2)
            r0.isHttps = r1
            return
    }

    public static final /* synthetic */ char[] access$getHEX_DIGITS$cp() {
            char[] r0 = okhttp3.HttpUrl.HEX_DIGITS
            return r0
    }

    public static final int defaultPort(java.lang.String r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            int r1 = r0.defaultPort(r1)
            return r1
    }

    public static final okhttp3.HttpUrl get(java.lang.String r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r1 = r0.get(r1)
            return r1
    }

    public static final okhttp3.HttpUrl get(java.net.URI r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r1 = r0.get(r1)
            return r1
    }

    public static final okhttp3.HttpUrl get(java.net.URL r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r1 = r0.get(r1)
            return r1
    }

    public static final okhttp3.HttpUrl parse(java.lang.String r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r1 = r0.parse(r1)
            return r1
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final java.lang.String m68deprecated_encodedFragment() {
            r1 = this;
            java.lang.String r0 = r1.encodedFragment()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final java.lang.String m69deprecated_encodedPassword() {
            r1 = this;
            java.lang.String r0 = r1.encodedPassword()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final java.lang.String m70deprecated_encodedPath() {
            r1 = this;
            java.lang.String r0 = r1.encodedPath()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final java.util.List<java.lang.String> m71deprecated_encodedPathSegments() {
            r1 = this;
            java.util.List r0 = r1.encodedPathSegments()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final java.lang.String m72deprecated_encodedQuery() {
            r1 = this;
            java.lang.String r0 = r1.encodedQuery()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final java.lang.String m73deprecated_encodedUsername() {
            r1 = this;
            java.lang.String r0 = r1.encodedUsername()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_fragment, reason: not valid java name */
    public final java.lang.String m74deprecated_fragment() {
            r1 = this;
            java.lang.String r0 = r1.fragment
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_host, reason: not valid java name */
    public final java.lang.String m75deprecated_host() {
            r1 = this;
            java.lang.String r0 = r1.host
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_password, reason: not valid java name */
    public final java.lang.String m76deprecated_password() {
            r1 = this;
            java.lang.String r0 = r1.password
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final java.util.List<java.lang.String> m77deprecated_pathSegments() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.pathSegments
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m78deprecated_pathSize() {
            r1 = this;
            int r0 = r1.pathSize()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_port, reason: not valid java name */
    public final int m79deprecated_port() {
            r1 = this;
            int r0 = r1.port
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_query, reason: not valid java name */
    public final java.lang.String m80deprecated_query() {
            r1 = this;
            java.lang.String r0 = r1.query()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final java.util.Set<java.lang.String> m81deprecated_queryParameterNames() {
            r1 = this;
            java.util.Set r0 = r1.queryParameterNames()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m82deprecated_querySize() {
            r1 = this;
            int r0 = r1.querySize()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name */
    public final java.lang.String m83deprecated_scheme() {
            r1 = this;
            java.lang.String r0 = r1.scheme
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_uri, reason: not valid java name */
    public final java.net.URI m84deprecated_uri() {
            r1 = this;
            java.net.URI r0 = r1.uri()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final java.net.URL m85deprecated_url() {
            r1 = this;
            java.net.URL r0 = r1.url()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_username, reason: not valid java name */
    public final java.lang.String m86deprecated_username() {
            r1 = this;
            java.lang.String r0 = r1.username
            return r0
    }

    public final java.lang.String encodedFragment() {
            r4 = this;
            java.lang.String r0 = r4.fragment
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r4.url
            r1 = 0
            r2 = 6
            r3 = 35
            int r0 = og.m.q0(r0, r3, r1, r2)
            int r0 = r0 + 1
            java.lang.String r1 = r4.url
            java.lang.String r0 = r1.substring(r0)
            return r0
    }

    public final java.lang.String encodedPassword() {
            r5 = this;
            java.lang.String r0 = r5.password
            int r0 = r0.length()
            if (r0 != 0) goto Lb
            java.lang.String r0 = ""
            return r0
        Lb:
            java.lang.String r0 = r5.url
            java.lang.String r1 = r5.scheme
            int r1 = r1.length()
            int r1 = r1 + 3
            r2 = 4
            r3 = 58
            int r0 = og.m.q0(r0, r3, r1, r2)
            int r0 = r0 + 1
            java.lang.String r1 = r5.url
            r2 = 0
            r3 = 6
            r4 = 64
            int r1 = og.m.q0(r1, r4, r2, r3)
            java.lang.String r2 = r5.url
            java.lang.String r0 = r2.substring(r0, r1)
            return r0
    }

    public final java.lang.String encodedPath() {
            r4 = this;
            java.lang.String r0 = r4.url
            java.lang.String r1 = r4.scheme
            int r1 = r1.length()
            int r1 = r1 + 3
            r2 = 4
            r3 = 47
            int r0 = og.m.q0(r0, r3, r1, r2)
            java.lang.String r1 = r4.url
            java.lang.String r2 = "?#"
            int r3 = r1.length()
            int r1 = okhttp3.internal.Util.delimiterOffset(r1, r2, r0, r3)
            java.lang.String r2 = r4.url
            java.lang.String r0 = r2.substring(r0, r1)
            return r0
    }

    public final java.util.List<java.lang.String> encodedPathSegments() {
            r6 = this;
            java.lang.String r0 = r6.url
            java.lang.String r1 = r6.scheme
            int r1 = r1.length()
            int r1 = r1 + 3
            r2 = 4
            r3 = 47
            int r0 = og.m.q0(r0, r3, r1, r2)
            java.lang.String r1 = r6.url
            java.lang.String r2 = "?#"
            int r4 = r1.length()
            int r1 = okhttp3.internal.Util.delimiterOffset(r1, r2, r0, r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L22:
            if (r0 >= r1) goto L37
            int r0 = r0 + 1
            java.lang.String r4 = r6.url
            int r4 = okhttp3.internal.Util.delimiterOffset(r4, r3, r0, r1)
            java.lang.String r5 = r6.url
            java.lang.String r0 = r5.substring(r0, r4)
            r2.add(r0)
            r0 = r4
            goto L22
        L37:
            return r2
    }

    public final java.lang.String encodedQuery() {
            r4 = this;
            java.util.List<java.lang.String> r0 = r4.queryNamesAndValues
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r4.url
            r1 = 0
            r2 = 6
            r3 = 63
            int r0 = og.m.q0(r0, r3, r1, r2)
            int r0 = r0 + 1
            java.lang.String r1 = r4.url
            r2 = 35
            int r3 = r1.length()
            int r1 = okhttp3.internal.Util.delimiterOffset(r1, r2, r0, r3)
            java.lang.String r2 = r4.url
            java.lang.String r0 = r2.substring(r0, r1)
            return r0
    }

    public final java.lang.String encodedUsername() {
            r4 = this;
            java.lang.String r0 = r4.username
            int r0 = r0.length()
            if (r0 != 0) goto Lb
            java.lang.String r0 = ""
            return r0
        Lb:
            java.lang.String r0 = r4.scheme
            int r0 = r0.length()
            int r0 = r0 + 3
            java.lang.String r1 = r4.url
            java.lang.String r2 = ":@"
            int r3 = r1.length()
            int r1 = okhttp3.internal.Util.delimiterOffset(r1, r2, r0, r3)
            java.lang.String r2 = r4.url
            java.lang.String r0 = r2.substring(r0, r1)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okhttp3.HttpUrl
            if (r0 == 0) goto L12
            okhttp3.HttpUrl r2 = (okhttp3.HttpUrl) r2
            java.lang.String r2 = r2.url
            java.lang.String r0 = r1.url
            boolean r2 = gg.l.a(r2, r0)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final java.lang.String fragment() {
            r1 = this;
            java.lang.String r0 = r1.fragment
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.url
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String host() {
            r1 = this;
            java.lang.String r0 = r1.host
            return r0
    }

    public final boolean isHttps() {
            r1 = this;
            boolean r0 = r1.isHttps
            return r0
    }

    public final okhttp3.HttpUrl.Builder newBuilder() {
            r4 = this;
            okhttp3.HttpUrl$Builder r0 = new okhttp3.HttpUrl$Builder
            r0.<init>()
            java.lang.String r1 = r4.scheme
            r0.setScheme$okhttp(r1)
            java.lang.String r1 = r4.encodedUsername()
            r0.setEncodedUsername$okhttp(r1)
            java.lang.String r1 = r4.encodedPassword()
            r0.setEncodedPassword$okhttp(r1)
            java.lang.String r1 = r4.host
            r0.setHost$okhttp(r1)
            int r1 = r4.port
            okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
            java.lang.String r3 = r4.scheme
            int r2 = r2.defaultPort(r3)
            if (r1 == r2) goto L2c
            int r1 = r4.port
            goto L2d
        L2c:
            r1 = -1
        L2d:
            r0.setPort$okhttp(r1)
            java.util.List r1 = r0.getEncodedPathSegments$okhttp()
            r1.clear()
            java.util.List r1 = r0.getEncodedPathSegments$okhttp()
            java.util.List r2 = r4.encodedPathSegments()
            r1.addAll(r2)
            java.lang.String r1 = r4.encodedQuery()
            r0.encodedQuery(r1)
            java.lang.String r1 = r4.encodedFragment()
            r0.setEncodedFragment$okhttp(r1)
            return r0
    }

    public final okhttp3.HttpUrl.Builder newBuilder(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            okhttp3.HttpUrl$Builder r0 = new okhttp3.HttpUrl$Builder     // Catch: java.lang.IllegalArgumentException -> Ld
            r0.<init>()     // Catch: java.lang.IllegalArgumentException -> Ld
            okhttp3.HttpUrl$Builder r2 = r0.parse$okhttp(r1, r2)     // Catch: java.lang.IllegalArgumentException -> Ld
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public final java.lang.String password() {
            r1 = this;
            java.lang.String r0 = r1.password
            return r0
    }

    public final java.util.List<java.lang.String> pathSegments() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.pathSegments
            return r0
    }

    public final int pathSize() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.pathSegments
            int r0 = r0.size()
            return r0
    }

    public final int port() {
            r1 = this;
            int r0 = r1.port
            return r0
    }

    public final java.lang.String query() {
            r3 = this;
            java.util.List<java.lang.String> r0 = r3.queryNamesAndValues
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
            java.util.List<java.lang.String> r2 = r3.queryNamesAndValues
            r1.toQueryString$okhttp(r2, r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final java.lang.String queryParameter(java.lang.String r5) {
            r4 = this;
            r5.getClass()
            java.util.List<java.lang.String> r0 = r4.queryNamesAndValues
            if (r0 != 0) goto L8
            goto L3f
        L8:
            r1 = 0
            int r0 = r0.size()
            lg.d r0 = r9.e0.r0(r1, r0)
            r1 = 2
            lg.b r0 = r9.e0.n0(r0, r1)
            int r1 = r0.f8042g
            int r2 = r0.f8043h
            int r0 = r0.f8044i
            if (r0 <= 0) goto L20
            if (r1 <= r2) goto L24
        L20:
            if (r0 >= 0) goto L3f
            if (r2 > r1) goto L3f
        L24:
            java.util.List<java.lang.String> r3 = r4.queryNamesAndValues
            java.lang.Object r3 = r3.get(r1)
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L3b
            java.util.List<java.lang.String> r5 = r4.queryNamesAndValues
            int r1 = r1 + 1
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L3b:
            if (r1 == r2) goto L3f
            int r1 = r1 + r0
            goto L24
        L3f:
            r5 = 0
            return r5
    }

    public final java.lang.String queryParameterName(int r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.queryNamesAndValues
            if (r0 == 0) goto L10
            int r2 = r2 * 2
            java.lang.Object r2 = r0.get(r2)
            r2.getClass()
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L10:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    public final java.util.Set<java.lang.String> queryParameterNames() {
            r5 = this;
            java.util.List<java.lang.String> r0 = r5.queryNamesAndValues
            if (r0 != 0) goto L7
            tf.v r0 = tf.v.f13169g
            return r0
        L7:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List<java.lang.String> r1 = r5.queryNamesAndValues
            int r1 = r1.size()
            r2 = 0
            lg.d r1 = r9.e0.r0(r2, r1)
            r2 = 2
            lg.b r1 = r9.e0.n0(r1, r2)
            int r2 = r1.f8042g
            int r3 = r1.f8043h
            int r1 = r1.f8044i
            if (r1 <= 0) goto L26
            if (r2 <= r3) goto L2a
        L26:
            if (r1 >= 0) goto L3a
            if (r3 > r2) goto L3a
        L2a:
            java.util.List<java.lang.String> r4 = r5.queryNamesAndValues
            java.lang.Object r4 = r4.get(r2)
            r4.getClass()
            r0.add(r4)
            if (r2 == r3) goto L3a
            int r2 = r2 + r1
            goto L2a
        L3a:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            r0.getClass()
            return r0
    }

    public final java.lang.String queryParameterValue(int r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.queryNamesAndValues
            if (r0 == 0) goto Lf
            int r2 = r2 * 2
            int r2 = r2 + 1
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        Lf:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    public final java.util.List<java.lang.String> queryParameterValues(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            java.util.List<java.lang.String> r0 = r6.queryNamesAndValues
            if (r0 != 0) goto La
            tf.t r7 = tf.t.f13167g
            return r7
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<java.lang.String> r1 = r6.queryNamesAndValues
            int r1 = r1.size()
            r2 = 0
            lg.d r1 = r9.e0.r0(r2, r1)
            r2 = 2
            lg.b r1 = r9.e0.n0(r1, r2)
            int r2 = r1.f8042g
            int r3 = r1.f8043h
            int r1 = r1.f8044i
            if (r1 <= 0) goto L29
            if (r2 <= r3) goto L2d
        L29:
            if (r1 >= 0) goto L48
            if (r3 > r2) goto L48
        L2d:
            java.util.List<java.lang.String> r4 = r6.queryNamesAndValues
            java.lang.Object r4 = r4.get(r2)
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L44
            java.util.List<java.lang.String> r4 = r6.queryNamesAndValues
            int r5 = r2 + 1
            java.lang.Object r4 = r4.get(r5)
            r0.add(r4)
        L44:
            if (r2 == r3) goto L48
            int r2 = r2 + r1
            goto L2d
        L48:
            java.util.List r7 = java.util.Collections.unmodifiableList(r0)
            r7.getClass()
            return r7
    }

    public final int querySize() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.queryNamesAndValues
            if (r0 == 0) goto Lb
            int r0 = r0.size()
            int r0 = r0 / 2
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final java.lang.String redact() {
            r2 = this;
            java.lang.String r0 = "/..."
            okhttp3.HttpUrl$Builder r0 = r2.newBuilder(r0)
            r0.getClass()
            java.lang.String r1 = ""
            okhttp3.HttpUrl$Builder r0 = r0.username(r1)
            okhttp3.HttpUrl$Builder r0 = r0.password(r1)
            okhttp3.HttpUrl r0 = r0.build()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final okhttp3.HttpUrl resolve(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            okhttp3.HttpUrl$Builder r1 = r0.newBuilder(r1)
            if (r1 == 0) goto Le
            okhttp3.HttpUrl r1 = r1.build()
            return r1
        Le:
            r1 = 0
            return r1
    }

    public final java.lang.String scheme() {
            r1 = this;
            java.lang.String r0 = r1.scheme
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    public final java.lang.String topPrivateDomain() {
            r2 = this;
            java.lang.String r0 = r2.host
            boolean r0 = okhttp3.internal.Util.canParseAsIpAddress(r0)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = r0.get()
            java.lang.String r1 = r2.host
            java.lang.String r0 = r0.getEffectiveTldPlusOne(r1)
            return r0
    }

    public final java.net.URI uri() {
            r4 = this;
            okhttp3.HttpUrl$Builder r0 = r4.newBuilder()
            okhttp3.HttpUrl$Builder r0 = r0.reencodeForUri$okhttp()
            java.lang.String r0 = r0.toString()
            java.net.URI r1 = new java.net.URI     // Catch: java.net.URISyntaxException -> L12
            r1.<init>(r0)     // Catch: java.net.URISyntaxException -> L12
            return r1
        L12:
            r1 = move-exception
            java.lang.String r2 = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch: java.lang.Exception -> L34
            r2.getClass()     // Catch: java.lang.Exception -> L34
            java.lang.String r3 = ""
            r0.getClass()     // Catch: java.lang.Exception -> L34
            java.util.regex.Matcher r0 = r2.matcher(r0)     // Catch: java.lang.Exception -> L34
            java.lang.String r0 = r0.replaceAll(r3)     // Catch: java.lang.Exception -> L34
            r0.getClass()     // Catch: java.lang.Exception -> L34
            java.net.URI r0 = java.net.URI.create(r0)     // Catch: java.lang.Exception -> L34
            r0.getClass()
            return r0
        L34:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
    }

    public final java.net.URL url() {
            r2 = this;
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L8
            java.lang.String r1 = r2.url     // Catch: java.net.MalformedURLException -> L8
            r0.<init>(r1)     // Catch: java.net.MalformedURLException -> L8
            return r0
        L8:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public final java.lang.String username() {
            r1 = this;
            java.lang.String r0 = r1.username
            return r0
    }
}
