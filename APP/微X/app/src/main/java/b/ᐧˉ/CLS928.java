// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS70;
import b.ˈˈ.CLS79;
import b.ᵔʾ.CLS1259;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public final class CLS928 extends CLS219 {
    public final ArrayList FLD1725;
    public CLS210 FLD1726;

    public CLS928(String s, String s1) {
        super(s, s1);
        this.FLD1725 = new ArrayList();
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3874(boolean z, boolean z1, String s) {
        this.FLD1725.clear();
        CLS1067 יᵔ0 = new CLS1067(this, 9);
        CLS40.FLD157.MTH1124(((CLS39)יᵔ0));
        if(z1) {
            ((CLS219)this).MTH3875();
        }
        CLS380 ʼˎ0 = new CLS380(((CLS219)this).MTH3883(), this.FLD2156);
        ʼˎ0.FLD3527 = new CLS1067(this, 8);
        ʼˎ0.FLD3518 = new CLS1069(((CLS219)this), z, z1, 2);
        ʼˎ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS219)this).MTH3882(s);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ᐧˉ.CLS219
    public final void MTH3878(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        public final class CLS916 implements CLS2 {
            public final CLS928 FLD1714;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS928.this.FLD2151.MTH922(s, "auto_download_chat_img_excl2");
            }
        }


        public final class CLS917 implements CLS2 {
            public final CLS928 FLD1715;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS928.this.FLD2151.MTH922(s, "auto_download_chat_vid_excl");
            }
        }


        public final class CLS918 implements CLS2 {
            public final CLS928 FLD1716;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS928.this.FLD2151.MTH922(s, "auto_download_chat_img_incl2");
            }
        }


        public final class CLS919 implements CLS2 {
            public final CLS928 FLD1717;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS928.this.FLD2151.MTH922(s, "bomb_prevention_list");
            }
        }


        public final class CLS920 implements CLS2 {
            public final CLS928 FLD1718;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS928.this.FLD2151.MTH922(s, "auto_download_chat_file_incl");
            }
        }


        public final class CLS921 implements CLS2 {
            public final JSONObject FLD1719;
            public final CLS928 FLD1720;

            public CLS921(JSONObject jSONObject0) {
                this.FLD1719 = jSONObject0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                try {
                    this.FLD1719.put("tail", s);
                    CLS928.this.FLD2151.MTH922(this.FLD1719, "persistent_special_mode");
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS922 implements CLS2 {
            public CLS922() {
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
                    CLS404.MTH5903("");
                }
                CLS79.FLD292.MTH1633();
            }
        }


        public final class CLS923 implements CLS2 {
            public final CLS928 FLD1721;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS928.this.FLD2151.MTH922(s, "auto_download_chat_file_excl");
            }
        }


        public final class CLS924 implements CLS2 {
            public CLS924() {
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
                    CLS404.MTH5888("");
                }
                CLS79.FLD292.MTH1633();
            }
        }


        public final class CLS925 implements CLS2 {
            public final CLS928 FLD1722;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS928 ʼᴵ0 = CLS928.this;
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    ʼᴵ0.FLD2151.MTH922(s, "chat_filter_exclude");
                    return;
                }
                ʼᴵ0.FLD2151.MTH922("", "chat_filter_exclude");
            }
        }


        public final class CLS926 implements CLS2 {
            public final CLS928 FLD1723;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS928.this.FLD2151.MTH922(s, "auto_download_chat_vid_incl");
            }
        }


        public final class CLS927 implements CLS2 {
            public final CLS928 FLD1724;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                Activity activity0 = ((CLS219)CLS928.this).MTH3883();
                CLS523.MTH7133(activity0, s1, ((CLS379)new CLS1259(CLS928.this, activity0, s, 22)), null, null);
            }
        }

        CLS267 ﹶʾ1;
        CLS267 ﹶʾ0;
        CLS500 ᵢﹶ1;
        int v = CLS523.MTH7137(10);
        Activity activity0 = ((CLS219)this).MTH3883();
        CLS1617 ʻᵎ0 = new CLS1617(activity0);
        ʻᵎ0.MTH7200(z);
        ʻᵎ0.MTH800(CLS27.MTH889("enable_chat_filter"));
        ʻᵎ0.MTH7194(new CLS1037(this, z1, z2, activity0, v));
        CLS523.MTH7147(linearLayout0, ((CLS18)ʻᵎ0), true);
        CLS1625 ـˏ0 = new CLS1625(activity0);
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH800(CLS27.MTH889("specialModes"));
        CLS29 ˎᵢ0 = this.FLD2151;
        if(ˎᵢ0.MTH938("plusShowChatOptions", true)) {
            יᐧ0.MTH798(CLS27.MTH889("plusShowChatOptions"));
        }
        CLS1635 ﾞᵎ0 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ0.MTH800(CLS27.MTH889("persistent_special_mode_enable"));
        ﾞᵎ0.MTH7437(ˎᵢ0.MTH938("persistent_special_mode_enable", false));
        ﾞᵎ0.MTH7438(new CLS276(this, ـˏ0, 5));
        יᐧ0.MTH7296(ﾞᵎ0);
        CLS1635 ﾞᵎ1 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ1.MTH798(CLS27.MTH889("encrypted_desc"));
        ﾞᵎ1.MTH800(CLS27.MTH889("encrypted_mode_enable"));
        ﾞᵎ1.MTH7437(ˎᵢ0.MTH938("encrypted_mode_enable", false));
        ﾞᵎ1.MTH7438(new CLS189(this, 10));
        CLS1622 ˑٴ0 = CLS182.MTH3486(יᐧ0, ﾞᵎ1, activity0);
        ˑٴ0.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(4100980382927475509L, ˑٴ0, 4100979910481072949L), CLS27.MTH889("encrypted")));
        ˑٴ0.MTH7276(((CLS539)new CLS1067(this, 0)));
        יᐧ0.MTH7296(ˑٴ0);
        CLS1635 ﾞᵎ2 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ2.MTH800(CLS27.MTH889("autoTranslateMode"));
        ﾞᵎ2.MTH7437(ˎᵢ0.MTH938("auto_translate_mode_enable", false));
        ﾞᵎ2.MTH7438(new CLS189(this, 24));
        יᐧ0.MTH7296(ﾞᵎ2);
        if(!TextUtils.isEmpty(CLS27.MTH889("auto_transcribe_mode_enable"))) {
            CLS1635 ﾞᵎ3 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ3.MTH800(CLS27.MTH889("auto_transcribe_mode_enable"));
            ﾞᵎ3.MTH7437(ˎᵢ0.MTH938("auto_transcribe_mode_enable", false));
            ﾞᵎ3.MTH7438(new CLS201(this, 1));
            יᐧ0.MTH7296(ﾞᵎ3);
        }
        CLS500 ᵢﹶ0 = this.FLD2153;
        if(ᵢﹶ0.MTH6895("tail_mode") && !CLS182.MTH3470(4100976212514231093L)) {
            this.FLD1726 = new CLS210(activity0, this.FLD2157);
            CLS1635 ﾞᵎ4 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ4.MTH800(CLS27.MTH889("tailmode"));
            ﾞᵎ4.MTH7437(ˎᵢ0.MTH938("tail_mode_enable", false));
            ﾞᵎ4.MTH7438(new CLS201(this, 11));
            יᐧ0.MTH7296(ﾞᵎ4);
            JSONObject jSONObject0 = ˎᵢ0.MTH924("persistent_special_mode", new JSONObject());
            String s = jSONObject0.optString("tail");
            ـˏ0.MTH800(CLS27.MTH889("config_include"));
            ـˏ0.MTH7320(new CLS258(this, activity0, jSONObject0, s, 0));
            יᐧ0.MTH7296(ـˏ0);
            CLS523.MTH7157(!ˎᵢ0.MTH938("persistent_special_mode_enable", false), new CLS18[]{ـˏ0});
            CLS1635 ﾞᵎ5 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ5.MTH800(CLS27.MTH889("tailmode_random_show"));
            ﾞᵎ5.MTH7437(ˎᵢ0.MTH938("tailmode_random_show", false));
            ﾞᵎ5.MTH7438(new CLS201(this, 23));
            יᐧ0.MTH7296(ﾞᵎ5);
            CLS1622 ˑٴ1 = ((CLS219)this).MTH3880(z1, z2);
            ˑٴ1.MTH800(CLS27.MTH889("tailmode_random_value"));
            ˑٴ1.MTH7277(String.valueOf(ˎᵢ0.MTH920("tailmode_random_value")));
            ˑٴ1.MTH7278(0x2000);
            ˑٴ1.MTH7276(((CLS539)new CLS1067(this, 7)));
            יᐧ0.MTH7296(ˑٴ1);
            CLS1625 ـˏ1 = new CLS1625(activity0);
            ـˏ1.MTH800(CLS27.MTH889("tailmode_general"));
            ـˏ1.MTH7320(new CLS70(2, this));
            יᐧ0.MTH7296(ـˏ1);
            CLS1625 ـˏ2 = new CLS1625(activity0);
            ـˏ2.MTH800(CLS27.MTH889("tailmode_custom"));
            ـˏ2.MTH7320(new CLS193(this, activity0, 0));
            יᐧ0.MTH7296(ـˏ2);
        }
        CLS1623 יᐧ1 = CLS34.MTH1087(linearLayout0, יᐧ0, v, activity0);
        if(ˎᵢ0.MTH938("plusShowChatOptions", true)) {
            יᐧ1.MTH798(CLS27.MTH889("plusShowChatOptions"));
        }
        if(TextUtils.isEmpty(CLS27.MTH889("send_search_image"))) {
            ᵢﹶ1 = ᵢﹶ0;
        }
        else {
            CLS1635 ﾞᵎ6 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ6.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100978089414939445L, ﾞᵎ6, 4100978166724350773L), CLS412.MTH6002()));
            ﾞᵎ6.MTH7438(new CLS189(this, 0));
            CLS1635 ﾞᵎ7 = ((CLS219)this).MTH3879(z1, z2);
            ᵢﹶ1 = ᵢﹶ0;
            ﾞᵎ7.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100978244033762101L, ﾞᵎ7, 4100977814537032501L), CLS412.MTH6002()));
            ﾞᵎ7.MTH7438(new CLS189(this, 1));
            יᐧ1.MTH7289(new Object[]{ﾞᵎ6, ﾞᵎ7});
        }
        if(CLS500.MTH6892().MTH6895("send_as_gif") && !CLS182.MTH3470(4100956545858982709L)) {
            CLS1635 ﾞᵎ8 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ8.MTH800(CLS27.MTH889("send_img_as_gif"));
            ﾞᵎ8.MTH798(CLS27.MTH889("send_img_as_gif_desc"));
            ﾞᵎ8.MTH7437(ˎᵢ0.MTH938("send_as_gif_enable", false));
            ﾞᵎ8.MTH7438(new CLS189(this, 2));
            יᐧ1.MTH7296(ﾞᵎ8);
            CLS1626 ـﹳ0 = new CLS1626(activity0);
            ـﹳ0.MTH800(CLS27.MTH889("path"));
            ـﹳ0.MTH7325(CLS27.MTH889("set_path"));
            String s1 = ˎᵢ0.MTH925("local_emoji_dir", "");
            if(!TextUtils.isEmpty(s1)) {
                ـﹳ0.MTH798(s1);
            }
            ـﹳ0.MTH7324(new CLS188(this, activity0, ـﹳ0, 0));
            יᐧ1.MTH7296(ـﹳ0);
        }
        if(CLS500.MTH6892().MTH6895("export_emoji_gif") && !CLS182.MTH3470(4100956520089178933L)) {
            CLS1635 ﾞᵎ9 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ9.MTH800(CLS27.MTH889("export_emoji_as_gif"));
            ﾞᵎ9.MTH7437(ˎᵢ0.MTH938("export_emoji_as_gif", false));
            ﾞᵎ9.MTH7438(new CLS189(this, 3));
            יᐧ1.MTH7296(ﾞᵎ9);
            if(CLS21.MTH821().MTH830("hasWriteStoragePermission", new Object[0])) {
                CLS1626 ـﹳ1 = new CLS1626(activity0);
                ـﹳ1.MTH800(CLS27.MTH889("path"));
                ـﹳ1.MTH7325(CLS27.MTH889("set_path"));
                String s2 = ˎᵢ0.MTH925("export_emoji_gif_path", "");
                if(!TextUtils.isEmpty(s2)) {
                    ـﹳ1.MTH798(s2);
                }
                ـﹳ1.MTH7324(new CLS188(this, activity0, ـﹳ1, 1));
                יᐧ1.MTH7296(ـﹳ1);
            }
        }
        if(!יᐧ1.FLD5262.isEmpty()) {
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        }
        if(CLS27.MTH902("search_chat_history_shortcut") && !CLS182.MTH3470(4100957714090087221L)) {
            CLS1635 ﾞᵎ10 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ10.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100957791399498549L, ﾞᵎ10, 4100957915953550133L), CLS412.MTH6002()));
            ﾞᵎ10.MTH7438(new CLS189(this, 4));
            CLS1623 יᐧ2 = new CLS1623(activity0);
            יᐧ2.MTH7296(ﾞᵎ10);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
        }
        if(ᵢﹶ1.MTH6895("auto_download_chat_media")) {
            CLS1623 יᐧ3 = new CLS1623(activity0);
            יᐧ3.MTH798(CLS27.MTH889("auto_download_chat_media"));
            CLS1635 ﾞᵎ11 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ11.MTH800(CLS27.MTH889("save_external"));
            ﾞᵎ11.MTH7437(ˎᵢ0.MTH938("auto_download_chat_media_save_external", false));
            ﾞᵎ11.MTH7438(new CLS189(this, 5));
            CLS1626 ـﹳ2 = new CLS1626(activity0);
            ـﹳ2.MTH800(CLS27.MTH889("path"));
            if(CLS21.MTH821().MTH830("hasWriteStoragePermission", new Object[0])) {
                ـﹳ2.MTH7325(CLS27.MTH889("set_path"));
                String s3 = ˎᵢ0.MTH925("auto_download_chat_media_save_path", "");
                if(!TextUtils.isEmpty(s3)) {
                    ـﹳ2.MTH798(s3);
                }
                ﹶʾ0 = new CLS188(this, activity0, ـﹳ2, 2);
            }
            else {
                ـﹳ2.MTH7325(CLS27.MTH889("preview"));
                ﹶʾ0 = new CLS267(0);
            }
            ـﹳ2.MTH7324(ﹶʾ0);
            יᐧ3.MTH7289(new Object[]{ﾞᵎ11, ـﹳ2});
            CLS1635 ﾞᵎ12 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ12.MTH800(CLS27.MTH889("auto_download_media_wifi_only"));
            ﾞᵎ12.MTH7437(ˎᵢ0.MTH938("auto_download_media_wifi_only", false));
            ﾞᵎ12.MTH7438(new CLS189(this, 6));
            יᐧ3.MTH7296(ﾞᵎ12);
            CLS1635 ﾞᵎ13 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ13.MTH800(CLS27.MTH889("auto_download_chat_vid"));
            ﾞᵎ13.MTH7437(ˎᵢ0.MTH938("auto_download_chat_vid", false));
            ﾞᵎ13.MTH7438(new CLS189(this, 7));
            CLS1625 ـˏ3 = new CLS1625(activity0);
            ـˏ3.MTH800(CLS27.MTH889("config_include"));
            ـˏ3.MTH7320(new CLS193(this, activity0, 1));
            CLS1625 ـˏ4 = new CLS1625(activity0);
            ـˏ4.MTH800(CLS27.MTH889("config_exclude"));
            ـˏ4.MTH7320(new CLS193(this, activity0, 2));
            יᐧ3.MTH7289(new Object[]{ﾞᵎ13, ـˏ3, ـˏ4});
            CLS1635 ﾞᵎ14 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ14.MTH800(CLS27.MTH889("auto_download_chat_img"));
            ﾞᵎ14.MTH7437(ˎᵢ0.MTH938("auto_download_chat_img", false));
            ﾞᵎ14.MTH7438(new CLS189(this, 8));
            CLS1625 ـˏ5 = new CLS1625(activity0);
            ـˏ5.MTH800(CLS27.MTH889("config_include"));
            ـˏ5.MTH7320(new CLS193(this, activity0, 3));
            CLS1625 ـˏ6 = new CLS1625(activity0);
            ـˏ6.MTH800(CLS27.MTH889("config_exclude"));
            ـˏ6.MTH7320(new CLS193(this, activity0, 4));
            יᐧ3.MTH7289(new Object[]{ﾞᵎ14, ـˏ5, ـˏ6});
            if(!TextUtils.isEmpty(CLS27.MTH897("DownloadAppAttachClass"))) {
                CLS1635 ﾞᵎ15 = ((CLS219)this).MTH3879(z1, z2);
                ﾞᵎ15.MTH800(CLS27.MTH889("auto_download_chat_file"));
                ﾞᵎ15.MTH7437(ˎᵢ0.MTH938("auto_download_chat_file", false));
                ﾞᵎ15.MTH7438(new CLS189(this, 9));
                CLS1625 ـˏ7 = new CLS1625(activity0);
                ـˏ7.MTH800(CLS27.MTH889("config_include"));
                ـˏ7.MTH7320(new CLS193(this, activity0, 5));
                CLS1625 ـˏ8 = new CLS1625(activity0);
                ـˏ8.MTH800(CLS27.MTH889("config_exclude"));
                ـˏ8.MTH7320(new CLS193(this, activity0, 6));
                יᐧ3.MTH7289(new Object[]{ﾞᵎ15, ـˏ7, ـˏ8});
            }
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ3), v);
        }
        if(ᵢﹶ1.MTH6895("export_chat")) {
            CLS1623 יᐧ4 = new CLS1623(activity0);
            יᐧ4.MTH798(CLS27.MTH889("export_chat_msg"));
            CLS1635 ﾞᵎ16 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ16.MTH800(CLS27.MTH889("export_chat_msg"));
            ﾞᵎ16.MTH7437(ˎᵢ0.MTH938("export_chat_msg", false));
            ﾞᵎ16.MTH7438(new CLS189(this, 11));
            CLS1635 ﾞᵎ17 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ17.MTH800(CLS27.MTH889("export_chat_transcodevoice"));
            ﾞᵎ17.MTH7437(ˎᵢ0.MTH938("export_chat_transcodevoice", false));
            ﾞᵎ17.MTH7438(new CLS189(this, 12));
            CLS1626 ـﹳ3 = new CLS1626(activity0);
            ـﹳ3.MTH800(CLS27.MTH889("path"));
            if(CLS21.MTH821().MTH830("hasWriteStoragePermission", new Object[0])) {
                ـﹳ3.MTH7325(CLS27.MTH889("set_path"));
                String s4 = ˎᵢ0.MTH925("export_chat_path", "");
                if(!TextUtils.isEmpty(s4)) {
                    ـﹳ3.MTH798(s4);
                }
                ﹶʾ1 = new CLS188(this, activity0, ـﹳ3, 3);
            }
            else {
                ـﹳ3.MTH7325(CLS27.MTH889("preview"));
                ﹶʾ1 = new CLS267(1);
            }
            ـﹳ3.MTH7324(ﹶʾ1);
            CLS1635 ﾞᵎ18 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ18.MTH800(CLS27.MTH889("copy_text"));
            ﾞᵎ18.MTH7437(ˎᵢ0.MTH938("copy_text", false));
            ﾞᵎ18.MTH7438(new CLS189(this, 13));
            יᐧ4.MTH7289(new Object[]{ﾞᵎ16, ﾞᵎ17, ـﹳ3, ﾞᵎ18});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ4), v);
        }
        CLS1623 יᐧ5 = new CLS1623(activity0);
        CLS1635 ﾞᵎ19 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ19.MTH800(CLS27.MTH889("chatcontainer"));
        ﾞᵎ19.MTH7437(ˎᵢ0.MTH938("chatcontainer_enable", false));
        ﾞᵎ19.MTH7438(new CLS189(this, 14));
        CLS1625 ـˏ9 = CLS34.MTH1082(יᐧ5, ﾞᵎ19, activity0);
        ـˏ9.MTH800(CLS27.MTH889("chatcontainer"));
        ـˏ9.MTH7320(new CLS173(activity0, 0));
        יᐧ5.MTH7296(ـˏ9);
        CLS1635 ﾞᵎ20 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ20.MTH800(CLS27.MTH889("chatcontainer_dialog_mode"));
        ﾞᵎ20.MTH7437(ˎᵢ0.MTH938("chatcontainer_dialog_mode", false));
        ﾞᵎ20.MTH7438(new CLS189(this, 15));
        יᐧ5.MTH7296(ﾞᵎ20);
        if(CLS27.MTH890("ConversationWithCacheAdapter_getData")) {
            CLS1635 ﾞᵎ21 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ21.MTH800(CLS27.MTH889("filter_conv"));
            ﾞᵎ21.MTH7437(ˎᵢ0.MTH938("filter_conv", false));
            ﾞᵎ21.MTH7438(new CLS189(this, 16));
            יᐧ5.MTH7296(ﾞᵎ21);
        }
        CLS1635 ﾞᵎ22 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ22.MTH800(CLS27.MTH889("stickytop_lower_native"));
        ﾞᵎ22.MTH7437(ˎᵢ0.MTH938("stickytop_lower_native", false));
        ﾞᵎ22.MTH7438(new CLS189(this, 17));
        יᐧ5.MTH7296(ﾞᵎ22);
        CLS1635 ﾞᵎ23 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ23.MTH800(CLS27.MTH889("chatcontainer_unread_disable"));
        ﾞᵎ23.MTH7437(ˎᵢ0.MTH938("chatcontainer_unread_disable", false));
        ﾞᵎ23.MTH7438(new CLS189(this, 18));
        יᐧ5.MTH7296(ﾞᵎ23);
        if(ᵢﹶ1.MTH6895("auto_contain_new_contact")) {
            CLS1635 ﾞᵎ24 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ24.MTH800(CLS27.MTH889("auto_contain_new_contact"));
            ﾞᵎ24.MTH7437(ˎᵢ0.MTH938("auto_contain_new_contact", false));
            ﾞᵎ24.MTH7438(new CLS189(this, 19));
            CLS1622 ˑٴ2 = CLS182.MTH3486(יᐧ5, ﾞᵎ24, activity0);
            ˑٴ2.MTH7277(ˎᵢ0.MTH925("auto_container_pattern", "yyyy-MM-dd"));
            ˑٴ2.MTH7276(((CLS539)new CLS1067(this, 1)));
            יᐧ5.MTH7296(ˑٴ2);
        }
        CLS1623 יᐧ6 = CLS34.MTH1087(linearLayout0, יᐧ5, v, activity0);
        CLS1635 ﾞᵎ25 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ25.MTH800(CLS27.MTH889("voice_wrong_length_enable"));
        ﾞᵎ25.MTH7437(ˎᵢ0.MTH938("voice_wrong_length_enable", false));
        ﾞᵎ25.MTH7438(new CLS189(this, 20));
        CLS1621 ˎᵢ1 = new CLS1621(activity0);
        ˎᵢ1.MTH800(CLS27.MTH889("voice_duration"));
        ˎᵢ1.MTH7268(((long)CLS412.MTH6007(1000, 60000, ˎᵢ0.MTH927(1000, "voice_length"))));
        ˎᵢ1.MTH7265(((CLS538)new CLS1067(this, 2)));
        ˎᵢ1.MTH7271();
        ˎᵢ1.MTH7263();
        ˎᵢ1.MTH7262();
        יᐧ6.MTH7289(new Object[]{ﾞᵎ25, ˎᵢ1});
        if(ᵢﹶ1.MTH6895("merge_voice")) {
            CLS1635 ﾞᵎ26 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ26.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100953698295665461L, ﾞᵎ26, 4100953754130240309L), CLS412.MTH6002()));
            ﾞᵎ26.MTH7438(new CLS189(this, 21));
            יᐧ6.MTH7296(ﾞᵎ26);
        }
        CLS1635 ﾞᵎ27 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ27.MTH800(CLS27.MTH889("play_voice_enable"));
        ﾞᵎ27.MTH7437(ˎᵢ0.MTH938("play_voice_enable", false));
        ﾞᵎ27.MTH7438(new CLS189(this, 22));
        יᐧ6.MTH7296(ﾞᵎ27);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ6), v);
        CLS1623 יᐧ7 = new CLS1623(activity0);
        CLS1635 ﾞᵎ28 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ28.MTH800(CLS27.MTH889("disableNudging"));
        ﾞᵎ28.MTH7437(ˎᵢ0.MTH938("disable_nudging", false));
        ﾞᵎ28.MTH7438(new CLS189(this, 23));
        יᐧ7.MTH7296(ﾞᵎ28);
        CLS1635 ﾞᵎ29 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ29.MTH800(CLS27.MTH889("blockAllNudgingEnable"));
        ﾞᵎ29.MTH7437(ˎᵢ0.MTH938("block_nudging_enable", false));
        ﾞᵎ29.MTH7438(new CLS189(this, 25));
        יᐧ7.MTH7296(ﾞᵎ29);
        CLS1635 ﾞᵎ30 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ30.MTH800(CLS27.MTH889("customNudgingMsg"));
        ﾞᵎ30.MTH7437(ˎᵢ0.MTH938("custom_nudging_msg_enable", false));
        ﾞᵎ30.MTH7438(new CLS189(this, 26));
        CLS1622 ˑٴ3 = CLS182.MTH3486(יᐧ7, ﾞᵎ30, activity0);
        ˑٴ3.MTH798(CLS27.MTH889("original_text"));
        ˑٴ3.MTH7277(ˎᵢ0.MTH925("custom_nudging_original", CLS27.MTH889("patmsg_original")));
        ˑٴ3.MTH7276(((CLS539)new CLS1067(this, 3)));
        CLS1622 ˑٴ4 = CLS34.MTH1069(יᐧ7, ˑٴ3, activity0);
        ˑٴ4.MTH798(CLS27.MTH889("change_to"));
        ˑٴ4.MTH7277(ˎᵢ0.MTH925("custom_nudging_modified", CLS27.MTH889("patmsg_original")));
        ˑٴ4.MTH7276(((CLS539)new CLS1067(this, 4)));
        יᐧ7.MTH7296(ˑٴ4);
        CLS1635 ﾞᵎ31 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ31.MTH800(CLS27.MTH889("pat_all"));
        ﾞᵎ31.MTH7437(ˎᵢ0.MTH938("pat_all_enable", false));
        ﾞᵎ31.MTH7438(new CLS189(this, 27));
        יᐧ7.MTH7296(ﾞᵎ31);
        CLS1621 ˎᵢ2 = new CLS1621(activity0);
        ˎᵢ2.MTH800(CLS27.MTH889("pat_all_delay"));
        ˎᵢ2.MTH7268(((long)CLS412.MTH6005(5000, "pat_all_delay")));
        ˎᵢ2.MTH7265(((CLS538)new CLS1067(this, 5)));
        יᐧ7.MTH7296(ˎᵢ2);
        CLS1635 ﾞᵎ32 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ32.MTH800(CLS27.MTH889("auto_respond_nudging"));
        ﾞᵎ32.MTH7437(ˎᵢ0.MTH938("auto_respond_nudging", false));
        ﾞᵎ32.MTH7438(new CLS189(this, 28));
        יᐧ7.MTH7296(ﾞᵎ32);
        if(!TextUtils.isEmpty(CLS27.MTH897("sendPatClass1"))) {
            יᐧ7.MTH7290(linearLayout0, v);
        }
        CLS1623 יᐧ8 = new CLS1623(activity0);
        CLS1635 ﾞᵎ33 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ33.MTH800(CLS27.MTH889("enable_bombprevention"));
        ﾞᵎ33.MTH7437(ˎᵢ0.MTH938("enable_bombprevention", false));
        ﾞᵎ33.MTH7438(new CLS189(this, 29));
        CLS1625 ـˏ10 = CLS34.MTH1082(יᐧ8, ﾞᵎ33, activity0);
        ـˏ10.MTH800(CLS27.MTH889("bomb_prevention_list"));
        ـˏ10.MTH7320(new CLS193(this, activity0, 7));
        יᐧ8.MTH7296(ـˏ10);
        יᐧ8.MTH7290(linearLayout0, v);
        CLS1623 יᐧ9 = new CLS1623(activity0);
        if(ᵢﹶ1.MTH6895("send_multple_friendcard")) {
            CLS1635 ﾞᵎ34 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ34.MTH800(CLS27.MTH889("send_multple_friendcard"));
            ﾞᵎ34.MTH7437(ˎᵢ0.MTH938("send_multple_friendcard", true));
            ﾞᵎ34.MTH7438(new CLS201(this, 0));
            יᐧ9.MTH7296(ﾞᵎ34);
        }
        if(ᵢﹶ1.MTH6895("modifyMessage")) {
            CLS1635 ﾞᵎ35 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ35.MTH800(CLS27.MTH889("modify_message"));
            ﾞᵎ35.MTH7437(ˎᵢ0.MTH938("modify_message", true));
            ﾞᵎ35.MTH7438(new CLS201(this, 2));
            יᐧ9.MTH7296(ﾞᵎ35);
        }
        if(CLS27.MTH890("ChattingDataAdapterV2") || CLS27.MTH890("ChattingDataAdapterV2_b") || CLS27.MTH890("ChattingDataAdapterField1")) {
            CLS1635 ﾞᵎ36 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ36.MTH800(CLS27.MTH889("chat_always_show_time"));
            ﾞᵎ36.MTH7437(ˎᵢ0.MTH938("chat_always_show_time", false));
            ﾞᵎ36.MTH7438(new CLS201(this, 3));
            יᐧ9.MTH7296(ﾞᵎ36);
            if(CLS27.MTH890("ChattingDataAdapterV2_timeTV") || CLS27.MTH890("ChattingDataAdapter_timeTV")) {
                CLS1635 ﾞᵎ37 = ((CLS219)this).MTH3879(z1, z2);
                ﾞᵎ37.MTH800(CLS27.MTH889("show_time_centered"));
                ﾞᵎ37.MTH7437(ˎᵢ0.MTH938("show_time_centered", false));
                ﾞᵎ37.MTH7438(new CLS201(this, 4));
                יᐧ9.MTH7296(ﾞᵎ37);
                CLS1635 ﾞᵎ38 = ((CLS219)this).MTH3879(z1, z2);
                ﾞᵎ38.MTH800(CLS27.MTH889("show_time_detailed"));
                ﾞᵎ38.MTH7437(ˎᵢ0.MTH938("show_time_detailed", false));
                ﾞᵎ38.MTH7438(new CLS201(this, 5));
                יᐧ9.MTH7296(ﾞᵎ38);
                CLS1622 ˑٴ5 = ((CLS219)this).MTH3880(z1, z2);
                ˑٴ5.MTH7280();
                ˑٴ5.MTH7277(ˎᵢ0.MTH925("show_time_detailed_pattern", "yyyy-MM-dd HH:mm:ss"));
                ˑٴ5.MTH7276(((CLS539)new CLS1067(this, 6)));
                יᐧ9.MTH7296(ˑٴ5);
            }
        }
        if(CLS27.MTH890("PluginGroupSolitaireClass")) {
            CLS1635 ﾞᵎ39 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ39.MTH800(CLS27.MTH889("show_groupnote_members"));
            ﾞᵎ39.MTH7437(ˎᵢ0.MTH938("show_groupnote_members", false));
            ﾞᵎ39.MTH7438(new CLS201(this, 6));
            יᐧ9.MTH7296(ﾞᵎ39);
        }
        if(CLS27.MTH890("NewVoipMgrCls2")) {
            CLS1635 ﾞᵎ40 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ40.MTH800(CLS27.MTH889("remove_voip_videoplayback_limitation"));
            ﾞᵎ40.MTH7437(ˎᵢ0.MTH938("remove_voip_videoplayback_limitation", false));
            ﾞᵎ40.MTH7438(new CLS201(this, 7));
            יᐧ9.MTH7296(ﾞᵎ40);
        }
        CLS1635 ﾞᵎ41 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ41.MTH800(CLS27.MTH889("url_open_browser_enable"));
        ﾞᵎ41.MTH7437(ˎᵢ0.MTH938("url_open_browser_enable", false));
        ﾞᵎ41.MTH7438(new CLS201(this, 8));
        יᐧ9.MTH7296(ﾞᵎ41);
        CLS1635 ﾞᵎ42 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ42.MTH800(CLS27.MTH889("article_open_browser_enable"));
        ﾞᵎ42.MTH7437(ˎᵢ0.MTH938("article_open_browser_enable", false));
        ﾞᵎ42.MTH7438(new CLS201(this, 9));
        יᐧ9.MTH7296(ﾞᵎ42);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ9), v);
        CLS1623 יᐧ10 = new CLS1623(activity0);
        יᐧ10.MTH800(CLS27.MTH889("main_item_shortcut"));
        יᐧ10.MTH800(CLS27.MTH889("main_item_shortcut_desc"));
        CLS1635 ﾞᵎ43 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ43.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100963134338814773L, ﾞᵎ43, 4100963757109072693L), CLS412.MTH6002()));
        ﾞᵎ43.MTH7438(new CLS201(this, 10));
        יᐧ10.MTH7296(ﾞᵎ43);
        CLS1635 ﾞᵎ44 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ44.MTH800(CLS27.MTH889("delete_contact_shortcut"));
        ﾞᵎ44.MTH7437(ˎᵢ0.MTH938("delete_contact_shortcut", false));
        ﾞᵎ44.MTH7438(new CLS201(this, 12));
        יᐧ10.MTH7296(ﾞᵎ44);
        CLS1635 ﾞᵎ45 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ45.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100963486526133045L, ﾞᵎ45, 4100963589605348149L), CLS412.MTH6002()));
        ﾞᵎ45.MTH7438(new CLS201(this, 13));
        יᐧ10.MTH7296(ﾞᵎ45);
        if(!CLS412.MTH6002()) {
            CLS1635 ﾞᵎ46 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ46.MTH800(CLS27.MTH889("mute_shortcut"));
            ﾞᵎ46.MTH7437(ˎᵢ0.MTH938("mute_shortcut", false));
            ﾞᵎ46.MTH7438(new CLS201(this, 14));
            יᐧ10.MTH7296(ﾞᵎ46);
        }
        CLS1635 ﾞᵎ47 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ47.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100964362699461429L, ﾞᵎ47, 4100964474368611125L), CLS412.MTH6002()));
        ﾞᵎ47.MTH7438(new CLS201(this, 15));
        יᐧ10.MTH7296(ﾞᵎ47);
        if(CLS27.MTH890("sendWearYoClass") || CLS27.MTH890("sendWearYoClass_b")) {
            CLS1635 ﾞᵎ48 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ48.MTH800(CLS27.MTH889("send_wear_yo_shortcut"));
            ﾞᵎ48.MTH7437(ˎᵢ0.MTH938("send_wear_yo_shortcut", false));
            ﾞᵎ48.MTH7438(new CLS201(this, 16));
            יᐧ10.MTH7296(ﾞᵎ48);
        }
        if(ᵢﹶ1.MTH6895("send_multple_friendcard")) {
            CLS1635 ﾞᵎ49 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ49.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100965024124425013L, ﾞᵎ49, 4100964607512597301L), CLS412.MTH6002()));
            ﾞᵎ49.MTH7438(new CLS201(this, 17));
            יᐧ10.MTH7296(ﾞᵎ49);
        }
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ10), v);
        CLS1635 ﾞᵎ50 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ50.MTH800(CLS27.MTH889("show_mark_read_enable"));
        ﾞᵎ50.MTH7437(ˎᵢ0.MTH938("show_mark_read_enable", true));
        ﾞᵎ50.MTH7438(new CLS201(this, 18));
        CLS1625 ـˏ11 = ((CLS219)this).MTH3877(z1, z2);
        ـˏ11.MTH800(CLS27.MTH889("mark_read"));
        ـˏ11.MTH7320(new CLS267(2));
        CLS1623 יᐧ11 = new CLS1623(activity0);
        יᐧ11.MTH7289(new Object[]{ﾞᵎ50, ـˏ11});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ11), v);
        if(CLS27.MTH902("mass_remove_stickytop_shortcut")) {
            CLS1623 יᐧ12 = new CLS1623(activity0);
            CLS1635 ﾞᵎ51 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ51.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100960707682292533L, ﾞᵎ51, 4100960840826278709L), !CLS412.MTH6002()));
            ﾞᵎ51.MTH7438(new CLS201(this, 19));
            יᐧ12.MTH7296(ﾞᵎ51);
            CLS1625 ـˏ12 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ12.MTH800(CLS27.MTH889("mass_stickytop"));
            ـˏ12.MTH7320(new CLS193(this, activity0, 8));
            יᐧ12.MTH7296(ـˏ12);
            CLS1625 ـˏ13 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ13.MTH800(CLS27.MTH889("mass_remove_stickytop"));
            ـˏ13.MTH7320(new CLS193(this, activity0, 9));
            יᐧ12.MTH7296(ـˏ13);
            יᐧ12.MTH7290(linearLayout0, v);
        }
        CLS1635 ﾞᵎ52 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ52.MTH800(CLS27.MTH889("mass_delete_msg_shortcut"));
        ﾞᵎ52.MTH7437(ˎᵢ0.MTH938("mass_delete_msg_shortcut", true));
        ﾞᵎ52.MTH7438(new CLS201(this, 20));
        CLS1625 ـˏ14 = ((CLS219)this).MTH3877(z1, z2);
        ـˏ14.MTH800(CLS27.MTH889("mass_delete_msg"));
        ـˏ14.MTH7320(new CLS173(activity0, 1));
        CLS1623 יᐧ13 = new CLS1623(activity0);
        יᐧ13.MTH7289(new Object[]{ﾞᵎ52, ـˏ14});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ13), v);
        boolean z3 = TextUtils.isEmpty(CLS27.MTH897("hidden_conv_parent"));
        CLS1635 ﾞᵎ53 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ53.MTH800(CLS27.MTH889(CLS370.MTH5289((!z3 == 0 ? 4100962185151042357L : 4100962047712088885L))));
        if(!z3 != 0) {
            ﾞᵎ53.MTH798(CLS27.MTH889("mass_hide_conversation_shortcut_desc"));
        }
        ﾞᵎ53.MTH7437(ˎᵢ0.MTH938("mass_delete_conversation_shortcut", false));
        ﾞᵎ53.MTH7438(new CLS201(this, 21));
        CLS1625 ـˏ15 = ((CLS219)this).MTH3877(z1, z2);
        ـˏ15.MTH800(CLS27.MTH889(CLS370.MTH5289((!z3 == 0 ? 4100962734906856245L : 4100962636122608437L))));
        ـˏ15.MTH7320(new CLS173(activity0, 2));
        CLS1623 יᐧ14 = new CLS1623(activity0);
        יᐧ14.MTH7289(new Object[]{ﾞᵎ53, ـˏ15});
        if(!z3 != 0) {
            CLS1625 ـˏ16 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ16.MTH800(CLS27.MTH889("mass_unhide_conversation"));
            ـˏ16.MTH7320(new CLS173(activity0, 3));
            יᐧ14.MTH7296(ـˏ16);
        }
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ14), v);
        if(CLS27.MTH902("hidden_chat_menu_items_enable") && (!CLS182.MTH3470(4100962528748426037L) || !CLS182.MTH3470(4100958749177205557L))) {
            CLS1623 יᐧ15 = new CLS1623(activity0);
            CLS1635 ﾞᵎ54 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ54.MTH800(CLS27.MTH889("hidden_chat_menu_items_enable"));
            ﾞᵎ54.MTH7437(ˎᵢ0.MTH938("hidden_chat_menu_items_enable", false));
            ﾞᵎ54.MTH7438(new CLS201(this, 22));
            יᐧ15.MTH7296(ﾞᵎ54);
            CLS1625 ـˏ17 = ((CLS219)this).MTH3877(z1, z2);
            ـˏ17.MTH800(CLS27.MTH889("manage_chat_menus"));
            ـˏ17.MTH7320(new CLS173(activity0, 4));
            יᐧ15.MTH7296(ـˏ17);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ15), v);
        }
    }
}

