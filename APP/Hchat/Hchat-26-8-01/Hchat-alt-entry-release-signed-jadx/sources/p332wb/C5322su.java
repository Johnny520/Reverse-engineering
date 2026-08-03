package p332wb;

import android.app.Activity;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p266s0.AbstractC3879i;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.su */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5322su implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20724g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f20725h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f20726i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f20727j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5322su(Activity activity, String str, String str2) {
        this.f20727j = activity;
        this.f20725h = str;
        this.f20726i = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f20724g) {
            case 0:
                Activity activity = (Activity) this.f20727j;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                interfaceC1220a.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1836h0.m4538h(interfaceC1220a) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zM4538h = c1836h0.m4538h(activity) | c1836h0.m4534f("检测到微信异常");
                    String str = this.f20725h;
                    boolean zM4534f = zM4538h | c1836h0.m4534f(str);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        objM4514P = new C5475xi(activity, 20, str);
                        c1836h0.m4545k0(objM4514P);
                    }
                    InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P;
                    C5491y2.f22068p.m9866J("检测到微信异常", EnumC5092lv.f18823i, interfaceC1220a, AbstractC3879i.m8071e(-990295983, new C5278rj(interfaceC1220a2, (Object) this.f20726i, interfaceC1220a, 23), c1836h0), c1836h0, ((iIntValue << 9) & 7168) | 221574);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                EnumC5092lv enumC5092lv = (EnumC5092lv) this.f20727j;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC1220a3.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h02.m4538h(interfaceC1220a3) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    C5491y2.f22068p.m9866J(this.f20725h, enumC5092lv, interfaceC1220a3, AbstractC3879i.m8071e(-1516152565, new C5274rf(this.f20726i, interfaceC1220a3, 1), c1836h02), c1836h02, ((iIntValue2 << 9) & 7168) | 221190);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5322su(String str, EnumC5092lv enumC5092lv, String str2) {
        this.f20725h = str;
        this.f20727j = enumC5092lv;
        this.f20726i = str2;
    }
}
