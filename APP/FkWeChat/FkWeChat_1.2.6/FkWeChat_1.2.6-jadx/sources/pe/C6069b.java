package pe;

import be.AbstractC1113a;
import be.C1115c;
import be.C1116d;
import me.C5164c;
import me.C5168g;
import ne.AbstractC5591c;
import ne.InterfaceC5590b;
import okhttp3.internal.url._UrlKt;
import p175le.C4752a;
import p217oe.AbstractC5741c;
import p217oe.InterfaceC5740b;

/* JADX INFO: renamed from: pe.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6069b extends AbstractC5741c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6069b(InterfaceC5590b interfaceC5590b, C5168g.a aVar) {
        super(interfaceC5590b, aVar);
        interfaceC5590b.getClass();
        aVar.getClass();
    }

    @Override // p217oe.InterfaceC5740b
    /* JADX INFO: renamed from: b */
    public boolean mo12775b() {
        return true;
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
        Integer numM21189f = aVar.m21189f();
        if (numM21189f != null) {
            return numM21189f.intValue();
        }
        return -1;
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: h */
    public InterfaceC5740b.c mo12778h(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        C4752a c4752a = C4752a.f14072a;
        if (aVar.m21192i() == -1) {
            return !AbstractC5591c.m22693e(AbstractC5591c.m22689a(m23238i(), aVar), m23238i()) ? InterfaceC5740b.c.f18100d.m23236b() : InterfaceC5740b.c.f18100d.m23237c();
        }
        throw new C1116d(_UrlKt.FRAGMENT_ENCODE_SET);
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: j */
    public InterfaceC5740b.a mo12779j() {
        return InterfaceC5740b.a.f18092q;
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: k */
    public AbstractC1113a mo12780k() {
        return C1115c.f3356f;
    }
}
