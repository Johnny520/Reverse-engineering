package p332wb;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.g1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4899g1 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17321g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1220a f17322h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1220a f17323i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4899g1(InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, int i9) {
        this.f17321g = i9;
        this.f17322h = interfaceC1220a;
        this.f17323i = interfaceC1220a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f17321g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC4955ho.m9382M("新增分组", this.f17322h, "返回", this.f17323i, null, null, c1836h0, 390, 48);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC4955ho.m9382M("新增任务", this.f17322h, "返回", this.f17323i, null, null, c1836h02, 390, 48);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 2:
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC4955ho.m9382M("保存", this.f17322h, "返回", this.f17323i, null, null, c1836h03, 390, 48);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 3:
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    final int i9 = 0;
                    final InterfaceC1220a interfaceC1220a = this.f17322h;
                    final InterfaceC1220a interfaceC1220a2 = this.f17323i;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-873758560, new InterfaceC1235p() { // from class: wb.cf
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i10 = i9;
                            C1836h0 c1836h05 = (C1836h0) obj4;
                            int iIntValue5 = ((Integer) obj5).intValue();
                            switch (i10) {
                                case 0:
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1220a interfaceC1220a3 = interfaceC1220a;
                                        C1823e c1823e = C1851l.f6155a;
                                        if (interfaceC1220a3 != null) {
                                            c1836h05.m4525a0(1655576921);
                                            boolean zM4534f = c1836h05.m4534f(interfaceC1220a3);
                                            Object objM4514P = c1836h05.m4514P();
                                            if (zM4534f || objM4514P == c1823e) {
                                                objM4514P = new C5040kc(interfaceC1220a3, 19);
                                                c1836h05.m4545k0(objM4514P);
                                            }
                                            AbstractC4955ho.m9503b("立即执行", "保存当前内容后立刻发送一次", (InterfaceC1220a) objM4514P, c1836h05, 54);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(1655739330);
                                            c1836h05.m4553p(false);
                                        }
                                        InterfaceC1220a interfaceC1220a4 = interfaceC1220a2;
                                        if (interfaceC1220a3 == null || interfaceC1220a4 == null) {
                                            c1836h05.m4525a0(1655879202);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(1655811932);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            c1836h05.m4553p(false);
                                        }
                                        if (interfaceC1220a4 != null) {
                                            c1836h05.m4525a0(1655930786);
                                            boolean zM4534f2 = c1836h05.m4534f(interfaceC1220a4);
                                            Object objM4514P2 = c1836h05.m4514P();
                                            if (zM4534f2 || objM4514P2 == c1823e) {
                                                objM4514P2 = new C5040kc(interfaceC1220a4, 20);
                                                c1836h05.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9503b("删除任务", "移除当前定时任务", (InterfaceC1220a) objM4514P2, c1836h05, 54);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(1656084546);
                                            c1836h05.m4553p(false);
                                        }
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                default:
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1220a interfaceC1220a5 = interfaceC1220a;
                                        boolean zM4534f3 = c1836h05.m4534f(interfaceC1220a5);
                                        Object objM4514P3 = c1836h05.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4534f3 || objM4514P3 == c1823e2) {
                                            objM4514P3 = new C5040kc(interfaceC1220a5, 16);
                                            c1836h05.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9503b("添加好友/群聊/公众号", "批量添加后可一次选择模板", (InterfaceC1220a) objM4514P3, c1836h05, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1220a interfaceC1220a6 = interfaceC1220a2;
                                        boolean zM4534f4 = c1836h05.m4534f(interfaceC1220a6);
                                        Object objM4514P4 = c1836h05.m4514P();
                                        if (zM4534f4 || objM4514P4 == c1823e2) {
                                            objM4514P4 = new C5040kc(interfaceC1220a6, 17);
                                            c1836h05.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9503b("添加群成员", "批量添加后可一次选择模板", (InterfaceC1220a) objM4514P4, c1836h05, 54);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    }, c1836h04), c1836h04, 48, 1);
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 4:
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    final int i10 = 1;
                    final InterfaceC1220a interfaceC1220a3 = this.f17322h;
                    final InterfaceC1220a interfaceC1220a4 = this.f17323i;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1158316860, new InterfaceC1235p() { // from class: wb.cf
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i102 = i10;
                            C1836h0 c1836h052 = (C1836h0) obj4;
                            int iIntValue52 = ((Integer) obj5).intValue();
                            switch (i102) {
                                case 0:
                                    if (c1836h052.m4516S(iIntValue52 & 1, (iIntValue52 & 3) != 2)) {
                                        InterfaceC1220a interfaceC1220a32 = interfaceC1220a3;
                                        C1823e c1823e = C1851l.f6155a;
                                        if (interfaceC1220a32 != null) {
                                            c1836h052.m4525a0(1655576921);
                                            boolean zM4534f = c1836h052.m4534f(interfaceC1220a32);
                                            Object objM4514P = c1836h052.m4514P();
                                            if (zM4534f || objM4514P == c1823e) {
                                                objM4514P = new C5040kc(interfaceC1220a32, 19);
                                                c1836h052.m4545k0(objM4514P);
                                            }
                                            AbstractC4955ho.m9503b("立即执行", "保存当前内容后立刻发送一次", (InterfaceC1220a) objM4514P, c1836h052, 54);
                                            c1836h052.m4553p(false);
                                        } else {
                                            c1836h052.m4525a0(1655739330);
                                            c1836h052.m4553p(false);
                                        }
                                        InterfaceC1220a interfaceC1220a42 = interfaceC1220a4;
                                        if (interfaceC1220a32 == null || interfaceC1220a42 == null) {
                                            c1836h052.m4525a0(1655879202);
                                            c1836h052.m4553p(false);
                                        } else {
                                            c1836h052.m4525a0(1655811932);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h052, 0, 1);
                                            c1836h052.m4553p(false);
                                        }
                                        if (interfaceC1220a42 != null) {
                                            c1836h052.m4525a0(1655930786);
                                            boolean zM4534f2 = c1836h052.m4534f(interfaceC1220a42);
                                            Object objM4514P2 = c1836h052.m4514P();
                                            if (zM4534f2 || objM4514P2 == c1823e) {
                                                objM4514P2 = new C5040kc(interfaceC1220a42, 20);
                                                c1836h052.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9503b("删除任务", "移除当前定时任务", (InterfaceC1220a) objM4514P2, c1836h052, 54);
                                            c1836h052.m4553p(false);
                                        } else {
                                            c1836h052.m4525a0(1656084546);
                                            c1836h052.m4553p(false);
                                        }
                                    } else {
                                        c1836h052.m4519V();
                                    }
                                    break;
                                default:
                                    if (c1836h052.m4516S(iIntValue52 & 1, (iIntValue52 & 3) != 2)) {
                                        InterfaceC1220a interfaceC1220a5 = interfaceC1220a3;
                                        boolean zM4534f3 = c1836h052.m4534f(interfaceC1220a5);
                                        Object objM4514P3 = c1836h052.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4534f3 || objM4514P3 == c1823e2) {
                                            objM4514P3 = new C5040kc(interfaceC1220a5, 16);
                                            c1836h052.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9503b("添加好友/群聊/公众号", "批量添加后可一次选择模板", (InterfaceC1220a) objM4514P3, c1836h052, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h052, 0, 1);
                                        InterfaceC1220a interfaceC1220a6 = interfaceC1220a4;
                                        boolean zM4534f4 = c1836h052.m4534f(interfaceC1220a6);
                                        Object objM4514P4 = c1836h052.m4514P();
                                        if (zM4534f4 || objM4514P4 == c1823e2) {
                                            objM4514P4 = new C5040kc(interfaceC1220a6, 17);
                                            c1836h052.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9503b("添加群成员", "批量添加后可一次选择模板", (InterfaceC1220a) objM4514P4, c1836h052, 54);
                                    } else {
                                        c1836h052.m4519V();
                                    }
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    }, c1836h05), c1836h05, 48, 1);
                } else {
                    c1836h05.m4519V();
                }
                break;
            case 5:
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC4955ho.m9382M("保存回复", this.f17322h, "返回", this.f17323i, null, null, c1836h06, 390, 48);
                } else {
                    c1836h06.m4519V();
                }
                break;
            case 6:
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC4955ho.m9382M("新增模板", this.f17322h, "返回", this.f17323i, null, null, c1836h07, 390, 48);
                } else {
                    c1836h07.m4519V();
                }
                break;
            case 7:
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    AbstractC4955ho.m9382M("开始群发", this.f17322h, "返回", this.f17323i, null, null, c1836h08, 390, 48);
                } else {
                    c1836h08.m4519V();
                }
                break;
            case 8:
                C1836h0 c1836h09 = (C1836h0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h09.m4516S(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    AbstractC4955ho.m9382M("保存任务", this.f17322h, "返回", this.f17323i, null, null, c1836h09, 390, 48);
                } else {
                    c1836h09.m4519V();
                }
                break;
            case 9:
                C1836h0 c1836h010 = (C1836h0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h010.m4516S(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    AbstractC4955ho.m9382M("新增标签", this.f17322h, "返回", this.f17323i, null, null, c1836h010, 390, 48);
                } else {
                    c1836h010.m4519V();
                }
                break;
            case 10:
                C1836h0 c1836h011 = (C1836h0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h011.m4516S(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    AbstractC4955ho.m9382M("新增模板", this.f17322h, "返回", this.f17323i, null, null, c1836h011, 390, 48);
                } else {
                    c1836h011.m4519V();
                }
                break;
            case 11:
                C1836h0 c1836h012 = (C1836h0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h012.m4516S(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    AbstractC4955ho.m9382M("新增模板", this.f17322h, "返回", this.f17323i, null, null, c1836h012, 390, 48);
                } else {
                    c1836h012.m4519V();
                }
                break;
            case 12:
                C1836h0 c1836h013 = (C1836h0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h013.m4516S(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    AbstractC4955ho.m9382M("新增模板", this.f17322h, "返回", this.f17323i, null, null, c1836h013, 390, 48);
                } else {
                    c1836h013.m4519V();
                }
                break;
            case 13:
                C1836h0 c1836h014 = (C1836h0) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h014.m4516S(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    AbstractC4955ho.m9382M("新增模板", this.f17322h, "返回", this.f17323i, null, null, c1836h014, 390, 48);
                } else {
                    c1836h014.m4519V();
                }
                break;
            case 14:
                C1836h0 c1836h015 = (C1836h0) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h015.m4516S(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    AbstractC4955ho.m9382M("添加关键词", this.f17322h, "返回", this.f17323i, null, null, c1836h015, 390, 48);
                } else {
                    c1836h015.m4519V();
                }
                break;
            default:
                C1836h0 c1836h016 = (C1836h0) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h016.m4516S(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    AbstractC4955ho.m9382M("保存配置", this.f17322h, "返回", this.f17323i, null, null, c1836h016, 390, 48);
                } else {
                    c1836h016.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
