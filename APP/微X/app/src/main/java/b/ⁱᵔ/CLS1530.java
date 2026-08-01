// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ˑٴ.CLS702;
import b.ⁱʾ.CLS1274;
import b.ⁱʾ.CLS347;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS525;
import java.util.ArrayList;

public final class CLS1530 implements CLS378, CLS379 {
    public final Activity FLD4716;
    public final CLS347 FLD4717;
    public final ArrayList FLD4718;

    public CLS1530(Activity activity0, CLS347 ᐧי0, ArrayList arrayList0) {
        this.FLD4716 = activity0;
        this.FLD4717 = ᐧי0;
        this.FLD4718 = arrayList0;
    }

    public CLS1530(Activity activity0, ArrayList arrayList0, CLS347 ᐧי0) {
        this.FLD4716 = activity0;
        this.FLD4718 = arrayList0;
        this.FLD4717 = ᐧי0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        ʻˑ0.MTH7187("add", ((CLS3)new CLS702(this.FLD4716, this.FLD4718, this.FLD4717, 12)));
        ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS1274(this.FLD4718, this.FLD4717, 23)));
    }

    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS1624 יﹳ0 = new CLS1624(this.FLD4716);
        יﹳ0.MTH7303(this.FLD4717);
        יﹳ0.MTH7305(new CLS504(this.FLD4716, this.FLD4718, this.FLD4717, 1));
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
    }
}

