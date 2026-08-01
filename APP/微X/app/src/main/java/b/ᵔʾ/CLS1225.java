// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import b.ʻˑ.CLS13;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS6;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS19;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS26;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS78;
import b.יᐧ.CLS151.CLS150;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS363.CLS362;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS408;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS431;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS1629.CLS548;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1225 implements CLS6, CLS7, CLS13, CLS16, CLS39, CLS150, CLS362, CLS538, CLS539, CLS548 {
    public final int FLD2906;

    public CLS1225(int v) {
        this.FLD2906 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        JSONObject jSONObject1;
        boolean z2;
        JSONArray jSONArray1;
        JSONArray jSONArray0;
        boolean z1;
        long v3;
        String s8;
        boolean z;
        int v = 0;
        switch(this.FLD2906) {
            case 3: {
                CLS66.MTH1436(CLS27.MTH895().MTH925("zombie_check_chatroom", ""), CLS27.MTH904());
                CLS27.MTH895().MTH922("", "zombie_check_chatroom");
                return;
            }
            case 4: {
                CLS500 ᵢﹶ0 = CLS500.FLD4928;
                CLS29 ˎᵢ0 = CLS27.MTH895();
                String s3 = ˎᵢ0.MTH925("fp", "");
                String s4 = ˎᵢ0.MTH925("fp_async", "");
                CLS412.FLD4009.clear();
                List list0 = Arrays.asList(CLS502.MTH6941(s3));
                CLS412.FLD4009.addAll(list0);
                List list1 = Arrays.asList(CLS502.MTH6941(s4));
                CLS412.FLD4009.addAll(list1);
                if(CLS412.FLD4009.contains("base")) {
                    ᵢﹶ0.getClass();
                    String s5 = (String)CLS21.FLD76.MTH815("getVerifierData", new Object[0]);
                    if(TextUtils.isEmpty(s5)) {
                        s5 = CLS27.MTH895().MTH925("verifier6", ᵢﹶ0.FLD4929);
                    }
                    else {
                        ᵢﹶ0.FLD4929 = s5;
                    }
                    if(TextUtils.isEmpty(s5)) {
                        z = false;
                    }
                    else {
                        try {
                            if(TextUtils.isEmpty(s5)) {
                                z = false;
                            }
                            else {
                                Object object1 = CLS27.MTH883(0x84, new Object[]{"verifier6", s5, CLS27.MTH904()});
                                z = object1 == null ? false : ((Boolean)object1).booleanValue();
                            }
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                            z = false;
                        }
                    }
                    if(z) {
                        CLS26 ˊˏ0 = CLS27.MTH905();
                        String s6 = CLS27.FLD105;
                        if(Build.VERSION.SDK_INT >= 21) {
                            String[] arr_s = Build.SUPPORTED_ABIS;
                            int v2 = 0;
                            while(v2 < arr_s.length) {
                                String s7 = CLS390.MTH5617(arr_s[v2]);
                                if(!TextUtils.isEmpty(s7)) {
                                    s8 = s7;
                                    goto label_66;
                                }
                                ++v2;
                            }
                        }
                        s8 = CLS390.MTH5617(Build.CPU_ABI);
                    label_66:
                        if(!CLS390.MTH5617(Build.CPU_ABI).equals("arm64")) {
                            v3 = CLS502.MTH6934(s8, new String[]{"arm"}) || !CLS502.MTH6934(s8, new String[]{"x86"}) ? 4101472629129270069L : 4101472676373910325L;
                        }
                        else if(CLS502.MTH6934(s8, new String[]{"arm"})) {
                            v3 = 4101472611949400885L;
                        }
                        else if(CLS502.MTH6934(s8, new String[]{"x86"})) {
                            v3 = 4101472637719204661L;
                        }
                        else {
                            v3 = 4101472629129270069L;
                        }
                        if(ˊˏ0.MTH877(new File(s6, CLS431.MTH6160(CLS370.MTH5289(v3))))) {
                            if(CLS412.MTH6002()) {
                                z1 = true;
                            }
                            else {
                                CLS408 ˈˈ0 = (CLS408)CLS40.FLD157.MTH1118(CLS408.class);
                                CLS26 ˊˏ1 = CLS27.MTH905();
                                String s9 = CLS27.FLD105;
                                ˈˈ0.getClass();
                                z1 = ˊˏ1.MTH877(new File(s9, CLS431.MTH6160(ˈˈ0.FLD3943.getAsString("core"))));
                            }
                            if(z1) {
                                String s10 = CLS27.MTH882("keys");
                                String s11 = CLS27.MTH882("sigs");
                                if(!TextUtils.isEmpty(s10) && !TextUtils.isEmpty(s11) && CLS502.MTH6934(s10, new String[]{CLS27.MTH905().MTH874()}) && CLS502.MTH6934(s11, new String[]{CLS27.MTH905().MTH876()})) {
                                    CLS19.MTH804();
                                    CLS19.MTH806();
                                    CLS19.MTH805();
                                    try {
                                        JSONObject jSONObject0 = CLS27.MTH895().MTH924("LatestVersions", new JSONObject());
                                        if(jSONObject0.has("fp_base") && 0x207 < ((int)Long.parseLong(jSONObject0.getString("fp_base"), 16))) {
                                            CLS21.FLD76.MTH831("core", "downloadFeaturePack", new Object[]{"base"});
                                            return;
                                        }
                                    }
                                    catch(Throwable throwable1) {
                                        CLS27.MTH893(throwable1);
                                    }
                                    return;
                                }
                                CLS21.FLD76.MTH827("core", "unloadFeature", new Object[]{"base"});
                                CLS21.FLD76.MTH820();
                                return;
                            }
                            CLS21.FLD76.MTH827("core", "unloadFeature", new Object[]{"base"});
                            CLS21.FLD76.MTH820();
                            return;
                        }
                        CLS21.FLD76.MTH827("core", "unloadFeature", new Object[]{"base"});
                        CLS21.FLD76.MTH820();
                        return;
                    }
                    CLS21.FLD76.MTH827("core", "unloadFeature", new Object[]{"base"});
                    CLS21.FLD76.MTH820();
                    return;
                }
                else {
                    CLS21.FLD76.MTH827("core", "unloadFeature", new Object[]{"base"});
                    CLS21.FLD76.MTH820();
                }
                try {
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 5: {
                try {
                    long v4 = System.currentTimeMillis();
                    jSONArray0 = CLS27.MTH895().MTH937("cleanup_files", new JSONArray());
                    jSONArray1 = new JSONArray();
                    z2 = false;
                label_118:
                    while(v >= jSONArray0.length()) {
                        goto label_133;
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                    return;
                }
                try {
                    jSONObject1 = jSONArray0.getJSONObject(v);
                    if(v4 - jSONObject1.getLong("time") <= 43200000L) {
                        jSONArray1.put(jSONObject1);
                        ++v;
                        goto label_118;
                    }
                    goto label_123;
                }
                catch(Throwable unused_ex) {
                }
                ++v;
                goto label_118;
                try {
                label_123:
                    File file0 = new File(jSONObject1.getString("path"));
                    if(file0.exists()) {
                        if(file0.isFile()) {
                            CLS31.MTH1011(file0);
                        }
                        else if(file0.isDirectory()) {
                            CLS31.MTH1035(file0);
                        }
                    }
                }
                catch(Throwable unused_ex) {
                }
                z2 = true;
                try {
                    ++v;
                    goto label_118;
                label_133:
                    if(z2) {
                        if(jSONArray1.length() == 0) {
                            CLS27.MTH895().MTH932("cleanup_files");
                            return;
                        }
                        CLS27.MTH895().MTH922(jSONArray1, "cleanup_files");
                        return;
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            default: {
                String s = CLS371.FLD3470.MTH5378();
                HashMap hashMap0 = CLS371.FLD3470.MTH5338(s);
                if(!hashMap0.isEmpty()) {
                    HashSet hashSet0 = new HashSet();
                    String s1 = CLS27.MTH895().MTH925("werun_excl", "");
                    if(!TextUtils.isEmpty(s1)) {
                        hashSet0.addAll(Arrays.asList(CLS502.MTH6941(s1)));
                    }
                    int v1 = CLS27.MTH895().MTH927(0, "werun_steps");
                    for(Object object0: hashMap0.keySet()) {
                        String s2 = (String)object0;
                        if(!hashSet0.contains(s2) && ((int)(((Integer)hashMap0.get(s2)))) > v1) {
                            CLS66.MTH1422(s2, s);
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        int v2;
        switch(this.FLD2906) {
            case 0: {
                try {
                    int v1 = Integer.parseInt(s);
                    CLS27.MTH895().MTH922(v1, "mr_repeat_no");
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 18: {
                CLS27.MTH895().MTH922(s, "chatroom_owner_lbl");
                return;
            }
            case 19: {
                CLS27.MTH895().MTH922(s, "chatroom_mod_lbl");
                return;
            }
            case 22: {
                if(!TextUtils.isEmpty(s)) {
                    try {
                        v2 = Integer.parseInt(s);
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                        v2 = 60;
                    }
                    CLS27.MTH895().MTH922(v2, "merge_voices_split");
                }
                return;
            }
            case 28: {
                try {
                    int v3 = Integer.parseInt(s);
                    CLS27.MTH895().MTH922(v3, "friendreq_limit_auto_bypass_attempts");
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            default: {
                try {
                    int v = Integer.parseInt(s);
                    CLS27.MTH895().MTH922(v, "friendreq_max_break");
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1629$CLS548
    public final void MTH7368(String s) {
        Integer integer0;
        CLS29 ˎᵢ0;
        switch(s) {
            case "radio_order_down": {
                ˎᵢ0 = CLS27.MTH895();
                integer0 = 1;
                break;
            }
            case "radio_order_up": {
                ˎᵢ0 = CLS27.MTH895();
                integer0 = 0;
                break;
            }
            case "random": {
                ˎᵢ0 = CLS27.MTH895();
                integer0 = 2;
                break;
            }
            default: {
                return;
            }
        }
        ˎᵢ0.MTH922(integer0, "friendreq_order");
    }

    @Override  // b.ʻˑ.CLS13
    public final void MTH770(String s) {
        if(!TextUtils.isEmpty(s)) {
            CLS466.MTH6516(new File(new CLS69(s).MTH1563()));
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱʾ.CLS363$CLS362
    public final void MTH5249(TextView textView0, CLS78 ˊﾞ0) {
        if(this.FLD2906 == 24) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("<b>");
            stringBuilder0.append("");
            stringBuilder0.append("</b>");
            String s = ˊﾞ0.FLD277;
            int v = ˊﾞ0.FLD278;
            if(v != -1) {
                stringBuilder0.append("<br>");
                if(v == 1) {
                    stringBuilder0.append(CLS27.MTH889(CLS370.MTH5289(0x38EAF5522B3CD335L)));
                }
                else if(v == 2) {
                    stringBuilder0.append(CLS27.MTH889(CLS370.MTH5289(4101360191180428085L)));
                }
            }
            if(!TextUtils.isEmpty(s)) {
                stringBuilder0.append("<br><i>");
                stringBuilder0.append(s);
                stringBuilder0.append("</i>");
            }
            if(CLS371.FLD3470.MTH5382("")) {
                stringBuilder0.append("<br>");
                stringBuilder0.append(CLS27.MTH889(CLS370.MTH5289(0x38EAF57C2B3CD335L)));
            }
            else if(CLS288.FLD2989.MTH4730("")) {
                stringBuilder0.append("<br>");
                stringBuilder0.append(CLS27.MTH889(CLS370.MTH5289(4101359869057880885L)));
            }
            CLS523.MTH7155(textView0, stringBuilder0.toString());
            return;
        }
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("<b>");
        stringBuilder1.append("");
        stringBuilder1.append("</b>");
        String s1 = ˊﾞ0.FLD277;
        int v1 = ˊﾞ0.FLD278;
        if(v1 != -1) {
            stringBuilder1.append("<br>");
            if(v1 == 1) {
                stringBuilder1.append(CLS27.MTH889(CLS370.MTH5289(0x38EAFE412B3CD335L)));
            }
            else if(v1 == 2) {
                stringBuilder1.append(CLS27.MTH889(CLS370.MTH5289(4101370013770634037L)));
            }
        }
        if(!TextUtils.isEmpty(s1)) {
            stringBuilder1.append("<br><i>");
            stringBuilder1.append(s1);
            stringBuilder1.append("</i>");
        }
        if(CLS371.FLD3470.MTH5382("")) {
            stringBuilder1.append("<br>");
            stringBuilder1.append(CLS27.MTH889(CLS370.MTH5289(4101370146914620213L)));
        }
        else if(CLS288.FLD2989.MTH4730("")) {
            stringBuilder1.append("<br>");
            stringBuilder1.append(CLS27.MTH889(CLS370.MTH5289(0x38EAFE012B3CD335L)));
        }
        CLS523.MTH7155(textView0, stringBuilder1.toString());
    }

    @Override  // b.ʻˑ.CLS6
    public final void MTH783(ArrayList arrayList0) {
        CLS466.MTH6540(CLS66.MTH1437(arrayList0));
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        switch(this.FLD2906) {
            case 1: {
                CLS27.MTH895().MTH922(((int)v), "mr_repeat_delay");
                return;
            }
            case 2: {
                CLS27.MTH895().MTH922(((int)v), "mr_delete_delay");
                return;
            }
            default: {
                CLS27.MTH895().MTH922(((int)v), "friend_request_limitbypass_delay");
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        switch(this.FLD2906) {
            case 14: {
                if(!TextUtils.isEmpty(s)) {
                    String[] arr_s = s.split("#");
                    String s1 = arr_s[0].trim();
                    String s2 = arr_s.length == 2 ? arr_s[1].trim() : "";
                    CLS27.MTH895().MTH922(s2, s1);
                }
                return;
            }
            case 17: {
                if(!TextUtils.isEmpty(s)) {
                    CLS21.FLD76.MTH818("tts", new Object[]{s});
                }
                return;
            }
            default: {
                try {
                    if(!TextUtils.isEmpty(s)) {
                        CLS66.MTH1415(s);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final Long MTH4646(Object object0) {
        switch(this.FLD2906) {
            case 6: {
                return ((Bundle)object0).getLong("msgId");
            }
            case 7: {
                return ((Bundle)object0).getLong("msgId");
            }
            case 8: {
                return ((Bundle)object0).getLong("msgId");
            }
            case 11: {
                return ((Bundle)object0).getLong("msgId");
            }
            default: {
                return ((Bundle)object0).getLong("msgId");
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        switch(this.FLD2906) {
            case 15: {
                String s = CLS182.MTH3489(0x38EC07192B3CD335L, new StringBuilder(), object0);
                CLS21.FLD76.MTH818("specialModes.config", new Object[]{s});
                return;
            }
            case 16: {
                CLS21.FLD76.MTH819("snstimelineui.optionsmenu.config", new Object[]{((String)object0)});
                return;
            }
            default: {
                CLS21.FLD76.MTH818("fast_switch", new Object[]{((String)object0)});
            }
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH4648(String s) {
        String[] arr_s = s.split(":");
        return String.format("%02d:%02d", Integer.parseInt(arr_s[0]), Integer.parseInt(arr_s[1]));
    }
}

