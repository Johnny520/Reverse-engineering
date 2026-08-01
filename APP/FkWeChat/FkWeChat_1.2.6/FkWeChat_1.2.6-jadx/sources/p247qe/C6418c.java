package p247qe;

import java.util.List;
import me.AbstractC5166e;
import me.C5164c;
import me.C5168g;
import ne.AbstractC5591c;
import ne.InterfaceC5590b;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p217oe.C5739a;
import p217oe.InterfaceC5742d;
import pe.C6070c;

/* JADX INFO: renamed from: qe.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6418c implements InterfaceC5742d {
    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: a */
    public List mo12784a(C5164c.a aVar, C5168g c5168g, AbstractC5166e.a aVar2) {
        aVar.getClass();
        c5168g.getClass();
        aVar2.getClass();
        if (AbstractC5591c.m22694f(aVar2.m21218c(), aVar.m21186c()) > aVar.m21192i()) {
            return AbstractC5114x.m20800o();
        }
        Integer numM21184a = aVar.m21184a();
        if (numM21184a == null) {
            return AbstractC5114x.m20800o();
        }
        C5164c.a aVarM21196m = aVar.m21196m(numM21184a.intValue());
        return aVarM21196m == null ? AbstractC5114x.m20800o() : C5739a.f18090a.m23219d(aVarM21196m, aVar2.m21216a()) ? AbstractC5112w.m20789e(new C6070c(aVar2.m21216a(), c5168g, aVar)) : AbstractC5114x.m20800o();
    }

    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: b */
    public boolean mo12785b(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        return false;
    }
}
