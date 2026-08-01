// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.text.TextUtils;
import android.widget.SearchView.OnQueryTextListener;

public final class CLS546 implements SearchView.OnQueryTextListener {
    public final CLS1624 FLD5349;

    public CLS546(CLS1624 יﹳ0) {
        this.FLD5349 = יﹳ0;
        super();
    }

    @Override  // android.widget.SearchView$OnQueryTextListener
    public final boolean onQueryTextChange(String s) {
        CLS540 יﹳ$ˆٴ0;
        boolean z = TextUtils.isEmpty(s);
        CLS1624 יﹳ0 = this.FLD5349;
        if(z) {
            יﹳ0.FLD5272.clearTextFilter();
            יﹳ$ˆٴ0 = יﹳ0.FLD5274;
            if(יﹳ$ˆٴ0 != null) {
                יﹳ$ˆٴ0.onQueryTextChange(s);
                return true;
            }
        }
        else {
            יﹳ$ˆٴ0 = יﹳ0.FLD5274;
            if(יﹳ$ˆٴ0 != null) {
                יﹳ$ˆٴ0.onQueryTextChange(s);
                return true;
            }
            יﹳ0.FLD5272.setFilterText(s);
        }
        return true;
    }

    @Override  // android.widget.SearchView$OnQueryTextListener
    public final boolean onQueryTextSubmit(String s) {
        return false;
    }
}

