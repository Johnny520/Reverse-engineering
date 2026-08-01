package ba;

import p024b9.AbstractC1061t;
import p081fa.InterfaceC2379g;
import p229p9.InterfaceC5995e;
import p343xa.C9473c;

/* JADX INFO: renamed from: ba.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1087o implements InterfaceC1086n {

    /* JADX INFO: renamed from: a */
    public C9473c f3275a;

    @Override // ba.InterfaceC1086n
    /* JADX INFO: renamed from: a */
    public InterfaceC5995e mo3947a(InterfaceC2379g interfaceC2379g) {
        interfaceC2379g.getClass();
        return m3948b().m36901b(interfaceC2379g);
    }

    /* JADX INFO: renamed from: b */
    public final C9473c m3948b() {
        C9473c c9473c = this.f3275a;
        if (c9473c != null) {
            return c9473c;
        }
        AbstractC1061t.m3851l("resolver");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m3949c(C9473c c9473c) {
        c9473c.getClass();
        this.f3275a = c9473c;
    }
}
