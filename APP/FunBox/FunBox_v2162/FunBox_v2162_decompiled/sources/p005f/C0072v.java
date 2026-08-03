package p005f;

import java.util.BitSet;
import p004e.AbstractC0033j;
import p004e.AbstractC0039p;
import p004e.C0030g;
import p009j.C0162m;
import p009j.C0164o;
import p010k.AbstractC0171a;
import p010k.C0187q;
import p010k.C0191u;
import p011l.C0195c;
import p013n.C0202d;

/* JADX INFO: renamed from: f.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0072v extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0072v f301a = new C0072v();

    /* JADX INFO: renamed from: v */
    private static C0164o m216v(C0164o c0164o) {
        int iM217w = m217w(c0164o);
        int iM504B = c0164o.m504B();
        if (iM217w == iM504B) {
            return c0164o;
        }
        C0164o c0164o2 = new C0164o(iM217w);
        int i2 = 0;
        for (int i3 = 0; i3 < iM504B; i3++) {
            C0162m c0162mP = c0164o.m513p(i3);
            c0164o2.m521x(i2, c0162mP);
            if (c0162mP.m382g() == 2) {
                c0164o2.m521x(i2 + 1, C0162m.m377m(c0162mP.m384i() + 1, C0195c.f770o));
                i2 += 2;
            } else {
                i2++;
            }
        }
        c0164o2.m536g();
        return c0164o2;
    }

    /* JADX INFO: renamed from: w */
    private static int m217w(C0164o c0164o) {
        int iM504B = c0164o.m504B();
        if (iM504B > 5) {
            return -1;
        }
        int iM382g = 0;
        for (int i2 = 0; i2 < iM504B; i2++) {
            iM382g += c0164o.m513p(i2).m382g();
            if (!AbstractC0039p.m171q((r5.m382g() + r5.m384i()) - 1)) {
                return -1;
            }
        }
        if (iM382g <= 5) {
            return iM382g;
        }
        return -1;
    }

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
        for (int i2 = 0; i2 < iM504B; i2++) {
            C0162m c0162mP = c0164oM140m.m513p(i2);
            bitSet.set(i2, AbstractC0039p.m171q((c0162mP.m382g() + c0162mP.m384i()) - 1));
        }
        return bitSet;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j abstractC0033j) {
        return AbstractC0039p.m168n(m216v(abstractC0033j.m140m())) + ", " + abstractC0033j.mo116d();
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j abstractC0033j) {
        return abstractC0033j.mo115c();
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j abstractC0033j) {
        if (!(abstractC0033j instanceof C0030g)) {
            return false;
        }
        C0030g c0030g = (C0030g) abstractC0033j;
        if (!AbstractC0039p.m172r(c0030g.m118z())) {
            return false;
        }
        AbstractC0171a abstractC0171aM117y = c0030g.m117y();
        return ((abstractC0171aM117y instanceof C0187q) || (abstractC0171aM117y instanceof C0191u)) && m217w(c0030g.m140m()) >= 0;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d c0202d, AbstractC0033j abstractC0033j) {
        int iM118z = ((C0030g) abstractC0033j).m118z();
        C0164o c0164oM216v = m216v(abstractC0033j.m140m());
        int iM504B = c0164oM216v.m504B();
        int iM384i = iM504B > 0 ? c0164oM216v.m513p(0).m384i() : 0;
        int iM384i2 = iM504B > 1 ? c0164oM216v.m513p(1).m384i() : 0;
        int iM384i3 = iM504B > 2 ? c0164oM216v.m513p(2).m384i() : 0;
        int iM384i4 = iM504B > 3 ? c0164oM216v.m513p(3).m384i() : 0;
        short sM167m = AbstractC0039p.m167m(AbstractC0039p.m166l(iM504B > 4 ? c0164oM216v.m513p(4).m384i() : 0, iM504B), abstractC0033j);
        short s = (short) iM118z;
        if ((iM384i & 15) != iM384i) {
            throw new IllegalArgumentException("n0 out of range 0..15");
        }
        if ((iM384i2 & 15) != iM384i2) {
            throw new IllegalArgumentException("n1 out of range 0..15");
        }
        if ((iM384i3 & 15) != iM384i3) {
            throw new IllegalArgumentException("n2 out of range 0..15");
        }
        if ((iM384i4 & 15) != iM384i4) {
            throw new IllegalArgumentException("n3 out of range 0..15");
        }
        c0202d.m498r(sM167m);
        c0202d.m498r(s);
        c0202d.m498r((short) ((iM384i2 << 4) | iM384i | (iM384i3 << 8) | (iM384i4 << 12)));
    }
}
