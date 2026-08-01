// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.LinearLayout;
import b.ʻˑ.CLS0;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS91;
import b.ᐧˉ.CLS1019;
import b.ᐧˉ.CLS1026;
import b.ᐧˉ.CLS1096;
import b.ᐧˉ.CLS1113;
import b.ᐧˉ.CLS1140;
import b.ᐧˉ.CLS1173;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS203;
import b.ᐧˉ.CLS205;
import b.ᐧˉ.CLS210;
import b.ᐧˉ.CLS227;
import b.ᐧˉ.CLS230;
import b.ᐧˉ.CLS235;
import b.ᐧˉ.CLS248;
import b.ᐧˉ.CLS252;
import b.ᐧˉ.CLS257;
import b.ᐧˉ.CLS258;
import b.ᐧˉ.CLS259;
import b.ᐧˉ.CLS272;
import b.ⁱʾ.CLS1274;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS438;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617.CLS526;
import b.ﾞˎ.CLS1617;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS530;
import b.ﾞˎ.CLS536;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.json.JSONArray;

public final class CLS755 implements CLS0, CLS16, CLS17, CLS379, CLS526 {
    public final int FLD996;
    public final Object FLD997;
    public final int FLD998;
    public final Object FLD999;
    public final Object FLD1000;
    public final Object FLD1001;

    public CLS755(int v, Activity activity0, CLS1622 ˑٴ0, CLS1622 ˑٴ1, CLS210 ˋʼ0) {
        this.FLD996 = 2;
        super();
        this.FLD1001 = ˋʼ0;
        this.FLD1000 = activity0;
        this.FLD999 = ˑٴ0;
        this.FLD997 = ˑٴ1;
        this.FLD998 = v;
    }

    public CLS755(int v, CLS369 ﾞᵎ0, CLS29 ˎᵢ0, String s, ArrayList arrayList0) {
        this.FLD996 = 6;
        super();
        this.FLD1000 = ˎᵢ0;
        this.FLD1001 = s;
        this.FLD999 = arrayList0;
        this.FLD998 = v;
        this.FLD997 = ﾞᵎ0;
    }

    public CLS755(int v, CLS1622 ˑٴ0, String s, Activity activity0, Calendar calendar0) {
        this.FLD996 = 5;
        super();
        this.FLD998 = v;
        this.FLD1000 = ˑٴ0;
        this.FLD1001 = s;
        this.FLD999 = activity0;
        this.FLD997 = calendar0;
    }

    public CLS755(CLS1019 ˎʻ0, Activity activity0, String s, int v, CLS78 ˊﾞ0) {
        this.FLD996 = 3;
        super();
        this.FLD1000 = ˎʻ0;
        this.FLD999 = activity0;
        this.FLD1001 = s;
        this.FLD998 = v;
        this.FLD997 = ˊﾞ0;
    }

    public CLS755(CLS1173 ᵢᵢ0, String s, Activity activity0, CLS1635 ﾞᵎ0, int v) {
        this.FLD996 = 4;
        super();
        this.FLD1000 = ᵢᵢ0;
        this.FLD1001 = s;
        this.FLD999 = activity0;
        this.FLD997 = ﾞᵎ0;
        this.FLD998 = v;
    }

    public CLS755(File file0, SparseArray sparseArray0, int v, Bundle bundle0, CLS1274 ﾞˎ0) {
        this.FLD996 = 1;
        super();
        this.FLD1001 = file0;
        this.FLD999 = sparseArray0;
        this.FLD998 = v;
        this.FLD1000 = bundle0;
        this.FLD997 = ﾞˎ0;
    }

