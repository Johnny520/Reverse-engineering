package okhttp3.internal.http;

import java.net.Proxy;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RequestLine {
    public static final RequestLine INSTANCE = new RequestLine();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private RequestLine() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean includeAuthorityInRequestLine(Request request, Proxy.Type type) {
        return !request.isHttps() && type == Proxy.Type.HTTP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String get(Request request, Proxy.Type type) {
        request.getClass();
        type.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.method());
        sb2.append(' ');
        RequestLine requestLine = INSTANCE;
        if (requestLine.includeAuthorityInRequestLine(request, type)) {
            sb2.append(request.url());
        } else {
            sb2.append(requestLine.requestPath(request.url()));
        }
        sb2.append(" HTTP/1.1");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String requestPath(HttpUrl httpUrl) {
        httpUrl.getClass();
        String strEncodedPath = httpUrl.encodedPath();
        String strEncodedQuery = httpUrl.encodedQuery();
        if (strEncodedQuery == null) {
            return strEncodedPath;
        }
        return strEncodedPath + '?' + strEncodedQuery;
    }
}
