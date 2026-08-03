package p138ja;

import ke.C2399h;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p108ha.C1651k0;
import p109hb.C1671c;
import p116i.C1746e0;
import p126ia.C2026t;
import p136j8.AbstractC2091b;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: ja.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2116a extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C1671c f7069e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "multi_recall";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C1651k0("multi_recall", "多选撤回", "在多选分享菜单中批量撤回自己发送的消息", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        C2026t c2026t = new C2026t(2, this, AbstractC0921a.m2246i(C2116a.class), "logError", "logError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 5);
        c3742g.getClass();
        C1671c c1671c = new C1671c();
        c1671c.f5520g = c3742g;
        c1671c.f5521h = c2026t;
        c1671c.f5522i = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_multi_recall_config");
        c1671c.f5523j = AbstractC2091b.m5168o();
        this.f7069e = c1671c;
        C3740e.m7759f(12, new C1746e0(this, 3), "multi_recall", "多选撤回", null);
        m7752i(C1085e.class, new C2399h(this, 20));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "多选撤回";
    }
}
