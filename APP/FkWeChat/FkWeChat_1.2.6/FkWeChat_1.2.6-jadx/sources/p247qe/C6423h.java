package p247qe;

import java.util.ArrayList;
import java.util.List;
import me.AbstractC5166e;
import me.C5164c;
import me.C5168g;
import ne.InterfaceC5590b;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5114x;
import p217oe.InterfaceC5742d;
import pe.C6075h;
import pe.C6076i;

/* JADX INFO: renamed from: qe.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6423h implements InterfaceC5742d {
    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: a */
    public List mo12784a(C5164c.a aVar, C5168g c5168g, AbstractC5166e.a aVar2) {
        Character chM20759z0;
        aVar.getClass();
        c5168g.getClass();
        aVar2.getClass();
        InterfaceC5590b interfaceC5590bM21216a = aVar2.m21216a();
        InterfaceC5590b interfaceC5590bM21218c = aVar2.m21218c();
        if (!InterfaceC5742d.f18111a.m23241a(aVar, interfaceC5590bM21216a)) {
            return AbstractC5114x.m20800o();
        }
        if (AbstractC1061t.m3842c(interfaceC5590bM21218c, interfaceC5590bM21216a) || (((chM20759z0 = AbstractC5106t.m20759z0(interfaceC5590bM21218c.mo22669b())) != null && chM20759z0.charValue() == '>') || !AbstractC1061t.m3842c(m25454c(interfaceC5590bM21218c), Boolean.TRUE))) {
            return AbstractC5114x.m20800o();
        }
        ArrayList arrayList = new ArrayList();
        if (!(aVar2.m21217b() instanceof C6076i)) {
            C5168g.a aVarM21225e = c5168g.m21225e();
            Character chM20759z02 = AbstractC5106t.m20759z0(interfaceC5590bM21218c.mo22669b());
            chM20759z02.getClass();
            arrayList.add(new C6076i(interfaceC5590bM21218c, aVarM21225e, chM20759z02.charValue()));
        }
        arrayList.add(new C6075h(interfaceC5590bM21218c, c5168g.m21225e()));
        return arrayList;
    }

    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: b */
    public boolean mo12785b(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final Boolean m25454c(InterfaceC5590b interfaceC5590b) {
        return AbstractC5106t.m20758y0(interfaceC5590b.mo22673f());
    }
}
