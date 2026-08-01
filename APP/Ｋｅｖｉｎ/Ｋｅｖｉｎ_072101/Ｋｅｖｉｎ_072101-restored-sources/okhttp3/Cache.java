package okhttp3;

/* JADX INFO: compiled from: Cache.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0004BCDEB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0018\u00010\"R\u00020\fH\u0002J\b\u0010#\u001a\u00020 H\u0016J\u0006\u0010$\u001a\u00020 J\r\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b%J\u0006\u0010&\u001a\u00020 J\b\u0010'\u001a\u00020 H\u0016J\u0017\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010-\u001a\u00020 J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0011J\u0017\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020)H\u0000¢\u0006\u0002\b1J\u0015\u00102\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b3J\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u00104\u001a\u00020\u0006J\r\u00105\u001a\u00020 H\u0000¢\u0006\u0002\b6J\u0015\u00107\u001a\u00020 2\u0006\u00108\u001a\u000209H\u0000¢\u0006\u0002\b:J\u001d\u0010;\u001a\u00020 2\u0006\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020)H\u0000¢\u0006\u0002\b>J\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@J\u0006\u0010\u0017\u001a\u00020\u0011J\u0006\u0010\u001c\u001a\u00020\u0011R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006F"}, m115d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "directory", "Ljava/io/File;", "maxSize", "", "(Ljava/io/File;J)V", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "(Ljava/io/File;JLokhttp3/internal/io/FileSystem;)V", "cache", "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", "()Ljava/io/File;", "hitCount", "", "isClosed", "", "()Z", "networkCount", "requestCount", "writeAbortCount", "getWriteAbortCount$okhttp", "()I", "setWriteAbortCount$okhttp", "(I)V", "writeSuccessCount", "getWriteSuccessCount$okhttp", "setWriteSuccessCount$okhttp", "abortQuietly", "", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "close", "delete", "-deprecated_directory", "evictAll", "flush", "get", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "get$okhttp", "initialize", "put", "Lokhttp3/internal/cache/CacheRequest;", "response", "put$okhttp", "remove", "remove$okhttp", "size", "trackConditionalCacheHit", "trackConditionalCacheHit$okhttp", "trackResponse", "cacheStrategy", "Lokhttp3/internal/cache/CacheStrategy;", "trackResponse$okhttp", "update", "cached", "network", "update$okhttp", "urls", "", "", "CacheResponseBody", "Companion", "Entry", "RealCacheRequest", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

    /* JADX INFO: compiled from: Cache.kt */
    @kotlin.Metadata(m114d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u0007\u001a\u00020\rH\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m115d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "contentType", "", "contentLength", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V", "bodySource", "Lokio/BufferedSource;", "getSnapshot", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "", "Lokhttp3/MediaType;", "source", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    private static final class CacheResponseBody extends okhttp3.ResponseBody {
        private final okio.BufferedSource bodySource;
        private final java.lang.String contentLength;
        private final java.lang.String contentType;
        private final okhttp3.internal.cache.DiskLruCache.Snapshot snapshot;


        public CacheResponseBody(okhttp3.internal.cache.DiskLruCache.Snapshot r3, java.lang.String r4, java.lang.String r5) {
                r2 = this;
                java.lang.String r0 = "snapshot"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r2.<init>()
                r2.snapshot = r3
                r2.contentType = r4
                r2.contentLength = r5
                okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r2.snapshot
                r1 = 1
                okio.Source r0 = r0.getSource(r1)
                okhttp3.Cache$CacheResponseBody$1 r1 = new okhttp3.Cache$CacheResponseBody$1
                r1.<init>(r0, r2)
                okio.Source r1 = (okio.Source) r1
                okio.BufferedSource r1 = okio.Okio.buffer(r1)
                r2.bodySource = r1
                return
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
                r3 = this;
                java.lang.String r0 = r3.contentLength
                r1 = -1
                if (r0 == 0) goto La
                long r1 = okhttp3.internal.Util.toLongOrDefault(r0, r1)
            La:
                return r1
        }

        @Override // okhttp3.ResponseBody
        public okhttp3.MediaType contentType() {
                r2 = this;
                java.lang.String r0 = r2.contentType
                if (r0 == 0) goto Lb
                okhttp3.MediaType$Companion r1 = okhttp3.MediaType.Companion
                okhttp3.MediaType r0 = r1.parse(r0)
                goto Lc
            Lb:
                r0 = 0
            Lc:
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

    /* JADX INFO: compiled from: Cache.kt */
    @kotlin.Metadata(m114d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aJ\n\u0010\u001b\u001a\u00020\u0015*\u00020\u0017J\u0012\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001d*\u00020\u0011H\u0002J\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m115d2 = {"Lokhttp3/Cache$Companion;", "", "()V", "ENTRY_BODY", "", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "key", "", "url", "Lokhttp3/HttpUrl;", "readInt", "source", "Lokio/BufferedSource;", "readInt$okhttp", "varyHeaders", "Lokhttp3/Headers;", "requestHeaders", "responseHeaders", "varyMatches", "", "cachedResponse", "Lokhttp3/Response;", "cachedRequest", "newRequest", "Lokhttp3/Request;", "hasVaryAll", "varyFields", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

        private final java.util.Set<java.lang.String> varyFields(okhttp3.Headers r13) {
                r12 = this;
                r0 = 0
                r1 = 0
                int r2 = r13.size()
            L6:
                if (r1 >= r2) goto L5e
                java.lang.String r3 = "Vary"
                java.lang.String r4 = r13.name(r1)
                r5 = 1
                boolean r3 = kotlin.text.StringsKt.equals(r3, r4, r5)
                if (r3 != 0) goto L16
                goto L5b
            L16:
                java.lang.String r3 = r13.value(r1)
                if (r0 != 0) goto L2a
                java.util.TreeSet r4 = new java.util.TreeSet
                kotlin.jvm.internal.StringCompanionObject r6 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
                java.util.Comparator r6 = kotlin.text.StringsKt.getCASE_INSENSITIVE_ORDER(r6)
                r4.<init>(r6)
                r0 = r4
                java.util.Set r0 = (java.util.Set) r0
            L2a:
                r6 = r3
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                char[] r7 = new char[r5]
                r4 = 44
                r5 = 0
                r7[r5] = r4
                r10 = 6
                r11 = 0
                r8 = 0
                r9 = 0
                java.util.List r4 = kotlin.text.StringsKt.split$default(r6, r7, r8, r9, r10, r11)
                java.util.Iterator r4 = r4.iterator()
            L40:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L5b
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                r6 = r5
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                java.lang.CharSequence r6 = kotlin.text.StringsKt.trim(r6)
                java.lang.String r6 = r6.toString()
                r0.add(r6)
                goto L40
            L5b:
                int r1 = r1 + 1
                goto L6
            L5e:
                if (r0 != 0) goto L65
                java.util.Set r1 = kotlin.collections.SetsKt.emptySet()
                goto L66
            L65:
                r1 = r0
            L66:
                return r1
        }

        private final okhttp3.Headers varyHeaders(okhttp3.Headers r7, okhttp3.Headers r8) {
                r6 = this;
                java.util.Set r0 = r6.varyFields(r8)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto Ld
                okhttp3.Headers r1 = okhttp3.internal.Util.EMPTY_HEADERS
                return r1
            Ld:
                okhttp3.Headers$Builder r1 = new okhttp3.Headers$Builder
                r1.<init>()
                r2 = 0
                int r3 = r7.size()
            L17:
                if (r2 >= r3) goto L2d
                java.lang.String r4 = r7.name(r2)
                boolean r5 = r0.contains(r4)
                if (r5 == 0) goto L2a
                java.lang.String r5 = r7.value(r2)
                r1.add(r4, r5)
            L2a:
                int r2 = r2 + 1
                goto L17
            L2d:
                okhttp3.Headers r2 = r1.build()
                return r2
        }

        public final boolean hasVaryAll(okhttp3.Response r3) {
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.Headers r0 = r3.headers()
                java.util.Set r0 = r2.varyFields(r0)
                java.lang.String r1 = "*"
                boolean r0 = r0.contains(r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String key(okhttp3.HttpUrl r3) {
                r2 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.ByteString$Companion r0 = okio.ByteString.Companion
                java.lang.String r1 = r3.toString()
                okio.ByteString r0 = r0.encodeUtf8(r1)
                okio.ByteString r0 = r0.md5()
                java.lang.String r0 = r0.hex()
                return r0
        }

        public final int readInt$okhttp(okio.BufferedSource r7) throws java.io.IOException {
                r6 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                long r0 = r7.readDecimalLong()     // Catch: java.lang.NumberFormatException -> L4e
                java.lang.String r2 = r7.readUtf8LineStrict()     // Catch: java.lang.NumberFormatException -> L4e
                r3 = 0
                int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r3 < 0) goto L2b
                r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r3 > 0) goto L2b
                r3 = r2
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.NumberFormatException -> L4e
                int r3 = r3.length()     // Catch: java.lang.NumberFormatException -> L4e
                if (r3 <= 0) goto L26
                r3 = 1
                goto L27
            L26:
                r3 = 0
            L27:
                if (r3 != 0) goto L2b
                int r3 = (int) r0     // Catch: java.lang.NumberFormatException -> L4e
                return r3
            L2b:
                java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.NumberFormatException -> L4e
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L4e
                r4.<init>()     // Catch: java.lang.NumberFormatException -> L4e
                java.lang.String r5 = "expected an int but was \""
                java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.NumberFormatException -> L4e
                java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.NumberFormatException -> L4e
                java.lang.StringBuilder r4 = r4.append(r2)     // Catch: java.lang.NumberFormatException -> L4e
                r5 = 34
                java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.NumberFormatException -> L4e
                java.lang.String r4 = r4.toString()     // Catch: java.lang.NumberFormatException -> L4e
                r3.<init>(r4)     // Catch: java.lang.NumberFormatException -> L4e
                throw r3     // Catch: java.lang.NumberFormatException -> L4e
            L4e:
                r0 = move-exception
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = r0.getMessage()
                r1.<init>(r2)
                throw r1
        }

        public final okhttp3.Headers varyHeaders(okhttp3.Response r4) {
                r3 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okhttp3.Response r0 = r4.networkResponse()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                okhttp3.Request r0 = r0.request()
                okhttp3.Headers r0 = r0.headers()
                okhttp3.Headers r1 = r4.headers()
                okhttp3.Headers r2 = r3.varyHeaders(r0, r1)
                return r2
        }

        public final boolean varyMatches(okhttp3.Response r10, okhttp3.Headers r11, okhttp3.Request r12) {
                r9 = this;
                java.lang.String r0 = "cachedResponse"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.lang.String r0 = "cachedRequest"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.lang.String r0 = "newRequest"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                okhttp3.Headers r0 = r10.headers()
                java.util.Set r0 = r9.varyFields(r0)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r1 = 0
                boolean r2 = r0 instanceof java.util.Collection
                r3 = 1
                if (r2 == 0) goto L29
                r2 = r0
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L29
                goto L4c
            L29:
                java.util.Iterator r2 = r0.iterator()
            L2d:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L4b
                java.lang.Object r4 = r2.next()
                r5 = r4
                java.lang.String r5 = (java.lang.String) r5
                r6 = 0
                java.util.List r7 = r11.values(r5)
                java.util.List r8 = r12.headers(r5)
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
                if (r7 != 0) goto L2d
                r3 = 0
                goto L4c
            L4b:
            L4c:
                return r3
        }
    }

    /* JADX INFO: compiled from: Cache.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#H\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\n\u0010$\u001a\u00060%R\u00020&J\u001e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u0012\u0010,\u001a\u00020(2\n\u0010-\u001a\u00060.R\u00020&R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m115d2 = {"Lokhttp3/Cache$Entry;", "", "rawSource", "Lokio/Source;", "(Lokio/Source;)V", "response", "Lokhttp3/Response;", "(Lokhttp3/Response;)V", "code", "", "handshake", "Lokhttp3/Handshake;", "isHttps", "", "()Z", "message", "", "protocol", "Lokhttp3/Protocol;", "receivedResponseMillis", "", "requestMethod", "responseHeaders", "Lokhttp3/Headers;", "sentRequestMillis", "url", "Lokhttp3/HttpUrl;", "varyHeaders", "matches", "request", "Lokhttp3/Request;", "readCertificateList", "", "Ljava/security/cert/Certificate;", "source", "Lokio/BufferedSource;", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "writeCertList", "", "sink", "Lokio/BufferedSink;", "certificates", "writeTo", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    private static final class Entry {
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

        /* JADX INFO: compiled from: Cache.kt */
        @kotlin.Metadata(m114d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m115d2 = {"Lokhttp3/Cache$Entry$Companion;", "", "()V", "RECEIVED_MILLIS", "", "SENT_MILLIS", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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
        }

        static {
                okhttp3.Cache$Entry$Companion r0 = new okhttp3.Cache$Entry$Companion
                r1 = 0
                r0.<init>(r1)
                okhttp3.Cache.Entry.Companion = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
                okhttp3.internal.platform.Platform r1 = r1.get()
                java.lang.String r1 = r1.getPrefix()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "-Sent-Millis"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                okhttp3.Cache.Entry.SENT_MILLIS = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
                okhttp3.internal.platform.Platform r1 = r1.get()
                java.lang.String r1 = r1.getPrefix()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "-Received-Millis"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                okhttp3.Cache.Entry.RECEIVED_MILLIS = r0
                return
        }

        public Entry(okhttp3.Response r3) {
                r2 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
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

        public Entry(okio.Source r23) throws java.io.IOException {
                r22 = this;
                r1 = r22
                r2 = r23
                java.lang.String r0 = "rawSource"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r22.<init>()
                r3 = r2
                java.io.Closeable r3 = (java.io.Closeable) r3
                r0 = r3
                okio.Source r0 = (okio.Source) r0     // Catch: java.lang.Throwable -> L174
                r4 = 0
                okio.BufferedSource r5 = okio.Okio.buffer(r23)     // Catch: java.lang.Throwable -> L174
                java.lang.String r6 = r5.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L174
                okhttp3.HttpUrl$Companion r7 = okhttp3.HttpUrl.Companion     // Catch: java.lang.Throwable -> L174
                okhttp3.HttpUrl r7 = r7.parse(r6)     // Catch: java.lang.Throwable -> L174
                if (r7 == 0) goto L141
                r1.url = r7     // Catch: java.lang.Throwable -> L174
                java.lang.String r7 = r5.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L174
                r1.requestMethod = r7     // Catch: java.lang.Throwable -> L174
                okhttp3.Headers$Builder r7 = new okhttp3.Headers$Builder     // Catch: java.lang.Throwable -> L174
                r7.<init>()     // Catch: java.lang.Throwable -> L174
                okhttp3.Cache$Companion r8 = okhttp3.Cache.Companion     // Catch: java.lang.Throwable -> L174
                int r8 = r8.readInt$okhttp(r5)     // Catch: java.lang.Throwable -> L174
                r9 = 0
            L37:
                if (r9 >= r8) goto L43
                java.lang.String r10 = r5.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L174
                r7.addLenient$okhttp(r10)     // Catch: java.lang.Throwable -> L174
                int r9 = r9 + 1
                goto L37
            L43:
                okhttp3.Headers r9 = r7.build()     // Catch: java.lang.Throwable -> L174
                r1.varyHeaders = r9     // Catch: java.lang.Throwable -> L174
                okhttp3.internal.http.StatusLine$Companion r9 = okhttp3.internal.http.StatusLine.Companion     // Catch: java.lang.Throwable -> L174
                java.lang.String r10 = r5.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L174
                okhttp3.internal.http.StatusLine r9 = r9.parse(r10)     // Catch: java.lang.Throwable -> L174
                okhttp3.Protocol r10 = r9.protocol     // Catch: java.lang.Throwable -> L174
                r1.protocol = r10     // Catch: java.lang.Throwable -> L174
                int r10 = r9.code     // Catch: java.lang.Throwable -> L174
                r1.code = r10     // Catch: java.lang.Throwable -> L174
                java.lang.String r10 = r9.message     // Catch: java.lang.Throwable -> L174
                r1.message = r10     // Catch: java.lang.Throwable -> L174
                okhttp3.Headers$Builder r10 = new okhttp3.Headers$Builder     // Catch: java.lang.Throwable -> L174
                r10.<init>()     // Catch: java.lang.Throwable -> L174
                okhttp3.Cache$Companion r11 = okhttp3.Cache.Companion     // Catch: java.lang.Throwable -> L174
                int r11 = r11.readInt$okhttp(r5)     // Catch: java.lang.Throwable -> L174
                r12 = 0
            L6b:
                if (r12 >= r11) goto L77
                java.lang.String r13 = r5.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L174
                r10.addLenient$okhttp(r13)     // Catch: java.lang.Throwable -> L174
                int r12 = r12 + 1
                goto L6b
            L77:
                java.lang.String r12 = okhttp3.Cache.Entry.SENT_MILLIS     // Catch: java.lang.Throwable -> L174
                java.lang.String r12 = r10.get(r12)     // Catch: java.lang.Throwable -> L174
                java.lang.String r13 = okhttp3.Cache.Entry.RECEIVED_MILLIS     // Catch: java.lang.Throwable -> L174
                java.lang.String r13 = r10.get(r13)     // Catch: java.lang.Throwable -> L174
                java.lang.String r14 = okhttp3.Cache.Entry.SENT_MILLIS     // Catch: java.lang.Throwable -> L174
                r10.removeAll(r14)     // Catch: java.lang.Throwable -> L174
                java.lang.String r14 = okhttp3.Cache.Entry.RECEIVED_MILLIS     // Catch: java.lang.Throwable -> L174
                r10.removeAll(r14)     // Catch: java.lang.Throwable -> L174
                if (r12 == 0) goto L96
                long r16 = java.lang.Long.parseLong(r12)     // Catch: java.lang.Throwable -> L174
                r14 = r16
                goto L98
            L96:
                r14 = 0
            L98:
                r1.sentRequestMillis = r14     // Catch: java.lang.Throwable -> L174
                if (r13 == 0) goto La1
                long r14 = java.lang.Long.parseLong(r13)     // Catch: java.lang.Throwable -> L174
                goto La3
            La1:
                r14 = 0
            La3:
                r1.receivedResponseMillis = r14     // Catch: java.lang.Throwable -> L174
                okhttp3.Headers r14 = r10.build()     // Catch: java.lang.Throwable -> L174
                r1.responseHeaders = r14     // Catch: java.lang.Throwable -> L174
                boolean r14 = r22.isHttps()     // Catch: java.lang.Throwable -> L174
                if (r14 == 0) goto L131
                java.lang.String r14 = r5.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L174
                r16 = r14
                java.lang.CharSequence r16 = (java.lang.CharSequence) r16     // Catch: java.lang.Throwable -> L174
                int r16 = r16.length()     // Catch: java.lang.Throwable -> L174
                if (r16 <= 0) goto Lc2
                r16 = 1
                goto Lc4
            Lc2:
                r16 = 0
            Lc4:
                if (r16 != 0) goto L10c
                java.lang.String r16 = r5.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L174
                r17 = r16
                okhttp3.CipherSuite$Companion r15 = okhttp3.CipherSuite.Companion     // Catch: java.lang.Throwable -> L174
                r18 = r0
                r0 = r17
                okhttp3.CipherSuite r15 = r15.forJavaName(r0)     // Catch: java.lang.Throwable -> L174
                java.util.List r17 = r1.readCertificateList(r5)     // Catch: java.lang.Throwable -> L174
                r19 = r17
                java.util.List r17 = r1.readCertificateList(r5)     // Catch: java.lang.Throwable -> L174
                r20 = r17
                boolean r17 = r5.exhausted()     // Catch: java.lang.Throwable -> L174
                if (r17 != 0) goto Lf5
                r17 = r0
                okhttp3.TlsVersion$Companion r0 = okhttp3.TlsVersion.Companion     // Catch: java.lang.Throwable -> L174
                java.lang.String r2 = r5.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L174
                okhttp3.TlsVersion r0 = r0.forJavaName(r2)     // Catch: java.lang.Throwable -> L174
                goto Lf9
            Lf5:
                r17 = r0
                okhttp3.TlsVersion r0 = okhttp3.TlsVersion.SSL_3_0     // Catch: java.lang.Throwable -> L174
            Lf9:
                okhttp3.Handshake$Companion r2 = okhttp3.Handshake.Companion     // Catch: java.lang.Throwable -> L174
                r21 = r4
                r4 = r19
                r19 = r5
                r5 = r20
                okhttp3.Handshake r2 = r2.get(r0, r15, r4, r5)     // Catch: java.lang.Throwable -> L174
                r1.handshake = r2     // Catch: java.lang.Throwable -> L174
                r0 = 0
                goto L13a
            L10c:
                r18 = r0
                r21 = r4
                r19 = r5
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L174
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L174
                r2.<init>()     // Catch: java.lang.Throwable -> L174
                java.lang.String r4 = "expected \"\" but was \""
                java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L174
                java.lang.StringBuilder r2 = r2.append(r14)     // Catch: java.lang.Throwable -> L174
                r4 = 34
                java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L174
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L174
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L174
                throw r0     // Catch: java.lang.Throwable -> L174
            L131:
                r18 = r0
                r21 = r4
                r19 = r5
                r0 = 0
                r1.handshake = r0     // Catch: java.lang.Throwable -> L174
            L13a:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L174
                kotlin.p001io.CloseableKt.closeFinally(r3, r0)
                return
            L141:
                r18 = r0
                r21 = r4
                r19 = r5
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L174
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L174
                r2.<init>()     // Catch: java.lang.Throwable -> L174
                java.lang.String r4 = "Cache corruption for "
                java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L174
                java.lang.StringBuilder r2 = r2.append(r6)     // Catch: java.lang.Throwable -> L174
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L174
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L174
                r2 = r0
                r4 = 0
                okhttp3.internal.platform.Platform$Companion r5 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L174
                okhttp3.internal.platform.Platform r5 = r5.get()     // Catch: java.lang.Throwable -> L174
                java.lang.String r7 = "cache corruption"
                r8 = r2
                java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch: java.lang.Throwable -> L174
                r9 = 5
                r5.log(r7, r9, r8)     // Catch: java.lang.Throwable -> L174
                java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L174
                throw r0     // Catch: java.lang.Throwable -> L174
            L174:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch: java.lang.Throwable -> L177
            L177:
                r0 = move-exception
                r4 = r0
                kotlin.p001io.CloseableKt.closeFinally(r3, r2)
                throw r4
        }

        private final boolean isHttps() {
                r2 = this;
                okhttp3.HttpUrl r0 = r2.url
                java.lang.String r0 = r0.scheme()
                java.lang.String r1 = "https"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                return r0
        }

        private final java.util.List<java.security.cert.Certificate> readCertificateList(okio.BufferedSource r9) throws java.io.IOException {
                r8 = this;
                okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
                int r0 = r0.readInt$okhttp(r9)
                r1 = -1
                if (r0 != r1) goto Le
                java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
                return r1
            Le:
                java.lang.String r1 = "X.509"
                java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch: java.security.cert.CertificateException -> L4c
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.security.cert.CertificateException -> L4c
                r2.<init>(r0)     // Catch: java.security.cert.CertificateException -> L4c
                r3 = 0
            L1b:
                if (r3 >= r0) goto L48
                java.lang.String r4 = r9.readUtf8LineStrict()     // Catch: java.security.cert.CertificateException -> L4c
                okio.Buffer r5 = new okio.Buffer     // Catch: java.security.cert.CertificateException -> L4c
                r5.<init>()     // Catch: java.security.cert.CertificateException -> L4c
                okio.ByteString$Companion r6 = okio.ByteString.Companion     // Catch: java.security.cert.CertificateException -> L4c
                okio.ByteString r6 = r6.decodeBase64(r4)     // Catch: java.security.cert.CertificateException -> L4c
                if (r6 == 0) goto L40
                r5.write(r6)     // Catch: java.security.cert.CertificateException -> L4c
                java.io.InputStream r7 = r5.inputStream()     // Catch: java.security.cert.CertificateException -> L4c
                java.security.cert.Certificate r7 = r1.generateCertificate(r7)     // Catch: java.security.cert.CertificateException -> L4c
                r2.add(r7)     // Catch: java.security.cert.CertificateException -> L4c
                int r3 = r3 + 1
                goto L1b
            L40:
                java.io.IOException r6 = new java.io.IOException     // Catch: java.security.cert.CertificateException -> L4c
                java.lang.String r7 = "Corrupt certificate in cache entry"
                r6.<init>(r7)     // Catch: java.security.cert.CertificateException -> L4c
                throw r6     // Catch: java.security.cert.CertificateException -> L4c
            L48:
                r3 = r2
                java.util.List r3 = (java.util.List) r3     // Catch: java.security.cert.CertificateException -> L4c
                return r3
            L4c:
                r1 = move-exception
                java.io.IOException r2 = new java.io.IOException
                java.lang.String r3 = r1.getMessage()
                r2.<init>(r3)
                throw r2
        }

        private final void writeCertList(okio.BufferedSink r11, java.util.List<? extends java.security.cert.Certificate> r12) throws java.io.IOException {
                r10 = this;
                int r0 = r12.size()     // Catch: java.security.cert.CertificateEncodingException -> L40
                long r0 = (long) r0     // Catch: java.security.cert.CertificateEncodingException -> L40
                okio.BufferedSink r0 = r11.writeDecimalLong(r0)     // Catch: java.security.cert.CertificateEncodingException -> L40
                r1 = 10
                r0.writeByte(r1)     // Catch: java.security.cert.CertificateEncodingException -> L40
                java.util.Iterator r0 = r12.iterator()     // Catch: java.security.cert.CertificateEncodingException -> L40
            L13:
                boolean r2 = r0.hasNext()     // Catch: java.security.cert.CertificateEncodingException -> L40
                if (r2 == 0) goto L3f
                java.lang.Object r2 = r0.next()     // Catch: java.security.cert.CertificateEncodingException -> L40
                java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2     // Catch: java.security.cert.CertificateEncodingException -> L40
                byte[] r3 = r2.getEncoded()     // Catch: java.security.cert.CertificateEncodingException -> L40
                okio.ByteString$Companion r4 = okio.ByteString.Companion     // Catch: java.security.cert.CertificateEncodingException -> L40
                java.lang.String r5 = "bytes"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)     // Catch: java.security.cert.CertificateEncodingException -> L40
                r8 = 3
                r9 = 0
                r6 = 0
                r7 = 0
                r5 = r3
                okio.ByteString r4 = okio.ByteString.Companion.of$default(r4, r5, r6, r7, r8, r9)     // Catch: java.security.cert.CertificateEncodingException -> L40
                java.lang.String r4 = r4.base64()     // Catch: java.security.cert.CertificateEncodingException -> L40
                okio.BufferedSink r5 = r11.writeUtf8(r4)     // Catch: java.security.cert.CertificateEncodingException -> L40
                r5.writeByte(r1)     // Catch: java.security.cert.CertificateEncodingException -> L40
                goto L13
            L3f:
                return
            L40:
                r0 = move-exception
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = r0.getMessage()
                r1.<init>(r2)
                throw r1
        }

        public final boolean matches(okhttp3.Request r3, okhttp3.Response r4) {
                r2 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okhttp3.HttpUrl r0 = r2.url
                okhttp3.HttpUrl r1 = r3.url()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L2e
                java.lang.String r0 = r2.requestMethod
                java.lang.String r1 = r3.method()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L2e
                okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
                okhttp3.Headers r1 = r2.varyHeaders
                boolean r0 = r0.varyMatches(r4, r1, r3)
                if (r0 == 0) goto L2e
                r0 = 1
                goto L2f
            L2e:
                r0 = 0
            L2f:
                return r0
        }

        public final okhttp3.Response response(okhttp3.internal.cache.DiskLruCache.Snapshot r7) {
                r6 = this;
                java.lang.String r0 = "snapshot"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                okhttp3.Headers r0 = r6.responseHeaders
                java.lang.String r1 = "Content-Type"
                java.lang.String r0 = r0.get(r1)
                okhttp3.Headers r1 = r6.responseHeaders
                java.lang.String r2 = "Content-Length"
                java.lang.String r1 = r1.get(r2)
                okhttp3.Request$Builder r2 = new okhttp3.Request$Builder
                r2.<init>()
                okhttp3.HttpUrl r3 = r6.url
                okhttp3.Request$Builder r2 = r2.url(r3)
                java.lang.String r3 = r6.requestMethod
                r4 = 0
                okhttp3.Request$Builder r2 = r2.method(r3, r4)
                okhttp3.Headers r3 = r6.varyHeaders
                okhttp3.Request$Builder r2 = r2.headers(r3)
                okhttp3.Request r2 = r2.build()
                okhttp3.Response$Builder r3 = new okhttp3.Response$Builder
                r3.<init>()
                okhttp3.Response$Builder r3 = r3.request(r2)
                okhttp3.Protocol r4 = r6.protocol
                okhttp3.Response$Builder r3 = r3.protocol(r4)
                int r4 = r6.code
                okhttp3.Response$Builder r3 = r3.code(r4)
                java.lang.String r4 = r6.message
                okhttp3.Response$Builder r3 = r3.message(r4)
                okhttp3.Headers r4 = r6.responseHeaders
                okhttp3.Response$Builder r3 = r3.headers(r4)
                okhttp3.Cache$CacheResponseBody r4 = new okhttp3.Cache$CacheResponseBody
                r4.<init>(r7, r0, r1)
                okhttp3.ResponseBody r4 = (okhttp3.ResponseBody) r4
                okhttp3.Response$Builder r3 = r3.body(r4)
                okhttp3.Handshake r4 = r6.handshake
                okhttp3.Response$Builder r3 = r3.handshake(r4)
                long r4 = r6.sentRequestMillis
                okhttp3.Response$Builder r3 = r3.sentRequestAtMillis(r4)
                long r4 = r6.receivedResponseMillis
                okhttp3.Response$Builder r3 = r3.receivedResponseAtMillis(r4)
                okhttp3.Response r3 = r3.build()
                return r3
        }

        public final void writeTo(okhttp3.internal.cache.DiskLruCache.Editor r10) throws java.io.IOException {
                r9 = this;
                java.lang.String r0 = "editor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                r0 = 0
                okio.Sink r0 = r10.newSink(r0)
                okio.BufferedSink r0 = okio.Okio.buffer(r0)
                java.io.Closeable r0 = (java.io.Closeable) r0
                r1 = r0
                okio.BufferedSink r1 = (okio.BufferedSink) r1     // Catch: java.lang.Throwable -> L11e
                r2 = 0
                okhttp3.HttpUrl r3 = r9.url     // Catch: java.lang.Throwable -> L11e
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r3 = r1.writeUtf8(r3)     // Catch: java.lang.Throwable -> L11e
                r4 = 10
                r3.writeByte(r4)     // Catch: java.lang.Throwable -> L11e
                java.lang.String r3 = r9.requestMethod     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r3 = r1.writeUtf8(r3)     // Catch: java.lang.Throwable -> L11e
                r3.writeByte(r4)     // Catch: java.lang.Throwable -> L11e
                okhttp3.Headers r3 = r9.varyHeaders     // Catch: java.lang.Throwable -> L11e
                int r3 = r3.size()     // Catch: java.lang.Throwable -> L11e
                long r5 = (long) r3     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r3 = r1.writeDecimalLong(r5)     // Catch: java.lang.Throwable -> L11e
                r3.writeByte(r4)     // Catch: java.lang.Throwable -> L11e
                r3 = 0
                okhttp3.Headers r5 = r9.varyHeaders     // Catch: java.lang.Throwable -> L11e
                int r5 = r5.size()     // Catch: java.lang.Throwable -> L11e
            L41:
                java.lang.String r6 = ": "
                if (r3 >= r5) goto L63
                okhttp3.Headers r7 = r9.varyHeaders     // Catch: java.lang.Throwable -> L11e
                java.lang.String r7 = r7.name(r3)     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r7 = r1.writeUtf8(r7)     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r6 = r7.writeUtf8(r6)     // Catch: java.lang.Throwable -> L11e
                okhttp3.Headers r7 = r9.varyHeaders     // Catch: java.lang.Throwable -> L11e
                java.lang.String r7 = r7.value(r3)     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r6 = r6.writeUtf8(r7)     // Catch: java.lang.Throwable -> L11e
                r6.writeByte(r4)     // Catch: java.lang.Throwable -> L11e
                int r3 = r3 + 1
                goto L41
            L63:
                okhttp3.internal.http.StatusLine r3 = new okhttp3.internal.http.StatusLine     // Catch: java.lang.Throwable -> L11e
                okhttp3.Protocol r5 = r9.protocol     // Catch: java.lang.Throwable -> L11e
                int r7 = r9.code     // Catch: java.lang.Throwable -> L11e
                java.lang.String r8 = r9.message     // Catch: java.lang.Throwable -> L11e
                r3.<init>(r5, r7, r8)     // Catch: java.lang.Throwable -> L11e
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r3 = r1.writeUtf8(r3)     // Catch: java.lang.Throwable -> L11e
                r3.writeByte(r4)     // Catch: java.lang.Throwable -> L11e
                okhttp3.Headers r3 = r9.responseHeaders     // Catch: java.lang.Throwable -> L11e
                int r3 = r3.size()     // Catch: java.lang.Throwable -> L11e
                int r3 = r3 + 2
                long r7 = (long) r3     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r3 = r1.writeDecimalLong(r7)     // Catch: java.lang.Throwable -> L11e
                r3.writeByte(r4)     // Catch: java.lang.Throwable -> L11e
                r3 = 0
                okhttp3.Headers r5 = r9.responseHeaders     // Catch: java.lang.Throwable -> L11e
                int r5 = r5.size()     // Catch: java.lang.Throwable -> L11e
            L90:
                if (r3 >= r5) goto Lb0
                okhttp3.Headers r7 = r9.responseHeaders     // Catch: java.lang.Throwable -> L11e
                java.lang.String r7 = r7.name(r3)     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r7 = r1.writeUtf8(r7)     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r7 = r7.writeUtf8(r6)     // Catch: java.lang.Throwable -> L11e
                okhttp3.Headers r8 = r9.responseHeaders     // Catch: java.lang.Throwable -> L11e
                java.lang.String r8 = r8.value(r3)     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r7 = r7.writeUtf8(r8)     // Catch: java.lang.Throwable -> L11e
                r7.writeByte(r4)     // Catch: java.lang.Throwable -> L11e
                int r3 = r3 + 1
                goto L90
            Lb0:
                java.lang.String r3 = okhttp3.Cache.Entry.SENT_MILLIS     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r3 = r1.writeUtf8(r3)     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r3 = r3.writeUtf8(r6)     // Catch: java.lang.Throwable -> L11e
                long r7 = r9.sentRequestMillis     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r3 = r3.writeDecimalLong(r7)     // Catch: java.lang.Throwable -> L11e
                r3.writeByte(r4)     // Catch: java.lang.Throwable -> L11e
                java.lang.String r3 = okhttp3.Cache.Entry.RECEIVED_MILLIS     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r3 = r1.writeUtf8(r3)     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r3 = r3.writeUtf8(r6)     // Catch: java.lang.Throwable -> L11e
                long r5 = r9.receivedResponseMillis     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r3 = r3.writeDecimalLong(r5)     // Catch: java.lang.Throwable -> L11e
                r3.writeByte(r4)     // Catch: java.lang.Throwable -> L11e
                boolean r3 = r9.isHttps()     // Catch: java.lang.Throwable -> L11e
                if (r3 == 0) goto L116
                r1.writeByte(r4)     // Catch: java.lang.Throwable -> L11e
                okhttp3.Handshake r3 = r9.handshake     // Catch: java.lang.Throwable -> L11e
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L11e
                okhttp3.CipherSuite r3 = r3.cipherSuite()     // Catch: java.lang.Throwable -> L11e
                java.lang.String r3 = r3.javaName()     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r3 = r1.writeUtf8(r3)     // Catch: java.lang.Throwable -> L11e
                r3.writeByte(r4)     // Catch: java.lang.Throwable -> L11e
                okhttp3.Handshake r3 = r9.handshake     // Catch: java.lang.Throwable -> L11e
                java.util.List r3 = r3.peerCertificates()     // Catch: java.lang.Throwable -> L11e
                r9.writeCertList(r1, r3)     // Catch: java.lang.Throwable -> L11e
                okhttp3.Handshake r3 = r9.handshake     // Catch: java.lang.Throwable -> L11e
                java.util.List r3 = r3.localCertificates()     // Catch: java.lang.Throwable -> L11e
                r9.writeCertList(r1, r3)     // Catch: java.lang.Throwable -> L11e
                okhttp3.Handshake r3 = r9.handshake     // Catch: java.lang.Throwable -> L11e
                okhttp3.TlsVersion r3 = r3.tlsVersion()     // Catch: java.lang.Throwable -> L11e
                java.lang.String r3 = r3.javaName()     // Catch: java.lang.Throwable -> L11e
                okio.BufferedSink r3 = r1.writeUtf8(r3)     // Catch: java.lang.Throwable -> L11e
                r3.writeByte(r4)     // Catch: java.lang.Throwable -> L11e
            L116:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L11e
                r1 = 0
                kotlin.p001io.CloseableKt.closeFinally(r0, r1)
                return
            L11e:
                r1 = move-exception
                throw r1     // Catch: java.lang.Throwable -> L120
            L120:
                r2 = move-exception
                kotlin.p001io.CloseableKt.closeFinally(r0, r1)
                throw r2
        }
    }

    /* JADX INFO: compiled from: Cache.kt */
    @kotlin.Metadata(m114d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0012\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m115d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "(Lokhttp3/Cache;Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "body", "Lokio/Sink;", "cacheOut", "done", "", "getDone", "()Z", "setDone", "(Z)V", "abort", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    private final class RealCacheRequest implements okhttp3.internal.cache.CacheRequest {
        private final okio.Sink body;
        private final okio.Sink cacheOut;
        private boolean done;
        private final okhttp3.internal.cache.DiskLruCache.Editor editor;
        final /* synthetic */ okhttp3.Cache this$0;


        public RealCacheRequest(okhttp3.Cache r4, okhttp3.internal.cache.DiskLruCache.Editor r5) {
                r3 = this;
                java.lang.String r0 = "editor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r3.this$0 = r4
                r3.<init>()
                r3.editor = r5
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r3.editor
                r1 = 1
                okio.Sink r0 = r0.newSink(r1)
                r3.cacheOut = r0
                okio.Sink r0 = r3.cacheOut
                okhttp3.Cache$RealCacheRequest$1 r1 = new okhttp3.Cache$RealCacheRequest$1
                okhttp3.Cache r2 = r3.this$0
                r1.<init>(r2, r3, r0)
                okio.Sink r1 = (okio.Sink) r1
                r3.body = r1
                return
        }

        public static final /* synthetic */ okhttp3.internal.cache.DiskLruCache.Editor access$getEditor$p(okhttp3.Cache.RealCacheRequest r1) {
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r1.editor
                return r0
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
                r5 = this;
                okhttp3.Cache r0 = r5.this$0
                okhttp3.Cache r1 = r5.this$0
                monitor-enter(r0)
                r2 = 0
                boolean r3 = r5.done     // Catch: java.lang.Throwable -> L28
                if (r3 == 0) goto Lc
                monitor-exit(r0)
                return
            Lc:
                r3 = 1
                r5.done = r3     // Catch: java.lang.Throwable -> L28
                int r4 = r1.getWriteAbortCount$okhttp()     // Catch: java.lang.Throwable -> L28
                int r4 = r4 + r3
                r1.setWriteAbortCount$okhttp(r4)     // Catch: java.lang.Throwable -> L28
                monitor-exit(r0)
                okio.Sink r0 = r5.cacheOut
                java.io.Closeable r0 = (java.io.Closeable) r0
                okhttp3.internal.Util.closeQuietly(r0)
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r5.editor     // Catch: java.io.IOException -> L26
                r0.abort()     // Catch: java.io.IOException -> L26
                goto L27
            L26:
                r0 = move-exception
            L27:
                return
            L28:
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

    /* JADX INFO: renamed from: okhttp3.Cache$urls$1 */
    /* JADX INFO: compiled from: Cache.kt */
    @kotlin.Metadata(m114d1 = {"\u0000'\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\t\u001a\u00020\u0004H\u0096\u0002J\t\u0010\n\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m115d2 = {"okhttp3/Cache$urls$1", "", "", "canRemove", "", "delegate", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "nextUrl", "hasNext", "next", "remove", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class C10281 implements java.util.Iterator<java.lang.String>, kotlin.jvm.internal.markers.KMutableIterator {
        private boolean canRemove;
        private final java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot> delegate;
        private java.lang.String nextUrl;

        C10281(okhttp3.Cache r2) {
                r1 = this;
                r1.<init>()
                okhttp3.internal.cache.DiskLruCache r0 = r2.getCache$okhttp()
                java.util.Iterator r0 = r0.snapshots()
                r1.delegate = r0
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r7 = this;
                java.lang.String r0 = r7.nextUrl
                r1 = 1
                if (r0 == 0) goto L6
                return r1
            L6:
                r0 = 0
                r7.canRemove = r0
            L9:
                java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r2 = r7.delegate
                boolean r2 = r2.hasNext()
                if (r2 == 0) goto L3b
            L12:
                java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r2 = r7.delegate     // Catch: java.io.IOException -> L39
                java.lang.Object r2 = r2.next()     // Catch: java.io.IOException -> L39
                java.io.Closeable r2 = (java.io.Closeable) r2     // Catch: java.io.IOException -> L39
                r3 = r2
                okhttp3.internal.cache.DiskLruCache$Snapshot r3 = (okhttp3.internal.cache.DiskLruCache.Snapshot) r3     // Catch: java.lang.Throwable -> L32
                r4 = 0
                okio.Source r5 = r3.getSource(r0)     // Catch: java.lang.Throwable -> L32
                okio.BufferedSource r5 = okio.Okio.buffer(r5)     // Catch: java.lang.Throwable -> L32
                java.lang.String r6 = r5.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L32
                r7.nextUrl = r6     // Catch: java.lang.Throwable -> L32
                r3 = 0
                kotlin.p001io.CloseableKt.closeFinally(r2, r3)     // Catch: java.io.IOException -> L39
                return r1
            L32:
                r3 = move-exception
                throw r3     // Catch: java.lang.Throwable -> L34
            L34:
                r4 = move-exception
                kotlin.p001io.CloseableKt.closeFinally(r2, r3)     // Catch: java.io.IOException -> L39
                throw r4     // Catch: java.io.IOException -> L39
            L39:
                r2 = move-exception
                goto L9
            L3b:
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
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r1 = 0
                r2.nextUrl = r1
                r1 = 1
                r2.canRemove = r1
                return r0
            L12:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.canRemove
                if (r0 == 0) goto La
                java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r0 = r2.delegate
                r0.remove()
                return
            La:
                r0 = 0
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "remove() before next()"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
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
            java.lang.String r0 = "directory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.internal.io.FileSystem r0 = okhttp3.internal.p003io.FileSystem.SYSTEM
            r1.<init>(r2, r3, r0)
            return
    }

    public Cache(java.io.File r10, long r11, okhttp3.internal.p003io.FileSystem r13) {
            r9 = this;
            java.lang.String r0 = "directory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r9.<init>()
            okhttp3.internal.cache.DiskLruCache r0 = new okhttp3.internal.cache.DiskLruCache
            okhttp3.internal.concurrent.TaskRunner r8 = okhttp3.internal.concurrent.TaskRunner.INSTANCE
            r4 = 201105(0x31191, float:2.81808E-40)
            r5 = 2
            r1 = r0
            r2 = r13
            r3 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6, r8)
            r9.cache = r0
            return
    }

    private final void abortQuietly(okhttp3.internal.cache.DiskLruCache.Editor r2) {
            r1 = this;
            if (r2 == 0) goto L8
            r2.abort()     // Catch: java.io.IOException -> L7
            goto L8
        L7:
            r0 = move-exception
        L8:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String key(okhttp3.HttpUrl r1) {
            okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
            java.lang.String r0 = r0.key(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "directory", imports = {}))
    /* JADX INFO: renamed from: -deprecated_directory, reason: not valid java name */
    public final java.io.File m10244deprecated_directory() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            java.io.File r0 = r0.getDirectory()
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.close()
            return
    }

    public final void delete() throws java.io.IOException {
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

    public final void evictAll() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.evictAll()
            return
    }

    @Override // java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.flush()
            return
    }

    public final okhttp3.Response get$okhttp(okhttp3.Request r7) {
            r6 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
            okhttp3.HttpUrl r1 = r7.url()
            java.lang.String r0 = r0.key(r1)
            r1 = 0
            okhttp3.internal.cache.DiskLruCache r2 = r6.cache     // Catch: java.io.IOException -> L46
            okhttp3.internal.cache.DiskLruCache$Snapshot r2 = r2.get(r0)     // Catch: java.io.IOException -> L46
            if (r2 != 0) goto L1a
            return r1
        L1a:
            okhttp3.Cache$Entry r3 = new okhttp3.Cache$Entry     // Catch: java.io.IOException -> L3e
            r4 = 0
            okio.Source r4 = r2.getSource(r4)     // Catch: java.io.IOException -> L3e
            r3.<init>(r4)     // Catch: java.io.IOException -> L3e
            okhttp3.Response r4 = r3.response(r2)
            boolean r5 = r3.matches(r7, r4)
            if (r5 != 0) goto L3d
            okhttp3.ResponseBody r5 = r4.body()
            if (r5 == 0) goto L3c
            java.io.Closeable r5 = (java.io.Closeable) r5
            okhttp3.internal.Util.closeQuietly(r5)
        L3c:
            return r1
        L3d:
            return r4
        L3e:
            r3 = move-exception
            r4 = r2
            java.io.Closeable r4 = (java.io.Closeable) r4
            okhttp3.internal.Util.closeQuietly(r4)
            return r1
        L46:
            r2 = move-exception
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

    public final void initialize() throws java.io.IOException {
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

    public final okhttp3.internal.cache.CacheRequest put$okhttp(okhttp3.Response r11) {
            r10 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            okhttp3.Request r0 = r11.request()
            java.lang.String r0 = r0.method()
            okhttp3.internal.http.HttpMethod r1 = okhttp3.internal.http.HttpMethod.INSTANCE
            okhttp3.Request r2 = r11.request()
            java.lang.String r2 = r2.method()
            boolean r1 = r1.invalidatesCache(r2)
            r2 = 0
            if (r1 == 0) goto L29
        L1f:
            okhttp3.Request r1 = r11.request()     // Catch: java.io.IOException -> L27
            r10.remove$okhttp(r1)     // Catch: java.io.IOException -> L27
            goto L28
        L27:
            r1 = move-exception
        L28:
            return r2
        L29:
            java.lang.String r1 = "GET"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r1 != 0) goto L32
            return r2
        L32:
            okhttp3.Cache$Companion r1 = okhttp3.Cache.Companion
            boolean r1 = r1.hasVaryAll(r11)
            if (r1 == 0) goto L3b
            return r2
        L3b:
            okhttp3.Cache$Entry r1 = new okhttp3.Cache$Entry
            r1.<init>(r11)
            r3 = 0
            okhttp3.internal.cache.DiskLruCache r4 = r10.cache     // Catch: java.io.IOException -> L69
            okhttp3.Cache$Companion r5 = okhttp3.Cache.Companion     // Catch: java.io.IOException -> L69
            okhttp3.Request r6 = r11.request()     // Catch: java.io.IOException -> L69
            okhttp3.HttpUrl r6 = r6.url()     // Catch: java.io.IOException -> L69
            java.lang.String r5 = r5.key(r6)     // Catch: java.io.IOException -> L69
            r8 = 2
            r9 = 0
            r6 = 0
            okhttp3.internal.cache.DiskLruCache$Editor r4 = okhttp3.internal.cache.DiskLruCache.edit$default(r4, r5, r6, r8, r9)     // Catch: java.io.IOException -> L69
            if (r4 != 0) goto L5d
            return r2
        L5d:
            r3 = r4
            r1.writeTo(r3)     // Catch: java.io.IOException -> L69
            okhttp3.Cache$RealCacheRequest r4 = new okhttp3.Cache$RealCacheRequest     // Catch: java.io.IOException -> L69
            r4.<init>(r10, r3)     // Catch: java.io.IOException -> L69
            okhttp3.internal.cache.CacheRequest r4 = (okhttp3.internal.cache.CacheRequest) r4     // Catch: java.io.IOException -> L69
            return r4
        L69:
            r4 = move-exception
            r10.abortQuietly(r3)
            return r2
    }

    public final void remove$okhttp(okhttp3.Request r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okhttp3.internal.cache.DiskLruCache r0 = r3.cache
            okhttp3.Cache$Companion r1 = okhttp3.Cache.Companion
            okhttp3.HttpUrl r2 = r4.url()
            java.lang.String r1 = r1.key(r2)
            r0.remove(r1)
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

    public final long size() throws java.io.IOException {
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
            java.lang.String r0 = "cacheStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> L27
            int r0 = r1.requestCount     // Catch: java.lang.Throwable -> L27
            int r0 = r0 + 1
            r1.requestCount = r0     // Catch: java.lang.Throwable -> L27
            okhttp3.Request r0 = r2.getNetworkRequest()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L19
            int r0 = r1.networkCount     // Catch: java.lang.Throwable -> L27
            int r0 = r0 + 1
            r1.networkCount = r0     // Catch: java.lang.Throwable -> L27
            goto L25
        L19:
            okhttp3.Response r0 = r2.getCacheResponse()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L25
            int r0 = r1.hitCount     // Catch: java.lang.Throwable -> L27
            int r0 = r0 + 1
            r1.hitCount = r0     // Catch: java.lang.Throwable -> L27
        L25:
            monitor-exit(r1)
            return
        L27:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
    }

    public final void update$okhttp(okhttp3.Response r5, okhttp3.Response r6) {
            r4 = this;
            java.lang.String r0 = "cached"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "network"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okhttp3.Cache$Entry r0 = new okhttp3.Cache$Entry
            r0.<init>(r6)
            okhttp3.ResponseBody r1 = r5.body()
            java.lang.String r2 = "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            okhttp3.Cache$CacheResponseBody r1 = (okhttp3.Cache.CacheResponseBody) r1
            okhttp3.internal.cache.DiskLruCache$Snapshot r1 = r1.getSnapshot()
            r2 = 0
            okhttp3.internal.cache.DiskLruCache$Editor r3 = r1.edit()     // Catch: java.io.IOException -> L2f
            if (r3 != 0) goto L27
            return
        L27:
            r2 = r3
            r0.writeTo(r2)     // Catch: java.io.IOException -> L2f
            r2.commit()     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r3 = move-exception
            r4.abortQuietly(r2)
        L33:
            return
    }

    public final java.util.Iterator<java.lang.String> urls() throws java.io.IOException {
            r1 = this;
            okhttp3.Cache$urls$1 r0 = new okhttp3.Cache$urls$1
            r0.<init>(r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
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
