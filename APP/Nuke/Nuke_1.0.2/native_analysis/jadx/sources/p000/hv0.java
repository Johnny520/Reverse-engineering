package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hv0 extends cv0 {

    /* JADX INFO: renamed from: l */
    public boolean f4142l;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1744j) {
            return;
        }
        if (!this.f4142l) {
            m890b(iv0.f4798f);
        }
        this.f1744j = true;
    }

    @Override // p000.cv0, p000.ht2
    /* JADX INFO: renamed from: n */
    public final long mo891n(C0209fn c0209fn, long j) throws IOException {
        c0209fn.getClass();
        if (this.f1744j) {
            C0676s.m4653l("closed");
            return 0L;
        }
        if (this.f4142l) {
            return -1L;
        }
        long jMo891n = super.mo891n(c0209fn, 8192L);
        if (jMo891n != -1) {
            return jMo891n;
        }
        this.f4142l = true;
        m890b(js0.f5193i);
        return -1L;
    }
}
