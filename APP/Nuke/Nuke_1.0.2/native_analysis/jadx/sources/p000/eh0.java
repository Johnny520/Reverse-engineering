package p000;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class eh0 extends MediaDataSource {

    /* JADX INFO: renamed from: h */
    public long f2439h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ jh0 f2440i;

    public eh0(jh0 jh0Var) {
        this.f2440i = jh0Var;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        jh0 jh0Var = this.f2440i;
        DataInputStream dataInputStream = jh0Var.f3002h;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.f2439h;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + ((long) dataInputStream.available())) {
                        jh0Var.m2498c(j);
                        this.f2439h = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int i3 = jh0Var.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f2439h += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f2439h = -1L;
            return -1;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
