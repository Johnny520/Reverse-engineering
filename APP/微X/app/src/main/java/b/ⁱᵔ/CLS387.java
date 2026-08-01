// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentValues;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS580;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS78;
import b.ˑٴ.CLS751;
import b.ˑٴ.CLS766;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS1049;
import b.ᐧˉ.CLS1156;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS197;
import b.ᐧˉ.CLS267;
import b.ᵔʾ.CLS1225;
import b.ᵔʾ.CLS1259;
import b.ᵔʾ.CLS279;
import b.ᵔʾ.CLS288;
import b.ᵔʾ.CLS295;
import b.ⁱʾ.CLS338;
import b.ⁱʾ.CLS363;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import b.ⁱˉ.CLS370;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS530;
import b.ﾞˎ.CLS534.CLS533;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS387 {
    public static AlertDialog FLD3648;
    public static AlertDialog FLD3649;
    public static AlertDialog FLD3650;
    public static AlertDialog FLD3651;
    public static AlertDialog FLD3652;

    // 此方法包含解密的字符串
    public static void MTH5584(boolean z, Activity activity0, ArrayList arrayList0, CLS2 ˆʿ0, String s, String s1, int v, CLS1624 יﹳ0, CLS363 ﾞٴ0) {
        int v2;
        CLS500 ᵢﹶ1;
        String s7;
        CLS1620 ˊˏ1;
        if(arrayList0.isEmpty()) {
            return;
        }
        ﾞٴ0.FLD3440 = v;
        CLS500 ᵢﹶ0 = CLS500.FLD4928;
        CLS29 ˎᵢ0 = CLS27.MTH895();
        CLS21 ʾᵢ0 = CLS21.FLD76;
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.FLD5259 = false;
        יᐧ0.FLD5261 = true;
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        ـﹳ0.MTH800(CLS27.MTH889("selected"));
        ـﹳ0.FLD5295 = false;
        ـﹳ0.FLD5301 = true;
        CLS371 ʻ0 = CLS371.FLD3470;
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for(Object object0: arrayList0) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(CLS426.MTH6126("")) {
                arrayList1.add(ˊﾞ0);
            }
            else if(CLS372.MTH5400("")) {
                arrayList3.add(ˊﾞ0);
            }
            else {
                arrayList2.add(ˊﾞ0);
            }
        }
        CLS1620 ˊˏ0 = new CLS1620(activity0);
        ˊˏ0.FLD5220 = true;
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(CLS27.MTH889("tags"));
        HashMap hashMap0 = new HashMap();
        if(!arrayList2.isEmpty()) {
            for(Object object1: ʻ0.MTH5373()) {
                arrayList4.add(((String)object1));
                hashMap0.put(((String)object1), ((String)object1));
            }
        }
        if(arrayList1.isEmpty()) {
            ˊˏ1 = ˊˏ0;
        }
        else {
            ˊˏ1 = ˊˏ0;
            String s2 = "[" + CLS27.MTH889("chatroom_tags") + "] ";
            ArrayList arrayList5 = (ArrayList)ʾᵢ0.MTH836("getChatroomTags", new Object[0]);
            if(arrayList5 != null && !arrayList5.isEmpty()) {
                for(Object object2: arrayList5) {
                    String s3 = s2 + ((String)object2);
                    arrayList4.add(s3);
                    hashMap0.put(s3, ((String)object2));
                }
            }
        }
        if(ˎᵢ0.MTH938("chatcontainer_enable", false)) {
            String s4 = ʾᵢ0.MTH826("getChatroomContainers", new Object[0]);
            if(!TextUtils.isEmpty(s4)) {
                String s5 = "{" + CLS27.MTH889("chatcontainer") + "} ";
                String[] arr_s = CLS502.MTH6941(s4);
                int v1 = 0;
                while(v1 < arr_s.length) {
                    String s6 = arr_s[v1];
                    if(s6.startsWith("wx__c_")) {
                        StringBuilder stringBuilder0 = CLS182.MTH3483(s5);
                        s7 = s5;
                        ᵢﹶ1 = ᵢﹶ0;
                        stringBuilder0.append(ʾᵢ0.MTH826("getContainerName", new Object[]{s6}));
                        String s8 = stringBuilder0.toString();
                        arrayList4.add(s8);
                        hashMap0.put(s8, s6);
                    }
                    else {
                        s7 = s5;
                        ᵢﹶ1 = ᵢﹶ0;
                    }
                    ++v1;
                    ᵢﹶ0 = ᵢﹶ1;
                    s5 = s7;
                }
            }
        }
        ˊˏ1.MTH7248(((CLS533)new CLS766(arrayList4, hashMap0, ﾞٴ0, ʻ0, ـﹳ0)));
        ˊˏ1.MTH7247(arrayList4);
        CLS1629 ⁱˉ0 = new CLS1629(activity0);
        ⁱˉ0.FLD5360 = true;
        ⁱˉ0.MTH7381("radio_public_account");
        if(arrayList3.isEmpty()) {
            ⁱˉ0.MTH7378("radio_public_account");
            v2 = 2;
        }
        else {
            v2 = 3;
        }
        ⁱˉ0.MTH7381("radio_friends");
        if(arrayList2.isEmpty()) {
            --v2;
            ⁱˉ0.MTH7378("radio_friends");
        }
        ⁱˉ0.MTH7381("radio_chatrooms");
        if(arrayList1.isEmpty()) {
            --v2;
            ⁱˉ0.MTH7378("radio_chatrooms");
        }
        if(v2 > 1) {
            ⁱˉ0.MTH7381("radio_all");
            ⁱˉ0.MTH7375("radio_all");
        }
        ⁱˉ0.FLD5356 = new CLS580(ﾞٴ0, arrayList3, ˊˏ1, arrayList2, arrayList1, arrayList0);
        if(v2 > 1) {
            יᐧ0.MTH7296(ⁱˉ0);
        }
        else {
            ﾞٴ0.MTH5264(arrayList0);
        }
        CLS1289 ʼﹳ0 = new CLS1289(יﹳ0, ﾞٴ0, activity0, ـﹳ0, v, יᐧ0, ˊˏ1, s1, arrayList0);
        CLS580 ʻᵎ0 = new CLS580(ﾞٴ0, ـﹳ0, activity0, arrayList2, ʻ0, ᵢﹶ0);
        CLS1646 ʿˆ0 = new CLS1646(ﾞٴ0, ˆʿ0);
        CLS523.MTH7156(z, activity0, CLS27.MTH889("select"), ((CLS379)ʼﹳ0), ((CLS378)ʻᵎ0), ((CLS11)ʿˆ0), s);
    }

    public static void MTH5585(boolean z, Activity activity0, ArrayList arrayList0, CLS2 ˆʿ0, String s, int v) {
        CLS387.MTH5586(z, activity0, arrayList0, ˆʿ0, null, s, v);
    }

    public static void MTH5586(boolean z, Activity activity0, ArrayList arrayList0, CLS2 ˆʿ0, String s, String s1, int v) {
        if(arrayList0.isEmpty()) {
            return;
        }
        CLS1624 יﹳ0 = new CLS1624(activity0);
        יﹳ0.FLD5272.setChoiceMode(2);
        CLS387.MTH5584(z, activity0, arrayList0, ˆʿ0, s, s1, v, יﹳ0, new CLS363(activity0, arrayList0, יﹳ0));
    }

    // 此方法包含解密的字符串
    public static void MTH5587(Activity activity0, LinearLayout linearLayout0) {
        public final class CLS1309 implements CLS8 {
            public final CLS69 FLD3619;

            public CLS1309(CLS69 ʾᵢ0) {
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: ((ArrayList)object0)) {
                    arrayList0.add(((String)this.FLD3619.MTH1565(((String)object1))));
                }
                CLS27.MTH895().MTH922(TextUtils.join(",", arrayList0), "friendreq_cycle_types");
            }
        }


        public final class CLS1320 implements CLS2 {
            public final Activity FLD3640;
            public final CLS1625 FLD3641;

            public CLS1320(Activity activity0, CLS1625 ـˏ0) {
                this.FLD3641 = ـˏ0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                ArrayList arrayList1 = new ArrayList();
                CLS371.FLD3470.MTH5349(s, arrayList1);
                CLS1585 ⁱⁱ0 = new CLS1585(this, s);
                CLS387.MTH5600(false, this.FLD3640, arrayList1, ((CLS2)ⁱⁱ0));
            }
        }

        int v = CLS523.MTH7137(10);
        CLS1623 יᐧ0 = new CLS1623(activity0);
        if(CLS27.MTH902("contacts_order_type")) {
            CLS1629 ⁱˉ0 = new CLS1629(activity0);
            ⁱˉ0.MTH7381("radio_order_up");
            ⁱˉ0.MTH7381("radio_order_down");
            ⁱˉ0.MTH7381("random");
            switch(CLS27.MTH895().MTH927(0, "friendreq_order")) {
                case 0: {
                    ⁱˉ0.MTH7375(CLS370.MTH5289(0x38E9031F2B3CD335L));
                    break;
                }
                case 1: {
                    ⁱˉ0.MTH7375(CLS370.MTH5289(0x38E9032E2B3CD335L));
                    break;
                }
                case 2: {
                    ⁱˉ0.MTH7375(CLS370.MTH5289(4100812505540776757L));
                }
            }
            ⁱˉ0.FLD5356 = new CLS1225(26);
            יᐧ0.MTH7296(ⁱˉ0);
        }
        CLS1621 ˎᵢ0 = new CLS1621(activity0);
        ˎᵢ0.MTH800(CLS27.MTH889("delay"));
        ˎᵢ0.MTH7268(((long)CLS412.MTH6005(25000, "friend_request_delay")));
        ˎᵢ0.FLD5242 = new CLS1511(1);
        יᐧ0.MTH7296(ˎᵢ0);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
        CLS1623 יᐧ1 = new CLS1623(activity0);
        CLS1635 ﾞᵎ0 = new CLS1635(activity0);
        CLS1635 ﾞᵎ1 = new CLS1635(activity0);
        ﾞᵎ1.MTH7437(CLS27.MTH895().MTH938("friendreq_limit_auto_resume", false));
        ﾞᵎ1.MTH800(CLS27.MTH889("friendreq_limit_auto_resume"));
        ﾞᵎ1.MTH7438(new CLS376(3));
        יᐧ1.MTH7296(ﾞᵎ1);
        CLS1621 ˎᵢ1 = new CLS1621(activity0);
        ˎᵢ1.MTH800(CLS27.MTH889("friendreq_limit_auto_resume_delay"));
        ˎᵢ1.MTH7268(((long)CLS412.MTH6005(3900000, "friendreq_limit_auto_resume_delay")));
        ˎᵢ1.FLD5242 = new CLS1511(2);
        יᐧ1.MTH7296(ˎᵢ1);
        ﾞᵎ0.MTH7437(CLS27.MTH895().MTH938("friendreq_auto_cycle_type", false));
        ﾞᵎ0.MTH800(CLS27.MTH889("friendreq_auto_cycle_type"));
        ﾞᵎ0.MTH7438(new CLS376(4));
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ـˏ0.MTH800(CLS27.MTH889("set_friendreq_auto_cycle_type"));
        ـˏ0.MTH7320(new CLS413(activity0, 0));
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        ˑٴ0.MTH7278(2);
        ˑٴ0.MTH800(CLS27.MTH889("friendreq_auto_cycle_max"));
        ˑٴ0.MTH7277(String.valueOf(CLS412.MTH6005(20, "friendreq_auto_cycle_max")));
        ˑٴ0.FLD5252 = new CLS1511(3);
        CLS500 ᵢﹶ0 = CLS500.FLD4928;
        if(ᵢﹶ0.MTH6895("friend_request_type")) {
            יᐧ1.MTH7296(ﾞᵎ0);
            יᐧ1.MTH7296(ـˏ0);
            if(CLS412.MTH6002()) {
                יᐧ1.MTH7296(ˑٴ0);
            }
        }
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        if(ᵢﹶ0.MTH6895("friendreq_limit_bypass")) {
            CLS1623 יᐧ2 = new CLS1623(activity0);
            CLS1635 ﾞᵎ2 = new CLS1635(activity0);
            ﾞᵎ2.MTH7437(CLS27.MTH895().MTH938("friendreq_limit_auto_bypass", false));
            ﾞᵎ2.MTH800(CLS27.MTH889("friendreq_limit_auto_bypass"));
            ﾞᵎ2.MTH7438(new CLS376(5));
            יᐧ2.MTH7296(ﾞᵎ2);
            if(ᵢﹶ0.MTH6895("friendreq_limit_bypass_manual")) {
                CLS1635 ﾞᵎ3 = new CLS1635(activity0);
                ﾞᵎ3.MTH7437(CLS27.MTH895().MTH938("manual_select_blocked_contact_enable", false));
                ﾞᵎ3.MTH800(CLS27.MTH889("manual_select_blocked_contact_enable"));
                ﾞᵎ3.MTH7438(new CLS376(6));
                CLS1625 ـˏ1 = CLS34.MTH1082(יᐧ2, ﾞᵎ3, activity0);
                ـˏ1.MTH800(CLS27.MTH889("select_blocked_contact"));
                ـˏ1.MTH7320(new CLS530(16, activity0, ـˏ1));
                String s = CLS27.MTH895().MTH925("friendreq_limit_hack_fixed", "");
                if(!TextUtils.isEmpty(s)) {
                    String[] arr_s = s.split(",");
                    try {
                        String s1 = arr_s[1];
                        String s2 = arr_s[2];
                        ـˏ1.MTH798(CLS371.FLD3470.MTH5316(s1) + ": " + s2);
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                יᐧ2.MTH7296(ـˏ1);
            }
            CLS1621 ˎᵢ2 = new CLS1621(activity0);
            ˎᵢ2.MTH800(CLS27.MTH889("delay"));
            ˎᵢ2.MTH7268(((long)CLS27.MTH895().MTH927(0, "friend_request_limitbypass_delay")));
            ˎᵢ2.FLD5242 = new CLS1225(27);
            יᐧ2.MTH7296(ˎᵢ2);
            CLS1622 ˑٴ1 = new CLS1622(activity0);
            ˑٴ1.MTH800(CLS27.MTH889("number_of_send_attempts"));
            ˑٴ1.MTH7278(2);
            ˑٴ1.MTH7277(String.valueOf(CLS412.MTH6005(50, "friendreq_limit_auto_bypass_attempts")));
            ˑٴ1.FLD5252 = new CLS1225(28);
            CLS1622 ˑٴ2 = CLS34.MTH1069(יᐧ2, ˑٴ1, activity0);
            ˑٴ2.MTH800(CLS27.MTH889("friendreq_max_break"));
            ˑٴ2.MTH7278(2);
            ˑٴ2.MTH7277(String.valueOf(CLS27.MTH895().MTH927(0, "friendreq_max_break")));
            ˑٴ2.FLD5252 = new CLS1225(29);
            יᐧ2.MTH7296(ˑٴ2);
            CLS1621 ˎᵢ3 = new CLS1621(activity0);
            ˎᵢ3.MTH800(CLS27.MTH889("friendreq_max_break_delay"));
            ˎᵢ3.MTH7268(((long)CLS412.MTH6005(1800000, "friendreq_max_break_delay")));
            ˎᵢ3.FLD5242 = new CLS1511(0);
            יᐧ2.MTH7296(ˎᵢ3);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
        }
        CLS1623 יᐧ3 = new CLS1623(activity0);
        CLS1635 ﾞᵎ4 = new CLS1635(activity0);
        CLS1635 ﾞᵎ5 = new CLS1635(activity0);
        CLS1629 ⁱˉ1 = new CLS1629(activity0);
        ⁱˉ1.MTH7381("friendreq_permission_moments");
        ⁱˉ1.MTH7381("friendreq_permission_chatonly");
        ⁱˉ1.FLD5356 = new CLS1156(ﾞᵎ4, ﾞᵎ5, 29);
        CLS1471 ˑˋ0 = new CLS1471(ﾞᵎ4, ﾞᵎ5, 4);
        ﾞᵎ4.MTH800(CLS27.MTH889("hide_my_posts"));
        ﾞᵎ4.MTH7438(new CLS197(((CLS3)ˑˋ0), 2));
        ﾞᵎ5.MTH800(CLS27.MTH889("hide_his_posts"));
        ﾞᵎ5.MTH7438(new CLS197(((CLS3)ˑˋ0), 3));
        int v1 = CLS27.MTH895().MTH927(0, "friendreq_permission_type");
        int v2 = CLS27.MTH895().MTH927(0, "friendreq_history_type");
        ⁱˉ1.MTH7375(CLS370.MTH5289((v1 == 0 ? 4100825072615084853L : 0x38E90F4A2B3CD335L)));
        if(v2 == 1) {
            ﾞᵎ4.MTH7437(true);
        }
        else {
            switch(v2) {
                case 2: {
                    ﾞᵎ5.MTH7437(true);
                    break;
                }
                case 3: {
                    ﾞᵎ5.MTH7437(true);
                    ﾞᵎ5.MTH7437(true);
                }
            }
        }
        יᐧ3.MTH7289(new Object[]{ⁱˉ1, ﾞᵎ4, ﾞᵎ5});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ3), v);
        CLS1623 יᐧ4 = new CLS1623(activity0);
        CLS1635 ﾞᵎ6 = new CLS1635(activity0);
        ﾞᵎ6.MTH7437(CLS27.MTH895().MTH938("chatroom_friend_req_no_verify_only", false));
        ﾞᵎ6.MTH800(CLS27.MTH889("chatroom_friendreq_noverify"));
        ﾞᵎ6.MTH7438(new CLS376(0));
        יᐧ4.MTH7296(ﾞᵎ6);
        CLS1635 ﾞᵎ7 = new CLS1635(activity0);
        ﾞᵎ7.MTH7437(CLS27.MTH895().MTH938("chatroom_friend_req_no_verify_priority", false));
        ﾞᵎ7.MTH800(CLS27.MTH889("chatroom_friend_req_no_verify_priority"));
        ﾞᵎ7.MTH7438(new CLS376(1));
        CLS1625 ـˏ2 = CLS34.MTH1082(יᐧ4, ﾞᵎ7, activity0);
        ـˏ2.MTH800(CLS27.MTH889("introduction_text"));
        ـˏ2.MTH7320(new CLS267(22));
        יᐧ4.MTH7296(ـˏ2);
        יᐧ4.MTH7290(linearLayout0, v);
        CLS1623 יᐧ5 = new CLS1623(activity0);
        CLS1635 ﾞᵎ8 = new CLS1635(activity0);
        ﾞᵎ8.MTH7437(CLS27.MTH895().MTH938("friendreq_remember_history", false));
        ﾞᵎ8.MTH800(CLS27.MTH889("friendreq_remember_history"));
        ﾞᵎ8.MTH7438(new CLS376(2));
        CLS1625 ـˏ3 = CLS34.MTH1082(יᐧ5, ﾞᵎ8, activity0);
        ـˏ3.MTH800(CLS27.MTH889("clear_history"));
        ـˏ3.MTH7320(new CLS267(23));
        יᐧ5.MTH7296(ـˏ3);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ5), v);
    }

    // 此方法包含解密的字符串
    public static void MTH5588(Activity activity0, CLS12 ᵔʾ0, String s) {
        String s1 = CLS27.MTH889("contact_tags");
        CLS369 ﾞᵎ0 = new CLS369(activity0, CLS371.FLD3470.MTH5373());
        String[] arr_s = {""};
        if(!TextUtils.isEmpty(s)) {
            arr_s[0] = s;
            ﾞᵎ0.FLD3463 = s;
        }
        CLS523.MTH7160(activity0, s1, ((CLS17)new CLS1387(activity0, ﾞᵎ0, arr_s, 2)), ((CLS11)new CLS1429(ᵔʾ0, arr_s)));
    }

    public static void MTH5589(Activity activity0, CLS8 ـˏ0, String s, ArrayList arrayList0) {
        CLS1624 יﹳ0 = new CLS1624(activity0);
        CLS338 יᐧ0 = new CLS338(activity0, arrayList0, יﹳ0);
        CLS523.MTH7160(activity0, s, ((CLS17)new CLS1506(arrayList0, activity0, יᐧ0, יﹳ0, 4)), ((CLS11)new CLS1488(יᐧ0, ـˏ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5590(Activity activity0, ArrayList arrayList0, CLS2 ˆʿ0, String s, CLS1259 ⁱᵔ0) {
        if(!arrayList0.isEmpty()) {
            CLS366 ﾞᐧ0 = new CLS366(activity0, arrayList0);
            ﾞᐧ0.FLD3457 = s;
            Dialog[] arr_dialog = {null};
            arr_dialog[0] = CLS523.MTH7156(true, activity0, CLS27.MTH889("select"), ((CLS379)new CLS1588(activity0, ﾞᐧ0, arrayList0, arr_dialog, new int[]{-1}, ˆʿ0)), ((CLS378)new CLS1049(ⁱᵔ0, activity0, ﾞᐧ0, 29)), ((CLS11)new CLS1651(ˆʿ0)), null);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH5591(Activity activity0, String s) {
        public final class CLS1297 implements CLS11 {
            public final CLS1622 FLD3597;
            public final String FLD3598;

            public CLS1297(CLS1622 ˑٴ0, String s) {
                this.FLD3598 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
                CLS288.FLD2989.FLD2979 = null;
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                String s = this.FLD3597.MTH7285();
                int v = TextUtils.isEmpty(s) ? -1 : Integer.parseInt(s);
                CLS288.FLD2989.FLD2979 = null;
                CLS21.FLD76.MTH818("chatroomFriendReq", new Object[]{v, this.FLD3598, -1});
            }
        }


        public final class CLS1302 implements CLS2 {
            public final ArrayList FLD3605;
            public final CLS29 FLD3606;

            public CLS1302(ArrayList arrayList0, CLS29 ˎᵢ0) {
                this.FLD3606 = ˎᵢ0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(s)));
                HashSet hashSet1 = new HashSet();
                for(Object object0: this.FLD3605) {
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    if(!hashSet0.contains("")) {
                        hashSet1.add("");
                    }
                }
                String s2 = TextUtils.join(",", hashSet1);
                this.FLD3606.MTH922(s2, "chatroom_friend_req_excl");
            }
        }


        public final class CLS1314 implements CLS2 {
            public final CLS29 FLD3628;

            public CLS1314(CLS29 ˎᵢ0) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                this.FLD3628.MTH922(s, "chatroom_friend_req_excl");
            }
        }

        if(CLS387.FLD3652 != null && CLS387.FLD3652.isShowing()) {
            CLS387.FLD3652.dismiss();
        }
        CLS29 ˎᵢ0 = CLS27.MTH895();
        String s1 = CLS27.MTH889("send_friend_req");
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        CLS387.FLD3652 = CLS523.MTH7145(activity0, s1, ((CLS17)new CLS766(CLS500.FLD4928, activity0, ˎᵢ0, s, ˑٴ0)), ((CLS11)new CLS1297(ˑٴ0, s)));
    }

    // 此方法包含解密的字符串
    public static void MTH5592(Activity activity0, String s) {
        public final class CLS1313 implements CLS11 {
            public final CLS29 FLD3625;
            public final CLS1629 FLD3626;
            public final String FLD3627;

            public CLS1313(CLS29 ˎᵢ0, String s, CLS1629 ⁱˉ0) {
                this.FLD3627 = s;
                this.FLD3626 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                String s = this.FLD3626.MTH7373();
                this.FLD3625.MTH922(s, this.FLD3627);
            }
        }

        CLS29 ˎᵢ0 = CLS27.MTH895();
        String s1 = ˎᵢ0.MTH925(s + "_friendreq_type", s);
        String s2 = CLS27.MTH889("friend_request_type");
        CLS1629 ⁱˉ0 = new CLS1629(activity0);
        ⁱˉ0.FLD5352 = true;
        CLS523.MTH7160(activity0, s2, ((CLS17)new CLS1606(ⁱˉ0, s1, 0)), ((CLS11)new CLS1313(ˎᵢ0, s + "_friendreq_type", ⁱˉ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5593(Activity activity0, CLS12 ᵔʾ0) {
        public final class CLS1303 implements CLS11 {
            public final CLS1621 FLD3607;
            public final CLS12 FLD3608;
            public final CLS1629 FLD3609;

            public CLS1303(CLS1621 ˎᵢ0, CLS1629 ⁱˉ0, CLS12 ᵔʾ0) {
                this.FLD3609 = ⁱˉ0;
                this.FLD3608 = ᵔʾ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                int v = (int)this.FLD3607.FLD5241;
                int v1 = -1;
                switch(this.FLD3609.MTH7373()) {
                    case "radio_female": {
                        v1 = 2;
                        break;
                    }
                    case "radio_male": {
                        v1 = 1;
                    }
                }
                CLS12 ᵔʾ0 = this.FLD3608;
                if(ᵔʾ0 != null) {
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put(CLS182.MTH3479(v1, contentValues0, "sex", 4100874129731539765L), v);
                    ᵔʾ0.MTH791(contentValues0);
                }
            }
        }

        String s = CLS27.MTH889("accept_neighbor_friendreq");
        CLS1621 ˎᵢ0 = new CLS1621(activity0);
        CLS1629 ⁱˉ0 = new CLS1629(activity0);
        CLS523.MTH7160(activity0, s, ((CLS17)new CLS1279(ⁱˉ0, ˎᵢ0, activity0)), ((CLS11)new CLS1303(ˎᵢ0, ⁱˉ0, ᵔʾ0)));
    }

    public static void MTH5594(Activity activity0, ArrayList arrayList0, boolean z) {
        public final class CLS1299 implements CLS2 {
            public final ArrayList FLD3599;
            public final boolean FLD3600;
            public final CLS29 FLD3601;

            public CLS1299(ArrayList arrayList0, CLS29 ˎᵢ0, boolean z) {
                this.FLD3601 = ˎᵢ0;
                this.FLD3600 = z;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(s)));
                HashSet hashSet1 = new HashSet();
                for(Object object0: this.FLD3599) {
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    if(!hashSet0.contains("")) {
                        hashSet1.add("");
                    }
                }
                String s2 = CLS370.MTH5289((this.FLD3600 ? 4101364761025631029L : 0x38EAF99B2B3CD335L));
                String s3 = TextUtils.join(",", hashSet1);
                this.FLD3601.MTH922(s3, s2);
            }
        }


        public final class CLS1300 implements CLS2 {
            public final CLS29 FLD3602;
            public final boolean FLD3603;

            public CLS1300(CLS29 ˎᵢ0, boolean z) {
                this.FLD3603 = z;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                String s2 = CLS370.MTH5289((this.FLD3603 ? 4101225539660731189L : 4101225634150011701L));
                this.FLD3602.MTH922(s, s2);
            }
        }


        public final class CLS1305 implements CLS2 {
            public final HashSet FLD3612;
            public final Activity FLD3613;
            public final ArrayList FLD3614;

            public CLS1305(Activity activity0, ArrayList arrayList0, HashSet hashSet0) {
                this.FLD3612 = hashSet0;
                this.FLD3614 = arrayList0;
                this.FLD3613 = activity0;
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
                    Object object0 = iterator0.next();
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    HashSet hashSet0 = this.FLD3612;
                    if(hashSet0.contains("")) {
                        iterator0.remove();
                    }
                    else {
                        hashSet0.add("");
                        CLS295.FLD3055.MTH4790("");
                    }
                }
                this.FLD3614.addAll(arrayList0);
                String s2 = CLS27.MTH889("imported_n");
                CLS412.MTH6013(this.FLD3613, String.format(s2, arrayList0.size()));
            }
        }


        public final class CLS1310 implements CLS11 {
            public final ArrayList FLD3620;
            public final boolean FLD3621;
            public final CLS1622 FLD3622;

            public CLS1310(ArrayList arrayList0, CLS1622 ˑٴ0, boolean z) {
                this.FLD3622 = ˑٴ0;
                this.FLD3621 = z;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
                CLS288.FLD2989.FLD2979 = null;
                CLS295.FLD3055.FLD3056 = null;
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS288.FLD2989.FLD2979 = null;
                CLS295.FLD3055.FLD3056 = null;
                ArrayList arrayList0 = this.FLD3620;
                if(!arrayList0.isEmpty()) {
                    String s = this.FLD3622.MTH7285();
                    int v = TextUtils.isEmpty(s) ? -1 : Integer.parseInt(s);
                    CLS21.FLD76.MTH818(CLS370.MTH5289((this.FLD3621 ? 0x38E907522B3CD335L : 4100817049616175925L)), new Object[]{v, arrayList0});
                }
            }
        }


        public final class CLS1317 implements CLS2 {
            public final HashSet FLD3632;
            public final Activity FLD3633;
            public final ArrayList FLD3634;

            public CLS1317(Activity activity0, ArrayList arrayList0, HashSet hashSet0) {
                this.FLD3632 = hashSet0;
                this.FLD3634 = arrayList0;
                this.FLD3633 = activity0;
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
                    Object object0 = iterator0.next();
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    HashSet hashSet0 = this.FLD3632;
                    if(hashSet0.contains("")) {
                        iterator0.remove();
                    }
                    else {
                        hashSet0.add("");
                        CLS295.FLD3055.MTH4790("");
                    }
                }
                this.FLD3634.addAll(arrayList0);
                String s2 = CLS27.MTH889("imported_n");
                CLS412.MTH6013(this.FLD3633, String.format(s2, arrayList0.size()));
            }
        }


        public final class CLS1321 implements CLS2 {
            public final HashSet FLD3642;
            public final Activity FLD3643;
            public final ArrayList FLD3644;

            public CLS1321(Activity activity0, ArrayList arrayList0, HashSet hashSet0) {
                this.FLD3642 = hashSet0;
                this.FLD3644 = arrayList0;
                this.FLD3643 = activity0;
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
                    Object object0 = iterator0.next();
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    HashSet hashSet0 = this.FLD3642;
                    if(hashSet0.contains("")) {
                        iterator0.remove();
                    }
                    else {
                        hashSet0.add("");
                    }
                }
                this.FLD3644.addAll(arrayList0);
                String s2 = CLS27.MTH889("imported_n");
                CLS412.MTH6013(this.FLD3643, String.format(s2, arrayList0.size()));
            }
        }


        public final class CLS1322 implements CLS2 {
            public final HashSet FLD3645;
            public final Activity FLD3646;
            public final ArrayList FLD3647;

            public CLS1322(Activity activity0, ArrayList arrayList0, HashSet hashSet0) {
                this.FLD3645 = hashSet0;
                this.FLD3647 = arrayList0;
                this.FLD3646 = activity0;
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
                    Object object0 = iterator0.next();
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    HashSet hashSet0 = this.FLD3645;
                    if(hashSet0.contains("")) {
                        iterator0.remove();
                    }
                    else {
                        hashSet0.add("");
                        CLS295.FLD3055.MTH4790("");
                    }
                }
                this.FLD3647.addAll(arrayList0);
                String s2 = CLS27.MTH889("imported_n");
                CLS412.MTH6013(this.FLD3646, String.format(s2, arrayList0.size()));
            }
        }

        if(CLS387.FLD3649 != null && CLS387.FLD3649.isShowing()) {
            CLS387.FLD3649.dismiss();
        }
        CLS29 ˎᵢ0 = CLS27.MTH895();
        String s = CLS27.MTH889(CLS370.MTH5289((z ? 4100811814051042101L : 4100811908540322613L)));
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        CLS387.FLD3649 = CLS523.MTH7145(activity0, s, ((CLS17)new CLS1588(activity0, arrayList0, CLS371.FLD3470, CLS500.FLD4928, z, ˑٴ0, ˎᵢ0)), ((CLS11)new CLS1310(arrayList0, ˑٴ0, z)));
    }

    public static void MTH5595(boolean z, Activity activity0, String s, ArrayList arrayList0, CLS1307 ʾʼ$יᐧ0) {
        if(arrayList0.isEmpty()) {
            return;
        }
        CLS366 ﾞᐧ0 = new CLS366(activity0, arrayList0);
        CLS523.MTH7162(z, activity0, s, ((CLS379)new CLS1279(activity0, ﾞᐧ0, ʾʼ$יᐧ0, 2)), ((CLS378)new CLS1458(activity0, ﾞᐧ0, 1)), null);
    }

    // 此方法包含解密的字符串
    public static void MTH5596(Activity activity0, Object object0) {
        public final class CLS1318 implements CLS11 {
            public final CLS1629 FLD3635;
            public final Object FLD3636;
            public final CLS1622 FLD3637;
            public final CLS1629 FLD3638;

            public CLS1318(CLS1629 ⁱˉ0, CLS1622 ˑٴ0, Object object0, CLS1629 ⁱˉ1) {
                this.FLD3637 = ˑٴ0;
                this.FLD3636 = object0;
                this.FLD3638 = ⁱˉ1;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                int v;
                String s = this.FLD3635.MTH7373();
                if("radio_male".equals(s)) {
                    v = 1;
                }
                else {
                    v = "radio_female".equals(s) ? 2 : 3;
                }
                String s1 = this.FLD3637.MTH7285();
                int v1 = TextUtils.isEmpty(s1) ? -1 : Integer.parseInt(s1);
                Object[] arr_object = {this.FLD3636, v1, v, Boolean.valueOf(this.FLD3638.MTH7371("radio_order_down"))};
                CLS21.FLD76.MTH818("acceptFriendReq", arr_object);
            }
        }

        if(CLS387.FLD3650 != null && CLS387.FLD3650.isShowing()) {
            CLS387.FLD3650.dismiss();
        }
        CLS29 ˎᵢ0 = CLS27.MTH895();
        String s = CLS27.MTH889("mass_accept");
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        CLS1629 ⁱˉ0 = new CLS1629(activity0);
        CLS1629 ⁱˉ1 = new CLS1629(activity0);
        CLS387.FLD3650 = CLS523.MTH7160(activity0, s, ((CLS17)new CLS766(activity0, ˑٴ0, ⁱˉ0, ⁱˉ1, ˎᵢ0, 26)), ((CLS11)new CLS1318(ⁱˉ0, ˑٴ0, object0, ⁱˉ1)));
    }

    // 此方法包含解密的字符串
    public static void MTH5597(Activity activity0) {
        public final class CLS1306 implements CLS11 {
            public CLS1306() {
                super();
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
                CLS279.FLD2908.FLD2909.remove("showContactLabelsDialog");
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS279.FLD2908.FLD2909.remove("showContactLabelsDialog");
            }
        }


        public final class CLS1312 implements CLS8 {
            public final Activity FLD3624;

            public CLS1312(Activity activity0) {
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                public final class CLS1311 implements CLS11 {
                    public final ArrayList FLD3623;

                    public CLS1311(ArrayList arrayList0) {
                    }

                    @Override  // b.ʻˑ.CLS11
                    public final void MTH789() {
                    }

                    @Override  // b.ʻˑ.CLS11
                    public final void MTH790() {
                        CLS279.FLD2908.getClass();
                        ArrayList arrayList0 = this.FLD3623;
                        if(!arrayList0.isEmpty()) {
                            for(Object object0: arrayList0) {
                                CLS279.MTH4652(((String)object0));
                            }
                        }
                    }
                }

                CLS1311 ʾʼ$ᐧˉ$ˆٴ0 = new CLS1311(((ArrayList)object0));
                CLS523.MTH7142(this.FLD3624, ((CLS11)ʾʼ$ᐧˉ$ˆٴ0));
            }
        }


        public final class CLS1319 implements CLS11 {
            public final String FLD3639;

            public CLS1319(String s) {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS279.FLD2908.getClass();
                CLS279.MTH4652(this.FLD3639);
            }
        }

        ArrayList arrayList0 = CLS371.FLD3470.MTH5373();
        CLS369 ﾞᵎ0 = new CLS369(activity0, arrayList0);
        AlertDialog[] arr_alertDialog = {null};
        arr_alertDialog[0] = CLS523.MTH7160(activity0, CLS27.MTH889("contact_tags"), ((CLS17)new CLS1506(arrayList0, ﾞᵎ0, arr_alertDialog, activity0, 3)), ((CLS11)new CLS1306()));
    }

    // 此方法包含解密的字符串
    public static void MTH5598(Activity activity0) {
        public final class CLS1298 implements CLS8 {
            public CLS1298() {
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                JSONArray jSONArray0 = new JSONArray();
                for(Object object1: ((ArrayList)object0)) {
                    ContentValues contentValues0 = (ContentValues)object1;
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("username", contentValues0.getAsString("username"));
                        jSONObject0.put("nickname", contentValues0.getAsString("nickname"));
                        jSONObject0.put("sex", contentValues0.getAsInteger("sex"));
                        if(contentValues0.containsKey("place")) {
                            jSONObject0.put("location", contentValues0.getAsString("place"));
                        }
                        jSONArray0.put(jSONObject0);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                CLS21.FLD76.MTH818("nearbyFriendReq_export", new Object[]{jSONArray0});
            }
        }


        public final class CLS1301 implements CLS8 {
            public final Activity FLD3604;

            public CLS1301(Activity activity0) {
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                JSONArray jSONArray0 = new JSONArray();
                for(Object object1: ((ArrayList)object0)) {
                    ContentValues contentValues0 = (ContentValues)object1;
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("username", contentValues0.getAsString("username"));
                        jSONObject0.put("nickname", contentValues0.getAsString("nickname"));
                        jSONObject0.put("sex", contentValues0.getAsInteger("sex"));
                        if(contentValues0.containsKey("place")) {
                            jSONObject0.put("location", contentValues0.getAsString("place"));
                        }
                        jSONArray0.put(jSONObject0);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                CLS412.MTH6017(this.FLD3604, jSONArray0.toString());
                String s = CLS27.MTH889("copy_to_clipboard");
                CLS412.MTH6013(this.FLD3604, s);
            }
        }


        public final class CLS1304 implements CLS11 {
            public final CLS1622 FLD3610;
            public final CLS1629 FLD3611;

            public CLS1304(CLS1622 ˑٴ0, CLS1629 ⁱˉ0) {
                this.FLD3611 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
                CLS288.FLD2989.FLD2979 = null;
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                String s = this.FLD3610.MTH7285();
                int v = -1;
                int v1 = TextUtils.isEmpty(s) ? -1 : Integer.parseInt(s);
                String s1 = this.FLD3611.MTH7373();
                if("radio_male".equals(s1)) {
                    v = 1;
                }
                else if("radio_female".equals(s1)) {
                    v = 2;
                }
                CLS288.FLD2989.FLD2979 = null;
                CLS21.FLD76.MTH818("nearbyFriendReq", new Object[]{v1, v});
            }
        }


        public final class CLS1315 implements CLS2 {
            public final CLS29 FLD3629;

            public CLS1315(CLS29 ˎᵢ0) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                this.FLD3629.MTH922(s, "nearby_friend_req_excl");
            }
        }

        if(CLS387.FLD3651 != null && CLS387.FLD3651.isShowing()) {
            CLS387.FLD3651.dismiss();
        }
        CLS29 ˎᵢ0 = CLS27.MTH895();
        String s = CLS27.MTH889("send_friend_req");
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        CLS1629 ⁱˉ0 = new CLS1629(activity0);
        CLS387.FLD3651 = CLS523.MTH7145(activity0, s, ((CLS17)new CLS766(CLS500.FLD4928, activity0, ˎᵢ0, ˑٴ0, ⁱˉ0, 24)), ((CLS11)new CLS1304(ˑٴ0, ⁱˉ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5599(Activity activity0, String s, long v) {
        public final class CLS1307 implements CLS8 {
            public final Activity FLD3615;
            public final String FLD3616;

            public CLS1307(Activity activity0, String s) {
                this.FLD3616 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                CLS372.MTH5401(this.FLD3615, this.FLD3616, "");
            }
        }


        public final class CLS1308 implements CLS2 {
            public final Activity FLD3617;
            public final String FLD3618;

            public CLS1308(Activity activity0, String s) {
                this.FLD3618 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(arrayList0.isEmpty()) {
                    return;
                }
                ArrayList arrayList1 = new ArrayList();
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    arrayList1.add("");
                }
                String s2 = CLS27.MTH889("at_not_participating");
                CLS751 יﹳ0 = new CLS751(2, this.FLD3618, arrayList1);
                CLS523.MTH7165(this.FLD3617, s2, "", "", 1, ((CLS16)יﹳ0));
            }
        }


        public final class CLS1316 implements CLS2 {
            public final Activity FLD3630;
            public final String FLD3631;

            public CLS1316(Activity activity0, String s) {
                this.FLD3631 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(arrayList0.isEmpty()) {
                    return;
                }
                ArrayList arrayList1 = new ArrayList();
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    arrayList1.add("");
                }
                String s2 = CLS27.MTH889("at_participating");
                CLS751 יﹳ0 = new CLS751(1, this.FLD3631, arrayList1);
                CLS523.MTH7165(this.FLD3630, s2, "", "", 1, ((CLS16)יﹳ0));
            }
        }

        ArrayList arrayList0 = new ArrayList();
        Object object0 = CLS66.MTH1495(v);
        if(object0 != null) {
            String s1 = (String)CLS182.MTH3492(4101630177119621941L, object0);
            Class class0 = CLS27.MTH894("favClass1_a");
            Class class1 = CLS27.MTH894("PluginGroupSolitaireClass");
            Object object1 = CLS166.MTH3195(CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("favClass1_a_method1"), new Object[]{class1}), CLS27.MTH897("getGroupSolitatireManagerMethod"), new Object[0]), CLS27.MTH897("getGroupSolitatireFromCacheMethod"), new Object[]{s, s1});
            if(object1 != null) {
                HashMap hashMap0 = new HashMap();
                ArrayList arrayList1 = new ArrayList();
                HashMap hashMap1 = (HashMap)CLS182.MTH3492(4101630787004977973L, object1);
                for(int v2 = 1; v2 <= hashMap1.size(); ++v2) {
                    Object object2 = hashMap1.get(v2);
                    String s2 = (String)CLS182.MTH3492(0x38EBEB0F2B3CD335L, object2);
                    String s3 = (String)CLS182.MTH3492(4101630451997528885L, object2);
                    if(hashMap0.containsKey(s2)) {
                        ((ArrayList)hashMap0.get(s2)).add(v2 + ". " + s3);
                    }
                    else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(v2 + ". " + s3);
                        hashMap0.put(s2, arrayList2);
                        arrayList1.add(s2);
                    }
                }
                for(Object object3: arrayList1) {
                    String s4 = TextUtils.join("<br>", ((Iterable)hashMap0.get(((String)object3))));
                    arrayList0.add(new CLS78(((String)object3), CLS66.MTH1452(s, ((String)object3)) + ":<br><small>" + s4 + "</small>"));
                }
            }
        }
        if(arrayList0.isEmpty()) {
            return;
        }
        String[] arr_s = CLS502.MTH6941(CLS371.FLD3470.MTH5335(s));
        HashMap hashMap2 = CLS66.MTH1400(s, Arrays.asList(arr_s), false);
        HashSet hashSet0 = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        Iterator iterator1 = arrayList0.iterator();
        while(iterator1.hasNext()) {
            iterator1.next();
            hashSet0.add("");
            String s5 = (String)hashMap2.get("");
            if(TextUtils.isEmpty(s5)) {
                s5 = "";
            }
            if(!"".equals(s5)) {
                s5 = CLS34.MTH1079(0x38E90C002B3CD335L, CLS182.MTH3483(s5), "", 0x38E90C032B3CD335L);
            }
            arrayList3.add(new CLS78("", s5));
        }
        ArrayList arrayList4 = new ArrayList();
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s6 = arr_s[v1];
            if(!hashSet0.contains(s6) && !TextUtils.isEmpty(s6)) {
                String s7 = (String)hashMap2.get(s6);
                String s8 = CLS371.FLD3470.MTH5311(s6);
                if(TextUtils.isEmpty(s7)) {
                    s7 = s8;
                }
                if(!s8.equals(s7)) {
                    s7 = CLS34.MTH1079(0x38E90C052B3CD335L, CLS182.MTH3483(s7), s8, 0x38E90C082B3CD335L);
                }
                arrayList4.add(new CLS78(s6, s7));
            }
        }
        CLS372.MTH5405(arrayList3);
        CLS372.MTH5405(arrayList4);
        CLS523.MTH7150(activity0, CLS27.MTH889("groupnote_members"), ((CLS17)new CLS766(activity0, arrayList4, s, arrayList3, arrayList0, 27, 0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5600(boolean z, Activity activity0, ArrayList arrayList0, CLS2 ˆʿ0) {
        if(arrayList0.isEmpty()) {
            return;
        }
        CLS366 ﾞᐧ0 = new CLS366(activity0, arrayList0);
        int[] arr_v = {-1};
        CLS1624 יﹳ0 = new CLS1624(activity0);
        int v = 2;
        יﹳ0.FLD5274 = new CLS1599(ﾞᐧ0, 2);
        יﹳ0.MTH7302();
        CLS1623 יᐧ0 = new CLS1623(activity0);
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for(Object object0: arrayList0) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(CLS426.MTH6126("")) {
                arrayList1.add(ˊﾞ0);
            }
            else if(CLS372.MTH5400("")) {
                arrayList3.add(ˊﾞ0);
            }
            else {
                arrayList2.add(ˊﾞ0);
            }
        }
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        ـﹳ0.FLD5295 = false;
        ـﹳ0.FLD5301 = true;
        ـﹳ0.MTH800(CLS27.MTH889("selected"));
        יᐧ0.MTH7296(ـﹳ0);
        CLS1629 ⁱˉ0 = new CLS1629(activity0);
        ⁱˉ0.FLD5360 = true;
        ⁱˉ0.MTH7381("radio_public_account");
        if(arrayList3.isEmpty()) {
            ⁱˉ0.MTH7378("radio_public_account");
        }
        else {
            v = 3;
        }
        ⁱˉ0.MTH7381("radio_friends");
        if(arrayList2.isEmpty()) {
            --v;
            ⁱˉ0.MTH7378("radio_friends");
        }
        ⁱˉ0.MTH7381("radio_chatrooms");
        if(arrayList1.isEmpty()) {
            --v;
            ⁱˉ0.MTH7378("radio_chatrooms");
        }
        if(v > 1) {
            ⁱˉ0.MTH7381("radio_all");
            ⁱˉ0.MTH7375("radio_all");
        }
        ⁱˉ0.FLD5356 = new CLS1547(ﾞᐧ0, arrayList3, arrayList2, arrayList1, arrayList0, 0);
        if(v > 1) {
            יᐧ0.MTH7296(ⁱˉ0);
        }
        else {
            ﾞᐧ0.MTH5276(arrayList0);
        }
        CLS523.MTH7162(z, activity0, CLS27.MTH889("select"), ((CLS379)new CLS766(יﹳ0, ﾞᐧ0, arr_v, ـﹳ0, יᐧ0, 22)), ((CLS378)new CLS1458(activity0, ﾞᐧ0, 0)), ((CLS11)new CLS1534(arr_v, ˆʿ0, ﾞᐧ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5601(boolean z, Activity activity0, CLS2 ˆʿ0, int v) {
        HashSet hashSet0 = new HashSet();
        String s = CLS27.MTH904();
        CLS371.FLD3470.MTH5314(s, hashSet0);
        for(Object object0: hashSet0) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(CLS426.MTH6126("")) {
                ˊﾞ0.FLD275 = "" + " (" + CLS371.FLD3470.MTH5369("") + ")";
            }
        }
        CLS387.MTH5585(z, activity0, CLS372.MTH5414(hashSet0), ˆʿ0, null, v);
    }
}

