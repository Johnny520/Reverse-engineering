package okio;

/* JADX INFO: compiled from: NioFileSystemFileHandle.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\bH\u0014J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\rH\u0014J\b\u0010\u0014\u001a\u00020\rH\u0014J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m115d2 = {"Lokio/NioFileSystemFileHandle;", "Lokio/FileHandle;", "readWrite", "", "fileChannel", "Ljava/nio/channels/FileChannel;", "(ZLjava/nio/channels/FileChannel;)V", "protectedClose", "", "protectedFlush", "protectedRead", "", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "protectedResize", "size", "protectedSize", "protectedWrite", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class NioFileSystemFileHandle extends okio.FileHandle {
    private final java.nio.channels.FileChannel fileChannel;

    public NioFileSystemFileHandle(boolean r2, java.nio.channels.FileChannel r3) {
            r1 = this;
            java.lang.String r0 = "fileChannel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>(r2)
            r1.fileChannel = r3
            return
    }

    @Override // okio.FileHandle
    protected synchronized void protectedClose() {
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
    protected synchronized void protectedFlush() {
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
    protected synchronized int protectedRead(long r5, byte[] r7, int r8, int r9) {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)     // Catch: java.lang.Throwable -> L24
            java.nio.channels.FileChannel r0 = r4.fileChannel     // Catch: java.lang.Throwable -> L24
            r0.position(r5)     // Catch: java.lang.Throwable -> L24
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r7, r8, r9)     // Catch: java.lang.Throwable -> L24
            r1 = 0
        L10:
            if (r1 >= r9) goto L22
            java.nio.channels.FileChannel r2 = r4.fileChannel     // Catch: java.lang.Throwable -> L24
            int r2 = r2.read(r0)     // Catch: java.lang.Throwable -> L24
            r3 = -1
            if (r2 != r3) goto L20
            if (r1 != 0) goto L1f
            monitor-exit(r4)
            return r3
        L1f:
            goto L22
        L20:
            int r1 = r1 + r2
            goto L10
        L22:
            monitor-exit(r4)
            return r1
        L24:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L24
            throw r5
    }

    @Override // okio.FileHandle
    protected synchronized void protectedResize(long r11) {
            r10 = this;
            monitor-enter(r10)
            long r0 = r10.size()     // Catch: java.lang.Throwable -> L1f
            long r8 = r11 - r0
            r2 = 0
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 <= 0) goto L18
            int r2 = (int) r8     // Catch: java.lang.Throwable -> L1f
            byte[] r5 = new byte[r2]     // Catch: java.lang.Throwable -> L1f
            r6 = 0
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L1f
            r2 = r10
            r3 = r0
            r2.protectedWrite(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L1f
            goto L1d
        L18:
            java.nio.channels.FileChannel r2 = r10.fileChannel     // Catch: java.lang.Throwable -> L1f
            r2.truncate(r11)     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r10)
            return
        L1f:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L1f
            throw r11
    }

    @Override // okio.FileHandle
    protected synchronized long protectedSize() {
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
    protected synchronized void protectedWrite(long r3, byte[] r5, int r6, int r7) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)     // Catch: java.lang.Throwable -> L16
            java.nio.channels.FileChannel r0 = r2.fileChannel     // Catch: java.lang.Throwable -> L16
            r0.position(r3)     // Catch: java.lang.Throwable -> L16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r5, r6, r7)     // Catch: java.lang.Throwable -> L16
            java.nio.channels.FileChannel r1 = r2.fileChannel     // Catch: java.lang.Throwable -> L16
            r1.write(r0)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            return
        L16:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r3
    }
}
