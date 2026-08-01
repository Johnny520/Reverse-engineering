// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;

public final class CLS327 implements CLS136 {
    public final int FLD1071;
    public final CLS309 FLD1072;

    public CLS327(CLS309 ʽﹶ0, int v) {
        this.FLD1071 = v;
        this.FLD1072 = ʽﹶ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        CLS309 ʽﹶ0 = this.FLD1072;
        switch(this.FLD1071) {
            case 0: {
                ʽﹶ0.MTH2240(ʽﹶ0.FLD1002);
                return;
            }
            case 1: {
                ʽﹶ0.MTH2239(ʽﹶ0.FLD1024, "album_dyna_photo_ui_title", CLS133.MTH2115("SnsTimeLineUI"));
                return;
            }
            case 2: {
                ʽﹶ0.MTH2239(ʽﹶ0.FLD1024, "find_friends_by_search", CLS133.MTH2115("FTSSOSHomeWebViewUI"));
                return;
            }
            default: {
                ʽﹶ0.MTH2239(ʽﹶ0.FLD1024, "find_friends_by_look", CLS133.MTH2115("TopStoryHomeUI"));
            }
        }
    }
}

