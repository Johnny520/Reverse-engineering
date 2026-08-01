// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS369;

public final class CLS467 implements AdapterView.OnItemClickListener {
    public final int FLD4549;
    public final CLS369 FLD4550;
    public final CLS12 FLD4551;

    public CLS467(CLS12 ᵔʾ0, CLS369 ﾞᵎ0) {
        this.FLD4549 = 1;
        super();
        this.FLD4551 = ᵔʾ0;
        this.FLD4550 = ﾞᵎ0;
    }

    public CLS467(CLS369 ﾞᵎ0, CLS12 ᵔʾ0) {
        this.FLD4549 = 0;
        super();
        this.FLD4550 = ﾞᵎ0;
        this.FLD4551 = ᵔʾ0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        CLS12 ᵔʾ0 = this.FLD4551;
        CLS369 ﾞᵎ0 = this.FLD4550;
        if(this.FLD4549 == 0) {
            try {
                String s = (String)ﾞᵎ0.getItem(v);
                if(!TextUtils.isEmpty(s) && ᵔʾ0 != null) {
                    ᵔʾ0.MTH791(s);
                    return;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        if(ᵔʾ0 != null) {
            try {
                ᵔʾ0.MTH791(((String)ﾞᵎ0.getItem(v)));
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
    }
}

