package pe;

import be.AbstractC1113a;
import be.AbstractC1117e;
import be.C1115c;
import me.C5164c;
import me.C5168g;
import ne.AbstractC5591c;
import ne.InterfaceC5590b;
import p080f9.C2363j;
import p185m8.AbstractC5112w;
import p217oe.AbstractC5741c;
import p217oe.C5739a;
import p217oe.InterfaceC5740b;
import p299ub.C8632n;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: pe.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6073f extends AbstractC5741c {

    /* JADX INFO: renamed from: e */
    public final C5168g f19072e;

    /* JADX INFO: renamed from: f */
    public final C8632n f19073f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6073f(InterfaceC5590b interfaceC5590b, C5168g c5168g, C8632n c8632n, C5164c.a aVar) {
        super(interfaceC5590b, c5168g.m21225e());
        interfaceC5590b.getClass();
        c5168g.getClass();
        aVar.getClass();
        this.f19072e = c5168g;
        this.f19073f = c8632n;
        c5168g.m21222b(AbstractC5112w.m20789e(new InterfaceC6627f.a(new C2363j(aVar.m21191h(), aVar.m21190g()), AbstractC1117e.f3395e)));
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
        String strM21194k = aVar.m21194k();
        if (strM21194k == null) {
            return InterfaceC5740b.c.f18100d.m23236b();
        }
        if (!AbstractC5591c.m22693e(m23238i().mo22672e(aVar), m23238i())) {
            return InterfaceC5740b.c.f18100d.m23236b();
        }
        if (this.f19073f == null && C5739a.f18090a.m23216a(aVar, m23238i()) >= 2) {
            return InterfaceC5740b.c.f18100d.m23236b();
        }
        C8632n c8632n = this.f19073f;
        if (c8632n != null && C8632n.m33210c(c8632n, strM21194k, 0, 2, null) != null) {
            return InterfaceC5740b.c.f18100d.m23236b();
        }
        if (aVar.m21186c().length() > 0) {
            this.f19072e.m21222b(AbstractC5112w.m20789e(new InterfaceC6627f.a(new C2363j(aVar.m21191h() + 1 + AbstractC5591c.m22694f(m23238i(), aVar.m21186c()), aVar.m21190g()), AbstractC1117e.f3395e)));
        }
        return InterfaceC5740b.c.f18100d.m23235a();
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: j */
    public InterfaceC5740b.a mo12779j() {
        return InterfaceC5740b.a.f18092q;
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: k */
    public AbstractC1113a mo12780k() {
        return C1115c.f3360j;
    }
}
