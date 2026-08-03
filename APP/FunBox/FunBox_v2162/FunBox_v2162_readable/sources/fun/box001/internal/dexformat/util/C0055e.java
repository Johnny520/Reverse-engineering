package fun.box001.internal.dexformat.util;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0039p;
import fun.box001.internal.dexformat.C0021E;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0164o;
import java.util.BitSet;

/* JADX INFO: renamed from: f.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0055e extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0055e f284a = new C0055e();

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 1;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: f */
    public final BitSet mo177f(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        BitSet bitSet = new BitSet(2);
        int iM384i = c0164oM140m.m513p(0).m384i();
        int iM384i2 = c0164oM140m.m513p(1).m384i();
        int iM504B = c0164oM140m.m504B();
        if (iM504B == 2) {
            bitSet.set(0, AbstractC0039p.m171q(iM384i));
            bitSet.set(1, AbstractC0039p.m171q(iM384i2));
        } else {
            if (iM504B != 3) {
                throw new AssertionError();
            }
            if (iM384i != iM384i2) {
                bitSet.set(0, false);
                bitSet.set(1, false);
            } else {
                boolean zM171q = AbstractC0039p.m171q(iM384i2);
                bitSet.set(0, zM171q);
                bitSet.set(1, zM171q);
            }
            bitSet.set(2, AbstractC0039p.m171q(c0164oM140m.m513p(2).m384i()));
        }
        return bitSet;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        int iM504B = c0164oM140m.m504B();
        return c0164oM140m.m513p(iM504B - 2).m388o() + ", " + c0164oM140m.m513p(iM504B - 1).m388o();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j abstractC0033j) {
        return "";
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j abstractC0033j) {
        C0162m c0162mP;
        C0162m c0162mP2;
        if (!(abstractC0033j instanceof C0021E)) {
            return false;
        }
        C0164o c0164oM140m = abstractC0033j.m140m();
        int iM504B = c0164oM140m.m504B();
        if (iM504B == 2) {
            c0162mP = c0164oM140m.m513p(0);
            c0162mP2 = c0164oM140m.m513p(1);
        } else {
            if (iM504B != 3) {
                return false;
            }
            c0162mP = c0164oM140m.m513p(1);
            c0162mP2 = c0164oM140m.m513p(2);
            if (c0162mP.m384i() != c0164oM140m.m513p(0).m384i()) {
                return false;
            }
        }
        return AbstractC0039p.m171q(c0162mP.m384i()) && AbstractC0039p.m171q(c0162mP2.m384i());
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d c0202d, AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        int iM504B = c0164oM140m.m504B();
        c0202d.m498r(AbstractC0039p.m167m(AbstractC0039p.m166l(c0164oM140m.m513p(iM504B - 2).m384i(), c0164oM140m.m513p(iM504B - 1).m384i()), abstractC0033j));
    }
}
