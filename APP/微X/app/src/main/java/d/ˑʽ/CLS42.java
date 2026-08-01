// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import d.יʻ.CLS69;
import d.ⁱٴ.CLS120;
import java.util.LinkedHashMap;

public final class CLS42 implements AdapterView.OnItemClickListener {
    public final Dialog[] FLD223;
    public final LinkedHashMap FLD224;
    public final boolean FLD225;
    public final ListAdapter FLD226;
    public final CLS120 FLD227;

    public CLS42(boolean z, Dialog[] arr_dialog, CLS120 ˑʽ0, ListAdapter listAdapter0, LinkedHashMap linkedHashMap0) {
        this.FLD225 = z;
        this.FLD223 = arr_dialog;
        this.FLD227 = ˑʽ0;
        this.FLD226 = listAdapter0;
        this.FLD224 = linkedHashMap0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        Dialog[] arr_dialog = this.FLD223;
        ListAdapter listAdapter0 = this.FLD226;
        LinkedHashMap linkedHashMap0 = this.FLD224;
        if(this.FLD225) {
            try {
                Dialog dialog0 = arr_dialog[0];
                if(dialog0 != null) {
                    dialog0.dismiss();
                }
            }
            catch(Throwable unused_ex) {
            }
        }
        CLS120 ˑʽ0 = this.FLD227;
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

