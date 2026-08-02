package p000;

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
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: ry */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0674ry implements jb2, wg0 {

    /* JADX INFO: renamed from: a */
    public final iy2 f9799a;

    /* JADX INFO: renamed from: b */
    public final ud0 f9800b;

    /* JADX INFO: renamed from: c */
    public final int f9801c;

    /* JADX INFO: renamed from: d */
    public final int f9802d;

    /* JADX INFO: renamed from: e */
    public final int f9803e;

    /* JADX INFO: renamed from: f */
    public final int f9804f;

    /* JADX INFO: renamed from: g */
    public final boolean f9805g;

    /* JADX INFO: renamed from: h */
    public final s52 f9806h;

    /* JADX INFO: renamed from: i */
    public final x52 f9807i;

    /* JADX INFO: renamed from: j */
    public final hb2 f9808j;

    /* JADX INFO: renamed from: k */
    public final List f9809k;

    /* JADX INFO: renamed from: l */
    public final k82 f9810l;

    /* JADX INFO: renamed from: m */
    public final int f9811m;

    /* JADX INFO: renamed from: n */
    public final boolean f9812n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f9813o;

    /* JADX INFO: renamed from: p */
    public Socket f9814p;

    /* JADX INFO: renamed from: q */
    public Socket f9815q;

    /* JADX INFO: renamed from: r */
    public yr0 f9816r;

    /* JADX INFO: renamed from: s */
    public c42 f9817s;

    /* JADX INFO: renamed from: t */
    public C0043b5 f9818t;

    /* JADX INFO: renamed from: u */
    public t52 f9819u;

    public C0674ry(iy2 iy2Var, ud0 ud0Var, int i, int i2, int i3, int i4, boolean z, s52 s52Var, x52 x52Var, hb2 hb2Var, List list, k82 k82Var, int i5, boolean z2) {
        iy2Var.getClass();
        ud0Var.getClass();
        hb2Var.getClass();
        this.f9799a = iy2Var;
        this.f9800b = ud0Var;
        this.f9801c = i;
        this.f9802d = i2;
        this.f9803e = i3;
        this.f9804f = i4;
        this.f9805g = z;
        this.f9806h = s52Var;
        this.f9807i = x52Var;
        this.f9808j = hb2Var;
        this.f9809k = list;
        this.f9810l = k82Var;
        this.f9811m = i5;
        this.f9812n = z2;
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: a */
    public final jb2 mo979a() {
        return new C0674ry(this.f9799a, this.f9800b, this.f9801c, this.f9802d, this.f9803e, this.f9804f, this.f9805g, this.f9806h, this.f9807i, this.f9808j, this.f9809k, this.f9810l, this.f9811m, this.f9812n);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    @Override // p000.jb2
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ib2 mo980c() throws Throwable {
        C0674ry c0674ryM4632l;
        C0674ry c0674ry;
        Socket socket = this.f9814p;
        C0674ry c0674ry2 = null;
        if (socket == null) {
            C0676s.m4651j("TCP not connected");
            return null;
        }
        if (mo982e()) {
            C0676s.m4653l("already connected");
            return null;
        }
        List list = this.f9808j.f3944a.f8741k;
        this.f9806h.f9931z.add(this);
        boolean z = false;
        try {
            try {
                if (this.f9810l != null) {
                    ib2 ib2VarM4631k = m4631k();
                    if (ib2VarM4631k.f4524c != null) {
                        this.f9806h.f9931z.remove(this);
                        Socket socket2 = this.f9815q;
                        if (socket2 != null) {
                            wg3.m5890c(socket2);
                        }
                        wg3.m5890c(socket);
                        return ib2VarM4631k;
                    }
                }
                C0605q5 c0605q5 = this.f9808j.f3944a;
                if (c0605q5.f8733c != null) {
                    C0043b5 c0043b5 = this.f9818t;
                    if (c0043b5 == null) {
                        t11.m5067S("socket");
                        throw null;
                    }
                    if (((o52) c0043b5.f563j).f7530i.m1683k()) {
                        C0043b5 c0043b52 = this.f9818t;
                        if (c0043b52 == null) {
                            t11.m5067S("socket");
                            throw null;
                        }
                        if (((n52) c0043b52.f564k).f7011i.m1683k()) {
                            this.f9806h.f9916k.getClass();
                            C0605q5 c0605q52 = this.f9808j.f3944a;
                            SSLSocketFactory sSLSocketFactory = c0605q52.f8733c;
                            yw0 yw0Var = c0605q52.f8739i;
                            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, yw0Var.f13644d, yw0Var.f13645e, true);
                            socketCreateSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            C0674ry c0674ryM4633m = m4633m(list, sSLSocket);
                            C0790uy c0790uy = (C0790uy) list.get(c0674ryM4633m.f9811m);
                            c0674ryM4632l = c0674ryM4633m.m4632l(list, sSLSocket);
                            try {
                                c0790uy.m5594a(sSLSocket, c0674ryM4633m.f9812n);
                                m4630j(sSLSocket, c0790uy);
                                this.f9806h.f9916k.getClass();
                                c0674ry = c0674ryM4632l;
                            } catch (IOException e) {
                                e = e;
                                kg0 kg0Var = this.f9806h.f9916k;
                                InetSocketAddress inetSocketAddress = this.f9808j.f3946c;
                                kg0Var.getClass();
                                inetSocketAddress.getClass();
                                this.f9800b.getClass();
                                this.f9808j.getClass();
                                if (this.f9805g && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                    c0674ry2 = c0674ryM4632l;
                                }
                                ib2 ib2Var = new ib2(this, c0674ry2, e);
                                this.f9806h.f9931z.remove(this);
                                if (!z) {
                                    Socket socket3 = this.f9815q;
                                    if (socket3 != null) {
                                        wg3.m5890c(socket3);
                                    }
                                    wg3.m5890c(socket);
                                }
                                return ib2Var;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.f9815q = socket;
                List list2 = c0605q5.f8740j;
                c42 c42Var = c42.f1141n;
                if (!list2.contains(c42Var)) {
                    c42Var = c42.f1138k;
                }
                this.f9817s = c42Var;
                c0674ry = null;
                try {
                    iy2 iy2Var = this.f9799a;
                    ud0 ud0Var = this.f9800b;
                    hb2 hb2Var = this.f9808j;
                    Socket socket4 = this.f9815q;
                    socket4.getClass();
                    yr0 yr0Var = this.f9816r;
                    c42 c42Var2 = this.f9817s;
                    c42Var2.getClass();
                    C0043b5 c0043b53 = this.f9818t;
                    if (c0043b53 == null) {
                        t11.m5067S("socket");
                        throw null;
                    }
                    this.f9800b.getClass();
                    t52 t52Var = new t52(iy2Var, ud0Var, hb2Var, socket, socket4, yr0Var, c42Var2, c0043b53);
                    this.f9819u = t52Var;
                    t52Var.m5124i();
                    kg0 kg0Var2 = this.f9806h.f9916k;
                    InetSocketAddress inetSocketAddress2 = this.f9808j.f3946c;
                    kg0Var2.getClass();
                    inetSocketAddress2.getClass();
                    try {
                        ib2 ib2Var2 = new ib2(this, (Throwable) null, 6);
                        this.f9806h.f9931z.remove(this);
                        return ib2Var2;
                    } catch (IOException e2) {
                        e = e2;
                        z = true;
                        c0674ryM4632l = c0674ry;
                        kg0 kg0Var3 = this.f9806h.f9916k;
                        InetSocketAddress inetSocketAddress3 = this.f9808j.f3946c;
                        kg0Var3.getClass();
                        inetSocketAddress3.getClass();
                        this.f9800b.getClass();
                        this.f9808j.getClass();
                        if (this.f9805g) {
                            c0674ry2 = c0674ryM4632l;
                        }
                        ib2 ib2Var3 = new ib2(this, c0674ry2, e);
                        this.f9806h.f9931z.remove(this);
                        if (!z) {
                        }
                        return ib2Var3;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        this.f9806h.f9931z.remove(this);
                        if (!z) {
                            Socket socket5 = this.f9815q;
                            if (socket5 != null) {
                                wg3.m5890c(socket5);
                            }
                            wg3.m5890c(socket);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (IOException e4) {
                e = e4;
                c0674ryM4632l = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p000.jb2
    public final void cancel() {
        this.f9813o = true;
        Socket socket = this.f9814p;
        if (socket != null) {
            wg3.m5890c(socket);
        }
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: d */
    public final t52 mo981d() {
        hh1 hh1Var = this.f9806h.f9913h.f2597C;
        hb2 hb2Var = this.f9808j;
        synchronized (hh1Var) {
            hb2Var.getClass();
            ((LinkedHashSet) hh1Var.f4019i).remove(hb2Var);
        }
        t52 t52Var = this.f9819u;
        t52Var.getClass();
        this.f9808j.getClass();
        da2 da2VarM6039d = this.f9807i.m6039d(this, this.f9809k);
        if (da2VarM6039d != null) {
            return da2VarM6039d.f1949a;
        }
        synchronized (t52Var) {
            ud0 ud0Var = this.f9800b;
            ud0Var.getClass();
            TimeZone timeZone = wg3.f12507a;
            ((ConcurrentLinkedQueue) ud0Var.f11241d).add(t52Var);
            ((hy2) ud0Var.f11239b).m2236c((u52) ud0Var.f11240c, 0L);
            this.f9806h.m4729d(t52Var);
        }
        this.f9806h.f9916k.getClass();
        return t52Var;
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: e */
    public final boolean mo982e() {
        return this.f9817s != null;
    }

    @Override // p000.wg0
    /* JADX INFO: renamed from: f */
    public final hb2 mo4627f() {
        return this.f9808j;
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: g */
    public final ib2 mo983g() {
        Socket socket;
        Socket socket2;
        if (this.f9814p != null) {
            C0676s.m4653l("TCP already connected");
            return null;
        }
        this.f9806h.f9931z.add(this);
        boolean z = false;
        try {
            try {
                kg0 kg0Var = this.f9806h.f9916k;
                InetSocketAddress inetSocketAddress = this.f9808j.f3946c;
                kg0Var.getClass();
                inetSocketAddress.getClass();
                this.f9800b.getClass();
                this.f9808j.getClass();
                m4629i();
                z = true;
                ib2 ib2Var = new ib2(this, (Throwable) null, 6);
                this.f9806h.f9931z.remove(this);
                return ib2Var;
            } catch (IOException e) {
                hb2 hb2Var = this.f9808j;
                if (hb2Var.f3944a.f8737g == null && hb2Var.f3945b.type() != Proxy.Type.DIRECT) {
                    C0605q5 c0605q5 = this.f9808j.f3944a;
                    c0605q5.f8738h.connectFailed(c0605q5.f8739i.m6362h(), this.f9808j.f3945b.address(), e);
                }
                kg0 kg0Var2 = this.f9806h.f9916k;
                InetSocketAddress inetSocketAddress2 = this.f9808j.f3946c;
                kg0Var2.getClass();
                inetSocketAddress2.getClass();
                this.f9800b.getClass();
                this.f9808j.getClass();
                ib2 ib2Var2 = new ib2(this, e, 2);
                this.f9806h.f9931z.remove(this);
                if (!z && (socket2 = this.f9814p) != null) {
                    wg3.m5890c(socket2);
                }
                return ib2Var2;
            }
        } catch (Throwable th) {
            this.f9806h.f9931z.remove(this);
            if (!z && (socket = this.f9814p) != null) {
                wg3.m5890c(socket);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4629i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.f9808j.f3945b.type();
        int i = type == null ? -1 : AbstractC0636qy.f9284a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.f9808j.f3944a.f8732b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.f9808j.f3945b);
        }
        this.f9814p = socketCreateSocket;
        if (this.f9813o) {
            c80.m678v("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f9804f);
        try {
            zz1 zz1Var = zz1.f14161a;
            zz1.f14161a.mo712c(socketCreateSocket, this.f9808j.f3946c, this.f9803e);
            try {
                this.f9818t = new C0043b5(new kj1(socketCreateSocket));
            } catch (NullPointerException e) {
                if (t11.m5086l(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f9808j.f3946c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4630j(SSLSocket sSLSocket, C0790uy c0790uy) {
        c42 c42VarM2272n;
        C0605q5 c0605q5 = this.f9808j.f3944a;
        try {
            if (c0790uy.f11551b) {
                zz1 zz1Var = zz1.f14161a;
                zz1.f14161a.mo711b(sSLSocket, c0605q5.f8739i.f13644d, c0605q5.f8740j);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            yr0 yr0VarM5174B = AbstractC0731te.m5174B(session);
            HostnameVerifier hostnameVerifier = c0605q5.f8734d;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(c0605q5.f8739i.f13644d, session)) {
                List listM6320a = yr0VarM5174B.m6320a();
                if (listM6320a.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c0605q5.f8739i.f13644d + " not verified (no certificates)");
                }
                Object obj = listM6320a.get(0);
                obj.getClass();
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(c0605q5.f8739i.f13644d);
                sb.append(" not verified:\n            |    certificate: ");
                C0102cq c0102cq = C0102cq.f1665c;
                sb.append(s11.m4677V(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(AbstractC0142du.m1168x0(ys1.m6322a(x509Certificate, 7), ys1.m6322a(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(qv2.m4290T(sb.toString()));
            }
            C0102cq c0102cq2 = c0605q5.f8735e;
            c0102cq2.getClass();
            this.f9816r = new yr0(yr0VarM5174B.f13596a, yr0VarM5174B.f13597b, yr0VarM5174B.f13598c, new C0678s1(c0102cq2, yr0VarM5174B, c0605q5, 6));
            c0605q5.f8739i.f13644d.getClass();
            Iterator it = c0102cq2.f1666a.iterator();
            String strMo713d = null;
            if (it.hasNext()) {
                vi0.m5701t(it.next());
                throw null;
            }
            if (c0790uy.f11551b) {
                zz1 zz1Var2 = zz1.f14161a;
                strMo713d = zz1.f14161a.mo713d(sSLSocket);
            }
            this.f9815q = sSLSocket;
            this.f9818t = new C0043b5(new kj1(sSLSocket));
            if (strMo713d != null) {
                c42.f1136i.getClass();
                c42VarM2272n = i51.m2272n(strMo713d);
            } else {
                c42VarM2272n = c42.f1138k;
            }
            this.f9817s = c42VarM2272n;
            zz1 zz1Var3 = zz1.f14161a;
            zz1.f14161a.getClass();
        } catch (Throwable th) {
            zz1 zz1Var4 = zz1.f14161a;
            zz1.f14161a.getClass();
            wg3.m5890c(sSLSocket);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public final ib2 m4631k() throws IOException {
        k82 k82Var = this.f9810l;
        k82Var.getClass();
        hb2 hb2Var = this.f9808j;
        String str = "CONNECT " + wg3.m5895h(hb2Var.f3944a.f8739i, true) + " HTTP/1.1";
        C0043b5 c0043b5 = this.f9818t;
        if (c0043b5 == null) {
            t11.m5067S("socket");
            throw null;
        }
        iv0 iv0Var = new iv0(null, this, c0043b5);
        C0043b5 c0043b52 = this.f9818t;
        if (c0043b52 == null) {
            t11.m5067S("socket");
            throw null;
        }
        ((o52) c0043b52.f563j).f7529h.mo889a().mo3228g(this.f9801c);
        C0043b5 c0043b53 = this.f9818t;
        if (c0043b53 == null) {
            t11.m5067S("socket");
            throw null;
        }
        ((n52) c0043b53.f564k).f7010h.mo1174a().mo3228g(this.f9802d);
        iv0Var.m2407l(k82Var.f5392c, str);
        iv0Var.mo2398c();
        p92 p92VarMo2405j = iv0Var.mo2405j(false);
        p92VarMo2405j.getClass();
        p92VarMo2405j.f8044a = k82Var;
        r92 r92VarM3830a = p92VarMo2405j.m3830a();
        int i = r92VarM3830a.f9459k;
        long jM5892e = wg3.m5892e(r92VarM3830a);
        if (jM5892e != -1) {
            fv0 fv0VarM2406k = iv0Var.m2406k(r92VarM3830a.f9456h.f5390a, jM5892e);
            wg3.m5893f(fv0VarM2406k, Integer.MAX_VALUE);
            fv0VarM2406k.close();
        }
        if (i == 200) {
            return new ib2(this, (Throwable) null, 6);
        }
        if (i != 407) {
            c80.m678v(vi0.m5688g("Unexpected response code for CONNECT: ", i));
            return null;
        }
        hb2Var.f3944a.f8736f.getClass();
        c80.m678v("Failed to authenticate with proxy");
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final C0674ry m4632l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        list.getClass();
        int i = this.f9811m;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            C0790uy c0790uy = (C0790uy) list.get(i2);
            c0790uy.getClass();
            if (c0790uy.f11550a && (((strArr = c0790uy.f11553d) == null || ug3.m5497e(strArr, sSLSocket.getEnabledProtocols(), dm1.f2113b)) && ((strArr2 = c0790uy.f11552c) == null || ug3.m5497e(strArr2, sSLSocket.getEnabledCipherSuites(), C0591ps.f8530c)))) {
                return new C0674ry(this.f9799a, this.f9800b, this.f9801c, this.f9802d, this.f9803e, this.f9804f, this.f9805g, this.f9806h, this.f9807i, this.f9808j, this.f9809k, this.f9810l, i2, i != -1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final C0674ry m4633m(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        list.getClass();
        if (this.f9811m != -1) {
            return this;
        }
        C0674ry c0674ryM4632l = m4632l(list, sSLSocket);
        if (c0674ryM4632l != null) {
            return c0674ryM4632l;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f9812n);
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

    @Override // p000.wg0
    /* JADX INFO: renamed from: h */
    public final void mo4628h() {
    }

    @Override // p000.wg0
    /* JADX INFO: renamed from: b */
    public final void mo4626b(s52 s52Var, IOException iOException) {
    }
}
