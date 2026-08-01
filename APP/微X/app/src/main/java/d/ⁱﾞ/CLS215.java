// Decompiled by JEB v5.42.0.202606242140

package d.ⁱﾞ;

import android.text.TextUtils;
import d.יʻ.CLS175;
import d.יʻ.CLS62;
import d.יʻ.CLS65.CLS64;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.יʻ.CLS73;
import d.ᐧˈ.CLS194;
import d.ᐧˈ.CLS196;
import d.ᐧˈ.CLS200;
import d.ᐧˈ.CLS204;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class CLS215 extends CLS127 {
    public final HashMap FLD678;

    public CLS215() {
        this.FLD678 = new HashMap();
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱﾞ.CLS127
    public final void MTH1190(CLS62 ˎˏ0) {
        ˎˏ0.MTH753("settings.config", ((CLS64)new CLS214(this, 0)));
        CLS213 ٴˑ0 = new CLS213(this, ˎˏ0);
        for(int v = 0; v < 1; ++v) {
            String s = new String[]{"settings.keywords"}[v];
            ConcurrentHashMap concurrentHashMap0 = ˎˏ0.FLD312;
            if(concurrentHashMap0.containsKey(s)) {
                CLS73 ⁱﾞ0 = (CLS73)concurrentHashMap0.get(s);
                if(ⁱﾞ0 != null) {
                    ArrayList arrayList0 = ⁱﾞ0.FLD343;
                    if(!arrayList0.contains(ٴˑ0)) {
                        arrayList0.add(ٴˑ0);
                    }
                }
            }
            else {
                CLS73 ⁱﾞ1 = new CLS73();
                ArrayList arrayList1 = ⁱﾞ1.FLD343;
                if(!arrayList1.contains(ٴˑ0)) {
                    arrayList1.add(ٴˑ0);
                }
                concurrentHashMap0.put(s, ⁱﾞ1);
            }
        }
        ˎˏ0.MTH753("showDonationDialog", new CLS175(8));
        ˎˏ0.MTH753("showSubscribeIntegratedModeDialog", new CLS175(9));
        ˎˏ0.MTH753("showUpdateDialog", new CLS175(10));
        ˎˏ0.MTH753("showManageLicensesDialog", new CLS175(11));
        ˎˏ0.MTH753("showKeycardUsedFeedbackDialog", new CLS175(12));
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱﾞ.CLS127
    public final void MTH1191() {
        String s10;
        String s9;
        String s8;
        String s6;
        String s5;
        String s4;
        String s3;
        String s2;
        CLS194 ʼˎ0 = new CLS194(CLS69.MTH795("configure_about_settings"), "configure_about_settings");
        HashMap hashMap0 = this.FLD678;
        hashMap0.put("configure_about_settings", ʼˎ0);
        hashMap0.put("config_toolbar_settings", new CLS204(CLS69.MTH795("toolbar_settings"), "config_toolbar_settings"));
        String s = CLS69.MTH795("donate_keycard");
        String s1 = "";
        if(TextUtils.isEmpty(s)) {
            s2 = "";
        }
        else {
            if(!s.contains("[[") || !s.contains("]]")) {
                s3 = "";
            }
            else {
                int v = s.indexOf("[[");
                int v1 = s.lastIndexOf("]]");
                s3 = s.substring(v + 2, v1);
                s = CLS71.MTH825(s, 0, v, new StringBuilder(), v1, 2);
            }
            if(!s.contains("{") || !s.contains("}")) {
                s5 = s;
                s4 = "";
            }
            else {
                int v2 = s.indexOf("{");
                int v3 = s.lastIndexOf("}");
                s4 = s.substring(v2 + 1, v3);
                s5 = CLS71.MTH825(s, 0, v2, new StringBuilder(), v3, 1);
            }
            if(!s5.contains("((") || !s5.contains("))")) {
                s6 = "";
            }
            else {
                int v4 = s5.indexOf("((");
                int v5 = s5.lastIndexOf("))");
                s6 = s5.substring(v4 + 2, v5);
                s5 = CLS71.MTH825(s5, 0, v4, new StringBuilder(), v5, 2);
            }
            s2 = s5.trim();
            s4.getClass();
            s3.getClass();
            s6.getClass();
        }
        hashMap0.put("config_donate_key", new CLS200(s2, "config_donate_key"));
        String s7 = CLS69.MTH795("donate_keycard");
        if(TextUtils.isEmpty(s7)) {
            s8 = "";
        }
        else {
            if(!s7.contains("[[") || !s7.contains("]]")) {
                s9 = "";
            }
            else {
                int v6 = s7.indexOf("[[");
                int v7 = s7.lastIndexOf("]]");
                s9 = s7.substring(v6 + 2, v7);
                s7 = CLS71.MTH825(s7, 0, v6, new StringBuilder(), v7, 2);
            }
            if(!s7.contains("{") || !s7.contains("}")) {
                s10 = "";
            }
            else {
                int v8 = s7.indexOf("{");
                int v9 = s7.lastIndexOf("}");
                s10 = s7.substring(v8 + 1, v9);
                s7 = CLS71.MTH825(s7, 0, v8, new StringBuilder(), v9, 1);
            }
            if(s7.contains("((") && s7.contains("))")) {
                int v10 = s7.indexOf("((");
                int v11 = s7.lastIndexOf("))");
                s1 = s7.substring(v10 + 2, v11);
                s7 = CLS71.MTH825(s7, 0, v10, new StringBuilder(), v11, 2);
            }
            s8 = s7.trim();
            s10.trim();
            s9.trim();
            s1.trim();
        }
        hashMap0.put("config_donate_key_emulator", new CLS196(s8, "config_donate_key_emulator"));
    }
}

