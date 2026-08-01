// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS36.CLS35;
import b.יﹳ.CLS167;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS502;

public final class CLS802 implements CLS35 {
    public final int FLD1190;
    public final CLS872 FLD1191;

    public CLS802(CLS872 ﹶᵎ0, int v) {
        this.FLD1190 = v;
        this.FLD1191 = ﹶᵎ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        CLS872 ﹶᵎ0 = this.FLD1191;
        if(this.FLD1190 == 0) {
            ﹶᵎ0.getClass();
            String s = (String)arr_object[0];
            CLS476.MTH6645(((CLS140)ﹶᵎ0).MTH3042(), ((CLS7)new CLS806(ﹶᵎ0, s, 0)), new CLS806(ﹶᵎ0, s, 1));
            return;
        }
        ﹶᵎ0.getClass();
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        CharSequence charSequence0 = (CharSequence)ᵔʾ0.MTH3204()[0];
        if(!TextUtils.isEmpty(charSequence0) && CLS502.MTH6936(charSequence0).toLowerCase().startsWith("#mp3")) {
            ᵔʾ0.MTH3207(null);
            ﹶᵎ0.FLD1447.MTH3022("");
            CLS21.FLD76.MTH818("sendmp3_selection", new Object[]{ﹶᵎ0.FLD1447.FLD1434});
        }
    }
}

