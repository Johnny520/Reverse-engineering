package p265s;

import android.view.View;
import bi.C0321i;
import bsh.org.objectweb.asm.Opcodes;
import p010aa.C0035c;
import p015b0.C0144j;
import p015b0.C0147m;
import p015b0.C0151q;
import p015b0.C0152r;
import p023b8.C0205c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p099h.Hchat.R;
import p117i0.AbstractC1869p1;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.C1876r1;
import p117i0.InterfaceC1809a1;
import p119i2.C1954y;
import p131j0.C2046b;
import p136j8.C2095f;
import p144k.C2209s1;
import p174m.C2576b;
import p174m.C2581c;
import p174m.EnumC2640p1;
import p198nb.C2924a;
import p227p4.C3315t;
import p251r.C3621f;
import p251r.C3622g;
import p251r.C3625j;
import p251r.C3626k;
import p251r.C3627l;
import p251r.C3630o;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p276sf.C3967n;
import p307v0.AbstractC4368h;
import p307v0.AbstractC4371k;
import p307v0.C4364d;
import p307v0.InterfaceC4363c;
import p307v0.InterfaceC4366f;
import p308v1.AbstractC4434w;
import p308v1.AbstractC4441z0;
import p308v1.C4401j1;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4666q;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5891i0;

/* JADX INFO: renamed from: s.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3847o {

    /* JADX INFO: renamed from: a */
    public static final C3857t[] f12588a = new C3857t[0];

    /* JADX INFO: renamed from: b */
    public static final C0205c f12589b = new C0205c(10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m8014a(final InterfaceC1220a interfaceC1220a, final InterfaceC5853o interfaceC5853o, final C3844m0 c3844m0, final C3630o c3630o, C1836h0 c1836h0, final int i9) {
        c1836h0.m4527b0(1055276397);
        int i10 = (c1836h0.m4538h(interfaceC1220a) ? 4 : 2) | i9 | (c1836h0.m4534f(interfaceC5853o) ? 32 : 16) | (c1836h0.m4534f(c3844m0) ? Opcodes.ACC_NATIVE : 128) | (c1836h0.m4534f(c3630o) ? Opcodes.ACC_STRICT : 1024);
        if (c1836h0.m4516S(i10 & 1, (i10 & 1171) != 1170)) {
            final InterfaceC1809a1 interfaceC1809a1M4643y = AbstractC1874r.m4643y(interfaceC1220a, c1836h0);
            m8016c(AbstractC3879i.m8071e(-933153643, new InterfaceC1236q() { // from class: s.c0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1236q
                /* JADX INFO: renamed from: b */
                public final Object mo734b(Object obj, Object obj2, Object obj3) {
                    InterfaceC5853o interfaceC5853oMo10549d;
                    InterfaceC4363c interfaceC4363c = (InterfaceC4363c) obj;
                    C1836h0 c1836h02 = (C1836h0) obj2;
                    ((Integer) obj3).getClass();
                    Object objM4514P = c1836h02.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (objM4514P == c1823e) {
                        objM4514P = new C3816b0(interfaceC4363c, new C0144j(interfaceC1809a1M4643y, 12));
                        c1836h02.m4545k0(objM4514P);
                    }
                    final C3816b0 c3816b0 = (C3816b0) objM4514P;
                    Object objM4514P2 = c1836h02.m4514P();
                    if (objM4514P2 == c1823e) {
                        objM4514P2 = new C4401j1(new C3315t(c3816b0));
                        c1836h02.m4545k0(objM4514P2);
                    }
                    final C4401j1 c4401j1 = (C4401j1) objM4514P2;
                    final C3844m0 c3844m02 = c3844m0;
                    if (c3844m02 != null) {
                        c1836h02.m4525a0(1743490539);
                        c1836h02.m4525a0(887527095);
                        final InterfaceC3814a1 interfaceC3814a1 = AbstractC3820c1.f12529a;
                        if (interfaceC3814a1 != null) {
                            c1836h02.m4525a0(1345554384);
                        } else {
                            c1836h02.m4525a0(1345603457);
                            View view = (View) c1836h02.m4542j(AbstractC5891i0.f23950f);
                            boolean zM4534f = c1836h02.m4534f(view);
                            Object objM4514P3 = c1836h02.m4514P();
                            if (zM4534f || objM4514P3 == c1823e) {
                                Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                                objM4514P3 = tag instanceof InterfaceC3814a1 ? (InterfaceC3814a1) tag : null;
                                if (objM4514P3 == null) {
                                    objM4514P3 = new ViewOnAttachStateChangeListenerC3815b(view);
                                    view.setTag(R.id.compose_prefetch_scheduler, objM4514P3);
                                }
                                c1836h02.m4545k0(objM4514P3);
                            }
                            interfaceC3814a1 = (InterfaceC3814a1) objM4514P3;
                        }
                        c1836h02.m4553p(false);
                        c1836h02.m4553p(false);
                        Object[] objArr = {c3844m02, c3816b0, c4401j1, interfaceC3814a1};
                        boolean zM4534f2 = c1836h02.m4534f(c3844m02) | c1836h02.m4538h(c3816b0) | c1836h02.m4538h(c4401j1) | c1836h02.m4538h(interfaceC3814a1);
                        Object objM4514P4 = c1836h02.m4514P();
                        if (zM4534f2 || objM4514P4 == c1823e) {
                            objM4514P4 = new InterfaceC1231l() { // from class: s.e0
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1231l
                                public final Object invoke(Object obj4) {
                                    C2095f c2095f = new C2095f(c3816b0, c4401j1, interfaceC3814a1);
                                    C3844m0 c3844m03 = c3844m02;
                                    c3844m03.f12580c = c2095f;
                                    return new C0147m(c3844m03, 4);
                                }
                            };
                            c1836h02.m4545k0(objM4514P4);
                        }
                        AbstractC1874r.m4623e(objArr, (InterfaceC1231l) objM4514P4, c1836h02);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(1744076749);
                        c1836h02.m4553p(false);
                    }
                    int i11 = AbstractC3846n0.f12587a;
                    InterfaceC5853o interfaceC5853o2 = interfaceC5853o;
                    if (c3844m02 != null && (interfaceC5853oMo10549d = interfaceC5853o2.mo10549d(new C3829f1(c3844m02))) != null) {
                        interfaceC5853o2 = interfaceC5853oMo10549d;
                    }
                    boolean zM4534f3 = c1836h02.m4534f(c3816b0);
                    C3630o c3630o2 = c3630o;
                    boolean zM4534f4 = zM4534f3 | c1836h02.m4534f(c3630o2);
                    Object objM4514P5 = c1836h02.m4514P();
                    if (zM4534f4 || objM4514P5 == c1823e) {
                        objM4514P5 = new C0151q(c3816b0, 11, c3630o2);
                        c1836h02.m4545k0(objM4514P5);
                    }
                    AbstractC4434w.m8877a(c4401j1, interfaceC5853o2, (InterfaceC1235p) objM4514P5, c1836h02, 8);
                    return C3967n.f12976a;
                }
            }, c1836h0), c1836h0, 6);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new InterfaceC1235p(interfaceC5853o, c3844m0, c3630o, i9) { // from class: s.d0

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ InterfaceC5853o f12533h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ C3844m0 f12534i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ C3630o f12535j;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM4617C = AbstractC1874r.m4617C(1);
                    AbstractC3847o.m8014a(this.f12532g, this.f12533h, this.f12534i, this.f12535j, (C1836h0) obj, iM4617C);
                    return C3967n.f12976a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m8015b(Object obj, int i9, C3838j0 c3838j0, C3874d c3874d, C1836h0 c1836h0, int i10) {
        int i11;
        c1836h0.m4527b0(872548579);
        if ((i10 & 6) == 0) {
            i11 = (c1836h0.m4538h(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1836h0.m4530d(i9) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1836h0.m4538h(c3838j0) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1836h0.m4538h(c3874d) ? Opcodes.ACC_STRICT : 1024;
        }
        if (c1836h0.m4516S(i11 & 1, (i11 & 1171) != 1170)) {
            boolean zM4534f = c1836h0.m4534f(obj) | c1836h0.m4534f(c3838j0);
            Object objM4514P = c1836h0.m4514P();
            Object obj2 = C1851l.f6155a;
            if (zM4534f || objM4514P == obj2) {
                objM4514P = new C3834h0(obj, c3838j0);
                c1836h0.m4545k0(objM4514P);
            }
            C3834h0 c3834h0 = (C3834h0) objM4514P;
            c3834h0.f12557c = i9;
            C1845j1 c1845j1 = c3834h0.f12561g;
            AbstractC1869p1 abstractC1869p1 = AbstractC4441z0.f14750a;
            C3834h0 c3834h02 = (C3834h0) c1836h0.m4542j(abstractC1869p1);
            AbstractC4655f abstractC4655fM9148e = AbstractC4666q.m9148e();
            InterfaceC1231l interfaceC1231lMo9095e = abstractC4655fM9148e != null ? abstractC4655fM9148e.mo9095e() : null;
            AbstractC4655f abstractC4655fM9151h = AbstractC4666q.m9151h(abstractC4655fM9148e);
            try {
                if (c3834h02 != ((C3834h0) c1845j1.getValue())) {
                    c1845j1.setValue(c3834h02);
                    if (c3834h0.f12558d > 0) {
                        C3834h0 c3834h03 = c3834h0.f12559e;
                        if (c3834h03 != null) {
                            c3834h03.m8013b();
                        }
                        if (c3834h02 != null) {
                            c3834h02.m8012a();
                        } else {
                            c3834h02 = null;
                        }
                        c3834h0.f12559e = c3834h02;
                    }
                }
                AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
                boolean zM4534f2 = c1836h0.m4534f(c3834h0);
                Object objM4514P2 = c1836h0.m4514P();
                if (zM4534f2 || objM4514P2 == obj2) {
                    objM4514P2 = new C2924a(c3834h0, 7);
                    c1836h0.m4545k0(objM4514P2);
                }
                AbstractC1874r.m4621c(c3834h0, (InterfaceC1231l) objM4514P2, c1836h0);
                AbstractC1874r.m4619a(abstractC1869p1.mo4582a(c3834h0), c3874d, c1836h0, ((i11 >> 6) & 112) | 8);
            } catch (Throwable th2) {
                AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
                throw th2;
            }
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C3836i0(obj, i9, c3838j0, c3874d, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m8016c(C3874d c3874d, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(-709502251);
        if (c1836h0.m4516S(i9 & 1, (i9 & 3) != 2)) {
            AbstractC1869p1 abstractC1869p1 = AbstractC4368h.f14575a;
            Object obj = (InterfaceC4366f) c1836h0.m4542j(abstractC1869p1);
            c1836h0.m4525a0(1967007413);
            Object[] objArr = new Object[0];
            Object objM4514P = c1836h0.m4514P();
            Object obj2 = C1851l.f6155a;
            if (objM4514P == obj2) {
                objM4514P = new C2209s1(14);
                c1836h0.m4545k0(objM4514P);
            }
            C4364d c4364d = (C4364d) AbstractC4371k.m8807e(objArr, C4364d.f14567k, (InterfaceC1220a) objM4514P, c1836h0, 384);
            c4364d.f14570i = (InterfaceC4366f) c1836h0.m4542j(abstractC1869p1);
            c1836h0.m4553p(false);
            Object[] objArr2 = {obj};
            C3315t c3315t = new C3315t(new C1954y(15), 12, new C2576b(obj, 14, c4364d));
            boolean zM4538h = c1836h0.m4538h(obj) | c1836h0.m4538h(c4364d);
            Object objM4514P2 = c1836h0.m4514P();
            if (zM4538h || objM4514P2 == obj2) {
                objM4514P2 = new C0035c(obj, 28, c4364d);
                c1836h0.m4545k0(objM4514P2);
            }
            Object obj3 = (C3866x0) AbstractC4371k.m8807e(objArr2, c3315t, (InterfaceC1220a) objM4514P2, c1836h0, 0);
            AbstractC1874r.m4619a(abstractC1869p1.mo4582a(obj3), AbstractC3879i.m8071e(-412824043, new C0151q(c3874d, 12, obj3), c1836h0), c1836h0, 56);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0321i(c3874d, i9, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m8017d(C3626k c3626k, Object obj, int i9, Object obj2, C1836h0 c1836h0, int i10) {
        c1836h0.m4527b0(1439843069);
        int i11 = (c1836h0.m4534f(c3626k) ? 4 : 2) | i10 | (c1836h0.m4534f(obj) ? 32 : 16) | (c1836h0.m4530d(i9) ? Opcodes.ACC_NATIVE : 128) | (c1836h0.m4534f(obj2) ? Opcodes.ACC_STRICT : 1024);
        if (c1836h0.m4516S(i11 & 1, (i11 & 1171) != 1170)) {
            ((InterfaceC4363c) obj).mo8037b(obj2, AbstractC3879i.m8071e(980966366, new C3625j(i9, obj2, c3626k), c1836h0), c1836h0, 48);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0152r(c3626k, obj, i9, obj2, i10, 6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m8018e(int i9, C2046b c2046b) {
        int i10 = c2046b.f6893i - 1;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = ((i10 - i11) / 2) + i11;
            Object[] objArr = c2046b.f6891g;
            int i13 = ((C3835i) objArr[i12]).f12562a;
            if (i13 != i9) {
                if (i13 < i9) {
                    i11 = i12 + 1;
                    if (i9 < ((C3835i) objArr[i11]).f12562a) {
                    }
                } else {
                    i10 = i12 - 1;
                }
            }
            return i12;
        }
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final int m8019f(int i9, Object obj, C3626k c3626k) {
        int iM364o;
        return (obj == null || c3626k.m7607c() == 0 || (i9 < c3626k.m7607c() && obj.equals(c3626k.m7608d(i9))) || (iM364o = c3626k.f11694d.m364o(obj)) == -1) ? i9 : iM364o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC5853o m8020g(C3622g c3622g, C2581c c2581c, EnumC2640p1 enumC2640p1) {
        return new C3845n(c3622g, c2581c, enumC2640p1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC5853o m8021h(InterfaceC5853o interfaceC5853o, C3627l c3627l, C3621f c3621f, EnumC2640p1 enumC2640p1, boolean z9) {
        return interfaceC5853o.mo10549d(new C3856s0(c3627l, c3621f, enumC2640p1, z9));
    }
}
