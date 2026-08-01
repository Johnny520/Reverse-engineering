// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS16;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import org.json.JSONObject;

public final class CLS241 implements View.OnClickListener {
    public final int FLD2402;
    public final JSONObject FLD2403;
    public final Activity FLD2404;
    public final CLS1622 FLD2405;

    public CLS241(Activity activity0, CLS1622 ˑٴ0, JSONObject jSONObject0) {
        this.FLD2402 = 0;
        super();
        this.FLD2404 = activity0;
        this.FLD2405 = ˑٴ0;
        this.FLD2403 = jSONObject0;
    }

    public CLS241(Activity activity0, JSONObject jSONObject0, CLS1622 ˑٴ0) {
        this.FLD2402 = 1;
        super();
        this.FLD2404 = activity0;
        this.FLD2403 = jSONObject0;
        this.FLD2405 = ˑٴ0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD2404;
        JSONObject jSONObject0 = this.FLD2403;
        CLS1622 ˑٴ0 = this.FLD2405;
        if(this.FLD2402 == 0) {
            CLS523.MTH7164(activity0, ((CLS16)new CLS956(ˑٴ0, jSONObject0)));
            return;
        }
        CLS523.MTH7164(activity0, ((CLS16)new CLS956(jSONObject0, ˑٴ0)));
    }
}

