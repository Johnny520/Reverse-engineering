package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import org.json.JSONException;
import p080fb.C1183v;
import p080fb.C1186w;
import p085fg.InterfaceC1231l;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.ik */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4983ik implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17906g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f17907h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f17908i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f17909j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f17910k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f17911l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f17912m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f17913n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f17914o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f17915p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f17916q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f17917r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f17918s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f17919t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4983ik(Context context, C1845j1 c1845j1, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111) {
        this.f17918s = context;
        this.f17919t = c1845j1;
        this.f17907h = interfaceC1809a1;
        this.f17908i = interfaceC1809a12;
        this.f17909j = interfaceC1809a13;
        this.f17910k = interfaceC1809a14;
        this.f17911l = interfaceC1809a15;
        this.f17912m = interfaceC1809a16;
        this.f17913n = interfaceC1809a17;
        this.f17914o = interfaceC1809a18;
        this.f17915p = interfaceC1809a19;
        this.f17916q = interfaceC1809a110;
        this.f17917r = interfaceC1809a111;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) throws JSONException {
        switch (this.f17906g) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f17918s;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19578F5, 3);
                InterfaceC1809a1 interfaceC1809a1 = this.f17907h;
                C3623h.m7604a(c3623h, null, new C3874d(716715725, new C5403vc(sharedPreferences, interfaceC1809a1, 4), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19585G5, 3);
                C3623h.m7604a(c3623h, null, new C3874d(2013170639, new C4873f8(this.f17908i, this.f17909j, interfaceC1809a1, this.f17910k, 4), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19592H5, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-985341743, new C5370uc(this.f17911l, this.f17912m, this.f17913n, this.f17914o, interfaceC1809a1, this.f17915p, this.f17916q, this.f17917r, this.f17919t), true), 3);
                break;
            default:
                Context context = (Context) this.f17918s;
                C1845j1 c1845j1 = (C1845j1) this.f17919t;
                String str = (String) obj;
                str.getClass();
                boolean zBooleanValue = ((Boolean) c1845j1.getValue()).booleanValue();
                InterfaceC1809a1 interfaceC1809a12 = this.f17907h;
                InterfaceC1809a1 interfaceC1809a13 = this.f17908i;
                InterfaceC1809a1 interfaceC1809a14 = this.f17909j;
                InterfaceC1809a1 interfaceC1809a15 = this.f17910k;
                C1186w.m3239w(context, C1183v.m3168a(C5491y2.m9768B0(interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, this.f17911l, this.f17912m, this.f17913n, this.f17914o, this.f17915p, this.f17916q), null, null, str, null, 0, false, null, null, null, 2039));
                interfaceC1809a15.setValue(str);
                this.f17917r.setValue(Boolean.FALSE);
                Toast.makeText(context, zBooleanValue ? "已切换模型，将用于下一次请求" : "已切换模型", 0).show();
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4983ik(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112) {
        this.f17918s = sharedPreferences;
        this.f17907h = interfaceC1809a1;
        this.f17908i = interfaceC1809a12;
        this.f17909j = interfaceC1809a13;
        this.f17910k = interfaceC1809a14;
        this.f17911l = interfaceC1809a15;
        this.f17912m = interfaceC1809a16;
        this.f17913n = interfaceC1809a17;
        this.f17914o = interfaceC1809a18;
        this.f17915p = interfaceC1809a19;
        this.f17916q = interfaceC1809a110;
        this.f17917r = interfaceC1809a111;
        this.f17919t = interfaceC1809a112;
    }
}
