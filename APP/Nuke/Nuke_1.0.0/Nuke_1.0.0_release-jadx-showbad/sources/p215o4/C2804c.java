package p215o4;

import com.bumptech.glide.AbstractC1926h;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import p007B0.C0173F;
import p117X2.AbstractC1665j;
import p208n4.AbstractC2718q;
import p208n4.AbstractC2724w;
import p208n4.C2706e;
import p208n4.C2717p;
import p208n4.InterfaceC2720s;

/* JADX INFO: renamed from: o4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2804c implements InterfaceC2720s {

    /* JADX INFO: renamed from: d */
    public final OutputStream f8828d;

    /* JADX INFO: renamed from: e */
    public final C2806e f8829e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0173F f8830f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2804c(C0173F c0173f) {
        this.f8830f = c0173f;
        Socket socket = (Socket) c0173f.f612e;
        this.f8828d = socket.getOutputStream();
        this.f8829e = new C2806e(socket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s
    /* JADX INFO: renamed from: a */
    public final AbstractC2724w mo3339a() {
        return this.f8829e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i5;
        OutputStream outputStream = this.f8828d;
        C0173F c0173f = this.f8830f;
        C2806e c2806e = this.f8829e;
        c2806e.m4696h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) c0173f.f613f;
            Socket socket = (Socket) c0173f.f612e;
            AbstractC1665j.m2985e(atomicInteger, "<this>");
            while (true) {
                int i6 = atomicInteger.get();
                if ((i6 & 1) != 0) {
                    i5 = 0;
                    break;
                }
                int i7 = i6 | 1;
                if (atomicInteger.compareAndSet(i6, i7)) {
                    i5 = i7;
                    break;
                }
            }
            if (i5 != 0) {
                if (i5 != 3) {
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
                if (c2806e.m4697i()) {
                    throw c2806e.mo3767j(null);
                }
            }
        } catch (IOException e5) {
            if (!c2806e.m4697i()) {
                throw e5;
            }
            throw c2806e.mo3767j(e5);
        } finally {
            c2806e.m4697i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s, java.io.Flushable
    public final void flush() throws IOException {
        C2806e c2806e = this.f8829e;
        c2806e.m4696h();
        try {
            this.f8828d.flush();
            if (c2806e.m4697i()) {
                throw c2806e.mo3767j(null);
            }
        } catch (IOException e5) {
            if (!c2806e.m4697i()) {
                throw e5;
            }
            throw c2806e.mo3767j(e5);
        } finally {
            c2806e.m4697i();
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s
    /* JADX INFO: renamed from: p */
    public final void mo3343p(C2706e c2706e, long j5) throws IOException {
        AbstractC1926h.m3564g(c2706e.f8629e, 0L, j5);
        while (j5 > 0) {
            C2806e c2806e = this.f8829e;
            c2806e.mo4748f();
            C2717p c2717p = c2706e.f8628d;
            AbstractC1665j.m2982b(c2717p);
            int iMin = (int) Math.min(j5, c2717p.f8655c - c2717p.f8654b);
            c2806e.m4696h();
            try {
                try {
                    this.f8828d.write(c2717p.f8653a, c2717p.f8654b, iMin);
                    if (c2806e.m4697i()) {
                        throw c2806e.mo3767j(null);
                    }
                    int i5 = c2717p.f8654b + iMin;
                    c2717p.f8654b = i5;
                    long j6 = iMin;
                    j5 -= j6;
                    c2706e.f8629e -= j6;
                    if (i5 == c2717p.f8655c) {
                        c2706e.f8628d = c2717p.m4757a();
                        AbstractC2718q.m4761a(c2717p);
                    }
                } catch (IOException e5) {
                    if (!c2806e.m4697i()) {
                        throw e5;
                    }
                    throw c2806e.mo3767j(e5);
                }
            } catch (Throwable th) {
                c2806e.m4697i();
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "sink(" + ((Socket) this.f8830f.f612e) + ')';
    }
}
