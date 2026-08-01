package p138b4;

import java.io.IOException;
import java.net.ProtocolException;
import p068N1.C1013c;
import p117X2.AbstractC1665j;
import p208n4.AbstractC2724w;
import p208n4.C2706e;
import p208n4.InterfaceC2720s;

/* JADX INFO: renamed from: b4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1860e implements InterfaceC2720s {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2720s f6297d;

    /* JADX INFO: renamed from: e */
    public final long f6298e;

    /* JADX INFO: renamed from: f */
    public final boolean f6299f;

    /* JADX INFO: renamed from: g */
    public boolean f6300g;

    /* JADX INFO: renamed from: h */
    public long f6301h;

    /* JADX INFO: renamed from: i */
    public boolean f6302i;

    /* JADX INFO: renamed from: j */
    public boolean f6303j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1013c f6304k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1860e(C1013c c1013c, InterfaceC2720s interfaceC2720s, long j5, boolean z5) {
        AbstractC1665j.m2985e(interfaceC2720s, "delegate");
        this.f6304k = c1013c;
        this.f6297d = interfaceC2720s;
        this.f6298e = j5;
        this.f6299f = z5;
        this.f6302i = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s
    /* JADX INFO: renamed from: a */
    public final AbstractC2724w mo3339a() {
        return this.f6297d.mo3339a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3340b() {
        this.f6297d.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final IOException m3341c(IOException iOException) {
        if (this.f6300g) {
            return iOException;
        }
        this.f6300g = true;
        return C1013c.m2079b(this.f6304k, this.f6299f, iOException, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f6303j) {
            return;
        }
        this.f6303j = true;
        long j5 = this.f6298e;
        if (j5 != -1 && this.f6301h != j5) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            m3340b();
            m3341c(null);
        } catch (IOException e5) {
            IOException iOExceptionM3341c = m3341c(e5);
            AbstractC1665j.m2982b(iOExceptionM3341c);
            throw iOExceptionM3341c;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m3342d() {
        this.f6297d.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s, java.io.Flushable
    public final void flush() throws IOException {
        try {
            m3342d();
        } catch (IOException e5) {
            IOException iOExceptionM3341c = m3341c(e5);
            AbstractC1665j.m2982b(iOExceptionM3341c);
            throw iOExceptionM3341c;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s
    /* JADX INFO: renamed from: p */
    public final void mo3343p(C2706e c2706e, long j5) throws IOException {
        if (this.f6303j) {
            throw new IllegalStateException("closed");
        }
        long j6 = this.f6298e;
        if (j6 != -1 && this.f6301h + j5 > j6) {
            throw new ProtocolException("expected " + this.f6298e + " bytes but received " + (this.f6301h + j5));
        }
        try {
            if (this.f6302i) {
                this.f6302i = false;
                ((C1869n) this.f6304k.f3129b).f6329g.getClass();
            }
            this.f6297d.mo3343p(c2706e, j5);
            this.f6301h += j5;
        } catch (IOException e5) {
            IOException iOExceptionM3341c = m3341c(e5);
            AbstractC1665j.m2982b(iOExceptionM3341c);
            throw iOExceptionM3341c;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return C1860e.class.getSimpleName() + '(' + this.f6297d + ')';
    }
}
