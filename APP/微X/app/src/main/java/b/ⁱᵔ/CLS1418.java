// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˈˈ.CLS69;
import b.ᐧˉ.CLS182;
import java.util.ArrayList;

public final class CLS1418 implements CLS3 {
    public final int FLD4124;
    public final CLS29 FLD4125;
    public final Activity FLD4126;

    public CLS1418(Activity activity0, CLS29 ˎᵢ0, int v) {
        this.FLD4124 = v;
        this.FLD4126 = activity0;
        this.FLD4125 = ˎᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD4126;
        CLS29 ˎᵢ0 = this.FLD4125;
        if(this.FLD4124 == 0) {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(CLS27.MTH889("web_img_src1"));
            arrayList0.add(CLS27.MTH889("web_img_src2"));
            arrayList0.add(CLS27.MTH889("web_img_src3"));
            arrayList0.add(CLS27.MTH889("web_img_src4"));
            if(!CLS412.MTH6002()) {
                arrayList0.add(CLS27.MTH889("web_img_src6"));
            }
            CLS69 ʾᵢ0 = new CLS69();
            ʾᵢ0.MTH1560(CLS27.MTH889("web_img_src1"), 0);
            ʾᵢ0.MTH1560(CLS27.MTH889("web_img_src2"), 1);
            ʾᵢ0.MTH1560(CLS182.MTH3497(2, ʾᵢ0, CLS27.MTH889("web_img_src3"), 4100828731927221045L), 3);
            if(!CLS412.MTH6002()) {
                ʾᵢ0.MTH1560(CLS27.MTH889("web_img_src6"), 5);
            }
            CLS395.MTH5732(activity0, CLS27.MTH889("web_img_search_src"), arrayList0, ((String)ʾᵢ0.MTH1559(ˎᵢ0.MTH927(1, "web_img_search_src"))), ((CLS12)new CLS1461(ʾᵢ0, ˎᵢ0, 0)));
            return;
        }
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(CLS27.MTH889("web_img_src1"));
        arrayList1.add(CLS27.MTH889("web_img_src2"));
        CLS69 ʾᵢ1 = new CLS69();
        ʾᵢ1.MTH1560(CLS27.MTH889("web_img_src1"), 0);
        ʾᵢ1.MTH1560(CLS27.MTH889("web_img_src2"), 1);
        CLS395.MTH5732(activity0, CLS27.MTH889("web_img_search_src"), arrayList1, ((String)ʾᵢ1.MTH1559(ˎᵢ0.MTH927(1, "web_img_search_src"))), ((CLS12)new CLS1461(ʾᵢ1, ˎᵢ0, 1)));
    }
}

