// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.content.Context;
import android.widget.Toast;
import t.ᵔʾ.CLS137.CLS136;

public final class CLS276 implements CLS136 {
    public final Context FLD459;
    public final int FLD460;
    public final String FLD461;

    public CLS276(Context context0, String s) {
        this.FLD459 = context0;
        this.FLD461 = s;
        this.FLD460 = 1;
    }

    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        Toast.makeText(this.FLD459, this.FLD461, this.FLD460).show();
    }
}

