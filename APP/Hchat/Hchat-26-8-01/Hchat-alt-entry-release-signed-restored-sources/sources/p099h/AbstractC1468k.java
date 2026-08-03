package p099h;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.ListIterator;
import p028c1.AbstractC0378h;
import p069f.AbstractC0957r0;
import p069f.C0943k0;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p116i.AbstractC1742d;
import p116i.C1744d1;
import p116i.C1765k1;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.C1876r1;
import p117i0.InterfaceC1809a1;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p266s0.C3878h;
import p304uf.C4327a;
import p322w0.C4665p;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5845g;
import p356y0.C5850l;
import p356y0.InterfaceC5841c;
import p356y0.InterfaceC5853o;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: h.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1468k {

    /* JADX INFO: renamed from: a */
    public static final long f4881a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f4882b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long j3 = Integer.MIN_VALUE;
        f4881a = (j3 & 4294967295L) | (j3 << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m3989a(C1765k1 c1765k1, InterfaceC5853o interfaceC5853o, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, C3874d c3874d, C1836h0 c1836h0, int i9) {
        InterfaceC1231l interfaceC1231l3;
        C1836h0 c1836h02;
        C4665p c4665p;
        C1486t c1486t;
        C4665p c4665p2;
        Object obj;
        C1744d1 c1744d1M4375k;
        C1836h0 c1836h03;
        C1765k1 c1765k12 = c1765k1;
        C5845g c5845g = C5840b.f23761g;
        c1836h0.m4527b0(511725103);
        int i10 = (c1836h0.m4534f(c1765k12) ? 4 : 2) | i9;
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4534f(interfaceC5853o) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c1836h0.m4538h(interfaceC1231l) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= c1836h0.m4534f(c5845g) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i9 & 24576) == 0) {
            i10 |= c1836h0.m4538h(interfaceC1231l2) ? 16384 : 8192;
        }
        C3874d c3874d2 = c3874d;
        if ((196608 & i9) == 0) {
            i10 |= c1836h0.m4538h(c3874d2) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if (c1836h0.m4516S(i10 & 1, (74899 & i10) != 74898)) {
            int i11 = i10 & 14;
            boolean z9 = i11 == 4;
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (z9 || objM4514P == c1823e) {
                objM4514P = new C1486t(c1765k12);
                c1836h0.m4545k0(objM4514P);
            }
            C1486t c1486t2 = (C1486t) objM4514P;
            boolean z10 = i11 == 4;
            Object objM4514P2 = c1836h0.m4514P();
            Object obj2 = objM4514P2;
            if (z10 || objM4514P2 == c1823e) {
                Object[] objArr = {c1765k12.m4414c()};
                C4665p c4665p3 = new C4665p();
                c4665p3.addAll(AbstractC4165l.m8375L0(objArr));
                c1836h0.m4545k0(c4665p3);
                obj2 = c4665p3;
            }
            C4665p c4665p4 = (C4665p) obj2;
            boolean z11 = i11 == 4;
            Object objM4514P3 = c1836h0.m4514P();
            if (z11 || objM4514P3 == c1823e) {
                long[] jArr = AbstractC0957r0.f3015a;
                objM4514P3 = new C0943k0();
                c1836h0.m4545k0(objM4514P3);
            }
            C0943k0 c0943k0 = (C0943k0) objM4514P3;
            Object objM4414c = c1765k12.m4414c();
            C1845j1 c1845j1 = c1765k12.f5892d;
            if (!c4665p4.contains(objM4414c)) {
                c4665p4.clear();
                c4665p4.add(c1765k12.m4414c());
            }
            if (AbstractC1416l.m3825a(c1765k12.m4414c(), c1845j1.getValue())) {
                if (c4665p4.size() != 1 || !AbstractC1416l.m3825a(c4665p4.get(0), c1765k12.m4414c())) {
                    c4665p4.clear();
                    c4665p4.add(c1765k12.m4414c());
                }
                if (c0943k0.f2972e != 1 || c0943k0.m2316c(c1765k12.m4414c())) {
                    c0943k0.m2314a();
                }
                c1486t2.getClass();
            }
            if (!AbstractC1416l.m3825a(c1765k12.m4414c(), c1845j1.getValue()) && !c4665p4.contains(c1845j1.getValue())) {
                ListIterator listIterator = c4665p4.listIterator();
                int i12 = 0;
                while (true) {
                    C4327a c4327a = (C4327a) listIterator;
                    if (!c4327a.hasNext()) {
                        i12 = -1;
                        break;
                    } else if (AbstractC1416l.m3825a(interfaceC1231l2.invoke(c4327a.next()), interfaceC1231l2.invoke(c1845j1.getValue()))) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 == -1) {
                    c4665p4.add(c1845j1.getValue());
                } else {
                    c4665p4.set(i12, c1845j1.getValue());
                }
            }
            if (c0943k0.m2316c(c1845j1.getValue()) && c0943k0.m2316c(c1765k12.m4414c())) {
                c1836h0.m4525a0(1968995539);
                c1836h0.m4553p(false);
                c4665p = c4665p4;
                c1486t = c1486t2;
                interfaceC1231l3 = interfaceC1231l;
            } else {
                c1836h0.m4525a0(1966410449);
                c0943k0.m2314a();
                int size = c4665p4.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj3 = c4665p4.get(i13);
                    C1486t c1486t3 = c1486t2;
                    C3874d c3874d3 = c3874d2;
                    C4665p c4665p5 = c4665p4;
                    c0943k0.m2326m(obj3, AbstractC3879i.m8071e(-23915175, new C1461h(c1765k12, obj3, interfaceC1231l, c1486t3, c4665p5, c3874d3), c1836h0));
                    i13++;
                    c1765k12 = c1765k1;
                    c1486t2 = c1486t3;
                    c4665p4 = c4665p5;
                    c3874d2 = c3874d;
                }
                c4665p = c4665p4;
                c1486t = c1486t2;
                interfaceC1231l3 = interfaceC1231l;
                c1836h0.m4553p(false);
            }
            boolean zM4534f = c1836h0.m4534f(c1765k1.m4417f()) | c1836h0.m4534f(c1486t);
            Object objM4514P4 = c1836h0.m4514P();
            if (zM4534f || objM4514P4 == c1823e) {
                objM4514P4 = (C1453e0) interfaceC1231l3.invoke(c1486t);
                c1836h0.m4545k0(objM4514P4);
            }
            C1453e0 c1453e0 = (C1453e0) objM4514P4;
            C1765k1 c1765k13 = c1486t.f4935a;
            boolean zM4534f2 = c1836h0.m4534f(c1486t);
            Object objM4514P5 = c1836h0.m4514P();
            if (zM4534f2 || objM4514P5 == c1823e) {
                objM4514P5 = AbstractC1874r.m4639u(Boolean.FALSE);
                c1836h0.m4545k0(objM4514P5);
            }
            InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P5;
            InterfaceC1809a1 interfaceC1809a1M4643y = AbstractC1874r.m4643y(c1453e0.f4827d, c1836h0);
            if (AbstractC1416l.m3825a(c1765k13.m4414c(), c1765k13.f5892d.getValue())) {
                interfaceC1809a1.setValue(Boolean.FALSE);
            } else if (interfaceC1809a1M4643y.getValue() != null) {
                interfaceC1809a1.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
            InterfaceC5853o interfaceC5853o2 = C5850l.f23787a;
            if (zBooleanValue) {
                c1836h0.m4525a0(1353077497);
                c4665p2 = c4665p;
                C1836h0 c1836h04 = c1836h0;
                obj = null;
                c1744d1M4375k = AbstractC1742d.m4375k(c1486t.f4935a, AbstractC1742d.f5817q, null, c1836h04, 0, 2);
                boolean zM4534f3 = c1836h04.m4534f(c1744d1M4375k);
                Object objM4514P6 = c1836h04.m4514P();
                if (zM4534f3 || objM4514P6 == c1823e) {
                    objM4514P6 = AbstractC0378h.m1338c(interfaceC5853o2);
                    c1836h04.m4545k0(objM4514P6);
                }
                interfaceC5853o2 = (InterfaceC5853o) objM4514P6;
                c1836h04.m4553p(false);
                c1836h03 = c1836h04;
            } else {
                c4665p2 = c4665p;
                C1836h0 c1836h05 = c1836h0;
                obj = null;
                c1836h05.m4525a0(1353343539);
                c1836h05.m4553p(false);
                c1744d1M4375k = null;
                c1836h03 = c1836h05;
            }
            InterfaceC5853o interfaceC5853oMo10549d = interfaceC5853o.mo10549d(interfaceC5853o2.mo10549d(new C1478p(c1744d1M4375k, interfaceC1809a1M4643y, c1486t)));
            Object objM4514P7 = c1836h03.m4514P();
            if (objM4514P7 == c1823e) {
                objM4514P7 = new C1472m(c1486t);
                c1836h03.m4545k0(objM4514P7);
            }
            C1472m c1472m = (C1472m) objM4514P7;
            int iHashCode = Long.hashCode(c1836h03.f6095T);
            C3878h c3878hM4546l = c1836h03.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h03, interfaceC5853oMo10549d);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h03.m4531d0();
            if (c1836h03.f6094S) {
                c1836h03.m4544k(c5660y);
            } else {
                c1836h03.m4551n0();
            }
            AbstractC1874r.m4615A(C5601f.f22761e, c1836h03, c1472m);
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h03, c3878hM4546l);
            AbstractC1874r.m4638t(c1836h03, Integer.valueOf(iHashCode), C5601f.f22762f);
            AbstractC1874r.m4641w(C5601f.f22763g, c1836h03);
            AbstractC1874r.m4615A(C5601f.f22759c, c1836h03, interfaceC5853oM10543c);
            c1836h03.m4525a0(-860173498);
            int size2 = c4665p2.size();
            int i14 = 0;
            while (i14 < size2) {
                C4665p c4665p6 = c4665p2;
                Object obj4 = c4665p6.get(i14);
                c1836h03.m4520W(-2026002954, interfaceC1231l2.invoke(obj4), obj, 0);
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) c0943k0.m2320g(obj4);
                if (interfaceC1235p == null) {
                    c1836h03.m4525a0(1618454323);
                } else {
                    c1836h03.m4525a0(-2026001778);
                    interfaceC1235p.invoke(c1836h03, 0);
                }
                c1836h03.m4553p(false);
                c1836h03.m4553p(false);
                i14++;
                c4665p2 = c4665p6;
            }
            c1836h03.m4553p(false);
            c1836h03.m4553p(true);
            c1836h02 = c1836h03;
        } else {
            interfaceC1231l3 = interfaceC1231l;
            C1836h0 c1836h06 = c1836h0;
            c1836h06.m4519V();
            c1836h02 = c1836h06;
        }
        C1876r1 c1876r1M4557t = c1836h02.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C1464i(c1765k1, interfaceC5853o, interfaceC1231l3, interfaceC1231l2, c3874d, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m3990b(Object obj, InterfaceC5853o interfaceC5853o, InterfaceC1231l interfaceC1231l, InterfaceC5841c interfaceC5841c, String str, InterfaceC1231l interfaceC1231l2, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        InterfaceC5841c interfaceC5841c2;
        InterfaceC1231l interfaceC1231l3;
        c1836h0.m4527b0(1501828832);
        if ((i9 & 6) == 0) {
            i10 = ((i9 & 8) == 0 ? c1836h0.m4534f(obj) : c1836h0.m4538h(obj) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        int i11 = i10 | (c1836h0.m4534f(interfaceC5853o) ? 32 : 16);
        if ((i9 & 384) == 0) {
            i11 |= c1836h0.m4538h(interfaceC1231l) ? Opcodes.ACC_NATIVE : 128;
        }
        int i12 = i11 | 3072;
        if ((i9 & 24576) == 0) {
            i12 |= c1836h0.m4534f(str) ? 16384 : 8192;
        }
        int i13 = i12 | 196608;
        if (c1836h0.m4516S(i13 & 1, (599187 & i13) != 599186)) {
            C5845g c5845g = C5840b.f23761g;
            Object objM4514P = c1836h0.m4514P();
            if (objM4514P == C1851l.f6155a) {
                objM4514P = C1446c.f4794h;
                c1836h0.m4545k0(objM4514P);
            }
            InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) objM4514P;
            m3989a(AbstractC1742d.m4382r(obj, str, c1836h0, (i13 & 14) | ((i13 >> 9) & 112)), interfaceC5853o, interfaceC1231l, interfaceC1231l4, c3874d, c1836h0, (i13 & 8176) | 221184);
            interfaceC5841c2 = c5845g;
            interfaceC1231l3 = interfaceC1231l4;
        } else {
            c1836h0.m4519V();
            interfaceC5841c2 = interfaceC5841c;
            interfaceC1231l3 = interfaceC1231l2;
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C1449d(obj, interfaceC5853o, interfaceC1231l, interfaceC5841c2, str, interfaceC1231l3, c3874d, i9);
        }
    }
}
