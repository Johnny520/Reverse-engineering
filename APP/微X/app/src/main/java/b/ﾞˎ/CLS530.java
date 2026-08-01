// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS71;
import b.ˈˈ.CLS94;
import b.ˑٴ.CLS881;
import b.ᐧˉ.CLS1030;
import b.ᐧˉ.CLS1065.CLS1064;
import b.ᐧˉ.CLS1065;
import b.ᐧˉ.CLS1105;
import b.ᐧˉ.CLS1112;
import b.ᐧˉ.CLS1173;
import b.ᐧˉ.CLS174;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS210;
import b.ᐧˉ.CLS244;
import b.ᐧˉ.CLS911;
import b.ᐧˉ.CLS928;
import b.ᐧˉ.CLS931.CLS929;
import b.ᐧˉ.CLS931.CLS930;
import b.ᐧˉ.CLS931;
import b.ᐧˉ.CLS946.CLS945;
import b.ᐧˉ.CLS946;
import b.ᐧˉ.CLS961;
import b.ᐧˉ.CLS962;
import b.ᵔʾ.CLS304.CLS303;
import b.ⁱʾ.CLS319;
import b.ⁱʾ.CLS335;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1552;
import b.ⁱᵔ.CLS1574;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS387.CLS1320;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS462;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

public final class CLS530 implements View.OnClickListener {
    public final int FLD5184;
    public final Object FLD5185;
    public final Object FLD5186;

    public CLS530(int v, Activity activity0, Object object0) {
        this.FLD5184 = v;
        this.FLD5186 = activity0;
        this.FLD5185 = object0;
        super();
    }

