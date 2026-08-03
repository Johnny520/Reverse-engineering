package p332wb;

import android.content.SharedPreferences;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p172lg.C2564d;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.qg */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5242qg implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20219g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f20220h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f20221i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5242qg(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f20219g = i9;
        this.f20220h = sharedPreferences;
        this.f20221i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        Boolean bool;
        boolean zBooleanValue;
        String str;
        switch (this.f20219g) {
            case 0:
                String str2 = (String) obj;
                AbstractC4855en.m9258b(str2, this.f20221i, str2, this.f20220h).putString("content_template", str2).apply();
                return C3967n.f12976a;
            case 1:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "allow_text";
                break;
            case 2:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "allow_image";
                break;
            case 3:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "allow_video";
                break;
            case 4:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "allow_live_photo";
                break;
            case 5:
                String str3 = (String) obj;
                AbstractC4855en.m9258b(str3, this.f20221i, str3, this.f20220h).putString("title_template", str3).apply();
                return C3967n.f12976a;
            case 6:
                String str4 = (String) obj;
                AbstractC4855en.m9258b(str4, this.f20221i, str4, this.f20220h).putString("body_template", str4).apply();
                return C3967n.f12976a;
            case 7:
                String str5 = (String) obj;
                AbstractC4855en.m9258b(str5, this.f20221i, str5, this.f20220h).putString("toast_template", str5).apply();
                return C3967n.f12976a;
            case 8:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                this.f20221i.setValue(num);
                this.f20220h.edit().putInt("delay_mode", iIntValue).apply();
                return C3967n.f12976a;
            case 9:
                String str6 = (String) obj;
                str6.getClass();
                this.f20221i.setValue(str6);
                Integer numM6741e0 = AbstractC3156t.m6741e0(10, str6);
                if (numM6741e0 != null) {
                    int iIntValue2 = numM6741e0.intValue();
                    SharedPreferences.Editor editorEdit = this.f20220h.edit();
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    editorEdit.putInt("fixed_delay_seconds", iIntValue2).apply();
                }
                return C3967n.f12976a;
            case 10:
                String str7 = (String) obj;
                str7.getClass();
                this.f20221i.setValue(str7);
                Integer numM6741e02 = AbstractC3156t.m6741e0(10, str7);
                if (numM6741e02 != null) {
                    int iIntValue3 = numM6741e02.intValue();
                    SharedPreferences.Editor editorEdit2 = this.f20220h.edit();
                    if (iIntValue3 < 0) {
                        iIntValue3 = 0;
                    }
                    editorEdit2.putInt("random_min_seconds", iIntValue3).apply();
                }
                return C3967n.f12976a;
            case 11:
                String str8 = (String) obj;
                str8.getClass();
                this.f20221i.setValue(str8);
                Integer numM6741e03 = AbstractC3156t.m6741e0(10, str8);
                if (numM6741e03 != null) {
                    int iIntValue4 = numM6741e03.intValue();
                    SharedPreferences.Editor editorEdit3 = this.f20220h.edit();
                    if (iIntValue4 < 0) {
                        iIntValue4 = 0;
                    }
                    editorEdit3.putInt("random_max_seconds", iIntValue4).apply();
                }
                return C3967n.f12976a;
            case 12:
                String str9 = (String) obj;
                str9.getClass();
                this.f20221i.setValue(str9);
                Integer numM6741e04 = AbstractC3156t.m6741e0(10, str9);
                if (numM6741e04 != null) {
                    int iIntValue5 = numM6741e04.intValue();
                    SharedPreferences.Editor editorEdit4 = this.f20220h.edit();
                    if (iIntValue5 < 0) {
                        iIntValue5 = 0;
                    }
                    editorEdit4.putInt("daily_limit", iIntValue5).apply();
                }
                return C3967n.f12976a;
            case 13:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "text_voice_send_enable";
                break;
            case 14:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "text_voice_play_enable";
                break;
            case 15:
                String str10 = (String) obj;
                AbstractC4855en.m9258b(str10, this.f20221i, str10, this.f20220h).putString("qq_music_order_triggers", str10).commit();
                return C3967n.f12976a;
            case 16:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "zombie_check_auto_tag";
                break;
            case 17:
                String str11 = (String) obj;
                AbstractC4855en.m9258b(str11, this.f20221i, str11, this.f20220h).putString("zombie_check_label_name", AbstractC3149m.m6703R0(str11).toString()).apply();
                return C3967n.f12976a;
            case 18:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "zombie_check_clear_record";
                break;
            case 19:
                String str12 = (String) obj;
                str12.getClass();
                this.f20221i.setValue(str12);
                AbstractC4955ho.m9661s4(this.f20220h, "zombie_check_delete_delay_seconds", str12, new C2564d(0, 300, 1));
                return C3967n.f12976a;
            case 20:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "zombie_check_keep_awake";
                break;
            case 21:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "keyword_notify_filter_mode";
                break;
            case 22:
                Integer num2 = (Integer) obj;
                int iIntValue6 = num2.intValue();
                this.f20221i.setValue(num2);
                this.f20220h.edit().putInt("list_mode", iIntValue6).apply();
                return C3967n.f12976a;
            case 23:
                String str13 = (String) obj;
                str13.getClass();
                this.f20221i.setValue(str13);
                Integer numM6741e05 = AbstractC3156t.m6741e0(10, str13);
                if (numM6741e05 != null) {
                    int iIntValue7 = numM6741e05.intValue();
                    SharedPreferences.Editor editorEdit5 = this.f20220h.edit();
                    if (iIntValue7 < 0) {
                        iIntValue7 = 0;
                    }
                    editorEdit5.putInt("daily_like_limit", iIntValue7).apply();
                }
                return C3967n.f12976a;
            case 24:
                String str14 = (String) obj;
                str14.getClass();
                this.f20221i.setValue(str14);
                AbstractC4955ho.m9661s4(this.f20220h, "zombie_check_min_delay_seconds", str14, new C2564d(0, 60, 1));
                return C3967n.f12976a;
            case 25:
                String str15 = (String) obj;
                str15.getClass();
                this.f20221i.setValue(str15);
                AbstractC4955ho.m9661s4(this.f20220h, "zombie_check_max_delay_seconds", str15, new C2564d(0, 120, 1));
                return C3967n.f12976a;
            case 26:
                String str16 = (String) obj;
                str16.getClass();
                this.f20221i.setValue(str16);
                AbstractC4955ho.m9661s4(this.f20220h, "zombie_check_timeout_seconds", str16, new C2564d(5, 60, 1));
                return C3967n.f12976a;
            case 27:
                String str17 = (String) obj;
                str17.getClass();
                this.f20221i.setValue(str17);
                AbstractC4955ho.m9661s4(this.f20220h, "zombie_check_max_retries", str17, new C2564d(0, 5, 1));
                return C3967n.f12976a;
            case 28:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                this.f20221i.setValue(bool2);
                this.f20220h.edit().putBoolean("enable", zBooleanValue2).putLong("enabled_at_seconds", zBooleanValue2 ? System.currentTimeMillis() / 1000 : 0L).apply();
                return C3967n.f12976a;
            default:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "system_notification";
                break;
        }
        AbstractC4855en.m9269m(this.f20221i, bool, this.f20220h, str, zBooleanValue);
        return C3967n.f12976a;
    }

    public /* synthetic */ C5242qg(InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, int i9) {
        this.f20219g = i9;
        this.f20221i = interfaceC1809a1;
        this.f20220h = sharedPreferences;
    }
}
