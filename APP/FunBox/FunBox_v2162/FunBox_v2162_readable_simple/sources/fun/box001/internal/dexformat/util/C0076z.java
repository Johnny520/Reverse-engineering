package fun.box001.internal.dexformat.util;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0039p;
import fun.box001.internal.dexformat.C0030g;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.code.AbstractC0183m;
import fun.box001.internal.dexformat.writer.code.AbstractC0184n;
import java.util.BitSet;

/* JADX INFO: renamed from: f.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0076z extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0076z f305a = null;

    static {
        f305a = new C0076z();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 5;
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
        return AbstractC0039p.m164j((AbstractC0184n) ((C0030g) r2).m117y(), 64);
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j r5) {
        C0164o r0 = r5.m140m();
        if ((r5 instanceof C0030g) == true) goto L5;
    L11:
        return false;
    L5:
        if (r0.m504B() != 1) goto L11;
        if (AbstractC0039p.m170p(r0.m513p(0).m384i()) == false) goto L11;
        return ((C0030g) r5).m117y() instanceof AbstractC0183m;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d r7, AbstractC0033j r8) {
        C0164o r0 = r8.m140m();
        long r1 = ((AbstractC0183m) ((C0030g) r8).m117y()).mo439i();
        short r82 = AbstractC0039p.m167m(r0.m513p(0).m384i(), r8);
        r7.m498r(r82);
        r7.m498r((short) r1);
        r7.m498r((short) (r1 >> 16));
        r7.m498r((short) (r1 >> 32));
        r7.m498r((short) (r1 >> 48));
    }
}
