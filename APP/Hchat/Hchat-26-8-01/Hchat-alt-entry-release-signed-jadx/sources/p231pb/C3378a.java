package p231pb;

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

/* JADX INFO: renamed from: pb.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3378a extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C0545f f10912e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "block_typing_report";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C1651k0("block_typing_report", "拦截正在输入上报", "输入文字时不向对方显示正在输入状态", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        C0545f c0545f = new C0545f(c3742g, new C2026t(2, this, AbstractC0921a.m2246i(C3378a.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 16), (byte) 0);
        this.f10912e = c0545f;
        if (!c0545f.m1549g(false)) {
            C3740e.m7759f(12, new C1746e0(this, 11), "block_typing_report", "拦截正在输入上报", null);
        }
        m7752i(C1085e.class, new C2399h(this, 29));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "拦截正在输入上报";
    }
}
