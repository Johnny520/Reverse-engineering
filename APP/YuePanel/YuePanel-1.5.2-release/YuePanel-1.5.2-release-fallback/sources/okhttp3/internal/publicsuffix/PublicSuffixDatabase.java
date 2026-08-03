package okhttp3.internal.publicsuffix;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0003R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "", "domain", "ۥ۟۟", "(Ljava/lang/String;)Ljava/lang/String;", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "LYue/ۥۣۢ۠ۤ;", "ۥ۟۟۟۠", "([B[B)V", "", "ۥ۟۟۟ۡ", "(Ljava/lang/String;)Ljava/util/List;", "domainLabels", "ۥ۟", "(Ljava/util/List;)Ljava/util/List;", "ۥ۟۟۟۟", "ۥ۟۟۟", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ۥ", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "[B", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final okhttp3.internal.publicsuffix.PublicSuffixDatabase.C7896 f30791 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f30792 = "publicsuffixes.gz";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final byte[] f30793 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.List<java.lang.String> f30794 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final char f30795 = '!';

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final okhttp3.internal.publicsuffix.PublicSuffixDatabase f30796 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.atomic.AtomicBoolean f30797;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.CountDownLatch f30798;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public byte[] f30799;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public byte[] f30800;

    /* JADX INFO: renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$ۥ, reason: contains not printable characters */
    public static final class C7896 {
        public C7896() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C7896(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ java.lang.String m30774(okhttp3.internal.publicsuffix.PublicSuffixDatabase.C7896 r0, byte[] r1, byte[][] r2, int r3) {
                java.lang.String r0 = r0.m30775(r1, r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.lang.String m30775(byte[] r19, byte[][] r20, int r21) {
                r18 = this;
                r0 = r19
                r1 = r20
                int r2 = r0.length
                r4 = 0
            L6:
                if (r4 >= r2) goto L93
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
                int r3 = Yue.C6656.m25556(r3, r15)
                r17 = r10
                r10 = r3
                r3 = r17
            L41:
                int r16 = r8 + r14
                r7 = r0[r16]
                int r7 = Yue.C6656.m25556(r7, r15)
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
                java.lang.String r2 = "UTF_8"
                Yue.C3329.m13905(r1, r2)
                java.lang.String r2 = new java.lang.String
                r2.<init>(r0, r8, r6, r1)
                goto L94
            L93:
                r2 = 0
            L94:
                return r2
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final okhttp3.internal.publicsuffix.PublicSuffixDatabase m30776() {
                r1 = this;
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.m30767()
                return r0
        }
    }

    static {
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$ۥ r0 = new okhttp3.internal.publicsuffix.PublicSuffixDatabase$ۥ
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.f30791 = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 42
            r2 = 0
            r0[r2] = r1
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.f30793 = r0
            java.lang.String r0 = "*"
            java.util.List r0 = Yue.C1207.m6190(r0)
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.f30794 = r0
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = new okhttp3.internal.publicsuffix.PublicSuffixDatabase
            r0.<init>()
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.f30796 = r0
            return
    }

    public PublicSuffixDatabase() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f30797 = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.f30798 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ okhttp3.internal.publicsuffix.PublicSuffixDatabase m30767() {
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f30796
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.List<java.lang.String> m30768(java.util.List<java.lang.String> r18) {
            r17 = this;
            r0 = r17
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f30797
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L18
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f30797
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L18
            r17.m30771()
            goto L25
        L18:
            java.util.concurrent.CountDownLatch r1 = r0.f30798     // Catch: java.lang.InterruptedException -> L1e
            r1.await()     // Catch: java.lang.InterruptedException -> L1e
            goto L25
        L1e:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L25:
            byte[] r1 = r0.f30799
            if (r1 == 0) goto L10c
            int r1 = r18.size()
            byte[][] r4 = new byte[r1][]
            r5 = r2
        L30:
            if (r5 >= r1) goto L4e
            r6 = r18
            java.lang.Object r7 = r6.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r9 = "UTF_8"
            Yue.C3329.m13905(r8, r9)
            byte[] r7 = r7.getBytes(r8)
            java.lang.String r8 = "this as java.lang.String).getBytes(charset)"
            Yue.C3329.m13905(r7, r8)
            r4[r5] = r7
            int r5 = r5 + r3
            goto L30
        L4e:
            r5 = r2
        L4f:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r5 >= r1) goto L67
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$ۥ r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f30791
            byte[] r9 = r0.f30799
            if (r9 != 0) goto L5e
            Yue.C3329.m13935(r6)
            r9 = r7
        L5e:
            java.lang.String r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C7896.m30774(r8, r9, r4, r5)
            if (r8 == 0) goto L65
            goto L68
        L65:
            int r5 = r5 + r3
            goto L4f
        L67:
            r8 = r7
        L68:
            if (r1 <= r3) goto L8d
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r3
            r10 = r2
        L73:
            if (r10 >= r9) goto L8d
            byte[] r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f30793
            r5[r10] = r11
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$ۥ r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f30791
            byte[] r12 = r0.f30799
            if (r12 != 0) goto L83
            Yue.C3329.m13935(r6)
            r12 = r7
        L83:
            java.lang.String r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C7896.m30774(r11, r12, r5, r10)
            if (r11 == 0) goto L8b
            r5 = r11
            goto L8e
        L8b:
            int r10 = r10 + r3
            goto L73
        L8d:
            r5 = r7
        L8e:
            if (r5 == 0) goto Laa
            int r1 = r1 - r3
            r6 = r2
        L92:
            if (r6 >= r1) goto Laa
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$ۥ r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f30791
            byte[] r10 = r0.f30800
            if (r10 != 0) goto La0
            java.lang.String r10 = "publicSuffixExceptionListBytes"
            Yue.C3329.m13935(r10)
            r10 = r7
        La0:
            java.lang.String r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C7896.m30774(r9, r10, r4, r6)
            if (r9 == 0) goto La8
            r7 = r9
            goto Laa
        La8:
            int r6 = r6 + r3
            goto L92
        Laa:
            r1 = 46
            if (r7 == 0) goto Lcc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 33
            r4.append(r5)
            r4.append(r7)
            java.lang.String r8 = r4.toString()
            char[] r9 = new char[r3]
            r9[r2] = r1
            r12 = 6
            r13 = 0
            r10 = 0
            r11 = 0
            java.util.List r1 = Yue.C5989.m22443(r8, r9, r10, r11, r12, r13)
            return r1
        Lcc:
            if (r8 != 0) goto Ld3
            if (r5 != 0) goto Ld3
            java.util.List<java.lang.String> r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f30794
            return r1
        Ld3:
            if (r8 == 0) goto Le5
            char[] r7 = new char[r3]
            r7[r2] = r1
            r10 = 6
            r11 = 0
            r4 = 0
            r9 = 0
            r6 = r8
            r8 = r4
            java.util.List r4 = Yue.C5989.m22443(r6, r7, r8, r9, r10, r11)
            if (r4 != 0) goto Le9
        Le5:
            java.util.List r4 = Yue.C1208.m6210()
        Le9:
            if (r5 == 0) goto Lfb
            char[] r12 = new char[r3]
            r12[r2] = r1
            r15 = 6
            r16 = 0
            r13 = 0
            r14 = 0
            r11 = r5
            java.util.List r1 = Yue.C5989.m22443(r11, r12, r13, r14, r15, r16)
            if (r1 != 0) goto Lff
        Lfb:
            java.util.List r1 = Yue.C1208.m6210()
        Lff:
            int r2 = r4.size()
            int r3 = r1.size()
            if (r2 <= r3) goto L10a
            goto L10b
        L10a:
            r4 = r1
        L10b:
            return r4
        L10c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.String m30769(@Yue.InterfaceC4418 java.lang.String r11) {
            r10 = this;
            java.lang.String r0 = "domain"
            Yue.C3329.m13906(r11, r0)
            java.lang.String r0 = java.net.IDN.toUnicode(r11)
            java.lang.String r1 = "unicodeDomain"
            Yue.C3329.m13905(r0, r1)
            java.util.List r0 = r10.m30773(r0)
            java.util.List r1 = r10.m30768(r0)
            int r2 = r0.size()
            int r3 = r1.size()
            r4 = 33
            r5 = 0
            if (r2 != r3) goto L31
            java.lang.Object r2 = r1.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            char r2 = r2.charAt(r5)
            if (r2 == r4) goto L31
            r11 = 0
            return r11
        L31:
            java.lang.Object r2 = r1.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            char r2 = r2.charAt(r5)
            if (r2 != r4) goto L47
            int r0 = r0.size()
            int r1 = r1.size()
        L45:
            int r0 = r0 - r1
            goto L52
        L47:
            int r0 = r0.size()
            int r1 = r1.size()
            int r1 = r1 + 1
            goto L45
        L52:
            java.util.List r11 = r10.m30773(r11)
            Yue.ۥۡۨۢ r11 = Yue.C1219.m6308(r11)
            Yue.ۥۡۨۢ r1 = Yue.C5629.m21049(r11, r0)
            r8 = 62
            r9 = 0
            java.lang.String r2 = "."
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r11 = Yue.C5629.m21095(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m30770() throws java.io.IOException {
            r5 = this;
            Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ r0 = new Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ     // Catch: java.lang.Throwable -> L5d
            r0.<init>()     // Catch: java.lang.Throwable -> L5d
            Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ r1 = new Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ     // Catch: java.lang.Throwable -> L5d
            r1.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r3 = "publicsuffixes.gz"
            java.io.InputStream r2 = r2.getResourceAsStream(r3)     // Catch: java.lang.Throwable -> L5d
            if (r2 != 0) goto L1a
            java.util.concurrent.CountDownLatch r0 = r5.f30798
            r0.countDown()
            return
        L1a:
            Yue.ۥ۠ۤ۠۠ r3 = new Yue.ۥ۠ۤ۠۠     // Catch: java.lang.Throwable -> L5d
            Yue.ۥۣۢ۟ۦ r2 = Yue.C4603.m18396(r2)     // Catch: java.lang.Throwable -> L5d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5d
            Yue.ۥۣۣ۟۠ r2 = Yue.C4603.m18380(r3)     // Catch: java.lang.Throwable -> L5d
            int r3 = r2.readInt()     // Catch: java.lang.Throwable -> L62
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L62
            byte[] r3 = r2.mo4866(r3)     // Catch: java.lang.Throwable -> L62
            r0.f19776 = r3     // Catch: java.lang.Throwable -> L62
            int r3 = r2.readInt()     // Catch: java.lang.Throwable -> L62
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L62
            byte[] r3 = r2.mo4866(r3)     // Catch: java.lang.Throwable -> L62
            r1.f19776 = r3     // Catch: java.lang.Throwable -> L62
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L62
            r3 = 0
            Yue.C1173.m6114(r2, r3)     // Catch: java.lang.Throwable -> L5d
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L5d
            T r0 = r0.f19776     // Catch: java.lang.Throwable -> L5f
            Yue.C3329.m13903(r0)     // Catch: java.lang.Throwable -> L5f
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L5f
            r5.f30799 = r0     // Catch: java.lang.Throwable -> L5f
            T r0 = r1.f19776     // Catch: java.lang.Throwable -> L5f
            Yue.C3329.m13903(r0)     // Catch: java.lang.Throwable -> L5f
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L5f
            r5.f30800 = r0     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5d
            java.util.concurrent.CountDownLatch r0 = r5.f30798
            r0.countDown()
            return
        L5d:
            r0 = move-exception
            goto L69
        L5f:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5d
            throw r0     // Catch: java.lang.Throwable -> L5d
        L62:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L64
        L64:
            r1 = move-exception
            Yue.C1173.m6114(r2, r0)     // Catch: java.lang.Throwable -> L5d
            throw r1     // Catch: java.lang.Throwable -> L5d
        L69:
            java.util.concurrent.CountDownLatch r1 = r5.f30798
            r1.countDown()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m30771() {
            r5 = this;
            r0 = 0
        L1:
            r5.m30770()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10 java.io.InterruptedIOException -> L27
            if (r0 == 0) goto Ld
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Ld:
            return
        Le:
            r1 = move-exception
            goto L2c
        L10:
            r1 = move-exception
            Yue.ۥۡۤۡۢ$ۥ r2 = Yue.C4773.f15123     // Catch: java.lang.Throwable -> Le
            Yue.ۥۡۤۡۢ r2 = r2.m19021()     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.m19013(r3, r4, r1)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L26
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L26:
            return
        L27:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> Le
            r0 = 1
            goto L1
        L2c:
            if (r0 == 0) goto L35
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L35:
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m30772(@Yue.InterfaceC4418 byte[] r2, @Yue.InterfaceC4418 byte[] r3) {
            r1 = this;
            java.lang.String r0 = "publicSuffixListBytes"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "publicSuffixExceptionListBytes"
            Yue.C3329.m13906(r3, r0)
            r1.f30799 = r2
            r1.f30800 = r3
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.f30797
            r3 = 1
            r2.set(r3)
            java.util.concurrent.CountDownLatch r2 = r1.f30798
            r2.countDown()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final java.util.List<java.lang.String> m30773(java.lang.String r8) {
            r7 = this;
            r0 = 1
            char[] r2 = new char[r0]
            r1 = 46
            r3 = 0
            r2[r3] = r1
            r5 = 6
            r6 = 0
            r4 = 0
            r1 = r8
            java.util.List r8 = Yue.C5989.m22443(r1, r2, r3, r4, r5, r6)
            java.lang.Object r1 = Yue.C1219.m6401(r8)
            java.lang.String r2 = ""
            boolean r1 = Yue.C3329.m13897(r1, r2)
            if (r1 == 0) goto L20
            java.util.List r8 = Yue.C1219.m6337(r8, r0)
        L20:
            return r8
    }
}
