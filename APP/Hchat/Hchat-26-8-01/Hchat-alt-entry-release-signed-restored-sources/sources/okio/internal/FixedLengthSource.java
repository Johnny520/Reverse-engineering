package okio.internal;

import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class FixedLengthSource extends ForwardingSource {
    private long bytesReceived;
    private final long size;
    private final boolean truncate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedLengthSource(Source source, long j3, boolean z9) {
        super(source);
        source.getClass();
        this.size = j3;
        this.truncate = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void truncateToSize(Buffer buffer, long j3) throws EOFException {
        Buffer buffer2 = new Buffer();
        buffer2.writeAll(buffer);
        buffer.write(buffer2, j3);
        buffer2.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.ForwardingSource, okio.Source
    public long read(Buffer buffer, long j3) throws IOException {
        buffer.getClass();
        long j4 = this.bytesReceived;
        long j5 = this.size;
        if (j4 > j5) {
            j3 = 0;
        } else if (this.truncate) {
            long j10 = j5 - j4;
            if (j10 == 0) {
                return -1L;
            }
            j3 = Math.min(j3, j10);
        }
        long j11 = super.read(buffer, j3);
        if (j11 != -1) {
            this.bytesReceived += j11;
        }
        long j12 = this.bytesReceived;
        long j13 = this.size;
        if ((j12 >= j13 || j11 != -1) && j12 <= j13) {
            return j11;
        }
        if (j11 > 0 && j12 > j13) {
            truncateToSize(buffer, buffer.size() - (this.bytesReceived - this.size));
        }
        throw new IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
    }
}
