package p005f;

import java.util.BitSet;
import p002c.AbstractC0007d;
import p004e.AbstractC0033j;
import p004e.AbstractC0039p;
import p009j.C0162m;
import p009j.C0164o;
import p011l.C0195c;
import p013n.C0202d;

/* JADX INFO: renamed from: f.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0074x extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0074x f303a = new C0074x();

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 4;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: f */
    public final BitSet mo177f(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        int iM504B = c0164oM140m.m504B();
        BitSet bitSet = new BitSet(iM504B);
        for (int i2 = 0; i2 < iM504B; i2++) {
            C0162m c0162mP = c0164oM140m.m513p(i2);
            bitSet.set(i2, AbstractC0039p.m171q((c0162mP.m382g() + c0162mP.m384i()) - 1));
        }
        return bitSet;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        int iM504B = c0164oM140m.m504B();
        int i2 = -1;
        if (iM504B <= 5) {
            int i3 = 0;
            int iM382g = 0;
            while (true) {
                if (i3 < iM504B) {
                    iM382g += c0164oM140m.m513p(i3).m382g();
                    if (!AbstractC0039p.m171q((r7.m382g() + r7.m384i()) - 1)) {
                        break;
                    }
                    i3++;
                } else if (iM382g <= 5) {
                    i2 = iM382g;
                }
            }
        }
        int iM504B2 = c0164oM140m.m504B();
        if (i2 != iM504B2) {
            C0164o c0164o = new C0164o(i2);
            int i4 = 0;
            for (int i5 = 0; i5 < iM504B2; i5++) {
                C0162m c0162mP = c0164oM140m.m513p(i5);
                c0164o.m521x(i4, c0162mP);
                if (c0162mP.m382g() == 2) {
                    c0164o.m521x(i4 + 1, C0162m.m377m(c0162mP.m384i() + 1, C0195c.f770o));
                    i4 += 2;
                } else {
                    i4++;
                }
            }
            c0164o.m536g();
            c0164oM140m = c0164o;
        }
        return AbstractC0039p.m168n(c0164oM140m) + ", " + abstractC0033j.mo116d();
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j abstractC0033j) {
        return abstractC0033j.mo115c();
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j abstractC0033j) {
        return false;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d c0202d, AbstractC0033j abstractC0033j) {
        AbstractC0007d.m47a(abstractC0033j);
        throw null;
    }
}
