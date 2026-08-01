package p217oe;

import be.AbstractC1113a;
import me.C5164c;
import me.C5168g;
import ne.InterfaceC5590b;
import p217oe.InterfaceC5740b;

/* JADX INFO: renamed from: oe.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5741c implements InterfaceC5740b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5590b f18107a;

    /* JADX INFO: renamed from: b */
    public final C5168g.a f18108b;

    /* JADX INFO: renamed from: c */
    public int f18109c;

    /* JADX INFO: renamed from: d */
    public InterfaceC5740b.c f18110d;

    public AbstractC5741c(InterfaceC5590b interfaceC5590b, C5168g.a aVar) {
        interfaceC5590b.getClass();
        aVar.getClass();
        this.f18107a = interfaceC5590b;
        this.f18108b = aVar;
        this.f18109c = -2;
    }

    @Override // p217oe.InterfaceC5740b
    /* JADX INFO: renamed from: a */
    public final InterfaceC5740b.c mo23222a(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        if (this.f18109c != aVar.m21191h() && this.f18110d != null) {
            return InterfaceC5740b.c.f18100d.m23235a();
        }
        int i10 = this.f18109c;
        if (i10 == -1 || i10 > aVar.m21191h()) {
            return InterfaceC5740b.c.f18100d.m23237c();
        }
        if (this.f18109c < aVar.m21191h() && !mo12776c(aVar)) {
            return InterfaceC5740b.c.f18100d.m23237c();
        }
        InterfaceC5740b.c cVar = this.f18110d;
        if (cVar == null) {
            return mo12778h(aVar, interfaceC5590b);
        }
        cVar.getClass();
        return cVar;
    }

    @Override // p217oe.InterfaceC5740b
    /* JADX INFO: renamed from: d */
    public final InterfaceC5590b mo23223d() {
        return this.f18107a;
    }

    @Override // p217oe.InterfaceC5740b
    /* JADX INFO: renamed from: e */
    public final int mo23224e(C5164c.a aVar) {
        aVar.getClass();
        if (this.f18110d != null) {
            return aVar.m21191h() + 1;
        }
        int i10 = this.f18109c;
        if (i10 != -1 && i10 <= aVar.m21191h()) {
            this.f18109c = mo12777g(aVar);
        }
        return this.f18109c;
    }

    @Override // p217oe.InterfaceC5740b
    /* JADX INFO: renamed from: f */
    public boolean mo23225f(InterfaceC5740b.a aVar) {
        aVar.getClass();
        if (aVar == InterfaceC5740b.a.f18094s) {
            aVar = mo12779j();
        }
        aVar.mo23227c(this.f18108b, mo12780k());
        return aVar != InterfaceC5740b.a.f18095t;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo12777g(C5164c.a aVar);

    /* JADX INFO: renamed from: h */
    public abstract InterfaceC5740b.c mo12778h(C5164c.a aVar, InterfaceC5590b interfaceC5590b);

    /* JADX INFO: renamed from: i */
    public final InterfaceC5590b m23238i() {
        return this.f18107a;
    }

    /* JADX INFO: renamed from: j */
    public abstract InterfaceC5740b.a mo12779j();

    /* JADX INFO: renamed from: k */
    public abstract AbstractC1113a mo12780k();

    /* JADX INFO: renamed from: l */
    public final void m23239l(int i10, InterfaceC5740b.c cVar) {
        cVar.getClass();
        this.f18109c = i10;
        this.f18110d = cVar;
    }
}
