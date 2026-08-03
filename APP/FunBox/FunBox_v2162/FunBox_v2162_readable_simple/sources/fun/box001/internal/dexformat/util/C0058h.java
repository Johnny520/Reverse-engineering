package fun.box001.internal.dexformat.util;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0039p;
import fun.box001.internal.dexformat.C0030g;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.AbstractC0184n;
import java.util.BitSet;

/* JADX INFO: renamed from: f.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0058h extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0058h f287a = null;

    static {
        f287a = new C0058h();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 2;
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
    public final String mo179h(AbstractC0033j r3) {
        C0164o r0 = r3.m140m();
        AbstractC0184n r32 = (AbstractC0184n) ((C0030g) r3).m117y();
        if (r0.m513p(0).m382g() != 1) goto L5;
        int r02 = 32;
    L7:
        return AbstractC0039p.m164j(r32, r02);
    L5:
        r02 = 64;
        goto L7
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j r7) {
        C0164o r0 = r7.m140m();
        if ((r7 instanceof C0030g) == true) goto L5;
        return false;
    L5:
        if (r0.m504B() == 1) goto L7;
        return false;
    L7:
        if (AbstractC0039p.m170p(r0.m513p(0).m384i()) == false) goto L26;
        AbstractC0171a r72 = ((C0030g) r7).m117y();
        if ((r72 instanceof AbstractC0184n) == true) goto L12;
        return false;
    L12:
        AbstractC0184n r73 = (AbstractC0184n) r72;
        if (r0.m513p(0).m382g() != 1) goto L19;
        if ((r73.mo438h() & 65535) == 0) goto L17;
        return false;
    L17:
        return true;
    L19:
        if ((r73.mo439i() & 281474976710655L) == 0) goto L21;
        return false;
    L21:
        return true;
    L26:
        return false;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d r6, AbstractC0033j r7) {
        C0164o r0 = r7.m140m();
        AbstractC0184n r1 = (AbstractC0184n) ((C0030g) r7).m117y();
        if (r0.m513p(0).m382g() != 1) goto L5;
        int r12 = r1.mo438h() >>> 16;
    L6:
        short r72 = AbstractC0039p.m167m(r0.m513p(0).m384i(), r7);
        AbstractC0039p.m173s(r6, r72, (short) r12);
        return;
    L5:
        r12 = (int) (r1.mo439i() >>> 48);
        goto L6
    }
}
