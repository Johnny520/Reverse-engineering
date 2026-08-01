package p215o4;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import p007B0.C0173F;
import p117X2.AbstractC1665j;
import p208n4.AbstractC2718q;
import p208n4.AbstractC2724w;
import p208n4.C2706e;
import p208n4.C2717p;
import p208n4.InterfaceC2722u;

/* JADX INFO: renamed from: o4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2805d implements InterfaceC2722u {

    /* JADX INFO: renamed from: d */
    public final InputStream f8831d;

    /* JADX INFO: renamed from: e */
    public final C2806e f8832e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0173F f8833f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2805d(C0173F c0173f) {
        this.f8833f = c0173f;
        Socket socket = (Socket) c0173f.f612e;
        this.f8831d = socket.getInputStream();
        this.f8832e = new C2806e(socket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: a */
    public final AbstractC2724w mo3157a() {
        return this.f8832e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i5;
        C0173F c0173f = this.f8833f;
        C2806e c2806e = this.f8832e;
        c2806e.m4696h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) c0173f.f613f;
            Socket socket = (Socket) c0173f.f612e;
            AbstractC1665j.m2985e(atomicInteger, "<this>");
            while (true) {
                int i6 = atomicInteger.get();
                if ((i6 & 2) != 0) {
                    i5 = 0;
                    break;
                }
                int i7 = i6 | 2;
                if (atomicInteger.compareAndSet(i6, i7)) {
                    i5 = i7;
                    break;
                }
            }
            if (i5 != 0) {
                if (i5 == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f8831d.close();
                    }
                }
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
    public final String toString() {
        return "source(" + ((Socket) this.f8833f.f612e) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: y */
    public final long mo554y(C2706e c2706e, long j5) throws IOException {
        AbstractC1665j.m2985e(c2706e, "sink");
        C2806e c2806e = this.f8832e;
        c2806e.mo4748f();
        C2717p c2717pM4702D = c2706e.m4702D(1);
        int iMin = (int) Math.min(8192L, 8192 - c2717pM4702D.f8655c);
        try {
            c2806e.m4696h();
            try {
                int i5 = this.f8831d.read(c2717pM4702D.f8653a, c2717pM4702D.f8655c, iMin);
                if (c2806e.m4697i()) {
                    throw c2806e.mo3767j(null);
                }
                if (i5 != -1) {
                    c2717pM4702D.f8655c += i5;
                    long j6 = i5;
                    c2706e.f8629e += j6;
                    return j6;
                }
                if (c2717pM4702D.f8654b != c2717pM4702D.f8655c) {
                    return -1L;
                }
                c2706e.f8628d = c2717pM4702D.m4757a();
                AbstractC2718q.m4761a(c2717pM4702D);
                return -1L;
            } catch (IOException e5) {
                if (c2806e.m4697i()) {
                    throw c2806e.mo3767j(e5);
                }
                throw e5;
            } finally {
                c2806e.m4697i();
            }
        } catch (AssertionError e6) {
            if (AbstractC2807f.m4990a(e6)) {
                throw new IOException(e6);
            }
            throw e6;
        }
    }
}
