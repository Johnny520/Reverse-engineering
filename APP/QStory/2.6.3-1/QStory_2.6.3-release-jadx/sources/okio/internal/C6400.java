package okio.internal;

import androidx.compose.animation.core.C1171;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import p020.AbstractC6931;
import p020.C6919;
import p020.C6921;
import p020.C6927;
import p020.InterfaceC6932;
import p191.AbstractC8568;

/* JADX INFO: renamed from: okio.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6400 implements InterfaceC6932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6398 f15694;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C1171 f15695;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final OutputStream f15696;

    public C6400(C1171 c1171) {
        this.f15695 = c1171;
        Socket socket = (Socket) c1171.f1440;
        this.f15696 = socket.getOutputStream();
        this.f15694 = new C6398(socket);
    }

    @Override // p020.InterfaceC6932, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.f15696;
        C1171 c1171 = this.f15695;
        C6398 c6398 = this.f15694;
        c6398.m12053();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) c1171.f1441;
            Socket socket = (Socket) c1171.f1440;
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
                if (c6398.m12054()) {
                    throw c6398.mo11490(null);
                }
            }
        } catch (IOException e) {
            if (!c6398.m12054()) {
                throw e;
            }
            throw c6398.mo11490(e);
        } finally {
            c6398.m12054();
        }
    }

    @Override // p020.InterfaceC6932, java.io.Flushable
    public final void flush() throws IOException {
        C6398 c6398 = this.f15694;
        c6398.m12053();
        try {
            this.f15696.flush();
            if (c6398.m12054()) {
                throw c6398.mo11490(null);
            }
        } catch (IOException e) {
            if (!c6398.m12054()) {
                throw e;
            }
            throw c6398.mo11490(e);
        } finally {
            c6398.m12054();
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f15695.f1440) + ')';
    }

    @Override // p020.InterfaceC6932
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6919 mo11493() {
        return this.f15694;
    }

    @Override // p020.InterfaceC6932
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void mo11494(C6921 c6921, long j) throws IOException {
        AbstractC8568.m13625(c6921.f16992, 0L, j);
        while (j > 0) {
            C6398 c6398 = this.f15694;
            c6398.mo12008();
            C6927 c6927 = c6921.f16993;
            c6927.getClass();
            int iMin = (int) Math.min(j, c6927.f17012 - c6927.f17013);
            c6398.m12053();
            try {
                try {
                    this.f15696.write(c6927.f17014, c6927.f17013, iMin);
                    if (c6398.m12054()) {
                        throw c6398.mo11490(null);
                    }
                    int i = c6927.f17013 + iMin;
                    c6927.f17013 = i;
                    long j2 = iMin;
                    j -= j2;
                    c6921.f16992 -= j2;
                    if (i == c6927.f17012) {
                        c6921.f16993 = c6927.m12059();
                        AbstractC6931.m12064(c6927);
                    }
                } catch (IOException e) {
                    if (!c6398.m12054()) {
                        throw e;
                    }
                    throw c6398.mo11490(e);
                }
            } catch (Throwable th) {
                c6398.m12054();
                throw th;
            }
        }
    }
}
