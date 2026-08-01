// Decompiled by JEB v5.42.0.202606242140

package p.pkg5;

import android.content.Context;
import android.widget.Toast;
import p.pkg8.CLS43.CLS42;

public final class CLS184 implements CLS42 {
    public final Context FLD308;
    public final int FLD309;
    public final String FLD310;

    public CLS184(Context context0, String s) {
        this.FLD308 = context0;
        this.FLD310 = s;
        this.FLD309 = 1;
    }

    @Override  // p.pkg8.CLS43$CLS42
    public final void run() {
        Toast.makeText(this.FLD308, this.FLD310, this.FLD309).show();
    }
}

