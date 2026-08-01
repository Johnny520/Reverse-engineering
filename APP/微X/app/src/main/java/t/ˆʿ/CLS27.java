// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import java.util.LinkedHashMap;
import t.ˊﾞ.CLS99;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS297;
import t.ⁱʾ.CLS143;

public final class CLS27 implements AdapterView.OnItemClickListener {
    public final boolean FLD415;
    public final ListAdapter FLD416;
    public final CLS297 FLD417;
    public final LinkedHashMap FLD418;

    public CLS27(boolean z, CLS297 ˈˈ0, ListAdapter listAdapter0, LinkedHashMap linkedHashMap0) {
        this.FLD415 = z;
        this.FLD417 = ˈˈ0;
        this.FLD416 = listAdapter0;
        this.FLD418 = linkedHashMap0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        ListAdapter listAdapter0 = this.FLD416;
        LinkedHashMap linkedHashMap0 = this.FLD418;
        if(this.FLD415) {
            try {
                CLS43.FLD494.dismiss();
            }
            catch(Throwable unused_ex) {
            }
        }
        CLS297 ˈˈ0 = this.FLD417;
        if(ˈˈ0 == null) {
            return;
        }
        else {
            try {
                Object object0 = linkedHashMap0.get(((String)listAdapter0.getItem(v)));
                CLS99 ˆٴ0 = (CLS99)ˈˈ0.FLD915;
                ˆٴ0.getClass();
                try {
                    CLS143 ˆٴ1 = (CLS143)ˆٴ0.FLD744.get(((String)object0));
                    if(ˆٴ1 != null) {
                        ˆٴ1.MTH2169();
                        return;
                    }
                }
                catch(Throwable throwable1) {
                    CLS133.MTH2113(throwable1);
                }
                return;
            }
            catch(Throwable throwable0) {
            }
        }
        CLS133.MTH2113(throwable0);
    }
}

