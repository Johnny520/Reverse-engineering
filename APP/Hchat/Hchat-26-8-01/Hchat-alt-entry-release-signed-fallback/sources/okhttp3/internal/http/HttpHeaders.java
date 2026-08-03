package okhttp3.internal.http;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class HttpHeaders {
    private static final okio.ByteString QUOTED_STRING_DELIMITERS = null;
    private static final okio.ByteString TOKEN_DELIMITERS = null;

    static {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "\"\\"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okhttp3.internal.http.HttpHeaders.QUOTED_STRING_DELIMITERS = r1
            java.lang.String r1 = "\t ,="
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okhttp3.internal.http.HttpHeaders.TOKEN_DELIMITERS = r0
            return
    }

    @sf.a
    public static final boolean hasBody(okhttp3.Response r0) {
            r0.getClass()
            boolean r0 = promisesBody(r0)
            return r0
    }

    public static final java.util.List<okhttp3.Challenge> parseChallenges(okhttp3.Headers r7, java.lang.String r8) {
            r7.getClass()
            r8.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.size()
            r2 = 0
        L10:
            if (r2 >= r1) goto L3d
            java.lang.String r3 = r7.name(r2)
            boolean r3 = r8.equalsIgnoreCase(r3)
            if (r3 == 0) goto L3a
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            java.lang.String r4 = r7.value(r2)
            okio.Buffer r3 = r3.writeUtf8(r4)
            readChallengeHeader(r3, r0)     // Catch: java.io.EOFException -> L2d
            goto L3a
        L2d:
            r3 = move-exception
            okhttp3.internal.platform.Platform$Companion r4 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r4 = r4.get()
            java.lang.String r5 = "Unable to parse challenge"
            r6 = 5
            r4.log(r5, r6, r3)
        L3a:
            int r2 = r2 + 1
            goto L10
        L3d:
            return r0
    }

    public static final boolean promisesBody(okhttp3.Response r8) {
            r8.getClass()
            okhttp3.Request r0 = r8.request()
            java.lang.String r0 = r0.method()
            java.lang.String r1 = "HEAD"
            boolean r0 = gg.l.a(r0, r1)
            r1 = 0
            if (r0 == 0) goto L15
            return r1
        L15:
            int r0 = r8.code()
            r2 = 100
            r3 = 1
            if (r0 < r2) goto L22
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r2) goto L2b
        L22:
            r2 = 204(0xcc, float:2.86E-43)
            if (r0 == r2) goto L2b
            r2 = 304(0x130, float:4.26E-43)
            if (r0 == r2) goto L2b
            return r3
        L2b:
            long r4 = okhttp3.internal.Util.headersContentLength(r8)
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L47
            java.lang.String r0 = "Transfer-Encoding"
            r2 = 2
            r4 = 0
            java.lang.String r8 = okhttp3.Response.header$default(r8, r0, r4, r2, r4)
            java.lang.String r0 = "chunked"
            boolean r8 = r0.equalsIgnoreCase(r8)
            if (r8 == 0) goto L46
            goto L47
        L46:
            return r1
        L47:
            return r3
    }

    private static final void readChallengeHeader(okio.Buffer r7, java.util.List<okhttp3.Challenge> r8) {
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Lf
            goto Lb6
        Lf:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.exhausted()
            if (r7 != 0) goto L21
            goto Lb6
        L21:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            tf.u r0 = tf.u.f13168g
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L65
            if (r6 != 0) goto L40
            boolean r2 = r7.exhausted()
            if (r2 == 0) goto L65
        L40:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = og.t.Z(r5, r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r3.getClass()
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L65:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.skipAll(r7, r4)
            int r6 = r6 + r5
        L6f:
            if (r3 != 0) goto L80
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 != 0) goto Lb9
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            r6 = r5
        L80:
            if (r6 == 0) goto Lb9
            r5 = 1
            if (r6 <= r5) goto L86
            goto Lb6
        L86:
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L8d
            goto Lb6
        L8d:
            r5 = 34
            boolean r5 = startsWith(r7, r5)
            if (r5 == 0) goto L9a
            java.lang.String r5 = readQuotedString(r7)
            goto L9e
        L9a:
            java.lang.String r5 = readToken(r7)
        L9e:
            if (r5 != 0) goto La1
            goto Lb6
        La1:
            java.lang.Object r3 = r2.put(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Laa
            goto Lb6
        Laa:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lb7
            boolean r3 = r7.exhausted()
            if (r3 != 0) goto Lb7
        Lb6:
            return
        Lb7:
            r3 = r0
            goto L6f
        Lb9:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
    }

    private static final java.lang.String readQuotedString(okio.Buffer r12) {
            byte r0 = r12.readByte()
            r1 = 34
            if (r0 != r1) goto L43
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
        Ld:
            okio.ByteString r2 = okhttp3.internal.http.HttpHeaders.QUOTED_STRING_DELIMITERS
            long r2 = r12.indexOfElement(r2)
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L1b
            return r5
        L1b:
            byte r4 = r12.getByte(r2)
            if (r4 != r1) goto L2c
            r0.write(r12, r2)
            r12.readByte()
            java.lang.String r12 = r0.readUtf8()
            return r12
        L2c:
            long r6 = r12.size()
            r8 = 1
            long r10 = r2 + r8
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 != 0) goto L39
            return r5
        L39:
            r0.write(r12, r2)
            r12.readByte()
            r0.write(r12, r8)
            goto Ld
        L43:
            java.lang.String r12 = "Failed requirement."
            j8.o.t(r12)
            r12 = 0
            return r12
    }

    private static final java.lang.String readToken(okio.Buffer r4) {
            okio.ByteString r0 = okhttp3.internal.http.HttpHeaders.TOKEN_DELIMITERS
            long r0 = r4.indexOfElement(r0)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L10
            long r0 = r4.size()
        L10:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1b
            java.lang.String r4 = r4.readUtf8(r0)
            return r4
        L1b:
            r4 = 0
            return r4
    }

    public static final void receiveHeaders(okhttp3.CookieJar r1, okhttp3.HttpUrl r2, okhttp3.Headers r3) {
            r1.getClass()
            r2.getClass()
            r3.getClass()
            okhttp3.CookieJar r0 = okhttp3.CookieJar.NO_COOKIES
            if (r1 != r0) goto Le
            goto L1a
        Le:
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            java.util.List r3 = r0.parseAll(r2, r3)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L1b
        L1a:
            return
        L1b:
            r1.saveFromResponse(r2, r3)
            return
    }

    private static final boolean skipCommasAndWhitespace(okio.Buffer r3) {
            r0 = 0
        L1:
            boolean r1 = r3.exhausted()
            if (r1 != 0) goto L23
            r1 = 0
            byte r1 = r3.getByte(r1)
            r2 = 44
            if (r1 != r2) goto L16
            r3.readByte()
            r0 = 1
            goto L1
        L16:
            r2 = 32
            if (r1 != r2) goto L1b
            goto L1f
        L1b:
            r2 = 9
            if (r1 != r2) goto L23
        L1f:
            r3.readByte()
            goto L1
        L23:
            return r0
    }

    private static final boolean startsWith(okio.Buffer r2, byte r3) {
            boolean r0 = r2.exhausted()
            if (r0 != 0) goto L10
            r0 = 0
            byte r2 = r2.getByte(r0)
            if (r2 != r3) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }
}
