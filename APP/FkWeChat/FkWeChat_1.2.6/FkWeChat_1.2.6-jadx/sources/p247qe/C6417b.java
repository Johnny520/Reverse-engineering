package p247qe;

import java.util.List;
import me.AbstractC5166e;
import me.C5164c;
import me.C5168g;
import ne.AbstractC5591c;
import ne.InterfaceC5590b;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p217oe.InterfaceC5742d;
import pe.C6069b;

/* JADX INFO: renamed from: qe.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6417b implements InterfaceC5742d {
    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: a */
    public List mo12784a(C5164c.a aVar, C5168g c5168g, AbstractC5166e.a aVar2) {
        Character chM20759z0;
        aVar.getClass();
        c5168g.getClass();
        aVar2.getClass();
        InterfaceC5590b interfaceC5590bM21216a = aVar2.m21216a();
        InterfaceC5590b interfaceC5590bM21218c = aVar2.m21218c();
        return aVar.m21192i() != AbstractC5591c.m22694f(interfaceC5590bM21216a, aVar.m21186c()) ? AbstractC5114x.m20800o() : (AbstractC1061t.m3842c(interfaceC5590bM21218c, interfaceC5590bM21216a) || (chM20759z0 = AbstractC5106t.m20759z0(interfaceC5590bM21218c.mo22669b())) == null || chM20759z0.charValue() != '>') ? AbstractC5114x.m20800o() : AbstractC5112w.m20789e(new C6069b(interfaceC5590bM21218c, c5168g.m21225e()));
    }

    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: b */
    public boolean mo12785b(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        return false;
    }
}
