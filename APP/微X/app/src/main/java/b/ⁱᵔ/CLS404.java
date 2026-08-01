// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.wifi.WifiManager.WifiLock;
import android.net.wifi.WifiManager;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.MenuItem;
import b.ʻˑ.CLS14;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS568;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS79;
import b.ˈˈ.CLS98;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ᐧⁱ.CLS1217;
import b.ᐧⁱ.CLS1218;
import b.ᐧⁱ.CLS1219;
import b.ᐧⁱ.CLS1220;
import b.ᐧⁱ.CLS1221;
import b.ᐧⁱ.CLS1222;
import b.ᐧⁱ.CLS1223;
import b.ⁱˉ.CLS370;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import org.json.JSONObject;

public final class CLS404 {
    public static final HashMap FLD3914;
    public static WifiManager.WifiLock FLD3915;
    public static PowerManager.WakeLock FLD3916;

    static {
        CLS404.FLD3914 = new HashMap();
    }

    public static Bitmap MTH5887() {
        return BitmapFactory.decodeResource(CLS27.MTH900().getResources(), CLS27.MTH900().getApplicationInfo().icon);
    }

    // 此方法包含解密的字符串
    public static void MTH5888(String s) {
        if(CLS66.MTH1364(s)) {
            return;
        }
        CLS371.FLD3470.getClass();
        long v = CLS404.MTH5908(2, 0L, s);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("flag", v);
        CLS371.FLD3470.MTH5342("rconversation", contentValues0, "username = ?", new String[]{s});
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH5889(ArrayList arrayList0, String s, ArrayList arrayList1) {
        if(s.startsWith("wx__c_")) {
            try {
                CLS79 ˎᵢ0 = CLS79.FLD292;
                JSONObject jSONObject0 = ˎᵢ0.MTH1650(s);
                ArrayList arrayList2 = arrayList0 == null ? CLS372.MTH5398(arrayList1) : CLS372.MTH5397(arrayList0);
                JSONObject jSONObject1 = CLS371.FLD3470.MTH5364(arrayList2);
                if(!jSONObject1.has("unread") || !jSONObject1.has("unreadCount") || jSONObject1.getInt("unread") != jSONObject0.optInt("unread") || jSONObject1.getInt("unreadCount") != jSONObject0.optInt("unreadCount") || !jSONObject1.optString("username").equals(jSONObject0.optString("username"))) {
                    ˎᵢ0.MTH1651(s, jSONObject1);
                    CLS404.MTH5898(s, ((long)(jSONObject1.has("conversationTime") ? jSONObject1.getLong("conversationTime") : System.currentTimeMillis())), CLS66.MTH1364(s));
                    CLS66.MTH1447(s);
                    return;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                return;
            }
        }
        else {
            CLS79.FLD292.MTH1653(s);
        }
        try {
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 中等(100)
    // 此方法包含解密的字符串
    public static String MTH5890(String s) {
        return TextUtils.isEmpty(s) ? CLS27.MTH895().MTH925("chatrobot_type", "") : CLS27.MTH895().MTH925(CLS182.MTH3475(4101342994131374901L, CLS182.MTH3483(s)), CLS27.MTH895().MTH925("chatrobot_type", ""));
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static Activity MTH5891() {
        return (Activity)CLS21.FLD76.MTH836("getCurrentActivity_base", new Object[0]);
    }

    // 此方法包含解密的字符串
    public static void MTH5892(Context context0) {
        if(context0 == null) {
            return;
        }
        try {
            if(!CLS27.MTH895().MTH938("wakelock_enable", !CLS412.MTH6002())) {
                CLS404.MTH5916();
                return;
            }
            if(CLS404.FLD3916 == null || !CLS404.FLD3916.isHeld()) {
                PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
                if(powerManager0 != null) {
                    PowerManager.WakeLock powerManager$WakeLock0 = powerManager0.newWakeLock(1, "X");
                    CLS404.FLD3916 = powerManager$WakeLock0;
                    powerManager$WakeLock0.acquire(5000L);
                }
            }
            if(CLS404.FLD3915 == null || !CLS404.FLD3915.isHeld()) {
                WifiManager wifiManager0 = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
                if(wifiManager0 != null) {
                    WifiManager.WifiLock wifiManager$WifiLock0 = wifiManager0.createWifiLock("X");
                    CLS404.FLD3915 = wifiManager$WifiLock0;
                    wifiManager$WifiLock0.acquire();
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static Activity MTH5893() {
        return (Activity)CLS21.FLD76.MTH836("getLauncherUI_base", new Object[0]);
    }

    // 此方法包含解密的字符串
    public static Object MTH5894(long v) {
        Object object0 = CLS166.MTH3188(CLS27.MTH894("SnsInfoClass2"), new Object[0]);
        Cursor cursor0 = CLS396.FLD3775.MTH5763(v);
        cursor0.moveToFirst();
        CLS166.MTH3195(object0, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return object0;
    }

    // 此方法包含解密的字符串
    public static void MTH5895(Activity activity0, String s) {
        try {
            Intent intent0 = new Intent();
            intent0.putExtra("sns_userName", s);
            if(!CLS66.MTH1450("sns", ".ui.SnsUserUI", intent0)) {
                intent0.setClassName(CLS390.MTH5619(activity0), CLS27.MTH897("SnsUserUI"));
                activity0.startActivity(intent0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH5896(String s, ArrayList arrayList0, ArrayList arrayList1) {
        if(s.startsWith("wx__c_")) {
            try {
                JSONObject jSONObject0 = CLS79.FLD292.MTH1650(s);
                if(jSONObject0 != null) {
                    String s1 = jSONObject0.optString("username");
                    if(TextUtils.isEmpty(s1)) {
                        return;
                    }
                    if(arrayList0.contains(s1)) {
                        HashSet hashSet0 = new HashSet((arrayList1 == null ? CLS372.MTH5398(arrayList0) : CLS372.MTH5397(arrayList1)));
                        for(Object object0: arrayList0) {
                            hashSet0.remove(((String)object0));
                        }
                        JSONObject jSONObject1 = CLS371.FLD3470.MTH5364(hashSet0);
                        if(jSONObject1 != null) {
                            CLS79.FLD292.MTH1651(s, jSONObject1);
                            CLS404.MTH5898(s, ((long)(jSONObject1.has("conversationTime") ? jSONObject1.getLong("conversationTime") : System.currentTimeMillis())), CLS66.MTH1364(s));
                            CLS66.MTH1447(s);
                            return;
                        }
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                return;
            }
        }
        else {
            CLS79.FLD292.MTH1653(s);
        }
        try {
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    public static CLS14 MTH5897(String s) {
        String s1 = CLS31.MTH970(CLS372.MTH5407().getBytes());
        String s2 = CLS404.MTH5890(s);
        String s3 = CLS182.MTH3484(4101339760021001013L, CLS182.MTH3483(s), s2);
        HashMap hashMap0 = CLS404.FLD3914;
        CLS14 ⁱʾ0 = (CLS14)hashMap0.get(s3);
        if(ⁱʾ0 == null) {
            switch(s2) {
                case "chatgpt_for_bot": {
                    ⁱʾ0 = new CLS1218();
                    break;
                }
                case "ibot_cloud": {
                    ⁱʾ0 = new CLS1217(CLS27.MTH895().MTH925("ibotAPI", ""), CLS27.MTH895().MTH925("ibotSecret", ""), s1);
                    break;
                }
                case "mly_bot": {
                    ⁱʾ0 = new CLS1221(CLS27.MTH895().MTH925("mlyAPI", ""), CLS27.MTH895().MTH925("mlySecret", ""));
                    break;
                }
                case "openai": {
                    CLS1220 ٴـ0 = new CLS1220(CLS27.MTH895().MTH925("openaiAPI", ""));
                    ٴـ0.FLD2893 = TextUtils.isEmpty(s) ? "" : s + "_";
                    ⁱʾ0 = ٴـ0;
                    break;
                }
                case "turing_robot": {
                    ⁱʾ0 = new CLS1222(CLS27.MTH895().MTH925("tulingAPI", CLS27.MTH882("turingapikey")), s1);
                    break;
                }
                case "weixin_aibot": {
                    ⁱʾ0 = new CLS1223(CLS27.MTH895().MTH925("weixinbotTOKEN", ""), s1);
                    break;
                }
                case "welm": {
                    ⁱʾ0 = new CLS1219(CLS27.MTH895().MTH925("welmAPI", ""));
                    break;
                }
                default: {
                    ⁱʾ0 = null;
                }
            }
            hashMap0.put(s3, ⁱʾ0);
        }
        return ⁱʾ0;
    }

    // 此方法包含解密的字符串
    public static void MTH5898(String s, Long long0, boolean z) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put(CLS182.MTH3479(3, contentValues0, "status", 0x38EAE0002B3CD335L), 1);
        contentValues0.put("username", s);
        contentValues0.put("content", "");
        contentValues0.put("msgType", 1);
        contentValues0.put("digestUser", "");
        contentValues0.put("attrflag", 0);
        contentValues0.put("editingMsg", "");
        contentValues0.put("atCount", 0);
        contentValues0.put("unReadMuteCount", 0);
        contentValues0.put(CLS34.MTH1063(0x38EAE0DA2B3CD335L, contentValues0, 0, 0x38EAE0E72B3CD335L), "");
        contentValues0.put("digest", "");
        contentValues0.put("unReadCount", 0);
        contentValues0.put("conversationTime", long0);
        CLS371 ʻ0 = CLS371.FLD3470;
        if(((long)long0) != 0L) {
            if(!z) {
                contentValues0.put("flag", CLS404.MTH5908(3, ((long)long0), s));
            }
            else if(CLS27.MTH895().MTH938("stickytop_lower_native", false)) {
                contentValues0.put("flag", ((long)(ʻ0.MTH5317(s) & 0xFF00000000000000L | 0x4000000000000000L)));
            }
            else {
                contentValues0.put("flag", CLS404.MTH5908(2, ((long)long0), s));
            }
        }
        ʻ0.MTH5327(contentValues0, s);
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static String MTH5899() {
        return CLS412.MTH6002() ? CLS27.MTH889("appname") : CLS182.MTH3473(0x38EAD7B72B3CD335L, CLS27.MTH895(), "wx_settings_name");
    }

    // 此方法包含解密的字符串
    public static void MTH5900(long v, String s, String s1) {
        int v1;
        if(CLS66.MTH1441(s, s1, v, 10000, 1)) {
            return;
        }
        Class class0 = CLS27.MTH894("dbClass1");
        if(class0 != null) {
            try {
                CLS166.MTH3195(CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("dbMethod1"), new Object[0]), CLS27.MTH897("dbMethod2"), new Object[0]), CLS27.MTH897("updateMsgId"), new Object[0]);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        CLS371 ʻ0 = CLS371.FLD3470;
        ʻ0.getClass();
        Cursor cursor0 = ʻ0.MTH5307(CLS27.MTH882("q_db15"), new String[]{s});
        if(cursor0 == null) {
            v1 = -1;
        }
        else {
            int v2 = cursor0.moveToFirst() ? CLS182.MTH3490(0x38EABC2F2B3CD335L, cursor0) : -1;
            cursor0.close();
            v1 = v2;
        }
        long v3 = ((long)new Random().nextInt()) + v;
        Cursor cursor1 = ʻ0.MTH5307(CLS27.MTH882("q_db8"), null);
        long v4 = -1L;
        if(cursor1 != null) {
            if(cursor1.moveToFirst()) {
                v4 = cursor1.getLong(0) + 1L;
            }
            cursor1.close();
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("msgid", v4);
        contentValues0.put("msgSvrid", v3);
        contentValues0.put(CLS182.MTH3479(3, contentValues0, CLS182.MTH3479(10000, contentValues0, "type", 0x38EAB05F2B3CD335L), 0x38EAB0662B3CD335L), v);
        contentValues0.put("talker", s);
        contentValues0.put("content", s1);
        if(v1 != -1) {
            contentValues0.put("talkerid", v1);
        }
        ʻ0.MTH5303(contentValues0, "message", "");
    }

    // 此方法包含解密的字符串
    public static boolean MTH5901() {
        Activity activity0 = CLS404.MTH5891();
        return activity0 == null ? false : CLS412.MTH6009(activity0).endsWith("ImproveSnsTimelineUI");
    }

    // 此方法包含解密的字符串
    public static ArrayList MTH5902(int v, String s) {
        HashMap hashMap2;
        String s14;
        StringBuilder stringBuilder1;
        String s4;
        String s3;
        ArrayList arrayList0 = new ArrayList();
        CLS371.FLD3470.getClass();
        Cursor cursor0 = CLS371.FLD3470.MTH5307("SELECT * FROM message WHERE talker = ? ORDER BY msgId DESC LIMIT " + Math.min(v, 5), new String[]{s});
        if(cursor0 == null) {
            return arrayList0;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("msgSvrId", cursor0.getLong(cursor0.getColumnIndex("msgSvrId")));
                contentValues0.put("msgId", cursor0.getLong(cursor0.getColumnIndex("msgId")));
                contentValues0.put("isSend", cursor0.getInt(cursor0.getColumnIndex("isSend")));
                contentValues0.put("content", cursor0.getString(cursor0.getColumnIndex("content")));
                contentValues0.put("imgPath", cursor0.getString(cursor0.getColumnIndex("imgPath")));
                contentValues0.put("talker", cursor0.getString(cursor0.getColumnIndex("talker")));
                contentValues0.put("type", cursor0.getInt(cursor0.getColumnIndex("type")));
                contentValues0.put("createTime", cursor0.getLong(cursor0.getColumnIndex("createTime")));
                try {
                    int v1 = cursor0.getColumnIndex("talkerId");
                    contentValues0.put("talkerId", ((int)(v1 == -1 ? -1 : cursor0.getInt(v1))));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                String s1 = contentValues0.getAsString("talker");
                long v2 = CLS34.MTH1080(4101346172407173941L, contentValues0);
                int v3 = CLS182.MTH3474(4101346211061879605L, contentValues0);
                int v4 = CLS182.MTH3474(4101346241126650677L, contentValues0);
                long v5 = CLS34.MTH1080(4101346262601487157L, contentValues0);
                String s2 = contentValues0.getAsString("content");
                if(CLS426.MTH6126(s1)) {
                    s3 = CLS426.MTH6109(s2);
                    s4 = CLS426.MTH6116(s1, s3);
                }
                else {
                    s4 = CLS371.FLD3470.MTH5311(s1);
                    s3 = s1;
                }
                ContentValues contentValues1 = new ContentValues();
                contentValues1.put("senderNickname", s4);
                contentValues1.put("sender", s3);
                contentValues1.put("createTime", v5);
                contentValues1.put("isSend", v3);
                String s5 = null;
                try {
                    switch(v4) {
                        case 1: {
                            if(CLS426.MTH6126(s1)) {
                                String s6 = CLS426.MTH6109(s2);
                                String s7 = CLS426.MTH6106(v3, s2, s1);
                                if(!s7.startsWith("#*") || !s7.endsWith("*#")) {
                                    s2 = s7;
                                }
                                else {
                                    String s8 = CLS412.MTH5994((s1 + s6), s7);
                                    if(!CLS426.MTH6129(s8) || CLS502.MTH6934(s8, new String[]{CLS66.MTH1452(s1, CLS27.MTH904())})) {
                                        StringBuilder stringBuilder0 = new StringBuilder();
                                        stringBuilder0.append(s2.substring(0, s2.indexOf("#*")));
                                        stringBuilder0.append(s8);
                                        stringBuilder1 = stringBuilder0;
                                        s2 = stringBuilder1.toString();
                                        break;
                                    }
                                }
                            }
                            else if(s2.startsWith("#*") && s2.endsWith("*#")) {
                                s2 = CLS412.MTH5994(s1, s2);
                            }
                            break;
                        }
                        case 3: {
                            String s9 = CLS66.MTH1367(v2);
                            if(TextUtils.isEmpty(s9)) {
                                s9 = CLS66.MTH1410(contentValues0.getAsString("imgPath"));
                            }
                            if(!CLS31.MTH1021(s9)) {
                                s9 = CLS66.MTH1426(contentValues0.getAsString("imgPath"));
                            }
                            if(CLS31.MTH1024(s9)) {
                                s5 = s9;
                            }
                            s2 = CLS27.MTH889("img_summary");
                            contentValues1.put("imagePath", s5);
                            break;
                        }
                        case 34: {
                            int v6 = Integer.parseInt(s2.split(":")[1]);
                            s2 = CLS27.MTH889("audio") + ": " + v6 / 1000 + "\"";
                            break;
                        }
                        case 42: {
                            String s10 = s2.substring(s2.indexOf("nickname") + 10);
                            s2 = String.format(CLS27.MTH889("friend_card_notification"), CLS371.FLD3470.MTH5311(s1), s10.substring(0, s10.indexOf("\"")));
                            break;
                        }
                        case 0x2F: {
                            String s11 = contentValues0.getAsString("imgPath");
                            s2 = "[" + CLS27.MTH889("emoji") + "]: " + CLS66.MTH1417(s11);
                            break;
                        }
                        case 0x30: {
                            String s12 = s2.substring(s2.indexOf("label") + 7);
                            s2 = String.format(CLS27.MTH889("location_notification"), s12.substring(0, s12.indexOf("\"")));
                            break;
                        }
                        case 49: {
                            HashMap hashMap0 = CLS392.MTH5633(s2, "appmsg");
                            String s13 = hashMap0 == null || !hashMap0.containsKey(".appmsg.title") ? "" : ((String)hashMap0.get(".appmsg.title"));
                            if(hashMap0 == null || !hashMap0.containsKey(".appmsg.type")) {
                                s14 = "link";
                            }
                            else if(Integer.parseInt(((String)hashMap0.get(".appmsg.type"))) == 3) {
                                s14 = "music";
                            }
                            else {
                                s14 = "link";
                            }
                            s2 = CLS27.MTH889(s14) + s13;
                            break;
                        }
                        case 43: 
                        case 62: {
                            s2 = CLS27.MTH889("video_summary");
                            contentValues1.put("imagePath", CLS66.MTH1482(contentValues0.getAsString("imgPath")));
                            break;
                        }
                        case 0x13000031: {
                            HashMap hashMap1 = CLS392.MTH5633(s2, "appmsg");
                            if(hashMap1.containsKey(".appmsg.fromusername")) {
                                s5 = (String)hashMap1.get(".appmsg.fromusername");
                            }
                            if(TextUtils.isEmpty(s5)) {
                                int v7 = s2.indexOf("<fromusername>");
                                if(v7 != -1) {
                                    s5 = s2.substring(v7 + 14, s2.indexOf("</fromusername>"));
                                    goto label_110;
                                }
                            }
                            else {
                            label_110:
                                if(!TextUtils.isEmpty(s5)) {
                                    if(!"gh_3dfda90e39d6".equals(s5) || (hashMap1.containsKey(".appmsg.type") ? Integer.parseInt(((String)hashMap1.get(".appmsg.type"))) : 0) != 5) {
                                        s2 = "[" + ((String)hashMap1.get(".appmsg.title")) + "]: " + ((String)hashMap1.get(".appmsg.des")).trim();
                                    }
                                    else {
                                        String[] arr_s = ((String)hashMap1.get(".appmsg.des")).split("\n");
                                        s2 = "[" + ((String)hashMap1.get(".appmsg.title")) + "]: " + arr_s[2].trim();
                                    }
                                    break;
                                }
                                s2 = "";
                                break;
                            }
                            break;
                        }
                        case 0x19000031: {
                            hashMap2 = CLS392.MTH5633(s2, "appmsg");
                            s2 = "[" + ((String)hashMap2.get(".appmsg.title")) + "]: " + ((String)hashMap2.get(".appmsg.des"));
                            break;
                        }
                        case 0x1A000031: {
                            hashMap2 = CLS392.MTH5633(s2, "appmsg");
                            s2 = "[" + ((String)hashMap2.get(".appmsg.title")) + "]: " + ((String)hashMap2.get(".appmsg.wcpayinfo.sendertitle"));
                            break;
                        }
                        case 0x2D000031: 
                        case 0x3A000031: {
                            String s15 = (String)CLS392.MTH5633(s2, "appmsg").get(".appmsg.finderFeed.desc");
                            s2 = s15;
                            s2 = CLS27.MTH889("video_channel") + " " + s15;
                            break;
                        }
                        case 0x1000031: 
                        case 0x30000031: 
                        case 0x31000031: 
                        case 0x54000031: 
                        case 0x55000031: {
                            s2 = (String)CLS392.MTH5633(s2, "appmsg").get(".appmsg.title");
                            break;
                        }
                        default: {
                            s2 = "";
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                contentValues1.put("content", s2);
                arrayList0.add(contentValues1);
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        Collections.reverse(arrayList0);
        if(!arrayList0.isEmpty()) {
            arrayList0.remove(arrayList0.size() - 1);
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public static void MTH5903(String s) {
        if(!CLS66.MTH1364(s)) {
            return;
        }
        CLS371 ʻ0 = CLS371.FLD3470;
        ʻ0.getClass();
        Cursor cursor0 = ʻ0.MTH5307("select conversationTime from rconversation where username = ?", new String[]{s});
        long v = 0L;
        if(cursor0 != null) {
            if(cursor0.moveToFirst()) {
                v = cursor0.getLong(0);
            }
            if(!cursor0.isClosed()) {
                cursor0.close();
            }
        }
        long v1 = CLS404.MTH5908(3, v, s);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("flag", v1);
        ʻ0.MTH5342("rconversation", contentValues0, "username = ?", new String[]{s});
    }

    public static long MTH5904(long v, long v1) [...] // Inlined contents

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static boolean MTH5905() {
        return CLS27.MTH890("sendGifEmojiMethod1") && CLS27.MTH890("sendGifEmojiMethod2");
    }

    // 此方法包含解密的字符串
    public static String MTH5906(String s) {
        HashMap hashMap0 = new HashMap();
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = arr_s[v].split("=");
            if(arr_s1.length > 1) {
                hashMap0.put(arr_s1[0].trim(), arr_s1[1].replaceAll("\'", "").trim());
            }
            else {
                hashMap0.put(arr_s1[0].trim(), "");
            }
        }
        return ((String)hashMap0.get("lat")) + " " + ((String)hashMap0.get("lng"));
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    public static int MTH5907() {
        CLS500 ᵢﹶ0 = CLS500.FLD4928;
        if(ᵢﹶ0.MTH6895("unlimited_voice_sel")) {
            return -1;
        }
        return ᵢﹶ0.MTH6895("max_voice_sel") ? CLS27.MTH879(50, "max_voice_sel") : 9;
    }

    public static long MTH5908(int v, long v1, String s) {
        if(v1 == 0L) {
            v1 = System.currentTimeMillis();
        }
        long v2 = CLS371.FLD3470.MTH5317(s);
        switch(v) {
            case 2: {
                return v1;
            }
            case 3: {
                return v1;
            }
            case 4: {
                return 0;
            }
            case 5: {
                return v1;
            }
            case 6: {
                return v1;
            }
            case 7: {
                return 0;
            }
            default: {
                return v2 & 0xFF00000000000000L | v1 & 0xFFFFFFFFFFFFFFL;
            }
        }
    }

    // 去混淆评级： 中等(72)
    // 此方法包含解密的字符串
    public static boolean MTH5909(String s) {
        if(!TextUtils.isEmpty(s) && s.startsWith("wx_") && !CLS426.MTH6126(s) && !CLS371.FLD3470.MTH5302(s) && (CLS27.MTH895().MTH938("chatroom_container", false) || CLS27.MTH895().MTH938("chatcontainer_enable", false))) {
            if(!CLS502.MTH6934(CLS27.MTH895().MTH925("wx_chatroom_containers", ""), new String[]{s}) && !CLS502.MTH6934(s, new String[]{"wx__WORK_", "wx__MUTE_", "wx__OWN_", "wx__GH_"})) {
                return !CLS500.FLD4928.MTH6895("chatroom_container_tags") || !CLS27.MTH895().MTH938("chatroom_container_tag_enable", false) ? false : CLS502.MTH6934(CLS27.MTH895().MTH925("chatroom_container_tags", ""), new String[]{s.substring(3)});
            }
            return true;
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static void MTH5910(Activity activity0, String s) {
        CLS412.MTH6014(activity0, String.format(CLS27.MTH889("view_copy_id"), s));
        CLS412.MTH6017(activity0, s);
    }

    // 去混淆评级： 低(27)
    // 此方法包含解密的字符串
    public static ContentValues MTH5911(Cursor cursor0) {
        String s4;
        String s;
        if(cursor0 == null) {
            return null;
        }
        Class class0 = CLS27.MTH894("favItemClass");
        Class class1 = CLS27.MTH894("favClass2");
        if(class0 != null && class1 != null) {
            ContentValues contentValues0 = new ContentValues();
            try {
                Object object0 = CLS166.MTH3188(class0, new Object[0]);
                CLS166.MTH3195(object0, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
                int v = CLS166.MTH3181(object0, "field_type");
                switch(v) {
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 7: 
                    case 14: 
                    case 16: {
                        break;
                    }
                    default: {
                        if(v != 19 && v != 20 && (v != 8 && v != 18 || !CLS500.MTH6892().MTH6895("fav_wenote"))) {
                            return null;
                        }
                    }
                }
                long v1 = CLS166.MTH3185(object0, "field_localId");
                contentValues0.put("type", v);
                contentValues0.put("localId", v1);
                LinkedList linkedList0 = (LinkedList)CLS166.MTH3194(CLS166.MTH3194(object0, "field_tagProto"), CLS27.MTH897("favItemTagField"));
                if(linkedList0 == null || linkedList0.isEmpty()) {
                    s = null;
                }
                else {
                    s = TextUtils.join(",", linkedList0);
                    contentValues0.put("tag", s);
                }
                String s1 = (String)CLS166.MTH3194(object0, "field_fromUser");
                String s2 = CLS426.MTH6126(s1) ? CLS371.MTH5332().MTH5316(s1) : CLS371.MTH5332().MTH5311(s1);
                contentValues0.put("fromUser", s2);
                long v2 = CLS166.MTH3185(object0, "field_updateTime");
                contentValues0.put("updateTime", v2);
                Object object1 = CLS66.MTH1442(v1);
                Object object2 = CLS166.MTH3192(class1, CLS27.MTH897("favMethod3"), new Object[]{object1});
                SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd");
                switch(v) {
                    case 1: {
                        String s3 = (String)CLS166.MTH3194(CLS166.MTH3194(object0, "field_favProto"), CLS27.MTH892("favProto_descField", CLS27.MTH897("favArticleField1")));
                        contentValues0.put("content", s3);
                        s4 = CLS27.MTH889("text") + "<br><small><i>" + s2 + " " + simpleDateFormat0.format(new Date(v2)) + "</i></small><br>" + s3;
                        if(!TextUtils.isEmpty(s)) {
                            s4 = s4 + "<br>" + CLS27.MTH889("tags") + ": " + s;
                        }
                        contentValues0.put("desc", s4);
                        break;
                    }
                    case 2: {
                        contentValues0.put("img", CLS31.MTH992(((String)CLS166.MTH3192(class1, CLS27.MTH897("favPathMethod"), new Object[]{object2}))));
                        s4 = CLS27.MTH889("image") + "<br><small><i>" + s2 + " " + simpleDateFormat0.format(new Date(v2)) + "</i></small>";
                        if(!TextUtils.isEmpty(s)) {
                            s4 = s4 + "<br>" + CLS27.MTH889("tags") + ": " + s;
                        }
                        contentValues0.put("desc", s4);
                        break;
                    }
                    case 3: {
                        int v3 = CLS166.MTH3181(object2, CLS27.MTH892("favVoiceField2", "duration"));
                        String s5 = (String)CLS166.MTH3194(object2, CLS27.MTH897("favVoiceField1"));
                        if(!CLS31.MTH1024(s5)) {
                            s5 = CLS31.MTH992(((String)CLS166.MTH3192(class1, CLS27.MTH897("favPathMethod"), new Object[]{object2})));
                        }
                        contentValues0.put("voice", s5);
                        contentValues0.put("duration", v3);
                        s4 = CLS27.MTH889("voice") + "<br><small><i>" + s2 + " " + simpleDateFormat0.format(new Date(v2)) + "</i></small><br>" + ((double)v3) / 1000.0 + CLS27.MTH889("seconds");
                        if(!TextUtils.isEmpty(s)) {
                            s4 = s4 + "<br>" + CLS27.MTH889("tags") + ": " + s;
                        }
                        contentValues0.put("desc", s4);
                        break;
                    }
                    case 5: {
                        s4 = CLS27.MTH889("article") + "<br>" + CLS166.MTH3194(object2, CLS27.MTH892("favItemTitleField", "title")) + "<br><small><i>" + s2 + " " + simpleDateFormat0.format(new Date(v2)) + "</i></small><br>";
                        if(!TextUtils.isEmpty(s)) {
                            s4 = s4 + "<br>" + CLS27.MTH889("tags") + ": " + s;
                        }
                        contentValues0.put("desc", s4);
                        break;
                    }
                    case 7: {
                        s4 = CLS27.MTH889("music") + "<br>" + CLS166.MTH3194(object2, CLS27.MTH892("favItemTitleField", "title")) + "<br><small><i>" + s2 + " " + simpleDateFormat0.format(new Date(v2)) + "</i></small><br>";
                        if(!TextUtils.isEmpty(s)) {
                            s4 = s4 + "<br>" + CLS27.MTH889("tags") + ": " + s;
                        }
                        contentValues0.put("desc", s4);
                        break;
                    }
                    case 8: {
                        HashMap hashMap0 = CLS392.MTH5633(((String)CLS166.MTH3194(object0, "field_xml")), "favitem");
                        String s8 = "";
                        if(hashMap0.containsKey(".favitem.datalist.dataitem1.datadesc")) {
                            s8 = (String)hashMap0.get(".favitem.datalist.dataitem1.datadesc");
                        }
                        else if(hashMap0.containsKey(".favitem.datalist.dataitem.datatitle")) {
                            s8 = (String)hashMap0.get(".favitem.datalist.dataitem.datatitle");
                        }
                        else if(hashMap0.containsKey(".favitem.desc")) {
                            s8 = (String)hashMap0.get(".favitem.desc");
                        }
                        s4 = CLS27.MTH889("file") + ": " + s8 + "<br><small><i>" + s2 + " " + simpleDateFormat0.format(new Date(v2)) + "</i></small>";
                        if(!TextUtils.isEmpty(s)) {
                            s4 = s4 + "<br>" + CLS27.MTH889("tags") + ": " + s;
                        }
                        contentValues0.put("desc", s4);
                        break;
                    }
                    case 14: {
                        s4 = CLS27.MTH889("chat_history") + "<br><small><i>" + s2 + " " + simpleDateFormat0.format(new Date(v2)) + "</i></small>";
                        if(!TextUtils.isEmpty(s)) {
                            s4 = s4 + "<br>" + CLS27.MTH889("tags") + ": " + s;
                        }
                        contentValues0.put("desc", s4);
                        break;
                    }
                    case 4: 
                    case 16: {
                        String s6 = CLS31.MTH992(((String)CLS166.MTH3192(class1, CLS27.MTH897("favPathMethod"), new Object[]{object2})));
                        String s7 = CLS31.MTH992(((String)CLS166.MTH3192(class1, CLS27.MTH897("favThumbMethod"), new Object[]{object2})));
                        contentValues0.put("vid", s6);
                        contentValues0.put("img", s7);
                        s4 = CLS27.MTH889("video") + "<br><small><i>" + s2 + " " + simpleDateFormat0.format(new Date(v2)) + "</i></small>";
                        if(!TextUtils.isEmpty(s)) {
                            s4 = s4 + "<br>" + CLS27.MTH889("tags") + ": " + s;
                        }
                        contentValues0.put("desc", s4);
                        break;
                    }
                    case 18: {
                        HashMap hashMap1 = CLS392.MTH5633(((String)CLS166.MTH3194(object0, "field_xml")), "favitem");
                        s4 = CLS27.MTH889("wenote") + ": " + ((String)hashMap1.get(".favitem.datalist.dataitem1.datadesc")) + "<br><small><i>" + s2 + " " + simpleDateFormat0.format(new Date(v2)) + "</i></small>";
                        if(!TextUtils.isEmpty(s)) {
                            s4 = s4 + "<br>" + CLS27.MTH889("tags") + ": " + s;
                        }
                        contentValues0.put("desc", s4);
                        break;
                    }
                    case 19: {
                        HashMap hashMap2 = CLS392.MTH5633(((String)CLS166.MTH3194(object0, "field_xml")), "favitem");
                        s4 = CLS27.MTH889("mini_app") + ": " + ((String)hashMap2.get(".favitem.title")) + "<br><small><i>" + s2 + " " + simpleDateFormat0.format(new Date(v2)) + "</i></small>";
                        if(!TextUtils.isEmpty(s)) {
                            s4 = s4 + "<br>" + CLS27.MTH889("tags") + ": " + s;
                        }
                        contentValues0.put("desc", s4);
                        break;
                    }
                    case 20: {
                        HashMap hashMap3 = CLS392.MTH5633(((String)CLS166.MTH3194(object0, "field_xml")), "favitem");
                        String s9 = (String)hashMap3.get(".favitem.finderFeed.mediaList.media.thumbUrl");
                        if(!TextUtils.isEmpty(s9)) {
                            CLS432.MTH6182(s9, new CLS568(CLS31.MTH980(), contentValues0, 22));
                        }
                        s4 = CLS27.MTH889("video_channel_msg") + ": " + ((String)hashMap3.get(".favitem.finderFeed.desc")) + "<br><small><i>" + s2 + " " + simpleDateFormat0.format(new Date(v2)) + "</i></small>";
                        if(!TextUtils.isEmpty(s)) {
                            s4 = s4 + "<br>" + CLS27.MTH889("tags") + ": " + s;
                        }
                        contentValues0.put("desc", s4);
                    }
                }
                contentValues0.put("fav", Boolean.TRUE);
                return contentValues0;
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static void MTH5912(Object object0) {
        if(!CLS27.MTH895().MTH938("hidden_chat_menu_items_enable", false)) {
            return;
        }
        String s = CLS27.MTH895().MTH925("hidden_chat_menu_items", "");
        if(TextUtils.isEmpty(s)) {
            return;
        }
        CLS98 ﾞᐧ0 = new CLS98(object0);
        try {
            HashSet hashSet0 = new HashSet(Arrays.asList(s.split(",")));
            ArrayList arrayList0 = new ArrayList();
            for(int v1 = 0; v1 < ﾞᐧ0.MTH1775(); ++v1) {
                MenuItem menuItem0 = ﾞᐧ0.MTH1771(v1);
                if(hashSet0.contains(((String)menuItem0.getTitle()))) {
                    arrayList0.add(menuItem0.getItemId());
                }
            }
            if(!arrayList0.isEmpty()) {
                int v2 = Math.min(CLS27.MTH903(arrayList0.size(), "HideChatMenuItemsMax"), arrayList0.size());
            label_18:
                for(int v = 0; v < v2; ++v) {
                    ﾞᐧ0.MTH1776(((int)(((Integer)arrayList0.get(v)))));
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            if(true) {
                return;
            }
            goto label_18;
        }
    }

    public static int MTH5913(String s) {
        CLS29 ˎᵢ0 = CLS27.MTH895();
        if(CLS182.MTH3480(4101342122253013813L, CLS182.MTH3483(s), ˎᵢ0, false)) {
            CLS29 ˎᵢ1 = CLS27.MTH895();
            return CLS34.MTH1064(0x38EAE4822B3CD335L, CLS182.MTH3483(s), ˎᵢ1, 5000);
        }
        return 5000;
    }

    // 此方法包含解密的字符串
    public static String MTH5914() {
        String s = CLS27.MTH895().MTH925("chatrobot_type", "");
        if(!TextUtils.isEmpty(s)) {
            return s;
        }
        switch(CLS27.MTH895().MTH927(0, "chatrobot")) {
            case -1: {
                return "mly_bot";
            }
            case 0: {
                s = CLS370.MTH5289(4101339429308519221L);
                break;
            }
            case 1: {
                s = CLS370.MTH5289(0x38EAE2082B3CD335L);
                break;
            }
            case 2: 
            case 3: {
                s = CLS370.MTH5289(4101338982631920437L);
                break;
            }
            case 4: {
                s = CLS370.MTH5289(4101339016991658805L);
                break;
            }
            case 5: {
                s = CLS370.MTH5289(4101339072826233653L);
            }
        }
        CLS27.MTH895().MTH922(-1, "chatrobot");
        CLS27.MTH895().MTH922(s, "chatrobot_type");
        return s;
    }

    // 此方法包含解密的字符串
    public static boolean MTH5915(String s, boolean z, boolean z1, boolean z2, boolean z3, boolean z4) {
        if(z2 && CLS21.FLD76.MTH830("isHidden", new Object[]{s})) {
            return true;
        }
        if(z) {
            if(z3) {
                if(CLS426.MTH6126(s)) {
                    return true;
                }
            }
            else if(CLS79.FLD292.FLD298.contains(s)) {
                return true;
            }
            return !z4 || !CLS79.FLD292.FLD284.contains(s) ? z1 && CLS79.FLD292.FLD279.contains(s) : true;
        }
        return z1 && CLS79.FLD292.FLD279.contains(s);
    }

    public static void MTH5916() {
        if(CLS404.FLD3916 != null && CLS404.FLD3916.isHeld()) {
            CLS404.FLD3916.release();
        }
        if(CLS404.FLD3915 != null && CLS404.FLD3915.isHeld()) {
            CLS404.FLD3915.release();
        }
    }
}

