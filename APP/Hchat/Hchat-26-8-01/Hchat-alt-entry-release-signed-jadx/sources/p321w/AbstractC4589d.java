package p321w;

import java.util.List;
import p085fg.InterfaceC1236q;
import p116i.C1738b1;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p119i2.C1922e;
import p119i2.C1926g;
import p266s0.C3878h;
import p276sf.C3958e;
import p308v1.InterfaceC4412n0;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import tf.C4173t;

/* JADX INFO: renamed from: w.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4589d {

    /* JADX INFO: renamed from: a */
    public static final C3958e f15127a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C4173t c4173t = C4173t.f13710g;
        f15127a = new C3958e(c4173t, c4173t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m9030a(C1926g c1926g, List list, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(-1794596951);
        int i10 = (i9 & 6) == 0 ? (c1836h0.m4534f(c1926g) ? 4 : 2) | i9 : i9;
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4538h(list) ? 32 : 16;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                C1922e c1922e = (C1922e) list.get(i11);
                InterfaceC1236q interfaceC1236q = (InterfaceC1236q) c1922e.f6503a;
                int i12 = c1922e.f6504b;
                int i13 = c1922e.f6505c;
                Object objM4514P = c1836h0.m4514P();
                if (objM4514P == C1851l.f6155a) {
                    objM4514P = C4586c.f15113b;
                    c1836h0.m4545k0(objM4514P);
                }
                InterfaceC4412n0 interfaceC4412n0 = (InterfaceC4412n0) objM4514P;
                int iHashCode = Long.hashCode(c1836h0.f6095T);
                C3878h c3878hM4546l = c1836h0.m4546l();
                InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, C5850l.f23787a);
                InterfaceC5605g.f22815f.getClass();
                C5660y c5660y = C5601f.f22758b;
                c1836h0.m4531d0();
                if (c1836h0.f6094S) {
                    c1836h0.m4544k(c5660y);
                } else {
                    c1836h0.m4551n0();
                }
                AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, interfaceC4412n0);
                AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
                AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
                AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
                AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
                interfaceC1236q.mo734b(c1926g.subSequence(i12, i13).f6529h, c1836h0, 0);
                c1836h0.m4553p(true);
            }
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C1738b1(c1926g, list, i9, 4);
        }
    }
}
