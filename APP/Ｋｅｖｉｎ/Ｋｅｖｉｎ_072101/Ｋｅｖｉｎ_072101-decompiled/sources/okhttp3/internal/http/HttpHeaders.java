package okhttp3.internal.http;

/* JADX INFO: compiled from: HttpHeaders.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\n\u0010\r\u001a\u00020\u0004*\u00020\u0006\u001a\u001a\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0002\u001a\u000e\u0010\u0013\u001a\u0004\u0018\u00010\f*\u00020\u0010H\u0002\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\f*\u00020\u0010H\u0002\u001a\u001a\u0010\u0015\u001a\u00020\u000f*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n\u001a\f\u0010\u001a\u001a\u00020\u0004*\u00020\u0010H\u0002\u001a\u0014\u0010\u001b\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m115d2 = {"QUOTED_STRING_DELIMITERS", "Lokio/ByteString;", "TOKEN_DELIMITERS", "hasBody", "", "response", "Lokhttp3/Response;", "parseChallenges", "", "Lokhttp3/Challenge;", "Lokhttp3/Headers;", "headerName", "", "promisesBody", "readChallengeHeader", "", "Lokio/Buffer;", "result", "", "readQuotedString", "readToken", "receiveHeaders", "Lokhttp3/CookieJar;", "url", "Lokhttp3/HttpUrl;", "headers", "skipCommasAndWhitespace", "startsWith", "prefix", "", "okhttp"}, m116k = 2, m117mv = {1, 8, 0}, m119xi = 48)
public final class HttpHeaders {
    private static final okio.ByteString QUOTED_STRING_DELIMITERS = null;
    private static final okio.ByteString TOKEN_DELIMITERS = null;

    static {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "\"\\"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okhttp3.internal.http.HttpHeaders.QUOTED_STRING_DELIMITERS = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "\t ,="
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okhttp3.internal.http.HttpHeaders.TOKEN_DELIMITERS = r0
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "No longer supported", replaceWith = @kotlin.ReplaceWith(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(okhttp3.Response r1) {
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = promisesBody(r1)
            return r0
    }

    public static final java.util.List<okhttp3.Challenge> parseChallenges(okhttp3.Headers r9, java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "headerName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            int r2 = r9.size()
        L16:
            if (r1 >= r2) goto L48
            java.lang.String r3 = r9.name(r1)
            r4 = 1
            boolean r3 = kotlin.text.StringsKt.equals(r10, r3, r4)
            if (r3 == 0) goto L45
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            java.lang.String r4 = r9.value(r1)
            okio.Buffer r3 = r3.writeUtf8(r4)
            readChallengeHeader(r3, r0)     // Catch: java.io.EOFException -> L35
            goto L45
        L35:
            r4 = move-exception
            okhttp3.internal.platform.Platform$Companion r5 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r5 = r5.get()
            r6 = 5
            r7 = r4
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.String r8 = "Unable to parse challenge"
            r5.log(r8, r6, r7)
        L45:
            int r1 = r1 + 1
            goto L16
        L48:
            return r0
    }

    public static final boolean promisesBody(okhttp3.Response r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            okhttp3.Request r0 = r8.request()
            java.lang.String r0 = r0.method()
            java.lang.String r1 = "HEAD"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r1 = 0
            if (r0 == 0) goto L17
            return r1
        L17:
            int r0 = r8.code()
            r2 = 100
            r3 = 1
            if (r0 < r2) goto L24
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r2) goto L2d
        L24:
            r2 = 204(0xcc, float:2.86E-43)
            if (r0 == r2) goto L2d
            r2 = 304(0x130, float:4.26E-43)
            if (r0 == r2) goto L2d
            return r3
        L2d:
            long r4 = okhttp3.internal.Util.headersContentLength(r8)
            r6 = -1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L49
            java.lang.String r2 = "Transfer-Encoding"
            r4 = 2
            r5 = 0
            java.lang.String r2 = okhttp3.Response.header$default(r8, r2, r5, r4, r5)
            java.lang.String r4 = "chunked"
            boolean r2 = kotlin.text.StringsKt.equals(r4, r2, r3)
            if (r2 == 0) goto L48
            goto L49
        L48:
            return r1
        L49:
            return r3
    }

    private static final void readChallengeHeader(okio.Buffer r10, java.util.List<okhttp3.Challenge> r11) throws java.io.EOFException {
            r0 = 0
        L1:
            if (r0 != 0) goto Le
            skipCommasAndWhitespace(r10)
            java.lang.String r0 = readToken(r10)
            if (r0 != 0) goto Le
            return
        Le:
            r1 = r0
            boolean r2 = skipCommasAndWhitespace(r10)
            java.lang.String r0 = readToken(r10)
            if (r0 != 0) goto L2d
            boolean r3 = r10.exhausted()
            if (r3 != 0) goto L20
            return
        L20:
            okhttp3.Challenge r3 = new okhttp3.Challenge
            java.util.Map r4 = kotlin.collections.MapsKt.emptyMap()
            r3.<init>(r1, r4)
            r11.add(r3)
            return
        L2d:
            r3 = 61
            int r4 = okhttp3.internal.Util.skipAll(r10, r3)
            boolean r5 = skipCommasAndWhitespace(r10)
            if (r2 != 0) goto L6e
            if (r5 != 0) goto L41
            boolean r6 = r10.exhausted()
            if (r6 == 0) goto L6e
        L41:
            okhttp3.Challenge r3 = new okhttp3.Challenge
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r7 = "="
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r7 = kotlin.text.StringsKt.repeat(r7, r4)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 0
            java.util.Map r6 = java.util.Collections.singletonMap(r7, r6)
            java.lang.String r7 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r3.<init>(r1, r6)
            r11.add(r3)
            r0 = 0
            goto L1
        L6e:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Map r6 = (java.util.Map) r6
            int r7 = okhttp3.internal.Util.skipAll(r10, r3)
            int r4 = r4 + r7
        L7a:
            if (r0 != 0) goto L8b
            java.lang.String r0 = readToken(r10)
            boolean r7 = skipCommasAndWhitespace(r10)
            if (r7 != 0) goto Lc4
            int r4 = okhttp3.internal.Util.skipAll(r10, r3)
        L8b:
            if (r4 == 0) goto Lc4
            r7 = 1
            if (r4 <= r7) goto L91
            return
        L91:
            boolean r7 = skipCommasAndWhitespace(r10)
            if (r7 == 0) goto L98
            return
        L98:
            r7 = 34
            boolean r7 = startsWith(r10, r7)
            if (r7 == 0) goto La6
            java.lang.String r7 = readQuotedString(r10)
            goto Laa
        La6:
            java.lang.String r7 = readToken(r10)
        Laa:
            if (r7 != 0) goto Lad
            return
        Lad:
            java.lang.Object r8 = r6.put(r0, r7)
            java.lang.String r8 = (java.lang.String) r8
            r0 = 0
            if (r8 == 0) goto Lb7
            return
        Lb7:
            boolean r9 = skipCommasAndWhitespace(r10)
            if (r9 != 0) goto L7a
            boolean r9 = r10.exhausted()
            if (r9 != 0) goto L7a
            return
        Lc4:
            okhttp3.Challenge r3 = new okhttp3.Challenge
            r3.<init>(r1, r6)
            r11.add(r3)
            goto L1
    }

    private static final java.lang.String readQuotedString(okio.Buffer r12) throws java.io.EOFException {
            byte r0 = r12.readByte()
            r1 = 34
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto L49
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
        L12:
            okio.ByteString r2 = okhttp3.internal.http.HttpHeaders.QUOTED_STRING_DELIMITERS
            long r2 = r12.indexOfElement(r2)
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L21
            return r5
        L21:
            byte r4 = r12.getByte(r2)
            if (r4 != r1) goto L32
            r0.write(r12, r2)
            r12.readByte()
            java.lang.String r1 = r0.readUtf8()
            return r1
        L32:
            long r6 = r12.size()
            r8 = 1
            long r10 = r2 + r8
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 != 0) goto L3f
            return r5
        L3f:
            r0.write(r12, r2)
            r12.readByte()
            r0.write(r12, r8)
            goto L12
        L49:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
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
            if (r2 == 0) goto L1c
            java.lang.String r2 = r4.readUtf8(r0)
            goto L1d
        L1c:
            r2 = 0
        L1d:
            return r2
    }

    public static final void receiveHeaders(okhttp3.CookieJar r2, okhttp3.HttpUrl r3, okhttp3.Headers r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okhttp3.CookieJar r0 = okhttp3.CookieJar.NO_COOKIES
            if (r2 != r0) goto L14
            return
        L14:
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            java.util.List r0 = r0.parseAll(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L21
            return
        L21:
            r2.saveFromResponse(r3, r0)
            return
    }

    private static final boolean skipCommasAndWhitespace(okio.Buffer r4) {
            r0 = 0
        L1:
            boolean r1 = r4.exhausted()
            if (r1 != 0) goto L29
            r1 = 0
            byte r1 = r4.getByte(r1)
            r2 = 44
            if (r1 != r2) goto L16
            r4.readByte()
            r0 = 1
            goto L1
        L16:
            r2 = 32
            r3 = 1
            if (r1 != r2) goto L1c
        L1b:
            goto L22
        L1c:
            r2 = 9
            if (r1 != r2) goto L21
            goto L1b
        L21:
            r3 = 0
        L22:
            if (r3 == 0) goto L28
            r4.readByte()
            goto L1
        L28:
        L29:
            return r0
    }

    private static final boolean startsWith(okio.Buffer r2, byte r3) {
            boolean r0 = r2.exhausted()
            if (r0 != 0) goto L10
            r0 = 0
            byte r0 = r2.getByte(r0)
            if (r0 != r3) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }
}
