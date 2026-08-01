package p138b4;

import com.bumptech.glide.AbstractC1923e;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import p011B4.AbstractC0231b;
import p014C1.C0240b;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0978r;
import p061L2.C0971k;
import p065M2.C0999b;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p118X3.AbstractC1687I;
import p118X3.C1679A;
import p118X3.C1686H;
import p118X3.C1688J;
import p118X3.C1691a;
import p118X3.C1700j;
import p118X3.C1706p;
import p118X3.C1709s;
import p118X3.EnumC1716z;
import p121Y1.C1753n;
import p123Y3.AbstractC1773d;
import p123Y3.AbstractC1774e;
import p123Y3.AbstractC1776g;
import p133a4.C1808d;
import p173h4.AbstractC2263d;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: b4.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1872q {

    /* JADX INFO: renamed from: a */
    public final C1808d f6365a;

    /* JADX INFO: renamed from: b */
    public final C1871p f6366b;

    /* JADX INFO: renamed from: c */
    public final int f6367c;

    /* JADX INFO: renamed from: d */
    public final int f6368d;

    /* JADX INFO: renamed from: e */
    public final int f6369e;

    /* JADX INFO: renamed from: f */
    public final int f6370f;

    /* JADX INFO: renamed from: g */
    public final boolean f6371g;

    /* JADX INFO: renamed from: h */
    public final boolean f6372h;

    /* JADX INFO: renamed from: i */
    public final C1691a f6373i;

    /* JADX INFO: renamed from: j */
    public final C1753n f6374j;

    /* JADX INFO: renamed from: k */
    public final C1869n f6375k;

    /* JADX INFO: renamed from: l */
    public final boolean f6376l;

    /* JADX INFO: renamed from: m */
    public C1876u f6377m;

    /* JADX INFO: renamed from: n */
    public C1877v f6378n;

    /* JADX INFO: renamed from: o */
    public C1688J f6379o;

    /* JADX INFO: renamed from: p */
    public final C0971k f6380p;

    public C1872q(C1808d c1808d, C1871p c1871p, int i5, int i6, int i7, int i8, boolean z5, boolean z6, C1691a c1691a, C1753n c1753n, C1869n c1869n, C1679A c1679a) {
        AbstractC1665j.m2985e(c1808d, "taskRunner");
        AbstractC1665j.m2985e(c1871p, "connectionPool");
        AbstractC1665j.m2985e(c1753n, "routeDatabase");
        this.f6365a = c1808d;
        this.f6366b = c1871p;
        this.f6367c = i5;
        this.f6368d = i6;
        this.f6369e = i7;
        this.f6370f = i8;
        this.f6371g = z5;
        this.f6372h = z6;
        this.f6373i = c1691a;
        this.f6374j = c1753n;
        this.f6375k = c1869n;
        this.f6376l = !AbstractC1665j.m2981a(c1679a.f5713b, "GET");
        this.f6380p = new C0971k();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3364a(C1870o c1870o) {
        C1877v c1877v;
        C1688J c1688j;
        if (this.f6380p.isEmpty() && this.f6379o == null) {
            if (c1870o != null) {
                synchronized (c1870o) {
                    c1688j = null;
                    if (c1870o.f6355l == 0 && c1870o.f6353j && AbstractC1776g.m3174a(c1870o.f6346c.f5763a.f5782h, this.f6373i.f5782h)) {
                        c1688j = c1870o.f6346c;
                    }
                }
                if (c1688j != null) {
                    this.f6379o = c1688j;
                    return true;
                }
            }
            C1876u c1876u = this.f6377m;
            if ((c1876u == null || c1876u.f6385a >= c1876u.f6386b.size()) && (c1877v = this.f6378n) != null) {
                return c1877v.m3369a();
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v50, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final InterfaceC1875t m3365b() {
        Socket socketM3356m;
        C1873r c1873r;
        C1858c c1858cM3366c;
        String hostAddress;
        int port;
        List listM2007e0;
        boolean zContains;
        C1870o c1870o = this.f6375k.f6334l;
        if (c1870o == null) {
            c1873r = null;
        } else {
            boolean zM3361g = c1870o.m3361g(this.f6376l);
            synchronized (c1870o) {
                try {
                    if (zM3361g) {
                        socketM3356m = (c1870o.f6353j || !m3368e(c1870o.f6346c.f5763a.f5782h)) ? this.f6375k.m3356m() : null;
                    } else {
                        c1870o.f6353j = true;
                        socketM3356m = this.f6375k.m3356m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f6375k.f6334l == null) {
                if (socketM3356m != null) {
                    AbstractC1776g.m3175b(socketM3356m);
                }
                this.f6375k.f6329g.getClass();
                c1873r = null;
            } else {
                if (socketM3356m != null) {
                    throw new IllegalStateException("Check failed.");
                }
                c1873r = new C1873r(c1870o);
            }
        }
        if (c1873r != null) {
            return c1873r;
        }
        C1873r c1873rM3367d = m3367d(null, null);
        if (c1873rM3367d != null) {
            return c1873rM3367d;
        }
        if (!this.f6380p.isEmpty()) {
            return (InterfaceC1875t) this.f6380p.removeFirst();
        }
        C1688J c1688j = this.f6379o;
        if (c1688j != null) {
            this.f6379o = null;
            c1858cM3366c = m3366c(c1688j, null);
        } else {
            C1876u c1876u = this.f6377m;
            if (c1876u == null || c1876u.f6385a >= c1876u.f6386b.size()) {
                C1877v c1877v = this.f6378n;
                if (c1877v == null) {
                    c1877v = new C1877v(this.f6373i, this.f6374j, this.f6375k, this.f6372h);
                    this.f6378n = c1877v;
                }
                if (!c1877v.m3369a()) {
                    throw new IOException("exhausted all routes");
                }
                if (!c1877v.m3369a()) {
                    throw new NoSuchElementException();
                }
                ArrayList arrayList = new ArrayList();
                while (c1877v.f6392f < c1877v.f6391e.size()) {
                    if (c1877v.f6392f >= c1877v.f6391e.size()) {
                        throw new SocketException("No route to " + c1877v.f6387a.f5782h.f5871d + "; exhausted proxy configurations: " + c1877v.f6391e);
                    }
                    List list = c1877v.f6391e;
                    int i5 = c1877v.f6392f;
                    c1877v.f6392f = i5 + 1;
                    Proxy proxy = (Proxy) list.get(i5);
                    ArrayList arrayList2 = new ArrayList();
                    c1877v.f6393g = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        C1709s c1709s = c1877v.f6387a.f5782h;
                        hostAddress = c1709s.f5871d;
                        port = c1709s.f5872e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        if (address == null) {
                            hostAddress = inetSocketAddress.getHostName();
                            AbstractC1665j.m2984d(hostAddress, "getHostName(...)");
                        } else {
                            hostAddress = address.getHostAddress();
                            AbstractC1665j.m2984d(hostAddress, "getHostAddress(...)");
                        }
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
                    } else {
                        C1675t c1675t = AbstractC1773d.f6071a;
                        AbstractC1665j.m2985e(hostAddress, "<this>");
                        C1675t c1675t2 = AbstractC1773d.f6071a;
                        c1675t2.getClass();
                        if (((Pattern) c1675t2.f5710e).matcher(hostAddress).matches()) {
                            listM2007e0 = AbstractC2352g.m4211y(InetAddress.getByName(hostAddress));
                        } else {
                            c1877v.f6389c.f6329g.getClass();
                            c1877v.f6387a.f5775a.getClass();
                            try {
                                InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                                AbstractC1665j.m2984d(allByName, "getAllByName(...)");
                                listM2007e0 = AbstractC0972l.m2007e0(allByName);
                                if (listM2007e0.isEmpty()) {
                                    throw new UnknownHostException(c1877v.f6387a.f5775a + " returned no addresses for " + hostAddress);
                                }
                                c1877v.f6389c.f6329g.getClass();
                            } catch (NullPointerException e5) {
                                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostAddress));
                                unknownHostException.initCause(e5);
                                throw unknownHostException;
                            }
                        }
                        if (c1877v.f6390d && listM2007e0.size() >= 2) {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : listM2007e0) {
                                if (((InetAddress) obj) instanceof Inet6Address) {
                                    arrayList3.add(obj);
                                } else {
                                    arrayList4.add(obj);
                                }
                            }
                            if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                                byte[] bArr = AbstractC1774e.f6072a;
                                Iterator it = arrayList3.iterator();
                                Iterator it2 = arrayList4.iterator();
                                C0999b c0999bM4202o = AbstractC2352g.m4202o();
                                while (true) {
                                    if (!it.hasNext() && !it2.hasNext()) {
                                        break;
                                    }
                                    if (it.hasNext()) {
                                        c0999bM4202o.add(it.next());
                                    }
                                    if (it2.hasNext()) {
                                        c0999bM4202o.add(it2.next());
                                    }
                                }
                                listM2007e0 = AbstractC2352g.m4200m(c0999bM4202o);
                            }
                        }
                        Iterator it3 = listM2007e0.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), port));
                        }
                    }
                    Iterator it4 = c1877v.f6393g.iterator();
                    while (it4.hasNext()) {
                        C1688J c1688j2 = new C1688J(c1877v.f6387a, proxy, (InetSocketAddress) it4.next());
                        C1753n c1753n = c1877v.f6388b;
                        synchronized (c1753n) {
                            zContains = ((LinkedHashSet) c1753n.f6028e).contains(c1688j2);
                        }
                        if (zContains) {
                            c1877v.f6394h.add(c1688j2);
                        } else {
                            arrayList.add(c1688j2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    AbstractC0978r.m2032N(c1877v.f6394h, arrayList);
                    c1877v.f6394h.clear();
                }
                C1876u c1876u2 = new C1876u();
                c1876u2.f6386b = arrayList;
                this.f6377m = c1876u2;
                if (this.f6375k.f6342t) {
                    throw new IOException("Canceled");
                }
                if (c1876u2.f6385a >= arrayList.size()) {
                    throw new NoSuchElementException();
                }
                int i6 = c1876u2.f6385a;
                c1876u2.f6385a = i6 + 1;
                c1858cM3366c = m3366c((C1688J) arrayList.get(i6), arrayList);
            } else {
                int i7 = c1876u.f6385a;
                ArrayList arrayList5 = c1876u.f6386b;
                if (i7 >= arrayList5.size()) {
                    throw new NoSuchElementException();
                }
                int i8 = c1876u.f6385a;
                c1876u.f6385a = i8 + 1;
                c1858cM3366c = m3366c((C1688J) arrayList5.get(i8), null);
            }
        }
        C1873r c1873rM3367d2 = m3367d(c1858cM3366c, c1858cM3366c.f6285k);
        return c1873rM3367d2 != null ? c1873rM3367d2 : c1858cM3366c;
    }

    /* JADX INFO: renamed from: c */
    public final C1858c m3366c(C1688J c1688j, ArrayList arrayList) throws UnknownServiceException {
        EnumC1716z enumC1716z = EnumC1716z.f5948j;
        AbstractC1665j.m2985e(c1688j, "route");
        C1691a c1691a = c1688j.f5763a;
        if (c1691a.f5777c == null) {
            if (!c1691a.f5784j.contains(C1700j.f5830f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = c1688j.f5763a.f5782h.f5871d;
            AbstractC2263d abstractC2263d = AbstractC2263d.f7404a;
            if (!AbstractC2263d.f7404a.mo4115g(str)) {
                throw new UnknownServiceException(AbstractC0231b.m400k("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (c1691a.f5783i.contains(enumC1716z)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        C1679A c1679a = null;
        if (c1688j.f5764b.type() == Proxy.Type.HTTP) {
            C1691a c1691a2 = c1688j.f5763a;
            if (c1691a2.f5777c != null || c1691a2.f5783i.contains(enumC1716z)) {
                C0240b c0240b = new C0240b(4);
                C1709s c1709s = c1688j.f5763a.f5782h;
                AbstractC1665j.m2985e(c1709s, "url");
                c0240b.f808a = c1709s;
                c0240b.m438o("CONNECT", null);
                C1691a c1691a3 = c1688j.f5763a;
                c0240b.m436m("Host", AbstractC1776g.m3181h(c1691a3.f5782h, true));
                c0240b.m436m("Proxy-Connection", "Keep-Alive");
                c0240b.m436m("User-Agent", "okhttp/5.4.0");
                c1679a = new C1679A(c0240b);
                C1686H c1686h = AbstractC1687I.f5761e;
                C1706p c1706p = new C1706p(0);
                AbstractC1923e.m3446E("Proxy-Authenticate");
                AbstractC1923e.m3447F("OkHttp-Preemptive", "Proxy-Authenticate");
                c1706p.m3036o("Proxy-Authenticate");
                AbstractC1923e.m3477o(c1706p, "Proxy-Authenticate", "OkHttp-Preemptive");
                c1706p.m3024c();
                AbstractC1665j.m2985e(c1686h, "body");
                c1691a3.f5780f.getClass();
            }
        }
        return new C1858c(this.f6365a, this.f6366b, this.f6367c, this.f6368d, this.f6369e, this.f6370f, this.f6371g, this.f6375k, this, c1688j, arrayList, c1679a, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x0036, B:22:0x0043, B:25:0x004a), top: B:51:0x0036 }] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p138b4.C1873r m3367d(p138b4.C1858c r11, java.util.List r12) {
        /*
            r10 = this;
            b4.p r0 = r10.f6366b
            boolean r1 = r10.f6376l
            X3.a r2 = r10.f6373i
            b4.n r3 = r10.f6375k
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.mo3330e()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            r0.getClass()
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.f6364d
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r7 = "iterator(...)"
            p117X2.AbstractC1665j.m2984d(r0, r7)
        L23:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L6b
            java.lang.Object r7 = r0.next()
            b4.o r7 = (p138b4.C1870o) r7
            p117X2.AbstractC1665j.m2982b(r7)
            monitor-enter(r7)
            if (r6 == 0) goto L43
            e4.q r9 = r7.f6352i     // Catch: java.lang.Throwable -> L41
            if (r9 == 0) goto L3c
            r9 = r5
            goto L3d
        L3c:
            r9 = r4
        L3d:
            if (r9 != 0) goto L43
        L3f:
            r9 = r4
            goto L4e
        L41:
            r11 = move-exception
            goto L69
        L43:
            boolean r9 = r7.m3360e(r2, r12)     // Catch: java.lang.Throwable -> L41
            if (r9 != 0) goto L4a
            goto L3f
        L4a:
            r3.m3349e(r7)     // Catch: java.lang.Throwable -> L41
            r9 = r5
        L4e:
            monitor-exit(r7)
            if (r9 == 0) goto L23
            boolean r9 = r7.m3361g(r1)
            if (r9 == 0) goto L58
            goto L6c
        L58:
            monitor-enter(r7)
            r7.f6353j = r5     // Catch: java.lang.Throwable -> L66
            java.net.Socket r8 = r3.m3356m()     // Catch: java.lang.Throwable -> L66
            monitor-exit(r7)
            if (r8 == 0) goto L23
            p123Y3.AbstractC1776g.m3175b(r8)
            goto L23
        L66:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        L69:
            monitor-exit(r7)
            throw r11
        L6b:
            r7 = r8
        L6c:
            if (r7 != 0) goto L6f
            return r8
        L6f:
            if (r11 == 0) goto L7c
            X3.J r12 = r11.f6284j
            r10.f6379o = r12
            java.net.Socket r11 = r11.f6291q
            if (r11 == 0) goto L7c
            p123Y3.AbstractC1776g.m3175b(r11)
        L7c:
            b4.n r11 = r10.f6375k
            X3.m r11 = r11.f6329g
            r11.getClass()
            b4.r r11 = new b4.r
            r11.<init>(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p138b4.C1872q.m3367d(b4.c, java.util.List):b4.r");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3368e(C1709s c1709s) {
        AbstractC1665j.m2985e(c1709s, "url");
        C1709s c1709s2 = this.f6373i.f5782h;
        return c1709s.f5872e == c1709s2.f5872e && AbstractC1665j.m2981a(c1709s.f5871d, c1709s2.f5871d);
    }
}
