// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ˈˈ.CLS69;
import java.util.ArrayList;

public final class CLS413 implements View.OnClickListener {
    public final int FLD4010;
    public final Activity FLD4011;

    public CLS413(Activity activity0, int v) {
        this.FLD4010 = v;
        this.FLD4011 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD4011;
        if(this.FLD4010 == 0) {
            CLS69 ʾᵢ0 = new CLS69();
            ʾᵢ0.MTH1560(CLS34.MTH1059(0x38EAF6712B3CD335L, ʾᵢ0, CLS34.MTH1059(0x38EAF6572B3CD335L, ʾᵢ0, CLS34.MTH1059(0x38E909BC2B3CD335L, ʾᵢ0, CLS34.MTH1059(0x38E909A02B3CD335L, ʾᵢ0, CLS34.MTH1059(0x38E9098E2B3CD335L, ʾᵢ0, CLS34.MTH1059(0x38E909FF2B3CD335L, ʾᵢ0, CLS34.MTH1059(4100819837049951029L, ʾᵢ0, CLS34.MTH1059(4100819742560670517L, ʾᵢ0, CLS34.MTH1059(4100819660956291893L, ʾᵢ0, CLS34.MTH1059(4100819033891066677L, ʾᵢ0, CLS34.MTH1059(4100818947991720757L, ʾᵢ0, CLS34.MTH1059(0x38E9090A2B3CD335L, ʾᵢ0, CLS34.MTH1059(4100819360308581173L, ʾᵢ0, CLS34.MTH1059(0x38E909692B3CD335L, ʾᵢ0, CLS27.MTH889("req_phone"), 0x38E9096F2B3CD335L), 0x38E909032B3CD335L), 0x38E9090D2B3CD335L), 4100818990941393717L), 4100819059660870453L), 4100819695316030261L), 0x38E909DB2B3CD335L), 0x38E909F52B3CD335L), 4100819403258254133L), 0x38E909932B3CD335L), 4100819557877076789L), 0x38EAF64B2B3CD335L), 0x38EAF65F2B3CD335L), 0x38EAF67F2B3CD335L), "unknown");
            ArrayList arrayList0 = new ArrayList(ʾᵢ0.MTH1566());
            ArrayList arrayList1 = new ArrayList();
            String s = CLS27.MTH895().MTH925("friendreq_cycle_types", "");
            if(!TextUtils.isEmpty(s)) {
                String[] arr_s = s.split(",");
                for(int v = 0; v < arr_s.length; ++v) {
                    arrayList1.add(((String)ʾᵢ0.MTH1559(arr_s[v])));
                }
            }
            CLS523.MTH7144(activity0, ((CLS8)new CLS1309(ʾᵢ0)), TextUtils.join(",", arrayList1), arrayList0);
            return;
        }
        CLS395.MTH5737(activity0, "auto_comment_timeframe");
    }
}

