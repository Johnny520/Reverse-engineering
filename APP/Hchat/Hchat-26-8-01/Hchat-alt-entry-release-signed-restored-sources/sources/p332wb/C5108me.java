package p332wb;

import android.content.SharedPreferences;
import java.util.Set;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3156t;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.me */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5108me implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18920g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f18921h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18922i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5108me(InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences) {
        this.f18920g = 3;
        this.f18922i = interfaceC1809a1;
        this.f18921h = sharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        Boolean bool;
        boolean zBooleanValue;
        String str;
        switch (this.f18920g) {
            case 0:
                String str2 = (String) obj;
                AbstractC4855en.m9258b(str2, this.f18922i, str2, this.f18921h).putString("sdk_app_name", str2).apply();
                return C3967n.f12976a;
            case 1:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "floating_nav";
                break;
            case 2:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "enable";
                break;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                this.f18922i.setValue(str3);
                Integer numM6741e0 = AbstractC3156t.m6741e0(10, str3);
                if (numM6741e0 != null) {
                    int iIntValue = numM6741e0.intValue();
                    SharedPreferences.Editor editorEdit = this.f18921h.edit();
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    editorEdit.putInt("interval_seconds", iIntValue).apply();
                }
                return C3967n.f12976a;
            case 4:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "time_window_enable";
                break;
            case 5:
                String str4 = (String) obj;
                AbstractC4855en.m9258b(str4, this.f18922i, str4, this.f18921h).putString("start_time", str4).apply();
                return C3967n.f12976a;
            case 6:
                String str5 = (String) obj;
                AbstractC4855en.m9258b(str5, this.f18922i, str5, this.f18921h).putString("end_time", str5).apply();
                return C3967n.f12976a;
            case 7:
                Integer num = (Integer) obj;
                int iIntValue2 = num.intValue();
                this.f18922i.setValue(num);
                this.f18921h.edit().putInt("transfer_mode", iIntValue2).apply();
                return C3967n.f12976a;
            case 8:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "transfer_amount_enable";
                break;
            case 9:
                Integer num2 = (Integer) obj;
                int iIntValue3 = num2.intValue();
                this.f18922i.setValue(num2);
                this.f18921h.edit().putInt("transfer_amount_cond", iIntValue3).apply();
                return C3967n.f12976a;
            case 10:
                Integer num3 = (Integer) obj;
                int iIntValue4 = num3.intValue();
                this.f18922i.setValue(num3);
                this.f18921h.edit().putInt("transfer_amount_action", iIntValue4).apply();
                return C3967n.f12976a;
            case 11:
                Integer num4 = (Integer) obj;
                int iIntValue5 = num4.intValue();
                this.f18922i.setValue(num4);
                this.f18921h.edit().putInt("transfer_keyword_mode", iIntValue5).apply();
                return C3967n.f12976a;
            case 12:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "hb_reply_enable";
                break;
            case 13:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "group_leave_monitor_enable";
                break;
            case 14:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "group_invite_detail_enable";
                break;
            case 15:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "enable";
                break;
            case 16:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "hb_wish_enable";
                break;
            case 17:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "hb_notify_system_enable";
                break;
            case 18:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "hb_notify_failed_toast_enable";
                break;
            case 19:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "hb_notify_toast_enable";
                break;
            case 20:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "hb_notify_sound_enable";
                break;
            case 21:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "hb_announce_enable";
                break;
            case 22:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "hb_notify_failed_system_enable";
                break;
            case 23:
                Set<String> set = (Set) obj;
                set.getClass();
                this.f18922i.setValue(set);
                this.f18921h.edit().putStringSet("fake_like_excluded_ids", set).commit();
                return C3967n.f12976a;
            case 24:
                String str6 = (String) obj;
                AbstractC4855en.m9258b(str6, this.f18922i, str6, this.f18921h).putString("scope", str6).apply();
                return C3967n.f12976a;
            case 25:
                String str7 = (String) obj;
                AbstractC4855en.m9258b(str7, this.f18922i, str7, this.f18921h).putString("display_mode", str7).apply();
                return C3967n.f12976a;
            case 26:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "include_keywords_enable";
                break;
            case 27:
                String str8 = (String) obj;
                AbstractC4855en.m9258b(str8, this.f18922i, str8, this.f18921h).putString("include_keywords", str8).apply();
                return C3967n.f12976a;
            case 28:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "exclude_keywords_enable";
                break;
            default:
                String str9 = (String) obj;
                AbstractC4855en.m9258b(str9, this.f18922i, str9, this.f18921h).putString("exclude_keywords", str9).apply();
                return C3967n.f12976a;
        }
        AbstractC4855en.m9269m(this.f18922i, bool, this.f18921h, str, zBooleanValue);
        return C3967n.f12976a;
    }

    public /* synthetic */ C5108me(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f18920g = i9;
        this.f18921h = sharedPreferences;
        this.f18922i = interfaceC1809a1;
    }
}
