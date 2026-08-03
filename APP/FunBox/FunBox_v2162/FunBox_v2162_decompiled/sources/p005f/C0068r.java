package p005f;

import java.util.BitSet;
import p004e.AbstractC0033j;
import p004e.AbstractC0039p;
import p004e.C0030g;
import p009j.C0162m;
import p009j.C0164o;
import p010k.AbstractC0171a;
import p010k.C0190t;
import p010k.C0191u;
import p013n.C0202d;

/* JADX INFO: renamed from: f.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0068r extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0068r f297a = new C0068r();

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 3;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: f */
    public final BitSet mo177f(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        int iM504B = c0164oM140m.m504B();
        BitSet bitSet = new BitSet(iM504B);
        boolean zM170p = AbstractC0039p.m170p(c0164oM140m.m513p(0).m384i());
        if (iM504B == 1) {
            bitSet.set(0, zM170p);
        } else if (c0164oM140m.m513p(0).m384i() == c0164oM140m.m513p(1).m384i()) {
            bitSet.set(0, zM170p);
            bitSet.set(1, zM170p);
        }
        return bitSet;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j abstractC0033j) {
        return abstractC0033j.m140m().m513p(0).m388o() + ", " + abstractC0033j.mo116d();
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j abstractC0033j) {
        return abstractC0033j.mo115c();
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j abstractC0033j) {
        C0162m c0162mP;
        if (!(abstractC0033j instanceof C0030g)) {
            return false;
        }
        C0164o c0164oM140m = abstractC0033j.m140m();
        int iM504B = c0164oM140m.m504B();
        if (iM504B == 1) {
            c0162mP = c0164oM140m.m513p(0);
        } else {
            if (iM504B != 2) {
                return false;
            }
            c0162mP = c0164oM140m.m513p(0);
            if (c0162mP.m384i() != c0164oM140m.m513p(1).m384i()) {
                return false;
            }
        }
        if (!AbstractC0039p.m170p(c0162mP.m384i())) {
            return false;
        }
        AbstractC0171a abstractC0171aM117y = ((C0030g) abstractC0033j).m117y();
        return (abstractC0171aM117y instanceof C0191u) || (abstractC0171aM117y instanceof C0190t);
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d c0202d, AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        AbstractC0039p.m174t(c0202d, AbstractC0039p.m167m(c0164oM140m.m513p(0).m384i(), abstractC0033j), ((C0030g) abstractC0033j).m118z());
    }
}
