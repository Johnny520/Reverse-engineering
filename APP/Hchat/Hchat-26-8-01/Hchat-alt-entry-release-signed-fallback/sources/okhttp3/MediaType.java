package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaType {
    public static final okhttp3.MediaType.Companion Companion = null;
    private static final java.util.regex.Pattern PARAMETER = null;
    private static final java.lang.String QUOTED = "\"([^\"]*)\"";
    private static final java.lang.String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private static final java.util.regex.Pattern TYPE_SUBTYPE = null;
    private final java.lang.String mediaType;
    private final java.lang.String[] parameterNamesAndValues;
    private final java.lang.String subtype;
    private final java.lang.String type;

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

        @sf.a
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.MediaType m93deprecated_get(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                okhttp3.MediaType r1 = r0.get(r1)
                return r1
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final okhttp3.MediaType m94deprecated_parse(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                okhttp3.MediaType r1 = r0.parse(r1)
                return r1
        }

        public final okhttp3.MediaType get(java.lang.String r12) {
                r11 = this;
                r12.getClass()
                java.util.regex.Pattern r0 = okhttp3.MediaType.access$getTYPE_SUBTYPE$cp()
                java.util.regex.Matcher r0 = r0.matcher(r12)
                boolean r1 = r0.lookingAt()
                if (r1 == 0) goto Lc7
                r1 = 1
                java.lang.String r2 = r0.group(r1)
                r2.getClass()
                java.util.Locale r3 = java.util.Locale.US
                java.lang.String r6 = j8.b.l(r3, r2, r3)
                r2 = 2
                java.lang.String r4 = r0.group(r2)
                r4.getClass()
                java.lang.String r7 = r4.toLowerCase(r3)
                r7.getClass()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.regex.Pattern r4 = okhttp3.MediaType.access$getPARAMETER$cp()
                java.util.regex.Matcher r4 = r4.matcher(r12)
                int r0 = r0.end()
            L3f:
                int r5 = r12.length()
                r8 = 0
                if (r0 >= r5) goto Lb6
                int r5 = r12.length()
                r4.region(r0, r5)
                boolean r5 = r4.lookingAt()
                if (r5 == 0) goto L8d
                java.lang.String r0 = r4.group(r1)
                if (r0 != 0) goto L5e
                int r0 = r4.end()
                goto L3f
            L5e:
                java.lang.String r5 = r4.group(r2)
                if (r5 != 0) goto L6a
                r5 = 3
                java.lang.String r5 = r4.group(r5)
                goto L82
            L6a:
                java.lang.String r9 = "'"
                boolean r10 = og.t.d0(r5, r9, r8)
                if (r10 == 0) goto L82
                boolean r8 = og.t.W(r5, r9, r8)
                if (r8 == 0) goto L82
                int r8 = r5.length()
                if (r8 <= r2) goto L82
                java.lang.String r5 = wb.en.f(r1, r1, r5)
            L82:
                r3.add(r0)
                r3.add(r5)
                int r0 = r4.end()
                goto L3f
            L8d:
                java.lang.String r0 = r12.substring(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Parameter is not formatted correctly: \""
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = "\" for: \""
                r1.append(r0)
                r1.append(r12)
                r12 = 34
                r1.append(r12)
                java.lang.String r12 = r1.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r12.toString()
                r0.<init>(r12)
                throw r0
            Lb6:
                okhttp3.MediaType r4 = new okhttp3.MediaType
                java.lang.String[] r0 = new java.lang.String[r8]
                java.lang.Object[] r0 = r3.toArray(r0)
                r8 = r0
                java.lang.String[] r8 = (java.lang.String[]) r8
                r9 = 0
                r5 = r12
                r4.<init>(r5, r6, r7, r8, r9)
                return r4
            Lc7:
                r5 = r12
                java.lang.String r12 = "No subtype found for: \""
                j8.o.r(r5, r12)
                r12 = 0
                return r12
        }

        public final okhttp3.MediaType parse(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                okhttp3.MediaType r1 = r0.get(r1)     // Catch: java.lang.IllegalArgumentException -> L8
                return r1
            L8:
                r1 = 0
                return r1
        }
    }

    static {
            okhttp3.MediaType$Companion r0 = new okhttp3.MediaType$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.MediaType.Companion = r0
            java.lang.String r0 = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.MediaType.TYPE_SUBTYPE = r0
            java.lang.String r0 = ";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.MediaType.PARAMETER = r0
            return
    }

    private MediaType(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r0.<init>()
            r0.mediaType = r1
            r0.type = r2
            r0.subtype = r3
            r0.parameterNamesAndValues = r4
            return
    }

    public /* synthetic */ MediaType(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String[] r4, gg.g r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getPARAMETER$cp() {
            java.util.regex.Pattern r0 = okhttp3.MediaType.PARAMETER
            return r0
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getTYPE_SUBTYPE$cp() {
            java.util.regex.Pattern r0 = okhttp3.MediaType.TYPE_SUBTYPE
            return r0
    }

    public static /* synthetic */ java.nio.charset.Charset charset$default(okhttp3.MediaType r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.nio.charset.Charset r0 = r0.charset(r1)
            return r0
    }

    public static final okhttp3.MediaType get(java.lang.String r1) {
            okhttp3.MediaType$Companion r0 = okhttp3.MediaType.Companion
            okhttp3.MediaType r1 = r0.get(r1)
            return r1
    }

    public static final okhttp3.MediaType parse(java.lang.String r1) {
            okhttp3.MediaType$Companion r0 = okhttp3.MediaType.Companion
            okhttp3.MediaType r1 = r0.parse(r1)
            return r1
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_subtype, reason: not valid java name */
    public final java.lang.String m91deprecated_subtype() {
            r1 = this;
            java.lang.String r0 = r1.subtype
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name */
    public final java.lang.String m92deprecated_type() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public final java.nio.charset.Charset charset() {
            r2 = this;
            r0 = 0
            r1 = 1
            java.nio.charset.Charset r0 = charset$default(r2, r0, r1, r0)
            return r0
    }

    public final java.nio.charset.Charset charset(java.nio.charset.Charset r2) {
            r1 = this;
            java.lang.String r0 = "charset"
            java.lang.String r0 = r1.parameter(r0)
            if (r0 != 0) goto L9
            return r2
        L9:
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> Ld
        Ld:
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okhttp3.MediaType
            if (r0 == 0) goto L12
            okhttp3.MediaType r2 = (okhttp3.MediaType) r2
            java.lang.String r2 = r2.mediaType
            java.lang.String r0 = r1.mediaType
            boolean r2 = gg.l.a(r2, r0)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.mediaType
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String parameter(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            java.lang.String[] r0 = r3.parameterNamesAndValues
            int r0 = r0.length
            int r0 = r0 + (-1)
            r1 = 2
            r2 = 0
            int r0 = oh.h.A(r2, r0, r1)
            if (r0 < 0) goto L26
        L10:
            java.lang.String[] r1 = r3.parameterNamesAndValues
            r1 = r1[r2]
            boolean r1 = og.t.X(r1, r4)
            if (r1 == 0) goto L21
            java.lang.String[] r4 = r3.parameterNamesAndValues
            int r2 = r2 + 1
            r4 = r4[r2]
            return r4
        L21:
            if (r2 == r0) goto L26
            int r2 = r2 + 2
            goto L10
        L26:
            r4 = 0
            return r4
    }

    public final java.lang.String subtype() {
            r1 = this;
            java.lang.String r0 = r1.subtype
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.mediaType
            return r0
    }

    public final java.lang.String type() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }
}
