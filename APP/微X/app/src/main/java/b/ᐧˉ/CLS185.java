// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS31;
import b.ﾞˎ.CLS1626;

public final class CLS185 implements View.OnClickListener {
    public final int FLD1766;
    public final Activity FLD1767;
    public final CLS997 FLD1768;
    public final CLS1626 FLD1769;

    public CLS185(CLS997 ˋ0, Activity activity0, CLS1626 ـﹳ0, int v) {
        this.FLD1766 = v;
        this.FLD1768 = ˋ0;
        this.FLD1767 = activity0;
        this.FLD1769 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD1767;
        CLS1626 ـﹳ0 = this.FLD1769;
        CLS997 ˋ0 = this.FLD1768;
        switch(this.FLD1766) {
            case 0: {
                ˋ0.getClass();
                CLS1117 ᐧᵢ1 = new CLS1117(ˋ0, ـﹳ0, 0);
                String s2 = CLS31.MTH1008().getAbsolutePath();
                String s3 = CLS31.MTH1008().getAbsolutePath();
                CLS31.MTH982(activity0, ((CLS12)ᐧᵢ1), s2, ˋ0.FLD2151.MTH925("moment_export_path", s3));
                return;
            }
            case 1: {
                ˋ0.getClass();
                CLS1117 ᐧᵢ2 = new CLS1117(ˋ0, ـﹳ0, 1);
                String s4 = CLS31.MTH1008().getAbsolutePath();
                String s5 = CLS31.MTH1008().getAbsolutePath();
                CLS31.MTH982(activity0, ((CLS12)ᐧᵢ2), s4, ˋ0.FLD2151.MTH925("moment_auto_export_path", s5));
                return;
            }
            default: {
                ˋ0.getClass();
                CLS1117 ᐧᵢ0 = new CLS1117(ˋ0, ـﹳ0, 2);
                String s = CLS31.MTH1008().getAbsolutePath();
                String s1 = CLS31.MTH1008().getAbsolutePath();
                CLS31.MTH982(activity0, ((CLS12)ᐧᵢ0), s, ˋ0.FLD2151.MTH925("sns_save_path", s1));
            }
        }
    }
}

