// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʾᵢ.CLS29;
import b.ﾞˎ.CLS1635;

public final class CLS195 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD1867;
    public final String FLD1868;
    public final CLS1105 FLD1869;
    public final CLS1635 FLD1870;

    public CLS195(CLS1105 ᐧˈ0, String s, CLS1635 ﾞᵎ0, int v) {
        this.FLD1867 = v;
        this.FLD1869 = ᐧˈ0;
        this.FLD1868 = s;
        this.FLD1870 = ﾞᵎ0;
        super();
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS1635 ﾞᵎ0 = this.FLD1870;
        String s = this.FLD1868;
        CLS1105 ᐧˈ0 = this.FLD1869;
        if(this.FLD1867 == 0) {
            String s1 = CLS182.MTH3475(0x38E828FC2B3CD335L, CLS182.MTH3491(ᐧˈ0, s));
            CLS29 ˎᵢ0 = ᐧˈ0.FLD2151;
            ˎᵢ0.MTH922(Boolean.valueOf(z), s1);
            if(z) {
                ﾞᵎ0.MTH7437(false);
                ﾞᵎ0.MTH801(8);
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(s);
                String s2 = CLS182.MTH3475(4100572141991023413L, stringBuilder0);
                ˎᵢ0.MTH922(Boolean.FALSE, s2);
                return;
            }
            ﾞᵎ0.MTH801(0);
            return;
        }
        String s3 = CLS182.MTH3475(4100571643774817077L, CLS182.MTH3491(ᐧˈ0, s));
        CLS29 ˎᵢ1 = ᐧˈ0.FLD2151;
        ˎᵢ1.MTH922(Boolean.valueOf(z), s3);
        if(z) {
            ﾞᵎ0.MTH801(8);
            ﾞᵎ0.MTH7437(false);
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(s);
            String s4 = CLS182.MTH3475(4100572356739388213L, stringBuilder1);
            ˎᵢ1.MTH922(Boolean.FALSE, s4);
            return;
        }
        ﾞᵎ0.MTH801(0);
    }
}

