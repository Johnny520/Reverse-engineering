// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.widget.LinearLayout;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS568;
import b.ˈˈ.CLS69;
import b.ˑٴ.CLS796;
import b.ᵔʾ.CLS1255;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1538;
import b.ⁱᵔ.CLS1583;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS480;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS508;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;
import b.ﾞˎ.CLS534.CLS533;
import java.util.ArrayList;

public final class CLS1106 implements CLS17, CLS533 {
    public final Object FLD2422;
    public final Object FLD2423;
    public final Object FLD2424;
    public final CLS1622 FLD2425;
    public final Object FLD2426;
    public final CLS1635 FLD2427;
    public final CLS1622 FLD2428;
    public final Object FLD2429;
    public final CLS1622 FLD2430;
    public final CLS1625 FLD2431;
    public final String FLD2432;
    public final String FLD2433;

    public CLS1106(CLS1030 ˎᵢ0, CLS69 ʾᵢ0, String s, CLS1622 ˑٴ0, CLS1622 ˑٴ1, CLS1625 ـˏ0, CLS1635 ﾞᵎ0, CLS1623 יᐧ0, CLS1621 ˎᵢ1, CLS1621 ˎᵢ2, CLS1622 ˑٴ2, String s1) {
        this.FLD2423 = ˎᵢ0;
        this.FLD2424 = ʾᵢ0;
        this.FLD2433 = s;
        this.FLD2425 = ˑٴ0;
        this.FLD2430 = ˑٴ1;
        this.FLD2431 = ـˏ0;
        this.FLD2427 = ﾞᵎ0;
        this.FLD2422 = יᐧ0;
        this.FLD2426 = ˎᵢ1;
        this.FLD2429 = ˎᵢ2;
        this.FLD2428 = ˑٴ2;
        this.FLD2432 = s1;
    }

