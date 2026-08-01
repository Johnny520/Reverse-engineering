// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.content.Context;
import android.widget.Toast;
import d.יʻ.CLS68.CLS67;

public final class CLS159 implements CLS67 {
    public final String FLD213;
    public final Context FLD214;
    public final int FLD215;

    public CLS159(Context context0, String s) {
        this.FLD214 = context0;
        this.FLD213 = s;
        this.FLD215 = 1;
    }

    @Override  // d.יʻ.CLS68$CLS67
    public final void run() {
        Toast.makeText(this.FLD214, this.FLD213, this.FLD215).show();
    }
}

