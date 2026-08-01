// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS3;
import b.ⁱʾ.CLS316;

public final class CLS978 implements CLS3 {
    public final int FLD1933;
    public final CLS316 FLD1934;

    public CLS978(CLS316 ʽי0, int v) {
        this.FLD1933 = v;
        this.FLD1934 = ʽי0;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS316 ʽי0 = this.FLD1934;
        if(this.FLD1933 == 0) {
            ʽי0.notifyDataSetChanged();
            return;
        }
        ʽי0.notifyDataSetChanged();
    }
}

