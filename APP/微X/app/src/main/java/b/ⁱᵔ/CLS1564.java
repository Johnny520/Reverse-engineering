// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ˑٴ.CLS651;
import b.ᐧˉ.CLS1043;
import b.ᐧˉ.CLS211;
import b.ⁱʾ.CLS369;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS525;
import java.util.ArrayList;

public final class CLS1564 implements CLS378, CLS379 {
    public final int FLD4873;
    public final ArrayList FLD4874;
    public final Activity FLD4875;
    public final CLS369 FLD4876;

    public CLS1564(Activity activity0, ArrayList arrayList0, int v, CLS369 ﾞᵎ0) {
        this.FLD4873 = v;
        this.FLD4875 = activity0;
        this.FLD4876 = ﾞᵎ0;
        this.FLD4874 = arrayList0;
        super();
    }

    public CLS1564(Activity activity0, ArrayList arrayList0, CLS369 ﾞᵎ0) {
        this.FLD4873 = 1;
        super();
        this.FLD4875 = activity0;
        this.FLD4874 = arrayList0;
        this.FLD4876 = ﾞᵎ0;
    }

    public CLS1564(ArrayList arrayList0, CLS369 ﾞᵎ0, Activity activity0) {
        this.FLD4873 = 3;
        super();
        this.FLD4874 = arrayList0;
        this.FLD4876 = ﾞᵎ0;
        this.FLD4875 = activity0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        CLS369 ﾞᵎ0 = this.FLD4876;
        ArrayList arrayList0 = this.FLD4874;
        Activity activity0 = this.FLD4875;
        if(this.FLD4873 == 1) {
            ʻˑ0.MTH7187("add", ((CLS3)new CLS1566(activity0, arrayList0, 0, ﾞᵎ0)));
            ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS1566(activity0, arrayList0, 1, ﾞᵎ0)));
            return;
        }
        ʻˑ0.MTH7187("clear", ((CLS3)new CLS1592(1, ﾞᵎ0, arrayList0)));
        ʻˑ0.MTH7187("export_", ((CLS3)new CLS651(activity0, 10)));
        ʻˑ0.MTH7187("import_", ((CLS3)new CLS1566(activity0, arrayList0, 3, ﾞᵎ0)));
        ʻˑ0.MTH7187("add", ((CLS3)new CLS1566(activity0, arrayList0, 4, ﾞᵎ0)));
    }

    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        ArrayList arrayList0 = this.FLD4874;
        CLS369 ﾞᵎ0 = this.FLD4876;
        Activity activity0 = this.FLD4875;
        if(this.FLD4873 == 0) {
            CLS1624 יﹳ0 = new CLS1624(activity0);
            יﹳ0.MTH7303(ﾞᵎ0);
            יﹳ0.MTH7305(new CLS389(activity0, arrayList0, 0, ﾞᵎ0));
            CLS1623 יᐧ0 = new CLS1623(activity0);
            יᐧ0.MTH7296(יﹳ0);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(3));
            return;
        }
        CLS1624 יﹳ1 = new CLS1624(activity0);
        יﹳ1.FLD5274 = new CLS1043(ﾞᵎ0, 18);
        יﹳ1.MTH7302();
        יﹳ1.MTH7311();
        יﹳ1.MTH7303(ﾞᵎ0);
        יﹳ1.MTH7308(5);
        יﹳ1.MTH7301(new CLS211(activity0, ﾞᵎ0, 7));
        יﹳ1.MTH7305(new CLS389(activity0, arrayList0, 1, ﾞᵎ0));
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ1), true);
    }
}

