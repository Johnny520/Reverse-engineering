package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Cache implements java.io.Closeable, java.io.Flushable {
    public static final okhttp3.Cache.Companion Companion = null;
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final okhttp3.internal.cache.DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class CacheResponseBody extends okhttp3.ResponseBody {
        private final okio.BufferedSource bodySource;
        private final java.lang.String contentLength;
        private final java.lang.String contentType;
        private final okhttp3.internal.cache.DiskLruCache.Snapshot snapshot;


        public CacheResponseBody(okhttp3.internal.cache.DiskLruCache.Snapshot r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r1.getClass()
                r0.<init>()
                r0.snapshot = r1
                r0.contentType = r2
                r0.contentLength = r3
                r2 = 1
                okio.Source r1 = r1.getSource(r2)
                okhttp3.Cache$CacheResponseBody$1 r2 = new okhttp3.Cache$CacheResponseBody$1
                r2.<init>(r1, r0)
                okio.BufferedSource r1 = okio.Okio.buffer(r2)
                r0.bodySource = r1
                return
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
                r3 = this;
                java.lang.String r0 = r3.contentLength
                r1 = -1
                if (r0 == 0) goto Lb
                long r0 = okhttp3.internal.Util.toLongOrDefault(r0, r1)
                return r0
            Lb:
                return r1
        }

        @Override // okhttp3.ResponseBody
        public okhttp3.MediaType contentType() {
                r2 = this;
                java.lang.String r0 = r2.contentType
                if (r0 == 0) goto Lb
                okhttp3.MediaType$Companion r1 = okhttp3.MediaType.Companion
                okhttp3.MediaType r0 = r1.parse(r0)
                return r0
            Lb:
                r0 = 0
                return r0
        }

        public final okhttp3.internal.cache.DiskLruCache.Snapshot getSnapshot() {
                r1 = this;
                okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r1.snapshot
                return r0
        }

        @Override // okhttp3.ResponseBody
        public okio.BufferedSource source() {
                r1 = this;
                okio.BufferedSource r0 = r1.bodySource
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

        private final java.util.Set<java.lang.String> varyFields(okhttp3.Headers r8) {
                r7 = this;
                int r0 = r8.size()
                r1 = 0
                r2 = 0
                r3 = r2
            L7:
                if (r3 >= r0) goto L51
                java.lang.String r4 = "Vary"
                java.lang.String r5 = r8.name(r3)
                boolean r4 = r4.equalsIgnoreCase(r5)
                if (r4 != 0) goto L16
                goto L4e
            L16:
                java.lang.String r4 = r8.value(r3)
                if (r1 != 0) goto L26
                java.util.TreeSet r1 = new java.util.TreeSet
                java.util.Comparator r5 = java.lang.String.CASE_INSENSITIVE_ORDER
                r5.getClass()
                r1.<init>(r5)
            L26:
                r5 = 1
                char[] r5 = new char[r5]
                r6 = 44
                r5[r2] = r6
                r6 = 6
                java.util.List r4 = og.m.F0(r4, r5, r6)
                java.util.Iterator r4 = r4.iterator()
            L36:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L4e
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                java.lang.CharSequence r5 = og.m.R0(r5)
                java.lang.String r5 = r5.toString()
                r1.add(r5)
                goto L36
            L4e:
                int r3 = r3 + 1
                goto L7
            L51:
                if (r1 != 0) goto L56
                tf.v r8 = tf.v.f13169g
                return r8
            L56:
                return r1
        }

        private final okhttp3.Headers varyHeaders(okhttp3.Headers r6, okhttp3.Headers r7) {
                r5 = this;
                java.util.Set r7 = r5.varyFields(r7)
                boolean r0 = r7.isEmpty()
                if (r0 == 0) goto Ld
                okhttp3.Headers r6 = okhttp3.internal.Util.EMPTY_HEADERS
                return r6
            Ld:
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                int r1 = r6.size()
                r2 = 0
            L17:
                if (r2 >= r1) goto L2d
                java.lang.String r3 = r6.name(r2)
                boolean r4 = r7.contains(r3)
                if (r4 == 0) goto L2a
                java.lang.String r4 = r6.value(r2)
                r0.add(r3, r4)
            L2a:
                int r2 = r2 + 1
                goto L17
            L2d:
                okhttp3.Headers r6 = r0.build()
                return r6
        }

        public final boolean hasVaryAll(okhttp3.Response r2) {
                r1 = this;
                r2.getClass()
                okhttp3.Headers r2 = r2.headers()
                java.util.Set r2 = r1.varyFields(r2)
                java.lang.String r0 = "*"
                boolean r2 = r2.contains(r0)
                return r2
        }

        public final java.lang.String key(okhttp3.HttpUrl r2) {
                r1 = this;
                r2.getClass()
                okio.ByteString$Companion r0 = okio.ByteString.Companion
                java.lang.String r2 = r2.toString()
                okio.ByteString r2 = r0.encodeUtf8(r2)
                okio.ByteString r2 = r2.md5()
                java.lang.String r2 = r2.hex()
                return r2
        }

        public final int readInt$okhttp(okio.BufferedSource r6) {
                r5 = this;
                java.lang.String r0 = "expected an int but was \""
                r6.getClass()
                long r1 = r6.readDecimalLong()     // Catch: java.lang.NumberFormatException -> L22
                java.lang.String r6 = r6.readUtf8LineStrict()     // Catch: java.lang.NumberFormatException -> L22
                r3 = 0
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 < 0) goto L24
                r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 > 0) goto L24
                int r3 = r6.length()     // Catch: java.lang.NumberFormatException -> L22
                if (r3 > 0) goto L24
                int r6 = (int) r1     // Catch: java.lang.NumberFormatException -> L22
                return r6
            L22:
                r6 = move-exception
                goto L3e
            L24:
                java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.NumberFormatException -> L22
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L22
                r4.<init>(r0)     // Catch: java.lang.NumberFormatException -> L22
                r4.append(r1)     // Catch: java.lang.NumberFormatException -> L22
                r4.append(r6)     // Catch: java.lang.NumberFormatException -> L22
                r6 = 34
                r4.append(r6)     // Catch: java.lang.NumberFormatException -> L22
                java.lang.String r6 = r4.toString()     // Catch: java.lang.NumberFormatException -> L22
                r3.<init>(r6)     // Catch: java.lang.NumberFormatException -> L22
                throw r3     // Catch: java.lang.NumberFormatException -> L22
            L3e:
                java.lang.String r6 = r6.getMessage()
                j8.o.y(r6)
                r6 = 0
                return r6
        }

        public final okhttp3.Headers varyHeaders(okhttp3.Response r2) {
                r1 = this;
                r2.getClass()
                okhttp3.Response r0 = r2.networkResponse()
                r0.getClass()
                okhttp3.Request r0 = r0.request()
                okhttp3.Headers r0 = r0.headers()
                okhttp3.Headers r2 = r2.headers()
                okhttp3.Headers r2 = r1.varyHeaders(r0, r2)
                return r2
        }

        public final boolean varyMatches(okhttp3.Response r4, okhttp3.Headers r5, okhttp3.Request r6) {
                r3 = this;
                r4.getClass()
                r5.getClass()
                r6.getClass()
                okhttp3.Headers r4 = r4.headers()
                java.util.Set r4 = r3.varyFields(r4)
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                boolean r0 = r4 instanceof java.util.Collection
                r1 = 1
                if (r0 == 0) goto L22
                r0 = r4
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L22
                return r1
            L22:
                java.util.Iterator r4 = r4.iterator()
            L26:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L42
                java.lang.Object r0 = r4.next()
                java.lang.String r0 = (java.lang.String) r0
                java.util.List r2 = r5.values(r0)
                java.util.List r0 = r6.headers(r0)
                boolean r0 = gg.l.a(r2, r0)
                if (r0 != 0) goto L26
                r4 = 0
                return r4
            L42:
                return r1
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Entry {
        public static final okhttp3.Cache.Entry.Companion Companion = null;
        private static final java.lang.String RECEIVED_MILLIS = null;
        private static final java.lang.String SENT_MILLIS = null;
        private final int code;
        private final okhttp3.Handshake handshake;
        private final java.lang.String message;
        private final okhttp3.Protocol protocol;
        private final long receivedResponseMillis;
        private final java.lang.String requestMethod;
        private final okhttp3.Headers responseHeaders;
        private final long sentRequestMillis;
        private final okhttp3.HttpUrl url;
        private final okhttp3.Headers varyHeaders;

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
                okhttp3.Cache$Entry$Companion r0 = new okhttp3.Cache$Entry$Companion
                r1 = 0
                r0.<init>(r1)
                okhttp3.Cache.Entry.Companion = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
                okhttp3.internal.platform.Platform r2 = r1.get()
                java.lang.String r2 = r2.getPrefix()
                r0.append(r2)
                java.lang.String r2 = "-Sent-Millis"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                okhttp3.Cache.Entry.SENT_MILLIS = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                okhttp3.internal.platform.Platform r1 = r1.get()
                java.lang.String r1 = r1.getPrefix()
                r0.append(r1)
                java.lang.String r1 = "-Received-Millis"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                okhttp3.Cache.Entry.RECEIVED_MILLIS = r0
                return
        }

        public Entry(okhttp3.Response r3) {
                r2 = this;
                r3.getClass()
                r2.<init>()
                okhttp3.Request r0 = r3.request()
                okhttp3.HttpUrl r0 = r0.url()
                r2.url = r0
                okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
                okhttp3.Headers r0 = r0.varyHeaders(r3)
                r2.varyHeaders = r0
                okhttp3.Request r0 = r3.request()
                java.lang.String r0 = r0.method()
                r2.requestMethod = r0
                okhttp3.Protocol r0 = r3.protocol()
                r2.protocol = r0
                int r0 = r3.code()
                r2.code = r0
                java.lang.String r0 = r3.message()
                r2.message = r0
                okhttp3.Headers r0 = r3.headers()
                r2.responseHeaders = r0
                okhttp3.Handshake r0 = r3.handshake()
                r2.handshake = r0
                long r0 = r3.sentRequestAtMillis()
                r2.sentRequestMillis = r0
                long r0 = r3.receivedResponseAtMillis()
                r2.receivedResponseMillis = r0
                return
        }

        public Entry(okio.Source r9) {
                r8 = this;
                java.lang.String r0 = "Cache corruption for "
                r9.getClass()
                r8.<init>()
                okio.BufferedSource r1 = okio.Okio.buffer(r9)     // Catch: java.lang.Throwable -> L39
                java.lang.String r2 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L39
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion     // Catch: java.lang.Throwable -> L39
                okhttp3.HttpUrl r3 = r3.parse(r2)     // Catch: java.lang.Throwable -> L39
                if (r3 == 0) goto Lfc
                r8.url = r3     // Catch: java.lang.Throwable -> L39
                java.lang.String r0 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L39
                r8.requestMethod = r0     // Catch: java.lang.Throwable -> L39
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder     // Catch: java.lang.Throwable -> L39
                r0.<init>()     // Catch: java.lang.Throwable -> L39
                okhttp3.Cache$Companion r2 = okhttp3.Cache.Companion     // Catch: java.lang.Throwable -> L39
                int r2 = r2.readInt$okhttp(r1)     // Catch: java.lang.Throwable -> L39
                r3 = 0
                r4 = r3
            L2d:
                if (r4 >= r2) goto L3c
                java.lang.String r5 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L39
                r0.addLenient$okhttp(r5)     // Catch: java.lang.Throwable -> L39
                int r4 = r4 + 1
                goto L2d
            L39:
                r0 = move-exception
                goto L11a
            L3c:
                okhttp3.Headers r0 = r0.build()     // Catch: java.lang.Throwable -> L39
                r8.varyHeaders = r0     // Catch: java.lang.Throwable -> L39
                okhttp3.internal.http.StatusLine$Companion r0 = okhttp3.internal.http.StatusLine.Companion     // Catch: java.lang.Throwable -> L39
                java.lang.String r2 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L39
                okhttp3.internal.http.StatusLine r0 = r0.parse(r2)     // Catch: java.lang.Throwable -> L39
                okhttp3.Protocol r2 = r0.protocol     // Catch: java.lang.Throwable -> L39
                r8.protocol = r2     // Catch: java.lang.Throwable -> L39
                int r2 = r0.code     // Catch: java.lang.Throwable -> L39
                r8.code = r2     // Catch: java.lang.Throwable -> L39
                java.lang.String r0 = r0.message     // Catch: java.lang.Throwable -> L39
                r8.message = r0     // Catch: java.lang.Throwable -> L39
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder     // Catch: java.lang.Throwable -> L39
                r0.<init>()     // Catch: java.lang.Throwable -> L39
                okhttp3.Cache$Companion r2 = okhttp3.Cache.Companion     // Catch: java.lang.Throwable -> L39
                int r2 = r2.readInt$okhttp(r1)     // Catch: java.lang.Throwable -> L39
            L63:
                if (r3 >= r2) goto L6f
                java.lang.String r4 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L39
                r0.addLenient$okhttp(r4)     // Catch: java.lang.Throwable -> L39
                int r3 = r3 + 1
                goto L63
            L6f:
                java.lang.String r2 = okhttp3.Cache.Entry.SENT_MILLIS     // Catch: java.lang.Throwable -> L39
                java.lang.String r3 = r0.get(r2)     // Catch: java.lang.Throwable -> L39
                java.lang.String r4 = okhttp3.Cache.Entry.RECEIVED_MILLIS     // Catch: java.lang.Throwable -> L39
                java.lang.String r5 = r0.get(r4)     // Catch: java.lang.Throwable -> L39
                r0.removeAll(r2)     // Catch: java.lang.Throwable -> L39
                r0.removeAll(r4)     // Catch: java.lang.Throwable -> L39
                r6 = 0
                if (r3 == 0) goto L8a
                long r2 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L39
                goto L8b
            L8a:
                r2 = r6
            L8b:
                r8.sentRequestMillis = r2     // Catch: java.lang.Throwable -> L39
                if (r5 == 0) goto L93
                long r6 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Throwable -> L39
            L93:
                r8.receivedResponseMillis = r6     // Catch: java.lang.Throwable -> L39
                okhttp3.Headers r0 = r0.build()     // Catch: java.lang.Throwable -> L39
                r8.responseHeaders = r0     // Catch: java.lang.Throwable -> L39
                boolean r0 = r8.isHttps()     // Catch: java.lang.Throwable -> L39
                if (r0 == 0) goto Lf5
                java.lang.String r0 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L39
                int r2 = r0.length()     // Catch: java.lang.Throwable -> L39
                if (r2 > 0) goto Ld9
                java.lang.String r0 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L39
                okhttp3.CipherSuite$Companion r2 = okhttp3.CipherSuite.Companion     // Catch: java.lang.Throwable -> L39
                okhttp3.CipherSuite r0 = r2.forJavaName(r0)     // Catch: java.lang.Throwable -> L39
                java.util.List r2 = r8.readCertificateList(r1)     // Catch: java.lang.Throwable -> L39
                java.util.List r3 = r8.readCertificateList(r1)     // Catch: java.lang.Throwable -> L39
                boolean r4 = r1.exhausted()     // Catch: java.lang.Throwable -> L39
                if (r4 != 0) goto Lce
                okhttp3.TlsVersion$Companion r4 = okhttp3.TlsVersion.Companion     // Catch: java.lang.Throwable -> L39
                java.lang.String r1 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L39
                okhttp3.TlsVersion r1 = r4.forJavaName(r1)     // Catch: java.lang.Throwable -> L39
                goto Ld0
            Lce:
                okhttp3.TlsVersion r1 = okhttp3.TlsVersion.SSL_3_0     // Catch: java.lang.Throwable -> L39
            Ld0:
                okhttp3.Handshake$Companion r4 = okhttp3.Handshake.Companion     // Catch: java.lang.Throwable -> L39
                okhttp3.Handshake r0 = r4.get(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L39
                r8.handshake = r0     // Catch: java.lang.Throwable -> L39
                goto Lf8
            Ld9:
                java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L39
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
                r2.<init>()     // Catch: java.lang.Throwable -> L39
                java.lang.String r3 = "expected \"\" but was \""
                r2.append(r3)     // Catch: java.lang.Throwable -> L39
                r2.append(r0)     // Catch: java.lang.Throwable -> L39
                r0 = 34
                r2.append(r0)     // Catch: java.lang.Throwable -> L39
                java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L39
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L39
                throw r1     // Catch: java.lang.Throwable -> L39
            Lf5:
                r0 = 0
                r8.handshake = r0     // Catch: java.lang.Throwable -> L39
            Lf8:
                r9.close()
                return
            Lfc:
                java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L39
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
                r3.<init>(r0)     // Catch: java.lang.Throwable -> L39
                r3.append(r2)     // Catch: java.lang.Throwable -> L39
                java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L39
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L39
                okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L39
                okhttp3.internal.platform.Platform r0 = r0.get()     // Catch: java.lang.Throwable -> L39
                java.lang.String r2 = "cache corruption"
                r3 = 5
                r0.log(r2, r3, r1)     // Catch: java.lang.Throwable -> L39
                throw r1     // Catch: java.lang.Throwable -> L39
            L11a:
                throw r0     // Catch: java.lang.Throwable -> L11b
            L11b:
                r1 = move-exception
                ig.a.i(r9, r0)
                throw r1
        }

        private final boolean isHttps() {
                r2 = this;
                okhttp3.HttpUrl r0 = r2.url
                java.lang.String r0 = r0.scheme()
                java.lang.String r1 = "https"
                boolean r0 = gg.l.a(r0, r1)
                return r0
        }

        private final java.util.List<java.security.cert.Certificate> readCertificateList(okio.BufferedSource r8) {
                r7 = this;
                okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
                int r0 = r0.readInt$okhttp(r8)
                r1 = -1
                if (r0 != r1) goto Lc
                tf.t r8 = tf.t.f13167g
                return r8
            Lc:
                java.lang.String r1 = "X.509"
                java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch: java.security.cert.CertificateException -> L3c
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.security.cert.CertificateException -> L3c
                r2.<init>(r0)     // Catch: java.security.cert.CertificateException -> L3c
                r3 = 0
            L18:
                if (r3 >= r0) goto L46
                java.lang.String r4 = r8.readUtf8LineStrict()     // Catch: java.security.cert.CertificateException -> L3c
                okio.Buffer r5 = new okio.Buffer     // Catch: java.security.cert.CertificateException -> L3c
                r5.<init>()     // Catch: java.security.cert.CertificateException -> L3c
                okio.ByteString$Companion r6 = okio.ByteString.Companion     // Catch: java.security.cert.CertificateException -> L3c
                okio.ByteString r4 = r6.decodeBase64(r4)     // Catch: java.security.cert.CertificateException -> L3c
                if (r4 == 0) goto L3e
                r5.write(r4)     // Catch: java.security.cert.CertificateException -> L3c
                java.io.InputStream r4 = r5.inputStream()     // Catch: java.security.cert.CertificateException -> L3c
                java.security.cert.Certificate r4 = r1.generateCertificate(r4)     // Catch: java.security.cert.CertificateException -> L3c
                r2.add(r4)     // Catch: java.security.cert.CertificateException -> L3c
                int r3 = r3 + 1
                goto L18
            L3c:
                r8 = move-exception
                goto L47
            L3e:
                java.io.IOException r8 = new java.io.IOException     // Catch: java.security.cert.CertificateException -> L3c
                java.lang.String r0 = "Corrupt certificate in cache entry"
                r8.<init>(r0)     // Catch: java.security.cert.CertificateException -> L3c
                throw r8     // Catch: java.security.cert.CertificateException -> L3c
            L46:
                return r2
            L47:
                java.lang.String r8 = r8.getMessage()
                j8.o.y(r8)
                r8 = 0
                return r8
        }

        private final void writeCertList(okio.BufferedSink r9, java.util.List<? extends java.security.cert.Certificate> r10) {
                r8 = this;
                int r0 = r10.size()     // Catch: java.security.cert.CertificateEncodingException -> L3b
                long r0 = (long) r0     // Catch: java.security.cert.CertificateEncodingException -> L3b
                okio.BufferedSink r0 = r9.writeDecimalLong(r0)     // Catch: java.security.cert.CertificateEncodingException -> L3b
                r1 = 10
                r0.writeByte(r1)     // Catch: java.security.cert.CertificateEncodingException -> L3b
                java.util.Iterator r10 = r10.iterator()     // Catch: java.security.cert.CertificateEncodingException -> L3b
            L12:
                boolean r0 = r10.hasNext()     // Catch: java.security.cert.CertificateEncodingException -> L3b
                if (r0 == 0) goto L3e
                java.lang.Object r0 = r10.next()     // Catch: java.security.cert.CertificateEncodingException -> L3b
                java.security.cert.Certificate r0 = (java.security.cert.Certificate) r0     // Catch: java.security.cert.CertificateEncodingException -> L3b
                byte[] r3 = r0.getEncoded()     // Catch: java.security.cert.CertificateEncodingException -> L3b
                okio.ByteString$Companion r2 = okio.ByteString.Companion     // Catch: java.security.cert.CertificateEncodingException -> L3b
                r3.getClass()     // Catch: java.security.cert.CertificateEncodingException -> L3b
                r6 = 3
                r7 = 0
                r4 = 0
                r5 = 0
                okio.ByteString r0 = okio.ByteString.Companion.of$default(r2, r3, r4, r5, r6, r7)     // Catch: java.security.cert.CertificateEncodingException -> L3b
                java.lang.String r0 = r0.base64()     // Catch: java.security.cert.CertificateEncodingException -> L3b
                okio.BufferedSink r0 = r9.writeUtf8(r0)     // Catch: java.security.cert.CertificateEncodingException -> L3b
                r0.writeByte(r1)     // Catch: java.security.cert.CertificateEncodingException -> L3b
                goto L12
            L3b:
                r0 = move-exception
                r9 = r0
                goto L3f
            L3e:
                return
            L3f:
                java.lang.String r9 = r9.getMessage()
                j8.o.y(r9)
                return
        }

        public final boolean matches(okhttp3.Request r3, okhttp3.Response r4) {
                r2 = this;
                r3.getClass()
                r4.getClass()
                okhttp3.HttpUrl r0 = r2.url
                okhttp3.HttpUrl r1 = r3.url()
                boolean r0 = gg.l.a(r0, r1)
                if (r0 == 0) goto L2a
                java.lang.String r0 = r2.requestMethod
                java.lang.String r1 = r3.method()
                boolean r0 = gg.l.a(r0, r1)
                if (r0 == 0) goto L2a
                okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
                okhttp3.Headers r1 = r2.varyHeaders
                boolean r3 = r0.varyMatches(r4, r1, r3)
                if (r3 == 0) goto L2a
                r3 = 1
                return r3
            L2a:
                r3 = 0
                return r3
        }

        public final okhttp3.Response response(okhttp3.internal.cache.DiskLruCache.Snapshot r6) {
                r5 = this;
                r6.getClass()
                okhttp3.Headers r0 = r5.responseHeaders
                java.lang.String r1 = "Content-Type"
                java.lang.String r0 = r0.get(r1)
                okhttp3.Headers r1 = r5.responseHeaders
                java.lang.String r2 = "Content-Length"
                java.lang.String r1 = r1.get(r2)
                okhttp3.Request$Builder r2 = new okhttp3.Request$Builder
                r2.<init>()
                okhttp3.HttpUrl r3 = r5.url
                okhttp3.Request$Builder r2 = r2.url(r3)
                java.lang.String r3 = r5.requestMethod
                r4 = 0
                okhttp3.Request$Builder r2 = r2.method(r3, r4)
                okhttp3.Headers r3 = r5.varyHeaders
                okhttp3.Request$Builder r2 = r2.headers(r3)
                okhttp3.Request r2 = r2.build()
                okhttp3.Response$Builder r3 = new okhttp3.Response$Builder
                r3.<init>()
                okhttp3.Response$Builder r2 = r3.request(r2)
                okhttp3.Protocol r3 = r5.protocol
                okhttp3.Response$Builder r2 = r2.protocol(r3)
                int r3 = r5.code
                okhttp3.Response$Builder r2 = r2.code(r3)
                java.lang.String r3 = r5.message
                okhttp3.Response$Builder r2 = r2.message(r3)
                okhttp3.Headers r3 = r5.responseHeaders
                okhttp3.Response$Builder r2 = r2.headers(r3)
                okhttp3.Cache$CacheResponseBody r3 = new okhttp3.Cache$CacheResponseBody
                r3.<init>(r6, r0, r1)
                okhttp3.Response$Builder r6 = r2.body(r3)
                okhttp3.Handshake r0 = r5.handshake
                okhttp3.Response$Builder r6 = r6.handshake(r0)
                long r0 = r5.sentRequestMillis
                okhttp3.Response$Builder r6 = r6.sentRequestAtMillis(r0)
                long r0 = r5.receivedResponseMillis
                okhttp3.Response$Builder r6 = r6.receivedResponseAtMillis(r0)
                okhttp3.Response r6 = r6.build()
                return r6
        }

        public final void writeTo(okhttp3.internal.cache.DiskLruCache.Editor r8) {
                r7 = this;
                r8.getClass()
                r0 = 0
                okio.Sink r8 = r8.newSink(r0)
                okio.BufferedSink r8 = okio.Okio.buffer(r8)
                okhttp3.HttpUrl r1 = r7.url     // Catch: java.lang.Throwable -> L5b
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r1 = r8.writeUtf8(r1)     // Catch: java.lang.Throwable -> L5b
                r2 = 10
                r1.writeByte(r2)     // Catch: java.lang.Throwable -> L5b
                java.lang.String r1 = r7.requestMethod     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r1 = r8.writeUtf8(r1)     // Catch: java.lang.Throwable -> L5b
                r1.writeByte(r2)     // Catch: java.lang.Throwable -> L5b
                okhttp3.Headers r1 = r7.varyHeaders     // Catch: java.lang.Throwable -> L5b
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L5b
                long r3 = (long) r1     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r1 = r8.writeDecimalLong(r3)     // Catch: java.lang.Throwable -> L5b
                r1.writeByte(r2)     // Catch: java.lang.Throwable -> L5b
                okhttp3.Headers r1 = r7.varyHeaders     // Catch: java.lang.Throwable -> L5b
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L5b
                r3 = r0
            L39:
                java.lang.String r4 = ": "
                if (r3 >= r1) goto L5e
                okhttp3.Headers r5 = r7.varyHeaders     // Catch: java.lang.Throwable -> L5b
                java.lang.String r5 = r5.name(r3)     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r5 = r8.writeUtf8(r5)     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r4 = r5.writeUtf8(r4)     // Catch: java.lang.Throwable -> L5b
                okhttp3.Headers r5 = r7.varyHeaders     // Catch: java.lang.Throwable -> L5b
                java.lang.String r5 = r5.value(r3)     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r4 = r4.writeUtf8(r5)     // Catch: java.lang.Throwable -> L5b
                r4.writeByte(r2)     // Catch: java.lang.Throwable -> L5b
                int r3 = r3 + 1
                goto L39
            L5b:
                r0 = move-exception
                goto L115
            L5e:
                okhttp3.internal.http.StatusLine r1 = new okhttp3.internal.http.StatusLine     // Catch: java.lang.Throwable -> L5b
                okhttp3.Protocol r3 = r7.protocol     // Catch: java.lang.Throwable -> L5b
                int r5 = r7.code     // Catch: java.lang.Throwable -> L5b
                java.lang.String r6 = r7.message     // Catch: java.lang.Throwable -> L5b
                r1.<init>(r3, r5, r6)     // Catch: java.lang.Throwable -> L5b
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r1 = r8.writeUtf8(r1)     // Catch: java.lang.Throwable -> L5b
                r1.writeByte(r2)     // Catch: java.lang.Throwable -> L5b
                okhttp3.Headers r1 = r7.responseHeaders     // Catch: java.lang.Throwable -> L5b
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L5b
                int r1 = r1 + 2
                long r5 = (long) r1     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r1 = r8.writeDecimalLong(r5)     // Catch: java.lang.Throwable -> L5b
                r1.writeByte(r2)     // Catch: java.lang.Throwable -> L5b
                okhttp3.Headers r1 = r7.responseHeaders     // Catch: java.lang.Throwable -> L5b
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L5b
            L8a:
                if (r0 >= r1) goto Laa
                okhttp3.Headers r3 = r7.responseHeaders     // Catch: java.lang.Throwable -> L5b
                java.lang.String r3 = r3.name(r0)     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r3 = r8.writeUtf8(r3)     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r3 = r3.writeUtf8(r4)     // Catch: java.lang.Throwable -> L5b
                okhttp3.Headers r5 = r7.responseHeaders     // Catch: java.lang.Throwable -> L5b
                java.lang.String r5 = r5.value(r0)     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r3 = r3.writeUtf8(r5)     // Catch: java.lang.Throwable -> L5b
                r3.writeByte(r2)     // Catch: java.lang.Throwable -> L5b
                int r0 = r0 + 1
                goto L8a
            Laa:
                java.lang.String r0 = okhttp3.Cache.Entry.SENT_MILLIS     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r0 = r8.writeUtf8(r0)     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r0 = r0.writeUtf8(r4)     // Catch: java.lang.Throwable -> L5b
                long r5 = r7.sentRequestMillis     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r0 = r0.writeDecimalLong(r5)     // Catch: java.lang.Throwable -> L5b
                r0.writeByte(r2)     // Catch: java.lang.Throwable -> L5b
                java.lang.String r0 = okhttp3.Cache.Entry.RECEIVED_MILLIS     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r0 = r8.writeUtf8(r0)     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r0 = r0.writeUtf8(r4)     // Catch: java.lang.Throwable -> L5b
                long r3 = r7.receivedResponseMillis     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r0 = r0.writeDecimalLong(r3)     // Catch: java.lang.Throwable -> L5b
                r0.writeByte(r2)     // Catch: java.lang.Throwable -> L5b
                boolean r0 = r7.isHttps()     // Catch: java.lang.Throwable -> L5b
                if (r0 == 0) goto L110
                r8.writeByte(r2)     // Catch: java.lang.Throwable -> L5b
                okhttp3.Handshake r0 = r7.handshake     // Catch: java.lang.Throwable -> L5b
                r0.getClass()     // Catch: java.lang.Throwable -> L5b
                okhttp3.CipherSuite r0 = r0.cipherSuite()     // Catch: java.lang.Throwable -> L5b
                java.lang.String r0 = r0.javaName()     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r0 = r8.writeUtf8(r0)     // Catch: java.lang.Throwable -> L5b
                r0.writeByte(r2)     // Catch: java.lang.Throwable -> L5b
                okhttp3.Handshake r0 = r7.handshake     // Catch: java.lang.Throwable -> L5b
                java.util.List r0 = r0.peerCertificates()     // Catch: java.lang.Throwable -> L5b
                r7.writeCertList(r8, r0)     // Catch: java.lang.Throwable -> L5b
                okhttp3.Handshake r0 = r7.handshake     // Catch: java.lang.Throwable -> L5b
                java.util.List r0 = r0.localCertificates()     // Catch: java.lang.Throwable -> L5b
                r7.writeCertList(r8, r0)     // Catch: java.lang.Throwable -> L5b
                okhttp3.Handshake r0 = r7.handshake     // Catch: java.lang.Throwable -> L5b
                okhttp3.TlsVersion r0 = r0.tlsVersion()     // Catch: java.lang.Throwable -> L5b
                java.lang.String r0 = r0.javaName()     // Catch: java.lang.Throwable -> L5b
                okio.BufferedSink r0 = r8.writeUtf8(r0)     // Catch: java.lang.Throwable -> L5b
                r0.writeByte(r2)     // Catch: java.lang.Throwable -> L5b
            L110:
                r0 = 0
                ig.a.i(r8, r0)
                return
            L115:
                throw r0     // Catch: java.lang.Throwable -> L116
            L116:
                r1 = move-exception
                ig.a.i(r8, r0)
                throw r1
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class RealCacheRequest implements okhttp3.internal.cache.CacheRequest {
        private final okio.Sink body;
        private final okio.Sink cacheOut;
        private boolean done;
        private final okhttp3.internal.cache.DiskLruCache.Editor editor;
        final /* synthetic */ okhttp3.Cache this$0;


        public RealCacheRequest(okhttp3.Cache r2, okhttp3.internal.cache.DiskLruCache.Editor r3) {
                r1 = this;
                r3.getClass()
                r1.this$0 = r2
                r1.<init>()
                r1.editor = r3
                r0 = 1
                okio.Sink r3 = r3.newSink(r0)
                r1.cacheOut = r3
                okhttp3.Cache$RealCacheRequest$1 r0 = new okhttp3.Cache$RealCacheRequest$1
                r0.<init>(r2, r1, r3)
                r1.body = r0
                return
        }

        public static final /* synthetic */ okhttp3.internal.cache.DiskLruCache.Editor access$getEditor$p(okhttp3.Cache.RealCacheRequest r0) {
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r0.editor
                return r0
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
                r3 = this;
                okhttp3.Cache r0 = r3.this$0
                monitor-enter(r0)
                boolean r1 = r3.done     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L9
                monitor-exit(r0)
                return
            L9:
                r1 = 1
                r3.done = r1     // Catch: java.lang.Throwable -> L20
                int r2 = r0.getWriteAbortCount$okhttp()     // Catch: java.lang.Throwable -> L20
                int r2 = r2 + r1
                r0.setWriteAbortCount$okhttp(r2)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r0)
                okio.Sink r0 = r3.cacheOut
                okhttp3.internal.Util.closeQuietly(r0)
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r3.editor     // Catch: java.io.IOException -> L1f
                r0.abort()     // Catch: java.io.IOException -> L1f
            L1f:
                return
            L20:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public okio.Sink body() {
                r1 = this;
                okio.Sink r0 = r1.body
                return r0
        }

        public final boolean getDone() {
                r1 = this;
                boolean r0 = r1.done
                return r0
        }

        public final void setDone(boolean r1) {
                r0 = this;
                r0.done = r1
                return
        }
    }

    /* JADX INFO: renamed from: okhttp3.Cache$urls$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class AnonymousClass1 implements java.util.Iterator<java.lang.String>, hg.a {
        private boolean canRemove;
        private final java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot> delegate;
        private java.lang.String nextUrl;

        public AnonymousClass1(okhttp3.Cache r1) {
                r0 = this;
                r0.<init>()
                okhttp3.internal.cache.DiskLruCache r1 = r1.getCache$okhttp()
                java.util.Iterator r1 = r1.snapshots()
                r0.delegate = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r5 = this;
                java.lang.String r0 = r5.nextUrl
                r1 = 1
                if (r0 == 0) goto L6
                return r1
            L6:
                r0 = 0
                r5.canRemove = r0
            L9:
                java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r2 = r5.delegate
                boolean r2 = r2.hasNext()
                if (r2 == 0) goto L36
                java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r2 = r5.delegate     // Catch: java.io.IOException -> L9
                java.lang.Object r2 = r2.next()     // Catch: java.io.IOException -> L9
                java.io.Closeable r2 = (java.io.Closeable) r2     // Catch: java.io.IOException -> L9
                r3 = r2
                okhttp3.internal.cache.DiskLruCache$Snapshot r3 = (okhttp3.internal.cache.DiskLruCache.Snapshot) r3     // Catch: java.lang.Throwable -> L2f
                okio.Source r3 = r3.getSource(r0)     // Catch: java.lang.Throwable -> L2f
                okio.BufferedSource r3 = okio.Okio.buffer(r3)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r3 = r3.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L2f
                r5.nextUrl = r3     // Catch: java.lang.Throwable -> L2f
                r3 = 0
                ig.a.i(r2, r3)     // Catch: java.io.IOException -> L9
                return r1
            L2f:
                r3 = move-exception
                throw r3     // Catch: java.lang.Throwable -> L31
            L31:
                r4 = move-exception
                ig.a.i(r2, r3)     // Catch: java.io.IOException -> L9
                throw r4     // Catch: java.io.IOException -> L9
            L36:
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.String next() {
                r1 = this;
                java.lang.String r0 = r1.next2()
                return r0
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
        public java.lang.String next2() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L12
                java.lang.String r0 = r2.nextUrl
                r0.getClass()
                r1 = 0
                r2.nextUrl = r1
                r1 = 1
                r2.canRemove = r1
                return r0
            L12:
                bsh.j.e()
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                boolean r0 = r1.canRemove
                if (r0 == 0) goto La
                java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r0 = r1.delegate
                r0.remove()
                return
            La:
                java.lang.String r0 = "remove() before next()"
                j8.o.A(r0)
                return
        }
    }

    static {
            okhttp3.Cache$Companion r0 = new okhttp3.Cache$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Cache.Companion = r0
            return
    }

    public Cache(java.io.File r2, long r3) {
            r1 = this;
            r2.getClass()
            okhttp3.internal.io.FileSystem r0 = okhttp3.internal.io.FileSystem.SYSTEM
            r1.<init>(r2, r3, r0)
            return
    }

    public Cache(java.io.File r9, long r10, okhttp3.internal.io.FileSystem r12) {
            r8 = this;
            r9.getClass()
            r12.getClass()
            r8.<init>()
            okhttp3.internal.cache.DiskLruCache r0 = new okhttp3.internal.cache.DiskLruCache
            r4 = 2
            okhttp3.internal.concurrent.TaskRunner r7 = okhttp3.internal.concurrent.TaskRunner.INSTANCE
            r3 = 201105(0x31191, float:2.81808E-40)
            r2 = r9
            r5 = r10
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r8.cache = r0
            return
    }

    private final void abortQuietly(okhttp3.internal.cache.DiskLruCache.Editor r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.abort()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static final java.lang.String key(okhttp3.HttpUrl r1) {
            okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
            java.lang.String r1 = r0.key(r1)
            return r1
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_directory, reason: not valid java name */
    public final java.io.File m28deprecated_directory() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            java.io.File r0 = r0.getDirectory()
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.close()
            return
    }

    public final void delete() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.delete()
            return
    }

    public final java.io.File directory() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            java.io.File r0 = r0.getDirectory()
            return r0
    }

    public final void evictAll() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.evictAll()
            return
    }

    @Override // java.io.Flushable
    public void flush() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.flush()
            return
    }

    public final okhttp3.Response get$okhttp(okhttp3.Request r5) {
            r4 = this;
            r5.getClass()
            okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
            okhttp3.HttpUrl r1 = r5.url()
            java.lang.String r0 = r0.key(r1)
            r1 = 0
            okhttp3.internal.cache.DiskLruCache r2 = r4.cache     // Catch: java.io.IOException -> L39
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r2.get(r0)     // Catch: java.io.IOException -> L39
            if (r0 != 0) goto L17
            return r1
        L17:
            okhttp3.Cache$Entry r2 = new okhttp3.Cache$Entry     // Catch: java.io.IOException -> L36
            r3 = 0
            okio.Source r3 = r0.getSource(r3)     // Catch: java.io.IOException -> L36
            r2.<init>(r3)     // Catch: java.io.IOException -> L36
            okhttp3.Response r0 = r2.response(r0)
            boolean r5 = r2.matches(r5, r0)
            if (r5 != 0) goto L35
            okhttp3.ResponseBody r5 = r0.body()
            if (r5 == 0) goto L34
            okhttp3.internal.Util.closeQuietly(r5)
        L34:
            return r1
        L35:
            return r0
        L36:
            okhttp3.internal.Util.closeQuietly(r0)
        L39:
            return r1
    }

    public final okhttp3.internal.cache.DiskLruCache getCache$okhttp() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            return r0
    }

    public final int getWriteAbortCount$okhttp() {
            r1 = this;
            int r0 = r1.writeAbortCount
            return r0
    }

    public final int getWriteSuccessCount$okhttp() {
            r1 = this;
            int r0 = r1.writeSuccessCount
            return r0
    }

    public final synchronized int hitCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.hitCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final void initialize() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.initialize()
            return
    }

    public final boolean isClosed() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            boolean r0 = r0.isClosed()
            return r0
    }

    public final long maxSize() {
            r2 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r2.cache
            long r0 = r0.getMaxSize()
            return r0
    }

    public final synchronized int networkCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.networkCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final okhttp3.internal.cache.CacheRequest put$okhttp(okhttp3.Response r10) {
            r9 = this;
            r10.getClass()
            okhttp3.Request r0 = r10.request()
            java.lang.String r0 = r0.method()
            okhttp3.internal.http.HttpMethod r1 = okhttp3.internal.http.HttpMethod.INSTANCE
            okhttp3.Request r2 = r10.request()
            java.lang.String r2 = r2.method()
            boolean r1 = r1.invalidatesCache(r2)
            r2 = 0
            if (r1 == 0) goto L24
            okhttp3.Request r10 = r10.request()     // Catch: java.io.IOException -> L23
            r9.remove$okhttp(r10)     // Catch: java.io.IOException -> L23
        L23:
            return r2
        L24:
            java.lang.String r1 = "GET"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2d
            return r2
        L2d:
            okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
            boolean r1 = r0.hasVaryAll(r10)
            if (r1 == 0) goto L36
            return r2
        L36:
            okhttp3.Cache$Entry r1 = new okhttp3.Cache$Entry
            r1.<init>(r10)
            okhttp3.internal.cache.DiskLruCache r3 = r9.cache     // Catch: java.io.IOException -> L5d
            okhttp3.Request r10 = r10.request()     // Catch: java.io.IOException -> L5d
            okhttp3.HttpUrl r10 = r10.url()     // Catch: java.io.IOException -> L5d
            java.lang.String r4 = r0.key(r10)     // Catch: java.io.IOException -> L5d
            r7 = 2
            r8 = 0
            r5 = 0
            okhttp3.internal.cache.DiskLruCache$Editor r10 = okhttp3.internal.cache.DiskLruCache.edit$default(r3, r4, r5, r7, r8)     // Catch: java.io.IOException -> L5d
            if (r10 != 0) goto L54
            return r2
        L54:
            r1.writeTo(r10)     // Catch: java.io.IOException -> L5e
            okhttp3.Cache$RealCacheRequest r0 = new okhttp3.Cache$RealCacheRequest     // Catch: java.io.IOException -> L5e
            r0.<init>(r9, r10)     // Catch: java.io.IOException -> L5e
            return r0
        L5d:
            r10 = r2
        L5e:
            r9.abortQuietly(r10)
            return r2
    }

    public final void remove$okhttp(okhttp3.Request r3) {
            r2 = this;
            r3.getClass()
            okhttp3.internal.cache.DiskLruCache r0 = r2.cache
            okhttp3.Cache$Companion r1 = okhttp3.Cache.Companion
            okhttp3.HttpUrl r3 = r3.url()
            java.lang.String r3 = r1.key(r3)
            r0.remove(r3)
            return
    }

    public final synchronized int requestCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.requestCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final void setWriteAbortCount$okhttp(int r1) {
            r0 = this;
            r0.writeAbortCount = r1
            return
    }

    public final void setWriteSuccessCount$okhttp(int r1) {
            r0 = this;
            r0.writeSuccessCount = r1
            return
    }

    public final long size() {
            r2 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r2.cache
            long r0 = r0.size()
            return r0
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.hitCount     // Catch: java.lang.Throwable -> L9
            int r0 = r0 + 1
            r1.hitCount = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public final synchronized void trackResponse$okhttp(okhttp3.internal.cache.CacheStrategy r2) {
            r1 = this;
            monitor-enter(r1)
            r2.getClass()     // Catch: java.lang.Throwable -> L17
            int r0 = r1.requestCount     // Catch: java.lang.Throwable -> L17
            int r0 = r0 + 1
            r1.requestCount = r0     // Catch: java.lang.Throwable -> L17
            okhttp3.Request r0 = r2.getNetworkRequest()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            int r2 = r1.networkCount     // Catch: java.lang.Throwable -> L17
            int r2 = r2 + 1
            r1.networkCount = r2     // Catch: java.lang.Throwable -> L17
            goto L25
        L17:
            r2 = move-exception
            goto L27
        L19:
            okhttp3.Response r2 = r2.getCacheResponse()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L25
            int r2 = r1.hitCount     // Catch: java.lang.Throwable -> L17
            int r2 = r2 + 1
            r1.hitCount = r2     // Catch: java.lang.Throwable -> L17
        L25:
            monitor-exit(r1)
            return
        L27:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    public final void update$okhttp(okhttp3.Response r2, okhttp3.Response r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            okhttp3.Cache$Entry r0 = new okhttp3.Cache$Entry
            r0.<init>(r3)
            okhttp3.ResponseBody r2 = r2.body()
            r2.getClass()
            okhttp3.Cache$CacheResponseBody r2 = (okhttp3.Cache.CacheResponseBody) r2
            okhttp3.internal.cache.DiskLruCache$Snapshot r2 = r2.getSnapshot()
            okhttp3.internal.cache.DiskLruCache$Editor r2 = r2.edit()     // Catch: java.io.IOException -> L26
            if (r2 != 0) goto L1f
            return
        L1f:
            r0.writeTo(r2)     // Catch: java.io.IOException -> L27
            r2.commit()     // Catch: java.io.IOException -> L27
            return
        L26:
            r2 = 0
        L27:
            r1.abortQuietly(r2)
            return
    }

    public final java.util.Iterator<java.lang.String> urls() {
            r1 = this;
            okhttp3.Cache$urls$1 r0 = new okhttp3.Cache$urls$1
            r0.<init>(r1)
            return r0
    }

    public final synchronized int writeAbortCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.writeAbortCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized int writeSuccessCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.writeSuccessCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }
}
