package Yue;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7187 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1201 f21679 = new C1201(null);

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final C3175 f2725;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final C7185 f2726;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3645 f21680;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final AbstractC4712 f21681;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public List<? extends Proxy> f21682;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f21683;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public List<? extends InetSocketAddress> f21684;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public final List<C7184> f21685;

    /* JADX INFO: renamed from: Yue.ۥۡۧ۠ۦ$ۥ */
    public static final class C1201 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۧ۠ۦ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1201(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final String m3476(@InterfaceC6399 InetSocketAddress inetSocketAddress) {
            C5499.m17103(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                C5499.m17102(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            C5499.m17102(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1201() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧ۠ۦ$ۥ۟ */
    public static final class C1202 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final List<C7184> f2727;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f2728;

        public C1202(@InterfaceC6399 List<C7184> list) {
            C5499.m17103(list, "routes");
            this.f2727 = list;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final List<C7184> m3477() {
            return this.f2727;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m3478() {
            return this.f2728 < this.f2727.size();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C7184 m22515() {
            if (!m3478()) {
                throw new NoSuchElementException();
            }
            List<C7184> list = this.f2727;
            int i = this.f2728;
            this.f2728 = i + 1;
            return list.get(i);
        }
    }

    public C7187(@InterfaceC6399 C3175 c3175, @InterfaceC6399 C7185 c7185, @InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 AbstractC4712 abstractC4712) {
        C5499.m17103(c3175, "address");
        C5499.m17103(c7185, "routeDatabase");
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(abstractC4712, "eventListener");
        this.f2725 = c3175;
        this.f2726 = c7185;
        this.f21680 = interfaceC3645;
        this.f21681 = abstractC4712;
        this.f21682 = C3880.m10735();
        this.f21684 = C3880.m10735();
        this.f21685 = new ArrayList();
        m22514(c3175.m6514(), c3175.m6509());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final List<Proxy> m22510(Proxy proxy, C5385 c5385, C7187 c7187) {
        if (proxy != null) {
            return C3879.m10715(proxy);
        }
        URI uriM16791 = c5385.m16791();
        if (uriM16791.getHost() == null) {
            return C8158.m26858(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = c7187.f2725.m6511().select(uriM16791);
        if (listSelect == null || listSelect.isEmpty()) {
            return C8158.m26858(Proxy.NO_PROXY);
        }
        C5499.m17102(listSelect, "proxiesOrNull");
        return C8158.m26889(listSelect);
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m3474() {
        return m3475() || (this.f21685.isEmpty() ^ true);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m3475() {
        return this.f21683 < this.f21682.size();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C1202 m22511() throws IOException {
        if (!m3474()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m3475()) {
            Proxy proxyM22512 = m22512();
            Iterator<? extends InetSocketAddress> it = this.f21684.iterator();
            while (it.hasNext()) {
                C7184 c7184 = new C7184(this.f2725, proxyM22512, it.next());
                if (this.f2726.m22508(c7184)) {
                    this.f21685.add(c7184);
                } else {
                    arrayList.add(c7184);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            C3885.m10772(arrayList, this.f21685);
            this.f21685.clear();
        }
        return new C1202(arrayList);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Proxy m22512() throws IOException {
        if (m3475()) {
            List<? extends Proxy> list = this.f21682;
            int i = this.f21683;
            this.f21683 = i + 1;
            Proxy proxy = list.get(i);
            m22513(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f2725.m6514().m16772() + "; exhausted proxy configurations: " + this.f21682);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m22513(Proxy proxy) throws IOException {
        String strM16772;
        int iM16779;
        List<InetAddress> listMo1404;
        ArrayList arrayList = new ArrayList();
        this.f21684 = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strM16772 = this.f2725.m6514().m16772();
            iM16779 = this.f2725.m6514().m16779();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            C1201 c1201 = f21679;
            C5499.m17102(socketAddressAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strM16772 = c1201.m3476(inetSocketAddress);
            iM16779 = inetSocketAddress.getPort();
        }
        if (1 > iM16779 || iM16779 >= 65536) {
            throw new SocketException("No route to " + strM16772 + ':' + iM16779 + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strM16772, iM16779));
            return;
        }
        if (C8158.m26840(strM16772)) {
            listMo1404 = C3879.m10715(InetAddress.getByName(strM16772));
        } else {
            this.f21681.mo14060(this.f21680, strM16772);
            listMo1404 = this.f2725.m6505().mo1404(strM16772);
            if (listMo1404.isEmpty()) {
                throw new UnknownHostException(this.f2725.m6505() + " returned no addresses for " + strM16772);
            }
            this.f21681.mo14059(this.f21680, strM16772, listMo1404);
        }
        Iterator<InetAddress> it = listMo1404.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), iM16779));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m22514(C5385 c5385, Proxy proxy) {
        this.f21681.mo14062(this.f21680, c5385);
        List<Proxy> listM22510 = m22510(proxy, c5385, this);
        this.f21682 = listM22510;
        this.f21683 = 0;
        this.f21681.mo14061(this.f21680, c5385, listM22510);
    }
}
