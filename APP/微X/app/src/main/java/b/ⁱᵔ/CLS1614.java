// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS69;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS200;
import b.ᐧˉ.CLS258;
import b.ᵔʾ.CLS1254;
import b.ᵔʾ.CLS1260;
import b.ᵔʾ.CLS281;
import b.ᵔʾ.CLS310;
import b.ⁱʾ.CLS335;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS534.CLS533;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public final class CLS1614 implements CLS379 {
    public final String FLD5120;
    public final ArrayList FLD5121;
    public final ArrayList FLD5122;
    public final Activity FLD5123;
    public final ArrayList FLD5124;
    public final Calendar FLD5125;
    public final CLS1622 FLD5126;
    public final ArrayList FLD5127;
    public final ArrayList FLD5128;
    public final Bundle FLD5129;
    public final SimpleDateFormat FLD5130;
    public final ArrayList FLD5131;
    public final SimpleDateFormat FLD5132;

    public CLS1614(Activity activity0, Bundle bundle0, ArrayList arrayList0, SimpleDateFormat simpleDateFormat0, Calendar calendar0, SimpleDateFormat simpleDateFormat1, ArrayList arrayList1, ArrayList arrayList2, ArrayList arrayList3, String s, ArrayList arrayList4, ArrayList arrayList5, CLS1622 ˑٴ0) {
        this.FLD5123 = activity0;
        this.FLD5129 = bundle0;
        this.FLD5127 = arrayList0;
        this.FLD5130 = simpleDateFormat0;
        this.FLD5125 = calendar0;
        this.FLD5132 = simpleDateFormat1;
        this.FLD5131 = arrayList1;
        this.FLD5121 = arrayList2;
        this.FLD5122 = arrayList3;
        this.FLD5120 = s;
        this.FLD5124 = arrayList4;
        this.FLD5128 = arrayList5;
        this.FLD5126 = ˑٴ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        int v = CLS523.MTH7137(10);
        CLS1623 יᐧ0 = new CLS1623(this.FLD5123);
        יᐧ0.FLD5261 = true;
        CLS1629 ⁱˉ0 = new CLS1629(this.FLD5123);
        ⁱˉ0.MTH7381("delete");
        ⁱˉ0.MTH7381("set_private");
        ⁱˉ0.MTH7375("delete");
        ⁱˉ0.FLD5356 = new CLS1481(6, this.FLD5129);
        יᐧ0.MTH7296(ⁱˉ0);
        String[] arr_s = new String[2];
        Date date0 = this.FLD5125.getTime();
        arr_s[0] = this.FLD5130.format(date0);
        Date date1 = this.FLD5125.getTime();
        arr_s[1] = this.FLD5132.format(date1);
        List list0 = Arrays.asList(arr_s);
        this.FLD5127.addAll(list0);
        CLS1626 ـﹳ0 = new CLS1626(this.FLD5123);
        ـﹳ0.MTH800(CLS27.MTH889("select_date"));
        ـﹳ0.MTH7325(((String)this.FLD5127.get(0)));
        ـﹳ0.MTH7324(new CLS428(this.FLD5130, this.FLD5127, this.FLD5123, ـﹳ0, 2));
        CLS1626 ـﹳ1 = new CLS1626(this.FLD5123);
        ـﹳ1.MTH800(CLS27.MTH889("select_time"));
        ـﹳ1.MTH7325(((String)this.FLD5127.get(1)));
        ـﹳ1.MTH7324(new CLS281(this.FLD5127, this.FLD5132, this.FLD5125, this.FLD5123, ـﹳ1));
        יᐧ0.MTH7289(new Object[]{ـﹳ0, ـﹳ1});
        יᐧ0.MTH7290(linearLayout0, v);
        CLS1623 יᐧ1 = new CLS1623(this.FLD5123);
        יᐧ1.FLD5261 = true;
        CLS1624 יﹳ0 = new CLS1624(this.FLD5123);
        יﹳ0.MTH7311();
        CLS335 ˑٴ0 = new CLS335(this.FLD5123);
        CLS1625 ـˏ0 = new CLS1625(this.FLD5123);
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(CLS27.MTH889("text"));
        arrayList0.add(CLS27.MTH889("image"));
        arrayList0.add(CLS27.MTH889("video"));
        CLS69 ʾᵢ0 = new CLS69();
        ʾᵢ0.MTH1560(CLS27.MTH889("image"), 1);
        String s = CLS27.MTH889("text");
        String s1 = this.FLD5120;
        ArrayList arrayList1 = this.FLD5122;
        ʾᵢ0.MTH1560(CLS182.MTH3497(2, ʾᵢ0, s, 0x38EA867C2B3CD335L), 15);
        CLS1620 ˊˏ0 = new CLS1620(this.FLD5123);
        ˊˏ0.FLD5220 = true;
        ˊˏ0.MTH800(CLS27.MTH889("types"));
        ArrayList arrayList2 = this.FLD5128;
        ArrayList arrayList3 = this.FLD5121;
        ArrayList arrayList4 = this.FLD5131;
        ˊˏ0.MTH7248(((CLS533)new CLS1260(ʾᵢ0, this.FLD5129, ـˏ0, ˑٴ0, this.FLD5131, יﹳ0, arrayList3, 1)));
        ˊˏ0.MTH7247(arrayList0);
        ˊˏ0.MTH7246(((String)ʾᵢ0.MTH1559(1)));
        יᐧ1.MTH7296(ˊˏ0);
        Activity activity0 = this.FLD5123;
        CLS1629 ⁱˉ1 = new CLS1629(activity0);
        ⁱˉ1.MTH7381("public");
        ⁱˉ1.MTH7381("only_selected");
        ⁱˉ1.MTH7381("not_show_selected");
        ⁱˉ1.MTH7375("public");
        CLS1625 ـˏ1 = new CLS1625(activity0);
        ـˏ1.MTH800(CLS27.MTH889("select"));
        ـˏ1.MTH7320(new CLS508(arrayList1, s1, activity0, this.FLD5124, 0));
        ـˏ1.MTH801(8);
        יᐧ1.MTH7296(ـˏ1);
        Bundle bundle0 = this.FLD5129;
        ⁱˉ1.FLD5356 = new CLS1254(bundle0, ـˏ1, 1);
        יᐧ1.MTH7296(ⁱˉ1);
        if(CLS500.FLD4928.MTH6895("remove_mention_limit") && CLS27.MTH895().MTH938("remove_mention_limit_enable", false)) {
            CLS1625 ـˏ2 = new CLS1625(activity0);
            ـˏ2.MTH800(CLS27.MTH889("select_mentions"));
            ـˏ2.MTH7320(new CLS508(arrayList1, s1, activity0, arrayList2, 1));
            יᐧ1.MTH7296(ـˏ2);
        }
        String s2 = CLS27.MTH889("content");
        this.FLD5126.MTH800(s2);
        יᐧ1.MTH7296(this.FLD5126);
        ـˏ0.MTH800(CLS27.MTH889("add_img_path"));
        ـˏ0.MTH7320(new CLS258(bundle0, arrayList4, ˑٴ0, arrayList3, 11));
        ـˏ0.MTH801(8);
        יᐧ1.MTH7296(ـˏ0);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        יﹳ0.MTH7303(ˑٴ0);
        יﹳ0.MTH7308(5);
        ـˏ1.MTH801(8);
        ⁱˉ1.MTH7375("public");
        יﹳ0.MTH7305(new CLS310(activity0, bundle0, ˑٴ0, arrayList4, arrayList3));
        יﹳ0.MTH7301(new CLS200(bundle0, ˑٴ0, activity0, 8));
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
    }
}

