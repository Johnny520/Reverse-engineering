package p000;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g60 implements ht2 {

    /* JADX INFO: renamed from: h */
    public final InputStream f3318h;

    /* JADX INFO: renamed from: i */
    public final at2 f3319i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ kj1 f3320j;

    public g60(kj1 kj1Var) {
        this.f3320j = kj1Var;
        Socket socket = (Socket) kj1Var.f5594i;
        this.f3318h = socket.getInputStream();
        this.f3319i = new at2(socket);
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: a */
    public final o23 mo889a() {
        return this.f3319i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        kj1 kj1Var = this.f3320j;
        at2 at2Var = this.f3319i;
        at2Var.m5886h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) kj1Var.f5595j;
            Socket socket = (Socket) kj1Var.f5594i;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f3318h.close();
                    }
                }
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

    @Override // p000.ht2
    /* JADX INFO: renamed from: n */
    public final long mo891n(C0209fn c0209fn, long j) throws IOException {
        c0209fn.getClass();
        at2 at2Var = this.f3319i;
        at2Var.mo3227f();
        mm2 mm2VarM1666A = c0209fn.m1666A(1);
        int iMin = (int) Math.min(8192L, 8192 - mm2VarM1666A.f6723c);
        try {
            at2Var.m5886h();
            try {
                int i = this.f3318h.read(mm2VarM1666A.f6721a, mm2VarM1666A.f6723c, iMin);
                if (at2Var.m5887i()) {
                    throw at2Var.mo276j(null);
                }
                if (i != -1) {
                    mm2VarM1666A.f6723c += i;
                    long j2 = i;
                    c0209fn.f3068i += j2;
                    return j2;
                }
                if (mm2VarM1666A.f6722b != mm2VarM1666A.f6723c) {
                    return -1L;
                }
                c0209fn.f3067h = mm2VarM1666A.m3133a();
                pm2.m3883a(mm2VarM1666A);
                return -1L;
            } catch (IOException e) {
                if (at2Var.m5887i()) {
                    throw at2Var.mo276j(e);
                }
                throw e;
            } finally {
                at2Var.m5887i();
            }
        } catch (AssertionError e2) {
            if (tg3.m5254a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    public final String toString() {
        return "source(" + ((Socket) this.f3320j.f5594i) + ')';
    }
}
