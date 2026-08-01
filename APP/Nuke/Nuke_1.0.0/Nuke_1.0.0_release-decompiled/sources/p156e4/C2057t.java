package p156e4;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1774e;
import p208n4.AbstractC2724w;
import p208n4.C2706e;
import p208n4.C2709h;
import p208n4.InterfaceC2708g;
import p208n4.InterfaceC2722u;

/* JADX INFO: renamed from: e4.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2057t implements InterfaceC2722u {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2708g f6877d;

    /* JADX INFO: renamed from: e */
    public int f6878e;

    /* JADX INFO: renamed from: f */
    public int f6879f;

    /* JADX INFO: renamed from: g */
    public int f6880g;

    /* JADX INFO: renamed from: h */
    public int f6881h;

    public C2057t(InterfaceC2708g interfaceC2708g) {
        AbstractC1665j.m2985e(interfaceC2708g, "source");
        this.f6877d = interfaceC2708g;
    }

    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: a */
    public final AbstractC2724w mo3157a() {
        return this.f6877d.mo3157a();
    }

    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: y */
    public final long mo554y(C2706e c2706e, long j5) throws IOException {
        int i5;
        int i6;
        AbstractC1665j.m2985e(c2706e, "sink");
        do {
            int i7 = this.f6880g;
            InterfaceC2708g interfaceC2708g = this.f6877d;
            if (i7 == 0) {
                interfaceC2708g.skip(this.f6881h);
                this.f6881h = 0;
                if ((this.f6878e & 4) == 0) {
                    i5 = this.f6879f;
                    int iM3171l = AbstractC1774e.m3171l(interfaceC2708g);
                    this.f6880g = iM3171l;
                    int i8 = interfaceC2708g.readByte() & 255;
                    this.f6878e = interfaceC2708g.readByte() & 255;
                    Logger logger = C2058u.f6882g;
                    if (logger.isLoggable(Level.FINE)) {
                        C2709h c2709h = AbstractC2045h.f6820a;
                        logger.fine(AbstractC2045h.m3750b(true, this.f6879f, iM3171l, i8, this.f6878e));
                    }
                    i6 = interfaceC2708g.readInt() & Integer.MAX_VALUE;
                    this.f6879f = i6;
                    if (i8 != 9) {
                        throw new IOException(i8 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jMo554y = interfaceC2708g.mo554y(c2706e, Math.min(8192L, i7));
                if (jMo554y != -1) {
                    this.f6880g -= (int) jMo554y;
                    return jMo554y;
                }
            }
            return -1L;
        } while (i6 == i5);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
