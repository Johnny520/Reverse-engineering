// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.widget.SearchView.OnQueryTextListener;
import b.ʻˑ.CLS12;

public final class CLS450 implements SearchView.OnQueryTextListener {
    public final CLS12 FLD4413;

    public CLS450(CLS1408 ˊʽ0) {
        this.FLD4413 = ˊʽ0;
        super();
    }

    @Override  // android.widget.SearchView$OnQueryTextListener
    public final boolean onQueryTextChange(String s) {
        return true;
    }

    @Override  // android.widget.SearchView$OnQueryTextListener
    public final boolean onQueryTextSubmit(String s) {
        this.FLD4413.MTH791(s);
        return false;
    }
}

