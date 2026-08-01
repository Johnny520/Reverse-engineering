package p027;

import androidx.appcompat.app.C0955;
import androidx.compose.foundation.lazy.C1596;
import androidx.compose.runtime.internal.C2080;
import com.android.p002dx.p005io.Opcodes;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC5227;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p018.C6915;
import p020.C6928;
import p023.C6949;
import p023.C6956;
import p023.C6964;
import p023.C6968;
import p023.C6978;
import p023.C6979;
import p028.InterfaceC7045;
import p029.AbstractC7059;
import p031.C7063;
import p031.C7064;
import p035.AbstractC7103;
import p035.AbstractC7108;
import p035.C7087;
import p035.C7094;
import p035.C7098;
import p035.C7099;
import p035.C7106;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7036 extends AbstractC7103 implements InterfaceC7045 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6979 f17454;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Socket f17455;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Socket f17456;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6949 f17457;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7063 f17458;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f17459;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f17460;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f17461;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f17462;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f17463;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0955 f17464;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Protocol f17465;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f17466;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f17467;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C7106 f17468;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f17469;

    public C7036(C7063 c7063, C7034 c7034, C6949 c6949, Socket socket, Socket socket2, C6979 c6979, Protocol protocol, C0955 c0955) {
        c7063.getClass();
        c7034.getClass();
        c6949.getClass();
        socket.getClass();
        socket2.getClass();
        protocol.getClass();
        c0955.getClass();
        this.f17458 = c7063;
        this.f17457 = c6949;
        this.f17456 = socket;
        this.f17455 = socket2;
        this.f17454 = c6979;
        this.f17465 = protocol;
        this.f17464 = c0955;
        this.f17462 = 1;
        this.f17463 = new ArrayList();
        this.f17461 = Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m12206(C6956 c6956, C6949 c6949, IOException iOException) {
        c6956.getClass();
        c6949.getClass();
        iOException.getClass();
        if (c6949.f17046.type() != Proxy.Type.DIRECT) {
            C6968 c6968 = c6949.f17047;
            c6968.f17161.connectFailed(c6968.f17160.m12104(), c6949.f17046.address(), iOException);
        }
        C6686 c6686 = c6956.f17066;
        synchronized (c6686) {
            ((LinkedHashSet) c6686.f16359).add(c6949);
        }
    }

    @Override // p028.InterfaceC7045
    public final void cancel() {
        AbstractC7059.m12255(this.f17456);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        C6949 c6949 = this.f17457;
        sb.append(c6949.f17047.f17160.f17226);
        sb.append(':');
        sb.append(c6949.f17047.f17160.f17225);
        sb.append(", proxy=");
        sb.append(c6949.f17046);
        sb.append(" hostAddress=");
        sb.append(c6949.f17045);
        sb.append(" cipherSuite=");
        C6979 c6979 = this.f17454;
        sb.append(c6979 != null ? c6979.f17235 : "none");
        sb.append(" protocol=");
        sb.append(this.f17465);
        sb.append('}');
        return sb.toString();
    }

    @Override // p028.InterfaceC7045
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12178(C7032 c7032, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.f17468 != null) || (iOException instanceof ConnectionShutdownException)) {
                        this.f17469 = true;
                        if (this.f17460 == 0) {
                            if (iOException != null) {
                                m12206(c7032.f17432, this.f17457, iOException);
                            }
                            this.f17467++;
                        }
                    }
                } else if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = this.f17459 + 1;
                    this.f17459 = i;
                    if (i > 1) {
                        this.f17469 = true;
                        this.f17467++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !c7032.f17423) {
                    this.f17469 = true;
                    this.f17467++;
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
    */
    public final boolean m12207(C6968 c6968, List list) {
        C6978 c6978 = c6968.f17160;
        TimeZone timeZone = AbstractC7059.f17512;
        if (this.f17463.size() < this.f17462 && !this.f17469) {
            C6949 c6949 = this.f17457;
            C6968 c69682 = c6949.f17047;
            C6968 c69683 = c6949.f17047;
            if (c69682.m12086(c6968)) {
                String str = c6978.f17226;
                String str2 = c6978.f17226;
                if (AbstractC5227.m9466(str, c69683.f17160.f17226)) {
                    return true;
                }
                if (this.f17468 != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C6949 c69492 = (C6949) it.next();
                        Proxy.Type type = c69492.f17046.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && c6949.f17046.type() == type2 && AbstractC5227.m9466(c6949.f17045, c69492.f17045)) {
                            if (c6968.f17156 == C6915.f16984) {
                                TimeZone timeZone2 = AbstractC7059.f17512;
                                C6978 c69782 = c69683.f17160;
                                if (c6978.f17225 == c69782.f17225) {
                                    boolean zM9466 = AbstractC5227.m9466(str2, c69782.f17226);
                                    C6979 c6979 = this.f17454;
                                    if (!zM9466) {
                                        if (!this.f17466 && c6979 != null) {
                                            List listM12106 = c6979.m12106();
                                            if (!listM12106.isEmpty()) {
                                                Object obj = listM12106.get(0);
                                                obj.getClass();
                                                if (C6915.m12000(str2, (X509Certificate) obj)) {
                                                    try {
                                                        C6964 c6964 = c6968.f17155;
                                                        c6964.getClass();
                                                        c6979.getClass();
                                                        List listM121062 = c6979.m12106();
                                                        str2.getClass();
                                                        listM121062.getClass();
                                                        c6964.m12083(str2, new C1596(c6964, listM121062, str2, 8));
                                                        return true;
                                                    } catch (SSLPeerUnverifiedException unused) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p028.InterfaceC7045
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12180() {
        synchronized (this) {
            this.f17469 = true;
        }
    }

    @Override // p035.AbstractC7103
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo12208(C7098 c7098) {
        c7098.m12347(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // p035.AbstractC7103
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo12209(C7106 c7106, C7087 c7087) {
        c7087.getClass();
        synchronized (this) {
            this.f17462 = (c7087.f17569 & 8) != 0 ? c7087.f17568[3] : Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m12210(boolean z) {
        long j;
        TimeZone timeZone = AbstractC7059.f17512;
        long jNanoTime = System.nanoTime();
        if (this.f17456.isClosed() || this.f17455.isClosed() || this.f17455.isInputShutdown() || this.f17455.isOutputShutdown()) {
            return false;
        }
        C7106 c7106 = this.f17468;
        if (c7106 != null) {
            synchronized (c7106) {
                if (c7106.f17665) {
                    return false;
                }
                if (c7106.f17650 < c7106.f17651) {
                    if (jNanoTime >= c7106.f17649) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f17461;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.f17455;
        C6928 c6928 = (C6928) this.f17464.f665;
        socket.getClass();
        c6928.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !c6928.m12062();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // p028.InterfaceC7045
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final C6949 mo12185() {
        return this.f17457;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m12211() throws SocketException {
        this.f17461 = System.nanoTime();
        Protocol protocol = this.f17465;
        if (protocol == Protocol.HTTP_2 || protocol == Protocol.H2_PRIOR_KNOWLEDGE) {
            this.f17455.setSoTimeout(0);
            C7094 c7094 = C7094.f17599;
            C2080 c2080 = new C2080(this.f17458);
            C0955 c0955 = this.f17464;
            String str = this.f17457.f17047.f17160.f17226;
            c0955.getClass();
            str.getClass();
            c2080.f3966 = c0955;
            c2080.f3963 = AbstractC7059.f17511 + ' ' + str;
            c2080.f3962 = this;
            c2080.f3964 = c7094;
            C7106 c7106 = new C7106(c2080);
            this.f17468 = c7106;
            C7087 c7087 = C7106.f17644;
            this.f17462 = (c7087.f17569 & 8) != 0 ? c7087.f17568[3] : Integer.MAX_VALUE;
            C7099 c7099 = c7106.f17645;
            synchronized (c7099) {
                try {
                    if (c7099.f17623) {
                        throw new IOException("closed");
                    }
                    Logger logger = C7099.f17621;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(AbstractC7059.m12254(">> CONNECTION " + AbstractC7108.f17681.hex(), new Object[0]));
                    }
                    c7099.f17626.mo12018(AbstractC7108.f17681);
                    c7099.f17626.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            C7099 c70992 = c7106.f17645;
            C7087 c70872 = c7106.f17659;
            c70992.getClass();
            c70872.getClass();
            synchronized (c70992) {
                try {
                    if (c70992.f17623) {
                        throw new IOException("closed");
                    }
                    c70992.m12354(0, Integer.bitCount(c70872.f17569) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & c70872.f17569) == 0) {
                            z = false;
                        }
                        if (z) {
                            c70992.f17626.writeShort(i);
                            c70992.f17626.writeInt(c70872.f17568[i]);
                        }
                    }
                    c70992.f17626.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (c7106.f17659.m12323() != 65535) {
                c7106.f17645.m12360(0, r7 - Opcodes.MAX_VALUE);
            }
            C7064.m12271(c7106.f17666.m12268(), c7106.f17668, c7106.f17648);
        }
    }
}
