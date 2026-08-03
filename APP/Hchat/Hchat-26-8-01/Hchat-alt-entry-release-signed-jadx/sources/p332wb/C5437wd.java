package p332wb;

import java.util.Set;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1236q;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p222p.AbstractC3199a;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3259u;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p356y0.C5850l;
import sh.AbstractC4045s;

/* JADX INFO: renamed from: wb.wd */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5437wd implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21667g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f21668h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ContactLabelBean f21669i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f21670j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5437wd(String str, ContactLabelBean contactLabelBean, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f21667g = i9;
        this.f21668h = str;
        this.f21669i = contactLabelBean;
        this.f21670j = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f21667g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC4045s.m8239c(AbstractC3208d.m6883m(AbstractC3222h1.m6901d(C5850l.f23787a, 1.0f), 12, 3), 14, AbstractC3879i.m8071e(-1209703293, new C5437wd(this.f21668h, this.f21669i, this.f21670j, 1), c1836h0), c1836h0, 24630);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C3259u) obj).getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String strM6836i = AbstractC3199a.m6836i(this.f21669i.userNameList.size(), " 人");
                    InterfaceC1809a1 interfaceC1809a1 = this.f21670j;
                    Set set = (Set) interfaceC1809a1.getValue();
                    String str = this.f21668h;
                    boolean zContains = set.contains(str);
                    boolean zM4534f = c1836h02.m4534f(str);
                    Object objM4514P = c1836h02.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        objM4514P = new C4751bh(str, interfaceC1809a1, 0);
                        c1836h02.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9708y(str, strM6836i, zContains, (InterfaceC1220a) objM4514P, c1836h02, 0);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
