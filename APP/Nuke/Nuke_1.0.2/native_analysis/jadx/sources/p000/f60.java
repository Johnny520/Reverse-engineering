package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f60 implements fr2 {

    /* JADX INFO: renamed from: h */
    public final OutputStream f2810h;

    /* JADX INFO: renamed from: i */
    public final at2 f2811i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ kj1 f2812j;

    public f60(kj1 kj1Var) {
        this.f2812j = kj1Var;
        Socket socket = (Socket) kj1Var.f5594i;
        this.f2810h = socket.getOutputStream();
        this.f2811i = new at2(socket);
    }

    @Override // p000.fr2
    /* JADX INFO: renamed from: a */
    public final o23 mo1174a() {
        return this.f2811i;
    }

    @Override // p000.fr2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.f2810h;
        kj1 kj1Var = this.f2812j;
        at2 at2Var = this.f2811i;
        at2Var.m5886h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) kj1Var.f5595j;
            Socket socket = (Socket) kj1Var.f5594i;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
                if (at2Var.m5887i()) {
                    throw at2Var.mo276j(null);
                }
            }
        } catch (IOException e) {
            if (!at2Var.m5887i()) {
                throw e;
            }
            throw at2Var.mo276j(e);
        } finally {
            at2Var.m5887i();
        }
    }

    @Override // p000.fr2
    /* JADX INFO: renamed from: d */
    public final void mo1175d(C0209fn c0209fn, long j) throws IOException {
        qp0.m4258m(c0209fn.f3068i, 0L, j);
        while (j > 0) {
            at2 at2Var = this.f2811i;
            at2Var.mo3227f();
            mm2 mm2Var = c0209fn.f3067h;
            mm2Var.getClass();
            int iMin = (int) Math.min(j, mm2Var.f6723c - mm2Var.f6722b);
            at2Var.m5886h();
            try {
                try {
                    this.f2810h.write(mm2Var.f6721a, mm2Var.f6722b, iMin);
                    if (at2Var.m5887i()) {
                        throw at2Var.mo276j(null);
                    }
                    int i = mm2Var.f6722b + iMin;
                    mm2Var.f6722b = i;
                    long j2 = iMin;
                    j -= j2;
                    c0209fn.f3068i -= j2;
                    if (i == mm2Var.f6723c) {
                        c0209fn.f3067h = mm2Var.m3133a();
                        pm2.m3883a(mm2Var);
                    }
                } catch (IOException e) {
                    if (!at2Var.m5887i()) {
                        throw e;
                    }
                    throw at2Var.mo276j(e);
                }
            } catch (Throwable th) {
                at2Var.m5887i();
                throw th;
            }
        }
    }

    @Override // p000.fr2, java.io.Flushable
    public final void flush() throws IOException {
        at2 at2Var = this.f2811i;
        at2Var.m5886h();
        try {
            this.f2810h.flush();
            if (at2Var.m5887i()) {
                throw at2Var.mo276j(null);
            }
        } catch (IOException e) {
            if (!at2Var.m5887i()) {
                throw e;
            }
            throw at2Var.mo276j(e);
        } finally {
            at2Var.m5887i();
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f2812j.f5594i) + ')';
    }
}
