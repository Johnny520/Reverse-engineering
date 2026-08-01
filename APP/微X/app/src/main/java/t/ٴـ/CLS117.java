// Decompiled by JEB v5.42.0.202606242140

package t.ٴـ;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import t.ˆʿ.CLS32;
import t.ˊﾞ.CLS102;
import t.ᵔʾ.CLS132.CLS131;
import t.ᵔʾ.CLS132;
import t.ᵔʾ.CLS133;

public final class CLS117 {
    public final HashMap FLD841;
    public static final CLS117 FLD842;

    static {
        CLS117.FLD842 = new CLS117();
    }

    public CLS117() {
        this.FLD841 = new HashMap();
        this.MTH1908();
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public final CLS102 MTH1905() {
        return this.MTH1907(CLS133.MTH2103().MTH2134("current_theme", ""));
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public static boolean MTH1906() {
        boolean z = CLS133.MTH2103().MTH2131("themes_enable", false);
        if(z && CLS133.FLD947.contains("io.va.exposed")) {
            z = CLS133.MTH2103().MTH2131("themes", false);
        }
        return z && !CLS32.FLD447.FLD453 ? false : z;
    }

    public final CLS102 MTH1907(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        if(!TextUtils.isEmpty(s)) {
            HashMap hashMap0 = this.FLD841;
            if(!hashMap0.containsKey(s)) {
                hashMap0.put(s, new CLS102(s));
            }
            return (CLS102)hashMap0.get(s);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final void MTH1908() {
        HashMap hashMap0 = this.FLD841;
        hashMap0.clear();
        try {
            CLS131 ⁱʽ$ˆٴ0 = CLS132.MTH2095();
            List list0 = ⁱʽ$ˆٴ0.FLD937;
            if(list0 == null || list0.isEmpty()) {
                return;
            }
            for(Object object0: new ArrayList(list0)) {
                String s = (String)object0;
                if(CLS132.MTH2090("settings.json", new String[]{s})) {
                    hashMap0.put(s, new CLS102(s));
                }
                else {
                    String s1 = ⁱʽ$ˆٴ0.MTH2076(s);
                    if(TextUtils.isEmpty(s1)) {
                        continue;
                    }
                    list0.remove(s1);
                    ⁱʽ$ˆٴ0.FLD940.remove(s1);
                    ⁱʽ$ˆٴ0.FLD938.remove(s);
                    CLS132.MTH2086(ⁱʽ$ˆٴ0.FLD939, s1, ⁱʽ$ˆٴ0.FLD941);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }
}

