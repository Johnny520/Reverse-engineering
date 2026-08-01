// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ᐧˉ.CLS1144;
import b.ﾞˎ.CLS1622;
import java.util.ArrayList;

public final class CLS451 implements DialogInterface.OnClickListener {
    public final CLS1622 FLD4427;
    public final CLS3 FLD4428;
    public final String FLD4429;
    public final ArrayList FLD4430;
    public final boolean FLD4431;

    public CLS451(CLS1622 ˑٴ0, ArrayList arrayList0, String s, boolean z, CLS1144 ᵎʻ0) {
        this.FLD4427 = ˑٴ0;
        this.FLD4430 = arrayList0;
        this.FLD4429 = s;
        this.FLD4431 = z;
        this.FLD4428 = ᵎʻ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        String s = this.FLD4427.MTH7285();
        for(Object object0: this.FLD4430) {
            CLS21.FLD76.MTH818("bandialog_permaban", new Object[]{((String)object0), this.FLD4429, s, Boolean.valueOf(this.FLD4431)});
        }
        CLS3 ˆٴ0 = this.FLD4428;
        if(ˆٴ0 != null) {
            ˆٴ0.MTH774();
        }
    }
}

