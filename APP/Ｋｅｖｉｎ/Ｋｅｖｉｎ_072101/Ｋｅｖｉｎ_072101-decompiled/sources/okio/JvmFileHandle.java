package okio;

/* JADX INFO: compiled from: JvmFileHandle.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\bH\u0014J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\rH\u0014J\b\u0010\u0014\u001a\u00020\rH\u0014J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m115d2 = {"Lokio/JvmFileHandle;", "Lokio/FileHandle;", "readWrite", "", "randomAccessFile", "Ljava/io/RandomAccessFile;", "(ZLjava/io/RandomAccessFile;)V", "protectedClose", "", "protectedFlush", "protectedRead", "", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "protectedResize", "size", "protectedSize", "protectedWrite", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class JvmFileHandle extends okio.FileHandle {
    private final java.io.RandomAccessFile randomAccessFile;

    public JvmFileHandle(boolean r2, java.io.RandomAccessFile r3) {
            r1 = this;
            java.lang.String r0 = "randomAccessFile"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>(r2)
            r1.randomAccessFile = r3
            return
    }

    @Override // okio.FileHandle
    protected synchronized void protectedClose() {
            r1 = this;
            monitor-enter(r1)
            java.io.RandomAccessFile r0 = r1.randomAccessFile     // Catch: java.lang.Throwable -> L8
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
            r1 = this;
            monitor-enter(r1)
            java.io.RandomAccessFile r0 = r1.randomAccessFile     // Catch: java.lang.Throwable -> Lc
            java.io.FileDescriptor r0 = r0.getFD()     // Catch: java.lang.Throwable -> Lc
            r0.sync()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @Override // okio.FileHandle
    protected synchronized int protectedRead(long r4, byte[] r6, int r7, int r8) {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)     // Catch: java.lang.Throwable -> L22
            java.io.RandomAccessFile r0 = r3.randomAccessFile     // Catch: java.lang.Throwable -> L22
            r0.seek(r4)     // Catch: java.lang.Throwable -> L22
            r0 = 0
        Lc:
            if (r0 >= r8) goto L20
            java.io.RandomAccessFile r1 = r3.randomAccessFile     // Catch: java.lang.Throwable -> L22
            int r2 = r8 - r0
            int r1 = r1.read(r6, r7, r2)     // Catch: java.lang.Throwable -> L22
            r2 = -1
            if (r1 != r2) goto L1e
            if (r0 != 0) goto L1d
            monitor-exit(r3)
            return r2
        L1d:
            goto L20
        L1e:
            int r0 = r0 + r1
            goto Lc
        L20:
            monitor-exit(r3)
            return r0
        L22:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r4
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
            java.io.RandomAccessFile r2 = r10.randomAccessFile     // Catch: java.lang.Throwable -> L1f
            r2.setLength(r11)     // Catch: java.lang.Throwable -> L1f
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
            java.io.RandomAccessFile r0 = r2.randomAccessFile     // Catch: java.lang.Throwable -> L9
            long r0 = r0.length()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // okio.FileHandle
    protected synchronized void protectedWrite(long r2, byte[] r4, int r5, int r6) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)     // Catch: java.lang.Throwable -> L12
            java.io.RandomAccessFile r0 = r1.randomAccessFile     // Catch: java.lang.Throwable -> L12
            r0.seek(r2)     // Catch: java.lang.Throwable -> L12
            java.io.RandomAccessFile r0 = r1.randomAccessFile     // Catch: java.lang.Throwable -> L12
            r0.write(r4, r5, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }
}
