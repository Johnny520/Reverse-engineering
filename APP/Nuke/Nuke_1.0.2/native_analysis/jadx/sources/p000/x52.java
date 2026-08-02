package p000;

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
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x52 {

    /* JADX INFO: renamed from: a */
    public final iy2 f12819a;

    /* JADX INFO: renamed from: b */
    public final ud0 f12820b;

    /* JADX INFO: renamed from: c */
    public final int f12821c;

    /* JADX INFO: renamed from: d */
    public final int f12822d;

    /* JADX INFO: renamed from: e */
    public final int f12823e;

    /* JADX INFO: renamed from: f */
    public final int f12824f;

    /* JADX INFO: renamed from: g */
    public final boolean f12825g;

    /* JADX INFO: renamed from: h */
    public final boolean f12826h;

    /* JADX INFO: renamed from: i */
    public final C0605q5 f12827i;

    /* JADX INFO: renamed from: j */
    public final hh1 f12828j;

    /* JADX INFO: renamed from: k */
    public final s52 f12829k;

    /* JADX INFO: renamed from: l */
    public final boolean f12830l;

    /* JADX INFO: renamed from: m */
    public C0133dk f12831m;

    /* JADX INFO: renamed from: n */
    public kb2 f12832n;

    /* JADX INFO: renamed from: o */
    public hb2 f12833o;

    /* JADX INFO: renamed from: p */
    public final C0017ag f12834p;

    public x52(iy2 iy2Var, ud0 ud0Var, int i, int i2, int i3, int i4, boolean z, boolean z2, C0605q5 c0605q5, hh1 hh1Var, s52 s52Var, k82 k82Var) {
        iy2Var.getClass();
        ud0Var.getClass();
        hh1Var.getClass();
        this.f12819a = iy2Var;
        this.f12820b = ud0Var;
        this.f12821c = i;
        this.f12822d = i2;
        this.f12823e = i3;
        this.f12824f = i4;
        this.f12825g = z;
        this.f12826h = z2;
        this.f12827i = c0605q5;
        this.f12828j = hh1Var;
        this.f12829k = s52Var;
        this.f12830l = !t11.m5086l(k82Var.f5391b, "GET");
        this.f12834p = new C0017ag();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6036a(t52 t52Var) {
        kb2 kb2Var;
        hb2 hb2Var;
        if (this.f12834p.isEmpty() && this.f12833o == null) {
            if (t52Var != null) {
                synchronized (t52Var) {
                    hb2Var = null;
                    if (t52Var.f10572l == 0 && t52Var.f10570j && wg3.m5888a(t52Var.f10563c.f3944a.f8739i, this.f12827i.f8739i)) {
                        hb2Var = t52Var.f10563c;
                    }
                }
                if (hb2Var != null) {
                    this.f12833o = hb2Var;
                    return true;
                }
            }
            C0133dk c0133dk = this.f12831m;
            if ((c0133dk == null || c0133dk.f2081i >= ((ArrayList) c0133dk.f2082j).size()) && (kb2Var = this.f12832n) != null) {
                return kb2Var.m2625a();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final jb2 m6037b() {
        Socket socketM4737m;
        da2 da2Var;
        C0674ry c0674ryM6038c;
        String hostAddress;
        int port;
        List listMo2618d;
        boolean zContains;
        t52 t52Var = this.f12829k.f9921p;
        if (t52Var == null) {
            da2Var = null;
        } else {
            boolean zM5123g = t52Var.m5123g(this.f12830l);
            synchronized (t52Var) {
                boolean z = t52Var.f10570j;
                try {
                    if (!zM5123g) {
                        t52Var.f10570j = true;
                        socketM4737m = this.f12829k.m4737m();
                    } else if (!z) {
                        yw0 yw0Var = t52Var.f10563c.f3944a.f8739i;
                        yw0Var.getClass();
                        yw0 yw0Var2 = this.f12827i.f8739i;
                        socketM4737m = !(yw0Var.f13645e == yw0Var2.f13645e && t11.m5086l(yw0Var.f13644d, yw0Var2.f13644d)) ? this.f12829k.m4737m() : null;
                    }
                } finally {
                }
            }
            if (this.f12829k.f9921p == null) {
                if (socketM4737m != null) {
                    wg3.m5890c(socketM4737m);
                }
                this.f12829k.f9916k.getClass();
                da2Var = null;
            } else {
                if (socketM4737m != null) {
                    C0676s.m4653l("Check failed.");
                    return null;
                }
                da2Var = new da2(t52Var);
            }
        }
        if (da2Var != null) {
            return da2Var;
        }
        da2 da2VarM6039d = m6039d(null, null);
        if (da2VarM6039d != null) {
            return da2VarM6039d;
        }
        if (!this.f12834p.isEmpty()) {
            return (jb2) this.f12834p.removeFirst();
        }
        hb2 hb2Var = this.f12833o;
        if (hb2Var != null) {
            this.f12833o = null;
            c0674ryM6038c = m6038c(hb2Var, null);
        } else {
            C0133dk c0133dk = this.f12831m;
            if (c0133dk == null || c0133dk.f2081i >= ((ArrayList) c0133dk.f2082j).size()) {
                kb2 kb2Var = this.f12832n;
                if (kb2Var == null) {
                    kb2Var = new kb2(this.f12827i, this.f12828j, this.f12829k, this.f12826h);
                    this.f12832n = kb2Var;
                }
                if (!kb2Var.m2625a()) {
                    c80.m678v("exhausted all routes");
                    return null;
                }
                if (!kb2Var.m2625a()) {
                    um2.m5513b();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (kb2Var.f5444f < kb2Var.f5443e.size()) {
                    if (kb2Var.f5444f >= kb2Var.f5443e.size()) {
                        throw new SocketException("No route to " + kb2Var.f5439a.f8739i.f13644d + "; exhausted proxy configurations: " + kb2Var.f5443e);
                    }
                    List list = kb2Var.f5443e;
                    int i = kb2Var.f5444f;
                    kb2Var.f5444f = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    ArrayList arrayList2 = new ArrayList();
                    kb2Var.f5445g = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        yw0 yw0Var3 = kb2Var.f5439a.f8739i;
                        hostAddress = yw0Var3.f13644d;
                        port = yw0Var3.f13645e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            c80.m682z("Proxy.address() is not an InetSocketAddress: ", socketAddressAddress.getClass());
                            return null;
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        if (address == null) {
                            hostAddress = inetSocketAddress.getHostName();
                            hostAddress.getClass();
                        } else {
                            hostAddress = address.getHostAddress();
                            hostAddress.getClass();
                        }
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
                    } else {
                        o72 o72Var = sg3.f10139a;
                        hostAddress.getClass();
                        if (sg3.f10139a.m3539b(hostAddress)) {
                            listMo2618d = AbstractC0179eu.m1434O(InetAddress.getByName(hostAddress));
                        } else {
                            kb2Var.f5441c.f9916k.getClass();
                            listMo2618d = kb2Var.f5439a.f8731a.mo2618d(hostAddress);
                            if (listMo2618d.isEmpty()) {
                                throw new UnknownHostException(kb2Var.f5439a.f8731a + " returned no addresses for " + hostAddress);
                            }
                            kb2Var.f5441c.f9916k.getClass();
                        }
                        if (kb2Var.f5442d && listMo2618d.size() >= 2) {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : listMo2618d) {
                                if (((InetAddress) obj) instanceof Inet6Address) {
                                    arrayList3.add(obj);
                                } else {
                                    arrayList4.add(obj);
                                }
                            }
                            if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                                byte[] bArr = ug3.f11300a;
                                Iterator it = arrayList3.iterator();
                                Iterator it2 = arrayList4.iterator();
                                pb1 pb1VarM1424E = AbstractC0179eu.m1424E();
                                while (true) {
                                    if (!it.hasNext() && !it2.hasNext()) {
                                        break;
                                    }
                                    if (it.hasNext()) {
                                        pb1VarM1424E.add(it.next());
                                    }
                                    if (it2.hasNext()) {
                                        pb1VarM1424E.add(it2.next());
                                    }
                                }
                                listMo2618d = AbstractC0179eu.m1476z(pb1VarM1424E);
                            }
                        }
                        Iterator it3 = listMo2618d.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), port));
                        }
                    }
                    Iterator it4 = kb2Var.f5445g.iterator();
                    while (it4.hasNext()) {
                        hb2 hb2Var2 = new hb2(kb2Var.f5439a, proxy, (InetSocketAddress) it4.next());
                        hh1 hh1Var = kb2Var.f5440b;
                        synchronized (hh1Var) {
                            zContains = ((LinkedHashSet) hh1Var.f4019i).contains(hb2Var2);
                        }
                        if (zContains) {
                            kb2Var.f5446h.add(hb2Var2);
                        } else {
                            arrayList.add(hb2Var2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    AbstractC0325iu.m2393g0(kb2Var.f5446h, arrayList);
                    kb2Var.f5446h.clear();
                }
                C0133dk c0133dk2 = new C0133dk(arrayList);
                this.f12831m = c0133dk2;
                if (this.f12829k.f9929x) {
                    c80.m678v("Canceled");
                    return null;
                }
                if (c0133dk2.f2081i >= arrayList.size()) {
                    um2.m5513b();
                    return null;
                }
                int i2 = c0133dk2.f2081i;
                c0133dk2.f2081i = i2 + 1;
                c0674ryM6038c = m6038c((hb2) arrayList.get(i2), arrayList);
            } else {
                int i3 = c0133dk.f2081i;
                ArrayList arrayList5 = (ArrayList) c0133dk.f2082j;
                if (i3 >= arrayList5.size()) {
                    um2.m5513b();
                    return null;
                }
                int i4 = c0133dk.f2081i;
                c0133dk.f2081i = i4 + 1;
                c0674ryM6038c = m6038c((hb2) arrayList5.get(i4), null);
            }
        }
        da2 da2VarM6039d2 = m6039d(c0674ryM6038c, c0674ryM6038c.f9809k);
        return da2VarM6039d2 != null ? da2VarM6039d2 : c0674ryM6038c;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0674ry m6038c(hb2 hb2Var, ArrayList arrayList) throws UnknownServiceException {
        k82 k82Var;
        c42 c42Var = c42.f1141n;
        hb2Var.getClass();
        C0605q5 c0605q5 = hb2Var.f3944a;
        if (c0605q5.f8733c == null) {
            if (!c0605q5.f8741k.contains(C0790uy.f11549f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = hb2Var.f3944a.f8739i.f13644d;
            zz1 zz1Var = zz1.f14161a;
            if (!zz1.f14161a.mo714f(str)) {
                throw new UnknownServiceException(vi0.m5691j("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (c0605q5.f8740j.contains(c42Var)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        if (hb2Var.f3945b.type() != Proxy.Type.HTTP) {
            k82Var = null;
        } else {
            C0605q5 c0605q52 = hb2Var.f3944a;
            if (c0605q52.f8733c != null || c0605q52.f8740j.contains(c42Var)) {
                C0093cj c0093cj = new C0093cj(4);
                yw0 yw0Var = hb2Var.f3944a.f8739i;
                yw0Var.getClass();
                c0093cj.f1579a = yw0Var;
                c0093cj.m839n("CONNECT", null);
                C0605q5 c0605q53 = hb2Var.f3944a;
                c0093cj.m837l("Host", wg3.m5895h(c0605q53.f8739i, true));
                c0093cj.m837l("Proxy-Connection", "Keep-Alive");
                c0093cj.m837l("User-Agent", "okhttp/5.4.0");
                k82 k82Var2 = new k82(c0093cj);
                t92 t92Var = u92.f11170i;
                ye0 ye0Var = new ye0(1);
                n93.m3262c("Proxy-Authenticate");
                n93.m3263d("OkHttp-Preemptive", "Proxy-Authenticate");
                ye0Var.m6262n("Proxy-Authenticate");
                n93.m3260a(ye0Var, "Proxy-Authenticate", "OkHttp-Preemptive");
                ye0Var.m6250b();
                t92Var.getClass();
                c0605q53.f8736f.getClass();
                k82Var = k82Var2;
            }
        }
        return new C0674ry(this.f12819a, this.f12820b, this.f12821c, this.f12822d, this.f12823e, this.f12824f, this.f12825g, this.f12829k, this, hb2Var, arrayList, k82Var, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x0036, B:22:0x0043, B:25:0x004a), top: B:51:0x0036 }] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final da2 m6039d(C0674ry c0674ry, List list) {
        t52 t52Var;
        boolean z;
        Socket socketM4737m;
        ud0 ud0Var = this.f12820b;
        boolean z2 = this.f12830l;
        C0605q5 c0605q5 = this.f12827i;
        s52 s52Var = this.f12829k;
        boolean z3 = c0674ry != null && c0674ry.mo982e();
        ud0Var.getClass();
        Iterator it = ((ConcurrentLinkedQueue) ud0Var.f11241d).iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                t52Var = null;
                break;
            }
            t52Var = (t52) it.next();
            t52Var.getClass();
            synchronized (t52Var) {
                if (z3) {
                    try {
                        if (!(t52Var.f10569i != null)) {
                            z = false;
                        } else if (t52Var.m5122e(c0605q5, list)) {
                            s52Var.m4729d(t52Var);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                if (t52Var.m5123g(z2)) {
                    break;
                }
                synchronized (t52Var) {
                    t52Var.f10570j = true;
                    socketM4737m = s52Var.m4737m();
                }
                if (socketM4737m != null) {
                    wg3.m5890c(socketM4737m);
                }
            }
        }
        if (t52Var == null) {
            return null;
        }
        if (c0674ry != null) {
            this.f12833o = c0674ry.f9808j;
            Socket socket = c0674ry.f9815q;
            if (socket != null) {
                wg3.m5890c(socket);
            }
        }
        this.f12829k.f9916k.getClass();
        return new da2(t52Var);
    }
}
