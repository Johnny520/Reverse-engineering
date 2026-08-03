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
    public static final C0069s f298a = null;

    static {
        f298a = new C0069s();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 3;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: f */
    public final BitSet mo177f(AbstractC0033j r3) {
        C0164o r32 = r3.m140m();
        BitSet r0 = new BitSet(1);
        r0.set(0, AbstractC0039p.m170p(r32.m513p(0).m384i()));
        return r0;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j r4) {
        return r4.m140m().m513p(0).m388o() + ", " + AbstractC0039p.m165k((AbstractC0184n) ((C0030g) r4).m117y());
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j r2) {
        return AbstractC0039p.m164j((AbstractC0184n) ((C0030g) r2).m117y(), 32);
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j r5) {
        C0164o r0 = r5.m140m();
        if ((r5 instanceof C0030g) == true) goto L5;
    L14:
        return false;
    L5:
        if (r0.m504B() != 1) goto L14;
        if (AbstractC0039p.m170p(r0.m513p(0).m384i()) == false) goto L14;
        AbstractC0171a r52 = ((C0030g) r5).m117y();
        if ((r52 instanceof AbstractC0184n) == true) goto L13;
        return false;
    L13:
        return ((AbstractC0184n) r52).mo437g();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d r4, AbstractC0033j r5) {
        C0164o r0 = r5.m140m();
        int r1 = ((AbstractC0184n) ((C0030g) r5).m117y()).mo438h();
        AbstractC0039p.m174t(r4, AbstractC0039p.m167m(r0.m513p(0).m384i(), r5), r1);
    }
}
