package p153k8;

import android.text.TextUtils;
import okhttp3.HttpUrl;
import p014b.C0126e;
import p096g8.C1360a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p155ka.C2378d;
import p155ka.C2380f;
import p155ka.C2381g;
import p155ka.RunnableC2377c;
import p167l8.C2526a;
import p218og.AbstractC3149m;
import p274s8.C3943c;

/* JADX INFO: renamed from: k8.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2349m implements InterfaceC2344h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7711a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7712b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2349m(Object obj, int i9) {
        this.f7711a = i9;
        this.f7712b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5 A[PHI: r4
  0x00a5: PHI (r4v6 java.lang.String) = (r4v5 java.lang.String), (r4v7 java.lang.String) binds: [B:38:0x009a, B:41:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p153k8.InterfaceC2344h
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2171a(C0126e c0126e) {
        String strM3652c;
        WeChatMessage weChatMessage;
        String string;
        String sendTalker;
        switch (this.f7711a) {
            case 0:
                C2352p c2352p = (C2352p) this.f7712b;
                WeChatMessage weChatMessage2 = (WeChatMessage) c0126e.f333i;
                if (weChatMessage2 != null) {
                    if (!c2352p.f7736h || weChatMessage2.isOutgoing()) {
                        if (weChatMessage2.isOutgoing()) {
                            String str = weChatMessage2.talker;
                            String str2 = weChatMessage2.content;
                            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                                Long l10 = (Long) c2352p.f7735g.get(str + '\n' + str2);
                                if (l10 != null && System.currentTimeMillis() - l10.longValue() < 10000) {
                                }
                            }
                        }
                        if (weChatMessage2.isOutgoing()) {
                            C2343g.m5580d(weChatMessage2.talker, weChatMessage2.content);
                        }
                        String strM5639d = c2352p.m5639d(weChatMessage2);
                        String str3 = weChatMessage2.talker;
                        boolean zIsOutgoing = weChatMessage2.isOutgoing();
                        String strM5643c = HttpUrl.FRAGMENT_ENCODE_SET;
                        if (zIsOutgoing) {
                            C1360a c1360a = c2352p.f7732d;
                            strM3652c = c1360a != null ? c1360a.m3652c() : HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        String str4 = weChatMessage2.content;
                        String strM5642b = c2352p.f7731c != null ? C2353q.m5642b(str4) : str4;
                        String str5 = weChatMessage2.content;
                        if (c2352p.f7731c != null) {
                            strM5643c = C2353q.m5643c(C2353q.m5642b(str5), "nativeurl");
                        }
                        c2352p.m5636a(new C2351o("message_db", strM5639d, str3, strM3652c, str4, strM5642b, strM5643c, c2352p.f7731c != null && C2353q.m5646f(weChatMessage2.talker), weChatMessage2.isOutgoing(), weChatMessage2, null));
                    }
                    break;
                }
                break;
            case 1:
                C2380f c2380f = (C2380f) this.f7712b;
                C2381g c2381g = c2380f.f7823c;
                if ("insert".equals(((C2526a) c0126e.f332h).f8161a) && (weChatMessage = (WeChatMessage) c0126e.f333i) != null && c2381g.m5701b("qq_music_order_enable", false) && weChatMessage.isText() && !weChatMessage.isSystem()) {
                    long j3 = weChatMessage.createTime;
                    if (j3 > 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (j3 < 100000000000L) {
                            j3 *= 1000;
                        }
                        if (jCurrentTimeMillis - j3 >= 30000) {
                        }
                    }
                    String str6 = weChatMessage.talker;
                    if (!AbstractC3149m.m6721t0(str6)) {
                        if (weChatMessage.isOutgoing() || c2381g.m5700a().contains(str6)) {
                            String str7 = weChatMessage.content;
                            if (weChatMessage.isGroupChat()) {
                                String str8 = ":\n";
                                if (AbstractC3149m.m6709h0(str7, ":\n", false)) {
                                    string = AbstractC3149m.m6703R0(AbstractC3149m.m6696K0(str7, str8)).toString();
                                } else {
                                    str8 = ":\\n";
                                    if (!AbstractC3149m.m6709h0(str7, ":\\n", false)) {
                                        string = AbstractC3149m.m6703R0(str7).toString();
                                    }
                                }
                            } else {
                                string = AbstractC3149m.m6703R0(str7).toString();
                            }
                            C2378d c2378dM5697c = c2380f.m5697c(string);
                            if (c2378dM5697c != null) {
                                if (weChatMessage.isOutgoing()) {
                                    WeChatApis.contact().getClass();
                                    C1360a c1360a2 = WeChatApis.accountApi;
                                    sendTalker = c1360a2 != null ? c1360a2.m3652c() : null;
                                    if (sendTalker == null) {
                                        sendTalker = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                } else {
                                    sendTalker = weChatMessage.getSendTalker();
                                }
                                c2380f.f7825e.execute(new RunnableC2377c(c2380f, str6, weChatMessage.msgId, sendTalker, c2378dM5697c));
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                ((C3943c) this.f7712b).m8161N((WeChatMessage) c0126e.f333i);
                break;
        }
    }
}
