package p005f;

import p004e.AbstractC0033j;
import p004e.AbstractC0039p;
import p004e.C0030g;
import p009j.C0162m;
import p009j.C0164o;
import p010k.AbstractC0171a;
import p010k.C0187q;
import p010k.C0191u;
import p013n.C0202d;

/* JADX INFO: renamed from: f.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0073w extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0073w f302a = new C0073w();

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 3;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j abstractC0033j) {
        return AbstractC0039p.m169o(abstractC0033j.m140m()) + ", " + abstractC0033j.mo116d();
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j abstractC0033j) {
        return abstractC0033j.mo115c();
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j abstractC0033j) {
        boolean z;
        if (!(abstractC0033j instanceof C0030g)) {
            return false;
        }
        C0030g c0030g = (C0030g) abstractC0033j;
        int iM118z = c0030g.m118z();
        AbstractC0171a abstractC0171aM117y = c0030g.m117y();
        if (!AbstractC0039p.m172r(iM118z)) {
            return false;
        }
        if (!(abstractC0171aM117y instanceof C0187q) && !(abstractC0171aM117y instanceof C0191u)) {
            return false;
        }
        C0164o c0164oM140m = c0030g.m140m();
        c0164oM140m.m504B();
        if (c0164oM140m.m504B() != 0) {
            int iM504B = c0164oM140m.m504B();
            if (iM504B >= 2) {
                int iM384i = c0164oM140m.m513p(0).m384i();
                for (int i2 = 0; i2 < iM504B; i2++) {
                    C0162m c0162mP = c0164oM140m.m513p(i2);
                    if (c0162mP.m384i() != iM384i) {
                        z = false;
                        break;
                    }
                    iM384i += c0162mP.m382g();
                }
                z = true;
                return !z ? false : false;
            }
            z = true;
            if (!z && AbstractC0039p.m172r(c0164oM140m.m513p(0).m384i())) {
                int iM504B2 = c0164oM140m.m504B();
                int iM469f = 0;
                for (int i3 = 0; i3 < iM504B2; i3++) {
                    iM469f += c0164oM140m.mo403b(i3).m469f();
                }
                if (!AbstractC0039p.m170p(iM469f)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d c0202d, AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        int iM118z = ((C0030g) abstractC0033j).m118z();
        int iM384i = c0164oM140m.m504B() == 0 ? 0 : c0164oM140m.m513p(0).m384i();
        int iM504B = c0164oM140m.m504B();
        int iM469f = 0;
        for (int i2 = 0; i2 < iM504B; i2++) {
            iM469f += c0164oM140m.mo403b(i2).m469f();
        }
        c0202d.m498r(AbstractC0039p.m167m(iM469f, abstractC0033j));
        c0202d.m498r((short) iM118z);
        c0202d.m498r((short) iM384i);
    }
}
