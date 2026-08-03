package p332wb;

import java.util.List;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p116i.C1802x0;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p158l.C2416g;
import p222p.AbstractC3199a;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;

/* JADX INFO: renamed from: wb.zf */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5536zf implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22417g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f22418h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f22419i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f22420j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5536zf(String str, boolean z9, InterfaceC1220a interfaceC1220a) {
        this.f22417g = 0;
        this.f22420j = str;
        this.f22418h = z9;
        this.f22419i = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22417g) {
            case 0:
                String str = (String) this.f22420j;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f22419i;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strM9323E4 = AbstractC4955ho.m9323E4(str);
                    boolean z9 = this.f22418h;
                    boolean zM4536g = c1836h0.m4536g(z9) | c1836h0.m4534f(interfaceC1220a);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4536g || objM4514P == C1851l.f6155a) {
                        objM4514P = new C2416g(z9, interfaceC1220a, 3);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9503b("选择聊天", strM9323E4, (InterfaceC1220a) objM4514P, c1836h0, 6);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9313D2(this.f22418h, (InterfaceC1220a) this.f22419i, (InterfaceC1231l) this.f22420j, (C1836h0) obj, AbstractC1874r.m4617C(3505));
                break;
            case 2:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f22420j;
                List list = (List) this.f22419i;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zM4534f = c1836h02.m4534f(interfaceC1231l);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4534f || objM4514P2 == C1851l.f6155a) {
                        objM4514P2 = new C1802x0(interfaceC1231l, 6);
                        c1836h02.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9410P3(this.f22418h, "启用定时任务", "开启后按计划时间发送聊天消息或发布朋友圈", false, (InterfaceC1231l) objM4514P2, c1836h02, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    AbstractC4955ho.m9296B1("当前任务", list.isEmpty() ? "暂无任务" : AbstractC3199a.m6836i(list.size(), " 个"), null, c1836h02, 6, 4);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9703x2((C4759bp) this.f22420j, this.f22418h, (InterfaceC1220a) this.f22419i, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9448U1((C5099m5) this.f22420j, this.f22418h, (InterfaceC1220a) this.f22419i, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9440T1((EnumC5033k5) this.f22420j, this.f22418h, (InterfaceC1231l) this.f22419i, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5536zf(Object obj, boolean z9, InterfaceC3955b interfaceC3955b, int i9, int i10) {
        this.f22417g = i10;
        this.f22420j = obj;
        this.f22418h = z9;
        this.f22419i = interfaceC3955b;
    }

    public /* synthetic */ C5536zf(boolean z9, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, int i9) {
        this.f22417g = 1;
        this.f22418h = z9;
        this.f22419i = interfaceC1220a;
        this.f22420j = interfaceC1231l;
    }

    public /* synthetic */ C5536zf(boolean z9, InterfaceC1231l interfaceC1231l, List list) {
        this.f22417g = 2;
        this.f22418h = z9;
        this.f22420j = interfaceC1231l;
        this.f22419i = list;
    }
}
