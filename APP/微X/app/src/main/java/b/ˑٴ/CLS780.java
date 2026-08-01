// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.app.AlertDialog;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS1049;
import b.ⁱᵔ.CLS1417;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS556.CLS555;
import b.ﾞˎ.CLS556;

public final class CLS780 implements CLS3 {
    public final int FLD1098;
    public final Activity FLD1099;
    public final CLS881 FLD1100;

    public CLS780(CLS881 ﾞˏ0, Activity activity0, int v) {
        this.FLD1098 = v;
        this.FLD1100 = ﾞˏ0;
        this.FLD1099 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS881 ﾞˏ0 = this.FLD1100;
        if(this.FLD1098 == 0) {
            ﾞˏ0.getClass();
            CLS731 ˏﾞ0 = new CLS731(ﾞˏ0);
            if(CLS395.FLD3772 != null && CLS395.FLD3772.isShowing()) {
                CLS395.FLD3772.dismiss();
            }
            String s = CLS27.MTH889("search_image");
            String[] arr_s = {""};
            CLS1049 ˑᴵ0 = new CLS1049(arr_s, this.FLD1099, ˏﾞ0, 8);
            CLS1417 ˋʼ0 = new CLS1417(ˏﾞ0, arr_s);
            AlertDialog alertDialog0 = CLS523.MTH7160(this.FLD1099, s, ((CLS17)ˑᴵ0), ((CLS11)ˋʼ0));
            CLS395.FLD3772 = alertDialog0;
            alertDialog0.getWindow().setSoftInputMode(5);
            return;
        }
        String s1 = CLS522.MTH7113(ﾞˏ0.FLD1495.FLD400);
        CLS799 ᴵᵎ0 = new CLS799(ﾞˏ0, 6);
        new CLS556(this.FLD1099, s1, "", ((CLS555)ᴵᵎ0), true).MTH7432();
    }
}

