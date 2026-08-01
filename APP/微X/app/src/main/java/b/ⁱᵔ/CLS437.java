// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS78;
import b.ⁱʾ.CLS359;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public final class CLS437 implements View.OnClickListener {
    public final CLS359 FLD4190;
    public final ArrayList FLD4191;
    public final CLS396 FLD4192;
    public final ArrayList FLD4193;
    public final String[] FLD4194;
    public final boolean FLD4195;
    public final String FLD4196;
    public final Activity FLD4197;
    public final String[] FLD4198;
    public final SimpleDateFormat FLD4199;

    public CLS437(ArrayList arrayList0, String s, boolean z, Activity activity0, String[] arr_s, SimpleDateFormat simpleDateFormat0, String[] arr_s1, ArrayList arrayList1, CLS396 ʿʽ0, CLS359 ⁱˉ0) {
        this.FLD4193 = arrayList0;
        this.FLD4196 = s;
        this.FLD4195 = z;
        this.FLD4197 = activity0;
        this.FLD4194 = arr_s;
        this.FLD4199 = simpleDateFormat0;
        this.FLD4198 = arr_s1;
        this.FLD4191 = arrayList1;
        this.FLD4192 = ʿʽ0;
        this.FLD4190 = ⁱˉ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        boolean z = this.FLD4195;
        Activity activity0 = this.FLD4197;
        String[] arr_s = this.FLD4194;
        SimpleDateFormat simpleDateFormat0 = this.FLD4199;
        String[] arr_s1 = this.FLD4198;
        ArrayList arrayList0 = this.FLD4191;
        CLS396 ʿʽ0 = this.FLD4192;
        CLS359 ⁱˉ0 = this.FLD4190;
        ArrayList arrayList1 = this.FLD4193;
        if(arrayList1.isEmpty()) {
            arrayList1.add(new CLS78("_ALL_", CLS27.MTH889("all")));
            CLS371.FLD3470.MTH5381(this.FLD4196, arrayList1);
        }
        CLS387.MTH5585(z, activity0, arrayList1, ((CLS2)new CLS1431(arr_s, simpleDateFormat0, arr_s1, arrayList0, ʿʽ0, ⁱˉ0)), arr_s[0], -1);
    }
}

