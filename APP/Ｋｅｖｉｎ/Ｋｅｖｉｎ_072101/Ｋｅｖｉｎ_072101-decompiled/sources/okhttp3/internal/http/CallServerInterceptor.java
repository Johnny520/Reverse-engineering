package okhttp3.internal.http;

/* JADX INFO: compiled from: CallServerInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m115d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "code", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class CallServerInterceptor implements okhttp3.Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.forWebSocket = r1
            return
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int r4) {
            r3 = this;
            r0 = 100
            r1 = 1
            if (r4 != r0) goto L7
            goto L17
        L7:
            r0 = 102(0x66, float:1.43E-43)
            r2 = 0
            if (r0 > r4) goto L12
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 >= r0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            if (r0 == 0) goto L16
            goto L17
        L16:
            r1 = r2
        L17:
            return r1
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r22) throws java.io.IOException {
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "Connection"
            java.lang.String r4 = "close"
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r5 = r2
            okhttp3.internal.http.RealInterceptorChain r5 = (okhttp3.internal.http.RealInterceptorChain) r5
            okhttp3.internal.connection.Exchange r0 = r5.getExchange$okhttp()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r6 = r0
            okhttp3.Request r7 = r5.getRequest$okhttp()
            okhttp3.RequestBody r8 = r7.body()
            long r9 = java.lang.System.currentTimeMillis()
            r11 = 1
            r12 = 0
            r13 = 0
            r15 = 1
            r6.writeRequestHeaders(r7)     // Catch: java.io.IOException -> L99
            java.lang.String r0 = r7.method()     // Catch: java.io.IOException -> L99
            boolean r0 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r0)     // Catch: java.io.IOException -> L99
            if (r0 == 0) goto L8a
            if (r8 == 0) goto L8a
            java.lang.String r0 = "100-continue"
            java.lang.String r14 = "Expect"
            java.lang.String r14 = r7.header(r14)     // Catch: java.io.IOException -> L99
            boolean r0 = kotlin.text.StringsKt.equals(r0, r14, r15)     // Catch: java.io.IOException -> L99
            if (r0 == 0) goto L52
            r6.flushRequest()     // Catch: java.io.IOException -> L99
            okhttp3.Response$Builder r0 = r6.readResponseHeaders(r15)     // Catch: java.io.IOException -> L99
            r12 = r0
            r6.responseHeadersStart()     // Catch: java.io.IOException -> L99
            r11 = 0
        L52:
            if (r12 != 0) goto L79
            boolean r0 = r8.isDuplex()     // Catch: java.io.IOException -> L99
            if (r0 == 0) goto L69
            r6.flushRequest()     // Catch: java.io.IOException -> L99
            okio.Sink r0 = r6.createRequestBody(r7, r15)     // Catch: java.io.IOException -> L99
            okio.BufferedSink r0 = okio.Okio.buffer(r0)     // Catch: java.io.IOException -> L99
            r8.writeTo(r0)     // Catch: java.io.IOException -> L99
            goto L8d
        L69:
            r14 = 0
            okio.Sink r0 = r6.createRequestBody(r7, r14)     // Catch: java.io.IOException -> L99
            okio.BufferedSink r0 = okio.Okio.buffer(r0)     // Catch: java.io.IOException -> L99
            r8.writeTo(r0)     // Catch: java.io.IOException -> L99
            r0.close()     // Catch: java.io.IOException -> L99
            goto L8d
        L79:
            r6.noRequestBody()     // Catch: java.io.IOException -> L99
            okhttp3.internal.connection.RealConnection r0 = r6.getConnection$okhttp()     // Catch: java.io.IOException -> L99
            boolean r0 = r0.isMultiplexed$okhttp()     // Catch: java.io.IOException -> L99
            if (r0 != 0) goto L8d
            r6.noNewExchangesOnConnection()     // Catch: java.io.IOException -> L99
            goto L8d
        L8a:
            r6.noRequestBody()     // Catch: java.io.IOException -> L99
        L8d:
            if (r8 == 0) goto L95
            boolean r0 = r8.isDuplex()     // Catch: java.io.IOException -> L99
            if (r0 != 0) goto La5
        L95:
            r6.finishRequest()     // Catch: java.io.IOException -> L99
            goto La5
        L99:
            r0 = move-exception
            boolean r14 = r0 instanceof okhttp3.internal.http2.ConnectionShutdownException
            if (r14 != 0) goto L1fa
            boolean r14 = r6.getHasFailure$okhttp()
            if (r14 == 0) goto L1f9
            r13 = r0
        La5:
            if (r12 != 0) goto Lbf
            r14 = 0
            okhttp3.Response$Builder r0 = r6.readResponseHeaders(r14)     // Catch: java.io.IOException -> Lb8
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.io.IOException -> Lb8
            r12 = r0
            if (r11 == 0) goto Lbf
            r6.responseHeadersStart()     // Catch: java.io.IOException -> Lb8
            r11 = 0
            goto Lbf
        Lb8:
            r0 = move-exception
            r15 = r7
            r18 = r8
            r14 = r13
            goto L1ec
        Lbf:
            okhttp3.Response$Builder r0 = r12.request(r7)     // Catch: java.io.IOException -> L1e5
            okhttp3.internal.connection.RealConnection r14 = r6.getConnection$okhttp()     // Catch: java.io.IOException -> L1e5
            okhttp3.Handshake r14 = r14.handshake()     // Catch: java.io.IOException -> L1e5
            okhttp3.Response$Builder r0 = r0.handshake(r14)     // Catch: java.io.IOException -> L1e5
            okhttp3.Response$Builder r0 = r0.sentRequestAtMillis(r9)     // Catch: java.io.IOException -> L1e5
            r16 = r12
            r14 = r13
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L1de
            okhttp3.Response$Builder r0 = r0.receivedResponseAtMillis(r12)     // Catch: java.io.IOException -> L1de
            okhttp3.Response r0 = r0.build()     // Catch: java.io.IOException -> L1de
            int r12 = r0.code()     // Catch: java.io.IOException -> L1de
            boolean r13 = r1.shouldIgnoreAndWaitForRealResponse(r12)     // Catch: java.io.IOException -> L1de
            if (r13 == 0) goto L13e
            r13 = 0
            okhttp3.Response$Builder r13 = r6.readResponseHeaders(r13)     // Catch: java.io.IOException -> L1de
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)     // Catch: java.io.IOException -> L1de
            if (r11 == 0) goto L103
            r6.responseHeadersStart()     // Catch: java.io.IOException -> Lfc
            goto L103
        Lfc:
            r0 = move-exception
            r15 = r7
            r18 = r8
            r12 = r13
            goto L1ec
        L103:
            okhttp3.Response$Builder r15 = r13.request(r7)     // Catch: java.io.IOException -> L137
            okhttp3.internal.connection.RealConnection r16 = r6.getConnection$okhttp()     // Catch: java.io.IOException -> L137
            r17 = r0
            okhttp3.Handshake r0 = r16.handshake()     // Catch: java.io.IOException -> L137
            okhttp3.Response$Builder r0 = r15.handshake(r0)     // Catch: java.io.IOException -> L137
            okhttp3.Response$Builder r0 = r0.sentRequestAtMillis(r9)     // Catch: java.io.IOException -> L137
            r15 = r7
            r18 = r8
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L133
            okhttp3.Response$Builder r0 = r0.receivedResponseAtMillis(r7)     // Catch: java.io.IOException -> L133
            okhttp3.Response r0 = r0.build()     // Catch: java.io.IOException -> L133
            int r7 = r0.code()     // Catch: java.io.IOException -> L133
            r12 = r7
            r16 = r13
            goto L143
        L133:
            r0 = move-exception
            r12 = r13
            goto L1ec
        L137:
            r0 = move-exception
            r15 = r7
            r18 = r8
            r12 = r13
            goto L1ec
        L13e:
            r17 = r0
            r15 = r7
            r18 = r8
        L143:
            r6.responseHeadersEnd(r0)     // Catch: java.io.IOException -> L1da
            boolean r7 = r1.forWebSocket     // Catch: java.io.IOException -> L1da
            if (r7 == 0) goto L15d
            r7 = 101(0x65, float:1.42E-43)
            if (r12 != r7) goto L15d
            okhttp3.Response$Builder r7 = r0.newBuilder()     // Catch: java.io.IOException -> L1da
            okhttp3.ResponseBody r8 = okhttp3.internal.Util.EMPTY_RESPONSE     // Catch: java.io.IOException -> L1da
            okhttp3.Response$Builder r7 = r7.body(r8)     // Catch: java.io.IOException -> L1da
            okhttp3.Response r7 = r7.build()     // Catch: java.io.IOException -> L1da
            goto L16d
        L15d:
            okhttp3.Response$Builder r7 = r0.newBuilder()     // Catch: java.io.IOException -> L1da
            okhttp3.ResponseBody r8 = r6.openResponseBody(r0)     // Catch: java.io.IOException -> L1da
            okhttp3.Response$Builder r7 = r7.body(r8)     // Catch: java.io.IOException -> L1da
            okhttp3.Response r7 = r7.build()     // Catch: java.io.IOException -> L1da
        L16d:
            r0 = r7
            okhttp3.Request r7 = r0.request()     // Catch: java.io.IOException -> L1da
            java.lang.String r7 = r7.header(r3)     // Catch: java.io.IOException -> L1da
            r8 = 1
            boolean r7 = kotlin.text.StringsKt.equals(r4, r7, r8)     // Catch: java.io.IOException -> L1da
            r8 = 0
            if (r7 != 0) goto L18a
            r7 = 2
            java.lang.String r3 = okhttp3.Response.header$default(r0, r3, r8, r7, r8)     // Catch: java.io.IOException -> L1da
            r7 = 1
            boolean r3 = kotlin.text.StringsKt.equals(r4, r3, r7)     // Catch: java.io.IOException -> L1da
            if (r3 == 0) goto L18d
        L18a:
            r6.noNewExchangesOnConnection()     // Catch: java.io.IOException -> L1da
        L18d:
            r3 = 204(0xcc, float:2.86E-43)
            if (r12 == r3) goto L195
            r3 = 205(0xcd, float:2.87E-43)
            if (r12 != r3) goto L1d9
        L195:
            okhttp3.ResponseBody r3 = r0.body()     // Catch: java.io.IOException -> L1da
            if (r3 == 0) goto L1a0
            long r3 = r3.contentLength()     // Catch: java.io.IOException -> L1da
            goto L1a2
        L1a0:
            r3 = -1
        L1a2:
            r19 = 0
            int r3 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r3 <= 0) goto L1d9
            java.net.ProtocolException r3 = new java.net.ProtocolException     // Catch: java.io.IOException -> L1da
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1da
            r4.<init>()     // Catch: java.io.IOException -> L1da
            java.lang.String r7 = "HTTP "
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.io.IOException -> L1da
            java.lang.StringBuilder r4 = r4.append(r12)     // Catch: java.io.IOException -> L1da
            java.lang.String r7 = " had non-zero Content-Length: "
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.io.IOException -> L1da
            okhttp3.ResponseBody r7 = r0.body()     // Catch: java.io.IOException -> L1da
            if (r7 == 0) goto L1cd
            long r7 = r7.contentLength()     // Catch: java.io.IOException -> L1da
            java.lang.Long r8 = java.lang.Long.valueOf(r7)     // Catch: java.io.IOException -> L1da
        L1cd:
            java.lang.StringBuilder r4 = r4.append(r8)     // Catch: java.io.IOException -> L1da
            java.lang.String r4 = r4.toString()     // Catch: java.io.IOException -> L1da
            r3.<init>(r4)     // Catch: java.io.IOException -> L1da
            throw r3     // Catch: java.io.IOException -> L1da
        L1d9:
            return r0
        L1da:
            r0 = move-exception
            r12 = r16
            goto L1ec
        L1de:
            r0 = move-exception
            r15 = r7
            r18 = r8
            r12 = r16
            goto L1ec
        L1e5:
            r0 = move-exception
            r15 = r7
            r18 = r8
            r16 = r12
            r14 = r13
        L1ec:
            if (r14 == 0) goto L1f8
            r3 = r14
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r4 = r0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlin.ExceptionsKt.addSuppressed(r3, r4)
            throw r14
        L1f8:
            throw r0
        L1f9:
            throw r0
        L1fa:
            throw r0
    }
}
