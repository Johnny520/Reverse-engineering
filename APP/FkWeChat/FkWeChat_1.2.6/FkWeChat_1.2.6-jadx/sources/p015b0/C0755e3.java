package p015b0;

import okhttp3.internal.http2.Settings;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p024b9.C1042j0;
import p319w2.C9058e;
import p319w2.C9067f3;

/* JADX INFO: renamed from: b0.e3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0755e3 {

    /* JADX INFO: renamed from: a */
    public final C9058e f2265a;

    /* JADX INFO: renamed from: b */
    public C9058e f2266b;

    public C0755e3(C9058e c9058e) {
        this.f2265a = c9058e;
        this.f2266b = c9058e;
    }

    /* JADX INFO: renamed from: a */
    public static C9058e.d m2880a(C1042j0 c1042j0, C9058e.d dVar, C9067f3 c9067f3, C9058e.d dVar2) {
        C9058e.d dVar3;
        C9058e.d dVar4;
        if (c1042j0.f3202q && (dVar2.m35192g() instanceof C9067f3) && dVar2.m35193h() == dVar.m35193h() && dVar2.m35191f() == dVar.m35191f()) {
            dVar3 = new C9058e.d(c9067f3 == null ? new C9067f3(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null) : c9067f3, dVar2.m35193h(), dVar2.m35191f());
            dVar4 = dVar2;
        } else {
            dVar3 = dVar2;
            dVar4 = dVar3;
        }
        c1042j0.f3202q = AbstractC1061t.m3842c(dVar, dVar4);
        return dVar3;
    }

    /* JADX INFO: renamed from: b */
    public final C9058e m2881b() {
        return this.f2266b;
    }

    /* JADX INFO: renamed from: c */
    public final void m2882c(final C9058e.d dVar, final C9067f3 c9067f3) {
        final C1042j0 c1042j0 = new C1042j0();
        this.f2266b = this.f2265a.m35162q(new InterfaceC0184l() { // from class: b0.d3
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C0755e3.m2880a(c1042j0, dVar, c9067f3, (C9058e.d) obj);
            }
        });
    }
}
