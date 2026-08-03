package p332wb;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: wb.ug */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5374ug implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21108g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f21109h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f21110i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1220a f21111j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f21112k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f21113l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5374ug(String str, String str2, boolean z9, InterfaceC1220a interfaceC1220a, InterfaceC5853o interfaceC5853o, int i9) {
        this.f21110i = str;
        this.f21112k = str2;
        this.f21109h = z9;
        this.f21111j = interfaceC1220a;
        this.f21113l = interfaceC5853o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9;
        switch (this.f21108g) {
            case 0:
                String str = (String) this.f21112k;
                InterfaceC5853o interfaceC5853o = (InterfaceC5853o) this.f21113l;
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9446U(AbstractC1874r.m4617C(3079), this.f21111j, (C1836h0) obj, this.f21110i, str, interfaceC5853o, this.f21109h);
                break;
            case 1:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f21112k;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f21113l;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z9 = this.f21109h;
                    AbstractC4955ho.m9410P3(z9, "自动压缩上下文", "达到设定阈值后压缩较早对话", false, interfaceC1231l, c1836h0, 432, 8);
                    if (z9) {
                        c1836h0.m4525a0(-1592709104);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        i9 = 0;
                        AbstractC4955ho.m9304C1("压缩阈值", "Token 估算值，范围 2000 到 1000000", this.f21110i, 0, interfaceC1231l2, c1836h0, 54, 8);
                        c1836h0 = c1836h0;
                        c1836h0.m4553p(false);
                    } else {
                        i9 = 0;
                        c1836h0.m4525a0(-1592380442);
                        c1836h0.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, i9, 1);
                    InterfaceC1220a interfaceC1220a = this.f21111j;
                    boolean zM4534f = c1836h0.m4534f(interfaceC1220a);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        objM4514P = new C5040kc(interfaceC1220a, 27);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9503b("立即压缩当前会话", "保留本地历史和当前代码草稿", (InterfaceC1220a) objM4514P, c1836h0, 54);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            default:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f21113l).m9856A(this.f21110i, (String) this.f21112k, this.f21109h, this.f21111j, (C1836h0) obj, AbstractC1874r.m4617C(24577));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5374ug(C5491y2 c5491y2, String str, String str2, boolean z9, InterfaceC1220a interfaceC1220a, int i9) {
        this.f21113l = c5491y2;
        this.f21110i = str;
        this.f21112k = str2;
        this.f21109h = z9;
        this.f21111j = interfaceC1220a;
    }

    public /* synthetic */ C5374ug(boolean z9, InterfaceC1231l interfaceC1231l, String str, InterfaceC1231l interfaceC1231l2, InterfaceC1220a interfaceC1220a) {
        this.f21109h = z9;
        this.f21112k = interfaceC1231l;
        this.f21110i = str;
        this.f21113l = interfaceC1231l2;
        this.f21111j = interfaceC1220a;
    }
}
