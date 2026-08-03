package p000;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: mz */
/* JADX INFO: loaded from: classes.dex */
public final class C2255mz extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2298nz f7966a;

    public C2255mz(C2298nz r1, int r2) {
        this.f7966a = r1;
        super(r2);
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int r0 = ((ByteArrayOutputStream) this).count;
        if (r0 > 0) goto L5;
    L12:
        return new String(((ByteArrayOutputStream) this).buf, 0, r0, this.f7966a.f8056b.name());
    L9:
        e = move-exception;
        throw new AssertionError(e);
    L5:
        if (((ByteArrayOutputStream) this).buf[r0 - 1] != 13) goto L12;
        r0 = r0 - 1;
        goto L12
    }
}
