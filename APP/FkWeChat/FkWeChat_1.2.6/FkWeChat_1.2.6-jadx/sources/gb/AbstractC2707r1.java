package gb;

import gb.InterfaceC2701p1;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: gb.r1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2707r1 {
    /* JADX INFO: renamed from: a */
    public static final C2704q1 m9588a(C2704q1 c2704q1, InterfaceC6333h interfaceC6333h) {
        C2704q1 c2704q1M9581u;
        c2704q1.getClass();
        interfaceC6333h.getClass();
        if (AbstractC2711t.m9595a(c2704q1) == interfaceC6333h) {
            return c2704q1;
        }
        C2708s c2708sM9596b = AbstractC2711t.m9596b(c2704q1);
        if (c2708sM9596b != null && (c2704q1M9581u = c2704q1.m9581u(c2708sM9596b)) != null) {
            c2704q1 = c2704q1M9581u;
        }
        return (interfaceC6333h.iterator().hasNext() || !interfaceC6333h.isEmpty()) ? c2704q1.m9580t(new C2708s(interfaceC6333h)) : c2704q1;
    }

    /* JADX INFO: renamed from: b */
    public static final C2704q1 m9589b(InterfaceC6333h interfaceC6333h) {
        interfaceC6333h.getClass();
        return InterfaceC2701p1.a.m9560a(C2723x.f7120a, interfaceC6333h, null, null, 6, null);
    }
}
