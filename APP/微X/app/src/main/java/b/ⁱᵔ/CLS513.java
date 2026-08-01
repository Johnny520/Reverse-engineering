// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import b.ⁱʾ.CLS363;
import b.ﾞˎ.CLS1626;

public final class CLS513 implements AdapterView.OnItemClickListener {
    public final int FLD5057;
    public final CLS363 FLD5058;
    public final int FLD5059;
    public final CLS1626 FLD5060;

    public CLS513(int v, CLS363 ﾞٴ0, CLS1626 ـﹳ0, int v1) {
        this.FLD5057 = v1;
        this.FLD5059 = v;
        this.FLD5058 = ﾞٴ0;
        this.FLD5060 = ـﹳ0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        CLS1626 ـﹳ0 = this.FLD5060;
        CLS363 ﾞٴ0 = this.FLD5058;
        int v2 = this.FLD5059;
        if(this.FLD5057 == 0) {
            if(v2 == -1 || ﾞٴ0.FLD3446[v] || ﾞٴ0.MTH5258() < v2) {
                ﾞٴ0.MTH5262(v, !ﾞٴ0.FLD3446[v]);
                ﾞٴ0.notifyDataSetChanged();
                ﾞٴ0.notifyDataSetChanged();
                ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
            }
            return;
        }
        if(v2 != -1 && !ﾞٴ0.FLD3446[v] && ﾞٴ0.MTH5258() >= v2) {
            ﾞٴ0.MTH5262(v, false);
            return;
        }
        ﾞٴ0.MTH5262(v, !ﾞٴ0.FLD3446[v]);
        ﾞٴ0.notifyDataSetChanged();
        ﾞٴ0.notifyDataSetChanged();
        ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
    }
}

