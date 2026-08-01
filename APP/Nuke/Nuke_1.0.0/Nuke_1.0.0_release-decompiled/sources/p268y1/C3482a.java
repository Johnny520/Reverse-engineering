package p268y1;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: y1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3482a extends MediaDataSource {

    /* JADX INFO: renamed from: d */
    public long f10810d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3487f f10811e;

    public C3482a(C3487f c3487f) {
        this.f10811e = c3487f;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j5, byte[] bArr, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        if (j5 < 0) {
            return -1;
        }
        try {
            long j6 = this.f10810d;
            C3487f c3487f = this.f10811e;
            if (j6 != j5) {
                if (j6 >= 0 && j5 >= j6 + ((long) c3487f.f10814d.available())) {
                    return -1;
                }
                c3487f.m5720c(j5);
                this.f10810d = j5;
            }
            if (i6 > c3487f.f10814d.available()) {
                i6 = c3487f.f10814d.available();
            }
            int i7 = c3487f.read(bArr, i5, i6);
            if (i7 >= 0) {
                this.f10810d += (long) i7;
                return i7;
            }
        } catch (IOException unused) {
        }
        this.f10810d = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
