// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ᐧˉ.CLS1144;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import java.util.ArrayList;

public final class CLS489 implements View.OnClickListener {
    public final CLS1621 FLD4800;
    public final boolean FLD4801;
    public final ArrayList FLD4802;
    public final CLS1622 FLD4803;
    public final String FLD4804;
    public final CLS3 FLD4805;

    public CLS489(CLS1621 ˎᵢ0, CLS1622 ˑٴ0, ArrayList arrayList0, String s, boolean z, CLS1144 ᵎʻ0) {
        this.FLD4800 = ˎᵢ0;
        this.FLD4803 = ˑٴ0;
        this.FLD4802 = arrayList0;
        this.FLD4804 = s;
        this.FLD4801 = z;
        this.FLD4805 = ᵎʻ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = Long.toHexString(this.FLD4800.FLD5241);
        String s1 = this.FLD4803.MTH7285();
        for(Object object0: this.FLD4802) {
            CLS21.FLD76.MTH818("bandialog_ban_silent", new Object[]{((String)object0), this.FLD4804, s, s1, Boolean.valueOf(this.FLD4801)});
        }
        CLS3 ˆٴ0 = this.FLD4805;
        if(ˆٴ0 != null) {
            ˆٴ0.MTH774();
        }
        CLS403.FLD3892.dismiss();
    }
}

