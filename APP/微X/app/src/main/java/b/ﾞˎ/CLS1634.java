// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;

public final class CLS1634 implements CLS16 {
    public final int FLD5423;
    public final CLS1628 FLD5424;
    public final CLS556 FLD5425;

    public CLS1634(CLS556 ﾞٴ0, CLS1628 ᐧי0, int v) {
        this.FLD5423 = v;
        this.FLD5425 = ﾞٴ0;
        this.FLD5424 = ᐧי0;
        super();
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS1628 ᐧי0 = this.FLD5424;
        CLS556 ﾞٴ0 = this.FLD5425;
        switch(this.FLD5423) {
            case 0: {
                ﾞٴ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    int v1 = Math.max(Math.min(Integer.parseInt(s), 0xFF), 0);
                    ﾞٴ0.FLD5417 = v1;
                    ᐧי0.MTH7345(String.valueOf(v1));
                    ﾞٴ0.MTH7430();
                }
                return;
            }
            case 1: {
                ﾞٴ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    int v2 = Math.max(Math.min(Integer.parseInt(s), 0xFF), 0);
                    ﾞٴ0.FLD5407 = v2;
                    ᐧי0.MTH7345(String.valueOf(v2));
                    ﾞٴ0.MTH7430();
                }
                return;
            }
            case 2: {
                ﾞٴ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    int v3 = Math.max(Math.min(Integer.parseInt(s), 0xFF), 0);
                    ﾞٴ0.FLD5415 = v3;
                    ᐧי0.MTH7345(String.valueOf(v3));
                    ﾞٴ0.MTH7430();
                }
                return;
            }
            default: {
                ﾞٴ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    int v = Math.max(Math.min(Integer.parseInt(s), 0xFF), 0);
                    ﾞٴ0.FLD5411 = v;
                    ᐧי0.MTH7345(String.valueOf(v));
                    ﾞٴ0.MTH7430();
                }
            }
        }
    }
}

