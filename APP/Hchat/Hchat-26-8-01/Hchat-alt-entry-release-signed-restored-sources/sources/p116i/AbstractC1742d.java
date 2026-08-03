package p116i;

import bsh.org.objectweb.asm.Opcodes;
import gg.C1425u;
import java.util.concurrent.CancellationException;
import p014b.C0126e;
import p015b0.C0136d0;
import p036c9.C0423c0;
import p036c9.C0446i;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p088g0.C1271o;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p136j8.C2104o;
import p276sf.C3967n;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4666q;
import p352xf.EnumC5799a;
import p356y0.C5840b;
import p356y0.InterfaceC5854p;
import p357y1.C5928r1;
import p370yf.AbstractC6038c;
import p370yf.AbstractC6044i;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: i.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1742d {

    /* JADX INFO: renamed from: a */
    public static final C1769m f5801a = new C1769m(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b */
    public static final C1772n f5802b = new C1772n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c */
    public static final C1775o f5803c = new C1775o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d */
    public static final C1778p f5804d = new C1778p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e */
    public static final C1769m f5805e = new C1769m(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f */
    public static final C1772n f5806f = new C1772n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g */
    public static final C1775o f5807g = new C1775o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h */
    public static final C1778p f5808h = new C1778p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: i */
    public static final float[] f5809i = new float[91];

    /* JADX INFO: renamed from: j */
    public static final C1771m1 f5810j = new C1771m1(new C1271o(10), new C1271o(27));

    /* JADX INFO: renamed from: k */
    public static final C1771m1 f5811k = new C1771m1(new C1271o(11), new C1271o(12));

    /* JADX INFO: renamed from: l */
    public static final C1771m1 f5812l = new C1771m1(new C1271o(13), new C1271o(14));

    /* JADX INFO: renamed from: m */
    public static final C1771m1 f5813m = new C1771m1(new C1271o(15), new C1271o(16));

    /* JADX INFO: renamed from: n */
    public static final C1771m1 f5814n = new C1771m1(new C1271o(17), new C1271o(18));

    /* JADX INFO: renamed from: o */
    public static final C1771m1 f5815o = new C1771m1(new C1271o(19), new C1271o(20));

    /* JADX INFO: renamed from: p */
    public static final C1771m1 f5816p = new C1771m1(new C1271o(21), new C1271o(22));

    /* JADX INFO: renamed from: q */
    public static final C1771m1 f5817q = new C1771m1(new C1271o(23), new C1271o(24));

    /* JADX INFO: renamed from: r */
    public static final C1771m1 f5818r = new C1771m1(new C1271o(25), new C1271o(26));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C1739c m4365a(float f3, float f10) {
        return new C1739c(Float.valueOf(f3), f5810j, Float.valueOf(f10), 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C1766l m4366b(float f3, float f10, int i9) {
        if ((i9 & 2) != 0) {
            f10 = 0.0f;
        }
        return new C1766l(f5810j, Float.valueOf(f3), new C1769m(f10), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m4367c(C1765k1 c1765k1, C1753g1 c1753g1, Object obj, Object obj2, InterfaceC1803y interfaceC1803y, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(867041821);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4534f(c1765k1) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4534f(c1753g1) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= (i9 & Opcodes.ACC_INTERFACE) == 0 ? c1836h0.m4534f(obj) : c1836h0.m4538h(obj) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= (i9 & 4096) == 0 ? c1836h0.m4534f(obj2) : c1836h0.m4538h(obj2) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i9 & 24576) == 0) {
            i10 |= (32768 & i9) == 0 ? c1836h0.m4534f(interfaceC1803y) : c1836h0.m4538h(interfaceC1803y) ? 16384 : 8192;
        }
        if (!c1836h0.m4516S(i10 & 1, (i10 & 9363) != 9362)) {
            c1836h0.m4519V();
        } else if (c1765k1.m4418g()) {
            c1753g1.m4406f(obj, obj2, interfaceC1803y);
        } else {
            c1753g1.m4407g(obj2, interfaceC1803y);
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0423c0(c1765k1, c1753g1, obj, obj2, interfaceC1803y, i9, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4368d(C1766l c1766l, InterfaceC1751g interfaceC1751g, long j3, final InterfaceC1231l interfaceC1231l, AbstractC6038c abstractC6038c) {
        C1804y0 c1804y0;
        final C1425u c1425u;
        final C1766l c1766l2;
        C1766l c1766l3;
        InterfaceC1231l interfaceC1231l2;
        C1425u c1425u2;
        Object objM4458d;
        InterfaceC1231l interfaceC1231l3;
        C1760j c1760j;
        C1760j c1760j2;
        Object objM4458d2;
        final InterfaceC1751g interfaceC1751g2 = interfaceC1751g;
        C5928r1 c5928r1 = C5928r1.f24041g;
        if (abstractC6038c instanceof C1804y0) {
            c1804y0 = (C1804y0) abstractC6038c;
            int i9 = c1804y0.f6019l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1804y0.f6019l = i9 - Integer.MIN_VALUE;
            } else {
                c1804y0 = new C1804y0(abstractC6038c);
            }
        }
        C1804y0 c1804y02 = c1804y0;
        Object obj = c1804y02.f6018k;
        int i10 = c1804y02.f6019l;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            final Object objMo4399f = interfaceC1751g2.mo4399f(0L);
            final AbstractC1781q abstractC1781qMo4397d = interfaceC1751g2.mo4397d(0L);
            c1425u = new C1425u();
            if (j3 == Long.MIN_VALUE) {
                try {
                    final float fM4378n = m4378n(c1804y02.getContext());
                    c1766l2 = c1766l;
                    try {
                        interfaceC1231l2 = new InterfaceC1231l() { // from class: i.u0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                InterfaceC1751g interfaceC1751g3 = interfaceC1751g2;
                                C1771m1 c1771m1Mo4396c = interfaceC1751g3.mo4396c();
                                Object objMo4400g = interfaceC1751g3.mo4400g();
                                C1766l c1766l4 = c1766l2;
                                C1760j c1760j3 = new C1760j(objMo4399f, c1771m1Mo4396c, abstractC1781qMo4397d, jLongValue, objMo4400g, jLongValue, new C1797v0(1, c1766l4));
                                AbstractC1742d.m4377m(c1760j3, jLongValue, fM4378n, interfaceC1751g3, c1766l4, interfaceC1231l);
                                c1425u.f4738g = c1760j3;
                                return C3967n.f12976a;
                            }
                        };
                        c1425u2 = c1425u;
                    } catch (CancellationException e6) {
                        e = e6;
                        c1766l3 = c1766l2;
                        c1760j = (C1760j) c1425u.f4738g;
                        if (c1760j != null) {
                            c1760j.f5884i.setValue(Boolean.FALSE);
                        }
                        c1760j2 = (C1760j) c1425u.f4738g;
                        if (c1760j2 != null && c1760j2.f5882g == c1766l3.f5903j) {
                            c1766l3.f5905l = false;
                        }
                        throw e;
                    }
                    try {
                        c1804y02.f6014g = c1766l2;
                        c1804y02.f6015h = interfaceC1751g2;
                        c1804y02.f6016i = interfaceC1231l;
                        c1804y02.f6017j = c1425u2;
                        c1804y02.f6019l = 1;
                        if (!interfaceC1751g2.mo4394a()) {
                            objM4458d = AbstractC1874r.m4637s(c1804y02.getContext()).m4458d(new C1802x0(interfaceC1231l2, 0), c1804y02);
                        } else {
                            if (c1804y02.getContext().mo2062s(c5928r1) != null) {
                                throw new ClassCastException();
                            }
                            objM4458d = AbstractC1874r.m4637s(c1804y02.getContext()).m4458d(interfaceC1231l2, c1804y02);
                        }
                        if (objM4458d != enumC5799a) {
                            c1766l3 = c1766l2;
                            interfaceC1231l3 = interfaceC1231l;
                            c1425u = c1425u2;
                        }
                        return enumC5799a;
                    } catch (CancellationException e7) {
                        e = e7;
                        c1766l3 = c1766l2;
                        c1425u = c1425u2;
                        c1760j = (C1760j) c1425u.f4738g;
                        if (c1760j != null) {
                        }
                        c1760j2 = (C1760j) c1425u.f4738g;
                        if (c1760j2 != null) {
                        }
                        throw e;
                    }
                } catch (CancellationException e10) {
                    e = e10;
                    c1766l2 = c1766l;
                }
            } else {
                c1425u2 = c1425u;
                try {
                    C1760j c1760j3 = new C1760j(objMo4399f, interfaceC1751g2.mo4396c(), abstractC1781qMo4397d, j3, interfaceC1751g2.mo4400g(), j3, new C1797v0(0, c1766l));
                    m4377m(c1760j3, j3, m4378n(c1804y02.getContext()), interfaceC1751g2, c1766l, interfaceC1231l);
                    c1425u2.f4738g = c1760j3;
                    c1766l3 = c1766l;
                    interfaceC1751g2 = interfaceC1751g;
                    interfaceC1231l3 = interfaceC1231l;
                    c1425u = c1425u2;
                } catch (CancellationException e11) {
                    e = e11;
                    c1766l3 = c1766l;
                    c1425u = c1425u2;
                    c1760j = (C1760j) c1425u.f4738g;
                    if (c1760j != null) {
                    }
                    c1760j2 = (C1760j) c1425u.f4738g;
                    if (c1760j2 != null) {
                    }
                    throw e;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c1425u = c1804y02.f6017j;
            interfaceC1231l3 = c1804y02.f6016i;
            interfaceC1751g2 = c1804y02.f6015h;
            c1766l3 = c1804y02.f6014g;
            try {
                AbstractC1089i.m2732I0(obj);
            } catch (CancellationException e12) {
                e = e12;
                c1760j = (C1760j) c1425u.f4738g;
                if (c1760j != null) {
                }
                c1760j2 = (C1760j) c1425u.f4738g;
                if (c1760j2 != null) {
                }
                throw e;
            }
        }
        do {
            Object obj2 = c1425u.f4738g;
            obj2.getClass();
            if (!((Boolean) ((C1760j) obj2).f5884i.getValue()).booleanValue()) {
                return C3967n.f12976a;
            }
            final float fM4378n2 = m4378n(c1804y02.getContext());
            final C1425u c1425u3 = c1425u;
            final InterfaceC1231l interfaceC1231l4 = interfaceC1231l3;
            final InterfaceC1751g interfaceC1751g3 = interfaceC1751g2;
            final C1766l c1766l4 = c1766l3;
            try {
                InterfaceC1231l interfaceC1231l5 = new InterfaceC1231l() { // from class: i.w0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1231l
                    public final Object invoke(Object obj3) {
                        long jLongValue = ((Long) obj3).longValue();
                        Object obj4 = c1425u3.f4738g;
                        obj4.getClass();
                        AbstractC1742d.m4377m((C1760j) obj4, jLongValue, fM4378n2, interfaceC1751g3, c1766l4, interfaceC1231l4);
                        return C3967n.f12976a;
                    }
                };
                c1425u = c1425u3;
                interfaceC1751g2 = interfaceC1751g3;
                c1766l3 = c1766l4;
                interfaceC1231l3 = interfaceC1231l4;
                c1804y02.f6014g = c1766l3;
                c1804y02.f6015h = interfaceC1751g2;
                c1804y02.f6016i = interfaceC1231l3;
                c1804y02.f6017j = c1425u;
                c1804y02.f6019l = 2;
                if (!interfaceC1751g2.mo4394a()) {
                    objM4458d2 = AbstractC1874r.m4637s(c1804y02.getContext()).m4458d(new C1802x0(interfaceC1231l5, 0), c1804y02);
                } else {
                    if (c1804y02.getContext().mo2062s(c5928r1) != null) {
                        throw new ClassCastException();
                    }
                    objM4458d2 = AbstractC1874r.m4637s(c1804y02.getContext()).m4458d(interfaceC1231l5, c1804y02);
                }
            } catch (CancellationException e13) {
                e = e13;
                c1425u = c1425u3;
                c1766l3 = c1766l4;
                c1760j = (C1760j) c1425u.f4738g;
                if (c1760j != null) {
                }
                c1760j2 = (C1760j) c1425u.f4738g;
                if (c1760j2 != null) {
                    c1766l3.f5905l = false;
                }
                throw e;
            }
        } while (objM4458d2 != enumC5799a);
        return enumC5799a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Object m4369e(float f3, float f10, C1768l1 c1768l1, InterfaceC1235p interfaceC1235p, AbstractC6044i abstractC6044i, int i9) {
        InterfaceC1763k interfaceC1763kM4379o = c1768l1;
        if ((i9 & 8) != 0) {
            interfaceC1763kM4379o = m4379o(0.0f, 0.0f, null, 7);
        }
        InterfaceC1763k interfaceC1763k = interfaceC1763kM4379o;
        Float f11 = new Float(f3);
        Float f12 = new Float(f10);
        Float f13 = new Float(0.0f);
        C1771m1 c1771m1 = f5810j;
        InterfaceC1231l interfaceC1231l = c1771m1.f5912a;
        AbstractC1781q abstractC1781qMo4425c = (AbstractC1781q) interfaceC1231l.invoke(f13);
        if (abstractC1781qMo4425c == null) {
            abstractC1781qMo4425c = ((AbstractC1781q) interfaceC1231l.invoke(f11)).mo4425c();
        }
        AbstractC1781q abstractC1781q = abstractC1781qMo4425c;
        Object objM4368d = m4368d(new C1766l(c1771m1, f11, abstractC1781q, 56), new C1806z0(interfaceC1763k, c1771m1, f11, f12, abstractC1781q), Long.MIN_VALUE, new C0136d0(interfaceC1235p, 16), abstractC6044i);
        C3967n c3967n = C3967n.f12976a;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (objM4368d != enumC5799a) {
            objM4368d = c3967n;
        }
        return objM4368d == enumC5799a ? objM4368d : c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static Object m4370f(C1766l c1766l, C1793u c1793u, InterfaceC1231l interfaceC1231l, AbstractC6038c abstractC6038c) {
        Object objM4368d = m4368d(c1766l, new C1790t(c1793u, c1766l.f5900g, c1766l.f5901h.getValue(), c1766l.f5902i), Long.MIN_VALUE, interfaceC1231l, abstractC6038c);
        return objM4368d == EnumC5799a.f23547g ? objM4368d : C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final Object m4371g(C1766l c1766l, Float f3, InterfaceC1763k interfaceC1763k, boolean z9, InterfaceC1231l interfaceC1231l, AbstractC6038c abstractC6038c) {
        Object objM4368d = m4368d(c1766l, new C1806z0(interfaceC1763k, c1766l.f5900g, c1766l.f5901h.getValue(), f3, c1766l.f5902i), z9 ? c1766l.f5903j : Long.MIN_VALUE, interfaceC1231l, abstractC6038c);
        return objM4368d == EnumC5799a.f23547g ? objM4368d : C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m4372h(C1766l c1766l, Float f3, InterfaceC1763k interfaceC1763k, boolean z9, InterfaceC1231l interfaceC1231l, AbstractC6038c abstractC6038c, int i9) {
        if ((i9 & 2) != 0) {
            interfaceC1763k = m4379o(0.0f, 0.0f, null, 7);
        }
        InterfaceC1763k interfaceC1763k2 = interfaceC1763k;
        if ((i9 & 4) != 0) {
            z9 = false;
        }
        boolean z10 = z9;
        if ((i9 & 8) != 0) {
            interfaceC1231l = new C1271o(9);
        }
        return m4371g(c1766l, f3, interfaceC1763k2, z10, interfaceC1231l, abstractC6038c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final AbstractC1781q m4373i(AbstractC1781q abstractC1781q) {
        AbstractC1781q abstractC1781qMo4425c = abstractC1781q.mo4425c();
        int iMo4424b = abstractC1781qMo4425c.mo4424b();
        for (int i9 = 0; i9 < iMo4424b; i9++) {
            abstractC1781qMo4425c.mo4427e(i9, abstractC1781q.mo4423a(i9));
        }
        return abstractC1781qMo4425c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static C1766l m4374j(C1766l c1766l, float f3) {
        float f10 = ((C1769m) c1766l.f5902i).f5910a;
        return new C1766l(c1766l.f5900g, Float.valueOf(f3), new C1769m(f10), c1766l.f5903j, c1766l.f5904k, c1766l.f5905l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r4v1, types: [fg.l, gg.m] */
    /* JADX WARN: Type inference failed for: r5v5, types: [fg.l, gg.m] */
    /* JADX INFO: renamed from: k */
    public static final C1744d1 m4375k(C1765k1 c1765k1, C1771m1 c1771m1, String str, C1836h0 c1836h0, int i9, int i10) {
        C1741c1 c1741c1;
        if ((i10 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zM4534f = c1836h0.m4534f(c1765k1);
        Object objM4514P = c1836h0.m4514P();
        Object obj = C1851l.f6155a;
        if (zM4534f || objM4514P == obj) {
            objM4514P = new C1744d1(c1765k1, c1771m1, str);
            c1836h0.m4545k0(objM4514P);
        }
        C1744d1 c1744d1 = (C1744d1) objM4514P;
        boolean zM4534f2 = c1836h0.m4534f(c1765k1) | c1836h0.m4538h(c1744d1);
        Object objM4514P2 = c1836h0.m4514P();
        if (zM4534f2 || objM4514P2 == obj) {
            objM4514P2 = new C0446i(c1765k1, 17, c1744d1);
            c1836h0.m4545k0(objM4514P2);
        }
        AbstractC1874r.m4621c(c1744d1, (InterfaceC1231l) objM4514P2, c1836h0);
        if (c1765k1.m4418g() && (c1741c1 = (C1741c1) c1744d1.f5828b.getValue()) != null) {
            C1765k1 c1765k12 = c1744d1.f5829c;
            c1741c1.f5797g.m4406f(c1741c1.f5799i.invoke(c1765k12.m4417f().mo4002b()), c1741c1.f5799i.invoke(c1765k12.m4417f().mo4003c()), (InterfaceC1803y) c1741c1.f5798h.invoke(c1765k12.m4417f()));
        }
        return c1744d1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final C1753g1 m4376l(C1765k1 c1765k1, Object obj, Object obj2, InterfaceC1803y interfaceC1803y, C1771m1 c1771m1, C1836h0 c1836h0) {
        boolean zM4534f = c1836h0.m4534f(c1765k1);
        Object objM4514P = c1836h0.m4514P();
        Object obj3 = C1851l.f6155a;
        if (zM4534f || objM4514P == obj3) {
            AbstractC4655f abstractC4655fM9148e = AbstractC4666q.m9148e();
            InterfaceC1231l interfaceC1231lMo9095e = abstractC4655fM9148e != null ? abstractC4655fM9148e.mo9095e() : null;
            AbstractC4655f abstractC4655fM9151h = AbstractC4666q.m9151h(abstractC4655fM9148e);
            try {
                AbstractC1781q abstractC1781q = (AbstractC1781q) c1771m1.f5912a.invoke(obj2);
                abstractC1781q.mo4426d();
                Object c1753g1 = new C1753g1(c1765k1, obj, abstractC1781q, c1771m1);
                AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
                c1836h0.m4545k0(c1753g1);
                objM4514P = c1753g1;
            } catch (Throwable th2) {
                AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
                throw th2;
            }
        }
        C1753g1 c1753g12 = (C1753g1) objM4514P;
        m4367c(c1765k1, c1753g12, obj, obj2, interfaceC1803y, c1836h0, 0);
        boolean zM4534f2 = c1836h0.m4534f(c1765k1) | c1836h0.m4534f(c1753g12);
        Object objM4514P2 = c1836h0.m4514P();
        if (zM4534f2 || objM4514P2 == obj3) {
            objM4514P2 = new C0446i(c1765k1, 18, c1753g12);
            c1836h0.m4545k0(objM4514P2);
        }
        AbstractC1874r.m4621c(c1753g12, (InterfaceC1231l) objM4514P2, c1836h0);
        return c1753g12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final void m4377m(C1760j c1760j, long j3, float f3, InterfaceC1751g interfaceC1751g, C1766l c1766l, InterfaceC1231l interfaceC1231l) {
        long jMo4395b = f3 == 0.0f ? interfaceC1751g.mo4395b() : (long) ((j3 - c1760j.f5878c) / f3);
        c1760j.f5882g = j3;
        c1760j.f5880e.setValue(interfaceC1751g.mo4399f(jMo4395b));
        c1760j.f5881f = interfaceC1751g.mo4397d(jMo4395b);
        if (interfaceC1751g.m4398e(jMo4395b)) {
            c1760j.f5883h = c1760j.f5882g;
            c1760j.f5884i.setValue(Boolean.FALSE);
        }
        m4381q(c1760j, c1766l);
        interfaceC1231l.invoke(c1760j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final float m4378n(InterfaceC5561g interfaceC5561g) {
        InterfaceC5854p interfaceC5854p = (InterfaceC5854p) interfaceC5561g.mo2062s(C5840b.f23776v);
        float fMo2060i = interfaceC5854p != null ? interfaceC5854p.mo2060i() : 1.0f;
        if (fMo2060i >= 0.0f) {
            return fMo2060i;
        }
        AbstractC1776o0.m4430b("negative scale factor");
        return fMo2060i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static C1785r0 m4379o(float f3, float f10, Object obj, int i9) {
        if ((i9 & 1) != 0) {
            f3 = 1.0f;
        }
        if ((i9 & 2) != 0) {
            f10 = 1500.0f;
        }
        if ((i9 & 4) != 0) {
            obj = null;
        }
        return new C1785r0(f3, f10, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static C1768l1 m4380p(int i9, int i10, InterfaceC1796v interfaceC1796v) {
        int i11 = (i10 & 2) != 0 ? 0 : 90;
        if ((i10 & 4) != 0) {
            interfaceC1796v = AbstractC1801x.f6010a;
        }
        return new C1768l1(i9, i11, interfaceC1796v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final void m4381q(C1760j c1760j, C1766l c1766l) {
        c1766l.f5901h.setValue(c1760j.f5880e.getValue());
        AbstractC1781q abstractC1781q = c1766l.f5902i;
        AbstractC1781q abstractC1781q2 = c1760j.f5881f;
        int iMo4424b = abstractC1781q.mo4424b();
        for (int i9 = 0; i9 < iMo4424b; i9++) {
            abstractC1781q.mo4427e(i9, abstractC1781q2.mo4423a(i9));
        }
        c1766l.f5904k = c1760j.f5883h;
        c1766l.f5903j = c1760j.f5882g;
        c1766l.f5905l = ((Boolean) c1760j.f5884i.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final C1765k1 m4382r(Object obj, String str, C1836h0 c1836h0, int i9) {
        Object objM4514P = c1836h0.m4514P();
        C1823e c1823e = C1851l.f6155a;
        if (objM4514P == c1823e) {
            objM4514P = new C1765k1(new C0126e(obj), null, str);
            c1836h0.m4545k0(objM4514P);
        }
        C1765k1 c1765k1 = (C1765k1) objM4514P;
        c1765k1.m4412a(obj, c1836h0, (i9 & 8) | 48 | (i9 & 14));
        Object objM4514P2 = c1836h0.m4514P();
        if (objM4514P2 == c1823e) {
            objM4514P2 = new C0136d0(c1765k1, 17);
            c1836h0.m4545k0(objM4514P2);
        }
        AbstractC1874r.m4621c(c1765k1, (InterfaceC1231l) objM4514P2, c1836h0);
        return c1765k1;
    }
}
