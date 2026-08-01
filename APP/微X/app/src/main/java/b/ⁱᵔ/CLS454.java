// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import java.util.LinkedHashMap;

public final class CLS454 implements AdapterView.OnItemClickListener {
    public final boolean FLD4440;
    public final ListAdapter FLD4441;
    public final CLS7 FLD4442;
    public final LinkedHashMap FLD4443;

    public CLS454(boolean z, CLS7 יᐧ0, ListAdapter listAdapter0, LinkedHashMap linkedHashMap0) {
        this.FLD4440 = z;
        this.FLD4442 = יᐧ0;
        this.FLD4441 = listAdapter0;
        this.FLD4443 = linkedHashMap0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        ListAdapter listAdapter0 = this.FLD4441;
        LinkedHashMap linkedHashMap0 = this.FLD4443;
        if(this.FLD4440) {
            try {
                CLS523.FLD5119.dismiss();
            }
            catch(Throwable unused_ex) {
            }
        }
        CLS7 יᐧ0 = this.FLD4442;
        if(יᐧ0 != null) {
            try {
                יᐧ0.MTH784(linkedHashMap0.get(((String)listAdapter0.getItem(v))));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}

