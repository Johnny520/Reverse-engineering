package p376zd;

import ae.AbstractC0327z;
import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: zd.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10005n implements InterfaceC10020u0 {

    /* JADX INFO: renamed from: q */
    public final InterfaceC9997j f33589q;

    /* JADX INFO: renamed from: r */
    public final Deflater f33590r;

    /* JADX INFO: renamed from: s */
    public boolean f33591s;

    public C10005n(InterfaceC9997j interfaceC9997j, Deflater deflater) {
        interfaceC9997j.getClass();
        deflater.getClass();
        this.f33589q = interfaceC9997j;
        this.f33590r = deflater;
    }

    /* JADX INFO: renamed from: c */
    public final void m38803c(boolean z10) throws IOException {
        C10012q0 c10012q0M38695V;
        int iDeflate;
        C9995i c9995iMo38699b = this.f33589q.mo38699b();
        while (true) {
            c10012q0M38695V = c9995iMo38699b.m38695V(1);
            Deflater deflater = this.f33590r;
            if (z10) {
                try {
                    byte[] bArr = c10012q0M38695V.f33616a;
                    int i10 = c10012q0M38695V.f33618c;
                    iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                byte[] bArr2 = c10012q0M38695V.f33616a;
                int i11 = c10012q0M38695V.f33618c;
                iDeflate = deflater.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                c10012q0M38695V.f33618c += iDeflate;
                c9995iMo38699b.m38689P(c9995iMo38699b.size() + ((long) iDeflate));
                this.f33589q.mo38690Q();
            } else if (this.f33590r.needsInput()) {
                break;
            }
        }
        if (c10012q0M38695V.f33617b == c10012q0M38695V.f33618c) {
            c9995iMo38699b.f33561q = c10012q0M38695V.m38822b();
            C10014r0.m38829b(c10012q0M38695V);
        }
    }

    @Override // p376zd.InterfaceC10020u0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f33591s) {
            return;
        }
        try {
            m38804d();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f33590r.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f33589q.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f33591s = true;
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m38804d() throws IOException {
        this.f33590r.finish();
        m38803c(false);
    }

    @Override // p376zd.InterfaceC10020u0, java.io.Flushable
    public void flush() throws IOException {
        m38803c(true);
        this.f33589q.flush();
    }

    @Override // p376zd.InterfaceC10020u0
    public C10026x0 timeout() {
        return this.f33589q.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f33589q + ')';
    }

    @Override // p376zd.InterfaceC10020u0
    public void write(C9995i c9995i, long j10) throws IOException {
        c9995i.getClass();
        AbstractC9978b.m38615b(c9995i.size(), 0L, j10);
        while (j10 > 0) {
            C10012q0 c10012q0 = c9995i.f33561q;
            c10012q0.getClass();
            int iMin = (int) Math.min(j10, c10012q0.f33618c - c10012q0.f33617b);
            this.f33590r.setInput(c10012q0.f33616a, c10012q0.f33617b, iMin);
            m38803c(false);
            long j11 = iMin;
            c9995i.m38689P(c9995i.size() - j11);
            int i10 = c10012q0.f33617b + iMin;
            c10012q0.f33617b = i10;
            if (i10 == c10012q0.f33618c) {
                c9995i.f33561q = c10012q0.m38822b();
                C10014r0.m38829b(c10012q0);
            }
            j10 -= j11;
        }
        this.f33590r.setInput(AbstractC0327z.m1003c(), 0, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10005n(InterfaceC10020u0 interfaceC10020u0, Deflater deflater) {
        this(AbstractC9988e0.m38647b(interfaceC10020u0), deflater);
        interfaceC10020u0.getClass();
        deflater.getClass();
    }
}
