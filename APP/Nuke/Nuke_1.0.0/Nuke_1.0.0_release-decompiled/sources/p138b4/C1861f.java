package p138b4;

import java.io.IOException;
import java.net.ProtocolException;
import p068N1.C1013c;
import p117X2.AbstractC1665j;
import p144c4.InterfaceC1915e;
import p208n4.AbstractC2710i;
import p208n4.C2706e;
import p208n4.InterfaceC2722u;

/* JADX INFO: renamed from: b4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1861f extends AbstractC2710i {

    /* JADX INFO: renamed from: e */
    public final long f6305e;

    /* JADX INFO: renamed from: f */
    public final boolean f6306f;

    /* JADX INFO: renamed from: g */
    public long f6307g;

    /* JADX INFO: renamed from: h */
    public boolean f6308h;

    /* JADX INFO: renamed from: i */
    public boolean f6309i;

    /* JADX INFO: renamed from: j */
    public boolean f6310j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1013c f6311k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1861f(C1013c c1013c, InterfaceC2722u interfaceC2722u, long j5, boolean z5) {
        super(interfaceC2722u);
        AbstractC1665j.m2985e(interfaceC2722u, "delegate");
        this.f6311k = c1013c;
        this.f6305e = j5;
        this.f6306f = z5;
        this.f6308h = true;
        if (j5 == 0) {
            m3344b(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final IOException m3344b(IOException iOException) {
        if (this.f6309i) {
            return iOException;
        }
        this.f6309i = true;
        if (iOException == null && this.f6308h) {
            this.f6308h = false;
            ((C1869n) this.f6311k.f3129b).f6329g.getClass();
        }
        return C1013c.m2079b(this.f6311k, this.f6306f, iOException, 8);
    }

    @Override // p208n4.AbstractC2710i, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f6310j) {
            return;
        }
        this.f6310j = true;
        try {
            super.close();
            m3344b(null);
        } catch (IOException e5) {
            IOException iOExceptionM3344b = m3344b(e5);
            AbstractC1665j.m2982b(iOExceptionM3344b);
            throw iOExceptionM3344b;
        }
    }

    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: y */
    public final long mo554y(C2706e c2706e, long j5) throws IOException {
        AbstractC1665j.m2985e(c2706e, "sink");
        if (this.f6310j) {
            throw new IllegalStateException("closed");
        }
        try {
            long jMo554y = this.f8634d.mo554y(c2706e, 8192L);
            if (this.f6308h) {
                this.f6308h = false;
                ((C1869n) this.f6311k.f3129b).f6329g.getClass();
            }
            if (jMo554y == -1) {
                m3344b(null);
                return -1L;
            }
            long j6 = this.f6307g + jMo554y;
            long j7 = this.f6305e;
            if (j7 != -1 && j6 > j7) {
                throw new ProtocolException("expected " + this.f6305e + " bytes but received " + j6);
            }
            this.f6307g = j6;
            if (((InterfaceC1915e) this.f6311k.f3131d).mo3399d()) {
                m3344b(null);
            }
            return jMo554y;
        } catch (IOException e5) {
            IOException iOExceptionM3344b = m3344b(e5);
            AbstractC1665j.m2982b(iOExceptionM3344b);
            throw iOExceptionM3344b;
        }
    }
}
