package p035;

import androidx.appcompat.app.C0908;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p020.C6919;
import p020.C6921;
import p020.InterfaceC6930;
import p029.AbstractC7059;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7100 implements InterfaceC6930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f17627;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C7098 f17629;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f17630;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f17632;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6921 f17631 = new C6921();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6921 f17628 = new C6921();

    public C7100(C7098 c7098, long j, boolean z) {
        this.f17629 = c7098;
        this.f17632 = j;
        this.f17630 = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        C7098 c7098 = this.f17629;
        synchronized (c7098) {
            this.f17627 = true;
            C6921 c6921 = this.f17628;
            j = c6921.f16992;
            c6921.m12034();
            c7098.notifyAll();
        }
        if (j > 0) {
            C7098 c70982 = this.f17629;
            TimeZone timeZone = AbstractC7059.f17512;
            c70982.f17618.m12367(j);
        }
        this.f17629.m12349();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc A[Catch: all -> 0x0025, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0008, B:7:0x0015, B:13:0x001f, B:47:0x00bc, B:61:0x00e2, B:62:0x00e7, B:17:0x0028, B:19:0x002e, B:21:0x0032, B:23:0x0036, B:27:0x0047, B:29:0x004b, B:31:0x0055, B:33:0x0072, B:35:0x0083, B:38:0x009a, B:41:0x00a4, B:43:0x00aa, B:44:0x00b6, B:58:0x00d8, B:59:0x00df), top: B:66:0x0008, inners: #0 }] */
    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo11491(C6921 c6921, long j) throws Throwable {
        boolean z;
        Throwable streamResetException;
        long j2;
        long jMo11491;
        c6921.getClass();
        do {
            C7098 c7098 = this.f17629;
            synchronized (c7098) {
                c7098.f17618.getClass();
                C7096 c7096 = c7098.f17615;
                z = true;
                boolean z2 = c7096.f17602 || c7096.f17603;
                if (z2) {
                    c7098.f17611.m12053();
                }
                try {
                    if (c7098.m12351() == null || this.f17630) {
                        streamResetException = null;
                    } else {
                        streamResetException = c7098.f17608;
                        if (streamResetException == null) {
                            ErrorCode errorCodeM12351 = c7098.m12351();
                            errorCodeM12351.getClass();
                            streamResetException = new StreamResetException(errorCodeM12351);
                        }
                    }
                    if (this.f17627) {
                        throw new IOException("stream closed");
                    }
                    C6921 c69212 = this.f17628;
                    long j3 = c69212.f16992;
                    if (j3 > 0) {
                        jMo11491 = c69212.mo11491(c6921, Math.min(8192L, j3));
                        C0908.m743(c7098.f17619, jMo11491, 0L, 2);
                        long jM744 = c7098.f17619.m744();
                        if (streamResetException == null) {
                            j2 = -1;
                            if (jM744 >= c7098.f17618.f17659.m12323() / 2) {
                                c7098.f17618.m12370(c7098.f17620, jM744);
                                C0908.m743(c7098.f17619, 0L, jM744, 1);
                            }
                        } else {
                            j2 = -1;
                        }
                    } else {
                        j2 = -1;
                        if (this.f17630 || streamResetException != null) {
                            jMo11491 = -1;
                        } else {
                            try {
                                c7098.wait();
                                jMo11491 = -1;
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    z = false;
                } finally {
                    if (z2) {
                        c7098.f17611.m12362();
                    }
                }
            }
            this.f17629.f17618.f17660.getClass();
        } while (z);
        if (jMo11491 != j2) {
            return jMo11491;
        }
        if (streamResetException == null) {
            return j2;
        }
        throw streamResetException;
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6919 mo11492() {
        return this.f17629.f17611;
    }
}
