package p332wb;

import android.content.SharedPreferences;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3156t;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.wh */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5441wh implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21701g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f21702h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f21703i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5441wh(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f21701g = i9;
        this.f21702h = sharedPreferences;
        this.f21703i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        Boolean bool;
        boolean zBooleanValue;
        String str;
        switch (this.f21701g) {
            case 0:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "toast";
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                this.f21703i.setValue(bool2);
                this.f21702h.edit().putBoolean("enable", zBooleanValue2).putLong("enabled_at_seconds", zBooleanValue2 ? System.currentTimeMillis() / 1000 : 0L).apply();
                return C3967n.f12976a;
            case 2:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "log_enable";
                break;
            case 3:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "keyword_notify_quiet";
                break;
            case 4:
                String str2 = (String) obj;
                InterfaceC1809a1 interfaceC1809a1 = this.f21703i;
                AbstractC4855en.m9258b(str2, interfaceC1809a1, str2, this.f21702h).putString("keyword_notify_quiet_start", (String) interfaceC1809a1.getValue()).apply();
                return C3967n.f12976a;
            case 5:
                String str3 = (String) obj;
                InterfaceC1809a1 interfaceC1809a12 = this.f21703i;
                AbstractC4855en.m9258b(str3, interfaceC1809a12, str3, this.f21702h).putString("keyword_notify_quiet_end", (String) interfaceC1809a12.getValue()).apply();
                return C3967n.f12976a;
            case 6:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "log_enable";
                break;
            case 7:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "text_speech_enable";
                break;
            case 8:
                String str4 = (String) obj;
                AbstractC4855en.m9258b(str4, this.f21703i, str4, this.f21702h).putString("text_speech_tts_voice", str4).apply();
                return C3967n.f12976a;
            case 9:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "text_speech_play_voice_messages";
                break;
            case 10:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "text_speech_volume_control";
                break;
            case 11:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "text_speech_announce_sender";
                break;
            case 12:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "text_speech_quiet_enable";
                break;
            case 13:
                String str5 = (String) obj;
                AbstractC4855en.m9258b(str5, this.f21703i, str5, this.f21702h).putString("text_speech_quiet_start", str5).apply();
                return C3967n.f12976a;
            case 14:
                String str6 = (String) obj;
                AbstractC4855en.m9258b(str6, this.f21703i, str6, this.f21702h).putString("text_speech_quiet_end", str6).apply();
                return C3967n.f12976a;
            case 15:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                this.f21703i.setValue(num);
                this.f21702h.edit().putInt("delay_mode", iIntValue).apply();
                return C3967n.f12976a;
            case 16:
                String str7 = (String) obj;
                str7.getClass();
                this.f21703i.setValue(str7);
                Integer numM6741e0 = AbstractC3156t.m6741e0(10, str7);
                if (numM6741e0 != null) {
                    int iIntValue2 = numM6741e0.intValue();
                    SharedPreferences.Editor editorEdit = this.f21702h.edit();
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    editorEdit.putInt("fixed_delay_seconds", iIntValue2).apply();
                }
                return C3967n.f12976a;
            case 17:
                String str8 = (String) obj;
                str8.getClass();
                this.f21703i.setValue(str8);
                Integer numM6741e02 = AbstractC3156t.m6741e0(10, str8);
                if (numM6741e02 != null) {
                    int iIntValue3 = numM6741e02.intValue();
                    SharedPreferences.Editor editorEdit2 = this.f21702h.edit();
                    if (iIntValue3 < 0) {
                        iIntValue3 = 0;
                    }
                    editorEdit2.putInt("random_min_seconds", iIntValue3).apply();
                }
                return C3967n.f12976a;
            case 18:
                String str9 = (String) obj;
                str9.getClass();
                this.f21703i.setValue(str9);
                Integer numM6741e03 = AbstractC3156t.m6741e0(10, str9);
                if (numM6741e03 != null) {
                    int iIntValue4 = numM6741e03.intValue();
                    SharedPreferences.Editor editorEdit3 = this.f21702h.edit();
                    if (iIntValue4 < 0) {
                        iIntValue4 = 0;
                    }
                    editorEdit3.putInt("random_max_seconds", iIntValue4).apply();
                }
                return C3967n.f12976a;
            case 19:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "time_window_enable";
                break;
            case 20:
                String str10 = (String) obj;
                AbstractC4855en.m9258b(str10, this.f21703i, str10, this.f21702h).putString("start_time", str10).apply();
                return C3967n.f12976a;
            case 21:
                String str11 = (String) obj;
                AbstractC4855en.m9258b(str11, this.f21703i, str11, this.f21702h).putString("end_time", str11).apply();
                return C3967n.f12976a;
            case 22:
                String str12 = (String) obj;
                str12.getClass();
                this.f21703i.setValue(str12);
                Integer numM6741e04 = AbstractC3156t.m6741e0(10, str12);
                if (numM6741e04 != null) {
                    int iIntValue5 = numM6741e04.intValue();
                    SharedPreferences.Editor editorEdit4 = this.f21702h.edit();
                    if (iIntValue5 < 1) {
                        iIntValue5 = 1;
                    }
                    editorEdit4.putInt("max_age_hours", iIntValue5).apply();
                }
                return C3967n.f12976a;
            case 23:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "allow_text";
                break;
            case 24:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "allow_image";
                break;
            case 25:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "allow_video";
                break;
            case 26:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "keyword_text";
                break;
            case 27:
                String str13 = (String) obj;
                AbstractC4855en.m9258b(str13, this.f21703i, str13, this.f21702h).putString("exclude_keywords_text", str13).apply();
                return C3967n.f12976a;
            case 28:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "keyword_image";
                break;
            default:
                String str14 = (String) obj;
                AbstractC4855en.m9258b(str14, this.f21703i, str14, this.f21702h).putString("exclude_keywords_image_text", str14).apply();
                return C3967n.f12976a;
        }
        AbstractC4855en.m9269m(this.f21703i, bool, this.f21702h, str, zBooleanValue);
        return C3967n.f12976a;
    }

    public /* synthetic */ C5441wh(InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, int i9) {
        this.f21701g = i9;
        this.f21703i = interfaceC1809a1;
        this.f21702h = sharedPreferences;
    }
}
