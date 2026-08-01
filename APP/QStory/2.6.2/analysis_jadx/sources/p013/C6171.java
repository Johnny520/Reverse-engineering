package p013;

import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.C1030;
import androidx.compose.foundation.lazy.C0755;
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
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5144;
import okhttp3.Protocol;
import p003.C6095;
import p005.C6108;
import p005.C6116;
import p007.AbstractC6136;
import p012.C6164;
import p015.C6193;
import p015.C6198;
import p015.C6199;
import p015.C6204;
import p015.C6205;
import p015.C6208;
import p015.C6212;
import p015.C6223;
import p015.C6225;
import p015.C6226;
import p017.AbstractC6233;
import p017.AbstractC6238;
import p019.AbstractC6241;
import p020.C6248;
import p020.C6252;
import p021.InterfaceC6254;
import p033.AbstractC6325;
import p055.C6567;
import p175.AbstractC7738;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6171 implements InterfaceC6174, InterfaceC6254 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f16832;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f16833;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f16834;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f16835;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6182 f16836;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6164 f16837;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C0108 f16838;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Protocol f16839;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C6181 f16840;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean f16841;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f16842;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Socket f16843;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C6223 f16844;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public volatile boolean f16845;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Socket f16846;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6177 f16847;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f16848;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final List f16849;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C6198 f16850;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C6179 f16851;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C6193 f16852;

    public C6171(C6164 c6164, C6182 c6182, int i, int i2, int i3, int i4, boolean z, C6177 c6177, C6179 c6179, C6193 c6193, List list, C6198 c6198, int i5, boolean z2) {
        c6164.getClass();
        c6182.getClass();
        c6193.getClass();
        this.f16837 = c6164;
        this.f16836 = c6182;
        this.f16835 = i;
        this.f16834 = i2;
        this.f16833 = i3;
        this.f16832 = i4;
        this.f16848 = z;
        this.f16847 = c6177;
        this.f16851 = c6179;
        this.f16852 = c6193;
        this.f16849 = list;
        this.f16850 = c6198;
        this.f16842 = i5;
        this.f16841 = z2;
    }

    @Override // p013.InterfaceC6174, p021.InterfaceC6254
    public final void cancel() {
        this.f16845 = true;
        Socket socket = this.f16846;
        if (socket != null) {
            AbstractC6238.m11704(socket);
        }
    }

    @Override // p013.InterfaceC6174
    public final boolean isReady() {
        return this.f16839 != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0139  */
    @Override // p013.InterfaceC6174
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p013.C6175 mo11600() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p013.C6171.mo11600():飘花落叶言世兰楪哲苏子.飘花落叶言子楪兰世苏哲");
    }

    @Override // p013.InterfaceC6174
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6175 mo11603() {
        Socket socket;
        Socket socket2;
        C6182 c6182 = this.f16836;
        C6193 c6193 = this.f16852;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16847.f16871;
        if (this.f16846 != null) {
            C5919.m11250("TCP already connected");
            return null;
        }
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                c6193.f16939.getClass();
                c6182.getClass();
                m11606();
                z = true;
                C6175 c6175 = new C6175(this, (Throwable) null, 6);
                copyOnWriteArrayList.remove(this);
                return c6175;
            } catch (IOException e) {
                C6212 c6212 = c6193.f16941;
                if (c6193.f16940.type() != Proxy.Type.DIRECT) {
                    C6212 c62122 = c6193.f16941;
                    c62122.f17055.connectFailed(c62122.f17054.m11674(), c6193.f16940.address(), e);
                }
                c6193.f16939.getClass();
                c6182.getClass();
                C6175 c61752 = new C6175(this, e, 2);
                copyOnWriteArrayList.remove(this);
                if (!z && (socket2 = this.f16846) != null) {
                    AbstractC6238.m11704(socket2);
                }
                return c61752;
            }
        } catch (Throwable th) {
            copyOnWriteArrayList.remove(this);
            if (!z && (socket = this.f16846) != null) {
                AbstractC6238.m11704(socket);
            }
            throw th;
        }
    }

    @Override // p013.InterfaceC6174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6181 mo11604() {
        C5851 c5851 = this.f16847.f16882.f16960;
        C6193 c6193 = this.f16852;
        synchronized (c5851) {
            c6193.getClass();
            ((LinkedHashSet) c5851.f16007).remove(c6193);
        }
        C6181 c6181 = this.f16840;
        c6181.getClass();
        this.f16852.getClass();
        C6180 c6180M11623 = this.f16851.m11623(this, this.f16849);
        if (c6180M11623 != null) {
            return c6180M11623.f16900;
        }
        synchronized (c6181) {
            C6182 c6182 = this.f16836;
            c6182.getClass();
            TimeZone timeZone = AbstractC6238.f17190;
            c6182.f16917.add(c6181);
            c6182.f16919.m11593(c6182.f16918, 0L);
            this.f16847.m11618(c6181);
        }
        return c6181;
    }

    @Override // p013.InterfaceC6174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6174 mo11605() {
        return new C6171(this.f16837, this.f16836, this.f16835, this.f16834, this.f16833, this.f16832, this.f16848, this.f16847, this.f16851, this.f16852, this.f16849, this.f16850, this.f16842, this.f16841);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11606() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.f16852.f16940.type();
        int i = type == null ? -1 : AbstractC6172.f16853[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.f16852.f16941.f17052.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.f16852.f16940);
        }
        this.f16846 = socketCreateSocket;
        if (this.f16845) {
            C5919.m11246("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f16832);
        try {
            AbstractC6241 abstractC6241 = AbstractC6241.f17194;
            AbstractC6241.f17194.mo11716(socketCreateSocket, this.f16852.f16939, this.f16833);
            try {
                this.f16838 = new C0108(new C0325(socketCreateSocket));
            } catch (NullPointerException e) {
                if (AbstractC4394.m8917(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f16852.f16939);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    @Override // p021.InterfaceC6254
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C6193 mo11607() {
        return this.f16852;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C6171 m11608(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        list.getClass();
        int i = this.f16842;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            C6225 c6225 = (C6225) list.get(i2);
            c6225.getClass();
            if (c6225.f17140 && (((strArr = c6225.f17137) == null || AbstractC6233.m11687(strArr, sSLSocket.getEnabledProtocols(), C6567.f17942)) && ((strArr2 = c6225.f17138) == null || AbstractC6233.m11687(strArr2, sSLSocket.getEnabledCipherSuites(), C6226.f17144)))) {
                return new C6171(this.f16837, this.f16836, this.f16835, this.f16834, this.f16833, this.f16832, this.f16848, this.f16847, this.f16851, this.f16852, this.f16849, this.f16850, i2, i != -1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C6171 m11609(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        list.getClass();
        if (this.f16842 != -1) {
            return this;
        }
        C6171 c6171M11608 = m11608(list, sSLSocket);
        if (c6171M11608 != null) {
            return c6171M11608;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f16841);
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
    public final void m11610(SSLSocket sSLSocket, C6225 c6225) {
        String strMo11715;
        Protocol protocolM11645;
        C6212 c6212 = this.f16852.f16941;
        try {
            if (c6225.f17139) {
                AbstractC6241 abstractC6241 = AbstractC6241.f17194;
                AbstractC6241.f17194.mo11717(sSLSocket, c6212.f17054.f17120, c6212.f17056);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            C6223 c6223M13050 = AbstractC7738.m13050(session);
            HostnameVerifier hostnameVerifier = c6212.f17050;
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(c6212.f17054.f17120, session)) {
                C6208 c6208 = c6212.f17049;
                c6208.getClass();
                C6223 c6223 = new C6223(c6223M13050.f17130, c6223M13050.f17129, c6223M13050.f17128, new C0755(c6208, c6223M13050, c6212, 8));
                this.f16844 = c6223;
                c6208.m11653(c6212.f17054.f17120, new C1030(c6223, 25));
                if (c6225.f17139) {
                    AbstractC6241 abstractC62412 = AbstractC6241.f17194;
                    strMo11715 = AbstractC6241.f17194.mo11715(sSLSocket);
                } else {
                    strMo11715 = null;
                }
                this.f16843 = sSLSocket;
                this.f16838 = new C0108(new C0325(sSLSocket));
                if (strMo11715 != null) {
                    Protocol.Companion.getClass();
                    protocolM11645 = C6199.m11645(strMo11715);
                } else {
                    protocolM11645 = Protocol.HTTP_1_1;
                }
                this.f16839 = protocolM11645;
                AbstractC6241 abstractC62413 = AbstractC6241.f17194;
                AbstractC6241.f17194.getClass();
                return;
            }
            List listM11676 = c6223M13050.m11676();
            if (listM11676.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + c6212.f17054.f17120 + " not verified (no certificates)");
            }
            Object obj = listM11676.get(0);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(c6212.f17054.f17120);
            sb.append(" not verified:\n            |    certificate: ");
            C6208 c62082 = C6208.f17029;
            sb.append(AbstractC6325.m11853(x509Certificate));
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(AbstractC4343.m8825(C6095.m11450(x509Certificate, 2), C6095.m11450(x509Certificate, 7)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(AbstractC5144.m10173(sb.toString()));
        } catch (Throwable th) {
            AbstractC6241 abstractC62414 = AbstractC6241.f17194;
            AbstractC6241.f17194.getClass();
            AbstractC6238.m11704(sSLSocket);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C6175 m11611() throws IOException {
        C6198 c6198 = this.f16850;
        c6198.getClass();
        C6193 c6193 = this.f16852;
        String str = "CONNECT " + AbstractC6238.m11710(c6193.f16941.f17054, true) + " HTTP/1.1";
        C0108 c0108 = this.f16838;
        if (c0108 == null) {
            AbstractC4394.m8918("socket");
            throw null;
        }
        C6252 c6252 = new C6252(null, this, c0108);
        C0108 c01082 = this.f16838;
        if (c01082 == null) {
            AbstractC4394.m8918("socket");
            throw null;
        }
        ((C6108) c01082.f320).f16683.mo10875().mo11462(this.f16835);
        C0108 c01083 = this.f16838;
        if (c01083 == null) {
            AbstractC4394.m8918("socket");
            throw null;
        }
        ((C6116) c01083.f318).f16698.mo10878().mo11462(this.f16834);
        c6252.m11736(c6198.f16953, str);
        c6252.mo11731();
        C6205 c6205Mo11727 = c6252.mo11727(false);
        c6205Mo11727.getClass();
        c6205Mo11727.f17018 = c6198;
        C6204 c6204M11651 = c6205Mo11727.m11651();
        int i = c6204M11651.f17005;
        long jM11702 = AbstractC6238.m11702(c6204M11651);
        if (jM11702 != -1) {
            C6248 c6248M11735 = c6252.m11735(c6204M11651.f17012.f16955, jM11702);
            AbstractC6238.m11708(c6248M11735, Integer.MAX_VALUE);
            c6248M11735.close();
        }
        if (i == 200) {
            return new C6175(this, (Throwable) null, 6);
        }
        if (i != 407) {
            C5919.m11246(AbstractC6136.m11556(i, "Unexpected response code for CONNECT: "));
            return null;
        }
        c6193.f16941.f17048.getClass();
        C5919.m11246("Failed to authenticate with proxy");
        return null;
    }

    @Override // p021.InterfaceC6254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo11602() {
    }

    @Override // p021.InterfaceC6254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo11601(C6177 c6177, IOException iOException) {
    }
}
