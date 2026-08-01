// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import b.ⁱʾ.CLS359;

public final class CLS204 implements AdapterView.OnItemClickListener {
    public final int FLD1955;
    public final CLS359 FLD1956;

    public CLS204(CLS359 ⁱˉ0, int v) {
        this.FLD1955 = v;
        this.FLD1956 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        CLS359 ⁱˉ0 = this.FLD1956;
        switch(this.FLD1955) {
            case 0: {
                ⁱˉ0.MTH5233(v);
                ((ContentValues)ⁱˉ0.getItem(v)).put("checked", Boolean.valueOf(ⁱˉ0.MTH5240(v)));
                return;
            }
            case 1: {
                ⁱˉ0.MTH5233(v);
                ((ContentValues)ⁱˉ0.getItem(v)).put("checked", Boolean.valueOf(ⁱˉ0.MTH5240(v)));
                return;
            }
            case 2: {
                ⁱˉ0.MTH5233(v);
                ((ContentValues)ⁱˉ0.getItem(v)).put("checked", Boolean.valueOf(ⁱˉ0.MTH5240(v)));
                return;
            }
            case 3: {
                ⁱˉ0.MTH5233(v);
                return;
            }
            case 4: {
                ⁱˉ0.MTH5233(v);
                return;
            }
            case 5: {
                ⁱˉ0.MTH5233(v);
                return;
            }
            case 6: {
                ⁱˉ0.MTH5233(v);
                return;
            }
            default: {
                ⁱˉ0.MTH5233(v);
            }
        }
    }
}

