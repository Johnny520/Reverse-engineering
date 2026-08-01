// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.text.TextUtils;
import c.ˈⁱ.CLS95;
import c.ˑʼ.CLS129;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;

public class CLS200 {
    public final CLS129 FLD944;
    public static final CLS200 FLD945;
    public final CLS129 FLD946;
    public final HashSet FLD947;
    public boolean FLD948;

    static {
        CLS200.FLD945 = new CLS200();
    }

    public CLS200() {
        this.FLD947 = new HashSet();
        this.FLD946 = new CLS129(300000L);
        this.FLD944 = new CLS129(300000L);
    }

    // 此方法包含解密的字符串
    public ArrayList MTH3222() {
        ArrayList arrayList0 = new ArrayList();
        String s = this.MTH3241("\uD8E3f");
        if(!TextUtils.isEmpty(s)) {
            arrayList0.addAll(Arrays.asList(CLS170.MTH3005(s)));
        }
        return arrayList0;
    }

    public void MTH3223(String s) {
        if(!this.FLD948 && !TextUtils.isEmpty(s)) {
            this.FLD948 = true;
            this.MTH3236(s);
        }
    }

    public static CLS200 MTH3224() {
        return CLS200.FLD945;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public boolean MTH3225() {
        return this.MTH3230("\uD8E3ntegrated_allowed") || this.MTH3231();
    }

    // 此方法包含解密的字符串
    public void MTH3226() {
        if(this.FLD947 != null && !this.FLD947.isEmpty()) {
            CLS213.MTH3304().MTH3320("\uD8E3pdateLicense", new Object[]{this.FLD947});
        }
    }

    public boolean MTH3227(int v) {
        return this.FLD947.contains(v);
    }

    // 此方法包含解密的字符串
    public void MTH3228(String s, String s1) {
        this.FLD947.clear();
        this.FLD946.MTH2485();
        this.FLD944.MTH2485();
        if(!TextUtils.isEmpty(s) && s.contains("\uD8E3")) {
            String[] arr_s = s.split("\uD8E3");
            if(arr_s.length != 3) {
                return;
            }
            if(TextUtils.isEmpty(s1)) {
                s1 = CLS95.MTH2014();
            }
            if(TextUtils.isEmpty(s1)) {
                return;
            }
            try {
                JSONArray jSONArray0 = new JSONArray(CLS198.MTH3212(s1, arr_s[2]));
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    Integer integer0 = jSONArray0.getInt(v);
                    this.FLD947.add(integer0);
                }
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
            CLS95.MTH1982(150, new Object[]{0, s1, arr_s[0], arr_s[1].getBytes()});
            this.MTH3235();
            this.MTH3226();
        }
    }

    public boolean MTH3229() {
        return this.MTH3233(0);
    }

    public boolean MTH3230(String s) {
        boolean z = true;
        if(!this.FLD947.contains(1)) {
            return false;
        }
        if(this.FLD946.MTH2483(s)) {
            return ((Boolean)this.FLD946.MTH2486(s)).booleanValue();
        }
        String s1 = CLS95.MTH2014();
        if(TextUtils.isEmpty(s1)) {
            return false;
        }
        Object object0 = CLS95.MTH1982(150, new Object[]{2, s1, s});
        if(object0 == null || !((Boolean)object0).booleanValue()) {
            z = false;
        }
        this.FLD946.MTH2484(s, Boolean.valueOf(z));
        return z;
    }

    public boolean MTH3231() {
        return this.MTH3233(104);
    }

    public boolean MTH3232() {
        return this.MTH3233(4);
    }

    public boolean MTH3233(int v) {
        if(!this.MTH3227(v)) {
            return false;
        }
        String s = CLS95.MTH2014();
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        Object object0 = CLS95.MTH1982(150, new Object[]{1, s, String.valueOf(v)});
        return object0 != null && ((Boolean)object0).booleanValue();
    }

    public boolean MTH3234() {
        return this.MTH3233(101);
    }

    // 此方法包含解密的字符串
    public final void MTH3235() {
        this.FLD946.MTH2485();
        String s = this.MTH3237();
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String[] arr_s = s.split("\uD8E3");
        for(int v = 0; v < arr_s.length; ++v) {
            this.FLD946.MTH2484(arr_s[v], Boolean.TRUE);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public void MTH3236(String s) {
        this.MTH3228(CLS95.MTH2031().MTH2733("\uD8E3IC", ""), s);
    }

    // 此方法包含解密的字符串
    public final String MTH3237() {
        String s = CLS95.MTH2014();
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        Object object0 = CLS95.MTH1982(150, new Object[]{6, s});
        return object0 == null ? "" : ((String)object0);
    }

    public boolean MTH3238() {
        return this.MTH3233(2);
    }

    // 此方法包含解密的字符串
    public long MTH3239(int v) {
        if(!this.FLD947.contains(v)) {
            return -1L;
        }
        String s = CLS95.MTH2014();
        if(TextUtils.isEmpty(s)) {
            return -1L;
        }
        Object object0 = CLS95.MTH1982(150, new Object[]{4, s, String.valueOf(v)});
        if(object0 != null) {
            return ((String)object0).equals("\uD8E3nlimited") ? 0L : Long.parseLong(((String)object0), 16);
        }
        return -1L;
    }

    // 去混淆评级： 中等(50)
    public boolean MTH3240() {
        return this.MTH3229() || this.MTH3232() || this.MTH3238() || this.MTH3234() || this.MTH3231();
    }

    // 此方法包含解密的字符串
    public final String MTH3241(String s) {
        if(this.FLD947.isEmpty()) {
            return "";
        }
        if(this.FLD944.MTH2483(s)) {
            return (String)this.FLD944.MTH2486(s);
        }
        String s1 = CLS95.MTH2014();
        if(TextUtils.isEmpty(s1)) {
            return "";
        }
        Object object0 = CLS95.MTH1982(150, new Object[]{3, s1, s});
        String s2 = object0 == null ? "" : ((String)object0);
        this.FLD944.MTH2484(s, s2);
        return s2;
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public String MTH3242() {
        return this.FLD947.contains(1) ? this.MTH3237() : "";
    }
}

