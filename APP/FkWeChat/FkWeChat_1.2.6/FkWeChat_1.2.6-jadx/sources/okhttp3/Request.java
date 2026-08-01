package okhttp3;

import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.EmptyTags;
import okhttp3.internal.IsProbablyUtf8Kt;
import okhttp3.internal.Tags;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.GzipRequestBody;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p098g9.InterfaceC2549c;
import p172l8.C4711r;
import p172l8.InterfaceC4691e;
import p185m8.AbstractC5114x;
import p215oc.C5725t;
import p299ub.AbstractC8611a0;
import p372z8.AbstractC9886a;
import p376zd.C10010p0;
import p376zd.C9987e;
import p376zd.C9995i;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001?B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0004\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0010J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\t\u0010\u0014J\u001e\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0015\u0018\u0001*\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0015*\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u0018\u0010\u001bJ\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0018\u0010\u0017J%\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00152\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u0018\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b$\u0010%J\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010+\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010#J\u0019\u0010/\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b/\u00100R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b\u0007\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b\u000b\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b\t\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b\r\u0010'R\u0019\u00105\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b5\u0010!R\u001a\u00107\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010+\u001a\u00020(8G¢\u0006\u0006\u001a\u0004\b+\u0010*¨\u0006@"}, m16758d2 = {"Lokhttp3/Request;", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Request$Builder;", "builder", "<init>", "(Lokhttp3/Request$Builder;)V", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Headers;", "headers", _UrlKt.FRAGMENT_ENCODE_SET, "method", "Lokhttp3/RequestBody;", "body", "(Lokhttp3/HttpUrl;Lokhttp3/Headers;Ljava/lang/String;Lokhttp3/RequestBody;)V", "shellEscape", "(Ljava/lang/String;)Ljava/lang/String;", "name", "header", _UrlKt.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;)Ljava/util/List;", "T", "reifiedTag", "()Ljava/lang/Object;", "tag", "Lg9/c;", "type", "(Lg9/c;)Ljava/lang/Object;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "newBuilder", "()Lokhttp3/Request$Builder;", "-deprecated_url", "()Lokhttp3/HttpUrl;", "-deprecated_method", "()Ljava/lang/String;", "-deprecated_headers", "()Lokhttp3/Headers;", "-deprecated_body", "()Lokhttp3/RequestBody;", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "toString", _UrlKt.FRAGMENT_ENCODE_SET, "includeBody", "toCurl", "(Z)Ljava/lang/String;", "Lokhttp3/HttpUrl;", "Ljava/lang/String;", "Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "cacheUrlOverride", "Lokhttp3/internal/Tags;", "tags", "Lokhttp3/internal/Tags;", "getTags$okhttp", "()Lokhttp3/internal/Tags;", "lazyCacheControl", "Lokhttp3/CacheControl;", "isHttps", "()Z", "Builder", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class Request {
    private final RequestBody body;
    private final HttpUrl cacheUrlOverride;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Tags tags;
    private final HttpUrl url;

    public Request(Builder builder) {
        builder.getClass();
        HttpUrl url = builder.getUrl();
        if (url == null) {
            C10010p0.m38820a("url == null");
            throw null;
        }
        this.url = url;
        this.method = builder.getMethod();
        this.headers = builder.getHeaders().build();
        this.body = builder.getBody();
        this.cacheUrlOverride = builder.getCacheUrlOverride();
        this.tags = builder.getTags();
    }

    private final String shellEscape(String str) {
        return "'" + AbstractC8611a0.m33069N(str, "'", "'\\''", false, 4, null) + '\'';
    }

    public static /* synthetic */ String toCurl$default(Request request, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return request.toCurl(z10);
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final RequestBody getBody() {
        return this.body;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m38993deprecated_cacheControl() {
        return cacheControl();
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_method, reason: not valid java name and from getter */
    public final String getMethod() {
        return this.method;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    public final RequestBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.INSTANCE.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    /* JADX INFO: renamed from: cacheUrlOverride, reason: from getter */
    public final HttpUrl getCacheUrlOverride() {
        return this.cacheUrlOverride;
    }

    /* JADX INFO: renamed from: getTags$okhttp, reason: from getter */
    public final Tags getTags() {
        return this.tags;
    }

    public final String header(String name) {
        name.getClass();
        return this.headers.get(name);
    }

    public final List<String> headers(String name) {
        name.getClass();
        return this.headers.values(name);
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final /* synthetic */ <T> T reifiedTag() {
        AbstractC1061t.m3845f(4, "T");
        return (T) tag(AbstractC1052o0.m3807b(Object.class));
    }

    public final <T> T tag(InterfaceC2549c type) {
        type.getClass();
        return (T) AbstractC9886a.m38367b(type).cast(this.tags.get(type));
    }

    public final String toCurl(boolean includeBody) {
        MediaType mediaTypeContentType;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("curl " + shellEscape(this.url.getUrl()));
        RequestBody requestBody = this.body;
        String string = (requestBody == null || (mediaTypeContentType = requestBody.get$contentType()) == null) ? null : mediaTypeContentType.toString();
        if (!AbstractC1061t.m3842c(this.method, (!includeBody || this.body == null) ? "GET" : "POST")) {
            sb2.append(" \\\n  -X " + shellEscape(this.method));
        }
        for (C4711r c4711r : this.headers) {
            String str = (String) c4711r.m18792a();
            String str2 = (String) c4711r.m18793b();
            if (string == null || !AbstractC8611a0.m33061F(str, "Content-Type", true)) {
                StringBuilder sb3 = new StringBuilder(" \\\n  -H ");
                sb3.append(shellEscape(str + ": " + str2));
                sb2.append(sb3.toString());
            }
        }
        if (string != null) {
            sb2.append(" \\\n  -H " + shellEscape("Content-Type: ".concat(string)));
        }
        if (includeBody && this.body != null) {
            C9995i c9995i = new C9995i();
            this.body.writeTo(c9995i);
            if (IsProbablyUtf8Kt.isProbablyUtf8$default(c9995i, 0L, 1, null)) {
                sb2.append(" \\\n  --data " + shellEscape(c9995i.m38684L()));
            } else {
                sb2.append(" \\\n  --data-binary " + shellEscape(c9995i.mo38717l0().mo38782p()));
            }
        }
        return sb2.toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Request{method=");
        sb2.append(this.method);
        sb2.append(", url=");
        sb2.append(this.url);
        if (this.headers.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (C4711r c4711r : this.headers) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC5114x.m20810y();
                }
                C4711r c4711r2 = c4711r;
                String str = (String) c4711r2.m18792a();
                String str2 = (String) c4711r2.m18793b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                if (_UtilCommonKt.isSensitiveHeader(str)) {
                    str2 = "██";
                }
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!AbstractC1061t.m3842c(this.tags, EmptyTags.INSTANCE)) {
            sb2.append(", tags=");
            sb2.append(this.tags);
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final HttpUrl url() {
        return this.url;
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\rJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\b\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u00020\u00002\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010\"J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010\"J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010\"J!\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b'\u0010(J&\u0010*\u001a\u00020\u0000\"\n\b\u0000\u0010)\u0018\u0001*\u00020\u00012\b\u0010*\u001a\u0004\u0018\u00018\u0000H\u0087\b¢\u0006\u0004\b+\u0010,J/\u0010*\u001a\u00020\u0000\"\b\b\u0000\u0010)*\u00020\u00012\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-2\b\u0010*\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b*\u0010/J\u0019\u0010*\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b*\u0010,J/\u0010*\u001a\u00020\u0000\"\u0004\b\u0000\u0010)2\u000e\u0010.\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u0000002\b\u0010*\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b*\u00101J\u0017\u00102\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b2\u0010\fJ\r\u00103\u001a\u00020\u0000¢\u0006\u0004\b3\u0010\u001dJ\u000f\u00104\u001a\u00020\u0004H\u0016¢\u0006\u0004\b4\u00105R$\u0010\b\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010'\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0017\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u00102\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00106\u001a\u0004\bK\u00108\"\u0004\bL\u0010:R\"\u0010N\u001a\u00020M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006T"}, m16758d2 = {"Lokhttp3/Request$Builder;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;)V", _UrlKt.FRAGMENT_ENCODE_SET, "url", "canonicalUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/HttpUrl;", "(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;", "(Ljava/lang/String;)Lokhttp3/Request$Builder;", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/Request$Builder;", "name", "value", "header", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;", "addHeader", "removeHeader", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lokhttp3/Request$Builder;", "Lokhttp3/CacheControl;", "cacheControl", "(Lokhttp3/CacheControl;)Lokhttp3/Request$Builder;", "get", "()Lokhttp3/Request$Builder;", "head", "Lokhttp3/RequestBody;", "body", "post", "(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", "delete", "put", "patch", "query", "method", "(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", "T", "tag", "reifiedTag", "(Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Lg9/c;", "type", "(Lg9/c;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Ljava/lang/Class;", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "cacheUrlOverride", "gzip", "build", "()Lokhttp3/Request;", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "getCacheUrlOverride$okhttp", "setCacheUrlOverride$okhttp", "Lokhttp3/internal/Tags;", "tags", "Lokhttp3/internal/Tags;", "getTags$okhttp", "()Lokhttp3/internal/Tags;", "setTags$okhttp", "(Lokhttp3/internal/Tags;)V", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static class Builder {
        private RequestBody body;
        private HttpUrl cacheUrlOverride;
        private Headers.Builder headers;
        private String method;
        private Tags tags;
        private HttpUrl url;

        public Builder(Request request) {
            request.getClass();
            this.tags = EmptyTags.INSTANCE;
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            this.tags = request.getTags();
            this.headers = request.headers().newBuilder();
            this.cacheUrlOverride = request.getCacheUrlOverride();
        }

        private final String canonicalUrl(String url) {
            return AbstractC8611a0.m33073R(url, "ws:", true) ? "http:".concat(url.substring(3)) : AbstractC8611a0.m33073R(url, "wss:", true) ? "https:".concat(url.substring(4)) : url;
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i10, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: delete");
                return null;
            }
            if ((i10 & 1) != 0) {
                requestBody = RequestBody.EMPTY;
            }
            return builder.delete(requestBody);
        }

        public Builder addHeader(String name, String value) {
            name.getClass();
            value.getClass();
            this.headers.add(name, value);
            return this;
        }

        public Request build() {
            return new Request(this);
        }

        public Builder cacheControl(CacheControl cacheControl) {
            cacheControl.getClass();
            String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        public final Builder cacheUrlOverride(HttpUrl cacheUrlOverride) {
            this.cacheUrlOverride = cacheUrlOverride;
            return this;
        }

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        public Builder get() {
            return method("GET", null);
        }

        /* JADX INFO: renamed from: getBody$okhttp, reason: from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: getCacheUrlOverride$okhttp, reason: from getter */
        public final HttpUrl getCacheUrlOverride() {
            return this.cacheUrlOverride;
        }

        /* JADX INFO: renamed from: getHeaders$okhttp, reason: from getter */
        public final Headers.Builder getHeaders() {
            return this.headers;
        }

        /* JADX INFO: renamed from: getMethod$okhttp, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        /* JADX INFO: renamed from: getTags$okhttp, reason: from getter */
        public final Tags getTags() {
            return this.tags;
        }

        /* JADX INFO: renamed from: getUrl$okhttp, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }

        public final Builder gzip() {
            RequestBody requestBody = this.body;
            if (requestBody == null) {
                C10010p0.m38820a("cannot gzip a request that has no body");
                return null;
            }
            String str = this.headers.get("Content-Encoding");
            if (str != null) {
                C5753h.m23254a("Content-Encoding already set: ", str);
                return null;
            }
            this.headers.add("Content-Encoding", "gzip");
            this.body = new GzipRequestBody(requestBody);
            return this;
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Builder header(String name, String value) {
            name.getClass();
            value.getClass();
            this.headers.set(name, value);
            return this;
        }

        public Builder headers(Headers headers) {
            headers.getClass();
            this.headers = headers.newBuilder();
            return this;
        }

        public Builder method(String method, RequestBody body) {
            method.getClass();
            if (method.length() <= 0) {
                C9987e.m38645a("method.isEmpty() == true");
                return null;
            }
            if (body == null) {
                if (HttpMethod.requiresRequestBody(method)) {
                    C5754i.m23255a("method ", method, " must have a request body.");
                    return null;
                }
            } else if (!HttpMethod.permitsRequestBody(method)) {
                C5754i.m23255a("method ", method, " must not have a request body.");
                return null;
            }
            this.method = method;
            this.body = body;
            return this;
        }

        public Builder patch(RequestBody body) {
            body.getClass();
            return method("PATCH", body);
        }

        public Builder post(RequestBody body) {
            body.getClass();
            return method("POST", body);
        }

        public Builder put(RequestBody body) {
            body.getClass();
            return method("PUT", body);
        }

        public Builder query(RequestBody body) {
            body.getClass();
            return method("QUERY", body);
        }

        public final /* synthetic */ <T> Builder reifiedTag(T tag) {
            AbstractC1061t.m3845f(4, "T");
            return tag(AbstractC1052o0.m3807b(Object.class), tag);
        }

        public Builder removeHeader(String name) {
            name.getClass();
            this.headers.removeAll(name);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setCacheUrlOverride$okhttp(HttpUrl httpUrl) {
            this.cacheUrlOverride = httpUrl;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            builder.getClass();
            this.headers = builder;
        }

        public final void setMethod$okhttp(String str) {
            str.getClass();
            this.method = str;
        }

        public final void setTags$okhttp(Tags tags) {
            tags.getClass();
            this.tags = tags;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public final <T> Builder tag(InterfaceC2549c type, T tag) {
            type.getClass();
            this.tags = this.tags.plus(type, tag);
            return this;
        }

        public Builder url(URL url) {
            url.getClass();
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            String string = url.toString();
            string.getClass();
            return url(companion.get(string));
        }

        public Builder delete(RequestBody body) {
            return method("DELETE", body);
        }

        public Builder tag(Object tag) {
            return tag(AbstractC1052o0.m3807b(Object.class), tag);
        }

        public <T> Builder tag(Class<? super T> type, T tag) {
            type.getClass();
            return tag(AbstractC9886a.m38370e(type), tag);
        }

        public Builder url(String url) {
            url.getClass();
            return url(HttpUrl.INSTANCE.get(canonicalUrl(url)));
        }

        public Builder url(HttpUrl url) {
            url.getClass();
            this.url = url;
            return this;
        }

        public Builder() {
            this.tags = EmptyTags.INSTANCE;
            this.method = "GET";
            this.headers = new Headers.Builder();
        }
    }

    public final Headers headers() {
        return this.headers;
    }

    public final <T> T tag(Class<? extends T> type) {
        type.getClass();
        return (T) tag(AbstractC9886a.m38370e(type));
    }

    public final Object tag() {
        return tag(AbstractC1052o0.m3807b(Object.class));
    }

    public /* synthetic */ Request(HttpUrl httpUrl, Headers headers, String str, RequestBody requestBody, int i10, AbstractC1043k abstractC1043k) {
        this(httpUrl, (i10 & 2) != 0 ? Headers.INSTANCE.m23250of(new String[0]) : headers, (i10 & 4) != 0 ? "\u0000" : str, (i10 & 8) != 0 ? null : requestBody);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Request(HttpUrl httpUrl, Headers headers, String str, RequestBody requestBody) {
        httpUrl.getClass();
        headers.getClass();
        str.getClass();
        Builder builderHeaders = new Builder().url(httpUrl).headers(headers);
        if (AbstractC1061t.m3842c(str, "\u0000")) {
            if (requestBody != null) {
                str = "POST";
            } else {
                str = "GET";
            }
        }
        this(builderHeaders.method(str, requestBody));
    }

    public final String toCurl() {
        return toCurl$default(this, false, 1, null);
    }
}
