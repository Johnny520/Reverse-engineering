// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import java.io.File;

public final class CLS150 implements DialogInterface.OnClickListener {
    public final Context FLD631;
    public final File FLD632;

    public CLS150(Context context0, File file0) {
        this.FLD631 = context0;
        this.FLD632 = file0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        CLS184.MTH2680(this.FLD631, this.FLD632, dialogInterface0, v);
    }
}

