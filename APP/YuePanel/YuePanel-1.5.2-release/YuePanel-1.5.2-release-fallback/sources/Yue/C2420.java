package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
@java.lang.Deprecated
public class C2420 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f8080;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۡۤ$ۥ, reason: contains not printable characters */
    public class C2421 extends android.hardware.fingerprint.FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2420.AbstractC2423 f8081;

        public C2421(Yue.C2420.AbstractC2423 r1) {
                r0 = this;
                r0.f8081 = r1
                r0.<init>()
                return
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int r2, java.lang.CharSequence r3) {
                r1 = this;
                Yue.ۥ۠ۢۡۤ$ۥ۟۟ r0 = r1.f8081
                r0.m11178(r2, r3)
                return
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
                r1 = this;
                Yue.ۥ۠ۢۡۤ$ۥ۟۟ r0 = r1.f8081
                r0.m11179()
                return
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int r2, java.lang.CharSequence r3) {
                r1 = this;
                Yue.ۥ۠ۢۡۤ$ۥ۟۟ r0 = r1.f8081
                r0.m11180(r2, r3)
                return
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult r3) {
                r2 = this;
                Yue.ۥ۠ۢۡۤ$ۥ۟۟ r0 = r2.f8081
                Yue.ۥ۠ۢۡۤ$ۥ۟۟۟ r1 = new Yue.ۥ۠ۢۡۤ$ۥ۟۟۟
                android.hardware.fingerprint.FingerprintManager$CryptoObject r3 = Yue.C2420.C2422.m11172(r3)
                Yue.ۥ۠ۢۡۤ$ۥ۟۟۟۟ r3 = Yue.C2420.m11164(r3)
                r1.<init>(r3)
                r0.m11181(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۡۤ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C2422 {
        public C2422() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        @Yue.InterfaceC5344("android.permission.USE_FINGERPRINT")
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m11171(java.lang.Object r6, java.lang.Object r7, android.os.CancellationSignal r8, int r9, java.lang.Object r10, android.os.Handler r11) {
                r0 = r6
                android.hardware.fingerprint.FingerprintManager r0 = (android.hardware.fingerprint.FingerprintManager) r0
                r1 = r7
                android.hardware.fingerprint.FingerprintManager$CryptoObject r1 = (android.hardware.fingerprint.FingerprintManager.CryptoObject) r1
                r4 = r10
                android.hardware.fingerprint.FingerprintManager$AuthenticationCallback r4 = (android.hardware.fingerprint.FingerprintManager.AuthenticationCallback) r4
                r2 = r8
                r3 = r9
                r5 = r11
                r0.authenticate(r1, r2, r3, r4, r5)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.hardware.fingerprint.FingerprintManager.CryptoObject m11172(java.lang.Object r0) {
                android.hardware.fingerprint.FingerprintManager$AuthenticationResult r0 = (android.hardware.fingerprint.FingerprintManager.AuthenticationResult) r0
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = r0.getCryptoObject()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static android.hardware.fingerprint.FingerprintManager m11173(android.content.Context r2) {
                android.content.pm.PackageManager r0 = r2.getPackageManager()
                java.lang.String r1 = "android.hardware.fingerprint"
                boolean r0 = r0.hasSystemFeature(r1)
                if (r0 == 0) goto L15
                java.lang.Class<android.hardware.fingerprint.FingerprintManager> r0 = android.hardware.fingerprint.FingerprintManager.class
                java.lang.Object r2 = r2.getSystemService(r0)
                android.hardware.fingerprint.FingerprintManager r2 = (android.hardware.fingerprint.FingerprintManager) r2
                return r2
            L15:
                r2 = 0
                return r2
        }

        @Yue.InterfaceC1947
        @Yue.InterfaceC5344("android.permission.USE_FINGERPRINT")
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean m11174(java.lang.Object r0) {
                android.hardware.fingerprint.FingerprintManager r0 = (android.hardware.fingerprint.FingerprintManager) r0
                boolean r0 = r0.hasEnrolledFingerprints()
                return r0
        }

        @Yue.InterfaceC1947
        @Yue.InterfaceC5344("android.permission.USE_FINGERPRINT")
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static boolean m11175(java.lang.Object r0) {
                android.hardware.fingerprint.FingerprintManager r0 = (android.hardware.fingerprint.FingerprintManager) r0
                boolean r0 = r0.isHardwareDetected()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static Yue.C2420.C2425 m11176(java.lang.Object r2) {
                android.hardware.fingerprint.FingerprintManager$CryptoObject r2 = (android.hardware.fingerprint.FingerprintManager.CryptoObject) r2
                r0 = 0
                if (r2 != 0) goto L6
                return r0
            L6:
                javax.crypto.Cipher r1 = r2.getCipher()
                if (r1 == 0) goto L16
                Yue.ۥ۠ۢۡۤ$ۥ۟۟۟۟ r0 = new Yue.ۥ۠ۢۡۤ$ۥ۟۟۟۟
                javax.crypto.Cipher r2 = r2.getCipher()
                r0.<init>(r2)
                return r0
            L16:
                java.security.Signature r1 = r2.getSignature()
                if (r1 == 0) goto L26
                Yue.ۥ۠ۢۡۤ$ۥ۟۟۟۟ r0 = new Yue.ۥ۠ۢۡۤ$ۥ۟۟۟۟
                java.security.Signature r2 = r2.getSignature()
                r0.<init>(r2)
                return r0
            L26:
                javax.crypto.Mac r1 = r2.getMac()
                if (r1 == 0) goto L35
                Yue.ۥ۠ۢۡۤ$ۥ۟۟۟۟ r0 = new Yue.ۥ۠ۢۡۤ$ۥ۟۟۟۟
                javax.crypto.Mac r2 = r2.getMac()
                r0.<init>(r2)
            L35:
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static android.hardware.fingerprint.FingerprintManager.CryptoObject m11177(Yue.C2420.C2425 r2) {
                r0 = 0
                if (r2 != 0) goto L4
                return r0
            L4:
                javax.crypto.Cipher r1 = r2.m11183()
                if (r1 == 0) goto L14
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = new android.hardware.fingerprint.FingerprintManager$CryptoObject
                javax.crypto.Cipher r2 = r2.m11183()
                r0.<init>(r2)
                return r0
            L14:
                java.security.Signature r1 = r2.m11185()
                if (r1 == 0) goto L24
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = new android.hardware.fingerprint.FingerprintManager$CryptoObject
                java.security.Signature r2 = r2.m11185()
                r0.<init>(r2)
                return r0
            L24:
                javax.crypto.Mac r1 = r2.m11184()
                if (r1 == 0) goto L33
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = new android.hardware.fingerprint.FingerprintManager$CryptoObject
                javax.crypto.Mac r2 = r2.m11184()
                r0.<init>(r2)
            L33:
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۡۤ$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractC2423 {
        public AbstractC2423() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m11178(int r1, @Yue.InterfaceC4410 java.lang.CharSequence r2) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m11179() {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m11180(int r1, @Yue.InterfaceC4410 java.lang.CharSequence r2) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m11181(@Yue.InterfaceC4410 Yue.C2420.C2424 r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۡۤ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C2424 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C2420.C2425 f8082;

        public C2424(@Yue.InterfaceC4410 Yue.C2420.C2425 r1) {
                r0 = this;
                r0.<init>()
                r0.f8082 = r1
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C2420.C2425 m11182() {
                r1 = this;
                Yue.ۥ۠ۢۡۤ$ۥ۟۟۟۟ r0 = r1.f8082
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۡۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C2425 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.security.Signature f8083;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final javax.crypto.Cipher f8084;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final javax.crypto.Mac f8085;

        public C2425(@Yue.InterfaceC4410 java.security.Signature r1) {
                r0 = this;
                r0.<init>()
                r0.f8083 = r1
                r1 = 0
                r0.f8084 = r1
                r0.f8085 = r1
                return
        }

        public C2425(@Yue.InterfaceC4410 javax.crypto.Cipher r1) {
                r0 = this;
                r0.<init>()
                r0.f8084 = r1
                r1 = 0
                r0.f8083 = r1
                r0.f8085 = r1
                return
        }

        public C2425(@Yue.InterfaceC4410 javax.crypto.Mac r1) {
                r0 = this;
                r0.<init>()
                r0.f8085 = r1
                r1 = 0
                r0.f8084 = r1
                r0.f8083 = r1
                return
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public javax.crypto.Cipher m11183() {
                r1 = this;
                javax.crypto.Cipher r0 = r1.f8084
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public javax.crypto.Mac m11184() {
                r1 = this;
                javax.crypto.Mac r0 = r1.f8085
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public java.security.Signature m11185() {
                r1 = this;
                java.security.Signature r0 = r1.f8083
                return r0
        }
    }

    public C2420(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f8080 = r1
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C2420 m11162(@Yue.InterfaceC4410 android.content.Context r1) {
            Yue.ۥ۠ۢۡۤ r0 = new Yue.ۥ۠ۢۡۤ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4544
    @Yue.InterfaceC5336(23)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static android.hardware.fingerprint.FingerprintManager m11163(@Yue.InterfaceC4410 android.content.Context r0) {
            android.hardware.fingerprint.FingerprintManager r0 = Yue.C2420.C2422.m11173(r0)
            return r0
    }

    @Yue.InterfaceC5336(23)
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Yue.C2420.C2425 m11164(android.hardware.fingerprint.FingerprintManager.CryptoObject r0) {
            Yue.ۥ۠ۢۡۤ$ۥ۟۟۟۟ r0 = Yue.C2420.C2422.m11176(r0)
            return r0
    }

    @Yue.InterfaceC5336(23)
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static android.hardware.fingerprint.FingerprintManager.AuthenticationCallback m11165(Yue.C2420.AbstractC2423 r1) {
            Yue.ۥ۠ۢۡۤ$ۥ r0 = new Yue.ۥ۠ۢۡۤ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC5336(23)
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static android.hardware.fingerprint.FingerprintManager.CryptoObject m11166(Yue.C2420.C2425 r0) {
            android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = Yue.C2420.C2422.m11177(r0)
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC5344("android.permission.USE_FINGERPRINT")
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m11167(@Yue.InterfaceC4544 Yue.C2420.C2425 r7, int r8, @Yue.InterfaceC4544 Yue.C0943 r9, @Yue.InterfaceC4410 Yue.C2420.AbstractC2423 r10, @Yue.InterfaceC4544 android.os.Handler r11) {
            r6 = this;
            if (r9 == 0) goto La
            java.lang.Object r9 = r9.m5363()
            android.os.CancellationSignal r9 = (android.os.CancellationSignal) r9
        L8:
            r3 = r9
            goto Lc
        La:
            r9 = 0
            goto L8
        Lc:
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.m11168(r1, r2, r3, r4, r5)
            return
    }

    @Yue.InterfaceC5344("android.permission.USE_FINGERPRINT")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m11168(@Yue.InterfaceC4544 Yue.C2420.C2425 r8, int r9, @Yue.InterfaceC4544 android.os.CancellationSignal r10, @Yue.InterfaceC4410 Yue.C2420.AbstractC2423 r11, @Yue.InterfaceC4544 android.os.Handler r12) {
            r7 = this;
            android.content.Context r0 = r7.f8080
            android.hardware.fingerprint.FingerprintManager r1 = m11163(r0)
            if (r1 == 0) goto L16
            android.hardware.fingerprint.FingerprintManager$CryptoObject r2 = m11166(r8)
            android.hardware.fingerprint.FingerprintManager$AuthenticationCallback r5 = m11165(r11)
            r3 = r10
            r4 = r9
            r6 = r12
            Yue.C2420.C2422.m11171(r1, r2, r3, r4, r5, r6)
        L16:
            return
    }

    @Yue.InterfaceC5344("android.permission.USE_FINGERPRINT")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m11169() {
            r1 = this;
            android.content.Context r0 = r1.f8080
            android.hardware.fingerprint.FingerprintManager r0 = m11163(r0)
            if (r0 == 0) goto L10
            boolean r0 = Yue.C2420.C2422.m11174(r0)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Yue.InterfaceC5344("android.permission.USE_FINGERPRINT")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m11170() {
            r1 = this;
            android.content.Context r0 = r1.f8080
            android.hardware.fingerprint.FingerprintManager r0 = m11163(r0)
            if (r0 == 0) goto L10
            boolean r0 = Yue.C2420.C2422.m11175(r0)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }
}
