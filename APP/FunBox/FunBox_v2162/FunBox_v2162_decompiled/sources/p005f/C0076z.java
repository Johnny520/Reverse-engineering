package p005f;

import java.util.BitSet;
import p004e.AbstractC0033j;
import p004e.AbstractC0039p;
import p004e.C0030g;
import p009j.C0164o;
import p010k.AbstractC0183m;
import p010k.AbstractC0184n;
import p013n.C0202d;

/* JADX INFO: renamed from: f.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0076z extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0076z f305a = new C0076z();

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 5;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: f */
    public final BitSet mo177f(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, AbstractC0039p.m170p(c0164oM140m.m513p(0).m384i()));
        return bitSet;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j abstractC0033j) {
        return abstractC0033j.m140m().m513p(0).m388o() + ", " + AbstractC0039p.m165k((AbstractC0184n) ((C0030g) abstractC0033j).m117y());
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j abstractC0033j) {
        return AbstractC0039p.m164j((AbstractC0184n) ((C0030g) abstractC0033j).m117y(), 64);
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        if ((abstractC0033j instanceof C0030g) && c0164oM140m.m504B() == 1 && AbstractC0039p.m170p(c0164oM140m.m513p(0).m384i())) {
            return ((C0030g) abstractC0033j).m117y() instanceof AbstractC0183m;
        }
        return false;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d c0202d, AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        long jMo439i = ((AbstractC0183m) ((C0030g) abstractC0033j).m117y()).mo439i();
        c0202d.m498r(AbstractC0039p.m167m(c0164oM140m.m513p(0).m384i(), abstractC0033j));
        c0202d.m498r((short) jMo439i);
        c0202d.m498r((short) (jMo439i >> 16));
        c0202d.m498r((short) (jMo439i >> 32));
        c0202d.m498r((short) (jMo439i >> 48));
    }
}
