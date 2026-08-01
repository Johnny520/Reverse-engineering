package pe;

import be.AbstractC1113a;
import be.AbstractC1117e;
import be.C1115c;
import me.C5164c;
import me.C5168g;
import ne.InterfaceC5590b;
import p024b9.AbstractC1061t;
import p080f9.C2363j;
import p185m8.AbstractC5112w;
import p217oe.AbstractC5741c;
import p217oe.InterfaceC5740b;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: pe.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6078k extends AbstractC5741c {

    /* JADX INFO: renamed from: e */
    public final C5168g f19077e;

    /* JADX INFO: renamed from: f */
    public final C5168g.a f19078f;

    /* JADX INFO: renamed from: g */
    public AbstractC1113a f19079g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6078k(InterfaceC5590b interfaceC5590b, C5168g c5168g) {
        super(interfaceC5590b, c5168g.m21225e());
        interfaceC5590b.getClass();
        c5168g.getClass();
        this.f19077e = c5168g;
        this.f19078f = c5168g.m21225e();
        this.f19079g = C1115c.f3374x;
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
        return aVar.m21192i() == -1;
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
        Integer numM21184a = aVar.m21184a();
        if (numM21184a == null) {
            InterfaceC5740b.a aVar2 = InterfaceC5740b.a.f18093r;
            return new InterfaceC5740b.c(aVar2, aVar2, InterfaceC5740b.b.PROPAGATE);
        }
        C5164c.a aVarM21196m = aVar.m21196m(numM21184a.intValue());
        if (aVarM21196m != null && aVarM21196m.m21185b() == '-') {
            this.f19079g = C1115c.f3375y;
        }
        int iM21191h = aVarM21196m != null ? aVarM21196m.m21191h() : aVar.m21191h();
        AbstractC1113a abstractC1113a = AbstractC1061t.m3842c(this.f19079g, C1115c.f3375y) ? AbstractC1117e.f3412v : AbstractC1117e.f3411u;
        this.f19078f.m21227a(AbstractC1117e.f3413w);
        this.f19077e.m21222b(AbstractC5112w.m20789e(new InterfaceC6627f.a(new C2363j(iM21191h, aVar.m21190g()), abstractC1113a)));
        int iM21190g = aVar.m21190g();
        InterfaceC5740b.c.a aVar3 = InterfaceC5740b.c.f18100d;
        m23239l(iM21190g, aVar3.m23236b());
        return aVar3.m23235a();
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: j */
    public InterfaceC5740b.a mo12779j() {
        return InterfaceC5740b.a.f18092q;
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: k */
    public AbstractC1113a mo12780k() {
        return this.f19079g;
    }
}
