package okio.internal;

import androidx.compose.animation.core.C1171;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import p020.AbstractC6931;
import p020.C6919;
import p020.C6921;
import p020.C6927;
import p020.InterfaceC6930;

/* JADX INFO: renamed from: okio.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6399 implements InterfaceC6930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6398 f15691;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C1171 f15692;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InputStream f15693;

    public C6399(C1171 c1171) {
        this.f15692 = c1171;
        Socket socket = (Socket) c1171.f1440;
        this.f15693 = socket.getInputStream();
        this.f15691 = new C6398(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        C1171 c1171 = this.f15692;
        C6398 c6398 = this.f15691;
        c6398.m12053();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) c1171.f1441;
            Socket socket = (Socket) c1171.f1440;
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
                        this.f15693.close();
                    }
                }
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

    public final String toString() {
        return "source(" + ((Socket) this.f15692.f1440) + ')';
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final long mo11491(C6921 c6921, long j) throws IOException {
        c6921.getClass();
        C6398 c6398 = this.f15691;
        c6398.mo12008();
        C6927 c6927M12023 = c6921.m12023(1);
        int iMin = (int) Math.min(8192L, 8192 - c6927M12023.f17012);
        try {
            c6398.m12053();
            try {
                int i = this.f15693.read(c6927M12023.f17014, c6927M12023.f17012, iMin);
                if (c6398.m12054()) {
                    throw c6398.mo11490(null);
                }
                if (i != -1) {
                    c6927M12023.f17012 += i;
                    long j2 = i;
                    c6921.f16992 += j2;
                    return j2;
                }
                if (c6927M12023.f17013 != c6927M12023.f17012) {
                    return -1L;
                }
                c6921.f16993 = c6927M12023.m12059();
                AbstractC6931.m12064(c6927M12023);
                return -1L;
            } catch (IOException e) {
                if (c6398.m12054()) {
                    throw c6398.mo11490(e);
                }
                throw e;
            } finally {
                c6398.m12054();
            }
        } catch (AssertionError e2) {
            if (AbstractC6397.m11488(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6919 mo11492() {
        return this.f15691;
    }
}
