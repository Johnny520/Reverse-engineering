// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.app.Activity;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import t.ʾᵢ.CLS10;
import t.ʾᵢ.CLS216;
import t.ᵔʾ.CLS139.CLS138;

public final class CLS313 implements CLS138 {
    public final int FLD1036;
    public final CLS330 FLD1037;

    public CLS313(CLS330 ﾞˎ0, int v) {
        this.FLD1036 = v;
        this.FLD1037 = ﾞˎ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS139$CLS138
    public final void MTH2153(Object[] arr_object) {
        boolean z = false;
        CLS330 ﾞˎ0 = this.FLD1037;
        switch(this.FLD1036) {
            case 0: {
                ﾞˎ0.getClass();
                String s = (String)arr_object[0];
                if(!TextUtils.isEmpty(s)) {
                    HashMap hashMap0 = ﾞˎ0.FLD1083;
                    if(hashMap0.containsKey(s)) {
                        String s1 = (String)arr_object[1];
                        Activity activity0 = (Activity)arr_object[2];
                        String s2 = "";
                        boolean z1 = arr_object.length <= 3 ? false : ((Boolean)arr_object[3]).booleanValue();
                        if(arr_object.length > 4) {
                            z = ((Boolean)arr_object[4]).booleanValue();
                        }
                        if(arr_object.length > 5) {
                            s2 = (String)arr_object[5];
                        }
                        CLS10 ˆٴ0 = (CLS10)hashMap0.get(s);
                        if(ˆٴ0 != null) {
                            ˆٴ0.FLD137 = new WeakReference(activity0);
                            ˆٴ0.MTH1045(z1, z, s2);
                        }
                    }
                }
                return;
            }
            case 1: {
                CLS216 ˎﾞ1 = (CLS216)ﾞˎ0.FLD1083.get("themes_settings");
                if(ˎﾞ1 != null) {
                    ˎﾞ1.FLD137 = new WeakReference(((CLS155)ﾞˎ0).MTH2306());
                    ˎﾞ1.MTH1045(false, false, "");
                }
                return;
            }
            default: {
                CLS216 ˎﾞ0 = (CLS216)ﾞˎ0.FLD1083.get("themes_settings");
                if(ˎﾞ0 != null && (ˎﾞ0.FLD239 != null && ˎﾞ0.FLD239.isShowing())) {
                    ˎﾞ0.FLD239.dismiss();
                }
            }
        }
    }
}

