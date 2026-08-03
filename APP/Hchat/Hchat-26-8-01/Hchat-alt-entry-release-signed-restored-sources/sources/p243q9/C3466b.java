package p243q9;

import na.C2918f;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p096g8.C1366g;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p108ha.C1651k0;
import p109hb.C1695r;
import p126ia.C2026t;
import p211o9.C3090c;
import p258r8.AbstractC3736a;
import p258r8.C3742g;

/* JADX INFO: renamed from: q9.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3466b extends AbstractC3736a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "group_rename_monitor";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C1651k0("group_rename_monitor", "改名监控", "监控群成员修改群内昵称，支持系统消息、文本和卡片提醒", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        C3090c.f9983a.m6570b(c3742g, new C2026t(2, this, AbstractC0921a.m2246i(C3466b.class), "logError", "logError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 17));
        C2026t c2026t = new C2026t(2, this, AbstractC0921a.m2246i(C3466b.class), "logError", "logError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 18);
        C1695r c1695r = new C1695r(c3742g, c2026t);
        WeChatApis.contact().getClass();
        C1366g c1366gChatroomChanges = WeChatApis.chatroomChangeApi;
        if (c1366gChatroomChanges == null) {
            c1366gChatroomChanges = WeChatApis.chatroomChanges();
        }
        if (c1366gChatroomChanges == null) {
            c2026t.invoke("群聊变更 API 未就绪", null);
        } else {
            m7753j(c1366gChatroomChanges.m3683a(new C2918f(c1695r, 2)));
            c1695r.m4327p();
        }
        m7752i(C1085e.class, new C3465a(c1695r, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "改名监控";
    }
}
