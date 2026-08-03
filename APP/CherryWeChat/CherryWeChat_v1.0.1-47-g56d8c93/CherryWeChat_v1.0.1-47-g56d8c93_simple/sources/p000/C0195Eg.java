package p000;

import java.io.InputStream;

/* JADX INFO: renamed from: Eg */
/* JADX INFO: loaded from: classes.dex */
public final class C0195Eg extends C0023Ag {
    public C0195Eg(byte[] r2) {
        super(r2);
        this.f45a.mark(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: f */
    public final void m388f(long r4) {
        int r0 = this.f46b;
        if (r0 <= r4) goto L5;
        this.f46b = 0;
        this.f45a.reset();
    L6:
        m34d((int) r4);
        return;
    L5:
        r4 = r4 - ((long) r0);
        goto L6
    }

    public C0195Eg(InputStream r2) {
        super(r2);
        if (r2.markSupported() == false) goto L7;
        this.f45a.mark(Integer.MAX_VALUE);
        return;
    L7:
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
