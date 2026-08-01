// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ˑٴ.CLS737;
import b.ⁱᵔ.CLS1439;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;

public final class CLS1638 extends CLS606 {
    public CLS1638() {
        this.FLD501 = 5;
    }

    @Override  // b.ˈˊ.CLS606
    public final void MTH1930(Activity activity0) {
        public final class CLS596 implements CLS8 {
            public final CLS1638 FLD450;

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                String s = ((ContentValues)object0).getAsString("id");
                CLS1638.this.FLD474.clear();
                CLS1638.this.FLD474.add(s);
            }
        }

        int v;
        ArrayList arrayList0 = this.FLD474;
        if(arrayList0.isEmpty()) {
            v = -1;
        }
        else {
            try {
                v = Integer.parseInt(((String)arrayList0.get(0)));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                v = -1;
            }
        }
        CLS596 ˑٴ$ˆٴ0 = new CLS596(this);
        int[] arr_v = {-1};
        String s = CLS27.MTH889("load");
        ArrayList arrayList1 = (ArrayList)CLS21.FLD76.MTH836("getAllAutoForwardRecords", new Object[0]);
        CLS523.MTH7160(activity0, s, ((CLS17)new CLS737(activity0, arrayList1, v, arr_v, 11)), ((CLS11)new CLS1439(arrayList1, arr_v, ˑٴ$ˆٴ0)));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS606
    public final String MTH1934() {
        return CLS27.MTH889("multi_selection_auto_forward_enable");
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
                Object[] arr_object = {Integer.valueOf(((String)object0)), TextUtils.join(",", ((CLS606)this).MTH1903())};
                CLS21.FLD76.MTH817("af", "autoforwardRecordId", arr_object);
            }
        }
    }
}

