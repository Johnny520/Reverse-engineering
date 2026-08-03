package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class FormBody extends okhttp3.RequestBody {
    private static final okhttp3.MediaType CONTENT_TYPE = null;
    public static final okhttp3.FormBody.Companion Companion = null;
    private final java.util.List<java.lang.String> encodedNames;
    private final java.util.List<java.lang.String> encodedValues;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Builder {
        private final java.nio.charset.Charset charset;
        private final java.util.List<java.lang.String> names;
        private final java.util.List<java.lang.String> values;

        public Builder() {
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r0)
                return
        }

        public Builder(java.nio.charset.Charset r1) {
                r0 = this;
                r0.<init>()
                r0.charset = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.names = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.values = r1
                return
        }

        public /* synthetic */ Builder(java.nio.charset.Charset r1, int r2, gg.g r3) {
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L5
                r1 = 0
            L5:
                r0.<init>(r1)
                return
        }

        public final okhttp3.FormBody.Builder add(java.lang.String r14, java.lang.String r15) {
                r13 = this;
                r14.getClass()
                r15.getClass()
                java.util.List<java.lang.String> r0 = r13.names
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.nio.charset.Charset r10 = r13.charset
                r11 = 91
                r12 = 0
                r3 = 0
                r4 = 0
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#&!$(),~"
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r2 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r0.add(r14)
                java.util.List<java.lang.String> r14 = r13.values
                java.nio.charset.Charset r10 = r13.charset
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#&!$(),~"
                r2 = r15
                java.lang.String r15 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r14.add(r15)
                return r13
        }

        public final okhttp3.FormBody.Builder addEncoded(java.lang.String r14, java.lang.String r15) {
                r13 = this;
                r14.getClass()
                r15.getClass()
                java.util.List<java.lang.String> r0 = r13.names
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.nio.charset.Charset r10 = r13.charset
                r11 = 83
                r12 = 0
                r3 = 0
                r4 = 0
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#&!$(),~"
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r2 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r0.add(r14)
                java.util.List<java.lang.String> r14 = r13.values
                java.nio.charset.Charset r10 = r13.charset
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#&!$(),~"
                r2 = r15
                java.lang.String r15 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r14.add(r15)
                return r13
        }

        public final okhttp3.FormBody build() {
                r3 = this;
                okhttp3.FormBody r0 = new okhttp3.FormBody
                java.util.List<java.lang.String> r1 = r3.names
                java.util.List<java.lang.String> r2 = r3.values
                r0.<init>(r1, r2)
                return r0
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
    }

    static {
            okhttp3.FormBody$Companion r0 = new okhttp3.FormBody$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.FormBody.Companion = r0
            okhttp3.MediaType$Companion r0 = okhttp3.MediaType.Companion
            java.lang.String r1 = "application/x-www-form-urlencoded"
            okhttp3.MediaType r0 = r0.get(r1)
            okhttp3.FormBody.CONTENT_TYPE = r0
            return
    }

    public FormBody(java.util.List<java.lang.String> r1, java.util.List<java.lang.String> r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            java.util.List r1 = okhttp3.internal.Util.toImmutableList(r1)
            r0.encodedNames = r1
            java.util.List r1 = okhttp3.internal.Util.toImmutableList(r2)
            r0.encodedValues = r1
            return
    }

    private final long writeOrCountBytes(okio.BufferedSink r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L8
            okio.Buffer r4 = new okio.Buffer
            r4.<init>()
            goto Lf
        L8:
            r4.getClass()
            okio.Buffer r4 = r4.getBuffer()
        Lf:
            java.util.List<java.lang.String> r0 = r3.encodedNames
            int r0 = r0.size()
            r1 = 0
        L16:
            if (r1 >= r0) goto L3d
            if (r1 <= 0) goto L1f
            r2 = 38
            r4.writeByte(r2)
        L1f:
            java.util.List<java.lang.String> r2 = r3.encodedNames
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r4.writeUtf8(r2)
            r2 = 61
            r4.writeByte(r2)
            java.util.List<java.lang.String> r2 = r3.encodedValues
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r4.writeUtf8(r2)
            int r1 = r1 + 1
            goto L16
        L3d:
            if (r5 == 0) goto L47
            long r0 = r4.size()
            r4.clear()
            return r0
        L47:
            r4 = 0
            return r4
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m57deprecated_size() {
            r1 = this;
            int r0 = r1.size()
            return r0
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
            r2 = this;
            r0 = 0
            r1 = 1
            long r0 = r2.writeOrCountBytes(r0, r1)
            return r0
    }

    @Override // okhttp3.RequestBody
    public okhttp3.MediaType contentType() {
            r1 = this;
            okhttp3.MediaType r0 = okhttp3.FormBody.CONTENT_TYPE
            return r0
    }

    public final java.lang.String encodedName(int r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.encodedNames
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public final java.lang.String encodedValue(int r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.encodedValues
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public final java.lang.String name(int r8) {
            r7 = this;
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            java.lang.String r1 = r7.encodedName(r8)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 1
            java.lang.String r8 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    public final int size() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.encodedNames
            int r0 = r0.size()
            return r0
    }

    public final java.lang.String value(int r8) {
            r7 = this;
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            java.lang.String r1 = r7.encodedValue(r8)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 1
            java.lang.String r8 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // okhttp3.RequestBody
    public void writeTo(okio.BufferedSink r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            r1.writeOrCountBytes(r2, r0)
            return
    }
}
