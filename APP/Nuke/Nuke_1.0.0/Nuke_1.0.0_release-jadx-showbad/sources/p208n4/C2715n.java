package p208n4;

import java.nio.ByteBuffer;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: n4.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2715n implements InterfaceC2707f {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2720s f8647d;

    /* JADX INFO: renamed from: e */
    public final C2706e f8648e;

    /* JADX INFO: renamed from: f */
    public boolean f8649f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2715n(InterfaceC2720s interfaceC2720s) {
        AbstractC1665j.m2985e(interfaceC2720s, "sink");
        this.f8647d = interfaceC2720s;
        this.f8648e = new C2706e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s
    /* JADX INFO: renamed from: a */
    public final AbstractC2724w mo3339a() {
        return this.f8647d.mo3339a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final InterfaceC2707f m4752b() {
        if (this.f8649f) {
            throw new IllegalStateException("closed");
        }
        C2706e c2706e = this.f8648e;
        long jM4717j = c2706e.m4717j();
        if (jM4717j > 0) {
            this.f8647d.mo3343p(c2706e, jM4717j);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        InterfaceC2720s interfaceC2720s = this.f8647d;
        if (this.f8649f) {
            return;
        }
        try {
            C2706e c2706e = this.f8648e;
            long j5 = c2706e.f8629e;
            if (j5 > 0) {
                interfaceC2720s.mo3343p(c2706e, j5);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            interfaceC2720s.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f8649f = true;
        if (th != null) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2707f
    /* JADX INFO: renamed from: e */
    public final InterfaceC2707f mo4713e(C2709h c2709h) {
        AbstractC1665j.m2985e(c2709h, "byteString");
        if (this.f8649f) {
            throw new IllegalStateException("closed");
        }
        this.f8648e.m4703E(c2709h);
        m4752b();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2707f, p208n4.InterfaceC2720s, java.io.Flushable
    public final void flush() {
        if (this.f8649f) {
            throw new IllegalStateException("closed");
        }
        C2706e c2706e = this.f8648e;
        long j5 = c2706e.f8629e;
        InterfaceC2720s interfaceC2720s = this.f8647d;
        if (j5 > 0) {
            interfaceC2720s.mo3343p(c2706e, j5);
        }
        interfaceC2720s.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f8649f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2707f
    /* JADX INFO: renamed from: k */
    public final C2706e mo4718k() {
        return this.f8648e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s
    /* JADX INFO: renamed from: p */
    public final void mo3343p(C2706e c2706e, long j5) {
        AbstractC1665j.m2985e(c2706e, "source");
        if (this.f8649f) {
            throw new IllegalStateException("closed");
        }
        this.f8648e.mo3343p(c2706e, j5);
        m4752b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2707f
    /* JADX INFO: renamed from: s */
    public final InterfaceC2707f mo4725s(int i5, byte[] bArr) {
        if (this.f8649f) {
            throw new IllegalStateException("closed");
        }
        this.f8648e.write(bArr, 0, i5);
        m4752b();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "buffer(" + this.f8647d + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2707f
    /* JADX INFO: renamed from: v */
    public final InterfaceC2707f mo4728v(String str) {
        AbstractC1665j.m2985e(str, "string");
        if (this.f8649f) {
            throw new IllegalStateException("closed");
        }
        this.f8648e.m4711M(str);
        m4752b();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC1665j.m2985e(byteBuffer, "source");
        if (this.f8649f) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f8648e.write(byteBuffer);
        m4752b();
        return iWrite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2707f
    public final InterfaceC2707f writeByte(int i5) {
        if (this.f8649f) {
            throw new IllegalStateException("closed");
        }
        this.f8648e.m4705G(i5);
        m4752b();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2707f
    public final InterfaceC2707f writeInt(int i5) {
        if (this.f8649f) {
            throw new IllegalStateException("closed");
        }
        this.f8648e.m4708J(i5);
        m4752b();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2707f
    public final InterfaceC2707f writeShort(int i5) {
        if (this.f8649f) {
            throw new IllegalStateException("closed");
        }
        this.f8648e.m4709K(i5);
        m4752b();
        return this;
    }

    @Override // p208n4.InterfaceC2707f
    public final InterfaceC2707f write(byte[] bArr) {
        AbstractC1665j.m2985e(bArr, "source");
        if (!this.f8649f) {
            this.f8648e.write(bArr, 0, bArr.length);
            m4752b();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
