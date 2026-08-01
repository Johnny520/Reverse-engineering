// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import d.ˎˏ.CLS1;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ᐧי.CLS110;
import java.util.LinkedHashMap;

public final class CLS47 implements View.OnClickListener {
    public final Activity FLD235;
    public final int FLD236;

    public CLS47(Activity activity0, int v) {
        this.FLD236 = v;
        this.FLD235 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD235;
        switch(this.FLD236) {
            case 0: {
                CLS71.MTH829(0xFFFF322C2DFB3E45L, activity0);
                return;
            }
            case 1: {
                CLS71.MTH829(0xFFFF38402DFB3E45L, activity0);
                return;
            }
            case 2: {
                CLS71.MTH829(0xFFFF384F2DFB3E45L, activity0);
                return;
            }
            case 3: {
                CLS71.MTH829(0xFFFF32DE2DFB3E45L, activity0);
                return;
            }
            case 4: {
                CLS71.MTH829(-213837060293051L, activity0);
                return;
            }
            case 5: {
                CLS28.MTH536(activity0);
                return;
            }
            case 6: {
                CLS1.MTH367(activity0);
                return;
            }
            default: {
                String[] arr_s = CLS69.MTH806("donate_keycard_transfer_urls").split(";");
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                for(int v = 0; v < arr_s.length; v = CLS71.MTH828(arr_s1[1], linkedHashMap0, arr_s1[0].trim(), v, 1)) {
                    String[] arr_s1 = arr_s[v].split(",");
                }
                if(!CLS71.MTH831(0xFFFF39DA2DFB3E45L)) {
                    String[] arr_s2 = CLS69.MTH806("donate_keycard_transfer_urls2").split(";");
                    for(int v1 = 0; v1 < arr_s2.length; ++v1) {
                        String[] arr_s3 = arr_s2[v1].split(",");
                        linkedHashMap0.put(arr_s3[0].trim(), "#" + arr_s3[1].trim());
                    }
                }
                CLS110 ٴˑ0 = new CLS110(activity0, linkedHashMap0.keySet());
                CLS28.MTH531(activity0, CLS69.MTH795("get_keycard"), ٴˑ0, linkedHashMap0, CLS69.MTH795("donate_list_warn2"));
            }
        }
    }
}

