package p332wb;

import android.content.Context;
import android.widget.Toast;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.ta */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5335ta implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20784g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1220a f20785h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f20786i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5335ta(Context context, InterfaceC1220a interfaceC1220a, int i9, int i10) {
        this.f20784g = i10;
        this.f20786i = context;
        this.f20785h = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C1836h0 c1836h0 = (C1836h0) obj;
        Integer num = (Integer) obj2;
        switch (this.f20784g) {
            case 0:
                num.getClass();
                AbstractC4955ho.m9454V(this.f20786i, this.f20785h, c1836h0, AbstractC1874r.m4617C(1));
                break;
            case 1:
                int iIntValue = num.intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final InterfaceC1220a interfaceC1220a = this.f20785h;
                    boolean zM4534f = c1836h0.m4534f(interfaceC1220a);
                    final Context context = this.f20786i;
                    boolean zM4538h = zM4534f | c1836h0.m4538h(context);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4538h || objM4514P == C1851l.f6155a) {
                        final int i9 = 2;
                        objM4514P = new InterfaceC1220a() { // from class: wb.sg
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i9) {
                                    case 0:
                                        interfaceC1220a.invoke();
                                        Toast.makeText(context, "模板已删除", 0).show();
                                        break;
                                    case 1:
                                        interfaceC1220a.invoke();
                                        Toast.makeText(context, "适用聊天已移除", 0).show();
                                        break;
                                    case 2:
                                        interfaceC1220a.invoke();
                                        Toast.makeText(context, "模板已删除", 0).show();
                                        break;
                                    default:
                                        interfaceC1220a.invoke();
                                        Toast.makeText(context, "名单已删除", 0).show();
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9503b("删除模板", "删除后使用该模板的聊天会变成未绑定模板", (InterfaceC1220a) objM4514P, c1836h0, 54);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                int iIntValue2 = num.intValue();
                if (c1836h0.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    final InterfaceC1220a interfaceC1220a2 = this.f20785h;
                    boolean zM4534f2 = c1836h0.m4534f(interfaceC1220a2);
                    final Context context2 = this.f20786i;
                    boolean zM4538h2 = zM4534f2 | c1836h0.m4538h(context2);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4538h2 || objM4514P2 == C1851l.f6155a) {
                        final int i10 = 1;
                        objM4514P2 = new InterfaceC1220a() { // from class: wb.sg
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        interfaceC1220a2.invoke();
                                        Toast.makeText(context2, "模板已删除", 0).show();
                                        break;
                                    case 1:
                                        interfaceC1220a2.invoke();
                                        Toast.makeText(context2, "适用聊天已移除", 0).show();
                                        break;
                                    case 2:
                                        interfaceC1220a2.invoke();
                                        Toast.makeText(context2, "模板已删除", 0).show();
                                        break;
                                    default:
                                        interfaceC1220a2.invoke();
                                        Toast.makeText(context2, "名单已删除", 0).show();
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9503b("移除适用聊天", "移除后该聊天回到默认规则", (InterfaceC1220a) objM4514P2, c1836h0, 54);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                int iIntValue3 = num.intValue();
                if (c1836h0.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    final InterfaceC1220a interfaceC1220a3 = this.f20785h;
                    boolean zM4534f3 = c1836h0.m4534f(interfaceC1220a3);
                    final Context context3 = this.f20786i;
                    boolean zM4538h3 = zM4534f3 | c1836h0.m4538h(context3);
                    Object objM4514P3 = c1836h0.m4514P();
                    if (zM4538h3 || objM4514P3 == C1851l.f6155a) {
                        final int i11 = 0;
                        objM4514P3 = new InterfaceC1220a() { // from class: wb.sg
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        interfaceC1220a3.invoke();
                                        Toast.makeText(context3, "模板已删除", 0).show();
                                        break;
                                    case 1:
                                        interfaceC1220a3.invoke();
                                        Toast.makeText(context3, "适用聊天已移除", 0).show();
                                        break;
                                    case 2:
                                        interfaceC1220a3.invoke();
                                        Toast.makeText(context3, "模板已删除", 0).show();
                                        break;
                                    default:
                                        interfaceC1220a3.invoke();
                                        Toast.makeText(context3, "名单已删除", 0).show();
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P3);
                    }
                    AbstractC4955ho.m9503b("删除模板", "删除后立即从模板列表移除", (InterfaceC1220a) objM4514P3, c1836h0, 54);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                int iIntValue4 = num.intValue();
                if (c1836h0.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    final InterfaceC1220a interfaceC1220a4 = this.f20785h;
                    boolean zM4534f4 = c1836h0.m4534f(interfaceC1220a4);
                    final Context context4 = this.f20786i;
                    boolean zM4538h4 = zM4534f4 | c1836h0.m4538h(context4);
                    Object objM4514P4 = c1836h0.m4514P();
                    if (zM4538h4 || objM4514P4 == C1851l.f6155a) {
                        final int i12 = 3;
                        objM4514P4 = new InterfaceC1220a() { // from class: wb.sg
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        interfaceC1220a4.invoke();
                                        Toast.makeText(context4, "模板已删除", 0).show();
                                        break;
                                    case 1:
                                        interfaceC1220a4.invoke();
                                        Toast.makeText(context4, "适用聊天已移除", 0).show();
                                        break;
                                    case 2:
                                        interfaceC1220a4.invoke();
                                        Toast.makeText(context4, "模板已删除", 0).show();
                                        break;
                                    default:
                                        interfaceC1220a4.invoke();
                                        Toast.makeText(context4, "名单已删除", 0).show();
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P4);
                    }
                    AbstractC4955ho.m9503b("删除名单", "删除后该名单不再套用模板", (InterfaceC1220a) objM4514P4, c1836h0, 54);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            default:
                num.getClass();
                AbstractC4955ho.m9399O0(this.f20786i, this.f20785h, c1836h0, AbstractC1874r.m4617C(49));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5335ta(InterfaceC1220a interfaceC1220a, Context context, int i9) {
        this.f20784g = i9;
        this.f20785h = interfaceC1220a;
        this.f20786i = context;
    }
}
