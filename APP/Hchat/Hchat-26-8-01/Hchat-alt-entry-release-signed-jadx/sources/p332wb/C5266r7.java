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

/* JADX INFO: renamed from: wb.r7 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5266r7 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20341g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f20342h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SharedPreferences f20343i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1220a f20344j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f20345k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f20346l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f20347m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f20348n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5266r7(Context context, SharedPreferences sharedPreferences, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f20342h = context;
        this.f20343i = sharedPreferences;
        this.f20344j = interfaceC1220a;
        this.f20345k = interfaceC1809a1;
        this.f20346l = interfaceC1809a12;
        this.f20347m = interfaceC1809a13;
        this.f20348n = interfaceC1809a14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f20341g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    SharedPreferences sharedPreferences = this.f20343i;
                    boolean zM4538h = c1836h0.m4538h(sharedPreferences);
                    Context context = this.f20342h;
                    boolean zM4538h2 = zM4538h | c1836h0.m4538h(context);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4538h2 || objM4514P == C1851l.f6155a) {
                        C5345tk c5345tk = new C5345tk(sharedPreferences, context, this.f20345k, this.f20346l, this.f20347m, this.f20348n);
                        c1836h0.m4545k0(c5345tk);
                        objM4514P = c5345tk;
                    }
                    AbstractC4955ho.m9382M("保存设置", (InterfaceC1220a) objM4514P, "返回", this.f20344j, null, null, c1836h0, 390, 48);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Context context2 = this.f20342h;
                    boolean zM4538h3 = c1836h02.m4538h(context2);
                    SharedPreferences sharedPreferences2 = this.f20343i;
                    boolean zM4538h4 = zM4538h3 | c1836h02.m4538h(sharedPreferences2);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4538h4 || objM4514P2 == C1851l.f6155a) {
                        C5345tk c5345tk2 = new C5345tk(context2, sharedPreferences2, this.f20345k, this.f20346l, this.f20347m, this.f20348n);
                        c1836h02.m4545k0(c5345tk2);
                        objM4514P2 = c5345tk2;
                    }
                    AbstractC4955ho.m9382M("保存设置", (InterfaceC1220a) objM4514P2, "返回", this.f20344j, null, null, c1836h02, 390, 48);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5266r7(SharedPreferences sharedPreferences, Context context, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f20343i = sharedPreferences;
        this.f20342h = context;
        this.f20344j = interfaceC1220a;
        this.f20345k = interfaceC1809a1;
        this.f20346l = interfaceC1809a12;
        this.f20347m = interfaceC1809a13;
        this.f20348n = interfaceC1809a14;
    }
}
