package p011;

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
import p004.C6099;
import p007.C6120;
import p007.C6127;
import p007.C6139;
import p007.C6150;
import p012.InterfaceC6216;
import p013.AbstractC6230;
import p015.C6234;
import p015.C6235;
import p019.AbstractC6274;
import p019.AbstractC6279;
import p019.C6258;
import p019.C6265;
import p019.C6269;
import p019.C6270;
import p019.C6277;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6207 extends AbstractC6274 implements InterfaceC6216 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6150 f17109;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Socket f17110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Socket f17111;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6120 f17112;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6234 f17113;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f17114;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f17115;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f17116;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f17117;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f17118;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0108 f17119;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Protocol f17120;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f17121;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f17122;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C6277 f17123;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f17124;

    public C6207(C6234 c6234, C6205 c6205, C6120 c6120, Socket socket, Socket socket2, C6150 c6150, Protocol protocol, C0108 c0108) {
        c6234.getClass();
        c6205.getClass();
        c6120.getClass();
        socket.getClass();
        socket2.getClass();
        protocol.getClass();
        c0108.getClass();
        this.f17113 = c6234;
        this.f17112 = c6120;
        this.f17111 = socket;
        this.f17110 = socket2;
        this.f17109 = c6150;
        this.f17120 = protocol;
        this.f17119 = c0108;
        this.f17117 = 1;
        this.f17118 = new ArrayList();
        this.f17116 = Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m11647(C6127 c6127, C6120 c6120, IOException iOException) {
        c6127.getClass();
        c6120.getClass();
        iOException.getClass();
        if (c6120.f16701.type() != Proxy.Type.DIRECT) {
            C6139 c6139 = c6120.f16702;
            c6139.f16816.connectFailed(c6139.f16815.m11545(), c6120.f16701.address(), iOException);
        }
        C5856 c5856 = c6127.f16721;
        synchronized (c5856) {
            ((LinkedHashSet) c5856.f16014).add(c6120);
        }
    }

    @Override // p012.InterfaceC6216
    public final void cancel() {
        AbstractC6230.m11696(this.f17111);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        C6120 c6120 = this.f17112;
        sb.append(c6120.f16702.f16815.f16881);
        sb.append(':');
        sb.append(c6120.f16702.f16815.f16880);
        sb.append(", proxy=");
        sb.append(c6120.f16701);
        sb.append(" hostAddress=");
        sb.append(c6120.f16700);
        sb.append(" cipherSuite=");
        C6150 c6150 = this.f17109;
        sb.append(c6150 != null ? c6150.f16890 : "none");
        sb.append(" protocol=");
        sb.append(this.f17120);
        sb.append('}');
        return sb.toString();
    }

    @Override // p012.InterfaceC6216
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo11619(C6203 c6203, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.f17123 != null) || (iOException instanceof ConnectionShutdownException)) {
                        this.f17124 = true;
                        if (this.f17115 == 0) {
                            if (iOException != null) {
                                m11647(c6203.f17087, this.f17112, iOException);
                            }
                            this.f17122++;
                        }
                    }
                } else if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = this.f17114 + 1;
                    this.f17114 = i;
                    if (i > 1) {
                        this.f17124 = true;
                        this.f17122++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !c6203.f17078) {
                    this.f17124 = true;
                    this.f17122++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11648(p007.C6139 r10, java.util.List r11) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p011.C6207.m11648(飘花落叶言世兰子哲苏楪.飘花落叶言子楪世苏哲兰, java.util.List):boolean");
    }

    @Override // p012.InterfaceC6216
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11621() {
        synchronized (this) {
            this.f17124 = true;
        }
    }

    @Override // p019.AbstractC6274
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo11649(C6269 c6269) {
        c6269.m11788(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // p019.AbstractC6274
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo11650(C6277 c6277, C6258 c6258) {
        c6258.getClass();
        synchronized (this) {
            this.f17117 = (c6258.f17224 & 8) != 0 ? c6258.f17223[3] : Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m11651(boolean z) {
        long j;
        TimeZone timeZone = AbstractC6230.f17167;
        long jNanoTime = System.nanoTime();
        if (this.f17111.isClosed() || this.f17110.isClosed() || this.f17110.isInputShutdown() || this.f17110.isOutputShutdown()) {
            return false;
        }
        C6277 c6277 = this.f17123;
        if (c6277 != null) {
            synchronized (c6277) {
                if (c6277.f17320) {
                    return false;
                }
                if (c6277.f17305 < c6277.f17306) {
                    if (jNanoTime >= c6277.f17304) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f17116;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.f17110;
        C6099 c6099 = (C6099) this.f17119.f320;
        socket.getClass();
        c6099.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !c6099.m11503();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // p012.InterfaceC6216
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final C6120 mo11626() {
        return this.f17112;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m11652() throws SocketException {
        this.f17116 = System.nanoTime();
        Protocol protocol = this.f17120;
        if (protocol == Protocol.HTTP_2 || protocol == Protocol.H2_PRIOR_KNOWLEDGE) {
            this.f17110.setSoTimeout(0);
            C6265 c6265 = C6265.f17254;
            C1245 c1245 = new C1245(this.f17113);
            C0108 c0108 = this.f17119;
            String str = this.f17112.f16702.f16815.f16881;
            c0108.getClass();
            str.getClass();
            c1245.f3621 = c0108;
            c1245.f3618 = AbstractC6230.f17166 + ' ' + str;
            c1245.f3617 = this;
            c1245.f3619 = c6265;
            C6277 c6277 = new C6277(c1245);
            this.f17123 = c6277;
            C6258 c6258 = C6277.f17299;
            this.f17117 = (c6258.f17224 & 8) != 0 ? c6258.f17223[3] : Integer.MAX_VALUE;
            C6270 c6270 = c6277.f17300;
            synchronized (c6270) {
                try {
                    if (c6270.f17278) {
                        throw new IOException("closed");
                    }
                    Logger logger = C6270.f17276;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(AbstractC6230.m11695(">> CONNECTION " + AbstractC6279.f17336.hex(), new Object[0]));
                    }
                    c6270.f17281.mo11459(AbstractC6279.f17336);
                    c6270.f17281.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            C6270 c62702 = c6277.f17300;
            C6258 c62582 = c6277.f17314;
            c62702.getClass();
            c62582.getClass();
            synchronized (c62702) {
                try {
                    if (c62702.f17278) {
                        throw new IOException("closed");
                    }
                    c62702.m11795(0, Integer.bitCount(c62582.f17224) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & c62582.f17224) == 0) {
                            z = false;
                        }
                        if (z) {
                            c62702.f17281.writeShort(i);
                            c62702.f17281.writeInt(c62582.f17223[i]);
                        }
                    }
                    c62702.f17281.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (c6277.f17314.m11764() != 65535) {
                c6277.f17300.m11801(0, r7 - Opcodes.MAX_VALUE);
            }
            C6235.m11712(c6277.f17321.m11709(), c6277.f17323, c6277.f17303);
        }
    }
}
