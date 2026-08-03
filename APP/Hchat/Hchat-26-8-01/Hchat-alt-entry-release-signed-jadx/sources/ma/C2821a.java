package ma;

import ke.C2399h;
import p037cb.C0545f;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p108ha.C1651k0;
import p116i.C1746e0;
import p126ia.C2026t;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;

/* JADX INFO: renamed from: ma.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2821a extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C0545f f9112e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "disable_pat";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C1651k0("disable_pat", "禁止拍一拍", "双击聊天头像时不发送拍一拍", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        C0545f c0545f = new C0545f(c3742g, new C2026t(2, this, AbstractC0921a.m2246i(C2821a.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 12));
        this.f9112e = c0545f;
        if (!c0545f.m1549g(false)) {
            C3740e.m7759f(12, new C1746e0(this, 9), "disable_pat", "禁止拍一拍", null);
        }
        m7752i(C1085e.class, new C2399h(this, 24));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "禁止拍一拍";
    }
}
