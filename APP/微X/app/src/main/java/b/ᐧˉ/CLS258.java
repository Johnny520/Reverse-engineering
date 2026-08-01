// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS568;
import b.ˆʿ.CLS44;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS79;
import b.ˈˈ.CLS91;
import b.ˈˊ.CLS99;
import b.ˊﾞ.CLS612;
import b.ᵔʾ.CLS1259;
import b.ⁱʾ.CLS335;
import b.ⁱᵔ.CLS1356;
import b.ⁱᵔ.CLS1361;
import b.ⁱᵔ.CLS1457;
import b.ⁱᵔ.CLS1567;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS443.CLS1446;
import b.ⁱᵔ.CLS443.CLS1448;
import b.ⁱᵔ.CLS462.CLS1496.CLS1495;
import b.ⁱᵔ.CLS462.CLS1496;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞᐧ.CLS557;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS258 implements View.OnClickListener {
    public final int FLD2678;
    public final Object FLD2679;
    public final Object FLD2680;
    public final Object FLD2681;
    public final Object FLD2682;

    public CLS258(Activity activity0, CLS79 ˎᵢ0, String s, CLS1626 ـﹳ0) {
        this.FLD2678 = 9;
        super();
        this.FLD2680 = activity0;
        this.FLD2682 = ˎᵢ0;
        this.FLD2681 = s;
        this.FLD2679 = ـﹳ0;
    }

    public CLS258(Activity activity0, Object object0, Serializable serializable0, File file0, int v) {
        this.FLD2678 = v;
        this.FLD2680 = activity0;
        this.FLD2682 = object0;
        this.FLD2679 = serializable0;
        this.FLD2681 = file0;
        super();
    }

    public CLS258(Activity activity0, Object object0, Object object1, Object object2, int v) {
        this.FLD2678 = v;
        this.FLD2682 = object0;
        this.FLD2681 = object1;
        this.FLD2679 = object2;
        this.FLD2680 = activity0;
        super();
    }

    public CLS258(CLS1105 ᐧˈ0, Activity activity0, String s, CLS1622 ˑٴ0) {
        this.FLD2678 = 4;
        super();
        this.FLD2682 = ᐧˈ0;
        this.FLD2680 = activity0;
        this.FLD2681 = s;
        this.FLD2679 = ˑٴ0;
    }

    public CLS258(Object object0, Object object1, Object object2, Object object3, int v) {
        this.FLD2678 = v;
        this.FLD2682 = object0;
        this.FLD2680 = object1;
        this.FLD2679 = object2;
        this.FLD2681 = object3;
        super();
    }

    public CLS258(String s, Activity activity0, String[] arr_s, CLS1625 ـˏ0) {
        this.FLD2678 = 7;
        super();
        this.FLD2681 = s;
        this.FLD2680 = activity0;
        this.FLD2682 = arr_s;
        this.FLD2679 = ـˏ0;
    }

    public CLS258(JSONObject jSONObject0, ArrayList arrayList0, CLS335 ˑٴ0, ArrayList arrayList1) {
        this.FLD2678 = 13;
        super();
        this.FLD2679 = jSONObject0;
        this.FLD2682 = arrayList0;
        this.FLD2680 = ˑٴ0;
        this.FLD2681 = arrayList1;
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s10;
        Object object0 = this.FLD2681;
        Object object1 = this.FLD2679;
        Object object2 = this.FLD2680;
        Object object3 = this.FLD2682;
        switch(this.FLD2678) {
            case 0: {
                CLS921 ʼᴵ$ˊﾞ0 = new CLS921(((CLS928)object3), ((JSONObject)object1));
                CLS387.MTH5585(true, ((Activity)object2), ((CLS928)object3).FLD1725, ((CLS2)ʼᴵ$ˊﾞ0), ((String)object0), -1);
                return;
            }
            case 1: {
                CLS1019 ˎʻ0 = (CLS1019)object3;
                String s = (String)object0;
                String s1 = (String)object1;
                String s2 = CLS182.MTH3475(0x38E8A0FD2B3CD335L, CLS182.MTH3482(ˎʻ0, s));
                CLS29 ˎᵢ0 = ˎʻ0.FLD2151;
                String s3 = ˎᵢ0.MTH925(s2, "");
                if(!TextUtils.isEmpty(s3)) {
                    try {
                        JSONArray jSONArray0 = new JSONArray();
                        JSONObject jSONObject1 = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("checked", true);
                        jSONObject2.put("type", 1);
                        jSONObject2.put("desc", s3);
                        jSONObject2.put("msg", s3);
                        jSONArray0.put(jSONObject2);
                        jSONObject1.put("response", jSONArray0);
                        CLS91 ᵔʾ0 = new CLS91(1, "", jSONObject1.toString(), "_CHATROOM_INTRO_" + s1);
                        ˎʻ0.FLD2090.MTH1182(ᵔʾ0);
                        ˎᵢ0.MTH922("", s + "_text");
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
                CLS210 ˋʼ0 = new CLS210(((Activity)object2), ˎʻ0.FLD2157);
                String s4 = CLS182.MTH3484(4100704190760538933L, new StringBuilder(), s1);
                String s5 = CLS27.MTH889("chatroom_intro");
                ˋʼ0.FLD1998 = s4;
                ˋʼ0.FLD2009 = CLS502.MTH6934(s4, new String[]{"_MONEYTRANSFER_", "_REDPACKETS_", "_FRIENDREQUEST_INTRO_", "_CHATROOM_INTRO_", "_TYPE", "_tail", "hc_block_video_call", "_MOMENT_POST_MESSAGE_", "ad_response"});
                ˋʼ0.FLD2023 = false;
                if(ˋʼ0.FLD2001 == null) {
                    ˋʼ0.FLD2001 = (CLS44)CLS40.FLD157.MTH1118(CLS44.class);
                }
                ArrayList arrayList2 = ˋʼ0.FLD2001.MTH1181(s4);
                ˋʼ0.FLD2010 = arrayList2;
                if(arrayList2.isEmpty()) {
                    ˋʼ0.MTH3743(-1, s5);
                    return;
                }
                ˋʼ0.MTH3743(0, s5);
                return;
            }
            case 2: {
                File[] arr_file = {((File)object3), ((File)object1), ((File)object0)};
                CLS335 ˑٴ1 = new CLS335(((Activity)object2));
                ArrayList arrayList3 = new ArrayList();
                CLS523.MTH7162(true, ((Activity)object2), CLS27.MTH889("explore_finder_cache"), ((CLS379)new CLS612(arr_file, arrayList3, ˑٴ1, ((Activity)object2), 16)), ((CLS378)new CLS1049(arr_file, arrayList3, ˑٴ1, 6)), null);
                return;
            }
            case 3: {
                ((CLS1173)object3).getClass();
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(((String)object0));
                String s6 = CLS182.MTH3475(4101059972966437685L, stringBuilder0);
                ArrayList arrayList4 = new ArrayList();
                ((CLS1173)object3).FLD2717.MTH5349(((String)object1), arrayList4);
                CLS387.MTH5585(true, ((Activity)object2), arrayList4, ((CLS2)new CLS1168(((CLS1173)object3), s6)), ((CLS1173)object3).FLD2151.MTH925(s6, ""), -1);
                return;
            }
            case 4: {
                ((CLS1105)object3).getClass();
                CLS523.MTH7164(((Activity)object2), ((CLS16)new CLS1259(((CLS1105)object3), ((String)object0), ((CLS1622)object1), 28)));
                return;
            }
            case 5: {
                ((CLS1105)object3).FLD2415 = (CLS1626)object0;
                String s7 = ((JSONObject)object1).optString("rp_sound_uri", "");
                Uri uri0 = TextUtils.isEmpty(s7) ? RingtoneManager.getActualDefaultRingtoneUri(((Activity)object2), 2) : Uri.parse(s7);
                Intent intent0 = new Intent("android.intent.action.RINGTONE_PICKER");
                intent0.putExtra("android.intent.extra.ringtone.TYPE", 2);
                intent0.putExtra("android.intent.extra.ringtone.TITLE", CLS27.MTH889("ringtone_selection"));
                intent0.putExtra("android.intent.extra.ringtone.EXISTING_URI", uri0);
                intent0.putExtra("android.intent.extra.ringtone.SHOW_SILENT", false);
                intent0.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                ((Activity)object2).startActivityForResult(intent0, 1501);
                return;
            }
            case 6: {
                ((CLS1078)object3).getClass();
                ((AlertDialog[])object2)[0].dismiss();
                Activity activity0 = ((CLS219)(((CLS1078)object3))).MTH3883();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                CLS523.MTH7160(activity0, CLS27.MTH889("set_multi_days"), ((CLS17)new CLS612(((CLS1078)object3), activity0, arrayList6, arrayList5, 12)), ((CLS11)new CLS970(arrayList5, ((CLS99)object1), arrayList6, ((CLS3)object0))));
                return;
            }
            case 7: {
                ArrayList arrayList7 = new ArrayList();
                if(CLS426.MTH6126(((String)object0))) {
                    CLS371.FLD3470.MTH5371(((String)object0), arrayList7, null);
                }
                else {
                    arrayList7.add(new CLS78(((String)object0), CLS371.FLD3470.MTH5311(((String)object0))));
                    String s8 = CLS27.MTH904();
                    String s9 = CLS27.MTH904();
                    arrayList7.add(new CLS78(s8, CLS371.FLD3470.MTH5311(s9)));
                }
                CLS387.MTH5600(false, ((Activity)object2), arrayList7, ((CLS2)new CLS1356(((String[])object3), ((CLS1625)object1))));
                return;
            }
            case 8: {
                CLS31.MTH982(((Activity)object2), ((CLS12)new CLS568(((CLS1626)object3), ((String[])object1), 15)), ((File)object0).getAbsolutePath(), ((String[])object1)[0]);
                return;
            }
            case 9: {
                CLS523.MTH7165(((Activity)object2), CLS27.MTH889("rename"), "", ((CLS79)object3).MTH1625(((String)object0)), 1, ((CLS16)new CLS1049(((CLS1626)object1), ((CLS79)object3), ((String)object0), 25)));
                return;
            }
            case 10: {
                ((CLS1496)object3).getClass();
                CLS387.MTH5601(false, ((Activity)object2), ((CLS2)new CLS1495(((CLS557[])object1), ((String[])object0))), -1);
                return;
            }
            case 11: {
                Bundle bundle0 = (Bundle)object3;
                ArrayList arrayList8 = (ArrayList)object2;
                CLS335 ˑٴ2 = (CLS335)object1;
                ArrayList arrayList9 = (ArrayList)object0;
                try {
                    int v1 = bundle0.getInt("type");
                    if(v1 == 1) {
                        Object[] arr_object2 = {new CLS1446(ˑٴ2, arrayList8)};
                        CLS21.FLD76.MTH818("selectImg2", arr_object2);
                        return;
                    }
                    if(v1 == 15) {
                        Object[] arr_object3 = {new CLS1448(ˑٴ2, arrayList9)};
                        CLS21.FLD76.MTH818("selectVid", arr_object3);
                        return;
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 12: {
                JSONObject jSONObject3 = (JSONObject)object1;
                if(((ArrayList)object3).isEmpty()) {
                    CLS371.FLD3470.MTH5381(((String)object0), ((ArrayList)object3));
                }
                try {
                    if(jSONObject3.has("userlist")) {
                        s10 = jSONObject3.getString("userlist");
                    }
                    else {
                        goto label_138;
                    }
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                    s10 = "";
                }
                CLS387.MTH5585(false, ((Activity)object2), ((ArrayList)object3), ((CLS2)new CLS1361(jSONObject3)), s10, -1);
                return;
            label_138:
                s10 = "";
                CLS387.MTH5585(false, ((Activity)object2), ((ArrayList)object3), ((CLS2)new CLS1361(jSONObject3)), s10, -1);
                return;
            }
            default: {
                JSONObject jSONObject0 = (JSONObject)object1;
                ArrayList arrayList0 = (ArrayList)object3;
                CLS335 ˑٴ0 = (CLS335)object2;
                ArrayList arrayList1 = (ArrayList)object0;
                try {
                    int v = jSONObject0.getInt("type");
                    if(v == 1) {
                        Object[] arr_object = {new CLS1457(ˑٴ0, arrayList0)};
                        CLS21.FLD76.MTH818("selectImg2", arr_object);
                        return;
                    }
                    if(v == 15) {
                        Object[] arr_object1 = {new CLS1567(ˑٴ0, arrayList1)};
                        CLS21.FLD76.MTH818("selectVid", arr_object1);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

