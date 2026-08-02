package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jh0 extends fh0 {
    public jh0(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f3002h.mark(Integer.MAX_VALUE);
        } else {
            C0676s.m4651j("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2498c(long j) throws IOException {
        int i = this.f3004j;
        if (i > j) {
            this.f3004j = 0;
            this.f3002h.reset();
        } else {
            j -= (long) i;
        }
        m1654b((int) j);
    }

    public jh0(byte[] bArr) {
        super(bArr);
        this.f3002h.mark(Integer.MAX_VALUE);
    }
}
