package defpackage;

/* JADX INFO: renamed from: ᛶᛱᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1005 extends android.media.MediaDataSource {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.nio.ByteBuffer f4471;

    public C1005(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.f4471 = r1
            r0.<init>()
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
            r2 = this;
            java.nio.ByteBuffer r2 = r2.f4471
            int r2 = r2.limit()
            long r0 = (long) r2
            return r0
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long r3, byte[] r5, int r6, int r7) {
            r2 = this;
            java.nio.ByteBuffer r2 = r2.f4471
            int r0 = r2.limit()
            long r0 = (long) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Ld
            r2 = -1
            return r2
        Ld:
            int r3 = (int) r3
            r2.position(r3)
            int r3 = r2.remaining()
            int r3 = java.lang.Math.min(r7, r3)
            r2.get(r5, r6, r3)
            return r3
    }
}
