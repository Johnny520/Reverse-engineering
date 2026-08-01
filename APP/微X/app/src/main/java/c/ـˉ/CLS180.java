// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import java.io.File;

public final class CLS180 implements DialogInterface.OnClickListener {
    public final File FLD874;
    public final Context FLD875;

    public CLS180(Context context0, File file0) {
        this.FLD875 = context0;
        this.FLD874 = file0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        CLS224.MTH3475(this.FLD875, this.FLD874, dialogInterface0, v);
    }
}

