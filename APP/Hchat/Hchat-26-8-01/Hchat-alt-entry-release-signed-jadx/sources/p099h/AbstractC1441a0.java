package p099h;

import bsh.org.objectweb.asm.Opcodes;
import p014b.C0126e;
import p027c0.C0368m;
import p036c9.C0446i;
import p068eh.AbstractC0921a;
import p071f1.AbstractC0996c0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p089g1.C1276e;
import p116i.AbstractC1742d;
import p116i.C1744d1;
import p116i.C1765k1;
import p116i.C1771m1;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.C1876r1;
import p117i0.InterfaceC1809a1;
import p266s0.C3874d;
import p266s0.C3878h;
import p276sf.C3967n;
import p308v1.AbstractC4434w;
import p339x1.C5601f;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: h.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1441a0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m3982a(C1765k1 c1765k1, InterfaceC1231l interfaceC1231l, InterfaceC5853o interfaceC5853o, C1483r0 c1483r0, C1485s0 c1485s0, InterfaceC1235p interfaceC1235p, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        C3874d c3874d2;
        int i11;
        int i12;
        C1463h1 c1463h1;
        Object obj;
        boolean z9;
        C1744d1 c1744d1;
        boolean z10;
        boolean z11;
        C1744d1 c1744d1M4375k;
        C1483r0 c1483r02;
        C1485s0 c1485s02;
        C1744d1 c1744d12;
        boolean z12;
        C1845j1 c1845j1 = c1765k1.f5892d;
        c1836h0.m4527b0(1912839215);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4534f(c1765k1) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4538h(interfaceC1231l) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c1836h0.m4534f(interfaceC5853o) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= c1836h0.m4534f(c1483r0) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i9 & 24576) == 0) {
            i10 |= c1836h0.m4534f(c1485s0) ? 16384 : 8192;
        }
        if ((196608 & i9) == 0) {
            i10 |= c1836h0.m4538h(interfaceC1235p) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        int i13 = i10 | 1572864;
        if ((12582912 & i9) == 0) {
            i13 |= c1836h0.m4538h(c3874d) ? 8388608 : 4194304;
        }
        int i14 = i13;
        if (!c1836h0.m4516S(i14 & 1, (4793491 & i14) != 4793490)) {
            c3874d2 = c3874d;
            c1836h0.m4519V();
        } else if (((Boolean) interfaceC1231l.invoke(c1845j1.getValue())).booleanValue() || ((Boolean) interfaceC1231l.invoke(c1765k1.m4414c())).booleanValue() || c1765k1.m4418g() || c1765k1.m4415d()) {
            c1836h0.m4525a0(-232386135);
            int i15 = i14 & 14;
            int i16 = i15 | 48;
            int i17 = i16 & 14;
            int i18 = 6;
            boolean z13 = ((i17 ^ 6) > 4 && c1836h0.m4534f(c1765k1)) || (i16 & 6) == 4;
            Object objM4514P = c1836h0.m4514P();
            boolean z14 = z13;
            Object obj2 = C1851l.f6155a;
            if (z14 || objM4514P == obj2) {
                objM4514P = c1765k1.m4414c();
                c1836h0.m4545k0(objM4514P);
            }
            if (c1765k1.m4418g()) {
                objM4514P = c1765k1.m4414c();
            }
            c1836h0.m4525a0(1844425648);
            EnumC1456f0 enumC1456f0M3985d = m3985d(c1765k1, interfaceC1231l, objM4514P, c1836h0);
            c1836h0.m4553p(false);
            Object value = c1845j1.getValue();
            c1836h0.m4525a0(1844425648);
            EnumC1456f0 enumC1456f0M3985d2 = m3985d(c1765k1, interfaceC1231l, value, c1836h0);
            c1836h0.m4553p(false);
            int i19 = i17 | 3072;
            int i20 = (i19 & 14) ^ 6;
            boolean z15 = (i20 > 4 && c1836h0.m4534f(c1765k1)) || (i19 & 6) == 4;
            Object objM4514P2 = c1836h0.m4514P();
            if (z15 || objM4514P2 == obj2) {
                i11 = i19;
                i12 = i14;
                objM4514P2 = new C1765k1(new C0126e(enumC1456f0M3985d), c1765k1, AbstractC0921a.m2255r(new StringBuilder(), c1765k1.f5891c, " > EnterExitTransition"));
                c1836h0.m4545k0(objM4514P2);
            } else {
                i11 = i19;
                i12 = i14;
            }
            C1765k1 c1765k12 = (C1765k1) objM4514P2;
            boolean zM4534f = ((i20 > 4 && c1836h0.m4534f(c1765k1)) || (i11 & 6) == 4) | c1836h0.m4534f(c1765k12);
            Object objM4514P3 = c1836h0.m4514P();
            if (zM4534f || objM4514P3 == obj2) {
                objM4514P3 = new C0446i(c1765k1, 16, c1765k12);
                c1836h0.m4545k0(objM4514P3);
            }
            AbstractC1874r.m4621c(c1765k12, (InterfaceC1231l) objM4514P3, c1836h0);
            if (c1765k1.m4418g()) {
                c1765k12.m4421j(enumC1456f0M3985d, enumC1456f0M3985d2);
            } else {
                c1765k12.m4422k(enumC1456f0M3985d2);
                c1765k12.f5899k.setValue(Boolean.FALSE);
            }
            C1771m1 c1771m1 = AbstractC1473m0.f4891a;
            boolean zM4534f2 = c1836h0.m4534f(c1765k12);
            Object objM4514P4 = c1836h0.m4514P();
            if (zM4534f2 || objM4514P4 == obj2) {
                objM4514P4 = AbstractC1874r.m4639u(c1483r0);
                c1836h0.m4545k0(objM4514P4);
            }
            InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P4;
            Object objM4414c = c1765k12.m4414c();
            C1845j1 c1845j12 = c1765k12.f5892d;
            Object value2 = c1845j12.getValue();
            EnumC1456f0 enumC1456f0 = EnumC1456f0.f4834h;
            if (objM4414c == value2 && c1765k12.m4414c() == enumC1456f0) {
                if (c1765k12.m4418g()) {
                    interfaceC1809a1.setValue(c1483r0);
                } else {
                    interfaceC1809a1.setValue(C1483r0.f4926b);
                }
            } else if (c1845j12.getValue() == enumC1456f0) {
                interfaceC1809a1.setValue(((C1483r0) interfaceC1809a1.getValue()).m4000a(c1483r0));
            }
            C1483r0 c1483r03 = (C1483r0) interfaceC1809a1.getValue();
            boolean zM4534f3 = c1836h0.m4534f(c1765k12);
            Object objM4514P5 = c1836h0.m4514P();
            if (zM4534f3 || objM4514P5 == obj2) {
                objM4514P5 = AbstractC1874r.m4639u(c1485s0);
                c1836h0.m4545k0(objM4514P5);
            }
            InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) objM4514P5;
            if (c1765k12.m4414c() == c1845j12.getValue() && c1765k12.m4414c() == enumC1456f0) {
                if (c1765k12.m4418g()) {
                    interfaceC1809a12.setValue(c1485s0);
                } else {
                    interfaceC1809a12.setValue(C1485s0.f4932b);
                }
            } else if (c1845j12.getValue() != enumC1456f0) {
                interfaceC1809a12.setValue(((C1485s0) interfaceC1809a12.getValue()).m4001a(c1485s0));
            }
            C1485s0 c1485s03 = (C1485s0) interfaceC1809a12.getValue();
            Object objM4643y = AbstractC1874r.m4643y(interfaceC1235p, c1836h0);
            Object objInvoke = interfaceC1235p.invoke(c1765k12.m4414c(), c1845j12.getValue());
            boolean zM4534f4 = c1836h0.m4534f(c1765k12) | c1836h0.m4534f(objM4643y);
            Object objM4514P6 = c1836h0.m4514P();
            InterfaceC5557c interfaceC5557c = null;
            if (zM4534f4 || objM4514P6 == obj2) {
                objM4514P6 = new C0368m(c1765k12, objM4643y, interfaceC5557c, 3);
                c1836h0.m4545k0(objM4514P6);
            }
            Object obj3 = (InterfaceC1235p) objM4514P6;
            Object objM4514P7 = c1836h0.m4514P();
            if (objM4514P7 == obj2) {
                objM4514P7 = AbstractC1874r.m4639u(objInvoke);
                c1836h0.m4545k0(objM4514P7);
            }
            InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) objM4514P7;
            boolean zM4538h = c1836h0.m4538h(obj3);
            Object objM4514P8 = c1836h0.m4514P();
            if (zM4538h || objM4514P8 == obj2) {
                objM4514P8 = new C0368m(obj3, interfaceC1809a13, null, i18);
                c1836h0.m4545k0(objM4514P8);
            }
            AbstractC1874r.m4624f((InterfaceC1235p) objM4514P8, c1836h0, C3967n.f12976a);
            Object objM4414c2 = c1765k12.m4414c();
            EnumC1456f0 enumC1456f02 = EnumC1456f0.f4835i;
            if (objM4414c2 == enumC1456f02 && c1845j12.getValue() == enumC1456f02 && ((Boolean) interfaceC1809a13.getValue()).booleanValue()) {
                c1836h0.m4525a0(-229368781);
                z12 = false;
                c1836h0.m4553p(false);
                c3874d2 = c3874d;
            } else {
                c1836h0.m4525a0(-230699766);
                boolean z16 = i15 == 4;
                Object objM4514P9 = c1836h0.m4514P();
                if (z16 || objM4514P9 == obj2) {
                    objM4514P9 = new C1447c0();
                    c1836h0.m4545k0(objM4514P9);
                }
                C1447c0 c1447c0 = (C1447c0) objM4514P9;
                C1771m1 c1771m12 = AbstractC1742d.f5816p;
                Object objM4514P10 = c1836h0.m4514P();
                if (objM4514P10 == obj2) {
                    objM4514P10 = C1467j0.f4880g;
                    c1836h0.m4545k0(objM4514P10);
                }
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P10;
                c1836h0.m4525a0(-167964673);
                c1836h0.m4553p(false);
                c1836h0.m4525a0(-167961890);
                c1836h0.m4553p(false);
                C1463h1 c1463h12 = c1483r03.f4927a;
                C1463h1 c1463h13 = c1485s03.f4934a;
                if ((c1463h12.f4865b == null && c1463h13.f4865b == null) ? false : true) {
                    c1836h0.m4525a0(-911488127);
                    Object objM4514P11 = c1836h0.m4514P();
                    if (objM4514P11 == obj2) {
                        objM4514P11 = "Built-in slide";
                        c1836h0.m4545k0("Built-in slide");
                    }
                    obj = obj2;
                    c1463h1 = c1463h13;
                    C1744d1 c1744d1M4375k2 = AbstractC1742d.m4375k(c1765k12, c1771m12, (String) objM4514P11, c1836h0, 384, 0);
                    z9 = false;
                    c1836h0.m4553p(false);
                    c1744d1 = c1744d1M4375k2;
                } else {
                    c1463h1 = c1463h13;
                    obj = obj2;
                    z9 = false;
                    c1836h0.m4525a0(-911382324);
                    c1836h0.m4553p(false);
                    c1744d1 = null;
                }
                c1836h0.m4525a0(-911179709);
                c1836h0.m4553p(z9);
                c1836h0.m4525a0(-910935677);
                c1836h0.m4553p(z9);
                boolean z17 = !false;
                float[] fArr = C1276e.f4236a;
                c1836h0.m4525a0(-910130296);
                c1836h0.m4553p(z9);
                C1771m1 c1771m13 = AbstractC1742d.f5810j;
                if ((c1463h12.f4864a == null && c1463h1.f4864a == null) ? false : true) {
                    c1836h0.m4525a0(-703879421);
                    Object objM4514P12 = c1836h0.m4514P();
                    if (objM4514P12 == obj) {
                        objM4514P12 = "Built-in alpha";
                        c1836h0.m4545k0("Built-in alpha");
                    }
                    z10 = z17;
                    c1744d1M4375k = AbstractC1742d.m4375k(c1765k12, c1771m13, (String) objM4514P12, c1836h0, 384, 0);
                    z11 = false;
                    c1836h0.m4553p(false);
                } else {
                    z10 = z17;
                    z11 = false;
                    c1836h0.m4525a0(-703709976);
                    c1836h0.m4553p(false);
                    c1744d1M4375k = null;
                }
                c1836h0.m4525a0(-703472888);
                c1836h0.m4553p(z11);
                c1836h0.m4525a0(-703222904);
                c1836h0.m4553p(z11);
                C1744d1 c1744d13 = null;
                boolean zM4538h2 = c1836h0.m4538h(c1744d1M4375k) | c1836h0.m4534f(c1483r03) | c1836h0.m4534f(c1485s03) | c1836h0.m4538h(null) | c1836h0.m4534f(c1765k12) | c1836h0.m4538h(null);
                Object objM4514P13 = c1836h0.m4514P();
                if (zM4538h2 || objM4514P13 == obj) {
                    c1483r02 = c1483r03;
                    c1485s02 = c1485s03;
                    c1744d12 = null;
                    objM4514P13 = new C1462h0(c1744d1M4375k, c1744d12, c1765k12, c1483r02, c1485s02, c1744d13);
                    c1836h0.m4545k0(objM4514P13);
                } else {
                    c1483r02 = c1483r03;
                    c1485s02 = c1485s03;
                    c1744d12 = null;
                }
                C1462h0 c1462h0 = (C1462h0) objM4514P13;
                boolean zM4536g = c1836h0.m4536g(z10) | c1836h0.m4534f(interfaceC1220a);
                Object objM4514P14 = c1836h0.m4514P();
                if (zM4536g || objM4514P14 == obj) {
                    objM4514P14 = new C1469k0(z10, interfaceC1220a);
                    c1836h0.m4545k0(objM4514P14);
                }
                C5850l c5850l = C5850l.f23787a;
                InterfaceC5853o interfaceC5853oMo10549d = AbstractC0996c0.m2516m(c5850l, (InterfaceC1231l) objM4514P14).mo10549d(new C1459g0(c1765k12, c1744d12, c1744d12, c1744d1, c1483r02, c1485s02, interfaceC1220a, c1462h0)).mo10549d(c5850l);
                c1836h0.m4525a0(-7404393);
                c1836h0.m4553p(false);
                InterfaceC5853o interfaceC5853oMo10549d2 = interfaceC5853o.mo10549d(interfaceC5853oMo10549d.mo10549d(c5850l));
                Object objM4514P15 = c1836h0.m4514P();
                if (objM4514P15 == obj) {
                    objM4514P15 = new C1490v(c1447c0);
                    c1836h0.m4545k0(objM4514P15);
                }
                C1490v c1490v = (C1490v) objM4514P15;
                int iHashCode = Long.hashCode(c1836h0.f6095T);
                C3878h c3878hM4546l = c1836h0.m4546l();
                InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853oMo10549d2);
                InterfaceC5605g.f22815f.getClass();
                InterfaceC1220a interfaceC1220a2 = C5601f.f22758b;
                c1836h0.m4531d0();
                if (c1836h0.f6094S) {
                    c1836h0.m4544k(interfaceC1220a2);
                } else {
                    c1836h0.m4551n0();
                }
                AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, c1490v);
                AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
                AbstractC1874r.m4638t(c1836h0, Integer.valueOf(iHashCode), C5601f.f22762f);
                AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
                AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
                c3874d2 = c3874d;
                c3874d2.mo734b(c1447c0, c1836h0, Integer.valueOf((i12 >> 18) & 112));
                c1836h0.m4553p(true);
                z12 = false;
                c1836h0.m4553p(false);
            }
            c1836h0.m4553p(z12);
        } else {
            c1836h0.m4525a0(-229362829);
            c1836h0.m4553p(false);
            c3874d2 = c3874d;
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C1449d(c1765k1, interfaceC1231l, interfaceC5853o, c1483r0, c1485s0, interfaceC1235p, c3874d2, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m3983b(boolean z9, InterfaceC5853o interfaceC5853o, C1483r0 c1483r0, C1485s0 c1485s0, String str, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        InterfaceC5853o interfaceC5853o2;
        String str2;
        c1836h0.m4527b0(1799879339);
        if ((i9 & 48) == 0) {
            i10 = (c1836h0.m4536g(z9) ? 32 : 16) | i9;
        } else {
            i10 = i9;
        }
        int i11 = i10 | 384;
        if ((i9 & 3072) == 0) {
            i11 |= c1836h0.m4534f(c1483r0) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i9 & 24576) == 0) {
            i11 |= c1836h0.m4534f(c1485s0) ? 16384 : 8192;
        }
        int i12 = i11 | 196608;
        if ((1572864 & i9) == 0) {
            i12 |= c1836h0.m4538h(c3874d) ? 1048576 : 524288;
        }
        if (c1836h0.m4516S(i12 & 1, (599185 & i12) != 599184)) {
            int i13 = i12 >> 3;
            C1765k1 c1765k1M4382r = AbstractC1742d.m4382r(Boolean.valueOf(z9), "AnimatedVisibility", c1836h0, (i13 & 14) | ((i12 >> 12) & 112));
            Object objM4514P = c1836h0.m4514P();
            if (objM4514P == C1851l.f6155a) {
                objM4514P = C1446c.f4795i;
                c1836h0.m4545k0(objM4514P);
            }
            interfaceC5853o2 = C5850l.f23787a;
            m3984c(c1765k1M4382r, (InterfaceC1231l) objM4514P, interfaceC5853o2, c1483r0, c1485s0, c3874d, c1836h0, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i13 & 458752));
            str2 = "AnimatedVisibility";
        } else {
            c1836h0.m4519V();
            interfaceC5853o2 = interfaceC5853o;
            str2 = str;
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C1494x(z9, interfaceC5853o2, c1483r0, c1485s0, str2, c3874d, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m3984c(C1765k1 c1765k1, InterfaceC1231l interfaceC1231l, InterfaceC5853o interfaceC5853o, C1483r0 c1483r0, C1485s0 c1485s0, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        C1483r0 c1483r02;
        C1485s0 c1485s02;
        C3874d c3874d2;
        c1836h0.m4527b0(1706321816);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4534f(c1765k1) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4538h(interfaceC1231l) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c1836h0.m4534f(interfaceC5853o) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i9 & 3072) == 0) {
            c1483r02 = c1483r0;
            i10 |= c1836h0.m4534f(c1483r02) ? Opcodes.ACC_STRICT : 1024;
        } else {
            c1483r02 = c1483r0;
        }
        if ((i9 & 24576) == 0) {
            c1485s02 = c1485s0;
            i10 |= c1836h0.m4534f(c1485s02) ? 16384 : 8192;
        } else {
            c1485s02 = c1485s0;
        }
        if ((i9 & 196608) == 0) {
            c3874d2 = c3874d;
            i10 |= c1836h0.m4538h(c3874d2) ? Opcodes.ACC_DEPRECATED : 65536;
        } else {
            c3874d2 = c3874d;
        }
        if (c1836h0.m4516S(i10 & 1, (74899 & i10) != 74898)) {
            int i11 = i10 & 112;
            int i12 = i10 & 14;
            boolean z9 = (i11 == 32) | (i12 == 4);
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (z9 || objM4514P == c1823e) {
                objM4514P = new C1496y(interfaceC1231l, c1765k1);
                c1836h0.m4545k0(objM4514P);
            }
            InterfaceC5853o interfaceC5853oM8887k = AbstractC4434w.m8887k(interfaceC5853o, (InterfaceC1236q) objM4514P);
            Object objM4514P2 = c1836h0.m4514P();
            if (objM4514P2 == c1823e) {
                objM4514P2 = C1466j.f4878i;
                c1836h0.m4545k0(objM4514P2);
            }
            m3982a(c1765k1, interfaceC1231l, interfaceC5853oM8887k, c1483r02, c1485s02, (InterfaceC1235p) objM4514P2, c3874d2, c1836h0, 196608 | i12 | i11 | (i10 & 7168) | (57344 & i10) | ((i10 << 6) & 29360128));
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C1498z(c1765k1, interfaceC1231l, interfaceC5853o, c1483r0, c1485s0, c3874d, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final EnumC1456f0 m3985d(C1765k1 c1765k1, InterfaceC1231l interfaceC1231l, Object obj, C1836h0 c1836h0) {
        c1836h0.m4520W(-422486745, c1765k1, null, 0);
        boolean zM4418g = c1765k1.m4418g();
        EnumC1456f0 enumC1456f0 = EnumC1456f0.f4833g;
        EnumC1456f0 enumC1456f02 = EnumC1456f0.f4835i;
        EnumC1456f0 enumC1456f03 = EnumC1456f0.f4834h;
        if (zM4418g) {
            c1836h0.m4525a0(-212166497);
            c1836h0.m4553p(false);
            if (((Boolean) interfaceC1231l.invoke(obj)).booleanValue()) {
                enumC1456f0 = enumC1456f03;
            } else if (((Boolean) interfaceC1231l.invoke(c1765k1.m4414c())).booleanValue()) {
                enumC1456f0 = enumC1456f02;
            }
        } else {
            c1836h0.m4525a0(-211892364);
            Object objM4514P = c1836h0.m4514P();
            if (objM4514P == C1851l.f6155a) {
                objM4514P = AbstractC1874r.m4639u(Boolean.FALSE);
                c1836h0.m4545k0(objM4514P);
            }
            InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P;
            if (((Boolean) interfaceC1231l.invoke(c1765k1.m4414c())).booleanValue()) {
                interfaceC1809a1.setValue(Boolean.TRUE);
            }
            if (((Boolean) interfaceC1231l.invoke(obj)).booleanValue()) {
                enumC1456f0 = enumC1456f03;
            } else if (((Boolean) interfaceC1809a1.getValue()).booleanValue()) {
                enumC1456f0 = enumC1456f02;
            }
            c1836h0.m4553p(false);
        }
        c1836h0.m4553p(false);
        return enumC1456f0;
    }
}
