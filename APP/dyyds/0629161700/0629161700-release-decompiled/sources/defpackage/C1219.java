package defpackage;

/* JADX INFO: renamed from: ᛷᛲᛲᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1219 extends android.media.MediaDataSource {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0298 f5474;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public long f5475;

    public C1219(defpackage.C0298 r1) {
            r0 = this;
            r0.f5474 = r1
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
            r0 = -1
            return r0
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long r9, byte[] r11, int r12, int r13) {
            r8 = this;
            ᛲᛵᲁᲈ r0 = r8.f5474
            java.io.DataInputStream r1 = r0.f1961
            if (r13 != 0) goto L8
            r8 = 0
            return r8
        L8:
            r2 = 0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r5 = -1
            if (r4 >= 0) goto L10
            goto L24
        L10:
            long r6 = r8.f5475     // Catch: java.io.IOException -> L41
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 == 0) goto L2a
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L25
            int r2 = r1.available()     // Catch: java.io.IOException -> L41
            long r2 = (long) r2     // Catch: java.io.IOException -> L41
            long r6 = r6 + r2
            int r2 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r2 < 0) goto L25
        L24:
            return r5
        L25:
            r0.m956(r9)     // Catch: java.io.IOException -> L41
            r8.f5475 = r9     // Catch: java.io.IOException -> L41
        L2a:
            int r9 = r1.available()     // Catch: java.io.IOException -> L41
            if (r13 <= r9) goto L34
            int r13 = r1.available()     // Catch: java.io.IOException -> L41
        L34:
            int r9 = r0.read(r11, r12, r13)     // Catch: java.io.IOException -> L41
            if (r9 < 0) goto L41
            long r10 = r8.f5475     // Catch: java.io.IOException -> L41
            long r12 = (long) r9     // Catch: java.io.IOException -> L41
            long r10 = r10 + r12
            r8.f5475 = r10     // Catch: java.io.IOException -> L41
            return r9
        L41:
            r9 = -1
            r8.f5475 = r9
            return r5
    }
}
