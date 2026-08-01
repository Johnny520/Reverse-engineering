package okhttp3.internal.http;

/* JADX INFO: compiled from: BridgeInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m115d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "cookieJar", "Lokhttp3/CookieJar;", "(Lokhttp3/CookieJar;)V", "cookieHeader", "", "cookies", "", "Lokhttp3/Cookie;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class BridgeInterceptor implements okhttp3.Interceptor {
    private final okhttp3.CookieJar cookieJar;

    public BridgeInterceptor(okhttp3.CookieJar r2) {
            r1 = this;
            java.lang.String r0 = "cookieJar"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.cookieJar = r2
            return
    }

    private final java.lang.String cookieHeader(java.util.List<okhttp3.Cookie> r14) {
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            r3 = r14
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 0
            r5 = 0
            java.util.Iterator r6 = r3.iterator()
        L10:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L44
            java.lang.Object r7 = r6.next()
            int r8 = r5 + 1
            if (r5 >= 0) goto L21
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L21:
            r9 = r7
            okhttp3.Cookie r9 = (okhttp3.Cookie) r9
            r10 = 0
            if (r5 <= 0) goto L2c
            java.lang.String r11 = "; "
            r1.append(r11)
        L2c:
            java.lang.String r11 = r9.name()
            java.lang.StringBuilder r11 = r1.append(r11)
            r12 = 61
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = r9.value()
            r11.append(r12)
            r5 = r8
            goto L10
        L44:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r17) throws java.io.IOException {
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            okhttp3.Request r2 = r17.request()
            okhttp3.Request$Builder r3 = r2.newBuilder()
            okhttp3.RequestBody r4 = r2.body()
            java.lang.String r5 = "Content-Type"
            r6 = -1
            java.lang.String r8 = "Content-Length"
            if (r4 == 0) goto L47
            okhttp3.MediaType r9 = r4.contentType()
            if (r9 == 0) goto L2a
            java.lang.String r10 = r9.toString()
            r3.header(r5, r10)
        L2a:
            long r10 = r4.contentLength()
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            java.lang.String r13 = "Transfer-Encoding"
            if (r12 == 0) goto L3f
            java.lang.String r12 = java.lang.String.valueOf(r10)
            r3.header(r8, r12)
            r3.removeHeader(r13)
            goto L47
        L3f:
            java.lang.String r12 = "chunked"
            r3.header(r13, r12)
            r3.removeHeader(r8)
        L47:
            java.lang.String r9 = "Host"
            java.lang.String r10 = r2.header(r9)
            r11 = 1
            r12 = 0
            if (r10 != 0) goto L5d
            okhttp3.HttpUrl r10 = r2.url()
            r13 = 0
            java.lang.String r10 = okhttp3.internal.Util.toHostHeader$default(r10, r13, r11, r12)
            r3.header(r9, r10)
        L5d:
            java.lang.String r9 = "Connection"
            java.lang.String r10 = r2.header(r9)
            if (r10 != 0) goto L6a
            java.lang.String r10 = "Keep-Alive"
            r3.header(r9, r10)
        L6a:
            r9 = 0
            java.lang.String r10 = "Accept-Encoding"
            java.lang.String r13 = r2.header(r10)
            java.lang.String r14 = "gzip"
            if (r13 != 0) goto L81
            java.lang.String r13 = "Range"
            java.lang.String r13 = r2.header(r13)
            if (r13 != 0) goto L81
            r9 = 1
            r3.header(r10, r14)
        L81:
            okhttp3.CookieJar r10 = r0.cookieJar
            okhttp3.HttpUrl r13 = r2.url()
            java.util.List r10 = r10.loadForRequest(r13)
            r13 = r10
            java.util.Collection r13 = (java.util.Collection) r13
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L9d
            java.lang.String r13 = "Cookie"
            java.lang.String r15 = r0.cookieHeader(r10)
            r3.header(r13, r15)
        L9d:
            java.lang.String r13 = "User-Agent"
            java.lang.String r15 = r2.header(r13)
            if (r15 != 0) goto Laa
            java.lang.String r15 = "okhttp/4.12.0"
            r3.header(r13, r15)
        Laa:
            okhttp3.Request r13 = r3.build()
            okhttp3.Response r13 = r1.proceed(r13)
            okhttp3.CookieJar r15 = r0.cookieJar
            okhttp3.HttpUrl r6 = r2.url()
            okhttp3.Headers r7 = r13.headers()
            okhttp3.internal.http.HttpHeaders.receiveHeaders(r15, r6, r7)
            okhttp3.Response$Builder r6 = r13.newBuilder()
            okhttp3.Response$Builder r6 = r6.request(r2)
            if (r9 == 0) goto L11d
            java.lang.String r7 = "Content-Encoding"
            r15 = 2
            java.lang.String r0 = okhttp3.Response.header$default(r13, r7, r12, r15, r12)
            boolean r0 = kotlin.text.StringsKt.equals(r14, r0, r11)
            if (r0 == 0) goto L11d
            boolean r0 = okhttp3.internal.http.HttpHeaders.promisesBody(r13)
            if (r0 == 0) goto L11d
            okhttp3.ResponseBody r0 = r13.body()
            if (r0 == 0) goto L11d
            okio.GzipSource r11 = new okio.GzipSource
            okio.BufferedSource r14 = r0.source()
            okio.Source r14 = (okio.Source) r14
            r11.<init>(r14)
            okhttp3.Headers r14 = r13.headers()
            okhttp3.Headers$Builder r14 = r14.newBuilder()
            okhttp3.Headers$Builder r7 = r14.removeAll(r7)
            okhttp3.Headers$Builder r7 = r7.removeAll(r8)
            okhttp3.Headers r7 = r7.build()
            r6.headers(r7)
            java.lang.String r5 = okhttp3.Response.header$default(r13, r5, r12, r15, r12)
            okhttp3.internal.http.RealResponseBody r8 = new okhttp3.internal.http.RealResponseBody
            r12 = r11
            okio.Source r12 = (okio.Source) r12
            okio.BufferedSource r12 = okio.Okio.buffer(r12)
            r14 = -1
            r8.<init>(r5, r14, r12)
            okhttp3.ResponseBody r8 = (okhttp3.ResponseBody) r8
            r6.body(r8)
        L11d:
            okhttp3.Response r0 = r6.build()
            return r0
    }
}
