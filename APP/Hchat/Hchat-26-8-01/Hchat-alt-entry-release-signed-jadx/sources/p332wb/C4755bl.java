package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import p036c9.C0443h0;
import p036c9.C0455k0;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.bl */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4755bl implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16080g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f16081h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f16082i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ SharedPreferences f16083j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f16084k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f16085l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f16086m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f16087n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f16088o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f16089p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f16090q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4755bl(Context context, InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f16081h = context;
        this.f16082i = interfaceC1809a1;
        this.f16083j = sharedPreferences;
        this.f16084k = interfaceC1809a12;
        this.f16085l = interfaceC1809a13;
        this.f16086m = interfaceC1809a14;
        this.f16087n = interfaceC1809a15;
        this.f16088o = interfaceC1809a16;
        this.f16089p = interfaceC1809a17;
        this.f16090q = interfaceC1809a18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f16080g) {
            case 0:
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19594I0, 3);
                SharedPreferences sharedPreferences = this.f16083j;
                Context context = this.f16081h;
                C3623h.m7604a(c3623h, null, new C3874d(-1605887223, new C5370uc(sharedPreferences, context, this.f16082i, this.f16084k, this.f16085l, this.f16086m, this.f16087n, this.f16088o, this.f16089p), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19601J0, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-2005393653, new C5170oa(context, this.f16090q, 3), true), 3);
                break;
            default:
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19914z0, 3);
                Context context2 = this.f16081h;
                InterfaceC1809a1 interfaceC1809a1 = this.f16082i;
                C3623h.m7604a(c3623h2, null, new C3874d(687568363, new C5170oa(context2, interfaceC1809a1, 0), true), 3);
                if (((Boolean) interfaceC1809a1.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19538A0, 3);
                    SharedPreferences sharedPreferences2 = this.f16083j;
                    C3623h.m7604a(c3623h2, null, new C3874d(2098684528, new C5203pa(sharedPreferences2, this.f16084k, this.f16085l, this.f16086m, 0), true), 3);
                    C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19545B0, 3);
                    C3623h.m7604a(c3623h2, null, new C3874d(2083923886, new C0455k0(context2, sharedPreferences2, this.f16087n, this.f16088o, 8), true), 3);
                    C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19552C0, 3);
                    C3623h.m7604a(c3623h2, null, new C3874d(2069163244, new C0443h0(this.f16089p, context2, this.f16090q, 9), true), 3);
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4755bl(SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f16083j = sharedPreferences;
        this.f16081h = context;
        this.f16082i = interfaceC1809a1;
        this.f16084k = interfaceC1809a12;
        this.f16085l = interfaceC1809a13;
        this.f16086m = interfaceC1809a14;
        this.f16087n = interfaceC1809a15;
        this.f16088o = interfaceC1809a16;
        this.f16089p = interfaceC1809a17;
        this.f16090q = interfaceC1809a18;
    }
}
