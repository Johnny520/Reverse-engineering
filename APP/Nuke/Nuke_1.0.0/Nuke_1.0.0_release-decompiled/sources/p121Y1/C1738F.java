package p121Y1;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Y1.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1738F extends MediaDataSource {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ByteBuffer f5999d;

    public C1738F(ByteBuffer byteBuffer) {
        this.f5999d = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f5999d.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j5, byte[] bArr, int i5, int i6) {
        ByteBuffer byteBuffer = this.f5999d;
        if (j5 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j5);
        int iMin = Math.min(i6, byteBuffer.remaining());
        byteBuffer.get(bArr, i5, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
