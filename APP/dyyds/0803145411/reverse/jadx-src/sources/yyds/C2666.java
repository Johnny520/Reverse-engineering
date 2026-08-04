package yyds;

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
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: yyds.ᲈᛵᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2666 implements InterfaceC2144, InterfaceC1604 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final int f13082;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C2729 f13083;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final C2098 f13084;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C1864 f13085;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f13086;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0105 f13087;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public EnumC0940 f13088;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final boolean f13089;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public Socket f13090;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2142 f13091;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public Socket f13092;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean f13093;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public C2723 f13094;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public C0644 f13095;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final List f13096;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final int f13097;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C1369 f13098;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public C2126 f13099;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f13100;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public volatile boolean f13101;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f13102;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f13103;

    public C2666(C0105 c0105, C2142 c2142, int i, int i2, int i3, int i4, boolean z, C2729 c2729, C1864 c1864, C1369 c1369, List list, int i5, C2098 c2098, int i6, boolean z2) {
        this.f13087 = c0105;
        this.f13091 = c2142;
        this.f13100 = i;
        this.f13103 = i2;
        this.f13086 = i3;
        this.f13102 = i4;
        this.f13093 = z;
        this.f13083 = c2729;
        this.f13085 = c1864;
        this.f13098 = c1369;
        this.f13096 = list;
        this.f13097 = i5;
        this.f13084 = c2098;
        this.f13082 = i6;
        this.f13089 = z2;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static C2666 m4754(C2666 c2666, int i, C2098 c2098, int i2, boolean z, int i3) {
        return new C2666(c2666.f13087, c2666.f13091, c2666.f13100, c2666.f13103, c2666.f13086, c2666.f13102, c2666.f13093, c2666.f13083, c2666.f13085, c2666.f13098, c2666.f13096, (i3 & 1) != 0 ? c2666.f13097 : i, (i3 & 2) != 0 ? c2666.f13084 : c2098, (i3 & 4) != 0 ? c2666.f13082 : i2, (i3 & 8) != 0 ? c2666.f13089 : z);
    }

    @Override // yyds.InterfaceC2144
    public final void cancel() {
        this.f13101 = true;
        Socket socket = this.f13092;
        if (socket != null) {
            AbstractC0795.m1808(socket);
        }
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final C2666 m4755(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        if (this.f13082 != -1) {
            return this;
        }
        C2666 c2666M4756 = m4756(list, sSLSocket);
        if (c2666M4756 != null) {
            return c2666M4756;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f13089);
        sb.append(", modes=");
        sb.append(list);
        String string = Arrays.toString(sSLSocket.getEnabledProtocols());
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // yyds.InterfaceC1604
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final void mo3290() {
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final C2666 m4756(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        int i = this.f13082;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            C2640 c2640 = (C2640) list.get(i2);
            if (c2640.f13020 && (((strArr = c2640.f13023) == null || AbstractC1429.m2916(strArr, sSLSocket.getEnabledProtocols(), C2055.f10194)) && ((strArr2 = c2640.f13022) == null || AbstractC1429.m2916(strArr2, sSLSocket.getEnabledCipherSuites(), C1248.f5728)))) {
                return m4754(this, 0, null, i2, i != -1, 3);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m4757() throws IOException {
        Proxy.Type type = this.f13098.f6394.type();
        int i = type == null ? -1 : AbstractC0283.f1528[type.ordinal()];
        Socket socketCreateSocket = (i == 1 || i == 2) ? this.f13098.f6393.f8238.createSocket() : new Socket(this.f13098.f6394);
        this.f13092 = socketCreateSocket;
        if (this.f13101) {
            C0188.m804("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f13102);
        try {
            C1966 c1966 = AbstractC1325.f6087;
            C1966 c19662 = AbstractC1325.f6087;
            InetSocketAddress inetSocketAddress = this.f13098.f6395;
            int i2 = this.f13086;
            c19662.getClass();
            socketCreateSocket.connect(inetSocketAddress, i2);
            try {
                this.f13095 = new C0644(new C0299(socketCreateSocket));
            } catch (NullPointerException e) {
                if (AbstractC1544.m3188(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f13098.f6395);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    @Override // yyds.InterfaceC2144
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final boolean mo2227() {
        return this.f13088 != null;
    }

    @Override // yyds.InterfaceC2144
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final InterfaceC2144 mo2228() {
        return new C2666(this.f13087, this.f13091, this.f13100, this.f13103, this.f13086, this.f13102, this.f13093, this.f13083, this.f13085, this.f13098, this.f13096, this.f13097, this.f13084, this.f13082, this.f13089);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x013d  */
    @Override // yyds.InterfaceC2144
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2695 mo2229() throws Throwable {
        C2666 c2666M4756;
        C2666 c2666;
        Socket socket = this.f13092;
        C2666 c26662 = null;
        if (socket == null) {
            C0188.m798("TCP not connected");
            return null;
        }
        if (mo2227()) {
            C0188.m800("already connected");
            return null;
        }
        List list = this.f13098.f6393.f8240;
        this.f13083.f13418.add(this);
        boolean z = false;
        try {
            try {
                if (this.f13084 != null) {
                    C2695 c2695M4758 = m4758();
                    if (c2695M4758.f13245 != null || c2695M4758.f13246 != null) {
                        this.f13083.f13418.remove(this);
                        Socket socket2 = this.f13090;
                        if (socket2 != null) {
                            AbstractC0795.m1808(socket2);
                        }
                        AbstractC0795.m1808(socket);
                        return c2695M4758;
                    }
                }
                C1618 c1618 = this.f13098.f6393;
                if (c1618.f8241 != null) {
                    C0644 c0644 = this.f13095;
                    if (c0644 == null) {
                        c0644 = null;
                    }
                    if (((C2066) c0644.f3102).f10220.m3021()) {
                        C0644 c06442 = this.f13095;
                        if (c06442 == null) {
                            c06442 = null;
                        }
                        if (((C2776) c06442.f3101).f13530.m3021()) {
                            this.f13083.f13425.getClass();
                            C1618 c16182 = this.f13098.f6393;
                            SSLSocketFactory sSLSocketFactory = c16182.f8241;
                            C0082 c0082 = c16182.f8234;
                            SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, c0082.f670, c0082.f664, true);
                            C2666 c2666M4755 = m4755(list, sSLSocket);
                            C2640 c2640 = (C2640) list.get(c2666M4755.f13082);
                            c2666M4756 = c2666M4755.m4756(list, sSLSocket);
                            try {
                                c2640.m4745(sSLSocket, c2666M4755.f13089);
                                m4759(sSLSocket, c2640);
                                this.f13083.f13425.getClass();
                                c2666 = c2666M4756;
                            } catch (IOException e) {
                                e = e;
                                AbstractC2740 abstractC2740 = this.f13083.f13425;
                                InetSocketAddress inetSocketAddress = this.f13098.f6395;
                                abstractC2740.getClass();
                                if (this.f13093 && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                    c26662 = c2666M4756;
                                }
                                C2695 c2695 = new C2695(this, c26662, e);
                                this.f13083.f13418.remove(this);
                                if (!z) {
                                    Socket socket3 = this.f13090;
                                    if (socket3 != null) {
                                        AbstractC0795.m1808(socket3);
                                    }
                                    AbstractC0795.m1808(socket);
                                }
                                return c2695;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.f13090 = socket;
                List list2 = c1618.f8235;
                EnumC0940 enumC0940 = EnumC0940.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(enumC0940)) {
                    enumC0940 = EnumC0940.HTTP_1_1;
                }
                this.f13088 = enumC0940;
                c2666 = null;
                try {
                    C0105 c0105 = this.f13087;
                    C1369 c1369 = this.f13098;
                    Socket socket4 = this.f13090;
                    C2126 c2126 = this.f13099;
                    EnumC0940 enumC09402 = this.f13088;
                    C0644 c06443 = this.f13095;
                    if (c06443 == null) {
                        c06443 = null;
                    }
                    C2723 c2723 = new C2723(c0105, c1369, socket, socket4, c2126, enumC09402, c06443);
                    this.f13094 = c2723;
                    c2723.m4846();
                    AbstractC2740 abstractC27402 = this.f13083.f13425;
                    InetSocketAddress inetSocketAddress2 = this.f13098.f6395;
                    abstractC27402.getClass();
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e3) {
            e = e3;
            c2666M4756 = null;
        }
        try {
            C2695 c26952 = new C2695(this, null, null, 6);
            this.f13083.f13418.remove(this);
            return c26952;
        } catch (IOException e4) {
            e = e4;
            z = true;
            c2666M4756 = c2666;
            AbstractC2740 abstractC27403 = this.f13083.f13425;
            InetSocketAddress inetSocketAddress3 = this.f13098.f6395;
            abstractC27403.getClass();
            if (this.f13093) {
                c26662 = c2666M4756;
            }
            C2695 c26953 = new C2695(this, c26662, e);
            this.f13083.f13418.remove(this);
            if (!z) {
            }
            return c26953;
        } catch (Throwable th2) {
            th = th2;
            z = true;
            this.f13083.f13418.remove(this);
            if (!z) {
                Socket socket5 = this.f13090;
                if (socket5 != null) {
                    AbstractC0795.m1808(socket5);
                }
                AbstractC0795.m1808(socket);
            }
            throw th;
        }
    }

    @Override // yyds.InterfaceC2144
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final C2695 mo2230() {
        Socket socket;
        Socket socket2;
        if (this.f13092 != null) {
            C0188.m800("TCP already connected");
            return null;
        }
        this.f13083.f13418.add(this);
        boolean z = false;
        try {
            try {
                AbstractC2740 abstractC2740 = this.f13083.f13425;
                InetSocketAddress inetSocketAddress = this.f13098.f6395;
                abstractC2740.getClass();
                m4757();
                z = true;
                C2695 c2695 = new C2695(this, null, null, 6);
                this.f13083.f13418.remove(this);
                return c2695;
            } catch (IOException e) {
                C1369 c1369 = this.f13098;
                C1618 c1618 = c1369.f6393;
                if (c1369.f6394.type() != Proxy.Type.DIRECT) {
                    C1618 c16182 = this.f13098.f6393;
                    c16182.f8239.connectFailed(c16182.f8234.m475(), this.f13098.f6394.address(), e);
                }
                AbstractC2740 abstractC27402 = this.f13083.f13425;
                InetSocketAddress inetSocketAddress2 = this.f13098.f6395;
                abstractC27402.getClass();
                C2695 c26952 = new C2695(this, null, e, 2);
                this.f13083.f13418.remove(this);
                if (!z && (socket = this.f13092) != null) {
                    AbstractC0795.m1808(socket);
                }
                return c26952;
            }
        } catch (Throwable th) {
            this.f13083.f13418.remove(this);
            if (!z && (socket2 = this.f13092) != null) {
                AbstractC0795.m1808(socket2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final C2695 m4758() throws IOException {
        C2098 c2098;
        C2098 c20982 = this.f13084;
        C1369 c1369 = this.f13098;
        String str = "CONNECT " + AbstractC0795.m1801(c1369.f6393.f8234, true) + " HTTP/1.1";
        while (true) {
            C0644 c0644 = this.f13095;
            if (c0644 == null) {
                c0644 = null;
            }
            C0157 c0157 = new C0157(null, this, c0644);
            C0644 c06442 = this.f13095;
            if (c06442 == null) {
                c06442 = null;
            }
            ((C2066) c06442.f3102).f10219.mo693().mo2198(this.f13100);
            C0644 c06443 = this.f13095;
            if (c06443 == null) {
                c06443 = null;
            }
            ((C2776) c06443.f3101).f13529.mo577().mo2198(this.f13103);
            c0157.m714(c20982.f10391, str);
            c0157.mo711();
            C2294 c2294Mo715 = c0157.mo715(false);
            c2294Mo715.f11264 = c20982;
            C0837 c0837M4297 = c2294Mo715.m4297();
            int i = c0837M4297.f3860;
            long jM1802 = AbstractC0795.m1802(c0837M4297);
            if (jM1802 != -1) {
                C2357 c2357M713 = c0157.m713(c0837M4297.f3858.f10389, jM1802);
                AbstractC0795.m1805(c2357M713, Integer.MAX_VALUE);
                c2357M713.close();
            }
            if (i == 200) {
                c2098 = null;
                break;
            }
            if (i != 407) {
                C0188.m804(AbstractC0897.m1989(i, "Unexpected response code for CONNECT: "));
                return null;
            }
            C2098 c2098Mo1278 = c1369.f6393.f8242.mo1278(c1369, c0837M4297);
            if (c2098Mo1278 == null) {
                C0188.m804("Failed to authenticate with proxy");
                return null;
            }
            String strM3306 = c0837M4297.f3847.m3306("Connection");
            if (strM3306 == null) {
                strM3306 = null;
            }
            if ("close".equalsIgnoreCase(strM3306)) {
                c2098 = c2098Mo1278;
                break;
            }
            c20982 = c2098Mo1278;
        }
        if (c2098 == null) {
            return new C2695(this, null, null, 6);
        }
        Socket socket = this.f13092;
        if (socket != null) {
            AbstractC0795.m1808(socket);
        }
        int i2 = this.f13097 + 1;
        if (i2 < 21) {
            AbstractC2740 abstractC2740 = this.f13083.f13425;
            InetSocketAddress inetSocketAddress = this.f13098.f6395;
            abstractC2740.getClass();
            return new C2695(this, m4754(this, i2, c2098, 0, false, 12), null, 4);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        AbstractC2740 abstractC27402 = this.f13083.f13425;
        InetSocketAddress inetSocketAddress2 = this.f13098.f6395;
        abstractC27402.getClass();
        return new C2695(this, null, protocolException, 2);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m4759(SSLSocket sSLSocket, C2640 c2640) {
        Object next;
        Object next2;
        C1618 c1618 = this.f13098.f6393;
        try {
            String strMo844 = null;
            if (c2640.f13021) {
                C1966 c1966 = AbstractC1325.f6087;
                C1966 c19662 = AbstractC1325.f6087;
                String str = c1618.f8234.f670;
                List list = c1618.f8235;
                Iterator it = c19662.f9865.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it.next();
                        if (((InterfaceC0881) next2).mo845(sSLSocket)) {
                            break;
                        }
                    }
                }
                InterfaceC0881 interfaceC0881 = (InterfaceC0881) next2;
                if (interfaceC0881 != null) {
                    interfaceC0881.mo847(sSLSocket, str, list);
                }
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            C2126 c2126M2020 = AbstractC0902.m2020(session);
            if (!c1618.f8243.verify(c1618.f8234.f670, session)) {
                List listM4040 = c2126M2020.m4040();
                if (listM4040.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c1618.f8234.f670 + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) listM4040.get(0);
                StringBuilder sb = new StringBuilder();
                sb.append("\n            |Hostname ");
                sb.append(c1618.f8234.f670);
                sb.append(" not verified:\n            |    certificate: ");
                C2342 c2342 = C2342.f11508;
                sb.append(AbstractC0598.m1480(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(AbstractC1595.m3284(C2745.m4869(x509Certificate, 7), C2745.m4869(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(AbstractC0786.m1776(sb.toString()));
            }
            C2342 c23422 = c1618.f8236;
            this.f13099 = new C2126(c2126M2020.f10511, c2126M2020.f10512, c2126M2020.f10513, new C2661(c23422, c2126M2020, c1618, 1));
            Iterator it2 = c23422.f11509.iterator();
            if (it2.hasNext()) {
                AbstractC0897.m1996(it2.next());
                throw null;
            }
            if (c2640.f13021) {
                C1966 c19663 = AbstractC1325.f6087;
                Iterator it3 = AbstractC1325.f6087.f9865.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it3.next();
                        if (((InterfaceC0881) next).mo845(sSLSocket)) {
                            break;
                        }
                    }
                }
                InterfaceC0881 interfaceC08812 = (InterfaceC0881) next;
                if (interfaceC08812 != null) {
                    strMo844 = interfaceC08812.mo844(sSLSocket);
                }
            }
            this.f13090 = sSLSocket;
            this.f13095 = new C0644(new C0299(sSLSocket));
            this.f13088 = strMo844 != null ? AbstractC0395.m1131(strMo844) : EnumC0940.HTTP_1_1;
            C1966 c19664 = AbstractC1325.f6087;
            AbstractC1325.f6087.getClass();
        } catch (Throwable th) {
            C1966 c19665 = AbstractC1325.f6087;
            AbstractC1325.f6087.getClass();
            AbstractC0795.m1808(sSLSocket);
            throw th;
        }
    }

    @Override // yyds.InterfaceC2144
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2723 mo2231() {
        C2014 c2014 = this.f13083.f13423.f5899;
        C1369 c1369 = this.f13098;
        synchronized (c2014) {
            ((LinkedHashSet) c2014.f10074).remove(c1369);
        }
        C2723 c2723 = this.f13094;
        c2723.getClass();
        C1061 c1061M3643 = this.f13085.m3643(this, this.f13096);
        if (c1061M3643 != null) {
            return c1061M3643.f4850;
        }
        synchronized (c2723) {
            C2142 c2142 = this.f13091;
            TimeZone timeZone = AbstractC0795.f3653;
            c2142.f10582.add(c2723);
            c2142.f10580.m697(c2142.f10581, 0L);
            this.f13083.m4858(c2723);
        }
        this.f13083.f13425.getClass();
        return c2723;
    }

    @Override // yyds.InterfaceC1604
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final C1369 mo3291() {
        return this.f13098;
    }

    @Override // yyds.InterfaceC1604
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo3292(C2729 c2729, IOException iOException) {
    }
}
