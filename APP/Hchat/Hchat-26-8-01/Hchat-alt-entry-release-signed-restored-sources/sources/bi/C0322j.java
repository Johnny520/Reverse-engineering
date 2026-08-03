package bi;

import java.util.List;
import p000a.AbstractC0000a;
import p051db.C0765c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p116i.C1802x0;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p129ig.AbstractC2043a;
import p266s0.C3874d;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p332wb.AbstractC4955ho;
import p332wb.C4825dq;
import p332wb.C5026jv;
import p332wb.C5040kc;
import p332wb.C5491y2;

/* JADX INFO: renamed from: bi.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0322j implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f951g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f952h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f953i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f954j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f955k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f956l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0322j(int i9, InterfaceC1231l interfaceC1231l, boolean z9, C0765c c0765c, InterfaceC1220a interfaceC1220a) {
        this.f951g = 1;
        this.f952h = i9;
        this.f954j = interfaceC1231l;
        this.f953i = z9;
        this.f955k = c0765c;
        this.f956l = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f951g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC2043a.m5023b((C0314b) this.f954j, (C0324l) this.f955k, this.f953i, (C3874d) this.f956l, (C1836h0) obj, AbstractC1874r.m4617C(this.f952h | 1));
                break;
            case 1:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f954j;
                C0765c c0765c = (C0765c) this.f955k;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f956l;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int i9 = this.f952h;
                    String str = i9 == 1 ? "微信原生群发助手" : "模块通道";
                    List listM101y0 = AbstractC0000a.m101y0(new C4825dq("0", "模块通道"), new C4825dq("1", "微信原生群发助手"));
                    String strValueOf = String.valueOf(i9);
                    boolean zM4534f = c1836h0.m4534f(interfaceC1231l);
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4534f || objM4514P == c1823e) {
                        objM4514P = new C1802x0(interfaceC1231l, 7);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9353I2("发送通道", str, listM101y0, strValueOf, (InterfaceC1231l) objM4514P, false, c1836h0, 6, 32);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    String str2 = this.f953i ? "选择好友" : "选择聊天";
                    String strM9502a7 = AbstractC4955ho.m9502a7(c0765c.f2293f);
                    boolean zM4534f2 = c1836h0.m4534f(interfaceC1220a);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4534f2 || objM4514P2 == c1823e) {
                        objM4514P2 = new C5040kc(interfaceC1220a, 6);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9503b(str2, strM9502a7, (InterfaceC1220a) objM4514P2, c1836h0, 0);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f954j).m9893h((C5026jv) this.f955k, this.f953i, (InterfaceC1220a) this.f956l, (C1836h0) obj, AbstractC1874r.m4617C(this.f952h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f954j).m9913r((String) this.f955k, this.f952h, this.f953i, (String) this.f956l, (C1836h0) obj, AbstractC1874r.m4617C(24577));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0322j(int i9, int i10, Object obj, Object obj2, InterfaceC3955b interfaceC3955b, boolean z9) {
        this.f951g = i10;
        this.f954j = obj;
        this.f955k = obj2;
        this.f953i = z9;
        this.f956l = interfaceC3955b;
        this.f952h = i9;
    }

    public /* synthetic */ C0322j(C5491y2 c5491y2, String str, int i9, boolean z9, String str2, int i10) {
        this.f951g = 3;
        this.f954j = c5491y2;
        this.f955k = str;
        this.f952h = i9;
        this.f953i = z9;
        this.f956l = str2;
    }
}
