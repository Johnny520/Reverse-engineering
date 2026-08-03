package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import bb.C0250l;
import p007a7.AbstractC0018a;
import p080fb.AbstractC1184v0;
import p080fb.C1186w;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.xk */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5477xk implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21964g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f21965h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f21966i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f21967j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f21968k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f21969l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f21970m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f21971n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f21972o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f21973p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f21974q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f21975r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f21976s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f21977t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f21978u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5477xk(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113) {
        this.f21965h = context;
        this.f21966i = interfaceC1809a1;
        this.f21967j = interfaceC1809a12;
        this.f21968k = interfaceC1809a13;
        this.f21969l = interfaceC1809a14;
        this.f21970m = interfaceC1809a15;
        this.f21971n = interfaceC1809a16;
        this.f21972o = interfaceC1809a17;
        this.f21973p = interfaceC1809a18;
        this.f21974q = interfaceC1809a19;
        this.f21975r = interfaceC1809a110;
        this.f21976s = interfaceC1809a111;
        this.f21977t = interfaceC1809a112;
        this.f21978u = interfaceC1809a113;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        Object c3959f;
        int i9 = this.f21964g;
        C3967n c3967n = C3967n.f12976a;
        Object obj = this.f21978u;
        Context context = this.f21965h;
        switch (i9) {
            case 0:
                SharedPreferences.Editor editorPutString = ((SharedPreferences) obj).edit().putString("global_prefix", AbstractC3149m.m6701P0(8, AbstractC3149m.m6703R0((String) this.f21966i.getValue()).toString())).putString("gender_male_text", AbstractC3149m.m6701P0(12, AbstractC3149m.m6703R0((String) this.f21967j.getValue()).toString())).putString("gender_female_text", AbstractC3149m.m6701P0(12, AbstractC3149m.m6703R0((String) this.f21968k.getValue()).toString())).putString("gender_unknown_text", AbstractC3149m.m6701P0(12, AbstractC3149m.m6703R0((String) this.f21969l.getValue()).toString()));
                C3147k c3147k = C0250l.f693c;
                SharedPreferences.Editor editorPutString2 = editorPutString.putString("tail_color", AbstractC0018a.m246j((String) this.f21970m.getValue())).putString("bracket_color", AbstractC0018a.m246j((String) this.f21971n.getValue())).putString("gender_color", AbstractC0018a.m246j((String) this.f21972o.getValue())).putString("region_color", AbstractC0018a.m246j((String) this.f21973p.getValue()));
                Integer numM6742f0 = AbstractC3156t.m6742f0((String) this.f21974q.getValue());
                SharedPreferences.Editor editorPutInt = editorPutString2.putInt("tail_weight", AbstractC1184v0.m3198h(numM6742f0 != null ? numM6742f0.intValue() : 400));
                Integer numM6742f02 = AbstractC3156t.m6742f0((String) this.f21975r.getValue());
                SharedPreferences.Editor editorPutInt2 = editorPutInt.putInt("bracket_weight", AbstractC1184v0.m3198h(numM6742f02 != null ? numM6742f02.intValue() : 400));
                Integer numM6742f03 = AbstractC3156t.m6742f0((String) this.f21976s.getValue());
                SharedPreferences.Editor editorPutInt3 = editorPutInt2.putInt("gender_weight", AbstractC1184v0.m3198h(numM6742f03 != null ? numM6742f03.intValue() : 400));
                Integer numM6742f04 = AbstractC3156t.m6742f0((String) this.f21977t.getValue());
                editorPutInt3.putInt("region_weight", AbstractC1184v0.m3198h(numM6742f04 != null ? numM6742f04.intValue() : 400)).apply();
                Toast.makeText(context, "设置已保存", 0).show();
                break;
            default:
                InterfaceC1809a1 interfaceC1809a1 = this.f21966i;
                InterfaceC1809a1 interfaceC1809a12 = this.f21967j;
                InterfaceC1809a1 interfaceC1809a13 = this.f21968k;
                InterfaceC1809a1 interfaceC1809a14 = this.f21969l;
                InterfaceC1809a1 interfaceC1809a15 = this.f21970m;
                InterfaceC1809a1 interfaceC1809a16 = this.f21971n;
                InterfaceC1809a1 interfaceC1809a17 = this.f21972o;
                InterfaceC1809a1 interfaceC1809a18 = this.f21973p;
                InterfaceC1809a1 interfaceC1809a19 = this.f21974q;
                InterfaceC1809a1 interfaceC1809a110 = this.f21975r;
                InterfaceC1809a1 interfaceC1809a111 = this.f21976s;
                InterfaceC1809a1 interfaceC1809a112 = this.f21977t;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) obj;
                try {
                    C1186w.m3239w(context, C5491y2.m9768B0(interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, interfaceC1809a16, interfaceC1809a17, interfaceC1809a18, interfaceC1809a19, interfaceC1809a110));
                    C5491y2.m9851x0(interfaceC1809a111, interfaceC1809a112, interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, interfaceC1809a16, interfaceC1809a18, interfaceC1809a19, interfaceC1809a110, interfaceC1809a17, C1186w.m3223g(context, (String) interfaceC1809a111.getValue()));
                    int iIntValue = ((Number) interfaceC1809a113.getValue()).intValue();
                    interfaceC1809a113.setValue(Integer.valueOf(iIntValue + 1));
                    c3959f = Integer.valueOf(iIntValue);
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    String message = thM8182b.getMessage();
                    if (message == null) {
                        message = "删除配置失败";
                    }
                    Toast.makeText(context, message, 0).show();
                }
                break;
        }
        return c3967n;
    }

    public /* synthetic */ C5477xk(SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112) {
        this.f21978u = sharedPreferences;
        this.f21965h = context;
        this.f21966i = interfaceC1809a1;
        this.f21967j = interfaceC1809a12;
        this.f21968k = interfaceC1809a13;
        this.f21969l = interfaceC1809a14;
        this.f21970m = interfaceC1809a15;
        this.f21971n = interfaceC1809a16;
        this.f21972o = interfaceC1809a17;
        this.f21973p = interfaceC1809a18;
        this.f21974q = interfaceC1809a19;
        this.f21975r = interfaceC1809a110;
        this.f21976s = interfaceC1809a111;
        this.f21977t = interfaceC1809a112;
    }
}
