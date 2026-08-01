package okhttp3.internal.http;

/* JADX INFO: compiled from: RequestLine.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, m115d2 = {"Lokhttp3/internal/http/RequestLine;", "", "()V", "get", "", "request", "Lokhttp3/Request;", "proxyType", "Ljava/net/Proxy$Type;", "includeAuthorityInRequestLine", "", "requestPath", "url", "Lokhttp3/HttpUrl;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

    private final boolean includeAuthorityInRequestLine(okhttp3.Request r2, java.net.Proxy.Type r3) {
            r1 = this;
            boolean r0 = r2.isHttps()
            if (r0 != 0) goto Lc
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r3 != r0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public final java.lang.String get(okhttp3.Request r6, java.net.Proxy.Type r7) {
            r5 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "proxyType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            java.lang.String r3 = r6.method()
            r1.append(r3)
            r3 = 32
            r1.append(r3)
            okhttp3.internal.http.RequestLine r3 = okhttp3.internal.http.RequestLine.INSTANCE
            boolean r3 = r3.includeAuthorityInRequestLine(r6, r7)
            if (r3 == 0) goto L2d
            okhttp3.HttpUrl r3 = r6.url()
            r1.append(r3)
            goto L3a
        L2d:
            okhttp3.internal.http.RequestLine r3 = okhttp3.internal.http.RequestLine.INSTANCE
            okhttp3.HttpUrl r4 = r6.url()
            java.lang.String r3 = r3.requestPath(r4)
            r1.append(r3)
        L3a:
            java.lang.String r3 = " HTTP/1.1"
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final java.lang.String requestPath(okhttp3.HttpUrl r5) {
            r4 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = r5.encodedPath()
            java.lang.String r1 = r5.encodedQuery()
            if (r1 == 0) goto L27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            r3 = 63
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            goto L28
        L27:
            r2 = r0
        L28:
            return r2
    }
}
