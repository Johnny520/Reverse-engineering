package okhttp3.internal.http;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007¨\u0006\u000e"}, m16758d2 = {"Lokhttp3/internal/http/HttpMethod;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "invalidatesCache", _UrlKt.FRAGMENT_ENCODE_SET, "method", _UrlKt.FRAGMENT_ENCODE_SET, "requiresRequestBody", "permitsRequestBody", "redirectsWithBody", "redirectsToGet", "isCacheable", "requestMethod", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean invalidatesCache(String method) {
        method.getClass();
        return AbstractC1061t.m3842c(method, "POST") || AbstractC1061t.m3842c(method, "PATCH") || AbstractC1061t.m3842c(method, "PUT") || AbstractC1061t.m3842c(method, "DELETE") || AbstractC1061t.m3842c(method, "MOVE");
    }

    public static final boolean permitsRequestBody(String method) {
        method.getClass();
        return (AbstractC1061t.m3842c(method, "GET") || AbstractC1061t.m3842c(method, "HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String method) {
        method.getClass();
        return AbstractC1061t.m3842c(method, "POST") || AbstractC1061t.m3842c(method, "PUT") || AbstractC1061t.m3842c(method, "PATCH") || AbstractC1061t.m3842c(method, "PROPPATCH") || AbstractC1061t.m3842c(method, "QUERY") || AbstractC1061t.m3842c(method, "REPORT");
    }

    public final boolean isCacheable(String requestMethod) {
        requestMethod.getClass();
        return AbstractC1061t.m3842c(requestMethod, "GET") || AbstractC1061t.m3842c(requestMethod, "QUERY");
    }

    public final boolean redirectsToGet(String method) {
        method.getClass();
        return !AbstractC1061t.m3842c(method, "PROPFIND");
    }

    public final boolean redirectsWithBody(String method) {
        method.getClass();
        return AbstractC1061t.m3842c(method, "PROPFIND");
    }
}
