package p332wb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p000a.AbstractC0000a;
import p015b0.C0144j;
import p015b0.C0146l;
import p015b0.C0160z;
import p025bc.AbstractC0255e;
import p036c9.C0414a;
import p036c9.C0454k;
import p036c9.C0467n0;
import p036c9.C0482r0;
import p036c9.C0506z0;
import p063e9.C0832c;
import p065eb.C0884o;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p243q9.C3471g;
import p249qg.InterfaceC3599t;
import p251r.C3619d;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p317vb.InterfaceC4544a;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.C4060x;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.e1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4833e1 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16741g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f16742h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f16743i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f16744j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f16745k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f16746l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f16747m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4833e1(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15) {
        this.f16741g = 11;
        this.f16744j = context;
        this.f16742h = interfaceC1809a1;
        this.f16746l = interfaceC1809a12;
        this.f16747m = interfaceC1809a13;
        this.f16743i = interfaceC1809a14;
        this.f16745k = interfaceC1809a15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9;
        Object c0454k;
        C1823e c1823e;
        switch (this.f16741g) {
            case 0:
                InterfaceC4544a interfaceC4544a = (InterfaceC4544a) this.f16743i;
                Context context = (Context) this.f16744j;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f16745k;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f16742h;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f16746l;
                final InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f16747m;
                final AbstractC4702a1 abstractC4702a1 = (AbstractC4702a1) obj;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                C4933h2 c4933h2 = C4933h2.f17518a;
                abstractC4702a1.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? c1836h0.m4534f(abstractC4702a1) : c1836h0.m4538h(abstractC4702a1) ? 4 : 2;
                }
                int i10 = iIntValue;
                if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
                    boolean zEquals = abstractC4702a1.equals(C5489y0.f22055a);
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zEquals) {
                        c1836h0.m4525a0(-348914874);
                        String strMo4984b = interfaceC4544a.mo4984b();
                        boolean zBooleanValue = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
                        List list = (List) interfaceC1809a12.getValue();
                        boolean zM4538h = c1836h0.m4538h(context);
                        Object objM4514P = c1836h0.m4514P();
                        if (zM4538h || objM4514P == c1823e2) {
                            objM4514P = new C5227q1(context, interfaceC1809a1, 0);
                            c1836h0.m4545k0(objM4514P);
                        }
                        InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P;
                        Object objM4514P2 = c1836h0.m4514P();
                        if (objM4514P2 == c1823e2) {
                            objM4514P2 = new C0144j(interfaceC1809a13, 19);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P2;
                        Object objM4514P3 = c1836h0.m4514P();
                        if (objM4514P3 == c1823e2) {
                            objM4514P3 = new C0146l(interfaceC1809a13, 19);
                            c1836h0.m4545k0(objM4514P3);
                        }
                        c4933h2.m9283c(strMo4984b, zBooleanValue, list, interfaceC1231l, interfaceC1220a, interfaceC1220a2, (InterfaceC1231l) objM4514P3, c1836h0, 14352384);
                        c1836h0.m4553p(false);
                    } else if (abstractC4702a1 instanceof C5457x0) {
                        c1836h0.m4525a0(-348889515);
                        C5457x0 c5457x0 = (C5457x0) abstractC4702a1;
                        C0414a c0414a = c5457x0.f21842a;
                        List list2 = (List) interfaceC1809a12.getValue();
                        boolean z9 = c5457x0.f21843b;
                        Object objM4514P4 = c1836h0.m4514P();
                        if (objM4514P4 == c1823e2) {
                            objM4514P4 = new C0144j(interfaceC1809a13, 20);
                            c1836h0.m4545k0(objM4514P4);
                        }
                        InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P4;
                        int i11 = i10 & 14;
                        boolean z10 = i11 == 4 || ((i10 & 8) != 0 && c1836h0.m4538h(abstractC4702a1));
                        Object objM4514P5 = c1836h0.m4514P();
                        if (z10 || objM4514P5 == c1823e2) {
                            final int i12 = 3;
                            objM4514P5 = new InterfaceC1231l() { // from class: wb.b1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1231l
                                public final Object invoke(Object obj4) {
                                    switch (i12) {
                                        case 0:
                                            C0414a c0414a2 = (C0414a) obj4;
                                            c0414a2.getClass();
                                            interfaceC1809a13.setValue(new C5424w0(c0414a2, ((C5457x0) abstractC4702a1).f21843b));
                                            break;
                                        case 1:
                                            List list3 = (List) obj4;
                                            list3.getClass();
                                            C5424w0 c5424w0 = (C5424w0) abstractC4702a1;
                                            interfaceC1809a13.setValue(new C5457x0(C0414a.m1401a(c5424w0.f21568a, null, null, null, 0, list3, null, false, null, false, false, false, 4079), c5424w0.f21569b));
                                            break;
                                        case 2:
                                            C5521z0 c5521z0 = (C5521z0) abstractC4702a1;
                                            interfaceC1809a13.setValue(new C5457x0(C0414a.m1401a(c5521z0.f22309a, null, null, (String) obj4, 0, null, null, false, null, false, false, false, 4091), c5521z0.f22310b));
                                            break;
                                        default:
                                            C0414a c0414a3 = (C0414a) obj4;
                                            c0414a3.getClass();
                                            interfaceC1809a13.setValue(new C5521z0(c0414a3, ((C5457x0) abstractC4702a1).f21843b));
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h0.m4545k0(objM4514P5);
                        }
                        InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) objM4514P5;
                        boolean z11 = i11 == 4 || ((i10 & 8) != 0 && c1836h0.m4538h(abstractC4702a1));
                        Object objM4514P6 = c1836h0.m4514P();
                        if (z11 || objM4514P6 == c1823e2) {
                            final int i13 = 0;
                            objM4514P6 = new InterfaceC1231l() { // from class: wb.b1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1231l
                                public final Object invoke(Object obj4) {
                                    switch (i13) {
                                        case 0:
                                            C0414a c0414a2 = (C0414a) obj4;
                                            c0414a2.getClass();
                                            interfaceC1809a13.setValue(new C5424w0(c0414a2, ((C5457x0) abstractC4702a1).f21843b));
                                            break;
                                        case 1:
                                            List list3 = (List) obj4;
                                            list3.getClass();
                                            C5424w0 c5424w0 = (C5424w0) abstractC4702a1;
                                            interfaceC1809a13.setValue(new C5457x0(C0414a.m1401a(c5424w0.f21568a, null, null, null, 0, list3, null, false, null, false, false, false, 4079), c5424w0.f21569b));
                                            break;
                                        case 2:
                                            C5521z0 c5521z0 = (C5521z0) abstractC4702a1;
                                            interfaceC1809a13.setValue(new C5457x0(C0414a.m1401a(c5521z0.f22309a, null, null, (String) obj4, 0, null, null, false, null, false, false, false, 4091), c5521z0.f22310b));
                                            break;
                                        default:
                                            C0414a c0414a3 = (C0414a) obj4;
                                            c0414a3.getClass();
                                            interfaceC1809a13.setValue(new C5521z0(c0414a3, ((C5457x0) abstractC4702a1).f21843b));
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h0.m4545k0(objM4514P6);
                        }
                        InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) objM4514P6;
                        boolean zM4538h2 = (i11 == 4 || ((i10 & 8) != 0 && c1836h0.m4538h(abstractC4702a1))) | c1836h0.m4538h(context);
                        Object objM4514P7 = c1836h0.m4514P();
                        if (zM4538h2 || objM4514P7 == c1823e2) {
                            i9 = i11;
                            c1823e = c1823e2;
                            c0454k = new C0454k(abstractC4702a1, context, interfaceC1809a12, interfaceC1809a13, 13);
                            abstractC4702a1 = abstractC4702a1;
                            context = context;
                            c1836h0.m4545k0(c0454k);
                        } else {
                            i9 = i11;
                            c0454k = objM4514P7;
                            c1823e = c1823e2;
                        }
                        InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) c0454k;
                        boolean zM4538h3 = (i9 == 4 || ((i10 & 8) != 0 && c1836h0.m4538h(abstractC4702a1))) | c1836h0.m4538h(context);
                        Object objM4514P8 = c1836h0.m4514P();
                        if (zM4538h3 || objM4514P8 == c1823e) {
                            objM4514P8 = new C0467n0(context, abstractC4702a1, interfaceC1809a12, interfaceC1809a13, 9);
                            c1836h0.m4545k0(objM4514P8);
                        }
                        c4933h2.m9282b(context, c0414a, list2, z9, interfaceC1220a3, interfaceC1231l2, interfaceC1231l3, interfaceC1231l4, (InterfaceC1220a) objM4514P8, c1836h0, 805330944);
                        c1836h0.m4553p(false);
                    } else if (abstractC4702a1 instanceof C5424w0) {
                        c1836h0.m4525a0(-348851956);
                        C0414a c0414a2 = ((C5424w0) abstractC4702a1).f21568a;
                        List list3 = (List) interfaceC1809a12.getValue();
                        int i14 = i10 & 14;
                        boolean z12 = i14 == 4 || ((i10 & 8) != 0 && c1836h0.m4538h(abstractC4702a1));
                        Object objM4514P9 = c1836h0.m4514P();
                        if (z12 || objM4514P9 == c1823e2) {
                            final int i15 = 0;
                            objM4514P9 = new InterfaceC1220a() { // from class: wb.c1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1220a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            C5424w0 c5424w0 = (C5424w0) abstractC4702a1;
                                            interfaceC1809a13.setValue(new C5457x0(c5424w0.f21568a, c5424w0.f21569b));
                                            break;
                                        default:
                                            C5521z0 c5521z0 = (C5521z0) abstractC4702a1;
                                            interfaceC1809a13.setValue(new C5457x0(c5521z0.f22309a, c5521z0.f22310b));
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h0.m4545k0(objM4514P9);
                        }
                        InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P9;
                        boolean z13 = i14 == 4 || ((i10 & 8) != 0 && c1836h0.m4538h(abstractC4702a1));
                        Object objM4514P10 = c1836h0.m4514P();
                        if (z13 || objM4514P10 == c1823e2) {
                            final int i16 = 1;
                            objM4514P10 = new InterfaceC1231l() { // from class: wb.b1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1231l
                                public final Object invoke(Object obj4) {
                                    switch (i16) {
                                        case 0:
                                            C0414a c0414a22 = (C0414a) obj4;
                                            c0414a22.getClass();
                                            interfaceC1809a13.setValue(new C5424w0(c0414a22, ((C5457x0) abstractC4702a1).f21843b));
                                            break;
                                        case 1:
                                            List list32 = (List) obj4;
                                            list32.getClass();
                                            C5424w0 c5424w0 = (C5424w0) abstractC4702a1;
                                            interfaceC1809a13.setValue(new C5457x0(C0414a.m1401a(c5424w0.f21568a, null, null, null, 0, list32, null, false, null, false, false, false, 4079), c5424w0.f21569b));
                                            break;
                                        case 2:
                                            C5521z0 c5521z0 = (C5521z0) abstractC4702a1;
                                            interfaceC1809a13.setValue(new C5457x0(C0414a.m1401a(c5521z0.f22309a, null, null, (String) obj4, 0, null, null, false, null, false, false, false, 4091), c5521z0.f22310b));
                                            break;
                                        default:
                                            C0414a c0414a3 = (C0414a) obj4;
                                            c0414a3.getClass();
                                            interfaceC1809a13.setValue(new C5521z0(c0414a3, ((C5457x0) abstractC4702a1).f21843b));
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h0.m4545k0(objM4514P10);
                        }
                        c4933h2.m9281a(context, c0414a2, list3, interfaceC1220a4, (InterfaceC1231l) objM4514P10, c1836h0, 196608);
                        c1836h0.m4553p(false);
                    } else {
                        if (!(abstractC4702a1 instanceof C5521z0)) {
                            throw AbstractC0255e.m1015d(c1836h0, -348914477, false);
                        }
                        c1836h0.m4525a0(-348831779);
                        C0414a c0414a3 = ((C5521z0) abstractC4702a1).f22309a;
                        List list4 = (List) interfaceC1809a12.getValue();
                        int i17 = i10 & 14;
                        boolean z14 = i17 == 4 || ((i10 & 8) != 0 && c1836h0.m4538h(abstractC4702a1));
                        Object objM4514P11 = c1836h0.m4514P();
                        if (z14 || objM4514P11 == c1823e2) {
                            final int i18 = 1;
                            objM4514P11 = new InterfaceC1220a() { // from class: wb.c1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1220a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            C5424w0 c5424w0 = (C5424w0) abstractC4702a1;
                                            interfaceC1809a13.setValue(new C5457x0(c5424w0.f21568a, c5424w0.f21569b));
                                            break;
                                        default:
                                            C5521z0 c5521z0 = (C5521z0) abstractC4702a1;
                                            interfaceC1809a13.setValue(new C5457x0(c5521z0.f22309a, c5521z0.f22310b));
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h0.m4545k0(objM4514P11);
                        }
                        InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P11;
                        boolean z15 = i17 == 4 || ((i10 & 8) != 0 && c1836h0.m4538h(abstractC4702a1));
                        Object objM4514P12 = c1836h0.m4514P();
                        if (z15 || objM4514P12 == c1823e2) {
                            final int i19 = 2;
                            objM4514P12 = new InterfaceC1231l() { // from class: wb.b1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1231l
                                public final Object invoke(Object obj4) {
                                    switch (i19) {
                                        case 0:
                                            C0414a c0414a22 = (C0414a) obj4;
                                            c0414a22.getClass();
                                            interfaceC1809a13.setValue(new C5424w0(c0414a22, ((C5457x0) abstractC4702a1).f21843b));
                                            break;
                                        case 1:
                                            List list32 = (List) obj4;
                                            list32.getClass();
                                            C5424w0 c5424w0 = (C5424w0) abstractC4702a1;
                                            interfaceC1809a13.setValue(new C5457x0(C0414a.m1401a(c5424w0.f21568a, null, null, null, 0, list32, null, false, null, false, false, false, 4079), c5424w0.f21569b));
                                            break;
                                        case 2:
                                            C5521z0 c5521z0 = (C5521z0) abstractC4702a1;
                                            interfaceC1809a13.setValue(new C5457x0(C0414a.m1401a(c5521z0.f22309a, null, null, (String) obj4, 0, null, null, false, null, false, false, false, 4091), c5521z0.f22310b));
                                            break;
                                        default:
                                            C0414a c0414a32 = (C0414a) obj4;
                                            c0414a32.getClass();
                                            interfaceC1809a13.setValue(new C5521z0(c0414a32, ((C5457x0) abstractC4702a1).f21843b));
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h0.m4545k0(objM4514P12);
                        }
                        c4933h2.m9284d(c0414a3, list4, interfaceC1220a5, (InterfaceC1231l) objM4514P12, c1836h0, 24576);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f16742h;
                String str = (String) this.f16743i;
                InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) this.f16744j;
                C0414a c0414a4 = (C0414a) this.f16745k;
                C0414a c0414a5 = (C0414a) this.f16746l;
                InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) this.f16747m;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(561124427, new C0506z0((Object) interfaceC1809a14, (Object) str, interfaceC1231l5, (Object) c0414a4, (Object) c0414a5, (Object) interfaceC1231l6, 2), c1836h02), c1836h02, 48, 1);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                C4060x c4060x = (C4060x) this.f16743i;
                C3641z c3641z = (C3641z) this.f16745k;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f16742h;
                Context context2 = (Context) this.f16744j;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f16746l;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f16747m;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c1836h03.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    boolean zM4534f = c1836h03.m4534f(interfaceC1809a15) | c1836h03.m4538h(context2);
                    Object objM4514P13 = c1836h03.m4514P();
                    if (zM4534f || objM4514P13 == C1851l.f6155a) {
                        objM4514P13 = new C5074ld(interfaceC1809a15, context2, interfaceC1809a16, interfaceC1809a17);
                        c1836h03.m4545k0(objM4514P13);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P13, c1836h03, 0, 504);
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f16743i;
                C5292s0 c5292s0 = (C5292s0) this.f16745k;
                Context context3 = (Context) this.f16744j;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f16742h;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f16746l;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f16747m;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(808817714, new C0506z0(sharedPreferences, c5292s0, context3, interfaceC1809a18, interfaceC1809a19, interfaceC1809a110, 6), c1836h04), c1836h04, 48, 1);
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                C4060x c4060x2 = (C4060x) this.f16743i;
                C3641z c3641z2 = (C3641z) this.f16744j;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f16742h;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f16746l;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f16747m;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f16745k;
                InterfaceC3268x0 interfaceC3268x02 = (InterfaceC3268x0) obj;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                interfaceC3268x02.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c1836h05.m4534f(interfaceC3268x02) ? 4 : 2;
                }
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x2.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 84, 5);
                    Object objM4514P14 = c1836h05.m4514P();
                    if (objM4514P14 == C1851l.f6155a) {
                        C5467xa c5467xa = new C5467xa(interfaceC1809a111, interfaceC1809a112, interfaceC1809a113, interfaceC1809a114, 2);
                        c1836h05.m4545k0(c5467xa);
                        objM4514P14 = c5467xa;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, c3641z2, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P14, c1836h05, 805306368, 504);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 5:
                C3471g c3471g = (C3471g) this.f16743i;
                ArrayList arrayList = (ArrayList) this.f16744j;
                List list5 = (List) this.f16745k;
                String str2 = (String) this.f16742h;
                String str3 = (String) this.f16746l;
                InterfaceC1231l interfaceC1231l7 = (InterfaceC1231l) this.f16747m;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-631997163, new C0506z0(c3471g, arrayList, list5, str2, str3, interfaceC1231l7), c1836h06), c1836h06, 48, 1);
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 6:
                C0832c c0832c = (C0832c) this.f16743i;
                Context context4 = (Context) this.f16744j;
                InterfaceC1231l interfaceC1231l8 = (InterfaceC1231l) this.f16745k;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f16747m;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f16742h;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f16746l;
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 0.0f, 0.0f, 8, 7), AbstractC3879i.m8071e(-1881686452, new C0506z0((Object) c0832c, (Object) context4, interfaceC1231l8, (Object) interfaceC1235p, (Object) interfaceC1809a115, (Object) interfaceC1809a116, 7), c1836h07), c1836h07, 54, 0);
                } else {
                    c1836h07.m4519V();
                }
                return C3967n.f12976a;
            case 7:
                Context context5 = (Context) this.f16744j;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f16743i;
                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) this.f16745k;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f16742h;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f16746l;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f16747m;
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    boolean zM4538h4 = c1836h08.m4538h(context5) | c1836h08.m4538h(sharedPreferences2);
                    Object objM4514P15 = c1836h08.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zM4538h4 || objM4514P15 == c1823e3) {
                        objM4514P15 = new C4977id(1, context5, sharedPreferences2, interfaceC1809a117, interfaceC1809a118, interfaceC1809a119);
                        c1836h08.m4545k0(objM4514P15);
                    }
                    InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) objM4514P15;
                    Object objM4514P16 = c1836h08.m4514P();
                    if (objM4514P16 == c1823e3) {
                        objM4514P16 = new C5213pk(4, interfaceC1809a118, interfaceC1809a119);
                        c1836h08.m4545k0(objM4514P16);
                    }
                    AbstractC4955ho.m9382M("保存", interfaceC1220a7, "重置", (InterfaceC1220a) objM4514P16, "取消", interfaceC1220a6, c1836h08, 28038, 0);
                } else {
                    c1836h08.m4519V();
                }
                return C3967n.f12976a;
            case 8:
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f16742h;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f16746l;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f16743i;
                Context context6 = (Context) this.f16744j;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f16747m;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f16745k;
                C1836h0 c1836h09 = (C1836h0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h09.m4516S(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(694723335, new C0506z0(interfaceC1809a120, interfaceC1809a121, interfaceC3599t, context6, interfaceC1809a122, interfaceC1809a123, 9), c1836h09), c1836h09, 48, 1);
                } else {
                    c1836h09.m4519V();
                }
                return C3967n.f12976a;
            case 9:
                C4060x c4060x3 = (C4060x) this.f16744j;
                C3641z c3641z3 = (C3641z) this.f16745k;
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f16742h;
                String str4 = (String) this.f16746l;
                InterfaceC4544a interfaceC4544a2 = (InterfaceC4544a) this.f16743i;
                String str5 = (String) this.f16747m;
                InterfaceC3268x0 interfaceC3268x03 = (InterfaceC3268x0) obj;
                C1836h0 c1836h010 = (C1836h0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                interfaceC3268x03.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= c1836h010.m4534f(interfaceC3268x03) ? 4 : 2;
                }
                if (c1836h010.m4516S(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a3 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x3.f13440e, null);
                    C3272z0 c3272z0M6872b3 = AbstractC3208d.m6872b(interfaceC3268x03.mo6924c() + 8, interfaceC3268x03.mo6922a() + 84, 5);
                    boolean zM4538h5 = c1836h010.m4538h(sharedPreferences3) | c1836h010.m4534f(str4) | c1836h010.m4538h(interfaceC4544a2) | c1836h010.m4534f(str5) | c1836h010.m4536g(false);
                    Object objM4514P17 = c1836h010.m4514P();
                    if (zM4538h5 || objM4514P17 == C1851l.f6155a) {
                        objM4514P17 = new C0454k(sharedPreferences3, str4, interfaceC4544a2, str5, 20);
                        c1836h010.m4545k0(objM4514P17);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a3, c3641z3, c3272z0M6872b3, null, null, null, false, null, (InterfaceC1231l) objM4514P17, c1836h010, 0, 504);
                } else {
                    c1836h010.m4519V();
                }
                return C3967n.f12976a;
            case 10:
                InterfaceC1231l interfaceC1231l9 = (InterfaceC1231l) this.f16743i;
                C4957hq c4957hq = (C4957hq) this.f16747m;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f16742h;
                InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) this.f16746l;
                Context context7 = (Context) this.f16744j;
                InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) this.f16745k;
                C1836h0 c1836h011 = (C1836h0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h011.m4516S(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    boolean zM4534f2 = c1836h011.m4534f(interfaceC1231l9) | c1836h011.m4538h(c4957hq) | c1836h011.m4534f(interfaceC1809a124) | c1836h011.m4534f(interfaceC1809a125) | c1836h011.m4538h(context7);
                    Object objM4514P18 = c1836h011.m4514P();
                    if (zM4534f2 || objM4514P18 == C1851l.f6155a) {
                        objM4514P18 = new C0482r0(interfaceC1231l9, c4957hq, context7, interfaceC1809a124, interfaceC1809a125, 10);
                        c1836h011.m4545k0(objM4514P18);
                    }
                    AbstractC4955ho.m9382M("保存聊天", (InterfaceC1220a) objM4514P18, "返回", interfaceC1220a8, null, null, c1836h011, 390, 48);
                } else {
                    c1836h011.m4519V();
                }
                return C3967n.f12976a;
            case 11:
                Context context8 = (Context) this.f16744j;
                InterfaceC1809a1 interfaceC1809a126 = (InterfaceC1809a1) this.f16742h;
                InterfaceC1809a1 interfaceC1809a127 = (InterfaceC1809a1) this.f16746l;
                InterfaceC1809a1 interfaceC1809a128 = (InterfaceC1809a1) this.f16747m;
                InterfaceC1809a1 interfaceC1809a129 = (InterfaceC1809a1) this.f16743i;
                InterfaceC1809a1 interfaceC1809a130 = (InterfaceC1809a1) this.f16745k;
                C1836h0 c1836h012 = (C1836h0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h012.m4516S(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1661281353, new C0506z0(context8, interfaceC1809a126, interfaceC1809a127, interfaceC1809a128, interfaceC1809a129, interfaceC1809a130, 4), c1836h012), c1836h012, 48, 1);
                } else {
                    c1836h012.m4519V();
                }
                return C3967n.f12976a;
            case 12:
                InterfaceC1231l interfaceC1231l10 = (InterfaceC1231l) this.f16743i;
                C5124mu c5124mu = (C5124mu) this.f16747m;
                InterfaceC1809a1 interfaceC1809a131 = (InterfaceC1809a1) this.f16742h;
                InterfaceC1809a1 interfaceC1809a132 = (InterfaceC1809a1) this.f16746l;
                Context context9 = (Context) this.f16744j;
                InterfaceC1220a interfaceC1220a9 = (InterfaceC1220a) this.f16745k;
                C1836h0 c1836h013 = (C1836h0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h013.m4516S(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    boolean zM4534f3 = c1836h013.m4534f(interfaceC1231l10) | c1836h013.m4538h(c5124mu) | c1836h013.m4534f(interfaceC1809a131) | c1836h013.m4534f(interfaceC1809a132) | c1836h013.m4538h(context9);
                    Object objM4514P19 = c1836h013.m4514P();
                    if (zM4534f3 || objM4514P19 == C1851l.f6155a) {
                        objM4514P19 = new C0482r0(interfaceC1231l10, c5124mu, context9, interfaceC1809a131, interfaceC1809a132, 12);
                        c1836h013.m4545k0(objM4514P19);
                    }
                    AbstractC4955ho.m9382M("保存聊天", (InterfaceC1220a) objM4514P19, "返回", interfaceC1220a9, null, null, c1836h013, 390, 48);
                } else {
                    c1836h013.m4519V();
                }
                return C3967n.f12976a;
            case 13:
                C4060x c4060x4 = (C4060x) this.f16743i;
                C5124mu c5124mu2 = (C5124mu) this.f16744j;
                InterfaceC1809a1 interfaceC1809a133 = (InterfaceC1809a1) this.f16742h;
                InterfaceC1809a1 interfaceC1809a134 = (InterfaceC1809a1) this.f16746l;
                List list6 = (List) this.f16747m;
                InterfaceC1220a interfaceC1220a10 = (InterfaceC1220a) this.f16745k;
                InterfaceC3268x0 interfaceC3268x04 = (InterfaceC3268x0) obj;
                C1836h0 c1836h014 = (C1836h0) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                interfaceC3268x04.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= c1836h014.m4534f(interfaceC3268x04) ? 4 : 2;
                }
                if (c1836h014.m4516S(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a4 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x4.f13440e, null);
                    C3272z0 c3272z0M6872b4 = AbstractC3208d.m6872b(interfaceC3268x04.mo6924c() + 8, interfaceC3268x04.mo6922a() + 84, 5);
                    boolean zM4538h6 = c1836h014.m4538h(c5124mu2) | c1836h014.m4534f(interfaceC1809a133) | c1836h014.m4534f(interfaceC1809a134) | c1836h014.m4538h(list6) | c1836h014.m4534f(interfaceC1220a10);
                    Object objM4514P20 = c1836h014.m4514P();
                    if (zM4538h6 || objM4514P20 == C1851l.f6155a) {
                        objM4514P20 = new C0884o(c5124mu2, interfaceC1809a133, interfaceC1809a134, list6, interfaceC1220a10, 6);
                        c1836h014.m4545k0(objM4514P20);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a4, null, c3272z0M6872b4, null, null, null, false, null, (InterfaceC1231l) objM4514P20, c1836h014, 0, 506);
                } else {
                    c1836h014.m4519V();
                }
                return C3967n.f12976a;
            case 14:
                SharedPreferences sharedPreferences4 = (SharedPreferences) this.f16743i;
                Context context10 = (Context) this.f16744j;
                InterfaceC1809a1 interfaceC1809a135 = (InterfaceC1809a1) this.f16742h;
                InterfaceC1809a1 interfaceC1809a136 = (InterfaceC1809a1) this.f16746l;
                InterfaceC1809a1 interfaceC1809a137 = (InterfaceC1809a1) this.f16747m;
                InterfaceC1809a1 interfaceC1809a138 = (InterfaceC1809a1) this.f16745k;
                C1836h0 c1836h015 = (C1836h0) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h015.m4516S(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(841832930, new C0506z0(sharedPreferences4, context10, interfaceC1809a135, interfaceC1809a136, interfaceC1809a137, interfaceC1809a138, 5), c1836h015), c1836h015, 48, 1);
                } else {
                    c1836h015.m4519V();
                }
                return C3967n.f12976a;
            default:
                String str6 = (String) this.f16743i;
                EnumC5092lv enumC5092lv = (EnumC5092lv) this.f16744j;
                String str7 = (String) this.f16745k;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f16742h;
                Activity activity = (Activity) this.f16746l;
                InterfaceC1231l interfaceC1231l11 = (InterfaceC1231l) this.f16747m;
                InterfaceC1220a interfaceC1220a11 = (InterfaceC1220a) obj;
                C1836h0 c1836h016 = (C1836h0) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                interfaceC1220a11.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= c1836h016.m4538h(interfaceC1220a11) ? 4 : 2;
                }
                if (c1836h016.m4516S(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    C5491y2.f22068p.m9866J(str6, enumC5092lv, interfaceC1220a11, AbstractC3879i.m8071e(-402157289, new C0160z(str7, interfaceC1220a11, atomicBoolean, activity, interfaceC1231l11), c1836h016), c1836h016, 221190 | ((iIntValue16 << 9) & 7168));
                } else {
                    c1836h016.m4519V();
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C4833e1(Context context, SharedPreferences sharedPreferences, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f16741g = 7;
        this.f16744j = context;
        this.f16743i = sharedPreferences;
        this.f16745k = interfaceC1220a;
        this.f16742h = interfaceC1809a1;
        this.f16746l = interfaceC1809a12;
        this.f16747m = interfaceC1809a13;
    }

    public /* synthetic */ C4833e1(SharedPreferences sharedPreferences, C5292s0 c5292s0, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f16741g = 3;
        this.f16743i = sharedPreferences;
        this.f16745k = c5292s0;
        this.f16744j = context;
        this.f16742h = interfaceC1809a1;
        this.f16746l = interfaceC1809a12;
        this.f16747m = interfaceC1809a13;
    }

    public /* synthetic */ C4833e1(C0832c c0832c, Context context, InterfaceC1231l interfaceC1231l, InterfaceC1235p interfaceC1235p, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f16741g = 6;
        this.f16743i = c0832c;
        this.f16744j = context;
        this.f16745k = interfaceC1231l;
        this.f16747m = interfaceC1235p;
        this.f16742h = interfaceC1809a1;
        this.f16746l = interfaceC1809a12;
    }

    public /* synthetic */ C4833e1(InterfaceC1231l interfaceC1231l, Object obj, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, Context context, InterfaceC1220a interfaceC1220a, int i9) {
        this.f16741g = i9;
        this.f16743i = interfaceC1231l;
        this.f16747m = obj;
        this.f16742h = interfaceC1809a1;
        this.f16746l = interfaceC1809a12;
        this.f16744j = context;
        this.f16745k = interfaceC1220a;
    }

    public /* synthetic */ C4833e1(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC3599t interfaceC3599t, Context context, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f16741g = 8;
        this.f16742h = interfaceC1809a1;
        this.f16746l = interfaceC1809a12;
        this.f16743i = interfaceC3599t;
        this.f16744j = context;
        this.f16747m = interfaceC1809a13;
        this.f16745k = interfaceC1809a14;
    }

    public /* synthetic */ C4833e1(InterfaceC1809a1 interfaceC1809a1, String str, InterfaceC1231l interfaceC1231l, C0414a c0414a, C0414a c0414a2, InterfaceC1231l interfaceC1231l2) {
        this.f16741g = 1;
        this.f16742h = interfaceC1809a1;
        this.f16743i = str;
        this.f16744j = interfaceC1231l;
        this.f16745k = c0414a;
        this.f16746l = c0414a2;
        this.f16747m = interfaceC1231l2;
    }

    public /* synthetic */ C4833e1(Object obj, Object obj2, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, Object obj3, Object obj4, int i9) {
        this.f16741g = i9;
        this.f16743i = obj;
        this.f16744j = obj2;
        this.f16742h = interfaceC1809a1;
        this.f16746l = interfaceC1809a12;
        this.f16747m = obj3;
        this.f16745k = obj4;
    }

    public /* synthetic */ C4833e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i9) {
        this.f16741g = i9;
        this.f16743i = obj;
        this.f16744j = obj2;
        this.f16745k = obj3;
        this.f16742h = obj4;
        this.f16746l = obj5;
        this.f16747m = obj6;
    }

    public /* synthetic */ C4833e1(C4060x c4060x, C3641z c3641z, SharedPreferences sharedPreferences, String str, InterfaceC4544a interfaceC4544a, String str2) {
        this.f16741g = 9;
        this.f16744j = c4060x;
        this.f16745k = c3641z;
        this.f16742h = sharedPreferences;
        this.f16746l = str;
        this.f16743i = interfaceC4544a;
        this.f16747m = str2;
    }

    public /* synthetic */ C4833e1(C4060x c4060x, C3641z c3641z, InterfaceC1809a1 interfaceC1809a1, Context context, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f16741g = 2;
        this.f16743i = c4060x;
        this.f16745k = c3641z;
        this.f16742h = interfaceC1809a1;
        this.f16744j = context;
        this.f16746l = interfaceC1809a12;
        this.f16747m = interfaceC1809a13;
    }
}
