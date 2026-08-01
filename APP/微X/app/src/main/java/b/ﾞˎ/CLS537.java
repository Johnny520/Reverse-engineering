// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS523;

public final class CLS537 implements View.OnClickListener {
    public final int FLD5228;
    public final Activity FLD5229;
    public final CLS556 FLD5230;
    public final CLS1628 FLD5231;

    public CLS537(CLS556 ﾞٴ0, Activity activity0, CLS1628 ᐧי0, int v) {
        this.FLD5228 = v;
        this.FLD5230 = ﾞٴ0;
        this.FLD5229 = activity0;
        this.FLD5231 = ᐧי0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1628 ᐧי0 = this.FLD5231;
        CLS556 ﾞٴ0 = this.FLD5230;
        switch(this.FLD5228) {
            case 0: {
                ﾞٴ0.getClass();
                String s2 = CLS27.MTH889("red");
                String s3 = String.valueOf(ﾞٴ0.FLD5407);
                CLS1634 ﾞᐧ1 = new CLS1634(ﾞٴ0, ᐧי0, 1);
                CLS523.MTH7165(this.FLD5229, s2, "", s3, 2, ((CLS16)ﾞᐧ1));
                return;
            }
            case 1: {
                ﾞٴ0.getClass();
                String s4 = CLS27.MTH889("green");
                String s5 = String.valueOf(ﾞٴ0.FLD5411);
                CLS1634 ﾞᐧ2 = new CLS1634(ﾞٴ0, ᐧי0, 3);
                CLS523.MTH7165(this.FLD5229, s4, "", s5, 2, ((CLS16)ﾞᐧ2));
                return;
            }
            case 2: {
                ﾞٴ0.getClass();
                String s6 = CLS27.MTH889("blue");
                String s7 = String.valueOf(ﾞٴ0.FLD5417);
                CLS1634 ﾞᐧ3 = new CLS1634(ﾞٴ0, ᐧי0, 0);
                CLS523.MTH7165(this.FLD5229, s6, "", s7, 2, ((CLS16)ﾞᐧ3));
                return;
            }
            default: {
                ﾞٴ0.getClass();
                String s = CLS27.MTH889("alpha");
                String s1 = String.valueOf(ﾞٴ0.FLD5415);
                CLS1634 ﾞᐧ0 = new CLS1634(ﾞٴ0, ᐧי0, 2);
                CLS523.MTH7165(this.FLD5229, s, "", s1, 2, ((CLS16)ﾞᐧ0));
            }
        }
    }
}

