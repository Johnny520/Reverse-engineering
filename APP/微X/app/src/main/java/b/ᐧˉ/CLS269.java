// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS78;
import b.ᵔʾ.CLS283;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS485.CLS484;
import b.ⁱᵔ.CLS485;
import b.ﾞˎ.CLS1625;
import java.util.ArrayList;

public final class CLS269 implements View.OnClickListener {
    public final int FLD2818;
    public final Activity FLD2819;
    public final CLS899 FLD2820;
    public final CLS1625 FLD2821;

    public CLS269(CLS899 ʻʼ0, Activity activity0, CLS1625 ـˏ0, int v) {
        this.FLD2818 = v;
        this.FLD2820 = ʻʼ0;
        this.FLD2819 = activity0;
        this.FLD2821 = ـˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1625 ـˏ0 = this.FLD2821;
        CLS899 ʻʼ0 = this.FLD2820;
        if(this.FLD2818 == 0) {
            ʻʼ0.getClass();
            ArrayList arrayList0 = new ArrayList();
            CLS371.FLD3470.MTH5330(arrayList0);
            CLS1000 ˋˋ0 = new CLS1000(this.FLD2819, ـˏ0);
            CLS387.MTH5600(true, this.FLD2819, arrayList0, ((CLS2)ˋˋ0));
            return;
        }
        Activity activity0 = this.FLD2819;
        ʻʼ0.getClass();
        CLS283 ʾˏ0 = CLS283.FLD2946;
        if(ʾˏ0.FLD2943) {
            ʾˏ0.FLD2954 = false;
            ʾˏ0.FLD2943 = false;
            ʾˏ0.FLD2944.clear();
            ʾˏ0.FLD2941.clear();
            ʾˏ0.FLD2951.clear();
            ʾˏ0.FLD2938.clear();
            if(CLS27.MTH895().MTH938("zombie_notif_enable", false)) {
                CLS485 ᐧﾞ0 = (CLS485)CLS40.FLD157.MTH1118(CLS485.class);
                CLS484 ᐧﾞ$ˆٴ0 = ʾˏ0.FLD2949;
                ᐧﾞ0.getClass();
                ᐧﾞ0.MTH6733(ᐧﾞ$ˆٴ0.FLD4732);
            }
            ـˏ0.MTH800(CLS27.MTH889(CLS370.MTH5289((ʾˏ0.FLD2943 ? 4101027202365969205L : 4101027275380413237L))));
        }
        else {
            ArrayList arrayList1 = CLS283.MTH4695();
            if(ʻʼ0.FLD1659 != null && !arrayList1.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for(Object object0: arrayList1) {
                    arrayList2.add(new CLS78(((String)object0), ʻʼ0.FLD1658.MTH5311(((String)object0))));
                }
                CLS387.MTH5585(true, activity0, arrayList2, ((CLS2)new CLS1082(ʻʼ0, ـˏ0)), null, -1);
            }
        }
    }
}

