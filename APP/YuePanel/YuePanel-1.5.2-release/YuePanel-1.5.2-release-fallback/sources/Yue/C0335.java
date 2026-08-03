package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC6064
@android.annotation.SuppressLint({"NewApi"})
@Yue.InterfaceC5840({"SMAP\nAndroid10SocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Android10SocketAdapter.kt\nokhttp3/internal/platform/android/Android10SocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,77:1\n37#2,2:78\n*S KotlinDebug\n*F\n+ 1 Android10SocketAdapter.kt\nokhttp3/internal/platform/android/Android10SocketAdapter\n*L\n60#1:78,2\n*E\n"})
public final class C0335 implements Yue.InterfaceC5818 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0335.C0336 f751 = null;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۤۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC6064
    public static final class C0336 {
        public C0336() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0336(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.InterfaceC5818 m1405() {
                r1 = this;
                boolean r0 = r1.m1406()
                if (r0 == 0) goto Lc
                Yue.ۥ۟۠ۤۥ r0 = new Yue.ۥ۟۠ۤۥ
                r0.<init>()
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean m1406() {
                r2 = this;
                Yue.ۥۡۤۡۢ$ۥ r0 = Yue.C4773.f15123
                boolean r0 = r0.m19022()
                if (r0 == 0) goto L10
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }
    }

    static {
            Yue.ۥ۟۠ۤۥ$ۥ r0 = new Yue.ۥ۟۠ۤۥ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C0335.f751 = r0
            return
    }

    public C0335() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.InterfaceC5818
    public boolean isSupported() {
            r1 = this;
            Yue.ۥ۟۠ۤۥ$ۥ r0 = Yue.C0335.f751
            boolean r0 = r0.m1406()
            return r0
    }

    @Override // Yue.InterfaceC5818
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean mo1400(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r2, r0)
            boolean r2 = Yue.C0334.m1399(r2)
            return r2
    }

    @Override // Yue.InterfaceC5818
    @Yue.InterfaceC4543
    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String mo1401(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = Yue.C3364.m13974(r2)
            if (r2 != 0) goto Ld
            r0 = 1
            goto L13
        Ld:
            java.lang.String r0 = ""
            boolean r0 = Yue.C3329.m13897(r2, r0)
        L13:
            if (r0 == 0) goto L16
            r2 = 0
        L16:
            return r2
    }

    @Override // Yue.InterfaceC5818
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public javax.net.ssl.X509TrustManager mo1402(@Yue.InterfaceC4418 javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            javax.net.ssl.X509TrustManager r1 = Yue.InterfaceC5818.C5819.m21665(r0, r1)
            return r1
    }

    @Override // Yue.InterfaceC5818
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean mo1403(@Yue.InterfaceC4418 javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            boolean r1 = Yue.InterfaceC5818.C5819.m21664(r0, r1)
            return r1
    }

    @Override // Yue.InterfaceC5818
    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo1404(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2, @Yue.InterfaceC4543 java.lang.String r3, @Yue.InterfaceC4418 java.util.List<? extends Yue.EnumC4981> r4) {
            r1 = this;
            java.lang.String r3 = "sslSocket"
            Yue.C3329.m13906(r2, r3)
            java.lang.String r3 = "protocols"
            Yue.C3329.m13906(r4, r3)
            r3 = 1
            Yue.C0333.m1398(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L28
            javax.net.ssl.SSLParameters r3 = r2.getSSLParameters()     // Catch: java.lang.IllegalArgumentException -> L28
            Yue.ۥۡۤۡۢ$ۥ r0 = Yue.C4773.f15123     // Catch: java.lang.IllegalArgumentException -> L28
            java.util.List r4 = r0.m19016(r4)     // Catch: java.lang.IllegalArgumentException -> L28
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.IllegalArgumentException -> L28
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch: java.lang.IllegalArgumentException -> L28
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.IllegalArgumentException -> L28
            Yue.C3363.m13973(r3, r4)     // Catch: java.lang.IllegalArgumentException -> L28
            r2.setSSLParameters(r3)     // Catch: java.lang.IllegalArgumentException -> L28
            return
        L28:
            r2 = move-exception
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Android internal error"
            r3.<init>(r4, r2)
            throw r3
    }
}
