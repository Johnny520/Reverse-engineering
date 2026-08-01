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
import p217oe.InterfaceC5740b;
import p299ub.C8632n;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: pe.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6071d extends AbstractC5741c {

    /* JADX INFO: renamed from: e */
    public final C5168g f19068e;

    /* JADX INFO: renamed from: f */
    public final String f19069f;

    /* JADX INFO: renamed from: g */
    public final C8632n f19070g;

    /* JADX INFO: renamed from: h */
    public int f19071h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6071d(InterfaceC5590b interfaceC5590b, C5168g c5168g, String str) {
        super(interfaceC5590b, c5168g.m21225e());
        interfaceC5590b.getClass();
        c5168g.getClass();
        str.getClass();
        this.f19068e = c5168g;
        this.f19069f = str;
        this.f19070g = new C8632n("^ {0,3}" + str + "+ *$");
        this.f19071h = -1;
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
        if (aVar.m21191h() < this.f19071h) {
            return InterfaceC5740b.c.f18100d.m23235a();
        }
        if (aVar.m21192i() != -1) {
            return InterfaceC5740b.c.f18100d.m23235a();
        }
        C4752a c4752a = C4752a.f14072a;
        if (!(aVar.m21192i() == -1)) {
            throw new C1116d(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        InterfaceC5590b interfaceC5590bM22689a = AbstractC5591c.m22689a(m23238i(), aVar);
        if (!AbstractC5591c.m22693e(interfaceC5590bM22689a, m23238i())) {
            return InterfaceC5740b.c.f18100d.m23236b();
        }
        int iM21190g = aVar.m21190g();
        this.f19071h = iM21190g;
        if (m24188m(AbstractC5591c.m22691c(interfaceC5590bM22689a, aVar.m21186c()))) {
            this.f19068e.m21222b(AbstractC5112w.m20789e(new InterfaceC6627f.a(new C2363j(aVar.m21191h() + 1, aVar.m21190g()), AbstractC1117e.f3384H)));
            m23239l(iM21190g, InterfaceC5740b.c.f18100d.m23236b());
        } else {
            C2363j c2363j = new C2363j(Math.min(aVar.m21191h() + 1 + AbstractC5591c.m22694f(m23238i(), aVar.m21186c()), iM21190g), iM21190g);
            if (c2363j.m8560o() < c2363j.m8561p()) {
                this.f19068e.m21222b(AbstractC5112w.m20789e(new InterfaceC6627f.a(c2363j, AbstractC1117e.f3383G)));
            }
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
        return C1115c.f3357g;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m24188m(CharSequence charSequence) {
        return this.f19070g.m33217i(charSequence);
    }
}
