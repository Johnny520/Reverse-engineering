package yyds;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: yyds.ᲀᛷᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2033 extends C0886 {
    public C2033(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f4063.mark(Integer.MAX_VALUE);
        } else {
            C0188.m798("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m3910(long j) throws IOException {
        int i = this.f4062;
        if (i > j) {
            this.f4062 = 0;
            this.f4063.reset();
        } else {
            j -= (long) i;
        }
        m1980((int) j);
    }

    public C2033(byte[] bArr) {
        super(bArr);
        this.f4063.mark(Integer.MAX_VALUE);
    }
}
