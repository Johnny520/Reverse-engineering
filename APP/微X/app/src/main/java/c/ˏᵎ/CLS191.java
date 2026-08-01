// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.text.TextUtils;
import c.ˊﹶ.CLS98;
import c.יⁱ.CLS255;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;

public class CLS191 {
    public final HashSet FLD788;
    public static final CLS191 FLD789;
    public boolean FLD790;
    public final CLS255 FLD791;
    public final CLS255 FLD792;

    static {
        CLS191.FLD789 = new CLS191();
    }

    public CLS191() {
        this.FLD788 = new HashSet();
        this.FLD791 = new CLS255(300000L);
        this.FLD792 = new CLS255(300000L);
    }

    // 此方法包含解密的字符串
    public final String MTH2827() {
        String s = CLS98.MTH1305();
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        Object object0 = CLS98.MTH1336(150, new Object[]{6, s});
        return object0 == null ? "" : ((String)object0);
    }

    public boolean MTH2828(String s) {
        boolean z = true;
        if(!this.FLD788.contains(1)) {
            return false;
        }
        if(this.FLD791.MTH3354(s)) {
            return ((Boolean)this.FLD791.MTH3348(s)).booleanValue();
        }
        String s1 = CLS98.MTH1305();
        if(TextUtils.isEmpty(s1)) {
            return false;
        }
        Object object0 = CLS98.MTH1336(150, new Object[]{2, s1, s});
        if(object0 == null || !((Boolean)object0).booleanValue()) {
            z = false;
        }
        this.FLD791.MTH3349(s, Boolean.valueOf(z));
        return z;
    }

    public void MTH2829(String s) {
        if(!this.FLD790 && !TextUtils.isEmpty(s)) {
            this.FLD790 = true;
            this.MTH2838(s);
        }
    }

    public static CLS191 MTH2830() {
        return CLS191.FLD789;
    }

    public boolean MTH2831() {
        return this.MTH2843(101);
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public String MTH2832() {
        return this.FLD788.contains(1) ? this.MTH2827() : "";
    }

    public boolean MTH2833(int v) {
        return this.FLD788.contains(v);
    }

    // 此方法包含解密的字符串
    public final String MTH2834(String s) {
        if(this.FLD788.isEmpty()) {
            return "";
        }
        if(this.FLD792.MTH3354(s)) {
            return (String)this.FLD792.MTH3348(s);
        }
        String s1 = CLS98.MTH1305();
        if(TextUtils.isEmpty(s1)) {
            return "";
        }
        Object object0 = CLS98.MTH1336(150, new Object[]{3, s1, s});
        String s2 = object0 == null ? "" : ((String)object0);
        this.FLD792.MTH3349(s, s2);
        return s2;
    }

    public boolean MTH2835() {
        return this.MTH2843(0);
    }

    // 此方法包含解密的字符串
    public void MTH2836(String s, String s1) {
        this.FLD788.clear();
        this.FLD791.MTH3352();
        this.FLD792.MTH3352();
        if(!TextUtils.isEmpty(s) && s.contains("#")) {
            String[] arr_s = s.split("#");
            if(arr_s.length != 3) {
                return;
            }
            if(TextUtils.isEmpty(s1)) {
                s1 = CLS98.MTH1305();
            }
            if(TextUtils.isEmpty(s1)) {
                return;
            }
            try {
                JSONArray jSONArray0 = new JSONArray(CLS217.MTH3046(s1, arr_s[2]));
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    Integer integer0 = jSONArray0.getInt(v);
                    this.FLD788.add(integer0);
                }
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
            CLS98.MTH1336(150, new Object[]{0, s1, arr_s[0], arr_s[1].getBytes()});
            this.MTH2837();
            this.MTH2844();
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2837() {
        this.FLD791.MTH3352();
        String s = this.MTH2827();
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            this.FLD791.MTH3349(arr_s[v], Boolean.TRUE);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public void MTH2838(String s) {
        this.MTH2836(CLS98.MTH1297().MTH1015("LIC", ""), s);
    }

    public boolean MTH2839() {
        return this.MTH2843(4);
    }

    public boolean MTH2840() {
        return this.MTH2843(2);
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public boolean MTH2841() {
        return this.MTH2828("integrated_allowed") || this.MTH2845();
    }

    // 去混淆评级： 中等(50)
    public boolean MTH2842() {
        return this.MTH2835() || this.MTH2839() || this.MTH2840() || this.MTH2831() || this.MTH2845();
    }

    public boolean MTH2843(int v) {
        if(!this.MTH2833(v)) {
            return false;
        }
        String s = CLS98.MTH1305();
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        Object object0 = CLS98.MTH1336(150, new Object[]{1, s, String.valueOf(v)});
        return object0 != null && ((Boolean)object0).booleanValue();
    }

    // 此方法包含解密的字符串
    public void MTH2844() {
        if(this.FLD788 != null && !this.FLD788.isEmpty()) {
            CLS194.MTH2881().MTH2872("updateLicense", new Object[]{this.FLD788});
        }
    }

    public boolean MTH2845() {
        return this.MTH2843(104);
    }

    // 此方法包含解密的字符串
    public long MTH2846(int v) {
        if(!this.FLD788.contains(v)) {
            return -1L;
        }
        String s = CLS98.MTH1305();
        if(TextUtils.isEmpty(s)) {
            return -1L;
        }
        Object object0 = CLS98.MTH1336(150, new Object[]{4, s, String.valueOf(v)});
        if(object0 != null) {
            return ((String)object0).equals("unlimited") ? 0L : Long.parseLong(((String)object0), 16);
        }
        return -1L;
    }

    // 此方法包含解密的字符串
    public ArrayList MTH2847() {
        ArrayList arrayList0 = new ArrayList();
        String s = this.MTH2834("df");
        if(!TextUtils.isEmpty(s)) {
            arrayList0.addAll(Arrays.asList(CLS197.MTH2924(s)));
        }
        return arrayList0;
    }
}

