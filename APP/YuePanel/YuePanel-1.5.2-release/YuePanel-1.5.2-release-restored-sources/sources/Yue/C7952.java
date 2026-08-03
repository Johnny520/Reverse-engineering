package Yue;

import android.net.TrafficStats;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/* JADX INFO: renamed from: Yue.ۥۣۢۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7952 {

    /* JADX INFO: renamed from: Yue.ۥۣۢۢ۟$ۥ */
    @InterfaceC7113(24)
    public static class C1388 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m3977(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m3978(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public static void m3975() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public static int m3976() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m25091(int i) {
        TrafficStats.incrementOperationCount(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m25092(int i, int i2) {
        TrafficStats.incrementOperationCount(i, i2);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m25093(int i) {
        TrafficStats.setThreadStatsTag(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m25094(@InterfaceC6391 DatagramSocket datagramSocket) throws SocketException {
        C1388.m3977(datagramSocket);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m25095(Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m25096(@InterfaceC6391 DatagramSocket datagramSocket) throws SocketException {
        C1388.m3978(datagramSocket);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m25097(Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }
}