    public CLS755(String s, Bundle bundle0, SparseArray sparseArray0, int v, CLS1274 ﾞˎ0) {
        this.FLD996 = 0;
        super();
        this.FLD1001 = s;
        this.FLD1000 = bundle0;
        this.FLD999 = sparseArray0;
        this.FLD998 = v;
        this.FLD997 = ﾞˎ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS0
    public final void MTH770(String s) {
        int v = this.FLD998;
        Object object0 = this.FLD997;
        Object object1 = this.FLD999;
        Object object2 = this.FLD1000;
        Object object3 = this.FLD1001;
        if(this.FLD996 == 0) {
            String s1 = CLS66.MTH1410(s);
            Bundle bundle0 = new Bundle();
            bundle0.putInt("type", -3);
            bundle0.putString("content", s1);
            bundle0.putString("imgPath", s);
            bundle0.putString("talker", ((String)object3));
            bundle0.putInt("isSend", ((Bundle)object2).getInt("isSend"));
            bundle0.putLong("msgSvrId", ((Bundle)object2).getLong("msgSvrId"));
            bundle0.putLong("msgId", ((Bundle)object2).getLong("msgId"));
            ((SparseArray)object1).put(v, bundle0);
            if(((CLS3)object0) != null) {
                ((CLS3)object0).MTH774();
            }
            return;
        }
        File file0 = new File(CLS66.MTH1410(s));
        if(CLS31.MTH1001(file0)) {
            String s2 = file0.getName();
            if(!CLS502.MTH6934(s2, new String[]{"."})) {
                s2 = CLS182.MTH3475(4102159476004279093L, CLS182.MTH3483(s2));
            }
            CLS31.MTH1025(file0, new File(((File)object3), s2));
            ((SparseArray)object1).put(v, ((Bundle)object2));
        }
        if(((CLS3)object0) != null) {
            ((CLS3)object0).MTH774();
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        String[] arr_s;
        int v = this.FLD998;
        Object object0 = this.FLD997;
        Object object1 = this.FLD999;
        Object object2 = this.FLD1000;
        Object object3 = this.FLD1001;
        if(this.FLD996 == 2) {
            ((CLS210)object3).getClass();
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            CLS1635 ﾞᵎ0 = new CLS1635(((Activity)object2));
            ((CLS210)object3).FLD2012 = ﾞᵎ0;
            ﾞᵎ0.MTH800(CLS27.MTH889("enable"));
            CLS523.MTH7147(linearLayout0, ((CLS18)((CLS210)object3).FLD2012), true);
            CLS1623 יᐧ0 = new CLS1623(((Activity)object2));
            ((CLS1622)object1).MTH800(CLS27.MTH889("begin_part"));
            ((CLS1622)object0).MTH800(CLS27.MTH889("end_part"));
            יᐧ0.MTH7289(new Object[]{((CLS1622)object1), ((CLS1622)object0)});
            יᐧ0.MTH7290(linearLayout0, CLS523.MTH7137(10));
            if(v != -1) {
                CLS91 ᵔʾ0 = (CLS91)((CLS210)object3).FLD2010.get(v);
                ((CLS210)object3).FLD2004 = ᵔʾ0.MTH1735();
                ((CLS210)object3).FLD2012.MTH7437(ᵔʾ0.FLD386 == 1);
                ((CLS210)object3).FLD2005 = ((CLS210)object3).FLD2012.MTH7444();
                ((CLS210)object3).FLD2018 = ᵔʾ0.MTH1738();
                String s = "";
                String s1 = "";
                try {
                    String s2 = ᵔʾ0.MTH1735();
                    if(CLS502.MTH6934(s2, new String[]{"|"})) {
                        arr_s = s2.split(Pattern.quote("|"));
                    }
                    else {
                        arr_s = CLS502.MTH6934(s2, new String[]{"#"}) ? s2.split("#") : null;
                    }
                    if(arr_s != null) {
                        s = arr_s[0].trim();
                        s1 = arr_s[1].trim();
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                ((CLS1622)object1).MTH7277(s);
                ((CLS1622)object0).MTH7277(s1);
            }
            return;
        }
        LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
        if(v == 1) {
            ((CLS1622)object2).MTH7277(((String)object3));
            CLS523.MTH7147(linearLayout1, ((CLS18)(((CLS1622)object2))), true);
        }
        CLS1623 יᐧ1 = new CLS1623(((Activity)object1));
        CLS1626 ـﹳ0 = new CLS1626(((Activity)object1));
        ـﹳ0.MTH7324(new CLS438(((Activity)object1), ((Calendar)object0), ـﹳ0, 2));
        יᐧ1.MTH7296(ـﹳ0);
        CLS1626 ـﹳ1 = new CLS1626(((Activity)object1));
        ـﹳ1.MTH7324(new CLS438(((Activity)object1), ((Calendar)object0), ـﹳ1, 3));
        יᐧ1.MTH7296(ـﹳ1);
        ـﹳ0.MTH800(new SimpleDateFormat("yyyy-MM-dd").format(((Calendar)object0).getTime()));
        ـﹳ1.MTH800(new SimpleDateFormat("HH:mm").format(((Calendar)object0).getTime()));
        יᐧ1.MTH7290(linearLayout1, 0);
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1617$CLS526
    public final void MTH7191(LinearLayout linearLayout0) {
        CLS1019 ˎʻ0 = (CLS1019)this.FLD1000;
        Activity activity0 = (Activity)this.FLD999;
        String s = (String)this.FLD1001;
        ˎʻ0.getClass();
        CLS1635 ﾞᵎ0 = new CLS1635(activity0);
        String s1 = CLS182.MTH3475(4100705260207395637L, CLS182.MTH3487(4100705195782886197L, ﾞᵎ0, s));
        ﾞᵎ0.MTH7437(ˎʻ0.FLD2151.MTH938(s1, false));
        CLS34.MTH1083(ˎʻ0, s, 7, ﾞᵎ0);
        CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ0), true);
        CLS1635 ﾞᵎ1 = new CLS1635(activity0);
        StringBuilder stringBuilder0 = CLS182.MTH3487(4100719072822219573L, ﾞᵎ1, s);
        stringBuilder0.append("_chatroom_ban_sendmsg_enable");
        ﾞᵎ1.MTH7437(ˎʻ0.FLD2151.MTH938(stringBuilder0.toString(), true));
        ﾞᵎ1.MTH7438(new CLS259(ˎʻ0, s, 8));
        CLS1635 ﾞᵎ2 = new CLS1635(activity0);
        StringBuilder stringBuilder1 = CLS182.MTH3487(4100719317635355445L, ﾞᵎ2, s);
        stringBuilder1.append("_mod_invite_only");
        ﾞᵎ2.MTH7437(ˎʻ0.FLD2151.MTH938(stringBuilder1.toString(), false));
        ﾞᵎ2.MTH7438(new CLS259(ˎʻ0, s, 10));
        CLS1635 ﾞᵎ3 = new CLS1635(activity0);
        StringBuilder stringBuilder2 = CLS182.MTH3487(4100718939678233397L, ﾞᵎ3, s);
        stringBuilder2.append("_mod_invite_only_kickboth");
        ﾞᵎ3.MTH7437(ˎʻ0.FLD2151.MTH938(stringBuilder2.toString(), false));
        ﾞᵎ3.MTH7438(new CLS259(ˎʻ0, s, 11));
        CLS1635 ﾞᵎ4 = new CLS1635(activity0);
        StringBuilder stringBuilder3 = CLS182.MTH3487(4100719708477379381L, ﾞᵎ4, s);
        stringBuilder3.append("_name_change_ban_enable");
        ﾞᵎ4.MTH7437(ˎʻ0.FLD2151.MTH938(stringBuilder3.toString(), false));
        ﾞᵎ4.MTH7438(new CLS259(ˎʻ0, s, 12));
        CLS1635 ﾞᵎ5 = new CLS1635(activity0);
        StringBuilder stringBuilder4 = CLS182.MTH3487(4100719360585028405L, ﾞᵎ5, s);
        stringBuilder4.append("_fake_owner_ban_enable");
        ﾞᵎ5.MTH7437(ˎʻ0.FLD2151.MTH938(stringBuilder4.toString(), false));
        ﾞᵎ5.MTH7438(new CLS259(ˎʻ0, s, 13));
        CLS1635 ﾞᵎ6 = new CLS1635(activity0);
        StringBuilder stringBuilder5 = CLS182.MTH3487(4100719553858556725L, ﾞᵎ6, s);
        stringBuilder5.append("_multiple_at_ban_enable");
        ﾞᵎ6.MTH7437(ˎʻ0.FLD2151.MTH938(stringBuilder5.toString(), false));
        ﾞᵎ6.MTH7438(new CLS259(ˎʻ0, s, 14));
        CLS1635 ﾞᵎ7 = new CLS1635(activity0);
        StringBuilder stringBuilder6 = CLS182.MTH3487(4100720305477833525L, ﾞᵎ7, s);
        stringBuilder6.append("_exit_room_autoban_enable");
        ﾞᵎ7.MTH7437(ˎʻ0.FLD2151.MTH938(stringBuilder6.toString(), false));
        ﾞᵎ7.MTH7438(new CLS259(ˎʻ0, s, 15));
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH7289(new Object[]{ﾞᵎ1, ﾞᵎ2, ﾞᵎ3, ﾞᵎ4, ﾞᵎ5, ﾞᵎ6, ﾞᵎ7});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), this.FLD998);
        CLS1623 יᐧ1 = new CLS1623(activity0);
        CLS1617 ʻᵎ0 = new CLS1617(activity0);
        ʻᵎ0.MTH800(CLS27.MTH889("text_max_length_ban_enable"));
        ʻᵎ0.FLD5159 = new CLS1140(ˎʻ0, activity0, s, this.FLD998, 6);
        יᐧ1.MTH7296(ʻᵎ0);
        CLS1617 ʻᵎ1 = new CLS1617(activity0);
        ʻᵎ1.MTH800(CLS27.MTH889("chatroom_repeat_ban_enable"));
        ʻᵎ1.FLD5159 = new CLS1140(ˎʻ0, activity0, s, this.FLD998, 7);
        יᐧ1.MTH7296(ʻᵎ1);
        CLS1617 ʻᵎ2 = new CLS1617(activity0);
        ʻᵎ2.MTH800(CLS27.MTH889("chatroom_article_ban_enable"));
        ʻᵎ2.FLD5159 = new CLS1140(ˎʻ0, activity0, s, this.FLD998, 0);
        יᐧ1.MTH7296(ʻᵎ2);
        CLS1617 ʻᵎ3 = new CLS1617(activity0);
        ʻᵎ3.MTH800(CLS27.MTH889("chatroom_app_ban_enable"));
        ʻᵎ3.FLD5159 = new CLS1140(ˎʻ0, activity0, s, this.FLD998, 1);
        יᐧ1.MTH7296(ʻᵎ3);
        CLS1617 ʻᵎ4 = new CLS1617(activity0);
        ʻᵎ4.MTH800(CLS27.MTH889("chatroom_friendcard_ban_enable"));
        ʻᵎ4.FLD5159 = new CLS1140(ˎʻ0, activity0, s, this.FLD998, 2);
        יᐧ1.MTH7296(ʻᵎ4);
        CLS1617 ʻᵎ5 = new CLS1617(activity0);
        ʻᵎ5.MTH800(CLS27.MTH889("chatroom_images_ban_enable"));
        ʻᵎ5.FLD5159 = new CLS1140(ˎʻ0, activity0, s, this.FLD998, 3);
        יᐧ1.MTH7296(ʻᵎ5);
        CLS1617 ʻᵎ6 = new CLS1617(activity0);
        ʻᵎ6.MTH800(CLS27.MTH889("chatroom_qrcode_ban_enable"));
        ʻᵎ6.FLD5159 = new CLS1140(ˎʻ0, activity0, s, this.FLD998, 4);
        יᐧ1.MTH7296(ʻᵎ6);
        CLS1617 ʻᵎ7 = new CLS1617(activity0);
        ʻᵎ7.MTH800(CLS27.MTH889("auto_kick_keyword_enable"));
        ʻᵎ7.FLD5159 = new CLS1140(ˎʻ0, activity0, s, this.FLD998, 5);
        יᐧ1.MTH7296(ʻᵎ7);
        יᐧ1.MTH7290(linearLayout0, this.FLD998);
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        String s2 = CLS182.MTH3475(4100717105727198005L, CLS34.MTH1085(4100717054187590453L, ˑٴ0, s));
        String s3 = CLS27.MTH889("goodbye_text");
        ˑٴ0.MTH7277(ˎʻ0.FLD2151.MTH925(s2, s3));
        ˑٴ0.FLD5252 = new CLS1096(ˎʻ0, s, 5);
        CLS523.MTH7147(linearLayout0, ((CLS18)ˑٴ0), true);
        CLS1623 יᐧ2 = new CLS1623(activity0);
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ـˏ0.MTH800(CLS27.MTH889("modconfig"));
        ـˏ0.MTH7320(new CLS272(ˎʻ0, ((CLS78)this.FLD997), 0));
        יᐧ2.MTH7296(ـˏ0);
        CLS1625 ـˏ1 = new CLS1625(activity0);
        ـˏ1.MTH800(CLS27.MTH889("supermodconfig"));
        ـˏ1.MTH7320(new CLS272(ˎʻ0, ((CLS78)this.FLD997), 1));
        יᐧ2.MTH7296(ـˏ1);
        CLS1625 ـˏ2 = new CLS1625(activity0);
        ـˏ2.MTH800(CLS27.MTH889("banconfig"));
        ـˏ2.MTH7320(new CLS272(ˎʻ0, ((CLS78)this.FLD997), 2));
        יᐧ2.MTH7296(ـˏ2);
        CLS1635 ﾞᵎ8 = new CLS1635(activity0);
        StringBuilder stringBuilder7 = CLS182.MTH3487(4100716822259356469L, ﾞᵎ8, s);
        stringBuilder7.append("_whitelist_enable");
        ﾞᵎ8.MTH7437(ˎʻ0.FLD2151.MTH938(stringBuilder7.toString(), false));
        CLS34.MTH1083(ˎʻ0, s, 9, ﾞᵎ8);
        CLS1625 ـˏ3 = CLS34.MTH1082(יᐧ2, ﾞᵎ8, activity0);
        ـˏ3.MTH800(CLS27.MTH889("whiteconfig"));
        ـˏ3.MTH7320(new CLS272(ˎʻ0, ((CLS78)this.FLD997), 3));
        יᐧ2.MTH7296(ـˏ3);
        CLS1625 ـˏ4 = new CLS1625(activity0);
        ـˏ4.MTH800(CLS27.MTH889("autokick_warning_management"));
        ـˏ4.MTH7320(new CLS230(activity0, s, 3));
        יᐧ2.MTH7296(ـˏ4);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), this.FLD998);
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        ـﹳ0.MTH798(CLS27.MTH889("mod_desc"));
        ـﹳ0.FLD5295 = false;
        CLS523.MTH7147(linearLayout0, ((CLS18)ـﹳ0), true);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        HashSet hashSet0 = new HashSet(Arrays.asList(((CLS29)this.FLD1000).MTH925("mass_send_data_tags", "").split(",")));
        hashSet0.remove(((String)this.FLD1001));
        hashSet0.add(s);
        String s1 = TextUtils.join(",", hashSet0);
        ((CLS29)this.FLD1000).MTH922(s1, "mass_send_data_tags");
        String s2 = CLS182.MTH3484(4100839585309578037L, new StringBuilder(), s);
        String s3 = CLS182.MTH3484(4100839671208923957L, new StringBuilder(), ((String)this.FLD1001));
        JSONArray jSONArray0 = new JSONArray();
        JSONArray jSONArray1 = ((CLS29)this.FLD1000).MTH937(s3, jSONArray0);
        ((CLS29)this.FLD1000).MTH922(jSONArray1, s2);
        ((CLS29)this.FLD1000).MTH932("mass_send_data_val_" + ((String)this.FLD1001));
        ((ArrayList)this.FLD999).remove(((String)this.FLD1001));
        ((ArrayList)this.FLD999).add(this.FLD998, s);
        ((CLS369)this.FLD997).notifyDataSetChanged();
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS1623 יᐧ9;
        CLS1635 ﾞᵎ16;
        CLS1635 ﾞᵎ15;
        int v1;
        CLS1623 יᐧ3;
        CLS1173 ᵢᵢ0 = (CLS1173)this.FLD1000;
        String s = (String)this.FLD1001;
        Activity activity0 = (Activity)this.FLD999;
        CLS1635 ﾞᵎ0 = (CLS1635)this.FLD997;
        ᵢᵢ0.getClass();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s);
        String s1 = CLS182.MTH3475(0x38E9FD1C2B3CD335L, stringBuilder0);
        CLS29 ˎᵢ0 = ᵢᵢ0.FLD2151;
        boolean z = ˎᵢ0.MTH938(s1, false);
        CLS485 ᐧﾞ0 = ᵢᵢ0.FLD2716;
        if(z) {
            ᐧﾞ0.getClass();
            CLS485.MTH6726(activity0, s);
            if(CLS502.MTH6943(s, new String[]{"custom"})) {
                StringBuilder stringBuilder1 = CLS182.MTH3483(s);
                stringBuilder1.append("_chatroom");
                CLS485.MTH6726(activity0, stringBuilder1.toString());
            }
        }
        CLS1623 יᐧ0 = new CLS1623(activity0);
        StringBuilder stringBuilder2 = CLS182.MTH3487(4101087946088436533L, ﾞᵎ0, s);
        stringBuilder2.append("_notification_enable");
        ﾞᵎ0.MTH7437(ˎᵢ0.MTH938(stringBuilder2.toString(), false));
        ﾞᵎ0.MTH7438(new CLS205(ᵢᵢ0, s, יᐧ0, 3));
        CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ0), true);
        CLS1623 יᐧ1 = new CLS1623(activity0);
        CLS1635 ﾞᵎ1 = new CLS1635(activity0);
        StringBuilder stringBuilder3 = CLS182.MTH3487(4101088066347520821L, ﾞᵎ1, s);
        stringBuilder3.append("_mute_enable");
        ﾞᵎ1.MTH7437(ˎᵢ0.MTH938(stringBuilder3.toString(), false));
        ﾞᵎ1.MTH7438(new CLS203(ᵢᵢ0, s, 3));
        יᐧ1.MTH7296(ﾞᵎ1);
        if(CLS502.MTH6943(s, new String[]{"new_comment", "recall", "moments_notification", "keyword", "sns_keyword"})) {
            ﾞᵎ1.MTH801(8);
        }
        CLS1635 ﾞᵎ2 = new CLS1635(activity0);
        StringBuilder stringBuilder4 = CLS182.MTH3487(4101087881663927093L, ﾞᵎ2, s);
        stringBuilder4.append("_vibrate_enable");
        ﾞᵎ2.MTH7437(ˎᵢ0.MTH938(stringBuilder4.toString(), false));
        ﾞᵎ2.MTH7438(new CLS203(ᵢᵢ0, s, 4));
        יᐧ1.MTH7296(ﾞᵎ2);
        CLS1635 ﾞᵎ3 = new CLS1635(activity0);
        StringBuilder stringBuilder5 = CLS182.MTH3487(4101084166517216053L, ﾞᵎ3, s);
        stringBuilder5.append("_ringtone_enable");
        ﾞᵎ3.MTH7437(ˎᵢ0.MTH938(stringBuilder5.toString(), false));
        ﾞᵎ3.MTH7438(new CLS203(ᵢᵢ0, s, 5));
        יᐧ1.MTH7296(ﾞᵎ3);
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        ᵢᵢ0.FLD2719 = ـﹳ0;
        ـﹳ0.MTH800(CLS27.MTH889("select_ringtone"));
        ᵢᵢ0.FLD2719.MTH7325(CLS27.MTH889("default_text"));
        ᵢᵢ0.FLD2719.MTH7324(new CLS530(ᵢᵢ0, s, 12));
        יᐧ1.MTH7296(ᵢᵢ0.FLD2719);
        CLS1635 ﾞᵎ4 = new CLS1635(activity0);
        ᵢᵢ0.FLD2718 = ﾞᵎ4;
        ﾞᵎ4.MTH800(CLS27.MTH889("enable_heads_up_notification"));
        CLS1635 ﾞᵎ5 = ᵢᵢ0.FLD2718;
        StringBuilder stringBuilder6 = CLS182.MTH3483(s);
        stringBuilder6.append("_headsup_enable");
        ﾞᵎ5.MTH7437(ˎᵢ0.MTH938(stringBuilder6.toString(), false));
        ᵢᵢ0.FLD2718.MTH7438(new CLS203(ᵢᵢ0, s, 6));
        יᐧ1.MTH7296(ᵢᵢ0.FLD2718);
        CLS1635 ﾞᵎ6 = new CLS1635(activity0);
        StringBuilder stringBuilder7 = CLS182.MTH3487(4101084076322902837L, ﾞᵎ6, s);
        stringBuilder7.append("_ignore_mute_enable");
        ﾞᵎ6.MTH7437(ˎᵢ0.MTH938(stringBuilder7.toString(), false));
        ﾞᵎ6.MTH7438(new CLS203(ᵢᵢ0, s, 7));
        יᐧ1.MTH7296(ﾞᵎ6);
        CLS1635 ﾞᵎ7 = new CLS1635(activity0);
        ﾞᵎ7.MTH800(CLS27.MTH889("show_comment_content_enable"));
        ﾞᵎ7.MTH7437(ˎᵢ0.MTH938("show_comment_content_enable", true));
        ﾞᵎ7.MTH7438(new CLS235(ᵢᵢ0, 2));
        יᐧ1.MTH7296(ﾞᵎ7);
        CLS1635 ﾞᵎ8 = new CLS1635(activity0);
        StringBuilder stringBuilder8 = CLS182.MTH3487(4101084514409567029L, ﾞᵎ8, s);
        stringBuilder8.append("_show_notif_detail");
        ﾞᵎ8.MTH7437(ˎᵢ0.MTH938(stringBuilder8.toString(), true));
        ﾞᵎ8.MTH7438(new CLS203(ᵢᵢ0, s, 8));
        יᐧ1.MTH7296(ﾞᵎ8);
        int v = this.FLD998;
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        CLS1635 ﾞᵎ9 = new CLS1635(activity0);
        ᵢᵢ0.FLD2720 = ﾞᵎ9;
        ﾞᵎ9.MTH800(CLS27.MTH889("disable_chatroom_vibration"));
        ᵢᵢ0.FLD2720.MTH7437(ˎᵢ0.MTH938("chatroom_vibrate_disable", false));
        ᵢᵢ0.FLD2720.MTH7438(new CLS235(ᵢᵢ0, 3));
        יᐧ0.MTH7296(ᵢᵢ0.FLD2720);
        CLS1635 ﾞᵎ10 = new CLS1635(activity0);
        ᵢᵢ0.FLD2724 = ﾞᵎ10;
        ﾞᵎ10.MTH800(CLS27.MTH889("disable_chatroom_ringtone"));
        ᵢᵢ0.FLD2724.MTH7437(ˎᵢ0.MTH938("chatroom_ringtone_disable", false));
        ᵢᵢ0.FLD2724.MTH7438(new CLS235(ᵢᵢ0, 0));
        יᐧ0.MTH7296(ᵢᵢ0.FLD2724);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
        StringBuilder stringBuilder9 = new StringBuilder();
        stringBuilder9.append(s);
        String s2 = ˎᵢ0.MTH925(CLS182.MTH3475(4101085098525119285L, stringBuilder9), "23:0");
        String s3 = ˎᵢ0.MTH925(CLS182.MTH3475(4101085751360148277L, CLS182.MTH3483(s)), "8:0");
        String[] arr_s = s2.split(":");
        String[] arr_s1 = s3.split(":");
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("startH", arr_s[0]);
        contentValues0.put("startM", arr_s[1]);
        contentValues0.put("endH", arr_s1[0]);
        contentValues0.put("endM", arr_s1[1]);
        CLS536 ˉˏ0 = new CLS536(activity0, contentValues0, ((CLS12)new CLS1026(ᵢᵢ0, s, 0)), ((CLS12)new CLS1026(ᵢᵢ0, s, 1)));
        CLS1635 ﾞᵎ11 = new CLS1635(activity0);
        StringBuilder stringBuilder10 = CLS182.MTH3487(0x38E9FBF42B3CD335L, ﾞᵎ11, s);
        stringBuilder10.append("_do_not_disturb");
        ﾞᵎ11.MTH7437(ˎᵢ0.MTH938(stringBuilder10.toString(), false));
        ﾞᵎ11.MTH7438(new CLS203(ᵢᵢ0, s, 0));
        CLS1623 יᐧ2 = new CLS1623(activity0);
        יᐧ2.MTH7296(ﾞᵎ11);
        ˉˏ0.MTH7234(יᐧ2);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
        StringBuilder stringBuilder11 = new StringBuilder();
        stringBuilder11.append(s);
        String s4 = ˎᵢ0.MTH925(CLS182.MTH3475(4101085545201718069L, stringBuilder11), "");
        if(TextUtils.isEmpty(s4)) {
            ᵢᵢ0.FLD2719.MTH7325(CLS27.MTH889("default_text"));
        }
        else {
            Ringtone ringtone0 = RingtoneManager.getRingtone(activity0.getApplicationContext(), Uri.parse(s4));
            ᵢᵢ0.FLD2719.MTH7325(ringtone0.getTitle(activity0));
        }
        if(!"custom".equalsIgnoreCase(s) || !CLS182.MTH3480(4101085678345704245L, CLS182.MTH3483(s), ˎᵢ0, false)) {
            ᵢᵢ0.FLD2720.MTH801(8);
            ᵢᵢ0.FLD2724.MTH801(8);
            יᐧ0.MTH801(8);
        }
        if(!"custom".equalsIgnoreCase(s) && !s.startsWith("notif_")) {
            ﾞᵎ8.MTH801(8);
        }
        if(!"new_comment".equalsIgnoreCase(s)) {
            ﾞᵎ7.MTH801(8);
        }
        if(CLS502.MTH6943(s, new String[]{"new_comment", "comment_recall", "moments", "keyword", "sns_keyword"})) {
            ﾞᵎ6.MTH801(8);
        }
        if(!CLS1173.MTH4443() || !CLS182.MTH3480(0x38E9F8182B3CD335L, CLS182.MTH3483(s), ˎᵢ0, false) && !CLS182.MTH3480(4101081791400301365L, CLS182.MTH3483(s), ˎᵢ0, false)) {
            ᵢᵢ0.FLD2718.MTH801(8);
        }
        else {
            ᵢᵢ0.FLD2718.MTH801(0);
        }
        if(("custom".equalsIgnoreCase(s) || s.startsWith("notif_")) && Build.VERSION.SDK_INT >= 24) {
            CLS1635 ﾞᵎ12 = new CLS1635(activity0);
            StringBuilder stringBuilder12 = CLS182.MTH3487(4101082470005134133L, ﾞᵎ12, s);
            stringBuilder12.append("_oldstyle");
            ﾞᵎ12.MTH7437(ˎᵢ0.MTH938(stringBuilder12.toString(), false));
            ﾞᵎ12.MTH7438(new CLS203(ᵢᵢ0, s, 1));
            CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ12), true);
        }
        if(s.startsWith("notif_")) {
            String s5 = s.substring(s.indexOf("_") + 1).trim();
            if(CLS426.MTH6126(s5)) {
                CLS1635 ﾞᵎ13 = new CLS1635(activity0);
                ﾞᵎ13.MTH800(CLS27.MTH889("notif_chatroom_selected"));
                ﾞᵎ13.MTH7437(ˎᵢ0.MTH938(s + "_notif_chatroom_selected", false));
                ﾞᵎ13.MTH7438(new CLS203(ᵢᵢ0, s, 2));
                CLS1625 ـˏ0 = new CLS1625(activity0);
                ـˏ0.MTH800(CLS27.MTH889("select"));
                יᐧ3 = יᐧ0;
                v1 = v;
                ـˏ0.MTH7320(new CLS258(activity0, ᵢᵢ0, s, s5, 3));
                CLS1623 יᐧ4 = new CLS1623(activity0);
                יᐧ4.MTH7289(new Object[]{ﾞᵎ13, ـˏ0});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ4), v1);
            }
            else {
                יᐧ3 = יᐧ0;
                v1 = v;
            }
        }
        else {
            יᐧ3 = יᐧ0;
            v1 = v;
        }
        if(s.equals("moments")) {
            CLS1635 ﾞᵎ14 = new CLS1635(activity0);
            ﾞᵎ14.MTH800(CLS27.MTH889("notif_moments_selected"));
            ﾞᵎ14.MTH7437(ˎᵢ0.MTH938("notif_moments_selected", false));
            ﾞᵎ14.MTH7438(new CLS235(ᵢᵢ0, 1));
            CLS1625 ـˏ1 = new CLS1625(activity0);
            ـˏ1.MTH800(CLS27.MTH889("select"));
            ـˏ1.MTH7320(new CLS248(ᵢᵢ0, activity0, 0));
            CLS1623 יᐧ5 = new CLS1623(activity0);
            יᐧ5.MTH7289(new Object[]{ﾞᵎ14, ـˏ1});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ5), v1);
        }
        if(s.startsWith("custom")) {
            CLS1622 ˑٴ0 = new CLS1622(activity0);
            ˑٴ0.MTH800(CLS27.MTH889("keyword"));
            ˑٴ0.MTH798(CLS27.MTH889("fill_in_filter_keywords_separate_using"));
            ˑٴ0.MTH7277(ˎᵢ0.MTH925(s + "_keyword_excl_text", ""));
            ˑٴ0.FLD5252 = new CLS1113(ᵢᵢ0, s, 0);
            CLS1625 ـˏ2 = new CLS1625(activity0);
            ـˏ2.MTH800(CLS27.MTH889("add_keyword"));
            ـˏ2.MTH7320(new CLS257(ᵢᵢ0, activity0, ˑٴ0, s, 0));
            CLS1625 ـˏ3 = new CLS1625(activity0);
            ـˏ3.MTH800(CLS27.MTH889("config_exclude"));
            ـˏ3.MTH7320(new CLS227(ᵢᵢ0, activity0, s, 0));
            CLS1623 יᐧ6 = new CLS1623(activity0);
            יᐧ6.MTH800(CLS27.MTH889("keyword_excl_notif"));
            יᐧ6.MTH7289(new Object[]{ـˏ3, ـˏ2, ˑٴ0});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ6), v1);
        }
        if(s.startsWith("keyword")) {
            CLS1622 ˑٴ1 = new CLS1622(activity0);
            ˑٴ1.MTH800(CLS27.MTH889("keyword"));
            ˑٴ1.MTH798(CLS27.MTH889("fill_in_filter_keywords_separate_using"));
            ˑٴ1.MTH7277(ˎᵢ0.MTH925(s + "_notif_keyword_text", ""));
            ˑٴ1.FLD5252 = new CLS1113(ᵢᵢ0, s, 1);
            CLS1625 ـˏ4 = new CLS1625(activity0);
            ـˏ4.MTH800(CLS27.MTH889("add_keyword"));
            ـˏ4.MTH7320(new CLS257(ᵢᵢ0, activity0, ˑٴ1, s, 1));
            CLS1625 ـˏ5 = new CLS1625(activity0);
            ـˏ5.MTH800(CLS27.MTH889("config_exclude"));
            ـˏ5.MTH7320(new CLS227(ᵢᵢ0, activity0, s, 1));
            CLS1623 יᐧ7 = new CLS1623(activity0);
            יᐧ7.MTH7289(new Object[]{ـˏ5, ـˏ4, ˑٴ1});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ7), v1);
        }
        if(s.equals("sns_keyword")) {
            CLS1622 ˑٴ2 = new CLS1622(activity0);
            ˑٴ2.MTH7277(ˎᵢ0.MTH925(s + "_notif_keyword_text", ""));
            ˑٴ2.FLD5252 = new CLS1113(ᵢᵢ0, s, 2);
            CLS1625 ـˏ6 = new CLS1625(activity0);
            ـˏ6.MTH800(CLS27.MTH889("add_keyword"));
            ـˏ6.MTH7320(new CLS257(ᵢᵢ0, activity0, ˑٴ2, s, 2));
            CLS1625 ـˏ7 = new CLS1625(activity0);
            ـˏ7.MTH800(CLS27.MTH889("config_exclude"));
            ـˏ7.MTH7320(new CLS227(ᵢᵢ0, activity0, s, 2));
            CLS1623 יᐧ8 = new CLS1623(activity0);
            יᐧ8.MTH7289(new Object[]{ˑٴ2, ـˏ6, ـˏ7});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ8), v1);
        }
        ᐧﾞ0.getClass();
        if(CLS485.MTH6739(activity0, "wx_" + s)) {
            CLS1625 ـˏ8 = new CLS1625(activity0);
            ـˏ8.MTH800(CLS27.MTH889("config_notification"));
            ـˏ8.MTH7320(new CLS227(ᵢᵢ0, activity0, s, 3));
            CLS523.MTH7147(linearLayout0, ((CLS18)ـˏ8), true);
            ﾞᵎ15 = ﾞᵎ2;
            ﾞᵎ15.MTH801(8);
            ﾞᵎ16 = ﾞᵎ3;
            ﾞᵎ16.MTH801(8);
            ᵢᵢ0.FLD2719.MTH801(8);
            ᵢᵢ0.FLD2718.MTH801(8);
            ᵢᵢ0.FLD2724.MTH801(8);
            ᵢᵢ0.FLD2720.MTH801(8);
            יᐧ9 = יᐧ3;
            יᐧ9.MTH801(8);
        }
        else {
            ﾞᵎ15 = ﾞᵎ2;
            ﾞᵎ16 = ﾞᵎ3;
            יᐧ9 = יᐧ3;
        }
        if(CLS502.MTH6943(s, new String[]{"custom"}) && CLS485.MTH6739(activity0, "wx_custom_chatroom")) {
            CLS1625 ـˏ9 = new CLS1625(activity0);
            ـˏ9.MTH800(CLS27.MTH889("config_notification") + " (" + CLS27.MTH889("chat_group_notif") + ")");
            ـˏ9.MTH7320(new CLS248(ᵢᵢ0, activity0, 1));
            CLS523.MTH7147(linearLayout0, ((CLS18)ـˏ9), true);
        }
        if(CLS485.MTH6739(activity0, "wx_" + s) || CLS502.MTH6943(s, new String[]{"custom"}) && CLS485.MTH6739(activity0, "wx_custom_chatroom")) {
            CLS1625 ـˏ10 = new CLS1625(activity0);
            ـˏ10.MTH800(CLS27.MTH889("reset_notification_channel"));
            ـˏ10.MTH7320(new CLS252(ᵢᵢ0, s, activity0, ﾞᵎ15, ﾞᵎ16, יᐧ9, 0));
            CLS523.MTH7147(linearLayout0, ((CLS18)ـˏ10), true);
        }
    }
}

