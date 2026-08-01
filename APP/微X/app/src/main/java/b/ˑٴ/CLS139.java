// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.SparseArray;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS38.CLS37;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS41;
import b.ˆʿ.CLS42;
import b.ˆʿ.CLS43;
import b.ˆʿ.CLS44;
import b.ˆʿ.CLS47;
import b.ˆʿ.CLS53;
import b.ˆʿ.CLS54;
import b.ˆʿ.CLS55;
import b.ˆʿ.CLS59;
import b.ˆʿ.CLS61;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS73;
import b.ˈˈ.CLS81;
import b.ˈˈ.CLS82;
import b.ˈˈ.CLS92;
import b.ˈˊ.CLS99;
import b.יᐧ.CLS158.CLS157;
import b.יᐧ.CLS158;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.ـˏ.CLS1645;
import b.ـˏ.CLS169;
import b.ـˏ.CLS886;
import b.ـˏ.CLS887;
import b.ـˏ.CLS888;
import b.ـˏ.CLS889;
import b.ـˏ.CLS894;
import b.ـˏ.CLS895;
import b.ٴـ.CLS896.CLS170;
import b.ٴـ.CLS896;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1255;
import b.ᵔʾ.CLS1259;
import b.ᵔʾ.CLS298.CLS1236;
import b.ᵔʾ.CLS298.CLS1237;
import b.ᵔʾ.CLS298.CLS1238;
import b.ᵔʾ.CLS298.CLS296;
import b.ᵔʾ.CLS298;
import b.ᵔʾ.CLS304;
import b.ᵔʾ.CLS309;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS396;
import b.ⁱᵔ.CLS408;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS139 {
    public static final class CLS138 {
        public boolean FLD1393;
        public String FLD1394;
        public String FLD1395;
        public String FLD1396;
        public int FLD1397;
        public String FLD1398;

    }

    public boolean FLD1399;
    public final CLS896 FLD1400;
    public CLS41 FLD1401;
    public boolean FLD1402;
    public CLS44 FLD1403;
    public CLS309 FLD1404;
    public final CLS158 FLD1405;
    public final CLS92 FLD1406;
    public final CLS408 FLD1407;
    public final CLS485 FLD1408;
    public final SimpleDateFormat FLD1409;
    public boolean FLD1410;
    public CLS42 FLD1411;
    public CLS298 FLD1412;
    public Object FLD1413;
    public boolean FLD1414;
    public final CLS40 FLD1415;
    public WeakReference FLD1416;
    public CLS59 FLD1417;
    public final CLS73 FLD1418;
    public WeakReference FLD1419;
    public Handler FLD1420;
    public final CLS137 FLD1421;
    public CLS61 FLD1422;
    public WeakReference FLD1423;
    public final CLS158 FLD1424;
    public final HashMap FLD1425;
    public boolean FLD1426;
    public final CLS55 FLD1427;
    public final CLS371 FLD1428;
    public Object FLD1429;
    public WeakReference FLD1430;
    public final CLS29 FLD1431;
    public HandlerThread FLD1432;
    public CLS53 FLD1433;
    public String FLD1434;
    public CLS43 FLD1435;
    public final CLS73 FLD1436;
    public final CLS396 FLD1437;
    public final CLS500 FLD1438;
    public Object FLD1439;

    // 此方法包含解密的字符串
    public CLS139() {
        public final class CLS137 implements Runnable {
            public final CLS139 FLD1392;

            // 此方法包含解密的字符串
            @Override
            public final void run() {
                Object object0;
                boolean z = CLS466.MTH6530();
                CLS139 ﹶʼ0 = CLS139.this;
                if(!z) {
                    ﹶʼ0.FLD1399 = false;
                    Handler handler0 = ﹶʼ0.FLD1420;
                    if(handler0 != null) {
                        handler0.removeCallbacks(this);
                    }
                    return;
                }
                try {
                    if(CLS27.MTH890("snsSyncClass1")) {
                        Class class0 = CLS27.MTH894("snsSyncClass1");
                        object0 = class0 == null ? null : CLS166.MTH3188(class0, new Object[0]);
                    }
                    else if(CLS27.MTH890("snsSyncClass1_b")) {
                        Class class1 = CLS27.MTH894("snsSyncClass1_b");
                        object0 = class1 == null ? null : CLS166.MTH3188(class1, new Object[]{0x100});
                    }
                    else {
                        goto label_26;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                    object0 = null;
                }
                goto label_27;
            label_26:
                object0 = null;
            label_27:
                if(object0 != null) {
                    CLS66.MTH1521(object0);
                }
                CLS21.FLD76.MTH819("on_sns_sync_runner", new Object[0]);
                ﹶʼ0.MTH3008(false);
                int v = Math.min(CLS412.MTH6005(900000, "sns_sync_rate"), CLS412.MTH6005(900000, "mf_sns_sync_rate"));
                ﹶʼ0.FLD1420.postDelayed(this, ((long)Math.max(v, 60000)));
            }
        }


        public final class CLS865 implements CLS157 {
            public final CLS139 FLD1391;

            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3145() {
            }

            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3146(CLS158 ⁱʾ0) {
                try {
                    CLS138 ﹶʼ$ⁱʾ0 = (CLS138)ⁱʾ0.MTH3152();
                    if(ﹶʼ$ⁱʾ0 == null) {
                        return;
                    }
                    CLS139.this.MTH3021(ﹶʼ$ⁱʾ0.FLD1394, ﹶʼ$ⁱʾ0.FLD1396, ﹶʼ$ⁱʾ0.FLD1395, ﹶʼ$ⁱʾ0.FLD1398, ﹶʼ$ⁱʾ0.FLD1393);
                    CLS138 ﹶʼ$ⁱʾ1 = (CLS138)ⁱʾ0.FLD1557.peek();
                    if(ﹶʼ$ⁱʾ1 == null) {
                        return;
                    }
                    ⁱʾ0.MTH3156(((long)ﹶʼ$ⁱʾ1.FLD1397));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS866 implements CLS157 {
            public CLS866() {
                super();
            }

            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3145() {
            }

            // 此方法包含解密的字符串
            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3146(CLS158 ⁱʾ0) {
                try {
                    Bundle bundle0 = (Bundle)ⁱʾ0.MTH3152();
                    if(bundle0 == null) {
                        return;
                    }
                    CLS66.MTH1510(bundle0.getString("talker"), bundle0.getString("username"));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        this.FLD1402 = false;
        this.FLD1410 = false;
        this.FLD1415 = CLS40.FLD157;
        this.FLD1407 = (CLS408)CLS40.FLD157.MTH1118(CLS408.class);
        this.FLD1428 = CLS371.FLD3470;
        this.FLD1431 = CLS27.MTH895();
        this.FLD1424 = new CLS158(((CLS157)new CLS865(this)), 0L);
        this.FLD1405 = new CLS158(((CLS157)new CLS866()), 0L);
        this.FLD1437 = CLS396.FLD3775;
        this.FLD1400 = new CLS896("wx_forward_send_thread");
        this.FLD1421 = new CLS137(this);
        this.FLD1409 = new SimpleDateFormat(CLS27.MTH889("date_format"));
        CLS55 ᐧⁱ0 = new CLS55();
        this.FLD1427 = ᐧⁱ0;
        CLS40.FLD157.MTH1115(ᐧⁱ0);
        CLS485 ᐧﾞ0 = new CLS485();
        this.FLD1408 = ᐧﾞ0;
        CLS40.FLD157.MTH1115(ᐧﾞ0);
        this.FLD1438 = CLS500.FLD4928;
        this.FLD1436 = new CLS73();
        this.FLD1418 = new CLS73(30);
        this.FLD1406 = new CLS92(10000L);
        this.FLD1425 = new HashMap();
    }

    // 此方法包含解密的字符串
    public final boolean MTH3007(Object object0) {
        String s10;
        try {
            String s = "" + CLS166.MTH3194(object0, CLS27.MTH897("dataFieldContent"));
            String s1 = "" + CLS166.MTH3194(object0, CLS27.MTH897("dataFieldTalker"));
            String s2 = (String)CLS166.MTH3194(object0, CLS27.MTH897("dataFieldPushContent"));
            String s3 = (String)CLS166.MTH3194(object0, CLS27.MTH897("dataFieldMsgSource"));
            int v = CLS166.MTH3181(object0, CLS27.MTH897("dataFieldType"));
            long v1 = CLS166.MTH3185(object0, CLS27.MTH897("dataFieldMsgSvrId"));
            int v2 = CLS166.MTH3181(object0, CLS27.MTH897("dataFieldStatus"));
            int v3 = CLS166.MTH3181(object0, CLS27.MTH897("dataFieldCreateTime"));
            CLS29 ˎᵢ0 = this.FLD1431;
            boolean z = v == 10000 && (CLS502.MTH6934(s, new String[]{ˎᵢ0.MTH925("custom_nudging_original", CLS27.MTH889("patmsg_original"))}) && (s.endsWith(CLS27.MTH882("you")) || s.toLowerCase().endsWith("you")));
            if(v == 10002 && CLS502.MTH6934(s, new String[]{"<pat>"}) || z) {
                if(ˎᵢ0.MTH938("custom_nudging_msg_enable", false)) {
                    Object object1 = CLS166.MTH3194(object0, CLS27.MTH897("dataFieldContent"));
                    if(object1 != null) {
                        String s4 = CLS164.MTH3172(object1);
                        if(!TextUtils.isEmpty(s4)) {
                            String s5 = ˎᵢ0.MTH925("custom_nudging_original", CLS27.MTH889("patmsg_original"));
                            String s6 = ˎᵢ0.MTH925("custom_nudging_modified", CLS27.MTH889("patmsg_original"));
                            if(!TextUtils.isEmpty(s5) && !TextUtils.isEmpty(s6) && !s5.equals(s6)) {
                                String s7 = s.replace(s5, s6);
                                CLS166.MTH3198(object1, s4, s7);
                                s = s7;
                            }
                        }
                    }
                }
                String s8 = null;
                if(!z) {
                    HashMap hashMap0 = CLS392.MTH5633(s, "sysmsg");
                    String s11 = (String)hashMap0.get(".sysmsg.pat.pattedusername");
                    if(CLS27.MTH904().equals(s11)) {
                        s10 = (String)hashMap0.get(".sysmsg.pat.fromusername");
                        if(!CLS27.MTH904().equals(null)) {
                            s8 = s10;
                        }
                    }
                }
                else if(CLS426.MTH6126(s1)) {
                    String s9 = s.split(" ")[0];
                    if(s9.startsWith("\"")) {
                        s9 = s9.substring(1, s9.length() - 1);
                    }
                    if(s9.startsWith("「")) {
                        s9 = s9.substring(1, s9.indexOf("」"));
                    }
                    s10 = CLS66.MTH1432(s1, s9);
                    if(!TextUtils.isEmpty(s10)) {
                        s8 = s10;
                    }
                }
                else {
                    s8 = s1;
                }
                if(!TextUtils.isEmpty(s8)) {
                    CLS21.FLD76.MTH819("on_pat_msg", new Object[]{s1, s8});
                }
            }
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("content", s);
            contentValues0.put("talker", s1);
            contentValues0.put("type", v);
            contentValues0.put("msgSvrId", v1);
            contentValues0.put("status", v2);
            contentValues0.put("webwx", Boolean.TRUE);
            contentValues0.put("isSend", 0);
            contentValues0.put("createTime", ((long)(((long)v3) * 1000L)));
            if(!TextUtils.isEmpty(s3)) {
                HashMap hashMap1 = CLS392.MTH5633(s3, "msgsource");
                if(hashMap1 != null && !hashMap1.isEmpty()) {
                    if(hashMap1.containsKey(".msgsource.atuserlist")) {
                        String s12 = (String)hashMap1.get(".msgsource.atuserlist");
                        contentValues0.put("atuserlist", s12);
                        contentValues0.put("atusercount", ((int)CLS502.MTH6941(s12).length));
                    }
                    if(hashMap1.containsKey(".msgsource.membercount")) {
                        contentValues0.put("membercount", ((String)hashMap1.get(".msgsource.membercount")));
                    }
                }
            }
            if(!TextUtils.isEmpty(s2)) {
                contentValues0.put("webwx", Boolean.FALSE);
                HashMap hashMap2 = CLS392.MTH5633(s2, "pushcontent");
                if(hashMap2 != null && !hashMap2.isEmpty()) {
                    contentValues0.put("pushcontent", ((String)hashMap2.get(".pushcontent.$content")));
                    contentValues0.put("nickname", ((String)hashMap2.get(".pushcontent.$nickname")));
                }
            }
            Iterator iterator0 = CLS21.FLD76.MTH832("onincomingdata", new Object[]{contentValues0, object0, s3}).iterator();
            while(true) {
            label_69:
                if(!iterator0.hasNext()) {
                    return false;
                }
                Object object2 = iterator0.next();
                if(((Boolean)object2).booleanValue()) {
                    return true;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
        goto label_69;
    }

    public final void MTH3008(boolean z) {
        if(this.FLD1432 == null || !this.FLD1432.isAlive() || z) {
            HandlerThread handlerThread0 = new HandlerThread(CLS412.MTH5999(CLS370.MTH5289(0x38EC28082B3CD335L)));
            this.FLD1432 = handlerThread0;
            CLS412.MTH6000(handlerThread0);
            this.FLD1420 = new Handler(this.FLD1432.getLooper());
        }
    }

    // 此方法包含解密的字符串
    public final void MTH3009() {
        try {
            CLS29 ˎᵢ0 = this.FLD1431;
            Context context0 = CLS27.MTH900();
            CLS485 ᐧﾞ0 = this.FLD1408;
            if(!ᐧﾞ0.FLD4739) {
                ᐧﾞ0.FLD4739 = true;
            }
            CLS40 ﾞᵎ0 = this.FLD1415;
            if(context0 != null) {
                if(this.FLD1403 == null) {
                    CLS44 ˆٴ0 = new CLS44(context0);
                    this.FLD1403 = ˆٴ0;
                    ﾞᵎ0.MTH1115(ˆٴ0);
                }
                if(this.FLD1422 == null) {
                    CLS61 ﾞٴ0 = new CLS61(context0);
                    this.FLD1422 = ﾞٴ0;
                    ﾞٴ0.FLD185 = ˎᵢ0.MTH938("unify_banlist", false);
                    CLS61 ﾞٴ1 = this.FLD1422;
                    ﾞٴ1.FLD188 = ˎᵢ0.MTH938("unify_modlist", false);
                    CLS61 ﾞٴ2 = this.FLD1422;
                    ﾞٴ2.FLD186 = ˎᵢ0.MTH938("ban_timelimited", false);
                    CLS61 ﾞٴ3 = this.FLD1422;
                    ﾞٴ3.FLD187 = ˎᵢ0.MTH927(1, "max_mod_ban");
                    ﾞᵎ0.MTH1115(this.FLD1422);
                }
                if(this.FLD1411 == null) {
                    CLS42 ʾᵢ0 = new CLS42(context0);
                    this.FLD1411 = ʾᵢ0;
                    ﾞᵎ0.MTH1115(ʾᵢ0);
                }
                if(this.FLD1433 == null) {
                    CLS53 ٴـ0 = new CLS53(context0);
                    this.FLD1433 = ٴـ0;
                    ﾞᵎ0.MTH1115(ٴـ0);
                }
                if(this.FLD1401 == null) {
                    CLS41 ʻˑ0 = new CLS41(context0);
                    this.FLD1401 = ʻˑ0;
                    ﾞᵎ0.MTH1115(ʻˑ0);
                }
                this.MTH3010(context0);
                if(this.FLD1435 == null) {
                    CLS43 ˆʿ0 = new CLS43(context0);
                    this.FLD1435 = ˆʿ0;
                    ﾞᵎ0.MTH1115(ˆʿ0);
                }
            }
            if(this.FLD1417 == null) {
                this.FLD1417 = CLS59.FLD183;
                ﾞᵎ0.MTH1115(CLS59.FLD183);
            }
            if(this.FLD1438.MTH6895("ad_sender")) {
                CLS304.FLD3172.MTH4910();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH3010(Context context0) {
        CLS1238 יʼ$ˈˈ0;
        if(this.FLD1404 == null) {
            this.FLD1404 = CLS309.FLD3190;
            CLS309.FLD3190.getClass();
            CLS309.FLD3190.FLD3191 = new WeakReference(context0);
        }
        CLS500 ᵢﹶ0 = this.FLD1438;
        if(ᵢﹶ0.MTH6895("scheduled_task") || ᵢﹶ0.MTH6895("sched_tsk")) {
            CLS309 ⁱʾ0 = this.FLD1404;
            if(!ⁱʾ0.FLD3193) {
                ⁱʾ0.FLD3193 = true;
                for(Object object0: CLS309.MTH4938()) {
                    CLS99 ﾞᵎ0 = (CLS99)object0;
                    ConcurrentHashMap concurrentHashMap0 = ⁱʾ0.FLD3189;
                    if(!concurrentHashMap0.containsKey(ﾞᵎ0.FLD494)) {
                        try {
                            concurrentHashMap0.put(ﾞᵎ0.FLD494, ﾞᵎ0);
                            ⁱʾ0.MTH4944(ﾞᵎ0);
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                    }
                }
            }
        }
        if(ᵢﹶ0.MTH6895("mass_repeat_sns")) {
            if(this.FLD1412 == null) {
                this.FLD1412 = CLS298.FLD3104;
                CLS298.FLD3104.getClass();
                CLS298.FLD3104.FLD3107 = new WeakReference(context0);
            }
            CLS298 יʼ0 = this.FLD1412;
            if(!יʼ0.FLD3105) {
                יʼ0.FLD3105 = true;
                JSONArray jSONArray0 = CLS27.MTH895().MTH937("MrTasks", new JSONArray());
                int v = 0;
                while(v < jSONArray0.length()) {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        if(jSONObject0.has("id")) {
                            ConcurrentHashMap concurrentHashMap1 = יʼ0.FLD3103;
                            if(!concurrentHashMap1.containsKey(jSONObject0.getString("id"))) {
                                int v1 = jSONObject0.getInt("type");
                                switch(v1) {
                                    case 0: {
                                        CLS1238 יʼ$ˈˈ2 = new CLS1238(jSONObject0);
                                        if(יʼ$ˈˈ2.MTH4803()) {
                                            יʼ$ˈˈ0 = יʼ$ˈˈ2;
                                            goto label_50;
                                        }
                                        break;
                                    }
                                    case 1: {
                                        יʼ$ˈˈ0 = new CLS1236(jSONObject0);
                                    label_50:
                                        if(יʼ$ˈˈ0 != null) {
                                            if(((CLS296)יʼ$ˈˈ0).MTH4805() <= System.currentTimeMillis()) {
                                                ((CLS296)יʼ$ˈˈ0).MTH4801(System.currentTimeMillis() + 300000L);
                                            }
                                            concurrentHashMap1.put(((CLS296)יʼ$ˈˈ0).MTH4802(), יʼ$ˈˈ0);
                                            יʼ0.MTH4851(((CLS296)יʼ$ˈˈ0));
                                        }
                                        break;
                                    }
                                    default: {
                                        if(v1 == 2) {
                                            CLS1238 יʼ$ˈˈ1 = new CLS1237(jSONObject0);
                                            if(((CLS1237)יʼ$ˈˈ1).MTH4803()) {
                                                יʼ$ˈˈ0 = יʼ$ˈˈ1;
                                                goto label_50;
                                            }
                                        }
                                        else {
                                            יʼ$ˈˈ0 = null;
                                            goto label_50;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                    ++v;
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH3011() {
        File file0 = CLS31.MTH988();
        if(file0 == null) {
            file0 = CLS27.MTH900().getCacheDir();
        }
        File file1 = new File(file0, CLS27.MTH889("appname") + "_" + CLS27.MTH904() + "_settings.json");
        String s = this.FLD1431.MTH925("backup_time", "");
        if(!TextUtils.isEmpty(s) && CLS31.MTH1001(file1) && !CLS481.MTH6688(Long.parseLong(s, 16), 21600000L)) {
            return;
        }
        CLS1255 ᵢﹶ0 = new CLS1255(this, file1, 26);
        CLS40.FLD157.MTH1123(((CLS39)ᵢﹶ0), 3000L);
    }

    // 此方法包含解密的字符串
    public final void MTH3012(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        Object object0 = this.FLD1439;
        if(s.equals(this.FLD1434) && object0 != null) {
            try {
                String s1 = object0.getClass().getName();
                if(CLS27.MTH890("ChattingDataAdapterV3_cls1") && CLS27.MTH890("msgAdapterField2_c") && s1.equals(CLS27.MTH897("ChattingDataAdapterV3_cls1"))) {
                    CLS166.MTH3189(object0, CLS27.MTH897("msgAdapterField2_c"), true);
                }
                else if(CLS27.MTH890("ChattingDataAdapterV2") && s1.equals(CLS27.MTH897("ChattingDataAdapterV2"))) {
                    CLS166.MTH3189(object0, CLS27.MTH897("msgAdapterField2"), true);
                }
                else if(CLS27.MTH890("ChattingDataAdapter")) {
                    CLS166.MTH3189(object0, CLS27.MTH897((CLS27.MTH890("msgAdapterField2_a") ? "msgAdapterField2_a" : "msgAdapterField2")), true);
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            CLS763 ـᵎ0 = new CLS763(object0);
            CLS40.FLD157.MTH1116(((CLS39)ـᵎ0));
        }
    }

    public final void MTH3013(CLS170 ˆٴ$ˆٴ0, boolean z) {
        this.FLD1400.MTH3327(ˆٴ$ˆٴ0, z);
    }

    public final void MTH3014(Intent intent0, String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            String s1 = s.trim();
            if(!CLS66.MTH1502(intent0, s1)) {
                Activity activity0 = this.MTH3026();
                intent0.setClassName(CLS390.MTH5619(activity0), s1);
                activity0.startActivity(intent0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final Activity MTH3015() {
        WeakReference weakReference0 = this.FLD1430;
        if(weakReference0 != null) {
            Activity activity0 = (Activity)weakReference0.get();
            return activity0 == null || activity0.isFinishing() ? ((Activity)CLS21.FLD76.MTH836("getLauncherUI", new Object[0])) : activity0;
        }
        return (Activity)CLS21.FLD76.MTH836("getLauncherUI", new Object[0]);
    }

    public final void MTH3016(String s, String s1) {
        this.MTH3021(s, s1, null, null, false);
    }

    public final void MTH3017(String s, String s1) {
        try {
            long v = Long.parseLong(s1.substring(4).trim());
            this.MTH3023(CLS47.FLD167.MTH1199(v), s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH3018(CLS82 יﹳ0, String s) {
        if(יﹳ0 != null && !TextUtils.isEmpty(s) && CLS27.MTH894("voiceClass1") != null && this.FLD1438.MTH6895("voice_manager")) {
            int v = יﹳ0.MTH1675();
            try {
                ArrayList arrayList0 = CLS54.FLD172.MTH1241(יﹳ0);
                for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                    CLS894 ﾞˎ0 = new CLS894(Math.max(1, יﹳ0.MTH1679(v1)), ((InputStream)arrayList0.get(v1)));
                    if(v != -1) {
                        ﾞˎ0.FLD1624 = v;
                    }
                    this.MTH3029(new CLS170(((CLS169)ﾞˎ0), s, 0));
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    public final void MTH3019(CLS169 ˆٴ0, String s) {
        this.MTH3029(new CLS170(ˆٴ0, s, 0));
    }

    // 此方法包含解密的字符串
    public final void MTH3020(Activity activity0) {
        try {
            CLS29 ˎᵢ0 = this.FLD1431;
            if(ˎᵢ0.MTH938("fast_switch", false)) {
                ˎᵢ0.MTH922(Boolean.FALSE, "fast_switch");
                Intent intent0 = new Intent();
                intent0.putExtra("fkz_fast_switch", true);
                String s = ˎᵢ0.MTH925("fast_switch_to", "");
                if(!TextUtils.isEmpty(s)) {
                    intent0.putExtra("login_username", s);
                    if(!CLS66.MTH1502(intent0, CLS27.MTH897("LoginUI"))) {
                        intent0.setClassName(CLS390.MTH5619(activity0), CLS27.MTH897("LoginUI"));
                        activity0.startActivity(intent0);
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final void MTH3021(String s, String s1, String s2, String s3, boolean z) {
        CLS886 ʾᵢ0;
        String s30;
        Activity activity0;
        CLS894 ﾞˎ0;
        int v19;
        String s24;
        StringBuilder stringBuilder0;
        String s16;
        String s15;
        CLS771 ٴˉ0;
        String s33;
        String s34;
        Activity activity1;
        String s4 = CLS502.MTH6939(s, s1, s2);
        try {
            if(s4.startsWith(CLS370.MTH5289(4101694532909585205L)) && s4.endsWith(CLS370.MTH5289(0x38EC25742B3CD335L))) {
                this.MTH3028(s4, s1, s2, s3, z);
                return;
            }
            if(s4.startsWith(CLS370.MTH5289(4101694550089454389L))) {
                this.MTH3017(s1, s4);
                return;
            }
            if(s4.startsWith(CLS370.MTH5289(4101694571564290869L))) {
                String[] arr_s14 = s4.trim().split(CLS370.MTH5289(0x38EC25002B3CD335L));
                if(arr_s14.length > 1) {
                    File file4 = new File(this.FLD1427.MTH1254(arr_s14[1]));
                    if(CLS31.MTH1001(file4)) {
                        ʾᵢ0 = new CLS886(file4);
                        this.MTH3019(((CLS169)ʾᵢ0), s1);
                        return;
                    }
                    activity1 = this.MTH3026();
                    s34 = String.format(CLS27.MTH889(CLS370.MTH5289(4101694051873248053L)), file4.getAbsolutePath());
                    CLS412.MTH6014(activity1, s34);
                }
            }
            else if(s4.startsWith(CLS370.MTH5289(0x38EC25112B3CD335L))) {
                String[] arr_s13 = s4.trim().split(CLS370.MTH5289(0x38EC25162B3CD335L));
                if(arr_s13.length > 1) {
                    File file3 = new File(arr_s13[1]);
                    if(CLS31.MTH1001(file3)) {
                        ʾᵢ0 = new CLS886(file3);
                        this.MTH3019(((CLS169)ʾᵢ0), s1);
                        return;
                    }
                    activity1 = this.MTH3026();
                    s34 = String.format(CLS27.MTH889(CLS370.MTH5289(0x38EC25182B3CD335L)), file3.getAbsolutePath());
                    CLS412.MTH6014(activity1, s34);
                }
            }
            else if(s4.startsWith(CLS370.MTH5289(4101694210787038005L))) {
                String[] arr_s12 = s4.trim().split(CLS370.MTH5289(0x38EC25302B3CD335L));
                if(arr_s12.length > 1) {
                    s33 = arr_s12[1].trim();
                    ٴˉ0 = new CLS771(this, s33, s1, 0);
                    CLS432.MTH6173(s33, ((CLS3)ٴˉ0));
                }
            }
            else if(s4.startsWith(CLS370.MTH5289(4101694258031678261L))) {
                String[] arr_s11 = s4.trim().split(CLS370.MTH5289(0x38EC253B2B3CD335L));
                if(arr_s11.length > 1) {
                    s33 = arr_s11[1].trim();
                    ٴˉ0 = new CLS771(this, s33, s1, 1);
                    CLS432.MTH6173(s33, ((CLS3)ٴˉ0));
                }
            }
            else if(s4.startsWith(CLS370.MTH5289(4101694305276318517L))) {
                String[] arr_s10 = s4.trim().split(CLS370.MTH5289(4101694897981805365L));
                if(arr_s10.length > 1) {
                    s33 = arr_s10[1].trim();
                    ٴˉ0 = new CLS771(this, s33, s1, 2);
                    CLS432.MTH6173(s33, ((CLS3)ٴˉ0));
                }
            }
            else if(s4.startsWith(CLS370.MTH5289(4101694906571739957L))) {
                String[] arr_s9 = s4.trim().split(CLS370.MTH5289(0x38EC25D22B3CD335L));
                if(arr_s9.length > 1) {
                    s33 = arr_s9[1].trim();
                    ٴˉ0 = new CLS771(this, s33, s1, 3);
                    CLS432.MTH6173(s33, ((CLS3)ٴˉ0));
                }
            }
            else if(s4.startsWith(CLS370.MTH5289(4101694953816380213L))) {
                String[] arr_s8 = s4.trim().split(CLS370.MTH5289(4101694996766053173L));
                if(arr_s8.length > 1) {
                    s33 = arr_s8[1].trim();
                    ٴˉ0 = new CLS771(this, s33, s1, 4);
                    CLS432.MTH6173(s33, ((CLS3)ٴˉ0));
                }
            }
            else if(s4.startsWith(CLS370.MTH5289(4101695005355987765L))) {
                String s32 = s4.substring(4);
                if(CLS21.MTH821().MTH830(CLS370.MTH5289(4101695026830824245L), new Object[0])) {
                    ﾞˎ0 = new CLS894();
                    ﾞˎ0.MTH3304(s32);
                    this.MTH3019(((CLS169)ﾞˎ0), s1);
                }
            }
            else if(!s4.startsWith(CLS370.MTH5289(4101695056895595317L))) {
                boolean z1 = s4.startsWith(CLS370.MTH5289(4101694597334094645L));
                SimpleDateFormat simpleDateFormat0 = this.FLD1409;
                CLS371 ʻ0 = this.FLD1428;
                if(z1 || s4.startsWith(CLS370.MTH5289(4101694640283767605L))) {
                    if(CLS426.MTH6126(s1) || CLS27.MTH891(s1)) {
                        return;
                    }
                    String s5 = CLS370.MTH5289(0x38EC25972B3CD335L);
                    if(!s4.startsWith(CLS370.MTH5289(0x38EC25982B3CD335L))) {
                        int v1 = s4.indexOf(CLS370.MTH5289(4101694739068015413L));
                        String s6 = s4.substring(0, v1);
                        s4 = s4.substring(v1);
                        s5 = s6;
                    }
                    String[] arr_s = s4.split(CLS370.MTH5289(4101694782017688373L));
                    for(int v2 = 0; v2 < arr_s.length; ++v2) {
                        String s7 = arr_s[v2];
                        String s8 = CLS370.MTH5289(4101559709591196469L);
                        String s9 = CLS370.MTH5289(0x38EBAAD42B3CD335L);
                        if(TextUtils.isEmpty(s7)) {
                            s15 = s8;
                            s16 = s9;
                        }
                        else {
                            String s10 = CLS370.MTH5289(4101559726771065653L);
                            if(s7.contains(CLS370.MTH5289(4101559731066032949L)) && s7.contains(CLS370.MTH5289(4101559743950934837L))) {
                                int v3 = s7.indexOf(CLS370.MTH5289(0x38EBAADE2B3CD335L));
                                int v4 = s7.lastIndexOf(CLS370.MTH5289(4101559769720738613L));
                                s10 = s7.substring(v3 + 2, v4);
                                s7 = s7.substring(0, v3) + s7.substring(v4 + 2);
                            }
                            String s11 = CLS370.MTH5289(4101559782605640501L);
                            if(s7.contains(CLS370.MTH5289(4101559786900607797L)) && s7.contains(CLS370.MTH5289(4101559795490542389L))) {
                                int v5 = s7.indexOf(CLS370.MTH5289(4101559804080476981L));
                                int v6 = s7.lastIndexOf(CLS370.MTH5289(4101559812670411573L));
                                String s12 = s7.substring(v5 + 1, v6);
                                s7 = s7.substring(0, v5) + s7.substring(v6 + 1);
                                s11 = s12;
                            }
                            String s13 = CLS370.MTH5289(4101559821260346165L);
                            if(s7.contains(CLS370.MTH5289(0x38EBAAEE2B3CD335L)) && s7.contains(CLS370.MTH5289(0x38EBAAF12B3CD335L))) {
                                int v7 = s7.indexOf(CLS370.MTH5289(0x38EBAAF42B3CD335L));
                                int v8 = s7.lastIndexOf(CLS370.MTH5289(4101559864210019125L));
                                String s14 = s7.substring(v7 + 2, v8);
                                s7 = s7.substring(0, v7) + s7.substring(v8 + 2);
                                s13 = s14;
                            }
                            s15 = s7.trim();
                            s11.getClass();
                            s16 = s10.trim();
                            s13.getClass();
                        }
                        JSONObject jSONObject0 = new JSONObject();
                        if(!TextUtils.isEmpty(s16)) {
                            jSONObject0 = new JSONObject(s16);
                        }
                        String[] arr_s1 = s15.split(Pattern.quote(CLS370.MTH5289(4101694790607622965L)));
                        ArrayList arrayList0 = new ArrayList();
                        for(int v9 = 0; v9 < arr_s1.length; ++v9) {
                            String[] arr_s2 = arr_s1[v9].trim().split(CLS370.MTH5289(0x38EC25B02B3CD335L));
                            if(arr_s2.length >= 2) {
                                String s17 = arr_s2[1];
                                if(CLS426.MTH6126(s17)) {
                                    arrayList0.add(s17);
                                }
                            }
                        }
                        if(TextUtils.isEmpty(s5)) {
                            for(Object object0: arrayList0) {
                                String s18 = (String)object0;
                                if(ʻ0.MTH5337(s18, s1)) {
                                    CLS466.MTH6542(s1, String.format(CLS27.MTH889(CLS370.MTH5289(4101694807787492149L)), ʻ0.MTH5304(s1), ʻ0.MTH5316(s18)));
                                    return;
                                }
                                if(false) {
                                    break;
                                }
                            }
                            if(this.FLD1422.MTH1320(s1, arrayList0)) {
                                String s19 = String.format(CLS27.MTH889(CLS370.MTH5289(4101691084050846517L)), ʻ0.MTH5311(s1));
                                String s20 = this.FLD1422.MTH1330(s1, arrayList0);
                                if(!TextUtils.isEmpty(s20)) {
                                    s19 = s19 + CLS370.MTH5289(0x38EC225A2B3CD335L) + CLS27.MTH889(CLS370.MTH5289(0x38EC225C2B3CD335L)) + CLS370.MTH5289(4101691169950192437L) + s20;
                                }
                                if(this.FLD1422.MTH1305() && !this.FLD1422.MTH1307(s1)) {
                                    long v10 = this.FLD1422.MTH1341(s1, arrayList0);
                                    if(v10 != 0L) {
                                        s19 = s19 + CLS370.MTH5289(4101691182835094325L) + String.format(CLS27.MTH889(CLS370.MTH5289(4101691191425028917L)), simpleDateFormat0.format(new Date(v10)));
                                    }
                                }
                                ArrayList arrayList1 = this.FLD1422.MTH1303(s1, arrayList0);
                                HashSet hashSet0 = new HashSet();
                                for(Object object1: arrayList1) {
                                    String[] arr_s3 = ((String)object1).split(CLS370.MTH5289(0x38EC22732B3CD335L));
                                    hashSet0.add(CLS66.MTH1452(arr_s3[0], arr_s3[1]));
                                }
                                if(!hashSet0.isEmpty()) {
                                    s19 = s19 + CLS370.MTH5289(4101691247259603765L) + String.format(CLS27.MTH889(CLS370.MTH5289(0x38EC22772B3CD335L)), TextUtils.join(CLS370.MTH5289(0x38EC227C2B3CD335L), hashSet0));
                                }
                                ArrayList arrayList2 = this.FLD1422.MTH1309(s1, arrayList0);
                                if(!arrayList2.isEmpty()) {
                                    HashSet hashSet1 = new HashSet();
                                    for(Object object2: arrayList2) {
                                        hashSet1.add(ʻ0.MTH5316(((String)object2)));
                                    }
                                    if(!hashSet1.isEmpty()) {
                                        s19 = s19 + CLS370.MTH5289(4101691285914309429L) + CLS27.MTH889(CLS370.MTH5289(0x38EC22002B3CD335L)) + TextUtils.join(CLS370.MTH5289(4101690770518233909L), hashSet1);
                                    }
                                }
                                this.MTH3019(((CLS169)new CLS887(s19)), s1);
                                return;
                            }
                        }
                        if(jSONObject0.has(CLS370.MTH5289(4101690779108168501L))) {
                            switch(jSONObject0.optInt(CLS370.MTH5289(4101690822057841461L), 0)) {
                                case 1: {
                                    Collections.shuffle(arrayList0);
                                    break;
                                }
                                case 2: {
                                    SparseArray sparseArray0 = new SparseArray();
                                    for(Object object3: arrayList0) {
                                        String s21 = (String)object3;
                                        int v11 = CLS502.MTH6941(ʻ0.MTH5335(s21)).length;
                                        if(v11 < 500) {
                                            sparseArray0.put(v11, s21);
                                        }
                                    }
                                    arrayList0.clear();
                                    for(int v12 = 0; v12 < sparseArray0.size(); ++v12) {
                                        arrayList0.add(((String)sparseArray0.get(sparseArray0.keyAt(v12))));
                                    }
                                    break;
                                }
                                case 3: {
                                    SparseArray sparseArray1 = new SparseArray();
                                    for(Object object4: arrayList0) {
                                        String s22 = (String)object4;
                                        int v13 = CLS502.MTH6941(ʻ0.MTH5335(s22)).length;
                                        if(v13 < 500) {
                                            sparseArray1.put(v13, s22);
                                        }
                                    }
                                    arrayList0.clear();
                                    for(int v14 = 0; v14 < sparseArray1.size(); ++v14) {
                                        arrayList0.add(((String)sparseArray1.get(sparseArray1.keyAt(v14))));
                                    }
                                    Collections.reverse(arrayList0);
                                }
                            }
                        }
                        for(Object object5: arrayList0) {
                            String s23 = (String)object5;
                            if(CLS502.MTH6941(ʻ0.MTH5335(s23)).length < 500) {
                                CLS426.MTH6120(s23, s1, CLS370.MTH5289(4101690865007514421L).equals(s5), jSONObject0.optString(CLS370.MTH5289(4101690877892416309L)));
                                break;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    return;
                }
                if(s4.startsWith(CLS370.MTH5289(4101690907957187381L))) {
                    String[] arr_s7 = s4.split(CLS370.MTH5289(4101690929432023861L));
                    if(arr_s7.length > 1) {
                        CLS66.MTH1496(s1, arr_s7[1]);
                    }
                }
                else {
                    if(CLS502.MTH6934(s4, new String[]{CLS370.MTH5289(4101690938021958453L)})) {
                        int v15 = s4.indexOf(CLS370.MTH5289(4101690985266598709L));
                        this.MTH3019(((CLS169)new CLS887(s4.substring(0, v15))), s1);
                        int v16 = s4.indexOf(CLS370.MTH5289(4101691582267052853L));
                        if(v16 == -1) {
                            int v17 = s4.indexOf(CLS370.MTH5289(0x38EC22D72B3CD335L));
                            stringBuilder0 = new StringBuilder();
                            stringBuilder0.append(s4.substring(v15 + 10, v17));
                            s24 = CLS370.MTH5289(4101691724000973621L);
                        }
                        else {
                            stringBuilder0 = new StringBuilder();
                            stringBuilder0.append(s4.substring(v15 + 10, v16));
                            s24 = CLS370.MTH5289(0x38EC22CD2B3CD335L);
                        }
                        stringBuilder0.append(s24);
                        String s25 = stringBuilder0.toString();
                        if(TextUtils.isEmpty(s25)) {
                            return;
                        }
                        int v18 = s4.indexOf(CLS370.MTH5289(0x38EC22F12B3CD335L));
                        if(v18 == -1) {
                            v19 = 20000;
                        }
                        else {
                            String s26 = s4.substring(v18 + 3);
                            v19 = (int)(Double.parseDouble(s26.substring(0, s26.indexOf(CLS370.MTH5289(0x38EC22F52B3CD335L)))) * 1000.0);
                        }
                        if(ʻ0.MTH5337(s25, s1)) {
                            this.MTH3019(((CLS169)new CLS887(String.format(CLS27.MTH889(CLS370.MTH5289(4101691805605352245L)), ʻ0.MTH5311(s1), ʻ0.MTH5316(s25)))), s1);
                            return;
                        }
                        if(this.FLD1422.MTH1304(s25, s1)) {
                            String s27 = String.format(CLS27.MTH889(CLS370.MTH5289(4101691380403589941L)), ʻ0.MTH5311(s1));
                            String s28 = this.FLD1422.MTH1311(s25, s1);
                            if(!TextUtils.isEmpty(s28)) {
                                s27 = s27 + CLS370.MTH5289(0x38EC229F2B3CD335L) + CLS27.MTH889(CLS370.MTH5289(0x38EC22A12B3CD335L)) + CLS370.MTH5289(4101691466302935861L) + s28;
                            }
                            if(this.FLD1422.MTH1305()) {
                                long v20 = this.FLD1422.MTH1324(s25, s1);
                                if(v20 != 0L) {
                                    s27 = s27 + CLS370.MTH5289(0x38EC22AB2B3CD335L) + String.format(CLS27.MTH889(CLS370.MTH5289(0x38EC22AD2B3CD335L)), simpleDateFormat0.format(new Date(v20)));
                                }
                            }
                            this.MTH3019(((CLS169)new CLS887(s27)), s1);
                            return;
                        }
                        CLS40.MTH1120().MTH1123(((CLS39)new CLS1259(this, s25, s1, 12)), ((long)v19));
                        return;
                    }
                    if(s4.startsWith(CLS370.MTH5289(4101691535022412597L))) {
                        goto label_260;
                    }
                    if(CLS502.MTH6934(s4, new String[]{CLS370.MTH5289(0x38EC23422B3CD335L)})) {
                        String s29 = s4.substring(s4.indexOf(CLS370.MTH5289(4101692149202735925L)), s4.indexOf(CLS370.MTH5289(4101692170677572405L)));
                        String[] arr_s4 = s29.substring(4).trim().split(CLS370.MTH5289(0x38EC234F2B3CD335L));
                        if(arr_s4.length < 2) {
                            return;
                        }
                        int v21 = CLS412.MTH6015(Integer.parseInt(arr_s4[0]), Integer.parseInt(arr_s4[1]));
                        this.MTH3019(((CLS169)new CLS887(s4.replace(s29 + CLS370.MTH5289(4101692192152408885L), String.valueOf(v21)))), s1);
                        return;
                    }
                    if(s4.startsWith(CLS370.MTH5289(4101692205037310773L))) {
                        String[] arr_s5 = s4.split(CLS370.MTH5289(0x38EC23582B3CD335L));
                        if(arr_s5.length < 2) {
                            return;
                        }
                        ﾞˎ0 = new CLS1645(CLS66.MTH1370(arr_s5[1]));
                        this.MTH3019(((CLS169)ﾞˎ0), s1);
                        return;
                    }
                    if(s4.startsWith(CLS370.MTH5289(4101692230807114549L))) {
                        File file0 = new File(s4.substring(4).trim());
                        if(CLS31.MTH1001(file0)) {
                            ﾞˎ0 = new CLS895(file0);
                            this.MTH3019(((CLS169)ﾞˎ0), s1);
                            return;
                        }
                        activity0 = this.MTH3026();
                        s30 = String.format(CLS27.MTH889(CLS370.MTH5289(0x38EC235F2B3CD335L)), file0.getAbsolutePath());
                        CLS412.MTH6014(activity0, s30);
                        return;
                    }
                    boolean z2 = false;
                    if(s4.startsWith(CLS370.MTH5289(4101692316706460469L))) {
                        z2 = true;
                        File file1 = new File(s4.substring(4).trim());
                        if(CLS31.MTH1001(file1)) {
                            ﾞˎ0 = new CLS889(file1);
                            this.MTH3019(((CLS169)ﾞˎ0), s1);
                            return;
                        }
                        activity0 = this.MTH3026();
                        s30 = String.format(CLS27.MTH889(CLS370.MTH5289(0x38EC23732B3CD335L)), file1.getAbsolutePath());
                    }
                    else if(s4.startsWith(CLS370.MTH5289(0x38EC23022B3CD335L))) {
                        z2 = true;
                        File file2 = new File(s4.substring(5).trim());
                        if(CLS31.MTH1001(file2)) {
                            ﾞˎ0 = new CLS888(file2);
                            this.MTH3019(((CLS169)ﾞˎ0), s1);
                            return;
                        }
                        activity0 = this.MTH3026();
                        s30 = String.format(CLS27.MTH889(CLS370.MTH5289(0x38EC23082B3CD335L)), file2.getAbsolutePath());
                    }
                    if(z2) {
                        CLS412.MTH6014(activity0, s30);
                        return;
                    }
                    if(s4.startsWith(CLS370.MTH5289(4101691943044305717L))) {
                        ﾞˎ0 = new CLS888(Uri.parse(s4.substring(9).trim()));
                        this.MTH3019(((CLS169)ﾞˎ0), s1);
                        return;
                    }
                    if(s4.startsWith(CLS370.MTH5289(0x38EC23212B3CD335L))) {
                        if(CLS426.MTH6126(s1)) {
                            this.MTH3025(s1, s2);
                            return;
                        }
                        this.MTH3025(s1, s1);
                        return;
                    }
                    if(!CLS21.MTH821().MTH830(CLS370.MTH5289(4101692016058749749L), new Object[]{s4})) {
                        if(z && !TextUtils.isEmpty(s2) && CLS426.MTH6126(s1)) {
                            CLS66.MTH1393(s1, CLS426.MTH6125(s1, s2) + (TextUtils.isEmpty(s3) ? CLS370.MTH5289(4101692046123520821L) : s3) + s4, s2);
                            return;
                        }
                        ʾᵢ0 = new CLS887(s4);
                        this.MTH3019(((CLS169)ʾᵢ0), s1);
                        return;
                    label_260:
                        String[] arr_s6 = s4.substring(3, s4.indexOf(CLS370.MTH5289(4101691552202281781L))).trim().split(CLS370.MTH5289(4101691560792216373L));
                        if(arr_s6.length < 2) {
                            return;
                        }
                        int v22 = Integer.parseInt(arr_s6[0]);
                        int v23 = Integer.parseInt(arr_s6[1]);
                        if(v22 > v23) {
                            int v24 = v22;
                            v22 = v23;
                            v23 = v24;
                        }
                        int v25 = Integer.parseInt(s4.substring(s4.indexOf(CLS370.MTH5289(0x38EC23402B3CD335L)) + 1).trim());
                        Random random0 = new Random(System.currentTimeMillis());
                        for(int v = 0; v < v25; ++v) {
                            CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)new CLS887(String.valueOf(random0.nextInt(v23 - v22 + 1) + v22))), s1);
                            this.FLD1400.MTH3324(ˆٴ$ˆٴ0);
                        }
                    }
                }
            }
            else {
                String s31 = s4.substring(6);
                if(CLS500.MTH6892().MTH6895(CLS370.MTH5289(4101695086960366389L))) {
                    this.MTH3018(CLS54.MTH1245().MTH1250(s31), s1);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH3022(String s) {
        Object object0 = this.FLD1413;
        if(object0 != null) {
            try {
                CLS166.MTH3195(object0, CLS27.MTH897("setLastContentMethod"), new Object[]{s});
                CLS166.MTH3195(object0, CLS27.MTH897("chatFooterMethod1"), new Object[]{s, s.length(), Boolean.FALSE});
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH3023(CLS81 יᐧ0, String s) {
        if(CLS27.MTH894("voiceClass1") == null) {
            return;
        }
        if(יᐧ0 != null && יᐧ0.FLD312 != 2) {
            CLS412.MTH6014(this.MTH3026(), CLS27.MTH889("send_mp3_wait"));
            CLS47 ˈˊ0 = CLS47.FLD167;
            CLS1259 ⁱᵔ0 = new CLS1259(this, יᐧ0, s, 13);
            ˈˊ0.getClass();
            long v = יᐧ0.FLD308;
            if(!ˈˊ0.FLD166) {
                ˈˊ0.MTH1196();
            }
            if(ˈˊ0.FLD164.containsKey(v)) {
                int v1 = יᐧ0.FLD312;
                if(v1 == 3) {
                    CLS1259 ⁱᵔ1 = new CLS1259(ˈˊ0, יᐧ0, ⁱᵔ0, 3);
                    CLS40.FLD157.MTH1124(((CLS39)ⁱᵔ1));
                    return;
                }
                if(v1 == 1) {
                    ⁱᵔ0.MTH4980(ˈˊ0.MTH1201(יᐧ0));
                }
            }
            return;
        }
        CLS412.MTH6014(this.MTH3026(), CLS27.MTH889("mp3_not_ready"));
    }

    // 此方法包含解密的字符串
    public final void MTH3024() {
        if(!CLS466.MTH6530()) {
            if(this.FLD1399) {
                this.FLD1399 = false;
                CLS412.MTH6001(this.FLD1432);
            }
            return;
        }
        if(this.FLD1399) {
            return;
        }
        this.FLD1399 = true;
        Handler handler0 = this.FLD1420;
        CLS137 ﹶʼ$ٴـ0 = this.FLD1421;
        if(handler0 != null) {
            handler0.removeCallbacks(ﹶʼ$ٴـ0);
        }
        this.MTH3008(false);
        int v = Math.min(CLS412.MTH6005(900000, "sns_sync_rate"), CLS412.MTH6005(900000, "mf_sns_sync_rate"));
        this.FLD1420.postDelayed(ﹶʼ$ٴـ0, ((long)Math.max(v, 60000)));
    }

    // 此方法包含解密的字符串
    public final void MTH3025(String s, String s1) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("talker", s);
        bundle0.putString("username", s1);
        this.FLD1405.MTH3150(bundle0);
        long v = (long)CLS412.MTH6005(5000, "pat_all_delay");
        this.FLD1405.MTH3156(v);
        this.FLD1405.MTH3149(v);
    }

    // 此方法包含解密的字符串
    public final Activity MTH3026() {
        WeakReference weakReference0 = this.FLD1419;
        if(weakReference0 != null) {
            Activity activity0 = (Activity)weakReference0.get();
            return activity0 == null || activity0.isFinishing() ? ((Activity)CLS21.FLD76.MTH836("getCurrentActivity", new Object[0])) : activity0;
        }
        return (Activity)CLS21.FLD76.MTH836("getCurrentActivity", new Object[0]);
    }

    // 此方法包含解密的字符串
    public final void MTH3027(int v) {
        Object object0 = this.FLD1413;
        if(object0 == null) {
            return;
        }
        CLS166.MTH3195(CLS182.MTH3492(4101697487847084853L, object0), "setTextColor", new Object[]{v});
    }

    // 此方法包含解密的字符串
    public final void MTH3028(String s, String s1, String s2, String s3, boolean z) {
        JSONObject jSONObject2;
        try {
            CLS158 ⁱʾ0 = this.FLD1424;
            CLS500 ᵢﹶ0 = this.FLD1438;
            JSONObject jSONObject0 = new JSONObject(s);
            if(!jSONObject0.has("response")) {
                return;
            }
            JSONArray jSONArray0 = jSONObject0.getJSONArray("response");
            if(CLS426.MTH6126(s1) && CLS502.MTH6934(s, new String[]{"#chatroom"})) {
                return;
            }
            if(ᵢﹶ0.MTH6895("multi_response") || ᵢﹶ0.MTH6895("f_multi2_response")) {
                for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                    JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                    if(jSONObject1.has("checked") && jSONObject1.getBoolean("checked")) {
                        int v2 = jSONObject1.getInt("type");
                        String s4 = "";
                        if(v2 == -202) {
                            try {
                                JSONArray jSONArray1 = new JSONArray(jSONObject1.getString("data"));
                                if(jSONArray1.length() == 0) {
                                    jSONObject2 = null;
                                }
                                else {
                                    try {
                                        jSONObject2 = jSONArray1.getJSONObject(CLS412.MTH6015(jSONArray1.length() - 1, 0));
                                    }
                                    catch(Throwable throwable2) {
                                        CLS27.MTH893(throwable2);
                                        jSONObject2 = null;
                                    }
                                }
                                if(jSONObject2 != null) {
                                    s4 = jSONObject2.getString("msg");
                                    v2 = jSONObject2.getInt("type");
                                }
                            }
                            catch(Throwable throwable1) {
                                CLS27.MTH893(throwable1);
                            }
                        }
                        else {
                            s4 = jSONObject1.getString("msg");
                        }
                        if(jSONObject0.has("tail") && v2 == 1) {
                            s4 = s4 + jSONObject0.getString("tail");
                        }
                        CLS138 ﹶʼ$ⁱʾ0 = new CLS138();
                        ﹶʼ$ⁱʾ0.FLD1394 = s4;
                        ﹶʼ$ⁱʾ0.FLD1396 = s1;
                        ﹶʼ$ⁱʾ0.FLD1395 = s2;
                        ﹶʼ$ⁱʾ0.FLD1398 = s3;
                        ﹶʼ$ⁱʾ0.FLD1397 = jSONObject1.optInt("delay", 1000);
                        ﹶʼ$ⁱʾ0.FLD1393 = z;
                        ⁱʾ0.MTH3150(ﹶʼ$ⁱʾ0);
                        if(!ⁱʾ0.FLD1562) {
                            ⁱʾ0.MTH3149(((long)ﹶʼ$ⁱʾ0.FLD1397));
                        }
                    }
                }
                return;
            }
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject3 = jSONArray0.getJSONObject(v);
                if(jSONObject3.has("checked") && jSONObject3.getBoolean("checked")) {
                    String s5 = jSONObject3.getString("msg");
                    this.MTH3021((!jSONObject0.has("tail") || jSONObject3.getInt("type") != 1 ? s5 : s5 + jSONObject0.getString("tail")), s1, s2, s3, z);
                    return;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final void MTH3029(CLS170 ˆٴ$ˆٴ0) {
        this.FLD1400.MTH3327(ˆٴ$ˆٴ0, false);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final void MTH3030() {
        if(!this.FLD1402) {
            this.FLD1402 = true;
            CLS21 ʾᵢ0 = CLS21.FLD76;
            CLS34.MTH1081(this, 0, ʾᵢ0, "set_current_talker");
            CLS34.MTH1081(this, 4, ʾᵢ0, "set_current_activity");
            CLS34.MTH1081(this, 10, ʾᵢ0, "set_launcherui");
            CLS34.MTH1081(this, 20, ʾᵢ0, CLS34.MTH1068(13, ʾᵢ0, CLS34.MTH1068(12, ʾᵢ0, "loadAvatar", 4101720848174207797L), 4101720942663488309L));
            CLS34.MTH1081(this, 21, ʾᵢ0, "importSettingsUpdateBackup");
            CLS34.MTH1081(this, 22, ʾᵢ0, "importSettingsLatest");
            CLS34.MTH1081(this, 23, ʾᵢ0, "importSettings");
            CLS34.MTH1081(this, 24, ʾᵢ0, "exportSettings");
            CLS34.MTH1081(this, 1, ʾᵢ0, CLS34.MTH1060(18, ʾᵢ0, CLS34.MTH1068(8, ʾᵢ0, CLS34.MTH1060(17, ʾᵢ0, CLS34.MTH1060(16, ʾᵢ0, "a_wakelock", 4101721432289760053L), 4101721479534400309L), 4101720985613161269L), 4101721037152768821L));
            CLS34.MTH1081(this, 2, ʾᵢ0, "fast_switch");
            ʾᵢ0.MTH833("isWxActive", ((CLS37)new CLS884(this, 0)));
            CLS34.MTH1081(this, 3, ʾᵢ0, CLS34.MTH1068(9, ʾᵢ0, "getAvatar", 0x38EC3DB72B3CD335L));
            ʾᵢ0.MTH833("isCreateOptionsMenuInMain", ((CLS37)new CLS884(this, 1)));
            ʾᵢ0.MTH833("getChattingContext", ((CLS37)new CLS884(this, 2)));
            ʾᵢ0.MTH833("getCurrentTalker", ((CLS37)new CLS884(this, 3)));
            ʾᵢ0.MTH833("getCurrentTalker2", ((CLS37)new CLS884(this, 4)));
            CLS34.MTH1081(this, 5, ʾᵢ0, "a.on_MMFragmentActivity_onResume,a.on_VASActivity_onResume");
            CLS34.MTH1081(this, 6, ʾᵢ0, "a.on_MMFragmentActivity_onPause,a.on_VASActivity_onPause");
            CLS34.MTH1081(this, 7, ʾᵢ0, "a.chat.menu.oncreate2");
            CLS34.MTH1081(this, 8, ʾᵢ0, "sendDice");
            ʾᵢ0.MTH833("getChatroomTags", ((CLS37)new CLS884(this, 5)));
            CLS34.MTH1081(this, 9, ʾᵢ0, "altHook_ready");
            CLS34.MTH1081(this, 11, ʾᵢ0, CLS34.MTH1060(19, ʾᵢ0, "on_LuckyMoneyUriSpanHandler", 4101718692100625205L));
            CLS34.MTH1081(this, 12, ʾᵢ0, "sendMessageForwardItem");
            CLS34.MTH1081(this, 13, ʾᵢ0, "sendSoundFile");
            CLS34.MTH1081(this, 14, ʾᵢ0, "refreshMsgAdapter");
            CLS34.MTH1081(this, 15, ʾᵢ0, "b.settingsui.onactivityresult,b.launcherui.onactivityresult,b.mmactivity.onactivityresult,b.chattingui.onactivityresult,b.fragmentactivity.onactivityresult");
            CLS34.MTH1081(this, 16, ʾᵢ0, "startActivityForResult_base");
            ʾᵢ0.MTH833(CLS34.MTH1068(11, ʾᵢ0, CLS34.MTH1060(20, ʾᵢ0, CLS34.MTH1068(10, ʾᵢ0, "isChatroom", 4101715402155676469L), 0x38EC387B2B3CD335L), 0x38EC380A2B3CD335L) + "base", ((CLS37)new CLS884(this, 6)));
            ʾᵢ0.MTH833("getLauncherUI_base", ((CLS37)new CLS884(this, 7)));
            CLS34.MTH1081(this, 17, ʾᵢ0, CLS34.MTH1060(21, ʾᵢ0, "delayed_check", 4101715187407311669L));
            ʾᵢ0.MTH833("getImproveSnsTimelineUIActivity", ((CLS37)new CLS884(this, 8)));
            ʾᵢ0.MTH833("isSnsSyncThreadRunning", ((CLS37)new CLS884(this, 9)));
            CLS34.MTH1081(this, 18, ʾᵢ0, "forceStartSnsSyncThread");
            CLS34.MTH1081(this, 19, ʾᵢ0, "on_pat_msg");
            ʾᵢ0.MTH828(CLS34.MTH1060(29, ʾᵢ0, CLS34.MTH1060(28, ʾᵢ0, "on_create_chat_context_menu", 4101705205903315765L), 4101705287507694389L), ((CLS35)new CLS762(0)));
            ʾᵢ0.MTH828("on_create_chat_context_menu3", ((CLS35)new CLS762(1)));
            CLS34.MTH1067(this, 20, ʾᵢ0, "on_ChatFooter2_onClick");
            CLS34.MTH1067(this, 21, ʾᵢ0, "b.on_chattingUIFragment_onResume");
            CLS34.MTH1067(this, 22, ʾᵢ0, "a.on_chattingUIFragment_onResume");
            CLS34.MTH1067(this, 23, ʾᵢ0, "on_chattingUIFragment_onCreateOptionsMenu");
            CLS34.MTH1067(this, 24, ʾᵢ0, "a.on_chattingUICloseClass_chattingUICloseMethod");
            ʾᵢ0.MTH833("isQuoteMessage", ((CLS37)new CLS884(this, 10)));
            ʾᵢ0.MTH833("getChattingUIFragment", ((CLS37)new CLS884(this, 11)));
            ʾᵢ0.MTH828("on_conversationmenu_onCreateContextMenu", ((CLS35)new CLS762(2)));
            ʾᵢ0.MTH828("on_conversationMenuClass1b_conversionMenuMethod1", ((CLS35)new CLS762(3)));
            CLS34.MTH1067(this, 25, ʾᵢ0, "a.sqldb.update");
            CLS34.MTH1067(this, 26, ʾᵢ0, "a.sqldb.insert");
            CLS34.MTH1067(this, 27, ʾᵢ0, "b.sqldb.insert");
            CLS34.MTH1081(this, 25, ʾᵢ0, "on_RegionCodeDecoder");
            CLS34.MTH1067(this, 13, ʾᵢ0, "on_FavoriteIndexUI_onCreateContextMenu");
            CLS34.MTH1067(this, 14, ʾᵢ0, "on_FavoriteIndexUI_onCreateContextMenu2");
            CLS34.MTH1067(this, 15, ʾᵢ0, "on_FavoriteIndexUI_onCreateContextMenu3");
            CLS34.MTH1067(this, 16, ʾᵢ0, CLS34.MTH1060(25, ʾᵢ0, "on_favOnCreateContextMenuClass2_chatmenuMethod1", 4101700030467724085L));
            CLS34.MTH1067(this, 17, ʾᵢ0, "on_dataClass1_dataMethod");
            CLS34.MTH1067(this, 18, ʾᵢ0, "on_dataClass2_dataMethod");
            CLS34.MTH1081(this, 28, ʾᵢ0, CLS34.MTH1060(27, ʾᵢ0, "on_recordSightClass3_item", 4101701787109348149L));
            CLS34.MTH1067(this, 2, ʾᵢ0, "on_LauncherUI_onDestroy");
            CLS34.MTH1067(this, 3, ʾᵢ0, "on_LauncherUI_onPause");
            CLS34.MTH1067(this, 4, ʾᵢ0, "b.on_LauncherUI_onResume");
            CLS34.MTH1067(this, 5, ʾᵢ0, "b.on_MMActivity_onCreate");
            CLS34.MTH1067(this, 6, ʾᵢ0, "a.on_MMActivity_onCreate");
            CLS34.MTH1067(this, 7, ʾᵢ0, "b.on_LauncherUI_onCreateOptionsMenu");
            CLS34.MTH1067(this, 8, ʾᵢ0, "a.on_LauncherUI_onCreateOptionsMenu");
            CLS34.MTH1067(this, 9, ʾᵢ0, CLS34.MTH1060(24, ʾᵢ0, "a.on_LauncherUI_onOptionsItemSelected", 4101702920980714293L));
            CLS34.MTH1081(this, 29, ʾᵢ0, "onlauncheruienter");
            CLS34.MTH1067(this, 0, ʾᵢ0, "backup_settings_update");
            CLS34.MTH1067(this, 1, ʾᵢ0, "onsettingschange");
            CLS34.MTH1081(this, 26, ʾᵢ0, CLS34.MTH1060(26, ʾᵢ0, "on_settingsui_onresume", 4101690293776864053L));
            CLS34.MTH1081(this, 27, ʾᵢ0, "on_SnsTimeLineUI_onCreateOptionsMenu");
            CLS34.MTH1067(this, 19, ʾᵢ0, CLS34.MTH1060(23, ʾᵢ0, CLS34.MTH1060(22, ʾᵢ0, "on_timelineuiMenuClass1_timelineuiMenuMethod1", 4101704484348810037L), 4101704802176389941L));
            CLS34.MTH1067(this, 10, ʾᵢ0, "on_notificationClass_handleMessage");
            CLS34.MTH1067(this, 11, ʾᵢ0, "on_notificationClass2_1");
            CLS34.MTH1067(this, 12, ʾᵢ0, "on_notificationClass2_a");
        }
        this.MTH3009();
    }

    // 此方法包含解密的字符串
    public final boolean MTH3031(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            if(!jSONObject0.has("module")) {
                return false;
            }
            int v = jSONObject0.optInt("version", 0);
            boolean z = jSONObject0.has("settings");
            CLS29 ˎᵢ0 = this.FLD1431;
            if(z) {
                ˎᵢ0.MTH923(jSONObject0.getJSONArray("settings"));
            }
            if(jSONObject0.has("wxdata")) {
                ˎᵢ0.MTH934(jSONObject0.getJSONArray("wxdata"), v == 0);
            }
            CLS21.FLD76.MTH822("import_settings", new Object[]{jSONObject0});
            CLS21.FLD76.MTH822("WxDataManagerClear", new Object[0]);
            return true;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
    }
}