    public CLS1106(CLS1622 ˑٴ0, CLS1622 ˑٴ1, CLS1622 ˑٴ2, CLS1625 ـˏ0, Activity activity0, CLS1635 ﾞᵎ0, String s, int[] arr_v, ArrayList arrayList0, String s1, ArrayList arrayList1, ArrayList arrayList2) {
        this.FLD2425 = ˑٴ0;
        this.FLD2430 = ˑٴ1;
        this.FLD2428 = ˑٴ2;
        this.FLD2431 = ـˏ0;
        this.FLD2423 = activity0;
        this.FLD2427 = ﾞᵎ0;
        this.FLD2433 = s;
        this.FLD2424 = arr_v;
        this.FLD2422 = arrayList0;
        this.FLD2432 = s1;
        this.FLD2426 = arrayList1;
        this.FLD2429 = arrayList2;
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS534$CLS533
    public final void MTH7225(int v, String s) {
        int v2;
        int v1;
        CLS1623 יᐧ0 = (CLS1623)this.FLD2422;
        CLS1621 ˎᵢ0 = (CLS1621)this.FLD2426;
        CLS1621 ˎᵢ1 = (CLS1621)this.FLD2429;
        ((CLS1030)this.FLD2423).getClass();
        String s1 = (String)((CLS69)this.FLD2424).MTH1565(s);
        String s2 = CLS34.MTH1074(new StringBuilder(), this.FLD2433, 0x38E9AA032B3CD335L);
        CLS29 ˎᵢ2 = ((CLS1030)this.FLD2423).FLD2151;
        ˎᵢ2.MTH922(s1, s2);
        switch(s1) {
            case "chatgpt_for_bot": {
                v1 = 6;
                break;
            }
            case "ibot_cloud": {
                v1 = 1;
                break;
            }
            case "mly_bot": {
                v1 = 2;
                break;
            }
            case "openai": {
                v1 = 4;
                break;
            }
            case "turing_robot": {
                v1 = 0;
                break;
            }
            case "weixin_aibot": {
                v1 = 3;
                break;
            }
            case "welm": {
                v1 = 5;
                break;
            }
            default: {
                v1 = -1;
            }
        }
        CLS1622 ˑٴ0 = this.FLD2425;
        CLS1622 ˑٴ1 = this.FLD2430;
        CLS1625 ـˏ0 = this.FLD2431;
        CLS1635 ﾞᵎ0 = this.FLD2427;
        CLS1622 ˑٴ2 = this.FLD2428;
        switch(v1) {
            case 0: {
                ˑٴ0.MTH801(0);
                ˑٴ0.MTH800(CLS27.MTH882("apikey"));
                ˑٴ0.MTH7277(ˎᵢ2.MTH925("tulingAPI", ""));
                ˑٴ1.MTH7277(ˎᵢ2.MTH925("tulingSecret", ""));
                ـˏ0.MTH798("");
                ـˏ0.MTH800(CLS27.MTH889("turing_robot_url"));
                ﾞᵎ0.MTH801(8);
                ˑٴ1.MTH801(0);
                יᐧ0.MTH801(8);
                ˎᵢ0.MTH7268(((long)ˎᵢ2.MTH927(15000, "tuling_connection_timeout")));
                v2 = ˎᵢ2.MTH927(15000, CLS370.MTH5289(4100996570659214133L));
                break;
            }
            case 1: {
                ˑٴ0.MTH801(0);
                ˑٴ0.MTH800(CLS27.MTH882("apikey"));
                ˑٴ0.MTH7277(ˎᵢ2.MTH925("ibotAPI", ""));
                ˑٴ1.MTH7277(ˎᵢ2.MTH925("ibotSecret", ""));
                ـˏ0.MTH798("");
                ـˏ0.MTH800(CLS27.MTH882("ibot_cloud_url"));
                ﾞᵎ0.MTH801(8);
                ˑٴ1.MTH801(0);
                יᐧ0.MTH801(8);
                ˎᵢ0.MTH7268(((long)ˎᵢ2.MTH927(15000, "ibot_connection_timeout")));
                v2 = ˎᵢ2.MTH927(15000, CLS370.MTH5289(4100997498372150069L));
                break;
            }
            case 2: {
                ˑٴ0.MTH801(0);
                ˑٴ0.MTH800(CLS27.MTH882("apikey"));
                ˑٴ0.MTH7277(ˎᵢ2.MTH925("mlyAPI", ""));
                ˑٴ1.MTH7277(ˎᵢ2.MTH925("mlySecret", ""));
                ـˏ0.MTH798("");
                ـˏ0.MTH800(CLS27.MTH882("mly_web_url"));
                ﾞᵎ0.MTH801(0);
                ˑٴ1.MTH801(0);
                יᐧ0.MTH801(8);
                ˎᵢ0.MTH7268(((long)ˎᵢ2.MTH927(30000, "mly_connection_timeout")));
                v2 = ˎᵢ2.MTH927(30000, "mly_read_timeout");
                break;
            }
            case 3: {
                ˑٴ0.MTH801(0);
                ˑٴ0.MTH7277(ˎᵢ2.MTH925("weixinbotTOKEN", ""));
                ˑٴ0.MTH800("TOKEN");
                ˑٴ1.MTH7277("");
                ـˏ0.MTH798("");
                ـˏ0.MTH800(CLS27.MTH882("weixin_aibot_web_desc"));
                ﾞᵎ0.MTH801(8);
                ˑٴ1.MTH801(8);
                יᐧ0.MTH801(8);
                ˎᵢ0.MTH7268(((long)ˎᵢ2.MTH927(15000, "weixinbot_connection_timeout")));
                v2 = ˎᵢ2.MTH927(15000, CLS370.MTH5289(4100997687350711093L));
                break;
            }
            case 4: {
                ˑٴ0.MTH801(0);
                ˑٴ0.MTH7277(ˎᵢ2.MTH925("openaiAPI", ""));
                ˑٴ0.MTH800(CLS27.MTH882("apikey"));
                ˑٴ1.MTH7277("");
                ـˏ0.MTH798(CLS27.MTH882("openai_web_desc"));
                ـˏ0.MTH800(CLS27.MTH882("openai_web_url"));
                ﾞᵎ0.MTH801(8);
                ˑٴ1.MTH801(8);
                יᐧ0.MTH801(0);
                ˎᵢ0.MTH7268(((long)ˎᵢ2.MTH927(30000, "openai_connection_timeout")));
                ˎᵢ1.MTH7268(((long)ˎᵢ2.MTH927(30000, "openai_read_timeout")));
                ˑٴ2.MTH801(8);
                CLS1255 ᵢﹶ0 = new CLS1255(this.FLD2432, ـˏ0, 29);
                CLS40.FLD157.MTH1124(((CLS39)ᵢﹶ0));
                return;
            }
            case 5: {
                ˑٴ0.MTH801(0);
                ˑٴ0.MTH7277(ˎᵢ2.MTH925("welmAPI", ""));
                ˑٴ0.MTH800(CLS27.MTH882("apikey"));
                ˑٴ1.MTH7277("");
                ـˏ0.MTH798("");
                ـˏ0.MTH800(CLS27.MTH882("welm_web_url"));
                ﾞᵎ0.MTH801(8);
                ˑٴ1.MTH801(8);
                יᐧ0.MTH801(8);
                ˎᵢ0.MTH7268(((long)ˎᵢ2.MTH927(15000, "welm_connection_timeout")));
                v2 = ˎᵢ2.MTH927(15000, CLS370.MTH5289(4100994586384323381L));
                break;
            }
            case 6: {
                ˑٴ2.MTH801(0);
                ˑٴ0.MTH801(8);
                ـˏ0.MTH798("");
                ـˏ0.MTH800(CLS27.MTH882("chatgpt_for_bot_web_url"));
                ﾞᵎ0.MTH801(8);
                ˑٴ1.MTH801(8);
                יᐧ0.MTH801(8);
                ˎᵢ0.MTH7268(((long)ˎᵢ2.MTH927(15000, "chatgpt_for_bot_connection_timeout")));
                ˎᵢ1.MTH7268(((long)ˎᵢ2.MTH927(15000, "chatgpt_for_bot_read_timeout")));
                return;
            }
            default: {
                return;
            }
        }
        ˎᵢ1.MTH7268(((long)v2));
        ˑٴ2.MTH801(8);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        CLS1635 ﾞᵎ1;
        Activity activity0 = (Activity)this.FLD2423;
        int[] arr_v = (int[])this.FLD2424;
        ArrayList arrayList0 = (ArrayList)this.FLD2422;
        String s = this.FLD2432;
        ArrayList arrayList1 = (ArrayList)this.FLD2426;
        ArrayList arrayList2 = (ArrayList)this.FLD2429;
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        String s1 = CLS27.MTH889("content");
        CLS1622 ˑٴ0 = this.FLD2425;
        ˑٴ0.MTH800(s1);
        String s2 = CLS27.MTH889("external_vid_url");
        CLS1622 ˑٴ1 = this.FLD2430;
        ˑٴ1.MTH800(s2);
        String s3 = CLS27.MTH889("external_thumb_url");
        CLS1622 ˑٴ2 = this.FLD2428;
        ˑٴ2.MTH800(s3);
        String s4 = CLS27.MTH889("extract_url");
        CLS1625 ـˏ0 = this.FLD2431;
        ـˏ0.MTH800(s4);
        ˑٴ2.FLD5252 = new CLS796(activity0, 4);
        String s5 = CLS27.MTH895().MTH925("sns_external_temp_vid", "");
        if(!TextUtils.isEmpty(s5)) {
            ˑٴ1.MTH7277(s5);
        }
        String s6 = CLS27.MTH895().MTH925("sns_external_temp_thumb", "");
        if(!TextUtils.isEmpty(s6)) {
            ˑٴ2.MTH7277(s6);
        }
        String s7 = CLS27.MTH895().MTH925("sns_external_temp_content", "");
        if(!TextUtils.isEmpty(s7)) {
            ˑٴ0.MTH7277(s7);
        }
        boolean z = CLS27.MTH895().MTH938("sns_external_temp_sendurl", false);
        CLS1635 ﾞᵎ0 = this.FLD2427;
        ﾞᵎ0.MTH7437(z);
        CLS500 ᵢﹶ0 = CLS500.FLD4928;
        if(ᵢﹶ0.MTH6895("moments_signatures")) {
            CLS525 ʻˑ0 = new CLS525(activity0, linearLayout0, menu0);
            ﾞᵎ1 = ﾞᵎ0;
            ʻˑ0.MTH7187("moment_signature", ((CLS3)new CLS1583(activity0, s7, ˑٴ0, 1)));
            ʻˑ0.MTH7188();
        }
        else {
            ﾞᵎ1 = ﾞᵎ0;
        }
        CLS523.MTH7147(linearLayout0, ((CLS18)ˑٴ0), true);
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH7289(new Object[]{ˑٴ1, ˑٴ2});
        יᐧ0.MTH7290(linearLayout0, CLS523.MTH7137(10));
        if(CLS21.FLD76.MTH830("has_vid_url_parser", new Object[0])) {
            CLS568 יᐧ1 = new CLS568(ˑٴ1, ˑٴ2, 20);
            CLS1623 יᐧ2 = new CLS1623(activity0);
            ـˏ0.MTH7320(new CLS480(activity0, יᐧ1, 4));
            יᐧ2.MTH7296(ـˏ0);
            יᐧ2.MTH7290(linearLayout0, CLS523.MTH7137(10));
            String s8 = this.FLD2433;
            if(!TextUtils.isEmpty(s8)) {
                CLS432.MTH6180(activity0, ((CLS12)יᐧ1), s8);
            }
        }
        CLS1623 יᐧ3 = new CLS1623(activity0);
        CLS1625 ـˏ1 = new CLS1625(activity0);
        ـˏ1.MTH800(CLS27.MTH889("forward_to_friends"));
        ـˏ1.MTH7320(new CLS263(ˑٴ1, activity0, 1));
        יᐧ3.MTH7296(ـˏ1);
        if(ᵢﹶ0.MTH6895("extract_vid_audio")) {
            CLS1625 ـˏ2 = new CLS1625(activity0);
            ـˏ2.MTH800(CLS27.MTH889("send_vid_audio"));
            ـˏ2.MTH7320(new CLS263(ˑٴ1, activity0, 2));
            יᐧ3.MTH7296(ـˏ2);
        }
        יᐧ3.MTH7290(linearLayout0, CLS523.MTH7137(10));
        CLS1623 יᐧ4 = new CLS1623(activity0);
        CLS1629 ⁱˉ0 = new CLS1629(activity0);
        CLS1625 ـˏ3 = new CLS1625(activity0);
        ⁱˉ0.MTH7381("public");
        ⁱˉ0.MTH7375("public");
        ⁱˉ0.MTH7381("private");
        ⁱˉ0.MTH7381("only_selected");
        ⁱˉ0.MTH7381("not_show_selected");
        ⁱˉ0.FLD5356 = new CLS1538(arr_v, ـˏ3, 1);
        ـˏ3.MTH800(CLS27.MTH889("select"));
        ـˏ3.MTH7320(new CLS508(arrayList0, s, activity0, arrayList1, 4));
        ـˏ3.MTH801(8);
        יᐧ4.MTH7296(ـˏ3);
        יᐧ4.MTH7296(ⁱˉ0);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ4), CLS523.MTH7137(10));
        if(ᵢﹶ0.MTH6895("remove_mention_limit") && CLS27.MTH895().MTH938("remove_mention_limit_enable", false)) {
            CLS1623 יᐧ5 = new CLS1623(activity0);
            CLS1625 ـˏ4 = new CLS1625(activity0);
            ـˏ4.MTH800(CLS27.MTH889("select_mentions"));
            ـˏ4.MTH7320(new CLS508(arrayList0, s, activity0, arrayList2, 5));
            יᐧ5.MTH7296(ـˏ4);
            יᐧ5.MTH7290(linearLayout0, CLS523.MTH7137(10));
        }
        CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ1), true);
    }
}

