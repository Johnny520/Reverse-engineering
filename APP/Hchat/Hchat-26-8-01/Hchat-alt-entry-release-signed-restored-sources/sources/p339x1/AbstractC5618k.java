package p339x1;

import android.view.View;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import p057e1.C0808c;
import p071f1.InterfaceC1037z;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.AbstractC1869p1;
import p117i0.AbstractC1874r;
import p131j0.C2046b;
import p266s0.C3878h;
import p292u1.AbstractC4229a;
import p308v1.AbstractC4434w;
import p308v1.C4399j;
import p332wb.AbstractC4855en;
import p356y0.AbstractC5852n;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import p373z0.C6062b;
import p373z0.C6063c;

/* JADX INFO: renamed from: x1.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5618k {

    /* JADX INFO: renamed from: a */
    public static final C5632o1 f22894a = new C5632o1(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: x1.e2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static final void m10142A(InterfaceC5600e2 interfaceC5600e2, InterfaceC1231l interfaceC1231l) {
        C5587b1 c5587b1;
        boolean z9;
        AbstractC5852n abstractC5852n = (AbstractC5852n) interfaceC5600e2;
        if (!abstractC5852n.f23788g.f23801t) {
            AbstractC4229a.m8494b("visitAncestors called on an unattached node");
        }
        AbstractC5852n abstractC5852n2 = abstractC5852n.f23788g.f23792k;
        C5602f0 c5602f0M10167w = m10167w(interfaceC5600e2);
        while (c5602f0M10167w != null) {
            if ((c5602f0M10167w.f22778L.f22719f.f23791j & Opcodes.ASM4) != 0) {
                while (abstractC5852n2 != null) {
                    if ((abstractC5852n2.f23790i & Opcodes.ASM4) != 0) {
                        AbstractC5852n abstractC5852nM10149e = abstractC5852n2;
                        C2046b c2046b = null;
                        while (abstractC5852nM10149e != null) {
                            if (abstractC5852nM10149e instanceof InterfaceC5600e2) {
                                InterfaceC5600e2 interfaceC5600e22 = (InterfaceC5600e2) abstractC5852nM10149e;
                                if (!((AbstractC1416l.m3825a(interfaceC5600e2.mo742F(), interfaceC5600e22.mo742F()) && interfaceC5600e2.getClass() == interfaceC5600e22.getClass()) ? ((Boolean) interfaceC1231l.invoke(interfaceC5600e22)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z9 = false;
                                }
                            } else {
                                z9 = true;
                            }
                            if (z9) {
                                if (((abstractC5852nM10149e.f23790i & Opcodes.ASM4) != 0) && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                    int i9 = 0;
                                    for (AbstractC5852n abstractC5852n3 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n3 != null; abstractC5852n3 = abstractC5852n3.f23793l) {
                                        if ((abstractC5852n3.f23790i & Opcodes.ASM4) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                abstractC5852nM10149e = abstractC5852n3;
                                            } else {
                                                if (c2046b == null) {
                                                    c2046b = new C2046b(new AbstractC5852n[16]);
                                                }
                                                if (abstractC5852nM10149e != null) {
                                                    c2046b.m5056b(abstractC5852nM10149e);
                                                    abstractC5852nM10149e = null;
                                                }
                                                c2046b.m5056b(abstractC5852n3);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                            }
                            abstractC5852nM10149e = m10149e(c2046b);
                        }
                    }
                    abstractC5852n2 = abstractC5852n2.f23792k;
                }
            }
            c5602f0M10167w = c5602f0M10167w.m10049u();
            abstractC5852n2 = (c5602f0M10167w == null || (c5587b1 = c5602f0M10167w.f22778L) == null) ? null : c5587b1.f22718e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x009f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x00ae */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0046 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x0046 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x00a8 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, x1.e2] */
    /* JADX WARN: Type inference failed for: r13v0, types: [fg.l] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: B */
    public static final void m10143B(InterfaceC5600e2 interfaceC5600e2, InterfaceC1231l interfaceC1231l) {
        AbstractC5852n abstractC5852n = (AbstractC5852n) interfaceC5600e2;
        if (!abstractC5852n.f23788g.f23801t) {
            AbstractC4229a.m8494b("visitSubtreeIf called on an unattached node");
        }
        C2046b c2046b = new C2046b(new AbstractC5852n[16]);
        AbstractC5852n abstractC5852n2 = abstractC5852n.f23788g;
        AbstractC5852n abstractC5852n3 = abstractC5852n2.f23793l;
        if (abstractC5852n3 == null) {
            m10146b(c2046b, abstractC5852n2);
        } else {
            c2046b.m5056b(abstractC5852n3);
        }
        while (true) {
            int i9 = c2046b.f6893i;
            if (i9 == 0) {
                return;
            }
            AbstractC5852n abstractC5852n4 = (AbstractC5852n) c2046b.m5065k(i9 - 1);
            if ((abstractC5852n4.f23791j & Opcodes.ASM4) != 0) {
                for (AbstractC5852n abstractC5852n5 = abstractC5852n4; abstractC5852n5 != null && abstractC5852n5.f23801t; abstractC5852n5 = abstractC5852n5.f23793l) {
                    if ((abstractC5852n5.f23790i & Opcodes.ASM4) != 0) {
                        ?? M10149e = abstractC5852n5;
                        ?? c2046b2 = 0;
                        while (M10149e != 0) {
                            if (M10149e instanceof InterfaceC5600e2) {
                                InterfaceC5600e2 interfaceC5600e22 = (InterfaceC5600e2) M10149e;
                                EnumC5596d2 enumC5596d2 = (AbstractC1416l.m3825a(interfaceC5600e2.mo742F(), interfaceC5600e22.mo742F()) && interfaceC5600e2.getClass() == interfaceC5600e22.getClass()) ? (EnumC5596d2) interfaceC1231l.invoke(interfaceC5600e22) : EnumC5596d2.f22747g;
                                if (enumC5596d2 == EnumC5596d2.f22749i) {
                                    return;
                                }
                                if (enumC5596d2 == EnumC5596d2.f22748h) {
                                    break;
                                }
                            } else if ((M10149e.f23790i & Opcodes.ASM4) != 0 && (M10149e instanceof AbstractC5615j)) {
                                AbstractC5852n abstractC5852n6 = ((AbstractC5615j) M10149e).f22875v;
                                int i10 = 0;
                                M10149e = M10149e;
                                c2046b2 = c2046b2;
                                while (abstractC5852n6 != null) {
                                    if ((abstractC5852n6.f23790i & Opcodes.ASM4) != 0) {
                                        i10++;
                                        c2046b2 = c2046b2;
                                        if (i10 == 1) {
                                            M10149e = abstractC5852n6;
                                        } else {
                                            if (c2046b2 == 0) {
                                                c2046b2 = new C2046b(new AbstractC5852n[16]);
                                            }
                                            if (M10149e != 0) {
                                                c2046b2.m5056b(M10149e);
                                                M10149e = 0;
                                            }
                                            c2046b2.m5056b(abstractC5852n6);
                                        }
                                    }
                                    abstractC5852n6 = abstractC5852n6.f23793l;
                                    M10149e = M10149e;
                                    c2046b2 = c2046b2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            M10149e = m10149e(c2046b2);
                        }
                    }
                }
            }
            m10146b(c2046b, abstractC5852n4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x008e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x009d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x0043 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0043 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x0097 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [fg.l] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX INFO: renamed from: C */
    public static final void m10144C(AbstractC5852n abstractC5852n, String str, InterfaceC1231l interfaceC1231l) {
        if (!abstractC5852n.f23788g.f23801t) {
            AbstractC4229a.m8494b("visitSubtreeIf called on an unattached node");
        }
        C2046b c2046b = new C2046b(new AbstractC5852n[16]);
        AbstractC5852n abstractC5852n2 = abstractC5852n.f23788g;
        AbstractC5852n abstractC5852n3 = abstractC5852n2.f23793l;
        if (abstractC5852n3 == null) {
            m10146b(c2046b, abstractC5852n2);
        } else {
            c2046b.m5056b(abstractC5852n3);
        }
        while (true) {
            int i9 = c2046b.f6893i;
            if (i9 == 0) {
                return;
            }
            AbstractC5852n abstractC5852n4 = (AbstractC5852n) c2046b.m5065k(i9 - 1);
            if ((abstractC5852n4.f23791j & Opcodes.ASM4) != 0) {
                for (AbstractC5852n abstractC5852n5 = abstractC5852n4; abstractC5852n5 != null && abstractC5852n5.f23801t; abstractC5852n5 = abstractC5852n5.f23793l) {
                    if ((abstractC5852n5.f23790i & Opcodes.ASM4) != 0) {
                        ?? M10149e = abstractC5852n5;
                        ?? c2046b2 = 0;
                        while (M10149e != 0) {
                            if (M10149e instanceof InterfaceC5600e2) {
                                InterfaceC5600e2 interfaceC5600e2 = (InterfaceC5600e2) M10149e;
                                EnumC5596d2 enumC5596d2 = str.equals(interfaceC5600e2.mo742F()) ? (EnumC5596d2) interfaceC1231l.invoke(interfaceC5600e2) : EnumC5596d2.f22747g;
                                if (enumC5596d2 == EnumC5596d2.f22749i) {
                                    return;
                                }
                                if (enumC5596d2 == EnumC5596d2.f22748h) {
                                    break;
                                }
                            } else if ((M10149e.f23790i & Opcodes.ASM4) != 0 && (M10149e instanceof AbstractC5615j)) {
                                AbstractC5852n abstractC5852n6 = ((AbstractC5615j) M10149e).f22875v;
                                int i10 = 0;
                                M10149e = M10149e;
                                c2046b2 = c2046b2;
                                while (abstractC5852n6 != null) {
                                    if ((abstractC5852n6.f23790i & Opcodes.ASM4) != 0) {
                                        i10++;
                                        c2046b2 = c2046b2;
                                        if (i10 == 1) {
                                            M10149e = abstractC5852n6;
                                        } else {
                                            if (c2046b2 == 0) {
                                                c2046b2 = new C2046b(new AbstractC5852n[16]);
                                            }
                                            if (M10149e != 0) {
                                                c2046b2.m5056b(M10149e);
                                                M10149e = 0;
                                            }
                                            c2046b2.m5056b(abstractC5852n6);
                                        }
                                    }
                                    abstractC5852n6 = abstractC5852n6.f23793l;
                                    M10149e = M10149e;
                                    c2046b2 = c2046b2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            M10149e = m10149e(c2046b2);
                        }
                    }
                }
            }
            m10146b(c2046b, abstractC5852n4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final long m10145a(float f3, boolean z9, boolean z10) {
        return (((z9 ? 1L : 0L) | (z10 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m10146b(C2046b c2046b, AbstractC5852n abstractC5852n) {
        C2046b c2046bM10053y = m10167w(abstractC5852n).m10053y();
        int i9 = c2046bM10053y.f6893i - 1;
        Object[] objArr = c2046bM10053y.f6891g;
        if (i9 < objArr.length) {
            while (i9 >= 0) {
                c2046b.m5056b(((C5602f0) objArr[i9]).f22778L.f22719f);
                i9--;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final int m10147c(AbstractC5628n0 abstractC5628n0, C4399j c4399j) {
        AbstractC5628n0 abstractC5628n0Mo10086S0 = abstractC5628n0.mo10086S0();
        if (abstractC5628n0Mo10086S0 == null) {
            AbstractC4229a.m8494b("Child of " + abstractC5628n0 + " cannot be null when calculating alignment line");
        }
        if (abstractC5628n0.mo10091Z0().mo7599e().containsKey(c4399j)) {
            Integer num = (Integer) abstractC5628n0.mo10091Z0().mo7599e().get(c4399j);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iM10177R0 = abstractC5628n0Mo10086S0.m10177R0(c4399j);
            if (iM10177R0 != Integer.MIN_VALUE) {
                abstractC5628n0Mo10086S0.f22923p = true;
                abstractC5628n0.f22924q = true;
                abstractC5628n0.mo10094f1();
                abstractC5628n0Mo10086S0.f22923p = false;
                abstractC5628n0.f22924q = false;
                return iM10177R0 + ((int) (c4399j instanceof C4399j ? abstractC5628n0Mo10086S0.mo10093b1() & 4294967295L : abstractC5628n0Mo10086S0.mo10093b1() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final AbstractC5852n m10148d(InterfaceC5612i interfaceC5612i, int i9) {
        AbstractC5852n abstractC5852n = ((AbstractC5852n) interfaceC5612i).f23788g.f23793l;
        if (abstractC5852n == null || (abstractC5852n.f23791j & i9) == 0) {
            return null;
        }
        while (abstractC5852n != null) {
            int i10 = abstractC5852n.f23790i;
            if ((i10 & 2) != 0) {
                return null;
            }
            if ((i10 & i9) != 0) {
                return abstractC5852n;
            }
            abstractC5852n = abstractC5852n.f23793l;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final AbstractC5852n m10149e(C2046b c2046b) {
        int i9;
        if (c2046b == null || (i9 = c2046b.f6893i) == 0) {
            return null;
        }
        return (AbstractC5852n) c2046b.m5065k(i9 - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0016 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0016 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: y0.n */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: y0.n */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: y0.n */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: y0.n */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: y0.n */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: y0.n */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC5651v m10150f(AbstractC5852n abstractC5852n) {
        if ((abstractC5852n.f23790i & 2) != 0) {
            if (abstractC5852n instanceof InterfaceC5651v) {
                return (InterfaceC5651v) abstractC5852n;
            }
            if (abstractC5852n instanceof AbstractC5615j) {
                AbstractC5852n abstractC5852n2 = ((AbstractC5615j) abstractC5852n).f22875v;
                while (abstractC5852n2 != 0) {
                    if (abstractC5852n2 instanceof InterfaceC5651v) {
                        return (InterfaceC5651v) abstractC5852n2;
                    }
                    abstractC5852n2 = (!(abstractC5852n2 instanceof AbstractC5615j) || (abstractC5852n2.f23790i & 2) == 0) ? abstractC5852n2.f23793l : ((AbstractC5615j) abstractC5852n2).f22875v;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final int m10151g(long j3, long j4) {
        boolean zM10160p = m10160p(j3);
        if (zM10160p != m10160p(j4)) {
            return zM10160p ? -1 : 1;
        }
        return (Math.min(m10155k(j3), m10155k(j4)) >= 0.0f && m10159o(j3) != m10159o(j4)) ? m10159o(j3) ? -1 : 1 : (int) Math.signum(m10155k(j3) - m10155k(j4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: x1.h */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static final Object m10152h(InterfaceC5609h interfaceC5609h, AbstractC1869p1 abstractC1869p1) {
        if (!((AbstractC5852n) interfaceC5609h).f23788g.f23801t) {
            AbstractC4229a.m8494b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        C3878h c3878h = (C3878h) m10167w(interfaceC5609h).f22774H;
        c3878h.getClass();
        return AbstractC1874r.m4640v(c3878h, abstractC1869p1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final C0808c m10153i(AbstractC5852n abstractC5852n, boolean z9, boolean z10) {
        if (!abstractC5852n.f23788g.f23801t) {
            return C0808c.f2415e;
        }
        if (z9) {
            return m10164t(abstractC5852n, 8).m10081N1();
        }
        AbstractC5614i1 abstractC5614i1M10164t = m10164t(abstractC5852n, 8);
        return AbstractC4434w.m8884h(abstractC5614i1M10164t).mo8866k0(abstractC5614i1M10164t, z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC5600e2 m10154j(AbstractC5615j abstractC5615j, Object obj) {
        C5587b1 c5587b1;
        if (!abstractC5615j.f23788g.f23801t) {
            AbstractC4229a.m8494b("visitAncestors called on an unattached node");
        }
        AbstractC5852n abstractC5852n = abstractC5615j.f23788g.f23792k;
        C5602f0 c5602f0M10167w = m10167w(abstractC5615j);
        while (c5602f0M10167w != null) {
            if ((c5602f0M10167w.f22778L.f22719f.f23791j & Opcodes.ASM4) != 0) {
                while (abstractC5852n != null) {
                    if ((abstractC5852n.f23790i & Opcodes.ASM4) != 0) {
                        AbstractC5852n abstractC5852nM10149e = abstractC5852n;
                        C2046b c2046b = null;
                        while (abstractC5852nM10149e != null) {
                            if (abstractC5852nM10149e instanceof InterfaceC5600e2) {
                                InterfaceC5600e2 interfaceC5600e2 = (InterfaceC5600e2) abstractC5852nM10149e;
                                if (obj.equals(interfaceC5600e2.mo742F())) {
                                    return interfaceC5600e2;
                                }
                            }
                            if ((abstractC5852nM10149e.f23790i & Opcodes.ASM4) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                int i9 = 0;
                                for (AbstractC5852n abstractC5852n2 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
                                    if ((abstractC5852n2.f23790i & Opcodes.ASM4) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            abstractC5852nM10149e = abstractC5852n2;
                                        } else {
                                            if (c2046b == null) {
                                                c2046b = new C2046b(new AbstractC5852n[16]);
                                            }
                                            if (abstractC5852nM10149e != null) {
                                                c2046b.m5056b(abstractC5852nM10149e);
                                                abstractC5852nM10149e = null;
                                            }
                                            c2046b.m5056b(abstractC5852n2);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            abstractC5852nM10149e = m10149e(c2046b);
                        }
                    }
                    abstractC5852n = abstractC5852n.f23792k;
                }
            }
            c5602f0M10167w = c5602f0M10167w.m10049u();
            abstractC5852n = (c5602f0M10167w == null || (c5587b1 = c5602f0M10167w.f22778L) == null) ? null : c5587b1.f22718e;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final float m10155k(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: x1.m */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final void m10156l(InterfaceC5624m interfaceC5624m) {
        if (((AbstractC5852n) interfaceC5624m).f23788g.f23801t) {
            m10164t(interfaceC5624m, 1).m10113y1();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final void m10157m(InterfaceC5651v interfaceC5651v) {
        m10167w(interfaceC5651v).m10007D();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final void m10158n(InterfaceC5665z1 interfaceC5665z1) {
        m10167w(interfaceC5665z1).m10008E();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final boolean m10159o(long j3) {
        return (j3 & 2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final boolean m10160p(long j3) {
        return (j3 & 1) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final boolean m10161q(C5602f0 c5602f0) {
        if (c5602f0.f22797n == null) {
            return false;
        }
        C5602f0 c5602f0M10049u = c5602f0.m10049u();
        return (c5602f0M10049u != null ? c5602f0M10049u.f22797n : null) == null || c5602f0.f22779M.f22877b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: y0.n */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static final void m10162r(AbstractC5852n abstractC5852n, InterfaceC1220a interfaceC1220a) {
        C5629n1 c5629n1 = abstractC5852n.f23794m;
        if (c5629n1 == null) {
            c5629n1 = new C5629n1((InterfaceC5626m1) abstractC5852n);
            abstractC5852n.f23794m = c5629n1;
        }
        C5647t1 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) m10168x(abstractC5852n)).getSnapshotObserver();
        snapshotObserver.f23001a.m9162c(c5629n1, C5593d.f22734l, interfaceC1220a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final void m10163s(InterfaceC5612i interfaceC5612i) {
        C6063c c6063c;
        C5602f0 c5602f0M10167w = m10167w(interfaceC5612i);
        if (c5602f0M10167w.f22809z || (c6063c = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0M10167w)).f24100T) == null) {
            return;
        }
        c6063c.f24539j.f4315b.m350P(c5602f0M10167w.f22791h, new C6062b(c6063c, c5602f0M10167w));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final AbstractC5614i1 m10164t(InterfaceC5612i interfaceC5612i, int i9) {
        AbstractC5614i1 abstractC5614i1 = ((AbstractC5852n) interfaceC5612i).f23788g.f23795n;
        abstractC5614i1.getClass();
        if (abstractC5614i1.mo10106r1() != interfaceC5612i || !AbstractC5617j1.m10141g(i9)) {
            return abstractC5614i1;
        }
        AbstractC5614i1 abstractC5614i12 = abstractC5614i1.f22869v;
        abstractC5614i12.getClass();
        return abstractC5614i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final InterfaceC1037z m10165u(AbstractC5852n abstractC5852n) {
        return ((ViewTreeObserverOnGlobalLayoutListenerC5934t) m10168x(abstractC5852n)).getGraphicsContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final AbstractC5614i1 m10166v(InterfaceC5612i interfaceC5612i) {
        if (!((AbstractC5852n) interfaceC5612i).f23788g.f23801t) {
            AbstractC4229a.m8494b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        AbstractC5614i1 abstractC5614i1M10164t = m10164t(interfaceC5612i, 2);
        if (!abstractC5614i1M10164t.mo10106r1().f23801t) {
            AbstractC4229a.m8494b("LayoutCoordinates is not attached.");
        }
        return abstractC5614i1M10164t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final C5602f0 m10167w(InterfaceC5612i interfaceC5612i) {
        AbstractC5614i1 abstractC5614i1 = ((AbstractC5852n) interfaceC5612i).f23788g.f23795n;
        if (abstractC5614i1 != null) {
            return abstractC5614i1.f22868u;
        }
        throw AbstractC4855en.m9257a("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final InterfaceC5641r1 m10168x(InterfaceC5612i interfaceC5612i) {
        InterfaceC5641r1 interfaceC5641r1 = m10167w(interfaceC5612i).f22803t;
        if (interfaceC5641r1 != null) {
            return interfaceC5641r1;
        }
        throw AbstractC4855en.m9257a("This node does not have an owner.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final View m10169y(InterfaceC5612i interfaceC5612i) {
        if (!((AbstractC5852n) interfaceC5612i).f23788g.f23801t) {
            AbstractC4229a.m8494b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) AbstractC5613i0.m10067a(m10167w(interfaceC5612i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final void m10170z(InterfaceC5612i interfaceC5612i, Object obj, InterfaceC1231l interfaceC1231l) {
        C5587b1 c5587b1;
        boolean z9;
        AbstractC5852n abstractC5852n = (AbstractC5852n) interfaceC5612i;
        if (!abstractC5852n.f23788g.f23801t) {
            AbstractC4229a.m8494b("visitAncestors called on an unattached node");
        }
        AbstractC5852n abstractC5852n2 = abstractC5852n.f23788g.f23792k;
        C5602f0 c5602f0M10167w = m10167w(interfaceC5612i);
        while (c5602f0M10167w != null) {
            if ((c5602f0M10167w.f22778L.f22719f.f23791j & Opcodes.ASM4) != 0) {
                while (abstractC5852n2 != null) {
                    if ((abstractC5852n2.f23790i & Opcodes.ASM4) != 0) {
                        AbstractC5852n abstractC5852nM10149e = abstractC5852n2;
                        C2046b c2046b = null;
                        while (abstractC5852nM10149e != null) {
                            if (abstractC5852nM10149e instanceof InterfaceC5600e2) {
                                InterfaceC5600e2 interfaceC5600e2 = (InterfaceC5600e2) abstractC5852nM10149e;
                                if (!(obj.equals(interfaceC5600e2.mo742F()) ? ((Boolean) interfaceC1231l.invoke(interfaceC5600e2)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z9 = false;
                                }
                            } else {
                                z9 = true;
                            }
                            if (z9) {
                                if (((abstractC5852nM10149e.f23790i & Opcodes.ASM4) != 0) && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                    int i9 = 0;
                                    for (AbstractC5852n abstractC5852n3 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n3 != null; abstractC5852n3 = abstractC5852n3.f23793l) {
                                        if ((abstractC5852n3.f23790i & Opcodes.ASM4) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                abstractC5852nM10149e = abstractC5852n3;
                                            } else {
                                                if (c2046b == null) {
                                                    c2046b = new C2046b(new AbstractC5852n[16]);
                                                }
                                                if (abstractC5852nM10149e != null) {
                                                    c2046b.m5056b(abstractC5852nM10149e);
                                                    abstractC5852nM10149e = null;
                                                }
                                                c2046b.m5056b(abstractC5852n3);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                            }
                            abstractC5852nM10149e = m10149e(c2046b);
                        }
                    }
                    abstractC5852n2 = abstractC5852n2.f23792k;
                }
            }
            c5602f0M10167w = c5602f0M10167w.m10049u();
            abstractC5852n2 = (c5602f0M10167w == null || (c5587b1 = c5602f0M10167w.f22778L) == null) ? null : c5587b1.f22718e;
        }
    }
}
