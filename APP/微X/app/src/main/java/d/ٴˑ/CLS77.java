// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.text.Editable;
import android.text.TextWatcher;
import d.יʻ.CLS69;

public final class CLS77 implements TextWatcher {
    public final CLS190 FLD374;

    public CLS77(CLS190 ᵎᐧ0) {
        this.FLD374 = ᵎᐧ0;
        super();
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
        try {
            this.FLD374.FLD562.MTH1016(editable0.toString());
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }
}

