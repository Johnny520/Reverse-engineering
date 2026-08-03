package okhttp3.internal.http;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CallServerInterceptor implements okhttp3.Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.forWebSocket = r1
            return
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int r3) {
            r2 = this;
            r0 = 100
            r1 = 1
            if (r3 != r0) goto L6
            return r1
        L6:
            r0 = 102(0x66, float:1.43E-43)
            if (r0 > r3) goto Lf
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 >= r0) goto Lf
            return r1
        Lf:
            r3 = 0
            return r3
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r14) {
            r13 = this;
            java.lang.String r0 = "Connection"
            java.lang.String r1 = "close"
            java.lang.String r2 = "HTTP "
            r14.getClass()
            okhttp3.internal.http.RealInterceptorChain r14 = (okhttp3.internal.http.RealInterceptorChain) r14
            okhttp3.internal.connection.Exchange r3 = r14.getExchange$okhttp()
            r3.getClass()
            okhttp3.Request r14 = r14.getRequest$okhttp()
            okhttp3.RequestBody r4 = r14.body()
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 0
            r8 = 1
            r9 = 0
            r3.writeRequestHeaders(r14)     // Catch: java.io.IOException -> L4c
            java.lang.String r10 = r14.method()     // Catch: java.io.IOException -> L4c
            boolean r10 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r10)     // Catch: java.io.IOException -> L4c
            if (r10 == 0) goto L8c
            if (r4 == 0) goto L8c
            java.lang.String r10 = "100-continue"
            java.lang.String r11 = "Expect"
            java.lang.String r11 = r14.header(r11)     // Catch: java.io.IOException -> L4c
            boolean r10 = r10.equalsIgnoreCase(r11)     // Catch: java.io.IOException -> L4c
            if (r10 == 0) goto L4f
            r3.flushRequest()     // Catch: java.io.IOException -> L4c
            okhttp3.Response$Builder r10 = r3.readResponseHeaders(r8)     // Catch: java.io.IOException -> L4c
            r3.responseHeadersStart()     // Catch: java.io.IOException -> L4a
            r11 = r7
            goto L51
        L4a:
            r4 = move-exception
            goto L9d
        L4c:
            r4 = move-exception
            r10 = r9
            goto L9d
        L4f:
            r11 = r8
            r10 = r9
        L51:
            if (r10 != 0) goto L7a
            boolean r12 = r4.isDuplex()     // Catch: java.io.IOException -> L68
            if (r12 == 0) goto L6b
            r3.flushRequest()     // Catch: java.io.IOException -> L68
            okio.Sink r8 = r3.createRequestBody(r14, r8)     // Catch: java.io.IOException -> L68
            okio.BufferedSink r8 = okio.Okio.buffer(r8)     // Catch: java.io.IOException -> L68
            r4.writeTo(r8)     // Catch: java.io.IOException -> L68
            goto L8a
        L68:
            r4 = move-exception
            r8 = r11
            goto L9d
        L6b:
            okio.Sink r8 = r3.createRequestBody(r14, r7)     // Catch: java.io.IOException -> L68
            okio.BufferedSink r8 = okio.Okio.buffer(r8)     // Catch: java.io.IOException -> L68
            r4.writeTo(r8)     // Catch: java.io.IOException -> L68
            r8.close()     // Catch: java.io.IOException -> L68
            goto L8a
        L7a:
            r3.noRequestBody()     // Catch: java.io.IOException -> L68
            okhttp3.internal.connection.RealConnection r8 = r3.getConnection$okhttp()     // Catch: java.io.IOException -> L68
            boolean r8 = r8.isMultiplexed$okhttp()     // Catch: java.io.IOException -> L68
            if (r8 != 0) goto L8a
            r3.noNewExchangesOnConnection()     // Catch: java.io.IOException -> L68
        L8a:
            r8 = r11
            goto L90
        L8c:
            r3.noRequestBody()     // Catch: java.io.IOException -> L4c
            r10 = r9
        L90:
            if (r4 == 0) goto L98
            boolean r4 = r4.isDuplex()     // Catch: java.io.IOException -> L4a
            if (r4 != 0) goto L9b
        L98:
            r3.finishRequest()     // Catch: java.io.IOException -> L4a
        L9b:
            r4 = r9
            goto La7
        L9d:
            boolean r11 = r4 instanceof okhttp3.internal.http2.ConnectionShutdownException
            if (r11 != 0) goto L1a6
            boolean r11 = r3.getHasFailure$okhttp()
            if (r11 == 0) goto L1a5
        La7:
            if (r10 != 0) goto Lba
            okhttp3.Response$Builder r10 = r3.readResponseHeaders(r7)     // Catch: java.io.IOException -> Lb7
            r10.getClass()     // Catch: java.io.IOException -> Lb7
            if (r8 == 0) goto Lba
            r3.responseHeadersStart()     // Catch: java.io.IOException -> Lb7
            r8 = r7
            goto Lba
        Lb7:
            r14 = move-exception
            goto L19e
        Lba:
            okhttp3.Response$Builder r10 = r10.request(r14)     // Catch: java.io.IOException -> Lb7
            okhttp3.internal.connection.RealConnection r11 = r3.getConnection$okhttp()     // Catch: java.io.IOException -> Lb7
            okhttp3.Handshake r11 = r11.handshake()     // Catch: java.io.IOException -> Lb7
            okhttp3.Response$Builder r10 = r10.handshake(r11)     // Catch: java.io.IOException -> Lb7
            okhttp3.Response$Builder r10 = r10.sentRequestAtMillis(r5)     // Catch: java.io.IOException -> Lb7
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> Lb7
            okhttp3.Response$Builder r10 = r10.receivedResponseAtMillis(r11)     // Catch: java.io.IOException -> Lb7
            okhttp3.Response r10 = r10.build()     // Catch: java.io.IOException -> Lb7
            int r11 = r10.code()     // Catch: java.io.IOException -> Lb7
            boolean r12 = r13.shouldIgnoreAndWaitForRealResponse(r11)     // Catch: java.io.IOException -> Lb7
            if (r12 == 0) goto L114
            okhttp3.Response$Builder r7 = r3.readResponseHeaders(r7)     // Catch: java.io.IOException -> Lb7
            r7.getClass()     // Catch: java.io.IOException -> Lb7
            if (r8 == 0) goto Lf0
            r3.responseHeadersStart()     // Catch: java.io.IOException -> Lb7
        Lf0:
            okhttp3.Response$Builder r14 = r7.request(r14)     // Catch: java.io.IOException -> Lb7
            okhttp3.internal.connection.RealConnection r7 = r3.getConnection$okhttp()     // Catch: java.io.IOException -> Lb7
            okhttp3.Handshake r7 = r7.handshake()     // Catch: java.io.IOException -> Lb7
            okhttp3.Response$Builder r14 = r14.handshake(r7)     // Catch: java.io.IOException -> Lb7
            okhttp3.Response$Builder r14 = r14.sentRequestAtMillis(r5)     // Catch: java.io.IOException -> Lb7
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> Lb7
            okhttp3.Response$Builder r14 = r14.receivedResponseAtMillis(r5)     // Catch: java.io.IOException -> Lb7
            okhttp3.Response r10 = r14.build()     // Catch: java.io.IOException -> Lb7
            int r11 = r10.code()     // Catch: java.io.IOException -> Lb7
        L114:
            r3.responseHeadersEnd(r10)     // Catch: java.io.IOException -> Lb7
            boolean r14 = r13.forWebSocket     // Catch: java.io.IOException -> Lb7
            if (r14 == 0) goto L12e
            r14 = 101(0x65, float:1.42E-43)
            if (r11 != r14) goto L12e
            okhttp3.Response$Builder r14 = r10.newBuilder()     // Catch: java.io.IOException -> Lb7
            okhttp3.ResponseBody r5 = okhttp3.internal.Util.EMPTY_RESPONSE     // Catch: java.io.IOException -> Lb7
            okhttp3.Response$Builder r14 = r14.body(r5)     // Catch: java.io.IOException -> Lb7
            okhttp3.Response r14 = r14.build()     // Catch: java.io.IOException -> Lb7
            goto L13e
        L12e:
            okhttp3.Response$Builder r14 = r10.newBuilder()     // Catch: java.io.IOException -> Lb7
            okhttp3.ResponseBody r5 = r3.openResponseBody(r10)     // Catch: java.io.IOException -> Lb7
            okhttp3.Response$Builder r14 = r14.body(r5)     // Catch: java.io.IOException -> Lb7
            okhttp3.Response r14 = r14.build()     // Catch: java.io.IOException -> Lb7
        L13e:
            okhttp3.Request r5 = r14.request()     // Catch: java.io.IOException -> Lb7
            java.lang.String r5 = r5.header(r0)     // Catch: java.io.IOException -> Lb7
            boolean r5 = r1.equalsIgnoreCase(r5)     // Catch: java.io.IOException -> Lb7
            if (r5 != 0) goto L157
            r5 = 2
            java.lang.String r0 = okhttp3.Response.header$default(r14, r0, r9, r5, r9)     // Catch: java.io.IOException -> Lb7
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch: java.io.IOException -> Lb7
            if (r0 == 0) goto L15a
        L157:
            r3.noNewExchangesOnConnection()     // Catch: java.io.IOException -> Lb7
        L15a:
            r0 = 204(0xcc, float:2.86E-43)
            if (r11 == r0) goto L162
            r0 = 205(0xcd, float:2.87E-43)
            if (r11 != r0) goto L19d
        L162:
            okhttp3.ResponseBody r0 = r14.body()     // Catch: java.io.IOException -> Lb7
            if (r0 == 0) goto L16d
            long r0 = r0.contentLength()     // Catch: java.io.IOException -> Lb7
            goto L16f
        L16d:
            r0 = -1
        L16f:
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L19d
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch: java.io.IOException -> Lb7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb7
            r1.<init>(r2)     // Catch: java.io.IOException -> Lb7
            r1.append(r11)     // Catch: java.io.IOException -> Lb7
            java.lang.String r2 = " had non-zero Content-Length: "
            r1.append(r2)     // Catch: java.io.IOException -> Lb7
            okhttp3.ResponseBody r14 = r14.body()     // Catch: java.io.IOException -> Lb7
            if (r14 == 0) goto L192
            long r2 = r14.contentLength()     // Catch: java.io.IOException -> Lb7
            java.lang.Long r9 = java.lang.Long.valueOf(r2)     // Catch: java.io.IOException -> Lb7
        L192:
            r1.append(r9)     // Catch: java.io.IOException -> Lb7
            java.lang.String r14 = r1.toString()     // Catch: java.io.IOException -> Lb7
            r0.<init>(r14)     // Catch: java.io.IOException -> Lb7
            throw r0     // Catch: java.io.IOException -> Lb7
        L19d:
            return r14
        L19e:
            if (r4 == 0) goto L1a4
            ac.p.e(r4, r14)
            throw r4
        L1a4:
            throw r14
        L1a5:
            throw r4
        L1a6:
            throw r4
    }
}
