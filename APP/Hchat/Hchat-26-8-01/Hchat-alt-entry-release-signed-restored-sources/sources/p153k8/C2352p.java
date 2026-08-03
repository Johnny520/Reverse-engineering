package p153k8;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.HttpUrl;
import p003a2.C0014a;
import p077f8.C1083c;
import p077f8.C1087g;
import p077f8.C1088h;
import p077f8.InterfaceC1084d;
import p089g1.C1275d;
import p096g8.C1360a;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p125i8.C2005i;

/* JADX INFO: renamed from: k8.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2352p {

    /* JADX INFO: renamed from: a */
    public final C2347k f7729a;

    /* JADX INFO: renamed from: b */
    public final C2345i f7730b;

    /* JADX INFO: renamed from: c */
    public final C2353q f7731c;

    /* JADX INFO: renamed from: d */
    public final C1360a f7732d;

    /* JADX INFO: renamed from: e */
    public final C1275d f7733e;

    /* JADX INFO: renamed from: f */
    public final CopyOnWriteArrayList f7734f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f7735g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    public volatile boolean f7736h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f7737i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2352p(C2347k c2347k, C2345i c2345i, C2353q c2353q, C1360a c1360a, C1275d c1275d) {
        this.f7729a = c2347k;
        this.f7730b = c2345i;
        this.f7731c = c2353q;
        this.f7732d = c1360a;
        this.f7733e = c1275d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5636a(C2351o c2351o) {
        Iterator it = this.f7734f.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC2350n) it.next()).mo973a(c2351o);
            } catch (Throwable th2) {
                String str = "消息观察回调失败: " + th2.getMessage();
                if (this.f7733e != null) {
                    C2005i.m4939f("[WeChatMessageObserveApi] ".concat(str));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized void m5637b() {
        try {
            C2347k c2347k = this.f7729a;
            boolean z9 = false;
            boolean z10 = c2347k != null && c2347k.m5612c();
            if (z10 && !this.f7736h) {
                C2347k c2347k2 = this.f7729a;
                final int i9 = 0;
                InterfaceC1084d interfaceC1084d = new InterfaceC1084d(this) { // from class: k8.l

                    /* JADX INFO: renamed from: h */
                    public final /* synthetic */ C2352p f7710h;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.f7710h = this;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
                    @Override // p077f8.InterfaceC1084d
                    /* JADX INFO: renamed from: b */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void mo468b(Object obj) {
                        int iInferType;
                        boolean z11;
                        switch (i9) {
                            case 0:
                                C2352p c2352p = this.f7710h;
                                C1360a c1360a = c2352p.f7732d;
                                C2353q c2353q = c2352p.f7731c;
                                C1087g c1087g = (C1087g) obj;
                                if (c1087g != null) {
                                    String str = c1087g.f3488c;
                                    String str2 = c1087g.f3495j;
                                    String str3 = c1087g.f3489d;
                                    String strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
                                    String strM5643c = c2353q != null ? C2353q.m5643c(c1087g.f3486a, "nativeurl") : HttpUrl.FRAGMENT_ENCODE_SET;
                                    String str4 = c1087g.f3490e;
                                    if (!TextUtils.isEmpty(str4)) {
                                        try {
                                            iInferType = Integer.parseInt(str4);
                                            break;
                                        } catch (Throwable unused) {
                                        }
                                        if (iInferType <= 0) {
                                            iInferType = WeChatMessage.inferType(str3);
                                        }
                                    }
                                    int i10 = iInferType;
                                    if (!c1087g.f3496k) {
                                        String str5 = c1087g.f3487b;
                                        String strM3652c2 = c1360a != null ? c1360a.m3652c() : HttpUrl.FRAGMENT_ENCODE_SET;
                                        z11 = !TextUtils.isEmpty(strM3652c2) && strM3652c2.equals(str5);
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        str2 = "add_msg";
                                    }
                                    String str6 = c1087g.f3488c;
                                    String str7 = c1087g.f3487b;
                                    String str8 = c1087g.f3489d;
                                    long j3 = c1087g.f3491f;
                                    long jCurrentTimeMillis = j3 > 0 ? j3 * 1000 : System.currentTimeMillis();
                                    long j4 = c1087g.f3492g;
                                    String str9 = c1087g.f3493h;
                                    if (c1360a != null) {
                                        strM3652c = c1360a.m3652c();
                                    }
                                    boolean z12 = z11;
                                    WeChatMessage weChatMessageFromTransient = WeChatMessage.fromTransient(str6, str7, str8, jCurrentTimeMillis, z12, i10, j4, str9, strM3652c);
                                    String strM5639d = c2352p.m5639d(weChatMessageFromTransient);
                                    if (z12 && !"local_send".equals(str2)) {
                                        ConcurrentHashMap concurrentHashMap = c2352p.f7735g;
                                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
                                            concurrentHashMap.put(str + '\n' + str3, Long.valueOf(System.currentTimeMillis()));
                                            if (concurrentHashMap.size() >= 64) {
                                                concurrentHashMap.entrySet().removeIf(new C2346j(System.currentTimeMillis(), 1));
                                            }
                                        }
                                        C2343g.m5580d(str, str3);
                                    }
                                    String str10 = c1087g.f3488c;
                                    c2352p.m5636a(new C2351o(str2, strM5639d, str10, c1087g.f3487b, c1087g.f3489d, c1087g.f3486a, strM5643c, c2353q != null && C2353q.m5646f(str10), z12, null, weChatMessageFromTransient));
                                    break;
                                }
                                break;
                            default:
                                C1088h c1088h = (C1088h) obj;
                                if (c1088h != null) {
                                    String str11 = c1088h.f3500d;
                                    String str12 = c1088h.f3499c;
                                    String str13 = c1088h.f3497a;
                                    C2352p c2352p2 = this.f7710h;
                                    C1360a c1360a2 = c2352p2.f7732d;
                                    String strM3652c3 = c1360a2 != null ? c1360a2.m3652c() : HttpUrl.FRAGMENT_ENCODE_SET;
                                    boolean z13 = !TextUtils.isEmpty(strM3652c3) && strM3652c3.equals(str13);
                                    long jCurrentTimeMillis2 = c1088h.f3501e;
                                    if (jCurrentTimeMillis2 <= 100000000000L) {
                                        jCurrentTimeMillis2 = jCurrentTimeMillis2 > 0 ? jCurrentTimeMillis2 * 1000 : System.currentTimeMillis();
                                    }
                                    c2352p2.m5636a(new C2351o("pat_pb", "pat", str11, str13, str12, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, c2352p2.f7731c != null && C2353q.m5646f(str11), z13, null, WeChatMessage.fromTransient(str11, str13, str12, jCurrentTimeMillis2, z13, 10000, c1088h.f3502f), str13, c1088h.f3498b, str12, c1088h.f3501e));
                                    break;
                                }
                                break;
                        }
                    }
                };
                C1083c c1083c = c2347k2.f7704d;
                if (c1083c != null) {
                    c1083c.m2716c(C1087g.class, interfaceC1084d);
                }
                C2347k c2347k3 = this.f7729a;
                final int i10 = 1;
                InterfaceC1084d interfaceC1084d2 = new InterfaceC1084d(this) { // from class: k8.l

                    /* JADX INFO: renamed from: h */
                    public final /* synthetic */ C2352p f7710h;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.f7710h = this;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
                    @Override // p077f8.InterfaceC1084d
                    /* JADX INFO: renamed from: b */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void mo468b(Object obj) {
                        int iInferType;
                        boolean z11;
                        switch (i10) {
                            case 0:
                                C2352p c2352p = this.f7710h;
                                C1360a c1360a = c2352p.f7732d;
                                C2353q c2353q = c2352p.f7731c;
                                C1087g c1087g = (C1087g) obj;
                                if (c1087g != null) {
                                    String str = c1087g.f3488c;
                                    String str2 = c1087g.f3495j;
                                    String str3 = c1087g.f3489d;
                                    String strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
                                    String strM5643c = c2353q != null ? C2353q.m5643c(c1087g.f3486a, "nativeurl") : HttpUrl.FRAGMENT_ENCODE_SET;
                                    String str4 = c1087g.f3490e;
                                    if (!TextUtils.isEmpty(str4)) {
                                        try {
                                            iInferType = Integer.parseInt(str4);
                                            break;
                                        } catch (Throwable unused) {
                                        }
                                        if (iInferType <= 0) {
                                            iInferType = WeChatMessage.inferType(str3);
                                        }
                                    }
                                    int i102 = iInferType;
                                    if (!c1087g.f3496k) {
                                        String str5 = c1087g.f3487b;
                                        String strM3652c2 = c1360a != null ? c1360a.m3652c() : HttpUrl.FRAGMENT_ENCODE_SET;
                                        z11 = !TextUtils.isEmpty(strM3652c2) && strM3652c2.equals(str5);
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        str2 = "add_msg";
                                    }
                                    String str6 = c1087g.f3488c;
                                    String str7 = c1087g.f3487b;
                                    String str8 = c1087g.f3489d;
                                    long j3 = c1087g.f3491f;
                                    long jCurrentTimeMillis = j3 > 0 ? j3 * 1000 : System.currentTimeMillis();
                                    long j4 = c1087g.f3492g;
                                    String str9 = c1087g.f3493h;
                                    if (c1360a != null) {
                                        strM3652c = c1360a.m3652c();
                                    }
                                    boolean z12 = z11;
                                    WeChatMessage weChatMessageFromTransient = WeChatMessage.fromTransient(str6, str7, str8, jCurrentTimeMillis, z12, i102, j4, str9, strM3652c);
                                    String strM5639d = c2352p.m5639d(weChatMessageFromTransient);
                                    if (z12 && !"local_send".equals(str2)) {
                                        ConcurrentHashMap concurrentHashMap = c2352p.f7735g;
                                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
                                            concurrentHashMap.put(str + '\n' + str3, Long.valueOf(System.currentTimeMillis()));
                                            if (concurrentHashMap.size() >= 64) {
                                                concurrentHashMap.entrySet().removeIf(new C2346j(System.currentTimeMillis(), 1));
                                            }
                                        }
                                        C2343g.m5580d(str, str3);
                                    }
                                    String str10 = c1087g.f3488c;
                                    c2352p.m5636a(new C2351o(str2, strM5639d, str10, c1087g.f3487b, c1087g.f3489d, c1087g.f3486a, strM5643c, c2353q != null && C2353q.m5646f(str10), z12, null, weChatMessageFromTransient));
                                    break;
                                }
                                break;
                            default:
                                C1088h c1088h = (C1088h) obj;
                                if (c1088h != null) {
                                    String str11 = c1088h.f3500d;
                                    String str12 = c1088h.f3499c;
                                    String str13 = c1088h.f3497a;
                                    C2352p c2352p2 = this.f7710h;
                                    C1360a c1360a2 = c2352p2.f7732d;
                                    String strM3652c3 = c1360a2 != null ? c1360a2.m3652c() : HttpUrl.FRAGMENT_ENCODE_SET;
                                    boolean z13 = !TextUtils.isEmpty(strM3652c3) && strM3652c3.equals(str13);
                                    long jCurrentTimeMillis2 = c1088h.f3501e;
                                    if (jCurrentTimeMillis2 <= 100000000000L) {
                                        jCurrentTimeMillis2 = jCurrentTimeMillis2 > 0 ? jCurrentTimeMillis2 * 1000 : System.currentTimeMillis();
                                    }
                                    c2352p2.m5636a(new C2351o("pat_pb", "pat", str11, str13, str12, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, c2352p2.f7731c != null && C2353q.m5646f(str11), z13, null, WeChatMessage.fromTransient(str11, str13, str12, jCurrentTimeMillis2, z13, 10000, c1088h.f3502f), str13, c1088h.f3498b, str12, c1088h.f3501e));
                                    break;
                                }
                                break;
                        }
                    }
                };
                C1083c c1083c2 = c2347k3.f7704d;
                if (c1083c2 != null) {
                    c1083c2.m2716c(C1088h.class, interfaceC1084d2);
                }
                this.f7736h = true;
            }
            C2345i c2345i = this.f7730b;
            if (c2345i != null && c2345i.m5607b() && !this.f7737i) {
                this.f7730b.m5608e(new C2349m(this, 0));
                this.f7737i = true;
            }
            StringBuilder sb2 = new StringBuilder("消息观察已安装: pb=");
            sb2.append(z10);
            sb2.append(" dbOutgoing=");
            C2345i c2345i2 = this.f7730b;
            if (c2345i2 != null && c2345i2.m5607b()) {
                z9 = true;
            }
            sb2.append(z9);
            String string = sb2.toString();
            if (this.f7733e != null) {
                C2005i.m4939f("[WeChatMessageObserveApi] ".concat(string));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m5638c() {
        C2347k c2347k = this.f7729a;
        if (c2347k != null && c2347k.m5612c()) {
            return true;
        }
        C2345i c2345i = this.f7730b;
        return c2345i != null && c2345i.m5607b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m5639d(WeChatMessage weChatMessage) {
        if (weChatMessage == null) {
            return WeChatSnsPost.TYPE_UNKNOWN;
        }
        if (weChatMessage.isRedPacket()) {
            return "red_packet";
        }
        String str = weChatMessage.content;
        if (this.f7731c != null && C2353q.m5641a(str)) {
            return "red_packet";
        }
        if (weChatMessage.isTransfer()) {
            return "transfer";
        }
        if (weChatMessage.isQuote()) {
            return "quote";
        }
        if (weChatMessage.isPat()) {
            return "pat";
        }
        if (weChatMessage.isNote()) {
            return "note";
        }
        if (weChatMessage.isFile()) {
            return "file";
        }
        if (weChatMessage.isLink()) {
            return "link";
        }
        if (weChatMessage.isMusic()) {
            return "music";
        }
        if (weChatMessage.isVideoNumberVideo()) {
            return "video_number_video";
        }
        if (weChatMessage.isShareCard()) {
            return "share_card";
        }
        if (weChatMessage.isVoip()) {
            return "voip";
        }
        if (weChatMessage.isRecalled()) {
            return "recalled";
        }
        int i9 = weChatMessage.type;
        if (i9 == 1) {
            return WeChatSnsPost.TYPE_TEXT;
        }
        if (i9 == 3) {
            return WeChatSnsPost.TYPE_IMAGE;
        }
        if (i9 == 34) {
            return "voice";
        }
        if (i9 == 43) {
            return WeChatSnsPost.TYPE_VIDEO;
        }
        if (i9 == 10000) {
            return "system";
        }
        if (i9 == 10002) {
            return "recalled";
        }
        switch (i9) {
            case 47:
                return "emoji";
            case 48:
                return "location";
            case 49:
                return "app";
            default:
                if (i9 <= 0) {
                    return WeChatSnsPost.TYPE_UNKNOWN;
                }
                return "type_" + weChatMessage.type;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C0014a m5640e(InterfaceC2350n interfaceC2350n) {
        this.f7734f.addIfAbsent(interfaceC2350n);
        return new C0014a(23);
    }
}
