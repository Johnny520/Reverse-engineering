package okhttp3.internal.http;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RequestLine {
    public static final okhttp3.internal.http.RequestLine INSTANCE = null;

    static {
            okhttp3.internal.http.RequestLine r0 = new okhttp3.internal.http.RequestLine
            r0.<init>()
            okhttp3.internal.http.RequestLine.INSTANCE = r0
            return
    }

    private RequestLine() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean includeAuthorityInRequestLine(okhttp3.Request r1, java.net.Proxy.Type r2) {
            r0 = this;
            boolean r1 = r1.isHttps()
            if (r1 != 0) goto Lc
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r2 != r1) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public final java.lang.String get(okhttp3.Request r3, java.net.Proxy.Type r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.method()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            okhttp3.internal.http.RequestLine r1 = okhttp3.internal.http.RequestLine.INSTANCE
            boolean r4 = r1.includeAuthorityInRequestLine(r3, r4)
            if (r4 == 0) goto L27
            okhttp3.HttpUrl r3 = r3.url()
            r0.append(r3)
            goto L32
        L27:
            okhttp3.HttpUrl r3 = r3.url()
            java.lang.String r3 = r1.requestPath(r3)
            r0.append(r3)
        L32:
            java.lang.String r3 = " HTTP/1.1"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public final java.lang.String requestPath(okhttp3.HttpUrl r3) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = r3.encodedPath()
            java.lang.String r3 = r3.encodedQuery()
            if (r3 == 0) goto L22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r0 = 63
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
        L22:
            return r0
    }
}
