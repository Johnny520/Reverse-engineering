package p011;

import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.C1030;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.lazy.C0755;
import com.alibaba.fastjson2.AbstractC2905;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5145;
import okhttp3.Protocol;
import p002.C6086;
import p004.C6099;
import p004.C6107;
import p007.C6120;
import p007.C6125;
import p007.C6126;
import p007.C6131;
import p007.C6132;
import p007.C6135;
import p007.C6139;
import p007.C6150;
import p007.C6152;
import p007.C6153;
import p009.AbstractC6183;
import p012.InterfaceC6216;
import p013.AbstractC6225;
import p013.AbstractC6230;
import p015.C6234;
import p017.AbstractC6238;
import p020.C6287;
import p020.C6291;
import p055.C6568;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6196 implements InterfaceC6201, InterfaceC6216 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f17036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f17037;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f17038;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17039;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6205 f17040;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6234 f17041;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C0108 f17042;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Protocol f17043;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C6207 f17044;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean f17045;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f17046;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Socket f17047;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C6150 f17048;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public volatile boolean f17049;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Socket f17050;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6203 f17051;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f17052;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final List f17053;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C6125 f17054;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C6206 f17055;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C6120 f17056;

    public C6196(C6234 c6234, C6205 c6205, int i, int i2, int i3, int i4, boolean z, C6203 c6203, C6206 c6206, C6120 c6120, List list, C6125 c6125, int i5, boolean z2) {
        c6234.getClass();
        c6205.getClass();
        c6120.getClass();
        this.f17041 = c6234;
        this.f17040 = c6205;
        this.f17039 = i;
        this.f17038 = i2;
        this.f17037 = i3;
        this.f17036 = i4;
        this.f17052 = z;
        this.f17051 = c6203;
        this.f17055 = c6206;
        this.f17056 = c6120;
        this.f17053 = list;
        this.f17054 = c6125;
        this.f17046 = i5;
        this.f17045 = z2;
    }

    @Override // p011.InterfaceC6201, p012.InterfaceC6216
    public final void cancel() {
        this.f17049 = true;
        Socket socket = this.f17050;
        if (socket != null) {
            AbstractC6230.m11696(socket);
        }
    }

    @Override // p011.InterfaceC6201
    public final boolean isReady() {
        return this.f17043 != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0139  */
    @Override // p011.InterfaceC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p011.C6199 mo11620() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p011.C6196.mo11620():飘花落叶言世兰楪哲子苏.飘花落叶言子楪兰世哲苏");
    }

    @Override // p011.InterfaceC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6199 mo11622() {
        Socket socket;
        Socket socket2;
        C6205 c6205 = this.f17040;
        C6120 c6120 = this.f17056;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17051.f17076;
        if (this.f17050 != null) {
            C5925.m11311("TCP already connected");
            return null;
        }
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                c6120.f16700.getClass();
                c6205.getClass();
                m11625();
                z = true;
                C6199 c6199 = new C6199(this, (Throwable) null, 6);
                copyOnWriteArrayList.remove(this);
                return c6199;
            } catch (IOException e) {
                C6139 c6139 = c6120.f16702;
                if (c6120.f16701.type() != Proxy.Type.DIRECT) {
                    C6139 c61392 = c6120.f16702;
                    c61392.f16816.connectFailed(c61392.f16815.m11545(), c6120.f16701.address(), e);
                }
                c6120.f16700.getClass();
                c6205.getClass();
                C6199 c61992 = new C6199(this, e, 2);
                copyOnWriteArrayList.remove(this);
                if (!z && (socket2 = this.f17050) != null) {
                    AbstractC6230.m11696(socket2);
                }
                return c61992;
            }
        } catch (Throwable th) {
            copyOnWriteArrayList.remove(this);
            if (!z && (socket = this.f17050) != null) {
                AbstractC6230.m11696(socket);
            }
            throw th;
        }
    }

    @Override // p011.InterfaceC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6207 mo11623() {
        C5856 c5856 = this.f17051.f17087.f16721;
        C6120 c6120 = this.f17056;
        synchronized (c5856) {
            c6120.getClass();
            ((LinkedHashSet) c5856.f16014).remove(c6120);
        }
        C6207 c6207 = this.f17044;
        c6207.getClass();
        this.f17056.getClass();
        C6200 c6200M11643 = this.f17055.m11643(this, this.f17053);
        if (c6200M11643 != null) {
            return c6200M11643.f17062;
        }
        synchronized (c6207) {
            C6205 c6205 = this.f17040;
            c6205.getClass();
            TimeZone timeZone = AbstractC6230.f17167;
            c6205.f17089.add(c6207);
            c6205.f17091.m11715(c6205.f17090, 0L);
            this.f17051.m11637(c6207);
        }
        return c6207;
    }

    @Override // p011.InterfaceC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6201 mo11624() {
        return new C6196(this.f17041, this.f17040, this.f17039, this.f17038, this.f17037, this.f17036, this.f17052, this.f17051, this.f17055, this.f17056, this.f17053, this.f17054, this.f17046, this.f17045);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11625() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.f17056.f16701.type();
        int i = type == null ? -1 : AbstractC6197.f17057[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.f17056.f16702.f16813.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.f17056.f16701);
        }
        this.f17050 = socketCreateSocket;
        if (this.f17049) {
            C5925.m11307("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f17036);
        try {
            AbstractC6238 abstractC6238 = AbstractC6238.f17198;
            AbstractC6238.f17198.mo11718(socketCreateSocket, this.f17056.f16700, this.f17037);
            try {
                this.f17042 = new C0108(new C0325(socketCreateSocket));
            } catch (NullPointerException e) {
                if (AbstractC4395.m8907(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f17056.f16700);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    @Override // p012.InterfaceC6216
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C6120 mo11626() {
        return this.f17056;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C6196 m11627(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        list.getClass();
        int i = this.f17046;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            C6152 c6152 = (C6152) list.get(i2);
            c6152.getClass();
            if (c6152.f16901 && (((strArr = c6152.f16898) == null || AbstractC6225.m11677(strArr, sSLSocket.getEnabledProtocols(), C6568.f17937)) && ((strArr2 = c6152.f16899) == null || AbstractC6225.m11677(strArr2, sSLSocket.getEnabledCipherSuites(), C6153.f16905)))) {
                return new C6196(this.f17041, this.f17040, this.f17039, this.f17038, this.f17037, this.f17036, this.f17052, this.f17051, this.f17055, this.f17056, this.f17053, this.f17054, i2, i != -1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C6196 m11628(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        list.getClass();
        if (this.f17046 != -1) {
            return this;
        }
        C6196 c6196M11627 = m11627(list, sSLSocket);
        if (c6196M11627 != null) {
            return c6196M11627;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f17045);
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
    public final void m11629(SSLSocket sSLSocket, C6152 c6152) {
        String strMo11717;
        Protocol protocolM11516;
        C6139 c6139 = this.f17056.f16702;
        try {
            if (c6152.f16900) {
                AbstractC6238 abstractC6238 = AbstractC6238.f17198;
                AbstractC6238.f17198.mo11719(sSLSocket, c6139.f16815.f16881, c6139.f16817);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            C6150 c6150M6314 = AbstractC2905.m6314(session);
            HostnameVerifier hostnameVerifier = c6139.f16811;
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(c6139.f16815.f16881, session)) {
                C6135 c6135 = c6139.f16810;
                c6135.getClass();
                C6150 c6150 = new C6150(c6150M6314.f16891, c6150M6314.f16890, c6150M6314.f16889, new C0755(c6135, c6150M6314, c6139, 9));
                this.f17048 = c6150;
                c6135.m11524(c6139.f16815.f16881, new C1030(c6150, 25));
                if (c6152.f16900) {
                    AbstractC6238 abstractC62382 = AbstractC6238.f17198;
                    strMo11717 = AbstractC6238.f17198.mo11717(sSLSocket);
                } else {
                    strMo11717 = null;
                }
                this.f17047 = sSLSocket;
                this.f17042 = new C0108(new C0325(sSLSocket));
                if (strMo11717 != null) {
                    Protocol.Companion.getClass();
                    protocolM11516 = C6126.m11516(strMo11717);
                } else {
                    protocolM11516 = Protocol.HTTP_1_1;
                }
                this.f17043 = protocolM11516;
                AbstractC6238 abstractC62383 = AbstractC6238.f17198;
                AbstractC6238.f17198.getClass();
                return;
            }
            List listM11547 = c6150M6314.m11547();
            if (listM11547.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + c6139.f16815.f16881 + " not verified (no certificates)");
            }
            Object obj = listM11547.get(0);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(c6139.f16815.f16881);
            sb.append(" not verified:\n            |    certificate: ");
            C6135 c61352 = C6135.f16790;
            sb.append(AbstractC0455.m1155(x509Certificate));
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(AbstractC4344.m8793(C6086.m11442(x509Certificate, 2), C6086.m11442(x509Certificate, 7)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(AbstractC5145.m10177(sb.toString()));
        } catch (Throwable th) {
            AbstractC6238 abstractC62384 = AbstractC6238.f17198;
            AbstractC6238.f17198.getClass();
            AbstractC6230.m11696(sSLSocket);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C6199 m11630() throws IOException {
        C6125 c6125 = this.f17054;
        c6125.getClass();
        C6120 c6120 = this.f17056;
        String str = "CONNECT " + AbstractC6230.m11702(c6120.f16702.f16815, true) + " HTTP/1.1";
        C0108 c0108 = this.f17042;
        if (c0108 == null) {
            AbstractC4395.m8908("socket");
            throw null;
        }
        C6291 c6291 = new C6291(null, this, c0108);
        C0108 c01082 = this.f17042;
        if (c01082 == null) {
            AbstractC4395.m8908("socket");
            throw null;
        }
        ((C6099) c01082.f320).f16673.mo10933().mo11455(this.f17039);
        C0108 c01083 = this.f17042;
        if (c01083 == null) {
            AbstractC4395.m8908("socket");
            throw null;
        }
        ((C6107) c01083.f318).f16688.mo10934().mo11455(this.f17038);
        c6291.m11819(c6125.f16714, str);
        c6291.mo11664();
        C6132 c6132Mo11662 = c6291.mo11662(false);
        c6132Mo11662.getClass();
        c6132Mo11662.f16779 = c6125;
        C6131 c6131M11522 = c6132Mo11662.m11522();
        int i = c6131M11522.f16766;
        long jM11694 = AbstractC6230.m11694(c6131M11522);
        if (jM11694 != -1) {
            C6287 c6287M11818 = c6291.m11818(c6131M11522.f16773.f16716, jM11694);
            AbstractC6230.m11700(c6287M11818, Integer.MAX_VALUE);
            c6287M11818.close();
        }
        if (i == 200) {
            return new C6199(this, (Throwable) null, 6);
        }
        if (i != 407) {
            C5925.m11307(AbstractC6183.m11588(i, "Unexpected response code for CONNECT: "));
            return null;
        }
        c6120.f16702.f16809.getClass();
        C5925.m11307("Failed to authenticate with proxy");
        return null;
    }

    @Override // p012.InterfaceC6216
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo11621() {
    }

    @Override // p012.InterfaceC6216
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo11619(C6203 c6203, IOException iOException) {
    }
}
