// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˑٴ.CLS677;
import b.ﾞˎ.CLS1622;

public final class CLS1409 implements CLS11 {
    public final CLS29 FLD4039;
    public final CLS8 FLD4040;
    public final CLS1622 FLD4041;

    public CLS1409(CLS29 ˎᵢ0, CLS1622 ˑٴ0, CLS677 ˈ0) {
        this.FLD4039 = ˎᵢ0;
        this.FLD4041 = ˑٴ0;
        this.FLD4040 = ˈ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            CLS1622 ˑٴ0 = this.FLD4041;
            CLS29 ˎᵢ0 = this.FLD4039;
            ˎᵢ0.MTH922(Integer.valueOf(ˑٴ0.MTH7285()), "werun_steps");
            CLS8 ـˏ0 = this.FLD4040;
            if(ـˏ0 != null) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("min_score", ˑٴ0.MTH7285());
                contentValues0.put("excl_users", ˎᵢ0.MTH925("werun_excl", ""));
                ـˏ0.MTH786(contentValues0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

