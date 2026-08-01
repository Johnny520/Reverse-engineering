// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.app.Activity;
import android.app.AlertDialog;
import android.text.TextUtils;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS1506;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;

public final class CLS1639 extends CLS606 {
    public CLS1639() {
        this.FLD501 = 13;
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS606
    public final void MTH1930(Activity activity0) {
        public final class CLS598 implements CLS8 {
            public final CLS1639 FLD453;

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                CLS1639.this.FLD474.clear();
                CLS1639.this.FLD474.add(((String)object0));
            }
        }

        String s = this.FLD474 == null || this.FLD474.isEmpty() ? "" : ((String)this.FLD474.get(0));
        CLS598 יﹳ$ˆٴ0 = new CLS598(this);
        AlertDialog[] arr_alertDialog = {null};
        arr_alertDialog[0] = CLS523.MTH7150(activity0, CLS27.MTH889("exported_records"), ((CLS17)new CLS1506(activity0, s, יﹳ$ˆٴ0, arr_alertDialog, 11)));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS606
    public final String MTH1934() {
        return CLS27.MTH889("exported_records");
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS606
    public final void MTH1936() {
        if(CLS27.MTH895().MTH938("multi_selection_auto_forward_enable", CLS412.MTH6002()) && (CLS21.FLD76.MTH830("hasRecordForwardSave", new Object[0]) && (CLS500.FLD4928.MTH6895("task_multi_selection_auto_forward") && CLS500.FLD4928.MTH6898()))) {
            ArrayList arrayList0 = this.FLD474;
            if(arrayList0.isEmpty()) {
                return;
            }
            for(Object object0: arrayList0) {
                Object[] arr_object = {((String)object0), TextUtils.join(",", ((CLS606)this).MTH1903())};
                CLS21.FLD76.MTH817("af", "startExtRecord_Name", arr_object);
            }
        }
    }
}

