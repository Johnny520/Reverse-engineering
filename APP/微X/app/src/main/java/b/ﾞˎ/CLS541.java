// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.text.TextUtils;
import android.widget.SearchView.OnQueryTextListener;
import b.ⁱᵔ.CLS1481;

public final class CLS541 implements SearchView.OnQueryTextListener {
    public final CLS1630 FLD5311;

    public CLS541(CLS1630 ⁱᵔ0) {
        this.FLD5311 = ⁱᵔ0;
        super();
    }

    @Override  // android.widget.SearchView$OnQueryTextListener
    public final boolean onQueryTextChange(String s) {
        CLS550 ⁱᵔ$ˆٴ0;
        boolean z = TextUtils.isEmpty(s);
        CLS1630 ⁱᵔ0 = this.FLD5311;
        if(z) {
            ⁱᵔ0.FLD5370.clearTextFilter();
            ⁱᵔ$ˆٴ0 = ⁱᵔ0.FLD5373;
            if(ⁱᵔ$ˆٴ0 != null) {
                ((CLS1481)ⁱᵔ$ˆٴ0).onQueryTextChange(s);
                return true;
            }
        }
        else {
            ⁱᵔ$ˆٴ0 = ⁱᵔ0.FLD5373;
            if(ⁱᵔ$ˆٴ0 != null) {
                ((CLS1481)ⁱᵔ$ˆٴ0).onQueryTextChange(s);
                return true;
            }
            ⁱᵔ0.FLD5370.setFilterText(s);
        }
        return true;
    }

    @Override  // android.widget.SearchView$OnQueryTextListener
    public final boolean onQueryTextSubmit(String s) {
        return false;
    }
}

