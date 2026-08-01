package pe;

import be.AbstractC1113a;
import be.C1115c;
import be.C1116d;
import me.C5164c;
import me.C5168g;
import ne.AbstractC5591c;
import ne.InterfaceC5590b;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0188p;
import p175le.C4752a;
import p217oe.AbstractC5741c;
import p217oe.C5739a;
import p217oe.InterfaceC5740b;

/* JADX INFO: renamed from: pe.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6077j extends AbstractC5741c {

    /* JADX INFO: renamed from: e */
    public final InterfaceC0188p f19076e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6077j(InterfaceC5590b interfaceC5590b, C5168g.a aVar, InterfaceC0188p interfaceC0188p) {
        super(interfaceC5590b, aVar);
        interfaceC5590b.getClass();
        aVar.getClass();
        interfaceC0188p.getClass();
        this.f19076e = interfaceC0188p;
    }

    @Override // p217oe.InterfaceC5740b
    /* JADX INFO: renamed from: b */
    public boolean mo12775b() {
        return false;
    }

    @Override // p217oe.InterfaceC5740b
    /* JADX INFO: renamed from: c */
    public boolean mo12776c(C5164c.a aVar) {
        aVar.getClass();
        return true;
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: g */
    public int mo12777g(C5164c.a aVar) {
        aVar.getClass();
        return aVar.m21190g();
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: h */
    public InterfaceC5740b.c mo12778h(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        if (aVar.m21192i() != -1) {
            return InterfaceC5740b.c.f18100d.m23235a();
        }
        C4752a c4752a = C4752a.f14072a;
        if (!(aVar.m21192i() == -1)) {
            throw new C1116d(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        if (C5739a.f18090a.m23216a(aVar, m23238i()) >= 2) {
            return InterfaceC5740b.c.f18100d.m23236b();
        }
        InterfaceC5590b interfaceC5590bM22689a = AbstractC5591c.m22689a(m23238i(), aVar);
        if (!AbstractC5591c.m22695g(interfaceC5590bM22689a, m23238i())) {
            return InterfaceC5740b.c.f18100d.m23236b();
        }
        C5164c.a aVarM21196m = aVar.m21196m(AbstractC5591c.m22694f(interfaceC5590bM22689a, aVar.m21186c()) + 1);
        return (aVarM21196m == null || ((Boolean) this.f19076e.invoke(aVarM21196m, interfaceC5590bM22689a)).booleanValue()) ? InterfaceC5740b.c.f18100d.m23236b() : InterfaceC5740b.c.f18100d.m23235a();
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: j */
    public InterfaceC5740b.a mo12779j() {
        return InterfaceC5740b.a.f18092q;
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: k */
    public AbstractC1113a mo12780k() {
        return C1115c.f3361k;
    }
}
