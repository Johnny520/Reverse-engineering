package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import okio.Buffer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FileOperator(FileChannel fileChannel) {
        fileChannel.getClass();
        this.fileChannel = fileChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void read(long j3, Buffer buffer, long j4) throws IOException {
        buffer.getClass();
        if (j4 < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j5 = j3;
        long j10 = j4;
        while (j10 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j5, j10, buffer);
            j5 += jTransferTo;
            j10 -= jTransferTo;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void write(long j3, Buffer buffer, long j4) throws IOException {
        buffer.getClass();
        if (j4 < 0 || j4 > buffer.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j5 = j3;
        long j10 = j4;
        while (j10 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(buffer, j5, j10);
            j5 += jTransferFrom;
            j10 -= jTransferFrom;
        }
    }
}
