package yyds;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: yyds.ᛸᲁᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1888 implements InterfaceC1979 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C0299 f9524;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final OutputStream f9525;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1444 f9526;

    public C1888(C0299 c0299) {
        this.f9524 = c0299;
        Socket socket = (Socket) c0299.f1577;
        this.f9525 = socket.getOutputStream();
        this.f9526 = new C1444(socket);
    }

    @Override // yyds.InterfaceC1979, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.f9525;
        C0299 c0299 = this.f9524;
        C1444 c1444 = this.f9526;
        c1444.m977();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) c0299.f1573;
            Socket socket = (Socket) c0299.f1577;
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
                if (c1444.m978()) {
                    throw c1444.m2942(null);
                }
            }
        } catch (IOException e) {
            if (!c1444.m978()) {
                throw e;
            }
            throw c1444.m2942(e);
        } finally {
            c1444.m978();
        }
    }

    @Override // yyds.InterfaceC1979, java.io.Flushable
    public final void flush() throws IOException {
        C1444 c1444 = this.f9526;
        c1444.m977();
        try {
            this.f9525.flush();
            if (c1444.m978()) {
                throw c1444.m2942(null);
            }
        } catch (IOException e) {
            if (!c1444.m978()) {
                throw e;
            }
            throw c1444.m2942(e);
        } finally {
            c1444.m978();
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f9524.f1577) + ')';
    }

    @Override // yyds.InterfaceC1979
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final void mo576(long j, C1507 c1507) throws IOException {
        AbstractC2217.m4201(c1507.f7087, 0L, j);
        while (j > 0) {
            C1444 c1444 = this.f9526;
            c1444.mo2200();
            C0502 c0502 = c1507.f7086;
            int iMin = (int) Math.min(j, c0502.f2446 - c0502.f2444);
            c1444.m977();
            try {
                try {
                    this.f9525.write(c0502.f2443, c0502.f2444, iMin);
                    if (c1444.m978()) {
                        throw c1444.m2942(null);
                    }
                    int i = c0502.f2444 + iMin;
                    c0502.f2444 = i;
                    long j2 = iMin;
                    j -= j2;
                    c1507.f7087 -= j2;
                    if (i == c0502.f2446) {
                        c1507.f7086 = c0502.m1350();
                        AbstractC1478.m2976(c0502);
                    }
                } catch (IOException e) {
                    if (!c1444.m978()) {
                        throw e;
                    }
                    throw c1444.m2942(e);
                }
            } catch (Throwable th) {
                c1444.m978();
                throw th;
            }
        }
    }

    @Override // yyds.InterfaceC1979
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2755 mo577() {
        return this.f9526;
    }
}
