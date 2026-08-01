package okhttp3.internal;

import java.nio.charset.Charset;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.Cache;
import okhttp3.CipherSuite;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.ConnectionListener;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.url._UrlKt;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p299ub.C8614c;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u008e\u0001\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0015\u001a!\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\nH\u0000¢\u0006\u0004\b#\u0010$\u001a'\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040%*\u00020\u001d2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040%H\u0000¢\u0006\u0004\b'\u0010(\u001a#\u0010,\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0006\u0012\u0004\u0018\u00010)0**\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b,\u0010-\u001a\u0015\u0010.\u001a\u00020+*\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b.\u0010/\u001a\u001b\u00103\u001a\u000200*\u0002002\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104\u001a\u001f\u00108\u001a\u0002072\u0006\u00106\u001a\u0002052\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b8\u00109\"\u0018\u0010=\u001a\u00020:*\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, m16758d2 = {_UrlKt.FRAGMENT_ENCODE_SET, "currentTimeMillis", "Lokhttp3/HttpUrl;", "url", _UrlKt.FRAGMENT_ENCODE_SET, "setCookie", "Lokhttp3/Cookie;", "parseCookie", "(JLokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "cookie", _UrlKt.FRAGMENT_ENCODE_SET, "forObsoleteRfc2965", "cookieToString", "(Lokhttp3/Cookie;Z)Ljava/lang/String;", "Lokhttp3/Headers$Builder;", "builder", "line", "addHeaderLenient", "(Lokhttp3/Headers$Builder;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "name", "value", "(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "Lokhttp3/Cache;", "cache", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "cacheGet", "(Lokhttp3/Cache;Lokhttp3/Request;)Lokhttp3/Response;", "Lokhttp3/ConnectionSpec;", "connectionSpec", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "Ll8/i0;", "applyConnectionSpec", "(Lokhttp3/ConnectionSpec;Ljavax/net/ssl/SSLSocket;Z)V", _UrlKt.FRAGMENT_ENCODE_SET, "socketEnabledCipherSuites", "effectiveCipherSuites", "(Lokhttp3/ConnectionSpec;[Ljava/lang/String;)[Ljava/lang/String;", "Lokhttp3/MediaType;", "Ll8/r;", "Ljava/nio/charset/Charset;", "chooseCharset", "(Lokhttp3/MediaType;)Ll8/r;", "charsetOrUtf8", "(Lokhttp3/MediaType;)Ljava/nio/charset/Charset;", "Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "taskRunnerInternal", "(Lokhttp3/OkHttpClient$Builder;Lokhttp3/internal/concurrent/TaskRunner;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/internal/connection/ConnectionListener;", "connectionListener", "Lokhttp3/ConnectionPool;", "buildConnectionPool", "(Lokhttp3/internal/connection/ConnectionListener;Lokhttp3/internal/concurrent/TaskRunner;)Lokhttp3/ConnectionPool;", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "(Lokhttp3/Response;)Lokhttp3/internal/connection/RealConnection;", "connection", "okhttp"}, m16759k = 2, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str, String str2) {
        builder.getClass();
        str.getClass();
        str2.getClass();
        return builder.addLenient$okhttp(str, str2);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z10) {
        connectionSpec.getClass();
        sSLSocket.getClass();
        connectionSpec.apply$okhttp(sSLSocket, z10);
    }

    public static final ConnectionPool buildConnectionPool(ConnectionListener connectionListener, TaskRunner taskRunner) {
        connectionListener.getClass();
        taskRunner.getClass();
        return new ConnectionPool(0, 0L, null, taskRunner, connectionListener, 7, null);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        cache.getClass();
        request.getClass();
        return cache.get$okhttp(request);
    }

    public static final Charset charsetOrUtf8(MediaType mediaType) {
        Charset charsetCharset$default;
        return (mediaType == null || (charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null)) == null) ? C8614c.f28652b : charsetCharset$default;
    }

    public static final C4711r chooseCharset(MediaType mediaType) {
        Charset charset = C8614c.f28652b;
        if (mediaType != null) {
            Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
            if (charsetCharset$default == null) {
                mediaType = MediaType.INSTANCE.parse(mediaType + "; charset=utf-8");
            } else {
                charset = charsetCharset$default;
            }
        }
        return AbstractC4717x.m18815a(charset, mediaType);
    }

    public static final String cookieToString(Cookie cookie, boolean z10) {
        cookie.getClass();
        return cookie.toString$okhttp(z10);
    }

    public static final String[] effectiveCipherSuites(ConnectionSpec connectionSpec, String[] strArr) {
        connectionSpec.getClass();
        strArr.getClass();
        return connectionSpec.getCipherSuitesAsString() != null ? _UtilCommonKt.intersect(connectionSpec.getCipherSuitesAsString(), strArr, CipherSuite.INSTANCE.getORDER_BY_NAME$okhttp()) : strArr;
    }

    public static final RealConnection getConnection(Response response) {
        response.getClass();
        Exchange exchange = response.getExchange();
        exchange.getClass();
        return exchange.getConnection$okhttp();
    }

    public static final Cookie parseCookie(long j10, HttpUrl httpUrl, String str) {
        httpUrl.getClass();
        str.getClass();
        return Cookie.INSTANCE.parse$okhttp(j10, httpUrl, str);
    }

    public static final OkHttpClient.Builder taskRunnerInternal(OkHttpClient.Builder builder, TaskRunner taskRunner) {
        builder.getClass();
        taskRunner.getClass();
        return builder.taskRunner$okhttp(taskRunner);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str) {
        builder.getClass();
        str.getClass();
        return builder.addLenient$okhttp(str);
    }
}
