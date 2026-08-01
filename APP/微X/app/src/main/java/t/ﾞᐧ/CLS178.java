// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.text.TextUtils;
import android.widget.SearchView.OnQueryTextListener;
import t.ᵔʾ.CLS297;

public final class CLS178 implements SearchView.OnQueryTextListener {
    public final CLS336 FLD1262;

    public CLS178(CLS336 ˊˏ0) {
        this.FLD1262 = ˊˏ0;
        super();
    }

    @Override  // android.widget.SearchView$OnQueryTextListener
    public final boolean onQueryTextChange(String s) {
        CLS166 ˊˏ$ˆٴ0;
        boolean z = TextUtils.isEmpty(s);
        CLS336 ˊˏ0 = this.FLD1262;
        if(z) {
            ˊˏ0.FLD1150.clearTextFilter();
            ˊˏ$ˆٴ0 = ˊˏ0.FLD1152;
            if(ˊˏ$ˆٴ0 != null) {
                ((CLS297)ˊˏ$ˆٴ0).MTH2020(s);
                return true;
            }
        }
        else {
            ˊˏ$ˆٴ0 = ˊˏ0.FLD1152;
            if(ˊˏ$ˆٴ0 != null) {
                ((CLS297)ˊˏ$ˆٴ0).MTH2020(s);
                return true;
            }
            ˊˏ0.FLD1150.setFilterText(s);
        }
        return true;
    }

    @Override  // android.widget.SearchView$OnQueryTextListener
    public final boolean onQueryTextSubmit(String s) {
        return false;
    }
}

