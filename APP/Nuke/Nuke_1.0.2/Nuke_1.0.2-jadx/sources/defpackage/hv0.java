package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hv0 extends cv0 {
    public boolean l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.j) {
            return;
        }
        if (!this.l) {
            b(iv0.f);
        }
        this.j = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.cv0, defpackage.ht2
    public final long n(fn fnVar, long j) throws IOException {
        fnVar.getClass();
        if (this.j) {
            s.l("closed");
            return 0L;
        }
        if (this.l) {
            return -1L;
        }
        long jN = super.n(fnVar, 8192L);
        if (jN != -1) {
            return jN;
        }
        this.l = true;
        b(js0.i);
        return -1L;
    }
}
