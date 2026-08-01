package okio.internal;

import androidx.compose.animation.core.C0325;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import p004.AbstractC6102;
import p004.C6090;
import p004.C6092;
import p004.C6098;
import p004.InterfaceC6103;
import p175.AbstractC7739;

/* JADX INFO: renamed from: okio.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5570 implements InterfaceC6103 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5568 f15349;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C0325 f15350;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final OutputStream f15351;

    public C5570(C0325 c0325) {
        this.f15350 = c0325;
        Socket socket = (Socket) c0325.f1095;
        this.f15351 = socket.getOutputStream();
        this.f15349 = new C5568(socket);
    }

    @Override // p004.InterfaceC6103, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.f15351;
        C0325 c0325 = this.f15350;
        C5568 c5568 = this.f15349;
        c5568.m11494();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) c0325.f1096;
            Socket socket = (Socket) c0325.f1095;
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
                if (c5568.m11495()) {
                    throw c5568.mo10931(null);
                }
            }
        } catch (IOException e) {
            if (!c5568.m11495()) {
                throw e;
            }
            throw c5568.mo10931(e);
        } finally {
            c5568.m11495();
        }
    }

    @Override // p004.InterfaceC6103, java.io.Flushable
    public final void flush() throws IOException {
        C5568 c5568 = this.f15349;
        c5568.m11494();
        try {
            this.f15351.flush();
            if (c5568.m11495()) {
                throw c5568.mo10931(null);
            }
        } catch (IOException e) {
            if (!c5568.m11495()) {
                throw e;
            }
            throw c5568.mo10931(e);
        } finally {
            c5568.m11495();
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f15350.f1095) + ')';
    }

    @Override // p004.InterfaceC6103
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6090 mo10934() {
        return this.f15349;
    }

    @Override // p004.InterfaceC6103
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void mo10935(C6092 c6092, long j) throws IOException {
        AbstractC7739.m13066(c6092.f16647, 0L, j);
        while (j > 0) {
            C5568 c5568 = this.f15349;
            c5568.mo11449();
            C6098 c6098 = c6092.f16648;
            c6098.getClass();
            int iMin = (int) Math.min(j, c6098.f16667 - c6098.f16668);
            c5568.m11494();
            try {
                try {
                    this.f15351.write(c6098.f16669, c6098.f16668, iMin);
                    if (c5568.m11495()) {
                        throw c5568.mo10931(null);
                    }
                    int i = c6098.f16668 + iMin;
                    c6098.f16668 = i;
                    long j2 = iMin;
                    j -= j2;
                    c6092.f16647 -= j2;
                    if (i == c6098.f16667) {
                        c6092.f16648 = c6098.m11500();
                        AbstractC6102.m11505(c6098);
                    }
                } catch (IOException e) {
                    if (!c5568.m11495()) {
                        throw e;
                    }
                    throw c5568.mo10931(e);
                }
            } catch (Throwable th) {
                c5568.m11495();
                throw th;
            }
        }
    }
}
