package yyds;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: yyds.ᛲᛶᛱᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0363 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C0299 f1877;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InputStream f1878;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1444 f1879;

    public C0363(C0299 c0299) {
        this.f1877 = c0299;
        Socket socket = (Socket) c0299.f1577;
        this.f1878 = socket.getInputStream();
        this.f1879 = new C1444(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        C0299 c0299 = this.f1877;
        C1444 c1444 = this.f1879;
        c1444.m977();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) c0299.f1573;
            Socket socket = (Socket) c0299.f1577;
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
                        this.f1878.close();
                    }
                }
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

    public final String toString() {
        return "source(" + ((Socket) this.f1877.f1577) + ')';
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ */
    public final long mo692(long j, C1507 c1507) throws IOException {
        C1444 c1444 = this.f1879;
        c1444.mo2200();
        C0502 c0502M3039 = c1507.m3039(1);
        int iMin = (int) Math.min(8192L, 8192 - c0502M3039.f2446);
        try {
            c1444.m977();
            try {
                int i = this.f1878.read(c0502M3039.f2443, c0502M3039.f2446, iMin);
                if (c1444.m978()) {
                    throw c1444.m2942(null);
                }
                if (i != -1) {
                    c0502M3039.f2446 += i;
                    long j2 = i;
                    c1507.f7087 += j2;
                    return j2;
                }
                if (c0502M3039.f2444 != c0502M3039.f2446) {
                    return -1L;
                }
                c1507.f7086 = c0502M3039.m1350();
                AbstractC1478.m2976(c0502M3039);
                return -1L;
            } catch (IOException e) {
                if (c1444.m978()) {
                    throw c1444.m2942(e);
                }
                throw e;
            } finally {
                c1444.m978();
            }
        } catch (AssertionError e2) {
            if (AbstractC1124.m2315(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2755 mo693() {
        return this.f1879;
    }
}
