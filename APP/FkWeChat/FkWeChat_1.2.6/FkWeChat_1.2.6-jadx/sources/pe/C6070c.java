package pe;

import be.AbstractC1113a;
import be.AbstractC1117e;
import be.C1115c;
import be.C1116d;
import me.C5164c;
import me.C5168g;
import ne.AbstractC5591c;
import ne.InterfaceC5590b;
import okhttp3.internal.url._UrlKt;
import p080f9.C2363j;
import p175le.C4752a;
import p185m8.AbstractC5112w;
import p217oe.AbstractC5741c;
import p217oe.C5739a;
import p217oe.InterfaceC5740b;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: pe.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6070c extends AbstractC5741c {

    /* JADX INFO: renamed from: e */
    public final C5168g f19066e;

    /* JADX INFO: renamed from: f */
    public int f19067f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6070c(InterfaceC5590b interfaceC5590b, C5168g c5168g, C5164c.a aVar) {
        super(interfaceC5590b, c5168g.m21225e());
        interfaceC5590b.getClass();
        c5168g.getClass();
        aVar.getClass();
        this.f19066e = c5168g;
        c5168g.m21222b(AbstractC5112w.m20789e(new InterfaceC6627f.a(new C2363j(aVar.m21191h(), aVar.m21190g()), AbstractC1117e.f3393c)));
        this.f19067f = -1;
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
        if (aVar.m21191h() < this.f19067f) {
            return InterfaceC5740b.c.f18100d.m23235a();
        }
        if (aVar.m21192i() != -1) {
            return InterfaceC5740b.c.f18100d.m23235a();
        }
        C4752a c4752a = C4752a.f14072a;
        if (!(aVar.m21192i() == -1)) {
            throw new C1116d(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        C5739a c5739a = C5739a.f18090a;
        C5164c.a aVarM23217b = c5739a.m23217b(m23238i(), aVar);
        if (aVarM23217b == null) {
            return InterfaceC5740b.c.f18100d.m23236b();
        }
        InterfaceC5590b interfaceC5590bM22689a = AbstractC5591c.m22689a(m23238i(), aVarM23217b);
        C5164c.a aVarM21196m = aVarM23217b.m21196m(AbstractC5591c.m22694f(interfaceC5590bM22689a, aVarM23217b.m21186c()) + 1);
        if (aVarM21196m != null) {
            Integer numM21184a = aVarM21196m.m21184a();
            C5164c.a aVarM21196m2 = aVarM21196m.m21196m(numM21184a != null ? numM21184a.intValue() : 0);
            if (aVarM21196m2 != null) {
                if (!c5739a.m23219d(aVarM21196m2, interfaceC5590bM22689a)) {
                    return InterfaceC5740b.c.f18100d.m23236b();
                }
                C2363j c2363j = new C2363j(aVar.m21191h() + 1 + AbstractC5591c.m22694f(AbstractC5591c.m22689a(m23238i(), aVar), aVar.m21186c()), aVar.m21190g());
                if (c2363j.m8561p() - c2363j.m8560o() > 0) {
                    this.f19066e.m21222b(AbstractC5112w.m20789e(new InterfaceC6627f.a(c2363j, AbstractC1117e.f3393c)));
                }
                this.f19067f = aVar.m21190g();
                return InterfaceC5740b.c.f18100d.m23235a();
            }
        }
        return InterfaceC5740b.c.f18100d.m23236b();
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: j */
    public InterfaceC5740b.a mo12779j() {
        return InterfaceC5740b.a.f18092q;
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: k */
    public AbstractC1113a mo12780k() {
        return C1115c.f3358h;
    }
}
