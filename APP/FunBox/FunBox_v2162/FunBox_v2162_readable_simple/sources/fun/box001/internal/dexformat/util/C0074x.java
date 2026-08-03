package fun.box001.internal.dexformat.util;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0039p;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.data.C0195c;
import fun.box001.internal.dexmaker.AbstractC0007d;
import java.util.BitSet;

/* JADX INFO: renamed from: f.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0074x extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0074x f303a = null;

    static {
        f303a = new C0074x();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 4;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: f */
    public final BitSet mo177f(AbstractC0033j r6) {
        C0164o r62 = r6.m140m();
        int r0 = r62.m504B();
        BitSet r1 = new BitSet(r0);
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        int r4 = r62.m513p(r2).m384i();
        r1.set(r2, AbstractC0039p.m171q((r3.m382g() + r4) - 1));
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j r10) {
        C0164o r0 = r10.m140m();
        int r1 = r0.m504B();
        int r2 = 0;
        int r3 = -1;
        if (r1 > 5) goto L13;
        int r5 = 0;
        int r6 = 0;
    L6:
        if (r5 >= r1) goto L11;
        C0162m r7 = r0.m513p(r5);
        r6 = r6 + r7.m382g();
        int r8 = r7.m384i();
        if (AbstractC0039p.m171q((r7.m382g() + r8) - 1) == false) goto L13;
        r5 = r5 + 1;
        goto L6
    L11:
        if (r6 > 5) goto L13;
        r3 = r6;
    L13:
        int r12 = r0.m504B();
        if (r3 == r12) goto L25;
        C0164o r4 = new C0164o(r3);
        int r32 = 0;
    L17:
        if (r2 >= r12) goto L23;
        C0162m r52 = r0.m513p(r2);
        r4.m521x(r32, r52);
        if (r52.m382g() != 2) goto L21;
        r4.m521x(r32 + 1, C0162m.m377m(r52.m384i() + 1, C0195c.f770o));
        r32 = r32 + 2;
    L22:
        r2 = r2 + 1;
        goto L17
    L21:
        r32 = r32 + 1;
        goto L22
    L23:
        r4.m536g();
        r0 = r4;
    L25:
        return AbstractC0039p.m168n(r0) + ", " + r10.mo116d();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j r1) {
        return r1.mo115c();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j r1) {
        return false;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d r1, AbstractC0033j r2) {
        AbstractC0007d.m47a(r2);
        throw null;
    }
}
