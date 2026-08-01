// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ᵔʾ.CLS304.CLS303;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS502;
import b.ﾞˎ.CLS1622.CLS539;

public final class CLS1091 implements CLS539 {
    public final int FLD2371;
    public final CLS303 FLD2372;

    public CLS1091(CLS303 ᵔʾ$ˆٴ0, int v) {
        this.FLD2371 = v;
        this.FLD2372 = ᵔʾ$ˆٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS303 ᵔʾ$ˆٴ0 = this.FLD2372;
        if(this.FLD2371 == 0) {
            ᵔʾ$ˆٴ0.FLD3160 = s;
            return;
        }
        if(ᵔʾ$ˆٴ0.FLD3166) {
            if(CLS502.MTH6934(s, new String[]{","})) {
                String[] arr_s = s.split(",");
                String s1 = arr_s[0].trim();
                String s2 = arr_s[1].trim();
                if(TextUtils.isDigitsOnly(s1) && TextUtils.isDigitsOnly(s2)) {
                    int v = Integer.parseInt(s1);
                    int v1 = Integer.parseInt(s2);
                    ᵔʾ$ˆٴ0.FLD3166 = true;
                    ᵔʾ$ˆٴ0.FLD3163 = v1;
                    ᵔʾ$ˆٴ0.FLD3168 = v;
                    ᵔʾ$ˆٴ0.FLD3161 = CLS412.MTH6015(v, v1);
                }
            }
        }
        else if(TextUtils.isDigitsOnly(s)) {
            int v2 = Integer.parseInt(s);
            ᵔʾ$ˆٴ0.FLD3166 = false;
            ᵔʾ$ˆٴ0.FLD3168 = v2;
            ᵔʾ$ˆٴ0.FLD3163 = v2;
        }
    }
}

