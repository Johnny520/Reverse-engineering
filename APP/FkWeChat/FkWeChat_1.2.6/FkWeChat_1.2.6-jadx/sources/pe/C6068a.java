package pe;

import be.AbstractC1113a;
import be.AbstractC1117e;
import be.C1115c;
import java.util.List;
import me.C5164c;
import me.C5168g;
import ne.InterfaceC5590b;
import p080f9.C2363j;
import p185m8.AbstractC5112w;
import p217oe.AbstractC5741c;
import p217oe.InterfaceC5740b;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: pe.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6068a extends AbstractC5741c {

    /* JADX INFO: renamed from: e */
    public final AbstractC1113a f19065e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6068a(InterfaceC5590b interfaceC5590b, C5168g c5168g, C2363j c2363j, int i10, int i11) {
        super(interfaceC5590b, c5168g.m21225e());
        interfaceC5590b.getClass();
        c5168g.getClass();
        c2363j.getClass();
        int iM21223c = c5168g.m21223c();
        List listM20787c = AbstractC5112w.m20787c();
        C2363j c2363j2 = new C2363j(c2363j.m8560o() + iM21223c, c2363j.m8561p() + iM21223c + 1);
        AbstractC1113a abstractC1113a = AbstractC1117e.f3409s;
        listM20787c.add(new InterfaceC6627f.a(c2363j2, abstractC1113a));
        if (c2363j.m8561p() + iM21223c + 1 != i10) {
            listM20787c.add(new InterfaceC6627f.a(new C2363j(iM21223c + c2363j.m8561p() + 1, i10), AbstractC1117e.f3410t));
        }
        if (i10 != i11) {
            listM20787c.add(new InterfaceC6627f.a(new C2363j(i10, i11), abstractC1113a));
        }
        c5168g.m21222b(AbstractC5112w.m20785a(listM20787c));
        this.f19065e = m24187m((c2363j.m8561p() - c2363j.m8560o()) + 1);
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
        return aVar.m21192i() == -1 ? new InterfaceC5740b.c(InterfaceC5740b.a.f18093r, InterfaceC5740b.a.f18092q, InterfaceC5740b.b.PROPAGATE) : InterfaceC5740b.c.f18100d.m23235a();
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: j */
    public InterfaceC5740b.a mo12779j() {
        return InterfaceC5740b.a.f18092q;
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: k */
    public AbstractC1113a mo12780k() {
        return this.f19065e;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC1113a m24187m(int i10) {
        switch (i10) {
        }
        return C1115c.f3350E;
    }
}
