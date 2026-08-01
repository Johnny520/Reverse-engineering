// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.text.Editable;
import android.text.TextWatcher;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS502;

public final class CLS535 implements TextWatcher {
    public final CLS1622 FLD5198;

    public CLS535(CLS1622 ˑٴ0) {
        this.FLD5198 = ˑٴ0;
        super();
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
        try {
            this.FLD5198.FLD5252.MTH7273(CLS502.MTH6936(editable0));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }
}

