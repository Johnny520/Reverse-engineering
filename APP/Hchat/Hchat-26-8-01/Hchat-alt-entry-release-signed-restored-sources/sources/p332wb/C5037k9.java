package p332wb;

import android.content.SharedPreferences;
import java.util.List;
import na.C2920h;
import na.C2922j;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p117i0.InterfaceC1809a1;
import p211o9.C3104q;
import p243q9.C3471g;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import tf.AbstractC4166m;
import ua.C4298i;

/* JADX INFO: renamed from: wb.k9 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5037k9 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18335g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f18336h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18337i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f18338j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5037k9(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f18335g = i9;
        this.f18336h = sharedPreferences;
        this.f18337i = interfaceC1809a1;
        this.f18338j = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v31, resolved type: android.content.SharedPreferences */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v55 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        String string;
        C2920h c2920h;
        int i9;
        String strM9663s6;
        ?? r5;
        boolean z9;
        switch (this.f18335g) {
            case 0:
                AbstractC4855en.m9269m(this.f18337i, Boolean.TRUE, this.f18336h, "zombie_check_auto_delete", true);
                this.f18338j.setValue(Boolean.FALSE);
                break;
            case 1:
                SharedPreferences sharedPreferences = this.f18336h;
                this.f18337i.setValue(Long.valueOf(sharedPreferences.getLong("last_time", 0L)));
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                String string2 = sharedPreferences.getString("last_result", HttpUrl.FRAGMENT_ENCODE_SET);
                if (string2 != null) {
                    str = string2;
                }
                this.f18338j.setValue(str);
                break;
            case 2:
                InterfaceC1809a1 interfaceC1809a1 = this.f18337i;
                int size = ((List) interfaceC1809a1.getValue()).size();
                int size2 = ((List) interfaceC1809a1.getValue()).size() + 1;
                String str2 = "rename_" + System.currentTimeMillis() + "_" + size2;
                String strM2249l = AbstractC0921a.m2249l(size2, "改名模板 ");
                SharedPreferences sharedPreferences2 = this.f18336h;
                int i10 = sharedPreferences2.getInt("group_rename_delay_seconds", 0);
                String str3 = WeChatSnsPost.TYPE_TEXT;
                String string3 = sharedPreferences2.getString("group_rename_prompt_type", WeChatSnsPost.TYPE_TEXT);
                if (string3 != null) {
                    str3 = string3;
                }
                String string4 = sharedPreferences2.getString("group_rename_both_order", "text_first");
                String str4 = string4 != null ? string4 : "text_first";
                String string5 = sharedPreferences2.getString("group_rename_text", "%userName% 将群内昵称从“%oldGroupNickname%”修改为“%newGroupNickname%”");
                String str5 = string5 != null ? string5 : "%userName% 将群内昵称从“%oldGroupNickname%”修改为“%newGroupNickname%”";
                String string6 = sharedPreferences2.getString("group_rename_card_title", "%userName% 修改了群内昵称");
                String str6 = string6 != null ? string6 : "%userName% 修改了群内昵称";
                String string7 = sharedPreferences2.getString("group_rename_card_desc", "旧昵称：%oldGroupNickname%\n新昵称：%newGroupNickname%\n时间：%time%");
                this.f18338j.setValue(new C5032k4(size, new C3471g(str2, strM2249l, true, i10, str3, str4, str5, str6, string7 != null ? string7 : "旧昵称：%oldGroupNickname%\n新昵称：%newGroupNickname%\n时间：%time%"), false));
                break;
            case 3:
                InterfaceC1809a1 interfaceC1809a12 = this.f18337i;
                this.f18338j.setValue(new C4968i4(new C5391v0("选择改名监听群", EnumC5358u0.f20979h, true, (String) interfaceC1809a12.getValue(), new C4818di(this.f18336h, interfaceC1809a12, 19), false, 224), false));
                break;
            case 4:
                InterfaceC1809a1 interfaceC1809a13 = this.f18337i;
                int size3 = ((List) interfaceC1809a13.getValue()).size();
                int size4 = ((List) interfaceC1809a13.getValue()).size() + 1;
                SharedPreferences sharedPreferences3 = this.f18336h;
                long jM7911s = AbstractC3754e0.m7911s(sharedPreferences3.getLong("transfer_delay_random_min", 500L), 0L, 600000L);
                long jM7911s2 = AbstractC3754e0.m7911s(sharedPreferences3.getLong("transfer_delay_random_max", 3000L), jM7911s, 600000L);
                String str7 = "transfer_" + System.currentTimeMillis() + "_" + size4;
                String strM2249l2 = AbstractC0921a.m2249l(size4, "收款模板 ");
                int i11 = sharedPreferences3.getInt("transfer_delay_mode", 2);
                long jM7911s3 = AbstractC3754e0.m7911s(sharedPreferences3.getLong("transfer_delay_ms", 0L), 0L, 600000L);
                String string8 = sharedPreferences3.getString("transfer_receive_account", "default");
                String str8 = string8 != null ? string8 : "default";
                int i12 = sharedPreferences3.getInt("transfer_mode", 0);
                String string9 = sharedPreferences3.getString("transfer_whitelist", HttpUrl.FRAGMENT_ENCODE_SET);
                String str9 = string9 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string9;
                String string10 = sharedPreferences3.getString("transfer_blacklist", HttpUrl.FRAGMENT_ENCODE_SET);
                String str10 = string10 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string10;
                boolean z10 = sharedPreferences3.getBoolean("transfer_amount_enable", false);
                int i13 = sharedPreferences3.getInt("transfer_amount_cond", 1);
                String string11 = sharedPreferences3.getString("transfer_amount_value", "0");
                String str11 = string11 != null ? string11 : "0";
                int i14 = sharedPreferences3.getInt("transfer_amount_action", 0);
                int i15 = sharedPreferences3.getInt("transfer_keyword_mode", 0);
                String string12 = sharedPreferences3.getString("transfer_keywords", HttpUrl.FRAGMENT_ENCODE_SET);
                String str12 = string12 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string12;
                boolean z11 = sharedPreferences3.getBoolean("transfer_quiet_enable", false);
                int i16 = sharedPreferences3.getInt("transfer_quiet_start_second", 0);
                int i17 = sharedPreferences3.getInt("transfer_quiet_end_second", 0);
                boolean z12 = sharedPreferences3.getBoolean("transfer_refund_rejected", false);
                List listM9537e6 = AbstractC4955ho.m9537e6(sharedPreferences3);
                boolean z13 = sharedPreferences3.getBoolean("transfer_notify_system_enable", false);
                boolean z14 = sharedPreferences3.getBoolean("transfer_notify_toast_enable", false);
                boolean z15 = sharedPreferences3.getBoolean("transfer_notify_sound_enable", false);
                int i18 = sharedPreferences3.getInt("transfer_notify_sound_mode", 0);
                boolean z16 = sharedPreferences3.getBoolean("transfer_notify_vibrate_enable", false);
                String string13 = sharedPreferences3.getString("transfer_notify_sound_uri", HttpUrl.FRAGMENT_ENCODE_SET);
                String str13 = string13 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string13;
                String string14 = sharedPreferences3.getString("transfer_notify_text", "已收款 {amount} 元");
                String str14 = string14 != null ? string14 : "已收款 {amount} 元";
                String string15 = sharedPreferences3.getString("transfer_notify_toast_text", "已收款 {amount} 元");
                String str15 = string15 != null ? string15 : "已收款 {amount} 元";
                boolean z17 = sharedPreferences3.getBoolean("transfer_announce_enable", false);
                String string16 = sharedPreferences3.getString("transfer_announce_text", "收到转账 {amount} 元");
                this.f18338j.setValue(new C5157nu(size3, new C4298i(str7, strM2249l2, true, i11, jM7911s3, jM7911s, jM7911s2, str8, i12, str9, str10, z10, i13, str11, i14, i15, str12, z11, i16, i17, z12, listM9537e6, true, z13, z14, z15, i18, z16, str13, str14, str15, z17, string16 != null ? string16 : "收到转账 {amount} 元"), false));
                break;
            case 5:
                InterfaceC1809a1 interfaceC1809a14 = this.f18337i;
                int size5 = ((List) interfaceC1809a14.getValue()).size();
                int size6 = ((List) interfaceC1809a14.getValue()).size() + 1;
                String str16 = System.currentTimeMillis() + "_" + size6;
                String strM2249l3 = AbstractC0921a.m2249l(size6, "模板 ");
                SharedPreferences sharedPreferences4 = this.f18336h;
                boolean z18 = sharedPreferences4.getBoolean("group_member_reply_join_enable", true);
                boolean z19 = sharedPreferences4.getBoolean("group_member_reply_left_enable", true);
                String string17 = sharedPreferences4.getString("group_member_reply_prompt_type", WeChatSnsPost.TYPE_TEXT);
                String str17 = string17 != null ? string17 : WeChatSnsPost.TYPE_TEXT;
                String string18 = sharedPreferences4.getString("group_member_reply_both_order", "text_first");
                String str18 = string18 != null ? string18 : "text_first";
                String string19 = sharedPreferences4.getString("group_member_reply_join_text", "[AtWx=%userWxid%]\n欢迎进群\n时间：%time%\n群昵称：%groupName%\n进群者微信昵称：%userName%\n进群者群内昵称：%groupNickname%\n进群者ID：%userWxid%");
                String str19 = string19 != null ? string19 : "[AtWx=%userWxid%]\n欢迎进群\n时间：%time%\n群昵称：%groupName%\n进群者微信昵称：%userName%\n进群者群内昵称：%groupNickname%\n进群者ID：%userWxid%";
                String string20 = sharedPreferences4.getString("group_member_reply_left_text", "退群通知：\n时间：%time%\n群昵称：%groupName%\n退群者微信昵称：%userName%\n退群者群内昵称：%groupNickname%\n退群者ID：%userWxid%");
                String str20 = string20 != null ? string20 : "退群通知：\n时间：%time%\n群昵称：%groupName%\n退群者微信昵称：%userName%\n退群者群内昵称：%groupNickname%\n退群者ID：%userWxid%";
                String string21 = sharedPreferences4.getString("group_member_reply_join_card_title", "欢迎：%userName%");
                String str21 = string21 != null ? string21 : "欢迎：%userName%";
                String string22 = sharedPreferences4.getString("group_member_reply_join_card_desc", "ID：%userWxid%\n名片：%groupNickname%\n时间：%time%");
                String str22 = string22 != null ? string22 : "ID：%userWxid%\n名片：%groupNickname%\n时间：%time%";
                String string23 = sharedPreferences4.getString("group_member_reply_left_card_title", "离群：%userName%");
                String str23 = string23 != null ? string23 : "离群：%userName%";
                String string24 = sharedPreferences4.getString("group_member_reply_left_card_desc", "ID：%userWxid%\n名片：%groupNickname%\n时间：%time%");
                String str24 = string24 != null ? string24 : "ID：%userWxid%\n名片：%groupNickname%\n时间：%time%";
                String string25 = sharedPreferences4.getString("group_member_reply_media_order", "none");
                String str25 = string25 != null ? string25 : "none";
                String string26 = sharedPreferences4.getString("group_member_reply_media_sequence", "image,voice,emoji,video,file,favorite");
                String str26 = string26 != null ? string26 : "image,voice,emoji,video,file,favorite";
                String string27 = sharedPreferences4.getString("group_member_reply_join_image_paths", HttpUrl.FRAGMENT_ENCODE_SET);
                String str27 = string27 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string27;
                String string28 = sharedPreferences4.getString("group_member_reply_left_image_paths", HttpUrl.FRAGMENT_ENCODE_SET);
                String str28 = string28 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string28;
                String string29 = sharedPreferences4.getString("group_member_reply_join_voice_paths", HttpUrl.FRAGMENT_ENCODE_SET);
                String str29 = string29 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string29;
                String string30 = sharedPreferences4.getString("group_member_reply_left_voice_paths", HttpUrl.FRAGMENT_ENCODE_SET);
                String str30 = string30 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string30;
                String string31 = sharedPreferences4.getString("group_member_reply_join_emoji_paths", HttpUrl.FRAGMENT_ENCODE_SET);
                String str31 = string31 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string31;
                String string32 = sharedPreferences4.getString("group_member_reply_left_emoji_paths", HttpUrl.FRAGMENT_ENCODE_SET);
                String str32 = string32 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string32;
                String string33 = sharedPreferences4.getString("group_member_reply_join_video_paths", HttpUrl.FRAGMENT_ENCODE_SET);
                String str33 = string33 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string33;
                String string34 = sharedPreferences4.getString("group_member_reply_left_video_paths", HttpUrl.FRAGMENT_ENCODE_SET);
                String str34 = string34 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string34;
                String string35 = sharedPreferences4.getString("group_member_reply_join_file_paths", HttpUrl.FRAGMENT_ENCODE_SET);
                String str35 = string35 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string35;
                String string36 = sharedPreferences4.getString("group_member_reply_left_file_paths", HttpUrl.FRAGMENT_ENCODE_SET);
                String str36 = string36 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string36;
                String string37 = sharedPreferences4.getString("group_member_reply_join_favorite_paths", HttpUrl.FRAGMENT_ENCODE_SET);
                String str37 = string37 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string37;
                String string38 = sharedPreferences4.getString("group_member_reply_left_favorite_paths", HttpUrl.FRAGMENT_ENCODE_SET);
                this.f18338j.setValue(new C4771c4(size5, new C3104q(str16, strM2249l3, true, z18, z19, str17, str18, str19, str20, str21, str22, str23, str24, "custom", str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, string38 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string38, "custom", sharedPreferences4.getInt("group_member_reply_prompt_delay_ms", 0), sharedPreferences4.getInt("group_member_reply_image_delay_ms", 100), sharedPreferences4.getInt("group_member_reply_voice_delay_ms", 100), sharedPreferences4.getInt("group_member_reply_emoji_delay_ms", 100), sharedPreferences4.getInt("group_member_reply_video_delay_ms", 100), sharedPreferences4.getInt("group_member_reply_file_delay_ms", 100), sharedPreferences4.getInt("group_member_reply_favorite_delay_ms", 100)), false));
                break;
            case 6:
                InterfaceC1809a1 interfaceC1809a15 = this.f18337i;
                this.f18338j.setValue(new C5391v0("选择监听群", EnumC5358u0.f20979h, true, (String) interfaceC1809a15.getValue(), new C4818di(this.f18336h, interfaceC1809a15, 18), false, 224));
                break;
            default:
                InterfaceC1809a1 interfaceC1809a16 = this.f18337i;
                int size7 = ((List) interfaceC1809a16.getValue()).size();
                int size8 = ((List) interfaceC1809a16.getValue()).size() + 1;
                SharedPreferences sharedPreferences5 = this.f18336h;
                int i19 = sharedPreferences5.getBoolean("hb_reply_enable", false) ? sharedPreferences5.getInt("hb_reply_type", 1) : 0;
                List listM9528d6 = AbstractC4955ho.m9528d6(sharedPreferences5);
                C2920h c2920h2 = (C2920h) AbstractC4166m.m8424v1(listM9528d6);
                if (AbstractC4955ho.m9373K6(i19)) {
                    string = "谢谢老板";
                    String string39 = sharedPreferences5.getString("hb_reply_text", "谢谢老板");
                    if (string39 == null) {
                        string39 = "谢谢老板";
                    }
                    String string40 = sharedPreferences5.getString("hb_reply_templates", string39);
                    if (string40 != null) {
                        string = string40;
                    }
                } else {
                    string = sharedPreferences5.getString("hb_reply_media_paths", HttpUrl.FRAGMENT_ENCODE_SET);
                    if (string == null) {
                        string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }
                String str38 = System.currentTimeMillis() + "_" + size8;
                String strM2249l4 = AbstractC0921a.m2249l(size8, "模板 ");
                int i20 = sharedPreferences5.getInt("hb_grab_mode", 1);
                int iM9325E6 = AbstractC4955ho.m9325E6(sharedPreferences5);
                int i21 = sharedPreferences5.getInt("hb_auto_delay_value", 0);
                if (i21 < 0) {
                    i21 = 0;
                }
                long j3 = i21;
                if (sharedPreferences5.getInt("hb_auto_delay_unit", 0) == 1) {
                    j3 *= 1000;
                }
                int i22 = sharedPreferences5.getInt("hb_auto_delay_random_min", 500);
                if (i22 < 0) {
                    i22 = 0;
                }
                long j4 = i22;
                int i23 = sharedPreferences5.getInt("hb_auto_delay_random_max", 3000);
                if (i23 < 0) {
                    i23 = 0;
                }
                long j5 = j3;
                long j10 = i23;
                boolean z20 = sharedPreferences5.getBoolean("hb_skip_self", false);
                int i24 = sharedPreferences5.getInt("hb_kw_mode", 0);
                String string41 = sharedPreferences5.getString("hb_keywords", HttpUrl.FRAGMENT_ENCODE_SET);
                String str39 = string41 != null ? string41 : HttpUrl.FRAGMENT_ENCODE_SET;
                if (c2920h2 != null) {
                    c2920h = c2920h2;
                    i9 = c2920h.f9489b;
                } else {
                    c2920h = c2920h2;
                    i9 = i19 == 2 ? 1 : i19;
                }
                if (c2920h == null || (strM9663s6 = c2920h.f9490c) == null) {
                    strM9663s6 = AbstractC4955ho.m9663s6(i19, string);
                }
                String str40 = strM9663s6;
                long jM9349H6 = c2920h != null ? c2920h.f9491d : AbstractC4955ho.m9349H6(sharedPreferences5);
                if (c2920h != null) {
                    z9 = c2920h.f9492e;
                    r5 = 0;
                } else {
                    r5 = 0;
                    z9 = sharedPreferences5.getBoolean("hb_reply_random", false);
                }
                boolean z21 = z9;
                List listM9519c6 = AbstractC4955ho.m9519c6(sharedPreferences5);
                boolean z22 = sharedPreferences5.getBoolean("hb_notify_system_enable", r5);
                boolean z23 = sharedPreferences5.getBoolean("hb_notify_toast_enable", r5);
                boolean z24 = sharedPreferences5.getBoolean("hb_notify_sound_enable", r5);
                int i25 = sharedPreferences5.getInt("hb_notify_sound_mode", r5);
                boolean z25 = sharedPreferences5.getBoolean("hb_notify_vibrate_enable", r5);
                String string42 = sharedPreferences5.getString("hb_notify_sound_uri", HttpUrl.FRAGMENT_ENCODE_SET);
                String str41 = string42 != null ? string42 : HttpUrl.FRAGMENT_ENCODE_SET;
                String string43 = sharedPreferences5.getString("hb_notify_text", "抢到红包 {amount} 元");
                String str42 = string43 != null ? string43 : "抢到红包 {amount} 元";
                String string44 = sharedPreferences5.getString("hb_notify_text", "抢到红包 {amount} 元");
                if (string44 == null) {
                    string44 = "抢到红包 {amount} 元";
                }
                String string45 = sharedPreferences5.getString("hb_notify_toast_text", string44);
                String str43 = string45 != null ? string45 : "抢到红包 {amount} 元";
                boolean z26 = sharedPreferences5.getBoolean("hb_notify_failed_system_enable", false);
                boolean z27 = sharedPreferences5.getBoolean("hb_notify_failed_toast_enable", false);
                String string46 = sharedPreferences5.getString("hb_notify_failed_text", "未抢到红包");
                String str44 = string46 != null ? string46 : "未抢到红包";
                String string47 = sharedPreferences5.getString("hb_notify_failed_text", "未抢到红包");
                if (string47 == null) {
                    string47 = "未抢到红包";
                }
                String string48 = sharedPreferences5.getString("hb_notify_failed_toast_text", string47);
                String str45 = string48 != null ? string48 : "未抢到红包";
                boolean z28 = sharedPreferences5.getBoolean("hb_announce_enable", false);
                String string49 = sharedPreferences5.getString("hb_announce_text", "抢到红包 {amount} 元");
                this.f18338j.setValue(new C5384uq(size7, new C2922j(str38, strM2249l4, false, i20, iM9325E6, j5, j4, j10, z20, 0, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, i24, str39, false, 0, 0, i9, str40, jM9349H6, z21, listM9528d6, listM9519c6, true, z22, z23, z24, i25, z25, str41, str42, str43, z26, z27, str44, str45, z28, string49 != null ? string49 : "抢到红包 {amount} 元"), false));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5037k9(InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f18335g = i9;
        this.f18337i = interfaceC1809a1;
        this.f18336h = sharedPreferences;
        this.f18338j = interfaceC1809a12;
    }
}
