package p015b0;

import android.view.View;
import bsh.org.objectweb.asm.Opcodes;
import p040d0.AbstractC0649f;
import p040d0.C0646c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.C1873q1;
import p117i0.C1876r1;
import p117i0.InterfaceC1809a1;
import p222p.AbstractC3241o;
import p259r9.AbstractC3754e0;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p266s0.C3878h;
import p308v1.InterfaceC4412n0;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5891i0;
import p358y2.C5967c0;

/* JADX INFO: renamed from: b0.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0149o {

    /* JADX INFO: renamed from: a */
    public static final C3874d f392a = new C3874d(636288403, new C0148n(0), false);

    /* JADX INFO: renamed from: b */
    public static final C3874d f393b = new C3874d(-1357803046, new C0148n(1), false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m727a(InterfaceC5853o interfaceC5853o, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(790527681);
        int i11 = 4;
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4534f(interfaceC5853o) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4538h(c3874d) ? 32 : 16;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (objM4514P == c1823e) {
                C1845j1 c1845j1 = new C1845j1(null, C1823e.f6049j);
                c1836h0.m4545k0(c1845j1);
                objM4514P = c1845j1;
            }
            InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P;
            Object objM4514P2 = c1836h0.m4514P();
            if (objM4514P2 == c1823e) {
                objM4514P2 = new C0144j(interfaceC1809a1, 1);
                c1836h0.m4545k0(objM4514P2);
            }
            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P2;
            C5967c0 c5967c0 = AbstractC0157w.f415a;
            C0646c c0646cM7896j = AbstractC3754e0.m7896j(f393b, c1836h0, 6);
            AbstractC1874r.m4620b(new C1873q1[]{AbstractC0649f.f2015b.mo4582a(m731e(interfaceC1220a, c1836h0, 2)), AbstractC0649f.f2014a.mo4582a(c0646cM7896j)}, AbstractC3879i.m8071e(1070596993, new C0160z(interfaceC5853o, interfaceC1809a1, c3874d, c0646cM7896j, interfaceC1220a, 0), c1836h0), c1836h0, 56);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0143i(interfaceC5853o, c3874d, i9, i11);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m728b(InterfaceC5853o interfaceC5853o, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(155925518);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4534f(interfaceC5853o) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4538h(c3874d) ? 32 : 16;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            boolean z9 = c1836h0.m4542j(AbstractC0649f.f2014a) != null;
            boolean z10 = c1836h0.m4542j(AbstractC0649f.f2015b) != null;
            if (z9 && z10) {
                c1836h0.m4525a0(-1977187922);
                InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(C5840b.f23761g, true);
                int iHashCode = Long.hashCode(c1836h0.f6095T);
                C3878h c3878hM4546l = c1836h0.m4546l();
                InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853o);
                InterfaceC5605g.f22815f.getClass();
                C5660y c5660y = C5601f.f22758b;
                c1836h0.m4531d0();
                if (c1836h0.f6094S) {
                    c1836h0.m4544k(c5660y);
                } else {
                    c1836h0.m4551n0();
                }
                AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, interfaceC4412n0M6930d);
                AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
                AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
                AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
                AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
                c3874d.invoke(c1836h0, Integer.valueOf((i10 >> 3) & 14));
                c1836h0.m4553p(true);
                c1836h0.m4553p(false);
            } else if (z9) {
                c1836h0.m4525a0(-1976997706);
                m729c(interfaceC5853o, c3874d, c1836h0, i10 & 126);
                c1836h0.m4553p(false);
            } else if (z10) {
                c1836h0.m4525a0(-1976846922);
                AbstractC0157w.m738d(interfaceC5853o, c3874d, c1836h0, i10 & 126);
                c1836h0.m4553p(false);
            } else {
                c1836h0.m4525a0(-1976716505);
                m727a(interfaceC5853o, c3874d, c1836h0, i10 & 126);
                c1836h0.m4553p(false);
            }
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0143i(interfaceC5853o, c3874d, i9, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m729c(InterfaceC5853o interfaceC5853o, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(2064964257);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4534f(interfaceC5853o) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4538h(c3874d) ? 32 : 16;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            m730d(interfaceC5853o, c3874d, c1836h0, ((i10 << 3) & 896) | (i10 & 14) | 48);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0143i(interfaceC5853o, c3874d, i9, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m730d(InterfaceC5853o interfaceC5853o, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(771959668);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4534f(interfaceC5853o) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4538h(null) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c1836h0.m4538h(c3874d) ? Opcodes.ACC_NATIVE : 128;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 147) != 146)) {
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (objM4514P == c1823e) {
                C1845j1 c1845j1 = new C1845j1(null, C1823e.f6049j);
                c1836h0.m4545k0(c1845j1);
                objM4514P = c1845j1;
            }
            InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P;
            Object objM4514P2 = c1836h0.m4514P();
            if (objM4514P2 == c1823e) {
                objM4514P2 = new C0144j(interfaceC1809a1, 0);
                c1836h0.m4545k0(objM4514P2);
            }
            AbstractC1874r.m4619a(AbstractC0649f.f2015b.mo4582a(m731e((InterfaceC1220a) objM4514P2, c1836h0, 0)), AbstractC3879i.m8071e(-291176396, new C0145k(interfaceC5853o, interfaceC1809a1, c3874d, 0), c1836h0), c1836h0, 56);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0143i(interfaceC5853o, c3874d, i9, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final C0142h m731e(InterfaceC1220a interfaceC1220a, C1836h0 c1836h0, int i9) {
        View view = (View) c1836h0.m4542j(AbstractC5891i0.f23950f);
        boolean zM4534f = c1836h0.m4534f(view);
        Object objM4514P = c1836h0.m4514P();
        Object obj = C1851l.f6155a;
        if (zM4534f || objM4514P == obj) {
            objM4514P = new C0142h(view, null, interfaceC1220a);
            c1836h0.m4545k0(objM4514P);
        }
        C0142h c0142h = (C0142h) objM4514P;
        boolean zM4538h = c1836h0.m4538h(c0142h);
        Object objM4514P2 = c1836h0.m4514P();
        if (zM4538h || objM4514P2 == obj) {
            objM4514P2 = new C0129a(c0142h, 3);
            c1836h0.m4545k0(objM4514P2);
        }
        AbstractC1874r.m4621c(c0142h, (InterfaceC1231l) objM4514P2, c1836h0);
        return c0142h;
    }
}
