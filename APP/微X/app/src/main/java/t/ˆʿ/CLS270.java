// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.SearchView;
import java.util.ArrayList;
import t.ʾᵢ.CLS249;
import t.ʾᵢ.CLS258;
import t.ˆٴ.CLS64;
import t.ˊﾞ.CLS107;
import t.ᵔʾ.CLS297;
import t.ⁱʾ.CLS145;
import t.ⁱʾ.CLS148;
import t.ﾞᐧ.CLS336;
import t.ﾞᐧ.CLS344;
import t.ﾞᐧ.CLS347;

public final class CLS270 implements CLS54 {
    public final Activity FLD419;
    public final Dialog[] FLD420;
    public final ArrayList FLD421;
    public final CLS64 FLD422;
    public final boolean FLD423;
    public final CLS148 FLD424;
    public final int[] FLD425;

    public CLS270(Activity activity0, CLS64 ˆٴ0, ArrayList arrayList0, Dialog[] arr_dialog, int[] arr_v, CLS249 ᵔⁱ0) {
        this.FLD419 = activity0;
        this.FLD422 = ˆٴ0;
        this.FLD421 = arrayList0;
        this.FLD423 = false;
        this.FLD420 = arr_dialog;
        this.FLD425 = arr_v;
        this.FLD424 = ᵔⁱ0;
    }

    // 此方法包含解密的字符串
    @Override  // t.ˆʿ.CLS55$CLS54
    public final void MTH1477(LinearLayout linearLayout0) {
        int v;
        CLS64 ˆٴ0 = this.FLD422;
        boolean z = this.FLD423;
        Dialog[] arr_dialog = this.FLD420;
        int[] arr_v = this.FLD425;
        CLS148 ﾞᐧ0 = this.FLD424;
        Activity activity0 = this.FLD419;
        CLS344 ⁱˉ0 = new CLS344(activity0);
        CLS336 ˊˏ0 = new CLS336(activity0);
        ˊˏ0.FLD1152 = new CLS297(ˆٴ0, 7);
        ˊˏ0.FLD1157 = true;
        SearchView searchView0 = ˊˏ0.FLD1155;
        if(searchView0 != null) {
            searchView0.setVisibility(0);
            if(ˊˏ0.FLD1152 == null) {
                ˊˏ0.FLD1150.setTextFilterEnabled(true);
            }
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.FLD421;
        for(Object object0: arrayList3) {
            CLS107 ᵔʾ0 = (CLS107)object0;
            String s = ᵔʾ0.FLD799;
            if(CLS29.MTH1326(s)) {
                arrayList0.add(ᵔʾ0);
            }
            else if(!TextUtils.isEmpty(s) && (s.startsWith("gh_") || s.equals("weixin"))) {
                arrayList2.add(ᵔʾ0);
            }
            else {
                arrayList1.add(ᵔʾ0);
            }
        }
        CLS347 ﾞᵎ0 = new CLS347(activity0);
        ﾞᵎ0.FLD1324 = true;
        ﾞᵎ0.MTH2508("radio_public_account");
        if(arrayList2.isEmpty()) {
            ﾞᵎ0.MTH2507("radio_public_account");
            v = 2;
        }
        else {
            v = 3;
        }
        ﾞᵎ0.MTH2508("radio_friends");
        if(arrayList1.isEmpty()) {
            --v;
            ﾞᵎ0.MTH2507("radio_friends");
        }
        ﾞᵎ0.MTH2508("radio_chatrooms");
        if(arrayList0.isEmpty()) {
            --v;
            ﾞᵎ0.MTH2507("radio_chatrooms");
        }
        if(v > 1) {
            ﾞᵎ0.MTH2508("radio_all");
            for(Object object1: ﾞᵎ0.FLD1328) {
                RadioButton radioButton0 = (RadioButton)object1;
                if(((String)radioButton0.getTag()).equals("radio_all")) {
                    radioButton0.setChecked(true);
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        ﾞᵎ0.FLD1320 = new CLS258(ˆٴ0, arrayList2, arrayList1, arrayList0, arrayList3);
        if(v > 1) {
            ⁱˉ0.MTH2482(((CLS145)ﾞᵎ0));
        }
        else {
            ˆٴ0.MTH1521(arrayList3);
        }
        ˊˏ0.MTH2376(ˆٴ0);
        ˊˏ0.FLD1154 = false;
        ˊˏ0.MTH2375(new CLS36(z, arr_dialog, arr_v, ﾞᐧ0, ˆٴ0));
        ⁱˉ0.MTH2482(((CLS145)ˊˏ0));
        CLS43.MTH1428(linearLayout0, ((CLS145)ⁱˉ0), CLS43.MTH1439(3));
    }
}

