package okhttp3.internal.publicsuffix;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {
    public static final okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion Companion = null;
    private static final char EXCEPTION_MARKER = '!';
    private static final java.util.List<java.lang.String> PREVAILING_RULE = null;
    public static final java.lang.String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private static final byte[] WILDCARD_LABEL = null;
    private static final okhttp3.internal.publicsuffix.PublicSuffixDatabase instance = null;
    private final java.util.concurrent.atomic.AtomicBoolean listRead;
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    private final java.util.concurrent.CountDownLatch readCompleteLatch;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ java.lang.String access$binarySearch(okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion r0, byte[] r1, byte[][] r2, int r3) {
                java.lang.String r0 = r0.binarySearch(r1, r2, r3)
                return r0
        }

        private final java.lang.String binarySearch(byte[] r19, byte[][] r20, int r21) {
                r18 = this;
                r0 = r19
                r1 = r20
                int r2 = r0.length
                r4 = 0
            L6:
                if (r4 >= r2) goto L91
                int r5 = r4 + r2
                int r5 = r5 / 2
            Lc:
                r6 = 10
                r7 = -1
                if (r5 <= r7) goto L18
                r8 = r0[r5]
                if (r8 == r6) goto L18
                int r5 = r5 + (-1)
                goto Lc
            L18:
                int r8 = r5 + 1
                r9 = 1
                r10 = r9
            L1c:
                int r11 = r8 + r10
                r12 = r0[r11]
                if (r12 == r6) goto L25
                int r10 = r10 + 1
                goto L1c
            L25:
                int r6 = r11 - r8
                r12 = r21
                r10 = 0
                r13 = 0
                r14 = 0
            L2c:
                r15 = 255(0xff, float:3.57E-43)
                if (r10 == 0) goto L34
                r10 = 46
                r3 = 0
                goto L41
            L34:
                r16 = r1[r12]
                r3 = r16[r13]
                int r3 = okhttp3.internal.Util.and(r3, r15)
                r17 = r10
                r10 = r3
                r3 = r17
            L41:
                int r16 = r8 + r14
                r7 = r0[r16]
                int r7 = okhttp3.internal.Util.and(r7, r15)
                int r10 = r10 - r7
                if (r10 != 0) goto L65
                int r14 = r14 + 1
                int r13 = r13 + 1
                if (r14 == r6) goto L65
                r7 = r1[r12]
                int r7 = r7.length
                if (r7 != r13) goto L62
                int r3 = r1.length
                int r3 = r3 - r9
                if (r12 != r3) goto L5c
                goto L65
            L5c:
                int r12 = r12 + 1
                r10 = r9
                r7 = -1
                r13 = -1
                goto L2c
            L62:
                r10 = r3
                r7 = -1
                goto L2c
            L65:
                if (r10 >= 0) goto L69
            L67:
                r2 = r5
                goto L6
            L69:
                if (r10 <= 0) goto L6e
            L6b:
                int r4 = r11 + 1
                goto L6
            L6e:
                int r3 = r6 - r14
                r7 = r1[r12]
                int r7 = r7.length
                int r7 = r7 - r13
                int r12 = r12 + 1
                int r9 = r1.length
            L77:
                if (r12 >= r9) goto L80
                r10 = r1[r12]
                int r10 = r10.length
                int r7 = r7 + r10
                int r12 = r12 + 1
                goto L77
            L80:
                if (r7 >= r3) goto L83
                goto L67
            L83:
                if (r7 <= r3) goto L86
                goto L6b
            L86:
                java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
                r1.getClass()
                java.lang.String r2 = new java.lang.String
                r2.<init>(r0, r8, r6, r1)
                return r2
            L91:
                r0 = 0
                return r0
        }

        public final okhttp3.internal.publicsuffix.PublicSuffixDatabase get() {
                r1 = this;
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.access$getInstance$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r0 = new okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 42
            r2 = 0
            r0[r2] = r1
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.WILDCARD_LABEL = r0
            java.lang.String r0 = "*"
            java.util.List r0 = a.a.x0(r0)
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.PREVAILING_RULE = r0
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = new okhttp3.internal.publicsuffix.PublicSuffixDatabase
            r0.<init>()
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.instance = r0
            return
    }

    public PublicSuffixDatabase() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.listRead = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.readCompleteLatch = r0
            return
    }

    public static final /* synthetic */ okhttp3.internal.publicsuffix.PublicSuffixDatabase access$getInstance$cp() {
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.instance
            return r0
    }

    private final java.util.List<java.lang.String> findMatchingRule(java.util.List<java.lang.String> r12) {
            r11 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.listRead
            boolean r0 = r0.get()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L16
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.listRead
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L16
            r11.readTheListUninterruptibly()
            goto L23
        L16:
            java.util.concurrent.CountDownLatch r0 = r11.readCompleteLatch     // Catch: java.lang.InterruptedException -> L1c
            r0.await()     // Catch: java.lang.InterruptedException -> L1c
            goto L23
        L1c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L23:
            byte[] r0 = r11.publicSuffixListBytes
            r3 = 0
            if (r0 == 0) goto Le5
            int r0 = r12.size()
            byte[][] r4 = new byte[r0][]
            r5 = r1
        L2f:
            if (r5 >= r0) goto L48
            java.lang.Object r6 = r12.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            r7.getClass()
            byte[] r6 = r6.getBytes(r7)
            r6.getClass()
            r4[r5] = r6
            int r5 = r5 + 1
            goto L2f
        L48:
            r12 = r1
        L49:
            java.lang.String r5 = "publicSuffixListBytes"
            if (r12 >= r0) goto L61
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            byte[] r7 = r11.publicSuffixListBytes
            if (r7 == 0) goto L5d
            java.lang.String r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(r6, r7, r4, r12)
            if (r6 == 0) goto L5a
            goto L62
        L5a:
            int r12 = r12 + 1
            goto L49
        L5d:
            gg.l.g(r5)
            throw r3
        L61:
            r6 = r3
        L62:
            if (r0 <= r2) goto L87
            java.lang.Object r12 = r4.clone()
            byte[][] r12 = (byte[][]) r12
            int r7 = r12.length
            int r7 = r7 - r2
            r8 = r1
        L6d:
            if (r8 >= r7) goto L87
            byte[] r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.WILDCARD_LABEL
            r12[r8] = r9
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            byte[] r10 = r11.publicSuffixListBytes
            if (r10 == 0) goto L83
            java.lang.String r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(r9, r10, r12, r8)
            if (r9 == 0) goto L80
            goto L88
        L80:
            int r8 = r8 + 1
            goto L6d
        L83:
            gg.l.g(r5)
            throw r3
        L87:
            r9 = r3
        L88:
            if (r9 == 0) goto La5
            int r0 = r0 - r2
            r12 = r1
        L8c:
            if (r12 >= r0) goto La5
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r5 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            byte[] r7 = r11.publicSuffixExceptionListBytes
            if (r7 == 0) goto L9f
            java.lang.String r5 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(r5, r7, r4, r12)
            if (r5 == 0) goto L9c
            r3 = r5
            goto La5
        L9c:
            int r12 = r12 + 1
            goto L8c
        L9f:
            java.lang.String r12 = "publicSuffixExceptionListBytes"
            gg.l.g(r12)
            throw r3
        La5:
            r12 = 6
            r0 = 46
            if (r3 == 0) goto Lb9
            java.lang.String r4 = "!"
            java.lang.String r3 = r4.concat(r3)
            char[] r2 = new char[r2]
            r2[r1] = r0
            java.util.List r12 = og.m.F0(r3, r2, r12)
            return r12
        Lb9:
            if (r6 != 0) goto Lc0
            if (r9 != 0) goto Lc0
            java.util.List<java.lang.String> r12 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.PREVAILING_RULE
            return r12
        Lc0:
            tf.t r3 = tf.t.f13167g
            if (r6 == 0) goto Lcd
            char[] r4 = new char[r2]
            r4[r1] = r0
            java.util.List r4 = og.m.F0(r6, r4, r12)
            goto Lce
        Lcd:
            r4 = r3
        Lce:
            if (r9 == 0) goto Ld8
            char[] r2 = new char[r2]
            r2[r1] = r0
            java.util.List r3 = og.m.F0(r9, r2, r12)
        Ld8:
            int r12 = r4.size()
            int r0 = r3.size()
            if (r12 <= r0) goto Le3
            goto Le4
        Le3:
            r4 = r3
        Le4:
            return r4
        Le5:
            java.lang.String r12 = "Unable to load publicsuffixes.gz resource from the classpath."
            j8.o.A(r12)
            return r3
    }

    private final void readTheList() {
            r4 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L10
        La:
            java.util.concurrent.CountDownLatch r0 = r4.readCompleteLatch
            r0.countDown()
            return
        L10:
            okio.GzipSource r1 = new okio.GzipSource     // Catch: java.lang.Throwable -> L44
            okio.Source r0 = okio.Okio.source(r0)     // Catch: java.lang.Throwable -> L44
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L44
            okio.BufferedSource r0 = okio.Okio.buffer(r1)     // Catch: java.lang.Throwable -> L44
            int r1 = r0.readInt()     // Catch: java.lang.Throwable -> L49
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L49
            byte[] r1 = r0.readByteArray(r1)     // Catch: java.lang.Throwable -> L49
            int r2 = r0.readInt()     // Catch: java.lang.Throwable -> L49
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L49
            byte[] r2 = r0.readByteArray(r2)     // Catch: java.lang.Throwable -> L49
            r3 = 0
            ig.a.i(r0, r3)     // Catch: java.lang.Throwable -> L44
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L44
            r1.getClass()     // Catch: java.lang.Throwable -> L46
            byte[] r1 = (byte[]) r1     // Catch: java.lang.Throwable -> L46
            r4.publicSuffixListBytes = r1     // Catch: java.lang.Throwable -> L46
            r2.getClass()     // Catch: java.lang.Throwable -> L46
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> L46
            r4.publicSuffixExceptionListBytes = r2     // Catch: java.lang.Throwable -> L46
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L44
            goto La
        L44:
            r0 = move-exception
            goto L50
        L46:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L44
            throw r0     // Catch: java.lang.Throwable -> L44
        L49:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L4b
        L4b:
            r2 = move-exception
            ig.a.i(r0, r1)     // Catch: java.lang.Throwable -> L44
            throw r2     // Catch: java.lang.Throwable -> L44
        L50:
            java.util.concurrent.CountDownLatch r1 = r4.readCompleteLatch
            r1.countDown()
            throw r0
    }

    private final void readTheListUninterruptibly() {
            r5 = this;
            r0 = 0
        L1:
            r5.readTheList()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10 java.io.InterruptedIOException -> L21
            if (r0 == 0) goto L20
        L6:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L20
        Le:
            r1 = move-exception
            goto L26
        L10:
            r1 = move-exception
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> Le
            okhttp3.internal.platform.Platform r2 = r2.get()     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.log(r3, r4, r1)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L20
            goto L6
        L20:
            return
        L21:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> Le
            r0 = 1
            goto L1
        L26:
            if (r0 == 0) goto L2f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L2f:
            throw r1
    }

    private final java.util.List<java.lang.String> splitDomain(java.lang.String r5) {
            r4 = this;
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 46
            r3 = 0
            r1[r3] = r2
            r2 = 6
            java.util.List r5 = og.m.F0(r5, r1, r2)
            java.lang.Object r1 = tf.m.B1(r5)
            java.lang.String r2 = ""
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L1d
            java.util.List r5 = tf.m.r1(r0, r5)
        L1d:
            return r5
    }

    public final java.lang.String getEffectiveTldPlusOne(java.lang.String r8) {
            r7 = this;
            r8.getClass()
            java.lang.String r0 = java.net.IDN.toUnicode(r8)
            r0.getClass()
            java.util.List r0 = r7.splitDomain(r0)
            java.util.List r1 = r7.findMatchingRule(r0)
            int r2 = r0.size()
            int r3 = r1.size()
            r4 = 0
            r5 = 33
            r6 = 0
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r1.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            char r2 = r2.charAt(r6)
            if (r2 == r5) goto L2d
            return r4
        L2d:
            java.lang.Object r2 = r1.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            char r2 = r2.charAt(r6)
            if (r2 != r5) goto L43
            int r0 = r0.size()
            int r1 = r1.size()
        L41:
            int r0 = r0 - r1
            goto L4e
        L43:
            int r0 = r0.size()
            int r1 = r1.size()
            int r1 = r1 + 1
            goto L41
        L4e:
            java.util.List r8 = r7.splitDomain(r8)
            dg.n r8 = tf.m.m1(r8)
            if (r0 < 0) goto L76
            if (r0 != 0) goto L5b
            goto L6d
        L5b:
            boolean r1 = r8 instanceof ng.f
            if (r1 == 0) goto L66
            ng.f r8 = (ng.f) r8
            ng.j r8 = r8.b(r0)
            goto L6d
        L66:
            ng.e r1 = new ng.e
            r2 = 0
            r1.<init>(r8, r0, r2)
            r8 = r1
        L6d:
            java.lang.String r0 = "."
            r1 = 62
            java.lang.String r8 = ng.m.V(r8, r0, r4, r1)
            return r8
        L76:
            java.lang.String r8 = "Requested element count "
            java.lang.String r1 = " is less than zero."
            java.lang.String r8 = eh.a.m(r0, r8, r1)
            j8.o.q(r8)
            r8 = 0
            return r8
    }

    public final void setListBytes(byte[] r1, byte[] r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.publicSuffixListBytes = r1
            r0.publicSuffixExceptionListBytes = r2
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.listRead
            r2 = 1
            r1.set(r2)
            java.util.concurrent.CountDownLatch r1 = r0.readCompleteLatch
            r1.countDown()
            return
    }
}
