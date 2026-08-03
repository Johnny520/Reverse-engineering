package bb;

import android.content.Context;
import ke.C2399h;
import okhttp3.HttpUrl;
import p010aa.C0039g;
import p011ab.C0041a;
import p011ab.C0042b;
import p024b9.C0220f;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p080fb.AbstractC1184v0;
import p096g8.C1360a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p108ha.C1651k0;
import p127ib.C2034b;
import p153k8.C2351o;
import p153k8.C2352p;
import p153k8.InterfaceC2350n;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;

/* JADX INFO: renamed from: bb.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0243e extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C0245g f647e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "real_name_tail";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("real_name_tail", "实名尾字", "群聊里自动补查并显示实名尾字", "entertainment"));
        m7751h(new C1651k0("group_nickname_color", "群昵称自定义颜色", "自定义群聊成员昵称的颜色和粗细", "entertainment"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        Context context = c3742g.f12143a;
        final C0250l c0250l = new C0250l(context);
        C2034b c2034b = new C2034b(context, 1);
        final C0249k c0249k = new C0249k(c0250l, new C0220f(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C0243e.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 3)), new C0042b(2, this, AbstractC0921a.m2246i(C0243e.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 4), new C0241c(this, 0));
        C0240b c0240b = new C0240b(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C0243e.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 2), new C0241c(this, 1));
        C0245g c0245g = new C0245g(c3742g, c0250l, c2034b, c0249k, new C0042b(2, this, AbstractC0921a.m2246i(C0243e.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 1));
        c0245g.f663m = c0240b;
        this.f647e = c0245g;
        C3740e.m7759f(12, new C0041a(this, 7), "real_name_tail", "实名尾字", null);
        m7752i(C1085e.class, new C2399h(this, 4));
        WeChatApis.message().getClass();
        C2352p c2352p = WeChatApis.messageObserveApi;
        if (c2352p != null) {
            m7753j(c2352p.m5640e(new InterfaceC2350n() { // from class: bb.d
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p153k8.InterfaceC2350n
                /* JADX INFO: renamed from: a */
                public final void mo973a(C2351o c2351o) {
                    C0245g c0245g2;
                    C0250l c0250l2 = c0250l;
                    C0243e c0243e = this;
                    C0249k c0249k2 = c0249k;
                    if (c0250l2.f694a.getBoolean("enable", false) && c0250l2.f694a.getBoolean("message_query", true) && c2351o.m5623j() && !c2351o.m5630q()) {
                        String str = c2351o.f7715c;
                        String str2 = c2351o.f7716d;
                        str2.getClass();
                        if (AbstractC3149m.m6721t0(str2)) {
                            return;
                        }
                        C1360a c1360aAccount = WeChatApis.account();
                        String strM3652c = c1360aAccount != null ? c1360aAccount.m3652c() : null;
                        if (strM3652c == null) {
                            strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (strM3652c.length() <= 0 || !strM3652c.equals(str2)) {
                            String string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
                            if (string == null) {
                                string = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            String string2 = AbstractC3149m.m6703R0(str2).toString();
                            if (string2 == null) {
                                string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            if (C0249k.m987g(string)) {
                                C3147k c3147k = C0250l.f693c;
                                if (AbstractC1184v0.m3174A(string2) && !C0249k.m988h(string2) && !c0249k2.f675a.m1005e(string2) && !c0249k2.f682h.contains(string2)) {
                                    synchronized (c0249k2.f679e) {
                                        if (c0249k2.f680f.size() < 12) {
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            String strM989n = C0249k.m989n(string, string2);
                                            Long l10 = (Long) c0249k2.f687m.get(strM989n);
                                            if (l10 == null || jCurrentTimeMillis - l10.longValue() >= 3000) {
                                                c0249k2.f687m.put(strM989n, Long.valueOf(jCurrentTimeMillis));
                                                c0249k2.m992c(string, string2);
                                            }
                                        }
                                    }
                                }
                            }
                            if (!c0250l2.m1005e(str2) || (c0245g2 = c0243e.f647e) == null) {
                                return;
                            }
                            c0245g2.m978a(str2);
                        }
                    }
                }
            }));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "实名尾字";
    }
}
