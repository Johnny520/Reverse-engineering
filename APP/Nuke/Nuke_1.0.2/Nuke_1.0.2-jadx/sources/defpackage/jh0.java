package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jh0 extends fh0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jh0(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.h.mark(Integer.MAX_VALUE);
        } else {
            s.j("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(long j) throws IOException {
        int i = this.j;
        if (i > j) {
            this.j = 0;
            this.h.reset();
        } else {
            j -= (long) i;
        }
        b((int) j);
    }

    public jh0(byte[] bArr) {
        super(bArr);
        this.h.mark(Integer.MAX_VALUE);
    }
}
