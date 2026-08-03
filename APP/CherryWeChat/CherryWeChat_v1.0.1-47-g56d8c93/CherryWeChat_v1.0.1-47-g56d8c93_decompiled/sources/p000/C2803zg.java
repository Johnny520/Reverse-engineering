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

    public C2803zg(C0195Eg c0195Eg) {
        this.f9476b = c0195Eg;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.f9475a;
            C0195Eg c0195Eg = this.f9476b;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + ((long) c0195Eg.f45a.available())) {
                    return -1;
                }
                c0195Eg.m388f(j);
                this.f9475a = j;
            }
            if (i2 > c0195Eg.f45a.available()) {
                i2 = c0195Eg.f45a.available();
            }
            int i3 = c0195Eg.read(bArr, i, i2);
            if (i3 >= 0) {
                this.f9475a += (long) i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.f9475a = -1L;
        return -1;
    }
}
