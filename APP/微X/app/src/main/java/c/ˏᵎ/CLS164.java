// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import c.ﹶˆ.CLS344;
import java.util.LinkedHashMap;

public final class CLS164 implements AdapterView.OnItemClickListener {
    public final ListAdapter FLD655;
    public final LinkedHashMap FLD656;
    public final boolean FLD657;
    public final CLS344 FLD658;

    public CLS164(boolean z, CLS344 ᵔʼ0, ListAdapter listAdapter0, LinkedHashMap linkedHashMap0) {
        this.FLD657 = z;
        this.FLD658 = ᵔʼ0;
        this.FLD655 = listAdapter0;
        this.FLD656 = linkedHashMap0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        CLS144.MTH2163(this.FLD657, this.FLD658, this.FLD655, this.FLD656, adapterView0, view0, v, v1);
    }
}

