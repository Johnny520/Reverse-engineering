package okhttp3.internal.http;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class BridgeInterceptor implements okhttp3.Interceptor {
    private final okhttp3.CookieJar cookieJar;

    public BridgeInterceptor(okhttp3.CookieJar r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.cookieJar = r1
            return
    }

    private final java.lang.String cookieHeader(java.util.List<okhttp3.Cookie> r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        La:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r5.next()
            int r3 = r1 + 1
            if (r1 < 0) goto L36
            okhttp3.Cookie r2 = (okhttp3.Cookie) r2
            if (r1 <= 0) goto L21
            java.lang.String r1 = "; "
            r0.append(r1)
        L21:
            java.lang.String r1 = r2.name()
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.String r1 = r2.value()
            r0.append(r1)
            r1 = r3
            goto La
        L36:
            a.a.Q0()
            r5 = 0
            throw r5
        L3b:
            java.lang.String r5 = r0.toString()
            return r5
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r13) {
            r12 = this;
            r13.getClass()
            okhttp3.Request r0 = r13.request()
            okhttp3.Request$Builder r1 = r0.newBuilder()
            okhttp3.RequestBody r2 = r0.body()
            r3 = -1
            java.lang.String r5 = "Content-Type"
            java.lang.String r6 = "Content-Length"
            if (r2 == 0) goto L41
            okhttp3.MediaType r7 = r2.contentType()
            if (r7 == 0) goto L24
            java.lang.String r7 = r7.toString()
            r1.header(r5, r7)
        L24:
            long r7 = r2.contentLength()
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            java.lang.String r9 = "Transfer-Encoding"
            if (r2 == 0) goto L39
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r1.header(r6, r2)
            r1.removeHeader(r9)
            goto L41
        L39:
            java.lang.String r2 = "chunked"
            r1.header(r9, r2)
            r1.removeHeader(r6)
        L41:
            java.lang.String r2 = "Host"
            java.lang.String r7 = r0.header(r2)
            r8 = 1
            r9 = 0
            r10 = 0
            if (r7 != 0) goto L57
            okhttp3.HttpUrl r7 = r0.url()
            java.lang.String r7 = okhttp3.internal.Util.toHostHeader$default(r7, r9, r8, r10)
            r1.header(r2, r7)
        L57:
            java.lang.String r2 = "Connection"
            java.lang.String r7 = r0.header(r2)
            if (r7 != 0) goto L64
            java.lang.String r7 = "Keep-Alive"
            r1.header(r2, r7)
        L64:
            java.lang.String r2 = "Accept-Encoding"
            java.lang.String r7 = r0.header(r2)
            java.lang.String r11 = "gzip"
            if (r7 != 0) goto L7a
            java.lang.String r7 = "Range"
            java.lang.String r7 = r0.header(r7)
            if (r7 != 0) goto L7a
            r1.header(r2, r11)
            goto L7b
        L7a:
            r8 = r9
        L7b:
            okhttp3.CookieJar r2 = r12.cookieJar
            okhttp3.HttpUrl r7 = r0.url()
            java.util.List r2 = r2.loadForRequest(r7)
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto L94
            java.lang.String r7 = "Cookie"
            java.lang.String r2 = r12.cookieHeader(r2)
            r1.header(r7, r2)
        L94:
            java.lang.String r2 = "User-Agent"
            java.lang.String r7 = r0.header(r2)
            if (r7 != 0) goto La1
            java.lang.String r7 = "okhttp/4.12.0"
            r1.header(r2, r7)
        La1:
            okhttp3.Request r1 = r1.build()
            okhttp3.Response r13 = r13.proceed(r1)
            okhttp3.CookieJar r1 = r12.cookieJar
            okhttp3.HttpUrl r2 = r0.url()
            okhttp3.Headers r7 = r13.headers()
            okhttp3.internal.http.HttpHeaders.receiveHeaders(r1, r2, r7)
            okhttp3.Response$Builder r1 = r13.newBuilder()
            okhttp3.Response$Builder r0 = r1.request(r0)
            if (r8 == 0) goto L109
            java.lang.String r1 = "Content-Encoding"
            r2 = 2
            java.lang.String r7 = okhttp3.Response.header$default(r13, r1, r10, r2, r10)
            boolean r7 = r11.equalsIgnoreCase(r7)
            if (r7 == 0) goto L109
            boolean r7 = okhttp3.internal.http.HttpHeaders.promisesBody(r13)
            if (r7 == 0) goto L109
            okhttp3.ResponseBody r7 = r13.body()
            if (r7 == 0) goto L109
            okio.GzipSource r8 = new okio.GzipSource
            okio.BufferedSource r7 = r7.source()
            r8.<init>(r7)
            okhttp3.Headers r7 = r13.headers()
            okhttp3.Headers$Builder r7 = r7.newBuilder()
            okhttp3.Headers$Builder r1 = r7.removeAll(r1)
            okhttp3.Headers$Builder r1 = r1.removeAll(r6)
            okhttp3.Headers r1 = r1.build()
            r0.headers(r1)
            java.lang.String r13 = okhttp3.Response.header$default(r13, r5, r10, r2, r10)
            okhttp3.internal.http.RealResponseBody r1 = new okhttp3.internal.http.RealResponseBody
            okio.BufferedSource r2 = okio.Okio.buffer(r8)
            r1.<init>(r13, r3, r2)
            r0.body(r1)
        L109:
            okhttp3.Response r13 = r0.build()
            return r13
    }
}
