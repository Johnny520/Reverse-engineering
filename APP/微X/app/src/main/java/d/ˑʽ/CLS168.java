// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import d.יʻ.CLS69;
import d.ٴˑ.CLS99;
import d.ᐧי.CLS110;
import d.ⁱٴ.CLS123;
import d.ⁱٴ.CLS124;
import d.ⁱٴ.CLS126;
import java.util.ArrayList;

public final class CLS168 implements CLS123 {
    public final ArrayList FLD256;
    public final CLS99 FLD257;
    public final Activity FLD258;
    public final ArrayList FLD259;
    public final int FLD260;
    public final CLS110 FLD261;

    public CLS168(Activity activity0, ArrayList arrayList0, int v, ArrayList arrayList1, CLS99 ﹶᵎ0, CLS110 ٴˑ0) {
        this.FLD258 = activity0;
        this.FLD256 = arrayList0;
        this.FLD260 = v;
        this.FLD259 = arrayList1;
        this.FLD257 = ﹶᵎ0;
        this.FLD261 = ٴˑ0;
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS123
    public final void MTH1174() {
        CLS143 ˉˆ$ᵎʻ0 = new CLS143(this.FLD256, this.FLD260, this.FLD259, this.FLD257, this.FLD261);
        try {
            String s = CLS69.MTH795("delete");
            String s1 = CLS69.MTH795("delete_confirmation");
            CLS152 ˑʽ0 = new CLS152(this.FLD258, s1, false);
            CLS45.MTH653(this.FLD258, s, ((CLS124)ˑʽ0), ((CLS126)ˉˆ$ᵎʻ0));
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
    }
}

