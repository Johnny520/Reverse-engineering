// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ᐧˉ.CLS1144;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import java.util.ArrayList;

public final class CLS505 implements DialogInterface.OnClickListener {
    public final CLS1621 FLD4988;
    public final boolean FLD4989;
    public final ArrayList FLD4990;
    public final CLS1622 FLD4991;
    public final String FLD4992;
    public final CLS3 FLD4993;

    public CLS505(CLS1621 ˎᵢ0, CLS1622 ˑٴ0, ArrayList arrayList0, String s, boolean z, CLS1144 ᵎʻ0) {
        this.FLD4988 = ˎᵢ0;
        this.FLD4991 = ˑٴ0;
        this.FLD4990 = arrayList0;
        this.FLD4992 = s;
        this.FLD4989 = z;
        this.FLD4993 = ᵎʻ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        String s = Long.toHexString(this.FLD4988.FLD5241);
        String s1 = this.FLD4991.MTH7285();
        for(Object object0: this.FLD4990) {
            CLS21.FLD76.MTH818("bandialog_ban", new Object[]{((String)object0), this.FLD4992, s, s1, Boolean.valueOf(this.FLD4989)});
        }
        CLS3 ˆٴ0 = this.FLD4993;
        if(ˆٴ0 != null) {
            ˆٴ0.MTH774();
        }
    }
}

