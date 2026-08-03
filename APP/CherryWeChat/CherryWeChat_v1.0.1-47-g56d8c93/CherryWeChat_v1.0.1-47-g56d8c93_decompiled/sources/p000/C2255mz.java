package p000;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: mz */
/* JADX INFO: loaded from: classes.dex */
public final class C2255mz extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2298nz f7966a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2255mz(C2298nz c2298nz, int i) {
        super(i);
        this.f7966a = c2298nz;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
            i--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.f7966a.f8056b.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
