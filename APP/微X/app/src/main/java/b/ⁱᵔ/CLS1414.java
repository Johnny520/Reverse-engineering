// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS0;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;

public final class CLS1414 implements CLS3 {
    public final long FLD4057;
    public final CLS0 FLD4058;
    public final String FLD4059;
    public final int FLD4060;
    public final long FLD4061;

    public CLS1414(int v, long v1, long v2, CLS0 ʻˑ0, String s) {
        this.FLD4057 = v1;
        this.FLD4060 = v;
        this.FLD4059 = s;
        this.FLD4061 = v2;
        this.FLD4058 = ʻˑ0;
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        long v = this.FLD4057;
        String s = this.FLD4059;
        long v1 = this.FLD4061;
        CLS0 ʻˑ0 = this.FLD4058;
        if(CLS466.MTH6521(v, this.FLD4060)) {
            CLS1463 ˏⁱ0 = new CLS1463(v, v1, ʻˑ0, s);
            CLS40.FLD157.MTH1124(((CLS39)ˏⁱ0));
            return;
        }
        if(ʻˑ0 != null) {
            ʻˑ0.MTH770(CLS371.FLD3470.MTH5319(v));
        }
    }
}

