// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;
import java.util.ArrayList;
import java.util.HashMap;

public final class CLS1504 implements CLS17 {
    public final CLS1635 FLD4561;
    public final ArrayList FLD4562;
    public final ArrayList FLD4563;
    public final long FLD4564;
    public final int[] FLD4565;
    public final Activity FLD4566;
    public final CLS1622 FLD4567;
    public final HashMap FLD4568;
    public final String FLD4569;
    public final ArrayList FLD4570;

    public CLS1504(long v, CLS1622 ˑٴ0, Activity activity0, HashMap hashMap0, int[] arr_v, ArrayList arrayList0, String s, ArrayList arrayList1, ArrayList arrayList2, CLS1635 ﾞᵎ0) {
        this.FLD4564 = v;
        this.FLD4567 = ˑٴ0;
        this.FLD4566 = activity0;
        this.FLD4568 = hashMap0;
        this.FLD4565 = arr_v;
        this.FLD4570 = arrayList0;
        this.FLD4569 = s;
        this.FLD4562 = arrayList1;
        this.FLD4563 = arrayList2;
        this.FLD4561 = ﾞᵎ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Activity activity0 = this.FLD4566;
        ArrayList arrayList0 = this.FLD4570;
        String s = this.FLD4569;
        ArrayList arrayList1 = this.FLD4562;
        ArrayList arrayList2 = this.FLD4563;
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        String s1 = CLS502.MTH6931(CLS396.FLD3775.MTH5752(this.FLD4564));
        CLS1622 ˑٴ0 = this.FLD4567;
        ˑٴ0.MTH7277(s1);
        CLS525 ʻˑ0 = new CLS525(activity0, linearLayout0, menu0);
        CLS500 ᵢﹶ0 = CLS500.FLD4928;
        if(ᵢﹶ0.MTH6895("moments_signatures")) {
            ʻˑ0.MTH7187("moment_signature", ((CLS3)new CLS1583(activity0, s1, ˑٴ0, 0)));
        }
        if(ᵢﹶ0.MTH6895("fast_moment_fake_gps")) {
            ʻˑ0.MTH7187("fake_gps", ((CLS3)new CLS1423(activity0, this.FLD4568)));
        }
        ʻˑ0.MTH7188();
        CLS523.MTH7147(linearLayout0, ((CLS18)ˑٴ0), true);
        CLS1623 יᐧ0 = new CLS1623(activity0);
        CLS1629 ⁱˉ0 = new CLS1629(activity0);
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ⁱˉ0.MTH7381("public");
        ⁱˉ0.MTH7381("private");
        ⁱˉ0.MTH7381("only_selected");
        ⁱˉ0.MTH7381("not_show_selected");
        ⁱˉ0.MTH7375("public");
        ⁱˉ0.FLD5356 = new CLS1538(this.FLD4565, ـˏ0, 0);
        ـˏ0.MTH800(CLS27.MTH889("select"));
        ـˏ0.MTH7320(new CLS508(arrayList0, s, activity0, arrayList1, 2));
        יᐧ0.MTH7296(ـˏ0);
        יᐧ0.MTH7296(ⁱˉ0);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(10));
        if(ᵢﹶ0.MTH6895("remove_mention_limit") && CLS27.MTH895().MTH938("remove_mention_limit_enable", false)) {
            CLS1623 יᐧ1 = new CLS1623(activity0);
            CLS1625 ـˏ1 = new CLS1625(activity0);
            ـˏ1.MTH800(CLS27.MTH889("select_mentions"));
            ـˏ1.MTH7320(new CLS508(arrayList0, s, activity0, arrayList2, 3));
            יᐧ1.MTH7296(ـˏ1);
            יᐧ1.MTH7290(linearLayout0, CLS523.MTH7137(10));
        }
        if(ᵢﹶ0.MTH6895("moments_forward_comments")) {
            String s2 = CLS27.MTH889("forward_comments");
            this.FLD4561.MTH800(s2);
            CLS523.MTH7147(linearLayout0, ((CLS18)this.FLD4561), true);
        }
    }
}

