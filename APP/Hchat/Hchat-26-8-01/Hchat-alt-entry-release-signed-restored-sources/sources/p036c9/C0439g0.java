package p036c9;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p332wb.AbstractC4955ho;

/* JADX INFO: renamed from: c9.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0439g0 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1293g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f1294h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f1295i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0439g0(int i9, InterfaceC1231l interfaceC1231l, String str) {
        this.f1293g = i9;
        this.f1294h = str;
        this.f1295i = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        C3619d c3619d = (C3619d) obj;
        switch (this.f1293g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                c3619d.getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C0452j1 c0452j1 = C0452j1.f1326a;
                    boolean z9 = this.f1294h == null;
                    InterfaceC1231l interfaceC1231l = this.f1295i;
                    boolean zM4534f = c1836h0.m4534f(interfaceC1231l);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        objM4514P = new C0471o0(interfaceC1231l, 0);
                        c1836h0.m4545k0(objM4514P);
                    }
                    c0452j1.m1468i(0, 197046, (InterfaceC1220a) objM4514P, c1836h0, "微信首页", "作为一级分组", z9);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                c3619d.getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    final int i9 = 3;
                    final InterfaceC1231l interfaceC1231l2 = this.f1295i;
                    final String str = this.f1294h;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-2118014237, new InterfaceC1235p() { // from class: wb.tf
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i9) {
                                case 0:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        AbstractC4955ho.m9304C1("搜索", "昵称 / wxid / 群号", str, 0, interfaceC1231l2, c1836h03, 54, 8);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        AbstractC4955ho.m9304C1("搜索", "关键词", str, 0, interfaceC1231l2, c1836h04, 54, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        AbstractC4955ho.m9304C1("搜索", "按规则名、会话、群成员或消息类型筛选", str, 0, interfaceC1231l2, c1836h05, 54, 8);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        AbstractC4955ho.m9304C1("搜索", "按规则名或关键词筛选", str, 0, interfaceC1231l2, c1836h06, 54, 8);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    }, c1836h02), c1836h02, 48, 1);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 2:
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                c3619d.getClass();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    final int i10 = 2;
                    final InterfaceC1231l interfaceC1231l3 = this.f1295i;
                    final String str2 = this.f1294h;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-388540319, new InterfaceC1235p() { // from class: wb.tf
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i10) {
                                case 0:
                                    C1836h0 c1836h032 = (C1836h0) obj4;
                                    int iIntValue32 = ((Integer) obj5).intValue();
                                    if (c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                        AbstractC4955ho.m9304C1("搜索", "昵称 / wxid / 群号", str2, 0, interfaceC1231l3, c1836h032, 54, 8);
                                    } else {
                                        c1836h032.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        AbstractC4955ho.m9304C1("搜索", "关键词", str2, 0, interfaceC1231l3, c1836h04, 54, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        AbstractC4955ho.m9304C1("搜索", "按规则名、会话、群成员或消息类型筛选", str2, 0, interfaceC1231l3, c1836h05, 54, 8);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        AbstractC4955ho.m9304C1("搜索", "按规则名或关键词筛选", str2, 0, interfaceC1231l3, c1836h06, 54, 8);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    }, c1836h03), c1836h03, 48, 1);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 3:
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                c3619d.getClass();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    final int i11 = 0;
                    final InterfaceC1231l interfaceC1231l4 = this.f1295i;
                    final String str3 = this.f1294h;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1349512495, new InterfaceC1235p() { // from class: wb.tf
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i11) {
                                case 0:
                                    C1836h0 c1836h032 = (C1836h0) obj4;
                                    int iIntValue32 = ((Integer) obj5).intValue();
                                    if (c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                        AbstractC4955ho.m9304C1("搜索", "昵称 / wxid / 群号", str3, 0, interfaceC1231l4, c1836h032, 54, 8);
                                    } else {
                                        c1836h032.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h042 = (C1836h0) obj4;
                                    int iIntValue42 = ((Integer) obj5).intValue();
                                    if (c1836h042.m4516S(iIntValue42 & 1, (iIntValue42 & 3) != 2)) {
                                        AbstractC4955ho.m9304C1("搜索", "关键词", str3, 0, interfaceC1231l4, c1836h042, 54, 8);
                                    } else {
                                        c1836h042.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        AbstractC4955ho.m9304C1("搜索", "按规则名、会话、群成员或消息类型筛选", str3, 0, interfaceC1231l4, c1836h05, 54, 8);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        AbstractC4955ho.m9304C1("搜索", "按规则名或关键词筛选", str3, 0, interfaceC1231l4, c1836h06, 54, 8);
                                    } else {
                                        c1836h06.m4519V();
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
            default:
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                c3619d.getClass();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    final int i12 = 1;
                    final InterfaceC1231l interfaceC1231l5 = this.f1295i;
                    final String str4 = this.f1294h;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-431292425, new InterfaceC1235p() { // from class: wb.tf
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i12) {
                                case 0:
                                    C1836h0 c1836h032 = (C1836h0) obj4;
                                    int iIntValue32 = ((Integer) obj5).intValue();
                                    if (c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                        AbstractC4955ho.m9304C1("搜索", "昵称 / wxid / 群号", str4, 0, interfaceC1231l5, c1836h032, 54, 8);
                                    } else {
                                        c1836h032.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h042 = (C1836h0) obj4;
                                    int iIntValue42 = ((Integer) obj5).intValue();
                                    if (c1836h042.m4516S(iIntValue42 & 1, (iIntValue42 & 3) != 2)) {
                                        AbstractC4955ho.m9304C1("搜索", "关键词", str4, 0, interfaceC1231l5, c1836h042, 54, 8);
                                    } else {
                                        c1836h042.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h052 = (C1836h0) obj4;
                                    int iIntValue52 = ((Integer) obj5).intValue();
                                    if (c1836h052.m4516S(iIntValue52 & 1, (iIntValue52 & 3) != 2)) {
                                        AbstractC4955ho.m9304C1("搜索", "按规则名、会话、群成员或消息类型筛选", str4, 0, interfaceC1231l5, c1836h052, 54, 8);
                                    } else {
                                        c1836h052.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        AbstractC4955ho.m9304C1("搜索", "按规则名或关键词筛选", str4, 0, interfaceC1231l5, c1836h06, 54, 8);
                                    } else {
                                        c1836h06.m4519V();
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
        }
        return C3967n.f12976a;
    }
}
