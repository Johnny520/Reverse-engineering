package okhttp3;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p218og.AbstractC3156t;
import p276sf.C3958e;
import p276sf.InterfaceC3954a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Request(HttpUrl httpUrl, String str, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        httpUrl.getClass();
        str.getClass();
        headers.getClass();
        map.getClass();
        this.url = httpUrl;
        this.method = str;
        this.headers = headers;
        this.body = requestBody;
        this.tags = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
    public final RequestBody m11039deprecated_body() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m11040deprecated_cacheControl() {
        return cacheControl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m11041deprecated_headers() {
        return this.headers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_method, reason: not valid java name */
    public final String m11042deprecated_method() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m11043deprecated_url() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RequestBody body() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String header(String str) {
        str.getClass();
        return this.headers.get(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> headers(String str) {
        str.getClass();
        return this.headers.values(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isHttps() {
        return this.url.isHttps();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String method() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Builder newBuilder() {
        return new Builder(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <T> T tag(Class<? extends T> cls) {
        cls.getClass();
        return cls.cast(this.tags.get(cls));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.method);
        sb2.append(", url=");
        sb2.append(this.url);
        if (this.headers.size() != 0) {
            sb2.append(", headers=[");
            int i9 = 0;
            for (C3958e c3958e : this.headers) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    AbstractC0000a.m32Q0();
                    throw null;
                }
                C3958e c3958e2 = c3958e;
                String str = (String) c3958e2.f12961g;
                String str2 = (String) c3958e2.f12962h;
                if (i9 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i9 = i10;
            }
            sb2.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.tags);
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HttpUrl url() {
        return this.url;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder(Request request) {
            LinkedHashMap linkedHashMap;
            request.getClass();
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                Map<Class<?>, Object> tags$okhttp = request.getTags$okhttp();
                tags$okhttp.getClass();
                linkedHashMap = new LinkedHashMap(tags$okhttp);
            }
            this.tags = linkedHashMap;
            this.headers = request.headers().newBuilder();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i9, Object obj) {
            if (obj != null) {
                C2104o.m5297w("Super calls with default arguments not supported in this target, function: delete");
                return null;
            }
            if ((i9 & 1) != 0) {
                requestBody = Util.EMPTY_REQUEST;
            }
            return builder.delete(requestBody);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder addHeader(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.headers.add(str, str2);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            C2104o.m5276A("url == null");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder cacheControl(CacheControl cacheControl) {
            cacheControl.getClass();
            String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder get() {
            return method("GET", null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getMethod$okhttp() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder head() {
            return method("HEAD", null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder header(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.headers.set(str, str2);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder headers(Headers headers) {
            headers.getClass();
            this.headers = headers.newBuilder();
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder method(String str, RequestBody requestBody) {
            str.getClass();
            if (str.length() <= 0) {
                C2104o.m5294t("method.isEmpty() == true");
                return null;
            }
            if (requestBody == null) {
                if (HttpMethod.requiresRequestBody(str)) {
                    C2104o.m5291q(AbstractC0921a.m2251n("method ", str, " must have a request body."));
                    return null;
                }
            } else if (!HttpMethod.permitsRequestBody(str)) {
                C2104o.m5291q(AbstractC0921a.m2251n("method ", str, " must not have a request body."));
                return null;
            }
            this.method = str;
            this.body = requestBody;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder patch(RequestBody requestBody) {
            requestBody.getClass();
            return method("PATCH", requestBody);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder post(RequestBody requestBody) {
            requestBody.getClass();
            return method("POST", requestBody);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder put(RequestBody requestBody) {
            requestBody.getClass();
            return method("PUT", requestBody);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder removeHeader(String str) {
            str.getClass();
            this.headers.removeAll(str);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setHeaders$okhttp(Headers.Builder builder) {
            builder.getClass();
            this.headers = builder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setMethod$okhttp(String str) {
            str.getClass();
            this.method = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            map.getClass();
            this.tags = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public <T> Builder tag(Class<? super T> cls, T t9) {
            cls.getClass();
            Map<Class<?>, Object> map = this.tags;
            if (t9 == null) {
                map.remove(cls);
                return this;
            }
            if (map.isEmpty()) {
                this.tags = new LinkedHashMap();
            }
            Map<Class<?>, Object> map2 = this.tags;
            T tCast = cls.cast(t9);
            tCast.getClass();
            map2.put(cls, tCast);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder url(String str) {
            str.getClass();
            if (AbstractC3156t.m6740d0(str, "ws:", true)) {
                str = "http:".concat(str.substring(3));
            } else if (AbstractC3156t.m6740d0(str, "wss:", true)) {
                str = "https:".concat(str.substring(4));
            }
            return url(HttpUrl.Companion.get(str));
        }

        public Builder delete(RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder url(HttpUrl httpUrl) {
            httpUrl.getClass();
            this.url = httpUrl;
            return this;
        }

        public Builder url(URL url) {
            url.getClass();
            HttpUrl.Companion companion = HttpUrl.Companion;
            String string = url.toString();
            string.getClass();
            return url(companion.get(string));
        }

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }
    }

    public final Headers headers() {
        return this.headers;
    }

    public final Object tag() {
        return tag(Object.class);
    }
}
