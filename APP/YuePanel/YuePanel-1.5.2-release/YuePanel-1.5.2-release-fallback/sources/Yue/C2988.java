package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nHashingSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n86#2:149\n*S KotlinDebug\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n*L\n75#1:149\n*E\n"})
public final class C2988 extends Yue.AbstractC2753 implements Yue.InterfaceC5794 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C2988.C2989 f9646 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.security.MessageDigest f9647;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final javax.crypto.Mac f9648;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۢ۟$ۥ, reason: contains not printable characters */
    public static final class C2989 {
        public C2989() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C2989(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C2988 m12648(@Yue.InterfaceC4418 Yue.InterfaceC5794 r3, @Yue.InterfaceC4418 Yue.C0879 r4) {
                r2 = this;
                java.lang.String r0 = "sink"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "key"
                Yue.C3329.m13906(r4, r0)
                Yue.ۥ۠ۤۢ۟ r0 = new Yue.ۥ۠ۤۢ۟
                java.lang.String r1 = "HmacSHA1"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C2988 m12649(@Yue.InterfaceC4418 Yue.InterfaceC5794 r3, @Yue.InterfaceC4418 Yue.C0879 r4) {
                r2 = this;
                java.lang.String r0 = "sink"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "key"
                Yue.C3329.m13906(r4, r0)
                Yue.ۥ۠ۤۢ۟ r0 = new Yue.ۥ۠ۤۢ۟
                java.lang.String r1 = "HmacSHA256"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C2988 m12650(@Yue.InterfaceC4418 Yue.InterfaceC5794 r3, @Yue.InterfaceC4418 Yue.C0879 r4) {
                r2 = this;
                java.lang.String r0 = "sink"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "key"
                Yue.C3329.m13906(r4, r0)
                Yue.ۥ۠ۤۢ۟ r0 = new Yue.ۥ۠ۤۢ۟
                java.lang.String r1 = "HmacSHA512"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Yue.C2988 m12651(@Yue.InterfaceC4418 Yue.InterfaceC5794 r3) {
                r2 = this;
                java.lang.String r0 = "sink"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥ۠ۤۢ۟ r0 = new Yue.ۥ۠ۤۢ۟
                java.lang.String r1 = "MD5"
                r0.<init>(r3, r1)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final Yue.C2988 m12652(@Yue.InterfaceC4418 Yue.InterfaceC5794 r3) {
                r2 = this;
                java.lang.String r0 = "sink"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥ۠ۤۢ۟ r0 = new Yue.ۥ۠ۤۢ۟
                java.lang.String r1 = "SHA-1"
                r0.<init>(r3, r1)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final Yue.C2988 m12653(@Yue.InterfaceC4418 Yue.InterfaceC5794 r3) {
                r2 = this;
                java.lang.String r0 = "sink"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥ۠ۤۢ۟ r0 = new Yue.ۥ۠ۤۢ۟
                java.lang.String r1 = "SHA-256"
                r0.<init>(r3, r1)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final Yue.C2988 m12654(@Yue.InterfaceC4418 Yue.InterfaceC5794 r3) {
                r2 = this;
                java.lang.String r0 = "sink"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥ۠ۤۢ۟ r0 = new Yue.ۥ۠ۤۢ۟
                java.lang.String r1 = "SHA-512"
                r0.<init>(r3, r1)
                return r0
        }
    }

    static {
            Yue.ۥ۠ۤۢ۟$ۥ r0 = new Yue.ۥ۠ۤۢ۟$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C2988.f9646 = r0
            return
    }

    public C2988(@Yue.InterfaceC4418 Yue.InterfaceC5794 r3, @Yue.InterfaceC4418 Yue.C0879 r4, @Yue.InterfaceC4418 java.lang.String r5) {
            r2 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "algorithm"
            Yue.C3329.m13906(r5, r0)
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r5)     // Catch: java.security.InvalidKeyException -> L28
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L28
            byte[] r4 = r4.mo5104()     // Catch: java.security.InvalidKeyException -> L28
            r1.<init>(r4, r5)     // Catch: java.security.InvalidKeyException -> L28
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L28
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016     // Catch: java.security.InvalidKeyException -> L28
            Yue.C3329.m13903(r0)
            r2.<init>(r3, r0)
            return
        L28:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
    }

    public C2988(@Yue.InterfaceC4418 Yue.InterfaceC5794 r2, @Yue.InterfaceC4418 java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "algorithm"
            Yue.C3329.m13906(r3, r0)
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
            java.lang.String r0 = "getInstance(...)"
            Yue.C3329.m13905(r3, r0)
            r1.<init>(r2, r3)
            return
    }

    public C2988(@Yue.InterfaceC4418 Yue.InterfaceC5794 r2, @Yue.InterfaceC4418 java.security.MessageDigest r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "digest"
            Yue.C3329.m13906(r3, r0)
            r1.<init>(r2)
            r1.f9647 = r3
            r2 = 0
            r1.f9648 = r2
            return
    }

    public C2988(@Yue.InterfaceC4418 Yue.InterfaceC5794 r2, @Yue.InterfaceC4418 javax.crypto.Mac r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "mac"
            Yue.C3329.m13906(r3, r0)
            r1.<init>(r2)
            r1.f9648 = r3
            r2 = 0
            r1.f9647 = r2
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Yue.C2988 m12639(@Yue.InterfaceC4418 Yue.InterfaceC5794 r1, @Yue.InterfaceC4418 Yue.C0879 r2) {
            Yue.ۥ۠ۤۢ۟$ۥ r0 = Yue.C2988.f9646
            Yue.ۥ۠ۤۢ۟ r1 = r0.m12648(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final Yue.C2988 m12640(@Yue.InterfaceC4418 Yue.InterfaceC5794 r1, @Yue.InterfaceC4418 Yue.C0879 r2) {
            Yue.ۥ۠ۤۢ۟$ۥ r0 = Yue.C2988.f9646
            Yue.ۥ۠ۤۢ۟ r1 = r0.m12649(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final Yue.C2988 m12641(@Yue.InterfaceC4418 Yue.InterfaceC5794 r1, @Yue.InterfaceC4418 Yue.C0879 r2) {
            Yue.ۥ۠ۤۢ۟$ۥ r0 = Yue.C2988.f9646
            Yue.ۥ۠ۤۢ۟ r1 = r0.m12650(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final Yue.C2988 m12642(@Yue.InterfaceC4418 Yue.InterfaceC5794 r1) {
            Yue.ۥ۠ۤۢ۟$ۥ r0 = Yue.C2988.f9646
            Yue.ۥ۠ۤۢ۟ r1 = r0.m12651(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final Yue.C2988 m12643(@Yue.InterfaceC4418 Yue.InterfaceC5794 r1) {
            Yue.ۥ۠ۤۢ۟$ۥ r0 = Yue.C2988.f9646
            Yue.ۥ۠ۤۢ۟ r1 = r0.m12652(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final Yue.C2988 m12644(@Yue.InterfaceC4418 Yue.InterfaceC5794 r1) {
            Yue.ۥ۠ۤۢ۟$ۥ r0 = Yue.C2988.f9646
            Yue.ۥ۠ۤۢ۟ r1 = r0.m12653(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final Yue.C2988 m12645(@Yue.InterfaceC4418 Yue.InterfaceC5794 r1) {
            Yue.ۥ۠ۤۢ۟$ۥ r0 = Yue.C2988.f9646
            Yue.ۥ۠ۤۢ۟ r1 = r0.m12654(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "hash", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_hash")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.C0879 m12646() {
            r1 = this;
            Yue.ۥۣ۟ۥۤ r0 = r1.m12647()
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "hash")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Yue.C0879 m12647() {
            r2 = this;
            java.security.MessageDigest r0 = r2.f9647
            if (r0 == 0) goto L9
            byte[] r0 = r0.digest()
            goto L12
        L9:
            javax.crypto.Mac r0 = r2.f9648
            Yue.C3329.m13903(r0)
            byte[] r0 = r0.doFinal()
        L12:
            Yue.ۥۣ۟ۥۤ r1 = new Yue.ۥۣ۟ۥۤ
            Yue.C3329.m13903(r0)
            r1.<init>(r0)
            return r1
    }

    @Override // Yue.AbstractC2753, Yue.InterfaceC5794
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo4176(@Yue.InterfaceC4418 Yue.C0843 r8, long r9) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r8, r0)
            long r1 = r8.m4889()
            r3 = 0
            r5 = r9
            Yue.C0018.m264(r1, r3, r5)
            Yue.ۥۡۧۨ r0 = r8.f2378
            Yue.C3329.m13903(r0)
            r1 = 0
        L16:
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 >= 0) goto L47
            long r3 = r9 - r1
            int r5 = r0.f20492
            int r6 = r0.f20491
            int r5 = r5 - r6
            long r5 = (long) r5
            long r3 = java.lang.Math.min(r3, r5)
            int r3 = (int) r3
            java.security.MessageDigest r4 = r7.f9647
            if (r4 == 0) goto L33
            byte[] r5 = r0.f20490
            int r6 = r0.f20491
            r4.update(r5, r6, r3)
            goto L3f
        L33:
            javax.crypto.Mac r4 = r7.f9648
            Yue.C3329.m13903(r4)
            byte[] r5 = r0.f20490
            int r6 = r0.f20491
            r4.update(r5, r6, r3)
        L3f:
            long r3 = (long) r3
            long r1 = r1 + r3
            Yue.ۥۡۧۨ r0 = r0.f20495
            Yue.C3329.m13903(r0)
            goto L16
        L47:
            super.mo4176(r8, r9)
            return
    }
}
