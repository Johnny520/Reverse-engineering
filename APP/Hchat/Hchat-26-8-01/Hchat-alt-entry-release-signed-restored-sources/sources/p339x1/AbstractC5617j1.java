package p339x1;

import bsh.org.objectweb.asm.Opcodes;
import p028c1.InterfaceC0377g;
import p029c2.InterfaceC0389a;
import p041d1.C0653b0;
import p041d1.C0663i;
import p041d1.C0670p;
import p041d1.InterfaceC0661g;
import p041d1.InterfaceC0675u;
import p069f.AbstractC0951o0;
import p069f.C0925b0;
import p072f2.InterfaceC1051n;
import p131j0.C2046b;
import p224p1.InterfaceC3288c;
import p227p4.C3315t;
import p236q1.InterfaceC3425e;
import p265s.C3853r;
import p267s1.C3884a0;
import p292u1.AbstractC4229a;
import p308v1.InterfaceC4437x0;
import p308v1.InterfaceC4438y;
import p323w1.InterfaceC4678c;
import p356y0.AbstractC5852n;
import p356y0.InterfaceC5851m;
import p357y1.C5898k;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: x1.j1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5617j1 {

    /* JADX INFO: renamed from: a */
    public static final C0925b0 f22893a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0925b0 c0925b0 = AbstractC0951o0.f2997a;
        f22893a = new C0925b0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m10135a(AbstractC5852n abstractC5852n, int i9, int i10) {
        if (!(abstractC5852n instanceof AbstractC5615j)) {
            m10136b(abstractC5852n, i9 & abstractC5852n.f23790i, i10);
            return;
        }
        AbstractC5615j abstractC5615j = (AbstractC5615j) abstractC5852n;
        int i11 = abstractC5615j.f22874u;
        m10136b(abstractC5852n, i11 & i9, i10);
        int i12 = (~i11) & i9;
        for (AbstractC5852n abstractC5852n2 = abstractC5615j.f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
            m10135a(abstractC5852n2, i12, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: d1.u */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: y0.n */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m10136b(AbstractC5852n abstractC5852n, int i9, int i10) {
        if (i10 != 0 || abstractC5852n.mo1349Z0()) {
            if ((i9 & 2) != 0 && (abstractC5852n instanceof InterfaceC5651v)) {
                AbstractC5618k.m10157m((InterfaceC5651v) abstractC5852n);
                if (i10 == 2) {
                    AbstractC5618k.m10164t(abstractC5852n, 2).m10072D1();
                }
            }
            if ((i9 & 128) != 0 && i10 != 2) {
                AbstractC5618k.m10167w(abstractC5852n).m10007D();
            }
            if ((4194304 & i9) != 0 && i10 != 2) {
                AbstractC5618k.m10167w(abstractC5852n).m10022U(false);
            }
            if ((i9 & Opcodes.ACC_NATIVE) != 0 && (abstractC5852n instanceof InterfaceC5627n)) {
                if (i10 == 1) {
                    C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(abstractC5852n);
                    c5602f0M10167w.m10026a0(c5602f0M10167w.f22788V + 1);
                } else if (i10 == 2) {
                    AbstractC5618k.m10167w(abstractC5852n).m10026a0(r0.f22788V - 1);
                }
                if (i10 != 2) {
                    C5602f0 c5602f0M10167w2 = AbstractC5618k.m10167w(abstractC5852n);
                    if (c5602f0M10167w2.f22788V != 0 && !c5602f0M10167w2.m10044p() && !c5602f0M10167w2.m10045q() && !c5602f0M10167w2.f22787U) {
                        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = (ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0M10167w2);
                        C3315t c3315t = viewTreeObserverOnGlobalLayoutListenerC5934t.f24109f0.f22996e;
                        c3315t.getClass();
                        if (c5602f0M10167w2.f22788V > 0) {
                            ((C2046b) c3315t.f10677h).m5056b(c5602f0M10167w2);
                            c5602f0M10167w2.f22787U = true;
                        }
                        viewTreeObserverOnGlobalLayoutListenerC5934t.m10650I(null);
                    }
                }
            }
            if ((i9 & 4) != 0 && (abstractC5852n instanceof InterfaceC5624m)) {
                AbstractC5618k.m10156l((InterfaceC5624m) abstractC5852n);
            }
            if ((i9 & 8) != 0 && (abstractC5852n instanceof InterfaceC5665z1)) {
                AbstractC5618k.m10167w(abstractC5852n).f22807x = true;
            }
            if ((i9 & 64) != 0 && (abstractC5852n instanceof InterfaceC5650u1)) {
                C5616j0 c5616j0 = AbstractC5618k.m10167w((InterfaceC5650u1) abstractC5852n).f22779M;
                c5616j0.f22891p.f23040w = true;
                C5640r0 c5640r0 = c5616j0.f22892q;
                if (c5640r0 != null) {
                    c5640r0.f22954C = true;
                }
            }
            if ((i9 & Opcodes.ACC_STRICT) != 0 && (abstractC5852n instanceof InterfaceC0675u)) {
                InterfaceC0675u interfaceC0675u = (InterfaceC0675u) abstractC5852n;
                C5589c.f22726b = null;
                interfaceC0675u.mo1858r0(C5589c.f22725a);
                if (C5589c.f22726b != null) {
                    AbstractC5852n abstractC5852n2 = (AbstractC5852n) interfaceC0675u;
                    if (!abstractC5852n2.f23788g.f23801t) {
                        AbstractC4229a.m8494b("visitChildren called on an unattached node");
                    }
                    C2046b c2046b = new C2046b(new AbstractC5852n[16]);
                    AbstractC5852n abstractC5852n3 = abstractC5852n2.f23788g;
                    AbstractC5852n abstractC5852n4 = abstractC5852n3.f23793l;
                    if (abstractC5852n4 == null) {
                        AbstractC5618k.m10146b(c2046b, abstractC5852n3);
                    } else {
                        c2046b.m5056b(abstractC5852n4);
                    }
                    while (true) {
                        int i11 = c2046b.f6893i;
                        if (i11 == 0) {
                            break;
                        }
                        AbstractC5852n abstractC5852nM10149e = (AbstractC5852n) c2046b.m5065k(i11 - 1);
                        if ((abstractC5852nM10149e.f23791j & 1024) == 0) {
                            AbstractC5618k.m10146b(c2046b, abstractC5852nM10149e);
                        } else {
                            while (true) {
                                if (abstractC5852nM10149e == null) {
                                    break;
                                }
                                if ((abstractC5852nM10149e.f23790i & 1024) != 0) {
                                    C2046b c2046b2 = null;
                                    while (abstractC5852nM10149e != null) {
                                        if (abstractC5852nM10149e instanceof C0653b0) {
                                            C0653b0 c0653b0 = (C0653b0) abstractC5852nM10149e;
                                            C0663i c0663i = ((C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(c0653b0)).getFocusOwner()).f2057d;
                                            if (c0663i.f2045c.m2328a(c0653b0)) {
                                                c0663i.m1841a();
                                            }
                                        } else if ((abstractC5852nM10149e.f23790i & 1024) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                            int i12 = 0;
                                            for (AbstractC5852n abstractC5852n5 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n5 != null; abstractC5852n5 = abstractC5852n5.f23793l) {
                                                if ((abstractC5852n5.f23790i & 1024) != 0) {
                                                    i12++;
                                                    if (i12 == 1) {
                                                        abstractC5852nM10149e = abstractC5852n5;
                                                    } else {
                                                        if (c2046b2 == null) {
                                                            c2046b2 = new C2046b(new AbstractC5852n[16]);
                                                        }
                                                        if (abstractC5852nM10149e != null) {
                                                            c2046b2.m5056b(abstractC5852nM10149e);
                                                            abstractC5852nM10149e = null;
                                                        }
                                                        c2046b2.m5056b(abstractC5852n5);
                                                    }
                                                }
                                            }
                                            if (i12 == 1) {
                                            }
                                        }
                                        abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b2);
                                    }
                                } else {
                                    abstractC5852nM10149e = abstractC5852nM10149e.f23793l;
                                }
                            }
                        }
                    }
                }
            }
            if ((i9 & 4096) != 0 && (abstractC5852n instanceof InterfaceC0661g)) {
                InterfaceC0661g interfaceC0661g = (InterfaceC0661g) abstractC5852n;
                C0663i c0663i2 = ((C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(interfaceC0661g)).getFocusOwner()).f2057d;
                if (c0663i2.f2046d.m2328a(interfaceC0661g)) {
                    c0663i2.m1841a();
                }
            }
            if ((i9 & 2097152) != 0 && (abstractC5852n instanceof InterfaceC3288c) && i10 == 2) {
                ((InterfaceC3288c) abstractC5852n).mo5382y0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m10137c(AbstractC5852n abstractC5852n) {
        if (!abstractC5852n.f23801t) {
            AbstractC4229a.m8494b("autoInvalidateUpdatedNode called on unattached node");
        }
        m10135a(abstractC5852n, -1, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final int m10138d(InterfaceC5851m interfaceC5851m) {
        int i9 = interfaceC5851m instanceof InterfaceC4438y ? 3 : 1;
        if (interfaceC5851m instanceof InterfaceC0377g) {
            i9 |= 4;
        }
        if (interfaceC5851m instanceof InterfaceC1051n) {
            i9 |= 8;
        }
        if (interfaceC5851m instanceof C3884a0) {
            i9 |= 16;
        }
        if (interfaceC5851m instanceof InterfaceC4437x0) {
            i9 |= 64;
        }
        return interfaceC5851m instanceof InterfaceC0389a ? 524288 | i9 : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m10139e(AbstractC5852n abstractC5852n) {
        int i9 = abstractC5852n.f23790i;
        if (i9 != 0) {
            return i9;
        }
        Class<?> cls = abstractC5852n.getClass();
        C0925b0 c0925b0 = f22893a;
        int iM2270d = c0925b0.m2270d(cls);
        if (iM2270d >= 0) {
            return c0925b0.f2896c[iM2270d];
        }
        int i10 = abstractC5852n instanceof InterfaceC5651v ? 3 : 1;
        if (abstractC5852n instanceof InterfaceC5624m) {
            i10 |= 4;
        }
        if (abstractC5852n instanceof InterfaceC5665z1) {
            i10 |= 8;
        }
        if (abstractC5852n instanceof InterfaceC5656w1) {
            i10 |= 16;
        }
        if (abstractC5852n instanceof InterfaceC4678c) {
            i10 |= 32;
        }
        if (abstractC5852n instanceof InterfaceC5650u1) {
            i10 |= 64;
        }
        if (abstractC5852n instanceof InterfaceC5648u) {
            i10 |= 4194432;
        } else if (abstractC5852n instanceof InterfaceC5655w0) {
            i10 |= 128;
        }
        if (abstractC5852n instanceof InterfaceC5627n) {
            i10 |= Opcodes.ACC_NATIVE;
        }
        if (abstractC5852n instanceof C0653b0) {
            i10 |= 1024;
        }
        if (abstractC5852n instanceof InterfaceC0675u) {
            i10 |= Opcodes.ACC_STRICT;
        }
        if (abstractC5852n instanceof InterfaceC0661g) {
            i10 |= 4096;
        }
        if (abstractC5852n instanceof InterfaceC3425e) {
            i10 |= 8192;
        }
        if (abstractC5852n instanceof C5898k) {
            i10 |= 16384;
        }
        if (abstractC5852n instanceof InterfaceC5609h) {
            i10 |= 32768;
        }
        if (abstractC5852n instanceof InterfaceC5600e2) {
            i10 |= Opcodes.ASM4;
        }
        if (abstractC5852n instanceof InterfaceC0389a) {
            i10 |= 524288;
        }
        if (abstractC5852n instanceof InterfaceC3288c) {
            i10 |= 2097152;
        }
        if (abstractC5852n instanceof C3853r) {
            i10 |= 8388608;
        }
        c0925b0.m2273g(i10, cls);
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final int m10140f(AbstractC5852n abstractC5852n) {
        if (!(abstractC5852n instanceof AbstractC5615j)) {
            return m10139e(abstractC5852n);
        }
        AbstractC5615j abstractC5615j = (AbstractC5615j) abstractC5852n;
        int iM10140f = abstractC5615j.f22874u;
        for (AbstractC5852n abstractC5852n2 = abstractC5615j.f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
            iM10140f |= m10140f(abstractC5852n2);
        }
        return iM10140f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final boolean m10141g(int i9) {
        return ((i9 & 128) != 0) | ((i9 & 4194304) != 0);
    }
}
