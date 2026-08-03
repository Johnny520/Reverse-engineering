package p332wb;

import android.content.Context;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.xm */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5479xm implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22001g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f22002h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f22003i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1231l f22004j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1220a f22005k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5479xm(InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a1, Context context, InterfaceC1220a interfaceC1220a) {
        this.f22004j = interfaceC1231l;
        this.f22002h = interfaceC1809a1;
        this.f22003i = context;
        this.f22005k = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f22001g;
        InterfaceC4209a interfaceC4209a = (InterfaceC4209a) obj;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i9) {
            case 0:
                interfaceC4209a.getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC1231l interfaceC1231l = this.f22004j;
                    boolean zM4534f = c1836h0.m4534f(interfaceC1231l);
                    InterfaceC1809a1 interfaceC1809a1 = this.f22002h;
                    boolean zM4534f2 = zM4534f | c1836h0.m4534f(interfaceC1809a1);
                    Context context = this.f22003i;
                    boolean zM4538h = zM4534f2 | c1836h0.m4538h(context);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4538h || objM4514P == C1851l.f6155a) {
                        objM4514P = new C4744ba(interfaceC1231l, context, interfaceC1809a1);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9382M("保存模板", (InterfaceC1220a) objM4514P, "返回", this.f22005k, null, null, c1836h0, 390, 48);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                interfaceC4209a.getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC1809a1 interfaceC1809a12 = this.f22002h;
                    boolean zM4534f3 = c1836h0.m4534f(interfaceC1809a12);
                    Context context2 = this.f22003i;
                    boolean zM4538h2 = zM4534f3 | c1836h0.m4538h(context2);
                    InterfaceC1231l interfaceC1231l2 = this.f22004j;
                    boolean zM4534f4 = zM4538h2 | c1836h0.m4534f(interfaceC1231l2);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4534f4 || objM4514P2 == C1851l.f6155a) {
                        objM4514P2 = new C4744ba(context2, interfaceC1231l2, interfaceC1809a12);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9382M("使用所选模型", (InterfaceC1220a) objM4514P2, "返回", this.f22005k, null, null, c1836h0, 390, 48);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5479xm(InterfaceC1809a1 interfaceC1809a1, Context context, InterfaceC1231l interfaceC1231l, InterfaceC1220a interfaceC1220a) {
        this.f22002h = interfaceC1809a1;
        this.f22003i = context;
        this.f22004j = interfaceC1231l;
        this.f22005k = interfaceC1220a;
    }
}
