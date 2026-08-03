package fun.box001.internal.dexformat.util;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0039p;
import fun.box001.internal.dexformat.C0030g;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.C0187q;
import fun.box001.internal.dexformat.writer.code.C0191u;

/* JADX INFO: renamed from: f.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0073w extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0073w f302a = null;

    static {
        f302a = new C0073w();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 3;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j r3) {
        return AbstractC0039p.m169o(r3.m140m()) + ", " + r3.mo116d();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j r1) {
        return r1.mo115c();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j r8) {
        if ((r8 instanceof C0030g) == true) goto L5;
        return false;
    L5:
        C0030g r82 = (C0030g) r8;
        int r0 = r82.m118z();
        AbstractC0171a r2 = r82.m117y();
        if (AbstractC0039p.m172r(r0) == true) goto L9;
        return false;
    L9:
        if ((r2 instanceof C0187q) == false) goto L11;
    L13:
        C0164o r83 = r82.m140m();
        r83.m504B();
        if (r83.m504B() == 0) goto L33;
        int r02 = r83.m504B();
        if (r02 >= 2) goto L18;
    L17:
        boolean r03 = true;
    L24:
        if (r03 == true) goto L26;
        return false;
    L26:
        if (AbstractC0039p.m172r(r83.m513p(0).m384i()) == false) goto L38;
        int r04 = r83.m504B();
        int r3 = 0;
        int r4 = 0;
    L28:
        if (r3 >= r04) goto L31;
        r4 = r4 + r83.mo403b(r3).m469f();
        r3 = r3 + 1;
        goto L28
    L31:
        if (AbstractC0039p.m170p(r4) == true) goto L33;
        return false;
    L38:
        return false;
    L18:
        int r32 = r83.m513p(0).m384i();
        int r42 = 0;
    L19:
        if (r42 >= r02) goto L17;
        C0162m r5 = r83.m513p(r42);
        if (r5.m384i() != r32) goto L22;
        r32 = r32 + r5.m382g();
        r42 = r42 + 1;
        goto L19
    L22:
        r03 = false;
    L33:
        return true;
    L11:
        if ((r2 instanceof C0191u) == true) goto L13;
        return false;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d r8, AbstractC0033j r9) {
        C0164o r0 = r9.m140m();
        int r1 = ((C0030g) r9).m118z();
        int r3 = 0;
        if (r0.m504B() != 0) goto L5;
        int r2 = 0;
    L6:
        int r4 = r0.m504B();
        int r5 = 0;
    L7:
        if (r3 >= r4) goto L9;
        r5 = r5 + r0.mo403b(r3).m469f();
        r3 = r3 + 1;
        goto L7
    L9:
        r8.m498r(AbstractC0039p.m167m(r5, r9));
        r8.m498r((short) r1);
        r8.m498r((short) r2);
        return;
    L5:
        r2 = r0.m513p(0).m384i();
        goto L6
    }
}
