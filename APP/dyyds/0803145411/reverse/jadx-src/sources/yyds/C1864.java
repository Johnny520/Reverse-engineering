package yyds;

import android.security.NetworkSecurityPolicy;
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
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛸᲀᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1864 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public C2718 f9348;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean f9349;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public C1760 f9350;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C1618 f9351;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f9352;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0105 f9353;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public C1369 f9354;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2142 f9355;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean f9356;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final C2729 f9357;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final boolean f9358;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C2014 f9359;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f9360;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final C0217 f9361 = new C0217();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f9362;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f9363;

    public C1864(C0105 c0105, C2142 c2142, int i, int i2, int i3, int i4, boolean z, boolean z2, C1618 c1618, C2014 c2014, C2729 c2729, C2098 c2098) {
        this.f9353 = c0105;
        this.f9355 = c2142;
        this.f9360 = i;
        this.f9363 = i2;
        this.f9352 = i3;
        this.f9362 = i4;
        this.f9356 = z;
        this.f9349 = z2;
        this.f9351 = c1618;
        this.f9359 = c2014;
        this.f9357 = c2729;
        this.f9358 = !AbstractC1544.m3188(c2098.f10390, "GET");
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean m3640(C2723 c2723) {
        C2718 c2718;
        C1369 c1369;
        if (this.f9361.isEmpty() && this.f9354 == null) {
            if (c2723 != null) {
                synchronized (c2723) {
                    c1369 = null;
                    if (c2723.f13385 == 0 && c2723.f13386 && AbstractC0795.m1803(c2723.f13387.f6393.f8234, this.f9351.f8234)) {
                        c1369 = c2723.f13387;
                    }
                }
                if (c1369 != null) {
                    this.f9354 = c1369;
                    return true;
                }
            }
            C1760 c1760 = this.f9350;
            if ((c1760 == null || c1760.f8838 >= ((ArrayList) c1760.f8839).size()) && (c2718 = this.f9348) != null) {
                return c2718.m4827();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC2144 m3641() {
        Socket socketM4856;
        C1061 c1061;
        C2666 c2666M3642;
        String hostName;
        int port;
        List listM3940;
        boolean zContains;
        C2723 c2723 = this.f9357.f13419;
        if (c2723 == null) {
            c1061 = null;
        } else {
            boolean zM4848 = c2723.m4848(this.f9358);
            synchronized (c2723) {
                boolean z = c2723.f13386;
                try {
                    if (!zM4848) {
                        c2723.f13386 = true;
                        socketM4856 = this.f9357.m4856();
                    } else if (!z) {
                        C0082 c0082 = c2723.f13387.f6393.f8234;
                        C0082 c00822 = this.f9351.f8234;
                        socketM4856 = !(c0082.f664 == c00822.f664 && AbstractC1544.m3188(c0082.f670, c00822.f670)) ? this.f9357.m4856() : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f9357.f13419 == null) {
                if (socketM4856 != null) {
                    AbstractC0795.m1808(socketM4856);
                }
                this.f9357.f13425.getClass();
                c1061 = null;
            } else {
                if (socketM4856 != null) {
                    C0188.m800("Check failed.");
                    return null;
                }
                c1061 = new C1061(c2723);
            }
        }
        if (c1061 != null) {
            return c1061;
        }
        C1061 c1061M3643 = m3643(null, null);
        if (c1061M3643 != null) {
            return c1061M3643;
        }
        if (!this.f9361.isEmpty()) {
            return (InterfaceC2144) this.f9361.removeFirst();
        }
        C1369 c1369 = this.f9354;
        if (c1369 != null) {
            this.f9354 = null;
            c2666M3642 = m3642(c1369, null);
        } else {
            C1760 c1760 = this.f9350;
            if (c1760 == null || c1760.f8838 >= ((ArrayList) c1760.f8839).size()) {
                C2718 c2718 = this.f9348;
                if (c2718 == null) {
                    c2718 = new C2718(this.f9351, this.f9359, this.f9357, this.f9349);
                    this.f9348 = c2718;
                }
                if (!c2718.m4827()) {
                    C0188.m804("exhausted all routes");
                    return null;
                }
                if (!c2718.m4827()) {
                    throw new NoSuchElementException();
                }
                ArrayList arrayList = new ArrayList();
                while (c2718.f13353 < c2718.f13348.size()) {
                    if (c2718.f13353 >= c2718.f13348.size()) {
                        throw new SocketException("No route to " + c2718.f13349.f8234.f670 + "; exhausted proxy configurations: " + c2718.f13348);
                    }
                    List list = c2718.f13348;
                    int i = c2718.f13353;
                    c2718.f13353 = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    ArrayList arrayList2 = new ArrayList();
                    c2718.f13351 = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        C0082 c00823 = c2718.f13349.f8234;
                        hostName = c00823.f670;
                        port = c00823.f664;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        arrayList2.add(InetSocketAddress.createUnresolved(hostName, port));
                    } else {
                        if (AbstractC0425.f2171.f548.matcher(hostName).matches()) {
                            listM3940 = Collections.singletonList(InetAddress.getByName(hostName));
                        } else {
                            c2718.f13352.f13425.getClass();
                            c2718.f13349.f8237.getClass();
                            try {
                                listM3940 = AbstractC2070.m3940(InetAddress.getAllByName(hostName));
                                if (listM3940.isEmpty()) {
                                    throw new UnknownHostException(c2718.f13349.f8237 + " returned no addresses for " + hostName);
                                }
                                c2718.f13352.f13425.getClass();
                            } catch (NullPointerException e) {
                                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                                unknownHostException.initCause(e);
                                throw unknownHostException;
                            }
                        }
                        if (c2718.f13354 && listM3940.size() >= 2) {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : listM3940) {
                                if (((InetAddress) obj) instanceof Inet6Address) {
                                    arrayList3.add(obj);
                                } else {
                                    arrayList4.add(obj);
                                }
                            }
                            Pair pair = new Pair(arrayList3, arrayList4);
                            List list2 = (List) pair.component1();
                            List list3 = (List) pair.component2();
                            if (!list2.isEmpty() && !list3.isEmpty()) {
                                byte[] bArr = AbstractC1429.f6782;
                                Iterator it = list2.iterator();
                                Iterator it2 = list3.iterator();
                                C2578 c2578M3296 = AbstractC0024.m3296();
                                while (true) {
                                    if (!it.hasNext() && !it2.hasNext()) {
                                        break;
                                    }
                                    if (it.hasNext()) {
                                        c2578M3296.add(it.next());
                                    }
                                    if (it2.hasNext()) {
                                        c2578M3296.add(it2.next());
                                    }
                                }
                                listM3940 = AbstractC0024.m3305(c2578M3296);
                            }
                        }
                        Iterator it3 = listM3940.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), port));
                        }
                    }
                    Iterator it4 = c2718.f13351.iterator();
                    while (it4.hasNext()) {
                        C1369 c13692 = new C1369(c2718.f13349, proxy, (InetSocketAddress) it4.next());
                        C2014 c2014 = c2718.f13350;
                        synchronized (c2014) {
                            zContains = ((LinkedHashSet) c2014.f10074).contains(c13692);
                        }
                        if (zContains) {
                            c2718.f13347.add(c13692);
                        } else {
                            arrayList.add(c13692);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    AbstractC1432.m2928(c2718.f13347, arrayList);
                    c2718.f13347.clear();
                }
                C1760 c17602 = new C1760(8, arrayList);
                this.f9350 = c17602;
                if (this.f9357.f13422) {
                    C0188.m804("Canceled");
                    return null;
                }
                if (c17602.f8838 >= arrayList.size()) {
                    throw new NoSuchElementException();
                }
                int i2 = c17602.f8838;
                c17602.f8838 = i2 + 1;
                c2666M3642 = m3642((C1369) arrayList.get(i2), arrayList);
            } else {
                int i3 = c1760.f8838;
                ArrayList arrayList5 = (ArrayList) c1760.f8839;
                if (i3 >= arrayList5.size()) {
                    throw new NoSuchElementException();
                }
                int i4 = c1760.f8838;
                c1760.f8838 = i4 + 1;
                c2666M3642 = m3642((C1369) arrayList5.get(i4), null);
            }
        }
        C1061 c1061M36432 = m3643(c2666M3642, c2666M3642.f13096);
        return c1061M36432 != null ? c1061M36432 : c2666M3642;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2666 m3642(C1369 c1369, ArrayList arrayList) throws UnknownServiceException {
        EnumC0940 enumC0940 = EnumC0940.H2_PRIOR_KNOWLEDGE;
        C1618 c1618 = c1369.f6393;
        if (c1618.f8241 == null) {
            if (!c1618.f8240.contains(C2640.f13019)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = c1369.f6393.f8234.f670;
            C1966 c1966 = AbstractC1325.f6087;
            AbstractC1325.f6087.getClass();
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str)) {
                throw new UnknownServiceException(AbstractC2104.m4014("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (c1618.f8235.contains(enumC0940)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        C2098 c2098 = null;
        if (c1369.f6394.type() == Proxy.Type.HTTP) {
            C1618 c16182 = c1369.f6393;
            if (c16182.f8241 != null || c16182.f8235.contains(enumC0940)) {
                C1633 c1633 = new C1633();
                c1633.f8333 = c1369.f6393.f8234;
                c1633.m3335("CONNECT", null);
                C1618 c16183 = c1369.f6393;
                ((C2135) c1633.f8331).m4070("Host", AbstractC0795.m1801(c16183.f8234, true));
                ((C2135) c1633.f8331).m4070("Proxy-Connection", "Keep-Alive");
                ((C2135) c1633.f8331).m4070("User-Agent", "okhttp/5.4.0");
                C2098 c20982 = new C2098(c1633);
                C0261 c0261 = AbstractC0379.f1953;
                C1586 c1586 = InterfaceC1414.f6696;
                C2135 c2135 = new C2135(2);
                EnumC0940 enumC09402 = EnumC0940.HTTP_1_1;
                c2135.m4070("Proxy-Authenticate", "OkHttp-Preemptive");
                C2098 c2098Mo1278 = c16183.f8242.mo1278(c1369, new C0837(c20982, enumC09402, "Preemptive Authenticate", 407, null, AbstractC0797.m1823(c2135), c0261, null, null, null, null, -1L, -1L, null, c1586));
                c2098 = c2098Mo1278 == null ? c20982 : c2098Mo1278;
            }
        }
        return new C2666(this.f9353, this.f9355, this.f9360, this.f9363, this.f9352, this.f9362, this.f9356, this.f9357, this, c1369, arrayList, 0, c2098, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x002b, B:22:0x0038, B:25:0x003f), top: B:51:0x002b }] */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1061 m3643(C2666 c2666, List list) {
        C2723 c2723;
        boolean z;
        Socket socketM4856;
        C2142 c2142 = this.f9355;
        boolean z2 = this.f9358;
        C1618 c1618 = this.f9351;
        C2729 c2729 = this.f9357;
        boolean z3 = c2666 != null && c2666.mo2227();
        Iterator it = c2142.f10582.iterator();
        while (true) {
            if (!it.hasNext()) {
                c2723 = null;
                break;
            }
            c2723 = (C2723) it.next();
            synchronized (c2723) {
                if (z3) {
                    try {
                        if (!(c2723.f13378 != null)) {
                            z = false;
                        } else if (c2723.m4847(c1618, list)) {
                            c2729.m4858(c2723);
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
                if (c2723.m4848(z2)) {
                    break;
                }
                synchronized (c2723) {
                    c2723.f13386 = true;
                    socketM4856 = c2729.m4856();
                }
                if (socketM4856 != null) {
                    AbstractC0795.m1808(socketM4856);
                }
            }
        }
        if (c2723 == null) {
            return null;
        }
        if (c2666 != null) {
            this.f9354 = c2666.f13098;
            Socket socket = c2666.f13090;
            if (socket != null) {
                AbstractC0795.m1808(socket);
            }
        }
        this.f9357.f13425.getClass();
        return new C1061(c2723);
    }
}
