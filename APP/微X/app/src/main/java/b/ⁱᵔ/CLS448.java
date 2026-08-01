// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS78;
import b.ⁱʾ.CLS359;
import b.ﾞˎ.CLS1626;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public final class CLS448 implements View.OnClickListener {
    public final CLS359 FLD4358;
    public final ArrayList FLD4359;
    public final CLS396 FLD4360;
    public final ArrayList FLD4361;
    public final CLS1626 FLD4362;
    public final Activity FLD4363;
    public final String FLD4364;
    public final String[] FLD4365;
    public final String[] FLD4366;
    public final SimpleDateFormat FLD4367;

    public CLS448(ArrayList arrayList0, String s, Activity activity0, String[] arr_s, CLS1626 ـﹳ0, SimpleDateFormat simpleDateFormat0, String[] arr_s1, ArrayList arrayList1, CLS396 ʿʽ0, CLS359 ⁱˉ0) {
        this.FLD4361 = arrayList0;
        this.FLD4364 = s;
        this.FLD4363 = activity0;
        this.FLD4365 = arr_s;
        this.FLD4362 = ـﹳ0;
        this.FLD4367 = simpleDateFormat0;
        this.FLD4366 = arr_s1;
        this.FLD4359 = arrayList1;
        this.FLD4360 = ʿʽ0;
        this.FLD4358 = ⁱˉ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD4363;
        String[] arr_s = this.FLD4365;
        CLS1626 ـﹳ0 = this.FLD4362;
        SimpleDateFormat simpleDateFormat0 = this.FLD4367;
        String[] arr_s1 = this.FLD4366;
        ArrayList arrayList0 = this.FLD4359;
        CLS396 ʿʽ0 = this.FLD4360;
        CLS359 ⁱˉ0 = this.FLD4358;
        ArrayList arrayList1 = this.FLD4361;
        if(arrayList1.isEmpty()) {
            arrayList1.add(new CLS78("_ALL_", CLS27.MTH889("all")));
            CLS371.FLD3470.MTH5381(this.FLD4364, arrayList1);
        }
        CLS387.MTH5585(false, activity0, arrayList1, ((CLS2)new CLS1440(ⁱˉ0, ـﹳ0, ʿʽ0, simpleDateFormat0, arrayList0, arr_s, arr_s1)), arr_s[0], -1);
    }
}

