package p332wb;

import android.content.SharedPreferences;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3156t;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.wb */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5435wb implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21661g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f21662h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f21663i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5435wb(InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences) {
        this.f21661g = 2;
        this.f21663i = interfaceC1809a1;
        this.f21662h = sharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        Integer numValueOf;
        Boolean bool;
        boolean zBooleanValue;
        String str;
        String strValueOf;
        switch (this.f21661g) {
            case 0:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                this.f21663i.setValue(bool2);
                this.f21662h.edit().putBoolean("fake_like_random_order", zBooleanValue2).commit();
                return C3967n.f12976a;
            case 1:
                Boolean bool3 = (Boolean) obj;
                boolean zBooleanValue3 = bool3.booleanValue();
                this.f21663i.setValue(bool3);
                this.f21662h.edit().putBoolean("fake_like_auto_select", zBooleanValue3).commit();
                return C3967n.f12976a;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                Integer numM6741e0 = AbstractC3156t.m6741e0(10, str2);
                if (numM6741e0 != null) {
                    int iIntValue = numM6741e0.intValue();
                    if (iIntValue < 1) {
                        iIntValue = 1;
                    }
                    numValueOf = Integer.valueOf(iIntValue);
                } else {
                    numValueOf = null;
                }
                String strValueOf2 = numValueOf != null ? String.valueOf(numValueOf.intValue()) : null;
                if (strValueOf2 == null) {
                    strValueOf2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                this.f21663i.setValue(strValueOf2);
                if (numValueOf != null) {
                    this.f21662h.edit().putInt("fake_like_auto_select_count", numValueOf.intValue()).apply();
                }
                return C3967n.f12976a;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                String str4 = "custom";
                if (!str3.equals("custom")) {
                    str4 = "hidden";
                    if (!str3.equals("hidden")) {
                        str4 = "original";
                    }
                }
                InterfaceC1809a1 interfaceC1809a1 = this.f21663i;
                interfaceC1809a1.setValue(str4);
                this.f21662h.edit().putString("chat_time_mode", (String) interfaceC1809a1.getValue()).apply();
                return C3967n.f12976a;
            case 4:
                String str5 = (String) obj;
                AbstractC4855en.m9258b(str5, this.f21663i, str5, this.f21662h).putString("chat_time_format", str5).apply();
                return C3967n.f12976a;
            case 5:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "enable";
                break;
            case 6:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "show_member";
                break;
            case 7:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "skip_mini_program_video_ads_enable";
                break;
            case 8:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "skip_global_mini_program_splash_ads_enable";
                break;
            case 9:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "fake_location_enable";
                break;
            case 10:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "fake_wallet_balance_enable_balance";
                break;
            case 11:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "fake_wallet_balance_enable_lqt";
                break;
            case 12:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "fake_wallet_balance_enable_business";
                break;
            case 13:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "round_avatar_enable";
                break;
            case 14:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "moments_keyword_block_enable";
                break;
            case 15:
                String str6 = (String) obj;
                AbstractC4855en.m9258b(str6, this.f21663i, str6, this.f21662h).putString("moments_keyword_block_keywords", str6).apply();
                return C3967n.f12976a;
            case 16:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "sns_custom_mark_enable";
                break;
            case 17:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "sns_comment_custom_mark_enable";
                break;
            case 18:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "fake_voice_duration_enable";
                break;
            case 19:
                String str7 = (String) obj;
                str7.getClass();
                Integer numM6741e02 = AbstractC3156t.m6741e0(10, str7);
                if (numM6741e02 != null && (strValueOf = String.valueOf(AbstractC3754e0.m7909r(numM6741e02.intValue(), 1, 60))) != null) {
                    str7 = strValueOf;
                }
                this.f21663i.setValue(str7);
                if (numM6741e02 != null) {
                    this.f21662h.edit().putInt("fake_voice_duration_seconds", AbstractC3754e0.m7909r(numM6741e02.intValue(), 1, 60)).apply();
                }
                return C3967n.f12976a;
            case 20:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "fake_mini_program_base_lib_enable";
                break;
            case 21:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "message_bubble_enable";
                break;
            case 22:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "message_bubble_separate_dark_mode";
                break;
            case 23:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "global_prefix_enable";
                break;
            case 24:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "show_gender";
                break;
            case 25:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "show_region";
                break;
            case 26:
                Integer num = (Integer) obj;
                int iIntValue2 = num.intValue();
                this.f21663i.setValue(num);
                this.f21662h.edit().putInt("game_emoji_dice_result", iIntValue2).apply();
                return C3967n.f12976a;
            case 27:
                Integer num2 = (Integer) obj;
                int iIntValue3 = num2.intValue();
                this.f21663i.setValue(num2);
                this.f21662h.edit().putInt("game_emoji_rps_result", iIntValue3).apply();
                return C3967n.f12976a;
            case 28:
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "enable";
                break;
            default:
                String str8 = (String) obj;
                AbstractC4855en.m9258b(str8, this.f21663i, str8, this.f21662h).putString("sdk_id", str8).apply();
                return C3967n.f12976a;
        }
        AbstractC4855en.m9269m(this.f21663i, bool, this.f21662h, str, zBooleanValue);
        return C3967n.f12976a;
    }

    public /* synthetic */ C5435wb(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f21661g = i9;
        this.f21662h = sharedPreferences;
        this.f21663i = interfaceC1809a1;
    }
}
