package fun.box001.internal.dexformat.util;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0039p;
import fun.box001.internal.dexformat.C0022F;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.C0164o;
import java.util.BitSet;

/* JADX INFO: renamed from: f.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0064n extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0064n f293a = new C0064n();

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: b */
    public final boolean mo175b(C0022F c0022f) {
        int iM87A = c0022f.m87A();
        if (iM87A != 0) {
            return ((short) iM87A) == iM87A;
        }
        return false;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 2;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: f */
    public final BitSet mo177f(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, AbstractC0039p.m171q(c0164oM140m.m513p(0).m384i()));
        bitSet.set(1, AbstractC0039p.m171q(c0164oM140m.m513p(1).m384i()));
        return bitSet;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        return c0164oM140m.m513p(0).m388o() + ", " + c0164oM140m.m513p(1).m388o() + ", " + AbstractC0039p.m162c(abstractC0033j);
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j abstractC0033j) {
        return AbstractC0039p.m161a(abstractC0033j);
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        if (!(abstractC0033j instanceof C0022F) || c0164oM140m.m504B() != 2 || !AbstractC0039p.m171q(c0164oM140m.m513p(0).m384i()) || !AbstractC0039p.m171q(c0164oM140m.m513p(1).m384i())) {
            return false;
        }
        C0022F c0022f = (C0022F) abstractC0033j;
        if (c0022f.m88B()) {
            return mo175b(c0022f);
        }
        return true;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d c0202d, AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        AbstractC0039p.m173s(c0202d, AbstractC0039p.m167m(AbstractC0039p.m166l(c0164oM140m.m513p(0).m384i(), c0164oM140m.m513p(1).m384i()), abstractC0033j), (short) ((C0022F) abstractC0033j).m87A());
    }
}
