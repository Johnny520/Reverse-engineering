package p321w;

import p063e9.C0832c;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p100h0.C1511d1;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import p332wb.AbstractC4955ho;
import p332wb.C4720aj;

/* JADX INFO: renamed from: w.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4640v implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15409g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f15410h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f15411i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4640v(C1511d1 c1511d1, boolean z9, int i9) {
        this.f15409g = 0;
        this.f15411i = c1511d1;
        this.f15410h = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15409g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4634s.m9066i((C1511d1) this.f15411i, this.f15410h, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 1:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f15411i;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z9 = this.f15410h;
                    AbstractC4955ho.m9410P3(z9, "聊天分组", z9 ? "已归拢会话从微信首页隐藏" : "分组配置保留，会话恢复在微信首页显示", false, interfaceC1231l, c1836h0, 48, 8);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 2:
                String str = (String) this.f15411i;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC4955ho.m9296B1("当前状态", this.f15410h ? "处理中" : "待开始", null, c1836h02, 6, 4);
                    if (AbstractC3149m.m6721t0(str)) {
                        c1836h02.m4525a0(1657122071);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(1657012517);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        AbstractC4955ho.m9296B1("最近结果", str, null, c1836h02, 6, 4);
                        c1836h02.m4553p(false);
                    }
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 3:
                C0832c c0832c = (C0832c) this.f15411i;
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c1836h03.m4519V();
                } else if (this.f15410h) {
                    c1836h03.m4525a0(1602680635);
                    AbstractC4955ho.m9296B1("类型", c0832c.f2514e ? "未单独配置的公众号" : c0832c.f2513d ? "未单独配置的群聊" : "未单独配置的私聊", null, c1836h03, 6, 4);
                    c1836h03.m4553p(false);
                } else {
                    c1836h03.m4525a0(1603042839);
                    String str2 = c0832c.f2512c;
                    if (AbstractC3149m.m6721t0(str2)) {
                        str2 = c0832c.f2511b;
                    }
                    AbstractC4955ho.m9296B1("名称", str2, null, c1836h03, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                    AbstractC4955ho.m9296B1("ID", c0832c.f2511b, null, c1836h03, 6, 4);
                    c1836h03.m4553p(false);
                }
                break;
            default:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f15411i;
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String str3 = this.f15410h ? "标签名称" : "昵称 / 群聊备注 / wxid";
                    String str4 = (String) interfaceC1809a1.getValue();
                    boolean zM4534f = c1836h04.m4534f(interfaceC1809a1);
                    Object objM4514P = c1836h04.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        objM4514P = new C4720aj(interfaceC1809a1, 16);
                        c1836h04.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9304C1("搜索", str3, str4, 0, (InterfaceC1231l) objM4514P, c1836h04, 6, 8);
                } else {
                    c1836h04.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4640v(boolean z9, Object obj, int i9) {
        this.f15409g = i9;
        this.f15410h = z9;
        this.f15411i = obj;
    }
}
