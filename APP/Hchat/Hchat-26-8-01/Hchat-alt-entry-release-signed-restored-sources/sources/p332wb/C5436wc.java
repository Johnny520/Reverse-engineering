package p332wb;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import p003a2.C0014a;
import p025bc.AbstractC0255e;
import p051db.C0765c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3958e;
import p276sf.C3967n;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.wc */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5436wc implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21664g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0765c f21665h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f21666i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5436wc(int i9, C0765c c0765c, InterfaceC1231l interfaceC1231l) {
        this.f21664g = i9;
        this.f21665h = c0765c;
        this.f21666i = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f21664g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i11 = 2;
                    final C0765c c0765c = this.f21665h;
                    final InterfaceC1231l interfaceC1231l = this.f21666i;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1975213902, new InterfaceC1235p() { // from class: wb.qe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
                        @Override // p085fg.InterfaceC1235p
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj4, Object obj5) {
                            String strM8392A1;
                            switch (i11) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        C0765c c0765c2 = c0765c;
                                        String strValueOf = String.valueOf(c0765c2.f2297j);
                                        InterfaceC1231l interfaceC1231l2 = interfaceC1231l;
                                        boolean zM4534f = c1836h02.m4534f(interfaceC1231l2) | c1836h02.m4538h(c0765c2);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4534f || objM4514P == c1823e) {
                                            objM4514P = new C5275rg(0, c0765c2, interfaceC1231l2);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9695w2("聊天间隔", "单位秒，多个聊天之间的等待时间", strValueOf, (InterfaceC1231l) objM4514P, c1836h02, 54);
                                        if (AbstractC4955ho.m9445T6(c0765c2).size() > 1) {
                                            c1836h02.m4525a0(-1263861244);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            String strValueOf2 = String.valueOf(c0765c2.f2298k);
                                            boolean zM4534f2 = c1836h02.m4534f(interfaceC1231l2) | c1836h02.m4538h(c0765c2);
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (zM4534f2 || objM4514P2 == c1823e) {
                                                objM4514P2 = new C5275rg(1, c0765c2, interfaceC1231l2);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9695w2("多条间隔", "单位秒，同一聊天连续发送的等待时间", strValueOf2, (InterfaceC1231l) objM4514P2, c1836h02, 48);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(-1263516245);
                                            c1836h02.m4553p(false);
                                        }
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        C0765c c0765c3 = c0765c;
                                        String str = c0765c3.f2304q;
                                        List list = c0765c3.f2293f;
                                        int i12 = c0765c3.f2305r;
                                        String string = AbstractC3149m.m6703R0(str).toString();
                                        if (AbstractC3149m.m6721t0(string)) {
                                            string = null;
                                        }
                                        if (string == null) {
                                            string = i12 == 1 ? "朋友圈 · ".concat(AbstractC4955ho.m9485Y6(c0765c3.f2306s)) : AbstractC4855en.m9265i(AbstractC4955ho.m9529d7(c0765c3), AbstractC4955ho.m9453U6(c0765c3), " · ", i12 == 1 ? "朋友圈" : AbstractC4955ho.m9502a7(list));
                                        }
                                        int i13 = c0765c3.f2295h;
                                        if (i13 == 1) {
                                            strM8392A1 = "每天";
                                        } else if (i13 != 2) {
                                            strM8392A1 = "单次";
                                        } else {
                                            Set set = c0765c3.f2296i;
                                            if (set.isEmpty()) {
                                                strM8392A1 = "每周";
                                            } else {
                                                List listM9538e7 = AbstractC4955ho.m9538e7();
                                                ArrayList arrayList = new ArrayList();
                                                for (Object obj6 : listM9538e7) {
                                                    if (set.contains(((C3958e) obj6).f12961g)) {
                                                        arrayList.add(obj6);
                                                    }
                                                }
                                                strM8392A1 = AbstractC4166m.m8392A1(arrayList, HttpUrl.FRAGMENT_ENCODE_SET, null, null, new C5204pb(24), 30);
                                                if (AbstractC3149m.m6721t0(strM8392A1)) {
                                                }
                                            }
                                        }
                                        long j3 = c0765c3.f2301n;
                                        String strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
                                        String strM6837j = j3 > 0 ? AbstractC3199a.m6837j(c0765c3.f2302o, " · 上次 ", "/", c0765c3.f2303p) : HttpUrl.FRAGMENT_ENCODE_SET;
                                        if (i12 == 0) {
                                            strConcat = (c0765c3.f2308u == 1 ? "微信原生群发助手" : "模块通道").concat(" / ");
                                        }
                                        List listM188v = C0014a.m188v(c0765c3);
                                        int size = listM188v.size();
                                        String str2 = string;
                                        long j4 = c0765c3.f2294g;
                                        String strM1033v = AbstractC0255e.m1033v(strConcat, size <= 1 ? AbstractC4955ho.m9511b7(j4) : AbstractC4955ho.m9511b7(j4) + " 等 " + listM188v.size() + " 个时间", " / ", strM8392A1, strM6837j);
                                        if (!AbstractC3149m.m6721t0(c0765c3.f2304q)) {
                                            strM1033v = AbstractC4955ho.m9529d7(c0765c3) + AbstractC4955ho.m9453U6(c0765c3) + " · " + (i12 != 1 ? AbstractC4955ho.m9502a7(list) : "朋友圈") + " / " + strM1033v;
                                        }
                                        InterfaceC1231l interfaceC1231l3 = interfaceC1231l;
                                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1231l3) | c1836h03.m4538h(c0765c3);
                                        Object objM4514P3 = c1836h03.m4514P();
                                        if (zM4534f3 || objM4514P3 == C1851l.f6155a) {
                                            objM4514P3 = new C5505yg(1, c0765c3, interfaceC1231l3);
                                            c1836h03.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9503b(str2, strM1033v, (InterfaceC1220a) objM4514P3, c1836h03, 0);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        C0765c c0765c4 = c0765c;
                                        String str3 = c0765c4.f2304q;
                                        InterfaceC1231l interfaceC1231l4 = interfaceC1231l;
                                        boolean zM4534f4 = c1836h04.m4534f(interfaceC1231l4) | c1836h04.m4538h(c0765c4);
                                        Object objM4514P4 = c1836h04.m4514P();
                                        if (zM4534f4 || objM4514P4 == C1851l.f6155a) {
                                            objM4514P4 = new C5275rg(9, c0765c4, interfaceC1231l4);
                                            c1836h04.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9304C1("任务备注", "用于在任务列表区分任务，可留空", str3, 0, (InterfaceC1231l) objM4514P4, c1836h04, 54, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    }, c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i12 = 0;
                    final C0765c c0765c2 = this.f21665h;
                    final InterfaceC1231l interfaceC1231l2 = this.f21666i;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(66564087, new InterfaceC1235p() { // from class: wb.qe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
                        @Override // p085fg.InterfaceC1235p
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj4, Object obj5) {
                            String strM8392A1;
                            switch (i12) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        C0765c c0765c22 = c0765c2;
                                        String strValueOf = String.valueOf(c0765c22.f2297j);
                                        InterfaceC1231l interfaceC1231l22 = interfaceC1231l2;
                                        boolean zM4534f = c1836h02.m4534f(interfaceC1231l22) | c1836h02.m4538h(c0765c22);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4534f || objM4514P == c1823e) {
                                            objM4514P = new C5275rg(0, c0765c22, interfaceC1231l22);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9695w2("聊天间隔", "单位秒，多个聊天之间的等待时间", strValueOf, (InterfaceC1231l) objM4514P, c1836h02, 54);
                                        if (AbstractC4955ho.m9445T6(c0765c22).size() > 1) {
                                            c1836h02.m4525a0(-1263861244);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            String strValueOf2 = String.valueOf(c0765c22.f2298k);
                                            boolean zM4534f2 = c1836h02.m4534f(interfaceC1231l22) | c1836h02.m4538h(c0765c22);
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (zM4534f2 || objM4514P2 == c1823e) {
                                                objM4514P2 = new C5275rg(1, c0765c22, interfaceC1231l22);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9695w2("多条间隔", "单位秒，同一聊天连续发送的等待时间", strValueOf2, (InterfaceC1231l) objM4514P2, c1836h02, 48);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(-1263516245);
                                            c1836h02.m4553p(false);
                                        }
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        C0765c c0765c3 = c0765c2;
                                        String str = c0765c3.f2304q;
                                        List list = c0765c3.f2293f;
                                        int i122 = c0765c3.f2305r;
                                        String string = AbstractC3149m.m6703R0(str).toString();
                                        if (AbstractC3149m.m6721t0(string)) {
                                            string = null;
                                        }
                                        if (string == null) {
                                            string = i122 == 1 ? "朋友圈 · ".concat(AbstractC4955ho.m9485Y6(c0765c3.f2306s)) : AbstractC4855en.m9265i(AbstractC4955ho.m9529d7(c0765c3), AbstractC4955ho.m9453U6(c0765c3), " · ", i122 == 1 ? "朋友圈" : AbstractC4955ho.m9502a7(list));
                                        }
                                        int i13 = c0765c3.f2295h;
                                        if (i13 == 1) {
                                            strM8392A1 = "每天";
                                        } else if (i13 != 2) {
                                            strM8392A1 = "单次";
                                        } else {
                                            Set set = c0765c3.f2296i;
                                            if (set.isEmpty()) {
                                                strM8392A1 = "每周";
                                            } else {
                                                List listM9538e7 = AbstractC4955ho.m9538e7();
                                                ArrayList arrayList = new ArrayList();
                                                for (Object obj6 : listM9538e7) {
                                                    if (set.contains(((C3958e) obj6).f12961g)) {
                                                        arrayList.add(obj6);
                                                    }
                                                }
                                                strM8392A1 = AbstractC4166m.m8392A1(arrayList, HttpUrl.FRAGMENT_ENCODE_SET, null, null, new C5204pb(24), 30);
                                                if (AbstractC3149m.m6721t0(strM8392A1)) {
                                                }
                                            }
                                        }
                                        long j3 = c0765c3.f2301n;
                                        String strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
                                        String strM6837j = j3 > 0 ? AbstractC3199a.m6837j(c0765c3.f2302o, " · 上次 ", "/", c0765c3.f2303p) : HttpUrl.FRAGMENT_ENCODE_SET;
                                        if (i122 == 0) {
                                            strConcat = (c0765c3.f2308u == 1 ? "微信原生群发助手" : "模块通道").concat(" / ");
                                        }
                                        List listM188v = C0014a.m188v(c0765c3);
                                        int size = listM188v.size();
                                        String str2 = string;
                                        long j4 = c0765c3.f2294g;
                                        String strM1033v = AbstractC0255e.m1033v(strConcat, size <= 1 ? AbstractC4955ho.m9511b7(j4) : AbstractC4955ho.m9511b7(j4) + " 等 " + listM188v.size() + " 个时间", " / ", strM8392A1, strM6837j);
                                        if (!AbstractC3149m.m6721t0(c0765c3.f2304q)) {
                                            strM1033v = AbstractC4955ho.m9529d7(c0765c3) + AbstractC4955ho.m9453U6(c0765c3) + " · " + (i122 != 1 ? AbstractC4955ho.m9502a7(list) : "朋友圈") + " / " + strM1033v;
                                        }
                                        InterfaceC1231l interfaceC1231l3 = interfaceC1231l2;
                                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1231l3) | c1836h03.m4538h(c0765c3);
                                        Object objM4514P3 = c1836h03.m4514P();
                                        if (zM4534f3 || objM4514P3 == C1851l.f6155a) {
                                            objM4514P3 = new C5505yg(1, c0765c3, interfaceC1231l3);
                                            c1836h03.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9503b(str2, strM1033v, (InterfaceC1220a) objM4514P3, c1836h03, 0);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        C0765c c0765c4 = c0765c2;
                                        String str3 = c0765c4.f2304q;
                                        InterfaceC1231l interfaceC1231l4 = interfaceC1231l2;
                                        boolean zM4534f4 = c1836h04.m4534f(interfaceC1231l4) | c1836h04.m4538h(c0765c4);
                                        Object objM4514P4 = c1836h04.m4514P();
                                        if (zM4534f4 || objM4514P4 == C1851l.f6155a) {
                                            objM4514P4 = new C5275rg(9, c0765c4, interfaceC1231l4);
                                            c1836h04.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9304C1("任务备注", "用于在任务列表区分任务，可留空", str3, 0, (InterfaceC1231l) objM4514P4, c1836h04, 54, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    }, c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i13 = 1;
                    final C0765c c0765c3 = this.f21665h;
                    final InterfaceC1231l interfaceC1231l3 = this.f21666i;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(587792467, new InterfaceC1235p() { // from class: wb.qe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
                        @Override // p085fg.InterfaceC1235p
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj4, Object obj5) {
                            String strM8392A1;
                            switch (i13) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        C0765c c0765c22 = c0765c3;
                                        String strValueOf = String.valueOf(c0765c22.f2297j);
                                        InterfaceC1231l interfaceC1231l22 = interfaceC1231l3;
                                        boolean zM4534f = c1836h02.m4534f(interfaceC1231l22) | c1836h02.m4538h(c0765c22);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4534f || objM4514P == c1823e) {
                                            objM4514P = new C5275rg(0, c0765c22, interfaceC1231l22);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9695w2("聊天间隔", "单位秒，多个聊天之间的等待时间", strValueOf, (InterfaceC1231l) objM4514P, c1836h02, 54);
                                        if (AbstractC4955ho.m9445T6(c0765c22).size() > 1) {
                                            c1836h02.m4525a0(-1263861244);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            String strValueOf2 = String.valueOf(c0765c22.f2298k);
                                            boolean zM4534f2 = c1836h02.m4534f(interfaceC1231l22) | c1836h02.m4538h(c0765c22);
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (zM4534f2 || objM4514P2 == c1823e) {
                                                objM4514P2 = new C5275rg(1, c0765c22, interfaceC1231l22);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9695w2("多条间隔", "单位秒，同一聊天连续发送的等待时间", strValueOf2, (InterfaceC1231l) objM4514P2, c1836h02, 48);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(-1263516245);
                                            c1836h02.m4553p(false);
                                        }
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        C0765c c0765c32 = c0765c3;
                                        String str = c0765c32.f2304q;
                                        List list = c0765c32.f2293f;
                                        int i122 = c0765c32.f2305r;
                                        String string = AbstractC3149m.m6703R0(str).toString();
                                        if (AbstractC3149m.m6721t0(string)) {
                                            string = null;
                                        }
                                        if (string == null) {
                                            string = i122 == 1 ? "朋友圈 · ".concat(AbstractC4955ho.m9485Y6(c0765c32.f2306s)) : AbstractC4855en.m9265i(AbstractC4955ho.m9529d7(c0765c32), AbstractC4955ho.m9453U6(c0765c32), " · ", i122 == 1 ? "朋友圈" : AbstractC4955ho.m9502a7(list));
                                        }
                                        int i132 = c0765c32.f2295h;
                                        if (i132 == 1) {
                                            strM8392A1 = "每天";
                                        } else if (i132 != 2) {
                                            strM8392A1 = "单次";
                                        } else {
                                            Set set = c0765c32.f2296i;
                                            if (set.isEmpty()) {
                                                strM8392A1 = "每周";
                                            } else {
                                                List listM9538e7 = AbstractC4955ho.m9538e7();
                                                ArrayList arrayList = new ArrayList();
                                                for (Object obj6 : listM9538e7) {
                                                    if (set.contains(((C3958e) obj6).f12961g)) {
                                                        arrayList.add(obj6);
                                                    }
                                                }
                                                strM8392A1 = AbstractC4166m.m8392A1(arrayList, HttpUrl.FRAGMENT_ENCODE_SET, null, null, new C5204pb(24), 30);
                                                if (AbstractC3149m.m6721t0(strM8392A1)) {
                                                }
                                            }
                                        }
                                        long j3 = c0765c32.f2301n;
                                        String strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
                                        String strM6837j = j3 > 0 ? AbstractC3199a.m6837j(c0765c32.f2302o, " · 上次 ", "/", c0765c32.f2303p) : HttpUrl.FRAGMENT_ENCODE_SET;
                                        if (i122 == 0) {
                                            strConcat = (c0765c32.f2308u == 1 ? "微信原生群发助手" : "模块通道").concat(" / ");
                                        }
                                        List listM188v = C0014a.m188v(c0765c32);
                                        int size = listM188v.size();
                                        String str2 = string;
                                        long j4 = c0765c32.f2294g;
                                        String strM1033v = AbstractC0255e.m1033v(strConcat, size <= 1 ? AbstractC4955ho.m9511b7(j4) : AbstractC4955ho.m9511b7(j4) + " 等 " + listM188v.size() + " 个时间", " / ", strM8392A1, strM6837j);
                                        if (!AbstractC3149m.m6721t0(c0765c32.f2304q)) {
                                            strM1033v = AbstractC4955ho.m9529d7(c0765c32) + AbstractC4955ho.m9453U6(c0765c32) + " · " + (i122 != 1 ? AbstractC4955ho.m9502a7(list) : "朋友圈") + " / " + strM1033v;
                                        }
                                        InterfaceC1231l interfaceC1231l32 = interfaceC1231l3;
                                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1231l32) | c1836h03.m4538h(c0765c32);
                                        Object objM4514P3 = c1836h03.m4514P();
                                        if (zM4534f3 || objM4514P3 == C1851l.f6155a) {
                                            objM4514P3 = new C5505yg(1, c0765c32, interfaceC1231l32);
                                            c1836h03.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9503b(str2, strM1033v, (InterfaceC1220a) objM4514P3, c1836h03, 0);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        C0765c c0765c4 = c0765c3;
                                        String str3 = c0765c4.f2304q;
                                        InterfaceC1231l interfaceC1231l4 = interfaceC1231l3;
                                        boolean zM4534f4 = c1836h04.m4534f(interfaceC1231l4) | c1836h04.m4538h(c0765c4);
                                        Object objM4514P4 = c1836h04.m4514P();
                                        if (zM4534f4 || objM4514P4 == C1851l.f6155a) {
                                            objM4514P4 = new C5275rg(9, c0765c4, interfaceC1231l4);
                                            c1836h04.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9304C1("任务备注", "用于在任务列表区分任务，可留空", str3, 0, (InterfaceC1231l) objM4514P4, c1836h04, 54, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    }, c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
