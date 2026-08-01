// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS44;
import b.ᐧˉ.CLS211;
import b.ᐧˉ.CLS250;
import b.ᵔʾ.CLS1235;
import b.ⁱʾ.CLS344;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS525;
import java.util.ArrayList;

public final class CLS1552 implements CLS16, CLS17 {
    public final Activity FLD4828;
    public final String[] FLD4829;

    public CLS1552(Activity activity0, String[] arr_s) {
        this.FLD4828 = activity0;
        this.FLD4829 = arr_s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        Object object0 = CLS40.FLD157.MTH1118(CLS44.class);
        ArrayList arrayList0 = new ArrayList(((CLS44)object0).MTH1181("_MOMENTS_SIGNATURES_"));
        CLS344 ٴـ0 = new CLS344(this.FLD4828, arrayList0);
        String s = CLS27.MTH904();
        CLS525 ʻˑ0 = new CLS525(this.FLD4828, linearLayout0, menu0);
        ʻˑ0.MTH7187("add", ((CLS3)new CLS1235(15, this.FLD4828, s, ((CLS44)object0), ٴـ0, arrayList0)));
        ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS1568(((CLS44)object0), arrayList0, ٴـ0, 1)));
        ʻˑ0.MTH7188();
        CLS1624 יﹳ0 = new CLS1624(this.FLD4828);
        יﹳ0.MTH7311();
        יﹳ0.FLD5274 = new CLS1481(5, ٴـ0);
        יﹳ0.MTH7302();
        יﹳ0.MTH7303(ٴـ0);
        יﹳ0.MTH7301(new CLS211(ٴـ0, this.FLD4829, 9));
        יﹳ0.MTH7305(new CLS250(ٴـ0, this.FLD4828, ((CLS44)object0), arrayList0, 6));
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS1279 ʻᐧ0 = new CLS1279(this.FLD4828, s, this.FLD4829, 4);
        CLS40.FLD157.MTH1124(((CLS39)ʻᐧ0));
    }
}

