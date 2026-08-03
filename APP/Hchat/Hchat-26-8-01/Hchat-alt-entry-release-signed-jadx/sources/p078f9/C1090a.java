package p078f9;

import ke.C2399h;
import p010aa.C0039g;
import p011ab.C0041a;
import p011ab.C0042b;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;

/* JADX INFO: renamed from: f9.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1090a extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C1094e f3504e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "edit_message";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("edit_message", "修改聊天记录", "长按文字、引用或转账消息后修改本地聊天记录", "entertainment"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        this.f3504e = new C1094e(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C1090a.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 11));
        C3740e.m7759f(12, new C0041a(this, 19), "edit_message", "修改聊天记录", null);
        m7752i(C1085e.class, new C2399h(this, 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "修改聊天记录";
    }
}
