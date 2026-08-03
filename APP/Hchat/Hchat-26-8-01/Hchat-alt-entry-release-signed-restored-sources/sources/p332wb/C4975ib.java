package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.ib */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4975ib implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17855g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f17856h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f17857i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1220a f17858j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f17859k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f17860l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4975ib(SharedPreferences sharedPreferences, Context context, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f17855g = i9;
        this.f17856h = sharedPreferences;
        this.f17857i = context;
        this.f17858j = interfaceC1220a;
        this.f17859k = interfaceC1809a1;
        this.f17860l = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f17855g;
        InterfaceC4209a interfaceC4209a = (InterfaceC4209a) obj;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i9) {
            case 0:
                interfaceC4209a.getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    SharedPreferences sharedPreferences = this.f17856h;
                    boolean zM4538h = c1836h0.m4538h(sharedPreferences);
                    Context context = this.f17857i;
                    boolean zM4538h2 = zM4538h | c1836h0.m4538h(context);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4538h2 || objM4514P == C1851l.f6155a) {
                        C5468xb c5468xb = new C5468xb(2, context, sharedPreferences, this.f17859k, this.f17860l);
                        c1836h0.m4545k0(c5468xb);
                        objM4514P = c5468xb;
                    }
                    AbstractC4955ho.m9382M("保存设置", (InterfaceC1220a) objM4514P, "返回", this.f17858j, null, null, c1836h0, 390, 48);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                interfaceC4209a.getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    SharedPreferences sharedPreferences2 = this.f17856h;
                    boolean zM4538h3 = c1836h0.m4538h(sharedPreferences2);
                    Context context2 = this.f17857i;
                    boolean zM4538h4 = zM4538h3 | c1836h0.m4538h(context2);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4538h4 || objM4514P2 == C1851l.f6155a) {
                        C5468xb c5468xb2 = new C5468xb(3, context2, sharedPreferences2, this.f17859k, this.f17860l);
                        c1836h0.m4545k0(c5468xb2);
                        objM4514P2 = c5468xb2;
                    }
                    AbstractC4955ho.m9382M("保存设置", (InterfaceC1220a) objM4514P2, "返回", this.f17858j, null, null, c1836h0, 390, 48);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
