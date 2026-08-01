// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import d.יʻ.CLS69;
import d.ⁱٴ.CLS120;
import java.util.LinkedHashMap;

public final class CLS41 implements AdapterView.OnItemClickListener {
    public final CLS120 FLD216;
    public final boolean FLD217;
    public final LinkedHashMap FLD218;
    public final ListAdapter FLD219;

    public CLS41(boolean z, CLS120 ˑʽ0, ListAdapter listAdapter0, LinkedHashMap linkedHashMap0) {
        this.FLD217 = z;
        this.FLD216 = ˑʽ0;
        this.FLD219 = listAdapter0;
        this.FLD218 = linkedHashMap0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        ListAdapter listAdapter0 = this.FLD219;
        LinkedHashMap linkedHashMap0 = this.FLD218;
        if(this.FLD217) {
            try {
                CLS45.FLD231.dismiss();
            }
            catch(Throwable unused_ex) {
            }
        }
        CLS120 ˑʽ0 = this.FLD216;
        if(ˑʽ0 != null) {
            try {
                ˑʽ0.MTH1170(linkedHashMap0.get(((String)listAdapter0.getItem(v))));
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
        }
    }
}

