package p005f;

import java.util.BitSet;
import p004e.AbstractC0033j;
import p004e.AbstractC0039p;
import p004e.C0022F;
import p009j.C0164o;
import p013n.C0202d;

/* JADX INFO: renamed from: f.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0060j extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0060j f289a = new C0060j();

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: b */
    public final boolean mo175b(C0022F c0022f) {
        int iM87A = c0022f.m87A();
        if (iM87A != 0) {
            return ((short) iM87A) == iM87A;
        }
        return false;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 2;
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
        return abstractC0033j.m140m().m513p(0).m388o() + ", " + AbstractC0039p.m162c(abstractC0033j);
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j abstractC0033j) {
        return AbstractC0039p.m161a(abstractC0033j);
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        if (!(abstractC0033j instanceof C0022F) || c0164oM140m.m504B() != 1 || !AbstractC0039p.m170p(c0164oM140m.m513p(0).m384i())) {
            return false;
        }
        C0022F c0022f = (C0022F) abstractC0033j;
        if (c0022f.m88B()) {
            return mo175b(c0022f);
        }
        return true;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d c0202d, AbstractC0033j abstractC0033j) {
        AbstractC0039p.m173s(c0202d, AbstractC0039p.m167m(abstractC0033j.m140m().m513p(0).m384i(), abstractC0033j), (short) ((C0022F) abstractC0033j).m87A());
    }
}
