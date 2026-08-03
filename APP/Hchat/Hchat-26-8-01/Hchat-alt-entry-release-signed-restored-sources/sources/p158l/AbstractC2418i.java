package p158l;

import bsh.org.objectweb.asm.Opcodes;
import p015b0.C0152r;
import p028c1.C0386p;
import p051db.C0768f;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1000e0;
import p071f1.C1034w;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p117i0.C1883u;
import p119i2.C1941n0;
import p136j8.AbstractC2091b;
import p144k.AbstractC2192n;
import p222p.AbstractC3208d;
import p222p.AbstractC3210d1;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3241o;
import p222p.AbstractC3253s;
import p222p.C3205c;
import p222p.C3213e1;
import p222p.C3220h;
import p222p.C3248q0;
import p222p.C3256t;
import p222p.C3259u;
import p222p.EnumC3239n0;
import p234q.AbstractC3418a;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p266s0.C3878h;
import p293u2.C4236f;
import p306v.AbstractC4360e;
import p306v.C4359d;
import p308v1.InterfaceC4412n0;
import p321w.AbstractC4634s;
import p339x1.C5593d;
import p339x1.C5597e;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5844f;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p358y2.AbstractC5978m;

/* JADX INFO: renamed from: l.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2418i {

    /* JADX INFO: renamed from: a */
    public static final C2413d f7921a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1883u c1883u = AbstractC5978m.f24291a;
        long j3 = C1034w.f3259c;
        long j4 = C1034w.f3258b;
        f7921a = new C2413d(j3, j4, j4, C1034w.m2634b(j4, 0.38f), C1034w.m2634b(j4, 0.38f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m5753a(C2413d c2413d, InterfaceC5853o interfaceC5853o, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(-527864079);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4534f(c2413d) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4534f(interfaceC5853o) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c1836h0.m4538h(c3874d) ? Opcodes.ACC_NATIVE : 128;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 147) != 146)) {
            float f3 = AbstractC2415f.f7897d;
            C4359d c4359dM8800a = AbstractC4360e.m8800a(AbstractC2415f.f7898e);
            float f10 = 0;
            boolean z9 = C4236f.m8519a(f3, f10) > 0;
            long j3 = AbstractC1000e0.f3169a;
            InterfaceC5853o interfaceC5853oM5441r = AbstractC2192n.m5441r(AbstractC3208d.m6884n(AbstractC3208d.m6889s(AbstractC2192n.m5430g((C4236f.m8519a(f3, f10) > 0 || z9) ? interfaceC5853o.mo10549d(new C0386p(c4359dM8800a, z9, j3, j3)) : interfaceC5853o, c2413d.f7888a, AbstractC0996c0.f3162b), EnumC3239n0.f10330h), 0.0f, AbstractC2415f.f7902i, 1), AbstractC2192n.m5440q(c1836h0), true, true);
            int i11 = (i10 << 3) & 7168;
            C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h0, 0);
            int iHashCode = Long.hashCode(c1836h0.f6095T);
            C3878h c3878hM4546l = c1836h0.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM5441r);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h0.m4531d0();
            if (c1836h0.f6094S) {
                c1836h0.m4544k(c5660y);
            } else {
                c1836h0.m4551n0();
            }
            AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, c3256tM6935a);
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
            AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
            AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
            AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
            c3874d.mo734b(C3259u.f10388a, c1836h0, Integer.valueOf(((i11 >> 6) & 112) | 6));
            c1836h0.m4553p(true);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0152r(c2413d, interfaceC5853o, c3874d, i9, 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m5754b(InterfaceC5853o interfaceC5853o, C2413d c2413d, InterfaceC1231l interfaceC1231l, C1836h0 c1836h0, int i9, int i10) {
        int i11;
        int i12;
        c1836h0.m4527b0(-625529233);
        int i13 = i10 & 1;
        if (i13 != 0) {
            i11 = i9 | 6;
        } else {
            i11 = (c1836h0.m4534f(interfaceC5853o) ? 4 : 2) | i9;
        }
        int i14 = i10 & 2;
        if (i14 != 0) {
            i12 = i11 | 48;
        } else {
            i12 = i11 | (c1836h0.m4534f(c2413d) ? 32 : 16);
        }
        int i15 = i12 | (c1836h0.m4538h(interfaceC1231l) ? Opcodes.ACC_NATIVE : 128);
        if (c1836h0.m4516S(i15 & 1, (i15 & 147) != 146)) {
            if (i13 != 0) {
                interfaceC5853o = C5850l.f23787a;
            }
            if (i14 != 0) {
                c2413d = f7921a;
            }
            m5753a(c2413d, interfaceC5853o, AbstractC3879i.m8071e(-250345048, new C0768f(interfaceC1231l, 1, c2413d), c1836h0), c1836h0, ((i15 << 3) & 112) | ((i15 >> 3) & 14) | 384);
        } else {
            c1836h0.m4519V();
        }
        InterfaceC5853o interfaceC5853o2 = interfaceC5853o;
        C2413d c2413d2 = c2413d;
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0152r(interfaceC5853o2, c2413d2, interfaceC1231l, i9, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m5755c(String str, boolean z9, C2413d c2413d, InterfaceC5853o interfaceC5853o, InterfaceC1236q interfaceC1236q, InterfaceC1220a interfaceC1220a, C1836h0 c1836h0, int i9) {
        int i10;
        C1836h0 c1836h02 = c1836h0;
        c1836h02.m4527b0(-2001167027);
        if ((i9 & 6) == 0) {
            i10 = (c1836h02.m4534f(str) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h02.m4536g(z9) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c1836h02.m4534f(c2413d) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= c1836h02.m4534f(interfaceC5853o) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i9 & 24576) == 0) {
            i10 |= c1836h02.m4538h(interfaceC1236q) ? 16384 : 8192;
        }
        if ((196608 & i9) == 0) {
            i10 |= c1836h02.m4538h(interfaceC1220a) ? 131072 : 65536;
        }
        int i11 = i10;
        if (c1836h02.m4516S(i11 & 1, (74899 & i11) != 74898)) {
            C5844f c5844f = AbstractC2415f.f7899f;
            C3205c c3205c = AbstractC3226j.f10298a;
            float f3 = AbstractC2415f.f7901h;
            C3220h c3220hM6921g = AbstractC3226j.m6921g(f3);
            boolean z10 = ((i11 & 112) == 32) | ((458752 & i11) == 131072);
            Object objM4514P = c1836h02.m4514P();
            if (z10 || objM4514P == C1851l.f6155a) {
                objM4514P = new C2416g(z9, interfaceC1220a, 0);
                c1836h02.m4545k0(objM4514P);
            }
            InterfaceC5853o interfaceC5853oM6901d = AbstractC3222h1.m6901d(AbstractC2192n.m5433j(interfaceC5853o, z9, str, null, (InterfaceC1220a) objM4514P, 12), 1.0f);
            float f10 = AbstractC2415f.f7894a;
            float f11 = AbstractC2415f.f7895b;
            float f12 = AbstractC2415f.f7896c;
            InterfaceC5853o interfaceC5853oM6884n = AbstractC3208d.m6884n(AbstractC3222h1.m6909l(interfaceC5853oM6901d, f10, f12, f11, f12), f3, 0.0f, 2);
            C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(c3220hM6921g, c5844f, c1836h02, 54);
            int iHashCode = Long.hashCode(c1836h02.f6095T);
            C3878h c3878hM4546l = c1836h02.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6884n);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h02.m4531d0();
            if (c1836h02.f6094S) {
                c1836h02.m4544k(c5660y);
            } else {
                c1836h02.m4551n0();
            }
            C5597e c5597e = C5601f.f22761e;
            AbstractC1874r.m4615A(c5597e, c1836h02, c3213e1M6892a);
            C5597e c5597e2 = C5601f.f22760d;
            AbstractC1874r.m4615A(c5597e2, c1836h02, c3878hM4546l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C5597e c5597e3 = C5601f.f22762f;
            AbstractC1874r.m4615A(c5597e3, c1836h02, numValueOf);
            C5593d c5593d = C5601f.f22763g;
            AbstractC1874r.m4641w(c5593d, c1836h02);
            C5597e c5597e4 = C5601f.f22759c;
            AbstractC1874r.m4615A(c5597e4, c1836h02, interfaceC5853oM10543c);
            if (interfaceC1236q == null) {
                c1836h02.m4525a0(-1597947094);
                c1836h02.m4553p(false);
            } else {
                c1836h02.m4525a0(-1597947093);
                float f13 = AbstractC2415f.f7903j;
                InterfaceC5853o interfaceC5853oM6906i = AbstractC3222h1.m6906i(C5850l.f23787a, f13, 0.0f, f13, f13, 2);
                InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(C5840b.f23761g, false);
                int iHashCode2 = Long.hashCode(c1836h02.f6095T);
                C3878h c3878hM4546l2 = c1836h02.m4546l();
                InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6906i);
                c1836h02.m4531d0();
                if (c1836h02.f6094S) {
                    c1836h02.m4544k(c5660y);
                } else {
                    c1836h02.m4551n0();
                }
                AbstractC1874r.m4615A(c5597e, c1836h02, interfaceC4412n0M6930d);
                AbstractC1874r.m4615A(c5597e2, c1836h02, c3878hM4546l2);
                AbstractC2091b.m5169p(iHashCode2, c1836h02, c5597e3, c1836h02, c5593d);
                AbstractC1874r.m4615A(c5597e4, c1836h02, interfaceC5853oM10543c2);
                interfaceC1236q.mo734b(new C1034w(z9 ? c2413d.f7890c : c2413d.f7892e), c1836h02, 0);
                c1836h02.m4553p(true);
                c1836h02.m4553p(false);
            }
            C1941n0 c1941n0 = new C1941n0(z9 ? c2413d.f7889b : c2413d.f7891d, AbstractC2415f.f7906m, AbstractC2415f.f7907n, AbstractC2415f.f7909p, AbstractC2415f.f7900g, AbstractC2415f.f7908o, 16613240);
            if (1.0f <= 0.0d) {
                AbstractC3418a.m7194a("invalid weight; must be greater than zero");
            }
            AbstractC4634s.m9059b(str, new C3248q0(1.0f, true), c1941n0, null, 0, false, 1, 0, c1836h02, (i11 & 14) | 1572864, 952);
            c1836h02 = c1836h02;
            c1836h02.m4553p(true);
        } else {
            c1836h02.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h02.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C2417h(str, z9, c2413d, interfaceC5853o, interfaceC1236q, interfaceC1220a, i9);
        }
    }
}
