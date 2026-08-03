package okhttp3.internal;

import javax.net.ssl.SSLSocket;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Internal {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str, String str2) {
        builder.getClass();
        str.getClass();
        str2.getClass();
        return builder.addLenient$okhttp(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z9) {
        connectionSpec.getClass();
        sSLSocket.getClass();
        connectionSpec.apply$okhttp(sSLSocket, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Response cacheGet(Cache cache, Request request) {
        cache.getClass();
        request.getClass();
        return cache.get$okhttp(request);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String cookieToString(Cookie cookie, boolean z9) {
        cookie.getClass();
        return cookie.toString$okhttp(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Cookie parseCookie(long j3, HttpUrl httpUrl, String str) {
        httpUrl.getClass();
        str.getClass();
        return Cookie.Companion.parse$okhttp(j3, httpUrl, str);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str) {
        builder.getClass();
        str.getClass();
        return builder.addLenient$okhttp(str);
    }
}
