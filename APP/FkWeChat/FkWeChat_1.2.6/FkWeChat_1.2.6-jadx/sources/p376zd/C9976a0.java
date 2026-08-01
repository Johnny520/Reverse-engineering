package p376zd;

import ae.AbstractC0326y;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: zd.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C9976a0 implements InterfaceC10024w0 {

    /* JADX INFO: renamed from: q */
    public final InputStream f33551q;

    /* JADX INFO: renamed from: r */
    public final C10026x0 f33552r;

    public C9976a0(InputStream inputStream, C10026x0 c10026x0) {
        inputStream.getClass();
        c10026x0.getClass();
        this.f33551q = inputStream;
        this.f33552r = c10026x0;
    }

    @Override // p376zd.InterfaceC10024w0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f33551q.close();
    }

    @Override // p376zd.InterfaceC10024w0
    public long read(C9995i c9995i, long j10) throws IOException {
        c9995i.getClass();
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            C9991g.m38662a("byteCount < 0: ", j10);
            return 0L;
        }
        try {
            this.f33552r.throwIfReached();
            C10012q0 c10012q0M38695V = c9995i.m38695V(1);
            int i10 = this.f33551q.read(c10012q0M38695V.f33616a, c10012q0M38695V.f33618c, (int) Math.min(j10, 8192 - c10012q0M38695V.f33618c));
            if (i10 != -1) {
                c10012q0M38695V.f33618c += i10;
                long j11 = i10;
                c9995i.m38689P(c9995i.size() + j11);
                return j11;
            }
            if (c10012q0M38695V.f33617b != c10012q0M38695V.f33618c) {
                return -1L;
            }
            c9995i.f33561q = c10012q0M38695V.m38822b();
            C10014r0.m38829b(c10012q0M38695V);
            return -1L;
        } catch (AssertionError e10) {
            if (AbstractC0326y.m1000b(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // p376zd.InterfaceC10024w0
    public C10026x0 timeout() {
        return this.f33552r;
    }

    public String toString() {
        return "source(" + this.f33551q + ')';
    }
}