    public CLS530(Object object0, Object object1, int v) {
        this.FLD5184 = v;
        this.FLD5185 = object0;
        this.FLD5186 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent1;
        Intent intent0;
        Object object0 = this.FLD5186;
        Object object1 = this.FLD5185;
        switch(this.FLD5184) {
            case 0: {
                ((CLS525)object1).getClass();
                CLS71 ˆٴ0 = new CLS71(((Activity)object0), null);
                LinkedHashMap linkedHashMap0 = ((CLS525)object1).FLD5146;
                for(Object object2: linkedHashMap0.keySet()) {
                    String s = (String)object2;
                    HashMap hashMap0 = ((CLS525)object1).FLD5145;
                    String s1 = hashMap0.containsKey(s) ? ((String)hashMap0.get(s)) : s;
                    CLS3 ˆٴ1 = (CLS3)linkedHashMap0.get(s);
                    ˆٴ0.FLD239.put(s1, s);
                    ˆٴ0.FLD238.put(s, ˆٴ1);
                }
                ˆٴ0.MTH1573();
                return;
            }
            case 1: {
                if(!TextUtils.isEmpty(((CLS881)object1).FLD1498)) {
                    CLS462.MTH6486(((Activity)object0), ((CLS881)object1).FLD1498);
                }
                return;
            }
            case 2: {
                ((CLS174)object1).getClass();
                String s2 = CLS27.MTH889("config_responses");
                ((CLS174)object1).FLD1678.MTH3749(s2, "ad_response_" + ((CLS303)object0).FLD3167, true);
                return;
            }
            case 3: {
                CLS174 ʻˑ0 = new CLS174(((Activity)object0), ((CLS1030)object1).FLD2157);
                Object object3 = ʻˑ0.FLD1682.get();
                ʻˑ0.FLD1681 = new CLS319(((Activity)object3), ʻˑ0.FLD1676);
                CLS523.MTH7162(true, ((Activity)object3), CLS27.MTH889("config_ad_rules"), ((CLS379)new CLS962(ʻˑ0, ((Activity)object3))), ((CLS378)new CLS962(ʻˑ0, ((Activity)object3))), null);
                return;
            }
            case 4: {
                String s3 = ((CLS244)object1).FLD2540.MTH7285();
                if(!TextUtils.isEmpty(s3) && s3.startsWith("#fav")) {
                    String[] arr_s = s3.split(" ");
                    if(arr_s.length >= 2) {
                        String s4 = arr_s[1];
                        int v = ((CLS244)object1).FLD2556.MTH6389(s4);
                        switch(v) {
                            case -1: {
                                break;
                            }
                            case 2: {
                                intent0 = new Intent();
                                intent0.putExtra("key_detail_info_id", Long.parseLong(s4));
                                if(!CLS66.MTH1515(((Activity)object0), ".ui.FavImgGalleryUI", intent0)) {
                                    intent0.setClassName(((Activity)object0), CLS27.MTH897(CLS370.MTH5289(4100639852150444853L)));
                                    ((Activity)object0).startActivity(intent0);
                                    return;
                                }
                                break;
                            }
                            case 3: {
                                intent0 = new Intent();
                                intent0.putExtra("key_detail_create_time", 0);
                                intent0.putExtra("key_detail_info_id", Long.parseLong(s4));
                                if(!CLS66.MTH1515(((Activity)object0), ".ui.detail.FavoriteVoiceDetailUI", intent0)) {
                                    intent0.setClassName(((Activity)object0), CLS27.MTH897(CLS370.MTH5289(4100640260172337973L)));
                                    ((Activity)object0).startActivity(intent0);
                                }
                                break;
                            }
                            default: {
                                if(v == 4 || v == 16) {
                                    intent0 = new Intent();
                                    intent0.putExtra("key_detail_info_id", Long.parseLong(s4));
                                    if(!CLS66.MTH1515(((Activity)object0), ".ui.detail.FavoriteSightDetailUI", intent0)) {
                                        intent0.setClassName(((Activity)object0), CLS27.MTH897(CLS370.MTH5289(4100641127755731765L)));
                                        ((Activity)object0).startActivity(intent0);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 5: {
                String s5 = ((CLS210)object1).FLD2007.MTH7285();
                if(!TextUtils.isEmpty(s5) && s5.startsWith("#fav")) {
                    String[] arr_s1 = s5.split(" ");
                    if(arr_s1.length >= 2) {
                        String s6 = arr_s1[1];
                        int v1 = ((CLS210)object1).FLD2021.MTH6389(s6);
                        switch(v1) {
                            case -1: {
                                break;
                            }
                            case 2: {
                                intent1 = new Intent();
                                intent1.putExtra("key_detail_info_id", Long.parseLong(s6));
                                if(!CLS66.MTH1515(((Activity)object0), ".ui.FavImgGalleryUI", intent1)) {
                                    intent1.setClassName(((Activity)object0), CLS27.MTH897(CLS370.MTH5289(4100605994923250485L)));
                                    ((Activity)object0).startActivity(intent1);
                                    return;
                                }
                                break;
                            }
                            case 3: {
                                intent1 = new Intent();
                                intent1.putExtra("key_detail_create_time", 0);
                                intent1.putExtra("key_detail_info_id", Long.parseLong(s6));
                                if(!CLS66.MTH1515(((Activity)object0), ".ui.detail.FavoriteVoiceDetailUI", intent1)) {
                                    intent1.setClassName(((Activity)object0), CLS27.MTH897(CLS370.MTH5289(4100606402945143605L)));
                                    ((Activity)object0).startActivity(intent1);
                                }
                                break;
                            }
                            default: {
                                if(v1 == 4 || v1 == 16) {
                                    intent1 = new Intent();
                                    intent1.putExtra("key_detail_info_id", Long.parseLong(s6));
                                    if(!CLS66.MTH1515(((Activity)object0), ".ui.detail.FavoriteSightDetailUI", intent1)) {
                                        intent1.setClassName(((Activity)object0), CLS27.MTH897(CLS370.MTH5289(4100606171016909621L)));
                                        ((Activity)object0).startActivity(intent1);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 6: {
                ((CLS1112)object1).getClass();
                ArrayList arrayList0 = new ArrayList();
                ((CLS1112)object1).FLD2472.MTH5349(((CLS1112)object1).FLD2463, arrayList0);
                CLS387.MTH5585(true, ((Activity)object0), arrayList0, ((CLS2)new CLS961(((CLS1112)object1))), ((CLS1112)object1).FLD2475, -1);
                return;
            }
            case 7: {
                CLS210 ˋʼ0 = ((CLS928)object1).FLD1726;
                String s7 = CLS27.MTH889("config_tail");
                StringBuilder stringBuilder0 = CLS182.MTH3483(((String)object0));
                stringBuilder0.append("_tail");
                ˋʼ0.MTH3749(s7, stringBuilder0.toString(), false);
                return;
            }
            case 8: {
                ((CLS911)object1).getClass();
                CLS29 ˎᵢ0 = ((CLS911)object1).FLD2151;
                if(ˎᵢ0.MTH938("$aam_start", false)) {
                    ˎᵢ0.MTH922(Boolean.FALSE, "$aam_start");
                    ((CLS1625)object0).MTH800(CLS27.MTH889("start"));
                    return;
                }
                ˎᵢ0.MTH922(Boolean.TRUE, "$aam_start");
                ((CLS1625)object0).MTH800(CLS27.MTH889("stop"));
                CLS21.FLD76.MTH818("startAAM", new Object[0]);
                return;
            }
            case 9: {
                ((CLS931)object1).getClass();
                String s8 = ((CLS931)object1).FLD2151.MTH925("mass_send_exclude", "");
                CLS930 ʼﹳ$ᵔʾ0 = new CLS930(((CLS931)object1));
                CLS387.MTH5585(true, ((Activity)object0), ((CLS931)object1).FLD1733, ((CLS2)ʼﹳ$ᵔʾ0), s8, -1);
                return;
            }
            case 10: {
                CLS931 ʼﹳ0 = (CLS931)object1;
                CLS1620 ˊˏ0 = (CLS1620)object0;
                CLS29 ˎᵢ1 = ʼﹳ0.FLD2151;
                try {
                    String s9 = ˎᵢ1.MTH925("watermark_img", "watermark");
                    CLS94 ⁱˉ0 = ʼﹳ0.FLD1732.MTH1283(s9);
                    if(ⁱˉ0 == null) {
                        ⁱˉ0 = new CLS94(ˎᵢ1.MTH925("watermark_img", "watermark"));
                    }
                    Object[] arr_object1 = {ⁱˉ0, new CLS929(ʼﹳ0, ˊˏ0)};
                    CLS21.FLD76.MTH818("show_watermark_dialog", arr_object1);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 11: {
                CLS946 ʿ0 = (CLS946)object1;
                Activity activity0 = (Activity)object0;
                ʿ0.getClass();
                try {
                    CLS945 ʿ$ˆٴ0 = new CLS945(ʿ0);
                    String s10 = ʿ0.FLD2151.MTH925("werun_excl", "");
                    CLS387.MTH5585(true, activity0, ʿ0.FLD1802, ((CLS2)ʿ$ˆٴ0), s10, -1);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 12: {
                ((CLS1173)object1).MTH4447(2, ((String)object0));
                return;
            }
            case 13: {
                String s11 = ((JSONObject)object1).optString("ringtone", "");
                Uri uri0 = TextUtils.isEmpty(s11) ? RingtoneManager.getActualDefaultRingtoneUri(((Activity)object0), 2) : Uri.parse(s11);
                Intent intent2 = new Intent("android.intent.action.RINGTONE_PICKER");
                intent2.putExtra("android.intent.extra.ringtone.TYPE", 2);
                intent2.putExtra("android.intent.extra.ringtone.TITLE", CLS27.MTH889("ringtone_selection"));
                intent2.putExtra("android.intent.extra.ringtone.EXISTING_URI", uri0);
                intent2.putExtra("android.intent.extra.ringtone.SHOW_SILENT", false);
                intent2.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                ((Activity)object0).startActivityForResult(intent2, 4001);
                return;
            }
            case 14: {
                ((CLS1105)object1).getClass();
                ((CLS1105)object1).FLD2151.MTH932("money_stat_amount_acc");
                ((CLS1105)object1).FLD2151.MTH932("money_stat_transfer_amount");
                ((CLS1105)object1).FLD2151.MTH932("money_stat_rp_chatroom_amount");
                ((CLS1105)object1).FLD2151.MTH932("money_stat_rp_amount");
                ((CLS3)object0).MTH774();
                return;
            }
            case 15: {
                CLS1064 יᴵ$ˆٴ0 = new CLS1064();
                CLS387.MTH5585(true, ((Activity)object0), ((CLS1065)object1).FLD2284, ((CLS2)יᴵ$ˆٴ0), "", -1);
                return;
            }
            case 16: {
                ArrayList arrayList1 = new ArrayList();
                CLS371.FLD3470.MTH5330(arrayList1);
                CLS387.MTH5600(false, ((Activity)object0), arrayList1, ((CLS2)new CLS1320(((Activity)object0), ((CLS1625)object1))));
                return;
            }
            case 17: {
                CLS523.MTH7165(((Activity)object0), CLS27.MTH889("extract_original_audio"), CLS27.MTH889("filename"), "", 1, ((CLS16)new CLS1552(((Activity)object0), ((String[])object1))));
                return;
            }
            default: {
                Object[] arr_object = {new CLS1574(((CLS335)object0), ((ArrayList)object1))};
                CLS21.FLD76.MTH818("selectImgMulti", arr_object);
            }
        }
    }
}

