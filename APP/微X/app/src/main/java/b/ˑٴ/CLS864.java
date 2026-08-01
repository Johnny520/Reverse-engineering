// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS38.CLS37;
import b.ⁱᵔ.CLS412;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import org.json.JSONObject;

public final class CLS864 extends CLS140 {
    public final HashSet FLD1382;
    public final HashSet FLD1383;
    public final HashSet FLD1384;
    public final HashSet FLD1385;
    public final HashSet FLD1386;
    public Object FLD1387;
    public final Random FLD1388;
    public final HashSet FLD1389;
    public final HashSet FLD1390;

    public CLS864(CLS139 ﹶʼ0) {
        super(ﹶʼ0);
        this.FLD1386 = new HashSet();
        this.FLD1390 = new HashSet();
        this.FLD1389 = new HashSet();
        this.FLD1383 = new HashSet();
        this.FLD1384 = new HashSet();
        this.FLD1382 = new HashSet();
        this.FLD1385 = new HashSet();
        Random random0 = new Random();
        this.FLD1388 = random0;
        random0.setSeed(System.currentTimeMillis());
    }

    // 此方法包含解密的字符串
    public final void MTH2992() {
        CLS29 ˎᵢ0 = this.FLD1445;
        if(!ˎᵢ0.MTH938("persistent_special_mode_enable", false)) {
            return;
        }
        JSONObject jSONObject0 = ˎᵢ0.MTH924("persistent_special_mode", new JSONObject());
        try {
            if(jSONObject0.has("autorecall")) {
                HashSet hashSet0 = new HashSet(Arrays.asList(jSONObject0.getString("autorecall").split(",")));
                this.FLD1386.addAll(hashSet0);
            }
            if(jSONObject0.has("encrypted")) {
                HashSet hashSet1 = new HashSet(Arrays.asList(jSONObject0.getString("encrypted").split(",")));
                this.FLD1390.addAll(hashSet1);
            }
            if(jSONObject0.has("autotranslate")) {
                HashSet hashSet2 = new HashSet(Arrays.asList(jSONObject0.getString("autotranslate").split(",")));
                this.FLD1383.addAll(hashSet2);
            }
            if(jSONObject0.has("autotranscribe")) {
                HashSet hashSet3 = new HashSet(Arrays.asList(jSONObject0.getString("autotranscribe").split(",")));
                this.FLD1384.addAll(hashSet3);
            }
            if(jSONObject0.has("tts")) {
                HashSet hashSet4 = new HashSet(Arrays.asList(jSONObject0.getString("tts").split(",")));
                this.FLD1382.addAll(hashSet4);
            }
            if(jSONObject0.has("tail")) {
                HashSet hashSet5 = new HashSet(Arrays.asList(jSONObject0.getString("tail").split(",")));
                this.FLD1389.addAll(hashSet5);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        ʾᵢ0.MTH828("a.dbinsert.message", ((CLS35)new CLS700(this, 0)));
        ʾᵢ0.MTH828("b.sqldb.insert", ((CLS35)new CLS700(this, 1)));
        ʾᵢ0.MTH828("a.msgitem", ((CLS35)new CLS700(this, 2)));
        ʾᵢ0.MTH828("b.chat.onresume", ((CLS35)new CLS700(this, 3)));
        ʾᵢ0.MTH828("b.chat.send.click", ((CLS35)new CLS700(this, 4)));
        ʾᵢ0.MTH833("isAutoRecallMode", ((CLS37)new CLS676(this, 0)));
        ʾᵢ0.MTH828("onsettingschange", ((CLS35)new CLS700(this, 5)));
        CLS21 ʾᵢ1 = CLS21.FLD76;
        ʾᵢ1.MTH833("specialModes.options", ((CLS37)new CLS676(this, 4)));
        ʾᵢ1.MTH833("specialModes.options", ((CLS37)new CLS676(this, 5)));
        ʾᵢ1.MTH833("specialModes.options", ((CLS37)new CLS676(this, 6)));
        ʾᵢ1.MTH833("specialModes.options", ((CLS37)new CLS676(this, 7)));
        ʾᵢ1.MTH833("specialModes.options", ((CLS37)new CLS676(this, 8)));
        ʾᵢ1.MTH833("specialModes.options", ((CLS37)new CLS676(this, 9)));
        ʾᵢ1.MTH828("specialModes.config", ((CLS35)new CLS700(this, 7)));
        if(!CLS412.MTH6002()) {
            ʾᵢ1.MTH833("chattingui.optionsmenu.options", ((CLS37)new CLS676(this, 1)));
            ʾᵢ1.MTH833("chattingui.optionsmenu.options", ((CLS37)new CLS676(this, 2)));
            ʾᵢ1.MTH833("chattingui.optionsmenu.options", ((CLS37)new CLS676(this, 3)));
            ʾᵢ1.MTH828("chattingui.optionsmenu.config", ((CLS35)new CLS700(this, 6)));
        }
    }

    @Override  // b.ˑٴ.CLS140
    public final void MTH3043() {
        this.MTH2992();
    }

    // 此方法包含解密的字符串
    public final void MTH2995(String s, String s1) {
        switch(s) {
            case "autorecall": {
                this.FLD1386.add(s1);
                break;
            }
            case "autotranscribe": {
                this.FLD1384.add(s1);
                break;
            }
            case "autotranslate": {
                this.FLD1383.add(s1);
                break;
            }
            case "encrypted": {
                this.FLD1390.add(s1);
                break;
            }
            case "tail": {
                this.FLD1389.add(s1);
                break;
            }
            case "tts": {
                this.FLD1382.add(s1);
            }
        }
        CLS29 ˎᵢ0 = this.FLD1445;
        if(!ˎᵢ0.MTH938("persistent_special_mode_enable", false)) {
            return;
        }
        JSONObject jSONObject0 = ˎᵢ0.MTH924("persistent_special_mode", new JSONObject());
        try {
            HashSet hashSet0 = new HashSet();
            if(jSONObject0.has(s)) {
                hashSet0.addAll(Arrays.asList(jSONObject0.getString(s).split(",")));
            }
            hashSet0.add(s1);
            jSONObject0.put(s, TextUtils.join(",", hashSet0));
            ˎᵢ0.MTH922(jSONObject0, "persistent_special_mode");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2996(String s, String s1) {
        switch(s) {
            case "autorecall": {
                this.FLD1386.remove(s1);
                break;
            }
            case "autotranscribe": {
                this.FLD1384.remove(s1);
                break;
            }
            case "autotranslate": {
                this.FLD1383.remove(s1);
                break;
            }
            case "encrypted": {
                this.FLD1390.remove(s1);
                break;
            }
            case "tail": {
                this.FLD1389.remove(s1);
                break;
            }
            case "tts": {
                this.FLD1382.remove(s1);
            }
        }
        CLS29 ˎᵢ0 = this.FLD1445;
        if(!ˎᵢ0.MTH938("persistent_special_mode_enable", false)) {
            return;
        }
        JSONObject jSONObject0 = ˎᵢ0.MTH924("persistent_special_mode", new JSONObject());
        try {
            HashSet hashSet0 = new HashSet();
            if(jSONObject0.has(s)) {
                hashSet0.addAll(Arrays.asList(jSONObject0.getString(s).split(",")));
            }
            hashSet0.remove(s1);
            jSONObject0.put(s, TextUtils.join(",", hashSet0));
            ˎᵢ0.MTH922(jSONObject0, "persistent_special_mode");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

