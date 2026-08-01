// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.text.TextUtils;
import d.יʻ.CLS173;
import d.יʻ.CLS62;
import d.יʻ.CLS65.CLS64;
import d.יʻ.CLS66;
import d.יʻ.CLS68.CLS67;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import d.ᵎʻ.CLS118;
import d.ⁱﾞ.CLS214;
import java.util.HashSet;
import org.json.JSONArray;

public final class CLS53 {
    public final CLS118 FLD277;
    public String FLD278;
    public final CLS118 FLD279;
    public HashSet FLD280;
    public final CLS118 FLD281;
    public static final CLS53 FLD282;

    static {
        CLS53.FLD282 = new CLS53();
    }

    // 此方法包含解密的字符串
    public CLS53() {
        this.FLD278 = "";
        new String("");
        this.FLD280 = new HashSet();
        this.FLD279 = new CLS118(300000L);
        this.FLD277 = new CLS118(300000L);
        this.FLD281 = new CLS118(300000L);
        CLS214 ᵎʻ0 = new CLS214(this, 1);
        CLS62.FLD317.MTH753("updateLicense", ((CLS64)ᵎʻ0));
        try {
            this.MTH716();
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
    }

    // 去混淆评级： 中等(50)
    public final boolean MTH710() {
        return this.MTH711(0) || this.MTH711(4) || this.MTH711(2) || this.MTH711(101) || this.MTH711(104);
    }

    public final boolean MTH711(int v) {
        return this.FLD280.contains(v);
    }

    // 此方法包含解密的字符串
    public final void MTH712() {
        this.FLD279.MTH1157();
        String s = CLS69.MTH805();
        if(TextUtils.isEmpty(s)) {
            return;
        }
        Object object0 = CLS69.MTH808(150, new Object[]{6, s});
        String s1 = object0 == null ? "" : ((String)object0);
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        CLS173 ᐧˈ0 = new CLS173(this, s1, 7);
        CLS68.FLD326.MTH787(((CLS67)ᐧˈ0));
    }

    // 此方法包含解密的字符串
    public final long MTH713(int v) {
        if(!this.MTH711(v)) {
            return -1L;
        }
        String s = CLS69.MTH805();
        if(TextUtils.isEmpty(s)) {
            return -1L;
        }
        Object object0 = CLS69.MTH808(150, new Object[]{4, s, String.valueOf(v)});
        if(object0 != null) {
            return ((String)object0).equals("unlimited") ? 0L : Long.parseLong(((String)object0), 16);
        }
        return -1L;
    }

    public final boolean MTH714(int v) {
        if(!this.MTH711(v)) {
            return false;
        }
        String s = CLS69.MTH805();
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        Object object0 = CLS69.MTH808(150, new Object[]{1, s, String.valueOf(v)});
        return object0 != null && ((Boolean)object0).booleanValue();
    }

    public final boolean MTH715(String s) {
        boolean z = true;
        if(!this.FLD280.contains(1)) {
            return false;
        }
        CLS118 ᵎʻ0 = this.FLD279;
        if(ᵎʻ0.MTH1155(s)) {
            return ((Boolean)ᵎʻ0.MTH1159(s)).booleanValue();
        }
        String s1 = CLS69.MTH805();
        if(TextUtils.isEmpty(s1)) {
            return false;
        }
        Object object0 = CLS69.MTH808(150, new Object[]{2, s1, s});
        if(object0 == null || !((Boolean)object0).booleanValue()) {
            z = false;
        }
        ᵎʻ0.MTH1158(s, Boolean.valueOf(z));
        return z;
    }

    // 此方法包含解密的字符串
    public final void MTH716() {
        String s = CLS62.FLD317.MTH756("getLicData", new Object[0]);
        if(TextUtils.isEmpty(s)) {
            s = CLS69.MTH801().MTH740("LIC", this.FLD278);
        }
        else {
            this.FLD278 = s;
        }
        if(!TextUtils.isEmpty(s) && s.contains("#")) {
            String[] arr_s = s.split("#");
            if(arr_s.length != 3) {
                return;
            }
            this.FLD280.clear();
            this.FLD279.MTH1157();
            this.FLD277.MTH1157();
            this.FLD281.MTH1157();
            try {
                JSONArray jSONArray0 = new JSONArray(CLS66.MTH780(CLS69.MTH805(), arr_s[2]));
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    this.FLD280.add(jSONArray0.getInt(v));
                }
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
            this.MTH712();
        }
    }
}

