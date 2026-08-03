package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6391 {

    /* JADX INFO: renamed from: Yue.ۥۣۢۢ۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C6392 {
        public C6392() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m23612(java.net.DatagramSocket r0) throws java.net.SocketException {
                android.net.TrafficStats.tagDatagramSocket(r0)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m23613(java.net.DatagramSocket r0) throws java.net.SocketException {
                android.net.TrafficStats.untagDatagramSocket(r0)
                return
        }
    }

    public C6391() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m23603() {
            android.net.TrafficStats.clearThreadStatsTag()
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static int m23604() {
            int r0 = android.net.TrafficStats.getThreadStatsTag()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m23605(int r0) {
            android.net.TrafficStats.incrementOperationCount(r0)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m23606(int r0, int r1) {
            android.net.TrafficStats.incrementOperationCount(r0, r1)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m23607(int r0) {
            android.net.TrafficStats.setThreadStatsTag(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m23608(@Yue.InterfaceC4410 java.net.DatagramSocket r0) throws java.net.SocketException {
            Yue.C6391.C6392.m23612(r0)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m23609(java.net.Socket r0) throws java.net.SocketException {
            android.net.TrafficStats.tagSocket(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m23610(@Yue.InterfaceC4410 java.net.DatagramSocket r0) throws java.net.SocketException {
            Yue.C6391.C6392.m23613(r0)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m23611(java.net.Socket r0) throws java.net.SocketException {
            android.net.TrafficStats.untagSocket(r0)
            return
    }
}
