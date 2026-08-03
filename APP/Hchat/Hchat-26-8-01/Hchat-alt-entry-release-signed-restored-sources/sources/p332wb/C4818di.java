package p332wb;

import android.content.SharedPreferences;
import be.AbstractC0283h;
import java.util.List;
import p037cb.C0545f;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p213ob.AbstractC3123p;
import p213ob.C3122o;
import p218og.AbstractC3156t;
import p251r.C3623h;
import p259r9.AbstractC3754e0;
import p266s0.C3874d;
import p276sf.C3967n;
import p343x6.AbstractC5700d;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.di */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4818di implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16644g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f16645h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f16646i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4818di(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f16644g = i9;
        this.f16645h = sharedPreferences;
        this.f16646i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        SharedPreferences sharedPreferences;
        InterfaceC1809a1 interfaceC1809a1;
        Boolean bool;
        boolean zBooleanValue;
        String str;
        switch (this.f16644g) {
            case 0:
                sharedPreferences = this.f16645h;
                interfaceC1809a1 = this.f16646i;
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "keyword_video";
                AbstractC4855en.m9269m(interfaceC1809a1, bool, sharedPreferences, str, zBooleanValue);
                break;
            case 1:
                String str2 = (String) obj;
                AbstractC4855en.m9258b(str2, this.f16646i, str2, this.f16645h).putString("exclude_keywords_video_text", str2).apply();
                break;
            case 2:
                SharedPreferences sharedPreferences2 = this.f16645h;
                InterfaceC1809a1 interfaceC1809a12 = this.f16646i;
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                interfaceC1809a12.setValue(bool2);
                sharedPreferences2.edit().putBoolean("qq_music_order_custom_singer", zBooleanValue2).commit();
                break;
            case 3:
                String str3 = (String) obj;
                AbstractC4855en.m9258b(str3, this.f16646i, str3, this.f16645h).putString("qq_music_order_default_singer", str3).commit();
                break;
            case 4:
                String str4 = (String) obj;
                AbstractC4855en.m9258b(str4, this.f16646i, str4, this.f16645h).putString("qq_music_order_app_id", str4).commit();
                break;
            case 5:
                SharedPreferences sharedPreferences3 = this.f16645h;
                InterfaceC1809a1 interfaceC1809a13 = this.f16646i;
                Boolean bool3 = (Boolean) obj;
                boolean zBooleanValue3 = bool3.booleanValue();
                interfaceC1809a13.setValue(bool3);
                sharedPreferences3.edit().putBoolean("enable", zBooleanValue3).putLong("enabled_at_seconds", zBooleanValue3 ? System.currentTimeMillis() / 1000 : 0L).apply();
                break;
            case 6:
                sharedPreferences = this.f16645h;
                interfaceC1809a1 = this.f16646i;
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "like_self";
                AbstractC4855en.m9269m(interfaceC1809a1, bool, sharedPreferences, str, zBooleanValue);
                break;
            case 7:
                sharedPreferences = this.f16645h;
                interfaceC1809a1 = this.f16646i;
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "excluded_talkers_enable";
                AbstractC4855en.m9269m(interfaceC1809a1, bool, sharedPreferences, str, zBooleanValue);
                break;
            case 8:
                String str5 = (String) obj;
                AbstractC4855en.m9258b(str5, this.f16646i, str5, this.f16645h).putString("excluded_talkers", str5).apply();
                break;
            case 9:
                SharedPreferences sharedPreferences4 = this.f16645h;
                InterfaceC1809a1 interfaceC1809a14 = this.f16646i;
                List list = (List) obj;
                list.getClass();
                interfaceC1809a14.setValue(list);
                sharedPreferences4.edit().putString("group_rename_template_bindings", AbstractC5700d.m10293t(list)).apply();
                break;
            case 10:
                SharedPreferences sharedPreferences5 = this.f16645h;
                InterfaceC1809a1 interfaceC1809a15 = this.f16646i;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19866s2, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-1207687151, new C5403vc(sharedPreferences5, interfaceC1809a15, 5), true), 3);
                break;
            case 11:
                SharedPreferences sharedPreferences6 = this.f16645h;
                InterfaceC1809a1 interfaceC1809a16 = this.f16646i;
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                interfaceC1809a16.setValue(num);
                sharedPreferences6.edit().putInt("audio_transform_mode", iIntValue).apply();
                break;
            case 12:
                SharedPreferences sharedPreferences7 = this.f16645h;
                InterfaceC1809a1 interfaceC1809a17 = this.f16646i;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19874t2, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(-276622072, new C5403vc(sharedPreferences7, interfaceC1809a17, 6), true), 3);
                break;
            case 13:
                SharedPreferences sharedPreferences8 = this.f16645h;
                InterfaceC1809a1 interfaceC1809a18 = this.f16646i;
                List list2 = (List) obj;
                list2.getClass();
                interfaceC1809a18.setValue(list2);
                sharedPreferences8.edit().putString("group_member_reply_template_bindings", AbstractC3754e0.m7858A(list2)).apply();
                break;
            case 14:
                Boolean bool4 = (Boolean) obj;
                AbstractC4855en.m9269m(this.f16646i, bool4, this.f16645h, "scheduled_task_enable", bool4.booleanValue());
                C0545f c0545f = AbstractC0283h.f824a;
                if (c0545f != null) {
                    c0545f.m1554r();
                }
                break;
            case 15:
                SharedPreferences sharedPreferences9 = this.f16645h;
                InterfaceC1809a1 interfaceC1809a19 = this.f16646i;
                C3623h c3623h3 = (C3623h) obj;
                c3623h3.getClass();
                C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19881u2, 3);
                C3623h.m7604a(c3623h3, null, new C3874d(-302101041, new C5403vc(sharedPreferences9, interfaceC1809a19, 2), true), 3);
                break;
            case 16:
                String str6 = (String) obj;
                AbstractC4855en.m9258b(str6, this.f16646i, str6, this.f16645h).putString("text_voice_tts_voice", str6).apply();
                break;
            case 17:
                SharedPreferences sharedPreferences10 = this.f16645h;
                InterfaceC1809a1 interfaceC1809a110 = this.f16646i;
                C4759bp c4759bp = (C4759bp) obj;
                c4759bp.getClass();
                C3122o c3122o = (C3122o) AbstractC4166m.m8425w1(c4759bp.f16109b, AbstractC3123p.f10127a);
                if (c3122o != null) {
                    String str7 = c3122o.f10124a;
                    interfaceC1809a110.setValue(str7);
                    sharedPreferences10.edit().putString("text_voice_voice", str7).apply();
                }
                break;
            case 18:
                String str8 = (String) obj;
                AbstractC4855en.m9258b(str8, this.f16646i, str8, this.f16645h).putString("group_member_reply_listen_groups", str8).apply();
                break;
            case 19:
                String str9 = (String) obj;
                AbstractC4855en.m9258b(str9, this.f16646i, str9, this.f16645h).putString("group_rename_listen_groups", str9).apply();
                break;
            case 20:
                SharedPreferences sharedPreferences11 = this.f16645h;
                InterfaceC1809a1 interfaceC1809a111 = this.f16646i;
                Integer num2 = (Integer) obj;
                int iIntValue2 = num2.intValue();
                interfaceC1809a111.setValue(num2);
                sharedPreferences11.edit().putInt("comment_delay_mode", iIntValue2).apply();
                break;
            case 21:
                InterfaceC1809a1 interfaceC1809a112 = this.f16646i;
                SharedPreferences sharedPreferences12 = this.f16645h;
                String str10 = (String) obj;
                str10.getClass();
                interfaceC1809a112.setValue(str10);
                Integer numM6741e0 = AbstractC3156t.m6741e0(10, str10);
                if (numM6741e0 != null) {
                    int iIntValue3 = numM6741e0.intValue();
                    SharedPreferences.Editor editorEdit = sharedPreferences12.edit();
                    if (iIntValue3 < 0) {
                        iIntValue3 = 0;
                    }
                    editorEdit.putInt("comment_fixed_delay_seconds", iIntValue3).apply();
                }
                break;
            case 22:
                InterfaceC1809a1 interfaceC1809a113 = this.f16646i;
                SharedPreferences sharedPreferences13 = this.f16645h;
                String str11 = (String) obj;
                str11.getClass();
                interfaceC1809a113.setValue(str11);
                Integer numM6741e02 = AbstractC3156t.m6741e0(10, str11);
                if (numM6741e02 != null) {
                    int iIntValue4 = numM6741e02.intValue();
                    SharedPreferences.Editor editorEdit2 = sharedPreferences13.edit();
                    if (iIntValue4 < 0) {
                        iIntValue4 = 0;
                    }
                    editorEdit2.putInt("comment_random_min_seconds", iIntValue4).apply();
                }
                break;
            case 23:
                InterfaceC1809a1 interfaceC1809a114 = this.f16646i;
                SharedPreferences sharedPreferences14 = this.f16645h;
                String str12 = (String) obj;
                str12.getClass();
                interfaceC1809a114.setValue(str12);
                Integer numM6741e03 = AbstractC3156t.m6741e0(10, str12);
                if (numM6741e03 != null) {
                    int iIntValue5 = numM6741e03.intValue();
                    SharedPreferences.Editor editorEdit3 = sharedPreferences14.edit();
                    if (iIntValue5 < 0) {
                        iIntValue5 = 0;
                    }
                    editorEdit3.putInt("comment_random_max_seconds", iIntValue5).apply();
                }
                break;
            case 24:
                sharedPreferences = this.f16645h;
                interfaceC1809a1 = this.f16646i;
                bool = (Boolean) obj;
                zBooleanValue = bool.booleanValue();
                str = "comment_time_window_enable";
                AbstractC4855en.m9269m(interfaceC1809a1, bool, sharedPreferences, str, zBooleanValue);
                break;
            case 25:
                String str13 = (String) obj;
                AbstractC4855en.m9258b(str13, this.f16646i, str13, this.f16645h).putString("comment_start_time", str13).apply();
                break;
            case 26:
                String str14 = (String) obj;
                AbstractC4855en.m9258b(str14, this.f16646i, str14, this.f16645h).putString("comment_end_time", str14).apply();
                break;
            case 27:
                InterfaceC1809a1 interfaceC1809a115 = this.f16646i;
                SharedPreferences sharedPreferences15 = this.f16645h;
                String str15 = (String) obj;
                str15.getClass();
                interfaceC1809a115.setValue(str15);
                Integer numM6741e04 = AbstractC3156t.m6741e0(10, str15);
                if (numM6741e04 != null) {
                    int iIntValue6 = numM6741e04.intValue();
                    SharedPreferences.Editor editorEdit4 = sharedPreferences15.edit();
                    if (iIntValue6 < 1) {
                        iIntValue6 = 1;
                    }
                    editorEdit4.putInt("comment_max_age_hours", iIntValue6).apply();
                }
                break;
            case 28:
                SharedPreferences sharedPreferences16 = this.f16645h;
                InterfaceC1809a1 interfaceC1809a116 = this.f16646i;
                Integer num3 = (Integer) obj;
                int iIntValue7 = num3.intValue();
                interfaceC1809a116.setValue(num3);
                sharedPreferences16.edit().putInt("comment_list_mode", iIntValue7).apply();
                break;
            default:
                InterfaceC1809a1 interfaceC1809a117 = this.f16646i;
                SharedPreferences sharedPreferences17 = this.f16645h;
                String str16 = (String) obj;
                str16.getClass();
                interfaceC1809a117.setValue(str16);
                Integer numM6741e05 = AbstractC3156t.m6741e0(10, str16);
                if (numM6741e05 != null) {
                    int iIntValue8 = numM6741e05.intValue();
                    SharedPreferences.Editor editorEdit5 = sharedPreferences17.edit();
                    if (iIntValue8 < 0) {
                        iIntValue8 = 0;
                    }
                    editorEdit5.putInt("daily_comment_limit", iIntValue8).apply();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4818di(InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, int i9) {
        this.f16644g = i9;
        this.f16646i = interfaceC1809a1;
        this.f16645h = sharedPreferences;
    }
}
