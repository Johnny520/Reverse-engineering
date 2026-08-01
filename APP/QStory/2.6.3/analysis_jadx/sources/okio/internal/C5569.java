package okio.internal;

import androidx.compose.animation.core.C0325;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import p004.AbstractC6102;
import p004.C6090;
import p004.C6092;
import p004.C6098;
import p004.InterfaceC6101;

/* JADX INFO: renamed from: okio.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5569 implements InterfaceC6101 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5568 f15346;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C0325 f15347;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InputStream f15348;

    public C5569(C0325 c0325) {
        this.f15347 = c0325;
        Socket socket = (Socket) c0325.f1095;
        this.f15348 = socket.getInputStream();
        this.f15346 = new C5568(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        C0325 c0325 = this.f15347;
        C5568 c5568 = this.f15346;
        c5568.m11494();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) c0325.f1096;
            Socket socket = (Socket) c0325.f1095;
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
                        this.f15348.close();
                    }
                }
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

    public final String toString() {
        return "source(" + ((Socket) this.f15347.f1095) + ')';
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final long mo10932(C6092 c6092, long j) throws IOException {
        c6092.getClass();
        C5568 c5568 = this.f15346;
        c5568.mo11449();
        C6098 c6098M11464 = c6092.m11464(1);
        int iMin = (int) Math.min(8192L, 8192 - c6098M11464.f16667);
        try {
            c5568.m11494();
            try {
                int i = this.f15348.read(c6098M11464.f16669, c6098M11464.f16667, iMin);
                if (c5568.m11495()) {
                    throw c5568.mo10931(null);
                }
                if (i != -1) {
                    c6098M11464.f16667 += i;
                    long j2 = i;
                    c6092.f16647 += j2;
                    return j2;
                }
                if (c6098M11464.f16668 != c6098M11464.f16667) {
                    return -1L;
                }
                c6092.f16648 = c6098M11464.m11500();
                AbstractC6102.m11505(c6098M11464);
                return -1L;
            } catch (IOException e) {
                if (c5568.m11495()) {
                    throw c5568.mo10931(e);
                }
                throw e;
            } finally {
                c5568.m11495();
            }
        } catch (AssertionError e2) {
            if (AbstractC5567.m10929(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6090 mo10933() {
        return this.f15346;
    }
}
