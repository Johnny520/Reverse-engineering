package p332wb;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import ba.EnumC0234n;
import java.util.List;
import p051db.C0765c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p107h9.C1628c;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.c9 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4776c9 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16271g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f16272h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f16273i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4776c9(Context context, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f16271g = i9;
        this.f16272h = context;
        this.f16273i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16271g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a1 = this.f16273i;
                    int iM9551g2 = AbstractC4955ho.m9551g2(interfaceC1809a1);
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (objM4514P == c1823e) {
                        objM4514P = new C5371ud(interfaceC1809a1, 17);
                        c1836h0.m4545k0(objM4514P);
                    }
                    Context context = this.f16272h;
                    AbstractC4955ho.m9533e2(context, EnumC0234n.f609m, iM9551g2, (InterfaceC1220a) objM4514P, c1836h0, 3120);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    int iIntValue2 = ((Number) interfaceC1809a1.getValue()).intValue();
                    Object objM4514P2 = c1836h0.m4514P();
                    if (objM4514P2 == c1823e) {
                        objM4514P2 = new C5371ud(interfaceC1809a1, 18);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9533e2(context, EnumC0234n.f610n, iIntValue2, (InterfaceC1220a) objM4514P2, c1836h0, 3120);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Context context2 = this.f16272h;
                    boolean zM4538h = c1836h02.m4538h(context2);
                    Object objM4514P3 = c1836h02.m4514P();
                    if (zM4538h || objM4514P3 == C1851l.f6155a) {
                        objM4514P3 = new C4813dd(context2, this.f16273i, 4);
                        c1836h02.m4545k0(objM4514P3);
                    }
                    AbstractC4955ho.m9503b("恢复默认", "恢复初始菜单名称示例", (InterfaceC1220a) objM4514P3, c1836h02, 54);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 2:
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a12 = this.f16273i;
                    int iM9551g22 = AbstractC4955ho.m9551g2(interfaceC1809a12);
                    Object objM4514P4 = c1836h03.m4514P();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (objM4514P4 == c1823e2) {
                        objM4514P4 = new C5371ud(interfaceC1809a12, 5);
                        c1836h03.m4545k0(objM4514P4);
                    }
                    Context context3 = this.f16272h;
                    AbstractC4955ho.m9533e2(context3, EnumC0234n.f611o, iM9551g22, (InterfaceC1220a) objM4514P4, c1836h03, 3120);
                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                    int iIntValue5 = ((Number) interfaceC1809a12.getValue()).intValue();
                    Object objM4514P5 = c1836h03.m4514P();
                    if (objM4514P5 == c1823e2) {
                        objM4514P5 = new C5371ud(interfaceC1809a12, 6);
                        c1836h03.m4545k0(objM4514P5);
                    }
                    AbstractC4955ho.m9533e2(context3, EnumC0234n.f612p, iIntValue5, (InterfaceC1220a) objM4514P5, c1836h03, 3120);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 3:
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a13 = this.f16273i;
                    AbstractC4955ho.m9296B1("电池优化白名单", ((Boolean) interfaceC1809a13.getValue()).booleanValue() ? "微信已在白名单" : "微信可能仍受系统省电影响", null, c1836h04, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    Context context4 = this.f16272h;
                    boolean zM4538h2 = c1836h04.m4538h(context4);
                    Object objM4514P6 = c1836h04.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zM4538h2 || objM4514P6 == c1823e3) {
                        objM4514P6 = new C1628c(context4, 12);
                        c1836h04.m4545k0(objM4514P6);
                    }
                    AbstractC4955ho.m9503b("打开电池优化设置", "建议把微信设置为不限制", (InterfaceC1220a) objM4514P6, c1836h04, 54);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    String str = ((Boolean) interfaceC1809a13.getValue()).booleanValue() ? "当前已忽略优化" : "当前未忽略优化";
                    boolean zM4538h3 = c1836h04.m4538h(context4);
                    Object objM4514P7 = c1836h04.m4514P();
                    if (zM4538h3 || objM4514P7 == c1823e3) {
                        objM4514P7 = new C4813dd(context4, interfaceC1809a13, 2);
                        c1836h04.m4545k0(objM4514P7);
                    }
                    AbstractC4955ho.m9503b("刷新状态", str, (InterfaceC1220a) objM4514P7, c1836h04, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    boolean zM4538h4 = c1836h04.m4538h(context4);
                    Object objM4514P8 = c1836h04.m4514P();
                    if (zM4538h4 || objM4514P8 == c1823e3) {
                        objM4514P8 = new C4813dd(context4, interfaceC1809a13, 3);
                        c1836h04.m4545k0(objM4514P8);
                    }
                    AbstractC4955ho.m9503b("立即应用保活", "重新启动服务并应用 WakeLock / Root 白名单", (InterfaceC1220a) objM4514P8, c1836h04, 54);
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 4:
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a14 = this.f16273i;
                    boolean zBooleanValue = ((Boolean) interfaceC1809a14.getValue()).booleanValue();
                    Context context5 = this.f16272h;
                    boolean zM4538h5 = c1836h05.m4538h(context5);
                    Object objM4514P9 = c1836h05.m4514P();
                    if (zM4538h5 || objM4514P9 == C1851l.f6155a) {
                        objM4514P9 = new C5227q1(context5, interfaceC1809a14, 1);
                        c1836h05.m4545k0(objM4514P9);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "悬浮快捷菜单", "在微信页面显示可自由拖动和停放的快捷入口", false, (InterfaceC1231l) objM4514P9, c1836h05, 432, 8);
                } else {
                    c1836h05.m4519V();
                }
                break;
            case 5:
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a15 = this.f16273i;
                    String str2 = (String) interfaceC1809a15.getValue();
                    Context context6 = this.f16272h;
                    String strM9421Q6 = AbstractC4955ho.m9421Q6(context6, str2, 0);
                    boolean zM4538h6 = c1836h06.m4538h(context6) | c1836h06.m4534f(interfaceC1809a15);
                    Object objM4514P10 = c1836h06.m4514P();
                    C1823e c1823e4 = C1851l.f6155a;
                    if (zM4538h6 || objM4514P10 == c1823e4) {
                        objM4514P10 = new C4813dd(context6, interfaceC1809a15, 5);
                        c1836h06.m4545k0(objM4514P10);
                    }
                    AbstractC4955ho.m9503b("选择系统铃声", strM9421Q6, (InterfaceC1220a) objM4514P10, c1836h06, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    String strM9421Q62 = AbstractC3149m.m6721t0((String) interfaceC1809a15.getValue()) ? "未选择" : AbstractC4955ho.m9421Q6(context6, (String) interfaceC1809a15.getValue(), 1);
                    boolean zM4538h7 = c1836h06.m4538h(context6) | c1836h06.m4534f(interfaceC1809a15);
                    Object objM4514P11 = c1836h06.m4514P();
                    if (zM4538h7 || objM4514P11 == c1823e4) {
                        objM4514P11 = new C4813dd(context6, interfaceC1809a15, 6);
                        c1836h06.m4545k0(objM4514P11);
                    }
                    AbstractC4955ho.m9503b("从文件选择铃声", strM9421Q62, (InterfaceC1220a) objM4514P11, c1836h06, 6);
                    if (AbstractC3149m.m6721t0((String) interfaceC1809a15.getValue())) {
                        c1836h06.m4525a0(1265239883);
                        c1836h06.m4553p(false);
                    } else {
                        c1836h06.m4525a0(1264972725);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        boolean zM4534f = c1836h06.m4534f(interfaceC1809a15) | c1836h06.m4538h(context6);
                        Object objM4514P12 = c1836h06.m4514P();
                        if (zM4534f || objM4514P12 == c1823e4) {
                            objM4514P12 = new C4813dd(context6, interfaceC1809a15, 7);
                            c1836h06.m4545k0(objM4514P12);
                        }
                        AbstractC4955ho.m9503b("清空铃声", "恢复跟随系统", (InterfaceC1220a) objM4514P12, c1836h06, 54);
                        c1836h06.m4553p(false);
                    }
                } else {
                    c1836h06.m4519V();
                }
                break;
            case 6:
                final int iIntValue9 = ((Integer) obj).intValue();
                final int iIntValue10 = ((Integer) obj2).intValue();
                Context context7 = this.f16272h;
                Activity activity = context7 instanceof Activity ? (Activity) context7 : null;
                if (activity == null) {
                    Toast.makeText(context7, "当前页面无法打开文件选择器", 0).show();
                } else {
                    C5450wq c5450wq = C5450wq.f21764a;
                    final int i9 = 1;
                    final InterfaceC1809a1 interfaceC1809a16 = this.f16273i;
                    c5450wq.m9763b(activity, iIntValue10, new InterfaceC1231l() { // from class: wb.w6
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1231l
                        public final Object invoke(Object obj3) {
                            List list = (List) obj3;
                            switch (i9) {
                                case 0:
                                    list.getClass();
                                    InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a16;
                                    interfaceC1809a17.setValue(AbstractC4955ho.m9619n7((C0765c) interfaceC1809a17.getValue(), iIntValue9, iIntValue10, list));
                                    break;
                                default:
                                    list.getClass();
                                    InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a16;
                                    interfaceC1809a18.setValue(AbstractC4955ho.m9619n7((C0765c) interfaceC1809a18.getValue(), iIntValue9, iIntValue10, list));
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    });
                }
                break;
            default:
                final int iIntValue11 = ((Integer) obj).intValue();
                final int iIntValue12 = ((Integer) obj2).intValue();
                Context context8 = this.f16272h;
                Activity activity2 = context8 instanceof Activity ? (Activity) context8 : null;
                if (activity2 == null) {
                    Toast.makeText(context8, "当前页面无法打开文件选择器", 0).show();
                } else {
                    C5450wq c5450wq2 = C5450wq.f21764a;
                    final int i10 = 0;
                    final InterfaceC1809a1 interfaceC1809a17 = this.f16273i;
                    c5450wq2.m9763b(activity2, iIntValue12, new InterfaceC1231l() { // from class: wb.w6
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1231l
                        public final Object invoke(Object obj3) {
                            List list = (List) obj3;
                            switch (i10) {
                                case 0:
                                    list.getClass();
                                    InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a17;
                                    interfaceC1809a172.setValue(AbstractC4955ho.m9619n7((C0765c) interfaceC1809a172.getValue(), iIntValue11, iIntValue12, list));
                                    break;
                                default:
                                    list.getClass();
                                    InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a17;
                                    interfaceC1809a18.setValue(AbstractC4955ho.m9619n7((C0765c) interfaceC1809a18.getValue(), iIntValue11, iIntValue12, list));
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    });
                }
                break;
        }
        return C3967n.f12976a;
    }
}
