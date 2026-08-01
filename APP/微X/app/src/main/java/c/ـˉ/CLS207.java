// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import c.ˋﹳ.CLS110;
import java.util.LinkedHashMap;

public final class CLS207 implements AdapterView.OnItemClickListener {
    public final CLS110 FLD959;
    public final boolean FLD960;
    public final ListAdapter FLD961;
    public final LinkedHashMap FLD962;

    public CLS207(boolean z, CLS110 ٴⁱ0, ListAdapter listAdapter0, LinkedHashMap linkedHashMap0) {
        this.FLD960 = z;
        this.FLD959 = ٴⁱ0;
        this.FLD961 = listAdapter0;
        this.FLD962 = linkedHashMap0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        CLS258.MTH3760(this.FLD960, this.FLD959, this.FLD961, this.FLD962, adapterView0, view0, v, v1);
    }
}

