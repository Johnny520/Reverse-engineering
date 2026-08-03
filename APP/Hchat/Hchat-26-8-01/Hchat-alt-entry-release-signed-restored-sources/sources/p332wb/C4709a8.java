package p332wb;

import android.content.SharedPreferences;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1220a;
import p117i0.AbstractC1874r;

/* JADX INFO: renamed from: wb.a8 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4709a8 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15730g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f15731h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f15732i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4709a8(SharedPreferences sharedPreferences, String str, int i9) {
        this.f15730g = i9;
        this.f15731h = sharedPreferences;
        this.f15732i = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f15730g) {
            case 0:
                SharedPreferences sharedPreferences = this.f15731h;
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                String string = sharedPreferences.getString("group_member_reply_join_disabled_groups", HttpUrl.FRAGMENT_ENCODE_SET);
                if (string != null) {
                    str = string;
                }
                return AbstractC1874r.m4639u(Boolean.valueOf(!AbstractC4955ho.m9715y6(str).contains(this.f15732i)));
            case 1:
                String string2 = this.f15731h.getString(AbstractC4955ho.m9412P5(this.f15732i), "global");
                return AbstractC1874r.m4639u(string2 != null ? string2 : "global");
            case 2:
                SharedPreferences sharedPreferences2 = this.f15731h;
                String string3 = sharedPreferences2.getString("group_member_reply_media_order", "none");
                return AbstractC1874r.m4639u(AbstractC4955ho.m9420Q5(sharedPreferences2, "group_member_reply_media_order", this.f15732i, string3 != null ? string3 : "none"));
            case 3:
                SharedPreferences sharedPreferences3 = this.f15731h;
                String string4 = sharedPreferences3.getString("group_member_reply_media_sequence", "image,voice,emoji,video,file,favorite");
                return AbstractC1874r.m4639u(AbstractC4955ho.m9420Q5(sharedPreferences3, "group_member_reply_media_sequence", this.f15732i, string4 != null ? string4 : "image,voice,emoji,video,file,favorite"));
            case 4:
                String strM9396N5 = AbstractC4955ho.m9396N5("group_member_reply_join_image_paths", this.f15732i);
                SharedPreferences sharedPreferences4 = this.f15731h;
                String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string5 = sharedPreferences4.getString(strM9396N5, HttpUrl.FRAGMENT_ENCODE_SET);
                if (string5 != null) {
                    str2 = string5;
                }
                return AbstractC1874r.m4639u(str2);
            case 5:
                String strM9396N52 = AbstractC4955ho.m9396N5("group_member_reply_left_image_paths", this.f15732i);
                SharedPreferences sharedPreferences5 = this.f15731h;
                String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string6 = sharedPreferences5.getString(strM9396N52, HttpUrl.FRAGMENT_ENCODE_SET);
                if (string6 != null) {
                    str3 = string6;
                }
                return AbstractC1874r.m4639u(str3);
            case 6:
                String strM9396N53 = AbstractC4955ho.m9396N5("group_member_reply_join_voice_paths", this.f15732i);
                SharedPreferences sharedPreferences6 = this.f15731h;
                String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string7 = sharedPreferences6.getString(strM9396N53, HttpUrl.FRAGMENT_ENCODE_SET);
                if (string7 != null) {
                    str4 = string7;
                }
                return AbstractC1874r.m4639u(str4);
            case 7:
                String strM9396N54 = AbstractC4955ho.m9396N5("group_member_reply_left_voice_paths", this.f15732i);
                SharedPreferences sharedPreferences7 = this.f15731h;
                String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string8 = sharedPreferences7.getString(strM9396N54, HttpUrl.FRAGMENT_ENCODE_SET);
                if (string8 != null) {
                    str5 = string8;
                }
                return AbstractC1874r.m4639u(str5);
            case 8:
                String strM9396N55 = AbstractC4955ho.m9396N5("group_member_reply_join_emoji_paths", this.f15732i);
                SharedPreferences sharedPreferences8 = this.f15731h;
                String str6 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string9 = sharedPreferences8.getString(strM9396N55, HttpUrl.FRAGMENT_ENCODE_SET);
                if (string9 != null) {
                    str6 = string9;
                }
                return AbstractC1874r.m4639u(str6);
            case 9:
                String strM9396N56 = AbstractC4955ho.m9396N5("group_member_reply_left_emoji_paths", this.f15732i);
                SharedPreferences sharedPreferences9 = this.f15731h;
                String str7 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string10 = sharedPreferences9.getString(strM9396N56, HttpUrl.FRAGMENT_ENCODE_SET);
                if (string10 != null) {
                    str7 = string10;
                }
                return AbstractC1874r.m4639u(str7);
            case 10:
                String strM9396N57 = AbstractC4955ho.m9396N5("group_member_reply_join_video_paths", this.f15732i);
                SharedPreferences sharedPreferences10 = this.f15731h;
                String str8 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string11 = sharedPreferences10.getString(strM9396N57, HttpUrl.FRAGMENT_ENCODE_SET);
                if (string11 != null) {
                    str8 = string11;
                }
                return AbstractC1874r.m4639u(str8);
            case 11:
                SharedPreferences sharedPreferences11 = this.f15731h;
                String str9 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string12 = sharedPreferences11.getString("group_member_reply_left_disabled_groups", HttpUrl.FRAGMENT_ENCODE_SET);
                if (string12 != null) {
                    str9 = string12;
                }
                return AbstractC1874r.m4639u(Boolean.valueOf(!AbstractC4955ho.m9715y6(str9).contains(this.f15732i)));
            case 12:
                String strM9396N58 = AbstractC4955ho.m9396N5("group_member_reply_left_video_paths", this.f15732i);
                SharedPreferences sharedPreferences12 = this.f15731h;
                String str10 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string13 = sharedPreferences12.getString(strM9396N58, HttpUrl.FRAGMENT_ENCODE_SET);
                if (string13 != null) {
                    str10 = string13;
                }
                return AbstractC1874r.m4639u(str10);
            case 13:
                String strM9396N59 = AbstractC4955ho.m9396N5("group_member_reply_join_file_paths", this.f15732i);
                SharedPreferences sharedPreferences13 = this.f15731h;
                String str11 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string14 = sharedPreferences13.getString(strM9396N59, HttpUrl.FRAGMENT_ENCODE_SET);
                if (string14 != null) {
                    str11 = string14;
                }
                return AbstractC1874r.m4639u(str11);
            case 14:
                String strM9396N510 = AbstractC4955ho.m9396N5("group_member_reply_left_file_paths", this.f15732i);
                SharedPreferences sharedPreferences14 = this.f15731h;
                String str12 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string15 = sharedPreferences14.getString(strM9396N510, HttpUrl.FRAGMENT_ENCODE_SET);
                if (string15 != null) {
                    str12 = string15;
                }
                return AbstractC1874r.m4639u(str12);
            case 15:
                String strM9396N511 = AbstractC4955ho.m9396N5("group_member_reply_join_favorite_paths", this.f15732i);
                SharedPreferences sharedPreferences15 = this.f15731h;
                String str13 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string16 = sharedPreferences15.getString(strM9396N511, HttpUrl.FRAGMENT_ENCODE_SET);
                if (string16 != null) {
                    str13 = string16;
                }
                return AbstractC1874r.m4639u(str13);
            case 16:
                String strM9396N512 = AbstractC4955ho.m9396N5("group_member_reply_left_favorite_paths", this.f15732i);
                SharedPreferences sharedPreferences16 = this.f15731h;
                String str14 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string17 = sharedPreferences16.getString(strM9396N512, HttpUrl.FRAGMENT_ENCODE_SET);
                if (string17 != null) {
                    str14 = string17;
                }
                return AbstractC1874r.m4639u(str14);
            case 17:
                String string18 = this.f15731h.getString(AbstractC4955ho.m9380L5(this.f15732i), "global");
                return AbstractC1874r.m4639u(string18 != null ? string18 : "global");
            case 18:
                return AbstractC1874r.m4639u(AbstractC4955ho.m9404O5(this.f15731h, "group_member_reply_prompt_delay_ms", this.f15732i, 0));
            case 19:
                return AbstractC1874r.m4639u(AbstractC4955ho.m9404O5(this.f15731h, "group_member_reply_image_delay_ms", this.f15732i, 100));
            case 20:
                return AbstractC1874r.m4639u(AbstractC4955ho.m9404O5(this.f15731h, "group_member_reply_voice_delay_ms", this.f15732i, 100));
            case 21:
                return AbstractC1874r.m4639u(AbstractC4955ho.m9404O5(this.f15731h, "group_member_reply_emoji_delay_ms", this.f15732i, 100));
            case 22:
                String string19 = this.f15731h.getString(AbstractC4955ho.m9396N5("group_member_reply_prompt_type", this.f15732i), "global");
                return AbstractC1874r.m4639u(string19 != null ? string19 : "global");
            case 23:
                return AbstractC1874r.m4639u(AbstractC4955ho.m9404O5(this.f15731h, "group_member_reply_video_delay_ms", this.f15732i, 100));
            case 24:
                return AbstractC1874r.m4639u(AbstractC4955ho.m9404O5(this.f15731h, "group_member_reply_file_delay_ms", this.f15732i, 100));
            case 25:
                return AbstractC1874r.m4639u(AbstractC4955ho.m9404O5(this.f15731h, "group_member_reply_favorite_delay_ms", this.f15732i, 100));
            case 26:
                String strM9396N513 = AbstractC4955ho.m9396N5("group_member_reply_both_order", this.f15732i);
                SharedPreferences sharedPreferences17 = this.f15731h;
                String string20 = sharedPreferences17.getString("group_member_reply_both_order", "text_first");
                if (string20 == null) {
                    string20 = "text_first";
                }
                String string21 = sharedPreferences17.getString(strM9396N513, string20);
                if (string21 == null) {
                    String string22 = sharedPreferences17.getString("group_member_reply_both_order", "text_first");
                    string21 = string22 != null ? string22 : "text_first";
                }
                return AbstractC1874r.m4639u(string21);
            default:
                String str15 = this.f15732i;
                str15.getClass();
                String string23 = this.f15731h.getString("group_rename_prompt_type_".concat(str15), "global");
                return AbstractC1874r.m4639u(string23 != null ? string23 : "global");
        }
    }
}
