package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0958 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.AbstractC0958.C0959 f2722 = null;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۦ$ۥ, reason: contains not printable characters */
    public static final class C0959 {
        public C0959() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0959(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.AbstractC0958 m5413(@Yue.InterfaceC4418 javax.net.ssl.X509TrustManager r2) {
                r1 = this;
                java.lang.String r0 = "trustManager"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥۡۤۡۢ$ۥ r0 = Yue.C4773.f15123
                Yue.ۥۡۤۡۢ r0 = r0.m19021()
                Yue.ۥ۟ۤ۟ۦ r2 = r0.mo1391(r2)
                return r2
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.AbstractC0958 m5414(@Yue.InterfaceC4418 java.security.cert.X509Certificate... r4) {
                r3 = this;
                java.lang.String r0 = "caCerts"
                Yue.C3329.m13906(r4, r0)
                Yue.ۥ۟ۢۦ۠ r0 = new Yue.ۥ۟ۢۦ۠
                Yue.ۥ۟ۢۦۥ r1 = new Yue.ۥ۟ۢۦۥ
                int r2 = r4.length
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)
                java.security.cert.X509Certificate[] r4 = (java.security.cert.X509Certificate[]) r4
                r1.<init>(r4)
                r0.<init>(r1)
                return r0
        }
    }

    static {
            Yue.ۥ۟ۤ۟ۦ$ۥ r0 = new Yue.ۥ۟ۤ۟ۦ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.AbstractC0958.f2722 = r0
            return
    }

    public AbstractC0958() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public abstract java.util.List<java.security.cert.Certificate> mo1407(@Yue.InterfaceC4418 java.util.List<? extends java.security.cert.Certificate> r1, @Yue.InterfaceC4418 java.lang.String r2) throws javax.net.ssl.SSLPeerUnverifiedException;
}
