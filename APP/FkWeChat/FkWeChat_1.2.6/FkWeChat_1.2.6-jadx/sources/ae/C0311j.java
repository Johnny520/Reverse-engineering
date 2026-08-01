package ae;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import p172l8.C4700i0;
import p376zd.AbstractC9978b;
import p376zd.C10012q0;
import p376zd.C10014r0;
import p376zd.C9991g;
import p376zd.C9995i;
import p376zd.InterfaceC10020u0;
import p376zd.InterfaceC10022v0;
import p376zd.InterfaceC10024w0;

/* JADX INFO: renamed from: ae.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0311j implements InterfaceC10022v0 {

    /* JADX INFO: renamed from: q */
    public final Socket f770q;

    /* JADX INFO: renamed from: r */
    public AtomicInteger f771r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC10024w0 f772s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC10020u0 f773t;

    /* JADX INFO: renamed from: ae.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a implements InterfaceC10020u0 {

        /* JADX INFO: renamed from: q */
        public final OutputStream f774q;

        /* JADX INFO: renamed from: r */
        public final C0317p f775r;

        public a() {
            this.f774q = C0311j.this.m949b().getOutputStream();
            this.f775r = new C0317p(C0311j.this.m949b());
        }

        @Override // p376zd.InterfaceC10020u0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0317p timeout() {
            return this.f775r;
        }

        @Override // p376zd.InterfaceC10020u0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C0317p c0317p = this.f775r;
            C0311j c0311j = C0311j.this;
            c0317p.enter();
            try {
                int iM998a = AbstractC0325x.m998a(c0311j.f771r, 1);
                if (iM998a != 0) {
                    if (iM998a != 3) {
                        if (!c0311j.m949b().isClosed() && !c0311j.m949b().isOutputShutdown()) {
                            this.f774q.flush();
                            try {
                                c0311j.m949b().shutdownOutput();
                            } catch (UnsupportedOperationException unused) {
                                this.f774q.close();
                            }
                        }
                        return;
                    }
                    c0311j.m949b().close();
                    C4700i0 c4700i0 = C4700i0.f13910a;
                    if (c0317p.exit()) {
                        throw c0317p.access$newTimeoutException(null);
                    }
                    return;
                }
                return;
            } catch (IOException e10) {
                if (!c0317p.exit()) {
                    throw e10;
                }
                throw c0317p.access$newTimeoutException(e10);
            } finally {
                c0317p.exit();
            }
            c0317p.exit();
        }

        @Override // p376zd.InterfaceC10020u0, java.io.Flushable
        public void flush() throws IOException {
            C0317p c0317p = this.f775r;
            c0317p.enter();
            try {
                this.f774q.flush();
                C4700i0 c4700i0 = C4700i0.f13910a;
                if (c0317p.exit()) {
                    throw c0317p.access$newTimeoutException(null);
                }
            } catch (IOException e10) {
                if (!c0317p.exit()) {
                    throw e10;
                }
                throw c0317p.access$newTimeoutException(e10);
            } finally {
                c0317p.exit();
            }
        }

        public String toString() {
            return "sink(" + C0311j.this.m949b() + ')';
        }

        @Override // p376zd.InterfaceC10020u0
        public void write(C9995i c9995i, long j10) throws IOException {
            c9995i.getClass();
            AbstractC9978b.m38615b(c9995i.size(), 0L, j10);
            while (j10 > 0) {
                this.f775r.throwIfReached();
                C10012q0 c10012q0 = c9995i.f33561q;
                c10012q0.getClass();
                int iMin = (int) Math.min(j10, c10012q0.f33618c - c10012q0.f33617b);
                C0317p c0317p = this.f775r;
                c0317p.enter();
                try {
                    try {
                        this.f774q.write(c10012q0.f33616a, c10012q0.f33617b, iMin);
                        C4700i0 c4700i0 = C4700i0.f13910a;
                        if (c0317p.exit()) {
                            throw c0317p.access$newTimeoutException(null);
                        }
                        c10012q0.f33617b += iMin;
                        long j11 = iMin;
                        j10 -= j11;
                        c9995i.m38689P(c9995i.size() - j11);
                        if (c10012q0.f33617b == c10012q0.f33618c) {
                            c9995i.f33561q = c10012q0.m38822b();
                            C10014r0.m38829b(c10012q0);
                        }
                    } catch (IOException e10) {
                        if (!c0317p.exit()) {
                            throw e10;
                        }
                        throw c0317p.access$newTimeoutException(e10);
                    }
                } catch (Throwable th) {
                    c0317p.exit();
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ae.j$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class b implements InterfaceC10024w0 {

        /* JADX INFO: renamed from: q */
        public final InputStream f777q;

        /* JADX INFO: renamed from: r */
        public final C0317p f778r;

        public b() {
            this.f777q = C0311j.this.m949b().getInputStream();
            this.f778r = new C0317p(C0311j.this.m949b());
        }

        @Override // p376zd.InterfaceC10024w0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0317p timeout() {
            return this.f778r;
        }

        @Override // p376zd.InterfaceC10024w0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C0317p c0317p = this.f778r;
            C0311j c0311j = C0311j.this;
            c0317p.enter();
            try {
                int iM998a = AbstractC0325x.m998a(c0311j.f771r, 2);
                if (iM998a != 0) {
                    if (iM998a == 3) {
                        c0311j.m949b().close();
                    } else {
                        if (c0311j.m949b().isClosed() || c0311j.m949b().isInputShutdown()) {
                            return;
                        }
                        try {
                            c0311j.m949b().shutdownInput();
                        } catch (UnsupportedOperationException unused) {
                            this.f777q.close();
                        }
                    }
                    C4700i0 c4700i0 = C4700i0.f13910a;
                    if (c0317p.exit()) {
                        throw c0317p.access$newTimeoutException(null);
                    }
                }
            } catch (IOException e10) {
                if (!c0317p.exit()) {
                    throw e10;
                }
                throw c0317p.access$newTimeoutException(e10);
            } finally {
                c0317p.exit();
            }
        }

        @Override // p376zd.InterfaceC10024w0
        public long read(C9995i c9995i, long j10) throws IOException {
            c9995i.getClass();
            if (j10 == 0) {
                return 0L;
            }
            if (j10 < 0) {
                C9991g.m38662a("byteCount < 0: ", j10);
                return 0L;
            }
            this.f778r.throwIfReached();
            C10012q0 c10012q0M38695V = c9995i.m38695V(1);
            int iMin = (int) Math.min(j10, 8192 - c10012q0M38695V.f33618c);
            try {
                C0317p c0317p = this.f778r;
                c0317p.enter();
                try {
                    int i10 = this.f777q.read(c10012q0M38695V.f33616a, c10012q0M38695V.f33618c, iMin);
                    if (c0317p.exit()) {
                        throw c0317p.access$newTimeoutException(null);
                    }
                    if (i10 != -1) {
                        c10012q0M38695V.f33618c += i10;
                        long j11 = i10;
                        c9995i.m38689P(c9995i.size() + j11);
                        return j11;
                    }
                    if (c10012q0M38695V.f33617b != c10012q0M38695V.f33618c) {
                        return -1L;
                    }
                    c9995i.f33561q = c10012q0M38695V.m38822b();
                    C10014r0.m38829b(c10012q0M38695V);
                    return -1L;
                } catch (IOException e10) {
                    if (c0317p.exit()) {
                        throw c0317p.access$newTimeoutException(e10);
                    }
                    throw e10;
                } finally {
                    c0317p.exit();
                }
            } catch (AssertionError e11) {
                if (AbstractC0326y.m1000b(e11)) {
                    throw new IOException(e11);
                }
                throw e11;
            }
        }

        public String toString() {
            return "source(" + C0311j.this.m949b() + ')';
        }
    }

    public C0311j(Socket socket) {
        socket.getClass();
        this.f770q = socket;
        this.f771r = new AtomicInteger();
        this.f772s = new b();
        this.f773t = new a();
    }

    /* JADX INFO: renamed from: b */
    public final Socket m949b() {
        return this.f770q;
    }

    @Override // p376zd.InterfaceC10022v0
    public void cancel() throws IOException {
        this.f770q.close();
    }

    @Override // p376zd.InterfaceC10022v0
    public InterfaceC10020u0 getSink() {
        return this.f773t;
    }

    @Override // p376zd.InterfaceC10022v0
    public InterfaceC10024w0 getSource() {
        return this.f772s;
    }

    public String toString() {
        String string = this.f770q.toString();
        string.getClass();
        return string;
    }
}
