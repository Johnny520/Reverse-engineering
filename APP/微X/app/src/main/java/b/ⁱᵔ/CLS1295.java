// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.ContentValues;
import android.view.Menu;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.SearchView;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS568;
import b.ˑٴ.CLS848;
import b.ᐧˉ.CLS204;
import b.ᐧˉ.CLS211;
import b.ᐧˉ.CLS220;
import b.ⁱʾ.CLS1272;
import b.ⁱʾ.CLS353;
import b.ⁱʾ.CLS359;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1627;
import b.ﾞˎ.CLS1630;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public final class CLS1295 implements CLS17, CLS379 {
    public final int FLD3583;
    public final Object FLD3584;
    public final Object FLD3585;
    public final Activity FLD3586;
    public final Object FLD3587;
    public final Object FLD3588;

    public CLS1295(Activity activity0, Object object0, Object object1, Object object2, Object object3, int v) {
        this.FLD3583 = v;
        this.FLD3586 = activity0;
        this.FLD3585 = object0;
        this.FLD3587 = object1;
        this.FLD3584 = object2;
        this.FLD3588 = object3;
        super();
    }

    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Activity activity0 = this.FLD3586;
        Object object0 = this.FLD3588;
        Object object1 = this.FLD3584;
        Object object2 = this.FLD3587;
        Object object3 = this.FLD3585;
        if(this.FLD3583 == 0) {
            Menu menu0 = (Menu)arr_object[0];
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            ArrayList arrayList0 = new ArrayList();
            CLS353 ᵔʾ0 = new CLS353(activity0, arrayList0);
            CLS568 יᐧ0 = new CLS568(ᵔʾ0, arrayList0, 18);
            CLS525 ʻˑ0 = new CLS525(activity0, linearLayout0, menu0);
            ʻˑ0.MTH7187("set_path", ((CLS3)new CLS848(activity0, ((String[])object3), יᐧ0, ((String)object2))));
            ʻˑ0.MTH7187("select_gif1", ((CLS3)new CLS1627(11, ((CLS8)object1))));
            ʻˑ0.MTH7188();
            CLS1630 ⁱᵔ0 = new CLS1630(activity0);
            ⁱᵔ0.FLD5373 = new CLS1481(4, ᵔʾ0);
            ⁱᵔ0.FLD5371 = true;
            SearchView searchView0 = ⁱᵔ0.FLD5375;
            GridView gridView0 = ⁱᵔ0.FLD5370;
            if(searchView0 != null) {
                searchView0.setVisibility(0);
                if(ⁱᵔ0.FLD5373 == null) {
                    gridView0.setTextFilterEnabled(true);
                }
            }
            ⁱᵔ0.FLD5369 = ᵔʾ0;
            if(gridView0 != null) {
                gridView0.setAdapter(ᵔʾ0);
            }
            gridView0.setNumColumns(4);
            gridView0.setColumnWidth(0x80);
            CLS211 ˋˊ0 = new CLS211(ᵔʾ0, ((ContentValues[])object0), 8);
            ⁱᵔ0.FLD5367 = ˋˊ0;
            gridView0.setOnItemClickListener(ˋˊ0);
            יᐧ0.MTH791(new File(((String)object2)));
            CLS523.MTH7147(linearLayout0, ((CLS18)ⁱᵔ0), true);
            return;
        }
        LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
        CLS1623 יᐧ1 = new CLS1623(activity0);
        יᐧ1.MTH7289(new Object[]{((CLS1626)object3), ((CLS1626)object2)});
        יᐧ1.MTH7290(linearLayout1, CLS523.MTH7137(10));
        CLS1623 יᐧ2 = new CLS1623(activity0);
        יᐧ2.MTH7289(new Object[]{((CLS1625)object1), ((CLS1625)object0)});
        יᐧ2.MTH7290(linearLayout1, CLS523.MTH7137(10));
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd");
        Date date0 = new Date();
        String[] arr_s = {simpleDateFormat0.format(date0), simpleDateFormat0.format(date0)};
        String[] arr_s1 = {""};
        CLS1626 ـﹳ0 = new CLS1626(this.FLD3586);
        CLS1626 ـﹳ1 = new CLS1626(this.FLD3586);
        CLS1408 ˊʽ0 = new CLS1408(simpleDateFormat0, arr_s, this.FLD3586, ـﹳ0, ـﹳ1, ((ArrayList)this.FLD3585), ((CLS396)this.FLD3587), arr_s1, ((CLS359)this.FLD3584));
        ArrayList arrayList0 = new ArrayList();
        String s = CLS27.MTH904();
        ـﹳ0.MTH800(CLS27.MTH889("select_date_start"));
        ـﹳ0.MTH7325(arr_s[0]);
        ـﹳ0.MTH7324(new CLS512(ˊʽ0, 0));
        ـﹳ1.MTH800(CLS27.MTH889("select_date_end"));
        ـﹳ1.MTH7325(arr_s[1]);
        ـﹳ1.MTH7324(new CLS512(ˊʽ0, 1));
        CLS1626 ـﹳ2 = new CLS1626(this.FLD3586);
        ـﹳ2.MTH800(CLS27.MTH889("select_contact"));
        ـﹳ2.MTH7324(new CLS448(arrayList0, s, this.FLD3586, arr_s1, ـﹳ2, simpleDateFormat0, arr_s, ((ArrayList)this.FLD3585), ((CLS396)this.FLD3587), ((CLS359)this.FLD3584)));
        long v = CLS481.MTH6689(date0).getTime();
        long v1 = CLS481.MTH6695(date0).getTime();
        ArrayList arrayList1 = ((CLS396)this.FLD3587).MTH5760(v / 1000L, v1 / 1000L, arr_s1[0]);
        ((ArrayList)this.FLD3585).addAll(arrayList1);
        ((CLS359)this.FLD3584).MTH5235(((ArrayList)this.FLD3585));
        CLS1635 ﾞᵎ0 = new CLS1635(this.FLD3586);
        ﾞᵎ0.MTH800(CLS27.MTH889("select_all"));
        ﾞᵎ0.MTH7438(new CLS496(((CLS359)this.FLD3584), 2));
        CLS1623 יᐧ0 = new CLS1623(this.FLD3586);
        יᐧ0.MTH7289(new Object[]{ـﹳ0, ـﹳ1, ـﹳ2, ﾞᵎ0});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(10));
        ((CLS1624)this.FLD3588).FLD5274 = new CLS1272(((CLS359)this.FLD3584), 6);
        ((CLS1624)this.FLD3588).MTH7302();
        ((CLS1624)this.FLD3588).MTH7311();
        ((CLS1624)this.FLD3588).MTH7303(((CLS359)this.FLD3584));
        ((CLS1624)this.FLD3588).FLD5276 = false;
        CLS204 ˊʼ0 = new CLS204(((CLS359)this.FLD3584), 5);
        ((CLS1624)this.FLD3588).MTH7301(ˊʼ0);
        CLS220 ˏʼ0 = new CLS220(6, this.FLD3586, ((ArrayList)this.FLD3585));
        ((CLS1624)this.FLD3588).MTH7305(ˏʼ0);
        CLS523.MTH7147(linearLayout0, ((CLS18)(((CLS1624)this.FLD3588))), true);
    }
}

