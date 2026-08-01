// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ⁱᵔ.CLS412;
import b.ﾞˎ.CLS1624.CLS540;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;

public final class CLS1272 implements CLS16, CLS39, CLS540 {
    public final int FLD3406;
    public final CLS359 FLD3407;

    public CLS1272(CLS359 ⁱˉ0, int v) {
        this.FLD3406 = v;
        this.FLD3407 = ⁱˉ0;
        super();
    }

    @Override  // b.ﾞˎ.CLS1624$CLS540
    public final void onQueryTextChange(String s) {
        CLS359 ⁱˉ0 = this.FLD3407;
        switch(this.FLD3406) {
            case 6: {
                ⁱˉ0.getClass();
                new CLS357(ⁱˉ0).filter(s);
                return;
            }
            case 7: {
                ⁱˉ0.getClass();
                new CLS357(ⁱˉ0).filter(s);
                return;
            }
            default: {
                ⁱˉ0.getClass();
                new CLS357(ⁱˉ0).filter(s);
            }
        }
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS359 ⁱˉ0 = this.FLD3407;
        switch(this.FLD3406) {
            case 0: {
                ⁱˉ0.notifyDataSetChanged();
                return;
            }
            case 1: {
                ⁱˉ0.notifyDataSetChanged();
                return;
            }
            case 2: {
                ⁱˉ0.notifyDataSetChanged();
                return;
            }
            default: {
                ⁱˉ0.notifyDataSetChanged();
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS359 ⁱˉ0 = this.FLD3407;
        if(this.FLD3406 == 4) {
            if(!TextUtils.isEmpty(s)) {
                String s1 = CLS27.MTH895().MTH925("mass_send_data_tags", "");
                HashSet hashSet0 = new HashSet();
                if(!TextUtils.isEmpty(s1)) {
                    hashSet0.addAll(Arrays.asList(s1.split(",")));
                }
                hashSet0.add(s);
                CLS27.MTH895().MTH922(TextUtils.join(",", hashSet0), "mass_send_data_tags");
                JSONArray jSONArray0 = CLS412.MTH5997(ⁱˉ0.MTH5234());
                CLS27.MTH895().MTH922(jSONArray0, "mass_send_data_val_" + s);
            }
            return;
        }
        if(!TextUtils.isEmpty(s)) {
            String s2 = CLS27.MTH895().MTH925("mass_send_data_tags", "");
            HashSet hashSet1 = new HashSet();
            if(!TextUtils.isEmpty(s2)) {
                hashSet1.addAll(Arrays.asList(s2.split(",")));
            }
            hashSet1.add(s);
            CLS27.MTH895().MTH922(TextUtils.join(",", hashSet1), "mass_send_data_tags");
            JSONArray jSONArray1 = CLS412.MTH5997(ⁱˉ0.MTH5234());
            CLS27.MTH895().MTH922(jSONArray1, "mass_send_data_val_" + s);
        }
    }
}

