// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import d.ᐧי.CLS110;
import java.util.LinkedHashMap;

public final class CLS29 implements View.OnClickListener {
    public final String FLD137;
    public final Activity FLD138;
    public final LinkedHashMap FLD139;
    public final CLS110 FLD140;

    public CLS29(Activity activity0, String s, CLS110 ٴˑ0, LinkedHashMap linkedHashMap0) {
        this.FLD138 = activity0;
        this.FLD137 = s;
        this.FLD140 = ٴˑ0;
        this.FLD139 = linkedHashMap0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS28.MTH531(this.FLD138, this.FLD137, this.FLD140, this.FLD139, null);
    }
}

