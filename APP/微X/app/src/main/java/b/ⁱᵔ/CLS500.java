// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS33;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS92;
import b.ˑٴ.CLS777;
import b.ᐧˉ.CLS1156;
import java.util.HashSet;
import org.json.JSONArray;

public final class CLS500 {
    public final CLS92 FLD4923;
    public String FLD4924;
    public final CLS92 FLD4925;
    public final CLS92 FLD4926;
    public HashSet FLD4927;
    public static final CLS500 FLD4928;
    public String FLD4929;

    static {
        CLS500.FLD4928 = new CLS500();
    }

    // 此方法包含解密的字符串
    public CLS500() {
        this.FLD4924 = "";
        this.FLD4929 = "";
        this.FLD4927 = new HashSet();
        this.FLD4923 = new CLS92(300000L);
        this.FLD4926 = new CLS92(300000L);
        this.FLD4925 = new CLS92(300000L);
        CLS777 ᐧʾ0 = new CLS777(1, this);
        CLS21.FLD76.MTH828("updateLicense", ((CLS35)ᐧʾ0));
        try {
            this.MTH6893();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH6891() {
        this.FLD4923.MTH1742();
        String s = CLS27.MTH904();
        if(TextUtils.isEmpty(s)) {
            return;
        }
        Object object0 = CLS27.MTH883(150, new Object[]{6, s});
        String s1 = object0 == null ? "" : ((String)object0);
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        CLS1156 ᵔᵎ0 = new CLS1156(this, s1, 18);
        CLS40.FLD157.MTH1124(((CLS39)ᵔᵎ0));
    }

    public static CLS500 MTH6892() {
        return CLS500.FLD4928;
    }

    // 此方法包含解密的字符串
    public final void MTH6893() {
        String s = CLS21.FLD76.MTH826("getLicData", new Object[0]);
        if(TextUtils.isEmpty(s)) {
            s = CLS27.MTH895().MTH925("LIC", this.FLD4924);
        }
        else {
            this.FLD4924 = s;
        }
        if(!TextUtils.isEmpty(s) && s.contains("#")) {
            String[] arr_s = s.split("#");
            if(arr_s.length != 3) {
                return;
            }
            this.FLD4927.clear();
            this.FLD4923.MTH1742();
            this.FLD4926.MTH1742();
            this.FLD4925.MTH1742();
            try {
                JSONArray jSONArray0 = new JSONArray(CLS33.MTH1053(CLS27.MTH904(), arr_s[2]));
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    this.FLD4927.add(jSONArray0.getInt(v));
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            this.MTH6891();
        }
    }

    public final boolean MTH6894(int v) {
        if(!this.MTH6896(v)) {
            return false;
        }
        String s = CLS27.MTH904();
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        Object object0 = CLS27.MTH883(150, new Object[]{1, s, String.valueOf(v)});
        return object0 != null && ((Boolean)object0).booleanValue();
    }

    public final boolean MTH6895(String s) {
        boolean z = true;
        if(!this.FLD4927.contains(1)) {
            return false;
        }
        CLS92 ⁱʽ0 = this.FLD4923;
        if(ⁱʽ0.MTH1745(s)) {
            return ((Boolean)ⁱʽ0.MTH1744(s)).booleanValue();
        }
        String s1 = CLS27.MTH904();
        if(TextUtils.isEmpty(s1)) {
            return false;
        }
        Object object0 = CLS27.MTH883(150, new Object[]{2, s1, s});
        if(object0 == null || !((Boolean)object0).booleanValue()) {
            z = false;
        }
        ⁱʽ0.MTH1746(s, Boolean.valueOf(z));
        return z;
    }

    public final boolean MTH6896(int v) {
        return this.FLD4927.contains(v);
    }

    public final boolean MTH6897() {
        if(!this.MTH6896(4)) {
            return false;
        }
        CLS92 ⁱʽ0 = this.FLD4925;
        if(ⁱʽ0.MTH1745(4)) {
            return ((Boolean)ⁱʽ0.MTH1744(4)).booleanValue();
        }
        boolean z = this.MTH6894(4);
        if(z) {
            ⁱʽ0.MTH1746(4, Boolean.TRUE);
        }
        return z;
    }

    public final boolean MTH6898() {
        if(!this.MTH6896(0)) {
            return false;
        }
        CLS92 ⁱʽ0 = this.FLD4925;
        if(ⁱʽ0.MTH1745(0)) {
            return ((Boolean)ⁱʽ0.MTH1744(0)).booleanValue();
        }
        boolean z = this.MTH6894(0);
        if(z) {
            ⁱʽ0.MTH1746(0, Boolean.TRUE);
        }
        return z;
    }
}

