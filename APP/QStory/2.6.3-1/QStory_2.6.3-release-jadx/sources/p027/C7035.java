package p027;

import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0954;
import androidx.compose.p001ui.graphics.vector.C2397;
import androidx.compose.runtime.internal.C2080;
import bsh.C3466;
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
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.C5183;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.Regex;
import lin.xposed.hook.javaplugin.C6385;
import okhttp3.Protocol;
import p023.AbstractC6957;
import p023.C6949;
import p023.C6954;
import p023.C6958;
import p023.C6968;
import p023.C6978;
import p023.C6981;
import p029.AbstractC7054;
import p029.AbstractC7055;
import p029.AbstractC7059;
import p031.C7063;
import p033.AbstractC7067;
import p050.AbstractC7176;
import p191.AbstractC8568;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7035 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f17438;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f17439;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f17440;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17441;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7034 f17442;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7063 f17443;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C7031 f17444;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C0954 f17445;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C6949 f17446;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5183 f17447;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f17448;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f17449;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C7032 f17450;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f17451;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C6968 f17452;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C6686 f17453;

    public C7035(C7063 c7063, C7034 c7034, int i, int i2, int i3, int i4, boolean z, boolean z2, C6968 c6968, C6686 c6686, C7032 c7032, C6954 c6954) {
        c7063.getClass();
        c7034.getClass();
        c6686.getClass();
        this.f17443 = c7063;
        this.f17442 = c7034;
        this.f17441 = i;
        this.f17440 = i2;
        this.f17439 = i3;
        this.f17438 = i4;
        this.f17449 = z;
        this.f17448 = z2;
        this.f17452 = c6968;
        this.f17453 = c6686;
        this.f17450 = c7032;
        this.f17451 = !AbstractC5227.m9466(c6954.f17060, "GET");
        this.f17447 = new C5183();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:14:0x0034, B:22:0x0041, B:25:0x0048), top: B:53:0x0034 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7029 m12202(C7025 c7025, List list) {
        C7036 c7036;
        boolean z;
        Socket socketM12197;
        C7034 c7034 = this.f17442;
        boolean z2 = this.f17451;
        C6968 c6968 = this.f17452;
        C7032 c7032 = this.f17450;
        boolean z3 = c7025 != null && c7025.isReady();
        c7034.getClass();
        Iterator it = c7034.f17434.iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                c7036 = null;
                break;
            }
            c7036 = (C7036) it.next();
            c7036.getClass();
            synchronized (c7036) {
                if (z3) {
                    try {
                        if (!(c7036.f17468 != null)) {
                            z = false;
                        } else if (c7036.m12207(c6968, list)) {
                            c7032.m12196(c7036);
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
                if (c7036.m12210(z2)) {
                    break;
                }
                synchronized (c7036) {
                    c7036.f17469 = true;
                    socketM12197 = c7032.m12197();
                }
                if (socketM12197 != null) {
                    AbstractC7059.m12255(socketM12197);
                }
            }
        }
        if (c7036 == null) {
            return null;
        }
        if (c7025 != null) {
            this.f17446 = c7025.f17401;
            Socket socket = c7025.f17392;
            if (socket != null) {
                AbstractC7059.m12255(socket);
            }
        }
        return new C7029(c7036);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7025 m12203(C6949 c6949, ArrayList arrayList) throws UnknownServiceException {
        C6954 c6954;
        c6949.getClass();
        C6968 c6968 = c6949.f17047;
        if (c6968.f17157 == null) {
            if (!c6968.f17163.contains(C6981.f17241)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = c6949.f17047.f17160.f17226;
            AbstractC7067 abstractC7067 = AbstractC7067.f17543;
            if (!AbstractC7067.f17543.mo12280(str)) {
                throw new UnknownServiceException(AbstractC0900.m718("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (c6968.f17162.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        if (c6949.f17046.type() != Proxy.Type.HTTP) {
            c6954 = null;
        } else {
            C6968 c69682 = c6949.f17047;
            if (c69682.f17157 != null || c69682.f17162.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
                C2080 c2080 = new C2080(6);
                C6978 c6978 = c6949.f17047.f17160;
                c6978.getClass();
                c2080.f3965 = c6978;
                c2080.m2718("CONNECT", null);
                C6968 c69683 = c6949.f17047;
                c2080.m2716("Host", AbstractC7059.m12261(c69683.f17160, true));
                c2080.m2716("Proxy-Connection", "Keep-Alive");
                c2080.m2716("User-Agent", "okhttp/5.3.2");
                C6954 c69542 = new C6954(c2080);
                C6958 c6958 = AbstractC6957.f17094;
                C2397 c2397 = new C2397(6, false);
                Protocol.HTTP_1_1.getClass();
                AbstractC8568.m13617("Proxy-Authenticate");
                AbstractC8568.m13616("OkHttp-Preemptive", "Proxy-Authenticate");
                c2397.m3404("Proxy-Authenticate");
                AbstractC8568.m13641(c2397, "Proxy-Authenticate", "OkHttp-Preemptive");
                c2397.m3398();
                c6958.getClass();
                c69683.f17154.getClass();
                c6954 = c69542;
            }
        }
        return new C7025(this.f17443, this.f17442, this.f17441, this.f17440, this.f17439, this.f17438, this.f17449, this.f17450, this, c6949, arrayList, c6954, -1, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7030 m12204() {
        Socket socketM12197;
        C7029 c7029;
        C7025 c7025M12203;
        String hostAddress;
        int port;
        List listBuild;
        boolean zContains;
        C7036 c7036 = this.f17450.f17426;
        if (c7036 == null) {
            c7029 = null;
        } else {
            boolean zM12210 = c7036.m12210(this.f17451);
            synchronized (c7036) {
                boolean z = c7036.f17469;
                try {
                    if (!zM12210) {
                        c7036.f17469 = true;
                        socketM12197 = this.f17450.m12197();
                    } else if (!z) {
                        C6978 c6978 = c7036.f17457.f17047.f17160;
                        c6978.getClass();
                        C6978 c69782 = this.f17452.f17160;
                        socketM12197 = !(c6978.f17225 == c69782.f17225 && AbstractC5227.m9466(c6978.f17226, c69782.f17226)) ? this.f17450.m12197() : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f17450.f17426 == null) {
                if (socketM12197 != null) {
                    AbstractC7059.m12255(socketM12197);
                }
                c7029 = null;
            } else {
                if (socketM12197 != null) {
                    C6755.m11870("Check failed.");
                    return null;
                }
                c7029 = new C7029(c7036);
            }
        }
        if (c7029 != null) {
            return c7029;
        }
        C7029 c7029M12202 = m12202(null, null);
        if (c7029M12202 != null) {
            return c7029M12202;
        }
        if (!this.f17447.isEmpty()) {
            return (InterfaceC7030) this.f17447.removeFirst();
        }
        C6949 c6949 = this.f17446;
        if (c6949 != null) {
            this.f17446 = null;
            c7025M12203 = m12203(c6949, null);
        } else {
            C0954 c0954 = this.f17445;
            if (c0954 == null || c0954.f659 >= ((ArrayList) c0954.f660).size()) {
                C7031 c7031 = this.f17444;
                if (c7031 == null) {
                    c7031 = new C7031(this.f17452, this.f17453, this.f17450, this.f17448);
                    this.f17444 = c7031;
                }
                if (!c7031.m12190()) {
                    C6755.m11866("exhausted all routes");
                    return null;
                }
                if (!c7031.m12190()) {
                    C3466.m5896();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (c7031.f17409 < c7031.f17410.size()) {
                    C6968 c6968 = c7031.f17413;
                    if (c7031.f17409 >= c7031.f17410.size()) {
                        throw new SocketException("No route to " + c6968.f17160.f17226 + "; exhausted proxy configurations: " + c7031.f17410);
                    }
                    List list = c7031.f17410;
                    int i = c7031.f17409;
                    c7031.f17409 = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    ArrayList arrayList2 = new ArrayList();
                    c7031.f17408 = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        C6978 c69783 = c6968.f17160;
                        hostAddress = c69783.f17226;
                        port = c69783.f17225;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            C6385.m11431(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
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
                        Regex regex = AbstractC7055.f17504;
                        hostAddress.getClass();
                        if (AbstractC7055.f17504.matches(hostAddress)) {
                            listBuild = AbstractC7176.m12487(InetAddress.getByName(hostAddress));
                        } else {
                            List listMo12115 = c6968.f17159.mo12115(hostAddress);
                            if (listMo12115.isEmpty()) {
                                throw new UnknownHostException(c6968.f17159 + " returned no addresses for " + hostAddress);
                            }
                            listBuild = listMo12115;
                        }
                        if (c7031.f17411 && listBuild.size() >= 2) {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : listBuild) {
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
                                byte[] bArr = AbstractC7054.f17503;
                                Iterator it = list2.iterator();
                                Iterator it2 = list3.iterator();
                                ListBuilder listBuilderM12470 = AbstractC7176.m12470();
                                while (true) {
                                    if (!it.hasNext() && !it2.hasNext()) {
                                        break;
                                    }
                                    if (it.hasNext()) {
                                        listBuilderM12470.add(it.next());
                                    }
                                    if (it2.hasNext()) {
                                        listBuilderM12470.add(it2.next());
                                    }
                                }
                                listBuild = listBuilderM12470.build();
                            }
                        }
                        Iterator it3 = listBuild.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), port));
                        }
                    }
                    Iterator it4 = c7031.f17408.iterator();
                    while (it4.hasNext()) {
                        C6949 c69492 = new C6949(c7031.f17413, proxy, (InetSocketAddress) it4.next());
                        C6686 c6686 = c7031.f17412;
                        synchronized (c6686) {
                            zContains = ((LinkedHashSet) c6686.f16359).contains(c69492);
                        }
                        if (zContains) {
                            c7031.f17414.add(c69492);
                        } else {
                            arrayList.add(c69492);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    AbstractC5176.m9363(c7031.f17414, arrayList);
                    c7031.f17414.clear();
                }
                C0954 c09542 = new C0954(arrayList);
                this.f17445 = c09542;
                if (this.f17450.f17423) {
                    C6755.m11866("Canceled");
                    return null;
                }
                if (c09542.f659 >= arrayList.size()) {
                    C3466.m5896();
                    return null;
                }
                int i2 = c09542.f659;
                c09542.f659 = i2 + 1;
                c7025M12203 = m12203((C6949) arrayList.get(i2), arrayList);
            } else {
                int i3 = c0954.f659;
                ArrayList arrayList5 = (ArrayList) c0954.f660;
                if (i3 >= arrayList5.size()) {
                    C3466.m5896();
                    return null;
                }
                int i4 = c0954.f659;
                c0954.f659 = i4 + 1;
                c7025M12203 = m12203((C6949) arrayList5.get(i4), null);
            }
        }
        C7029 c7029M122022 = m12202(c7025M12203, c7025M12203.f17398);
        return c7029M122022 != null ? c7029M122022 : c7025M12203;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m12205(C7036 c7036) {
        C7031 c7031;
        C6949 c6949;
        if (this.f17447.isEmpty() && this.f17446 == null) {
            if (c7036 != null) {
                synchronized (c7036) {
                    c6949 = null;
                    if (c7036.f17467 == 0 && c7036.f17469 && AbstractC7059.m12257(c7036.f17457.f17047.f17160, this.f17452.f17160)) {
                        c6949 = c7036.f17457;
                    }
                }
                if (c6949 != null) {
                    this.f17446 = c6949;
                    return true;
                }
            }
            C0954 c0954 = this.f17445;
            if ((c0954 == null || c0954.f659 >= ((ArrayList) c0954.f660).size()) && (c7031 = this.f17444) != null) {
                return c7031.m12190();
            }
        }
        return true;
    }
}
