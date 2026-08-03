package p332wb;

import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.jo */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5019jo implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18206g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f18207h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18208i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5019jo(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f18206g = i9;
        this.f18207h = sharedPreferences;
        this.f18208i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        Boolean bool;
        boolean zBooleanValue;
        String str;
        Object c3959f;
        switch (this.f18206g) {
            case 0:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "comment_allow_text";
                break;
            case 1:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "comment_allow_image";
                break;
            case 2:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "comment_allow_video";
                break;
            case 3:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "comment_keyword_text";
                break;
            case 4:
                String str2 = (String) obj;
                AbstractC4855en.m9258b(str2, this.f18208i, str2, this.f18207h).putString("comment_exclude_keywords_text", str2).apply();
                return C3967n.f12976a;
            case 5:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "comment_keyword_image";
                break;
            case 6:
                String str3 = (String) obj;
                AbstractC4855en.m9258b(str3, this.f18208i, str3, this.f18207h).putString("comment_exclude_keywords_image_text", str3).apply();
                return C3967n.f12976a;
            case 7:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "comment_keyword_video";
                break;
            case 8:
                String str4 = (String) obj;
                AbstractC4855en.m9258b(str4, this.f18208i, str4, this.f18207h).putString("comment_exclude_keywords_video_text", str4).apply();
                return C3967n.f12976a;
            case 9:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "comment_log_enable";
                break;
            case 10:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                this.f18208i.setValue(bool2);
                this.f18207h.edit().putBoolean("comment_enable", zBooleanValue2).putLong("comment_enabled_at_seconds", zBooleanValue2 ? System.currentTimeMillis() / 1000 : 0L).apply();
                return C3967n.f12976a;
            case 11:
                String str5 = (String) obj;
                AbstractC4855en.m9258b(str5, this.f18208i, str5, this.f18207h).putString("comment_content", str5).apply();
                return C3967n.f12976a;
            case 12:
                String str6 = (String) obj;
                str6.getClass();
                this.f18208i.setValue(str6);
                try {
                    String string = AbstractC3149m.m6703R0(str6).toString();
                    if (AbstractC3149m.m6721t0(string)) {
                        string = "yyyy-MM-dd HH:mm:ss";
                    }
                    c3959f = new SimpleDateFormat(string, Locale.getDefault());
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (!(c3959f instanceof C3959f)) {
                    SharedPreferences.Editor editorEdit = this.f18207h.edit();
                    String string2 = AbstractC3149m.m6703R0(str6).toString();
                    editorEdit.putString("comment_time_format", AbstractC3149m.m6721t0(string2) ? "yyyy-MM-dd HH:mm:ss" : string2).apply();
                }
                return C3967n.f12976a;
            default:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "comment_self";
                break;
        }
        AbstractC4855en.m9269m(this.f18208i, bool, this.f18207h, str, zBooleanValue);
        return C3967n.f12976a;
    }
}
