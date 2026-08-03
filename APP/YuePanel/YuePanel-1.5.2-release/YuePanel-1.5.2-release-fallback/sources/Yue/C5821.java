package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5821 {
    public C5821() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Utility class"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m21666(Yue.C6989 r4, java.nio.channels.ByteChannel r5) throws java.io.IOException {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r1 = r4.f24378
            java.lang.Object r1 = r1.peek()
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            if (r1 != 0) goto L1f
            boolean r1 = r5 instanceof Yue.InterfaceC7132
            if (r1 == 0) goto L38
            r1 = r5
            Yue.ۥۢۦ۠ r1 = (Yue.InterfaceC7132) r1
            boolean r2 = r1.mo567()
            if (r2 == 0) goto L39
            r1.mo565()
            goto L39
        L1f:
            r5.write(r1)
            int r1 = r1.remaining()
            if (r1 <= 0) goto L29
            return r0
        L29:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r1 = r4.f24378
            r1.poll()
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r1 = r4.f24378
            java.lang.Object r1 = r1.peek()
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            if (r1 != 0) goto L1f
        L38:
            r1 = 0
        L39:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r4.f24378
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L66
            boolean r2 = r4.mo26949()
            if (r2 == 0) goto L66
            Yue.ۥ۠۠۠۟ r2 = r4.mo26943()
            if (r2 == 0) goto L66
            Yue.ۥ۠۠۠۟ r2 = r4.mo26943()
            Yue.ۥۡۧ۟ۨ r2 = r2.m9164()
            if (r2 == 0) goto L66
            Yue.ۥ۠۠۠۟ r2 = r4.mo26943()
            Yue.ۥۡۧ۟ۨ r2 = r2.m9164()
            Yue.ۥۡۧ۟ۨ r3 = Yue.EnumC5428.f20113
            if (r2 != r3) goto L66
            r4.m27019()
        L66:
            if (r1 == 0) goto L70
            Yue.ۥۢۦ۠ r5 = (Yue.InterfaceC7132) r5
            boolean r4 = r5.mo567()
            if (r4 != 0) goto L71
        L70:
            r0 = 1
        L71:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m21667(java.nio.ByteBuffer r1, Yue.C6989 r2, java.nio.channels.ByteChannel r3) throws java.io.IOException {
            r1.clear()
            int r3 = r3.read(r1)
            r1.flip()
            r1 = -1
            r0 = 0
            if (r3 != r1) goto L12
            r2.m27027()
            return r0
        L12:
            if (r3 == 0) goto L15
            r0 = 1
        L15:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m21668(java.nio.ByteBuffer r1, Yue.C6989 r2, Yue.InterfaceC7132 r3) throws java.io.IOException {
            r1.clear()
            int r0 = r3.mo566(r1)
            r1.flip()
            r1 = -1
            if (r0 != r1) goto L12
            r2.m27027()
            r1 = 0
            return r1
        L12:
            boolean r1 = r3.mo568()
            return r1
    }
}
