// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Environment;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS91;
import b.ˈˊ.CLS1640;
import b.ˈˊ.CLS587;
import b.ˈˊ.CLS99;
import b.ˊﾞ.CLS612;
import b.ˑٴ.CLS140;
import b.ˑٴ.CLS629;
import b.ˑٴ.CLS658;
import b.ˑٴ.CLS692;
import b.ˑٴ.CLS702;
import b.ˑٴ.CLS818;
import b.ˑٴ.CLS881;
import b.יᐧ.CLS151;
import b.יﹳ.CLS167;
import b.ـˏ.CLS886;
import b.ـˏ.CLS888;
import b.ـˏ.CLS889;
import b.ـˏ.CLS894;
import b.ـˏ.CLS895;
import b.ᐧˉ.CLS1078;
import b.ᐧˉ.CLS1105;
import b.ᐧˉ.CLS1112;
import b.ᐧˉ.CLS1146;
import b.ᐧˉ.CLS1156;
import b.ᐧˉ.CLS174;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS943;
import b.ᐧˉ.CLS957;
import b.ᵔʾ.CLS1255;
import b.ᵔʾ.CLS309;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1362;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS462;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS507;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1620;
import b.ﾞٴ.CLS1636;
import b.ﾞᐧ.CLS557;
import b.ﾞᐧ.CLS559;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1274 implements CLS3 {
    public final int FLD3432;
    public final Object FLD3433;
    public final Object FLD3434;

    public CLS1274(Object object0, Object object1, int v) {
        this.FLD3432 = v;
        this.FLD3433 = object0;
        this.FLD3434 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        long v1;
        Activity activity0;
        Object object0 = this.FLD3434;
        Object object1 = this.FLD3433;
        switch(this.FLD3432) {
            case 0: {
                ((CLS335)object1).getClass();
                if(((Set)object0).isEmpty()) {
                    CLS1270 ـˏ0 = new CLS1270(((CLS335)object1), 1);
                    CLS40.FLD157.MTH1116(((CLS39)ـˏ0));
                }
                return;
            }
            case 1: {
                ((CLS338)object1).getClass();
                if(((Set)object0).isEmpty()) {
                    CLS1271 ᐧˉ0 = new CLS1271(((CLS338)object1), 1);
                    CLS40.FLD157.MTH1116(((CLS39)ᐧˉ0));
                }
                return;
            }
            case 2: {
                ((CLS359)object1).getClass();
                if(((Set)object0).isEmpty()) {
                    CLS1272 ⁱʽ0 = new CLS1272(((CLS359)object1), 1);
                    CLS40.FLD157.MTH1116(((CLS39)ⁱʽ0));
                }
                return;
            }
            case 3: {
                ((CLS888)object1).getClass();
                ((CLS888)object1).FLD1600 = ((File)object0).getAbsolutePath();
                return;
            }
            case 4: {
                ((CLS895)object1).getClass();
                ((CLS895)object1).FLD1626 = ((File)object0).getAbsolutePath();
                return;
            }
            case 5: {
                ((CLS886)object1).FLD1596 = (File)object0;
                return;
            }
            case 6: {
                ((CLS889)object1).FLD1604 = (File)object0;
                return;
            }
            case 7: {
                ((CLS894)object1).getClass();
                CLS1255 ᵢﹶ0 = new CLS1255(((CLS894)object1), ((File)object0), 10);
                CLS40.FLD157.MTH1124(((CLS39)ᵢﹶ0));
                return;
            }
            case 8: {
                ((CLS1640)object1).getClass();
                ((CLS1640)object1).FLD421.clear();
                ((CLS1640)object1).FLD421.add(((JSONObject)object0).toString());
                return;
            }
            case 9: {
                if(!((List)object1).isEmpty() && ((List)object1).size() == ((ArrayList)object0).size()) {
                    for(Object object2: ((List)object1)) {
                        CLS21.FLD76.MTH817("mf", "post_moment", new Object[]{((String)object2)});
                    }
                }
                return;
            }
            case 10: {
                ((CLS587)object1).getClass();
                ((CLS587)object1).FLD421.clear();
                ((CLS587)object1).FLD421.add(((JSONObject)object0).toString());
                return;
            }
            case 11: {
                ((CLS658)object1).getClass();
                CLS658.MTH2150(((String)object0), null);
                return;
            }
            case 12: {
                CLS818 ᵎⁱ0 = (CLS818)object1;
                CLS167 ᵔʾ1 = (CLS167)object0;
                ᵎⁱ0.getClass();
                try {
                    CLS387.MTH5596(((CLS140)ᵎⁱ0).MTH3042(), ᵔʾ1.MTH3205());
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 13: {
                ((CLS629)object1).getClass();
                ((CLS12)object0).MTH791(Boolean.valueOf(((CLS629)object1).FLD1445.MTH938("sns_img_add_img_watermark", false)));
                return;
            }
            case 14: {
                CLS523.MTH7165(((CLS140)(((CLS881)object1))).MTH3042(), CLS27.MTH889("rename"), "", ((CLS881)object1).FLD1495.FLD398, 1, ((CLS16)new CLS1255(((CLS881)object1), ((CLS1620)object0), 24)));
                return;
            }
            case 15: {
                ((CLS174)object1).getClass();
                CLS523.MTH7142(((Activity)object0), ((CLS11)new CLS943(((CLS174)object1))));
                return;
            }
            case 16: {
                ((CLS1112)object1).getClass();
                CLS523.MTH7142(((Activity)object0), ((CLS11)new CLS1146(((CLS1112)object1))));
                return;
            }
            case 17: {
                ArrayList arrayList0 = (ArrayList)object1;
                JSONObject jSONObject0 = (JSONObject)object0;
                try {
                    if(arrayList0.isEmpty()) {
                        jSONObject0.put("_CHATROOM_INTRO_template", "");
                        return;
                    }
                    jSONObject0.put("_CHATROOM_INTRO_template", ((CLS91)arrayList0.get(0)).MTH1733().toString());
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 18: {
                ((CLS1105)object1).getClass();
                CLS29 ˎᵢ0 = ((CLS1105)object1).FLD2151;
                boolean z = ˎᵢ0.MTH938("transfer_money_notification_enable", false);
                CLS485 ᐧﾞ0 = ((CLS1105)object1).FLD2414;
                if(z) {
                    ᐧﾞ0.getClass();
                    CLS485.MTH6726(((Activity)object0), "transfer_money_");
                }
                if(((CLS1105)object1).FLD2153.MTH6895("total_amount_notification") && ˎᵢ0.MTH938("total_amount_notification_enable", false)) {
                    ᐧﾞ0.getClass();
                    CLS485.MTH6726(((Activity)object0), "rpamount_");
                }
                if(ˎᵢ0.MTH938("red_packet_notif_only_enable", false)) {
                    ᐧﾞ0.getClass();
                    CLS485.MTH6726(((Activity)object0), "red_packet_notif_only_");
                }
                return;
            }
            case 19: {
                ((CLS1078)object1).FLD2313.getClass();
                CLS309.MTH4947(((CLS99)object0));
                ((CLS1078)object1).FLD2317.notifyDataSetChanged();
                return;
            }
            case 21: {
                ((CLS507)object1).getClass();
                if(((ContentValues)object0).containsKey("img")) {
                    CLS462.MTH6489(((CLS507)object1).MTH6977(), ((ContentValues)object0).getAsString("img"));
                    return;
                }
                boolean z1 = false;
                if(((ContentValues)object0).containsKey("vid")) {
                    z1 = true;
                    activity0 = ((CLS507)object1).MTH6977();
                    v1 = 4100871269283320629L;
                }
                else if(((ContentValues)object0).containsKey("mp3")) {
                    z1 = true;
                    activity0 = ((CLS507)object1).MTH6977();
                    v1 = 4100871303643058997L;
                }
                if(z1) {
                    CLS462.MTH6486(activity0, ((ContentValues)object0).getAsString(CLS370.MTH5289(v1)));
                    return;
                }
                if(((ContentValues)object0).containsKey("gif")) {
                    CLS462.MTH6487(((CLS507)object1).MTH6977(), ((ContentValues)object0).getAsString("gif"));
                }
                return;
            }
            case 22: {
                ConcurrentHashMap concurrentHashMap0 = ((CLS151)object1).FLD1539;
                if(concurrentHashMap0.containsKey(((CLS151)object1).MTH3136(object0))) {
                    concurrentHashMap0.remove(((CLS151)object1).MTH3136(object0));
                    if(((CLS151)object1).FLD1544 != null && concurrentHashMap0.isEmpty()) {
                        ((CLS151)object1).FLD1544.MTH3131(((CLS151)object1).FLD1541);
                    }
                }
                return;
            }
            case 23: {
                ((ArrayList)object1).clear();
                ((CLS347)object0).notifyDataSetChanged();
                return;
            }
            case 24: {
                CLS338 יᐧ0 = (CLS338)object1;
                String s1 = (String)object0;
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    JSONArray jSONArray0 = new JSONArray();
                    for(int v = 0; v < יᐧ0.getCount(); ++v) {
                        ContentValues contentValues0 = (ContentValues)יᐧ0.getItem(v);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("enable", יᐧ0.MTH5134(v));
                        jSONObject2.put("timeframe", contentValues0.get("timeframe"));
                        jSONArray0.put(jSONObject2);
                    }
                    jSONObject1.put("timeframes", jSONArray0);
                    CLS27.MTH895().MTH922(jSONObject1.toString(), s1);
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 25: {
                String s2 = CLS27.MTH889("add_to_web_image_fav");
                CLS395.MTH5747(((Activity)object1), ((CLS12)new CLS1362(((String[])object0), 1)), s2);
                return;
            }
            case 26: {
                ArrayList arrayList1 = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList1.add("m4a");
                arrayList1.add("mp3");
                arrayList1.add("wav");
                arrayList2.add("audio/x-m4a");
                arrayList2.add("audio/mp3");
                arrayList2.add("audio/mpeg3");
                arrayList2.add("audio/mpg");
                arrayList2.add("audio/wav");
                arrayList2.add("audio/wave");
                arrayList2.add("audio/mp4a");
                arrayList2.add("audio/*");
                CLS500 ᵢﹶ1 = CLS500.FLD4928;
                if(ᵢﹶ1.MTH6895("voice_manager")) {
                    arrayList1.add("silk");
                    arrayList1.add("slk");
                    arrayList1.add("amr");
                    arrayList2.add("audio/amr");
                    arrayList2.add("audio/silk");
                }
                if(ᵢﹶ1.MTH6895("extract_vid_audio") && CLS27.MTH895().MTH938("forward_vid_audio", true)) {
                    arrayList1.add("mp4");
                    arrayList1.add("mkv");
                    arrayList2.add("audio/mp4");
                    arrayList2.add("video/mp4");
                    arrayList2.add("video/x-matroska");
                    arrayList2.add("video/*");
                }
                CLS1156 ᵔᵎ0 = new CLS1156(((Activity)object1), ((CLS7)object0), 22);
                String s3 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                String s4 = CLS27.MTH895().MTH925("mp3_last_dir", "");
                CLS31.MTH1007(((Activity)object1), ((CLS17)ᵔᵎ0), ((CLS17)ᵔᵎ0), null, ((String[])arrayList1.toArray(new String[0])), ((String[])arrayList2.toArray(new String[0])), s3, s4);
                return;
            }
            case 27: {
                File file0 = new File(CLS31.MTH1038(((Activity)object1)), "voiceTempDir");
                CLS31.MTH974(((Activity)object1), new CLS957(((Activity)object1), file0, ((CLS3)new CLS702(file0, ((Activity)object1), ((CLS3)object0), 22)), 1));
                return;
            }
            case 28: {
                String s5 = new File(CLS31.MTH1038(CLS27.MTH900()), CLS182.MTH3475(0x38EACA0B2B3CD335L, CLS182.MTH3483(((String)object1)))).getAbsolutePath();
                if(((CLS559)object0).MTH7485(s5)) {
                    CLS31.MTH996(s5);
                    CLS466.MTH6506(new File(s5));
                }
                return;
            }
            default: {
                String s = new File(CLS31.MTH1038(CLS27.MTH900()), CLS182.MTH3475(4101312779036447541L, CLS182.MTH3483(((String)object1)))).getAbsolutePath();
                CLS692 ˉᐧ0 = new CLS692(5, s);
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                new CLS559(((CLS557)object0)).MTH7483(byteArrayOutputStream0);
                byte[] arr_b = byteArrayOutputStream0.toByteArray();
                try {
                    ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
                    CLS1636 ˆٴ0 = new CLS1636(0);
                    if(ˆٴ0.FLD5437 != null) {
                        CLS612 ᵔʾ0 = new CLS612(ˆٴ0, byteArrayInputStream0, s, ˉᐧ0, 0);
                        CLS40.FLD157.MTH1124(((CLS39)ᵔʾ0));
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

