// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ˈˈ.CLS91;
import b.ˑٴ.CLS848;
import b.ᵔʾ.CLS1225;
import b.ᵔʾ.CLS1235;
import b.ᵔʾ.CLS310;
import b.ⁱʾ.CLS338;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1599;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS433;
import b.ⁱᵔ.CLS456;
import b.ⁱᵔ.CLS467;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;
import b.ﾞˎ.CLS530;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1181 implements CLS17, CLS379 {
    public final Object FLD2757;
    public final int FLD2758;
    public final Object FLD2759;
    public final Object FLD2760;
    public final Activity FLD2761;
    public final Object FLD2762;
    public final Object FLD2763;
    public final Object FLD2764;

    public CLS1181(Activity activity0, Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, int v) {
        this.FLD2758 = v;
        this.FLD2761 = activity0;
        this.FLD2759 = object0;
        this.FLD2760 = object1;
        this.FLD2762 = object2;
        this.FLD2764 = object3;
        this.FLD2763 = object4;
        this.FLD2757 = object5;
        super();
    }

    public CLS1181(CLS244 ᴵʻ0, Activity activity0, CLS1635 ﾞᵎ0, CLS1635 ﾞᵎ1, CLS1621 ˎᵢ0, CLS1625 ـˏ0, CLS91 ᵔʾ0) {
        this.FLD2758 = 0;
        super();
        this.FLD2759 = ᴵʻ0;
        this.FLD2761 = activity0;
        this.FLD2760 = ﾞᵎ0;
        this.FLD2762 = ﾞᵎ1;
        this.FLD2764 = ˎᵢ0;
        this.FLD2763 = ـˏ0;
        this.FLD2757 = ᵔʾ0;
    }

    public CLS1181(CLS1173 ᵢᵢ0, Activity activity0, CLS1635 ﾞᵎ0, String s, CLS1635 ﾞᵎ1, CLS1635 ﾞᵎ2, CLS1635 ﾞᵎ3) {
        this.FLD2758 = 1;
        super();
        this.FLD2759 = ᵢᵢ0;
        this.FLD2761 = activity0;
        this.FLD2760 = ﾞᵎ0;
        this.FLD2764 = s;
        this.FLD2762 = ﾞᵎ1;
        this.FLD2763 = ﾞᵎ2;
        this.FLD2757 = ﾞᵎ3;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Object object0 = this.FLD2757;
        Object object1 = this.FLD2763;
        Object object2 = this.FLD2764;
        Object object3 = this.FLD2762;
        Object object4 = this.FLD2760;
        Object object5 = this.FLD2759;
        if(this.FLD2758 == 2) {
            Menu menu0 = (Menu)arr_object[0];
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            CLS525 ʻˑ0 = new CLS525(this.FLD2761, linearLayout0, menu0);
            ʻˑ0.MTH7187("add", ((CLS3)new CLS1235(7, this.FLD2761, ((CLS1225)object5), ((CLS338)object3), ((CLS3)object2), ((ArrayList)object4))));
            ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS848(this.FLD2761, ((ArrayList)object4), ((String)object1), ((CLS338)object3), 6, 0)));
            ʻˑ0.MTH7188();
            ((CLS1624)object0).MTH7301(new CLS211(((CLS338)object3), ((CLS3)object2), 3));
            ((CLS1624)object0).MTH7305(new CLS310(2, this.FLD2761, ((CLS338)object3), ((CLS1225)object5), ((CLS3)object2), ((ArrayList)object4)));
            ((CLS1624)object0).MTH7303(((CLS338)object3));
            for(int v = 0; v < ((ArrayList)object4).size(); ++v) {
                if(((ContentValues)((ArrayList)object4).get(v)).getAsBoolean("enable").booleanValue()) {
                    ((CLS338)object3).MTH5125(v, true);
                }
            }
            CLS523.MTH7147(linearLayout0, ((CLS18)(((CLS1624)object0))), true);
            return;
        }
        Menu menu1 = (Menu)arr_object[0];
        LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
        CLS525 ʻˑ1 = new CLS525(this.FLD2761, linearLayout1, menu1);
        ʻˑ1.MTH7187("add", ((CLS3)new CLS1098(((CLS371)object5), ((String)object4), this.FLD2761, ((ArrayList)object3), ((CLS29)object2), ((String)object1), ((CLS366)object0))));
        ʻˑ1.MTH7187("delete_all", ((CLS3)new CLS1235(this.FLD2761, ((CLS29)object2), ((String)object1), ((ArrayList)object3), ((CLS366)object0), 16)));
        ʻˑ1.MTH7188();
        CLS1624 יﹳ0 = new CLS1624(this.FLD2761);
        יﹳ0.FLD5274 = new CLS1599(((CLS366)object0), 6);
        יﹳ0.MTH7302();
        יﹳ0.MTH7311();
        יﹳ0.MTH7303(((CLS366)object0));
        יﹳ0.FLD5276 = false;
        יﹳ0.MTH7305(new CLS310(this.FLD2761, ((CLS366)object0), ((CLS29)object2), ((String)object1), ((ArrayList)object3)));
        CLS523.MTH7147(linearLayout1, ((CLS18)יﹳ0), true);
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        boolean z;
        String s1;
        Activity activity0 = this.FLD2761;
        Object object0 = this.FLD2757;
        Object object1 = this.FLD2763;
        Object object2 = this.FLD2764;
        Object object3 = this.FLD2762;
        Object object4 = this.FLD2760;
        Object object5 = this.FLD2759;
        switch(this.FLD2758) {
            case 0: {
                CLS244 ᴵʻ0 = (CLS244)object5;
                CLS91 ᵔʾ0 = (CLS91)object0;
                ᴵʻ0.getClass();
                CLS1635 ﾞᵎ0 = new CLS1635(activity0);
                ᴵʻ0.FLD2549 = ﾞᵎ0;
                ﾞᵎ0.MTH800(CLS27.MTH889("enable"));
                CLS523.MTH7147(linearLayout0, ((CLS18)ᴵʻ0.FLD2549), true);
                CLS500 ᵢﹶ0 = ᴵʻ0.FLD2538;
                if(ᵢﹶ0.MTH6895("rp_keyword") && CLS502.MTH6934(ᴵʻ0.FLD2542, new String[]{"_REDPACKETS_", "_MONEYTRANSFER_"})) {
                    CLS1626 ـﹳ0 = new CLS1626(activity0);
                    ـﹳ0.MTH798(CLS27.MTH889("rp_amount_resp_desc"));
                    ـﹳ0.FLD5295 = false;
                    CLS523.MTH7147(linearLayout0, ((CLS18)ـﹳ0), true);
                }
                CLS1623 יᐧ0 = new CLS1623(activity0);
                יᐧ0.MTH7296(((CLS1635)object4));
                יᐧ0.MTH7296(((CLS1635)object3));
                יᐧ0.MTH7296(((CLS1621)object2));
                יᐧ0.MTH7290(linearLayout0, CLS523.MTH7137(10));
                CLS1622 ˑٴ0 = new CLS1622(activity0);
                ᴵʻ0.FLD2555 = ˑٴ0;
                ˑٴ0.MTH800(CLS27.MTH889("keyword"));
                CLS1622 ˑٴ1 = new CLS1622(activity0);
                ᴵʻ0.FLD2540 = ˑٴ1;
                ˑٴ1.MTH800(CLS27.MTH889("response"));
                if(ᵢﹶ0.MTH6895("text_rep_nickname") && !CLS502.MTH6934(ᴵʻ0.FLD2542, new String[]{"_FRIENDREQUEST_INTRO_", "_CHATROOM_INTRO_"})) {
                    ᴵʻ0.FLD2540.MTH798(CLS27.MTH889("text_rep_desc"));
                }
                CLS1622 ˑٴ2 = ᴵʻ0.FLD2540;
                ˑٴ2.FLD5252 = new CLS1055(ᴵʻ0, activity0);
                CLS1623 יᐧ1 = new CLS1623(activity0);
                יᐧ1.MTH7289(new Object[]{ᴵʻ0.FLD2555, ᴵʻ0.FLD2540});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), CLS523.MTH7137(10));
                ImageView imageView0 = new ImageView(activity0);
                ᴵʻ0.FLD2547 = imageView0;
                CLS523.MTH7139(linearLayout0, imageView0, 0);
                ((CLS1625)object1).MTH800(CLS27.MTH889("preview"));
                ((CLS1625)object1).MTH801(8);
                ((CLS1625)object1).MTH7320(new CLS530(ᴵʻ0, activity0, 4));
                CLS523.MTH7147(linearLayout0, ((CLS18)(((CLS1625)object1))), true);
                if(ᵔʾ0 == null) {
                    ᴵʻ0.FLD2535 = null;
                    ᴵʻ0.FLD2539 = null;
                    ᴵʻ0.FLD2554 = null;
                }
                else {
                    ᴵʻ0.FLD2535 = ᵔʾ0.MTH1736();
                    ᴵʻ0.FLD2539 = ᵔʾ0.MTH1735();
                    ᴵʻ0.FLD2549.MTH7437(ᵔʾ0.FLD386 == 1);
                    ᴵʻ0.FLD2548 = ᴵʻ0.FLD2549.MTH7444();
                    JSONObject jSONObject0 = ᵔʾ0.MTH1738();
                    ᴵʻ0.FLD2551 = jSONObject0;
                    if(jSONObject0 == null) {
                        ᴵʻ0.FLD2551 = new JSONObject();
                    }
                    ᴵʻ0.FLD2553 = null;
                    String s = "";
                    if(ᴵʻ0.FLD2539.startsWith("{")) {
                        try {
                            JSONObject jSONObject1 = new JSONObject(ᴵʻ0.FLD2539);
                            if(jSONObject1.has("meta")) {
                                ᴵʻ0.FLD2551 = jSONObject1.getJSONObject("meta");
                            }
                            if(jSONObject1.has("response")) {
                                s1 = "";
                                JSONArray jSONArray0 = jSONObject1.getJSONArray("response");
                                if(ᵔʾ0.FLD386 == 1) {
                                    int v = 0;
                                    while(v < jSONArray0.length()) {
                                        JSONObject jSONObject2 = jSONArray0.getJSONObject(v);
                                        if(!jSONObject2.has("checked") || !jSONObject2.getBoolean("checked")) {
                                            ++v;
                                            continue;
                                        }
                                        s1 = jSONObject2.getString("msg");
                                        z = true;
                                        goto label_84;
                                    }
                                }
                                z = false;
                            label_84:
                                if(z) {
                                    goto label_91;
                                }
                                else {
                                    s = s1;
                                    s = jSONArray0.getJSONObject(0).getString("msg");
                                }
                            }
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                        goto label_92;
                    label_91:
                        s = s1;
                    label_92:
                        ᴵʻ0.FLD2539 = s;
                    }
                    ((CLS1635)object3).MTH7437(ᴵʻ0.FLD2551.optBoolean("keyword_cooldown"));
                    ((CLS1621)object2).MTH7268(ᴵʻ0.FLD2551.optLong("keyword_cooldown_time", 60000L));
                    ᴵʻ0.FLD2555.MTH7277(ᴵʻ0.FLD2535);
                    ᴵʻ0.FLD2540.MTH7277(ᴵʻ0.FLD2539);
                    if(CLS502.MTH6927(ᴵʻ0.FLD2535)) {
                        ((CLS1635)object4).MTH7437(true);
                    }
                    if(s.startsWith("#img")) {
                        String[] arr_s = s.split(" ");
                        if(arr_s.length > 1) {
                            ᴵʻ0.FLD2554 = arr_s[1];
                            ᴵʻ0.FLD2547.setImageBitmap(ᴵʻ0.FLD2550.MTH1253(arr_s[1]));
                        }
                    }
                    else if(s.startsWith("#pic")) {
                        String[] arr_s1 = s.split(" ");
                        if(arr_s1.length > 1) {
                            ᴵʻ0.FLD2547.setImageBitmap(CLS518.MTH7061(arr_s1[1]));
                        }
                    }
                    else if(s.startsWith("#fav")) {
                        ((CLS1625)object1).MTH801(0);
                        String[] arr_s2 = s.split(" ");
                        if(arr_s2.length > 1) {
                            Cursor cursor0 = ᴵʻ0.FLD2556.MTH6388(arr_s2[1]);
                            if(cursor0 != null) {
                                if(cursor0.moveToFirst()) {
                                    ContentValues contentValues0 = CLS404.MTH5911(cursor0);
                                    if(contentValues0 != null && contentValues0.containsKey("img")) {
                                        ᴵʻ0.FLD2547.setImageBitmap(CLS518.MTH7061(contentValues0.getAsString("img")));
                                    }
                                }
                                cursor0.close();
                            }
                        }
                    }
                }
                if(ᵢﹶ0.MTH6895("autoreply_id")) {
                    CLS1635 ﾞᵎ1 = new CLS1635(activity0);
                    ﾞᵎ1.MTH800(CLS27.MTH889("specify_id"));
                    try {
                        JSONObject jSONObject3 = ᴵʻ0.FLD2551;
                        if(jSONObject3 == null) {
                            JSONObject jSONObject4 = new JSONObject();
                            ᴵʻ0.FLD2551 = jSONObject4;
                            jSONObject4.put("specify_id", true);
                        }
                        else {
                            ﾞᵎ1.MTH7437(!jSONObject3.has("specify_id") || ᴵʻ0.FLD2551.getBoolean("specify_id"));
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                    ﾞᵎ1.MTH7438(new CLS180(ᴵʻ0, 4));
                    CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ1), true);
                }
                if(ᵢﹶ0.MTH6895("rp_keyword") && CLS502.MTH6934(ᴵʻ0.FLD2542, new String[]{"_REDPACKETS_", "_MONEYTRANSFER_"})) {
                    CLS1635 ﾞᵎ2 = new CLS1635(activity0);
                    CLS1635 ﾞᵎ3 = CLS34.MTH1086(4100661524555420469L, ﾞᵎ2, activity0);
                    ﾞᵎ3.MTH800(CLS27.MTH889("private_chat"));
                    CLS1622 ˑٴ3 = new CLS1622(activity0);
                    ˑٴ3.MTH800(CLS27.MTH889("money_amount"));
                    ˑٴ3.MTH7278(0x2000);
                    try {
                        if(ᴵʻ0.FLD2551 == null) {
                            JSONObject jSONObject5 = new JSONObject();
                            ᴵʻ0.FLD2551 = jSONObject5;
                            jSONObject5.put("chatroom", true);
                            ᴵʻ0.FLD2551.put("private", true);
                            ᴵʻ0.FLD2551.put("amount", 0);
                        }
                        ﾞᵎ2.MTH7437(!ᴵʻ0.FLD2551.has("chatroom") || ᴵʻ0.FLD2551.getBoolean("chatroom"));
                        ﾞᵎ3.MTH7437(!ᴵʻ0.FLD2551.has("private") || ᴵʻ0.FLD2551.getBoolean("private"));
                        ˑٴ3.MTH7277(String.valueOf((ᴵʻ0.FLD2551.has("amount") ? ((double)ᴵʻ0.FLD2551.getInt("amount")) / 100.0 : 0.0)));
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                    }
                    ﾞᵎ2.MTH7438(new CLS180(ᴵʻ0, 5));
                    ﾞᵎ3.MTH7438(new CLS180(ᴵʻ0, 6));
                    ˑٴ3.FLD5252 = new CLS939(ᴵʻ0, 3);
                    CLS1623 יᐧ2 = new CLS1623(activity0);
                    CLS182.MTH3498(יᐧ2, new Object[]{ﾞᵎ2, ﾞᵎ3, ˑٴ3}, 10, linearLayout0, יᐧ2);
                }
                return;
            }
            case 1: {
                ((CLS1173)object5).getClass();
                int v1 = CLS523.MTH7137(10);
                CLS1623 יᐧ3 = new CLS1623(activity0);
                ((CLS1635)object4).MTH800(CLS27.MTH889("videocall_incoming_ringtone"));
                String s2 = CLS34.MTH1079(4101058370943636277L, new StringBuilder(), ((String)object2), 4101058418188276533L);
                ((CLS1635)object4).MTH7437(((CLS1173)object5).FLD2151.MTH938(s2, false));
                ((CLS1635)object4).MTH7438(new CLS203(((CLS1173)object5), ((String)object2), 9));
                יᐧ3.MTH7296(((CLS1635)object4));
                CLS1626 ـﹳ1 = new CLS1626(activity0);
                ـﹳ1.MTH800(CLS27.MTH889("select_ringtone"));
                ـﹳ1.MTH7324(new CLS255(((CLS1173)object5), ـﹳ1, ((String)object2), 0));
                יᐧ3.MTH7296(ـﹳ1);
                StringBuilder stringBuilder0 = new StringBuilder();
                String s3 = ((CLS1173)object5).FLD2151.MTH925(CLS34.MTH1079(4101058048821089077L, stringBuilder0, ((String)object2), 4101058096065729333L), "");
                ـﹳ1.MTH7325((TextUtils.isEmpty(s3) ? CLS27.MTH889("default_text") : RingtoneManager.getRingtone(activity0.getApplicationContext(), Uri.parse(s3)).getTitle(activity0)));
                ((CLS1635)object3).MTH800(CLS27.MTH889("videocall_outgoing_ringtone"));
                ((CLS1635)object3).MTH7437(((CLS1173)object5).FLD2151.MTH938("videocall_" + ((String)object2) + "_outgoing_ringtone_enable", false));
                ((CLS1635)object3).MTH7438(new CLS203(((CLS1173)object5), ((String)object2), 10));
                יᐧ3.MTH7296(((CLS1635)object3));
                CLS1626 ـﹳ2 = new CLS1626(activity0);
                ـﹳ2.MTH800(CLS27.MTH889("select_ringtone"));
                ـﹳ2.MTH7324(new CLS255(((CLS1173)object5), ـﹳ2, ((String)object2), 1));
                יᐧ3.MTH7296(ـﹳ2);
                String s4 = ((CLS1173)object5).FLD2151.MTH925(CLS34.MTH1079(4101058585692001077L, new StringBuilder(), ((String)object2), 4101058632936641333L), "");
                ـﹳ2.MTH7325((TextUtils.isEmpty(s4) ? CLS27.MTH889("default_text") : RingtoneManager.getRingtone(activity0.getApplicationContext(), Uri.parse(s4)).getTitle(activity0)));
                יᐧ3.MTH7290(linearLayout0, v1);
                CLS1623 יᐧ4 = new CLS1623(activity0);
                ((CLS1635)object1).MTH800(CLS27.MTH889("audiocall_incoming_ringtone"));
                ((CLS1635)object1).MTH7437(((CLS1173)object5).FLD2151.MTH938("audiocall_" + ((String)object2) + "_incoming_ringtone_enable", false));
                ((CLS1635)object1).MTH7438(new CLS203(((CLS1173)object5), ((String)object2), 11));
                יᐧ4.MTH7296(((CLS1635)object1));
                CLS1626 ـﹳ3 = new CLS1626(activity0);
                ـﹳ3.MTH800(CLS27.MTH889("select_ringtone"));
                ـﹳ3.MTH7324(new CLS255(((CLS1173)object5), ـﹳ3, ((String)object2), 2));
                יᐧ4.MTH7296(ـﹳ3);
                String s5 = ((CLS1173)object5).FLD2151.MTH925(CLS34.MTH1079(4101059122562913077L, new StringBuilder(), ((String)object2), 4101059169807553333L), "");
                ـﹳ3.MTH7325((TextUtils.isEmpty(s5) ? CLS27.MTH889("default_text") : RingtoneManager.getRingtone(activity0.getApplicationContext(), Uri.parse(s5)).getTitle(activity0)));
                ((CLS1635)object0).MTH800(CLS27.MTH889("audiocall_outgoing_ringtone"));
                ((CLS1635)object0).MTH7437(((CLS1173)object5).FLD2151.MTH938("audiocall_" + ((String)object2) + "_outgoing_ringtone_enable", false));
                ((CLS1635)object0).MTH7438(new CLS203(((CLS1173)object5), ((String)object2), 12));
                יᐧ4.MTH7296(((CLS1635)object0));
                CLS1626 ـﹳ4 = new CLS1626(activity0);
                ـﹳ4.MTH800(CLS27.MTH889("select_ringtone"));
                ـﹳ4.MTH7324(new CLS255(((CLS1173)object5), ـﹳ4, ((String)object2), 3));
                יᐧ4.MTH7296(ـﹳ4);
                String s6 = ((CLS1173)object5).FLD2151.MTH925(CLS34.MTH1079(0x38E9E0082B3CD335L, new StringBuilder(), ((String)object2), 4101055308631954229L), "");
                ـﹳ4.MTH7325((TextUtils.isEmpty(s6) ? CLS27.MTH889("default_text") : RingtoneManager.getRingtone(activity0.getApplicationContext(), Uri.parse(s6)).getTitle(activity0)));
                יᐧ4.MTH7290(linearLayout0, v1);
                return;
            }
            case 3: {
                CLS1624 יﹳ1 = new CLS1624(activity0);
                יﹳ1.FLD5274 = new CLS1043(((CLS369)object5), 10);
                יﹳ1.MTH7302();
                יﹳ1.MTH7303(((CLS369)object5));
                יﹳ1.MTH7301(new CLS467(((CLS12)object4), ((CLS369)object5)));
                יﹳ1.MTH7305(new CLS181(activity0, ((ArrayList)object1), ((CLS29)object3), ((String)object2), ((String)object0), ((CLS369)object5)));
                CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ1), true);
                return;
            }
            default: {
                CLS1624 יﹳ0 = new CLS1624(activity0);
                יﹳ0.FLD5274 = new CLS1043(((CLS369)object5), 19);
                יﹳ0.MTH7302();
                יﹳ0.MTH7311();
                יﹳ0.MTH7303(((CLS369)object5));
                יﹳ0.MTH7301(new CLS433(((CLS369)object5), ((String[])object4), ((CLS12)object3), ((String)object2), activity0));
                יﹳ0.MTH7305(new CLS456(2, activity0, ((CLS369)object5), ((CLS29)object1), ((ArrayList)object0)));
                CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
            }
        }
    }
}

