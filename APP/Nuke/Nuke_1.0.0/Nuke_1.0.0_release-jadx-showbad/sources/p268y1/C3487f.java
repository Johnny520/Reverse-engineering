package p268y1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: y1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3487f extends C3483b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3487f(byte[] bArr) {
        super(bArr);
        this.f10814d.mark(Integer.MAX_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5720c(long j5) throws IOException {
        int i5 = this.f10816f;
        if (i5 > j5) {
            this.f10816f = 0;
            this.f10814d.reset();
        } else {
            j5 -= (long) i5;
        }
        m5712b((int) j5);
    }

    public C3487f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f10814d.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
