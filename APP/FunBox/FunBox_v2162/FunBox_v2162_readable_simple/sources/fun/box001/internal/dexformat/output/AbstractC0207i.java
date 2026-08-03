package fun.box001.internal.dexformat.output;

import fun.box001.internal.dexformat.writer.C0150a;

/* JADX INFO: renamed from: n.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0207i extends AbstractC0203e {

    /* JADX INFO: renamed from: c */
    private final C0205g f810c;

    public AbstractC0207i(int r2) {
        super(r2);
        this.f810c = new C0205g(r2);
    }

    /* JADX INFO: renamed from: F */
    public final int m531F() {
        C0205g r0 = this.f810c;
        int r1 = r0.m529o() - 1;
    L3:
        if (r1 < 0) goto L7;
        if (r0.m526l(r1) >= 0) goto L7;
        r1 = r1 - 1;
    L7:
        int r12 = r1 + 1;
        r0.m528n(r12);
        return r12;
    }

    /* JADX INFO: renamed from: G */
    public final int m532G(int r3) {
        C0205g r0 = this.f810c;
        if (r3 < r0.m529o()) goto L7;
        return -1;
    L7:
        return r0.m526l(r3);
    }

    /* JADX INFO: renamed from: H */
    protected final void m533H(int r6, InterfaceC0206h r7) {
        InterfaceC0206h r0 = (InterfaceC0206h) m517t(r6);
        m503A(r6, r7);
        C0205g r2 = this.f810c;
        if (r0 == null) goto L5;
        r2.m527m(((C0150a) r0).m350c(), -1);
    L5:
        int r72 = ((C0150a) r7).m350c();
        int r02 = r2.m529o();
        int r3 = 0;
    L7:
        if (r3 > (r72 - r02)) goto L9;
        r2.m524j(-1);
        r3 = r3 + 1;
        goto L7
    L9:
        r2.m527m(r72, r6);
    }
}
