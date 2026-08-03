package p168l9;

import java.lang.reflect.Method;
import p068eh.AbstractC0921a;
import p108ha.C1651k0;
import p116i.C1746e0;
import p126ia.C2026t;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;

/* JADX INFO: renamed from: l9.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2535a extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C2538d f8203e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "remove_forward_limit";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C1651k0("remove_forward_limit", "移除转发限制", "允许微信原生转发选择超过 9 个会话", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        Method methodM5957e;
        c3742g.getClass();
        C2538d c2538d = new C2538d(c3742g, new C2026t(2, this, AbstractC0921a.m2246i(C2535a.class), "logRuntimeError", "logRuntimeError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 9));
        this.f8203e = c2538d;
        synchronized (c2538d) {
            if (!c2538d.f8214f && (methodM5957e = c2538d.m5957e()) != null) {
                c2538d.m5956b(methodM5957e);
            }
        }
        C3740e.m7759f(12, new C1746e0(this, 6), "remove_forward_limit", "移除转发限制", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "移除转发限制";
    }
}
