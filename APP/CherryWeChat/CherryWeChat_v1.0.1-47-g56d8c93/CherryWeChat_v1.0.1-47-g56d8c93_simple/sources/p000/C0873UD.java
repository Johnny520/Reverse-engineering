package p000;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: UD */
/* JADX INFO: loaded from: classes.dex */
public final class C0873UD extends MediaDataSource {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ByteBuffer f2759a;

    public C0873UD(ByteBuffer r1) {
        this.f2759a = r1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f2759a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long r4, byte[] r6, int r7, int r8) {
        ByteBuffer r0 = this.f2759a;
        if (r4 < r0.limit()) goto L6;
        return -1;
    L6:
        r0.position((int) r4);
        int r42 = Math.min(r8, r0.remaining());
        r0.get(r6, r7, r42);
        return r42;
    }
}
