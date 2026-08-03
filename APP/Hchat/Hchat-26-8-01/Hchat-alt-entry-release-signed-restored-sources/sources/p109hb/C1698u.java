package p109hb;

import ke.C2399h;
import p000a.AbstractC0000a;
import p011ab.C0041a;
import p011ab.C0042b;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p099h.Hchat.crash.RunnableC1436e;
import p108ha.C1651k0;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;

/* JADX INFO: renamed from: hb.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1698u extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C1684i0 f5657e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "selected_messages";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C1651k0("selected_messages", "群发助手", "从多选消息菜单群发或定时转发聊天记录", "enhance"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        C1684i0 c1684i0 = new C1684i0(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C1698u.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 23));
        C1671c c1671c = c1684i0.f5589h;
        C1695r c1695r = c1684i0.f5588g;
        C1687k c1687k = c1684i0.f5590i;
        c1671c.getClass();
        c1695r.getClass();
        c1687k.getClass();
        AbstractC0000a.f0g = new C1688k0(c1671c, c1695r, c1687k);
        C1689l c1689l = C1690m.f5615a;
        C1689l c1689l2 = C1690m.f5615a;
        if ((c1689l2 == null || !c1689l2.m4306a()) && C1690m.f5617c.compareAndSet(false, true)) {
            new Thread(new RunnableC1436e(1), "Hchat-SelectedMessageContactsWarmup").start();
        }
        this.f5657e = c1684i0;
        C3740e.m7759f(12, new C0041a(this, 29), "selected_messages", "群发助手", null);
        m7752i(C1085e.class, new C2399h(this, 15));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "群发助手";
    }
}
