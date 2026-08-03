package okhttp3.internal;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY = null;
    public static final okhttp3.Headers EMPTY_HEADERS = null;
    public static final okhttp3.RequestBody EMPTY_REQUEST = null;
    public static final okhttp3.ResponseBody EMPTY_RESPONSE = null;
    private static final okio.Options UNICODE_BOMS = null;
    public static final java.util.TimeZone UTC = null;
    private static final og.k VERIFY_AS_IP_ADDRESS = null;
    public static final boolean assertionsEnabled = false;
    public static final java.lang.String okHttpName = null;
    public static final java.lang.String userAgent = "okhttp/4.12.0";

    static {
            r0 = 0
            byte[] r2 = new byte[r0]
            okhttp3.internal.Util.EMPTY_BYTE_ARRAY = r2
            okhttp3.Headers$Companion r1 = okhttp3.Headers.Companion
            java.lang.String[] r3 = new java.lang.String[r0]
            okhttp3.Headers r1 = r1.of(r3)
            okhttp3.internal.Util.EMPTY_HEADERS = r1
            okhttp3.ResponseBody$Companion r1 = okhttp3.ResponseBody.Companion
            r3 = 0
            r4 = 1
            okhttp3.ResponseBody r1 = okhttp3.ResponseBody.Companion.create$default(r1, r2, r3, r4, r3)
            okhttp3.internal.Util.EMPTY_RESPONSE = r1
            okhttp3.RequestBody$Companion r1 = okhttp3.RequestBody.Companion
            r6 = 7
            r7 = 0
            r4 = 0
            r5 = 0
            okhttp3.RequestBody r1 = okhttp3.RequestBody.Companion.create$default(r1, r2, r3, r4, r5, r6, r7)
            okhttp3.internal.Util.EMPTY_REQUEST = r1
            okio.Options$Companion r1 = okio.Options.Companion
            okio.ByteString$Companion r2 = okio.ByteString.Companion
            java.lang.String r3 = "efbbbf"
            okio.ByteString r3 = r2.decodeHex(r3)
            java.lang.String r4 = "feff"
            okio.ByteString r4 = r2.decodeHex(r4)
            java.lang.String r5 = "fffe"
            okio.ByteString r5 = r2.decodeHex(r5)
            java.lang.String r6 = "0000ffff"
            okio.ByteString r6 = r2.decodeHex(r6)
            java.lang.String r7 = "ffff0000"
            okio.ByteString r2 = r2.decodeHex(r7)
            okio.ByteString[] r2 = new okio.ByteString[]{r3, r4, r5, r6, r2}
            okio.Options r1 = r1.of(r2)
            okhttp3.internal.Util.UNICODE_BOMS = r1
            java.lang.String r1 = "GMT"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r1.getClass()
            okhttp3.internal.Util.UTC = r1
            og.k r1 = new og.k
            java.lang.String r2 = "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"
            r1.<init>(r2)
            okhttp3.internal.Util.VERIFY_AS_IP_ADDRESS = r1
            okhttp3.internal.Util.assertionsEnabled = r0
            java.lang.Class<okhttp3.OkHttpClient> r0 = okhttp3.OkHttpClient.class
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "okhttp3."
            java.lang.String r0 = og.m.A0(r0, r1)
            java.lang.String r1 = "Client"
            java.lang.String r0 = og.m.B0(r0, r1)
            okhttp3.internal.Util.okHttpName = r0
            return
    }

    public static /* synthetic */ okhttp3.EventListener a(okhttp3.EventListener r0, okhttp3.Call r1) {
            okhttp3.EventListener r0 = asFactory$lambda$8(r0, r1)
            return r0
    }

    public static final <E> void addIfAbsent(java.util.List<E> r1, E r2) {
            r1.getClass()
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto Lc
            r1.add(r2)
        Lc:
            return
    }

    public static final int and(byte r0, int r1) {
            r0 = r0 & r1
            return r0
    }

    public static final int and(short r0, int r1) {
            r0 = r0 & r1
            return r0
    }

    public static final long and(int r2, long r3) {
            long r0 = (long) r2
            long r2 = r0 & r3
            return r2
    }

    public static final okhttp3.EventListener.Factory asFactory(okhttp3.EventListener r2) {
            r2.getClass()
            ke.h r0 = new ke.h
            r1 = 2
            r0.<init>(r2, r1)
            return r0
    }

    private static final okhttp3.EventListener asFactory$lambda$8(okhttp3.EventListener r0, okhttp3.Call r1) {
            r0.getClass()
            r1.getClass()
            return r0
    }

    public static final void assertThreadDoesntHoldLock(java.lang.Object r2) {
            r2.getClass()
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1b
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Le
            goto L1b
        Le:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " MUST NOT hold lock on "
            j8.o.i(r0, r1, r2)
        L1b:
            return
    }

    public static final void assertThreadHoldsLock(java.lang.Object r2) {
            r2.getClass()
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1b
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 == 0) goto Le
            goto L1b
        Le:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " MUST hold lock on "
            j8.o.i(r0, r1, r2)
        L1b:
            return
    }

    public static /* synthetic */ java.lang.Thread b(java.lang.String r0, boolean r1, java.lang.Runnable r2) {
            java.lang.Thread r0 = threadFactory$lambda$1(r0, r1, r2)
            return r0
    }

    public static final boolean canParseAsIpAddress(java.lang.String r1) {
            r1.getClass()
            og.k r0 = okhttp3.internal.Util.VERIFY_AS_IP_ADDRESS
            boolean r1 = r0.d(r1)
            return r1
    }

    public static final boolean canReuseConnectionFor(okhttp3.HttpUrl r2, okhttp3.HttpUrl r3) {
            r2.getClass()
            r3.getClass()
            java.lang.String r0 = r2.host()
            java.lang.String r1 = r3.host()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L2e
            int r0 = r2.port()
            int r1 = r3.port()
            if (r0 != r1) goto L2e
            java.lang.String r2 = r2.scheme()
            java.lang.String r3 = r3.scheme()
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L2e
            r2 = 1
            return r2
        L2e:
            r2 = 0
            return r2
    }

    public static final int checkDuration(java.lang.String r5, long r6, java.util.concurrent.TimeUnit r8) {
            r5.getClass()
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L3a
            if (r8 == 0) goto L34
            long r6 = r8.toMillis(r6)
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 > 0) goto L2a
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 != 0) goto L28
            if (r2 > 0) goto L1d
            goto L28
        L1d:
            java.lang.String r6 = " too small."
            java.lang.String r5 = r5.concat(r6)
            j8.o.q(r5)
        L26:
            r5 = 0
            return r5
        L28:
            int r5 = (int) r6
            return r5
        L2a:
            java.lang.String r6 = " too large."
            java.lang.String r5 = r5.concat(r6)
            j8.o.q(r5)
            goto L26
        L34:
            java.lang.String r5 = "unit == null"
            j8.o.A(r5)
            goto L26
        L3a:
            java.lang.String r6 = " < 0"
            java.lang.String r5 = r5.concat(r6)
            ah.a.h(r5)
            goto L26
    }

    public static final void checkOffsetAndCount(long r4, long r6, long r8) {
            long r0 = r6 | r8
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L12
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L12
            long r4 = r4 - r6
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 < 0) goto L12
            return
        L12:
            java.lang.ArrayIndexOutOfBoundsException r4 = new java.lang.ArrayIndexOutOfBoundsException
            r4.<init>()
            throw r4
    }

    public static final void closeQuietly(java.io.Closeable r0) {
            r0.getClass()
            r0.close()     // Catch: java.lang.Exception -> L6 java.lang.RuntimeException -> L7
        L6:
            return
        L7:
            r0 = move-exception
            throw r0
    }

    public static final void closeQuietly(java.net.ServerSocket r0) {
            r0.getClass()
            r0.close()     // Catch: java.lang.Exception -> L6 java.lang.RuntimeException -> L7
        L6:
            return
        L7:
            r0 = move-exception
            throw r0
    }

    public static final void closeQuietly(java.net.Socket r2) {
            r2.getClass()
            r2.close()     // Catch: java.lang.Exception -> L6 java.lang.RuntimeException -> L7 java.lang.AssertionError -> L16
        L6:
            return
        L7:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            java.lang.String r1 = "bio == null"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L15
            return
        L15:
            throw r2
        L16:
            r2 = move-exception
            throw r2
    }

    public static final java.lang.String[] concat(java.lang.String[] r1, java.lang.String r2) {
            r1.getClass()
            r2.getClass()
            int r0 = r1.length
            int r0 = r0 + 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r0 = r1.length
            int r0 = r0 + (-1)
            r1[r0] = r2
            return r1
    }

    public static final int delimiterOffset(java.lang.String r1, char r2, int r3, int r4) {
            r1.getClass()
        L3:
            if (r3 >= r4) goto Lf
            char r0 = r1.charAt(r3)
            if (r0 != r2) goto Lc
            return r3
        Lc:
            int r3 = r3 + 1
            goto L3
        Lf:
            return r4
    }

    public static final int delimiterOffset(java.lang.String r1, java.lang.String r2, int r3, int r4) {
            r1.getClass()
            r2.getClass()
        L6:
            if (r3 >= r4) goto L16
            char r0 = r1.charAt(r3)
            boolean r0 = og.m.i0(r2, r0)
            if (r0 == 0) goto L13
            return r3
        L13:
            int r3 = r3 + 1
            goto L6
        L16:
            return r4
    }

    public static /* synthetic */ int delimiterOffset$default(java.lang.String r0, char r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r0.length()
        Ld:
            int r0 = delimiterOffset(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int delimiterOffset$default(java.lang.String r0, java.lang.String r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r0.length()
        Ld:
            int r0 = delimiterOffset(r0, r1, r2, r3)
            return r0
    }

    public static final boolean discard(okio.Source r0, int r1, java.util.concurrent.TimeUnit r2) {
            r0.getClass()
            r2.getClass()
            boolean r0 = skipAll(r0, r1, r2)     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static final <T> java.util.List<T> filterList(java.lang.Iterable<? extends T> r3, fg.l r4) {
            r3.getClass()
            r4.getClass()
            java.util.Iterator r3 = r3.iterator()
            tf.t r0 = tf.t.f13167g
        Lc:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lc
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L2d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L2d:
            java.util.List r2 = gg.x.a(r0)
            r2.add(r1)
            goto Lc
        L35:
            return r0
    }

    public static final java.lang.String format(java.lang.String r2, java.lang.Object... r3) {
            r2.getClass()
            r3.getClass()
            java.util.Locale r0 = java.util.Locale.US
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
            return r2
    }

    public static final boolean hasIntersection(java.lang.String[] r6, java.lang.String[] r7, java.util.Comparator<? super java.lang.String> r8) {
            r6.getClass()
            r8.getClass()
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto Lb
            goto L33
        Lb:
            if (r7 == 0) goto L33
            int r0 = r7.length
            if (r0 != 0) goto L11
            goto L33
        L11:
            int r0 = r6.length
            r2 = r1
        L13:
            if (r2 >= r0) goto L33
            r3 = r6[r2]
            gg.b r4 = new gg.b
            r4.<init>(r7)
        L1c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L30
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r8.compare(r3, r5)
            if (r5 != 0) goto L1c
            r6 = 1
            return r6
        L30:
            int r2 = r2 + 1
            goto L13
        L33:
            return r1
    }

    public static final long headersContentLength(okhttp3.Response r2) {
            r2.getClass()
            okhttp3.Headers r2 = r2.headers()
            java.lang.String r0 = "Content-Length"
            java.lang.String r2 = r2.get(r0)
            r0 = -1
            if (r2 == 0) goto L15
            long r0 = toLongOrDefault(r2, r0)
        L15:
            return r0
    }

    public static final void ignoreIoExceptions(fg.a r0) {
            r0.getClass()
            r0.invoke()     // Catch: java.io.IOException -> L6
        L6:
            return
    }

    @java.lang.SafeVarargs
    public static final <T> java.util.List<T> immutableListOf(T... r1) {
            r1.getClass()
            java.lang.Object r1 = r1.clone()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.util.List r1 = a.a.y0(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r1.getClass()
            return r1
    }

    public static final int indexOf(java.lang.String[] r3, java.lang.String r4, java.util.Comparator<java.lang.String> r5) {
            r3.getClass()
            r4.getClass()
            r5.getClass()
            int r0 = r3.length
            r1 = 0
        Lb:
            if (r1 >= r0) goto L19
            r2 = r3[r1]
            int r2 = r5.compare(r2, r4)
            if (r2 != 0) goto L16
            return r1
        L16:
            int r1 = r1 + 1
            goto Lb
        L19:
            r3 = -1
            return r3
    }

    public static final int indexOfControlOrNonAscii(java.lang.String r4) {
            r4.getClass()
            int r0 = r4.length()
            r1 = 0
        L8:
            if (r1 >= r0) goto L23
            char r2 = r4.charAt(r1)
            r3 = 31
            int r3 = gg.l.c(r2, r3)
            if (r3 <= 0) goto L22
            r3 = 127(0x7f, float:1.78E-43)
            int r2 = gg.l.c(r2, r3)
            if (r2 < 0) goto L1f
            goto L22
        L1f:
            int r1 = r1 + 1
            goto L8
        L22:
            return r1
        L23:
            r4 = -1
            return r4
    }

    public static final int indexOfFirstNonAsciiWhitespace(java.lang.String r2, int r3, int r4) {
            r2.getClass()
        L3:
            if (r3 >= r4) goto L25
            char r0 = r2.charAt(r3)
            r1 = 9
            if (r0 != r1) goto Le
            goto L21
        Le:
            r1 = 10
            if (r0 != r1) goto L13
            goto L21
        L13:
            r1 = 12
            if (r0 != r1) goto L18
            goto L21
        L18:
            r1 = 13
            if (r0 != r1) goto L1d
            goto L21
        L1d:
            r1 = 32
            if (r0 != r1) goto L24
        L21:
            int r3 = r3 + 1
            goto L3
        L24:
            return r3
        L25:
            return r4
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            int r0 = indexOfFirstNonAsciiWhitespace(r0, r1, r2)
            return r0
    }

    public static final int indexOfLastNonAsciiWhitespace(java.lang.String r2, int r3, int r4) {
            r2.getClass()
            int r4 = r4 + (-1)
            if (r3 > r4) goto L2b
        L7:
            char r0 = r2.charAt(r4)
            r1 = 9
            if (r0 != r1) goto L10
            goto L23
        L10:
            r1 = 10
            if (r0 != r1) goto L15
            goto L23
        L15:
            r1 = 12
            if (r0 != r1) goto L1a
            goto L23
        L1a:
            r1 = 13
            if (r0 != r1) goto L1f
            goto L23
        L1f:
            r1 = 32
            if (r0 != r1) goto L28
        L23:
            if (r4 == r3) goto L2b
            int r4 = r4 + (-1)
            goto L7
        L28:
            int r4 = r4 + 1
            return r4
        L2b:
            return r3
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            int r0 = indexOfLastNonAsciiWhitespace(r0, r1, r2)
            return r0
    }

    public static final int indexOfNonWhitespace(java.lang.String r3, int r4) {
            r3.getClass()
            int r0 = r3.length()
        L7:
            if (r4 >= r0) goto L19
            char r1 = r3.charAt(r4)
            r2 = 32
            if (r1 == r2) goto L16
            r2 = 9
            if (r1 == r2) goto L16
            return r4
        L16:
            int r4 = r4 + 1
            goto L7
        L19:
            int r3 = r3.length()
            return r3
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(java.lang.String r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            int r0 = indexOfNonWhitespace(r0, r1)
            return r0
    }

    public static final java.lang.String[] intersect(java.lang.String[] r8, java.lang.String[] r9, java.util.Comparator<? super java.lang.String> r10) {
            r8.getClass()
            r9.getClass()
            r10.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L11:
            if (r3 >= r1) goto L2b
            r4 = r8[r3]
            int r5 = r9.length
            r6 = r2
        L17:
            if (r6 >= r5) goto L28
            r7 = r9[r6]
            int r7 = r10.compare(r4, r7)
            if (r7 != 0) goto L25
            r0.add(r4)
            goto L28
        L25:
            int r6 = r6 + 1
            goto L17
        L28:
            int r3 = r3 + 1
            goto L11
        L2b:
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
    }

    public static final boolean isCivilized(okhttp3.internal.io.FileSystem r2, java.io.File r3) {
            r2.getClass()
            r3.getClass()
            okio.Sink r0 = r2.sink(r3)
            r1 = 0
            r2.delete(r3)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L1a
            ig.a.i(r0, r1)
            r2 = 1
            return r2
        L13:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L15
        L15:
            r3 = move-exception
            ig.a.i(r0, r2)
            throw r3
        L1a:
            ig.a.i(r0, r1)
            r2.delete(r3)
            r2 = 0
            return r2
    }

    public static final boolean isHealthy(java.net.Socket r2, okio.BufferedSource r3) {
            r2.getClass()
            r3.getClass()
            r0 = 1
            int r1 = r2.getSoTimeout()     // Catch: java.io.IOException -> L1c java.net.SocketTimeoutException -> L1d
            r2.setSoTimeout(r0)     // Catch: java.lang.Throwable -> L17
            boolean r3 = r3.exhausted()     // Catch: java.lang.Throwable -> L17
            r3 = r3 ^ r0
            r2.setSoTimeout(r1)     // Catch: java.io.IOException -> L1c java.net.SocketTimeoutException -> L1d
            return r3
        L17:
            r3 = move-exception
            r2.setSoTimeout(r1)     // Catch: java.io.IOException -> L1c java.net.SocketTimeoutException -> L1d
            throw r3     // Catch: java.io.IOException -> L1c java.net.SocketTimeoutException -> L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    public static final boolean isSensitiveHeader(java.lang.String r1) {
            r1.getClass()
            java.lang.String r0 = "Authorization"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L26
            java.lang.String r0 = "Cookie"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L26
            java.lang.String r0 = "Proxy-Authorization"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L26
            java.lang.String r0 = "Set-Cookie"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L24
            goto L26
        L24:
            r1 = 0
            return r1
        L26:
            r1 = 1
            return r1
    }

    public static final void notify(java.lang.Object r0) {
            r0.getClass()
            r0.notify()
            return
    }

    public static final void notifyAll(java.lang.Object r0) {
            r0.getClass()
            r0.notifyAll()
            return
    }

    public static final int parseHexDigit(char r2) {
            r0 = 48
            if (r0 > r2) goto La
            r1 = 58
            if (r2 >= r1) goto La
            int r2 = r2 - r0
            return r2
        La:
            r0 = 97
            if (r0 > r2) goto L15
            r0 = 103(0x67, float:1.44E-43)
            if (r2 >= r0) goto L15
            int r2 = r2 + (-87)
            return r2
        L15:
            r0 = 65
            if (r0 > r2) goto L20
            r0 = 71
            if (r2 >= r0) goto L20
            int r2 = r2 + (-55)
            return r2
        L20:
            r2 = -1
            return r2
    }

    public static final java.lang.String peerName(java.net.Socket r1) {
            r1.getClass()
            java.net.SocketAddress r1 = r1.getRemoteSocketAddress()
            boolean r0 = r1 instanceof java.net.InetSocketAddress
            if (r0 == 0) goto L15
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            java.lang.String r1 = r1.getHostName()
            r1.getClass()
            return r1
        L15:
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static final java.nio.charset.Charset readBomAsCharset(okio.BufferedSource r1, java.nio.charset.Charset r2) {
            r1.getClass()
            r2.getClass()
            okio.Options r0 = okhttp3.internal.Util.UNICODE_BOMS
            int r1 = r1.select(r0)
            r0 = -1
            if (r1 == r0) goto L59
            if (r1 == 0) goto L53
            r2 = 1
            if (r1 == r2) goto L4d
            r2 = 2
            if (r1 == r2) goto L47
            r2 = 3
            if (r1 == r2) goto L35
            r2 = 4
            if (r1 != r2) goto L2f
            java.nio.charset.Charset r1 = og.a.f9804a
            java.nio.charset.Charset r1 = og.a.f9806c
            if (r1 != 0) goto L2e
            java.lang.String r1 = "UTF-32LE"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            r1.getClass()
            og.a.f9806c = r1
        L2e:
            return r1
        L2f:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L35:
            java.nio.charset.Charset r1 = og.a.f9804a
            java.nio.charset.Charset r1 = og.a.f9807d
            if (r1 != 0) goto L46
            java.lang.String r1 = "UTF-32BE"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            r1.getClass()
            og.a.f9807d = r1
        L46:
            return r1
        L47:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            r1.getClass()
            return r1
        L4d:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16BE
            r1.getClass()
            return r1
        L53:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            r1.getClass()
            return r1
        L59:
            return r2
    }

    public static final <T> T readFieldOrNull(java.lang.Object r4, java.lang.Class<T> r5, java.lang.String r6) {
            r4.getClass()
            r5.getClass()
            r6.getClass()
            java.lang.Class r0 = r4.getClass()
        Ld:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r2 = r0.equals(r1)
            r3 = 0
            if (r2 != 0) goto L36
            java.lang.reflect.Field r1 = r0.getDeclaredField(r6)     // Catch: java.lang.NoSuchFieldException -> L2e
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L2e
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.NoSuchFieldException -> L2e
            boolean r2 = r5.isInstance(r1)     // Catch: java.lang.NoSuchFieldException -> L2e
            if (r2 != 0) goto L29
            goto L2d
        L29:
            java.lang.Object r3 = r5.cast(r1)     // Catch: java.lang.NoSuchFieldException -> L2e
        L2d:
            return r3
        L2e:
            java.lang.Class r0 = r0.getSuperclass()
            r0.getClass()
            goto Ld
        L36:
            java.lang.String r0 = "delegate"
            boolean r2 = r6.equals(r0)
            if (r2 != 0) goto L49
            java.lang.Object r4 = readFieldOrNull(r4, r1, r0)
            if (r4 == 0) goto L49
            java.lang.Object r4 = readFieldOrNull(r4, r5, r6)
            return r4
        L49:
            return r3
    }

    public static final int readMedium(okio.BufferedSource r3) {
            r3.getClass()
            byte r0 = r3.readByte()
            r1 = 255(0xff, float:3.57E-43)
            int r0 = and(r0, r1)
            int r0 = r0 << 16
            byte r2 = r3.readByte()
            int r2 = and(r2, r1)
            int r2 = r2 << 8
            r0 = r0 | r2
            byte r3 = r3.readByte()
            int r3 = and(r3, r1)
            r3 = r3 | r0
            return r3
    }

    public static final int skipAll(okio.Buffer r3, byte r4) {
            r3.getClass()
            r0 = 0
        L4:
            boolean r1 = r3.exhausted()
            if (r1 != 0) goto L18
            r1 = 0
            byte r1 = r3.getByte(r1)
            if (r1 != r4) goto L18
            int r0 = r0 + 1
            r3.readByte()
            goto L4
        L18:
            return r0
    }

    public static final boolean skipAll(okio.Source r11, int r12, java.util.concurrent.TimeUnit r13) {
            r11.getClass()
            r13.getClass()
            long r0 = java.lang.System.nanoTime()
            okio.Timeout r2 = r11.timeout()
            boolean r2 = r2.hasDeadline()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L23
            okio.Timeout r2 = r11.timeout()
            long r5 = r2.deadlineNanoTime()
            long r5 = r5 - r0
            goto L24
        L23:
            r5 = r3
        L24:
            okio.Timeout r2 = r11.timeout()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.deadlineNanoTime(r12)
            okio.Buffer r12 = new okio.Buffer     // Catch: java.lang.Throwable -> L4a java.io.InterruptedIOException -> L77
            r12.<init>()     // Catch: java.lang.Throwable -> L4a java.io.InterruptedIOException -> L77
        L3a:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r12, r7)     // Catch: java.lang.Throwable -> L4a java.io.InterruptedIOException -> L77
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L4c
            r12.clear()     // Catch: java.lang.Throwable -> L4a java.io.InterruptedIOException -> L77
            goto L3a
        L4a:
            r12 = move-exception
            goto L62
        L4c:
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r13 = 1
            if (r12 != 0) goto L59
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            return r13
        L59:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
            return r13
        L62:
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L6e
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            goto L76
        L6e:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L76:
            throw r12
        L77:
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 != 0) goto L83
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            goto L8b
        L83:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L8b:
            r11 = 0
            return r11
    }

    public static final java.util.concurrent.ThreadFactory threadFactory(java.lang.String r1, boolean r2) {
            r1.getClass()
            ah.b r0 = new ah.b
            r0.<init>(r1, r2)
            return r0
    }

    private static final java.lang.Thread threadFactory$lambda$1(java.lang.String r1, boolean r2, java.lang.Runnable r3) {
            r1.getClass()
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r3, r1)
            r0.setDaemon(r2)
            return r0
    }

    public static final void threadName(java.lang.String r2, fg.a r3) {
            r2.getClass()
            r3.getClass()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = r0.getName()
            r0.setName(r2)
            r3.invoke()     // Catch: java.lang.Throwable -> L18
            r0.setName(r1)
            return
        L18:
            r2 = move-exception
            r0.setName(r1)
            throw r2
    }

    public static final java.util.List<okhttp3.internal.http2.Header> toHeaderList(okhttp3.Headers r5) {
            r5.getClass()
            r0 = 0
            int r1 = r5.size()
            lg.d r0 = r9.e0.r0(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L19:
            r2 = r0
            lg.c r2 = (lg.c) r2
            boolean r3 = r2.f8047i
            if (r3 == 0) goto L35
            int r2 = r2.nextInt()
            okhttp3.internal.http2.Header r3 = new okhttp3.internal.http2.Header
            java.lang.String r4 = r5.name(r2)
            java.lang.String r2 = r5.value(r2)
            r3.<init>(r4, r2)
            r1.add(r3)
            goto L19
        L35:
            return r1
    }

    public static final okhttp3.Headers toHeaders(java.util.List<okhttp3.internal.http2.Header> r3) {
            r3.getClass()
            okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            okhttp3.internal.http2.Header r1 = (okhttp3.internal.http2.Header) r1
            okio.ByteString r2 = r1.component1()
            okio.ByteString r1 = r1.component2()
            java.lang.String r2 = r2.utf8()
            java.lang.String r1 = r1.utf8()
            r0.addLenient$okhttp(r2, r1)
            goto Lc
        L2c:
            okhttp3.Headers r3 = r0.build()
            return r3
    }

    public static final java.lang.String toHexString(int r0) {
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r0.getClass()
            return r0
    }

    public static final java.lang.String toHexString(long r0) {
            java.lang.String r0 = java.lang.Long.toHexString(r0)
            r0.getClass()
            return r0
    }

    public static final java.lang.String toHostHeader(okhttp3.HttpUrl r3, boolean r4) {
            r3.getClass()
            java.lang.String r0 = r3.host()
            java.lang.String r1 = ":"
            r2 = 0
            boolean r0 = og.m.h0(r0, r1, r2)
            if (r0 == 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.lang.String r1 = r3.host()
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L2c
        L28:
            java.lang.String r0 = r3.host()
        L2c:
            if (r4 != 0) goto L40
            int r4 = r3.port()
            okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
            java.lang.String r2 = r3.scheme()
            int r1 = r1.defaultPort(r2)
            if (r4 == r1) goto L3f
            goto L40
        L3f:
            return r0
        L40:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r0 = 58
            r4.append(r0)
            int r3 = r3.port()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            return r3
    }

    public static /* synthetic */ java.lang.String toHostHeader$default(okhttp3.HttpUrl r0, boolean r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.String r0 = toHostHeader(r0, r1)
            return r0
    }

    public static final <T> java.util.List<T> toImmutableList(java.util.List<? extends T> r1) {
            r1.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            r1.getClass()
            return r1
    }

    public static final <K, V> java.util.Map<K, V> toImmutableMap(java.util.Map<K, ? extends V> r1) {
            r1.getClass()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lc
            tf.u r1 = tf.u.f13168g
            return r1
        Lc:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r0)
            r1.getClass()
            return r1
    }

    public static final long toLongOrDefault(java.lang.String r0, long r1) {
            r0.getClass()
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L8
            return r0
        L8:
            return r1
    }

    public static final int toNonNegativeInt(java.lang.String r2, int r3) {
            if (r2 == 0) goto L1b
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L1b
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L11
            r2 = 2147483647(0x7fffffff, float:NaN)
            return r2
        L11:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L19
            r2 = 0
            return r2
        L19:
            int r2 = (int) r2
            return r2
        L1b:
            return r3
    }

    public static final java.lang.String trimSubstring(java.lang.String r0, int r1, int r2) {
            r0.getClass()
            int r1 = indexOfFirstNonAsciiWhitespace(r0, r1, r2)
            int r2 = indexOfLastNonAsciiWhitespace(r0, r1, r2)
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String trimSubstring$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            java.lang.String r0 = trimSubstring(r0, r1, r2)
            return r0
    }

    public static final void wait(java.lang.Object r0) {
            r0.getClass()
            r0.wait()
            return
    }

    public static final java.lang.Throwable withSuppressed(java.lang.Exception r1, java.util.List<? extends java.lang.Exception> r2) {
            r1.getClass()
            r2.getClass()
            java.util.Iterator r2 = r2.iterator()
        La:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r2.next()
            java.lang.Exception r0 = (java.lang.Exception) r0
            ac.p.e(r1, r0)
            goto La
        L1a:
            return r1
    }

    public static final void writeMedium(okio.BufferedSink r1, int r2) {
            r1.getClass()
            int r0 = r2 >>> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.writeByte(r0)
            int r0 = r2 >>> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.writeByte(r0)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.writeByte(r2)
            return
    }
}
