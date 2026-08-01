// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˑٴ.CLS737;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;

public final class CLS1591 implements CLS3 {
    public final int FLD5009;
    public final CLS369 FLD5010;
    public final ArrayList FLD5011;
    public final Activity FLD5012;
    public final int FLD5013;

    public CLS1591(Activity activity0, ArrayList arrayList0, int v, CLS369 ﾞᵎ0) {
        this.FLD5009 = 1;
        super();
        this.FLD5012 = activity0;
        this.FLD5011 = arrayList0;
        this.FLD5013 = v;
        this.FLD5010 = ﾞᵎ0;
    }

    public CLS1591(CLS369 ﾞᵎ0, int v, Activity activity0, ArrayList arrayList0) {
        this.FLD5009 = 0;
        super();
        this.FLD5010 = ﾞᵎ0;
        this.FLD5013 = v;
        this.FLD5012 = activity0;
        this.FLD5011 = arrayList0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS369 ﾞᵎ0 = this.FLD5010;
        if(this.FLD5009 == 0) {
            Object object0 = ﾞᵎ0.getItem(this.FLD5013);
            String s = CLS27.MTH889("modify");
            CLS737 ˑٴ0 = new CLS737(((String)object0), this.FLD5011, this.FLD5013, ﾞᵎ0, 10);
            CLS523.MTH7165(this.FLD5012, s, "", ((String)object0), 1, ((CLS16)ˑٴ0));
            return;
        }
        CLS1277 ʻˋ0 = new CLS1277(this.FLD5013, ﾞᵎ0, this.FLD5011);
        CLS523.MTH7142(this.FLD5012, ((CLS11)ʻˋ0));
    }
}

