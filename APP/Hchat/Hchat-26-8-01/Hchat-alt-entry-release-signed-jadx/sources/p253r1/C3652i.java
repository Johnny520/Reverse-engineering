package p253r1;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import gg.C1425u;
import p041d1.C0655c0;
import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p131j0.C2046b;
import p136j8.C2104o;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p292u1.AbstractC4229a;
import p293u2.C4247q;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.C5587b1;
import p339x1.C5602f0;
import p339x1.InterfaceC5600e2;
import p352xf.EnumC5799a;
import p356y0.AbstractC5852n;
import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: r1.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3652i extends AbstractC5852n implements InterfaceC5600e2, InterfaceC3644a {

    /* JADX INFO: renamed from: u */
    public InterfaceC3644a f11844u;

    /* JADX INFO: renamed from: v */
    public C3647d f11845v;

    /* JADX INFO: renamed from: w */
    public C3652i f11846w;

    /* JADX INFO: renamed from: x */
    public final String f11847x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3652i(InterfaceC3644a interfaceC3644a, C3647d c3647d) {
        this.f11844u = interfaceC3644a;
        this.f11845v = c3647d == null ? new C3647d() : c3647d;
        this.f11847x = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5600e2
    /* JADX INFO: renamed from: F */
    public final Object mo742F() {
        return this.f11847x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r12 == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r12 != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p253r1.InterfaceC3644a
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1580M(long j3, InterfaceC5557c interfaceC5557c) {
        C3651h c3651h;
        long j4;
        long j5;
        if (interfaceC5557c instanceof C3651h) {
            c3651h = (C3651h) interfaceC5557c;
            int i9 = c3651h.f11843j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c3651h.f11843j = i9 - Integer.MIN_VALUE;
            } else {
                c3651h = new C3651h(this, (AbstractC6038c) interfaceC5557c);
            }
        }
        Object objMo1580M = c3651h.f11841h;
        int i10 = c3651h.f11843j;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(objMo1580M);
            C3652i c3652iM7633l1 = this.f23801t ? m7633l1() : null;
            if (c3652iM7633l1 != null) {
                c3651h.f11840g = j3;
                c3651h.f11843j = 1;
                objMo1580M = c3652iM7633l1.mo1580M(j3, c3651h);
            } else {
                j4 = 0;
                long j10 = j4;
                long j11 = j3;
                j5 = j10;
                InterfaceC3644a interfaceC3644a = this.f11844u;
                long jM8546d = C4247q.m8546d(j11, j5);
                c3651h.f11840g = j5;
                c3651h.f11843j = 2;
                objMo1580M = interfaceC3644a.mo1580M(jM8546d, c3651h);
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j5 = c3651h.f11840g;
                AbstractC1089i.m2732I0(objMo1580M);
                return new C4247q(C4247q.m8547e(j5, ((C4247q) objMo1580M).f13927a));
            }
            j3 = c3651h.f11840g;
            AbstractC1089i.m2732I0(objMo1580M);
        }
        j4 = ((C4247q) objMo1580M).f13927a;
        long j102 = j4;
        long j112 = j3;
        j5 = j102;
        InterfaceC3644a interfaceC3644a2 = this.f11844u;
        long jM8546d2 = C4247q.m8546d(j112, j5);
        c3651h.f11840g = j5;
        c3651h.f11843j = 2;
        objMo1580M = interfaceC3644a2.mo1580M(jM8546d2, c3651h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p253r1.InterfaceC3644a
    /* JADX INFO: renamed from: M0 */
    public final long mo1581M0(long j3, long j4, int i9) {
        long jMo1581M0 = this.f11844u.mo1581M0(j3, j4, i9);
        C3652i c3652iM7633l1 = this.f23801t ? m7633l1() : null;
        return C0807b.m2042e(jMo1581M0, c3652iM7633l1 != null ? c3652iM7633l1.mo1581M0(C0807b.m2042e(j3, jMo1581M0), C0807b.m2041d(j4, jMo1581M0), i9) : 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        C3647d c3647d = this.f11845v;
        c3647d.f11829a = this;
        c3647d.f11830b = null;
        this.f11846w = null;
        c3647d.f11831c = new C0655c0(this, 13);
        c3647d.f11832d = m10550Y0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        C1425u c1425u = new C1425u();
        AbstractC5618k.m10142A(this, new C3653j(c1425u, 0));
        C3652i c3652i = (C3652i) ((InterfaceC5600e2) c1425u.f4738g);
        this.f11846w = c3652i;
        C3647d c3647d = this.f11845v;
        c3647d.f11830b = c3652i;
        if (c3647d.f11829a == this) {
            c3647d.f11829a = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p253r1.InterfaceC3644a
    /* JADX INFO: renamed from: f0 */
    public final long mo1582f0(int i9, long j3) {
        C3652i c3652iM7633l1 = this.f23801t ? m7633l1() : null;
        long jMo1582f0 = c3652iM7633l1 != null ? c3652iM7633l1.mo1582f0(i9, j3) : 0L;
        return C0807b.m2042e(jMo1582f0, this.f11844u.mo1582f0(i9, C0807b.m2041d(j3, jMo1582f0)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC3599t m7632k1() {
        C3652i c3652iM7633l1 = m7633l1();
        InterfaceC3599t interfaceC3599tM7632k1 = c3652iM7633l1 != null ? c3652iM7633l1.m7632k1() : null;
        if (interfaceC3599tM7632k1 != null && AbstractC3603v.m7561o(interfaceC3599tM7632k1)) {
            return interfaceC3599tM7632k1;
        }
        InterfaceC3599t interfaceC3599t = this.f11845v.f11832d;
        if (interfaceC3599t != null) {
            return interfaceC3599t;
        }
        C2104o.m5276A("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l1 */
    public final C3652i m7633l1() {
        C5587b1 c5587b1;
        InterfaceC5600e2 interfaceC5600e2 = null;
        if (!this.f23801t) {
            return null;
        }
        if (!this.f23788g.f23801t) {
            AbstractC4229a.m8494b("visitAncestors called on an unattached node");
        }
        AbstractC5852n abstractC5852n = this.f23788g.f23792k;
        C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(this);
        loop0: while (true) {
            if (c5602f0M10167w == null) {
                break;
            }
            if ((c5602f0M10167w.f22778L.f22719f.f23791j & Opcodes.ASM4) != 0) {
                while (abstractC5852n != null) {
                    if ((abstractC5852n.f23790i & Opcodes.ASM4) != 0) {
                        AbstractC5852n abstractC5852nM10149e = abstractC5852n;
                        C2046b c2046b = null;
                        while (abstractC5852nM10149e != null) {
                            if (abstractC5852nM10149e instanceof InterfaceC5600e2) {
                                InterfaceC5600e2 interfaceC5600e22 = (InterfaceC5600e2) abstractC5852nM10149e;
                                if (AbstractC1416l.m3825a(this.f11847x, interfaceC5600e22.mo742F()) && C3652i.class == interfaceC5600e22.getClass()) {
                                    interfaceC5600e2 = interfaceC5600e22;
                                    break loop0;
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
                            abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b);
                        }
                    }
                    abstractC5852n = abstractC5852n.f23792k;
                }
            }
            c5602f0M10167w = c5602f0M10167w.m10049u();
            abstractC5852n = (c5602f0M10167w == null || (c5587b1 = c5602f0M10167w.f22778L) == null) ? null : c5587b1.f22718e;
        }
        return (C3652i) interfaceC5600e2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // p253r1.InterfaceC3644a
    /* JADX INFO: renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1583m0(long j3, long j4, AbstractC6038c abstractC6038c) {
        C3650g c3650g;
        long j5;
        long j10;
        long j11;
        long j12;
        long j13;
        if (abstractC6038c instanceof C3650g) {
            c3650g = (C3650g) abstractC6038c;
            int i9 = c3650g.f11839k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c3650g.f11839k = i9 - Integer.MIN_VALUE;
            } else {
                c3650g = new C3650g(this, abstractC6038c);
            }
        }
        C3650g c3650g2 = c3650g;
        Object objMo1583m0 = c3650g2.f11837i;
        int i10 = c3650g2.f11839k;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(objMo1583m0);
            InterfaceC3644a interfaceC3644a = this.f11844u;
            c3650g2.f11835g = j3;
            c3650g2.f11836h = j4;
            c3650g2.f11839k = 1;
            objMo1583m0 = interfaceC3644a.mo1583m0(j3, j4, c3650g2);
            if (objMo1583m0 != enumC5799a) {
                j5 = j3;
                j10 = j4;
            }
            return enumC5799a;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j13 = c3650g2.f11835g;
            AbstractC1089i.m2732I0(objMo1583m0);
            j12 = ((C4247q) objMo1583m0).f13927a;
            j11 = j13;
            return new C4247q(C4247q.m8547e(j11, j12));
        }
        j10 = c3650g2.f11836h;
        j5 = c3650g2.f11835g;
        AbstractC1089i.m2732I0(objMo1583m0);
        j11 = ((C4247q) objMo1583m0).f13927a;
        boolean z9 = this.f23801t;
        C3652i c3652iM7633l1 = z9 ? z9 ? m7633l1() : null : this.f11846w;
        if (c3652iM7633l1 == null) {
            j12 = 0;
            return new C4247q(C4247q.m8547e(j11, j12));
        }
        long jM8547e = C4247q.m8547e(j5, j11);
        long jM8546d = C4247q.m8546d(j10, j11);
        c3650g2.f11835g = j11;
        c3650g2.f11839k = 2;
        objMo1583m0 = c3652iM7633l1.mo1583m0(jM8547e, jM8546d, c3650g2);
        if (objMo1583m0 != enumC5799a) {
            j13 = j11;
            j12 = ((C4247q) objMo1583m0).f13927a;
            j11 = j13;
            return new C4247q(C4247q.m8547e(j11, j12));
        }
        return enumC5799a;
    }
}
