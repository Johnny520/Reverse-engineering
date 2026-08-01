package p138b4;

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
import p000A.C0072l0;
import p014C1.C0240b;
import p117X2.AbstractC1665j;
import p118X3.C1688J;
import p118X3.C1691a;
import p118X3.C1696f;
import p118X3.C1705o;
import p118X3.C1709s;
import p118X3.C1715y;
import p118X3.EnumC1716z;
import p121Y1.C1753n;
import p123Y3.AbstractC1776g;
import p133a4.C1807c;
import p133a4.C1808d;
import p144c4.InterfaceC1914d;
import p156e4.AbstractC2045h;
import p156e4.AbstractC2051n;
import p156e4.C2036C;
import p156e4.C2037D;
import p156e4.C2038a;
import p156e4.C2040c;
import p156e4.C2054q;
import p156e4.C2062y;
import p156e4.C2063z;
import p156e4.EnumC2039b;
import p196l4.C2514c;
import p208n4.C2716o;

/* JADX INFO: renamed from: b4.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1870o extends AbstractC2051n implements InterfaceC1914d {

    /* JADX INFO: renamed from: b */
    public final C1808d f6345b;

    /* JADX INFO: renamed from: c */
    public final C1688J f6346c;

    /* JADX INFO: renamed from: d */
    public final Socket f6347d;

    /* JADX INFO: renamed from: e */
    public final Socket f6348e;

    /* JADX INFO: renamed from: f */
    public final C1705o f6349f;

    /* JADX INFO: renamed from: g */
    public final EnumC1716z f6350g;

    /* JADX INFO: renamed from: h */
    public final C0072l0 f6351h;

    /* JADX INFO: renamed from: i */
    public C2054q f6352i;

    /* JADX INFO: renamed from: j */
    public boolean f6353j;

    /* JADX INFO: renamed from: k */
    public boolean f6354k;

    /* JADX INFO: renamed from: l */
    public int f6355l;

    /* JADX INFO: renamed from: m */
    public int f6356m;

    /* JADX INFO: renamed from: n */
    public int f6357n;

    /* JADX INFO: renamed from: o */
    public int f6358o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f6359p;

    /* JADX INFO: renamed from: q */
    public long f6360q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1870o(C1808d c1808d, C1871p c1871p, C1688J c1688j, Socket socket, Socket socket2, C1705o c1705o, EnumC1716z enumC1716z, C0072l0 c0072l0) {
        AbstractC1665j.m2985e(c1808d, "taskRunner");
        AbstractC1665j.m2985e(c1871p, "connectionPool");
        AbstractC1665j.m2985e(c1688j, "route");
        AbstractC1665j.m2985e(socket, "rawSocket");
        AbstractC1665j.m2985e(socket2, "javaNetSocket");
        AbstractC1665j.m2985e(enumC1716z, "protocol");
        AbstractC1665j.m2985e(c0072l0, "socket");
        this.f6345b = c1808d;
        this.f6346c = c1688j;
        this.f6347d = socket;
        this.f6348e = socket2;
        this.f6349f = c1705o;
        this.f6350g = enumC1716z;
        this.f6351h = c0072l0;
        this.f6358o = 1;
        this.f6359p = new ArrayList();
        this.f6360q = Long.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m3357d(C1715y c1715y, C1688J c1688j, IOException iOException) {
        AbstractC1665j.m2985e(c1688j, "failedRoute");
        AbstractC1665j.m2985e(iOException, "failure");
        if (c1688j.f5764b.type() != Proxy.Type.DIRECT) {
            C1691a c1691a = c1688j.f5763a;
            c1691a.f5781g.connectFailed(c1691a.f5782h.m3053h(), c1688j.f5764b.address(), iOException);
        }
        C1753n c1753n = c1715y.f5941y;
        synchronized (c1753n) {
            ((LinkedHashSet) c1753n.f6028e).add(c1688j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p156e4.AbstractC2051n
    /* JADX INFO: renamed from: a */
    public final void mo3358a(C2054q c2054q, C2036C c2036c) {
        AbstractC1665j.m2985e(c2036c, "settings");
        synchronized (this) {
            this.f6358o = (c2036c.f6780a & 8) != 0 ? c2036c.f6781b[3] : Integer.MAX_VALUE;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144c4.InterfaceC1914d
    /* JADX INFO: renamed from: b */
    public final void mo3327b(C1869n c1869n, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof C2037D)) {
                    if (!(this.f6352i != null) || (iOException instanceof C2038a)) {
                        this.f6353j = true;
                        if (this.f6356m == 0) {
                            if (iOException != null) {
                                m3357d(c1869n.f6326d, this.f6346c, iOException);
                            }
                            this.f6355l++;
                        }
                    }
                } else if (((C2037D) iOException).f6782d == EnumC2039b.f6788j) {
                    int i5 = this.f6357n + 1;
                    this.f6357n = i5;
                    if (i5 > 1) {
                        this.f6353j = true;
                        this.f6355l++;
                    }
                } else if (((C2037D) iOException).f6782d != EnumC2039b.f6789k || !c1869n.f6342t) {
                    this.f6353j = true;
                    this.f6355l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p156e4.AbstractC2051n
    /* JADX INFO: renamed from: c */
    public final void mo3359c(C2062y c2062y) {
        c2062y.m3771c(EnumC2039b.f6788j, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144c4.InterfaceC1914d
    public final void cancel() {
        AbstractC1776g.m3175b(this.f6347d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3360e(C1691a c1691a, List list) {
        C1709s c1709s = c1691a.f5782h;
        TimeZone timeZone = AbstractC1776g.f6076a;
        if (this.f6359p.size() < this.f6358o && !this.f6353j) {
            C1688J c1688j = this.f6346c;
            C1691a c1691a2 = c1688j.f5763a;
            C1691a c1691a3 = c1688j.f5763a;
            if (c1691a2.m3007a(c1691a)) {
                String str = c1709s.f5871d;
                String str2 = c1709s.f5871d;
                if (AbstractC1665j.m2981a(str, c1691a3.f5782h.f5871d)) {
                    return true;
                }
                if (this.f6352i != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C1688J c1688j2 = (C1688J) it.next();
                        Proxy.Type type = c1688j2.f5764b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && c1688j.f5764b.type() == type2 && AbstractC1665j.m2981a(c1688j.f5765c, c1688j2.f5765c)) {
                            if (c1691a.f5778d == C2514c.f8034a) {
                                TimeZone timeZone2 = AbstractC1776g.f6076a;
                                C1709s c1709s2 = c1691a3.f5782h;
                                if (c1709s.f5872e == c1709s2.f5872e) {
                                    boolean zM2981a = AbstractC1665j.m2981a(str2, c1709s2.f5871d);
                                    C1705o c1705o = this.f6349f;
                                    if (!zM2981a) {
                                        if (!this.f6354k && c1705o != null) {
                                            List listM3021a = c1705o.m3021a();
                                            if (!listM3021a.isEmpty()) {
                                                Object obj = listM3021a.get(0);
                                                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                                if (C2514c.m4464c(str2, (X509Certificate) obj)) {
                                                    try {
                                                        C1696f c1696f = c1691a.f5779e;
                                                        AbstractC1665j.m2982b(c1696f);
                                                        AbstractC1665j.m2982b(c1705o);
                                                        List listM3021a2 = c1705o.m3021a();
                                                        AbstractC1665j.m2985e(str2, "hostname");
                                                        AbstractC1665j.m2985e(listM3021a2, "peerCertificates");
                                                        Iterator it2 = c1696f.f5803a.iterator();
                                                        if (!it2.hasNext()) {
                                                            return true;
                                                        }
                                                        it2.next().getClass();
                                                        throw new ClassCastException();
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144c4.InterfaceC1914d
    /* JADX INFO: renamed from: f */
    public final C1688J mo3331f() {
        return this.f6346c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m3361g(boolean z5) {
        long j5;
        TimeZone timeZone = AbstractC1776g.f6076a;
        long jNanoTime = System.nanoTime();
        if (this.f6347d.isClosed() || this.f6348e.isClosed() || this.f6348e.isInputShutdown() || this.f6348e.isOutputShutdown()) {
            return false;
        }
        C2054q c2054q = this.f6352i;
        if (c2054q != null) {
            synchronized (c2054q) {
                if (c2054q.f6851i) {
                    return false;
                }
                if (c2054q.f6859q < c2054q.f6858p) {
                    if (jNanoTime >= c2054q.f6860r) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j5 = jNanoTime - this.f6360q;
        }
        if (j5 < 10000000000L || !z5) {
            return true;
        }
        Socket socket = this.f6348e;
        C2716o c2716o = (C2716o) this.f6351h.f308f;
        AbstractC1665j.m2985e(socket, "<this>");
        AbstractC1665j.m2985e(c2716o, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !c2716o.m4753b();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144c4.InterfaceC1914d
    /* JADX INFO: renamed from: h */
    public final void mo3333h() {
        synchronized (this) {
            this.f6353j = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m3362i() throws SocketException {
        this.f6360q = System.nanoTime();
        EnumC1716z enumC1716z = this.f6350g;
        if (enumC1716z == EnumC1716z.f5947i || enumC1716z == EnumC1716z.f5948j) {
            this.f6348e.setSoTimeout(0);
            C2040c c2040c = C2040c.f6792a;
            C1808d c1808d = this.f6345b;
            AbstractC1665j.m2985e(c1808d, "taskRunner");
            C0240b c0240b = new C0240b();
            c0240b.f808a = c1808d;
            c0240b.f811d = AbstractC2051n.f6837a;
            c0240b.f812e = C2040c.f6792a;
            C0072l0 c0072l0 = this.f6351h;
            String str = this.f6346c.f5763a.f5782h.f5871d;
            AbstractC1665j.m2985e(c0072l0, "socket");
            AbstractC1665j.m2985e(str, "peerName");
            c0240b.f809b = c0072l0;
            String str2 = AbstractC1776g.f6077b + ' ' + str;
            AbstractC1665j.m2985e(str2, "<set-?>");
            c0240b.f810c = str2;
            c0240b.f811d = this;
            c0240b.f812e = c2040c;
            C2054q c2054q = new C2054q(c0240b);
            this.f6352i = c2054q;
            C2036C c2036c = C2054q.f6843C;
            this.f6358o = (c2036c.f6780a & 8) != 0 ? c2036c.f6781b[3] : Integer.MAX_VALUE;
            C2063z c2063z = c2054q.f6868z;
            synchronized (c2063z) {
                try {
                    if (c2063z.f6914g) {
                        throw new IOException("closed");
                    }
                    Logger logger = C2063z.f6910i;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(AbstractC1776g.m3176c(">> CONNECTION " + AbstractC2045h.f6820a.mo4733b(), new Object[0]));
                    }
                    c2063z.f6911d.mo4713e(AbstractC2045h.f6820a);
                    c2063z.f6911d.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            C2063z c2063z2 = c2054q.f6868z;
            C2036C c2036c2 = c2054q.f6862t;
            c2063z2.getClass();
            AbstractC1665j.m2985e(c2036c2, "settings");
            synchronized (c2063z2) {
                try {
                    if (c2063z2.f6914g) {
                        throw new IOException("closed");
                    }
                    c2063z2.m3780d(0, Integer.bitCount(c2036c2.f6780a) * 6, 4, 0);
                    for (int i5 = 0; i5 < 10; i5++) {
                        boolean z5 = true;
                        if (((1 << i5) & c2036c2.f6780a) == 0) {
                            z5 = false;
                        }
                        if (z5) {
                            c2063z2.f6911d.writeShort(i5);
                            c2063z2.f6911d.writeInt(c2036c2.f6781b[i5]);
                        }
                    }
                    c2063z2.f6911d.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (c2054q.f6862t.m3734a() != 65535) {
                c2054q.f6868z.m3785m(r2 - 65535, 0);
            }
            C1807c.m3275b(c2054q.f6852j.m3283d(), c2054q.f6848f, c2054q.f6844A);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        C1688J c1688j = this.f6346c;
        sb.append(c1688j.f5763a.f5782h.f5871d);
        sb.append(':');
        sb.append(c1688j.f5763a.f5782h.f5872e);
        sb.append(", proxy=");
        sb.append(c1688j.f5764b);
        sb.append(" hostAddress=");
        sb.append(c1688j.f5765c);
        sb.append(" cipherSuite=");
        C1705o c1705o = this.f6349f;
        if (c1705o == null || (obj = c1705o.f5854b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f6350g);
        sb.append('}');
        return sb.toString();
    }
}
