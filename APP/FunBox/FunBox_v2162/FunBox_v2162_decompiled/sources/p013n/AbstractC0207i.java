package p013n;

import p009j.C0150a;

/* JADX INFO: renamed from: n.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0207i extends AbstractC0203e {

    /* JADX INFO: renamed from: c */
    private final C0205g f810c;

    public AbstractC0207i(int i2) {
        super(i2);
        this.f810c = new C0205g(i2);
    }

    /* JADX INFO: renamed from: F */
    public final int m531F() {
        C0205g c0205g = this.f810c;
        int iM529o = c0205g.m529o() - 1;
        while (iM529o >= 0 && c0205g.m526l(iM529o) < 0) {
            iM529o--;
        }
        int i2 = iM529o + 1;
        c0205g.m528n(i2);
        return i2;
    }

    /* JADX INFO: renamed from: G */
    public final int m532G(int i2) {
        C0205g c0205g = this.f810c;
        if (i2 >= c0205g.m529o()) {
            return -1;
        }
        return c0205g.m526l(i2);
    }

    /* JADX INFO: renamed from: H */
    protected final void m533H(int i2, InterfaceC0206h interfaceC0206h) {
        InterfaceC0206h interfaceC0206h2 = (InterfaceC0206h) m517t(i2);
        m503A(i2, interfaceC0206h);
        C0205g c0205g = this.f810c;
        if (interfaceC0206h2 != null) {
            c0205g.m527m(((C0150a) interfaceC0206h2).m350c(), -1);
        }
        int iM350c = ((C0150a) interfaceC0206h).m350c();
        int iM529o = c0205g.m529o();
        for (int i3 = 0; i3 <= iM350c - iM529o; i3++) {
            c0205g.m524j(-1);
        }
        c0205g.m527m(iM350c, i2);
    }
}
