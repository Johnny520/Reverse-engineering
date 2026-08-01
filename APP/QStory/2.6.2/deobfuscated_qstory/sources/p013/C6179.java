package p013;

import androidx.appcompat.app.C0107;
import bsh.C2632;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.C4350;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.Regex;
import lin.xposed.hook.javaplugin.C5553;
import p012.C6164;
import p015.C6193;
import p015.C6198;
import p015.C6212;
import p015.C6222;
import p017.AbstractC6233;
import p017.AbstractC6234;
import p017.AbstractC6238;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6179 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f16884;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f16885;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f16886;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f16887;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6182 f16888;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6164 f16889;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C6176 f16890;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C0107 f16891;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C6193 f16892;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4350 f16893;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f16894;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f16895;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C6177 f16896;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f16897;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C6212 f16898;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C5851 f16899;

    public C6179(C6164 c6164, C6182 c6182, int i, int i2, int i3, int i4, boolean z, boolean z2, C6212 c6212, C5851 c5851, C6177 c6177, C6198 c6198) {
        c6164.getClass();
        c6182.getClass();
        c5851.getClass();
        this.f16889 = c6164;
        this.f16888 = c6182;
        this.f16887 = i;
        this.f16886 = i2;
        this.f16885 = i3;
        this.f16884 = i4;
        this.f16895 = z;
        this.f16894 = z2;
        this.f16898 = c6212;
        this.f16899 = c5851;
        this.f16896 = c6177;
        this.f16897 = !AbstractC4394.m8917(c6198.f16954, "GET");
        this.f16893 = new C4350();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:14:0x0034, B:22:0x0041, B:25:0x0048), top: B:53:0x0034 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p013.C6180 m11623(p013.C6171 r11, java.util.List r12) {
        /*
            r10 = this;
            飘花落叶言世兰楪哲苏子.飘花落叶言子楪哲苏兰世 r0 = r10.f16888
            boolean r1 = r10.f16897
            飘花落叶言世兰楪子苏哲.飘花落叶言子楪世苏哲兰 r2 = r10.f16898
            飘花落叶言世兰楪哲苏子.飘花落叶言子楪哲世兰苏 r3 = r10.f16896
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.isReady()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            r0.getClass()
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.f16917
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L21:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L69
            java.lang.Object r7 = r0.next()
            飘花落叶言世兰楪哲苏子.飘花落叶言子楪哲苏世兰 r7 = (p013.C6181) r7
            r7.getClass()
            monitor-enter(r7)
            if (r6 == 0) goto L41
            飘花落叶言世兰苏楪子哲.飘花落叶言子楪哲苏世兰 r9 = r7.f16915     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L3a
            r9 = r5
            goto L3b
        L3a:
            r9 = r4
        L3b:
            if (r9 != 0) goto L41
        L3d:
            r9 = r4
            goto L4c
        L3f:
            r10 = move-exception
            goto L67
        L41:
            boolean r9 = r7.m11628(r2, r12)     // Catch: java.lang.Throwable -> L3f
            if (r9 != 0) goto L48
            goto L3d
        L48:
            r3.m11618(r7)     // Catch: java.lang.Throwable -> L3f
            r9 = r5
        L4c:
            monitor-exit(r7)
            if (r9 == 0) goto L21
            boolean r9 = r7.m11631(r1)
            if (r9 == 0) goto L56
            goto L6a
        L56:
            monitor-enter(r7)
            r7.f16916 = r5     // Catch: java.lang.Throwable -> L64
            java.net.Socket r8 = r3.m11619()     // Catch: java.lang.Throwable -> L64
            monitor-exit(r7)
            if (r8 == 0) goto L21
            p017.AbstractC6238.m11704(r8)
            goto L21
        L64:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        L67:
            monitor-exit(r7)
            throw r10
        L69:
            r7 = r8
        L6a:
            if (r7 != 0) goto L6d
            return r8
        L6d:
            if (r11 == 0) goto L7a
            飘花落叶言世兰楪子苏哲.飘花落叶言子世哲楪苏兰 r12 = r11.f16852
            r10.f16892 = r12
            java.net.Socket r10 = r11.f16843
            if (r10 == 0) goto L7a
            p017.AbstractC6238.m11704(r10)
        L7a:
            飘花落叶言世兰楪哲苏子.飘花落叶言子楪哲兰苏世 r10 = new 飘花落叶言世兰楪哲苏子.飘花落叶言子楪哲兰苏世
            r10.<init>(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p013.C6179.m11623(飘花落叶言世兰楪哲苏子.飘花落叶言子楪世哲苏兰, java.util.List):飘花落叶言世兰楪哲苏子.飘花落叶言子楪哲兰苏世");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p013.C6171 m11624(p015.C6193 r16, java.util.ArrayList r17) throws java.net.UnknownServiceException {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p013.C6179.m11624(飘花落叶言世兰楪子苏哲.飘花落叶言子世哲楪苏兰, java.util.ArrayList):飘花落叶言世兰楪哲苏子.飘花落叶言子楪世哲苏兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6174 m11625() {
        Socket socketM11619;
        C6180 c6180;
        C6171 c6171M11624;
        String hostAddress;
        int port;
        List listBuild;
        boolean zContains;
        C6181 c6181 = this.f16896.f16876;
        if (c6181 == null) {
            c6180 = null;
        } else {
            boolean zM11631 = c6181.m11631(this.f16897);
            synchronized (c6181) {
                boolean z = c6181.f16916;
                try {
                    if (!zM11631) {
                        c6181.f16916 = true;
                        socketM11619 = this.f16896.m11619();
                    } else if (!z) {
                        C6222 c6222 = c6181.f16904.f16941.f17054;
                        c6222.getClass();
                        C6222 c62222 = this.f16898.f17054;
                        socketM11619 = !(c6222.f17119 == c62222.f17119 && AbstractC4394.m8917(c6222.f17120, c62222.f17120)) ? this.f16896.m11619() : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f16896.f16876 == null) {
                if (socketM11619 != null) {
                    AbstractC6238.m11704(socketM11619);
                }
                c6180 = null;
            } else {
                if (socketM11619 != null) {
                    C5919.m11250("Check failed.");
                    return null;
                }
                c6180 = new C6180(c6181);
            }
        }
        if (c6180 != null) {
            return c6180;
        }
        C6180 c6180M11623 = m11623(null, null);
        if (c6180M11623 != null) {
            return c6180M11623;
        }
        if (!this.f16893.isEmpty()) {
            return (InterfaceC6174) this.f16893.removeFirst();
        }
        C6193 c6193 = this.f16892;
        if (c6193 != null) {
            this.f16892 = null;
            c6171M11624 = m11624(c6193, null);
        } else {
            C0107 c0107 = this.f16891;
            if (c0107 == null || c0107.f314 >= ((ArrayList) c0107.f315).size()) {
                C6176 c6176 = this.f16890;
                if (c6176 == null) {
                    c6176 = new C6176(this.f16898, this.f16899, this.f16896, this.f16894);
                    this.f16890 = c6176;
                }
                if (!c6176.m11612()) {
                    C5919.m11246("exhausted all routes");
                    return null;
                }
                if (!c6176.m11612()) {
                    C2632.m5291();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (c6176.f16859 < c6176.f16860.size()) {
                    C6212 c6212 = c6176.f16863;
                    if (c6176.f16859 >= c6176.f16860.size()) {
                        throw new SocketException("No route to " + c6212.f17054.f17120 + "; exhausted proxy configurations: " + c6176.f16860);
                    }
                    List list = c6176.f16860;
                    int i = c6176.f16859;
                    c6176.f16859 = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    ArrayList arrayList2 = new ArrayList();
                    c6176.f16858 = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        C6222 c62223 = c6212.f17054;
                        hostAddress = c62223.f17120;
                        port = c62223.f17119;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            C5553.m10815(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
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
                        Regex regex = AbstractC6234.f17182;
                        hostAddress.getClass();
                        if (AbstractC6234.f17182.matches(hostAddress)) {
                            listBuild = AbstractC8189.m13660(InetAddress.getByName(hostAddress));
                        } else {
                            List listMo11642 = c6212.f17053.mo11642(hostAddress);
                            if (listMo11642.isEmpty()) {
                                throw new UnknownHostException(c6212.f17053 + " returned no addresses for " + hostAddress);
                            }
                            listBuild = listMo11642;
                        }
                        if (c6176.f16861 && listBuild.size() >= 2) {
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
                                byte[] bArr = AbstractC6233.f17181;
                                Iterator it = list2.iterator();
                                Iterator it2 = list3.iterator();
                                ListBuilder listBuilderM13685 = AbstractC8189.m13685();
                                while (true) {
                                    if (!it.hasNext() && !it2.hasNext()) {
                                        break;
                                    }
                                    if (it.hasNext()) {
                                        listBuilderM13685.add(it.next());
                                    }
                                    if (it2.hasNext()) {
                                        listBuilderM13685.add(it2.next());
                                    }
                                }
                                listBuild = listBuilderM13685.build();
                            }
                        }
                        Iterator it3 = listBuild.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), port));
                        }
                    }
                    Iterator it4 = c6176.f16858.iterator();
                    while (it4.hasNext()) {
                        C6193 c61932 = new C6193(c6176.f16863, proxy, (InetSocketAddress) it4.next());
                        C5851 c5851 = c6176.f16862;
                        synchronized (c5851) {
                            zContains = ((LinkedHashSet) c5851.f16007).contains(c61932);
                        }
                        if (zContains) {
                            c6176.f16864.add(c61932);
                        } else {
                            arrayList.add(c61932);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    AbstractC4343.m8794(c6176.f16864, arrayList);
                    c6176.f16864.clear();
                }
                C0107 c01072 = new C0107(arrayList);
                this.f16891 = c01072;
                if (this.f16896.f16873) {
                    C5919.m11246("Canceled");
                    return null;
                }
                if (c01072.f314 >= arrayList.size()) {
                    C2632.m5291();
                    return null;
                }
                int i2 = c01072.f314;
                c01072.f314 = i2 + 1;
                c6171M11624 = m11624((C6193) arrayList.get(i2), arrayList);
            } else {
                int i3 = c0107.f314;
                ArrayList arrayList5 = (ArrayList) c0107.f315;
                if (i3 >= arrayList5.size()) {
                    C2632.m5291();
                    return null;
                }
                int i4 = c0107.f314;
                c0107.f314 = i4 + 1;
                c6171M11624 = m11624((C6193) arrayList5.get(i4), null);
            }
        }
        C6180 c6180M116232 = m11623(c6171M11624, c6171M11624.f16849);
        return c6180M116232 != null ? c6180M116232 : c6171M11624;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m11626(C6181 c6181) {
        C6176 c6176;
        C6193 c6193;
        if (this.f16893.isEmpty() && this.f16892 == null) {
            if (c6181 != null) {
                synchronized (c6181) {
                    c6193 = null;
                    if (c6181.f16914 == 0 && c6181.f16916 && AbstractC6238.m11706(c6181.f16904.f16941.f17054, this.f16898.f17054)) {
                        c6193 = c6181.f16904;
                    }
                }
                if (c6193 != null) {
                    this.f16892 = c6193;
                    return true;
                }
            }
            C0107 c0107 = this.f16891;
            if ((c0107 == null || c0107.f314 >= ((ArrayList) c0107.f315).size()) && (c6176 = this.f16890) != null) {
                return c6176.m11612();
            }
        }
        return true;
    }
}
