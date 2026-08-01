// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS577;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1225;
import b.ᵔʾ.CLS1229;
import b.ᵔʾ.CLS1258;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

public final class CLS700 implements CLS35 {
    public final int FLD809;
    public final CLS864 FLD810;

    public CLS700(CLS864 ﹶ0, int v) {
        this.FLD809 = v;
        this.FLD810 = ﹶ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        long v12;
        long v11;
        String s5;
        String s3;
        String s2;
        CLS577 ٴـ0;
        CLS40 ﾞᵎ0;
        Object object0 = null;
        CLS864 ﹶ0 = this.FLD810;
        switch(this.FLD809) {
            case 0: {
                ﹶ0.getClass();
                ContentValues contentValues0 = (ContentValues)arr_object[1];
                if(!ﹶ0.FLD1383.isEmpty() && contentValues0 != null && ﹶ0.FLD1383.contains(contentValues0.getAsString("talker")) && CLS182.MTH3474(4101901172376130357L, contentValues0) == 1 && CLS182.MTH3474(4101901193850966837L, contentValues0) != 1) {
                    long v = CLS34.MTH1080(4101901223915737909L, contentValues0);
                    Object object1 = ﹶ0.FLD1387;
                    try {
                        CLS371.FLD3470.getClass();
                        String s = CLS27.MTH882("q_db7");
                        Object object2 = CLS66.MTH1448(CLS371.FLD3470.MTH5307(s, new String[]{String.valueOf(v)}));
                        if(object2 != null) {
                            if(!TextUtils.isEmpty(CLS27.MTH897("translateMethod"))) {
                                CLS166.MTH3195(object1, CLS27.MTH897("translateMethod"), new Object[]{object2});
                                return;
                            }
                            if(!TextUtils.isEmpty(CLS27.MTH897("translateMethod1"))) {
                                CLS166.MTH3192(object1.getClass(), CLS27.MTH897("translateMethod1"), new Object[]{object1, object2});
                                return;
                            }
                            if(!TextUtils.isEmpty(CLS27.MTH897("translateMethod2"))) {
                                CLS166.MTH3195(CLS166.MTH3194(object1, CLS27.MTH897("translateField1")), CLS27.MTH897("translateMethod2"), new Object[]{object2});
                                return;
                            }
                            if(!TextUtils.isEmpty(CLS27.MTH897("translateMethod2b"))) {
                                CLS166.MTH3195(CLS166.MTH3194(object1, CLS27.MTH897("translateField1")), CLS27.MTH897("translateMethod2b"), new Object[]{object2, Boolean.FALSE});
                                return;
                            }
                            if(CLS27.MTH899(new String[]{"translateMethod2c", "translateMethod2d", "translateMethod2e"}) && !TextUtils.isEmpty(CLS27.MTH897("ChattingComponentManagerField1"))) {
                                Object object3 = CLS166.MTH3194(object1, CLS27.MTH897("ChattingComponentManagerField1"));
                                if(object3 != null) {
                                    Class class0 = CLS27.MTH894("translateClass");
                                    if(class0 != null) {
                                        if(CLS27.MTH890("ChattingComponentManagerField1_field1")) {
                                            object3 = CLS166.MTH3194(object3, CLS27.MTH897("ChattingComponentManagerField1_field1"));
                                        }
                                        Object object4 = CLS166.MTH3195(object3, CLS27.MTH897("ChattingComponentManagerGetMethod"), new Object[]{class0});
                                        if(object4 != null) {
                                            if(!TextUtils.isEmpty(CLS27.MTH897("translateMethod2c"))) {
                                                CLS166.MTH3195(object4, CLS27.MTH897("translateMethod2c"), new Object[]{object2, Boolean.FALSE});
                                                return;
                                            }
                                            boolean z6 = false;
                                            if(!TextUtils.isEmpty(CLS27.MTH897("translateMethod2d"))) {
                                                z6 = true;
                                                ﾞᵎ0 = CLS40.FLD157;
                                                ٴـ0 = new CLS577(object4, object2, 0);
                                            }
                                            else if(!TextUtils.isEmpty(CLS27.MTH897("translateMethod2e"))) {
                                                z6 = true;
                                                ﾞᵎ0 = CLS40.FLD157;
                                                ٴـ0 = new CLS577(object4, object2, 1);
                                            }
                                            if(z6) {
                                                ﾞᵎ0.MTH1116(((CLS39)ٴـ0));
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                return;
            }
            case 1: {
                if(!ﹶ0.FLD1447.FLD1410) {
                    Object object5 = arr_object[0];
                    String s1 = (String)arr_object[2];
                    ContentValues contentValues1 = (ContentValues)arr_object[3];
                    if("message".equalsIgnoreCase(s1) && contentValues1 != null && contentValues1.containsKey("type")) {
                        try {
                            s2 = contentValues1.getAsString("talker");
                            int v1 = contentValues1.containsKey("isSend") ? ((int)contentValues1.getAsInteger("isSend")) : 0;
                            int v2 = (int)contentValues1.getAsInteger("type");
                            if(v2 == 1 || v2 == 0x1000031) {
                                s3 = contentValues1.getAsString("content");
                                if(v2 == 0x1000031) {
                                    HashMap hashMap0 = CLS392.MTH5633(s3, "msg");
                                    if(hashMap0 != null && hashMap0.containsKey(".msg.appmsg.content")) {
                                        s3 = (String)hashMap0.get(".msg.appmsg.content");
                                    }
                                }
                                if(!TextUtils.isEmpty(s3) && CLS502.MTH6934(s3, new String[]{"#*"}) && CLS502.MTH6934(s3, new String[]{"*#"})) {
                                    if(v1 == 1) {
                                        goto label_87;
                                    }
                                    else {
                                        String s4 = CLS426.MTH6106(v1, s3, s2);
                                        if(v2 == 1) {
                                            s5 = s3.substring(0, s3.indexOf("#*"));
                                            goto label_76;
                                        }
                                        else {
                                            int v3 = s3.indexOf("<");
                                            if(v3 != -1) {
                                                s5 = s3.substring(0, v3);
                                                s4 = (String)CLS392.MTH5633(s3, "appmsg").get(".appmsg.content");
                                                if(TextUtils.isEmpty(s4)) {
                                                    s4 = s3.substring(s3.indexOf("<content>") + 9, s3.indexOf("</content"));
                                                }
                                            label_76:
                                                if(!TextUtils.isEmpty(s4) && s4.startsWith("#*") && s4.endsWith("*#")) {
                                                    String s6 = CLS412.MTH5994((CLS426.MTH6126(s2) ? s2 + CLS426.MTH6109(s3) : s2), s4);
                                                    if(!TextUtils.isEmpty(s6)) {
                                                        if(!CLS426.MTH6129(s6) || CLS502.MTH6934(s6, new String[]{CLS66.MTH1452(s2, CLS27.MTH904())})) {
                                                            contentValues1.put("type", 1);
                                                            contentValues1.put("content", s5 + s6);
                                                            return;
                                                        }
                                                        goto label_83;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                        }
                        return;
                        try {
                        label_83:
                            Method method0 = object5.getClass().getDeclaredMethod("setResult", Object.class);
                            method0.setAccessible(true);
                            method0.invoke(object5, -1L);
                        }
                        catch(Throwable unused_ex) {
                        }
                        return;
                        try {
                        label_87:
                            if(ﹶ0.FLD1390.contains(s2)) {
                                String s7 = CLS412.MTH5994((CLS426.MTH6126(s2) ? s2 + CLS27.MTH904() : CLS27.MTH904()), s3);
                                if(!TextUtils.isEmpty(s7)) {
                                    ContentValues contentValues2 = new ContentValues(contentValues1);
                                    contentValues2.put("type", 1);
                                    contentValues2.put("content", s7);
                                    long v4 = (long)contentValues1.getAsLong("msgId");
                                    CLS21.FLD76.MTH818("updateChatMap", new Object[]{v4, contentValues2});
                                    return;
                                }
                            }
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                        }
                    }
                }
                return;
            }
            case 2: {
                CLS139 ﹶʼ0 = ﹶ0.FLD1447;
                if(!ﹶʼ0.FLD1410) {
                    HashSet hashSet0 = ﹶ0.FLD1384;
                    if(!hashSet0.isEmpty()) {
                        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                        int v5 = CLS166.MTH3181(ᵔʾ0.MTH3205(), "field_type");
                        long v6 = CLS166.MTH3185(ᵔʾ0.MTH3205(), "field_msgSvrId");
                        int v7 = CLS166.MTH3181(ᵔʾ0.MTH3205(), "field_isSend");
                        String s8 = (String)CLS166.MTH3194(ᵔʾ0.MTH3205(), "field_talker");
                        HashSet hashSet1 = ﹶ0.FLD1385;
                        if(!hashSet1.contains(v6) && hashSet0.contains(s8) && s8.equals(ﹶʼ0.FLD1434) && v5 == 34 && v7 != 1) {
                            hashSet1.add(v6);
                            CLS690 ˉי0 = new CLS690(ﹶ0, v6);
                            CLS40.FLD157.MTH1124(((CLS39)ˉי0));
                        }
                    }
                }
                return;
            }
            case 3: {
                int v8 = 0xFFFF0000;
                int v9 = 0xFFFF00FF;
                ﹶ0.getClass();
                Object object6 = arr_object[0];
                try {
                    Field field0 = object6.getClass().getDeclaredField("thisObject");
                    if(field0 != null) {
                        field0.setAccessible(true);
                        object0 = field0.get(object6);
                    }
                }
                catch(Throwable unused_ex) {
                }
                ﹶ0.FLD1387 = object0;
                CLS139 ﹶʼ1 = ﹶ0.FLD1447;
                String s9 = ﹶʼ1.FLD1434;
                HashSet hashSet2 = ﹶ0.FLD1386;
                if(!hashSet2.isEmpty()) {
                    if(!hashSet2.contains(s9)) {
                        v9 = CLS522.MTH7109();
                    }
                    ﹶʼ1.MTH3027(v9);
                }
                HashSet hashSet3 = ﹶ0.FLD1390;
                if(!hashSet3.isEmpty()) {
                    if(!hashSet3.contains(s9)) {
                        v8 = CLS522.MTH7109();
                    }
                    ﹶʼ1.MTH3027(v8);
                }
                HashSet hashSet4 = ﹶ0.FLD1389;
                if(!hashSet4.isEmpty()) {
                    ﹶʼ1.MTH3027((hashSet4.contains(s9) ? CLS522.MTH7110("#FF9B00") : CLS522.MTH7109()));
                }
                HashSet hashSet5 = ﹶ0.FLD1382;
                if(!hashSet5.isEmpty()) {
                    ﹶʼ1.MTH3027((hashSet5.contains(s9) ? 0xFF0000FF : CLS522.MTH7109()));
                }
                ﹶ0.FLD1385.clear();
                return;
            }
            case 4: {
                ﹶ0.getClass();
                CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                Object object7 = arr_object[1];
                String s10 = (String)arr_object[2];
                if(!TextUtils.isEmpty(s10)) {
                    CLS29 ˎᵢ0 = ﹶ0.FLD1445;
                    boolean z = ˎᵢ0.MTH938("autorecall", false);
                    boolean z1 = ˎᵢ0.MTH938("encrypted_mode_enable", false);
                    boolean z2 = ˎᵢ0.MTH938("auto_translate_mode_enable", false);
                    boolean z3 = ˎᵢ0.MTH938("tts_send_mode_enable", false);
                    boolean z4 = ˎᵢ0.MTH938("auto_transcribe_mode_enable", false);
                    boolean z5 = ˎᵢ0.MTH938("tail_mode_enable", false);
                    CLS139 ﹶʼ2 = ﹶ0.FLD1447;
                    String s11 = ﹶʼ2.FLD1434;
                    if(z && s10.startsWith("#rm ")) {
                        ﹶʼ2.MTH3022("");
                        ᵔʾ1.MTH3207(null);
                        if(ﹶ0.FLD1386.contains(s11)) {
                            CLS412.MTH6004(CLS27.MTH889("disable_autorecallmode"));
                            ﹶ0.MTH2996("autorecall", s11);
                            CLS166.MTH3195(object7, "setTextColor", new Object[]{CLS522.MTH7109()});
                            return;
                        }
                        CLS166.MTH3195(object7, "setTextColor", new Object[]{0xFFFF00FF});
                        ﹶ0.MTH2995("autorecall", s11);
                        String[] arr_s = s10.split(" ");
                        int v10 = arr_s.length <= 1 ? 90000 : Integer.parseInt(arr_s[1]) * 1000;
                        CLS21.FLD76.MTH818("setAutoRecallDelay", new Object[]{v10});
                        v11 = 0x38ECEE9C2B3CD335L;
                        CLS412.MTH6004(CLS27.MTH889(CLS370.MTH5289(v11)));
                        return;
                    }
                    if(z && s10.startsWith("#r ")) {
                        ﹶʼ2.MTH3022("");
                        ᵔʾ1.MTH3207(null);
                        CLS21.FLD76.MTH818("revokeLastMsg", new Object[]{s10});
                        return;
                    }
                    HashSet hashSet6 = ﹶ0.FLD1390;
                    if(z1 && s10.startsWith("#s ")) {
                        ﹶʼ2.MTH3022("");
                        ᵔʾ1.MTH3207(null);
                        if(hashSet6.contains(s11)) {
                            CLS412.MTH6004(CLS27.MTH889("disable_encryptedmode"));
                            ﹶ0.MTH2996("encrypted", s11);
                            CLS166.MTH3195(object7, "setTextColor", new Object[]{CLS522.MTH7109()});
                            return;
                        }
                        CLS166.MTH3195(object7, "setTextColor", new Object[]{0xFFFF0000});
                        ﹶ0.MTH2995("encrypted", s11);
                        v11 = 0x38ECEF0E2B3CD335L;
                        CLS412.MTH6004(CLS27.MTH889(CLS370.MTH5289(v11)));
                        return;
                    }
                    if(z1 && hashSet6.contains(s11)) {
                        ﹶʼ2.MTH3022("");
                        ᵔʾ1.MTH3207(null);
                        CLS466.MTH6513(s11, "", s10);
                        return;
                    }
                    HashSet hashSet7 = ﹶ0.FLD1389;
                    if(z5 && s10.startsWith("#tm ")) {
                        ﹶʼ2.MTH3022("");
                        ᵔʾ1.MTH3207(null);
                        if(hashSet7.contains(s11)) {
                            CLS412.MTH6004(CLS27.MTH889("disable_tailmode"));
                            ﹶ0.MTH2996("tail", s11);
                            CLS166.MTH3195(object7, "setTextColor", new Object[]{CLS522.MTH7109()});
                            return;
                        }
                        CLS166.MTH3195(object7, "setTextColor", new Object[]{CLS522.MTH7110("#FF9B00")});
                        ﹶ0.MTH2995("tail", s11);
                        v11 = 0x38ECEFE72B3CD335L;
                        CLS412.MTH6004(CLS27.MTH889(CLS370.MTH5289(v11)));
                        return;
                    }
                    if(!z5 || !hashSet7.contains(s11)) {
                        if(z2 && s10.startsWith("#t ")) {
                            ﹶʼ2.MTH3022("");
                            ᵔʾ1.MTH3207(null);
                            if(ﹶ0.FLD1383.contains(s11)) {
                                CLS412.MTH6004(CLS27.MTH889("disable_autotranslatemode"));
                                v12 = 0x38ECEC512B3CD335L;
                                ﹶ0.MTH2996(CLS370.MTH5289(v12), s11);
                                return;
                            }
                            ﹶ0.MTH2995("autotranslate", s11);
                            v11 = 0x38ECEC6D2B3CD335L;
                            CLS412.MTH6004(CLS27.MTH889(CLS370.MTH5289(v11)));
                            return;
                        }
                        if(z4 && s10.startsWith("#tv ")) {
                            ﹶʼ2.MTH3022("");
                            ᵔʾ1.MTH3207(null);
                            if(ﹶ0.FLD1384.contains(s11)) {
                                CLS412.MTH6004(CLS27.MTH889("disable_autotranscribemode"));
                                v12 = 4101913013600965429L;
                                ﹶ0.MTH2996(CLS370.MTH5289(v12), s11);
                                return;
                            }
                            ﹶ0.MTH2995("autotranscribe", s11);
                            CLS412.MTH6004(CLS27.MTH889("enable_autotranscribemode"));
                            ﹶ0.FLD1385.clear();
                            return;
                        }
                        HashSet hashSet8 = ﹶ0.FLD1382;
                        if(z3 && s10.startsWith("#tts ")) {
                            ﹶʼ2.MTH3022("");
                            ᵔʾ1.MTH3207(null);
                            if(hashSet8.contains(s11)) {
                                CLS412.MTH6004(CLS27.MTH889("tts_stop"));
                                ﹶ0.MTH2996("tts", s11);
                                if(hashSet8.isEmpty()) {
                                    CLS21 ʾᵢ0 = CLS21.FLD76;
                                    if(ʾᵢ0.MTH830("hasTTS", new Object[0])) {
                                        ʾᵢ0.MTH818("stopTTS", new Object[0]);
                                    }
                                }
                                CLS166.MTH3195(object7, "setTextColor", new Object[]{CLS522.MTH7109()});
                                return;
                            }
                            ﹶ0.MTH2995("tts", s11);
                            CLS21 ʾᵢ1 = CLS21.FLD76;
                            if(ʾᵢ1.MTH830("hasTTS", new Object[0])) {
                                ﹶʼ2.MTH3027(0xFF0000FF);
                                v11 = 0x38ECED4B2B3CD335L;
                            }
                            else {
                                CLS166.MTH3195(object7, "setTextColor", new Object[]{0xFF0000FF});
                                String[] arr_s1 = s10.split(" ");
                                String s12 = ˎᵢ0.MTH925("tts_lang", "zh_CN");
                                if(arr_s1.length > 1) {
                                    s12 = arr_s1[1].trim();
                                }
                                ʾᵢ1.MTH818("startTTS", new Object[]{s12});
                                v11 = 4101914224781742901L;
                            }
                            CLS412.MTH6004(CLS27.MTH889(CLS370.MTH5289(v11)));
                            return;
                        }
                        if(hashSet8.contains(s11)) {
                            CLS21 ʾᵢ2 = CLS21.FLD76;
                            if(ʾᵢ2.MTH830("hasTTS", new Object[0]) && !CLS426.MTH6129(s10) && !s10.startsWith("#rm ") && !s10.startsWith("#r ") && !CLS502.MTH6934(s10, new String[]{"#@"})) {
                                ᵔʾ1.MTH3207(null);
                                ﹶʼ2.MTH3022("");
                                ʾᵢ2.MTH818("tts", new Object[]{s10});
                            }
                        }
                    }
                    else if(!CLS426.MTH6129(s10) && !CLS21.FLD76.MTH830("isQuoteMessage", new Object[0])) {
                        if(!ˎᵢ0.MTH938("tailmode_random_show", false)) {
                            CLS466.MTH6500(s11, s10);
                            ﹶʼ2.MTH3022("");
                            ᵔʾ1.MTH3207(null);
                            return;
                        }
                        float f = (float)ˎᵢ0.MTH920("tailmode_random_value");
                        if(ﹶ0.FLD1388.nextDouble() <= ((double)f)) {
                            CLS466.MTH6500(s11, s10);
                            ﹶʼ2.MTH3022("");
                            ᵔʾ1.MTH3207(null);
                            return;
                        }
                    }
                }
                return;
            }
            case 5: {
                ﹶ0.getClass();
                if(ﹶ0.FLD1445.MTH938("persistent_special_mode_enable", false)) {
                    ﹶ0.FLD1389.clear();
                    ﹶ0.MTH2992();
                }
                return;
            }
            case 6: {
                this.MTH2303(arr_object);
                return;
            }
            default: {
                this.MTH2302(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2302(Object[] arr_object) {
        int v2;
        CLS646 ʽˈ0;
        String s4;
        String s3;
        Activity activity0;
        long v1;
        int v;
        CLS864 ﹶ0 = this.FLD810;
        ﹶ0.getClass();
        String s = (String)arr_object[0];
        CLS139 ﹶʼ0 = ﹶ0.FLD1447;
        String s1 = ﹶʼ0.FLD1434;
        switch(s) {
            case "autorecall": {
                v = 0;
                break;
            }
            case "autotranscribe": {
                v = 3;
                break;
            }
            case "autotranslate": {
                v = 2;
                break;
            }
            case "encrypted": {
                v = 1;
                break;
            }
            case "tail": {
                v = 5;
                break;
            }
            case "tts": {
                v = 4;
                break;
            }
            default: {
                v = -1;
            }
        }
        if(v == 0) {
            if(ﹶ0.FLD1386.contains(s1)) {
                CLS412.MTH6004(CLS27.MTH889(CLS370.MTH5289(0x38ECE83F2B3CD335L)));
                ﹶ0.MTH2996(s, s1);
                ﹶʼ0.MTH3027(CLS522.MTH7109());
                return;
            }
            activity0 = ((CLS140)ﹶ0).MTH3042();
            s3 = CLS27.MTH889("delay");
            s4 = "90";
            ʽˈ0 = new CLS646(ﹶ0, s, s1, 0);
            v2 = 0x1000;
        }
        else {
            CLS29 ˎᵢ0 = ﹶ0.FLD1445;
            switch(v) {
                case 1: {
                    if(ﹶ0.FLD1390.contains(s1)) {
                        CLS412.MTH6004(CLS27.MTH889(CLS370.MTH5289(4101909410123404085L)));
                        ﹶ0.MTH2996(s, s1);
                        ﹶʼ0.MTH3027(CLS522.MTH7109());
                        return;
                    }
                    String s2 = CLS182.MTH3473(4101909014986412853L, ˎᵢ0, "encrypted_tag");
                    CLS523.MTH7165(((CLS140)ﹶ0).MTH3042(), CLS27.MTH889("encrypted_tag_lbl"), "", s2, 1, ((CLS16)new CLS646(ﹶ0, s, s1, 1)));
                    return;
                }
                case 2: {
                    if(ﹶ0.FLD1383.contains(s1)) {
                        CLS412.MTH6004(CLS27.MTH889(CLS370.MTH5289(4101909139540464437L)));
                        ﹶ0.MTH2996(s, s1);
                        return;
                    }
                    v1 = 4101909251209614133L;
                    break;
                }
                case 3: {
                    if(ﹶ0.FLD1384.contains(s1)) {
                        CLS412.MTH6004(CLS27.MTH889(CLS370.MTH5289(4101909908339610421L)));
                        ﹶ0.MTH2996(s, s1);
                        return;
                    }
                    CLS412.MTH6004(CLS27.MTH889("enable_autotranscribemode"));
                    ﹶ0.MTH2995(s, s1);
                    ﹶ0.FLD1385.clear();
                    return;
                }
                case 4: {
                    HashSet hashSet0 = ﹶ0.FLD1382;
                    if(hashSet0.contains(s1)) {
                        CLS412.MTH6004(CLS27.MTH889("tts_stop"));
                        ﹶ0.MTH2996(s, s1);
                        if(!hashSet0.isEmpty()) {
                            ﹶʼ0.MTH3027(CLS522.MTH7109());
                            return;
                        }
                        CLS21 ʾᵢ0 = CLS21.FLD76;
                        if(!ʾᵢ0.MTH830("hasTTS", new Object[0])) {
                            ﹶʼ0.MTH3027(CLS522.MTH7109());
                            return;
                        }
                        ʾᵢ0.MTH818("stopTTS", new Object[0]);
                        ﹶʼ0.MTH3027(CLS522.MTH7109());
                        return;
                    }
                    ﹶ0.MTH2995(s, s1);
                    if(!CLS21.FLD76.MTH830("hasTTS", new Object[0])) {
                        activity0 = ((CLS140)ﹶ0).MTH3042();
                        s3 = CLS27.MTH889("tts_lang");
                        s4 = ˎᵢ0.MTH925("tts_lang", "zh_CN");
                        ʽˈ0 = new CLS1229(21, ﹶ0);
                        v2 = 1;
                        CLS523.MTH7165(activity0, s3, "", s4, v2, ((CLS16)ʽˈ0));
                        return;
                    }
                    ﹶʼ0.MTH3027(0xFF0000FF);
                    CLS412.MTH6004(CLS27.MTH889("tts_start"));
                    return;
                }
                case 5: {
                    if(ﹶ0.FLD1389.contains(s1)) {
                        CLS412.MTH6004(CLS27.MTH889("disable_tailmode"));
                        ﹶʼ0.MTH3027(CLS522.MTH7109());
                        ﹶ0.MTH2996(s, s1);
                        return;
                    }
                    ﹶʼ0.MTH3027(CLS522.MTH7110("#FF9B00"));
                    v1 = 4101910526814901045L;
                    break;
                }
                default: {
                    return;
                }
            }
            CLS412.MTH6004(CLS27.MTH889(CLS370.MTH5289(v1)));
            ﹶ0.MTH2995(s, s1);
            return;
        }
        CLS523.MTH7165(activity0, s3, "", s4, v2, ((CLS16)ʽˈ0));
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    private final void MTH2303(Object[] arr_object) {
        CLS864 ﹶ0 = this.FLD810;
        ﹶ0.getClass();
        String s = (String)arr_object[0];
        String s1 = (String)arr_object[1];
        switch(s) {
            case "send_encrypted": {
                CLS523.MTH7148(((CLS140)ﹶ0).MTH3042(), CLS27.MTH889("send_encrypted_msg"), "", "", CLS27.MTH889("encrypted_tag_lbl"), CLS182.MTH3473(4101911853959795509L, CLS27.MTH895(), "encrypted_tag"), ((CLS16)new CLS1258(10, s1)));
                return;
            }
            case "send_tail": {
                CLS523.MTH7165(((CLS140)ﹶ0).MTH3042(), CLS27.MTH889("send_tail_msg"), "", "", 1, ((CLS16)new CLS1258(11, s1)));
                return;
            }
            case "send_tts": {
                CLS523.MTH7165(((CLS140)ﹶ0).MTH3042(), CLS27.MTH889("send_tts_msg"), "", "", 1, ((CLS16)new CLS1225(17)));
            }
        }
    }
}

