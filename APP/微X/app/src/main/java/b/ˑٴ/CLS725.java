// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS38.CLS37;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS396;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518.CLS516;
import b.ⁱᵔ.CLS518;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CLS725 extends CLS140 {
    public final CLS121 FLD881;
    public Pattern FLD882;
    public Pattern FLD883;

    public CLS725(CLS139 ﹶʼ0) {
        public final class CLS121 extends BroadcastReceiver {
            public final CLS725 FLD880;

            // 此方法包含解密的字符串
            @Override  // android.content.BroadcastReceiver
            public final void onReceive(Context context0, Intent intent0) {
                if(!"wx_notification_direct_reply".equals(intent0.getAction())) {
                    return;
                }
                Bundle bundle0 = intent0.getExtras();
                Bundle bundle1 = Build.VERSION.SDK_INT < 20 ? null : RemoteInput.getResultsFromIntent(intent0);
                if(bundle1 == null) {
                    return;
                }
                String s = (String)bundle1.getCharSequence("wx_direct_reply");
                boolean z = bundle0.containsKey("Main_User");
                CLS725 ˏˈ0 = CLS725.this;
                if(z) {
                    String s1 = bundle0.getString("Main_User");
                    CLS466.MTH6542(s1, s);
                    ˏˈ0.MTH2410().MTH6740(s1);
                    return;
                }
                if(bundle0.containsKey("snsId")) {
                    String s2 = String.valueOf(bundle0.getLong("snsId"));
                    CLS66.MTH1472(CLS396.FLD3775.MTH5756(s2), "", s);
                    CLS485 ᐧﾞ0 = ˏˈ0.MTH2410();
                    String s3 = bundle0.getString("notification_tag");
                    HashMap hashMap0 = ᐧﾞ0.FLD4738;
                    if(hashMap0.containsKey(s3)) {
                        ᐧﾞ0.MTH6733(((int)(((Integer)hashMap0.get(s3)))));
                        hashMap0.remove(s3);
                    }
                    else {
                        hashMap0 = ᐧﾞ0.FLD4735;
                        if(hashMap0.containsKey(s3)) {
                            ᐧﾞ0.MTH6733(((int)(((Integer)hashMap0.get(s3)))));
                            hashMap0.remove(s3);
                        }
                    }
                }
            }
        }

        super(ﹶʼ0);
        this.FLD881 = new CLS121(this);
    }

    // 此方法包含解密的字符串
    public final boolean MTH2407(String s, String s1) {
        CLS29 ˎᵢ0 = this.FLD1445;
        if(ˎᵢ0.MTH938("keyword_notification_enable", false) && (this.FLD1447.FLD1438.MTH6895("keyword_notification") && !CLS502.MTH6934(ˎᵢ0.MTH925("keyword_notif_excl", ""), new String[]{s})) && !CLS21.FLD76.MTH830("isHidden", new Object[]{s})) {
            if(this.FLD883 == null) {
                String s2 = ˎᵢ0.MTH925("keyword_notif_keyword_text", "");
                if(!TextUtils.isEmpty(s2)) {
                    this.FLD883 = Pattern.compile(s2, 2);
                }
            }
            Pattern pattern0 = this.FLD883;
            if(pattern0 == null) {
                return false;
            }
            Matcher matcher0 = pattern0.matcher(s1);
            return matcher0.find() ? !TextUtils.isEmpty(matcher0.group(0)) : false;
        }
        return false;
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        ʾᵢ0.MTH828("b.on_MMFragmentActivity_onResume,b.on_VASActivity_onResume", ((CLS35)new CLS727(this, 0)));
        ʾᵢ0.MTH828("b.notification", ((CLS35)new CLS727(this, 1)));
        ʾᵢ0.MTH833("b.chatroominfoui.menu.options,b.contactinfoui.menu.options,b.singlechatinfoui.menu.options", ((CLS37)new CLS821(((CLS140)this), 2)));
        ʾᵢ0.MTH828("a.async.sqldb.insert", ((CLS35)new CLS727(this, 2)));
        ʾᵢ0.MTH828("onsettingschange", ((CLS35)new CLS727(this, 3)));
        ʾᵢ0.MTH828("on_sns_sync", ((CLS35)new CLS727(this, 4)));
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3043() {
        Context context0 = CLS27.MTH900();
        IntentFilter intentFilter0 = new IntentFilter("wx_notification_direct_reply");
        context0.registerReceiver(this.FLD881, intentFilter0);
    }

    public final CLS485 MTH2410() {
        return (CLS485)CLS40.FLD157.MTH1118(CLS485.class);
    }

    // 此方法包含解密的字符串
    public final void MTH2411(CLS167 ᵔʾ0, String s, String s1, int v) {
        HashMap hashMap3;
        String s19;
        Intent intent2;
        long v5;
        CLS643 ʼﹳ0;
        String s22;
        CLS485 ᐧﾞ3;
        String s17;
        CLS485 ᐧﾞ2;
        String s16;
        Intent intent1;
        String s15;
        CLS485 ᐧﾞ1;
        String s13;
        long v3;
        String s8;
        String s2 = CLS34.MTH1079(4101892311858598709L, new StringBuilder(), s, 0x38ECD95A2B3CD335L);
        String s3 = CLS182.MTH3475(4101892350513304373L, CLS182.MTH3483(s2));
        CLS29 ˎᵢ0 = this.FLD1445;
        if(!ˎᵢ0.MTH938(s3, false) && !CLS34.MTH1078(4101892470772388661L, "custom_", ˎᵢ0, false)) {
            return;
        }
        if(CLS372.MTH5396(s) && !CLS182.MTH3480(4101892006915920693L, CLS182.MTH3483(s2), ˎᵢ0, false)) {
            return;
        }
        ᵔʾ0.MTH3207(null);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s2);
        if(!CLS182.MTH3480(4101892088520299317L, stringBuilder0, ˎᵢ0, false)) {
            if(v != 1 && v != 3) {
                switch(v) {
                    case 34: 
                    case 42: 
                    case 43: 
                    case 0x2F: 
                    case 0x30: 
                    case 49: 
                    case 62: 
                    case 0x1000031: 
                    case 0x13000031: 
                    case 0x19000031: 
                    case 0x1A000031: 
                    case 0x2D000031: 
                    case 0x30000031: 
                    case 0x31000031: 
                    case 0x3A000031: {
                        break;
                    }
                    default: {
                        return;
                    }
                }
            }
            if(TextUtils.isEmpty(this.FLD1447.FLD1434) || !s.equals(this.FLD1447.FLD1434)) {
                String s4 = CLS426.MTH6126(s) ? CLS426.MTH6109(s1) : s;
                if(!CLS182.MTH3480(4101892140059906869L, CLS182.MTH3483(s2), ˎᵢ0, true)) {
                    if(CLS426.MTH6126(s)) {
                        String s5 = CLS426.MTH6109(s1);
                        if(CLS182.MTH3480(0x38ECD93D2B3CD335L, CLS182.MTH3483(s2), ˎᵢ0, false) && !CLS502.MTH6934(ˎᵢ0.MTH925(CLS182.MTH3475(4101892870204347189L, CLS182.MTH3483(s2)), ""), new String[]{s5})) {
                            return;
                        }
                    }
                    if(v == 1 && this.MTH2407(s, s1)) {
                        return;
                    }
                    CLS485 ᐧﾞ0 = this.MTH2410();
                    String s6 = CLS27.MTH889("new_msg_notification");
                    Bitmap bitmap0 = CLS372.MTH5411(s);
                    this.MTH2410().getClass();
                    ᐧﾞ0.MTH6717(s, s4, s6, null, bitmap0, null, CLS485.MTH6731(s));
                    return;
                }
                CLS371 ʻ0 = this.FLD1444;
                ContentValues contentValues0 = CLS371.MTH5368(ʻ0.MTH5300(s));
                if(contentValues0 == null) {
                    return;
                }
                Bitmap bitmap1 = CLS372.MTH5411(s);
                String s7 = ʻ0.MTH5316(s);
                long v1 = CLS34.MTH1080(0x38ECD9F92B3CD335L, contentValues0);
                int v2 = CLS182.MTH3474(4101892513722061621L, contentValues0);
                if(CLS426.MTH6126(s)) {
                    s8 = CLS426.MTH6109(s1);
                    v3 = v1;
                    if(CLS182.MTH3480(0x38ECD9892B3CD335L, CLS182.MTH3483(s2), ˎᵢ0, false) && !CLS502.MTH6934(ˎᵢ0.MTH925(CLS182.MTH3475(4101892646866047797L, CLS182.MTH3483(s2)), ""), new String[]{s8})) {
                        return;
                    }
                }
                else {
                    v3 = v1;
                    s8 = null;
                }
                if(s2.equals("custom_") && this.FLD882 == null) {
                    String s9 = ˎᵢ0.MTH925("custom_keyword_excl_text", "");
                    if(!TextUtils.isEmpty(s9)) {
                        this.FLD882 = Pattern.compile(s9, 2);
                    }
                }
                String s10 = contentValues0.getAsString("content");
                switch(v) {
                    case 1: {
                        if(s2.equals("custom_") && !CLS502.MTH6934(ˎᵢ0.MTH925("custom_keyword_excl", ""), new String[]{s}) && CLS502.MTH6935(this.FLD882, s10)) {
                            return;
                        }
                        if(CLS426.MTH6126(s)) {
                            String s11 = CLS426.MTH6106(v2, s10, s);
                            if(!s11.startsWith("#*") || !s11.endsWith("*#")) {
                                s10 = s11;
                                goto label_64;
                            }
                            else {
                                String s12 = CLS412.MTH5994((s + s8), s11);
                                if(!CLS426.MTH6129(s12) || CLS502.MTH6934(s12, new String[]{CLS66.MTH1452(s, CLS27.MTH904())})) {
                                    s10 = s10.substring(0, s10.indexOf("#*")) + s12;
                                    goto label_64;
                                }
                            }
                        }
                        else {
                            if(s10.startsWith("#*") && s10.endsWith("*#")) {
                                s10 = CLS412.MTH5994(s, s10);
                            }
                        label_64:
                            if(!this.MTH2407(s, s10)) {
                                s13 = s10;
                                ᐧﾞ1 = this.MTH2410();
                                s17 = s13;
                                ᐧﾞ3 = ᐧﾞ1;
                                goto label_164;
                            }
                        }
                        break;
                    }
                    case 3: {
                        String s14 = CLS66.MTH1367(v3);
                        if(TextUtils.isEmpty(s14)) {
                            s14 = CLS66.MTH1410(contentValues0.getAsString("imgPath"));
                        }
                        if(!CLS31.MTH1021(s14)) {
                            s14 = CLS66.MTH1426(contentValues0.getAsString("imgPath"));
                        }
                        if(!CLS31.MTH1024(s14)) {
                            s14 = null;
                        }
                        this.MTH2410().getClass();
                        Intent intent0 = CLS485.MTH6720();
                        intent0.putExtra("img_gallery_talker", s);
                        intent0.putExtra("img_gallery_msg_svr_id", v3);
                        s15 = s14;
                        intent1 = intent0;
                        s16 = CLS27.MTH889("img_summary");
                        ᐧﾞ2 = this.MTH2410();
                        intent2 = intent1;
                        s19 = s16;
                        ᐧﾞ3 = ᐧﾞ2;
                        ᐧﾞ3.MTH6717(s, s4, s7, s19, bitmap1, s15, intent2);
                        return;
                    }
                    case 34: {
                        int v4 = Integer.parseInt(s10.split(":")[1]);
                        ᐧﾞ1 = this.MTH2410();
                        s13 = CLS27.MTH889("audio") + ": " + v4 / 1000 + "\"";
                        s17 = s13;
                        ᐧﾞ3 = ᐧﾞ1;
                        goto label_164;
                    }
                    case 42: {
                        String s18 = s10.substring(s10.indexOf("nickname") + 10);
                        s17 = String.format(CLS27.MTH889("friend_card_notification"), ʻ0.MTH5311(s), s18.substring(0, s18.indexOf("\"")));
                        ᐧﾞ3 = this.MTH2410();
                        goto label_164;
                    }
                    case 0x2F: {
                        String s20 = contentValues0.getAsString("imgPath");
                        HashMap hashMap0 = CLS392.MTH5633(s10, "emoji");
                        String s21 = hashMap0 == null || !hashMap0.containsKey(".emoji.$thumburl") ? null : ((String)hashMap0.get(".emoji.$thumburl")).replace("*#*", ":");
                        if(TextUtils.isEmpty(s21)) {
                            s22 = hashMap0 == null || !hashMap0.containsKey(".emoji.$cdnurl") ? null : ((String)hashMap0.get(".emoji.$cdnurl")).replace("*#*", ":");
                        }
                        else {
                            s22 = s21;
                        }
                        if(TextUtils.isEmpty(s22)) {
                            ᐧﾞ3 = this.MTH2410();
                            s17 = "[" + CLS27.MTH889("emoji") + "]: " + CLS66.MTH1417(s20);
                            goto label_164;
                        }
                        ʼﹳ0 = new CLS643(this, s, s4, s7, s20, bitmap1, 0);
                        CLS518.MTH7068(s22, ((CLS516)ʼﹳ0));
                        return;
                    }
                    case 0x30: {
                        String s23 = s10.substring(s10.indexOf("label") + 7);
                        s17 = String.format(CLS27.MTH889("location_notification"), s23.substring(0, s23.indexOf("\"")));
                        ᐧﾞ3 = this.MTH2410();
                        goto label_164;
                    }
                    case 49: {
                        HashMap hashMap1 = CLS392.MTH5633(s10, "appmsg");
                        String s24 = hashMap1.containsKey(".appmsg.title") ? ((String)hashMap1.get(".appmsg.title")) : "";
                        if(!hashMap1.containsKey(".appmsg.type")) {
                            v5 = 4101873023160472373L;
                        }
                        else if(Integer.parseInt(((String)hashMap1.get(".appmsg.type"))) == 3) {
                            v5 = 4101872426160018229L;
                        }
                        else {
                            v5 = 4101873001685635893L;
                        }
                        s17 = CLS182.MTH3476(CLS27.MTH889(CLS370.MTH5289(v5)), s24);
                        if((!s2.equals("custom_") || CLS502.MTH6934(ˎᵢ0.MTH925("custom_keyword_excl", ""), new String[]{s}) || !CLS502.MTH6935(this.FLD882, s24)) && !this.MTH2407(s, s17)) {
                            ᐧﾞ3 = this.MTH2410();
                            goto label_164;
                        }
                        break;
                    }
                    case 43: 
                    case 62: {
                        this.MTH2410().getClass();
                        intent1 = CLS485.MTH6720();
                        intent1.putExtra("img_gallery_talker", s);
                        intent1.putExtra("img_gallery_msg_svr_id", v3);
                        s16 = CLS27.MTH889("video_summary");
                        ᐧﾞ2 = this.MTH2410();
                        s15 = CLS66.MTH1482(contentValues0.getAsString("imgPath"));
                        intent2 = intent1;
                        s19 = s16;
                        ᐧﾞ3 = ᐧﾞ2;
                        ᐧﾞ3.MTH6717(s, s4, s7, s19, bitmap1, s15, intent2);
                        return;
                    }
                    case 0x13000031: {
                        HashMap hashMap2 = CLS392.MTH5633(s10, "appmsg");
                        String s25 = hashMap2.containsKey(".appmsg.fromusername") ? ((String)hashMap2.get(".appmsg.fromusername")) : null;
                        if(!TextUtils.isEmpty(s25)) {
                            goto label_146;
                        }
                        int v6 = s10.indexOf("<fromusername>");
                        if(v6 != -1) {
                            s25 = s10.substring(v6 + 14, s10.indexOf("</fromusername>"));
                        label_146:
                            if(TextUtils.isEmpty(s25)) {
                                s13 = "";
                            }
                            else if("gh_3dfda90e39d6".equals(s25) && (hashMap2.containsKey(".appmsg.type") ? Integer.parseInt(((String)hashMap2.get(".appmsg.type"))) : 0) == 5) {
                                String[] arr_s = ((String)hashMap2.get(".appmsg.des")).split("\n");
                                s13 = "[" + ((String)hashMap2.get(".appmsg.title")) + "]: " + arr_s[2].trim();
                            }
                            else {
                                s13 = "[" + ((String)hashMap2.get(".appmsg.title")) + "]: " + ((String)hashMap2.get(".appmsg.des")).trim();
                            }
                            s17 = s13;
                            ᐧﾞ3 = this.MTH2410();
                            goto label_164;
                        }
                        break;
                    }
                    case 0x19000031: {
                        hashMap3 = CLS392.MTH5633(s10, "appmsg");
                        s17 = "[" + ((String)hashMap3.get(".appmsg.title")) + "]: " + ((String)hashMap3.get(CLS370.MTH5289(0x38ECC4002B3CD335L)));
                        ᐧﾞ3 = this.MTH2410();
                        goto label_164;
                    }
                    case 0x1A000031: {
                        hashMap3 = CLS392.MTH5633(s10, "appmsg");
                        s17 = "[" + ((String)hashMap3.get(".appmsg.title")) + "]: " + ((String)hashMap3.get(CLS370.MTH5289(4101869170574807861L)));
                        ᐧﾞ3 = this.MTH2410();
                    label_164:
                        this.MTH2410().getClass();
                        s15 = null;
                        s19 = s17;
                        intent2 = CLS485.MTH6731(s);
                        ᐧﾞ3.MTH6717(s, s4, s7, s19, bitmap1, s15, intent2);
                        return;
                    }
                    case 0x1000031: 
                    case 0x30000031: 
                    case 0x31000031: {
                        s17 = (String)CLS392.MTH5633(s10, "appmsg").get(".appmsg.title");
                        if(s2.equals("custom_") && !CLS502.MTH6934(ˎᵢ0.MTH925("custom_keyword_excl", ""), new String[]{s}) && CLS502.MTH6935(this.FLD882, s17)) {
                            return;
                        }
                        ᐧﾞ3 = this.MTH2410();
                        goto label_164;
                    }
                    case 0x2D000031: 
                    case 0x3A000031: {
                        HashMap hashMap4 = CLS392.MTH5633(s10, "appmsg");
                        String s26 = (String)hashMap4.get(".appmsg.finderFeed.desc");
                        if(!s2.equals("custom_") || CLS502.MTH6934(ˎᵢ0.MTH925("custom_keyword_excl", ""), new String[]{s}) || !CLS502.MTH6935(this.FLD882, s26)) {
                            s22 = (String)hashMap4.get(".appmsg.finderFeed.mediaList.media.thumbUrl");
                            ʼﹳ0 = new CLS643(this, s, s4, s7, CLS27.MTH889("video_channel") + " " + s26, bitmap1, 1);
                            CLS518.MTH7068(s22, ((CLS516)ʼﹳ0));
                            return;
                        }
                        break;
                    }
                }
            }
        }
    }
}

