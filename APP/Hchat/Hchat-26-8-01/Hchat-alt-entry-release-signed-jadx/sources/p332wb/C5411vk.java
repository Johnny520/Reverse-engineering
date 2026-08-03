package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import okhttp3.HttpUrl;
import org.json.JSONException;
import p007a7.AbstractC0018a;
import p080fb.EnumC1182u2;
import p085fg.InterfaceC1220a;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import tf.AbstractC4156d0;
import tf.C4173t;

/* JADX INFO: renamed from: wb.vk */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5411vk implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21437g = 3;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f21438h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f21439i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f21440j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f21441k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f21442l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f21443m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f21444n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f21445o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f21446p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f21447q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f21448r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f21449s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f21450t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f21451u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f21452v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f21453w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5411vk(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, C1845j1 c1845j1, C1845j1 c1845j12, C4731au c4731au) {
        this.f21452v = c4731au;
        this.f21438h = interfaceC1809a1;
        this.f21453w = context;
        this.f21439i = interfaceC1809a12;
        this.f21440j = interfaceC1809a13;
        this.f21441k = interfaceC1809a14;
        this.f21442l = interfaceC1809a15;
        this.f21443m = interfaceC1809a16;
        this.f21444n = interfaceC1809a17;
        this.f21445o = interfaceC1809a18;
        this.f21446p = interfaceC1809a19;
        this.f21447q = interfaceC1809a110;
        this.f21448r = interfaceC1809a111;
        this.f21449s = interfaceC1809a112;
        this.f21450t = c1845j1;
        this.f21451u = c1845j12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() throws JSONException {
        C1845j1 c1845j1;
        InterfaceC1809a1 interfaceC1809a1;
        switch (this.f21437g) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f21452v;
                Context context = (Context) this.f21453w;
                InterfaceC1809a1 interfaceC1809a12 = this.f21438h;
                String strM245i = AbstractC0018a.m245i((String) interfaceC1809a12.getValue());
                if (strM245i.length() == 0) {
                    strM245i = "#00000000";
                }
                InterfaceC1809a1 interfaceC1809a13 = this.f21439i;
                String strM245i2 = AbstractC0018a.m245i((String) interfaceC1809a13.getValue());
                if (strM245i2.length() == 0) {
                    strM245i2 = "#FFFF0000";
                }
                InterfaceC1809a1 interfaceC1809a14 = this.f21440j;
                String strM245i3 = AbstractC0018a.m245i((String) interfaceC1809a14.getValue());
                String str = strM245i3.length() != 0 ? strM245i3 : "#00000000";
                InterfaceC1809a1 interfaceC1809a15 = this.f21441k;
                String strM245i4 = AbstractC0018a.m245i((String) interfaceC1809a15.getValue());
                String str2 = strM245i4.length() != 0 ? strM245i4 : "#FFFF0000";
                InterfaceC1809a1 interfaceC1809a16 = this.f21442l;
                String str3 = (String) interfaceC1809a16.getValue();
                if (!AbstractC4156d0.m8355W("message_bottom", "avatar_above", "avatar_below").contains(str3)) {
                    str3 = null;
                }
                String str4 = str3 != null ? str3 : "message_bottom";
                InterfaceC1809a1 interfaceC1809a17 = this.f21443m;
                Integer numM6742f0 = AbstractC3156t.m6742f0((String) interfaceC1809a17.getValue());
                int iM7909r = AbstractC3754e0.m7909r(numM6742f0 != null ? numM6742f0.intValue() : 2, 0, 64);
                SharedPreferences.Editor editorPutString = sharedPreferences.edit().putBoolean("message_details_enable", ((Boolean) this.f21444n.getValue()).booleanValue()).putString("message_details_light_bg", strM245i).putString("message_details_light_text", strM245i2).putString("message_details_dark_bg", str).putString("message_details_dark_text", str2);
                String str5 = (String) this.f21445o.getValue();
                if (AbstractC3149m.m6721t0(str5)) {
                    str5 = "${time}";
                }
                SharedPreferences.Editor editorPutString2 = editorPutString.putString("message_details_format", str5);
                String str6 = (String) this.f21446p.getValue();
                if (AbstractC3149m.m6721t0(str6)) {
                    str6 = "HH:mm:ss";
                }
                SharedPreferences.Editor editorPutInt = editorPutString2.putString("message_details_time_format", str6).putString("message_details_position", str4).putInt("message_details_avatar_gap", iM7909r);
                Integer numM6742f02 = AbstractC3156t.m6742f0((String) this.f21447q.getValue());
                SharedPreferences.Editor editorPutInt2 = editorPutInt.putInt("message_details_left_margin", numM6742f02 != null ? numM6742f02.intValue() : 64);
                Integer numM6742f03 = AbstractC3156t.m6742f0((String) this.f21448r.getValue());
                SharedPreferences.Editor editorPutInt3 = editorPutInt2.putInt("message_details_right_margin", numM6742f03 != null ? numM6742f03.intValue() : 64);
                Integer numM6742f04 = AbstractC3156t.m6742f0((String) this.f21449s.getValue());
                editorPutInt3.putInt("message_details_text_size", numM6742f04 != null ? numM6742f04.intValue() : 10).putBoolean("message_details_click_show", ((Boolean) this.f21450t.getValue()).booleanValue()).putBoolean("message_details_format_content", ((Boolean) this.f21451u.getValue()).booleanValue()).apply();
                interfaceC1809a12.setValue(strM245i);
                interfaceC1809a13.setValue(strM245i2);
                interfaceC1809a14.setValue(str);
                interfaceC1809a15.setValue(str2);
                interfaceC1809a16.setValue(str4);
                interfaceC1809a17.setValue(String.valueOf(iM7909r));
                Toast.makeText(context, "设置已保存", 0).show();
                break;
            case 1:
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f21452v;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f21453w;
                if (((String) this.f21438h.getValue()) == null && ((String) this.f21439i.getValue()) == null && !((Boolean) this.f21440j.getValue()).booleanValue() && !((Boolean) this.f21441k.getValue()).booleanValue() && ((String) this.f21442l.getValue()) == null) {
                    this.f21443m.setValue(null);
                    this.f21444n.setValue(null);
                    this.f21445o.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    InterfaceC1809a1 interfaceC1809a110 = this.f21446p;
                    C4173t c4173t = C4173t.f13710g;
                    interfaceC1809a110.setValue(c4173t);
                    this.f21447q.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    this.f21448r.setValue(c4173t);
                    this.f21449s.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    this.f21450t.setValue(null);
                    this.f21451u.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    interfaceC1809a18.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    interfaceC1809a19.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                }
                return C3967n.f12976a;
            case 2:
                C5491y2.m9854z0((Context) this.f21453w, (C5453wt) this.f21452v, this.f21438h, this.f21439i, (C1845j1) this.f21447q, (C1845j1) this.f21448r, this.f21440j, (C1845j1) this.f21449s, this.f21441k, this.f21442l, this.f21443m, (C1845j1) this.f21450t, (C1845j1) this.f21451u, this.f21444n, this.f21445o, this.f21446p);
                break;
            default:
                C4731au c4731au = (C4731au) this.f21452v;
                Context context2 = (Context) this.f21453w;
                C1845j1 c1845j12 = (C1845j1) this.f21450t;
                C1845j1 c1845j13 = (C1845j1) this.f21451u;
                InterfaceC1809a1 interfaceC1809a111 = this.f21438h;
                if (((Boolean) interfaceC1809a111.getValue()).booleanValue()) {
                    interfaceC1809a1 = interfaceC1809a111;
                    c1845j1 = c1845j13;
                    C5491y2.m9846v1(context2, this.f21439i, this.f21440j, this.f21441k, this.f21442l, this.f21443m, this.f21444n, this.f21445o, this.f21446p, this.f21447q, this.f21448r, this.f21449s, "always_allow");
                } else {
                    c1845j1 = c1845j13;
                    interfaceC1809a1 = interfaceC1809a111;
                }
                c1845j12.setValue(Boolean.FALSE);
                c1845j1.setValue(null);
                c4731au.m9244a(((Boolean) interfaceC1809a1.getValue()).booleanValue() ? EnumC1182u2.f3974i : EnumC1182u2.f3973h);
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5411vk(Context context, C5453wt c5453wt, C1845j1 c1845j1, C1845j1 c1845j12, C1845j1 c1845j13, C1845j1 c1845j14, C1845j1 c1845j15, C1845j1 c1845j16, C1845j1 c1845j17, C1845j1 c1845j18, C1845j1 c1845j19, C1845j1 c1845j110, C1845j1 c1845j111, C1845j1 c1845j112, C1845j1 c1845j113, C1845j1 c1845j114) {
        this.f21453w = context;
        this.f21452v = c5453wt;
        this.f21438h = c1845j1;
        this.f21439i = c1845j12;
        this.f21447q = c1845j13;
        this.f21448r = c1845j14;
        this.f21440j = c1845j15;
        this.f21449s = c1845j16;
        this.f21441k = c1845j17;
        this.f21442l = c1845j18;
        this.f21443m = c1845j19;
        this.f21450t = c1845j110;
        this.f21451u = c1845j111;
        this.f21444n = c1845j112;
        this.f21445o = c1845j113;
        this.f21446p = c1845j114;
    }

    public /* synthetic */ C5411vk(SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114) {
        this.f21452v = sharedPreferences;
        this.f21453w = context;
        this.f21438h = interfaceC1809a1;
        this.f21439i = interfaceC1809a12;
        this.f21440j = interfaceC1809a13;
        this.f21441k = interfaceC1809a14;
        this.f21442l = interfaceC1809a15;
        this.f21443m = interfaceC1809a16;
        this.f21444n = interfaceC1809a17;
        this.f21445o = interfaceC1809a18;
        this.f21446p = interfaceC1809a19;
        this.f21447q = interfaceC1809a110;
        this.f21448r = interfaceC1809a111;
        this.f21449s = interfaceC1809a112;
        this.f21450t = interfaceC1809a113;
        this.f21451u = interfaceC1809a114;
    }

    public /* synthetic */ C5411vk(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116) {
        this.f21438h = interfaceC1809a1;
        this.f21439i = interfaceC1809a12;
        this.f21440j = interfaceC1809a13;
        this.f21441k = interfaceC1809a14;
        this.f21442l = interfaceC1809a15;
        this.f21443m = interfaceC1809a16;
        this.f21444n = interfaceC1809a17;
        this.f21445o = interfaceC1809a18;
        this.f21446p = interfaceC1809a19;
        this.f21447q = interfaceC1809a110;
        this.f21448r = interfaceC1809a111;
        this.f21449s = interfaceC1809a112;
        this.f21450t = interfaceC1809a113;
        this.f21451u = interfaceC1809a114;
        this.f21452v = interfaceC1809a115;
        this.f21453w = interfaceC1809a116;
    }
}
