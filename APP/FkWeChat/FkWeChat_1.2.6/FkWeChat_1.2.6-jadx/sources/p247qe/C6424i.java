package p247qe;

import java.util.List;
import me.AbstractC5166e;
import me.C5164c;
import me.C5168g;
import ne.AbstractC5591c;
import ne.InterfaceC5590b;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p217oe.InterfaceC5742d;
import p299ub.C8632n;
import pe.C6078k;

/* JADX INFO: renamed from: qe.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6424i implements InterfaceC5742d {

    /* JADX INFO: renamed from: b */
    public static final a f20228b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final C8632n f20229c = new C8632n("^ {0,3}(-+|=+) *$");

    /* JADX INFO: renamed from: c */
    private final CharSequence m25455c(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        String strM21188e = aVar.m21188e();
        if (strM21188e == null) {
            return null;
        }
        InterfaceC5590b interfaceC5590bMo22672e = interfaceC5590b.mo22672e(aVar.m21195l());
        if (AbstractC5591c.m22693e(interfaceC5590bMo22672e, interfaceC5590b)) {
            return AbstractC5591c.m22691c(interfaceC5590bMo22672e, strM21188e);
        }
        return null;
    }

    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: a */
    public List mo12784a(C5164c.a aVar, C5168g c5168g, AbstractC5166e.a aVar2) {
        CharSequence charSequenceM25455c;
        aVar.getClass();
        c5168g.getClass();
        aVar2.getClass();
        if (aVar2.m21219d() != null) {
            return AbstractC5114x.m20800o();
        }
        InterfaceC5590b interfaceC5590bM21216a = aVar2.m21216a();
        return !AbstractC1061t.m3842c(aVar2.m21218c(), interfaceC5590bM21216a) ? AbstractC5114x.m20800o() : (InterfaceC5742d.f18111a.m23241a(aVar, interfaceC5590bM21216a) && (charSequenceM25455c = m25455c(aVar, interfaceC5590bM21216a)) != null && f20229c.m33217i(charSequenceM25455c)) ? AbstractC5112w.m20789e(new C6078k(interfaceC5590bM21216a, c5168g)) : AbstractC5114x.m20800o();
    }

    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: b */
    public boolean mo12785b(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        return false;
    }

    /* JADX INFO: renamed from: qe.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
