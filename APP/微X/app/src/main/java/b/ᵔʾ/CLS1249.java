// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˈˈ.CLS69;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS335;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS534.CLS533;
import java.util.ArrayList;

public final class CLS1249 implements CLS379 {
    public final ArrayList FLD3126;
    public final ArrayList FLD3127;
    public final long FLD3128;
    public final CLS298 FLD3129;
    public final String FLD3130;
    public final CLS1621 FLD3131;
    public final ArrayList FLD3132;
    public final CLS1622 FLD3133;
    public final ArrayList FLD3134;
    public final Activity FLD3135;
    public final CLS1621 FLD3136;
    public final CLS1622 FLD3137;
    public final ArrayList FLD3138;
    public final Bundle FLD3139;

    public CLS1249(CLS298 יʼ0, Activity activity0, CLS1622 ˑٴ0, CLS1621 ˎᵢ0, CLS1621 ˎᵢ1, Bundle bundle0, ArrayList arrayList0, ArrayList arrayList1, long v, ArrayList arrayList2, String s, ArrayList arrayList3, ArrayList arrayList4, CLS1622 ˑٴ1) {
        this.FLD3129 = יʼ0;
        this.FLD3135 = activity0;
        this.FLD3133 = ˑٴ0;
        this.FLD3136 = ˎᵢ0;
        this.FLD3131 = ˎᵢ1;
        this.FLD3139 = bundle0;
        this.FLD3138 = arrayList0;
        this.FLD3127 = arrayList1;
        this.FLD3128 = v;
        this.FLD3126 = arrayList2;
        this.FLD3130 = s;
        this.FLD3134 = arrayList3;
        this.FLD3132 = arrayList4;
        this.FLD3137 = ˑٴ1;
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        ArrayList arrayList0 = this.FLD3138;
        this.FLD3129.getClass();
        int v = CLS523.MTH7137(10);
        CLS1623 יᐧ0 = new CLS1623(this.FLD3135);
        יᐧ0.FLD5261 = true;
        String s = CLS27.MTH889("repeat_number");
        this.FLD3133.MTH800(s);
        CLS29 ˎᵢ0 = CLS27.MTH895();
        ArrayList arrayList1 = this.FLD3132;
        ArrayList arrayList2 = this.FLD3134;
        String s1 = String.valueOf(ˎᵢ0.MTH927(0, "mr_repeat_no"));
        this.FLD3133.MTH7277(s1);
        this.FLD3133.MTH7278(0x1000);
        this.FLD3133.FLD5252 = new CLS1225(0);
        String s2 = CLS27.MTH889("repeat_delay");
        this.FLD3136.MTH800(s2);
        int v1 = CLS412.MTH6005(60000, "mr_repeat_delay");
        String s3 = this.FLD3130;
        ArrayList arrayList3 = this.FLD3126;
        this.FLD3136.MTH7268(((long)v1));
        this.FLD3136.FLD5242 = new CLS1225(1);
        String s4 = CLS27.MTH889("delete_delay");
        this.FLD3131.MTH800(s4);
        int v2 = CLS412.MTH6005(60000, "mr_delete_delay");
        ArrayList arrayList4 = this.FLD3127;
        this.FLD3131.MTH7268(((long)v2));
        this.FLD3131.FLD5242 = new CLS1225(2);
        יᐧ0.MTH7289(new Object[]{this.FLD3133, this.FLD3136, this.FLD3131});
        יᐧ0.MTH7290(linearLayout0, v);
        CLS1623 יᐧ1 = new CLS1623(this.FLD3135);
        יᐧ1.FLD5261 = true;
        CLS1624 יﹳ0 = new CLS1624(this.FLD3135);
        יﹳ0.MTH7311();
        CLS335 ˑٴ0 = new CLS335(this.FLD3135);
        ˑٴ0.FLD3331 = true;
        CLS1625 ـˏ0 = new CLS1625(this.FLD3135);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(CLS27.MTH889("text"));
        arrayList5.add(CLS27.MTH889("image"));
        arrayList5.add(CLS27.MTH889("video"));
        CLS69 ʾᵢ0 = new CLS69();
        ʾᵢ0.MTH1560(CLS27.MTH889("image"), 1);
        ʾᵢ0.MTH1560(CLS182.MTH3497(2, ʾᵢ0, CLS27.MTH889("text"), 0x38EB53402B3CD335L), 15);
        CLS1620 ˊˏ0 = new CLS1620(this.FLD3135);
        ˊˏ0.FLD5220 = true;
        ˊˏ0.MTH800(CLS27.MTH889("types"));
        Bundle bundle0 = this.FLD3139;
        Activity activity0 = this.FLD3135;
        CLS298 יʼ0 = this.FLD3129;
        ˊˏ0.MTH7248(((CLS533)new CLS1260(ʾᵢ0, this.FLD3139, ـˏ0, ˑٴ0, arrayList0, יﹳ0, arrayList4, 0)));
        ˊˏ0.MTH7247(arrayList5);
        ˊˏ0.MTH7246(((String)ʾᵢ0.MTH1559(1)));
        long v3 = this.FLD3128;
        if(v3 == 0L) {
            יᐧ1.MTH7296(ˊˏ0);
        }
        CLS1629 ⁱˉ0 = new CLS1629(activity0);
        ⁱˉ0.MTH7381("public");
        ⁱˉ0.MTH7381("private");
        ⁱˉ0.MTH7381("only_selected");
        ⁱˉ0.MTH7381("not_show_selected");
        ⁱˉ0.MTH7375("public");
        CLS1625 ـˏ1 = new CLS1625(activity0);
        ـˏ1.MTH800(CLS27.MTH889("select"));
        ـˏ1.MTH7320(new CLS282(יʼ0, arrayList3, s3, activity0, arrayList2, 0));
        ـˏ1.MTH801(8);
        יᐧ1.MTH7296(ـˏ1);
        ⁱˉ0.FLD5356 = new CLS1254(bundle0, ـˏ1, 0);
        יᐧ1.MTH7296(ⁱˉ0);
        if(CLS500.FLD4928.MTH6895("remove_mention_limit") && CLS27.MTH895().MTH938("remove_mention_limit_enable", false)) {
            CLS1625 ـˏ2 = new CLS1625(activity0);
            ـˏ2.MTH800(CLS27.MTH889("select_mentions"));
            ـˏ2.MTH7320(new CLS282(יʼ0, arrayList3, s3, activity0, arrayList1, 1));
            יᐧ1.MTH7296(ـˏ2);
        }
        String s5 = CLS27.MTH889("content");
        this.FLD3137.MTH800(s5);
        יᐧ1.MTH7296(this.FLD3137);
        ـˏ0.MTH800(CLS27.MTH889("add_img_path"));
        ـˏ0.MTH7320(new CLS281(יʼ0, bundle0, arrayList0, ˑٴ0, arrayList4, 0));
        ـˏ0.MTH801(8);
        if(v3 == 0L) {
            יᐧ1.MTH7296(ـˏ0);
        }
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        יﹳ0.MTH7303(ˑٴ0);
        ـˏ1.MTH801(8);
        ⁱˉ0.MTH7375("public");
        יﹳ0.MTH7305(new CLS310(יʼ0, ˑٴ0, activity0, arrayList0, arrayList4));
        יﹳ0.MTH7301(new CLS289(0, activity0, ˑٴ0));
        if(v3 == 0L) {
            CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
        }
    }
}

