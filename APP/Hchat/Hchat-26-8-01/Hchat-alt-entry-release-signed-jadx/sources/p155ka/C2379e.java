package p155ka;

import gg.AbstractC1416l;
import gg.C1414j;
import gg.InterfaceC1412h;
import okhttp3.HttpUrl;
import p065eb.InterfaceC0873i0;
import p068eh.AbstractC0921a;
import p096g8.C1360a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p218og.AbstractC3149m;
import p242q8.C3458m;

/* JADX INFO: renamed from: ka.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2379e implements InterfaceC0873i0, InterfaceC1412h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2380f f7819a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2379e(C2380f c2380f) {
        this.f7819a = c2380f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // gg.InterfaceC1412h
    /* JADX INFO: renamed from: a */
    public final C1414j mo3822a() {
        return new C1414j(1, this.f7819a, AbstractC0921a.m2246i(C2380f.class), "onSendButton", "onSendButton(Ljava/lang/String;)Z", 0, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p065eb.InterfaceC0873i0
    /* JADX INFO: renamed from: b */
    public final boolean mo2174b(String str) {
        C2378d c2378dM5697c;
        str.getClass();
        C2380f c2380f = this.f7819a;
        C2381g c2381g = c2380f.f7823c;
        if (c2381g.m5701b("qq_music_order_enable", false)) {
            WeChatApis.interaction().getClass();
            C3458m c3458m = WeChatApis.chatPageApi;
            String strM7258a = c3458m != null ? c3458m.m7258a() : null;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (strM7258a == null) {
                strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (!AbstractC3149m.m6721t0(strM7258a)) {
                String string = AbstractC3149m.m6703R0(str).toString();
                if (AbstractC1416l.m3825a(string, "开启点歌")) {
                    c2380f.m5699f(strM7258a, true);
                    return true;
                }
                if (AbstractC1416l.m3825a(string, "关闭点歌")) {
                    c2380f.m5699f(strM7258a, false);
                    return true;
                }
                if (c2381g.m5701b("qq_music_order_intercept_own_command", false) && (c2378dM5697c = c2380f.m5697c(str)) != null) {
                    WeChatApis.contact().getClass();
                    C1360a c1360a = WeChatApis.accountApi;
                    String strM3652c = c1360a != null ? c1360a.m3652c() : null;
                    if (strM3652c != null) {
                        str2 = strM3652c;
                    }
                    c2380f.f7825e.execute(new RunnableC2377c(c2380f, strM7258a, 0L, str2, c2378dM5697c));
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC0873i0) && (obj instanceof InterfaceC1412h)) {
            return mo3822a().equals(((InterfaceC1412h) obj).mo3822a());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return mo3822a().hashCode();
    }
}
