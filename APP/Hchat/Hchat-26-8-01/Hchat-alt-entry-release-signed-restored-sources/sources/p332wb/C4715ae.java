package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import p007a7.AbstractC0018a;
import p085fg.InterfaceC1220a;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import p345x8.C5725r;

/* JADX INFO: renamed from: wb.ae */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4715ae implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15753g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f15754h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f15755i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f15756j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f15757k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f15758l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f15759m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f15760n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f15761o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f15762p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f15763q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f15764r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f15765s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f15766t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4715ae(SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111) {
        this.f15754h = sharedPreferences;
        this.f15755i = context;
        this.f15756j = interfaceC1809a1;
        this.f15757k = interfaceC1809a12;
        this.f15758l = interfaceC1809a13;
        this.f15759m = interfaceC1809a14;
        this.f15760n = interfaceC1809a15;
        this.f15761o = interfaceC1809a16;
        this.f15762p = interfaceC1809a17;
        this.f15763q = interfaceC1809a18;
        this.f15764r = interfaceC1809a19;
        this.f15765s = interfaceC1809a110;
        this.f15766t = interfaceC1809a111;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f15753g) {
            case 0:
                C5725r c5725r = (C5725r) this.f15766t;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f15754h;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f15765s;
                InterfaceC1809a1 interfaceC1809a12 = this.f15756j;
                String str = (String) interfaceC1809a12.getValue();
                boolean zM6721t0 = AbstractC3149m.m6721t0(str);
                Context context = this.f15755i;
                if (zM6721t0) {
                    Toast.makeText(context, "请选择配置", 0).show();
                } else {
                    InterfaceC1809a1 interfaceC1809a13 = this.f15757k;
                    if (str.equals((String) interfaceC1809a13.getValue())) {
                        interfaceC1809a12.setValue((String) interfaceC1809a13.getValue());
                        Toast.makeText(context, "已是当前配置", 0).show();
                    } else {
                        AbstractC4955ho.m9665t(c5725r, sharedPreferences, context, this.f15758l, this.f15759m, this.f15760n, this.f15761o, this.f15762p, this.f15763q, this.f15764r, interfaceC1809a1, interfaceC1809a13, false);
                        c5725r.m10394n(str, c5725r.m10396p());
                        interfaceC1809a1.setValue(c5725r.m10396p());
                        interfaceC1809a13.setValue(c5725r.m10382b());
                        interfaceC1809a12.setValue((String) interfaceC1809a13.getValue());
                        Toast.makeText(context, "已切换到 " + ((String) interfaceC1809a13.getValue()), 0).show();
                    }
                }
                return C3967n.f12976a;
            case 1:
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f15754h;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f15765s;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f15766t;
                SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                String strM247k = AbstractC0018a.m247k((String) this.f15756j.getValue());
                if (strM247k.length() == 0) {
                    strM247k = "群主";
                }
                SharedPreferences.Editor editorPutString = editorEdit.putString("owner_title", strM247k);
                String strM247k2 = AbstractC0018a.m247k((String) this.f15757k.getValue());
                if (strM247k2.length() == 0) {
                    strM247k2 = "管理员";
                }
                SharedPreferences.Editor editorPutString2 = editorPutString.putString("admin_title", strM247k2);
                String strM247k3 = AbstractC0018a.m247k((String) this.f15758l.getValue());
                if (strM247k3.length() == 0) {
                    strM247k3 = "群员";
                }
                SharedPreferences.Editor editorPutString3 = editorPutString2.putString("member_title", strM247k3);
                String strM246j = AbstractC0018a.m246j((String) this.f15759m.getValue());
                if (strM246j.length() == 0) {
                    strM246j = "#F59E0B";
                }
                SharedPreferences.Editor editorPutString4 = editorPutString3.putString("owner_color", strM246j);
                String strM246j2 = AbstractC0018a.m246j((String) this.f15760n.getValue());
                if (strM246j2.length() == 0) {
                    strM246j2 = "#22C55E";
                }
                SharedPreferences.Editor editorPutString5 = editorPutString4.putString("admin_color", strM246j2);
                String strM246j3 = AbstractC0018a.m246j((String) this.f15761o.getValue());
                if (strM246j3.length() == 0) {
                    strM246j3 = "#64748B";
                }
                SharedPreferences.Editor editorPutString6 = editorPutString5.putString("member_color", strM246j3);
                String strM246j4 = AbstractC0018a.m246j((String) this.f15762p.getValue());
                if (strM246j4.length() == 0) {
                    strM246j4 = "#2563EB";
                }
                SharedPreferences.Editor editorPutString7 = editorPutString6.putString("custom_color", strM246j4);
                String strM246j5 = AbstractC0018a.m246j((String) this.f15763q.getValue());
                if (strM246j5.length() == 0) {
                    strM246j5 = "#FFFFFF";
                }
                SharedPreferences.Editor editorPutString8 = editorPutString7.putString("owner_text_color", strM246j5);
                String strM246j6 = AbstractC0018a.m246j((String) this.f15764r.getValue());
                if (strM246j6.length() == 0) {
                    strM246j6 = "#FFFFFF";
                }
                SharedPreferences.Editor editorPutString9 = editorPutString8.putString("admin_text_color", strM246j6);
                String strM246j7 = AbstractC0018a.m246j((String) interfaceC1809a14.getValue());
                if (strM246j7.length() == 0) {
                    strM246j7 = "#FFFFFF";
                }
                SharedPreferences.Editor editorPutString10 = editorPutString9.putString("member_text_color", strM246j7);
                String strM246j8 = AbstractC0018a.m246j((String) interfaceC1809a15.getValue());
                editorPutString10.putString("custom_text_color", strM246j8.length() != 0 ? strM246j8 : "#FFFFFF").apply();
                Toast.makeText(this.f15755i, "设置已保存", 0).show();
                break;
            default:
                C5491y2.m9833k1((C1845j1) this.f15764r, this.f15756j, (String) this.f15765s, this.f15755i, (C5518yt) this.f15766t, (C1845j1) this.f15754h, this.f15757k, this.f15758l, this.f15759m, this.f15760n, this.f15761o, this.f15762p, this.f15763q, true);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4715ae(InterfaceC1809a1 interfaceC1809a1, Context context, C5725r c5725r, InterfaceC1809a1 interfaceC1809a12, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110) {
        this.f15756j = interfaceC1809a1;
        this.f15755i = context;
        this.f15766t = c5725r;
        this.f15757k = interfaceC1809a12;
        this.f15754h = sharedPreferences;
        this.f15758l = interfaceC1809a13;
        this.f15759m = interfaceC1809a14;
        this.f15760n = interfaceC1809a15;
        this.f15761o = interfaceC1809a16;
        this.f15762p = interfaceC1809a17;
        this.f15763q = interfaceC1809a18;
        this.f15764r = interfaceC1809a19;
        this.f15765s = interfaceC1809a110;
    }

    public /* synthetic */ C4715ae(C1845j1 c1845j1, C1845j1 c1845j12, String str, Context context, C5518yt c5518yt, C1845j1 c1845j13, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17) {
        this.f15764r = c1845j1;
        this.f15756j = c1845j12;
        this.f15765s = str;
        this.f15755i = context;
        this.f15766t = c5518yt;
        this.f15754h = c1845j13;
        this.f15757k = interfaceC1809a1;
        this.f15758l = interfaceC1809a12;
        this.f15759m = interfaceC1809a13;
        this.f15760n = interfaceC1809a14;
        this.f15761o = interfaceC1809a15;
        this.f15762p = interfaceC1809a16;
        this.f15763q = interfaceC1809a17;
    }
}
