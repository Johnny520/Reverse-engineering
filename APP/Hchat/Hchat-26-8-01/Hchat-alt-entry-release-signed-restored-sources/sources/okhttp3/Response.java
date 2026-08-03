package okhttp3;

import java.io.Closeable;
import java.io.EOFException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import p025bc.AbstractC0255e;
import p136j8.C2104o;
import p276sf.InterfaceC3954a;
import tf.C4173t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Response implements Closeable {
    private final ResponseBody body;
    private final Response cacheResponse;
    private final int code;
    private final Exchange exchange;
    private final Handshake handshake;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String message;
    private final Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    private final Request request;
    private final long sentRequestAtMillis;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Response(Request request, Protocol protocol, String str, int i9, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j3, long j4, Exchange exchange) {
        request.getClass();
        protocol.getClass();
        str.getClass();
        headers.getClass();
        this.request = request;
        this.protocol = protocol;
        this.message = str;
        this.code = i9;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j3;
        this.receivedResponseAtMillis = j4;
        this.exchange = exchange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ String header$default(Response response, String str, String str2, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
    public final ResponseBody m11044deprecated_body() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m11045deprecated_cacheControl() {
        return cacheControl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_cacheResponse, reason: not valid java name */
    public final Response m11046deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_code, reason: not valid java name */
    public final int m11047deprecated_code() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_handshake, reason: not valid java name */
    public final Handshake m11048deprecated_handshake() {
        return this.handshake;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m11049deprecated_headers() {
        return this.headers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_message, reason: not valid java name */
    public final String m11050deprecated_message() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_networkResponse, reason: not valid java name */
    public final Response m11051deprecated_networkResponse() {
        return this.networkResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_priorResponse, reason: not valid java name */
    public final Response m11052deprecated_priorResponse() {
        return this.priorResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_protocol, reason: not valid java name */
    public final Protocol m11053deprecated_protocol() {
        return this.protocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name */
    public final long m11054deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_request, reason: not valid java name */
    public final Request m11055deprecated_request() {
        return this.request;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name */
    public final long m11056deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ResponseBody body() {
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
    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i9 = this.code;
        if (i9 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i9 != 407) {
                return C4173t.f13710g;
            }
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody != null) {
            responseBody.close();
        } else {
            C2104o.m5276A("response is not eligible for a body and must not be closed");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int code() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Exchange exchange() {
        return this.exchange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Handshake handshake() {
        return this.handshake;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String header(String str, String str2) {
        str.getClass();
        String str3 = this.headers.get(str);
        return str3 == null ? str2 : str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> headers(String str) {
        str.getClass();
        return this.headers.values(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isRedirect() {
        int i9 = this.code;
        if (i9 == 307 || i9 == 308) {
            return true;
        }
        switch (i9) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isSuccessful() {
        int i9 = this.code;
        return 200 <= i9 && i9 < 300;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String message() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Response networkResponse() {
        return this.networkResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Builder newBuilder() {
        return new Builder(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ResponseBody peekBody(long j3) throws EOFException {
        ResponseBody responseBody = this.body;
        responseBody.getClass();
        BufferedSource bufferedSourcePeek = responseBody.source().peek();
        Buffer buffer = new Buffer();
        bufferedSourcePeek.request(j3);
        buffer.write((Source) bufferedSourcePeek, Math.min(j3, bufferedSourcePeek.getBuffer().size()));
        return ResponseBody.Companion.create(buffer, this.body.contentType(), buffer.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Response priorResponse() {
        return this.priorResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Protocol protocol() {
        return this.protocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Request request() {
        return this.request;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Headers trailers() {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        C2104o.m5276A("trailers not available");
        return null;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final String header(String str) {
        str.getClass();
        return header$default(this, str, null, 2, null);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class Builder {
        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Exchange exchange;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private long receivedResponseAtMillis;
        private Request request;
        private long sentRequestAtMillis;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder(Response response) {
            response.getClass();
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void checkPriorResponse(Response response) {
            if (response == null || response.body() == null) {
                return;
            }
            C2104o.m5294t("priorResponse.body != null");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void checkSupportResponse(String str, Response response) {
            if (response != null) {
                if (response.body() != null) {
                    C2104o.m5291q(AbstractC0255e.m1020i(str, ".body != null"));
                    return;
                }
                if (response.networkResponse() != null) {
                    C2104o.m5291q(AbstractC0255e.m1020i(str, ".networkResponse != null"));
                } else if (response.cacheResponse() != null) {
                    C2104o.m5291q(AbstractC0255e.m1020i(str, ".cacheResponse != null"));
                } else {
                    if (response.priorResponse() == null) {
                        return;
                    }
                    C2104o.m5291q(AbstractC0255e.m1020i(str, ".priorResponse != null"));
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder addHeader(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.headers.add(str, str2);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder body(ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Response build() {
            int i9 = this.code;
            if (i9 < 0) {
                C2104o.m5290p(this.code, "code < 0: ");
                return null;
            }
            Request request = this.request;
            if (request == null) {
                C2104o.m5276A("request == null");
                return null;
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                C2104o.m5276A("protocol == null");
                return null;
            }
            String str = this.message;
            if (str != null) {
                return new Response(request, protocol, str, i9, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            C2104o.m5276A("message == null");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder cacheResponse(Response response) {
            checkSupportResponse("cacheResponse", response);
            this.cacheResponse = response;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder code(int i9) {
            this.code = i9;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getCode$okhttp() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getMessage$okhttp() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Request getRequest$okhttp() {
            return this.request;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder handshake(Handshake handshake) {
            this.handshake = handshake;
            return this;
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
        public final void initExchange$okhttp(Exchange exchange) {
            exchange.getClass();
            this.exchange = exchange;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder message(String str) {
            str.getClass();
            this.message = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder networkResponse(Response response) {
            checkSupportResponse("networkResponse", response);
            this.networkResponse = response;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder priorResponse(Response response) {
            checkPriorResponse(response);
            this.priorResponse = response;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder protocol(Protocol protocol) {
            protocol.getClass();
            this.protocol = protocol;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder receivedResponseAtMillis(long j3) {
            this.receivedResponseAtMillis = j3;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder removeHeader(String str) {
            str.getClass();
            this.headers.removeAll(str);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder request(Request request) {
            request.getClass();
            this.request = request;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder sentRequestAtMillis(long j3) {
            this.sentRequestAtMillis = j3;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setBody$okhttp(ResponseBody responseBody) {
            this.body = responseBody;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setCacheResponse$okhttp(Response response) {
            this.cacheResponse = response;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setCode$okhttp(int i9) {
            this.code = i9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setExchange$okhttp(Exchange exchange) {
            this.exchange = exchange;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setHandshake$okhttp(Handshake handshake) {
            this.handshake = handshake;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setHeaders$okhttp(Headers.Builder builder) {
            builder.getClass();
            this.headers = builder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setMessage$okhttp(String str) {
            this.message = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setNetworkResponse$okhttp(Response response) {
            this.networkResponse = response;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setPriorResponse$okhttp(Response response) {
            this.priorResponse = response;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setProtocol$okhttp(Protocol protocol) {
            this.protocol = protocol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setReceivedResponseAtMillis$okhttp(long j3) {
            this.receivedResponseAtMillis = j3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setRequest$okhttp(Request request) {
            this.request = request;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setSentRequestAtMillis$okhttp(long j3) {
            this.sentRequestAtMillis = j3;
        }

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }
    }
}
