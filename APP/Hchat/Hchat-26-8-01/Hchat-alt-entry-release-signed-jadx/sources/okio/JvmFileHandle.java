package okio;

import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class JvmFileHandle extends FileHandle {
    private final RandomAccessFile randomAccessFile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFileHandle(boolean z9, RandomAccessFile randomAccessFile) {
        super(z9);
        randomAccessFile.getClass();
        this.randomAccessFile = randomAccessFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileHandle
    public synchronized void protectedClose() {
        this.randomAccessFile.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileHandle
    public synchronized void protectedFlush() {
        this.randomAccessFile.getFD().sync();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileHandle
    public synchronized int protectedRead(long j3, byte[] bArr, int i9, int i10) {
        bArr.getClass();
        this.randomAccessFile.seek(j3);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            int i12 = this.randomAccessFile.read(bArr, i9, i10 - i11);
            if (i12 != -1) {
                i11 += i12;
            } else if (i11 == 0) {
                return -1;
            }
        }
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileHandle
    public synchronized void protectedResize(long j3) throws Throwable {
        try {
            try {
                long size = size();
                long j4 = j3 - size;
                if (j4 > 0) {
                    int i9 = (int) j4;
                    protectedWrite(size, new byte[i9], 0, i9);
                } else {
                    this.randomAccessFile.setLength(j3);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileHandle
    public synchronized long protectedSize() {
        return this.randomAccessFile.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.FileHandle
    public synchronized void protectedWrite(long j3, byte[] bArr, int i9, int i10) {
        bArr.getClass();
        this.randomAccessFile.seek(j3);
        this.randomAccessFile.write(bArr, i9, i10);
    }
}
