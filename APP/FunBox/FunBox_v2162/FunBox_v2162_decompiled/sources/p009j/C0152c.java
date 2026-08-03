package p009j;

import p000a.AbstractC0001b;
import p013n.AbstractC0207i;

/* JADX INFO: renamed from: j.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0152c extends AbstractC0207i {

    /* JADX INFO: renamed from: d */
    private int f487d;

    public C0152c(int i2) {
        super(i2);
        this.f487d = -1;
    }

    /* JADX INFO: renamed from: I */
    public final int m357I() {
        int iM504B = m504B();
        int iM504B2 = 0;
        for (int i2 = 0; i2 < iM504B; i2++) {
            C0150a c0150a = (C0150a) m517t(i2);
            if (c0150a != null) {
                iM504B2 = c0150a.m349b().m504B() + iM504B2;
            }
        }
        return iM504B2;
    }

    /* JADX INFO: renamed from: J */
    public final int m358J() {
        if (this.f487d == -1) {
            C0151b c0151b = new C0151b();
            int iM504B = m504B();
            for (int i2 = 0; i2 < iM504B; i2++) {
                C0157h c0157hM349b = m511n(i2).m349b();
                int iM504B2 = c0157hM349b.m504B();
                for (int i3 = 0; i3 < iM504B2; i3++) {
                    c0157hM349b.m512o(i3).mo363b(c0151b);
                }
            }
            this.f487d = c0151b.m356e();
        }
        return this.f487d;
    }

    /* JADX INFO: renamed from: K */
    public final C0150a m359K(int i2) {
        int iM532G = m532G(i2);
        if (iM532G >= 0) {
            return m511n(iM532G);
        }
        throw new IllegalArgumentException("no such label: ".concat(AbstractC0001b.m11q(i2)));
    }

    /* JADX INFO: renamed from: L */
    public final void m360L(int i2, C0150a c0150a) {
        m533H(i2, c0150a);
        this.f487d = -1;
    }
}
