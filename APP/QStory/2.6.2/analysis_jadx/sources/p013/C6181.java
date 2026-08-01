package p013;

import androidx.appcompat.app.C0108;
import androidx.compose.runtime.internal.C1245;
import com.android.dx.io.Opcodes;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p005.C6108;
import p012.C6164;
import p012.C6165;
import p015.C6193;
import p015.C6200;
import p015.C6212;
import p015.C6223;
import p017.AbstractC6238;
import p021.InterfaceC6254;
import p022.AbstractC6278;
import p022.AbstractC6283;
import p022.C6262;
import p022.C6269;
import p022.C6273;
import p022.C6274;
import p022.C6281;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6181 extends AbstractC6278 implements InterfaceC6254 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6223 f16901;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Socket f16902;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Socket f16903;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6193 f16904;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6164 f16905;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f16906;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f16907;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f16908;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f16909;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f16910;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0108 f16911;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Protocol f16912;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f16913;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f16914;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C6281 f16915;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f16916;

    public C6181(C6164 c6164, C6182 c6182, C6193 c6193, Socket socket, Socket socket2, C6223 c6223, Protocol protocol, C0108 c0108) {
        c6164.getClass();
        c6182.getClass();
        c6193.getClass();
        socket.getClass();
        socket2.getClass();
        protocol.getClass();
        c0108.getClass();
        this.f16905 = c6164;
        this.f16904 = c6193;
        this.f16903 = socket;
        this.f16902 = socket2;
        this.f16901 = c6223;
        this.f16912 = protocol;
        this.f16911 = c0108;
        this.f16909 = 1;
        this.f16910 = new ArrayList();
        this.f16908 = Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m11627(C6200 c6200, C6193 c6193, IOException iOException) {
        c6200.getClass();
        c6193.getClass();
        iOException.getClass();
        if (c6193.f16940.type() != Proxy.Type.DIRECT) {
            C6212 c6212 = c6193.f16941;
            c6212.f17055.connectFailed(c6212.f17054.m11674(), c6193.f16940.address(), iOException);
        }
        C5851 c5851 = c6200.f16960;
        synchronized (c5851) {
            ((LinkedHashSet) c5851.f16007).add(c6193);
        }
    }

    @Override // p021.InterfaceC6254
    public final void cancel() {
        AbstractC6238.m11704(this.f16903);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        C6193 c6193 = this.f16904;
        sb.append(c6193.f16941.f17054.f17120);
        sb.append(':');
        sb.append(c6193.f16941.f17054.f17119);
        sb.append(", proxy=");
        sb.append(c6193.f16940);
        sb.append(" hostAddress=");
        sb.append(c6193.f16939);
        sb.append(" cipherSuite=");
        C6223 c6223 = this.f16901;
        sb.append(c6223 != null ? c6223.f17129 : "none");
        sb.append(" protocol=");
        sb.append(this.f16912);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11628(p015.C6212 r10, java.util.List r11) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p013.C6181.m11628(飘花落叶言世兰楪子苏哲.飘花落叶言子楪世苏哲兰, java.util.List):boolean");
    }

    @Override // p021.InterfaceC6254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo11601(C6177 c6177, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.f16915 != null) || (iOException instanceof ConnectionShutdownException)) {
                        this.f16916 = true;
                        if (this.f16907 == 0) {
                            if (iOException != null) {
                                m11627(c6177.f16882, this.f16904, iOException);
                            }
                            this.f16914++;
                        }
                    }
                } else if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = this.f16906 + 1;
                    this.f16906 = i;
                    if (i > 1) {
                        this.f16916 = true;
                        this.f16914++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !c6177.f16873) {
                    this.f16916 = true;
                    this.f16914++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p021.InterfaceC6254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11602() {
        synchronized (this) {
            this.f16916 = true;
        }
    }

    @Override // p022.AbstractC6278
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo11629(C6273 c6273) {
        c6273.m11771(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // p022.AbstractC6278
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo11630(C6281 c6281, C6262 c6262) {
        c6262.getClass();
        synchronized (this) {
            this.f16909 = (c6262.f17242 & 8) != 0 ? c6262.f17241[3] : Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m11631(boolean z) {
        long j;
        TimeZone timeZone = AbstractC6238.f17190;
        long jNanoTime = System.nanoTime();
        if (this.f16903.isClosed() || this.f16902.isClosed() || this.f16902.isInputShutdown() || this.f16902.isOutputShutdown()) {
            return false;
        }
        C6281 c6281 = this.f16915;
        if (c6281 != null) {
            synchronized (c6281) {
                if (c6281.f17338) {
                    return false;
                }
                if (c6281.f17323 < c6281.f17324) {
                    if (jNanoTime >= c6281.f17322) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f16908;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.f16902;
        C6108 c6108 = (C6108) this.f16911.f320;
        socket.getClass();
        c6108.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !c6108.m11510();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // p021.InterfaceC6254
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final C6193 mo11607() {
        return this.f16904;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m11632() throws SocketException {
        this.f16908 = System.nanoTime();
        Protocol protocol = this.f16912;
        if (protocol == Protocol.HTTP_2 || protocol == Protocol.H2_PRIOR_KNOWLEDGE) {
            this.f16902.setSoTimeout(0);
            C6269 c6269 = C6269.f17272;
            C1245 c1245 = new C1245(this.f16905);
            C0108 c0108 = this.f16911;
            String str = this.f16904.f16941.f17054.f17120;
            c0108.getClass();
            str.getClass();
            c1245.f3620 = c0108;
            c1245.f3617 = AbstractC6238.f17189 + ' ' + str;
            c1245.f3616 = this;
            c1245.f3618 = c6269;
            C6281 c6281 = new C6281(c1245);
            this.f16915 = c6281;
            C6262 c6262 = C6281.f17317;
            this.f16909 = (c6262.f17242 & 8) != 0 ? c6262.f17241[3] : Integer.MAX_VALUE;
            C6274 c6274 = c6281.f17318;
            synchronized (c6274) {
                try {
                    if (c6274.f17296) {
                        throw new IOException("closed");
                    }
                    Logger logger = C6274.f17294;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(AbstractC6238.m11703(">> CONNECTION " + AbstractC6283.f17354.hex(), new Object[0]));
                    }
                    c6274.f17299.mo11464(AbstractC6283.f17354);
                    c6274.f17299.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            C6274 c62742 = c6281.f17318;
            C6262 c62622 = c6281.f17332;
            c62742.getClass();
            c62622.getClass();
            synchronized (c62742) {
                try {
                    if (c62742.f17296) {
                        throw new IOException("closed");
                    }
                    c62742.m11778(0, Integer.bitCount(c62622.f17242) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & c62622.f17242) == 0) {
                            z = false;
                        }
                        if (z) {
                            c62742.f17299.writeShort(i);
                            c62742.f17299.writeInt(c62622.f17241[i]);
                        }
                    }
                    c62742.f17299.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (c6281.f17332.m11747() != 65535) {
                c6281.f17318.m11784(0, r7 - Opcodes.MAX_VALUE);
            }
            C6165.m11590(c6281.f17339.m11587(), c6281.f17341, c6281.f17321);
        }
    }
}
