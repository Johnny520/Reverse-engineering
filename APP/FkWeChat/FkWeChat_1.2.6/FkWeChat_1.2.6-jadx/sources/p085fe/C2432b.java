package p085fe;

import be.AbstractC1117e;
import java.util.List;
import me.AbstractC5166e;
import me.C5164c;
import me.C5168g;
import me.InterfaceC5167f;
import ne.AbstractC5591c;
import ne.C5589a;
import ne.InterfaceC5590b;
import p080f9.C2363j;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p217oe.InterfaceC5742d;
import p247qe.C6416a;
import p247qe.C6417b;
import p247qe.C6418c;
import p247qe.C6419d;
import p247qe.C6420e;
import p247qe.C6421f;
import p247qe.C6422g;
import p247qe.C6423h;
import p247qe.C6424i;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: fe.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2432b extends AbstractC5166e {

    /* JADX INFO: renamed from: h */
    public AbstractC5166e.a f6603h;

    /* JADX INFO: renamed from: i */
    public final List f6604i;

    /* JADX INFO: renamed from: fe.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC5167f {

        /* JADX INFO: renamed from: a */
        public static final a f6605a = new a();

        @Override // me.InterfaceC5167f
        /* JADX INFO: renamed from: a */
        public AbstractC5166e mo8793a(C5168g c5168g) {
            c5168g.getClass();
            return new C2432b(c5168g, C5589a.f17471e.m22682c());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2432b(C5168g c5168g, InterfaceC5590b interfaceC5590b) {
        super(c5168g, interfaceC5590b);
        c5168g.getClass();
        interfaceC5590b.getClass();
        this.f6603h = new AbstractC5166e.a(m21211j(), m21211j(), m21209h());
        this.f6604i = AbstractC5114x.m20803r(new C6418c(), new C6420e(), new C6419d(), new C6424i(), new C6417b(), new C6423h(), new C6416a(), new C6421f(), new C6422g());
    }

    @Override // me.AbstractC5166e
    /* JADX INFO: renamed from: e */
    public List mo8787e(C5164c.a aVar, C5168g c5168g) {
        aVar.getClass();
        c5168g.getClass();
        return aVar.m21192i() == -1 ? m21210i() : super.mo8787e(aVar, c5168g);
    }

    @Override // me.AbstractC5166e
    /* JADX INFO: renamed from: g */
    public List mo8788g() {
        return this.f6604i;
    }

    @Override // me.AbstractC5166e
    /* JADX INFO: renamed from: k */
    public AbstractC5166e.a mo8789k() {
        return this.f6603h;
    }

    @Override // me.AbstractC5166e
    /* JADX INFO: renamed from: m */
    public void mo8790m(C5164c.a aVar, InterfaceC5590b interfaceC5590b, C5168g c5168g) {
        aVar.getClass();
        interfaceC5590b.getClass();
        c5168g.getClass();
        if (interfaceC5590b.mo22668a() == 0) {
            return;
        }
        int iM21191h = aVar.m21191h();
        int iMin = Math.min((aVar.m21191h() - aVar.m21192i()) + AbstractC5591c.m22694f(interfaceC5590b, aVar.m21186c()), aVar.m21190g());
        Character chM20759z0 = AbstractC5106t.m20759z0(interfaceC5590b.mo22669b());
        c5168g.m21222b(AbstractC5112w.m20789e(new InterfaceC6627f.a(new C2363j(iM21191h, iMin), (chM20759z0 != null && chM20759z0.charValue() == '>') ? AbstractC1117e.f3394d : ((chM20759z0 != null && chM20759z0.charValue() == '.') || (chM20759z0 != null && chM20759z0.charValue() == ')')) ? AbstractC1117e.f3380D : AbstractC1117e.f3377A)));
    }

    @Override // me.AbstractC5166e
    /* JADX INFO: renamed from: q */
    public void mo8791q(C5164c.a aVar) {
        aVar.getClass();
        if (aVar.m21192i() == -1) {
            m8792r(new AbstractC5166e.a(m21211j(), m21212l().mo22672e(aVar), m21209h()));
            return;
        }
        if (InterfaceC5742d.f18111a.m23241a(aVar, mo8789k().m21218c())) {
            InterfaceC5590b interfaceC5590bM21218c = mo8789k().m21218c();
            InterfaceC5590b interfaceC5590bMo22671d = mo8789k().m21218c().mo22671d(aVar);
            if (interfaceC5590bMo22671d == null) {
                interfaceC5590bMo22671d = mo8789k().m21218c();
            }
            m8792r(new AbstractC5166e.a(interfaceC5590bM21218c, interfaceC5590bMo22671d, m21209h()));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m8792r(AbstractC5166e.a aVar) {
        aVar.getClass();
        this.f6603h = aVar;
    }
}
