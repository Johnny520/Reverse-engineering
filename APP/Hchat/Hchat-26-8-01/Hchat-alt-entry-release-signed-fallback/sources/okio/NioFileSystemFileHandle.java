package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class NioFileSystemFileHandle extends okio.FileHandle {
    private final java.nio.channels.FileChannel fileChannel;

    public NioFileSystemFileHandle(boolean r1, java.nio.channels.FileChannel r2) {
            r0 = this;
            r2.getClass()
            r0.<init>(r1)
            r0.fileChannel = r2
            return
    }

    @Override // okio.FileHandle
    public synchronized void protectedClose() {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.FileChannel r0 = r1.fileChannel     // Catch: java.lang.Throwable -> L8
            r0.close()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // okio.FileHandle
    public synchronized void protectedFlush() {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.FileChannel r0 = r2.fileChannel     // Catch: java.lang.Throwable -> L9
            r1 = 1
            r0.force(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // okio.FileHandle
    public synchronized int protectedRead(long r2, byte[] r4, int r5, int r6) {
            r1 = this;
            monitor-enter(r1)
            r4.getClass()     // Catch: java.lang.Throwable -> L1f
            java.nio.channels.FileChannel r0 = r1.fileChannel     // Catch: java.lang.Throwable -> L1f
            r0.position(r2)     // Catch: java.lang.Throwable -> L1f
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r4, r5, r6)     // Catch: java.lang.Throwable -> L1f
            r3 = 0
        Le:
            if (r3 >= r6) goto L21
            java.nio.channels.FileChannel r4 = r1.fileChannel     // Catch: java.lang.Throwable -> L1f
            int r4 = r4.read(r2)     // Catch: java.lang.Throwable -> L1f
            r5 = -1
            if (r4 != r5) goto L1d
            if (r3 != 0) goto L21
            monitor-exit(r1)
            return r5
        L1d:
            int r3 = r3 + r4
            goto Le
        L1f:
            r2 = move-exception
            goto L23
        L21:
            monitor-exit(r1)
            return r3
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r2
    }

    @Override // okio.FileHandle
    public synchronized void protectedResize(long r8) {
            r7 = this;
            monitor-enter(r7)
            long r2 = r7.size()     // Catch: java.lang.Throwable -> L19
            long r0 = r8 - r2
            r4 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L1c
            int r6 = (int) r0     // Catch: java.lang.Throwable -> L19
            byte[] r4 = new byte[r6]     // Catch: java.lang.Throwable -> L19
            r5 = 0
            r1 = r7
            r1.protectedWrite(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L16
            goto L22
        L16:
            r0 = move-exception
        L17:
            r8 = r0
            goto L24
        L19:
            r0 = move-exception
            r1 = r7
            goto L17
        L1c:
            r1 = r7
            java.nio.channels.FileChannel r0 = r1.fileChannel     // Catch: java.lang.Throwable -> L16
            r0.truncate(r8)     // Catch: java.lang.Throwable -> L16
        L22:
            monitor-exit(r7)
            return
        L24:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L16
            throw r8
    }

    @Override // okio.FileHandle
    public synchronized long protectedSize() {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.FileChannel r0 = r2.fileChannel     // Catch: java.lang.Throwable -> L9
            long r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // okio.FileHandle
    public synchronized void protectedWrite(long r2, byte[] r4, int r5, int r6) {
            r1 = this;
            monitor-enter(r1)
            r4.getClass()     // Catch: java.lang.Throwable -> L14
            java.nio.channels.FileChannel r0 = r1.fileChannel     // Catch: java.lang.Throwable -> L14
            r0.position(r2)     // Catch: java.lang.Throwable -> L14
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r4, r5, r6)     // Catch: java.lang.Throwable -> L14
            java.nio.channels.FileChannel r3 = r1.fileChannel     // Catch: java.lang.Throwable -> L14
            r3.write(r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return
        L14:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r2
    }
}
