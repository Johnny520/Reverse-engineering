package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import bsh.org.objectweb.asm.Opcodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import na.C2920h;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p015b0.C0153s;
import p015b0.C0160z;
import p025bc.AbstractC0255e;
import p036c9.C0454k;
import p036c9.C0467n0;
import p036c9.C0475p0;
import p036c9.C0479q0;
import p036c9.C0482r0;
import p051db.C0765c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p197n9.C2912a;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p251r.C3619d;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p317vb.InterfaceC4544a;
import p356y0.InterfaceC5853o;
import sh.C4060x;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.xc */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5469xc implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21906g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f21907h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f21908i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f21909j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f21910k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f21911l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5469xc(List list, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a12) {
        this.f21906g = 11;
        this.f21909j = list;
        this.f21908i = sharedPreferences;
        this.f21910k = interfaceC1809a1;
        this.f21907h = interfaceC1231l;
        this.f21911l = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        Context context;
        Object c0454k;
        int i9;
        switch (this.f21906g) {
            case 0:
                C0765c c0765c = (C0765c) this.f21909j;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f21907h;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f21908i;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f21911l;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f21910k;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1042987054, new C0160z(c0765c, interfaceC1231l, interfaceC1231l2, interfaceC1235p, interfaceC1231l3, 6), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f21909j;
                Set set = (Set) this.f21910k;
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f21907h;
                InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) this.f21908i;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f21911l;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-435502074, new C0160z(sharedPreferences, set, interfaceC1231l4, interfaceC1231l5, interfaceC1809a1), c1836h02), c1836h02, 48, 1);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                InterfaceC4544a interfaceC4544a = (InterfaceC4544a) this.f21909j;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f21907h;
                Context context2 = (Context) this.f21908i;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f21910k;
                final InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f21911l;
                final AbstractC5394v3 abstractC5394v3 = (AbstractC5394v3) obj;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                abstractC5394v3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? c1836h03.m4534f(abstractC5394v3) : c1836h03.m4538h(abstractC5394v3) ? 4 : 2;
                }
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    boolean zEquals = abstractC5394v3.equals(C5361u3.f20988a);
                    C1823e c1823e = C1851l.f6155a;
                    if (zEquals) {
                        c1836h03.m4525a0(802817188);
                        String strMo4984b = interfaceC4544a.mo4984b();
                        List list = (List) interfaceC1809a12.getValue();
                        Object objM4514P = c1836h03.m4514P();
                        if (objM4514P == c1823e) {
                            objM4514P = new C5509yk(interfaceC1809a13, 26);
                            c1836h03.m4545k0(objM4514P);
                        }
                        InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P;
                        Object objM4514P2 = c1836h03.m4514P();
                        if (objM4514P2 == c1823e) {
                            objM4514P2 = new C4917gj(interfaceC1809a13, 24);
                            c1836h03.m4545k0(objM4514P2);
                        }
                        AbstractC4955ho.m9514c1(strMo4984b, list, interfaceC1220a, interfaceC1220a2, (InterfaceC1231l) objM4514P2, c1836h03, 27648);
                        c1836h03.m4553p(false);
                    } else if (abstractC5394v3 instanceof C5295s3) {
                        c1836h03.m4525a0(802830021);
                        C5295s3 c5295s3 = (C5295s3) abstractC5394v3;
                        C2912a c2912a = c5295s3.f20564a;
                        boolean z9 = c5295s3.f20565b;
                        Object objM4514P3 = c1836h03.m4514P();
                        if (objM4514P3 == c1823e) {
                            objM4514P3 = new C5509yk(interfaceC1809a13, 27);
                            c1836h03.m4545k0(objM4514P3);
                        }
                        InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P3;
                        int i10 = iIntValue3 & 14;
                        boolean z10 = i10 == 4 || ((iIntValue3 & 8) != 0 && c1836h03.m4538h(abstractC5394v3));
                        Object objM4514P4 = c1836h03.m4514P();
                        if (z10 || objM4514P4 == c1823e) {
                            final int i11 = 0;
                            objM4514P4 = new InterfaceC1231l() { // from class: wb.fl
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1231l
                                public final Object invoke(Object obj4) {
                                    switch (i11) {
                                        case 0:
                                            C2912a c2912a2 = (C2912a) obj4;
                                            c2912a2.getClass();
                                            interfaceC1809a13.setValue(new C5328t3(c2912a2, ((C5295s3) abstractC5394v3).f20565b));
                                            break;
                                        default:
                                            List list2 = (List) obj4;
                                            list2.getClass();
                                            C5328t3 c5328t3 = (C5328t3) abstractC5394v3;
                                            C2912a c2912a3 = c5328t3.f20743a;
                                            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
                                            Iterator it = list2.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(((C5292s0) it.next()).f20550a);
                                            }
                                            interfaceC1809a13.setValue(new C5295s3(C2912a.m6319a(c2912a3, null, AbstractC4166m.m8412U1(arrayList), 3), c5328t3.f20744b));
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h03.m4545k0(objM4514P4);
                        }
                        InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) objM4514P4;
                        boolean zM4538h = c1836h03.m4538h(context2) | (i10 == 4 || ((iIntValue3 & 8) != 0 && c1836h03.m4538h(abstractC5394v3)));
                        Object objM4514P5 = c1836h03.m4514P();
                        if (zM4538h || objM4514P5 == c1823e) {
                            context = context2;
                            i9 = i10;
                            c0454k = new C0454k(context, abstractC5394v3, interfaceC1809a12, interfaceC1809a13, 26);
                            abstractC5394v3 = abstractC5394v3;
                            interfaceC1809a12 = interfaceC1809a12;
                            c1836h03.m4545k0(c0454k);
                        } else {
                            context = context2;
                            c0454k = objM4514P5;
                            i9 = i10;
                        }
                        InterfaceC1231l interfaceC1231l7 = (InterfaceC1231l) c0454k;
                        boolean zM4538h2 = (i9 == 4 || ((iIntValue3 & 8) != 0 && c1836h03.m4538h(abstractC5394v3))) | c1836h03.m4538h(context);
                        Object objM4514P6 = c1836h03.m4514P();
                        if (zM4538h2 || objM4514P6 == c1823e) {
                            C0467n0 c0467n0 = new C0467n0(context, interfaceC1809a12, abstractC5394v3, interfaceC1809a13, 22);
                            c1836h03.m4545k0(c0467n0);
                            objM4514P6 = c0467n0;
                        }
                        AbstractC4955ho.m9505b1(context, c2912a, z9, interfaceC1220a3, interfaceC1231l6, interfaceC1231l7, (InterfaceC1220a) objM4514P6, c1836h03, 3136);
                        c1836h03.m4553p(false);
                    } else {
                        if (!(abstractC5394v3 instanceof C5328t3)) {
                            throw AbstractC0255e.m1015d(c1836h03, 802817593, false);
                        }
                        c1836h03.m4525a0(802875243);
                        String strM9316D5 = AbstractC4955ho.m9316D5(((C5328t3) abstractC5394v3).f20743a.f9411c);
                        Object objM4514P7 = c1836h03.m4514P();
                        if (objM4514P7 == c1823e) {
                            objM4514P7 = new C5015jk(4);
                            c1836h03.m4545k0(objM4514P7);
                        }
                        C5391v0 c5391v0 = new C5391v0("选择标签群聊", EnumC5358u0.f20979h, true, strM9316D5, (InterfaceC1231l) objM4514P7, false, Opcodes.IF_ICMPNE);
                        int i12 = iIntValue3 & 14;
                        boolean z11 = i12 == 4 || ((iIntValue3 & 8) != 0 && c1836h03.m4538h(abstractC5394v3));
                        Object objM4514P8 = c1836h03.m4514P();
                        if (z11 || objM4514P8 == c1823e) {
                            objM4514P8 = new C5475xi(abstractC5394v3, 5, interfaceC1809a13);
                            c1836h03.m4545k0(objM4514P8);
                        }
                        InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P8;
                        boolean z12 = i12 == 4 || ((iIntValue3 & 8) != 0 && c1836h03.m4538h(abstractC5394v3));
                        Object objM4514P9 = c1836h03.m4514P();
                        if (z12 || objM4514P9 == c1823e) {
                            final int i13 = 1;
                            objM4514P9 = new InterfaceC1231l() { // from class: wb.fl
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1231l
                                public final Object invoke(Object obj4) {
                                    switch (i13) {
                                        case 0:
                                            C2912a c2912a2 = (C2912a) obj4;
                                            c2912a2.getClass();
                                            interfaceC1809a13.setValue(new C5328t3(c2912a2, ((C5295s3) abstractC5394v3).f20565b));
                                            break;
                                        default:
                                            List list2 = (List) obj4;
                                            list2.getClass();
                                            C5328t3 c5328t3 = (C5328t3) abstractC5394v3;
                                            C2912a c2912a3 = c5328t3.f20743a;
                                            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
                                            Iterator it = list2.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(((C5292s0) it.next()).f20550a);
                                            }
                                            interfaceC1809a13.setValue(new C5295s3(C2912a.m6319a(c2912a3, null, AbstractC4166m.m8412U1(arrayList), 3), c5328t3.f20744b));
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h03.m4545k0(objM4514P9);
                        }
                        AbstractC4955ho.m9504b0(context2, c5391v0, interfaceC1220a4, (InterfaceC1231l) objM4514P9, c1836h03, 0);
                        c1836h03.m4553p(false);
                    }
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                C5292s0 c5292s0 = (C5292s0) this.f21909j;
                C5292s0 c5292s02 = (C5292s0) this.f21907h;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f21908i;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f21910k;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f21911l;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String strM9388M5 = c5292s0 != null ? AbstractC4955ho.m9388M5(c5292s0.f20550a, c5292s02.f20550a) : null;
                    if (strM9388M5 == null) {
                        strM9388M5 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    String str = strM9388M5;
                    boolean zContains = c5292s0 == null ? false : ((Set) interfaceC1809a15.getValue()).contains(str);
                    boolean z13 = c5292s0 != null;
                    boolean zM4538h3 = c1836h04.m4538h(c5292s0) | c1836h04.m4534f(interfaceC1809a14) | c1836h04.m4538h(c5292s02) | c1836h04.m4534f(interfaceC1809a15) | c1836h04.m4534f(str) | c1836h04.m4534f(interfaceC1809a16);
                    Object objM4514P10 = c1836h04.m4514P();
                    if (zM4538h3 || objM4514P10 == C1851l.f6155a) {
                        C0475p0 c0475p0 = new C0475p0(c5292s0, c5292s02, str, interfaceC1809a14, interfaceC1809a15, interfaceC1809a16, 6);
                        c1836h04.m4545k0(c0475p0);
                        objM4514P10 = c0475p0;
                    }
                    AbstractC4955ho.m9495a0(c5292s02, zContains, z13, (InterfaceC1220a) objM4514P10, c1836h04, 0);
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                C2920h c2920h = (C2920h) this.f21909j;
                InterfaceC1231l interfaceC1231l8 = (InterfaceC1231l) this.f21907h;
                Context context3 = (Context) this.f21910k;
                InterfaceC1231l interfaceC1231l9 = (InterfaceC1231l) this.f21908i;
                List list2 = (List) this.f21911l;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1304656318, new C0160z(c2920h, interfaceC1231l8, context3, interfaceC1231l9, list2, 7), c1836h05), c1836h05, 48, 1);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 5:
                C4060x c4060x = (C4060x) this.f21909j;
                C3641z c3641z = (C3641z) this.f21907h;
                Context context4 = (Context) this.f21908i;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f21910k;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f21911l;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= c1836h06.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    boolean zM4538h4 = c1836h06.m4538h(context4);
                    Object objM4514P11 = c1836h06.m4514P();
                    if (zM4538h4 || objM4514P11 == C1851l.f6155a) {
                        objM4514P11 = new C5172oc(interfaceC1809a17, interfaceC1809a18, context4);
                        c1836h06.m4545k0(objM4514P11);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P11, c1836h06, 0, 504);
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 6:
                C4060x c4060x2 = (C4060x) this.f21909j;
                C3641z c3641z2 = (C3641z) this.f21907h;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f21908i;
                Context context5 = (Context) this.f21910k;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f21911l;
                InterfaceC3268x0 interfaceC3268x02 = (InterfaceC3268x0) obj;
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                interfaceC3268x02.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= c1836h07.m4534f(interfaceC3268x02) ? 4 : 2;
                }
                if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x2.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 84, 5);
                    boolean zM4538h5 = c1836h07.m4538h(sharedPreferences2) | c1836h07.m4538h(context5);
                    Object objM4514P12 = c1836h07.m4514P();
                    if (zM4538h5 || objM4514P12 == C1851l.f6155a) {
                        objM4514P12 = new C5337tc(sharedPreferences2, context5, interfaceC1809a19, 11);
                        c1836h07.m4545k0(objM4514P12);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, c3641z2, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P12, c1836h07, 0, 504);
                } else {
                    c1836h07.m4519V();
                }
                return C3967n.f12976a;
            case 7:
                C4060x c4060x3 = (C4060x) this.f21909j;
                C3641z c3641z3 = (C3641z) this.f21908i;
                C4792cp c4792cp = (C4792cp) this.f21910k;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f21911l;
                InterfaceC1231l interfaceC1231l10 = (InterfaceC1231l) this.f21907h;
                InterfaceC3268x0 interfaceC3268x03 = (InterfaceC3268x0) obj;
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                interfaceC3268x03.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= c1836h08.m4534f(interfaceC3268x03) ? 4 : 2;
                }
                if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a3 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x3.f13440e, null);
                    C3272z0 c3272z0M6872b3 = AbstractC3208d.m6872b(interfaceC3268x03.mo6924c() + 8, interfaceC3268x03.mo6922a() + 84, 5);
                    boolean zM4538h6 = c1836h08.m4538h(c4792cp) | c1836h08.m4534f(interfaceC1809a110) | c1836h08.m4534f(interfaceC1231l10);
                    Object objM4514P13 = c1836h08.m4514P();
                    if (zM4538h6 || objM4514P13 == C1851l.f6155a) {
                        objM4514P13 = new C0153s(c4792cp, interfaceC1809a110, interfaceC1231l10, 28);
                        c1836h08.m4545k0(objM4514P13);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a3, c3641z3, c3272z0M6872b3, null, null, null, false, null, (InterfaceC1231l) objM4514P13, c1836h08, 0, 504);
                } else {
                    c1836h08.m4519V();
                }
                return C3967n.f12976a;
            case 8:
                C4060x c4060x4 = (C4060x) this.f21909j;
                C3641z c3641z4 = (C3641z) this.f21907h;
                Context context6 = (Context) this.f21908i;
                InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) this.f21910k;
                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) this.f21911l;
                InterfaceC3268x0 interfaceC3268x04 = (InterfaceC3268x0) obj;
                C1836h0 c1836h09 = (C1836h0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                interfaceC3268x04.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= c1836h09.m4534f(interfaceC3268x04) ? 4 : 2;
                }
                if (c1836h09.m4516S(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a4 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x4.f13440e, null);
                    C3272z0 c3272z0M6872b4 = AbstractC3208d.m6872b(interfaceC3268x04.mo6924c() + 8, interfaceC3268x04.mo6922a() + 84, 5);
                    boolean zM4538h7 = c1836h09.m4538h(context6) | c1836h09.m4534f(interfaceC1220a5) | c1836h09.m4534f(interfaceC1220a6);
                    Object objM4514P14 = c1836h09.m4514P();
                    if (zM4538h7 || objM4514P14 == C1851l.f6155a) {
                        objM4514P14 = new C4819dj(context6, interfaceC1220a5, interfaceC1220a6, 4);
                        c1836h09.m4545k0(objM4514P14);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a4, c3641z4, c3272z0M6872b4, null, null, null, false, null, (InterfaceC1231l) objM4514P14, c1836h09, 0, 504);
                } else {
                    c1836h09.m4519V();
                }
                return C3967n.f12976a;
            case 9:
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f21909j;
                String str2 = (String) this.f21907h;
                Context context7 = (Context) this.f21908i;
                InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) this.f21910k;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f21911l;
                C1836h0 c1836h010 = (C1836h0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h010.m4516S(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    boolean zM4538h8 = c1836h010.m4538h(sharedPreferences3) | c1836h010.m4534f(str2) | c1836h010.m4538h(context7) | c1836h010.m4534f(interfaceC1220a7);
                    Object objM4514P15 = c1836h010.m4514P();
                    if (zM4538h8 || objM4514P15 == C1851l.f6155a) {
                        objM4514P15 = new C0482r0(sharedPreferences3, str2, context7, interfaceC1220a7, interfaceC1809a111, 13);
                        c1836h010.m4545k0(objM4514P15);
                    }
                    AbstractC4955ho.m9382M("保存", (InterfaceC1220a) objM4514P15, "返回", interfaceC1220a7, null, null, c1836h010, 390, 48);
                } else {
                    c1836h010.m4519V();
                }
                return C3967n.f12976a;
            case 10:
                List list3 = (List) this.f21909j;
                SharedPreferences sharedPreferences4 = (SharedPreferences) this.f21907h;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f21908i;
                InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) this.f21911l;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f21910k;
                C1836h0 c1836h011 = (C1836h0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h011.m4516S(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    boolean zM4538h9 = c1836h011.m4538h(sharedPreferences4) | c1836h011.m4534f(interfaceC1809a112) | c1836h011.m4534f(interfaceC1235p2);
                    Object objM4514P16 = c1836h011.m4514P();
                    if (zM4538h9 || objM4514P16 == C1851l.f6155a) {
                        objM4514P16 = new C0479q0(interfaceC1235p2, sharedPreferences4, interfaceC1809a112, interfaceC1809a113, 19);
                        c1836h011.m4545k0(objM4514P16);
                    }
                    AbstractC4955ho.m9359J0(list3, (InterfaceC1235p) objM4514P16, c1836h011, 0);
                } else {
                    c1836h011.m4519V();
                }
                return C3967n.f12976a;
            default:
                List list4 = (List) this.f21909j;
                SharedPreferences sharedPreferences5 = (SharedPreferences) this.f21908i;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f21910k;
                InterfaceC1231l interfaceC1231l11 = (InterfaceC1231l) this.f21907h;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f21911l;
                C1836h0 c1836h012 = (C1836h0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h012.m4516S(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    boolean zM4538h10 = c1836h012.m4538h(sharedPreferences5) | c1836h012.m4534f(interfaceC1809a114) | c1836h012.m4534f(interfaceC1231l11);
                    Object objM4514P17 = c1836h012.m4514P();
                    if (zM4538h10 || objM4514P17 == C1851l.f6155a) {
                        objM4514P17 = new C0454k(interfaceC1231l11, sharedPreferences5, interfaceC1809a114, interfaceC1809a115, 22);
                        c1836h012.m4545k0(objM4514P17);
                    }
                    AbstractC4955ho.m9337G2(list4, (InterfaceC1231l) objM4514P17, c1836h012, 0);
                } else {
                    c1836h012.m4519V();
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C5469xc(Object obj, Object obj2, Object obj3, InterfaceC1235p interfaceC1235p, Object obj4, int i9) {
        this.f21906g = i9;
        this.f21909j = obj;
        this.f21907h = obj2;
        this.f21908i = obj3;
        this.f21911l = interfaceC1235p;
        this.f21910k = obj4;
    }

    public /* synthetic */ C5469xc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.f21906g = i9;
        this.f21909j = obj;
        this.f21907h = obj2;
        this.f21908i = obj3;
        this.f21910k = obj4;
        this.f21911l = obj5;
    }

    public /* synthetic */ C5469xc(SharedPreferences sharedPreferences, Set set, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, InterfaceC1809a1 interfaceC1809a1) {
        this.f21906g = 1;
        this.f21909j = sharedPreferences;
        this.f21910k = set;
        this.f21907h = interfaceC1231l;
        this.f21908i = interfaceC1231l2;
        this.f21911l = interfaceC1809a1;
    }

    public /* synthetic */ C5469xc(C2920h c2920h, InterfaceC1231l interfaceC1231l, Context context, InterfaceC1231l interfaceC1231l2, List list) {
        this.f21906g = 4;
        this.f21909j = c2920h;
        this.f21907h = interfaceC1231l;
        this.f21910k = context;
        this.f21908i = interfaceC1231l2;
        this.f21911l = list;
    }

    public /* synthetic */ C5469xc(C4060x c4060x, C3641z c3641z, C4792cp c4792cp, InterfaceC1809a1 interfaceC1809a1, InterfaceC1231l interfaceC1231l) {
        this.f21906g = 7;
        this.f21909j = c4060x;
        this.f21908i = c3641z;
        this.f21910k = c4792cp;
        this.f21911l = interfaceC1809a1;
        this.f21907h = interfaceC1231l;
    }
}
