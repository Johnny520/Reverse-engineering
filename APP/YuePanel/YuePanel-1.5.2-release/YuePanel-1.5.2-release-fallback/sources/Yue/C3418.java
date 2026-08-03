package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3418 extends Yue.AbstractC2355 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.io.RandomAccessFile f10894;

    public C3418(boolean r2, @Yue.InterfaceC4418 java.io.RandomAccessFile r3) {
            r1 = this;
            java.lang.String r0 = "randomAccessFile"
            Yue.C3329.m13906(r3, r0)
            r1.<init>(r2)
            r1.f10894 = r3
            return
    }

    @Override // Yue.AbstractC2355
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public synchronized void mo10817() {
            r1 = this;
            monitor-enter(r1)
            java.io.RandomAccessFile r0 = r1.f10894     // Catch: java.lang.Throwable -> L8
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
            r1 = this;
            monitor-enter(r1)
            java.io.RandomAccessFile r0 = r1.f10894     // Catch: java.lang.Throwable -> Lc
            java.io.FileDescriptor r0 = r0.getFD()     // Catch: java.lang.Throwable -> Lc
            r0.sync()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @Override // Yue.AbstractC2355
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public synchronized int mo10819(long r2, @Yue.InterfaceC4418 byte[] r4, int r5, int r6) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r4, r0)     // Catch: java.lang.Throwable -> L1f
            java.io.RandomAccessFile r0 = r1.f10894     // Catch: java.lang.Throwable -> L1f
            r0.seek(r2)     // Catch: java.lang.Throwable -> L1f
            r2 = 0
        Lc:
            if (r2 >= r6) goto L21
            java.io.RandomAccessFile r3 = r1.f10894     // Catch: java.lang.Throwable -> L1f
            int r0 = r6 - r2
            int r3 = r3.read(r4, r5, r0)     // Catch: java.lang.Throwable -> L1f
            r0 = -1
            if (r3 != r0) goto L1d
            if (r2 != 0) goto L21
            monitor-exit(r1)
            return r0
        L1d:
            int r2 = r2 + r3
            goto Lc
        L1f:
            r2 = move-exception
            goto L23
        L21:
            monitor-exit(r1)
            return r2
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
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
            java.io.RandomAccessFile r0 = r7.f10894     // Catch: java.lang.Throwable -> L16
            r0.setLength(r8)     // Catch: java.lang.Throwable -> L16
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
            java.io.RandomAccessFile r0 = r2.f10894     // Catch: java.lang.Throwable -> L9
            long r0 = r0.length()     // Catch: java.lang.Throwable -> L9
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
            Yue.C3329.m13906(r4, r0)     // Catch: java.lang.Throwable -> L12
            java.io.RandomAccessFile r0 = r1.f10894     // Catch: java.lang.Throwable -> L12
            r0.seek(r2)     // Catch: java.lang.Throwable -> L12
            java.io.RandomAccessFile r2 = r1.f10894     // Catch: java.lang.Throwable -> L12
            r2.write(r4, r5, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }
}
