package p006g;

import p000a.AbstractC0001b;
import p002c.AbstractC0007d;
import p010k.AbstractC0171a;
import p010k.AbstractC0184n;
import p010k.AbstractC0185o;
import p010k.AbstractC0189s;
import p010k.C0172b;
import p010k.C0173c;
import p010k.C0175e;
import p010k.C0176f;
import p010k.C0177g;
import p010k.C0178h;
import p010k.C0179i;
import p010k.C0180j;
import p010k.C0181k;
import p010k.C0187q;
import p010k.C0190t;
import p010k.C0191u;
import p013n.C0202d;
import p013n.InterfaceC0199a;

/* JADX INFO: renamed from: g.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0089L {

    /* JADX INFO: renamed from: a */
    private final C0100k f330a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0199a f331b;

    public C0089L(C0100k c0100k, C0202d c0202d) {
        if (c0100k == null) {
            throw new NullPointerException("file == null");
        }
        this.f330a = c0100k;
        this.f331b = c0202d;
    }

    /* JADX INFO: renamed from: a */
    public static void m257a(C0100k c0100k, AbstractC0171a abstractC0171a) {
        if (!(abstractC0171a instanceof C0173c)) {
            c0100k.m310t(abstractC0171a);
            return;
        }
        C0172b c0172bM429g = ((C0173c) abstractC0171a).m429g();
        int iM504B = c0172bM429g.m504B();
        for (int i2 = 0; i2 < iM504B; i2++) {
            m257a(c0100k, c0172bM429g.m514q(i2));
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m258b(AbstractC0171a abstractC0171a) {
        if (abstractC0171a instanceof C0176f) {
            return 0;
        }
        if (abstractC0171a instanceof AbstractC0189s) {
            return 2;
        }
        if (abstractC0171a instanceof C0177g) {
            return 3;
        }
        if (abstractC0171a instanceof C0180j) {
            return 4;
        }
        if (abstractC0171a instanceof AbstractC0185o) {
            return 6;
        }
        if (abstractC0171a instanceof C0179i) {
            return 16;
        }
        if (abstractC0171a instanceof C0178h) {
            return 17;
        }
        if (abstractC0171a instanceof C0190t) {
            return 23;
        }
        if (abstractC0171a instanceof C0191u) {
            return 24;
        }
        if (abstractC0171a instanceof C0187q) {
            return 26;
        }
        if (abstractC0171a instanceof C0173c) {
            return 28;
        }
        if (abstractC0171a instanceof C0181k) {
            return 30;
        }
        if (abstractC0171a instanceof C0175e) {
            return 31;
        }
        throw new RuntimeException("Shouldn't happen");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m259c(C0173c c0173c, boolean z) {
        long jMo439i;
        long jMo439i2;
        int iM328q;
        InterfaceC0199a interfaceC0199a = this.f331b;
        boolean z2 = z && ((C0202d) interfaceC0199a).m486d();
        C0172b c0172bM429g = c0173c.m429g();
        int iM504B = c0172bM429g.m504B();
        if (z2) {
            ((C0202d) interfaceC0199a).m485c("  size: ".concat(AbstractC0001b.m13s(iM504B)));
        }
        C0202d c0202d = (C0202d) interfaceC0199a;
        c0202d.m500t(iM504B);
        for (int i2 = 0; i2 < iM504B; i2++) {
            AbstractC0171a abstractC0171aQ = c0172bM429g.m514q(i2);
            if (z2) {
                StringBuilder sb = new StringBuilder("  [");
                sb.append(Integer.toHexString(i2));
                sb.append("] ");
                sb.append(m258b(abstractC0171aQ) == 30 ? "null" : abstractC0171aQ.mo427f() + ' ' + abstractC0171aQ.mo107a());
                c0202d.m485c(sb.toString());
            }
            int iM258b = m258b(abstractC0171aQ);
            if (iM258b == 0 || iM258b == 6 || iM258b == 2) {
                long jMo439i3 = ((AbstractC0184n) abstractC0171aQ).mo439i();
                int iNumberOfLeadingZeros = ((65 - Long.numberOfLeadingZeros((jMo439i3 >> 63) ^ jMo439i3)) + 7) >> 3;
                C0202d c0202d2 = (C0202d) interfaceC0199a;
                c0202d2.m496p(iM258b | ((iNumberOfLeadingZeros - 1) << 5));
                while (iNumberOfLeadingZeros > 0) {
                    c0202d2.m496p((byte) jMo439i3);
                    jMo439i3 >>= 8;
                    iNumberOfLeadingZeros--;
                }
            } else {
                if (iM258b == 3) {
                    jMo439i = ((AbstractC0184n) abstractC0171aQ).mo439i();
                } else if (iM258b != 4) {
                    if (iM258b == 16) {
                        jMo439i2 = ((C0179i) abstractC0171aQ).mo439i() << 32;
                    } else if (iM258b != 17) {
                        C0100k c0100k = this.f330a;
                        switch (iM258b) {
                            case 21:
                                c0100k.getClass();
                                AbstractC0007d.m48b(abstractC0171aQ);
                                throw null;
                            case 22:
                                c0100k.m302l();
                                AbstractC0007d.m48b(abstractC0171aQ);
                                throw null;
                            case 23:
                                iM328q = c0100k.m306p().m328q((C0190t) abstractC0171aQ);
                                break;
                            case 24:
                                iM328q = c0100k.m307q().m329r((C0191u) abstractC0171aQ);
                                break;
                            case 25:
                                c0100k.m297g();
                                AbstractC0007d.m48b(abstractC0171aQ);
                                throw null;
                            case 26:
                                iM328q = c0100k.m303m().m338q((C0187q) abstractC0171aQ);
                                break;
                            case 27:
                                AbstractC0007d.m48b(abstractC0171aQ);
                                throw null;
                            case 28:
                                ((C0202d) interfaceC0199a).m496p(iM258b);
                                m259c((C0173c) abstractC0171aQ, false);
                                continue;
                            case 29:
                                ((C0202d) interfaceC0199a).m496p(iM258b);
                                AbstractC0007d.m48b(abstractC0171aQ);
                                throw null;
                            case 30:
                                ((C0202d) interfaceC0199a).m496p(iM258b);
                                continue;
                            case 31:
                                ((C0202d) interfaceC0199a).m496p((((C0175e) abstractC0171aQ).mo438h() << 5) | iM258b);
                                continue;
                            default:
                                throw new RuntimeException("Shouldn't happen");
                        }
                        jMo439i = iM328q;
                    } else {
                        jMo439i2 = ((C0178h) abstractC0171aQ).mo439i();
                    }
                    AbstractC0001b.m16v(interfaceC0199a, iM258b, jMo439i2);
                }
                AbstractC0001b.m17w(interfaceC0199a, iM258b, jMo439i);
            }
        }
        if (z2) {
            c0202d.m488f();
        }
    }
}
