package p000;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: zg */
/* JADX INFO: loaded from: classes.dex */
public final class C2803zg extends MediaDataSource {

    /* JADX INFO: renamed from: a */
    public long f9475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0195Eg f9476b;

    public C2803zg(C0195Eg r1) {
        this.f9476b = r1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long r8, byte[] r10, int r11, int r12) {
        if (r12 != 0) goto L6;
        return 0;
    L6:
        if (r8 >= 0) goto L27;
        return -1;
    L27:
        long r4 = this.f9475a;     // Catch: IOException -> L26
        C0195Eg r6 = this.f9476b;
        if (r4 == r8) goto L18;
        if (r4 >= 0) goto L14;
    L16:
        r6.m388f(r8);     // Catch: IOException -> L26
        this.f9475a = r8;     // Catch: IOException -> L26
        goto L18
    L14:
        if (r8 < (r4 + ((long) r6.f45a.available()))) goto L16;
        return -1;
    L18:
        if (r12 <= r6.f45a.available()) goto L20;
        r12 = r6.f45a.available();     // Catch: IOException -> L26
    L20:
        int r82 = r6.read(r10, r11, r12);     // Catch: IOException -> L26
        if (r82 < 0) goto L24;
        this.f9475a += (long) r82;
        return r82;
    L24:
        this.f9475a = -1;
        return -1;
    }
}
