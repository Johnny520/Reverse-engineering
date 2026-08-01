package p150d4;

import java.io.IOException;
import p117X2.AbstractC1665j;
import p118X3.C1707q;
import p208n4.C2706e;

/* JADX INFO: renamed from: d4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1990g extends AbstractC1985b {

    /* JADX INFO: renamed from: h */
    public boolean f6691h;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6678f) {
            return;
        }
        if (!this.f6691h) {
            m3662b(C1991h.f6692f);
        }
        this.f6678f = true;
    }

    @Override // p150d4.AbstractC1985b, p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: y */
    public final long mo554y(C2706e c2706e, long j5) throws IOException {
        AbstractC1665j.m2985e(c2706e, "sink");
        if (this.f6678f) {
            throw new IllegalStateException("closed");
        }
        if (this.f6691h) {
            return -1L;
        }
        long jMo554y = super.mo554y(c2706e, 8192L);
        if (jMo554y != -1) {
            return jMo554y;
        }
        this.f6691h = true;
        m3662b(C1707q.f5858e);
        return -1L;
    }
}
