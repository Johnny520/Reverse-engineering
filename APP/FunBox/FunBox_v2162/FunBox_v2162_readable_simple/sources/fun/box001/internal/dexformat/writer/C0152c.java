package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.AbstractC0207i;

/* JADX INFO: renamed from: j.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0152c extends AbstractC0207i {

    /* JADX INFO: renamed from: d */
    private int f487d;

    public C0152c(int r1) {
        super(r1);
        this.f487d = -1;
    }

    /* JADX INFO: renamed from: I */
    public final int m357I() {
        int r0 = m504B();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L8;
        C0150a r3 = (C0150a) m517t(r1);
        if (r3 == null) goto L7;
        r2 = r3.m349b().m504B() + r2;
    L7:
        r1 = r1 + 1;
        goto L3
    L8:
        return r2;
    }

    /* JADX INFO: renamed from: J */
    public final int m358J() {
        if (this.f487d != (-1)) goto L12;
        C0151b r0 = new C0151b();
        int r1 = m504B();
        int r3 = 0;
    L5:
        if (r3 >= r1) goto L10;
        C0157h r4 = m511n(r3).m349b();
        int r5 = r4.m504B();
        int r6 = 0;
    L7:
        if (r6 >= r5) goto L9;
        r4.m512o(r6).mo363b(r0);
        r6 = r6 + 1;
        goto L7
    L9:
        r3 = r3 + 1;
        goto L5
    L10:
        this.f487d = r0.m356e();
    L12:
        return this.f487d;
    }

    /* JADX INFO: renamed from: K */
    public final C0150a m359K(int r3) {
        int r0 = m532G(r3);
        if (r0 < 0) goto L7;
        return m511n(r0);
    L7:
        throw new IllegalArgumentException("no such label: ".concat(RuntimeDexGenerator.m11q(r3)));
    }

    /* JADX INFO: renamed from: L */
    public final void m360L(int r1, C0150a r2) {
        m533H(r1, r2);
        this.f487d = -1;
    }
}
