package defpackage;

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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ry implements jb2, wg0 {
    public final iy2 a;
    public final ud0 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final s52 h;
    public final x52 i;
    public final hb2 j;
    public final List k;
    public final k82 l;
    public final int m;
    public final boolean n;
    public volatile boolean o;
    public Socket p;
    public Socket q;
    public yr0 r;
    public c42 s;
    public b5 t;
    public t52 u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ry(iy2 iy2Var, ud0 ud0Var, int i, int i2, int i3, int i4, boolean z, s52 s52Var, x52 x52Var, hb2 hb2Var, List list, k82 k82Var, int i5, boolean z2) {
        iy2Var.getClass();
        ud0Var.getClass();
        hb2Var.getClass();
        this.a = iy2Var;
        this.b = ud0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = s52Var;
        this.i = x52Var;
        this.j = hb2Var;
        this.k = list;
        this.l = k82Var;
        this.m = i5;
        this.n = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jb2
    public final jb2 a() {
        return new ry(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    @Override // defpackage.jb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ib2 c() throws Throwable {
        ry ryVarL;
        ry ryVar;
        Socket socket = this.p;
        ry ryVar2 = null;
        if (socket == null) {
            s.j("TCP not connected");
            return null;
        }
        if (e()) {
            s.l("already connected");
            return null;
        }
        List list = this.j.a.k;
        this.h.z.add(this);
        boolean z = false;
        try {
            try {
                if (this.l != null) {
                    ib2 ib2VarK = k();
                    if (ib2VarK.c != null) {
                        this.h.z.remove(this);
                        Socket socket2 = this.q;
                        if (socket2 != null) {
                            wg3.c(socket2);
                        }
                        wg3.c(socket);
                        return ib2VarK;
                    }
                }
                q5 q5Var = this.j.a;
                if (q5Var.c != null) {
                    b5 b5Var = this.t;
                    if (b5Var == null) {
                        t11.S("socket");
                        throw null;
                    }
                    if (((o52) b5Var.j).i.k()) {
                        b5 b5Var2 = this.t;
                        if (b5Var2 == null) {
                            t11.S("socket");
                            throw null;
                        }
                        if (((n52) b5Var2.k).i.k()) {
                            this.h.k.getClass();
                            q5 q5Var2 = this.j.a;
                            SSLSocketFactory sSLSocketFactory = q5Var2.c;
                            yw0 yw0Var = q5Var2.i;
                            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, yw0Var.d, yw0Var.e, true);
                            socketCreateSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            ry ryVarM = m(list, sSLSocket);
                            uy uyVar = (uy) list.get(ryVarM.m);
                            ryVarL = ryVarM.l(list, sSLSocket);
                            try {
                                uyVar.a(sSLSocket, ryVarM.n);
                                j(sSLSocket, uyVar);
                                this.h.k.getClass();
                                ryVar = ryVarL;
                            } catch (IOException e) {
                                e = e;
                                kg0 kg0Var = this.h.k;
                                InetSocketAddress inetSocketAddress = this.j.c;
                                kg0Var.getClass();
                                inetSocketAddress.getClass();
                                this.b.getClass();
                                this.j.getClass();
                                if (this.g && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                    ryVar2 = ryVarL;
                                }
                                ib2 ib2Var = new ib2(this, ryVar2, e);
                                this.h.z.remove(this);
                                if (!z) {
                                    Socket socket3 = this.q;
                                    if (socket3 != null) {
                                        wg3.c(socket3);
                                    }
                                    wg3.c(socket);
                                }
                                return ib2Var;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.q = socket;
                List list2 = q5Var.j;
                c42 c42Var = c42.n;
                if (!list2.contains(c42Var)) {
                    c42Var = c42.k;
                }
                this.s = c42Var;
                ryVar = null;
                try {
                    iy2 iy2Var = this.a;
                    ud0 ud0Var = this.b;
                    hb2 hb2Var = this.j;
                    Socket socket4 = this.q;
                    socket4.getClass();
                    yr0 yr0Var = this.r;
                    c42 c42Var2 = this.s;
                    c42Var2.getClass();
                    b5 b5Var3 = this.t;
                    if (b5Var3 == null) {
                        t11.S("socket");
                        throw null;
                    }
                    this.b.getClass();
                    t52 t52Var = new t52(iy2Var, ud0Var, hb2Var, socket, socket4, yr0Var, c42Var2, b5Var3);
                    this.u = t52Var;
                    t52Var.i();
                    kg0 kg0Var2 = this.h.k;
                    InetSocketAddress inetSocketAddress2 = this.j.c;
                    kg0Var2.getClass();
                    inetSocketAddress2.getClass();
                    try {
                        ib2 ib2Var2 = new ib2(this, (Throwable) null, 6);
                        this.h.z.remove(this);
                        return ib2Var2;
                    } catch (IOException e2) {
                        e = e2;
                        z = true;
                        ryVarL = ryVar;
                        kg0 kg0Var3 = this.h.k;
                        InetSocketAddress inetSocketAddress3 = this.j.c;
                        kg0Var3.getClass();
                        inetSocketAddress3.getClass();
                        this.b.getClass();
                        this.j.getClass();
                        if (this.g) {
                            ryVar2 = ryVarL;
                        }
                        ib2 ib2Var3 = new ib2(this, ryVar2, e);
                        this.h.z.remove(this);
                        if (!z) {
                        }
                        return ib2Var3;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        this.h.z.remove(this);
                        if (!z) {
                            Socket socket5 = this.q;
                            if (socket5 != null) {
                                wg3.c(socket5);
                            }
                            wg3.c(socket);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (IOException e4) {
                e = e4;
                ryVarL = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jb2
    public final void cancel() {
        this.o = true;
        Socket socket = this.p;
        if (socket != null) {
            wg3.c(socket);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jb2
    public final t52 d() {
        hh1 hh1Var = this.h.h.C;
        hb2 hb2Var = this.j;
        synchronized (hh1Var) {
            hb2Var.getClass();
            ((LinkedHashSet) hh1Var.i).remove(hb2Var);
        }
        t52 t52Var = this.u;
        t52Var.getClass();
        this.j.getClass();
        da2 da2VarD = this.i.d(this, this.k);
        if (da2VarD != null) {
            return da2VarD.a;
        }
        synchronized (t52Var) {
            ud0 ud0Var = this.b;
            ud0Var.getClass();
            TimeZone timeZone = wg3.a;
            ((ConcurrentLinkedQueue) ud0Var.d).add(t52Var);
            ((hy2) ud0Var.b).c((u52) ud0Var.c, 0L);
            this.h.d(t52Var);
        }
        this.h.k.getClass();
        return t52Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jb2
    public final boolean e() {
        return this.s != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wg0
    public final hb2 f() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jb2
    public final ib2 g() {
        Socket socket;
        Socket socket2;
        if (this.p != null) {
            s.l("TCP already connected");
            return null;
        }
        this.h.z.add(this);
        boolean z = false;
        try {
            try {
                kg0 kg0Var = this.h.k;
                InetSocketAddress inetSocketAddress = this.j.c;
                kg0Var.getClass();
                inetSocketAddress.getClass();
                this.b.getClass();
                this.j.getClass();
                i();
                z = true;
                ib2 ib2Var = new ib2(this, (Throwable) null, 6);
                this.h.z.remove(this);
                return ib2Var;
            } catch (IOException e) {
                hb2 hb2Var = this.j;
                if (hb2Var.a.g == null && hb2Var.b.type() != Proxy.Type.DIRECT) {
                    q5 q5Var = this.j.a;
                    q5Var.h.connectFailed(q5Var.i.h(), this.j.b.address(), e);
                }
                kg0 kg0Var2 = this.h.k;
                InetSocketAddress inetSocketAddress2 = this.j.c;
                kg0Var2.getClass();
                inetSocketAddress2.getClass();
                this.b.getClass();
                this.j.getClass();
                ib2 ib2Var2 = new ib2(this, e, 2);
                this.h.z.remove(this);
                if (!z && (socket2 = this.p) != null) {
                    wg3.c(socket2);
                }
                return ib2Var2;
            }
        } catch (Throwable th) {
            this.h.z.remove(this);
            if (!z && (socket = this.p) != null) {
                wg3.c(socket);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.j.b.type();
        int i = type == null ? -1 : qy.a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.j.a.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.j.b);
        }
        this.p = socketCreateSocket;
        if (this.o) {
            c80.v("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f);
        try {
            zz1 zz1Var = zz1.a;
            zz1.a.c(socketCreateSocket, this.j.c, this.e);
            try {
                this.t = new b5(new kj1(socketCreateSocket));
            } catch (NullPointerException e) {
                if (t11.l(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.j.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(SSLSocket sSLSocket, uy uyVar) {
        c42 c42VarN;
        q5 q5Var = this.j.a;
        try {
            if (uyVar.b) {
                zz1 zz1Var = zz1.a;
                zz1.a.b(sSLSocket, q5Var.i.d, q5Var.j);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            yr0 yr0VarB = te.B(session);
            HostnameVerifier hostnameVerifier = q5Var.d;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(q5Var.i.d, session)) {
                List listA = yr0VarB.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + q5Var.i.d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                obj.getClass();
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(q5Var.i.d);
                sb.append(" not verified:\n            |    certificate: ");
                cq cqVar = cq.c;
                sb.append(s11.V(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(du.x0(ys1.a(x509Certificate, 7), ys1.a(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(qv2.T(sb.toString()));
            }
            cq cqVar2 = q5Var.e;
            cqVar2.getClass();
            this.r = new yr0(yr0VarB.a, yr0VarB.b, yr0VarB.c, new s1(cqVar2, yr0VarB, q5Var, 6));
            q5Var.i.d.getClass();
            Iterator it = cqVar2.a.iterator();
            String strD = null;
            if (it.hasNext()) {
                vi0.t(it.next());
                throw null;
            }
            if (uyVar.b) {
                zz1 zz1Var2 = zz1.a;
                strD = zz1.a.d(sSLSocket);
            }
            this.q = sSLSocket;
            this.t = new b5(new kj1(sSLSocket));
            if (strD != null) {
                c42.i.getClass();
                c42VarN = i51.n(strD);
            } else {
                c42VarN = c42.k;
            }
            this.s = c42VarN;
            zz1 zz1Var3 = zz1.a;
            zz1.a.getClass();
        } catch (Throwable th) {
            zz1 zz1Var4 = zz1.a;
            zz1.a.getClass();
            wg3.c(sSLSocket);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ib2 k() throws IOException {
        k82 k82Var = this.l;
        k82Var.getClass();
        hb2 hb2Var = this.j;
        String str = "CONNECT " + wg3.h(hb2Var.a.i, true) + " HTTP/1.1";
        b5 b5Var = this.t;
        if (b5Var == null) {
            t11.S("socket");
            throw null;
        }
        iv0 iv0Var = new iv0(null, this, b5Var);
        b5 b5Var2 = this.t;
        if (b5Var2 == null) {
            t11.S("socket");
            throw null;
        }
        ((o52) b5Var2.j).h.a().g(this.c);
        b5 b5Var3 = this.t;
        if (b5Var3 == null) {
            t11.S("socket");
            throw null;
        }
        ((n52) b5Var3.k).h.a().g(this.d);
        iv0Var.l(k82Var.c, str);
        iv0Var.c();
        p92 p92VarJ = iv0Var.j(false);
        p92VarJ.getClass();
        p92VarJ.a = k82Var;
        r92 r92VarA = p92VarJ.a();
        int i = r92VarA.k;
        long jE = wg3.e(r92VarA);
        if (jE != -1) {
            fv0 fv0VarK = iv0Var.k(r92VarA.h.a, jE);
            wg3.f(fv0VarK, Integer.MAX_VALUE);
            fv0VarK.close();
        }
        if (i == 200) {
            return new ib2(this, (Throwable) null, 6);
        }
        if (i != 407) {
            c80.v(vi0.g("Unexpected response code for CONNECT: ", i));
            return null;
        }
        hb2Var.a.f.getClass();
        c80.v("Failed to authenticate with proxy");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ry l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        list.getClass();
        int i = this.m;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            uy uyVar = (uy) list.get(i2);
            uyVar.getClass();
            if (uyVar.a && (((strArr = uyVar.d) == null || ug3.e(strArr, sSLSocket.getEnabledProtocols(), dm1.b)) && ((strArr2 = uyVar.c) == null || ug3.e(strArr2, sSLSocket.getEnabledCipherSuites(), ps.c)))) {
                return new ry(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, i2, i != -1);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ry m(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        list.getClass();
        if (this.m != -1) {
            return this;
        }
        ry ryVarL = l(list, sSLSocket);
        if (ryVarL != null) {
            return ryVarL;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.n);
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

    @Override // defpackage.wg0
    public final void h() {
    }

    @Override // defpackage.wg0
    public final void b(s52 s52Var, IOException iOException) {
    }
}
