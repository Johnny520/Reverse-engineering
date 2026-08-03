package fun.box001.internal.dexformat.util;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0039p;
import fun.box001.internal.dexformat.C0022F;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.C0164o;
import java.util.BitSet;

/* JADX INFO: renamed from: f.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0060j extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0060j f289a = null;

    static {
        f289a = new C0060j();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: b */
    public final boolean mo175b(C0022F r4) {
        int r42 = r4.m87A();
        if (r42 != 0) goto L5;
        return false;
    L5:
        if (((short) r42) != r42) goto L7;
        boolean r43 = true;
    L8:
        if (r43 == true) goto L10;
        return false;
    L10:
        return true;
    L7:
        r43 = false;
        goto L8
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
        return r4.m140m().m513p(0).m388o() + ", " + AbstractC0039p.m162c(r4);
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j r1) {
        return AbstractC0039p.m161a(r1);
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j r5) {
        C0164o r0 = r5.m140m();
        if ((r5 instanceof C0022F) == true) goto L5;
    L13:
        return false;
    L5:
        if (r0.m504B() != 1) goto L13;
        if (AbstractC0039p.m170p(r0.m513p(0).m384i()) == false) goto L13;
        C0022F r52 = (C0022F) r5;
        if (r52.m88B() == true) goto L12;
        return true;
    L12:
        return mo175b(r52);
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d r4, AbstractC0033j r5) {
        C0164o r0 = r5.m140m();
        int r1 = ((C0022F) r5).m87A();
        AbstractC0039p.m173s(r4, AbstractC0039p.m167m(r0.m513p(0).m384i(), r5), (short) r1);
    }
}
