package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,370:1\n625#2,8:371\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n*L\n216#1:371,8\n*E\n"})
public final class C0960 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0960.C0962 f2723 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.C0960 f2724 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.Set<Yue.C0960.C0963> f2725;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.AbstractC0958 f2726;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۧ$ۥ, reason: contains not printable characters */
    public static final class C0961 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.List<Yue.C0960.C0963> f2727;

        public C0961() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f2727 = r0
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C0960.C0961 m5425(@Yue.InterfaceC4418 java.lang.String r6, @Yue.InterfaceC4418 java.lang.String... r7) {
                r5 = this;
                java.lang.String r0 = "pattern"
                Yue.C3329.m13906(r6, r0)
                java.lang.String r0 = "pins"
                Yue.C3329.m13906(r7, r0)
                int r0 = r7.length
                r1 = 0
            Lc:
                if (r1 >= r0) goto L1d
                r2 = r7[r1]
                java.util.List<Yue.ۥ۟ۤ۟ۧ$ۥ۟۟> r3 = r5.f2727
                Yue.ۥ۟ۤ۟ۧ$ۥ۟۟ r4 = new Yue.ۥ۟ۤ۟ۧ$ۥ۟۟
                r4.<init>(r6, r2)
                r3.add(r4)
                int r1 = r1 + 1
                goto Lc
            L1d:
                return r5
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C0960 m5426() {
                r4 = this;
                Yue.ۥ۟ۤ۟ۧ r0 = new Yue.ۥ۟ۤ۟ۧ
                java.util.List<Yue.ۥ۟ۤ۟ۧ$ۥ۟۟> r1 = r4.f2727
                java.util.Set r1 = Yue.C1219.m6542(r1)
                r2 = 0
                r3 = 2
                r0.<init>(r1, r2, r3, r2)
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.util.List<Yue.C0960.C0963> m5427() {
                r1 = this;
                java.util.List<Yue.ۥ۟ۤ۟ۧ$ۥ۟۟> r0 = r1.f2727
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۧ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1#2:371\n*E\n"})
    public static final class C0962 {
        public C0962() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0962(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String m5428(@Yue.InterfaceC4418 java.security.cert.Certificate r3) {
                r2 = this;
                java.lang.String r0 = "certificate"
                Yue.C3329.m13906(r3, r0)
                boolean r0 = r3 instanceof java.security.cert.X509Certificate
                if (r0 == 0) goto L25
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "sha256/"
                r0.append(r1)
                java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
                Yue.ۥۣ۟ۥۤ r3 = r2.m5430(r3)
                java.lang.String r3 = r3.mo5059()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
            L25:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Certificate pinning requires X509 certificates"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C0879 m5429(@Yue.InterfaceC4418 java.security.cert.X509Certificate r8) {
                r7 = this;
                java.lang.String r0 = "<this>"
                Yue.C3329.m13906(r8, r0)
                Yue.ۥۣ۟ۥۤ$ۥ r1 = Yue.C0879.f2556
                java.security.PublicKey r8 = r8.getPublicKey()
                byte[] r2 = r8.getEncoded()
                java.lang.String r8 = "publicKey.encoded"
                Yue.C3329.m13905(r2, r8)
                r5 = 3
                r6 = 0
                r3 = 0
                r4 = 0
                Yue.ۥۣ۟ۥۤ r8 = Yue.C0879.C0880.m5110(r1, r2, r3, r4, r5, r6)
                Yue.ۥۣ۟ۥۤ r8 = r8.m5092()
                return r8
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C0879 m5430(@Yue.InterfaceC4418 java.security.cert.X509Certificate r8) {
                r7 = this;
                java.lang.String r0 = "<this>"
                Yue.C3329.m13906(r8, r0)
                Yue.ۥۣ۟ۥۤ$ۥ r1 = Yue.C0879.f2556
                java.security.PublicKey r8 = r8.getPublicKey()
                byte[] r2 = r8.getEncoded()
                java.lang.String r8 = "publicKey.encoded"
                Yue.C3329.m13905(r2, r8)
                r5 = 3
                r6 = 0
                r3 = 0
                r4 = 0
                Yue.ۥۣ۟ۥۤ r8 = Yue.C0879.C0880.m5110(r1, r2, r3, r4, r5, r6)
                Yue.ۥۣ۟ۥۤ r8 = r8.m5093()
                return r8
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۧ$ۥ۟۟, reason: contains not printable characters */
    public static final class C0963 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.lang.String f2728;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.lang.String f2729;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.C0879 f2730;

        public C0963(@Yue.InterfaceC4418 java.lang.String r12, @Yue.InterfaceC4418 java.lang.String r13) {
                r11 = this;
                java.lang.String r0 = "pattern"
                Yue.C3329.m13906(r12, r0)
                java.lang.String r0 = "pin"
                Yue.C3329.m13906(r13, r0)
                r11.<init>()
                java.lang.String r0 = "*."
                r1 = 0
                r2 = 2
                r3 = 0
                boolean r0 = Yue.C5988.m22315(r12, r0, r1, r2, r3)
                r4 = -1
                if (r0 == 0) goto L26
                r9 = 4
                r10 = 0
                java.lang.String r6 = "*"
                r7 = 1
                r8 = 0
                r5 = r12
                int r0 = Yue.C5989.m22364(r5, r6, r7, r8, r9, r10)
                if (r0 == r4) goto L48
            L26:
                java.lang.String r0 = "**."
                boolean r0 = Yue.C5988.m22315(r12, r0, r1, r2, r3)
                if (r0 == 0) goto L3b
                r9 = 4
                r10 = 0
                java.lang.String r6 = "*"
                r7 = 2
                r8 = 0
                r5 = r12
                int r0 = Yue.C5989.m22364(r5, r6, r7, r8, r9, r10)
                if (r0 == r4) goto L48
            L3b:
                r9 = 6
                r10 = 0
                java.lang.String r6 = "*"
                r7 = 0
                r8 = 0
                r5 = r12
                int r0 = Yue.C5989.m22364(r5, r6, r7, r8, r9, r10)
                if (r0 != r4) goto Lea
            L48:
                java.lang.String r0 = Yue.C3080.m12965(r12)
                if (r0 == 0) goto Ld3
                r11.f2728 = r0
                java.lang.String r12 = "sha1/"
                boolean r12 = Yue.C5988.m22315(r13, r12, r1, r2, r3)
                java.lang.String r0 = "Invalid pin hash: "
                java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
                if (r12 == 0) goto L88
                java.lang.String r12 = "sha1"
                r11.f2729 = r12
                Yue.ۥۣ۟ۥۤ$ۥ r12 = Yue.C0879.f2556
                r1 = 5
                java.lang.String r1 = r13.substring(r1)
                Yue.C3329.m13905(r1, r4)
                Yue.ۥۣ۟ۥۤ r12 = r12.m5118(r1)
                if (r12 == 0) goto L73
                r11.f2730 = r12
                goto La6
            L73:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r13)
                java.lang.String r13 = r1.toString()
                r12.<init>(r13)
                throw r12
            L88:
                java.lang.String r12 = "sha256/"
                boolean r12 = Yue.C5988.m22315(r13, r12, r1, r2, r3)
                if (r12 == 0) goto Lbc
                java.lang.String r12 = "sha256"
                r11.f2729 = r12
                Yue.ۥۣ۟ۥۤ$ۥ r12 = Yue.C0879.f2556
                r1 = 7
                java.lang.String r1 = r13.substring(r1)
                Yue.C3329.m13905(r1, r4)
                Yue.ۥۣ۟ۥۤ r12 = r12.m5118(r1)
                if (r12 == 0) goto La7
                r11.f2730 = r12
            La6:
                return
            La7:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r13)
                java.lang.String r13 = r1.toString()
                r12.<init>(r13)
                throw r12
            Lbc:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "pins must start with 'sha256/' or 'sha1/': "
                r0.append(r1)
                r0.append(r13)
                java.lang.String r13 = r0.toString()
                r12.<init>(r13)
                throw r12
            Ld3:
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Invalid pattern: "
                r0.append(r1)
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                r13.<init>(r12)
                throw r13
            Lea:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r0 = "Unexpected pattern: "
                r13.append(r0)
                r13.append(r12)
                java.lang.String r12 = r13.toString()
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r12.toString()
                r13.<init>(r12)
                throw r13
        }

        public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof Yue.C0960.C0963
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                java.lang.String r1 = r4.f2728
                Yue.ۥ۟ۤ۟ۧ$ۥ۟۟ r5 = (Yue.C0960.C0963) r5
                java.lang.String r3 = r5.f2728
                boolean r1 = Yue.C3329.m13897(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.f2729
                java.lang.String r3 = r5.f2729
                boolean r1 = Yue.C3329.m13897(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                Yue.ۥۣ۟ۥۤ r1 = r4.f2730
                Yue.ۥۣ۟ۥۤ r5 = r5.f2730
                boolean r5 = Yue.C3329.m13897(r1, r5)
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.f2728
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.f2729
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                Yue.ۥۣ۟ۥۤ r1 = r2.f2730
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.f2729
                r0.append(r1)
                r1 = 47
                r0.append(r1)
                Yue.ۥۣ۟ۥۤ r1 = r2.f2730
                java.lang.String r1 = r1.mo5059()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C0879 m5431() {
                r1 = this;
                Yue.ۥۣ۟ۥۤ r0 = r1.f2730
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.lang.String m5432() {
                r1 = this;
                java.lang.String r0 = r1.f2729
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.String m5433() {
                r1 = this;
                java.lang.String r0 = r1.f2728
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m5434(@Yue.InterfaceC4418 java.security.cert.X509Certificate r3) {
                r2 = this;
                java.lang.String r0 = "certificate"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = r2.f2729
                java.lang.String r1 = "sha256"
                boolean r1 = Yue.C3329.m13897(r0, r1)
                if (r1 == 0) goto L1c
                Yue.ۥۣ۟ۥۤ r0 = r2.f2730
                Yue.ۥ۟ۤ۟ۧ$ۥ۟ r1 = Yue.C0960.f2723
                Yue.ۥۣ۟ۥۤ r3 = r1.m5430(r3)
                boolean r3 = Yue.C3329.m13897(r0, r3)
                goto L32
            L1c:
                java.lang.String r1 = "sha1"
                boolean r0 = Yue.C3329.m13897(r0, r1)
                if (r0 == 0) goto L31
                Yue.ۥۣ۟ۥۤ r0 = r2.f2730
                Yue.ۥ۟ۤ۟ۧ$ۥ۟ r1 = Yue.C0960.f2723
                Yue.ۥۣ۟ۥۤ r3 = r1.m5429(r3)
                boolean r3 = Yue.C3329.m13897(r0, r3)
                goto L32
            L31:
                r3 = 0
            L32:
                return r3
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final boolean m5435(@Yue.InterfaceC4418 java.lang.String r12) {
                r11 = this;
                java.lang.String r0 = "hostname"
                Yue.C3329.m13906(r12, r0)
                java.lang.String r0 = r11.f2728
                java.lang.String r1 = "**."
                r2 = 0
                r3 = 2
                r4 = 0
                boolean r0 = Yue.C5988.m22315(r0, r1, r2, r3, r4)
                r1 = 1
                if (r0 == 0) goto L41
                java.lang.String r0 = r11.f2728
                int r0 = r0.length()
                int r7 = r0 + (-3)
                int r0 = r12.length()
                int r0 = r0 - r7
                int r3 = r12.length()
                int r4 = r3 - r7
                java.lang.String r5 = r11.f2728
                r9 = 16
                r10 = 0
                r6 = 3
                r8 = 0
                r3 = r12
                boolean r3 = Yue.C5988.m22300(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r3 == 0) goto L82
                if (r0 == 0) goto L3f
                int r0 = r0 - r1
                char r12 = r12.charAt(r0)
                r0 = 46
                if (r12 != r0) goto L82
            L3f:
                r2 = r1
                goto L82
            L41:
                java.lang.String r0 = r11.f2728
                java.lang.String r5 = "*."
                boolean r0 = Yue.C5988.m22315(r0, r5, r2, r3, r4)
                if (r0 == 0) goto L7c
                java.lang.String r0 = r11.f2728
                int r0 = r0.length()
                int r7 = r0 + (-1)
                int r0 = r12.length()
                int r0 = r0 - r7
                int r3 = r12.length()
                int r4 = r3 - r7
                java.lang.String r5 = r11.f2728
                r9 = 16
                r10 = 0
                r6 = 1
                r8 = 0
                r3 = r12
                boolean r3 = Yue.C5988.m22300(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r3 == 0) goto L82
                int r6 = r0 + (-1)
                r8 = 4
                r9 = 0
                r5 = 46
                r7 = 0
                r4 = r12
                int r12 = Yue.C5989.m22377(r4, r5, r6, r7, r8, r9)
                r0 = -1
                if (r12 != r0) goto L82
                goto L3f
            L7c:
                java.lang.String r0 = r11.f2728
                boolean r2 = Yue.C3329.m13897(r12, r0)
            L82:
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۧ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$check$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,370:1\n1549#2:371\n1620#2,3:372\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$check$1\n*L\n152#1:371\n152#1:372,3\n*E\n"})
    public static final class C0964 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<java.util.List<? extends java.security.cert.X509Certificate>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0960 f2731;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ java.util.List<java.security.cert.Certificate> f2732;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.lang.String f2733;

        public C0964(Yue.C0960 r1, java.util.List<? extends java.security.cert.Certificate> r2, java.lang.String r3) {
                r0 = this;
                r0.f2731 = r1
                r0.f2732 = r2
                r0.f2733 = r3
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2823
        public /* bridge */ /* synthetic */ java.util.List<? extends java.security.cert.X509Certificate> invoke() {
                r1 = this;
                java.util.List r0 = r1.invoke2()
                return r0
        }

        @Override // Yue.InterfaceC2823
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.util.List<? extends java.security.cert.X509Certificate> invoke2() {
                r4 = this;
                Yue.ۥ۟ۤ۟ۧ r0 = r4.f2731
                Yue.ۥ۟ۤ۟ۦ r0 = r0.m5422()
                if (r0 == 0) goto L12
                java.util.List<java.security.cert.Certificate> r1 = r4.f2732
                java.lang.String r2 = r4.f2733
                java.util.List r0 = r0.mo1407(r1, r2)
                if (r0 != 0) goto L14
            L12:
                java.util.List<java.security.cert.Certificate> r0 = r4.f2732
            L14:
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = Yue.C1210.m6231(r0, r2)
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L23:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L3a
                java.lang.Object r2 = r0.next()
                java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
                java.lang.String r3 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
                Yue.C3329.m13904(r2, r3)
                java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
                r1.add(r2)
                goto L23
            L3a:
                return r1
        }
    }

    static {
            Yue.ۥ۟ۤ۟ۧ$ۥ۟ r0 = new Yue.ۥ۟ۤ۟ۧ$ۥ۟
            r1 = 0
            r0.<init>(r1)
            Yue.C0960.f2723 = r0
            Yue.ۥ۟ۤ۟ۧ$ۥ r0 = new Yue.ۥ۟ۤ۟ۧ$ۥ
            r0.<init>()
            Yue.ۥ۟ۤ۟ۧ r0 = r0.m5426()
            Yue.C0960.f2724 = r0
            return
    }

    public C0960(@Yue.InterfaceC4418 java.util.Set<Yue.C0960.C0963> r2, @Yue.InterfaceC4543 Yue.AbstractC0958 r3) {
            r1 = this;
            java.lang.String r0 = "pins"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f2725 = r2
            r1.f2726 = r3
            return
    }

    public /* synthetic */ C0960(java.util.Set r1, Yue.AbstractC0958 r2, int r3, Yue.C1769 r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String m5415(@Yue.InterfaceC4418 java.security.cert.Certificate r1) {
            Yue.ۥ۟ۤ۟ۧ$ۥ۟ r0 = Yue.C0960.f2723
            java.lang.String r1 = r0.m5428(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Yue.C0879 m5416(@Yue.InterfaceC4418 java.security.cert.X509Certificate r1) {
            Yue.ۥ۟ۤ۟ۧ$ۥ۟ r0 = Yue.C0960.f2723
            Yue.ۥۣ۟ۥۤ r1 = r0.m5429(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Yue.C0879 m5417(@Yue.InterfaceC4418 java.security.cert.X509Certificate r1) {
            Yue.ۥ۟ۤ۟ۧ$ۥ۟ r0 = Yue.C0960.f2723
            Yue.ۥۣ۟ۥۤ r1 = r0.m5430(r1)
            return r1
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C0960
            if (r0 == 0) goto L1c
            Yue.ۥ۟ۤ۟ۧ r3 = (Yue.C0960) r3
            java.util.Set<Yue.ۥ۟ۤ۟ۧ$ۥ۟۟> r0 = r3.f2725
            java.util.Set<Yue.ۥ۟ۤ۟ۧ$ۥ۟۟> r1 = r2.f2725
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L1c
            Yue.ۥ۟ۤ۟ۦ r3 = r3.f2726
            Yue.ۥ۟ۤ۟ۦ r0 = r2.f2726
            boolean r3 = Yue.C3329.m13897(r3, r0)
            if (r3 == 0) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            return r3
    }

    public int hashCode() {
            r2 = this;
            java.util.Set<Yue.ۥ۟ۤ۟ۧ$ۥ۟۟> r0 = r2.f2725
            int r0 = r0.hashCode()
            r1 = 1517(0x5ed, float:2.126E-42)
            int r1 = r1 + r0
            int r1 = r1 * 41
            Yue.ۥ۟ۤ۟ۦ r0 = r2.f2726
            if (r0 == 0) goto L14
            int r0 = r0.hashCode()
            goto L15
        L14:
            r0 = 0
        L15:
            int r1 = r1 + r0
            return r1
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m5418(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.util.List<? extends java.security.cert.Certificate> r3) throws javax.net.ssl.SSLPeerUnverifiedException {
            r1 = this;
            java.lang.String r0 = "hostname"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "peerCertificates"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۟ۤ۟ۧ$ۥ۟۟۟ r0 = new Yue.ۥ۟ۤ۟ۧ$ۥ۟۟۟
            r0.<init>(r1, r3, r2)
            r1.m5420(r2, r0)
            return
    }

    @Yue.InterfaceC1816(message = "replaced with {@link #check(String, List)}.", replaceWith = @Yue.InterfaceC5313(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m5419(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.security.cert.Certificate... r3) throws javax.net.ssl.SSLPeerUnverifiedException {
            r1 = this;
            java.lang.String r0 = "hostname"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "peerCertificates"
            Yue.C3329.m13906(r3, r0)
            java.util.List r3 = Yue.C0595.m3982(r3)
            r1.m5418(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m5420(@Yue.InterfaceC4418 java.lang.String r10, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends java.util.List<? extends java.security.cert.X509Certificate>> r11) {
            r9 = this;
            java.lang.String r0 = "hostname"
            Yue.C3329.m13906(r10, r0)
            java.lang.String r0 = "cleanedPeerCertificatesFn"
            Yue.C3329.m13906(r11, r0)
            java.util.List r0 = r9.m5421(r10)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L15
            return
        L15:
            java.lang.Object r11 = r11.invoke()
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r1 = r11.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L92
            java.lang.Object r2 = r1.next()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.util.Iterator r3 = r0.iterator()
            r4 = 0
            r5 = r4
        L31:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L1f
            java.lang.Object r6 = r3.next()
            Yue.ۥ۟ۤ۟ۧ$ۥ۟۟ r6 = (Yue.C0960.C0963) r6
            java.lang.String r7 = r6.m5432()
            java.lang.String r8 = "sha256"
            boolean r8 = Yue.C3329.m13897(r7, r8)
            if (r8 == 0) goto L5c
            if (r4 != 0) goto L51
            Yue.ۥ۟ۤ۟ۧ$ۥ۟ r4 = Yue.C0960.f2723
            Yue.ۥۣ۟ۥۤ r4 = r4.m5430(r2)
        L51:
            Yue.ۥۣ۟ۥۤ r6 = r6.m5431()
            boolean r6 = Yue.C3329.m13897(r6, r4)
            if (r6 == 0) goto L31
            return
        L5c:
            java.lang.String r8 = "sha1"
            boolean r7 = Yue.C3329.m13897(r7, r8)
            if (r7 == 0) goto L77
            if (r5 != 0) goto L6c
            Yue.ۥ۟ۤ۟ۧ$ۥ۟ r5 = Yue.C0960.f2723
            Yue.ۥۣ۟ۥۤ r5 = r5.m5429(r2)
        L6c:
            Yue.ۥۣ۟ۥۤ r6 = r6.m5431()
            boolean r6 = Yue.C3329.m13897(r6, r5)
            if (r6 == 0) goto L31
            return
        L77:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "unsupported hashAlgorithm: "
            r11.append(r0)
            java.lang.String r0 = r6.m5432()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L92:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Certificate pinning failure!"
            r1.append(r2)
            java.lang.String r2 = "\n  Peer certificate chain:"
            r1.append(r2)
            java.util.Iterator r11 = r11.iterator()
        La5:
            boolean r2 = r11.hasNext()
            java.lang.String r3 = "\n    "
            if (r2 == 0) goto Ld0
            java.lang.Object r2 = r11.next()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            r1.append(r3)
            Yue.ۥ۟ۤ۟ۧ$ۥ۟ r3 = Yue.C0960.f2723
            java.lang.String r3 = r3.m5428(r2)
            r1.append(r3)
            java.lang.String r3 = ": "
            r1.append(r3)
            java.security.Principal r2 = r2.getSubjectDN()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            goto La5
        Ld0:
            java.lang.String r11 = "\n  Pinned certificates for "
            r1.append(r11)
            r1.append(r10)
            java.lang.String r10 = ":"
            r1.append(r10)
            java.util.Iterator r10 = r0.iterator()
        Le1:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lf4
            java.lang.Object r11 = r10.next()
            Yue.ۥ۟ۤ۟ۧ$ۥ۟۟ r11 = (Yue.C0960.C0963) r11
            r1.append(r3)
            r1.append(r11)
            goto Le1
        Lf4:
            java.lang.String r10 = r1.toString()
            java.lang.String r11 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r10, r11)
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            r11.<init>(r10)
            throw r11
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.util.List<Yue.C0960.C0963> m5421(@Yue.InterfaceC4418 java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "hostname"
            Yue.C3329.m13906(r5, r0)
            java.util.Set<Yue.ۥ۟ۤ۟ۧ$ۥ۟۟> r0 = r4.f2725
            java.util.List r1 = Yue.C1208.m6210()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r0.next()
            r3 = r2
            Yue.ۥ۟ۤ۟ۧ$ۥ۟۟ r3 = (Yue.C0960.C0963) r3
            boolean r3 = r3.m5435(r5)
            if (r3 == 0) goto Lf
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L2d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L2d:
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>"
            Yue.C3329.m13904(r1, r3)
            java.util.List r3 = Yue.C6466.m23820(r1)
            r3.add(r2)
            goto Lf
        L3a:
            return r1
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Yue.AbstractC0958 m5422() {
            r1 = this;
            Yue.ۥ۟ۤ۟ۦ r0 = r1.f2726
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.util.Set<Yue.C0960.C0963> m5423() {
            r1 = this;
            java.util.Set<Yue.ۥ۟ۤ۟ۧ$ۥ۟۟> r0 = r1.f2725
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Yue.C0960 m5424(@Yue.InterfaceC4418 Yue.AbstractC0958 r3) {
            r2 = this;
            java.lang.String r0 = "certificateChainCleaner"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۟ۤ۟ۦ r0 = r2.f2726
            boolean r0 = Yue.C3329.m13897(r0, r3)
            if (r0 == 0) goto Lf
            r0 = r2
            goto L16
        Lf:
            Yue.ۥ۟ۤ۟ۧ r0 = new Yue.ۥ۟ۤ۟ۧ
            java.util.Set<Yue.ۥ۟ۤ۟ۧ$ۥ۟۟> r1 = r2.f2725
            r0.<init>(r1, r3)
        L16:
            return r0
    }
}
