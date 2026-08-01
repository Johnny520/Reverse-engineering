package p138b4;

import com.bumptech.glide.AbstractC1924f;
import com.bumptech.glide.AbstractC1926h;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import p000A.C0072l0;
import p007B0.C0173F;
import p011B4.AbstractC0231b;
import p016C3.C0244a;
import p061L2.AbstractC0973m;
import p069N2.C1020b;
import p117X2.AbstractC1665j;
import p118X3.AbstractC1703m;
import p118X3.C1679A;
import p118X3.C1683E;
import p118X3.C1684F;
import p118X3.C1688J;
import p118X3.C1691a;
import p118X3.C1692b;
import p118X3.C1696f;
import p118X3.C1698h;
import p118X3.C1700j;
import p118X3.C1705o;
import p118X3.EnumC1716z;
import p121Y1.C1753n;
import p123Y3.AbstractC1774e;
import p123Y3.AbstractC1776g;
import p133a4.C1808d;
import p144c4.InterfaceC1914d;
import p149d3.AbstractC1977e;
import p150d4.C1988e;
import p150d4.C1991h;
import p173h4.AbstractC2263d;
import p196l4.C2514c;
import p208n4.AbstractC2724w;
import p208n4.C2715n;
import p208n4.C2716o;

/* JADX INFO: renamed from: b4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1858c implements InterfaceC1875t, InterfaceC1914d {

    /* JADX INFO: renamed from: a */
    public final C1808d f6275a;

    /* JADX INFO: renamed from: b */
    public final C1871p f6276b;

    /* JADX INFO: renamed from: c */
    public final int f6277c;

    /* JADX INFO: renamed from: d */
    public final int f6278d;

    /* JADX INFO: renamed from: e */
    public final int f6279e;

    /* JADX INFO: renamed from: f */
    public final int f6280f;

    /* JADX INFO: renamed from: g */
    public final boolean f6281g;

    /* JADX INFO: renamed from: h */
    public final C1869n f6282h;

    /* JADX INFO: renamed from: i */
    public final C1872q f6283i;

    /* JADX INFO: renamed from: j */
    public final C1688J f6284j;

    /* JADX INFO: renamed from: k */
    public final List f6285k;

    /* JADX INFO: renamed from: l */
    public final C1679A f6286l;

    /* JADX INFO: renamed from: m */
    public final int f6287m;

    /* JADX INFO: renamed from: n */
    public final boolean f6288n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f6289o;

    /* JADX INFO: renamed from: p */
    public Socket f6290p;

    /* JADX INFO: renamed from: q */
    public Socket f6291q;

    /* JADX INFO: renamed from: r */
    public C1705o f6292r;

    /* JADX INFO: renamed from: s */
    public EnumC1716z f6293s;

    /* JADX INFO: renamed from: t */
    public C0072l0 f6294t;

    /* JADX INFO: renamed from: u */
    public C1870o f6295u;

    public C1858c(C1808d c1808d, C1871p c1871p, int i5, int i6, int i7, int i8, boolean z5, C1869n c1869n, C1872q c1872q, C1688J c1688j, List list, C1679A c1679a, int i9, boolean z6) {
        AbstractC1665j.m2985e(c1808d, "taskRunner");
        AbstractC1665j.m2985e(c1871p, "connectionPool");
        AbstractC1665j.m2985e(c1688j, "route");
        this.f6275a = c1808d;
        this.f6276b = c1871p;
        this.f6277c = i5;
        this.f6278d = i6;
        this.f6279e = i7;
        this.f6280f = i8;
        this.f6281g = z5;
        this.f6282h = c1869n;
        this.f6283i = c1872q;
        this.f6284j = c1688j;
        this.f6285k = list;
        this.f6286l = c1679a;
        this.f6287m = i9;
        this.f6288n = z6;
    }

    @Override // p138b4.InterfaceC1875t
    /* JADX INFO: renamed from: a */
    public final InterfaceC1875t mo3326a() {
        return new C1858c(this.f6275a, this.f6276b, this.f6277c, this.f6278d, this.f6279e, this.f6280f, this.f6281g, this.f6282h, this.f6283i, this.f6284j, this.f6285k, this.f6286l, this.f6287m, this.f6288n);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x016c  */
    @Override // p138b4.InterfaceC1875t
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p138b4.C1874s mo3328c() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p138b4.C1858c.mo3328c():b4.s");
    }

    @Override // p138b4.InterfaceC1875t, p144c4.InterfaceC1914d
    public final void cancel() {
        this.f6289o = true;
        Socket socket = this.f6290p;
        if (socket != null) {
            AbstractC1776g.m3175b(socket);
        }
    }

    @Override // p138b4.InterfaceC1875t
    /* JADX INFO: renamed from: d */
    public final C1870o mo3329d() {
        C1753n c1753n = this.f6282h.f6326d.f5941y;
        C1688J c1688j = this.f6284j;
        synchronized (c1753n) {
            AbstractC1665j.m2985e(c1688j, "route");
            ((LinkedHashSet) c1753n.f6028e).remove(c1688j);
        }
        C1870o c1870o = this.f6295u;
        AbstractC1665j.m2982b(c1870o);
        AbstractC1665j.m2985e(this.f6284j, "route");
        C1873r c1873rM3367d = this.f6283i.m3367d(this, this.f6285k);
        if (c1873rM3367d != null) {
            return c1873rM3367d.f6381a;
        }
        synchronized (c1870o) {
            C1871p c1871p = this.f6276b;
            c1871p.getClass();
            TimeZone timeZone = AbstractC1776g.f6076a;
            c1871p.f6364d.add(c1870o);
            c1871p.f6362b.m3277c(c1871p.f6363c, 0L);
            this.f6282h.m3349e(c1870o);
        }
        this.f6282h.f6329g.getClass();
        return c1870o;
    }

    @Override // p138b4.InterfaceC1875t
    /* JADX INFO: renamed from: e */
    public final boolean mo3330e() {
        return this.f6293s != null;
    }

    @Override // p144c4.InterfaceC1914d
    /* JADX INFO: renamed from: f */
    public final C1688J mo3331f() {
        return this.f6284j;
    }

    @Override // p138b4.InterfaceC1875t
    /* JADX INFO: renamed from: g */
    public final C1874s mo3332g() {
        Socket socket;
        Socket socket2;
        if (this.f6290p != null) {
            throw new IllegalStateException("TCP already connected");
        }
        this.f6282h.f6344v.add(this);
        boolean z5 = false;
        try {
            try {
                AbstractC1703m abstractC1703m = this.f6282h.f6329g;
                InetSocketAddress inetSocketAddress = this.f6284j.f5765c;
                abstractC1703m.getClass();
                AbstractC1665j.m2985e(inetSocketAddress, "inetSocketAddress");
                this.f6276b.getClass();
                AbstractC1665j.m2985e(this.f6284j, "route");
                m3334i();
                z5 = true;
                C1874s c1874s = new C1874s(this, (Throwable) null, 6);
                this.f6282h.f6344v.remove(this);
                return c1874s;
            } catch (IOException e5) {
                C1688J c1688j = this.f6284j;
                C1691a c1691a = c1688j.f5763a;
                if (c1688j.f5764b.type() != Proxy.Type.DIRECT) {
                    C1691a c1691a2 = this.f6284j.f5763a;
                    c1691a2.f5781g.connectFailed(c1691a2.f5782h.m3053h(), this.f6284j.f5764b.address(), e5);
                }
                AbstractC1703m abstractC1703m2 = this.f6282h.f6329g;
                InetSocketAddress inetSocketAddress2 = this.f6284j.f5765c;
                abstractC1703m2.getClass();
                AbstractC1665j.m2985e(inetSocketAddress2, "inetSocketAddress");
                this.f6276b.getClass();
                AbstractC1665j.m2985e(this.f6284j, "route");
                C1874s c1874s2 = new C1874s(this, e5, 2);
                this.f6282h.f6344v.remove(this);
                if (!z5 && (socket = this.f6290p) != null) {
                    AbstractC1776g.m3175b(socket);
                }
                return c1874s2;
            }
        } catch (Throwable th) {
            this.f6282h.f6344v.remove(this);
            if (!z5 && (socket2 = this.f6290p) != null) {
                AbstractC1776g.m3175b(socket2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3334i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.f6284j.f5764b.type();
        int i5 = type == null ? -1 : AbstractC1857b.f6274a[type.ordinal()];
        if (i5 == 1 || i5 == 2) {
            socketCreateSocket = this.f6284j.f5763a.f5776b.createSocket();
            AbstractC1665j.m2982b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(this.f6284j.f5764b);
        }
        this.f6290p = socketCreateSocket;
        if (this.f6289o) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f6280f);
        try {
            AbstractC2263d abstractC2263d = AbstractC2263d.f7404a;
            AbstractC2263d.f7404a.mo4120d(socketCreateSocket, this.f6284j.f5765c, this.f6279e);
            try {
                this.f6294t = new C0072l0(new C0173F(socketCreateSocket));
            } catch (NullPointerException e5) {
                if (AbstractC1665j.m2981a(e5.getMessage(), "throw with null exception")) {
                    throw new IOException(e5);
                }
            }
        } catch (ConnectException e6) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f6284j.f5765c);
            connectException.initCause(e6);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3335j(SSLSocket sSLSocket, C1700j c1700j) {
        String strMo4113e;
        EnumC1716z enumC1716zM3010d;
        C1691a c1691a = this.f6284j.f5763a;
        try {
            if (c1700j.f5832b) {
                AbstractC2263d abstractC2263d = AbstractC2263d.f7404a;
                AbstractC2263d.f7404a.mo4112c(sSLSocket, c1691a.f5782h.f5871d, c1691a.f5783i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            AbstractC1665j.m2982b(session);
            C1705o c1705oM3574q = AbstractC1926h.m3574q(session);
            HostnameVerifier hostnameVerifier = c1691a.f5778d;
            AbstractC1665j.m2982b(hostnameVerifier);
            boolean zVerify = hostnameVerifier.verify(c1691a.f5782h.f5871d, session);
            int i5 = 7;
            if (!zVerify) {
                List listM3021a = c1705oM3574q.m3021a();
                if (listM3021a.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c1691a.f5782h.f5871d + " not verified (no certificates)");
                }
                Object obj = listM3021a.get(0);
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(c1691a.f5782h.f5871d);
                sb.append(" not verified:\n            |    certificate: ");
                C1696f c1696f = C1696f.f5802c;
                sb.append(AbstractC1924f.m3505q(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(AbstractC0973m.m2019Z(C2514c.m4462a(x509Certificate, 7), C2514c.m4462a(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(AbstractC1977e.m3649L(sb.toString()));
            }
            C1696f c1696f2 = c1691a.f5779e;
            AbstractC1665j.m2982b(c1696f2);
            this.f6292r = new C1705o(c1705oM3574q.f5853a, c1705oM3574q.f5854b, c1705oM3574q.f5855c, new C0244a(c1696f2, c1705oM3574q, c1691a, i5));
            AbstractC1665j.m2985e(c1691a.f5782h.f5871d, "hostname");
            Iterator it = c1696f2.f5803a.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (c1700j.f5832b) {
                AbstractC2263d abstractC2263d2 = AbstractC2263d.f7404a;
                strMo4113e = AbstractC2263d.f7404a.mo4113e(sSLSocket);
            } else {
                strMo4113e = null;
            }
            this.f6291q = sSLSocket;
            this.f6294t = new C0072l0(new C0173F(sSLSocket));
            if (strMo4113e != null) {
                EnumC1716z.f5943e.getClass();
                enumC1716zM3010d = C1692b.m3010d(strMo4113e);
            } else {
                enumC1716zM3010d = EnumC1716z.f5945g;
            }
            this.f6293s = enumC1716zM3010d;
            AbstractC2263d abstractC2263d3 = AbstractC2263d.f7404a;
            AbstractC2263d.f7404a.getClass();
        } catch (Throwable th) {
            AbstractC2263d abstractC2263d4 = AbstractC2263d.f7404a;
            AbstractC2263d.f7404a.getClass();
            AbstractC1776g.m3175b(sSLSocket);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public final C1874s m3336k() throws IOException {
        C1679A c1679a = this.f6286l;
        AbstractC1665j.m2982b(c1679a);
        C1688J c1688j = this.f6284j;
        String str = "CONNECT " + AbstractC1776g.m3181h(c1688j.f5763a.f5782h, true) + " HTTP/1.1";
        C0072l0 c0072l0 = this.f6294t;
        if (c0072l0 == null) {
            AbstractC1665j.m2991k("socket");
            throw null;
        }
        C1991h c1991h = new C1991h(null, this, c0072l0);
        C0072l0 c0072l02 = this.f6294t;
        if (c0072l02 == null) {
            AbstractC1665j.m2991k("socket");
            throw null;
        }
        AbstractC2724w abstractC2724wMo3157a = ((C2716o) c0072l02.f308f).f8650d.mo3157a();
        long j5 = this.f6277c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        abstractC2724wMo3157a.mo4749g(j5);
        C0072l0 c0072l03 = this.f6294t;
        if (c0072l03 == null) {
            AbstractC1665j.m2991k("socket");
            throw null;
        }
        ((C2715n) c0072l03.f309g).f8647d.mo3339a().mo4749g(this.f6278d);
        c1991h.m3664l(c1679a.f5714c, str);
        c1991h.mo3398c();
        C1683E c1683eMo3405j = c1991h.mo3405j(false);
        AbstractC1665j.m2982b(c1683eMo3405j);
        c1683eMo3405j.f5723a = c1679a;
        C1684F c1684fM3004a = c1683eMo3405j.m3004a();
        int i5 = c1684fM3004a.f5741g;
        long jM3177d = AbstractC1776g.m3177d(c1684fM3004a);
        if (jM3177d != -1) {
            C1988e c1988eM3663k = c1991h.m3663k(c1684fM3004a.f5738d.f5712a, jM3177d);
            AbstractC1776g.m3179f(c1988eM3663k, Integer.MAX_VALUE);
            c1988eM3663k.close();
        }
        if (i5 == 200) {
            return new C1874s(this, (Throwable) null, 6);
        }
        if (i5 != 407) {
            throw new IOException(AbstractC0231b.m398i("Unexpected response code for CONNECT: ", i5));
        }
        c1688j.f5763a.f5780f.getClass();
        throw new IOException("Failed to authenticate with proxy");
    }

    /* JADX INFO: renamed from: l */
    public final C1858c m3337l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        AbstractC1665j.m2985e(list, "connectionSpecs");
        int i5 = this.f6287m;
        int size = list.size();
        for (int i6 = i5 + 1; i6 < size; i6++) {
            C1700j c1700j = (C1700j) list.get(i6);
            c1700j.getClass();
            if (c1700j.f5831a && (((strArr = c1700j.f5834d) == null || AbstractC1774e.m3164e(strArr, sSLSocket.getEnabledProtocols(), C1020b.f3162b)) && ((strArr2 = c1700j.f5833c) == null || AbstractC1774e.m3164e(strArr2, sSLSocket.getEnabledCipherSuites(), C1698h.f5806c)))) {
                return new C1858c(this.f6275a, this.f6276b, this.f6277c, this.f6278d, this.f6279e, this.f6280f, this.f6281g, this.f6282h, this.f6283i, this.f6284j, this.f6285k, this.f6286l, i6, i5 != -1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final C1858c m3338m(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        AbstractC1665j.m2985e(list, "connectionSpecs");
        if (this.f6287m != -1) {
            return this;
        }
        C1858c c1858cM3337l = m3337l(list, sSLSocket);
        if (c1858cM3337l != null) {
            return c1858cM3337l;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f6288n);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        AbstractC1665j.m2982b(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        AbstractC1665j.m2984d(string, "toString(...)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // p144c4.InterfaceC1914d
    /* JADX INFO: renamed from: h */
    public final void mo3333h() {
    }

    @Override // p144c4.InterfaceC1914d
    /* JADX INFO: renamed from: b */
    public final void mo3327b(C1869n c1869n, IOException iOException) {
    }
}
