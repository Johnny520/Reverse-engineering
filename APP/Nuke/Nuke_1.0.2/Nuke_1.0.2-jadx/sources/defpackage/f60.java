package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f60 implements fr2 {
    public final OutputStream h;
    public final at2 i;
    public final /* synthetic */ kj1 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f60(kj1 kj1Var) {
        this.j = kj1Var;
        Socket socket = (Socket) kj1Var.i;
        this.h = socket.getOutputStream();
        this.i = new at2(socket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2
    public final o23 a() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.h;
        kj1 kj1Var = this.j;
        at2 at2Var = this.i;
        at2Var.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) kj1Var.j;
            Socket socket = (Socket) kj1Var.i;
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

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2
    public final void d(fn fnVar, long j) throws IOException {
        qp0.m(fnVar.i, 0L, j);
        while (j > 0) {
            at2 at2Var = this.i;
            at2Var.f();
            mm2 mm2Var = fnVar.h;
            mm2Var.getClass();
            int iMin = (int) Math.min(j, mm2Var.c - mm2Var.b);
            at2Var.h();
            try {
                try {
                    this.h.write(mm2Var.a, mm2Var.b, iMin);
                    if (at2Var.i()) {
                        throw at2Var.j(null);
                    }
                    int i = mm2Var.b + iMin;
                    mm2Var.b = i;
                    long j2 = iMin;
                    j -= j2;
                    fnVar.i -= j2;
                    if (i == mm2Var.c) {
                        fnVar.h = mm2Var.a();
                        pm2.a(mm2Var);
                    }
                } catch (IOException e) {
                    if (!at2Var.i()) {
                        throw e;
                    }
                    throw at2Var.j(e);
                }
            } catch (Throwable th) {
                at2Var.i();
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2, java.io.Flushable
    public final void flush() throws IOException {
        at2 at2Var = this.i;
        at2Var.h();
        try {
            this.h.flush();
            if (at2Var.i()) {
                throw at2Var.j(null);
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
    public final String toString() {
        return "sink(" + ((Socket) this.j.i) + ')';
    }
}
