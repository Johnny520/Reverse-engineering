package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p376zd.C9995i;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, m16758d2 = {"Lokhttp3/internal/cache2/FileOperator;", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/nio/channels/FileChannel;", "fileChannel", "<init>", "(Ljava/nio/channels/FileChannel;)V", _UrlKt.FRAGMENT_ENCODE_SET, "pos", "Lzd/i;", "source", "byteCount", "Ll8/i0;", "write", "(JLzd/i;J)V", "sink", "read", "Ljava/nio/channels/FileChannel;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        fileChannel.getClass();
        this.fileChannel = fileChannel;
    }

    public final void read(long pos, C9995i sink, long byteCount) throws IOException {
        sink.getClass();
        if (byteCount < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j10 = pos;
        long j11 = byteCount;
        while (j11 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j10, j11, sink);
            j10 += jTransferTo;
            j11 -= jTransferTo;
        }
    }

    public final void write(long pos, C9995i source, long byteCount) throws IOException {
        source.getClass();
        if (byteCount < 0 || byteCount > source.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j10 = pos;
        long j11 = byteCount;
        while (j11 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(source, j10, j11);
            j10 += jTransferFrom;
            j11 -= jTransferFrom;
        }
    }
}
