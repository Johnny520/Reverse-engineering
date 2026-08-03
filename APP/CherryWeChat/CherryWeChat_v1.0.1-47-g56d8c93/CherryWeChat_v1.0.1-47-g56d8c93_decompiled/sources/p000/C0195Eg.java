package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Eg */
/* JADX INFO: loaded from: classes.dex */
public final class C0195Eg extends C0023Ag {
    public C0195Eg(byte[] bArr) {
        super(bArr);
        this.f45a.mark(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: f */
    public final void m388f(long j) throws IOException {
        int i = this.f46b;
        if (i > j) {
            this.f46b = 0;
            this.f45a.reset();
        } else {
            j -= (long) i;
        }
        m34d((int) j);
    }

    public C0195Eg(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f45a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
