package ba;

import p081fa.InterfaceC2398z;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p229p9.InterfaceC6001g;
import p229p9.InterfaceC6019m;
import p243q9.InterfaceC6333h;
import p358y9.C9618e0;

/* JADX INFO: renamed from: ba.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1075c {
    /* JADX INFO: renamed from: c */
    public static final C1083k m3885c(C1083k c1083k, InterfaceC1088p interfaceC1088p) {
        c1083k.getClass();
        interfaceC1088p.getClass();
        return new C1083k(c1083k.m3937a(), interfaceC1088p, c1083k.m3939c());
    }

    /* JADX INFO: renamed from: d */
    public static final C1083k m3886d(C1083k c1083k, InterfaceC6019m interfaceC6019m, InterfaceC2398z interfaceC2398z, int i10, InterfaceC4705l interfaceC4705l) {
        return new C1083k(c1083k.m3937a(), interfaceC2398z != null ? new C1085m(c1083k, interfaceC6019m, interfaceC2398z, i10) : c1083k.m3942f(), interfaceC4705l);
    }

    /* JADX INFO: renamed from: e */
    public static final C1083k m3887e(C1083k c1083k, InterfaceC6001g interfaceC6001g, InterfaceC2398z interfaceC2398z, int i10) {
        c1083k.getClass();
        interfaceC6001g.getClass();
        return m3886d(c1083k, interfaceC6001g, interfaceC2398z, i10, AbstractC4706m.m18788b(EnumC4708o.f13923s, new C1073a(c1083k, interfaceC6001g)));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C1083k m3888f(C1083k c1083k, InterfaceC6001g interfaceC6001g, InterfaceC2398z interfaceC2398z, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC2398z = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m3887e(c1083k, interfaceC6001g, interfaceC2398z, i10);
    }

    /* JADX INFO: renamed from: g */
    public static final C9618e0 m3889g(C1083k c1083k, InterfaceC6001g interfaceC6001g) {
        return m3892j(c1083k, interfaceC6001g.getAnnotations());
    }

    /* JADX INFO: renamed from: h */
    public static final C1083k m3890h(C1083k c1083k, InterfaceC6019m interfaceC6019m, InterfaceC2398z interfaceC2398z, int i10) {
        c1083k.getClass();
        interfaceC6019m.getClass();
        interfaceC2398z.getClass();
        return m3886d(c1083k, interfaceC6019m, interfaceC2398z, i10, c1083k.m3939c());
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C1083k m3891i(C1083k c1083k, InterfaceC6019m interfaceC6019m, InterfaceC2398z interfaceC2398z, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m3890h(c1083k, interfaceC6019m, interfaceC2398z, i10);
    }

    /* JADX INFO: renamed from: j */
    public static final C9618e0 m3892j(C1083k c1083k, InterfaceC6333h interfaceC6333h) {
        c1083k.getClass();
        interfaceC6333h.getClass();
        return c1083k.m3937a().m3896a().m37582d(c1083k.m3938b(), interfaceC6333h);
    }

    /* JADX INFO: renamed from: k */
    public static final C1083k m3893k(C1083k c1083k, InterfaceC6333h interfaceC6333h) {
        c1083k.getClass();
        interfaceC6333h.getClass();
        return interfaceC6333h.isEmpty() ? c1083k : new C1083k(c1083k.m3937a(), c1083k.m3942f(), AbstractC4706m.m18788b(EnumC4708o.f13923s, new C1074b(c1083k, interfaceC6333h)));
    }

    /* JADX INFO: renamed from: l */
    public static final C9618e0 m3894l(C1083k c1083k, InterfaceC6333h interfaceC6333h) {
        return m3892j(c1083k, interfaceC6333h);
    }

    /* JADX INFO: renamed from: m */
    public static final C1083k m3895m(C1083k c1083k, C1076d c1076d) {
        c1083k.getClass();
        c1076d.getClass();
        return new C1083k(c1076d, c1083k.m3942f(), c1083k.m3939c());
    }
}
