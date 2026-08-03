package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4389 extends Yue.AbstractC2355 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.nio.channels.FileChannel f13951;

    public C4389(boolean r2, @Yue.InterfaceC4418 java.nio.channels.FileChannel r3) {
            r1 = this;
            java.lang.String r0 = "fileChannel"
            Yue.C3329.m13906(r3, r0)
            r1.<init>(r2)
            r1.f13951 = r3
            return
    }

    @Override // Yue.AbstractC2355
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public synchronized void mo10817() {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.FileChannel r0 = r1.f13951     // Catch: java.lang.Throwable -> L8
            r0.close()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // Yue.AbstractC2355
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public synchronized void mo10818() {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.FileChannel r0 = r2.f13951     // Catch: java.lang.Throwable -> L9
            r1 = 1
            r0.force(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // Yue.AbstractC2355
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public synchronized int mo10819(long r2, @Yue.InterfaceC4418 byte[] r4, int r5, int r6) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r4, r0)     // Catch: java.lang.Throwable -> L21
            java.nio.channels.FileChannel r0 = r1.f13951     // Catch: java.lang.Throwable -> L21
            r0.position(r2)     // Catch: java.lang.Throwable -> L21
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r4, r5, r6)     // Catch: java.lang.Throwable -> L21
            r3 = 0
        L10:
            if (r3 >= r6) goto L23
            java.nio.channels.FileChannel r4 = r1.f13951     // Catch: java.lang.Throwable -> L21
            int r4 = r4.read(r2)     // Catch: java.lang.Throwable -> L21
            r5 = -1
            if (r4 != r5) goto L1f
            if (r3 != 0) goto L23
            monitor-exit(r1)
            return r5
        L1f:
            int r3 = r3 + r4
            goto L10
        L21:
            r2 = move-exception
            goto L25
        L23:
            monitor-exit(r1)
            return r3
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            throw r2
    }

    @Override // Yue.AbstractC2355
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public synchronized void mo10820(long r8) {
            r7 = this;
            monitor-enter(r7)
            long r1 = r7.m10830()     // Catch: java.lang.Throwable -> L16
            long r3 = r8 - r1
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L18
            int r5 = (int) r3     // Catch: java.lang.Throwable -> L16
            byte[] r3 = new byte[r5]     // Catch: java.lang.Throwable -> L16
            r4 = 0
            r0 = r7
            r0.mo10822(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L16
            goto L1d
        L16:
            r8 = move-exception
            goto L1f
        L18:
            java.nio.channels.FileChannel r0 = r7.f13951     // Catch: java.lang.Throwable -> L16
            r0.truncate(r8)     // Catch: java.lang.Throwable -> L16
        L1d:
            monitor-exit(r7)
            return
        L1f:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L16
            throw r8
    }

    @Override // Yue.AbstractC2355
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public synchronized long mo10821() {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.FileChannel r0 = r2.f13951     // Catch: java.lang.Throwable -> L9
            long r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // Yue.AbstractC2355
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public synchronized void mo10822(long r2, @Yue.InterfaceC4418 byte[] r4, int r5, int r6) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r4, r0)     // Catch: java.lang.Throwable -> L16
            java.nio.channels.FileChannel r0 = r1.f13951     // Catch: java.lang.Throwable -> L16
            r0.position(r2)     // Catch: java.lang.Throwable -> L16
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r4, r5, r6)     // Catch: java.lang.Throwable -> L16
            java.nio.channels.FileChannel r3 = r1.f13951     // Catch: java.lang.Throwable -> L16
            r3.write(r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return
        L16:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
    }
}
