// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS43;
import b.ˆʿ.CLS44;
import b.ˆʿ.CLS61;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS91;
import b.ˈˈ.CLS93;
import b.ˊﾞ.CLS612;
import b.יﹳ.CLS166;
import b.ᵔʾ.CLS1225;
import b.ᵔʾ.CLS1233;
import b.ᵔʾ.CLS1248;
import b.ᵔʾ.CLS1263;
import b.ⁱʾ.CLS350;
import b.ⁱᵔ.CLS1279;
import b.ⁱᵔ.CLS1405;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1627;
import b.ﾞˎ.CLS1635;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public final class CLS1019 extends CLS219 {
    public final CLS43 FLD2084;
    public final CLS485 FLD2085;
    public final ArrayList FLD2086;
    public final ArrayList FLD2087;
    public final CLS61 FLD2088;
    public final ArrayList FLD2089;
    public final CLS44 FLD2090;
    public ArrayList FLD2091;
    public final CLS371 FLD2092;

    public CLS1019(String s, String s1) {
        super(s, s1);
        this.FLD2088 = (CLS61)CLS40.FLD157.MTH1118(CLS61.class);
        this.FLD2092 = CLS371.FLD3470;
        this.FLD2090 = (CLS44)CLS40.FLD157.MTH1118(CLS44.class);
        this.FLD2085 = (CLS485)CLS40.FLD157.MTH1118(CLS485.class);
        this.FLD2084 = (CLS43)CLS40.FLD157.MTH1118(CLS43.class);
        this.FLD2086 = new ArrayList();
        this.FLD2087 = new ArrayList();
        this.FLD2091 = new ArrayList();
        this.FLD2089 = new ArrayList();
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3874(boolean z, boolean z1, String s) {
        this.FLD2086.clear();
        this.FLD2087.clear();
        this.FLD2089.clear();
        CLS938 ʾʿ0 = new CLS938(this, 8);
        CLS40.FLD157.MTH1124(((CLS39)ʾʿ0));
        if(z1) {
            ((CLS219)this).MTH3875();
        }
        CLS380 ʼˎ0 = new CLS380(((CLS219)this).MTH3883(), this.FLD2156);
        ʼˎ0.FLD3527 = new CLS938(this, 0);
        ʼˎ0.FLD3518 = new CLS1069(((CLS219)this), z, z1, 3);
        ʼˎ0.FLD3519 = new CLS1627(5, this);
        ʼˎ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS219)this).MTH3882(s);
        }
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public final void MTH3822(String s, JSONObject jSONObject0) {
        try {
            CLS44 ˆٴ0 = this.FLD2090;
            CLS29 ˎᵢ0 = this.FLD2151;
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("exit_room_notice_enable", false)), s + "_exit_room_notice_enable");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("exit_room_sendmsg_enable", false)), s + "_exit_room_sendmsg_enable");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("show_invite_info_enable", false)), s + "_show_invite_info_enable");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("autoban_enable", false)), s + "_autoban_enable");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("chatroom_ban_sendmsg_enable", false)), s + "_chatroom_ban_sendmsg_enable");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("mod_invite_only", false)), s + "_mod_invite_only");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("mod_invite_only_kickboth", false)), s + "_mod_invite_only_kickboth");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("name_change_ban_enable", false)), s + "_name_change_ban_enable");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("fake_owner_ban_enable", false)), s + "_fake_owner_ban_enable");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("multiple_at_ban_enable", false)), s + "_multiple_at_ban_enable");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("exit_room_autoban_enable", false)), s + "_exit_room_autoban_enable");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("text_max_length_ban_enable", false)), s + "_text_max_length_ban_enable");
            ˎᵢ0.MTH922(jSONObject0.optInt("text_max_length", 200), s + "_text_max_length");
            ˎᵢ0.MTH922(jSONObject0.optString("text_max_ban_reason", CLS27.MTH889("text_max_ban_reason")), s + "_text_max_ban_reason");
            ˎᵢ0.MTH922(jSONObject0.optString("text_max_ban_time", ""), s + "_text_max_ban_time");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("chatroom_repeat_ban_enable", false)), s + "_chatroom_repeat_ban_enable");
            ˎᵢ0.MTH922(jSONObject0.optInt("chatroom_repeat_max", 5), s + "_chatroom_repeat_max");
            ˎᵢ0.MTH922(jSONObject0.optString("repeat_ban_reason", CLS27.MTH889("repeat_ban_reason")), s + "_repeat_ban_reason");
            ˎᵢ0.MTH922(jSONObject0.optString("repeat_max_ban_time", ""), s + "_repeat_max_ban_time");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("auto_kick_keyword_enable", false)), s + "_auto_kick_keyword_enable");
            ˎᵢ0.MTH922(jSONObject0.optString("auto_kick_keyword_text", ""), s + "_auto_kick_keyword_text");
            ˎᵢ0.MTH922(jSONObject0.optString("keyword_goodbye_text", CLS27.MTH889("goodbye_text")), s + "_keyword_goodbye_text");
            ˎᵢ0.MTH922(jSONObject0.optString("keyword_ban_time", ""), s + "_keyword_ban_time");
            ˎᵢ0.MTH922(jSONObject0.optString("goodbye_text", CLS27.MTH889("goodbye_text")), s + "_goodbye_text");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("whitelist_enable", false)), s + "_whitelist_enable");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("chatroom_intro_enable", false)), "chatroom_intro_" + s + "_enable");
            ˎᵢ0.MTH922(jSONObject0.optString("chatroom_intro_text", ""), "chatroom_intro_" + s + "_text");
            String s1 = jSONObject0.optString("_CHATROOM_INTRO_template", "");
            if(!TextUtils.isEmpty(s1)) {
                try {
                    CLS91 ᵔʾ0 = new CLS91(new JSONObject(s1));
                    ᵔʾ0.MTH1739("_CHATROOM_INTRO_" + s);
                    ˆٴ0.MTH1180("_CHATROOM_INTRO_" + s);
                    ˆٴ0.MTH1182(ᵔʾ0);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
            }
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("checkin_enable", false)), s + "_checkin_enable");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("auto_checkin_enable", false)), s + "_auto_checkin_enable");
            ˎᵢ0.MTH922(jSONObject0.optString("checkin_keyword", CLS27.MTH889("checkin_keyword_default")), s + "_checkin_keyword");
            ˎᵢ0.MTH922(jSONObject0.optString("checkin_msg", CLS27.MTH889("checkin_templ_msg")), s + "_checkin_msg");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("chatroom_article_ban_enable", false)), s + "_chatroom_article_ban_enable");
            ˎᵢ0.MTH922(jSONObject0.optString("article_ban_reason", CLS27.MTH889("article_ban_reason")), s + "_article_ban_reason");
            ˎᵢ0.MTH922(jSONObject0.optString("article_max_ban_time", ""), s + "_article_max_ban_time");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("chatroom_article_ban_warning_enable", false)), s + "_chatroom_article_ban_warning_enable");
            ˎᵢ0.MTH922(jSONObject0.optInt("chatroom_article_ban_warning_max"), s + "_chatroom_article_ban_warning_max");
            ˎᵢ0.MTH922(jSONObject0.optString("article_banwarning_reason", CLS27.MTH889("warning_default_text")), s + "_article_banwarning_reason");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("chatroom_app_ban_enable", false)), s + "_chatroom_app_ban_enable");
            ˎᵢ0.MTH922(jSONObject0.optString("app_ban_reason", CLS27.MTH889("app_ban_reason")), s + "_app_ban_reason");
            ˎᵢ0.MTH922(jSONObject0.optString("app_max_ban_time", ""), s + "_app_max_ban_time");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("chatroom_app_ban_warning_enable", false)), s + "_chatroom_app_ban_warning_enable");
            ˎᵢ0.MTH922(jSONObject0.optInt("chatroom_app_ban_warning_max", 3), s + "_chatroom_app_ban_warning_max");
            ˎᵢ0.MTH922(jSONObject0.optString("app_banwarning_reason", CLS27.MTH889("warning_default_text")), s + "_app_banwarning_reason");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("chatroom_friendcard_ban_enable", false)), s + "_chatroom_friendcard_ban_enable");
            ˎᵢ0.MTH922(jSONObject0.optString("friendcard_ban_reason", CLS27.MTH889("friendcard_ban_reason")), s + "_friendcard_ban_reason");
            ˎᵢ0.MTH922(jSONObject0.optString("friendcard_max_ban_time", ""), s + "_friendcard_max_ban_time");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("chatroom_friendcard_ban_warning_enable", false)), s + "_chatroom_friendcard_ban_warning_enable");
            ˎᵢ0.MTH922(jSONObject0.optInt("chatroom_friendcard_ban_warning_max"), s + "_chatroom_friendcard_ban_warning_max");
            ˎᵢ0.MTH922(jSONObject0.optString("friendcard_banwarning_reason", CLS27.MTH889("warning_default_text")), s + "_friendcard_banwarning_reason");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("chatroom_images_ban_enable", false)), s + "_chatroom_images_ban_enable");
            ˎᵢ0.MTH922(jSONObject0.optString("images_ban_reason", CLS27.MTH889("images_ban_reason")), s + "_images_ban_reason");
            ˎᵢ0.MTH922(jSONObject0.optString("images_max_ban_time", ""), s + "_images_max_ban_time");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("chatroom_images_ban_warning_enable", false)), s + "_chatroom_images_ban_warning_enable");
            ˎᵢ0.MTH922(jSONObject0.optInt("chatroom_images_ban_warning_max"), s + "_chatroom_images_ban_warning_max");
            ˎᵢ0.MTH922(jSONObject0.optString("images_banwarning_reason", CLS27.MTH889("warning_default_text")), s + "_images_banwarning_reason");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("chatroom_qrcode_ban_enable", false)), s + "_chatroom_qrcode_ban_enable");
            ˎᵢ0.MTH922(jSONObject0.optString("qrcode_ban_reason", CLS27.MTH889("qrcode_ban_reason")), s + "_qrcode_ban_reason");
            ˎᵢ0.MTH922(jSONObject0.optString("qrcode_max_ban_time", ""), s + "_qrcode_max_ban_time");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("chatroom_qrcode_ban_warning_enable", false)), s + "_chatroom_qrcode_ban_warning_enable");
            ˎᵢ0.MTH922(jSONObject0.optInt("chatroom_qrcode_ban_warning_max"), s + "_chatroom_qrcode_ban_warning_max");
            ˎᵢ0.MTH922(jSONObject0.optString("qrcode_banwarning_reason", CLS27.MTH889("warning_default_text")), s + "_qrcode_banwarning_reason");
            ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean("chatroom_keyword_ban_warning_enable", false)), s + "_chatroom_keyword_ban_warning_enable");
            ˎᵢ0.MTH922(jSONObject0.optInt("chatroom_keyword_ban_warning_max"), s + "_chatroom_keyword_ban_warning_max");
            ˎᵢ0.MTH922(jSONObject0.optString("keyword_banwarning_reason", CLS27.MTH889("warning_default_text")), s + "_keyword_banwarning_reason");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ᐧˉ.CLS219
    public final void MTH3878(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        public final class CLS1004 implements CLS2 {
            public final String FLD2056;

            public CLS1004(String s) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    String s2 = this.FLD2056;
                    Class class0 = CLS27.MTH894("renameRoomRemarkClass1");
                    if(class0 != null) {
                        Class class1 = CLS27.MTH894("dbClass1");
                        if(class1 != null) {
                            Class class2 = CLS27.MTH894("RoomNameClass3");
                            if(class2 != null) {
                                String s3 = CLS27.MTH904();
                                try {
                                    Object object0 = CLS166.MTH3188(class0, new Object[0]);
                                    CLS166.MTH3198(object0, CLS27.MTH897("renameRoomRemarkField1"), "");
                                    CLS166.MTH3198(object0, CLS27.MTH897("renameRoomRemarkField2"), s3);
                                    CLS166.MTH3198(object0, CLS27.MTH897("renameRoomRemarkField3"), s2);
                                    Object object1 = CLS166.MTH3188(class2, new Object[]{0x30, object0});
                                    CLS166.MTH3195(CLS166.MTH3195(CLS166.MTH3192(class1, CLS27.MTH897("dbMethod1"), new Object[0]), CLS27.MTH897("delMethod5"), new Object[0]), CLS27.MTH897("delMethod6"), new Object[]{object1});
                                }
                                catch(Throwable throwable0) {
                                    CLS27.MTH893(throwable0);
                                }
                            }
                        }
                    }
                }
            }
        }


        public final class CLS1005 implements CLS2 {
            public CLS1005() {
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    CLS66.MTH1445("", true);
                }
            }
        }


        public final class CLS1006 implements CLS2 {
            public CLS1006() {
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    CLS66.MTH1445("", false);
                }
            }
        }


        public final class CLS1007 implements CLS2 {
            public final CLS1019 FLD2057;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1019 ˎʻ0 = CLS1019.this;
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    ˎʻ0.FLD2151.MTH922(s, "prevent_at_include");
                    return;
                }
                ˎʻ0.FLD2151.MTH922("", "prevent_at_include");
            }
        }


        public final class CLS1008 implements CLS2 {
            public final Activity FLD2058;

            public CLS1008(Activity activity0) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    String s2 = CLS27.MTH889("rename_chatrooms");
                    CLS1622 ˑٴ0 = new CLS1622(this.FLD2058);
                    CLS1635 ﾞᵎ0 = new CLS1635(this.FLD2058);
                    CLS1279 ʻᐧ0 = new CLS1279(ˑٴ0, this.FLD2058, ﾞᵎ0, 0);
                    CLS1405 ˉˎ0 = new CLS1405(ˑٴ0, arrayList0, ﾞᵎ0);
                    CLS523.MTH7160(this.FLD2058, s2, ((CLS17)ʻᐧ0), ((CLS11)ˉˎ0));
                }
            }
        }


        public final class CLS1010 implements CLS2 {
            public final Activity FLD2066;

            public CLS1010(Activity activity0) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    CLS1139 ᴵٴ0 = new CLS1139(this, arrayList0);
                    CLS523.MTH7142(this.FLD2066, ((CLS11)ᴵٴ0));
                }
            }
        }


        public final class CLS1012 implements CLS2 {
            public final CLS1019 FLD2073;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1019 ˎʻ0 = CLS1019.this;
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    ˎʻ0.FLD2151.MTH922(s, "auto_remark_new_chat_member_allowlist");
                    return;
                }
                ˎʻ0.FLD2151.MTH922("", "auto_remark_new_chat_member_allowlist");
            }
        }


        public final class CLS1013 implements CLS2 {
            public final String FLD2074;

            public CLS1013(String s) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    CLS66.MTH1376("", this.FLD2074);
                }
            }
        }


        public final class CLS1014 implements CLS2 {
            public final CLS1019 FLD2075;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1019 ˎʻ0 = CLS1019.this;
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    ˎʻ0.FLD2151.MTH922(s, "prevent_at_exclude");
                    return;
                }
                ˎʻ0.FLD2151.MTH922("", "prevent_at_exclude");
            }
        }


        public final class CLS1015 implements CLS2 {
            public final CLS1019 FLD2076;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1019.this.FLD2151.MTH922(s, "autokick_member_friend_request_list");
            }
        }


        public final class CLS1017 implements CLS2 {
            public CLS1017() {
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    Iterator iterator0 = arrayList0.iterator();
                    while(iterator0.hasNext()) {
                        iterator0.next();
                        CLS66.MTH1518("");
                    }
                }
            }
        }


        public final class CLS1018 implements CLS2 {
            public final CLS1019 FLD2083;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1019 ˎʻ0 = CLS1019.this;
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    for(Object object0: arrayList0) {
                        CLS78 ˊﾞ0 = (CLS78)object0;
                        try {
                            CLS66.MTH1436("", ˎʻ0.FLD2157);
                            ˎʻ0.FLD2092.getClass();
                            ˎʻ0.FLD2092.MTH5346("chatroom", "chatroomname = ?", new String[]{""});
                            CLS66.MTH1444("", null);
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                    }
                }
            }
        }

        int v = CLS523.MTH7137(10);
        Activity activity0 = ((CLS219)this).MTH3883();
        CLS29 ˎᵢ0 = this.FLD2151;
        boolean z3 = ˎᵢ0.MTH938("at_notification_en", false);
        CLS485 ᐧﾞ0 = this.FLD2085;
        if(z3) {
            ᐧﾞ0.getClass();
            CLS485.MTH6726(activity0, "at");
        }
        CLS1635 ﾞᵎ0 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ0.MTH800(CLS27.MTH889("chatroom_tags"));
        ﾞᵎ0.MTH7437(ˎᵢ0.MTH938("chatroom_tags", false));
        ﾞᵎ0.MTH7438(new CLS177(this, 0));
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ـˏ0.MTH800(CLS27.MTH889("chatroom_tags"));
        ـˏ0.MTH7320(new CLS173(activity0, 5));
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH7289(new Object[]{ﾞᵎ0, ـˏ0});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
        CLS1635 ﾞᵎ1 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ1.MTH800(CLS27.MTH889("mod_cmd_enable"));
        ﾞᵎ1.MTH7437(ˎᵢ0.MTH938("mod_cmd_enable", false));
        ﾞᵎ1.MTH7438(new CLS177(this, 10));
        CLS1635 ﾞᵎ2 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ2.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100765359684768565L, ﾞᵎ2, 4100765462763983669L), CLS412.MTH6002()));
        ﾞᵎ2.MTH7438(new CLS177(this, 14));
        CLS1635 ﾞᵎ3 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ3.MTH800(CLS27.MTH889("nickname_change_notif_enable"));
        ﾞᵎ3.MTH7437(ˎᵢ0.MTH938("nickname_change_notif_enable", false));
        ﾞᵎ3.MTH7438(new CLS177(this, 16));
        CLS1635 ﾞᵎ4 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ4.MTH798(CLS27.MTH889("fast_announce_enable_text"));
        ﾞᵎ4.MTH800(CLS27.MTH889("fast_announce_enable"));
        ﾞᵎ4.MTH7437(ˎᵢ0.MTH938("fast_announce_enable", false));
        ﾞᵎ4.MTH7438(new CLS177(this, 17));
        CLS1635 ﾞᵎ5 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ5.MTH800(CLS27.MTH889("automute_new_chatroom"));
        ﾞᵎ5.MTH7437(ˎᵢ0.MTH938("automute_new_chatroom", false));
        ﾞᵎ5.MTH7438(new CLS177(this, 18));
        CLS1635 ﾞᵎ6 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ6.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100765746231825205L, ﾞᵎ6, 4100766424836657973L), CLS412.MTH6002()));
        ﾞᵎ6.MTH7438(new CLS177(this, 19));
        CLS1623 יᐧ1 = new CLS1623(activity0);
        יᐧ1.MTH7289(new Object[]{ﾞᵎ1, ﾞᵎ2, ﾞᵎ3, ﾞᵎ4, ﾞᵎ5, ﾞᵎ6});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        CLS1635 ﾞᵎ7 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ7.MTH800(CLS27.MTH889("at_notification_enable"));
        ﾞᵎ7.MTH7437(ˎᵢ0.MTH938("at_notification_enable", false));
        ﾞᵎ7.MTH7438(new CLS177(this, 20));
        CLS1635 ﾞᵎ8 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ8.MTH800(CLS27.MTH889("at_notification_enable2"));
        ﾞᵎ8.MTH7437(ˎᵢ0.MTH938("at_notification_en", false));
        ﾞᵎ8.MTH7438(new CLS177(this, 21));
        CLS1625 ـˏ1 = new CLS1625(activity0);
        ـˏ1.MTH800(CLS27.MTH889("config_notification"));
        ـˏ1.MTH7320(new CLS245(this, activity0, 0));
        CLS1625 ـˏ2 = new CLS1625(activity0);
        ـˏ2.MTH800(CLS27.MTH889("reset_notification_channel"));
        ـˏ2.MTH7320(new CLS245(this, activity0, 1));
        ᐧﾞ0.getClass();
        if(!CLS485.MTH6739(activity0, "wx_at")) {
            ـˏ1.MTH801(8);
            ـˏ2.MTH801(8);
        }
        CLS1635 ﾞᵎ9 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ9.MTH800(CLS27.MTH889("prevent_at_enable"));
        ﾞᵎ9.MTH7437(ˎᵢ0.MTH938("prevent_at_enable", false));
        ﾞᵎ9.MTH7438(new CLS177(this, 1));
        CLS1625 ـˏ3 = new CLS1625(activity0);
        ـˏ3.MTH800(CLS27.MTH889("config_include"));
        ـˏ3.MTH798(CLS27.MTH889("prevent_at_include_desc"));
        ـˏ3.MTH7320(new CLS245(this, activity0, 2));
        CLS1625 ـˏ4 = new CLS1625(activity0);
        ـˏ4.MTH800(CLS27.MTH889("config_exclude"));
        ـˏ4.MTH798(CLS27.MTH889("prevent_at_exclude_desc"));
        ـˏ4.MTH7320(new CLS245(this, activity0, 3));
        CLS1635 ﾞᵎ10 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ10.MTH798(CLS27.MTH889("chatroom_custom_at_text"));
        ﾞᵎ10.MTH800(CLS27.MTH889("chatroom_custom_at_enable"));
        ﾞᵎ10.MTH7437(ˎᵢ0.MTH938("chatroom_custom_at_enable", false));
        ﾞᵎ10.MTH7438(new CLS177(this, 2));
        CLS1623 יᐧ2 = new CLS1623(activity0);
        יᐧ2.MTH7289(new Object[]{ﾞᵎ7, ﾞᵎ8, ـˏ1, ـˏ2, ﾞᵎ9, ـˏ3, ـˏ4, ﾞᵎ10});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
        if(CLS27.MTH899(new String[]{"ChattingDataAdapterV2_userTV", "ChattingDataAdapter_userTV", "ChattingDataAdapterV3_userTV"})) {
            CLS1623 יᐧ3 = new CLS1623(activity0);
            CLS1635 ﾞᵎ11 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ11.MTH800(CLS27.MTH889("show_chatroom_mod_label"));
            ﾞᵎ11.MTH7437(ˎᵢ0.MTH938("show_chatroom_mod_label", false));
            ﾞᵎ11.MTH7438(new CLS177(this, 3));
            יᐧ3.MTH7296(ﾞᵎ11);
            CLS1622 ˑٴ0 = ((CLS219)this).MTH3880(z1, z2);
            ˑٴ0.MTH800(CLS27.MTH889("chatroom_owner_label"));
            ˑٴ0.MTH7278(1);
            ˑٴ0.MTH7277(CLS27.MTH895().MTH925("chatroom_owner_lbl", CLS27.MTH889("chatroom_owner_lbl")));
            ˑٴ0.FLD5252 = new CLS1225(18);
            יᐧ3.MTH7296(ˑٴ0);
            CLS1622 ˑٴ1 = ((CLS219)this).MTH3880(z1, z2);
            ˑٴ1.MTH800(CLS27.MTH889("chatroom_mod_label"));
            ˑٴ1.MTH7278(1);
            ˑٴ1.MTH7277(CLS27.MTH895().MTH925("chatroom_mod_lbl", CLS27.MTH889("chatroom_mod_lbl")));
            ˑٴ1.FLD5252 = new CLS1225(19);
            יᐧ3.MTH7296(ˑٴ1);
            if(CLS500.FLD4928.MTH6895("show_realname")) {
                CLS1635 ﾞᵎ12 = ((CLS219)this).MTH3879(z1, z2);
                ﾞᵎ12.MTH800(CLS27.MTH889("show_realname_label_enable"));
                ﾞᵎ12.MTH7437(ˎᵢ0.MTH938("show_realname_label_enable", false));
                ﾞᵎ12.MTH7438(new CLS177(this, 4));
                יᐧ3.MTH7296(ﾞᵎ12);
            }
            יᐧ3.MTH7290(linearLayout0, v);
        }
        CLS1623 יᐧ4 = new CLS1623(activity0);
        CLS1617 ʻᵎ0 = new CLS1617(activity0);
        ʻᵎ0.MTH7200(z);
        ʻᵎ0.MTH800(CLS27.MTH889("room_management"));
        ʻᵎ0.FLD5159 = new CLS1037(((CLS219)this), activity0, z1, z2, v, 1);
        יᐧ4.MTH7296(ʻᵎ0);
        if(!this.FLD2154.MTH5947("chatroom_container")) {
            Activity activity1 = ((CLS219)this).MTH3883();
            CLS1617 ʻᵎ1 = new CLS1617(activity1);
            ʻᵎ1.MTH7200(z);
            ʻᵎ1.MTH800(CLS27.MTH889("chatroom_container"));
            ʻᵎ1.FLD5159 = new CLS932(this, z1, z2, activity1, 0);
            יᐧ4.MTH7296(ʻᵎ1);
        }
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ4), v);
        CLS500 ᵢﹶ0 = this.FLD2153;
        if(ᵢﹶ0.MTH6895("auto_remark_new_contact")) {
            CLS1623 יᐧ5 = new CLS1623(activity0);
            CLS1635 ﾞᵎ13 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ13.MTH800(CLS27.MTH889("auto_remark_new_chat_member"));
            ﾞᵎ13.MTH7437(ˎᵢ0.MTH938("auto_remark_new_chat_member", false));
            ﾞᵎ13.MTH7438(new CLS177(this, 5));
            יᐧ5.MTH7296(ﾞᵎ13);
            CLS1635 ﾞᵎ14 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ14.MTH800(CLS27.MTH889("auto_remark_new_chat_member_skip_remarked"));
            ﾞᵎ14.MTH7437(ˎᵢ0.MTH938("auto_remark_new_chat_member_skip_remarked", false));
            ﾞᵎ14.MTH7438(new CLS177(this, 6));
            CLS1625 ـˏ5 = CLS34.MTH1082(יᐧ5, ﾞᵎ14, activity0);
            ـˏ5.MTH800(CLS27.MTH889("config_include"));
            ـˏ5.MTH7320(new CLS245(this, activity0, 4));
            יᐧ5.MTH7296(ـˏ5);
            CLS1635 ﾞᵎ15 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ15.MTH800(CLS27.MTH889("auto_remark_new_contact_append"));
            ﾞᵎ15.MTH7437(ˎᵢ0.MTH938("auto_remark_new_chat_member_append", false));
            ﾞᵎ15.MTH7438(new CLS177(this, 7));
            יᐧ5.MTH7296(ﾞᵎ15);
            CLS1635 ﾞᵎ16 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ16.MTH800(CLS27.MTH889("auto_remark_new_contact_date"));
            ﾞᵎ16.MTH7437(ˎᵢ0.MTH938("auto_remark_new_chat_member_date", true));
            ﾞᵎ16.MTH7438(new CLS177(this, 8));
            CLS1622 ˑٴ2 = CLS182.MTH3486(יᐧ5, ﾞᵎ16, activity0);
            ˑٴ2.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(4100743773179138869L, ˑٴ2, 0x38E8C5602B3CD335L), "yyMMdd"));
            ˑٴ2.FLD5252 = new CLS938(this, 1);
            יᐧ5.MTH7296(ˑٴ2);
            CLS1635 ﾞᵎ17 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ17.MTH800(CLS27.MTH889("auto_remark_new_contact_custom"));
            ﾞᵎ17.MTH7437(ˎᵢ0.MTH938("auto_remark_new_chat_member_custom", false));
            ﾞᵎ17.MTH7438(new CLS177(this, 9));
            CLS1622 ˑٴ3 = CLS182.MTH3486(יᐧ5, ﾞᵎ17, activity0);
            ˑٴ3.FLD5256 = CLS27.MTH889("auto_remark_new_contact_custom");
            ˑٴ3.MTH800(ˎᵢ0.MTH925("auto_remark_new_chat_member_custom_text", ""));
            ˑٴ3.FLD5252 = new CLS938(this, 2);
            יᐧ5.MTH7296(ˑٴ3);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ5), v);
        }
        CLS1623 יᐧ6 = new CLS1623(activity0);
        CLS1621 ˎᵢ1 = new CLS1621(activity0);
        ˎᵢ1.MTH800(CLS27.MTH889("chatroom_invite_timeout"));
        ˎᵢ1.MTH7268(((long)CLS412.MTH6005(3600000, "chatroom_invite_timeout")));
        ˎᵢ1.FLD5242 = new CLS938(this, 3);
        יᐧ6.MTH7296(ˎᵢ1);
        if(ᵢﹶ0.MTH6895("chatroom_send_multi_invites")) {
            CLS1625 ـˏ6 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ6.MTH800(CLS27.MTH889("chatroom_send_multi_invites"));
            ـˏ6.MTH7320(new CLS173(activity0, 6));
            יᐧ6.MTH7296(ـˏ6);
            CLS1621 ˎᵢ2 = new CLS1621(activity0);
            ˎᵢ2.MTH800(CLS27.MTH889("send_invites_delay"));
            ˎᵢ2.MTH7268(((long)CLS412.MTH6005(5000, "send_invites_delay")));
            ˎᵢ2.FLD5242 = new CLS938(this, 4);
            יᐧ6.MTH7296(ˎᵢ2);
            CLS1622 ˑٴ4 = new CLS1622(activity0);
            ˑٴ4.MTH800(CLS27.MTH889("send_invites_max_members"));
            ˑٴ4.MTH7277(String.valueOf(CLS412.MTH6005(5, "send_invites_max_members")));
            ˑٴ4.FLD5252 = new CLS938(this, 5);
            יᐧ6.MTH7296(ˑٴ4);
        }
        if(ᵢﹶ0.MTH6895("invite_by_keys")) {
            CLS1635 ﾞᵎ18 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ18.MTH800(CLS27.MTH889("invite_by_keys"));
            ﾞᵎ18.MTH7437(ˎᵢ0.MTH938("invite_by_keys", false));
            ﾞᵎ18.MTH7438(new CLS177(this, 11));
            יᐧ6.MTH7296(ﾞᵎ18);
            CLS1635 ﾞᵎ19 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ19.MTH800(CLS27.MTH889("delete_contact_on_invite"));
            ﾞᵎ19.MTH7437(ˎᵢ0.MTH938("delete_contact_on_invite", false));
            ﾞᵎ19.MTH7438(new CLS177(this, 12));
            יᐧ6.MTH7296(ﾞᵎ19);
            CLS1625 ـˏ7 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ7.MTH800(CLS27.MTH889("config_invite_by_keys"));
            ـˏ7.MTH7320(new CLS173(activity0, 7));
            יᐧ6.MTH7296(ـˏ7);
        }
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ6), v);
        if(ᵢﹶ0.MTH6895("f_autokick_member_friend_request")) {
            CLS1635 ﾞᵎ20 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ20.MTH800(CLS27.MTH889("autokick_member_friend_request"));
            ﾞᵎ20.MTH7437(ˎᵢ0.MTH938("autokick_member_friend_request", false));
            ﾞᵎ20.MTH7438(new CLS177(this, 13));
            CLS1625 ـˏ8 = new CLS1625(activity0);
            ـˏ8.MTH800(CLS27.MTH889("select_chatrooms"));
            ـˏ8.MTH7320(new CLS245(this, activity0, 5));
            CLS1623 יᐧ7 = new CLS1623(activity0);
            יᐧ7.MTH7289(new Object[]{ﾞᵎ20, ـˏ8});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ7), v);
        }
        CLS1623 יᐧ8 = new CLS1623(activity0);
        if(ᵢﹶ0.MTH6895("auto_accept_chatroom_invite_qr") || ᵢﹶ0.MTH6895("auto_accept_chatroom_invite") || ᵢﹶ0.MTH6895("aa_chatroom_invite")) {
            Activity activity2 = ((CLS219)this).MTH3883();
            CLS1617 ʻᵎ2 = new CLS1617(activity2);
            ʻᵎ2.MTH7200(z);
            ʻᵎ2.MTH800(CLS27.MTH889("auto_accept_chatroom_invite"));
            ʻᵎ2.FLD5159 = new CLS932(this, activity2, z1, z2);
            יᐧ8.MTH7296(ʻᵎ2);
        }
        CLS1623 יᐧ9 = CLS34.MTH1087(linearLayout0, יᐧ8, v, activity0);
        if(ᵢﹶ0.MTH6895("auto_exit_chatroom")) {
            String s = CLS27.MTH889("auto_exit_chatroom");
            Activity activity3 = ((CLS219)this).MTH3883();
            CLS1617 ʻᵎ3 = new CLS1617(activity3);
            ʻᵎ3.MTH7200(z);
            ʻᵎ3.MTH800(s);
            ʻᵎ3.FLD5159 = new CLS932(this, z1, z2, activity3, 2);
            יᐧ9.MTH7296(ʻᵎ3);
        }
        CLS1623 יᐧ10 = CLS34.MTH1087(linearLayout0, יᐧ9, v, activity0);
        CLS1625 ـˏ9 = ((CLS219)this).MTH3877(z1, z2);
        ـˏ9.MTH800(CLS27.MTH889("mass_del_chatrooms"));
        ـˏ9.MTH7320(new CLS245(this, activity0, 6));
        יᐧ10.MTH7296(ـˏ9);
        CLS1625 ـˏ10 = ((CLS219)this).MTH3877(z1, z2);
        ـˏ10.MTH800(CLS27.MTH889("mass_del_removed_chatrooms"));
        ـˏ10.MTH7320(new CLS245(this, activity0, 7));
        יᐧ10.MTH7296(ـˏ10);
        CLS1625 ـˏ11 = ((CLS219)this).MTH3877(z1, z2);
        ـˏ11.MTH800(CLS27.MTH889("save_room_to_contacts"));
        ـˏ11.MTH7320(new CLS245(this, activity0, 8));
        יᐧ10.MTH7296(ـˏ11);
        CLS1625 ـˏ12 = ((CLS219)this).MTH3877(z1, z2);
        ـˏ12.MTH800(CLS27.MTH889("mass_mute"));
        ـˏ12.MTH7320(new CLS245(this, activity0, 9));
        יᐧ10.MTH7296(ـˏ12);
        CLS1625 ـˏ13 = ((CLS219)this).MTH3877(z1, z2);
        ـˏ13.MTH800(CLS27.MTH889("mass_unmute"));
        ـˏ13.MTH7320(new CLS245(this, activity0, 10));
        יᐧ10.MTH7296(ـˏ13);
        if(!TextUtils.isEmpty(CLS27.MTH897("renameRoomRemarkClass1")) && CLS27.MTH902("mass_chatroom_nickname")) {
            CLS1625 ـˏ14 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ14.MTH800(CLS27.MTH889("mass_chatroom_nickname"));
            ـˏ14.MTH7320(new CLS245(this, activity0, 11));
            יᐧ10.MTH7296(ـˏ14);
        }
        if(CLS27.MTH890("chatroomRenameMethod1")) {
            CLS1625 ـˏ15 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ15.MTH800(CLS27.MTH889("rename_chatrooms"));
            ـˏ15.MTH7320(new CLS245(this, activity0, 12));
            יᐧ10.MTH7296(ـˏ15);
        }
        CLS1635 ﾞᵎ21 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ21.MTH800(CLS27.MTH889("mass_announce_shortcut"));
        ﾞᵎ21.MTH7437(ˎᵢ0.MTH938("mass_announce_shortcut", true));
        ﾞᵎ21.MTH7438(new CLS177(this, 15));
        יᐧ10.MTH7296(ﾞᵎ21);
        CLS1625 ـˏ16 = ((CLS219)this).MTH3877(z1, z2);
        ـˏ16.MTH800(CLS27.MTH889("mass_announce"));
        ـˏ16.MTH7320(new CLS245(this, activity0, 13));
        יᐧ10.MTH7296(ـˏ16);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ10), v);
    }

    // 此方法包含解密的字符串
    public final void MTH3824(CLS78 ˊﾞ0) {
        Activity activity0 = ((CLS219)this).MTH3883();
        CLS380[] arr_ʼˎ = {null};
        arr_ʼˎ[0] = CLS523.MTH7133(activity0, "", ((CLS379)new CLS1156(this, ˊﾞ0, 5)), ((CLS378)new CLS612(this, activity0, ˊﾞ0, arr_ʼˎ, 10)), null);
    }

    // 此方法包含解密的字符串
    public final void MTH3825(CLS78 ˊﾞ0, int v) {
        public final class CLS1009 implements CLS2 {
            public final String FLD2059;
            public final ArrayList FLD2060;
            public final ArrayList FLD2061;
            public final int FLD2062;
            public final ArrayList FLD2063;
            public final CLS1019 FLD2064;
            public final CLS350 FLD2065;

            public CLS1009(String s, int v, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, CLS350 ᐧⁱ0) {
                this.FLD2059 = s;
                this.FLD2062 = v;
                this.FLD2061 = arrayList0;
                this.FLD2063 = arrayList1;
                this.FLD2060 = arrayList2;
                this.FLD2065 = ᐧⁱ0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                for(Object object0: arrayList0) {
                    CLS93 ⁱʾ0 = new CLS93(this.FLD2062, this.FLD2059, "");
                    this.FLD2061.add(ⁱʾ0);
                    this.FLD2063.add(ⁱʾ0);
                    this.FLD2060.add(((CLS78)object0));
                    CLS1019.this.FLD2088.MTH1326(ⁱʾ0);
                }
                this.FLD2065.notifyDataSetChanged();
            }
        }


        public final class CLS1011 implements CLS11 {
            public final CLS350 FLD2067;
            public final HashSet FLD2068;
            public final ArrayList FLD2069;
            public final int FLD2070;
            public final ArrayList FLD2071;
            public final CLS1019 FLD2072;

            public CLS1011(CLS350 ᐧⁱ0, int v, ArrayList arrayList0, ArrayList arrayList1, HashSet hashSet0) {
                this.FLD2067 = ᐧⁱ0;
                this.FLD2070 = v;
                this.FLD2069 = arrayList0;
                this.FLD2071 = arrayList1;
                this.FLD2068 = hashSet0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS350 ᐧⁱ0 = this.FLD2067;
                CLS78 ˊﾞ0 = (CLS78)ᐧⁱ0.getItem(this.FLD2070);
                this.FLD2069.remove(ˊﾞ0);
                Iterator iterator0 = this.FLD2071.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    CLS93 ⁱʾ0 = (CLS93)object0;
                    if(ⁱʾ0.FLD396.equals("")) {
                        this.FLD2068.remove(ⁱʾ0.FLD396);
                        iterator0.remove();
                        CLS1019.this.FLD2088.getClass();
                        CLS1019.this.FLD2088.MTH1318(ⁱʾ0.FLD395, ⁱʾ0.FLD393, ⁱʾ0.FLD396);
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
                ᐧⁱ0.notifyDataSetChanged();
            }
        }


        public final class CLS1016 implements CLS11 {
            public final HashSet FLD2077;
            public final CLS350 FLD2078;
            public final ArrayList FLD2079;
            public final ArrayList FLD2080;
            public final ArrayList FLD2081;
            public final CLS1019 FLD2082;

            public CLS1016(HashSet hashSet0, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, CLS350 ᐧⁱ0) {
                this.FLD2077 = hashSet0;
                this.FLD2080 = arrayList0;
                this.FLD2079 = arrayList1;
                this.FLD2081 = arrayList2;
                this.FLD2078 = ᐧⁱ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                this.FLD2077.clear();
                this.FLD2080.clear();
                ArrayList arrayList0 = this.FLD2079;
                for(Object object0: arrayList0) {
                    CLS1019.this.FLD2088.getClass();
                    CLS1019.this.FLD2088.MTH1318(((CLS93)object0).FLD395, ((CLS93)object0).FLD393, ((CLS93)object0).FLD396);
                }
                arrayList0.clear();
                this.FLD2081.clear();
                this.FLD2078.notifyDataSetChanged();
            }
        }

        Activity activity0 = ((CLS219)this).MTH3883();
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat(CLS27.MTH889("date_format"));
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        CLS1233 ˊˏ0 = new CLS1233(this, arrayList1, arrayList0, arrayList2, ˊﾞ0, v, "", simpleDateFormat0, hashSet0);
        ˊˏ0.MTH774();
        CLS350 ᐧⁱ0 = new CLS350(activity0, arrayList0);
        CLS523.MTH7143(activity0, "", ((CLS379)new CLS1248(this, activity0, ᐧⁱ0, v, arrayList0, arrayList2, hashSet0)), ((CLS378)new CLS1263(this, activity0, hashSet0, arrayList1, arrayList2, arrayList0, ᐧⁱ0, "", v, ˊˏ0)));
    }
}

