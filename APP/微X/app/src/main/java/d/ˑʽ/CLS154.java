// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import d.ˎˏ.CLS1;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ٴˑ.CLS181;
import d.ٴˑ.CLS182;
import d.ٴˑ.CLS187;
import d.ٴˑ.CLS188;
import d.ᐧˏ.CLS108;
import d.ᐧי.CLS110;
import d.ⁱٴ.CLS123;
import d.ⁱٴ.CLS125;
import java.util.ArrayList;
import java.util.HashMap;

public final class CLS154 implements CLS8 {
    public final int FLD180;
    public final ArrayList FLD181;
    public final HashMap FLD182;
    public final Activity FLD183;
    public final CLS110 FLD184;
    public final CLS123 FLD185;
    public final ArrayList FLD186;

    public CLS154(Activity activity0, int v, CLS134 ˆⁱ0, CLS110 ٴˑ0, ArrayList arrayList0, ArrayList arrayList1, HashMap hashMap0) {
        this.FLD183 = activity0;
        this.FLD180 = v;
        this.FLD185 = ˆⁱ0;
        this.FLD184 = ٴˑ0;
        this.FLD181 = arrayList0;
        this.FLD186 = arrayList1;
        this.FLD182 = hashMap0;
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS10$CLS8
    public final void MTH415(LinearLayout linearLayout0) {
        Activity activity0 = this.FLD183;
        CLS110 ٴˑ0 = this.FLD184;
        ArrayList arrayList0 = this.FLD181;
        ArrayList arrayList1 = this.FLD186;
        HashMap hashMap0 = this.FLD182;
        String s = CLS1.MTH369();
        String s1 = CLS7.FLD41.MTH413();
        if(!TextUtils.isEmpty(s1) && !s.equals(s1)) {
            StringBuilder stringBuilder0 = CLS71.MTH830(s);
            stringBuilder0.append(" (");
            stringBuilder0.append(s1);
            stringBuilder0.append(")");
            s = stringBuilder0.toString();
        }
        CLS188 ᴵʾ0 = new CLS188(activity0);
        ᴵʾ0.FLD531 = false;
        ᴵʾ0.MTH1181(String.format(CLS69.MTH795("keycard_bind_account"), s));
        ᴵʾ0.MTH1179(CLS69.MTH795(CLS108.MTH1103((this.FLD180 == 0 ? 0xFFFF32B22DFB3E45L : 0xFFFF32582DFB3E45L))));
        CLS45.MTH660(linearLayout0, ((CLS125)ᴵʾ0));
        CLS182 ˆᐧ0 = new CLS182(activity0);
        CLS187 ᐧﹶ0 = new CLS187(activity0);
        ᐧﹶ0.MTH1181(CLS69.MTH795("keycard"));
        ᐧﹶ0.MTH991(new CLS33(this.FLD185, 0));
        ˆᐧ0.MTH907(((CLS125)ᐧﹶ0));
        CLS187 ᐧﹶ1 = new CLS187(activity0);
        ᐧﹶ1.MTH1181(CLS69.MTH795("keycard_feedback"));
        ᐧﹶ1.MTH991(new CLS47(activity0, 0));
        ˆᐧ0.MTH907(((CLS125)ᐧﹶ1));
        ˆᐧ0.MTH904(linearLayout0, 0);
        CLS181 ˆـ0 = new CLS181(activity0);
        int v = CLS45.MTH662(10);
        ˆـ0.FLD403.setDividerHeight(v);
        ˆـ0.MTH894(ٴˑ0);
        CLS32 ˎᵔ0 = new CLS32(activity0, ٴˑ0, arrayList0, arrayList1, hashMap0);
        ˆـ0.FLD395 = ˎᵔ0;
        ˆـ0.FLD403.setOnItemLongClickListener(ˎᵔ0);
        CLS45.MTH660(linearLayout0, ((CLS125)ˆـ0));
    }
}

