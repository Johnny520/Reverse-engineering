// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.widget.SearchView.OnQueryTextListener;
import b.ʻˑ.CLS12;
import b.ˑٴ.CLS753;

public final class CLS509 implements SearchView.OnQueryTextListener {
    public final CLS12 FLD5030;

    public CLS509(CLS753 יﾞ0) {
        this.FLD5030 = יﾞ0;
        super();
    }

    @Override  // android.widget.SearchView$OnQueryTextListener
    public final boolean onQueryTextChange(String s) {
        return true;
    }

    @Override  // android.widget.SearchView$OnQueryTextListener
    public final boolean onQueryTextSubmit(String s) {
        this.FLD5030.MTH791(s);
        return false;
    }
}

