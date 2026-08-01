package okhttp3.internal.publicsuffix;

/* JADX INFO: compiled from: PublicSuffixDatabase.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m115d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "()V", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "publicSuffixExceptionListBytes", "", "publicSuffixListBytes", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "findMatchingRule", "", "", "domainLabels", "getEffectiveTldPlusOne", "domain", "readTheList", "", "readTheListUninterruptibly", "setListBytes", "splitDomain", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

    /* JADX INFO: compiled from: PublicSuffixDatabase.kt */
    @kotlin.Metadata(m114d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m115d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "()V", "EXCEPTION_MARKER", "", "PREVAILING_RULE", "", "", "PUBLIC_SUFFIX_RESOURCE", "WILDCARD_LABEL", "", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "binarySearch", "labels", "", "labelIndex", "", "([B[[BI)Ljava/lang/String;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ java.lang.String access$binarySearch(okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion r1, byte[] r2, byte[][] r3, int r4) {
                java.lang.String r0 = r1.binarySearch(r2, r3, r4)
                return r0
        }

        private final java.lang.String binarySearch(byte[] r18, byte[][] r19, int r20) {
                r17 = this;
                r0 = r18
                r1 = 0
                int r2 = r0.length
                r3 = 0
            L5:
                if (r1 >= r2) goto La9
                int r4 = r1 + r2
                int r4 = r4 / 2
            Lb:
                r5 = 10
                r6 = -1
                if (r4 <= r6) goto L17
                r6 = r0[r4]
                if (r6 == r5) goto L17
                int r4 = r4 + (-1)
                goto Lb
            L17:
                int r4 = r4 + 1
                r6 = 1
            L1a:
                int r7 = r4 + r6
                r7 = r0[r7]
                if (r7 == r5) goto L23
                int r6 = r6 + 1
                goto L1a
            L23:
                int r5 = r4 + r6
                int r5 = r5 - r4
                r7 = 0
                r8 = r20
                r9 = 0
                r10 = 0
                r11 = 0
            L2c:
                r12 = 0
                r13 = 255(0xff, float:3.57E-43)
                if (r11 == 0) goto L35
                r12 = 46
                r11 = 0
                goto L3d
            L35:
                r14 = r19[r8]
                r14 = r14[r9]
                int r12 = okhttp3.internal.Util.and(r14, r13)
            L3d:
                int r14 = r4 + r10
                r14 = r0[r14]
                int r13 = okhttp3.internal.Util.and(r14, r13)
                int r7 = r12 - r13
                if (r7 != 0) goto L63
                int r10 = r10 + 1
                int r9 = r9 + 1
                if (r10 == r5) goto L63
                r14 = r19[r8]
                int r14 = r14.length
                if (r14 != r9) goto L2c
                r14 = r19
                java.lang.Object[] r14 = (java.lang.Object[]) r14
                int r14 = r14.length
                int r14 = r14 + (-1)
                if (r8 != r14) goto L5e
                goto L63
            L5e:
                int r8 = r8 + 1
                r9 = -1
                r11 = 1
                goto L2c
            L63:
                if (r7 >= 0) goto L68
                int r2 = r4 + (-1)
                goto L5
            L68:
                if (r7 <= 0) goto L6f
                int r12 = r4 + r6
                int r1 = r12 + 1
                goto L5
            L6f:
                int r12 = r5 - r10
                r13 = r19[r8]
                int r13 = r13.length
                int r13 = r13 - r9
                int r14 = r8 + 1
                r15 = r19
                java.lang.Object[] r15 = (java.lang.Object[]) r15
                int r15 = r15.length
            L7c:
                if (r14 >= r15) goto L89
                r16 = r1
                r1 = r19[r14]
                int r1 = r1.length
                int r13 = r13 + r1
                int r14 = r14 + 1
                r1 = r16
                goto L7c
            L89:
                r16 = r1
                if (r13 >= r12) goto L93
                int r2 = r4 + (-1)
                r1 = r16
                goto L5
            L93:
                if (r13 <= r12) goto L9b
                int r1 = r4 + r6
                int r1 = r1 + 1
                goto L5
            L9b:
                java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
                java.lang.String r14 = "UTF_8"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r14)
                java.lang.String r14 = new java.lang.String
                r14.<init>(r0, r4, r5, r1)
                r3 = r14
                goto Lab
            La9:
                r16 = r1
            Lab:
                return r3
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
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
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

    private final java.util.List<java.lang.String> findMatchingRule(java.util.List<java.lang.String> r15) {
            r14 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r14.listRead
            boolean r0 = r0.get()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L16
            java.util.concurrent.atomic.AtomicBoolean r0 = r14.listRead
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L16
            r14.readTheListUninterruptibly()
            goto L25
        L16:
            java.util.concurrent.CountDownLatch r0 = r14.readCompleteLatch     // Catch: java.lang.InterruptedException -> L1d
            r0.await()     // Catch: java.lang.InterruptedException -> L1d
            goto L25
        L1d:
            r0 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
        L25:
            byte[] r0 = r14.publicSuffixListBytes
            if (r0 == 0) goto L2b
            r0 = r2
            goto L2c
        L2b:
            r0 = r1
        L2c:
            if (r0 == 0) goto L131
            int r0 = r15.size()
            byte[][] r3 = new byte[r0][]
            r4 = r1
        L35:
            if (r4 >= r0) goto L52
            java.lang.Object r5 = r15.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r7 = "UTF_8"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            byte[] r5 = r5.getBytes(r6)
            java.lang.String r6 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r3[r4] = r5
            int r4 = r4 + 1
            goto L35
        L52:
            r0 = r3
            r3 = 0
            r4 = 0
            r5 = r0
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r5 = r5.length
        L59:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r4 >= r5) goto L73
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            byte[] r9 = r14.publicSuffixListBytes
            if (r9 != 0) goto L68
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            r9 = r7
        L68:
            java.lang.String r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(r8, r9, r0, r4)
            if (r8 == 0) goto L70
            r3 = r8
            goto L73
        L70:
            int r4 = r4 + 1
            goto L59
        L73:
            r4 = 0
            r5 = r0
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r5 = r5.length
            if (r5 <= r2) goto La4
            r5 = r0
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.Object r5 = r5.clone()
            byte[][] r5 = (byte[][]) r5
            r8 = 0
            r9 = r5
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            int r9 = r9.length
            int r9 = r9 - r2
        L89:
            if (r8 >= r9) goto La4
            byte[] r10 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.WILDCARD_LABEL
            r5[r8] = r10
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r10 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            byte[] r11 = r14.publicSuffixListBytes
            if (r11 != 0) goto L99
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            r11 = r7
        L99:
            java.lang.String r10 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(r10, r11, r5, r8)
            if (r10 == 0) goto La1
            r4 = r10
            goto La4
        La1:
            int r8 = r8 + 1
            goto L89
        La4:
            r5 = 0
            if (r4 == 0) goto Lc7
            r6 = 0
            r8 = r0
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            int r8 = r8.length
            int r8 = r8 - r2
        Lad:
            if (r6 >= r8) goto Lc7
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            byte[] r10 = r14.publicSuffixExceptionListBytes
            if (r10 != 0) goto Lbb
            java.lang.String r10 = "publicSuffixExceptionListBytes"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
            r10 = r7
        Lbb:
            java.lang.String r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(r9, r10, r0, r6)
            if (r9 == 0) goto Lc4
            r5 = r9
            goto Lc7
        Lc4:
            int r6 = r6 + 1
            goto Lad
        Lc7:
            r6 = 46
            if (r5 == 0) goto Lee
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 33
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r5 = r7.toString()
            r7 = r5
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            char[] r8 = new char[r2]
            r8[r1] = r6
            r11 = 6
            r12 = 0
            r9 = 0
            r10 = 0
            java.util.List r1 = kotlin.text.StringsKt.split$default(r7, r8, r9, r10, r11, r12)
            return r1
        Lee:
            if (r3 != 0) goto Lf5
            if (r4 != 0) goto Lf5
            java.util.List<java.lang.String> r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.PREVAILING_RULE
            return r1
        Lf5:
            if (r3 == 0) goto L108
            r7 = r3
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            char[] r8 = new char[r2]
            r8[r1] = r6
            r11 = 6
            r12 = 0
            r9 = 0
            r10 = 0
            java.util.List r7 = kotlin.text.StringsKt.split$default(r7, r8, r9, r10, r11, r12)
            if (r7 != 0) goto L10c
        L108:
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
        L10c:
            if (r4 == 0) goto L11f
            r8 = r4
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            char[] r9 = new char[r2]
            r9[r1] = r6
            r12 = 6
            r13 = 0
            r10 = 0
            r11 = 0
            java.util.List r1 = kotlin.text.StringsKt.split$default(r8, r9, r10, r11, r12, r13)
            if (r1 != 0) goto L123
        L11f:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L123:
            int r2 = r7.size()
            int r6 = r1.size()
            if (r2 <= r6) goto L12f
            r2 = r7
            goto L130
        L12f:
            r2 = r1
        L130:
            return r2
        L131:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final void readTheList() throws java.io.IOException {
            r10 = this;
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Throwable -> L78
            r0.<init>()     // Catch: java.lang.Throwable -> L78
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Throwable -> L78
            r1.<init>()     // Catch: java.lang.Throwable -> L78
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r3 = "publicsuffixes.gz"
            java.io.InputStream r2 = r2.getResourceAsStream(r3)     // Catch: java.lang.Throwable -> L78
            if (r2 != 0) goto L1c
        L16:
            java.util.concurrent.CountDownLatch r2 = r10.readCompleteLatch
            r2.countDown()
            return
        L1c:
            okio.GzipSource r3 = new okio.GzipSource     // Catch: java.lang.Throwable -> L78
            okio.Source r4 = okio.Okio.source(r2)     // Catch: java.lang.Throwable -> L78
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L78
            okio.Source r3 = (okio.Source) r3     // Catch: java.lang.Throwable -> L78
            okio.BufferedSource r3 = okio.Okio.buffer(r3)     // Catch: java.lang.Throwable -> L78
            java.io.Closeable r3 = (java.io.Closeable) r3     // Catch: java.lang.Throwable -> L78
            r4 = r3
            okio.BufferedSource r4 = (okio.BufferedSource) r4     // Catch: java.lang.Throwable -> L71
            r5 = 0
            int r6 = r4.readInt()     // Catch: java.lang.Throwable -> L71
            long r7 = (long) r6     // Catch: java.lang.Throwable -> L71
            byte[] r7 = r4.readByteArray(r7)     // Catch: java.lang.Throwable -> L71
            r0.element = r7     // Catch: java.lang.Throwable -> L71
            int r7 = r4.readInt()     // Catch: java.lang.Throwable -> L71
            long r8 = (long) r7     // Catch: java.lang.Throwable -> L71
            byte[] r8 = r4.readByteArray(r8)     // Catch: java.lang.Throwable -> L71
            r1.element = r8     // Catch: java.lang.Throwable -> L71
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L71
            r4 = 0
            kotlin.p001io.CloseableKt.closeFinally(r3, r4)     // Catch: java.lang.Throwable -> L78
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L78
            r3 = 0
            T r4 = r0.element     // Catch: java.lang.Throwable -> L6e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch: java.lang.Throwable -> L6e
            byte[] r4 = (byte[]) r4     // Catch: java.lang.Throwable -> L6e
            r10.publicSuffixListBytes = r4     // Catch: java.lang.Throwable -> L6e
            T r4 = r1.element     // Catch: java.lang.Throwable -> L6e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch: java.lang.Throwable -> L6e
            byte[] r4 = (byte[]) r4     // Catch: java.lang.Throwable -> L6e
            r10.publicSuffixExceptionListBytes = r4     // Catch: java.lang.Throwable -> L6e
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.CountDownLatch r0 = r10.readCompleteLatch
            r0.countDown()
            return
        L6e:
            r3 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L78
            throw r3     // Catch: java.lang.Throwable -> L78
        L71:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L73
        L73:
            r5 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r3, r4)     // Catch: java.lang.Throwable -> L78
            throw r5     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            java.util.concurrent.CountDownLatch r1 = r10.readCompleteLatch
            r1.countDown()
            throw r0
    }

    private final void readTheListUninterruptibly() {
            r6 = this;
            r0 = 0
        L2:
            r6.readTheList()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L14 java.io.InterruptedIOException -> L30
            if (r0 == 0) goto L11
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L11:
            return
        L12:
            r1 = move-exception
            goto L36
        L14:
            r1 = move-exception
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L12
            okhttp3.internal.platform.Platform r2 = r2.get()     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = r1
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> L12
            r5 = 5
            r2.log(r3, r5, r4)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L2f
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
        L2f:
            return
        L30:
            r1 = move-exception
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L12
            r0 = 1
            goto L2
        L36:
            if (r0 == 0) goto L3f
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
        L3f:
            throw r1
    }

    private final java.util.List<java.lang.String> splitDomain(java.lang.String r8) {
            r7 = this;
            r0 = r8
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6 = 1
            char[] r1 = new char[r6]
            r2 = 46
            r3 = 0
            r1[r3] = r2
            r4 = 6
            r5 = 0
            r2 = 0
            java.util.List r0 = kotlin.text.StringsKt.split$default(r0, r1, r2, r3, r4, r5)
            java.lang.Object r1 = kotlin.collections.CollectionsKt.last(r0)
            java.lang.String r2 = ""
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L23
            java.util.List r1 = kotlin.collections.CollectionsKt.dropLast(r0, r6)
            return r1
        L23:
            return r0
    }

    public final java.lang.String getEffectiveTldPlusOne(java.lang.String r15) {
            r14 = this;
            java.lang.String r0 = "domain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = java.net.IDN.toUnicode(r15)
            java.lang.String r1 = "unicodeDomain"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.List r1 = r14.splitDomain(r0)
            java.util.List r2 = r14.findMatchingRule(r1)
            int r3 = r1.size()
            int r4 = r2.size()
            r5 = 33
            r6 = 0
            if (r3 != r4) goto L31
            java.lang.Object r3 = r2.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            char r3 = r3.charAt(r6)
            if (r3 == r5) goto L31
            r3 = 0
            return r3
        L31:
            java.lang.Object r3 = r2.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            char r3 = r3.charAt(r6)
            if (r3 != r5) goto L47
            int r3 = r1.size()
            int r4 = r2.size()
            int r3 = r3 - r4
            goto L52
        L47:
            int r3 = r1.size()
            int r4 = r2.size()
            int r4 = r4 + 1
            int r3 = r3 - r4
        L52:
            java.util.List r4 = r14.splitDomain(r15)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            kotlin.sequences.Sequence r4 = kotlin.collections.CollectionsKt.asSequence(r4)
            kotlin.sequences.Sequence r5 = kotlin.sequences.SequencesKt.drop(r4, r3)
            java.lang.String r4 = "."
            r6 = r4
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r12 = 62
            r13 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r4 = kotlin.sequences.SequencesKt.joinToString$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r4
    }

    public final void setListBytes(byte[] r3, byte[] r4) {
            r2 = this;
            java.lang.String r0 = "publicSuffixListBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "publicSuffixExceptionListBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r2.publicSuffixListBytes = r3
            r2.publicSuffixExceptionListBytes = r4
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.listRead
            r1 = 1
            r0.set(r1)
            java.util.concurrent.CountDownLatch r0 = r2.readCompleteLatch
            r0.countDown()
            return
    }
}
