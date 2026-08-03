package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1943 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.InterfaceC1943.C1944 f6089 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.InterfaceC1943 f6090 = null;

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۧۢ$ۥ, reason: contains not printable characters */
    public static final class C1944 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ Yue.InterfaceC1943.C1944 f6091 = null;

        /* JADX INFO: renamed from: Yue.ۥ۠۟ۧۢ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C1945 implements Yue.InterfaceC1943 {
            public C1945() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // Yue.InterfaceC1943
            @Yue.InterfaceC4418
            /* JADX INFO: renamed from: ۥ */
            public java.util.List<java.net.InetAddress> mo8933(@Yue.InterfaceC4418 java.lang.String r5) {
                    r4 = this;
                    java.lang.String r0 = "hostname"
                    Yue.C3329.m13906(r5, r0)
                    java.net.InetAddress[] r0 = java.net.InetAddress.getAllByName(r5)     // Catch: java.lang.NullPointerException -> L13
                    java.lang.String r1 = "getAllByName(hostname)"
                    Yue.C3329.m13905(r0, r1)     // Catch: java.lang.NullPointerException -> L13
                    java.util.List r5 = Yue.C0595.m3982(r0)     // Catch: java.lang.NullPointerException -> L13
                    return r5
                L13:
                    r0 = move-exception
                    java.net.UnknownHostException r1 = new java.net.UnknownHostException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Broken system behaviour for dns lookup of "
                    r2.append(r3)
                    r2.append(r5)
                    java.lang.String r5 = r2.toString()
                    r1.<init>(r5)
                    r1.initCause(r0)
                    throw r1
            }
        }

        static {
                Yue.ۥ۠۟ۧۢ$ۥ r0 = new Yue.ۥ۠۟ۧۢ$ۥ
                r0.<init>()
                Yue.InterfaceC1943.C1944.f6091 = r0
                return
        }

        public C1944() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥ۠۟ۧۢ$ۥ r0 = Yue.InterfaceC1943.C1944.f6091
            Yue.InterfaceC1943.f6089 = r0
            Yue.ۥ۠۟ۧۢ$ۥ$ۥ r0 = new Yue.ۥ۠۟ۧۢ$ۥ$ۥ
            r0.<init>()
            Yue.InterfaceC1943.f6090 = r0
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    java.util.List<java.net.InetAddress> mo8933(@Yue.InterfaceC4418 java.lang.String r1) throws java.net.UnknownHostException;
}
