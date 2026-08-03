package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.t9 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5334t9 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20767g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f20768h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f20769i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20770j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f20771k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f20772l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f20773m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f20774n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f20775o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f20776p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f20777q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f20778r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f20779s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f20780t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f20781u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f20782v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f20783w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5334t9(Object obj, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, int i9) {
        this.f20767g = i9;
        this.f20768h = obj;
        this.f20769i = interfaceC1809a1;
        this.f20770j = interfaceC1809a12;
        this.f20771k = interfaceC1809a13;
        this.f20772l = interfaceC1809a14;
        this.f20773m = interfaceC1809a15;
        this.f20774n = interfaceC1809a16;
        this.f20775o = interfaceC1809a17;
        this.f20776p = interfaceC1809a18;
        this.f20777q = interfaceC1809a19;
        this.f20778r = interfaceC1809a110;
        this.f20779s = interfaceC1809a111;
        this.f20780t = interfaceC1809a112;
        this.f20781u = interfaceC1809a113;
        this.f20782v = interfaceC1809a114;
        this.f20783w = interfaceC1809a115;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        InterfaceC1220a interfaceC1220a;
        C1836h0 c1836h0;
        switch (this.f20767g) {
            case 0:
                Context context = (Context) this.f20768h;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f20782v;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f20783w;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h02.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1588882479, new C5433w9(context, this.f20769i, this.f20770j, this.f20771k, this.f20772l, this.f20773m, this.f20774n, this.f20775o, this.f20776p, this.f20777q, this.f20778r, this.f20779s, this.f20780t, this.f20781u, interfaceC1809a1, interfaceC1809a12, 1), c1836h02), c1836h02, 48, 1);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 1:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f20783w;
                Context context2 = (Context) this.f20768h;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f20782v;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h03.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-71055701, new C5433w9(sharedPreferences, context2, this.f20769i, this.f20770j, this.f20771k, this.f20772l, this.f20773m, this.f20774n, this.f20775o, this.f20776p, this.f20777q, this.f20778r, this.f20779s, this.f20780t, this.f20781u, interfaceC1809a13), c1836h03), c1836h03, 48, 1);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 2:
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f20782v;
                Context context3 = (Context) this.f20768h;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f20783w;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h04.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean zM4538h = c1836h04.m4538h(sharedPreferences2) | c1836h04.m4538h(context3);
                    Object objM4514P = c1836h04.m4514P();
                    if (zM4538h || objM4514P == C1851l.f6155a) {
                        interfaceC1220a = interfaceC1220a2;
                        c1836h0 = c1836h04;
                        C5305sd c5305sd = new C5305sd(sharedPreferences2, context3, this.f20769i, this.f20770j, this.f20771k, this.f20772l, this.f20773m, this.f20774n, this.f20775o, this.f20776p, this.f20777q, this.f20778r, this.f20779s, this.f20780t, this.f20781u);
                        c1836h0.m4545k0(c5305sd);
                        objM4514P = c5305sd;
                    } else {
                        interfaceC1220a = interfaceC1220a2;
                        c1836h0 = c1836h04;
                    }
                    AbstractC4955ho.m9382M("保存设置", (InterfaceC1220a) objM4514P, "返回", interfaceC1220a, null, null, c1836h0, 390, 48);
                } else {
                    c1836h04.m4519V();
                }
                break;
            default:
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f20768h;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f20782v;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f20783w;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h05.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1419875535, new C5433w9(sharedPreferences3, this.f20769i, this.f20770j, this.f20771k, this.f20772l, this.f20773m, this.f20774n, this.f20775o, this.f20776p, this.f20777q, this.f20778r, this.f20779s, this.f20780t, this.f20781u, interfaceC1809a14, interfaceC1809a15, 0), c1836h05), c1836h05, 48, 1);
                } else {
                    c1836h05.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5334t9(SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114) {
        this.f20767g = 1;
        this.f20783w = sharedPreferences;
        this.f20768h = context;
        this.f20769i = interfaceC1809a1;
        this.f20770j = interfaceC1809a12;
        this.f20771k = interfaceC1809a13;
        this.f20772l = interfaceC1809a14;
        this.f20773m = interfaceC1809a15;
        this.f20774n = interfaceC1809a16;
        this.f20775o = interfaceC1809a17;
        this.f20776p = interfaceC1809a18;
        this.f20777q = interfaceC1809a19;
        this.f20778r = interfaceC1809a110;
        this.f20779s = interfaceC1809a111;
        this.f20780t = interfaceC1809a112;
        this.f20781u = interfaceC1809a113;
        this.f20782v = interfaceC1809a114;
    }

    public /* synthetic */ C5334t9(SharedPreferences sharedPreferences, Context context, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113) {
        this.f20767g = 2;
        this.f20782v = sharedPreferences;
        this.f20768h = context;
        this.f20783w = interfaceC1220a;
        this.f20769i = interfaceC1809a1;
        this.f20770j = interfaceC1809a12;
        this.f20771k = interfaceC1809a13;
        this.f20772l = interfaceC1809a14;
        this.f20773m = interfaceC1809a15;
        this.f20774n = interfaceC1809a16;
        this.f20775o = interfaceC1809a17;
        this.f20776p = interfaceC1809a18;
        this.f20777q = interfaceC1809a19;
        this.f20778r = interfaceC1809a110;
        this.f20779s = interfaceC1809a111;
        this.f20780t = interfaceC1809a112;
        this.f20781u = interfaceC1809a113;
    }
}
