package sh;

import bi.AbstractC0316d;
import bi.C0314b;
import bi.C0321i;
import bsh.org.objectweb.asm.Opcodes;
import ci.AbstractC0613y;
import java.util.List;
import p015b0.C0151q;
import p020b5.C0192k;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1873q1;
import p117i0.C1876r1;
import p174m.C2576b;
import p222p.AbstractC3208d;
import p222p.C3272z0;
import p222p.InterfaceC3252r1;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p276sf.C3967n;
import p293u2.AbstractC4232b;
import p293u2.C4231a;
import p293u2.EnumC4243m;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;
import p308v1.AbstractC4434w;
import p308v1.InterfaceC4404k1;
import p308v1.InterfaceC4409m0;
import p322w0.C4665p;
import p356y0.C5840b;
import p356y0.C5845g;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import tf.AbstractC4166m;
import tf.C4174u;

/* JADX INFO: renamed from: sh.p0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4037p0 {

    /* JADX INFO: renamed from: a */
    public static final float f13308a = 12;

    /* JADX INFO: renamed from: b */
    public static final float f13309b = 4;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m8235a(InterfaceC5853o interfaceC5853o, final C3874d c3874d, final InterfaceC1235p interfaceC1235p, InterfaceC1235p interfaceC1235p2, int i9, InterfaceC1235p interfaceC1235p3, int i10, InterfaceC1235p interfaceC1235p4, InterfaceC1235p interfaceC1235p5, long j3, final InterfaceC3252r1 interfaceC3252r1, final C3874d c3874d2, C1836h0 c1836h0, final int i11) {
        final InterfaceC5853o interfaceC5853o2;
        final InterfaceC1235p interfaceC1235p6;
        final int i12;
        final InterfaceC1235p interfaceC1235p7;
        final int i13;
        final InterfaceC1235p interfaceC1235p8;
        final InterfaceC1235p interfaceC1235p9;
        final long j4;
        long jM1242l;
        final int i14;
        final InterfaceC1235p interfaceC1235p10;
        final InterfaceC1235p interfaceC1235p11;
        final int i15;
        final InterfaceC1235p interfaceC1235p12;
        final InterfaceC1235p interfaceC1235p13;
        InterfaceC5853o interfaceC5853o3;
        c1836h0.m4527b0(-420946813);
        int i16 = i11 | 383478790;
        int i17 = (c1836h0.m4534f(interfaceC3252r1) ? (char) 4 : (char) 2) | '0';
        if (c1836h0.m4516S(i16 & 1, ((306783379 & i16) == 306783378 && (i17 & 19) == 18) ? false : true)) {
            c1836h0.m4521X();
            if ((i11 & 1) == 0 || c1836h0.m4500B()) {
                jM1242l = ((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).m1242l();
                C5850l c5850l = C5850l.f23787a;
                i14 = 2;
                interfaceC1235p10 = AbstractC4045s.f13366a;
                interfaceC1235p11 = AbstractC4045s.f13367b;
                i15 = 7;
                interfaceC1235p12 = AbstractC4045s.f13368c;
                interfaceC1235p13 = AbstractC4045s.f13369d;
                interfaceC5853o3 = c5850l;
            } else {
                c1836h0.m4519V();
                interfaceC5853o3 = interfaceC5853o;
                interfaceC1235p10 = interfaceC1235p2;
                i14 = i9;
                interfaceC1235p11 = interfaceC1235p3;
                i15 = i10;
                interfaceC1235p12 = interfaceC1235p4;
                interfaceC1235p13 = interfaceC1235p5;
                jM1242l = j3;
            }
            c1836h0.m4554q();
            int i18 = (i17 & 14) ^ 6;
            boolean z9 = (i18 > 4 && c1836h0.m4534f(interfaceC3252r1)) || (i17 & 6) == 4;
            Object objM4514P = c1836h0.m4514P();
            Object obj = C1851l.f6155a;
            if (z9 || objM4514P == obj) {
                objM4514P = new C4003e0(interfaceC3252r1);
                c1836h0.m4545k0(objM4514P);
            }
            final C4003e0 c4003e0 = (C4003e0) objM4514P;
            Object objM4514P2 = c1836h0.m4514P();
            if (objM4514P2 == obj) {
                objM4514P2 = new C4665p();
                c1836h0.m4545k0(objM4514P2);
            }
            final C4665p c4665p = (C4665p) objM4514P2;
            Object objM4514P3 = c1836h0.m4514P();
            if (objM4514P3 == obj) {
                objM4514P3 = new C4665p();
                c1836h0.m4545k0(objM4514P3);
            }
            final C4665p c4665p2 = (C4665p) objM4514P3;
            List list = (List) c1836h0.m4542j(AbstractC0613y.f1925c);
            final List list2 = list == null ? c4665p2 : list;
            List list3 = (List) c1836h0.m4542j(AbstractC0613y.f1926d);
            final List list4 = list3 == null ? c4665p : list3;
            boolean zM4534f = c1836h0.m4534f(c4003e0) | ((i18 > 4 && c1836h0.m4534f(interfaceC3252r1)) || (i17 & 6) == 4);
            Object objM4514P4 = c1836h0.m4514P();
            if (zM4534f || objM4514P4 == obj) {
                objM4514P4 = new C2576b(c4003e0, 15, interfaceC3252r1);
                c1836h0.m4545k0(objM4514P4);
            }
            long j5 = jM1242l;
            AbstractC4045s.m8248l(AbstractC3208d.m6880j(interfaceC5853o3, (InterfaceC1231l) objM4514P4), null, j5, 0L, 0.0f, AbstractC3879i.m8071e(388464071, new InterfaceC1235p() { // from class: sh.m0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj2, Object obj3) {
                    C1836h0 c1836h02 = (C1836h0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (c1836h02.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                        AbstractC1874r.m4620b(new C1873q1[]{AbstractC0613y.f1923a.mo4582a(c4665p), AbstractC0613y.f1924b.mo4582a(c4665p2), AbstractC0613y.f1925c.mo4582a(list2), AbstractC0613y.f1926d.mo4582a(list4)}, AbstractC3879i.m8071e(-1647484281, new C4022k0(c3874d, interfaceC1235p12, interfaceC1235p, interfaceC1235p10, i14, interfaceC1235p11, i15, interfaceC1235p13, c4003e0, c3874d2), c1836h02), c1836h02, 56);
                    } else {
                        c1836h02.m4519V();
                    }
                    return C3967n.f12976a;
                }
            }, c1836h0), c1836h0, 1572864);
            interfaceC5853o2 = interfaceC5853o3;
            interfaceC1235p8 = interfaceC1235p12;
            interfaceC1235p6 = interfaceC1235p10;
            i12 = i14;
            interfaceC1235p7 = interfaceC1235p11;
            i13 = i15;
            interfaceC1235p9 = interfaceC1235p13;
            j4 = j5;
        } else {
            c1836h0.m4519V();
            interfaceC5853o2 = interfaceC5853o;
            interfaceC1235p6 = interfaceC1235p2;
            i12 = i9;
            interfaceC1235p7 = interfaceC1235p3;
            i13 = i10;
            interfaceC1235p8 = interfaceC1235p4;
            interfaceC1235p9 = interfaceC1235p5;
            j4 = j3;
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new InterfaceC1235p(c3874d, interfaceC1235p, interfaceC1235p6, i12, interfaceC1235p7, i13, interfaceC1235p8, interfaceC1235p9, j4, interfaceC3252r1, c3874d2, i11) { // from class: sh.n0

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C3874d f13276h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ InterfaceC1235p f13277i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ InterfaceC1235p f13278j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ int f13279k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ InterfaceC1235p f13280l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ int f13281m;

                /* JADX INFO: renamed from: n */
                public final /* synthetic */ InterfaceC1235p f13282n;

                /* JADX INFO: renamed from: o */
                public final /* synthetic */ InterfaceC1235p f13283o;

                /* JADX INFO: renamed from: p */
                public final /* synthetic */ long f13284p;

                /* JADX INFO: renamed from: q */
                public final /* synthetic */ InterfaceC3252r1 f13285q;

                /* JADX INFO: renamed from: r */
                public final /* synthetic */ C3874d f13286r;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM4617C = AbstractC1874r.m4617C(433);
                    AbstractC4037p0.m8235a(this.f13275g, this.f13276h, this.f13277i, this.f13278j, this.f13279k, this.f13280l, this.f13281m, this.f13282n, this.f13283o, this.f13284p, this.f13285q, this.f13286r, (C1836h0) obj2, iM4617C);
                    return C3967n.f12976a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m8236b(C3874d c3874d, InterfaceC1235p interfaceC1235p, InterfaceC1235p interfaceC1235p2, InterfaceC1235p interfaceC1235p3, final int i9, InterfaceC1235p interfaceC1235p4, final int i10, InterfaceC1235p interfaceC1235p5, final InterfaceC3252r1 interfaceC3252r1, C3874d c3874d2, C1836h0 c1836h0, int i11) {
        boolean z9;
        c1836h0.m4527b0(794821603);
        int i12 = i11 | (c1836h0.m4538h(c3874d) ? 4 : 2) | (c1836h0.m4538h(interfaceC1235p) ? 32 : 16) | (c1836h0.m4538h(interfaceC1235p2) ? Opcodes.ACC_NATIVE : 128) | (c1836h0.m4538h(interfaceC1235p3) ? Opcodes.ACC_STRICT : 1024) | (c1836h0.m4530d(i9) ? 16384 : 8192) | (c1836h0.m4538h(interfaceC1235p4) ? Opcodes.ACC_DEPRECATED : 65536) | (c1836h0.m4530d(i10) ? 1048576 : 524288) | (c1836h0.m4538h(interfaceC1235p5) ? 8388608 : 4194304) | (c1836h0.m4534f(interfaceC3252r1) ? 67108864 : 33554432) | (c1836h0.m4538h(c3874d2) ? 536870912 : 268435456);
        if (c1836h0.m4516S(i12 & 1, (i12 & 306783379) != 306783378)) {
            Object objM4514P = c1836h0.m4514P();
            Object obj = C1851l.f6155a;
            if (objM4514P == obj) {
                objM4514P = new C4034o0();
                c1836h0.m4545k0(objM4514P);
            }
            final C4034o0 c4034o0 = (C4034o0) objM4514P;
            boolean z10 = (i12 & 29360128) == 8388608;
            Object objM4514P2 = c1836h0.m4514P();
            if (z10 || objM4514P2 == obj) {
                objM4514P2 = new C3874d(-798983350, new C4016i0(1, interfaceC1235p5), true);
                c1836h0.m4545k0(objM4514P2);
            }
            final InterfaceC1235p interfaceC1235p6 = (InterfaceC1235p) objM4514P2;
            boolean z11 = (i12 & 14) == 4;
            Object objM4514P3 = c1836h0.m4514P();
            if (z11 || objM4514P3 == obj) {
                objM4514P3 = new C3874d(-1509973434, new C0321i(c3874d, 3), true);
                c1836h0.m4545k0(objM4514P3);
            }
            final InterfaceC1235p interfaceC1235p7 = (InterfaceC1235p) objM4514P3;
            boolean z12 = (i12 & 112) == 32;
            Object objM4514P4 = c1836h0.m4514P();
            if (z12 || objM4514P4 == obj) {
                objM4514P4 = new C3874d(-636394913, new C4016i0(2, interfaceC1235p), true);
                c1836h0.m4545k0(objM4514P4);
            }
            final InterfaceC1235p interfaceC1235p8 = (InterfaceC1235p) objM4514P4;
            boolean z13 = (i12 & 7168) == 2048;
            Object objM4514P5 = c1836h0.m4514P();
            if (z13 || objM4514P5 == obj) {
                objM4514P5 = new C3874d(-987087274, new C4016i0(3, interfaceC1235p3), true);
                c1836h0.m4545k0(objM4514P5);
            }
            final InterfaceC1235p interfaceC1235p9 = (InterfaceC1235p) objM4514P5;
            boolean z14 = (458752 & i12) == 131072;
            Object objM4514P6 = c1836h0.m4514P();
            if (z14 || objM4514P6 == obj) {
                objM4514P6 = new C3874d(-1570830911, new C4016i0(4, interfaceC1235p4), true);
                c1836h0.m4545k0(objM4514P6);
            }
            final InterfaceC1235p interfaceC1235p10 = (InterfaceC1235p) objM4514P6;
            boolean z15 = (1879048192 & i12) == 536870912;
            Object objM4514P7 = c1836h0.m4514P();
            if (z15 || objM4514P7 == obj) {
                objM4514P7 = new C3874d(1864807395, new C0151q(c3874d2, 14, c4034o0), true);
                c1836h0.m4545k0(objM4514P7);
            }
            final InterfaceC1235p interfaceC1235p11 = (InterfaceC1235p) objM4514P7;
            boolean z16 = (i12 & 896) == 256;
            Object objM4514P8 = c1836h0.m4514P();
            if (z16 || objM4514P8 == obj) {
                z9 = true;
                Object c3874d3 = new C3874d(-1195340018, new C4016i0(0, interfaceC1235p2), true);
                c1836h0.m4545k0(c3874d3);
                objM4514P8 = c3874d3;
            } else {
                z9 = true;
            }
            final InterfaceC1235p interfaceC1235p12 = (InterfaceC1235p) objM4514P8;
            boolean zM4534f = ((57344 & i12) == 16384) | ((234881024 & i12) == 67108864 ? z9 : false) | c1836h0.m4534f(interfaceC1235p6) | c1836h0.m4534f(interfaceC1235p7) | c1836h0.m4534f(interfaceC1235p8) | c1836h0.m4534f(interfaceC1235p9) | c1836h0.m4534f(interfaceC1235p12) | c1836h0.m4534f(interfaceC1235p10) | c1836h0.m4534f(interfaceC1235p11) | ((i12 & 3670016) == 1048576);
            Object objM4514P9 = c1836h0.m4514P();
            if (zM4534f || objM4514P9 == obj) {
                Object obj2 = new InterfaceC1235p() { // from class: sh.j0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1235p
                    public final Object invoke(Object obj3, Object obj4) {
                        int i13;
                        int iMo1590G0;
                        int iMo1590G02;
                        int i14;
                        C0192k c0192k;
                        AbstractC4377b1 abstractC4377b1;
                        boolean z17;
                        final Integer numValueOf;
                        int i15;
                        int iIntValue;
                        int iMo1590G03;
                        int iMo6855b;
                        final InterfaceC4404k1 interfaceC4404k1 = (InterfaceC4404k1) obj3;
                        C4231a c4231a = (C4231a) obj4;
                        float f3 = AbstractC4037p0.f13308a;
                        interfaceC4404k1.getClass();
                        final int iM8504h = C4231a.m8504h(c4231a.f13903a);
                        int iM8503g = C4231a.m8503g(c4231a.f13903a);
                        long jM8497a = C4231a.m8497a(c4231a.f13903a, 0, 0, 0, 0, 10);
                        final InterfaceC3252r1 interfaceC3252r12 = interfaceC3252r1;
                        final int iMo6857d = interfaceC3252r12.mo6857d(interfaceC4404k1);
                        final int iMo6856c = interfaceC3252r12.mo6856c(interfaceC4404k1, interfaceC4404k1.getLayoutDirection());
                        final int iMo6854a = interfaceC3252r12.mo6854a(interfaceC4404k1, interfaceC4404k1.getLayoutDirection());
                        final int iMo6855b2 = interfaceC3252r12.mo6855b(interfaceC4404k1);
                        final AbstractC4377b1 abstractC4377b1Mo8831Q = ((InterfaceC4409m0) AbstractC4166m.m8422t1(interfaceC4404k1.mo8808N(interfaceC1235p6, EnumC4040q0.f13332l))).mo8831Q(jM8497a);
                        final AbstractC4377b1 abstractC4377b1Mo8831Q2 = ((InterfaceC4409m0) AbstractC4166m.m8422t1(interfaceC4404k1.mo8808N(interfaceC1235p7, EnumC4040q0.f13327g))).mo8831Q(jM8497a);
                        int i16 = (-iMo6856c) - iMo6854a;
                        int i17 = -iMo6855b2;
                        final AbstractC4377b1 abstractC4377b1Mo8831Q3 = ((InterfaceC4409m0) AbstractC4166m.m8422t1(interfaceC4404k1.mo8808N(interfaceC1235p8, EnumC4040q0.f13329i))).mo8831Q(AbstractC4232b.m8516i(i16, i17, jM8497a));
                        AbstractC4377b1 abstractC4377b1Mo8831Q4 = ((InterfaceC4409m0) AbstractC4166m.m8422t1(interfaceC4404k1.mo8808N(interfaceC1235p9, EnumC4040q0.f13331k))).mo8831Q(AbstractC4232b.m8516i(i16, i17, jM8497a));
                        int i18 = abstractC4377b1Mo8831Q4.f14593g;
                        EnumC4243m enumC4243m = EnumC4243m.f13919g;
                        int i19 = i9;
                        if (i18 == 0 && abstractC4377b1Mo8831Q4.f14594h == 0) {
                            i13 = iM8503g;
                            abstractC4377b1 = abstractC4377b1Mo8831Q4;
                            c0192k = null;
                        } else {
                            int i20 = abstractC4377b1Mo8831Q4.f14594h;
                            if (i19 == 0) {
                                i13 = iM8503g;
                                if (interfaceC4404k1.getLayoutDirection() == enumC4243m) {
                                    iMo1590G0 = interfaceC4404k1.mo1590G0(f3);
                                    i14 = iMo1590G0 + iMo6856c;
                                } else {
                                    iMo1590G02 = interfaceC4404k1.mo1590G0(f3);
                                    i14 = ((iM8504h - iMo1590G02) - i18) - iMo6854a;
                                }
                            } else {
                                i13 = iM8503g;
                                if (i19 != 2 && i19 != 3) {
                                    i14 = (((iM8504h - i18) + iMo6856c) - iMo6854a) / 2;
                                } else if (interfaceC4404k1.getLayoutDirection() == enumC4243m) {
                                    iMo1590G02 = interfaceC4404k1.mo1590G0(f3);
                                    i14 = ((iM8504h - iMo1590G02) - i18) - iMo6854a;
                                } else {
                                    iMo1590G0 = interfaceC4404k1.mo1590G0(f3);
                                    i14 = iMo1590G0 + iMo6856c;
                                }
                            }
                            abstractC4377b1 = abstractC4377b1Mo8831Q4;
                            c0192k = new C0192k(i14, i20, 4);
                        }
                        final AbstractC4377b1 abstractC4377b1Mo8831Q5 = ((InterfaceC4409m0) AbstractC4166m.m8422t1(interfaceC4404k1.mo8808N(interfaceC1235p12, EnumC4040q0.f13328h))).mo8831Q(jM8497a);
                        boolean z18 = abstractC4377b1Mo8831Q5.f14593g == 0 && abstractC4377b1Mo8831Q5.f14594h == 0;
                        if (c0192k != null) {
                            int i21 = c0192k.f489c;
                            z17 = z18;
                            if (z18 || i19 == 3) {
                                iMo1590G03 = interfaceC4404k1.mo1590G0(f3) + i21;
                                iMo6855b = interfaceC3252r12.mo6855b(interfaceC4404k1);
                            } else {
                                iMo1590G03 = abstractC4377b1Mo8831Q5.f14594h + i21;
                                iMo6855b = interfaceC4404k1.mo1590G0(f3);
                            }
                            numValueOf = Integer.valueOf(iMo6855b + iMo1590G03);
                        } else {
                            z17 = z18;
                            numValueOf = null;
                        }
                        int i22 = abstractC4377b1Mo8831Q3.f14594h;
                        if (i22 != 0) {
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            } else {
                                Integer numValueOf2 = z17 ? null : Integer.valueOf(abstractC4377b1Mo8831Q5.f14594h);
                                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : interfaceC3252r12.mo6855b(interfaceC4404k1);
                            }
                            i15 = i22 + iIntValue;
                        } else {
                            i15 = 0;
                        }
                        final AbstractC4377b1 abstractC4377b1Mo8831Q6 = ((InterfaceC4409m0) AbstractC4166m.m8422t1(interfaceC4404k1.mo8808N(interfaceC1235p10, EnumC4040q0.f13330j))).mo8831Q(AbstractC4232b.m8516i(i16, i17, jM8497a));
                        final boolean z19 = abstractC4377b1Mo8831Q6.f14593g == 0 && abstractC4377b1Mo8831Q6.f14594h == 0;
                        float fMo1599i0 = (abstractC4377b1Mo8831Q2.f14593g == 0 && abstractC4377b1Mo8831Q2.f14594h == 0) ? interfaceC4404k1.mo1599i0(interfaceC3252r12.mo6857d(interfaceC4404k1)) : interfaceC4404k1.mo1599i0(abstractC4377b1Mo8831Q2.f14594h);
                        float fMo1599i02 = z17 ? interfaceC4404k1.mo1599i0(interfaceC3252r12.mo6855b(interfaceC4404k1)) : interfaceC4404k1.mo1599i0(abstractC4377b1Mo8831Q5.f14594h);
                        EnumC4243m layoutDirection = interfaceC4404k1.getLayoutDirection();
                        float fMo1599i03 = layoutDirection == enumC4243m ? interfaceC4404k1.mo1599i0(interfaceC3252r12.mo6856c(interfaceC4404k1, layoutDirection)) : interfaceC4404k1.mo1599i0(interfaceC3252r12.mo6854a(interfaceC4404k1, layoutDirection));
                        final int i23 = i15;
                        EnumC4243m layoutDirection2 = interfaceC4404k1.getLayoutDirection();
                        C3272z0 c3272z0 = new C3272z0(fMo1599i03, fMo1599i0, layoutDirection2 == enumC4243m ? interfaceC4404k1.mo1599i0(interfaceC3252r12.mo6854a(interfaceC4404k1, layoutDirection2)) : interfaceC4404k1.mo1599i0(interfaceC3252r12.mo6856c(interfaceC4404k1, layoutDirection2)), fMo1599i02);
                        C4034o0 c4034o02 = c4034o0;
                        c4034o02.getClass();
                        c4034o02.f13298a.setValue(c3272z0);
                        final AbstractC4377b1 abstractC4377b1Mo8831Q7 = ((InterfaceC4409m0) AbstractC4166m.m8422t1(interfaceC4404k1.mo8808N(interfaceC1235p11, EnumC4040q0.f13333m))).mo8831Q(jM8497a);
                        final int i24 = i10;
                        final int i25 = i13;
                        final AbstractC4377b1 abstractC4377b12 = abstractC4377b1;
                        final C0192k c0192k2 = c0192k;
                        return interfaceC4404k1.mo8010z(iM8504h, i25, C4174u.f13711g, new InterfaceC1231l() { // from class: sh.l0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj5) {
                                float f10;
                                int i26;
                                AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj5;
                                abstractC4374a1.getClass();
                                abstractC4374a1.m8816A(abstractC4377b1Mo8831Q7, 0, 0, 0.0f);
                                AbstractC4377b1 abstractC4377b13 = abstractC4377b1Mo8831Q2;
                                abstractC4374a1.m8816A(abstractC4377b13, 0, 0, 0.0f);
                                AbstractC4377b1 abstractC4377b14 = abstractC4377b1Mo8831Q3;
                                int i27 = abstractC4377b14.f14593g;
                                int i28 = iM8504h;
                                InterfaceC4404k1 interfaceC4404k12 = interfaceC4404k1;
                                EnumC4243m layoutDirection3 = interfaceC4404k12.getLayoutDirection();
                                InterfaceC3252r1 interfaceC3252r13 = interfaceC3252r12;
                                int iMo6856c2 = ((interfaceC3252r13.mo6856c(interfaceC4404k12, layoutDirection3) + (i28 - i27)) - interfaceC3252r13.mo6854a(interfaceC4404k12, interfaceC4404k12.getLayoutDirection())) / 2;
                                int i29 = i25;
                                abstractC4374a1.m8816A(abstractC4377b14, iMo6856c2, i29 - i23, 0.0f);
                                AbstractC4377b1 abstractC4377b15 = abstractC4377b1Mo8831Q5;
                                abstractC4374a1.m8816A(abstractC4377b15, 0, i29 - abstractC4377b15.f14594h, 0.0f);
                                if (z19) {
                                    f10 = 0.0f;
                                    i26 = i29;
                                } else {
                                    AbstractC4377b1 abstractC4377b16 = abstractC4377b1Mo8831Q6;
                                    int i30 = abstractC4377b16.f14593g;
                                    int i31 = abstractC4377b16.f14594h;
                                    C5845g c5845g = C5840b.f23768n;
                                    int i32 = i24;
                                    if (i32 == 0) {
                                        c5845g = C5840b.f23761g;
                                    } else if (i32 == 1) {
                                        c5845g = C5840b.f23764j;
                                    } else if (i32 == 2) {
                                        c5845g = C5840b.f23767m;
                                    } else if (i32 == 3) {
                                        c5845g = C5840b.f23763i;
                                    } else if (i32 == 4) {
                                        c5845g = C5840b.f23766l;
                                    } else if (i32 == 5) {
                                        c5845g = C5840b.f23769o;
                                    } else if (i32 == 6) {
                                        c5845g = C5840b.f23762h;
                                    }
                                    C5845g c5845g2 = c5845g;
                                    int i33 = iMo6856c;
                                    int i34 = (i28 - i33) - iMo6854a;
                                    int i35 = i29 - abstractC4377b13.f14594h;
                                    int i36 = iMo6857d;
                                    i26 = i29;
                                    long jMo10544a = c5845g2.mo10544a((((long) i30) << 32) | (((long) i31) & 4294967295L), (((long) i34) << 32) | (((long) ((i35 - i36) - iMo6855b2)) & 4294967295L), interfaceC4404k12.getLayoutDirection());
                                    f10 = 0.0f;
                                    abstractC4374a1.m8816A(abstractC4377b16, i33 + ((int) (jMo10544a >> 32)), ((abstractC4377b13.f14594h + i36) + ((int) (jMo10544a & 4294967295L))) - abstractC4374a1.mo1590G0(AbstractC4037p0.f13309b), 0.0f);
                                }
                                C0192k c0192k3 = c0192k2;
                                if (c0192k3 != null) {
                                    int i37 = c0192k3.f488b;
                                    Integer num = numValueOf;
                                    num.getClass();
                                    abstractC4374a1.m8816A(abstractC4377b12, i37, i26 - num.intValue(), f10);
                                }
                                abstractC4374a1.m8816A(abstractC4377b1Mo8831Q, 0, 0, f10);
                                return C3967n.f12976a;
                            }
                        });
                    }
                };
                c1836h0.m4545k0(obj2);
                objM4514P9 = obj2;
            }
            AbstractC4434w.m8878b(null, (InterfaceC1235p) objM4514P9, c1836h0, 0);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C4022k0(c3874d, interfaceC1235p, interfaceC1235p2, interfaceC1235p3, i9, interfaceC1235p4, i10, interfaceC1235p5, interfaceC3252r1, c3874d2, i11);
        }
    }
}
