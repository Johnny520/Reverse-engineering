package defpackage;

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
    public final iy2 a;
    public final ud0 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final q5 i;
    public final hh1 j;
    public final s52 k;
    public final boolean l;
    public dk m;
    public kb2 n;
    public hb2 o;
    public final ag p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x52(iy2 iy2Var, ud0 ud0Var, int i, int i2, int i3, int i4, boolean z, boolean z2, q5 q5Var, hh1 hh1Var, s52 s52Var, k82 k82Var) {
        iy2Var.getClass();
        ud0Var.getClass();
        hh1Var.getClass();
        this.a = iy2Var;
        this.b = ud0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = q5Var;
        this.j = hh1Var;
        this.k = s52Var;
        this.l = !t11.l(k82Var.b, "GET");
        this.p = new ag();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(t52 t52Var) {
        kb2 kb2Var;
        hb2 hb2Var;
        if (this.p.isEmpty() && this.o == null) {
            if (t52Var != null) {
                synchronized (t52Var) {
                    hb2Var = null;
                    if (t52Var.l == 0 && t52Var.j && wg3.a(t52Var.c.a.i, this.i.i)) {
                        hb2Var = t52Var.c;
                    }
                }
                if (hb2Var != null) {
                    this.o = hb2Var;
                    return true;
                }
            }
            dk dkVar = this.m;
            if ((dkVar == null || dkVar.i >= ((ArrayList) dkVar.j).size()) && (kb2Var = this.n) != null) {
                return kb2Var.a();
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final jb2 b() {
        Socket socketM;
        da2 da2Var;
        ry ryVarC;
        String hostAddress;
        int port;
        List listD;
        boolean zContains;
        t52 t52Var = this.k.p;
        if (t52Var == null) {
            da2Var = null;
        } else {
            boolean zG = t52Var.g(this.l);
            synchronized (t52Var) {
                boolean z = t52Var.j;
                try {
                    if (!zG) {
                        t52Var.j = true;
                        socketM = this.k.m();
                    } else if (!z) {
                        yw0 yw0Var = t52Var.c.a.i;
                        yw0Var.getClass();
                        yw0 yw0Var2 = this.i.i;
                        socketM = !(yw0Var.e == yw0Var2.e && t11.l(yw0Var.d, yw0Var2.d)) ? this.k.m() : null;
                    }
                } finally {
                }
            }
            if (this.k.p == null) {
                if (socketM != null) {
                    wg3.c(socketM);
                }
                this.k.k.getClass();
                da2Var = null;
            } else {
                if (socketM != null) {
                    s.l("Check failed.");
                    return null;
                }
                da2Var = new da2(t52Var);
            }
        }
        if (da2Var != null) {
            return da2Var;
        }
        da2 da2VarD = d(null, null);
        if (da2VarD != null) {
            return da2VarD;
        }
        if (!this.p.isEmpty()) {
            return (jb2) this.p.removeFirst();
        }
        hb2 hb2Var = this.o;
        if (hb2Var != null) {
            this.o = null;
            ryVarC = c(hb2Var, null);
        } else {
            dk dkVar = this.m;
            if (dkVar == null || dkVar.i >= ((ArrayList) dkVar.j).size()) {
                kb2 kb2Var = this.n;
                if (kb2Var == null) {
                    kb2Var = new kb2(this.i, this.j, this.k, this.h);
                    this.n = kb2Var;
                }
                if (!kb2Var.a()) {
                    c80.v("exhausted all routes");
                    return null;
                }
                if (!kb2Var.a()) {
                    um2.b();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (kb2Var.f < kb2Var.e.size()) {
                    if (kb2Var.f >= kb2Var.e.size()) {
                        throw new SocketException("No route to " + kb2Var.a.i.d + "; exhausted proxy configurations: " + kb2Var.e);
                    }
                    List list = kb2Var.e;
                    int i = kb2Var.f;
                    kb2Var.f = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    ArrayList arrayList2 = new ArrayList();
                    kb2Var.g = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        yw0 yw0Var3 = kb2Var.a.i;
                        hostAddress = yw0Var3.d;
                        port = yw0Var3.e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            c80.z("Proxy.address() is not an InetSocketAddress: ", socketAddressAddress.getClass());
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
                        o72 o72Var = sg3.a;
                        hostAddress.getClass();
                        if (sg3.a.b(hostAddress)) {
                            listD = eu.O(InetAddress.getByName(hostAddress));
                        } else {
                            kb2Var.c.k.getClass();
                            listD = kb2Var.a.a.d(hostAddress);
                            if (listD.isEmpty()) {
                                throw new UnknownHostException(kb2Var.a.a + " returned no addresses for " + hostAddress);
                            }
                            kb2Var.c.k.getClass();
                        }
                        if (kb2Var.d && listD.size() >= 2) {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : listD) {
                                if (((InetAddress) obj) instanceof Inet6Address) {
                                    arrayList3.add(obj);
                                } else {
                                    arrayList4.add(obj);
                                }
                            }
                            if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                                byte[] bArr = ug3.a;
                                Iterator it = arrayList3.iterator();
                                Iterator it2 = arrayList4.iterator();
                                pb1 pb1VarE = eu.E();
                                while (true) {
                                    if (!it.hasNext() && !it2.hasNext()) {
                                        break;
                                    }
                                    if (it.hasNext()) {
                                        pb1VarE.add(it.next());
                                    }
                                    if (it2.hasNext()) {
                                        pb1VarE.add(it2.next());
                                    }
                                }
                                listD = eu.z(pb1VarE);
                            }
                        }
                        Iterator it3 = listD.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), port));
                        }
                    }
                    Iterator it4 = kb2Var.g.iterator();
                    while (it4.hasNext()) {
                        hb2 hb2Var2 = new hb2(kb2Var.a, proxy, (InetSocketAddress) it4.next());
                        hh1 hh1Var = kb2Var.b;
                        synchronized (hh1Var) {
                            zContains = ((LinkedHashSet) hh1Var.i).contains(hb2Var2);
                        }
                        if (zContains) {
                            kb2Var.h.add(hb2Var2);
                        } else {
                            arrayList.add(hb2Var2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    iu.g0(kb2Var.h, arrayList);
                    kb2Var.h.clear();
                }
                dk dkVar2 = new dk(arrayList);
                this.m = dkVar2;
                if (this.k.x) {
                    c80.v("Canceled");
                    return null;
                }
                if (dkVar2.i >= arrayList.size()) {
                    um2.b();
                    return null;
                }
                int i2 = dkVar2.i;
                dkVar2.i = i2 + 1;
                ryVarC = c((hb2) arrayList.get(i2), arrayList);
            } else {
                int i3 = dkVar.i;
                ArrayList arrayList5 = (ArrayList) dkVar.j;
                if (i3 >= arrayList5.size()) {
                    um2.b();
                    return null;
                }
                int i4 = dkVar.i;
                dkVar.i = i4 + 1;
                ryVarC = c((hb2) arrayList5.get(i4), null);
            }
        }
        da2 da2VarD2 = d(ryVarC, ryVarC.k);
        return da2VarD2 != null ? da2VarD2 : ryVarC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ry c(hb2 hb2Var, ArrayList arrayList) throws UnknownServiceException {
        k82 k82Var;
        c42 c42Var = c42.n;
        hb2Var.getClass();
        q5 q5Var = hb2Var.a;
        if (q5Var.c == null) {
            if (!q5Var.k.contains(uy.f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = hb2Var.a.i.d;
            zz1 zz1Var = zz1.a;
            if (!zz1.a.f(str)) {
                throw new UnknownServiceException(vi0.j("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (q5Var.j.contains(c42Var)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        if (hb2Var.b.type() != Proxy.Type.HTTP) {
            k82Var = null;
        } else {
            q5 q5Var2 = hb2Var.a;
            if (q5Var2.c != null || q5Var2.j.contains(c42Var)) {
                cj cjVar = new cj(4);
                yw0 yw0Var = hb2Var.a.i;
                yw0Var.getClass();
                cjVar.a = yw0Var;
                cjVar.n("CONNECT", null);
                q5 q5Var3 = hb2Var.a;
                cjVar.l("Host", wg3.h(q5Var3.i, true));
                cjVar.l("Proxy-Connection", "Keep-Alive");
                cjVar.l("User-Agent", "okhttp/5.4.0");
                k82 k82Var2 = new k82(cjVar);
                t92 t92Var = u92.i;
                ye0 ye0Var = new ye0(1);
                n93.c("Proxy-Authenticate");
                n93.d("OkHttp-Preemptive", "Proxy-Authenticate");
                ye0Var.n("Proxy-Authenticate");
                n93.a(ye0Var, "Proxy-Authenticate", "OkHttp-Preemptive");
                ye0Var.b();
                t92Var.getClass();
                q5Var3.f.getClass();
                k82Var = k82Var2;
            }
        }
        return new ry(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.k, this, hb2Var, arrayList, k82Var, -1, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x0036, B:22:0x0043, B:25:0x004a), top: B:51:0x0036 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final da2 d(ry ryVar, List list) {
        t52 t52Var;
        boolean z;
        Socket socketM;
        ud0 ud0Var = this.b;
        boolean z2 = this.l;
        q5 q5Var = this.i;
        s52 s52Var = this.k;
        boolean z3 = ryVar != null && ryVar.e();
        ud0Var.getClass();
        Iterator it = ((ConcurrentLinkedQueue) ud0Var.d).iterator();
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
                        if (!(t52Var.i != null)) {
                            z = false;
                        } else if (t52Var.e(q5Var, list)) {
                            s52Var.d(t52Var);
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
                if (t52Var.g(z2)) {
                    break;
                }
                synchronized (t52Var) {
                    t52Var.j = true;
                    socketM = s52Var.m();
                }
                if (socketM != null) {
                    wg3.c(socketM);
                }
            }
        }
        if (t52Var == null) {
            return null;
        }
        if (ryVar != null) {
            this.o = ryVar.j;
            Socket socket = ryVar.q;
            if (socket != null) {
                wg3.c(socket);
            }
        }
        this.k.k.getClass();
        return new da2(t52Var);
    }
}
