package p332wb;

import ac.AbstractC0063p;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Locale;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.tk */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5345tk implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20887g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f20888h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SharedPreferences f20889i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20890j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f20891k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f20892l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f20893m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5345tk(Context context, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f20888h = context;
        this.f20889i = sharedPreferences;
        this.f20890j = interfaceC1809a1;
        this.f20891k = interfaceC1809a12;
        this.f20892l = interfaceC1809a13;
        this.f20893m = interfaceC1809a14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b A[PHI: r1
  0x008b: PHI (r1v18 java.lang.String) = (r1v9 java.lang.String), (r1v21 java.lang.String) binds: [B:40:0x00a1, B:32:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p085fg.InterfaceC1220a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object c3959f;
        String string;
        switch (this.f20887g) {
            case 0:
                InterfaceC1809a1 interfaceC1809a1 = this.f20890j;
                String strM420m = AbstractC0063p.m420m((String) interfaceC1809a1.getValue());
                if (strM420m.length() == 0) {
                    strM420m = "#FF000000";
                }
                InterfaceC1809a1 interfaceC1809a12 = this.f20891k;
                String strM420m2 = AbstractC0063p.m420m((String) interfaceC1809a12.getValue());
                if (strM420m2.length() == 0) {
                    strM420m2 = "#FF000000";
                }
                InterfaceC1809a1 interfaceC1809a13 = this.f20892l;
                String strM420m3 = AbstractC0063p.m420m((String) interfaceC1809a13.getValue());
                if (strM420m3.length() == 0) {
                    strM420m3 = "#FFFFFFFF";
                }
                InterfaceC1809a1 interfaceC1809a14 = this.f20893m;
                String strM420m4 = AbstractC0063p.m420m((String) interfaceC1809a14.getValue());
                String str = strM420m4.length() != 0 ? strM420m4 : "#FF000000";
                this.f20889i.edit().putString("message_text_color_left_light", strM420m).putString("message_text_color_right_light", strM420m2).putString("message_text_color_left_dark", strM420m3).putString("message_text_color_right_dark", str).apply();
                interfaceC1809a1.setValue(strM420m);
                interfaceC1809a12.setValue(strM420m2);
                interfaceC1809a13.setValue(strM420m3);
                interfaceC1809a14.setValue(str);
                Toast.makeText(this.f20888h, "设置已保存", 0).show();
                break;
            default:
                String str2 = "yyyy-MM-dd HH:mm:ss";
                String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                InterfaceC1809a1 interfaceC1809a15 = this.f20890j;
                String str4 = (String) interfaceC1809a15.getValue();
                try {
                    if (str4 == null) {
                        str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    String string2 = AbstractC3149m.m6703R0(str4).toString();
                    if (AbstractC3149m.m6721t0(string2)) {
                        string2 = "yyyy-MM-dd HH:mm:ss";
                    }
                    c3959f = new SimpleDateFormat(string2, Locale.CHINA);
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                boolean z9 = c3959f instanceof C3959f;
                InterfaceC1809a1 interfaceC1809a16 = this.f20891k;
                boolean zBooleanValue = ((Boolean) interfaceC1809a16.getValue()).booleanValue();
                Context context = this.f20888h;
                if (zBooleanValue && z9) {
                    Toast.makeText(context, "时间格式无效", 0).show();
                } else {
                    InterfaceC1809a1 interfaceC1809a17 = this.f20892l;
                    String str5 = (String) interfaceC1809a17.getValue();
                    if (str5 == null) {
                        str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    String string3 = AbstractC3149m.m6703R0(str5).toString();
                    if (AbstractC3149m.m6721t0(string3)) {
                        string3 = "${originalText} | ${time}";
                    }
                    SharedPreferences sharedPreferences = this.f20889i;
                    if (z9) {
                        String string4 = sharedPreferences.getString("moments_bottom_detail_time_format", "yyyy-MM-dd HH:mm:ss");
                        if (string4 != null) {
                            str3 = string4;
                        }
                        string = AbstractC3149m.m6703R0(str3).toString();
                        if (!AbstractC3149m.m6721t0(string)) {
                        }
                        interfaceC1809a17.setValue(string3);
                        interfaceC1809a15.setValue(str2);
                        sharedPreferences.edit().putBoolean("moments_bottom_detail_enable", ((Boolean) interfaceC1809a16.getValue()).booleanValue()).putString("moments_bottom_detail_text_format", string3).putString("moments_bottom_detail_time_format", str2).putBoolean("moments_bottom_detail_hide_group_icon", ((Boolean) this.f20893m.getValue()).booleanValue()).apply();
                        Toast.makeText(context, "设置已保存", 0).show();
                    } else {
                        String str6 = (String) interfaceC1809a15.getValue();
                        if (str6 != null) {
                            str3 = str6;
                        }
                        string = AbstractC3149m.m6703R0(str3).toString();
                        if (!AbstractC3149m.m6721t0(string)) {
                            str2 = string;
                        }
                        interfaceC1809a17.setValue(string3);
                        interfaceC1809a15.setValue(str2);
                        sharedPreferences.edit().putBoolean("moments_bottom_detail_enable", ((Boolean) interfaceC1809a16.getValue()).booleanValue()).putString("moments_bottom_detail_text_format", string3).putString("moments_bottom_detail_time_format", str2).putBoolean("moments_bottom_detail_hide_group_icon", ((Boolean) this.f20893m.getValue()).booleanValue()).apply();
                        Toast.makeText(context, "设置已保存", 0).show();
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5345tk(SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f20889i = sharedPreferences;
        this.f20888h = context;
        this.f20890j = interfaceC1809a1;
        this.f20891k = interfaceC1809a12;
        this.f20892l = interfaceC1809a13;
        this.f20893m = interfaceC1809a14;
    }
}
