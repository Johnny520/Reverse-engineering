package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nJdk9Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,89:1\n37#2,2:90\n*S KotlinDebug\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n*L\n36#1:90,2\n*E\n"})
public class C3365 extends Yue.C4773 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3365.C3366 f10822 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean f10823 = false;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟۟$ۥ, reason: contains not printable characters */
    public static final class C3366 {
        public C3366() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C3366(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C3365 m13976() {
                r1 = this;
                boolean r0 = r1.m13977()
                if (r0 == 0) goto Lc
                Yue.ۥ۠ۦ۟۟ r0 = new Yue.ۥ۠ۦ۟۟
                r0.<init>()
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean m13977() {
                r1 = this;
                boolean r0 = Yue.C3365.m13975()
                return r0
        }
    }

    static {
            Yue.ۥ۠ۦ۟۟$ۥ r0 = new Yue.ۥ۠ۦ۟۟$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C3365.f10822 = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L15
            java.lang.Integer r0 = Yue.C5987.m22242(r0)
            goto L16
        L15:
            r0 = r1
        L16:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L24
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L2c
        L22:
            r2 = r3
            goto L2c
        L24:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "getApplicationProtocol"
            r0.getMethod(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L2c
            goto L22
        L2c:
            Yue.C3365.f10823 = r2
            return
    }

    public C3365() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ boolean m13975() {
            boolean r0 = Yue.C3365.f10823
            return r0
    }

    @Override // Yue.C4773
    @Yue.InterfaceC6064
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo1392(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2, @Yue.InterfaceC4543 java.lang.String r3, @Yue.InterfaceC4418 java.util.List<Yue.EnumC4981> r4) {
            r1 = this;
            java.lang.String r3 = "sslSocket"
            Yue.C3329.m13906(r2, r3)
            java.lang.String r3 = "protocols"
            Yue.C3329.m13906(r4, r3)
            javax.net.ssl.SSLParameters r3 = r2.getSSLParameters()
            Yue.ۥۡۤۡۢ$ۥ r0 = Yue.C4773.f15123
            java.util.List r4 = r0.m19016(r4)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            Yue.C3363.m13973(r3, r4)
            r2.setSSLParameters(r3)
            return
    }

    @Override // Yue.C4773
    @Yue.InterfaceC6064
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public java.lang.String mo1393(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r3) {
            r2 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
            java.lang.String r3 = Yue.C3364.m13974(r3)     // Catch: java.lang.UnsupportedOperationException -> L18
            if (r3 != 0) goto Le
            r1 = 1
            goto L14
        Le:
            java.lang.String r1 = ""
            boolean r1 = Yue.C3329.m13897(r3, r1)     // Catch: java.lang.UnsupportedOperationException -> L18
        L14:
            if (r1 == 0) goto L17
            goto L18
        L17:
            r0 = r3
        L18:
            return r0
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public javax.net.ssl.X509TrustManager mo1395(@Yue.InterfaceC4418 javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            java.lang.String r0 = "sslSocketFactory"
            Yue.C3329.m13906(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+"
            r2.<init>(r0)
            throw r2
    }
}
