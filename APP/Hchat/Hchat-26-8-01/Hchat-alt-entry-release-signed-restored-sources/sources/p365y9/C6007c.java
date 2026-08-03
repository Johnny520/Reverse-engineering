package p365y9;

import p014b.C0126e;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p096g8.C1366g;
import p096g8.InterfaceC1365f;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p127ib.C2034b;
import p210o8.C3086j;
import p218og.AbstractC3149m;
import p243q9.C3465a;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p261rb.RunnableC3791g;
import p274s8.C3944d;
import p307v0.C4361a;

/* JADX INFO: renamed from: y9.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6007c extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C6009e f24387e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "member_title";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C3944d("member_title", "群员头衔", "在群聊昵称左侧显示群主、管理员、群员或自定义头衔", "entertainment"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        final C2034b c2034b = new C2034b(c3742g.f12143a, 2);
        this.f24387e = new C6009e(c3742g, c2034b, new C6006b(2, this, AbstractC0921a.m2246i(C6007c.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 0));
        C3740e.m7759f(12, new C4361a(this, 10), "member_title", "群员头衔", null);
        m7752i(C1085e.class, new C3465a(this, 13));
        WeChatApis.contact().getClass();
        C1366g c1366g = WeChatApis.chatroomChangeApi;
        if (c1366g != null) {
            m7753j(c1366g.m3683a(new InterfaceC1365f() { // from class: y9.a
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p096g8.InterfaceC1365f
                /* JADX INFO: renamed from: a */
                public final void mo2162a(C0126e c0126e) {
                    C6009e c6009e;
                    C3086j c3086jTasks;
                    if (c2034b.f6870a.getBoolean("enable", false)) {
                        String strM636n = c0126e.m636n();
                        strM636n.getClass();
                        if (AbstractC3149m.m6721t0(strM636n) || (c6009e = this.f24387e) == null || !C6009e.m10760g(strM636n) || (c3086jTasks = WeChatApis.tasks()) == null) {
                            return;
                        }
                        c3086jTasks.m6554e(new RunnableC3791g(c6009e, 21, strM636n));
                    }
                }
            }));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "群员头衔";
    }
}
