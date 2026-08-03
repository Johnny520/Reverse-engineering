package p261rb;

import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p080fb.AbstractC1184v0;
import p108ha.C1651k0;
import p116i.C1746e0;
import p126ia.C2026t;
import p243q9.C3465a;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;

/* JADX INFO: renamed from: rb.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3786b extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C3787c f12409e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "zombie_check";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C1651k0("zombie_check", "僵尸粉检测", "批量核验好友关系并记录异常联系人", "enhance"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        C3795k c3795k = new C3795k(c3742g.f12143a, new C2026t(2, this, AbstractC0921a.m2246i(C3786b.class), "logRuntimeError", "logRuntimeError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 22));
        C3787c c3787c = new C3787c(c3742g, c3795k, new C2026t(2, this, AbstractC0921a.m2246i(C3786b.class), "logRuntimeError", "logRuntimeError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 21));
        c3795k.f12451k = c3787c;
        this.f12409e = c3787c;
        AbstractC1184v0.f3987a = c3795k;
        C3740e.m7759f(12, new C1746e0(this, 16), "zombie_check", "僵尸粉检测", null);
        m7752i(C1085e.class, new C3465a(this, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "僵尸粉检测";
    }
}
