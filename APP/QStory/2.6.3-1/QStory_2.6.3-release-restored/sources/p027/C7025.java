package p027;

import androidx.appcompat.app.C0955;
import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.C1868;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.lazy.C1596;
import com.alibaba.fastjson2.AbstractC3738;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5977;
import okhttp3.Protocol;
import p018.C6915;
import p020.C6928;
import p020.C6936;
import p023.C6949;
import p023.C6954;
import p023.C6955;
import p023.C6960;
import p023.C6961;
import p023.C6964;
import p023.C6968;
import p023.C6978;
import p023.C6979;
import p023.C6981;
import p023.C6982;
import p025.AbstractC7012;
import p028.InterfaceC7045;
import p029.AbstractC7054;
import p029.AbstractC7059;
import p031.C7063;
import p033.AbstractC7067;
import p036.C7116;
import p036.C7120;
import p071.C7397;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7025 implements InterfaceC7030, InterfaceC7045 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f17381;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f17382;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f17383;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17384;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7034 f17385;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7063 f17386;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C0955 f17387;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Protocol f17388;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C7036 f17389;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean f17390;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f17391;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Socket f17392;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C6979 f17393;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public volatile boolean f17394;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Socket f17395;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C7032 f17396;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f17397;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final List f17398;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C6954 f17399;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C7035 f17400;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C6949 f17401;

    public C7025(C7063 c7063, C7034 c7034, int i, int i2, int i3, int i4, boolean z, C7032 c7032, C7035 c7035, C6949 c6949, List list, C6954 c6954, int i5, boolean z2) {
        c7063.getClass();
        c7034.getClass();
        c6949.getClass();
        this.f17386 = c7063;
        this.f17385 = c7034;
        this.f17384 = i;
        this.f17383 = i2;
        this.f17382 = i3;
        this.f17381 = i4;
        this.f17397 = z;
        this.f17396 = c7032;
        this.f17400 = c7035;
        this.f17401 = c6949;
        this.f17398 = list;
        this.f17399 = c6954;
        this.f17391 = i5;
        this.f17390 = z2;
    }

    @Override // p027.InterfaceC7030, p028.InterfaceC7045
    public final void cancel() {
        this.f17394 = true;
        Socket socket = this.f17395;
        if (socket != null) {
            AbstractC7059.m12255(socket);
        }
    }

    @Override // p027.InterfaceC7030
    public final boolean isReady() {
        return this.f17388 != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0139  */
    @Override // p027.InterfaceC7030
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7028 mo12179() throws Throwable {
        C7025 c7025M12186;
        C7025 c7025;
        C7034 c7034 = this.f17385;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17396.f17421;
        Socket socket = this.f17395;
        C7025 c70252 = null;
        if (socket == null) {
            C6755.m11869("TCP not connected");
            return null;
        }
        if (isReady()) {
            C6755.m11870("already connected");
            return null;
        }
        C6949 c6949 = this.f17401;
        C6968 c6968 = c6949.f17047;
        InetSocketAddress inetSocketAddress = c6949.f17045;
        C6968 c69682 = c6949.f17047;
        List list = c6968.f17163;
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                if (this.f17399 != null) {
                    C7028 c7028M12189 = m12189();
                    if (c7028M12189.f17404 != null) {
                        copyOnWriteArrayList.remove(this);
                        Socket socket2 = this.f17392;
                        if (socket2 != null) {
                            AbstractC7059.m12255(socket2);
                        }
                        AbstractC7059.m12255(socket);
                        return c7028M12189;
                    }
                }
                if (c69682.f17157 != null) {
                    C0955 c0955 = this.f17387;
                    if (c0955 == null) {
                        AbstractC5227.m9467("socket");
                        throw null;
                    }
                    if (((C6928) c0955.f665).f17016.m12037()) {
                        C0955 c09552 = this.f17387;
                        if (c09552 == null) {
                            AbstractC5227.m9467("socket");
                            throw null;
                        }
                        if (((C6936) c09552.f663).f17031.m12037()) {
                            SSLSocketFactory sSLSocketFactory = c69682.f17157;
                            C6978 c6978 = c69682.f17160;
                            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, c6978.f17226, c6978.f17225, true);
                            socketCreateSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            C7025 c7025M12187 = m12187(list, sSLSocket);
                            C6981 c6981 = (C6981) list.get(c7025M12187.f17391);
                            c7025M12186 = c7025M12187.m12186(list, sSLSocket);
                            try {
                                c6981.m12114(sSLSocket, c7025M12187.f17390);
                                m12188(sSLSocket, c6981);
                                c7025 = c7025M12186;
                            } catch (IOException e) {
                                e = e;
                                inetSocketAddress.getClass();
                                c7034.getClass();
                                if (this.f17397 && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                    c70252 = c7025M12186;
                                }
                                C7028 c7028 = new C7028(this, c70252, e);
                                copyOnWriteArrayList.remove(this);
                                if (!z) {
                                    Socket socket3 = this.f17392;
                                    if (socket3 != null) {
                                        AbstractC7059.m12255(socket3);
                                    }
                                    AbstractC7059.m12255(socket);
                                }
                                return c7028;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.f17392 = socket;
                List list2 = c69682.f17162;
                Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(protocol)) {
                    protocol = Protocol.HTTP_1_1;
                }
                this.f17388 = protocol;
                c7025 = null;
                try {
                    C7063 c7063 = this.f17386;
                    C7034 c70342 = this.f17385;
                    C6949 c69492 = this.f17401;
                    Socket socket4 = this.f17392;
                    socket4.getClass();
                    C6979 c6979 = this.f17393;
                    Protocol protocol2 = this.f17388;
                    protocol2.getClass();
                    C0955 c09553 = this.f17387;
                    if (c09553 == null) {
                        AbstractC5227.m9467("socket");
                        throw null;
                    }
                    c7034.getClass();
                    C7036 c7036 = new C7036(c7063, c70342, c69492, socket, socket4, c6979, protocol2, c09553);
                    this.f17389 = c7036;
                    c7036.m12211();
                    inetSocketAddress.getClass();
                    try {
                        C7028 c70282 = new C7028(this, (Throwable) null, 6);
                        copyOnWriteArrayList.remove(this);
                        return c70282;
                    } catch (IOException e2) {
                        e = e2;
                        c7025M12186 = c7025;
                        z = true;
                        inetSocketAddress.getClass();
                        c7034.getClass();
                        if (this.f17397) {
                            c70252 = c7025M12186;
                        }
                        C7028 c70283 = new C7028(this, c70252, e);
                        copyOnWriteArrayList.remove(this);
                        if (!z) {
                        }
                        return c70283;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        copyOnWriteArrayList.remove(this);
                        if (!z) {
                            Socket socket5 = this.f17392;
                            if (socket5 != null) {
                                AbstractC7059.m12255(socket5);
                            }
                            AbstractC7059.m12255(socket);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    c7025M12186 = c7025;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
            c7025M12186 = null;
        }
    }

    @Override // p027.InterfaceC7030
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7028 mo12181() {
        Socket socket;
        Socket socket2;
        C7034 c7034 = this.f17385;
        C6949 c6949 = this.f17401;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17396.f17421;
        if (this.f17395 != null) {
            C6755.m11870("TCP already connected");
            return null;
        }
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                c6949.f17045.getClass();
                c7034.getClass();
                m12184();
                z = true;
                C7028 c7028 = new C7028(this, (Throwable) null, 6);
                copyOnWriteArrayList.remove(this);
                return c7028;
            } catch (IOException e) {
                C6968 c6968 = c6949.f17047;
                if (c6949.f17046.type() != Proxy.Type.DIRECT) {
                    C6968 c69682 = c6949.f17047;
                    c69682.f17161.connectFailed(c69682.f17160.m12104(), c6949.f17046.address(), e);
                }
                c6949.f17045.getClass();
                c7034.getClass();
                C7028 c70282 = new C7028(this, e, 2);
                copyOnWriteArrayList.remove(this);
                if (!z && (socket2 = this.f17395) != null) {
                    AbstractC7059.m12255(socket2);
                }
                return c70282;
            }
        } catch (Throwable th) {
            copyOnWriteArrayList.remove(this);
            if (!z && (socket = this.f17395) != null) {
                AbstractC7059.m12255(socket);
            }
            throw th;
        }
    }

    @Override // p027.InterfaceC7030
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7036 mo12182() {
        C6686 c6686 = this.f17396.f17432.f17066;
        C6949 c6949 = this.f17401;
        synchronized (c6686) {
            c6949.getClass();
            ((LinkedHashSet) c6686.f16359).remove(c6949);
        }
        C7036 c7036 = this.f17389;
        c7036.getClass();
        this.f17401.getClass();
        C7029 c7029M12202 = this.f17400.m12202(this, this.f17398);
        if (c7029M12202 != null) {
            return c7029M12202.f17407;
        }
        synchronized (c7036) {
            C7034 c7034 = this.f17385;
            c7034.getClass();
            TimeZone timeZone = AbstractC7059.f17512;
            c7034.f17434.add(c7036);
            c7034.f17436.m12274(c7034.f17435, 0L);
            this.f17396.m12196(c7036);
        }
        return c7036;
    }

    @Override // p027.InterfaceC7030
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7030 mo12183() {
        return new C7025(this.f17386, this.f17385, this.f17384, this.f17383, this.f17382, this.f17381, this.f17397, this.f17396, this.f17400, this.f17401, this.f17398, this.f17399, this.f17391, this.f17390);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12184() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.f17401.f17046.type();
        int i = type == null ? -1 : AbstractC7026.f17402[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.f17401.f17047.f17158.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.f17401.f17046);
        }
        this.f17395 = socketCreateSocket;
        if (this.f17394) {
            C6755.m11866("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f17381);
        try {
            AbstractC7067 abstractC7067 = AbstractC7067.f17543;
            AbstractC7067.f17543.mo12277(socketCreateSocket, this.f17401.f17045, this.f17382);
            try {
                this.f17387 = new C0955(new C1171(socketCreateSocket));
            } catch (NullPointerException e) {
                if (AbstractC5227.m9466(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f17401.f17045);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    @Override // p028.InterfaceC7045
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C6949 mo12185() {
        return this.f17401;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C7025 m12186(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        list.getClass();
        int i = this.f17391;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            C6981 c6981 = (C6981) list.get(i2);
            c6981.getClass();
            if (c6981.f17246 && (((strArr = c6981.f17243) == null || AbstractC7054.m12236(strArr, sSLSocket.getEnabledProtocols(), C7397.f18282)) && ((strArr2 = c6981.f17244) == null || AbstractC7054.m12236(strArr2, sSLSocket.getEnabledCipherSuites(), C6982.f17250)))) {
                return new C7025(this.f17386, this.f17385, this.f17384, this.f17383, this.f17382, this.f17381, this.f17397, this.f17396, this.f17400, this.f17401, this.f17398, this.f17399, i2, i != -1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C7025 m12187(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        list.getClass();
        if (this.f17391 != -1) {
            return this;
        }
        C7025 c7025M12186 = m12186(list, sSLSocket);
        if (c7025M12186 != null) {
            return c7025M12186;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f17390);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m12188(SSLSocket sSLSocket, C6981 c6981) {
        String strMo12276;
        Protocol protocolM12075;
        C6968 c6968 = this.f17401.f17047;
        try {
            if (c6981.f17245) {
                AbstractC7067 abstractC7067 = AbstractC7067.f17543;
                AbstractC7067.f17543.mo12278(sSLSocket, c6968.f17160.f17226, c6968.f17162);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            C6979 c6979M6874 = AbstractC3738.m6874(session);
            HostnameVerifier hostnameVerifier = c6968.f17156;
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(c6968.f17160.f17226, session)) {
                C6964 c6964 = c6968.f17155;
                c6964.getClass();
                C6979 c6979 = new C6979(c6979M6874.f17236, c6979M6874.f17235, c6979M6874.f17234, new C1596(c6964, c6979M6874, c6968, 9));
                this.f17393 = c6979;
                c6964.m12083(c6968.f17160.f17226, new C1868(c6979, 25));
                if (c6981.f17245) {
                    AbstractC7067 abstractC70672 = AbstractC7067.f17543;
                    strMo12276 = AbstractC7067.f17543.mo12276(sSLSocket);
                } else {
                    strMo12276 = null;
                }
                this.f17392 = sSLSocket;
                this.f17387 = new C0955(new C1171(sSLSocket));
                if (strMo12276 != null) {
                    Protocol.Companion.getClass();
                    protocolM12075 = C6955.m12075(strMo12276);
                } else {
                    protocolM12075 = Protocol.HTTP_1_1;
                }
                this.f17388 = protocolM12075;
                AbstractC7067 abstractC70673 = AbstractC7067.f17543;
                AbstractC7067.f17543.getClass();
                return;
            }
            List listM12106 = c6979M6874.m12106();
            if (listM12106.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + c6968.f17160.f17226 + " not verified (no certificates)");
            }
            Object obj = listM12106.get(0);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(c6968.f17160.f17226);
            sb.append(" not verified:\n            |    certificate: ");
            C6964 c69642 = C6964.f17135;
            sb.append(AbstractC1298.m1715(x509Certificate));
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(AbstractC5176.m9352(C6915.m12001(x509Certificate, 2), C6915.m12001(x509Certificate, 7)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(AbstractC5977.m10736(sb.toString()));
        } catch (Throwable th) {
            AbstractC7067 abstractC70674 = AbstractC7067.f17543;
            AbstractC7067.f17543.getClass();
            AbstractC7059.m12255(sSLSocket);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C7028 m12189() throws IOException {
        C6954 c6954 = this.f17399;
        c6954.getClass();
        C6949 c6949 = this.f17401;
        String str = "CONNECT " + AbstractC7059.m12261(c6949.f17047.f17160, true) + " HTTP/1.1";
        C0955 c0955 = this.f17387;
        if (c0955 == null) {
            AbstractC5227.m9467("socket");
            throw null;
        }
        C7120 c7120 = new C7120(null, this, c0955);
        C0955 c09552 = this.f17387;
        if (c09552 == null) {
            AbstractC5227.m9467("socket");
            throw null;
        }
        ((C6928) c09552.f665).f17018.mo11492().mo12014(this.f17384);
        C0955 c09553 = this.f17387;
        if (c09553 == null) {
            AbstractC5227.m9467("socket");
            throw null;
        }
        ((C6936) c09553.f663).f17033.mo11493().mo12014(this.f17383);
        c7120.m12378(c6954.f17059, str);
        c7120.mo12223();
        C6961 c6961Mo12221 = c7120.mo12221(false);
        c6961Mo12221.getClass();
        c6961Mo12221.f17124 = c6954;
        C6960 c6960M12081 = c6961Mo12221.m12081();
        int i = c6960M12081.f17111;
        long jM12253 = AbstractC7059.m12253(c6960M12081);
        if (jM12253 != -1) {
            C7116 c7116M12377 = c7120.m12377(c6960M12081.f17118.f17061, jM12253);
            AbstractC7059.m12259(c7116M12377, Integer.MAX_VALUE);
            c7116M12377.close();
        }
        if (i == 200) {
            return new C7028(this, (Throwable) null, 6);
        }
        if (i != 407) {
            C6755.m11866(AbstractC7012.m12147(i, "Unexpected response code for CONNECT: "));
            return null;
        }
        c6949.f17047.f17154.getClass();
        C6755.m11866("Failed to authenticate with proxy");
        return null;
    }

    @Override // p028.InterfaceC7045
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo12180() {
    }

    @Override // p028.InterfaceC7045
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo12178(C7032 c7032, IOException iOException) {
    }
}
