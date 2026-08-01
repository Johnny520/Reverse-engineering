// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS40.CLS39;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS500;
import b.ﾞˎ.CLS1624.CLS540;
import b.ﾞˎ.CLS525;

public final class CLS1115 implements CLS39, CLS378, CLS540 {
    public final int FLD2493;
    public final CLS1062 FLD2494;

    public CLS1115(CLS1062 יٴ0, int v) {
        this.FLD2493 = v;
        this.FLD2494 = יٴ0;
        super();
    }

    @Override  // b.ﾞˎ.CLS1624$CLS540
    public final void onQueryTextChange(String s) {
        CLS369 ﾞᵎ0 = this.FLD2494.FLD2278;
        CLS182.MTH3471(ﾞᵎ0, ﾞᵎ0, s);
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS1062 יٴ0 = this.FLD2494;
        switch(this.FLD2493) {
            case 0: {
                יٴ0.MTH4021();
                return;
            }
            case 3: {
                יٴ0.MTH4021();
                return;
            }
            case 4: {
                יٴ0.MTH4021();
                return;
            }
            case 5: {
                יٴ0.MTH4021();
                return;
            }
            default: {
                יٴ0.MTH4021();
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        CLS1062 יٴ0 = this.FLD2494;
        Activity activity0 = ((CLS219)יٴ0).MTH3883();
        ʻˑ0.MTH7187("add_mp3", ((CLS3)new CLS963(יٴ0, activity0, 0)));
        if(CLS500.FLD4928.MTH6895("voice_manager")) {
            ʻˑ0.MTH7187("add_silk", ((CLS3)new CLS963(יٴ0, activity0, 1)));
            ʻˑ0.MTH7187("add_silk_multiple", ((CLS3)new CLS963(יٴ0, activity0, 2)));
        }
        ʻˑ0.MTH7187("import_", ((CLS3)new CLS963(יٴ0, activity0, 3)));
        ʻˑ0.MTH7187("export_", ((CLS3)new CLS963(יٴ0, activity0, 4)));
        ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS963(יٴ0, activity0, 5)));
        ʻˑ0.MTH7187("tags", ((CLS3)new CLS963(יٴ0, activity0, 6)));
    }
}

