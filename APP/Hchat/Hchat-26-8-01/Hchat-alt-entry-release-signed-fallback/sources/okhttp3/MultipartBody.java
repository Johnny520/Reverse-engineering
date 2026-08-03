package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class MultipartBody extends okhttp3.RequestBody {
    public static final okhttp3.MediaType ALTERNATIVE = null;
    private static final byte[] COLONSPACE = null;
    private static final byte[] CRLF = null;
    public static final okhttp3.MultipartBody.Companion Companion = null;
    private static final byte[] DASHDASH = null;
    public static final okhttp3.MediaType DIGEST = null;
    public static final okhttp3.MediaType FORM = null;
    public static final okhttp3.MediaType MIXED = null;
    public static final okhttp3.MediaType PARALLEL = null;
    private final okio.ByteString boundaryByteString;
    private long contentLength;
    private final okhttp3.MediaType contentType;
    private final java.util.List<okhttp3.MultipartBody.Part> parts;
    private final okhttp3.MediaType type;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Builder {
        private final okio.ByteString boundary;
        private final java.util.List<okhttp3.MultipartBody.Part> parts;
        private okhttp3.MediaType type;

        public Builder() {
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r0)
                return
        }

        public Builder(java.lang.String r2) {
                r1 = this;
                r2.getClass()
                r1.<init>()
                okio.ByteString$Companion r0 = okio.ByteString.Companion
                okio.ByteString r2 = r0.encodeUtf8(r2)
                r1.boundary = r2
                okhttp3.MediaType r2 = okhttp3.MultipartBody.MIXED
                r1.type = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.parts = r2
                return
        }

        public /* synthetic */ Builder(java.lang.String r1, int r2, gg.g r3) {
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto Lf
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                r1.getClass()
            Lf:
                r0.<init>(r1)
                return
        }

        public final okhttp3.MultipartBody.Builder addFormDataPart(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r2 = r0.createFormData(r2, r3)
                r1.addPart(r2)
                return r1
        }

        public final okhttp3.MultipartBody.Builder addFormDataPart(java.lang.String r2, java.lang.String r3, okhttp3.RequestBody r4) {
                r1 = this;
                r2.getClass()
                r4.getClass()
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r2 = r0.createFormData(r2, r3, r4)
                r1.addPart(r2)
                return r1
        }

        public final okhttp3.MultipartBody.Builder addPart(okhttp3.Headers r2, okhttp3.RequestBody r3) {
                r1 = this;
                r3.getClass()
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r2 = r0.create(r2, r3)
                r1.addPart(r2)
                return r1
        }

        public final okhttp3.MultipartBody.Builder addPart(okhttp3.MultipartBody.Part r2) {
                r1 = this;
                r2.getClass()
                java.util.List<okhttp3.MultipartBody$Part> r0 = r1.parts
                r0.add(r2)
                return r1
        }

        public final okhttp3.MultipartBody.Builder addPart(okhttp3.RequestBody r2) {
                r1 = this;
                r2.getClass()
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r2 = r0.create(r2)
                r1.addPart(r2)
                return r1
        }

        public final okhttp3.MultipartBody build() {
                r4 = this;
                java.util.List<okhttp3.MultipartBody$Part> r0 = r4.parts
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L18
                okhttp3.MultipartBody r0 = new okhttp3.MultipartBody
                okio.ByteString r1 = r4.boundary
                okhttp3.MediaType r2 = r4.type
                java.util.List<okhttp3.MultipartBody$Part> r3 = r4.parts
                java.util.List r3 = okhttp3.internal.Util.toImmutableList(r3)
                r0.<init>(r1, r2, r3)
                return r0
            L18:
                java.lang.String r0 = "Multipart body must have at least one part."
                j8.o.A(r0)
                r0 = 0
                return r0
        }

        public final okhttp3.MultipartBody.Builder setType(okhttp3.MediaType r3) {
                r2 = this;
                r3.getClass()
                java.lang.String r0 = r3.type()
                java.lang.String r1 = "multipart"
                boolean r0 = gg.l.a(r0, r1)
                if (r0 == 0) goto L12
                r2.type = r3
                return r2
            L12:
                java.lang.String r0 = "multipart != "
                j8.o.z(r3, r0)
                r3 = 0
                return r3
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

        public final void appendQuotedString$okhttp(java.lang.StringBuilder r6, java.lang.String r7) {
                r5 = this;
                r6.getClass()
                r7.getClass()
                r0 = 34
                r6.append(r0)
                int r1 = r7.length()
                r2 = 0
            L10:
                if (r2 >= r1) goto L38
                char r3 = r7.charAt(r2)
                r4 = 10
                if (r3 != r4) goto L20
                java.lang.String r3 = "%0A"
                r6.append(r3)
                goto L35
            L20:
                r4 = 13
                if (r3 != r4) goto L2a
                java.lang.String r3 = "%0D"
                r6.append(r3)
                goto L35
            L2a:
                if (r3 != r0) goto L32
                java.lang.String r3 = "%22"
                r6.append(r3)
                goto L35
            L32:
                r6.append(r3)
            L35:
                int r2 = r2 + 1
                goto L10
            L38:
                r6.append(r0)
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Part {
        public static final okhttp3.MultipartBody.Part.Companion Companion = null;
        private final okhttp3.RequestBody body;
        private final okhttp3.Headers headers;

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

            public final okhttp3.MultipartBody.Part create(okhttp3.Headers r3, okhttp3.RequestBody r4) {
                    r2 = this;
                    r4.getClass()
                    r0 = 0
                    if (r3 == 0) goto Ld
                    java.lang.String r1 = "Content-Type"
                    java.lang.String r1 = r3.get(r1)
                    goto Le
                Ld:
                    r1 = r0
                Le:
                    if (r1 != 0) goto L29
                    if (r3 == 0) goto L19
                    java.lang.String r1 = "Content-Length"
                    java.lang.String r1 = r3.get(r1)
                    goto L1a
                L19:
                    r1 = r0
                L1a:
                    if (r1 != 0) goto L22
                    okhttp3.MultipartBody$Part r1 = new okhttp3.MultipartBody$Part
                    r1.<init>(r3, r4, r0)
                    return r1
                L22:
                    java.lang.String r3 = "Unexpected header: Content-Length"
                    j8.o.t(r3)
                L27:
                    r3 = 0
                    return r3
                L29:
                    java.lang.String r3 = "Unexpected header: Content-Type"
                    j8.o.t(r3)
                    goto L27
            }

            public final okhttp3.MultipartBody.Part create(okhttp3.RequestBody r2) {
                    r1 = this;
                    r2.getClass()
                    r0 = 0
                    okhttp3.MultipartBody$Part r2 = r1.create(r0, r2)
                    return r2
            }

            public final okhttp3.MultipartBody.Part createFormData(java.lang.String r4, java.lang.String r5) {
                    r3 = this;
                    r4.getClass()
                    r5.getClass()
                    okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
                    r1 = 1
                    r2 = 0
                    okhttp3.RequestBody r5 = okhttp3.RequestBody.Companion.create$default(r0, r5, r2, r1, r2)
                    okhttp3.MultipartBody$Part r4 = r3.createFormData(r4, r2, r5)
                    return r4
            }

            public final okhttp3.MultipartBody.Part createFormData(java.lang.String r3, java.lang.String r4, okhttp3.RequestBody r5) {
                    r2 = this;
                    r3.getClass()
                    r5.getClass()
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "form-data; name="
                    r0.append(r1)
                    okhttp3.MultipartBody$Companion r1 = okhttp3.MultipartBody.Companion
                    r1.appendQuotedString$okhttp(r0, r3)
                    if (r4 == 0) goto L1f
                    java.lang.String r3 = "; filename="
                    r0.append(r3)
                    r1.appendQuotedString$okhttp(r0, r4)
                L1f:
                    java.lang.String r3 = r0.toString()
                    okhttp3.Headers$Builder r4 = new okhttp3.Headers$Builder
                    r4.<init>()
                    java.lang.String r0 = "Content-Disposition"
                    okhttp3.Headers$Builder r3 = r4.addUnsafeNonAscii(r0, r3)
                    okhttp3.Headers r3 = r3.build()
                    okhttp3.MultipartBody$Part r3 = r2.create(r3, r5)
                    return r3
            }
        }

        static {
                okhttp3.MultipartBody$Part$Companion r0 = new okhttp3.MultipartBody$Part$Companion
                r1 = 0
                r0.<init>(r1)
                okhttp3.MultipartBody.Part.Companion = r0
                return
        }

        private Part(okhttp3.Headers r1, okhttp3.RequestBody r2) {
                r0 = this;
                r0.<init>()
                r0.headers = r1
                r0.body = r2
                return
        }

        public /* synthetic */ Part(okhttp3.Headers r1, okhttp3.RequestBody r2, gg.g r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static final okhttp3.MultipartBody.Part create(okhttp3.Headers r1, okhttp3.RequestBody r2) {
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r1 = r0.create(r1, r2)
                return r1
        }

        public static final okhttp3.MultipartBody.Part create(okhttp3.RequestBody r1) {
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r1 = r0.create(r1)
                return r1
        }

        public static final okhttp3.MultipartBody.Part createFormData(java.lang.String r1, java.lang.String r2) {
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r1 = r0.createFormData(r1, r2)
                return r1
        }

        public static final okhttp3.MultipartBody.Part createFormData(java.lang.String r1, java.lang.String r2, okhttp3.RequestBody r3) {
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r1 = r0.createFormData(r1, r2, r3)
                return r1
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
        public final okhttp3.RequestBody m99deprecated_body() {
                r1 = this;
                okhttp3.RequestBody r0 = r1.body
                return r0
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
        public final okhttp3.Headers m100deprecated_headers() {
                r1 = this;
                okhttp3.Headers r0 = r1.headers
                return r0
        }

        public final okhttp3.RequestBody body() {
                r1 = this;
                okhttp3.RequestBody r0 = r1.body
                return r0
        }

        public final okhttp3.Headers headers() {
                r1 = this;
                okhttp3.Headers r0 = r1.headers
                return r0
        }
    }

    static {
            okhttp3.MultipartBody$Companion r0 = new okhttp3.MultipartBody$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.MultipartBody.Companion = r0
            okhttp3.MediaType$Companion r0 = okhttp3.MediaType.Companion
            java.lang.String r1 = "multipart/mixed"
            okhttp3.MediaType r1 = r0.get(r1)
            okhttp3.MultipartBody.MIXED = r1
            java.lang.String r1 = "multipart/alternative"
            okhttp3.MediaType r1 = r0.get(r1)
            okhttp3.MultipartBody.ALTERNATIVE = r1
            java.lang.String r1 = "multipart/digest"
            okhttp3.MediaType r1 = r0.get(r1)
            okhttp3.MultipartBody.DIGEST = r1
            java.lang.String r1 = "multipart/parallel"
            okhttp3.MediaType r1 = r0.get(r1)
            okhttp3.MultipartBody.PARALLEL = r1
            java.lang.String r1 = "multipart/form-data"
            okhttp3.MediaType r0 = r0.get(r1)
            okhttp3.MultipartBody.FORM = r0
            r0 = 2
            byte[] r1 = new byte[r0]
            r1 = {x004a: FILL_ARRAY_DATA , data: [58, 32} // fill-array
            okhttp3.MultipartBody.COLONSPACE = r1
            byte[] r1 = new byte[r0]
            r1 = {x0050: FILL_ARRAY_DATA , data: [13, 10} // fill-array
            okhttp3.MultipartBody.CRLF = r1
            byte[] r0 = new byte[r0]
            r0 = {x0056: FILL_ARRAY_DATA , data: [45, 45} // fill-array
            okhttp3.MultipartBody.DASHDASH = r0
            return
    }

    public MultipartBody(okio.ByteString r1, okhttp3.MediaType r2, java.util.List<okhttp3.MultipartBody.Part> r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.boundaryByteString = r1
            r0.type = r2
            r0.parts = r3
            okhttp3.MediaType$Companion r1 = okhttp3.MediaType.Companion
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "; boundary="
            r3.append(r2)
            java.lang.String r2 = r0.boundary()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            okhttp3.MediaType r1 = r1.get(r2)
            r0.contentType = r1
            r1 = -1
            r0.contentLength = r1
            return
    }

    private final long writeOrCountBytes(okio.BufferedSink r13, boolean r14) {
            r12 = this;
            if (r14 == 0) goto L9
            okio.Buffer r13 = new okio.Buffer
            r13.<init>()
            r0 = r13
            goto La
        L9:
            r0 = 0
        La:
            java.util.List<okhttp3.MultipartBody$Part> r1 = r12.parts
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L14:
            if (r5 >= r1) goto Lae
            java.util.List<okhttp3.MultipartBody$Part> r6 = r12.parts
            java.lang.Object r6 = r6.get(r5)
            okhttp3.MultipartBody$Part r6 = (okhttp3.MultipartBody.Part) r6
            okhttp3.Headers r7 = r6.headers()
            okhttp3.RequestBody r6 = r6.body()
            r13.getClass()
            byte[] r8 = okhttp3.MultipartBody.DASHDASH
            r13.write(r8)
            okio.ByteString r8 = r12.boundaryByteString
            r13.write(r8)
            byte[] r8 = okhttp3.MultipartBody.CRLF
            r13.write(r8)
            if (r7 == 0) goto L5f
            int r8 = r7.size()
            r9 = r2
        L3f:
            if (r9 >= r8) goto L5f
            java.lang.String r10 = r7.name(r9)
            okio.BufferedSink r10 = r13.writeUtf8(r10)
            byte[] r11 = okhttp3.MultipartBody.COLONSPACE
            okio.BufferedSink r10 = r10.write(r11)
            java.lang.String r11 = r7.value(r9)
            okio.BufferedSink r10 = r10.writeUtf8(r11)
            byte[] r11 = okhttp3.MultipartBody.CRLF
            r10.write(r11)
            int r9 = r9 + 1
            goto L3f
        L5f:
            okhttp3.MediaType r7 = r6.contentType()
            if (r7 == 0) goto L78
            java.lang.String r8 = "Content-Type: "
            okio.BufferedSink r8 = r13.writeUtf8(r8)
            java.lang.String r7 = r7.toString()
            okio.BufferedSink r7 = r8.writeUtf8(r7)
            byte[] r8 = okhttp3.MultipartBody.CRLF
            r7.write(r8)
        L78:
            long r7 = r6.contentLength()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L92
            java.lang.String r9 = "Content-Length: "
            okio.BufferedSink r9 = r13.writeUtf8(r9)
            okio.BufferedSink r9 = r9.writeDecimalLong(r7)
            byte[] r10 = okhttp3.MultipartBody.CRLF
            r9.write(r10)
            goto L9b
        L92:
            if (r14 == 0) goto L9b
            r0.getClass()
            r0.clear()
            return r9
        L9b:
            byte[] r9 = okhttp3.MultipartBody.CRLF
            r13.write(r9)
            if (r14 == 0) goto La4
            long r3 = r3 + r7
            goto La7
        La4:
            r6.writeTo(r13)
        La7:
            r13.write(r9)
            int r5 = r5 + 1
            goto L14
        Lae:
            r13.getClass()
            byte[] r1 = okhttp3.MultipartBody.DASHDASH
            r13.write(r1)
            okio.ByteString r2 = r12.boundaryByteString
            r13.write(r2)
            r13.write(r1)
            byte[] r1 = okhttp3.MultipartBody.CRLF
            r13.write(r1)
            if (r14 == 0) goto Ld1
            r0.getClass()
            long r13 = r0.size()
            long r13 = r13 + r3
            r0.clear()
            return r13
        Ld1:
            return r3
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_boundary, reason: not valid java name */
    public final java.lang.String m95deprecated_boundary() {
            r1 = this;
            java.lang.String r0 = r1.boundary()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_parts, reason: not valid java name */
    public final java.util.List<okhttp3.MultipartBody.Part> m96deprecated_parts() {
            r1 = this;
            java.util.List<okhttp3.MultipartBody$Part> r0 = r1.parts
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m97deprecated_size() {
            r1 = this;
            int r0 = r1.size()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name */
    public final okhttp3.MediaType m98deprecated_type() {
            r1 = this;
            okhttp3.MediaType r0 = r1.type
            return r0
    }

    public final java.lang.String boundary() {
            r1 = this;
            okio.ByteString r0 = r1.boundaryByteString
            java.lang.String r0 = r0.utf8()
            return r0
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
            r4 = this;
            long r0 = r4.contentLength
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L10
            r0 = 0
            r1 = 1
            long r0 = r4.writeOrCountBytes(r0, r1)
            r4.contentLength = r0
        L10:
            return r0
    }

    @Override // okhttp3.RequestBody
    public okhttp3.MediaType contentType() {
            r1 = this;
            okhttp3.MediaType r0 = r1.contentType
            return r0
    }

    public final okhttp3.MultipartBody.Part part(int r2) {
            r1 = this;
            java.util.List<okhttp3.MultipartBody$Part> r0 = r1.parts
            java.lang.Object r2 = r0.get(r2)
            okhttp3.MultipartBody$Part r2 = (okhttp3.MultipartBody.Part) r2
            return r2
    }

    public final java.util.List<okhttp3.MultipartBody.Part> parts() {
            r1 = this;
            java.util.List<okhttp3.MultipartBody$Part> r0 = r1.parts
            return r0
    }

    public final int size() {
            r1 = this;
            java.util.List<okhttp3.MultipartBody$Part> r0 = r1.parts
            int r0 = r0.size()
            return r0
    }

    public final okhttp3.MediaType type() {
            r1 = this;
            okhttp3.MediaType r0 = r1.type
            return r0
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
