package fun.box001.internal.dexformat.util;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0039p;
import fun.box001.internal.dexformat.C0030g;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.AbstractC0184n;
import java.util.BitSet;

/* JADX INFO: renamed from: f.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0069s extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0069s f298a = new C0069s();

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 3;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: f */
    public final BitSet mo177f(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, AbstractC0039p.m170p(c0164oM140m.m513p(0).m384i()));
        return bitSet;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j abstractC0033j) {
        return abstractC0033j.m140m().m513p(0).m388o() + ", " + AbstractC0039p.m165k((AbstractC0184n) ((C0030g) abstractC0033j).m117y());
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j abstractC0033j) {
        return AbstractC0039p.m164j((AbstractC0184n) ((C0030g) abstractC0033j).m117y(), 32);
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        if (!(abstractC0033j instanceof C0030g) || c0164oM140m.m504B() != 1 || !AbstractC0039p.m170p(c0164oM140m.m513p(0).m384i())) {
            return false;
        }
        AbstractC0171a abstractC0171aM117y = ((C0030g) abstractC0033j).m117y();
        if (abstractC0171aM117y instanceof AbstractC0184n) {
            return ((AbstractC0184n) abstractC0171aM117y).mo437g();
        }
        return false;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d c0202d, AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        AbstractC0039p.m174t(c0202d, AbstractC0039p.m167m(c0164oM140m.m513p(0).m384i(), abstractC0033j), ((AbstractC0184n) ((C0030g) abstractC0033j).m117y()).mo438h());
    }
}
