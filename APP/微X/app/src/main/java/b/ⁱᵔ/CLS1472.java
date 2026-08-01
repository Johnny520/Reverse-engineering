// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.ContentValues;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ᐧˉ.CLS204;
import b.ⁱʾ.CLS1272;
import b.ⁱʾ.CLS359;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public final class CLS1472 implements CLS379 {
    public final CLS396 FLD4387;
    public final boolean FLD4388;
    public final CLS359 FLD4389;
    public final ArrayList FLD4390;
    public final Activity FLD4391;
    public final CLS1624 FLD4392;

    public CLS1472(CLS396 ʿʽ0, ArrayList arrayList0, CLS359 ⁱˉ0, Activity activity0, boolean z, CLS1624 יﹳ0) {
        this.FLD4387 = ʿʽ0;
        this.FLD4390 = arrayList0;
        this.FLD4389 = ⁱˉ0;
        this.FLD4391 = activity0;
        this.FLD4388 = z;
        this.FLD4392 = יﹳ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS396 ʿʽ0 = this.FLD4387;
        ArrayList arrayList0 = this.FLD4390;
        Activity activity0 = this.FLD4391;
        boolean z = this.FLD4388;
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd");
        Date date0 = new Date();
        String[] arr_s = {simpleDateFormat0.format(date0)};
        String[] arr_s1 = {""};
        for(Object object0: ʿʽ0.MTH5760(CLS481.MTH6689(date0).getTime() / 1000L, CLS481.MTH6695(date0).getTime() / 1000L, arr_s1[0])) {
            ContentValues contentValues0 = (ContentValues)object0;
            if(!CLS66.MTH1479(((long)contentValues0.getAsLong("id")))) {
                arrayList0.add(contentValues0);
            }
        }
        this.FLD4389.MTH5235(arrayList0);
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        ـﹳ0.MTH800(CLS27.MTH889("select_date"));
        ـﹳ0.MTH7325(arr_s[0]);
        ـﹳ0.MTH7324(new CLS383(simpleDateFormat0, arr_s, activity0, ـﹳ0, arrayList0, ʿʽ0, arr_s1, this.FLD4389));
        ArrayList arrayList1 = new ArrayList();
        String s = CLS27.MTH904();
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ـˏ0.MTH800(CLS27.MTH889("select_contact"));
        ـˏ0.MTH7320(new CLS437(arrayList1, s, z, activity0, arr_s1, simpleDateFormat0, arr_s, arrayList0, ʿʽ0, this.FLD4389));
        CLS1635 ﾞᵎ0 = new CLS1635(activity0);
        ﾞᵎ0.MTH800(CLS27.MTH889("select_all"));
        ﾞᵎ0.MTH7438(new CLS496(this.FLD4389, 3));
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH7289(new Object[]{ـﹳ0, ـˏ0, ﾞᵎ0});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(10));
        this.FLD4392.FLD5274 = new CLS1272(this.FLD4389, 7);
        this.FLD4392.MTH7302();
        this.FLD4392.MTH7311();
        this.FLD4392.MTH7303(this.FLD4389);
        this.FLD4392.FLD5276 = false;
        CLS204 ˊʼ0 = new CLS204(this.FLD4389, 6);
        this.FLD4392.MTH7301(ˊʼ0);
        CLS514 ﹶـ0 = new CLS514(0, activity0, this.FLD4389);
        this.FLD4392.MTH7305(ﹶـ0);
        CLS523.MTH7147(linearLayout0, ((CLS18)this.FLD4392), true);
    }
}

