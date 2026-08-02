package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g60 implements ht2 {
    public final InputStream h;
    public final at2 i;
    public final /* synthetic */ kj1 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g60(kj1 kj1Var) {
        this.j = kj1Var;
        Socket socket = (Socket) kj1Var.i;
        this.h = socket.getInputStream();
        this.i = new at2(socket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public final o23 a() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        kj1 kj1Var = this.j;
        at2 at2Var = this.i;
        at2Var.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) kj1Var.j;
            Socket socket = (Socket) kj1Var.i;
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
                        this.h.close();
                    }
                }
                if (at2Var.i()) {
                    throw at2Var.j(null);
                }
            }
        } catch (IOException e) {
            if (!at2Var.i()) {
                throw e;
            }
            throw at2Var.j(e);
        } finally {
            at2Var.i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public final long n(fn fnVar, long j) throws IOException {
        fnVar.getClass();
        at2 at2Var = this.i;
        at2Var.f();
        mm2 mm2VarA = fnVar.A(1);
        int iMin = (int) Math.min(8192L, 8192 - mm2VarA.c);
        try {
            at2Var.h();
            try {
                int i = this.h.read(mm2VarA.a, mm2VarA.c, iMin);
                if (at2Var.i()) {
                    throw at2Var.j(null);
                }
                if (i != -1) {
                    mm2VarA.c += i;
                    long j2 = i;
                    fnVar.i += j2;
                    return j2;
                }
                if (mm2VarA.b != mm2VarA.c) {
                    return -1L;
                }
                fnVar.h = mm2VarA.a();
                pm2.a(mm2VarA);
                return -1L;
            } catch (IOException e) {
                if (at2Var.i()) {
                    throw at2Var.j(e);
                }
                throw e;
            } finally {
                at2Var.i();
            }
        } catch (AssertionError e2) {
            if (tg3.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "source(" + ((Socket) this.j.i) + ')';
    }
}
