package p376zd;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: zd.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10029z implements InterfaceC10024w0 {

    /* JADX INFO: renamed from: q */
    public final InterfaceC9999k f33644q;

    /* JADX INFO: renamed from: r */
    public final Inflater f33645r;

    /* JADX INFO: renamed from: s */
    public int f33646s;

    /* JADX INFO: renamed from: t */
    public boolean f33647t;

    public C10029z(InterfaceC9999k interfaceC9999k, Inflater inflater) {
        interfaceC9999k.getClass();
        inflater.getClass();
        this.f33644q = interfaceC9999k;
        this.f33645r = inflater;
    }

    /* JADX INFO: renamed from: c */
    public final long m38850c(C9995i c9995i, long j10) throws IOException {
        c9995i.getClass();
        if (j10 < 0) {
            C9991g.m38662a("byteCount < 0: ", j10);
            return 0L;
        }
        if (this.f33647t) {
            C10010p0.m38820a("closed");
            return 0L;
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            C10012q0 c10012q0M38695V = c9995i.m38695V(1);
            int iMin = (int) Math.min(j10, 8192 - c10012q0M38695V.f33618c);
            m38851d();
            int iInflate = this.f33645r.inflate(c10012q0M38695V.f33616a, c10012q0M38695V.f33618c, iMin);
            m38852e();
            if (iInflate > 0) {
                c10012q0M38695V.f33618c += iInflate;
                long j11 = iInflate;
                c9995i.m38689P(c9995i.size() + j11);
                return j11;
            }
            if (c10012q0M38695V.f33617b == c10012q0M38695V.f33618c) {
                c9995i.f33561q = c10012q0M38695V.m38822b();
                C10014r0.m38829b(c10012q0M38695V);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    @Override // p376zd.InterfaceC10024w0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f33647t) {
            return;
        }
        this.f33645r.end();
        this.f33647t = true;
        this.f33644q.close();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m38851d() {
        if (!this.f33645r.needsInput()) {
            return false;
        }
        if (this.f33644q.mo38707g()) {
            return true;
        }
        C10012q0 c10012q0 = this.f33644q.mo38699b().f33561q;
        c10012q0.getClass();
        int i10 = c10012q0.f33618c;
        int i11 = c10012q0.f33617b;
        int i12 = i10 - i11;
        this.f33646s = i12;
        this.f33645r.setInput(c10012q0.f33616a, i11, i12);
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m38852e() {
        int i10 = this.f33646s;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f33645r.getRemaining();
        this.f33646s -= remaining;
        this.f33644q.skip(remaining);
    }

    @Override // p376zd.InterfaceC10024w0
    public long read(C9995i c9995i, long j10) throws IOException {
        c9995i.getClass();
        do {
            long jM38850c = m38850c(c9995i, j10);
            if (jM38850c > 0) {
                return jM38850c;
            }
            if (this.f33645r.finished() || this.f33645r.needsDictionary()) {
                return -1L;
            }
        } while (!this.f33644q.mo38707g());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // p376zd.InterfaceC10024w0
    public C10026x0 timeout() {
        return this.f33644q.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10029z(InterfaceC10024w0 interfaceC10024w0, Inflater inflater) {
        this(AbstractC9988e0.m38648c(interfaceC10024w0), inflater);
        interfaceC10024w0.getClass();
        inflater.getClass();
    }
}
