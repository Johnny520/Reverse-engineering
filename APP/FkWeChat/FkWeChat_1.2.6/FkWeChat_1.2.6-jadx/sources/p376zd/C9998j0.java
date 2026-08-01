package p376zd;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: zd.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9998j0 implements InterfaceC10020u0 {

    /* JADX INFO: renamed from: q */
    public final OutputStream f33574q;

    /* JADX INFO: renamed from: r */
    public final C10026x0 f33575r;

    public C9998j0(OutputStream outputStream, C10026x0 c10026x0) {
        outputStream.getClass();
        c10026x0.getClass();
        this.f33574q = outputStream;
        this.f33575r = c10026x0;
    }

    @Override // p376zd.InterfaceC10020u0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f33574q.close();
    }

    @Override // p376zd.InterfaceC10020u0, java.io.Flushable
    public void flush() throws IOException {
        this.f33574q.flush();
    }

    @Override // p376zd.InterfaceC10020u0
    public C10026x0 timeout() {
        return this.f33575r;
    }

    public String toString() {
        return "sink(" + this.f33574q + ')';
    }

    @Override // p376zd.InterfaceC10020u0
    public void write(C9995i c9995i, long j10) throws IOException {
        c9995i.getClass();
        AbstractC9978b.m38615b(c9995i.size(), 0L, j10);
        while (j10 > 0) {
            this.f33575r.throwIfReached();
            C10012q0 c10012q0 = c9995i.f33561q;
            c10012q0.getClass();
            int iMin = (int) Math.min(j10, c10012q0.f33618c - c10012q0.f33617b);
            this.f33574q.write(c10012q0.f33616a, c10012q0.f33617b, iMin);
            c10012q0.f33617b += iMin;
            long j11 = iMin;
            j10 -= j11;
            c9995i.m38689P(c9995i.size() - j11);
            if (c10012q0.f33617b == c10012q0.f33618c) {
                c9995i.f33561q = c10012q0.m38822b();
                C10014r0.m38829b(c10012q0);
            }
        }
    }
}
