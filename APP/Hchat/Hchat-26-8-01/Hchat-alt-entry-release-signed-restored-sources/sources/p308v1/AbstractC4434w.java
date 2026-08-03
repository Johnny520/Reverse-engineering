package p308v1;

import bsh.org.objectweb.asm.Opcodes;
import p002a1.C0009g;
import p041d1.C0655c0;
import p057e1.C0808c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.AbstractC1874r;
import p117i0.C1828f0;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p266s0.C3878h;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5631o0;
import p339x1.C5601f;
import p339x1.C5602f0;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: v1.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4434w {

    /* JADX INFO: renamed from: a */
    public static final C4427s0 f14743a = new C4427s0(4);

    /* JADX INFO: renamed from: b */
    public static final Object f14744b = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m8877a(C4401j1 c4401j1, InterfaceC5853o interfaceC5853o, InterfaceC1235p interfaceC1235p, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(-511989831);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4538h(c4401j1) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4534f(interfaceC5853o) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c1836h0.m4538h(interfaceC1235p) ? Opcodes.ACC_NATIVE : 128;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 147) != 146)) {
            int iHashCode = Long.hashCode(c1836h0.f6095T);
            C1828f0 c1828f0M4642x = AbstractC1874r.m4642x(c1836h0);
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853o);
            C3878h c3878hM4546l = c1836h0.m4546l();
            c1836h0.m4531d0();
            if (c1836h0.f6094S) {
                c1836h0.m4544k(C5660y.f23050g);
            } else {
                c1836h0.m4551n0();
            }
            AbstractC1874r.m4615A(c4401j1.f14666c, c1836h0, c4401j1);
            AbstractC1874r.m4615A(c4401j1.f14667d, c1836h0, c1828f0M4642x);
            AbstractC1874r.m4615A(c4401j1.f14668e, c1836h0, interfaceC1235p);
            InterfaceC5605g.f22815f.getClass();
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
            AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
            AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
            AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
            c1836h0.m4553p(true);
            if (c1836h0.m4503E()) {
                c1836h0.m4525a0(-1259187287);
                c1836h0.m4553p(false);
            } else {
                c1836h0.m4525a0(-1259245908);
                boolean zM4538h = c1836h0.m4538h(c4401j1);
                Object objM4514P = c1836h0.m4514P();
                if (zM4538h || objM4514P == C1851l.f6155a) {
                    objM4514P = new C0655c0(c4401j1, 15);
                    c1836h0.m4545k0(objM4514P);
                }
                AbstractC1874r.m4628j((InterfaceC1220a) objM4514P, c1836h0);
                c1836h0.m4553p(false);
            }
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C4392g1(c4401j1, interfaceC5853o, interfaceC1235p, i9, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m8878b(InterfaceC5853o interfaceC5853o, InterfaceC1235p interfaceC1235p, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(-1298353104);
        int i10 = i9 | 6 | (c1836h0.m4538h(interfaceC1235p) ? 32 : 16);
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            Object objM4514P = c1836h0.m4514P();
            if (objM4514P == C1851l.f6155a) {
                objM4514P = new C4401j1(C4427s0.f14736h);
                c1836h0.m4545k0(objM4514P);
            }
            C5850l c5850l = C5850l.f23787a;
            m8877a((C4401j1) objM4514P, c5850l, interfaceC1235p, c1836h0, (i10 << 3) & 1008);
            interfaceC5853o = c5850l;
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0009g(interfaceC5853o, interfaceC1235p, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final float m8879c(long j3, long j4) {
        return Math.min(Float.intBitsToFloat((int) (j4 >> 32)) / Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)) / Float.intBitsToFloat((int) (j3 & 4294967295L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float m8880d(AbstractC4374a1 abstractC4374a1, boolean z9, C4405l[] c4405lArr, float f3) {
        float f10 = Float.NaN;
        for (C4405l c4405l : c4405lArr) {
            float fMo8817j = abstractC4374a1.mo8817j(c4405l);
            if (Float.isNaN(f10)) {
                f10 = fMo8817j;
            } else if (z9 == (fMo8817j > f10)) {
            }
        }
        return Float.isNaN(f10) ? f3 : f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final C0808c m8881e(InterfaceC4428t interfaceC4428t) {
        InterfaceC4428t interfaceC4428tMo8863b0 = interfaceC4428t.mo8863b0();
        return interfaceC4428tMo8863b0 != null ? interfaceC4428tMo8863b0.mo8866k0(interfaceC4428t, true) : new C0808c(0.0f, 0.0f, (int) (interfaceC4428t.mo8858F() >> 32), (int) (interfaceC4428t.mo8858F() & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final C0808c m8882f(InterfaceC4428t interfaceC4428t, boolean z9) {
        InterfaceC4428t interfaceC4428tM8884h = m8884h(interfaceC4428t);
        float fMo8858F = (int) (interfaceC4428tM8884h.mo8858F() >> 32);
        float fMo8858F2 = (int) (interfaceC4428tM8884h.mo8858F() & 4294967295L);
        C0808c c0808cMo8866k0 = interfaceC4428tM8884h.mo8866k0(interfaceC4428t, z9);
        float f3 = c0808cMo8866k0.f2416a;
        if (z9) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > fMo8858F) {
                f3 = fMo8858F;
            }
        }
        float f10 = c0808cMo8866k0.f2417b;
        if (z9) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            if (f10 > fMo8858F2) {
                f10 = fMo8858F2;
            }
        }
        float f11 = c0808cMo8866k0.f2418c;
        if (z9) {
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            if (f11 <= fMo8858F) {
                fMo8858F = f11;
            }
            f11 = fMo8858F;
        }
        float f12 = c0808cMo8866k0.f2419d;
        if (z9) {
            float f13 = f12 >= 0.0f ? f12 : 0.0f;
            if (f13 <= fMo8858F2) {
                fMo8858F2 = f13;
            }
            f12 = fMo8858F2;
        }
        if (f3 == f11 || f10 == f12) {
            return C0808c.f2415e;
        }
        long jMo8867m = interfaceC4428tM8884h.mo8867m((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L));
        long jMo8867m2 = interfaceC4428tM8884h.mo8867m((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L));
        long jMo8867m3 = interfaceC4428tM8884h.mo8867m((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L));
        long jMo8867m4 = interfaceC4428tM8884h.mo8867m((((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo8867m >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo8867m2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo8867m4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo8867m3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo8867m & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo8867m2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo8867m4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo8867m3 & 4294967295L));
        return new C0808c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final boolean m8883g(long j3, long j4) {
        return j3 == j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC4428t m8884h(InterfaceC4428t interfaceC4428t) {
        InterfaceC4428t interfaceC4428t2;
        InterfaceC4428t interfaceC4428tMo8863b0 = interfaceC4428t.mo8863b0();
        while (true) {
            InterfaceC4428t interfaceC4428t3 = interfaceC4428tMo8863b0;
            interfaceC4428t2 = interfaceC4428t;
            interfaceC4428t = interfaceC4428t3;
            if (interfaceC4428t == null) {
                break;
            }
            interfaceC4428tMo8863b0 = interfaceC4428t.mo8863b0();
        }
        AbstractC5614i1 abstractC5614i1 = interfaceC4428t2 instanceof AbstractC5614i1 ? (AbstractC5614i1) interfaceC4428t2 : null;
        if (abstractC5614i1 == null) {
            return interfaceC4428t2;
        }
        AbstractC5614i1 abstractC5614i12 = abstractC5614i1.f22870w;
        while (true) {
            AbstractC5614i1 abstractC5614i13 = abstractC5614i12;
            AbstractC5614i1 abstractC5614i14 = abstractC5614i1;
            abstractC5614i1 = abstractC5614i13;
            if (abstractC5614i1 == null) {
                return abstractC5614i14;
            }
            abstractC5614i12 = abstractC5614i1.f22870w;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final Object m8885i(InterfaceC4409m0 interfaceC4409m0) {
        Object objMo8824X = interfaceC4409m0.mo8824X();
        C4436x c4436x = objMo8824X instanceof C4436x ? (C4436x) objMo8824X : null;
        if (c4436x != null) {
            return c4436x.f14747u;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final AbstractC5631o0 m8886j(AbstractC5631o0 abstractC5631o0) {
        C5602f0 c5602f0 = abstractC5631o0.f22932u.f22868u;
        while (true) {
            C5602f0 c5602f0M10049u = c5602f0.m10049u();
            C5602f0 c5602f02 = null;
            if ((c5602f0M10049u != null ? c5602f0M10049u.f22797n : null) == null) {
                AbstractC5631o0 abstractC5631o0Mo10104p1 = c5602f0.f22778L.f22717d.mo10104p1();
                abstractC5631o0Mo10104p1.getClass();
                return abstractC5631o0Mo10104p1;
            }
            C5602f0 c5602f0M10049u2 = c5602f0.m10049u();
            if (c5602f0M10049u2 != null) {
                c5602f02 = c5602f0M10049u2.f22797n;
            }
            c5602f02.getClass();
            C5602f0 c5602f0M10049u3 = c5602f0.m10049u();
            c5602f0M10049u3.getClass();
            c5602f0 = c5602f0M10049u3.f22797n;
            c5602f0.getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC5853o m8887k(InterfaceC5853o interfaceC5853o, InterfaceC1236q interfaceC1236q) {
        return interfaceC5853o.mo10549d(new C4430u(interfaceC1236q));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC5853o m8888l(String str) {
        return new C4432v(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC5853o m8889m(InterfaceC5853o interfaceC5853o, InterfaceC1231l interfaceC1231l) {
        return interfaceC5853o.mo10549d(new C4429t0(interfaceC1231l));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC5853o m8890n(InterfaceC5853o interfaceC5853o, InterfaceC1231l interfaceC1231l) {
        return interfaceC5853o.mo10549d(new C4433v0(interfaceC1231l));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final long m8891o(long j3, long j4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) * Float.intBitsToFloat((int) (j3 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j4 & 4294967295L)) * Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
