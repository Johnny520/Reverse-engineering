package okhttp3.internal.http;

import ac.AbstractC0063p;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import okio.BufferedSink;
import okio.Okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CallServerInterceptor(boolean z9) {
        this.forWebSocket = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean shouldIgnoreAndWaitForRealResponse(int i9) {
        if (i9 == 100) {
            return true;
        }
        return 102 <= i9 && i9 < 200;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4 A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:39:0x00a9, B:41:0x00b2, B:44:0x00ba, B:46:0x00e4, B:48:0x00ed, B:49:0x00f0, B:50:0x0114, B:54:0x011f, B:56:0x013e, B:58:0x014c, B:65:0x0162, B:67:0x0168, B:71:0x0175, B:73:0x018a, B:74:0x0192, B:75:0x019c, B:60:0x0157, B:55:0x012e), top: B:85:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:39:0x00a9, B:41:0x00b2, B:44:0x00ba, B:46:0x00e4, B:48:0x00ed, B:49:0x00f0, B:50:0x0114, B:54:0x011f, B:56:0x013e, B:58:0x014c, B:65:0x0162, B:67:0x0168, B:71:0x0175, B:73:0x018a, B:74:0x0192, B:75:0x019c, B:60:0x0157, B:55:0x012e), top: B:85:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0157 A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:39:0x00a9, B:41:0x00b2, B:44:0x00ba, B:46:0x00e4, B:48:0x00ed, B:49:0x00f0, B:50:0x0114, B:54:0x011f, B:56:0x013e, B:58:0x014c, B:65:0x0162, B:67:0x0168, B:71:0x0175, B:73:0x018a, B:74:0x0192, B:75:0x019c, B:60:0x0157, B:55:0x012e), top: B:85:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162 A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:39:0x00a9, B:41:0x00b2, B:44:0x00ba, B:46:0x00e4, B:48:0x00ed, B:49:0x00f0, B:50:0x0114, B:54:0x011f, B:56:0x013e, B:58:0x014c, B:65:0x0162, B:67:0x0168, B:71:0x0175, B:73:0x018a, B:74:0x0192, B:75:0x019c, B:60:0x0157, B:55:0x012e), top: B:85:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0168 A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:39:0x00a9, B:41:0x00b2, B:44:0x00ba, B:46:0x00e4, B:48:0x00ed, B:49:0x00f0, B:50:0x0114, B:54:0x011f, B:56:0x013e, B:58:0x014c, B:65:0x0162, B:67:0x0168, B:71:0x0175, B:73:0x018a, B:74:0x0192, B:75:0x019c, B:60:0x0157, B:55:0x012e), top: B:85:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0175 A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:39:0x00a9, B:41:0x00b2, B:44:0x00ba, B:46:0x00e4, B:48:0x00ed, B:49:0x00f0, B:50:0x0114, B:54:0x011f, B:56:0x013e, B:58:0x014c, B:65:0x0162, B:67:0x0168, B:71:0x0175, B:73:0x018a, B:74:0x0192, B:75:0x019c, B:60:0x0157, B:55:0x012e), top: B:85:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response.Builder responseHeaders;
        int iCode;
        Response responseBuild;
        ResponseBody responseBodyBody;
        boolean z9;
        chain.getClass();
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange$okhttp = realInterceptorChain.getExchange$okhttp();
        exchange$okhttp.getClass();
        Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        RequestBody requestBodyBody = request$okhttp.body();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z10 = true;
        try {
            exchange$okhttp.writeRequestHeaders(request$okhttp);
            if (!HttpMethod.permitsRequestBody(request$okhttp.method()) || requestBodyBody == null) {
                exchange$okhttp.noRequestBody();
                responseHeaders = null;
            } else {
                if ("100-continue".equalsIgnoreCase(request$okhttp.header("Expect"))) {
                    exchange$okhttp.flushRequest();
                    responseHeaders = exchange$okhttp.readResponseHeaders(true);
                    try {
                        exchange$okhttp.responseHeadersStart();
                        z9 = false;
                    } catch (IOException e6) {
                        e = e6;
                        if ((e instanceof ConnectionShutdownException) || !exchange$okhttp.getHasFailure$okhttp()) {
                            throw e;
                        }
                        if (responseHeaders == null) {
                        }
                        Response responseBuild2 = responseHeaders.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                        iCode = responseBuild2.code();
                        if (shouldIgnoreAndWaitForRealResponse(iCode)) {
                        }
                        exchange$okhttp.responseHeadersEnd(responseBuild2);
                        if (this.forWebSocket) {
                        }
                        if (!"close".equalsIgnoreCase(responseBuild.request().header("Connection"))) {
                            exchange$okhttp.noNewExchangesOnConnection();
                        }
                        if (iCode != 204) {
                            responseBodyBody = responseBuild.body();
                            if ((responseBodyBody == null ? responseBodyBody.contentLength() : -1L) > 0) {
                            }
                        }
                        return responseBuild;
                    }
                } else {
                    z9 = true;
                    responseHeaders = null;
                }
                try {
                    if (responseHeaders != null) {
                        exchange$okhttp.noRequestBody();
                        if (!exchange$okhttp.getConnection$okhttp().isMultiplexed$okhttp()) {
                            exchange$okhttp.noNewExchangesOnConnection();
                        }
                    } else if (requestBodyBody.isDuplex()) {
                        exchange$okhttp.flushRequest();
                        requestBodyBody.writeTo(Okio.buffer(exchange$okhttp.createRequestBody(request$okhttp, true)));
                    } else {
                        BufferedSink bufferedSinkBuffer = Okio.buffer(exchange$okhttp.createRequestBody(request$okhttp, false));
                        requestBodyBody.writeTo(bufferedSinkBuffer);
                        bufferedSinkBuffer.close();
                    }
                    z10 = z9;
                } catch (IOException e7) {
                    e = e7;
                    z10 = z9;
                    if (e instanceof ConnectionShutdownException) {
                        throw e;
                    }
                    throw e;
                }
            }
            if (requestBodyBody == null || !requestBodyBody.isDuplex()) {
                exchange$okhttp.finishRequest();
            }
            e = null;
        } catch (IOException e10) {
            e = e10;
            responseHeaders = null;
        }
        if (responseHeaders == null) {
            try {
                responseHeaders = exchange$okhttp.readResponseHeaders(false);
                responseHeaders.getClass();
                if (z10) {
                    exchange$okhttp.responseHeadersStart();
                    z10 = false;
                }
            } catch (IOException e11) {
                if (e == null) {
                    throw e11;
                }
                AbstractC0063p.m412e(e, e11);
                throw e;
            }
        }
        Response responseBuild22 = responseHeaders.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        iCode = responseBuild22.code();
        if (shouldIgnoreAndWaitForRealResponse(iCode)) {
            Response.Builder responseHeaders2 = exchange$okhttp.readResponseHeaders(false);
            responseHeaders2.getClass();
            if (z10) {
                exchange$okhttp.responseHeadersStart();
            }
            responseBuild22 = responseHeaders2.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            iCode = responseBuild22.code();
        }
        exchange$okhttp.responseHeadersEnd(responseBuild22);
        responseBuild = (this.forWebSocket || iCode != 101) ? responseBuild22.newBuilder().body(exchange$okhttp.openResponseBody(responseBuild22)).build() : responseBuild22.newBuilder().body(Util.EMPTY_RESPONSE).build();
        if (!"close".equalsIgnoreCase(responseBuild.request().header("Connection")) || "close".equalsIgnoreCase(Response.header$default(responseBuild, "Connection", null, 2, null))) {
            exchange$okhttp.noNewExchangesOnConnection();
        }
        if (iCode != 204 || iCode == 205) {
            responseBodyBody = responseBuild.body();
            if ((responseBodyBody == null ? responseBodyBody.contentLength() : -1L) > 0) {
                StringBuilder sb2 = new StringBuilder("HTTP ");
                sb2.append(iCode);
                sb2.append(" had non-zero Content-Length: ");
                ResponseBody responseBodyBody2 = responseBuild.body();
                sb2.append(responseBodyBody2 != null ? Long.valueOf(responseBodyBody2.contentLength()) : null);
                throw new ProtocolException(sb2.toString());
            }
        }
        return responseBuild;
    }
}
