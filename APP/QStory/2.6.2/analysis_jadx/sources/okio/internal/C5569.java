package okio.internal;

import androidx.compose.animation.core.C0325;
import com.bumptech.glide.AbstractC3055;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import p005.AbstractC6111;
import p005.C6099;
import p005.C6101;
import p005.C6107;
import p005.InterfaceC6112;

/* JADX INFO: renamed from: okio.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5569 implements InterfaceC6112 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5567 f15349;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C0325 f15350;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final OutputStream f15351;

    public C5569(C0325 c0325) {
        this.f15350 = c0325;
        Socket socket = (Socket) c0325.f1095;
        this.f15351 = socket.getOutputStream();
        this.f15349 = new C5567(socket);
    }

    @Override // p005.InterfaceC6112, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.f15351;
        C0325 c0325 = this.f15350;
        C5567 c5567 = this.f15349;
        c5567.m11501();
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

    @Override // p005.InterfaceC6112, java.io.Flushable
    public final void flush() throws IOException {
        C5567 c5567 = this.f15349;
        c5567.m11501();
        try {
            this.f15351.flush();
            if (c5567.m11502()) {
                throw c5567.mo10874(null);
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
        return "sink(" + ((Socket) this.f15350.f1095) + ')';
    }

    @Override // p005.InterfaceC6112
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void mo10877(C6101 c6101, long j) throws IOException {
        AbstractC3055.m6628(c6101.f16657, 0L, j);
        while (j > 0) {
            C5567 c5567 = this.f15349;
            c5567.mo11456();
            C6107 c6107 = c6101.f16658;
            c6107.getClass();
            int iMin = (int) Math.min(j, c6107.f16677 - c6107.f16678);
            c5567.m11501();
            try {
                try {
                    this.f15351.write(c6107.f16679, c6107.f16678, iMin);
                    if (c5567.m11502()) {
                        throw c5567.mo10874(null);
                    }
                    int i = c6107.f16678 + iMin;
                    c6107.f16678 = i;
                    long j2 = iMin;
                    j -= j2;
                    c6101.f16657 -= j2;
                    if (i == c6107.f16677) {
                        c6101.f16658 = c6107.m11507();
                        AbstractC6111.m11512(c6107);
                    }
                } catch (IOException e) {
                    if (!c5567.m11502()) {
                        throw e;
                    }
                    throw c5567.mo10874(e);
                }
            } catch (Throwable th) {
                c5567.m11502();
                throw th;
            }
        }
    }

    @Override // p005.InterfaceC6112
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6099 mo10878() {
        return this.f15349;
    }
}
