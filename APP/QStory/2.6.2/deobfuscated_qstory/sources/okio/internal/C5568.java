package okio.internal;

import androidx.compose.animation.core.C0325;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import p005.AbstractC6111;
import p005.C6099;
import p005.C6101;
import p005.C6107;
import p005.InterfaceC6110;

/* JADX INFO: renamed from: okio.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5568 implements InterfaceC6110 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5567 f15346;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C0325 f15347;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InputStream f15348;

    public C5568(C0325 c0325) {
        this.f15347 = c0325;
        Socket socket = (Socket) c0325.f1095;
        this.f15348 = socket.getInputStream();
        this.f15346 = new C5567(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        C0325 c0325 = this.f15347;
        C5567 c5567 = this.f15346;
        c5567.m11501();
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
                if (c5567.m11502()) {
                    throw c5567.mo10874(null);
                }
            }
        } catch (IOException e) {
            if (!c5567.m11502()) {
                throw e;
            }
            throw c5567.mo10874(e);
        } finally {
            c5567.m11502();
        }
    }

    public final String toString() {
        return "source(" + ((Socket) this.f15347.f1095) + ')';
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6099 mo10875() {
        return this.f15346;
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final long mo10876(C6101 c6101, long j) throws IOException {
        c6101.getClass();
        C5567 c5567 = this.f15346;
        c5567.mo11456();
        C6107 c6107M11469 = c6101.m11469(1);
        int iMin = (int) Math.min(8192L, 8192 - c6107M11469.f16677);
        try {
            c5567.m11501();
            try {
                int i = this.f15348.read(c6107M11469.f16679, c6107M11469.f16677, iMin);
                if (c5567.m11502()) {
                    throw c5567.mo10874(null);
                }
                if (i != -1) {
                    c6107M11469.f16677 += i;
                    long j2 = i;
                    c6101.f16657 += j2;
                    return j2;
                }
                if (c6107M11469.f16678 != c6107M11469.f16677) {
                    return -1L;
                }
                c6101.f16658 = c6107M11469.m11507();
                AbstractC6111.m11512(c6107M11469);
                return -1L;
            } catch (IOException e) {
                if (c5567.m11502()) {
                    throw c5567.mo10874(e);
                }
                throw e;
            } finally {
                c5567.m11502();
            }
        } catch (AssertionError e2) {
            if (AbstractC5566.m10872(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }
}
