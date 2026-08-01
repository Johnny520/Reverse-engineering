// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ʻˑ.CLS4;
import b.ʻˑ.CLS563;
import b.ʾᵢ.CLS29;
import b.ˑٴ.CLS637;
import b.ˑٴ.CLS741;

public final class CLS1649 implements CLS563 {
    public final CLS11 FLD4183;
    public final CLS4 FLD4184;
    public final CLS29 FLD4185;

    public CLS1649(CLS741 ˑⁱ0, CLS29 ˎᵢ0, CLS637 ʼ0) {
        this.FLD4183 = ˑⁱ0;
        this.FLD4185 = ˎᵢ0;
        this.FLD4184 = ʼ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS29 ˎᵢ0 = this.FLD4185;
        if(ˎᵢ0.MTH938("save_comments", false)) {
            ˎᵢ0.MTH922(CLS443.FLD4310, "fake_comments");
        }
        this.FLD4184.MTH776(CLS443.FLD4310);
    }

    @Override  // b.ʻˑ.CLS563
    public final void MTH775() {
        this.FLD4183.MTH790();
    }
}

