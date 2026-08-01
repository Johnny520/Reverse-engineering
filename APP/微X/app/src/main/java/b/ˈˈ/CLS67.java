// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS568;
import b.ˈˊ.CLS99;
import b.ˑٴ.CLS783;
import b.ᐧˉ.CLS1019;
import b.ᐧˉ.CLS1034;
import b.ᐧˉ.CLS1041;
import b.ᐧˉ.CLS1049;
import b.ᐧˉ.CLS1078;
import b.ᐧˉ.CLS1105;
import b.ᐧˉ.CLS1108;
import b.ᐧˉ.CLS1112.CLS1111;
import b.ᐧˉ.CLS1112;
import b.ᐧˉ.CLS1156;
import b.ᐧˉ.CLS1189;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS210;
import b.ᐧˉ.CLS216.CLS1024;
import b.ᐧˉ.CLS216;
import b.ᐧˉ.CLS244;
import b.ᐧˉ.CLS899;
import b.ᐧˉ.CLS928;
import b.ᐧˉ.CLS975;
import b.ᐧˉ.CLS978;
import b.ᐧˉ.CLS990;
import b.ᵔʾ.CLS1229;
import b.ᵔʾ.CLS1255;
import b.ⁱʾ.CLS1266;
import b.ⁱʾ.CLS1274;
import b.ⁱʾ.CLS316;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS363;
import b.ⁱᵔ.CLS1296;
import b.ⁱᵔ.CLS1539;
import b.ⁱᵔ.CLS1600;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS387.CLS1315;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS501;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1616;
import b.ﾞˎ.CLS1617;
import b.ﾞˎ.CLS1619;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS556.CLS555;
import b.ﾞˎ.CLS556;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS67 implements View.OnClickListener {
    public final int FLD216;
    public final Object FLD217;
    public final Object FLD218;
    public final Object FLD219;

    public CLS67(Object object0, Object object1, Object object2, int v) {
        this.FLD216 = v;
        this.FLD218 = object0;
        this.FLD217 = object1;
        this.FLD219 = object2;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        File file0;
        String s1;
        CLS91 ᵔʾ0 = null;
        boolean z = false;
        Object object0 = this.FLD219;
        Object object1 = this.FLD217;
        Object object2 = this.FLD218;
        switch(this.FLD216) {
            case 0: {
                if(((CLS90)object2).FLD371) {
                    ((CLS90)object2).FLD371 = false;
                    ((MediaPlayer)object1).setVolume(1.0f, 1.0f);
                    s1 = "\uD83D\uDD0A";
                }
                else {
                    ((CLS90)object2).FLD371 = true;
                    ((MediaPlayer)object1).setVolume(0.0f, 0.0f);
                    s1 = "\uD83D\uDD07";
                }
                ((Button)object0).setText(s1);
                return;
            }
            case 1: {
                CLS1619 ˉᐧ0 = (CLS1619)object2;
                Activity activity0 = (Activity)object1;
                CLS1626 ـﹳ0 = (CLS1626)object0;
                ˉᐧ0.getClass();
                try {
                    new CLS556(activity0, (TextUtils.isEmpty(ˉᐧ0.FLD5207) ? ˉᐧ0.FLD5214 : ˉᐧ0.FLD5207), ˉᐧ0.FLD5214, ((CLS555)new CLS1255(ˉᐧ0, ـﹳ0, 12)), false).MTH7432();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 2: {
                if(((CLS1617)object2).FLD5154 == null) {
                    CLS380 ʼˎ0 = new CLS380(((Activity)object1), ((CLS1617)object2).FLD5158);
                    ((CLS1617)object2).FLD5154 = ʼˎ0;
                    ʼˎ0.FLD3518 = new CLS1229(15, ((CLS1617)object2));
                }
                CLS380 ʼˎ1 = ((CLS1617)object2).FLD5154;
                if(ʼˎ1 != null && !ʼˎ1.isShowing()) {
                    ((CLS1617)object2).FLD5154.show();
                }
                View.OnClickListener view$OnClickListener0 = ((CLS1617)object2).FLD5157;
                if(view$OnClickListener0 != null) {
                    view$OnClickListener0.onClick(((CLS1626)object0).MTH803());
                }
                return;
            }
            case 3: {
                ((CLS1617)object2).getClass();
                if(((LinearLayout)object1).getVisibility() == 0) {
                    ((LinearLayout)object1).setVisibility(8);
                    if(((CLS1626)object0).FLD5295) {
                        ((CLS1626)object0).FLD5305.setRotation(90.0f);
                        return;
                    }
                }
                else {
                    View.OnClickListener view$OnClickListener1 = ((CLS1617)object2).FLD5157;
                    if(view$OnClickListener1 != null) {
                        view$OnClickListener1.onClick(((CLS1626)object0).MTH803());
                    }
                    ((LinearLayout)object1).setVisibility(0);
                    if(((CLS1626)object0).FLD5295) {
                        ((CLS1626)object0).FLD5305.setRotation(-90.0f);
                    }
                }
                return;
            }
            case 4: {
                CLS1621 ˎᵢ0 = (CLS1621)object2;
                Activity activity1 = (Activity)object1;
                CLS1626 ـﹳ1 = (CLS1626)object0;
                ˎᵢ0.getClass();
                try {
                    CLS395.MTH5726(activity1, ˎᵢ0.FLD5241, ((CLS12)new CLS568(ˎᵢ0, ـﹳ1, 1)), ˎᵢ0.FLD5234, ˎᵢ0.FLD5232, ˎᵢ0.FLD5236);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 5: {
                CLS1616 ʻˏ0 = (CLS1616)object2;
                Activity activity2 = (Activity)object1;
                CLS1626 ـﹳ2 = (CLS1626)object0;
                ʻˏ0.getClass();
                try {
                    CLS395.MTH5739(activity2, ʻˏ0.FLD5143, ʻˏ0.FLD5137, new CLS568(ʻˏ0, ـﹳ2, 2));
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 6: {
                ((CLS244)object2).getClass();
                CLS523.MTH7142(((Activity)object1), ((CLS11)new CLS1034(((CLS244)object2), ((CLS91)object0))));
                return;
            }
            case 7: {
                ((CLS210)object2).getClass();
                CLS523.MTH7142(((Activity)object1), ((CLS11)new CLS975(((CLS210)object2), ((CLS91)object0))));
                return;
            }
            case 8: {
                ((CLS1112)object2).getClass();
                CLS523.MTH7142(((Activity)object1), ((CLS11)new CLS1108(((CLS1112)object2), ((CLS86)object0))));
                return;
            }
            case 9: {
                ((CLS1112)object2).getClass();
                ArrayList arrayList1 = new ArrayList();
                CLS371 ʻ0 = ((CLS1112)object2).FLD2472;
                if("friends".equals(((String)object1))) {
                    ʻ0.MTH5381(((CLS1112)object2).FLD2157, arrayList1);
                }
                else if("chatroom".equals(((String)object1))) {
                    ʻ0.MTH5313(((CLS1112)object2).FLD2157, arrayList1);
                }
                CLS1111 ᐧˏ$ᵔʾ0 = new CLS1111(((CLS1112)object2), ((String)object1));
                String s2 = CLS34.MTH1079(4100646161457402677L, new StringBuilder(), ((String)object1), 0x38E86BFA2B3CD335L);
                CLS387.MTH5585(true, ((Activity)object0), arrayList1, ((CLS2)ᐧˏ$ᵔʾ0), ((CLS1112)object2).FLD2151.MTH925(s2, ""), -1);
                return;
            }
            case 10: {
                ((CLS928)object2).getClass();
                CLS523.MTH7164(((Activity)object1), ((CLS16)new CLS1156(((CLS928)object2), ((CLS1622)object0), 4)));
                return;
            }
            case 11: {
                ((CLS1019)object2).getClass();
                CLS523.MTH7142(((Activity)object1), ((CLS11)new CLS990(((String)object0))));
                return;
            }
            case 12: {
                CLS1019 ˎʻ0 = (CLS1019)object2;
                JSONObject jSONObject1 = (JSONObject)object1;
                ˎʻ0.getClass();
                String s3 = jSONObject1.optString("chatroom_intro_text", "");
                if(!TextUtils.isEmpty(s3)) {
                    try {
                        JSONArray jSONArray0 = new JSONArray();
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("checked", true);
                        jSONObject3.put("type", 1);
                        jSONObject3.put("desc", s3);
                        jSONObject3.put("msg", s3);
                        jSONArray0.put(jSONObject3);
                        jSONObject2.put("response", jSONArray0);
                        CLS91 ᵔʾ1 = new CLS91(1, "", jSONObject2.toString(), "_CHATROOM_INTRO_template");
                        ˎʻ0.FLD2090.MTH1182(ᵔʾ1);
                        ᵔʾ0 = ᵔʾ1;
                        jSONObject1.put("chatroom_intro_text", "");
                        ᵔʾ0 = ᵔʾ1;
                    }
                    catch(Throwable throwable3) {
                        CLS27.MTH893(throwable3);
                    }
                }
                String s4 = jSONObject1.optString("_CHATROOM_INTRO_template", "");
                if(!TextUtils.isEmpty(s4)) {
                    try {
                        ᵔʾ0 = new CLS91(new JSONObject(s4));
                    }
                    catch(Throwable throwable4) {
                        CLS27.MTH893(throwable4);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                if(ᵔʾ0 != null) {
                    arrayList2.add(ᵔʾ0);
                }
                CLS210 ˋʼ0 = new CLS210(((Activity)object0), ˎʻ0.FLD2157);
                String s5 = CLS27.MTH889("chatroom_intro");
                CLS1274 ﾞˎ0 = new CLS1274(arrayList2, jSONObject1, 17);
                ˋʼ0.FLD1998 = "_CHATROOM_INTRO_template";
                ˋʼ0.FLD2003 = ﾞˎ0;
                ˋʼ0.FLD2009 = true;
                ˋʼ0.FLD2023 = false;
                ˋʼ0.FLD2010 = arrayList2;
                if(arrayList2.isEmpty()) {
                    z = true;
                }
                ˋʼ0.MTH3743(((int)z), s5);
                return;
            }
            case 13: {
                CLS371 ʻ1 = ((CLS899)object2).FLD1658;
                ʻ1.getClass();
                Cursor cursor0 = ʻ1.MTH5307(CLS27.MTH882("q_db40"), null);
                ArrayList arrayList3 = new ArrayList();
                if(cursor0 != null) {
                    String s6 = CLS27.MTH904();
                    if(cursor0.moveToFirst()) {
                        while(true) {
                            String s7 = CLS182.MTH3472(0x38EAA3272B3CD335L, cursor0);
                            if(CLS502.MTH6934(ʻ1.MTH5335(s7), new String[]{s6})) {
                                arrayList3.add(new CLS78(s7, ʻ1.MTH5316(s7)));
                            }
                            if(!cursor0.moveToNext()) {
                                break;
                            }
                        }
                    }
                    cursor0.close();
                }
                CLS387.MTH5585(true, ((Activity)object1), arrayList3, ((CLS2)new CLS1041(((CLS1629)object0))), "", -1);
                return;
            }
            case 14: {
                ((CLS899)object2).getClass();
                ArrayList arrayList4 = CLS371.FLD3470.MTH5373();
                CLS523.MTH7163(true, ((Activity)object1), CLS27.MTH889("existing_label_select"), arrayList4, ((CLS7)new CLS1156(((CLS899)object2), ((CLS1626)object0), 7)));
                return;
            }
            case 15: {
                ((CLS899)object2).getClass();
                CLS523.MTH7164(((Activity)object1), ((CLS16)new CLS1189(((CLS899)object2), ((CLS1622)object0))));
                return;
            }
            case 16: {
                ((CLS216)object2).getClass();
                if(TextUtils.isEmpty(((String)object1))) {
                    CLS412.MTH6013(((Activity)object0), CLS27.MTH889("please_select_contact"));
                    return;
                }
                Object[] arr_object = {new CLS1024(((CLS216)object2), ((String)object1))};
                CLS21.FLD76.MTH818("selectImg2", arr_object);
                return;
            }
            case 17: {
                ((CLS1105)object2).FLD2415 = (CLS1626)object1;
                ((CLS1105)object2).FLD2416 = (String)object0;
                ((CLS1105)object2).MTH4175();
                return;
            }
            case 18: {
                ((CLS1105)object2).getClass();
                String s8 = CLS182.MTH3484(4100579726903268149L, new StringBuilder(), ((String)object0));
                ((CLS1105)object2).FLD2414.getClass();
                CLS485.MTH6721(((Activity)object1), s8);
                return;
            }
            case 19: {
                ((CLS1078)object2).getClass();
                ((CLS316)object0).getClass();
                ((CLS1078)object2).MTH4072(((CLS99)object1), "", new CLS978(((CLS316)object0), 0));
                return;
            }
            case 20: {
                CLS27.MTH895().MTH922(Boolean.TRUE, ((String)object2));
                ((AlertDialog[])object1)[0].dismiss();
                ((CLS11)object0).MTH790();
                return;
            }
            case 21: {
                String s9 = CLS27.MTH889("exclude_wxid_module_load");
                String s10 = CLS27.MTH889("confirmation");
                CLS1600 ﹶי0 = new CLS1600(((CLS335)object0), ((ArrayList)object1));
                CLS523.MTH7160(((Activity)object2), s9, ((CLS17)new CLS783(((Activity)object2), s10, false)), ((CLS11)ﹶי0));
                return;
            }
            case 22: {
                Activity activity3 = (Activity)object2;
                ArrayList arrayList5 = (ArrayList)object1;
                CLS29 ˎᵢ1 = (CLS29)object0;
                try {
                    CLS387.MTH5585(false, activity3, arrayList5, ((CLS2)new CLS1539(ˎᵢ1)), ˎᵢ1.MTH925("werun_excl", ""), -1);
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                }
                return;
            }
            case 23: {
                String[] arr_s = (String[])object2;
                CLS1622 ˑٴ0 = (CLS1622)object1;
                String s11 = (String)object0;
                try {
                    if(TextUtils.isEmpty(arr_s[0])) {
                        file0 = null;
                    }
                    else {
                        file0 = new File(arr_s[0]);
                        z = file0.canWrite();
                    }
                    if(!z) {
                        file0 = CLS31.MTH1038(CLS27.MTH900());
                    }
                    File file1 = new File(file0, ˑٴ0.MTH7285() + ".amr");
                    CLS69 ʾᵢ0 = new CLS69(s11);
                    try {
                        if(CLS31.MTH1029(ʾᵢ0)) {
                            ᵔʾ0 = CLS31.MTH1020(ʾᵢ0.MTH1554());
                        }
                    }
                    catch(Throwable throwable7) {
                        throwable7.printStackTrace();
                    }
                    if(CLS31.MTH1033(file1, ((byte[])ᵔʾ0))) {
                        if(!z) {
                            CLS31.MTH996(file1.getAbsolutePath());
                            CLS466.MTH6506(file1);
                            return;
                        }
                        CLS412.MTH6013(CLS27.MTH900(), CLS27.MTH889("file_written_to") + file1.getAbsolutePath());
                        return;
                    }
                }
                catch(Throwable throwable6) {
                    CLS27.MTH893(throwable6);
                }
                return;
            }
            case 24: {
                new CLS216(((Activity)object2)).MTH3842(((String)object1), ((CLS79)object0).MTH1625(((String)object1)));
                return;
            }
            case 25: {
                CLS523.MTH7165(((Activity)object2), CLS27.MTH889("ban"), CLS27.MTH889("reason"), "", 1, ((CLS16)new CLS1049(((String)object1), ((String)object0), view0, 26)));
                return;
            }
            case 26: {
                CLS21.FLD76.MTH818("dialogUnban", new Object[]{((String)object2), ((String)object1)});
                ((CLS1625)object0).FLD5287 = false;
                LinearLayout linearLayout0 = ((CLS1625)object0).FLD5289;
                if(linearLayout0 != null) {
                    linearLayout0.setActivated(false);
                }
                return;
            }
            case 27: {
                ArrayList arrayList6 = (ArrayList)CLS21.FLD76.MTH836("getNearbyList", new Object[0]);
                if(arrayList6 != null && !arrayList6.isEmpty()) {
                    ArrayList arrayList7 = new ArrayList();
                    for(Object object3: arrayList6) {
                        ContentValues contentValues0 = (ContentValues)object3;
                        CLS78 ˊﾞ0 = new CLS78(contentValues0.getAsString("username"), contentValues0.getAsString("nickname"));
                        if(contentValues0.containsKey("sex")) {
                            ˊﾞ0.FLD278 = CLS182.MTH3474(0x38EAF1912B3CD335L, contentValues0);
                        }
                        if(contentValues0.containsKey("place")) {
                            ˊﾞ0.FLD277 = contentValues0.getAsString("place");
                        }
                        arrayList7.add(ˊﾞ0);
                    }
                    ((CLS363)(((CLS1266)object2))).MTH5264(arrayList7);
                    CLS1624 יﹳ0 = new CLS1624(((Activity)object1));
                    יﹳ0.MTH7305(new CLS501(((CLS1266)object2), ((Activity)object1), 2));
                    CLS387.MTH5584(false, ((Activity)object1), arrayList7, ((CLS2)new CLS1315(((CLS29)object0))), null, "", -1, יﹳ0, ((CLS363)(((CLS1266)object2))));
                }
                return;
            }
            default: {
                JSONObject jSONObject0 = CLS27.MTH895().MTH921("invite_key_tags");
                String s = jSONObject0.optString(((String)object2));
                ArrayList arrayList0 = new ArrayList();
                CLS371.FLD3470.MTH5330(arrayList0);
                CLS372.MTH5405(arrayList0);
                CLS387.MTH5585(false, ((Activity)object1), arrayList0, ((CLS2)new CLS1296(jSONObject0, ((String)object2), ((CLS3)object0))), s, -1);
            }
        }
    }
}

