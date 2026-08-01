// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.widget.LinearLayout;
import d.ٴˑ.CLS182;
import d.ٴˑ.CLS190;
import d.ⁱٴ.CLS124;
import java.util.Collections;

public final class CLS149 implements CLS124 {
    public final CLS190 FLD159;
    public final CLS190 FLD160;
    public final Activity FLD161;
    public final CLS190 FLD162;
    public final CLS190 FLD163;

    public CLS149(Activity activity0, CLS190 ᵎᐧ0, CLS190 ᵎᐧ1, CLS190 ᵎᐧ2, CLS190 ᵎᐧ3) {
        this.FLD161 = activity0;
        this.FLD159 = ᵎᐧ0;
        this.FLD163 = ᵎᐧ1;
        this.FLD162 = ᵎᐧ2;
        this.FLD160 = ᵎᐧ3;
    }

    @Override  // d.ⁱٴ.CLS124
    public final void MTH1175(Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS182 ˆᐧ0 = new CLS182(this.FLD161);
        Collections.addAll(ˆᐧ0.FLD411, new Object[]{this.FLD159, this.FLD163, this.FLD162, this.FLD160});
        ˆᐧ0.MTH904(linearLayout0, 0);
    }
}

