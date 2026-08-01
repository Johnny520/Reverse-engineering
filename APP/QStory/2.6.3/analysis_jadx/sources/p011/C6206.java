package p011;

import androidx.appcompat.app.C0107;
import bsh.C2633;
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
import kotlin.collections.AbstractC4344;
import kotlin.collections.C4351;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.Regex;
import lin.xposed.hook.javaplugin.C5554;
import p007.C6120;
import p007.C6125;
import p007.C6139;
import p007.C6149;
import p013.AbstractC6225;
import p013.AbstractC6226;
import p013.AbstractC6230;
import p015.C6234;
import p034.AbstractC6347;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6206 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f17093;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f17094;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f17095;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17096;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6205 f17097;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6234 f17098;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C6202 f17099;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C0107 f17100;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C6120 f17101;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4351 f17102;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f17103;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f17104;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C6203 f17105;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f17106;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C6139 f17107;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C5856 f17108;

    public C6206(C6234 c6234, C6205 c6205, int i, int i2, int i3, int i4, boolean z, boolean z2, C6139 c6139, C5856 c5856, C6203 c6203, C6125 c6125) {
        c6234.getClass();
        c6205.getClass();
        c5856.getClass();
        this.f17098 = c6234;
        this.f17097 = c6205;
        this.f17096 = i;
        this.f17095 = i2;
        this.f17094 = i3;
        this.f17093 = i4;
        this.f17104 = z;
        this.f17103 = z2;
        this.f17107 = c6139;
        this.f17108 = c5856;
        this.f17105 = c6203;
        this.f17106 = !AbstractC4395.m8907(c6125.f16715, "GET");
        this.f17102 = new C4351();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:14:0x0034, B:22:0x0041, B:25:0x0048), top: B:53:0x0034 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p011.C6200 m11643(p011.C6196 r11, java.util.List r12) {
        /*
            r10 = this;
            飘花落叶言世兰楪哲子苏.飘花落叶言子楪哲兰世苏 r0 = r10.f17097
            boolean r1 = r10.f17106
            飘花落叶言世兰子哲苏楪.飘花落叶言子楪世苏哲兰 r2 = r10.f17107
            飘花落叶言世兰楪哲子苏.飘花落叶言子楪哲世兰苏 r3 = r10.f17105
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
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.f17089
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L21:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L69
            java.lang.Object r7 = r0.next()
            飘花落叶言世兰楪哲子苏.飘花落叶言子楪哲苏世兰 r7 = (p011.C6207) r7
            r7.getClass()
            monitor-enter(r7)
            if (r6 == 0) goto L41
            飘花落叶言世兰苏子哲楪.飘花落叶言子楪哲苏世兰 r9 = r7.f17123     // Catch: java.lang.Throwable -> L3f
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
            boolean r9 = r7.m11648(r2, r12)     // Catch: java.lang.Throwable -> L3f
            if (r9 != 0) goto L48
            goto L3d
        L48:
            r3.m11637(r7)     // Catch: java.lang.Throwable -> L3f
            r9 = r5
        L4c:
            monitor-exit(r7)
            if (r9 == 0) goto L21
            boolean r9 = r7.m11651(r1)
            if (r9 == 0) goto L56
            goto L6a
        L56:
            monitor-enter(r7)
            r7.f17124 = r5     // Catch: java.lang.Throwable -> L64
            java.net.Socket r8 = r3.m11638()     // Catch: java.lang.Throwable -> L64
            monitor-exit(r7)
            if (r8 == 0) goto L21
            p013.AbstractC6230.m11696(r8)
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
            飘花落叶言世兰子哲苏楪.飘花落叶言子世哲楪苏兰 r12 = r11.f17056
            r10.f17101 = r12
            java.net.Socket r10 = r11.f17047
            if (r10 == 0) goto L7a
            p013.AbstractC6230.m11696(r10)
        L7a:
            飘花落叶言世兰楪哲子苏.飘花落叶言子楪兰世苏哲 r10 = new 飘花落叶言世兰楪哲子苏.飘花落叶言子楪兰世苏哲
            r10.<init>(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p011.C6206.m11643(飘花落叶言世兰楪哲子苏.飘花落叶言子楪世哲苏兰, java.util.List):飘花落叶言世兰楪哲子苏.飘花落叶言子楪兰世苏哲");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p011.C6196 m11644(p007.C6120 r16, java.util.ArrayList r17) throws java.net.UnknownServiceException {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p011.C6206.m11644(飘花落叶言世兰子哲苏楪.飘花落叶言子世哲楪苏兰, java.util.ArrayList):飘花落叶言世兰楪哲子苏.飘花落叶言子楪世哲苏兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6201 m11645() {
        Socket socketM11638;
        C6200 c6200;
        C6196 c6196M11644;
        String hostAddress;
        int port;
        List listBuild;
        boolean zContains;
        C6207 c6207 = this.f17105.f17081;
        if (c6207 == null) {
            c6200 = null;
        } else {
            boolean zM11651 = c6207.m11651(this.f17106);
            synchronized (c6207) {
                boolean z = c6207.f17124;
                try {
                    if (!zM11651) {
                        c6207.f17124 = true;
                        socketM11638 = this.f17105.m11638();
                    } else if (!z) {
                        C6149 c6149 = c6207.f17112.f16702.f16815;
                        c6149.getClass();
                        C6149 c61492 = this.f17107.f16815;
                        socketM11638 = !(c6149.f16880 == c61492.f16880 && AbstractC4395.m8907(c6149.f16881, c61492.f16881)) ? this.f17105.m11638() : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f17105.f17081 == null) {
                if (socketM11638 != null) {
                    AbstractC6230.m11696(socketM11638);
                }
                c6200 = null;
            } else {
                if (socketM11638 != null) {
                    C5925.m11311("Check failed.");
                    return null;
                }
                c6200 = new C6200(c6207);
            }
        }
        if (c6200 != null) {
            return c6200;
        }
        C6200 c6200M11643 = m11643(null, null);
        if (c6200M11643 != null) {
            return c6200M11643;
        }
        if (!this.f17102.isEmpty()) {
            return (InterfaceC6201) this.f17102.removeFirst();
        }
        C6120 c6120 = this.f17101;
        if (c6120 != null) {
            this.f17101 = null;
            c6196M11644 = m11644(c6120, null);
        } else {
            C0107 c0107 = this.f17100;
            if (c0107 == null || c0107.f314 >= ((ArrayList) c0107.f315).size()) {
                C6202 c6202 = this.f17099;
                if (c6202 == null) {
                    c6202 = new C6202(this.f17107, this.f17108, this.f17105, this.f17103);
                    this.f17099 = c6202;
                }
                if (!c6202.m11631()) {
                    C5925.m11307("exhausted all routes");
                    return null;
                }
                if (!c6202.m11631()) {
                    C2633.m5336();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (c6202.f17064 < c6202.f17065.size()) {
                    C6139 c6139 = c6202.f17068;
                    if (c6202.f17064 >= c6202.f17065.size()) {
                        throw new SocketException("No route to " + c6139.f16815.f16881 + "; exhausted proxy configurations: " + c6202.f17065);
                    }
                    List list = c6202.f17065;
                    int i = c6202.f17064;
                    c6202.f17064 = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    ArrayList arrayList2 = new ArrayList();
                    c6202.f17063 = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        C6149 c61493 = c6139.f16815;
                        hostAddress = c61493.f16881;
                        port = c61493.f16880;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            C5554.m10872(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
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
                        Regex regex = AbstractC6226.f17159;
                        hostAddress.getClass();
                        if (AbstractC6226.f17159.matches(hostAddress)) {
                            listBuild = AbstractC6347.m11928(InetAddress.getByName(hostAddress));
                        } else {
                            List listMo11556 = c6139.f16814.mo11556(hostAddress);
                            if (listMo11556.isEmpty()) {
                                throw new UnknownHostException(c6139.f16814 + " returned no addresses for " + hostAddress);
                            }
                            listBuild = listMo11556;
                        }
                        if (c6202.f17066 && listBuild.size() >= 2) {
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
                                byte[] bArr = AbstractC6225.f17158;
                                Iterator it = list2.iterator();
                                Iterator it2 = list3.iterator();
                                ListBuilder listBuilderM11911 = AbstractC6347.m11911();
                                while (true) {
                                    if (!it.hasNext() && !it2.hasNext()) {
                                        break;
                                    }
                                    if (it.hasNext()) {
                                        listBuilderM11911.add(it.next());
                                    }
                                    if (it2.hasNext()) {
                                        listBuilderM11911.add(it2.next());
                                    }
                                }
                                listBuild = listBuilderM11911.build();
                            }
                        }
                        Iterator it3 = listBuild.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), port));
                        }
                    }
                    Iterator it4 = c6202.f17063.iterator();
                    while (it4.hasNext()) {
                        C6120 c61202 = new C6120(c6202.f17068, proxy, (InetSocketAddress) it4.next());
                        C5856 c5856 = c6202.f17067;
                        synchronized (c5856) {
                            zContains = ((LinkedHashSet) c5856.f16014).contains(c61202);
                        }
                        if (zContains) {
                            c6202.f17069.add(c61202);
                        } else {
                            arrayList.add(c61202);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    AbstractC4344.m8804(c6202.f17069, arrayList);
                    c6202.f17069.clear();
                }
                C0107 c01072 = new C0107(arrayList);
                this.f17100 = c01072;
                if (this.f17105.f17078) {
                    C5925.m11307("Canceled");
                    return null;
                }
                if (c01072.f314 >= arrayList.size()) {
                    C2633.m5336();
                    return null;
                }
                int i2 = c01072.f314;
                c01072.f314 = i2 + 1;
                c6196M11644 = m11644((C6120) arrayList.get(i2), arrayList);
            } else {
                int i3 = c0107.f314;
                ArrayList arrayList5 = (ArrayList) c0107.f315;
                if (i3 >= arrayList5.size()) {
                    C2633.m5336();
                    return null;
                }
                int i4 = c0107.f314;
                c0107.f314 = i4 + 1;
                c6196M11644 = m11644((C6120) arrayList5.get(i4), null);
            }
        }
        C6200 c6200M116432 = m11643(c6196M11644, c6196M11644.f17053);
        return c6200M116432 != null ? c6200M116432 : c6196M11644;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m11646(C6207 c6207) {
        C6202 c6202;
        C6120 c6120;
        if (this.f17102.isEmpty() && this.f17101 == null) {
            if (c6207 != null) {
                synchronized (c6207) {
                    c6120 = null;
                    if (c6207.f17122 == 0 && c6207.f17124 && AbstractC6230.m11698(c6207.f17112.f16702.f16815, this.f17107.f16815)) {
                        c6120 = c6207.f17112;
                    }
                }
                if (c6120 != null) {
                    this.f17101 = c6120;
                    return true;
                }
            }
            C0107 c0107 = this.f17100;
            if ((c0107 == null || c0107.f314 >= ((ArrayList) c0107.f315).size()) && (c6202 = this.f17099) != null) {
                return c6202.m11631();
            }
        }
        return true;
    }
}
